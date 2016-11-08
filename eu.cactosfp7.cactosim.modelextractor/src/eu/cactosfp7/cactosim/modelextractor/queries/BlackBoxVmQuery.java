package eu.cactosfp7.cactosim.modelextractor.queries;

import java.io.IOException;
import java.util.Collection;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.Objects;

import javax.measure.quantity.DataAmount;
import javax.measure.quantity.DataRate;
import javax.measure.quantity.Frequency;
import javax.measure.unit.NonSI;
import javax.measure.unit.ProductUnit;
import javax.measure.unit.SI;
import javax.measure.unit.Unit;

import org.apache.hadoop.hbase.Cell;
import org.apache.hadoop.hbase.CellScanner;
import org.apache.hadoop.hbase.CellUtil;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.Connection;
import org.apache.hadoop.hbase.client.Get;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.client.ResultScanner;
import org.apache.hadoop.hbase.client.Scan;
import org.apache.hadoop.hbase.client.Table;
import org.apache.hadoop.hbase.filter.BinaryPrefixComparator;
import org.apache.hadoop.hbase.filter.CompareFilter;
import org.apache.hadoop.hbase.filter.QualifierFilter;
import org.apache.hadoop.hbase.filter.RegexStringComparator;
import org.apache.hadoop.hbase.filter.SingleColumnValueFilter;
import org.apache.hadoop.hbase.util.Bytes;
import org.eclipse.emf.cdo.common.model.EMFUtil;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.layout.GridData;
import org.jscience.physics.amount.Amount;

import eu.cactosfp7.cactosim.experimentscenario.AbsoluteTimeEvent;
import eu.cactosfp7.cactosim.experimentscenario.ExperimentScenarioTimeLine;
import eu.cactosfp7.cactosim.experimentscenario.ExperimentscenarioFactory;
import eu.cactosfp7.cactosim.experimentscenario.request.RequestFactory;
import eu.cactosfp7.cactosim.experimentscenario.request.StartApplicationRequest;
import eu.cactosfp7.cactosim.experimentscenario.request.TerminateApplicationRequest;
import eu.cactosfp7.cactosim.experimentscenario.selector.ApplicationInstanceSelector;
import eu.cactosfp7.cactosim.experimentscenario.selector.InitiallyRunningBlackBoxApplicationInstanceSelector;
import eu.cactosfp7.cactosim.experimentscenario.selector.PreviouslyStartedBlackBoxApplicationSelector;
import eu.cactosfp7.cactosim.experimentscenario.selector.SelectorFactory;
import eu.cactosfp7.cactosim.modelextractor.settings.Settings;
import eu.cactosfp7.cactosim.modelextractor.util.Constants;
import eu.cactosfp7.cactosim.modelextractor.util.Interval;
import eu.cactosfp7.infrastructuremodels.logicaldc.application.ApplicationFactory;
import eu.cactosfp7.infrastructuremodels.logicaldc.application.BlackBoxApplicationInstance;
import eu.cactosfp7.infrastructuremodels.logicaldc.application.BlackBoxApplicationTemplate;
import eu.cactosfp7.infrastructuremodels.logicaldc.application.BlackBoxVMBehaviour;
import eu.cactosfp7.infrastructuremodels.logicaldc.application.BlackBoxVMImageBehaviour;
import eu.cactosfp7.infrastructuremodels.logicaldc.application.BlackBoxWorkload;
import eu.cactosfp7.infrastructuremodels.logicaldc.application.util.ApplicationSwitch;
import eu.cactosfp7.infrastructuremodels.logicaldc.core.CoreFactory;
import eu.cactosfp7.infrastructuremodels.logicaldc.core.Flavour;
import eu.cactosfp7.infrastructuremodels.logicaldc.core.Hypervisor;
import eu.cactosfp7.infrastructuremodels.logicaldc.core.LogicalDCModel;
import eu.cactosfp7.infrastructuremodels.logicaldc.core.VMImage;
import eu.cactosfp7.infrastructuremodels.logicaldc.core.VMImageInstance;
import eu.cactosfp7.infrastructuremodels.logicaldc.core.VM_State;
import eu.cactosfp7.infrastructuremodels.logicaldc.core.VirtualDisk;
import eu.cactosfp7.infrastructuremodels.logicaldc.core.VirtualMachine;
import eu.cactosfp7.infrastructuremodels.logicaldc.core.VirtualMemory;
import eu.cactosfp7.infrastructuremodels.logicaldc.core.VirtualProcessingUnit;
import eu.cactosfp7.infrastructuremodels.logicaldc.core.impl.CorePackageImpl;
import eu.cactosfp7.infrastructuremodels.physicaldc.architecturetype.ArchitectureType;
import eu.cactosfp7.infrastructuremodels.physicaldc.core.ProcessingUnitSpecification;
import eu.cactosfp7.infrastructuremodels.physicaldc.core.StorageSpecification;
import eu.cactosfp7.infrastructuremodels.physicaldc.core.util.CoreSwitch;
import tools.descartes.dlim.Combinator;
import tools.descartes.dlim.Constant;
import tools.descartes.dlim.DlimFactory;
import tools.descartes.dlim.DlimPackage;
import tools.descartes.dlim.Function;
import tools.descartes.dlim.LinearTrend;
import tools.descartes.dlim.Operator;
import tools.descartes.dlim.Sequence;
import tools.descartes.dlim.TimeDependentFunctionContainer;

public class BlackBoxVmQuery {
    private static final double DELTA = 0.001;    
    
    private static byte[] COLUMN_FAMILY_HW = Bytes.toBytes(Constants.VM_HW);
    private static byte[] COLUMN_VM_HOST = Bytes.toBytes(Settings.getSettings().getProperty(Constants.VM_HOST_COLUMN));
    private static byte[] COLUMN_VM_NAME = Bytes.toBytes(Constants.VM_NAME);
    private static byte[] COLUMN_FAMILY_STORAGE = Bytes.toBytes(Constants.VM_STORAGE);
    private static byte[] COLUMN_VM_CORE_NUMBER = Bytes.toBytes(Constants.VM_CORE_NUMBER);
    private static byte[] COLUMN_FAMILY_META = Bytes.toBytes(Constants.VM_META);
    private static byte[] COLUMN_FAMILY_VM_HOST = Bytes.toBytes(Settings.getSettings().getProperty(Constants.VM_HOST_FAMILY));
    private static String VM_STATE_NAME = Settings.getSettings().getProperty(Constants.VM_APPLICATION_TYPE_NAME);
    private static byte[] COLUMN_VM_STATE = Bytes.toBytes(VM_STATE_NAME);
    private static String APPLICATION_TYPE_NAME = "applicationType";
    private static byte[] COLUMN_APPLICATION_TYPE = Bytes.toBytes(APPLICATION_TYPE_NAME);
    private static String APPLICATION_TYPE_INSTANCE_NAME = "applicationTypeInstance";
    private static byte[] COLUMN_APPLICATION_TYPE_INSTANCE = Bytes.toBytes(APPLICATION_TYPE_INSTANCE_NAME);
    private static String APPLICATION_COMPONENT_NAME = "applicationComponent";
    private static byte[] COLUMN_APPLICATION_COMPONENT = Bytes.toBytes(APPLICATION_COMPONENT_NAME);
    private static String APPLICATION_COMPONENT_INSTANCE_NAME = "applicationComponentInstance";
    private static byte[] COLUMN_APPLICATION_COMPONENT_INSTANCE = Bytes.toBytes(APPLICATION_COMPONENT_INSTANCE_NAME);

    public VmOverview getVmOverview(final Connection conn, long lowerBound, long upperBound) throws IOException {
        Table table = conn.getTable(TableName.valueOf(Settings.getSettings().getProperty(Constants.VM_TABLE_NAME)));
        VmOverview overview = extractIntervals(table, lowerBound, upperBound);
        
        Map<String, VMDescription> vmDescriptions = overview.getDescriptions();
        
        for(String vmUuid : vmDescriptions.keySet()) {
            VMDescription vmDescription = vmDescriptions.get(vmUuid);
            Interval curInterval = vmDescription.getInterval();
            Scan s = new Scan(Bytes.toBytes(vmUuid + "-" + 0), Bytes.toBytes(vmUuid + "-" + 9));
            s.setTimeRange(curInterval.getMin(), curInterval.getMax());
            s.addColumn(COLUMN_FAMILY_VM_HOST, COLUMN_VM_HOST);
            s.addColumn(COLUMN_FAMILY_HW, COLUMN_VM_NAME);
            String initialPlacementHw = null;
            String name = null;
            for(Result result : table.getScanner(s)) {
                if(result.containsColumn(COLUMN_FAMILY_VM_HOST, COLUMN_VM_HOST)) {
                    initialPlacementHw = Bytes.toString(result.getValue(COLUMN_FAMILY_VM_HOST, COLUMN_VM_HOST));
                }
                if(result.containsColumn(COLUMN_FAMILY_HW, COLUMN_VM_NAME)) {
                    name = Bytes.toString(result.getValue(COLUMN_FAMILY_HW, COLUMN_VM_NAME));
                }
                if(initialPlacementHw != null && name != null) {
                    break;
                }
            }
            
            vmDescription.addInitialPlacement(initialPlacementHw);
            overview.addInitialPlacement(vmUuid, initialPlacementHw);
            overview.addName(vmUuid, name);
        }
        return overview;
    }

    private VmOverview extractIntervals(Table table, long lowerBound, long upperBound) throws IOException {
        
        VmOverview overview = new VmOverview();
        Scan s = new Scan();
        s.setTimeRange(lowerBound, upperBound + 1);
        byte[] columnFamily = Bytes.toBytes(Constants.VM_HW);
        byte[] column = Bytes.toBytes(Constants.UUID);
        s.addColumn(columnFamily, column);
        ResultScanner scanner = table.getScanner(s);
        for(Result res : scanner) {
            Cell cell = res.getColumnLatestCell(columnFamily, column);
            overview.addVmMeasurement(Bytes.toString(CellUtil.cloneValue(cell)), cell.getTimestamp());
        }
        for(Entry<String, VMDescription> curEntry : overview.getDescriptions().entrySet()) {
            Scan scanInitialDeployment = new Scan(Bytes.toBytes(curEntry.getKey()));
            scanInitialDeployment.addColumn(COLUMN_FAMILY_VM_HOST, COLUMN_VM_HOST);
            scanInitialDeployment.setCaching(1);
            scanner = table.getScanner(scanInitialDeployment);
            for(Result res : scanner) {
                Cell cell = res.getColumnLatestCell(COLUMN_FAMILY_VM_HOST, COLUMN_VM_HOST);
                curEntry.getValue().addMeasurement(cell.getTimestamp());
                break;
            }
            scanner.close();
        }
        return overview;
    }
    
    public void queryAndAttachVmBehavior(LogicalDCModel ldcmodel, ExperimentScenarioTimeLine scenario, Connection conn, VMDescription vmDescription, Interval consideredInterval) throws IOException {
        Table table = conn.getTable(TableName.valueOf(Settings.getSettings().getProperty(Constants.VM_TABLE_NAME)));
        Interval interval = vmDescription.getInterval();
        long lowerBound = Math.max(interval.getMin(), consideredInterval.getMin());
        long upperBound = Math.min(interval.getMax(), consideredInterval.getMax());
        BlackBoxVMBehaviour vmBehaviour = extractRuntimeApplicationModel(ldcmodel, table, vmDescription, lowerBound, upperBound);
        SelectorFactory selectorFactory = SelectorFactory.eINSTANCE;
        ApplicationInstanceSelector selector = null;
        if(interval.getMin() >= consideredInterval.getMin()) {
            ApplicationFactory applicationFactory = ApplicationFactory.INSTANCE;
            BlackBoxApplicationTemplate blackBoxApplicationTemplate = applicationFactory.createBlackBoxApplicationTemplate();
            blackBoxApplicationTemplate.setName(vmBehaviour.getName());
            BlackBoxVMImageBehaviour blackBoxVMImageBehaviour = applicationFactory.createBlackBoxVMImageBehaviour();
            blackBoxVMImageBehaviour.setBlackBoxApplicationTemplate(blackBoxApplicationTemplate);
            blackBoxVMImageBehaviour.getBlackBoxWorkloads().addAll(vmBehaviour.getBlackBoxWorkloads());
            VMImage vmImage = getVmImageOfVm(ldcmodel, conn, vmDescription, table);
            blackBoxVMImageBehaviour.setVmImage(vmImage);
            ldcmodel.getApplicationTemplates().add(blackBoxApplicationTemplate);
            // TODO add reference resources.
            StartApplicationRequest startApplicationRequest = createStartApplicationRequest(ldcmodel, vmDescription, table,
                    blackBoxApplicationTemplate, blackBoxVMImageBehaviour);  
            // Add size if size not set yet
            if(vmImage.getCapacity() == null) {
                vmImage.setCapacity(blackBoxVMImageBehaviour.getDefaultFlavour().getSizeStorage());
            }
            ExperimentscenarioFactory factory = ExperimentscenarioFactory.eINSTANCE;
            AbsoluteTimeEvent absoluteTimeEvent = factory.createAbsoluteTimeEvent();
            absoluteTimeEvent.setExperimentScenarioRequest(startApplicationRequest);
            attachVmTags(startApplicationRequest.getInputParameters(), table, vmDescription);
            
            Scan s = new Scan(Bytes.toBytes(vmDescription.getUuid() + "-" + 0), Bytes.toBytes(vmDescription.getUuid() + "-" + 9));
            s.setTimeRange(consideredInterval.getMin(), consideredInterval.getMax()+1);
            s.addColumn(COLUMN_FAMILY_META, COLUMN_VM_STATE);
            ResultScanner scanner = table.getScanner(s);
            Result res = scanner.next();
            long timestamp;
            if(res != null) {
                timestamp = scanner.next().getColumnLatestCell(COLUMN_FAMILY_META, COLUMN_VM_STATE).getTimestamp();
            // If we do not find a start event we assume that the VM was started at the origin point.
            } else {
                timestamp = consideredInterval.getMin();
            }
            scanner.close();
            long offsetTimeStamp = consideredInterval.getMin();
            absoluteTimeEvent.setSimulationTime(Amount.valueOf(timestamp-offsetTimeStamp, SI.MILLI(SI.SECOND)).to(SI.SECOND));
            scenario.getTimeLineEvents().add(absoluteTimeEvent);
            PreviouslyStartedBlackBoxApplicationSelector blackBoxApplicationSelector = selectorFactory.createPreviouslyStartedBlackBoxApplicationSelector();            
            blackBoxApplicationSelector.setStartApplicationRequest(startApplicationRequest);
            selector = blackBoxApplicationSelector;

        } else {
            BlackBoxApplicationInstance applicationInstance = queryAndAttachVmBehaviour(ldcmodel, conn, vmDescription, lowerBound, upperBound);
            InitiallyRunningBlackBoxApplicationInstanceSelector instanceSelector = selectorFactory.createInitiallyRunningBlackBoxApplicationInstanceSelector();
            instanceSelector.setApplicationInstance(applicationInstance);
            selector = instanceSelector;
        }
        if(consideredInterval.getMax() > interval.getMax()) {
            createStopApplicationRequest(vmDescription, consideredInterval, table, selector, scenario);
        }
    }

    private VMImage getVmImageOfVm(LogicalDCModel ldcmodel, Connection conn, VMDescription vmDescription, Table table)
            throws IOException {
        final String initialHostName = getInitialHostName(table, vmDescription);
        final String vmName = getVmName(table, vmDescription);
        VMImage vmImage = this.getExistingOrCreateVMImage(ldcmodel, conn, initialHostName, vmName);
        return vmImage;
    }

    private void createStopApplicationRequest(VMDescription vmDescription, Interval consideredInterval, Table table,
            ApplicationInstanceSelector selector, ExperimentScenarioTimeLine timeLine)
                    throws IOException {
        ExperimentscenarioFactory factory = ExperimentscenarioFactory.eINSTANCE;
        Scan s = new Scan(Bytes.toBytes(vmDescription.getUuid() + "-" + 0), Bytes.toBytes(vmDescription.getUuid() + "-" + 9));
        s.setTimeRange(consideredInterval.getMin(), consideredInterval.getMax()+1);
        RequestFactory requestFactory = RequestFactory.eINSTANCE;
        byte[] columnVmState = Bytes.toBytes(Constants.VM_STATE);
        s.addColumn(COLUMN_FAMILY_META, columnVmState);
        s.setFilter(new SingleColumnValueFilter(COLUMN_FAMILY_META, columnVmState, CompareFilter.CompareOp.EQUAL, new RegexStringComparator(Constants.VM_STATE_SHUTDOWN)));
        ResultScanner scanner = table.getScanner(s);
        Result curResult = scanner.next();
        // Only add the request if the VM has already been terminated.
            long timestampShutdown = vmDescription.getInterval().getMax();
            if(curResult != null) {
                timestampShutdown = curResult.getColumnLatestCell(COLUMN_FAMILY_META, columnVmState).getTimestamp();
            }
            if(timestampShutdown < consideredInterval.getMax()) {
                long offsetTimeStamp = consideredInterval.getMin();
                TerminateApplicationRequest terminateApplicationRequest = requestFactory.createTerminateApplicationRequest();
                terminateApplicationRequest.setRunningApplicationSelector(selector);
                AbsoluteTimeEvent shutdownEvent = factory.createAbsoluteTimeEvent();
                shutdownEvent.setSimulationTime(Amount.valueOf(timestampShutdown-offsetTimeStamp, SI.MILLI(SI.SECOND)).to(SI.SECOND));
                shutdownEvent.setExperimentScenarioRequest(terminateApplicationRequest);
                shutdownEvent.setExperimentScenarioTimeline(timeLine);
            }
    }

    private StartApplicationRequest createStartApplicationRequest(LogicalDCModel ldcmodel, VMDescription vmDescription,
            Table table, BlackBoxApplicationTemplate blackBoxApplicationTemplate,
            BlackBoxVMImageBehaviour blackBoxVMImageBehaviour) throws IOException {
        int cores = getNumberOfCores(vmDescription, table);
        Amount<DataAmount> ram = getRamFromTable(table, vmDescription);
        ArchitectureType type = getArchitectureType(blackBoxVMImageBehaviour);
        Amount<DataAmount> storage = getStorageSize(table, Bytes.toBytes(vmDescription.getUuid() + "-" + 0));
        Flavour flavour = getOrCreateFlavour(ldcmodel, cores, ram, storage, type);
        // Workaround as placement algorithms sometimes do not set the flavour to be used.
        if(blackBoxApplicationTemplate.getBlackBoxVMImageBehaviour().getDefaultFlavour() == null) {
            blackBoxApplicationTemplate.getBlackBoxVMImageBehaviour().setDefaultFlavour(flavour);
        }
        RequestFactory requestFactory = RequestFactory.eINSTANCE;
        StartApplicationRequest startApplicationRequest = requestFactory.createStartApplicationRequest();
        startApplicationRequest.setApplicationTemplate(blackBoxApplicationTemplate);
        startApplicationRequest.setVmFlavour(flavour);
        return startApplicationRequest;
    }

    private int getNumberOfCores(VMDescription vmDescription, Table table) throws IOException {
        Scan s = new Scan(Bytes.toBytes(vmDescription.getUuid() + "-" + 0), Bytes.toBytes(vmDescription.getUuid() + "-" + 9));
        s.setTimeRange(vmDescription.getInterval().getMin(), vmDescription.getInterval().getMax()+1);
        s.addColumn(COLUMN_FAMILY_HW, COLUMN_VM_CORE_NUMBER);
        final Result result = table.getScanner(s).next();
        int cores = Integer.parseInt(Bytes.toString(result.getValue(COLUMN_FAMILY_HW, COLUMN_VM_CORE_NUMBER)));
        return cores;
    }

    private Amount<DataAmount> getStorageSize(Table table, byte[] startRow) throws IOException {
        byte[] columnDiskTotal = Bytes.toBytes(Constants.VM_DISK_TOTAL);
        Scan secondScan = new Scan(startRow);
        secondScan.addColumn(COLUMN_FAMILY_STORAGE, columnDiskTotal);
        Amount<DataAmount> storage = (Amount<DataAmount>) Amount.valueOf(Bytes.toString(table.getScanner(secondScan).next().getValue(COLUMN_FAMILY_STORAGE, columnDiskTotal)));
        return storage;
    }

    private ArchitectureType getArchitectureType(BlackBoxVMImageBehaviour blackBoxVMImageBehaviour) {
        return new ApplicationSwitch<ArchitectureType>() {
            @Override
            public ArchitectureType caseBlackBoxVMImageBehaviour(BlackBoxVMImageBehaviour blackBoxVMImageBehaviour) {
                for(BlackBoxWorkload workload : blackBoxVMImageBehaviour.getBlackBoxWorkloads()) {
                    ArchitectureType architectureType = this.caseBlackBoxWorkload(workload);
                    if(architectureType != null) {
                        return architectureType;
                    }
                }
                return null;
            }
            
            @Override
            public ArchitectureType caseBlackBoxWorkload(BlackBoxWorkload workload) {
                return new CoreSwitch<ArchitectureType>() {
                    public ArchitectureType caseProcessingUnitSpecification(ProcessingUnitSpecification spec) {
                        return spec.getArchitectureType();
                    }
                }.doSwitch(workload.getOnResource());
            }
        }.doSwitch(blackBoxVMImageBehaviour);
    }

    private Flavour getOrCreateFlavour(LogicalDCModel ldcmodel, int cores, Amount<DataAmount> ram,
            Amount<DataAmount> storage, ArchitectureType type) {
        for(Flavour curFlavour : ldcmodel.getFlavours()) {
            if(curFlavour.getNumberVirtualCores() == cores && curFlavour.getSizeRam().approximates(ram) && curFlavour.getSizeStorage().approximates(storage)) {
                return curFlavour;
            }
        }
        Flavour flavour = CoreFactory.INSTANCE.createFlavour();
        flavour.setSizeRam(ram);
        flavour.setNumberVirtualCores(cores);
        flavour.setSizeStorage(storage);
        flavour.setArchitectureType(type);
        flavour.setName(type.getName() + " " + cores + "xVCPU" + " " + ram.toString() + " RAM" + " " + storage.toString() + " HDD");
        flavour.setLogicalDCModel(ldcmodel);
        return flavour;
    }

    public BlackBoxApplicationInstance queryAndAttachVmBehaviour(LogicalDCModel ldcmodel, Connection conn, VMDescription vmDescription, long lowerBound, long upperBound) throws IOException {
       Table table = conn.getTable(TableName.valueOf(Settings.getSettings().getProperty(Constants.VM_TABLE_NAME)));
       BlackBoxVMBehaviour vmBehaviour = extractRuntimeApplicationModel(ldcmodel, table, vmDescription, lowerBound, upperBound);
       final String initialHostName = getInitialHostName(table, vmDescription);
       final String vmName = getVmName(table, vmDescription);
       final Hypervisor initialHost = getHost(ldcmodel, initialHostName);
       final CoreFactory ldcFactory = CoreFactory.INSTANCE;
       final VirtualMachine vm = ldcFactory.createVirtualMachine();
       vm.setName(vmName);
       vm.setRuntimeApplicationModel(vmBehaviour);
       vm.setHypervisor(initialHost);
       vm.setState(VM_State.RUNNING);
       
       attachVmTags(vm.getInputParameters(), table, vmDescription);
       Amount<DataAmount> memorySize = getRamFromTable(table, vmDescription);
       VirtualMemory memory = ldcFactory.createVirtualMemory();
       memory.setProvisioned(memorySize);
       vm.getVirtualMemoryUnits().add(memory);
       VMImage vmImage = getVmImageOfVm(ldcmodel, conn, vmDescription, table);
       VMImageInstance vmImageInstance = ldcFactory.createVMImageInstance();
       vm.setVMImageInstance(vmImageInstance);
       
       int cores = getNumberOfCores(vmDescription, table);
       VirtualProcessingUnit vcpu = ldcFactory.createVirtualProcessingUnit();
       vcpu.setName("VCPU " + cores);
       vcpu.setVirtualCores(cores);
       vm.getVirtualProcessingUnits().add(vcpu);
       
       StorageSpecification storageLocation;
       if(vm.getHypervisor().getRootVolume() != null) {
           storageLocation = vm.getHypervisor().getRootVolume().getStorageLocation();           
       } else {
           storageLocation = vm.getHypervisor().getNode().getStorageSpecifications().get(0);
       }
       Collection<Object> objectsByType = EcoreUtil.getObjectsByType(ldcmodel.getVolumesAndImages(), CorePackageImpl.eINSTANCE.getVMImage());
       
       // TODO Sebastian recursive lookup of VM images.
       VMImage localImageCopy = null;
       for(Object curObj : objectsByType) {
           VMImage curImage = (VMImage) curObj;
           if(curImage.getName() != null && curImage.getStorageLocation() != null 
                   && curImage.getName().equals(vmImage.getName()) && curImage.getStorageLocation().getId().equals(storageLocation.getId())) {
               localImageCopy = curImage;
           }
       }
       
       if(localImageCopy==null) {
           localImageCopy = ldcFactory.createVMImage();
           localImageCopy.setStorageLocation(storageLocation);
           localImageCopy.setName(vmImage.getName());
           localImageCopy.setLogicalDCModel(ldcmodel);
           localImageCopy.setCapacity(vmImage.getCapacity());
           // TODO extract (used) capacity from measurements
           localImageCopy.setUsedCapacity(Amount.valueOf(0d, DataAmount.UNIT));
       };
       
       VirtualDisk overlay = ldcFactory.createVirtualDisk();
       overlay.setParent(localImageCopy);
       overlay.setStorageLocation(localImageCopy.getStorageLocation());
       overlay.setName("Overlay of VM " + vm.getName());
       
       vmImageInstance.setRootDisk(overlay);
       BlackBoxApplicationInstance blackBoxApplicationInstance = ApplicationFactory.INSTANCE.createBlackBoxApplicationInstance();
       blackBoxApplicationInstance.setVirtualMachine(vm);
       ldcmodel.getApplicationInstances().add(blackBoxApplicationInstance);
       return blackBoxApplicationInstance;
    }
    
    
    private void attachVmTags(EMap<String, String> map, Table table, VMDescription vmDescription) throws IOException {
        queryAndAttachValue(map, table, vmDescription, COLUMN_APPLICATION_TYPE, APPLICATION_TYPE_NAME);
        queryAndAttachValue(map, table, vmDescription, COLUMN_APPLICATION_TYPE_INSTANCE, APPLICATION_TYPE_INSTANCE_NAME);
        queryAndAttachValue(map, table, vmDescription, COLUMN_APPLICATION_COMPONENT, APPLICATION_COMPONENT_NAME);
        queryAndAttachValue(map, table, vmDescription, COLUMN_APPLICATION_COMPONENT_INSTANCE, APPLICATION_COMPONENT_INSTANCE_NAME);        
    }
    
    private void queryAndAttachValue(EMap<String, String> map, Table table, VMDescription vmDescription, byte[] rowBytes, String key) throws IOException {
        Interval curInterval = vmDescription.getInterval();
        Scan s = new Scan(Bytes.toBytes(vmDescription.getUuid() + "-" + 0), Bytes.toBytes(vmDescription.getUuid() + "-" + 9));
        s.addColumn(COLUMN_FAMILY_META, rowBytes);
        ResultScanner scanner = table.getScanner(s);        
        Result result = scanner.next();
        Result curElement = result;
        while(curElement != null) {
            result = curElement;
            curElement = scanner.next();
        }
        if(result != null) {
            Cell cell = result.getColumnLatestCell(COLUMN_FAMILY_META, rowBytes);
            if(cell != null) map.put(key, Bytes.toString(cell.getValue()));
        }
    }

    private VMImage getExistingOrCreateVMImage(LogicalDCModel ldcmodel, Connection conn, String computeNode, String instanceName) throws IOException {
        Table cnTable = conn.getTable(TableName.valueOf(Settings.getSettings().getProperty(Constants.CN_HISTORY)));
        byte[] initialRow = Bytes.toBytes(computeNode);
        Scan s = new Scan(initialRow);
        s.addFamily(Bytes.toBytes(Constants.CN_VMS));
        s.setFilter(new QualifierFilter(CompareFilter.CompareOp.EQUAL, new BinaryPrefixComparator(Bytes.toBytes(Constants.IMAGE_UUID))));
        ResultScanner scanner = cnTable.getScanner(s);
        CellScanner cellScanner = scanner.next().cellScanner();
        cellScanner.advance();
        String imageUuid = Bytes.toString(cellScanner.current().getValue());
        VMImage vmImage = lookupVmImage(ldcmodel, imageUuid);
        scanner.close();
        
        if(vmImage == null) {
            vmImage = CoreFactory.INSTANCE.createVMImage();
            vmImage.setLogicalDCModel(ldcmodel);
            vmImage.setName(imageUuid);
            // TODO set storage location and size.
        }
        return vmImage;
    }

    private VMImage lookupVmImage(LogicalDCModel ldcmodel, String imageUuid) {
        Collection<Object> objectsByType = EcoreUtil.getObjectsByType(ldcmodel.getVolumesAndImages(), CorePackageImpl.eINSTANCE.getVMImage());
        for(Object curObj : objectsByType) {
            VMImage curImage = (VMImage) curObj;
            if(curImage.getName().equals(imageUuid)) {
                return curImage;
            }
        }
        return null;
    }

    private Amount<DataAmount> getRamFromTable(Table table, final VMDescription vmDescription) throws IOException {
        byte[] columnFamilyRam = Bytes.toBytes(Constants.VM_RAM);
        Scan s = new Scan(Bytes.toBytes(vmDescription.getUuid() + "-" + 0), Bytes.toBytes(vmDescription.getUuid() + "-" + 9));
        s.setTimeRange(vmDescription.getInterval().getMin(), vmDescription.getInterval().getMax()+1);
        s.addColumn(COLUMN_FAMILY_HW, columnFamilyRam);
        return (Amount<DataAmount>) Amount.valueOf(Bytes.toString(table.getScanner(s).next().getValue(COLUMN_FAMILY_HW, columnFamilyRam)));
    }
    
    private BlackBoxVMBehaviour extractRuntimeApplicationModel(LogicalDCModel ldcmodel, Table table, VMDescription vmDescription, long lowerBound, long upperBound) throws IOException {
        DlimFactory factory = DlimPackage.eINSTANCE.getDlimFactory();
        Scan s = new Scan(Bytes.toBytes(vmDescription.getUuid() + "-" + 0), Bytes.toBytes(vmDescription.getUuid() + "-" + 9));
        s.setTimeRange(lowerBound, upperBound);

        byte[] columnVmCpuLoad = Bytes.toBytes(Constants.VM_CPU_LOAD);


        byte[] columnVmDiskReadLoad = Bytes.toBytes(Constants.VM_DISK_READ);
        byte[] columnVmDiskWriteLoad = Bytes.toBytes(Constants.VM_DISK_WRITE);
        s.addColumn(COLUMN_FAMILY_HW, columnVmCpuLoad);
        s.addColumn(COLUMN_FAMILY_HW, COLUMN_VM_CORE_NUMBER);
        s.addColumn(COLUMN_FAMILY_STORAGE, columnVmDiskReadLoad);
        s.addColumn(COLUMN_FAMILY_STORAGE, columnVmDiskWriteLoad);
        s.addColumn(COLUMN_FAMILY_VM_HOST, COLUMN_VM_HOST);
        ResultScanner scanner = table.getScanner(s);
        int beginIndex = vmDescription.getUuid().length() + 1;
        
        
        // Gets initial location of VM.
        final String initialHostName = getInitialHostName(table, vmDescription);
        final String vmName = getVmName(table, vmDescription);
        final Hypervisor initialHost = getHost(ldcmodel, initialHostName);
        final ProcessingUnitSpecification initialCpu = initialHost.getNode().getCpuSpecifications().get(0);
        final EList<StorageSpecification> hddSpecs = initialHost.getNode().getStorageSpecifications();
        final StorageSpecification hddSpecification = hddSpecs.get(0);
        final Unit<Frequency> unit = SI.MEGA(SI.HERTZ);
        final Unit<DataRate> ioUnit = SI.MEGA(new ProductUnit<DataRate>(NonSI.BYTE.divide(SI.SECOND)));

        
        Hypervisor curHost = null;
        String curHostName = "";
        long lastCpuTimeStamp = Math.max(lowerBound, vmDescription.getInterval().getMin());
        long lastHddTimeStamp = lastCpuTimeStamp;
        
        double lastCpuValue = 0;
        double curCpuValue = 0;
        double lastHddValue = 0;
        double curHddValue = 0;
        
        boolean performFinalWriteCpu = false;
        boolean performFinalWriteHdd = false;
        
        Sequence cpuLoadCurve = createLoadCurve(lastCpuTimeStamp, upperBound, factory);        
        Sequence hddLoadCurve = createLoadCurve(lastHddTimeStamp, upperBound, factory);
        long curTimestamp = 0;
        double conversionFactorDouble = 1;
        
        Amount<DataRate> hddReadRate = Amount.valueOf(0, DataRate.UNIT);
        Amount<DataRate> hddWriteRate = hddReadRate;
        int coreNumber = 0;
        
        for(final Result res : scanner) {
            long priorTimestamp = curTimestamp;
                        
            final String hostName = Bytes.toString(res.getValue(COLUMN_FAMILY_VM_HOST, COLUMN_VM_HOST));
            if(hostName != null &&!curHostName.equals(hostName)) {            
                curHost = getHost(ldcmodel,hostName);
                curHostName = hostName;
            }
            
            Cell cellFromResult = Optional.ofNullable(res.getColumnLatestCell(COLUMN_FAMILY_HW, columnVmCpuLoad))
            		.orElseGet(() -> res.getColumnLatestCell(COLUMN_FAMILY_STORAGE, columnVmDiskReadLoad)); 
            if (cellFromResult == null) continue;
            curTimestamp = cellFromResult.getTimestamp();
            
            if(curTimestamp < lastCpuTimeStamp || curTimestamp < lastHddTimeStamp) continue;
             
            String cpuValueString = Bytes.toString(res.getValue(COLUMN_FAMILY_HW, columnVmCpuLoad));             
            final String hddReadValueString = Bytes.toString(res.getValue(COLUMN_FAMILY_STORAGE, columnVmDiskReadLoad));
            final String hddWriteValueString = Bytes.toString(res.getValue(COLUMN_FAMILY_STORAGE, columnVmDiskWriteLoad));
            final String coreNumberString = Bytes.toString(res.getValue(COLUMN_FAMILY_HW, COLUMN_VM_CORE_NUMBER));
            
            if(cpuValueString != null) {
                cpuValueString = cpuValueString.replace("%", "");
                curCpuValue = Double.valueOf(cpuValueString)/100d;
            }
            
            if(hddReadValueString != null) {
                hddReadRate = (Amount<DataRate>) Amount.valueOf(hddReadValueString);
            }
            
            if(hddReadValueString != null) {
                hddWriteRate = (Amount<DataRate>) Amount.valueOf(hddWriteValueString);
            }
            
            if(coreNumberString != null) {
                coreNumber = Integer.parseInt(coreNumberString);
            }
            
            curHddValue = hddReadRate.to(ioUnit).getEstimatedValue() + hddWriteRate.to(ioUnit).getEstimatedValue();
            
            if(curTimestamp != lastCpuTimeStamp && curTimestamp != lastHddTimeStamp) {                
                
                // TODO finish off previous interval
                if(Math.abs(curCpuValue - lastCpuValue) >= DELTA && cpuValueString != null && coreNumber > 0 && curHost != null) {
                    final EList<ProcessingUnitSpecification> cpuSpecs = curHost.getNode().getCpuSpecifications();
                    final ProcessingUnitSpecification processingUnitSpecification = cpuSpecs.get(0);
                    final Amount<Frequency> frequency = processingUnitSpecification.getFrequency().to(unit);
                    conversionFactorDouble = coreNumber * frequency.getEstimatedValue();
                    if(performFinalWriteCpu) {
                        final TimeDependentFunctionContainer timeDependentFunctionContainer = createConstant(factory,
                                lastCpuTimeStamp, priorTimestamp, lastCpuValue, conversionFactorDouble);            
                        cpuLoadCurve.getSequenceFunctionContainers().add(timeDependentFunctionContainer);
                        lastCpuTimeStamp = priorTimestamp;                        
                    }
                    // Add next CPU interpolation piece. TODO: Also trigger this prior to migration.
                    final TimeDependentFunctionContainer timeDependentFunctionContainer = createInterpolationPiece(factory,
                            lastCpuTimeStamp, curTimestamp, curCpuValue, lastCpuValue, conversionFactorDouble);            
                    cpuLoadCurve.getSequenceFunctionContainers().add(timeDependentFunctionContainer);
                    performFinalWriteCpu = false;
                    lastCpuTimeStamp = curTimestamp;
                    lastCpuValue = curCpuValue;
                } else {
                    performFinalWriteCpu = true;
                }
                
                // TODO finish off previous interval
                if(Math.abs(curHddValue - lastHddValue) >= DELTA && (hddReadValueString != null || hddReadValueString != null)) {
                    if(performFinalWriteHdd) {
                        final TimeDependentFunctionContainer timeDependentFunctionContainer = createConstant(factory,
                                lastHddTimeStamp, priorTimestamp, lastHddValue, 1);            
                        hddLoadCurve.getSequenceFunctionContainers().add(timeDependentFunctionContainer);
                        lastHddTimeStamp = priorTimestamp;
                    }
                    // Add next HDD interpolation piece
                    final TimeDependentFunctionContainer timeDependentFunctionContainerHdd = createInterpolationPiece(factory,
                            lastHddTimeStamp, curTimestamp, curHddValue, lastHddValue, 1);
                    hddLoadCurve.getSequenceFunctionContainers().add(timeDependentFunctionContainerHdd);                
                    performFinalWriteHdd = false;
                    lastHddTimeStamp = curTimestamp;
                    lastHddValue = curHddValue;
                } else {
                    performFinalWriteHdd = true;
                }
            }             
        }
        
        if(performFinalWriteCpu) {
            final TimeDependentFunctionContainer timeDependentFunctionContainer = createConstant(factory,
                    lastCpuTimeStamp, curTimestamp, curCpuValue, conversionFactorDouble);            
            cpuLoadCurve.getSequenceFunctionContainers().add(timeDependentFunctionContainer);
        }
        
        if(performFinalWriteHdd) {
            final TimeDependentFunctionContainer timeDependentFunctionContainerHdd = createConstant(factory,
                    lastHddTimeStamp, curTimestamp, curHddValue, 1);
            hddLoadCurve.getSequenceFunctionContainers().add(timeDependentFunctionContainerHdd);                
        }
        
        final ApplicationFactory appFactory = ApplicationFactory.INSTANCE;
        final BlackBoxVMBehaviour behaviour = appFactory.createBlackBoxVMBehaviour();
        behaviour.setName(vmName);
        behaviour.setPatternIsRepeating(false);
        final BlackBoxWorkload cpuWorkload = appFactory.createBlackBoxWorkload();
        cpuWorkload.setResourceDemandRates(cpuLoadCurve);
        cpuWorkload.setOnResource(initialCpu);
        cpuWorkload.setResourceDemandUnit(unit);
        cpuWorkload.setName(initialCpu.getArchitectureType().getName());
        behaviour.getBlackBoxWorkloads().add(cpuWorkload);
        final BlackBoxWorkload hddWorkload = appFactory.createBlackBoxWorkload();
        hddWorkload.setResourceDemandRates(hddLoadCurve);
        hddWorkload.setOnResource(hddSpecification);
        hddWorkload.setResourceDemandUnit(ioUnit);
        hddWorkload.setName("HDD Workload");
        behaviour.getBlackBoxWorkloads().add(hddWorkload);
        
        return behaviour;
    }

    private TimeDependentFunctionContainer createConstant(DlimFactory factory, long lastCpuTimeStamp,
            long priorTimestamp, double lastCpuValue, double conversionFactorDouble) {
        TimeDependentFunctionContainer timeDependentFunctionContainer = factory.createTimeDependentFunctionContainer();
        timeDependentFunctionContainer.setDuration((priorTimestamp-lastCpuTimeStamp)/1000d);
        
        Constant constant = factory.createConstant();
        constant.setConstant(lastCpuValue);
        timeDependentFunctionContainer.setFunction(constant);
        
        addConversionFactor(factory, conversionFactorDouble, constant);
        
        return timeDependentFunctionContainer;
    }

    private String getInitialHostName(Table table, VMDescription vmDescription) throws IOException {
        Scan s = createScan(vmDescription);        
        s.addColumn(COLUMN_FAMILY_VM_HOST, COLUMN_VM_HOST);
        s.setCaching(1);
        ResultScanner scanner = table.getScanner(s);
        String result = Bytes.toString(scanner.next().getValue(COLUMN_FAMILY_VM_HOST, COLUMN_VM_HOST));
        scanner.close();
        return result;
    }
    
    private String getVmName(Table table, VMDescription vmDescription) throws IOException {
        Scan s = createScan(vmDescription);        
        s.addColumn(COLUMN_FAMILY_HW, COLUMN_VM_NAME);
        s.setCaching(1);
        ResultScanner scanner = table.getScanner(s);
        String result = Bytes.toString(scanner.next().getValue(COLUMN_FAMILY_HW, COLUMN_VM_NAME));
        scanner.close();
        return result;
    }

    private Scan createScan(VMDescription vmDescription) throws IOException {
        final Interval interval = vmDescription.getInterval();
        Scan s = new Scan(Bytes.toBytes(vmDescription.getUuid() + "-" + 0), Bytes.toBytes(vmDescription.getUuid() + "-" + 9));
        s.setTimeRange(interval.getMin(), interval.getMax()+1);
        return s;
    }

    private Sequence createLoadCurve(long lowerBound, long upperBound, DlimFactory factory) {
        Sequence cpuLoadCurve = factory.createSequence();
        cpuLoadCurve.setTerminateAfterLoops(1);
        cpuLoadCurve.setTerminateAfterTime((upperBound-lowerBound)/1000l);
        return cpuLoadCurve;
    }

    private TimeDependentFunctionContainer createInterpolationPiece(DlimFactory factory, long lastTimeStamp,
            long curTimestamp, double curValue, double lastValue, double conversionFactorDouble) {
        TimeDependentFunctionContainer timeDependentFunctionContainer = factory.createTimeDependentFunctionContainer();
        timeDependentFunctionContainer.setDuration((curTimestamp-lastTimeStamp)/1000d);
        
        // Add utilization value
        LinearTrend interpolatedPiece = factory.createLinearTrend();
        interpolatedPiece.setFunctionOutputAtStart(lastValue);
        interpolatedPiece.setFunctionOutputAtEnd(curValue);
        addConversionFactor(factory, conversionFactorDouble, interpolatedPiece);            
        timeDependentFunctionContainer.setFunction(interpolatedPiece);
        return timeDependentFunctionContainer;
    }

    private void addConversionFactor(DlimFactory factory, double conversionFactorDouble,
            Function interpolatedPiece) {
        // Calculate conversion factor
        Combinator curCombinator = factory.createCombinator();
        curCombinator.setOperator(Operator.MULT);
        Constant conversionFactor = factory.createConstant();
        conversionFactor.setConstant(conversionFactorDouble);
        curCombinator.setFunction(conversionFactor);
        interpolatedPiece.getCombine().add(curCombinator);
    }
    
    public static Hypervisor getHost(final LogicalDCModel ldcmodel, final String hostname) {
        for(Hypervisor curHypervisor : ldcmodel.getHypervisors()) {
            if(curHypervisor.getNode().getName().equals(hostname)) {
                return curHypervisor;
            }
        }
        return null;
    }
}
