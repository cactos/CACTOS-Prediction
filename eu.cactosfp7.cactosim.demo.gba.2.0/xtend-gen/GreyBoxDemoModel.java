import com.google.common.base.Objects;
import eu.cactosfp7.infrastructuremodels.logicaldc.application.ApplicationFactory;
import eu.cactosfp7.infrastructuremodels.logicaldc.application.ApplicationInstance;
import eu.cactosfp7.infrastructuremodels.logicaldc.application.ApplicationTemplate;
import eu.cactosfp7.infrastructuremodels.logicaldc.application.GreyBoxApplicationInstance;
import eu.cactosfp7.infrastructuremodels.logicaldc.application.GreyBoxApplicationTemplate;
import eu.cactosfp7.infrastructuremodels.logicaldc.application.GreyBoxBehaviour;
import eu.cactosfp7.infrastructuremodels.logicaldc.application.GreyBoxVMBehaviour;
import eu.cactosfp7.infrastructuremodels.logicaldc.application.GreyBoxVMImageBehaviour;
import eu.cactosfp7.infrastructuremodels.logicaldc.application.ResourceDemand;
import eu.cactosfp7.infrastructuremodels.logicaldc.application.WorkloadPhase;
import eu.cactosfp7.infrastructuremodels.logicaldc.core.ConnectedVirtualEntity;
import eu.cactosfp7.infrastructuremodels.logicaldc.core.Hypervisor;
import eu.cactosfp7.infrastructuremodels.logicaldc.core.LogicalDCModel;
import eu.cactosfp7.infrastructuremodels.logicaldc.core.VMImage;
import eu.cactosfp7.infrastructuremodels.logicaldc.core.VMImageInstance;
import eu.cactosfp7.infrastructuremodels.logicaldc.core.VM_State;
import eu.cactosfp7.infrastructuremodels.logicaldc.core.VirtualDisk;
import eu.cactosfp7.infrastructuremodels.logicaldc.core.VirtualMachine;
import eu.cactosfp7.infrastructuremodels.logicaldc.core.VirtualMemory;
import eu.cactosfp7.infrastructuremodels.logicaldc.core.VirtualNetwork;
import eu.cactosfp7.infrastructuremodels.logicaldc.core.VirtualNetworkInterconnect;
import eu.cactosfp7.infrastructuremodels.logicaldc.core.VirtualProcessingUnit;
import eu.cactosfp7.infrastructuremodels.logicaldc.hypervisor.HypervisorFactory;
import eu.cactosfp7.infrastructuremodels.logicaldc.hypervisor.HypervisorRepository;
import eu.cactosfp7.infrastructuremodels.logicaldc.hypervisor.HypervisorType;
import eu.cactosfp7.infrastructuremodels.physicaldc.architecturetype.ArchitectureType;
import eu.cactosfp7.infrastructuremodels.physicaldc.architecturetype.ArchitectureTypeRepository;
import eu.cactosfp7.infrastructuremodels.physicaldc.architecturetype.ArchitecturetypeFactory;
import eu.cactosfp7.infrastructuremodels.physicaldc.architecturetype.util.ArchitectureTypeUtil;
import eu.cactosfp7.infrastructuremodels.physicaldc.core.AbstractNode;
import eu.cactosfp7.infrastructuremodels.physicaldc.core.Cluster;
import eu.cactosfp7.infrastructuremodels.physicaldc.core.ComputeNode;
import eu.cactosfp7.infrastructuremodels.physicaldc.core.ConnectedEntity;
import eu.cactosfp7.infrastructuremodels.physicaldc.core.CoreFactory;
import eu.cactosfp7.infrastructuremodels.physicaldc.core.MemorySpecification;
import eu.cactosfp7.infrastructuremodels.physicaldc.core.MonitorableResource;
import eu.cactosfp7.infrastructuremodels.physicaldc.core.NetworkAttachedStorage;
import eu.cactosfp7.infrastructuremodels.physicaldc.core.NetworkInterconnect;
import eu.cactosfp7.infrastructuremodels.physicaldc.core.NodeState;
import eu.cactosfp7.infrastructuremodels.physicaldc.core.PhysicalDCModel;
import eu.cactosfp7.infrastructuremodels.physicaldc.core.PowerDistributionUnit;
import eu.cactosfp7.infrastructuremodels.physicaldc.core.ProcessingUnitSpecification;
import eu.cactosfp7.infrastructuremodels.physicaldc.core.Rack;
import eu.cactosfp7.infrastructuremodels.physicaldc.core.StorageSpecification;
import eu.cactosfp7.infrastructuremodels.physicaldc.core.Switch;
import eu.cactosfp7.infrastructuremodels.physicaldc.power.PowerConsumingEntity;
import eu.cactosfp7.infrastructuremodels.physicaldc.power.PowerProvidingEntity;
import eu.cactosfp7.infrastructuremodels.physicaldc.power.binding.BindingFactory;
import eu.cactosfp7.infrastructuremodels.physicaldc.power.binding.FixedFactorValue;
import eu.cactosfp7.infrastructuremodels.physicaldc.power.binding.PowerModelBinding;
import eu.cactosfp7.infrastructuremodels.physicaldc.power.binding.PowerModelBindingRepository;
import eu.cactosfp7.infrastructuremodels.physicaldc.power.specification.ConsumptionFactor;
import eu.cactosfp7.infrastructuremodels.physicaldc.power.specification.FixedFactor;
import eu.cactosfp7.infrastructuremodels.physicaldc.power.specification.MeasuredFactor;
import eu.cactosfp7.infrastructuremodels.physicaldc.power.specification.PowerModel;
import eu.cactosfp7.infrastructuremodels.physicaldc.power.specification.PowerModelRepository;
import eu.cactosfp7.infrastructuremodels.physicaldc.power.specification.SpecificationFactory;
import eu.cactosfp7.infrastructuremodels.physicaldc.util.Bandwidth;
import eu.cactosfp7.infrastructuremodels.physicaldc.util.UtilFactory;
import javax.measure.quantity.DataAmount;
import javax.measure.quantity.DataRate;
import javax.measure.quantity.Dimensionless;
import javax.measure.quantity.Duration;
import javax.measure.quantity.Frequency;
import javax.measure.quantity.Power;
import javax.measure.quantity.Quantity;
import javax.measure.unit.NonSI;
import javax.measure.unit.SI;
import javax.measure.unit.Unit;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.jscience.physics.amount.Amount;

/**
 * Creates a Grey-Box Demonstration Model.
 * There are only Grey-Box applications in the model.
 * Storage access of VMs is local.
 */
@SuppressWarnings("all")
public class GreyBoxDemoModel {
  /**
   * Specifies the number of (identical) physical nodes with VMs on it that are created for the demo case.
   */
  private int numberPhysicalNodes = 16;
  
  /**
   * Specifies the number of nodes with HDDs, the others are assigned SSDs.
   */
  private int numberNodesHdd = 8;
  
  /**
   * Specifies the number of (identical) physical nodes without VMs on it that are created for the demo case and are initially shut down.
   */
  private int numberUnusedPhysicalNodes = 0;
  
  /**
   * Specifies the number of (identical) virtual machines that are created for each physical node.
   */
  private int numberVirtualMachinesPerPhysicalNode = 1;
  
  /**
   * Architecture type Factory
   */
  private ArchitecturetypeFactory af = ArchitecturetypeFactory.INSTANCE;
  
  /**
   * Physical Core Factory
   */
  private CoreFactory pcoref = CoreFactory.INSTANCE;
  
  /**
   * Physical Util Factory
   */
  private UtilFactory putilf = UtilFactory.INSTANCE;
  
  /**
   * Logical Core Factory
   */
  private eu.cactosfp7.infrastructuremodels.logicaldc.core.CoreFactory lcoref = eu.cactosfp7.infrastructuremodels.logicaldc.core.CoreFactory.INSTANCE;
  
  /**
   * Physical Utility Factory
   */
  private UtilFactory puf = UtilFactory.INSTANCE;
  
  /**
   * Hypervisor Factory
   */
  private HypervisorFactory hf = HypervisorFactory.INSTANCE;
  
  /**
   * PDC Binding Factory
   */
  private BindingFactory pbf = BindingFactory.INSTANCE;
  
  /**
   * PDC Specification Factory
   */
  private SpecificationFactory psf = SpecificationFactory.INSTANCE;
  
  /**
   * Logical Application Factory
   */
  private ApplicationFactory laf = ApplicationFactory.INSTANCE;
  
  private Rack rack1;
  
  private Rack rack2;
  
  private ComputeNode[] node = new ComputeNode[this.numberPhysicalNodes];
  
  private Switch switch1;
  
  private PowerDistributionUnit pduMain;
  
  private PowerDistributionUnit pduRack1;
  
  private PowerDistributionUnit pduRack2;
  
  private ProcessingUnitSpecification cpu1;
  
  private MemorySpecification mem1;
  
  private StorageSpecification storage1;
  
  private NetworkInterconnect nic1;
  
  private VMImage vmimageKvmHypervisor;
  
  private VMImage vmimageGBA;
  
  private GreyBoxApplicationTemplate apptempGba;
  
  private GreyBoxVMImageBehaviour vmimagebehaviourGba;
  
  private MonitorableResource apptempCpu;
  
  private MonitorableResource apptempStorageSsd;
  
  private VirtualMachine vmCurrent;
  
  private VirtualNetwork vnetwork;
  
  private HypervisorType hvtype_kvm;
  
  private VirtualMemory vmem1;
  
  private VirtualProcessingUnit vcpu1;
  
  private VirtualNetworkInterconnect vnic1;
  
  private PowerModelBinding pmb;
  
  private PowerModel powermodel;
  
  private ComputeNode cn;
  
  private FixedFactor ff_min;
  
  private FixedFactor ff_max;
  
  private int hypNumber = 0;
  
  public boolean createGBWorkload(final GreyBoxBehaviour gbb, final MonitorableResource cpu, final MonitorableResource storage) {
    boolean _xblockexpression = false;
    {
      EList<WorkloadPhase> _workloadPhases = gbb.getWorkloadPhases();
      WorkloadPhase _createWorkloadPhase = this.laf.createWorkloadPhase();
      final Procedure1<WorkloadPhase> _function = (WorkloadPhase it) -> {
        it.setName("CCSD Phase 1");
        EList<ResourceDemand> _resourceDemands = it.getResourceDemands();
        ResourceDemand _createResourceDemand = this.laf.createResourceDemand();
        final Procedure1<ResourceDemand> _function_1 = (ResourceDemand it_1) -> {
          Unit<Dimensionless> _GIGA = SI.<Dimensionless>GIGA(Dimensionless.UNIT);
          Amount<Dimensionless> _valueOf = Amount.<Dimensionless>valueOf(35374, _GIGA);
          it_1.setAmount(((Amount<? extends Quantity>) _valueOf));
          it_1.setOnResource(cpu);
        };
        ResourceDemand _doubleArrow = ObjectExtensions.<ResourceDemand>operator_doubleArrow(_createResourceDemand, _function_1);
        _resourceDemands.add(_doubleArrow);
        EList<ResourceDemand> _resourceDemands_1 = it.getResourceDemands();
        ResourceDemand _createResourceDemand_1 = this.laf.createResourceDemand();
        final Procedure1<ResourceDemand> _function_2 = (ResourceDemand it_1) -> {
          Unit<DataAmount> _GIGA = SI.<DataAmount>GIGA(NonSI.BYTE);
          Amount<DataAmount> _valueOf = Amount.<DataAmount>valueOf(189, _GIGA);
          it_1.setAmount(((Amount<? extends Quantity>) _valueOf));
          it_1.setOnResource(storage);
        };
        ResourceDemand _doubleArrow_1 = ObjectExtensions.<ResourceDemand>operator_doubleArrow(_createResourceDemand_1, _function_2);
        _resourceDemands_1.add(_doubleArrow_1);
      };
      WorkloadPhase _doubleArrow = ObjectExtensions.<WorkloadPhase>operator_doubleArrow(_createWorkloadPhase, _function);
      _workloadPhases.add(_doubleArrow);
      EList<WorkloadPhase> _workloadPhases_1 = gbb.getWorkloadPhases();
      WorkloadPhase _createWorkloadPhase_1 = this.laf.createWorkloadPhase();
      final Procedure1<WorkloadPhase> _function_1 = (WorkloadPhase it) -> {
        it.setName("CCSD Phase 2");
        EList<ResourceDemand> _resourceDemands = it.getResourceDemands();
        ResourceDemand _createResourceDemand = this.laf.createResourceDemand();
        final Procedure1<ResourceDemand> _function_2 = (ResourceDemand it_1) -> {
          Unit<Dimensionless> _GIGA = SI.<Dimensionless>GIGA(Dimensionless.UNIT);
          Amount<Dimensionless> _valueOf = Amount.<Dimensionless>valueOf(115, _GIGA);
          it_1.setAmount(((Amount<? extends Quantity>) _valueOf));
          it_1.setOnResource(cpu);
        };
        ResourceDemand _doubleArrow_1 = ObjectExtensions.<ResourceDemand>operator_doubleArrow(_createResourceDemand, _function_2);
        _resourceDemands.add(_doubleArrow_1);
        EList<ResourceDemand> _resourceDemands_1 = it.getResourceDemands();
        ResourceDemand _createResourceDemand_1 = this.laf.createResourceDemand();
        final Procedure1<ResourceDemand> _function_3 = (ResourceDemand it_1) -> {
          Unit<DataAmount> _GIGA = SI.<DataAmount>GIGA(NonSI.BYTE);
          Amount<DataAmount> _valueOf = Amount.<DataAmount>valueOf(234, _GIGA);
          it_1.setAmount(((Amount<? extends Quantity>) _valueOf));
          it_1.setOnResource(storage);
        };
        ResourceDemand _doubleArrow_2 = ObjectExtensions.<ResourceDemand>operator_doubleArrow(_createResourceDemand_1, _function_3);
        _resourceDemands_1.add(_doubleArrow_2);
      };
      WorkloadPhase _doubleArrow_1 = ObjectExtensions.<WorkloadPhase>operator_doubleArrow(_createWorkloadPhase_1, _function_1);
      _workloadPhases_1.add(_doubleArrow_1);
      EList<WorkloadPhase> _workloadPhases_2 = gbb.getWorkloadPhases();
      WorkloadPhase _createWorkloadPhase_2 = this.laf.createWorkloadPhase();
      final Procedure1<WorkloadPhase> _function_2 = (WorkloadPhase it) -> {
        it.setName("CCSD Phase 3");
        EList<ResourceDemand> _resourceDemands = it.getResourceDemands();
        ResourceDemand _createResourceDemand = this.laf.createResourceDemand();
        final Procedure1<ResourceDemand> _function_3 = (ResourceDemand it_1) -> {
          Unit<Dimensionless> _GIGA = SI.<Dimensionless>GIGA(Dimensionless.UNIT);
          Amount<Dimensionless> _valueOf = Amount.<Dimensionless>valueOf(28259, _GIGA);
          it_1.setAmount(((Amount<? extends Quantity>) _valueOf));
          it_1.setOnResource(cpu);
        };
        ResourceDemand _doubleArrow_2 = ObjectExtensions.<ResourceDemand>operator_doubleArrow(_createResourceDemand, _function_3);
        _resourceDemands.add(_doubleArrow_2);
        EList<ResourceDemand> _resourceDemands_1 = it.getResourceDemands();
        ResourceDemand _createResourceDemand_1 = this.laf.createResourceDemand();
        final Procedure1<ResourceDemand> _function_4 = (ResourceDemand it_1) -> {
          Unit<DataAmount> _GIGA = SI.<DataAmount>GIGA(NonSI.BYTE);
          Amount<DataAmount> _valueOf = Amount.<DataAmount>valueOf(172, _GIGA);
          it_1.setAmount(((Amount<? extends Quantity>) _valueOf));
          it_1.setOnResource(storage);
        };
        ResourceDemand _doubleArrow_3 = ObjectExtensions.<ResourceDemand>operator_doubleArrow(_createResourceDemand_1, _function_4);
        _resourceDemands_1.add(_doubleArrow_3);
      };
      WorkloadPhase _doubleArrow_2 = ObjectExtensions.<WorkloadPhase>operator_doubleArrow(_createWorkloadPhase_2, _function_2);
      _workloadPhases_2.add(_doubleArrow_2);
      EList<WorkloadPhase> _workloadPhases_3 = gbb.getWorkloadPhases();
      WorkloadPhase _createWorkloadPhase_3 = this.laf.createWorkloadPhase();
      final Procedure1<WorkloadPhase> _function_3 = (WorkloadPhase it) -> {
        it.setName("CCSD Phase 4");
        EList<ResourceDemand> _resourceDemands = it.getResourceDemands();
        ResourceDemand _createResourceDemand = this.laf.createResourceDemand();
        final Procedure1<ResourceDemand> _function_4 = (ResourceDemand it_1) -> {
          Unit<Dimensionless> _GIGA = SI.<Dimensionless>GIGA(Dimensionless.UNIT);
          Amount<Dimensionless> _valueOf = Amount.<Dimensionless>valueOf(2212, _GIGA);
          it_1.setAmount(((Amount<? extends Quantity>) _valueOf));
          it_1.setOnResource(cpu);
        };
        ResourceDemand _doubleArrow_3 = ObjectExtensions.<ResourceDemand>operator_doubleArrow(_createResourceDemand, _function_4);
        _resourceDemands.add(_doubleArrow_3);
        EList<ResourceDemand> _resourceDemands_1 = it.getResourceDemands();
        ResourceDemand _createResourceDemand_1 = this.laf.createResourceDemand();
        final Procedure1<ResourceDemand> _function_5 = (ResourceDemand it_1) -> {
          Unit<DataAmount> _GIGA = SI.<DataAmount>GIGA(NonSI.BYTE);
          Amount<DataAmount> _valueOf = Amount.<DataAmount>valueOf(422, _GIGA);
          it_1.setAmount(((Amount<? extends Quantity>) _valueOf));
          it_1.setOnResource(storage);
        };
        ResourceDemand _doubleArrow_4 = ObjectExtensions.<ResourceDemand>operator_doubleArrow(_createResourceDemand_1, _function_5);
        _resourceDemands_1.add(_doubleArrow_4);
      };
      WorkloadPhase _doubleArrow_3 = ObjectExtensions.<WorkloadPhase>operator_doubleArrow(_createWorkloadPhase_3, _function_3);
      _xblockexpression = _workloadPhases_3.add(_doubleArrow_3);
    }
    return _xblockexpression;
  }
  
  public boolean createGBWorkloadDFT(final GreyBoxBehaviour gbb, final MonitorableResource cpu, final MonitorableResource storage) {
    EList<WorkloadPhase> _workloadPhases = gbb.getWorkloadPhases();
    WorkloadPhase _createWorkloadPhase = this.laf.createWorkloadPhase();
    final Procedure1<WorkloadPhase> _function = (WorkloadPhase it) -> {
      it.setName("DFT Single Phase");
      EList<ResourceDemand> _resourceDemands = it.getResourceDemands();
      ResourceDemand _createResourceDemand = this.laf.createResourceDemand();
      final Procedure1<ResourceDemand> _function_1 = (ResourceDemand it_1) -> {
        Unit<Dimensionless> _GIGA = SI.<Dimensionless>GIGA(Dimensionless.UNIT);
        Amount<Dimensionless> _valueOf = Amount.<Dimensionless>valueOf(9999, _GIGA);
        it_1.setAmount(((Amount<? extends Quantity>) _valueOf));
        it_1.setOnResource(cpu);
      };
      ResourceDemand _doubleArrow = ObjectExtensions.<ResourceDemand>operator_doubleArrow(_createResourceDemand, _function_1);
      _resourceDemands.add(_doubleArrow);
      EList<ResourceDemand> _resourceDemands_1 = it.getResourceDemands();
      ResourceDemand _createResourceDemand_1 = this.laf.createResourceDemand();
      final Procedure1<ResourceDemand> _function_2 = (ResourceDemand it_1) -> {
        Unit<DataAmount> _GIGA = SI.<DataAmount>GIGA(NonSI.BYTE);
        Amount<DataAmount> _valueOf = Amount.<DataAmount>valueOf(99, _GIGA);
        it_1.setAmount(((Amount<? extends Quantity>) _valueOf));
        it_1.setOnResource(storage);
      };
      ResourceDemand _doubleArrow_1 = ObjectExtensions.<ResourceDemand>operator_doubleArrow(_createResourceDemand_1, _function_2);
      _resourceDemands_1.add(_doubleArrow_1);
    };
    WorkloadPhase _doubleArrow = ObjectExtensions.<WorkloadPhase>operator_doubleArrow(_createWorkloadPhase, _function);
    return _workloadPhases.add(_doubleArrow);
  }
  
  public StorageSpecification createStorageSsd() {
    StorageSpecification _createStorageSpecification = this.pcoref.createStorageSpecification();
    final Procedure1<StorageSpecification> _function = (StorageSpecification it) -> {
      it.setName("Local SSD");
      Unit<DataAmount> _GIGA = SI.<DataAmount>GIGA(NonSI.BYTE);
      Amount<DataAmount> _valueOf = Amount.<DataAmount>valueOf(220, _GIGA);
      it.setSize(_valueOf);
      Amount<Duration> _valueOf_1 = Amount.<Duration>valueOf(0, SI.SECOND);
      it.setReadDelay(_valueOf_1);
      Bandwidth _createBandwidth = this.puf.createBandwidth();
      final Procedure1<Bandwidth> _function_1 = (Bandwidth it_1) -> {
        Unit<DataRate> _MEGA = SI.<DataRate>MEGA(DataRate.UNIT);
        Amount<DataRate> _valueOf_2 = Amount.<DataRate>valueOf((120 * 8), _MEGA);
        it_1.setValue(_valueOf_2);
      };
      Bandwidth _doubleArrow = ObjectExtensions.<Bandwidth>operator_doubleArrow(_createBandwidth, _function_1);
      it.setReadBandwidth(_doubleArrow);
      Amount<Duration> _valueOf_2 = Amount.<Duration>valueOf(0, SI.SECOND);
      it.setWriteDelay(_valueOf_2);
      Bandwidth _createBandwidth_1 = this.puf.createBandwidth();
      final Procedure1<Bandwidth> _function_2 = (Bandwidth it_1) -> {
        Unit<DataRate> _MEGA = SI.<DataRate>MEGA(DataRate.UNIT);
        Amount<DataRate> _valueOf_3 = Amount.<DataRate>valueOf((120 * 8), _MEGA);
        it_1.setValue(_valueOf_3);
      };
      Bandwidth _doubleArrow_1 = ObjectExtensions.<Bandwidth>operator_doubleArrow(_createBandwidth_1, _function_2);
      it.setWriteBandwidth(_doubleArrow_1);
    };
    return ObjectExtensions.<StorageSpecification>operator_doubleArrow(_createStorageSpecification, _function);
  }
  
  public ProcessingUnitSpecification createCpu() {
    ProcessingUnitSpecification _createProcessingUnitSpecification = this.pcoref.createProcessingUnitSpecification();
    final Procedure1<ProcessingUnitSpecification> _function = (ProcessingUnitSpecification it) -> {
      it.setName("Intel(R) Core(TM) i5-3470");
      Unit<Frequency> _GIGA = SI.<Frequency>GIGA(SI.HERTZ);
      Amount<Frequency> _valueOf = Amount.<Frequency>valueOf(3.2, _GIGA);
      it.setFrequency(_valueOf);
      it.setNumberOfCores(1);
      it.setSupportsTurboMode(Boolean.valueOf(false));
      ArchitectureType _createOrGet = ArchitectureTypeUtil.INSTANCE.createOrGet(this.architectureRepo, ArchitectureTypeUtil.ARCHITECTURE_TYPE_x86_GENERIC_UUID);
      it.setArchitectureType(_createOrGet);
      it.setPowerModelBinding(this.pmb);
    };
    return ObjectExtensions.<ProcessingUnitSpecification>operator_doubleArrow(_createProcessingUnitSpecification, _function);
  }
  
  public VMImage createGreyBoxVMImage(final StorageSpecification storage) {
    VMImage _createVMImage = this.lcoref.createVMImage();
    final Procedure1<VMImage> _function = (VMImage it) -> {
      it.setName("Molpro VM Image");
      Unit<DataAmount> _GIGA = SI.<DataAmount>GIGA(NonSI.BYTE);
      Amount<DataAmount> _valueOf = Amount.<DataAmount>valueOf(12.0, _GIGA);
      it.setCapacity(_valueOf);
      Unit<DataAmount> _GIGA_1 = SI.<DataAmount>GIGA(NonSI.BYTE);
      Amount<DataAmount> _valueOf_1 = Amount.<DataAmount>valueOf(5.0, _GIGA_1);
      it.setUsedCapacity(_valueOf_1);
      it.setStorageLocation(storage);
    };
    return ObjectExtensions.<VMImage>operator_doubleArrow(_createVMImage, _function);
  }
  
  public VMImage createVirtualDiskKvmHyp(final StorageSpecification storage) {
    VMImage _createVMImage = this.lcoref.createVMImage();
    final Procedure1<VMImage> _function = (VMImage it) -> {
      it.setName("KvmHypervisor");
      Unit<DataAmount> _TERA = SI.<DataAmount>TERA(NonSI.BYTE);
      Amount<DataAmount> _valueOf = Amount.<DataAmount>valueOf(4.0, _TERA);
      it.setCapacity(_valueOf);
      Unit<DataAmount> _GIGA = SI.<DataAmount>GIGA(NonSI.BYTE);
      Amount<DataAmount> _valueOf_1 = Amount.<DataAmount>valueOf(3.0, _GIGA);
      it.setUsedCapacity(_valueOf_1);
      it.setStorageLocation(storage);
    };
    return ObjectExtensions.<VMImage>operator_doubleArrow(_createVMImage, _function);
  }
  
  public final ArchitectureTypeRepository architectureRepo = ObjectExtensions.<ArchitectureTypeRepository>operator_doubleArrow(this.af.createArchitectureTypeRepository(), ((Procedure1<ArchitectureTypeRepository>) (ArchitectureTypeRepository it) -> {
  }));
  
  public final HypervisorRepository hypervisorRepository = ObjectExtensions.<HypervisorRepository>operator_doubleArrow(this.hf.createHypervisorRepository(), ((Procedure1<HypervisorRepository>) (HypervisorRepository it) -> {
    EList<HypervisorType> _hypervisorTypes = it.getHypervisorTypes();
    HypervisorType _createHypervisorType = this.hf.createHypervisorType();
    final Procedure1<HypervisorType> _function = (HypervisorType it_1) -> {
      it_1.setName("kvm");
    };
    HypervisorType _doubleArrow = ObjectExtensions.<HypervisorType>operator_doubleArrow(_createHypervisorType, _function);
    _hypervisorTypes.add((this.hvtype_kvm = _doubleArrow));
  }));
  
  public final PowerModelRepository pdcSpecRepo = ObjectExtensions.<PowerModelRepository>operator_doubleArrow(this.psf.createPowerModelRepository(), ((Procedure1<PowerModelRepository>) (PowerModelRepository it) -> {
    it.setName("Generated for Year 2 Demonstration");
    EList<PowerModel> _powerModels = it.getPowerModels();
    PowerModel _createPowerModel = this.psf.createPowerModel();
    final Procedure1<PowerModel> _function = (PowerModel it_1) -> {
      it_1.setName("Linear Power Model");
      it_1.setExpression("minConsumption+u*(maxConsumption-minConsumption)");
      EList<ConsumptionFactor> _consumptionFactors = it_1.getConsumptionFactors();
      FixedFactor _createFixedFactor = this.psf.createFixedFactor();
      final Procedure1<FixedFactor> _function_1 = (FixedFactor it_2) -> {
        it_2.setName("minConsumption");
      };
      FixedFactor _doubleArrow = ObjectExtensions.<FixedFactor>operator_doubleArrow(_createFixedFactor, _function_1);
      _consumptionFactors.add((this.ff_min = _doubleArrow));
      EList<ConsumptionFactor> _consumptionFactors_1 = it_1.getConsumptionFactors();
      FixedFactor _createFixedFactor_1 = this.psf.createFixedFactor();
      final Procedure1<FixedFactor> _function_2 = (FixedFactor it_2) -> {
        it_2.setName("maxConsumption");
      };
      FixedFactor _doubleArrow_1 = ObjectExtensions.<FixedFactor>operator_doubleArrow(_createFixedFactor_1, _function_2);
      _consumptionFactors_1.add((this.ff_max = _doubleArrow_1));
      EList<ConsumptionFactor> _consumptionFactors_2 = it_1.getConsumptionFactors();
      MeasuredFactor _createMeasuredFactor = this.psf.createMeasuredFactor();
      final Procedure1<MeasuredFactor> _function_3 = (MeasuredFactor it_2) -> {
        it_2.setName("u");
        it_2.setUnit(Dimensionless.UNIT);
      };
      MeasuredFactor _doubleArrow_2 = ObjectExtensions.<MeasuredFactor>operator_doubleArrow(_createMeasuredFactor, _function_3);
      _consumptionFactors_2.add(_doubleArrow_2);
    };
    PowerModel _doubleArrow = ObjectExtensions.<PowerModel>operator_doubleArrow(_createPowerModel, _function);
    _powerModels.add((this.powermodel = _doubleArrow));
  }));
  
  public final PowerModelBindingRepository pdcBindingRepo = ObjectExtensions.<PowerModelBindingRepository>operator_doubleArrow(this.pbf.createPowerModelBindingRepository(), ((Procedure1<PowerModelBindingRepository>) (PowerModelBindingRepository it) -> {
    EList<PowerModelBinding> _powerModelBindings = it.getPowerModelBindings();
    PowerModelBinding _createPowerModelBinding = this.pbf.createPowerModelBinding();
    final Procedure1<PowerModelBinding> _function = (PowerModelBinding it_1) -> {
      it_1.setName("Linear Consumption Model");
      it_1.setPowerModel(this.powermodel);
      EList<FixedFactorValue> _fixedFactorValues = it_1.getFixedFactorValues();
      FixedFactorValue _createFixedFactorValue = this.pbf.createFixedFactorValue();
      final Procedure1<FixedFactorValue> _function_1 = (FixedFactorValue it_2) -> {
        it_2.setName("minConsumption");
        Amount<Power> _valueOf = Amount.<Power>valueOf(270.0, SI.WATT);
        it_2.setValue(_valueOf);
        it_2.setBoundFactor(this.ff_min);
      };
      FixedFactorValue _doubleArrow = ObjectExtensions.<FixedFactorValue>operator_doubleArrow(_createFixedFactorValue, _function_1);
      _fixedFactorValues.add(_doubleArrow);
      EList<FixedFactorValue> _fixedFactorValues_1 = it_1.getFixedFactorValues();
      FixedFactorValue _createFixedFactorValue_1 = this.pbf.createFixedFactorValue();
      final Procedure1<FixedFactorValue> _function_2 = (FixedFactorValue it_2) -> {
        it_2.setName("maxConsumption");
        Amount<Power> _valueOf = Amount.<Power>valueOf(700.0, SI.WATT);
        it_2.setValue(_valueOf);
        it_2.setBoundFactor(this.ff_max);
      };
      FixedFactorValue _doubleArrow_1 = ObjectExtensions.<FixedFactorValue>operator_doubleArrow(_createFixedFactorValue_1, _function_2);
      _fixedFactorValues_1.add(_doubleArrow_1);
    };
    PowerModelBinding _doubleArrow = ObjectExtensions.<PowerModelBinding>operator_doubleArrow(_createPowerModelBinding, _function);
    _powerModelBindings.add((this.pmb = _doubleArrow));
  }));
  
  public final PhysicalDCModel physicalDcModel = ObjectExtensions.<PhysicalDCModel>operator_doubleArrow(this.pcoref.createPhysicalDCModel(), ((Procedure1<PhysicalDCModel>) (PhysicalDCModel it) -> {
    EList<PowerDistributionUnit> _powerSupplies = it.getPowerSupplies();
    PowerDistributionUnit _createPowerDistributionUnit = this.pcoref.createPowerDistributionUnit();
    final Procedure1<PowerDistributionUnit> _function = (PowerDistributionUnit it_1) -> {
      it_1.setName("Main PDU");
      Unit<Power> _KILO = SI.<Power>KILO(SI.WATT);
      Amount<Power> _valueOf = Amount.<Power>valueOf(3.2, _KILO);
      it_1.setSuppliablePeakPower(_valueOf);
      Unit<Power> _KILO_1 = SI.<Power>KILO(SI.WATT);
      Amount<Power> _valueOf_1 = Amount.<Power>valueOf(3, _KILO_1);
      it_1.setPowerCap(_valueOf_1);
    };
    PowerDistributionUnit _doubleArrow = ObjectExtensions.<PowerDistributionUnit>operator_doubleArrow(_createPowerDistributionUnit, _function);
    _powerSupplies.add((this.pduMain = _doubleArrow));
    EList<PowerDistributionUnit> _powerSupplies_1 = it.getPowerSupplies();
    PowerDistributionUnit _createPowerDistributionUnit_1 = this.pcoref.createPowerDistributionUnit();
    final Procedure1<PowerDistributionUnit> _function_1 = (PowerDistributionUnit it_1) -> {
      it_1.setName("Rack 1 PDU");
      Unit<Power> _KILO = SI.<Power>KILO(SI.WATT);
      Amount<Power> _valueOf = Amount.<Power>valueOf(2, _KILO);
      it_1.setSuppliablePeakPower(_valueOf);
      Unit<Power> _KILO_1 = SI.<Power>KILO(SI.WATT);
      Amount<Power> _valueOf_1 = Amount.<Power>valueOf(2, _KILO_1);
      it_1.setPowerCap(_valueOf_1);
      EList<PowerProvidingEntity> _powerProvidingEntities = it_1.getPowerProvidingEntities();
      _powerProvidingEntities.add(this.pduMain);
    };
    PowerDistributionUnit _doubleArrow_1 = ObjectExtensions.<PowerDistributionUnit>operator_doubleArrow(_createPowerDistributionUnit_1, _function_1);
    _powerSupplies_1.add((this.pduRack1 = _doubleArrow_1));
    EList<PowerDistributionUnit> _powerSupplies_2 = it.getPowerSupplies();
    PowerDistributionUnit _createPowerDistributionUnit_2 = this.pcoref.createPowerDistributionUnit();
    final Procedure1<PowerDistributionUnit> _function_2 = (PowerDistributionUnit it_1) -> {
      it_1.setName("Rack 2 PDU");
      Unit<Power> _KILO = SI.<Power>KILO(SI.WATT);
      Amount<Power> _valueOf = Amount.<Power>valueOf(2, _KILO);
      it_1.setSuppliablePeakPower(_valueOf);
      Unit<Power> _KILO_1 = SI.<Power>KILO(SI.WATT);
      Amount<Power> _valueOf_1 = Amount.<Power>valueOf(2, _KILO_1);
      it_1.setPowerCap(_valueOf_1);
      EList<PowerProvidingEntity> _powerProvidingEntities = it_1.getPowerProvidingEntities();
      _powerProvidingEntities.add(this.pduMain);
    };
    PowerDistributionUnit _doubleArrow_2 = ObjectExtensions.<PowerDistributionUnit>operator_doubleArrow(_createPowerDistributionUnit_2, _function_2);
    _powerSupplies_2.add((this.pduRack2 = _doubleArrow_2));
    EList<Rack> _racks = it.getRacks();
    Rack _createRack = this.pcoref.createRack();
    final Procedure1<Rack> _function_3 = (Rack it_1) -> {
      it_1.setName("Dell 08-15");
      EList<PowerDistributionUnit> _powerSupplies_3 = it_1.getPowerSupplies();
      _powerSupplies_3.add(this.pduRack1);
    };
    Rack _doubleArrow_3 = ObjectExtensions.<Rack>operator_doubleArrow(_createRack, _function_3);
    _racks.add((this.rack1 = _doubleArrow_3));
    EList<Rack> _racks_1 = it.getRacks();
    Rack _createRack_1 = this.pcoref.createRack();
    final Procedure1<Rack> _function_4 = (Rack it_1) -> {
      it_1.setName("Dell 08-15");
      EList<PowerDistributionUnit> _powerSupplies_3 = it_1.getPowerSupplies();
      _powerSupplies_3.add(this.pduRack2);
    };
    Rack _doubleArrow_4 = ObjectExtensions.<Rack>operator_doubleArrow(_createRack_1, _function_4);
    _racks_1.add((this.rack2 = _doubleArrow_4));
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, (this.numberPhysicalNodes + this.numberUnusedPhysicalNodes), true);
    for (final int i : _doubleDotLessThan) {
      {
        ComputeNode _createComputeNode = this.pcoref.createComputeNode();
        final Procedure1<ComputeNode> _function_5 = (ComputeNode it_1) -> {
          it_1.setName(("Compute Node " + Integer.valueOf(i)));
          it_1.setState(NodeState.RUNNING);
          EList<ProcessingUnitSpecification> _cpuSpecifications = it_1.getCpuSpecifications();
          ProcessingUnitSpecification _createCpu = this.createCpu();
          _cpuSpecifications.add((this.cpu1 = _createCpu));
          if ((i < this.numberNodesHdd)) {
            EList<StorageSpecification> _storageSpecifications = it_1.getStorageSpecifications();
            StorageSpecification _createStorageSpecification = this.pcoref.createStorageSpecification();
            final Procedure1<StorageSpecification> _function_6 = (StorageSpecification it_2) -> {
              it_2.setName(("Local HDD #" + Integer.valueOf(i)));
              Unit<DataAmount> _GIGA = SI.<DataAmount>GIGA(NonSI.BYTE);
              Amount<DataAmount> _valueOf = Amount.<DataAmount>valueOf(220, _GIGA);
              it_2.setSize(_valueOf);
              Amount<Duration> _valueOf_1 = Amount.<Duration>valueOf(0, SI.SECOND);
              it_2.setReadDelay(_valueOf_1);
              Bandwidth _createBandwidth = this.puf.createBandwidth();
              final Procedure1<Bandwidth> _function_7 = (Bandwidth it_3) -> {
                Unit<DataRate> _MEGA = SI.<DataRate>MEGA(DataRate.UNIT);
                Amount<DataRate> _valueOf_2 = Amount.<DataRate>valueOf((70 * 8), _MEGA);
                it_3.setValue(_valueOf_2);
              };
              Bandwidth _doubleArrow_5 = ObjectExtensions.<Bandwidth>operator_doubleArrow(_createBandwidth, _function_7);
              it_2.setReadBandwidth(_doubleArrow_5);
              Amount<Duration> _valueOf_2 = Amount.<Duration>valueOf(0, SI.SECOND);
              it_2.setWriteDelay(_valueOf_2);
              Bandwidth _createBandwidth_1 = this.puf.createBandwidth();
              final Procedure1<Bandwidth> _function_8 = (Bandwidth it_3) -> {
                Unit<DataRate> _MEGA = SI.<DataRate>MEGA(DataRate.UNIT);
                Amount<DataRate> _valueOf_3 = Amount.<DataRate>valueOf((70 * 8), _MEGA);
                it_3.setValue(_valueOf_3);
              };
              Bandwidth _doubleArrow_6 = ObjectExtensions.<Bandwidth>operator_doubleArrow(_createBandwidth_1, _function_8);
              it_2.setWriteBandwidth(_doubleArrow_6);
            };
            StorageSpecification _doubleArrow_5 = ObjectExtensions.<StorageSpecification>operator_doubleArrow(_createStorageSpecification, _function_6);
            _storageSpecifications.add((this.storage1 = _doubleArrow_5));
          } else {
            EList<StorageSpecification> _storageSpecifications_1 = it_1.getStorageSpecifications();
            StorageSpecification _createStorageSsd = this.createStorageSsd();
            _storageSpecifications_1.add((this.storage1 = _createStorageSsd));
            this.storage1.setName(("Local SSD #" + Integer.valueOf(i)));
          }
          EList<MemorySpecification> _memorySpecifications = it_1.getMemorySpecifications();
          MemorySpecification _createMemorySpecification = this.pcoref.createMemorySpecification();
          final Procedure1<MemorySpecification> _function_7 = (MemorySpecification it_2) -> {
            it_2.setName("DDR3-RAM");
            Unit<DataAmount> _GIGA = SI.<DataAmount>GIGA(NonSI.BYTE);
            Amount<DataAmount> _valueOf = Amount.<DataAmount>valueOf(16, _GIGA);
            it_2.setSize(_valueOf);
            Bandwidth _createBandwidth = this.puf.createBandwidth();
            final Procedure1<Bandwidth> _function_8 = (Bandwidth it_3) -> {
              Unit<DataRate> _GIGA_1 = SI.<DataRate>GIGA(DataRate.UNIT);
              Amount<DataRate> _valueOf_1 = Amount.<DataRate>valueOf((23.984 * 8), _GIGA_1);
              it_3.setValue(_valueOf_1);
            };
            Bandwidth _doubleArrow_6 = ObjectExtensions.<Bandwidth>operator_doubleArrow(_createBandwidth, _function_8);
            it_2.setBandwidthRead(_doubleArrow_6);
            Bandwidth _createBandwidth_1 = this.puf.createBandwidth();
            final Procedure1<Bandwidth> _function_9 = (Bandwidth it_3) -> {
              Unit<DataRate> _GIGA_1 = SI.<DataRate>GIGA(DataRate.UNIT);
              Amount<DataRate> _valueOf_1 = Amount.<DataRate>valueOf((25.132 * 8), _GIGA_1);
              it_3.setValue(_valueOf_1);
            };
            Bandwidth _doubleArrow_7 = ObjectExtensions.<Bandwidth>operator_doubleArrow(_createBandwidth_1, _function_9);
            it_2.setBandwidthWrite(_doubleArrow_7);
          };
          MemorySpecification _doubleArrow_6 = ObjectExtensions.<MemorySpecification>operator_doubleArrow(_createMemorySpecification, _function_7);
          _memorySpecifications.add((this.mem1 = _doubleArrow_6));
          EList<PowerConsumingEntity> _powerConsumingEntities = it_1.getPowerConsumingEntities();
          _powerConsumingEntities.add(this.cpu1);
          EList<PowerConsumingEntity> _powerConsumingEntities_1 = it_1.getPowerConsumingEntities();
          _powerConsumingEntities_1.add(this.storage1);
          EList<PowerConsumingEntity> _powerConsumingEntities_2 = it_1.getPowerConsumingEntities();
          _powerConsumingEntities_2.add(this.mem1);
        };
        ComputeNode _doubleArrow_5 = ObjectExtensions.<ComputeNode>operator_doubleArrow(_createComputeNode, _function_5);
        this.cn = _doubleArrow_5;
        if ((i < this.numberPhysicalNodes)) {
          this.node[i] = this.cn;
          EList<AbstractNode> _nodes = this.rack1.getNodes();
          _nodes.add(this.cn);
          EList<PowerConsumingEntity> _powerConsumingEntities = this.pduRack1.getPowerConsumingEntities();
          _powerConsumingEntities.add(this.cn);
        } else {
          EList<AbstractNode> _nodes_1 = this.rack2.getNodes();
          _nodes_1.add(this.cn);
          EList<PowerConsumingEntity> _powerConsumingEntities_1 = this.pduRack2.getPowerConsumingEntities();
          _powerConsumingEntities_1.add(this.cn);
        }
      }
    }
    EList<AbstractNode> _nodes = this.rack2.getNodes();
    NetworkAttachedStorage _createNetworkAttachedStorage = this.pcoref.createNetworkAttachedStorage();
    final Procedure1<NetworkAttachedStorage> _function_5 = (NetworkAttachedStorage it_1) -> {
      it_1.setName("Main");
      EList<StorageSpecification> _storageSpecifications = it_1.getStorageSpecifications();
      StorageSpecification _createStorageSpecification = this.pcoref.createStorageSpecification();
      final Procedure1<StorageSpecification> _function_6 = (StorageSpecification it_2) -> {
        it_2.setName("NAS (Virtual) HDD");
        Unit<DataAmount> _TERA = SI.<DataAmount>TERA(NonSI.BYTE);
        Amount<DataAmount> _valueOf = Amount.<DataAmount>valueOf(500, _TERA);
        it_2.setSize(_valueOf);
        Amount<Duration> _valueOf_1 = Amount.<Duration>valueOf(0, SI.SECOND);
        it_2.setReadDelay(_valueOf_1);
        Bandwidth _createBandwidth = this.puf.createBandwidth();
        final Procedure1<Bandwidth> _function_7 = (Bandwidth it_3) -> {
          Unit<DataRate> _MEGA = SI.<DataRate>MEGA(DataRate.UNIT);
          Amount<DataRate> _valueOf_2 = Amount.<DataRate>valueOf((120 * 8), _MEGA);
          it_3.setValue(_valueOf_2);
        };
        Bandwidth _doubleArrow_5 = ObjectExtensions.<Bandwidth>operator_doubleArrow(_createBandwidth, _function_7);
        it_2.setReadBandwidth(_doubleArrow_5);
        Amount<Duration> _valueOf_2 = Amount.<Duration>valueOf(0, SI.SECOND);
        it_2.setWriteDelay(_valueOf_2);
        Bandwidth _createBandwidth_1 = this.puf.createBandwidth();
        final Procedure1<Bandwidth> _function_8 = (Bandwidth it_3) -> {
          Unit<DataRate> _MEGA = SI.<DataRate>MEGA(DataRate.UNIT);
          Amount<DataRate> _valueOf_3 = Amount.<DataRate>valueOf((120 * 8), _MEGA);
          it_3.setValue(_valueOf_3);
        };
        Bandwidth _doubleArrow_6 = ObjectExtensions.<Bandwidth>operator_doubleArrow(_createBandwidth_1, _function_8);
        it_2.setWriteBandwidth(_doubleArrow_6);
      };
      StorageSpecification _doubleArrow_5 = ObjectExtensions.<StorageSpecification>operator_doubleArrow(_createStorageSpecification, _function_6);
      _storageSpecifications.add((this.storage1 = _doubleArrow_5));
    };
    NetworkAttachedStorage _doubleArrow_5 = ObjectExtensions.<NetworkAttachedStorage>operator_doubleArrow(_createNetworkAttachedStorage, _function_5);
    _nodes.add(_doubleArrow_5);
    EList<PowerConsumingEntity> _powerConsumingEntities = this.pduRack2.getPowerConsumingEntities();
    EList<AbstractNode> _nodes_1 = this.rack2.getNodes();
    AbstractNode _last = IterableExtensions.<AbstractNode>last(_nodes_1);
    _powerConsumingEntities.add(_last);
    EList<NetworkInterconnect> _networkInterconnects = it.getNetworkInterconnects();
    NetworkInterconnect _createNetworkInterconnect = this.pcoref.createNetworkInterconnect();
    final Procedure1<NetworkInterconnect> _function_6 = (NetworkInterconnect it_1) -> {
      it_1.setName("Single NIC Layout");
      EList<AbstractNode> _nodes_2 = this.rack1.getNodes();
      for (final AbstractNode an : _nodes_2) {
        EList<ConnectedEntity> _connectedEntities = it_1.getConnectedEntities();
        _connectedEntities.add(an);
      }
      Bandwidth _createBandwidth = this.putilf.createBandwidth();
      final Procedure1<Bandwidth> _function_7 = (Bandwidth it_2) -> {
        Unit<DataRate> _GIGA = SI.<DataRate>GIGA(DataRate.UNIT);
        Amount<DataRate> _valueOf = Amount.<DataRate>valueOf(1.0, _GIGA);
        it_2.setValue(_valueOf);
      };
      Bandwidth _doubleArrow_6 = ObjectExtensions.<Bandwidth>operator_doubleArrow(_createBandwidth, _function_7);
      it_1.setBandwidth(_doubleArrow_6);
    };
    NetworkInterconnect _doubleArrow_6 = ObjectExtensions.<NetworkInterconnect>operator_doubleArrow(_createNetworkInterconnect, _function_6);
    _networkInterconnects.add((this.nic1 = _doubleArrow_6));
    EList<Switch> _switches = it.getSwitches();
    Switch _createSwitch = this.pcoref.createSwitch();
    final Procedure1<Switch> _function_7 = (Switch it_1) -> {
      it_1.setName("Single Switch Layout");
    };
    Switch _doubleArrow_7 = ObjectExtensions.<Switch>operator_doubleArrow(_createSwitch, _function_7);
    _switches.add((this.switch1 = _doubleArrow_7));
    EList<ConnectedEntity> _connectedEntities = this.nic1.getConnectedEntities();
    _connectedEntities.add(this.switch1);
    EList<Cluster> _clusters = it.getClusters();
    Cluster _createCluster = this.pcoref.createCluster();
    final Procedure1<Cluster> _function_8 = (Cluster it_1) -> {
      it_1.setName("Single Cluster Layout");
      it_1.setClusterId(1);
      EList<AbstractNode> _nodes_2 = this.rack1.getNodes();
      for (final AbstractNode an : _nodes_2) {
        EList<AbstractNode> _containedNodes = it_1.getContainedNodes();
        _containedNodes.add(an);
      }
    };
    Cluster _doubleArrow_8 = ObjectExtensions.<Cluster>operator_doubleArrow(_createCluster, _function_8);
    _clusters.add(_doubleArrow_8);
  }));
  
  public final LogicalDCModel logicalDcModel = ObjectExtensions.<LogicalDCModel>operator_doubleArrow(this.lcoref.createLogicalDCModel(), ((Procedure1<LogicalDCModel>) (LogicalDCModel it) -> {
    Amount<Duration> _valueOf = Amount.<Duration>valueOf(60, SI.SECOND);
    it.setCyclicOptimizationInterval(_valueOf);
    EList<VirtualDisk> _volumesAndImages = it.getVolumesAndImages();
    VirtualDisk _createVirtualDisk = this.lcoref.createVirtualDisk();
    final Procedure1<VirtualDisk> _function = (VirtualDisk it_1) -> {
      it_1.setName("Virtual Disk storing VMImages, e.g. Grey-Box Applications Image(s).");
      Unit<DataAmount> _TERA = SI.<DataAmount>TERA(NonSI.BYTE);
      Amount<DataAmount> _valueOf_1 = Amount.<DataAmount>valueOf(5.0, _TERA);
      it_1.setCapacity(_valueOf_1);
      it_1.setStorageLocation(this.storage1);
      EList<VirtualDisk> _deltaOverlay = it_1.getDeltaOverlay();
      VMImage _createGreyBoxVMImage = this.createGreyBoxVMImage(this.storage1);
      _deltaOverlay.add((this.vmimageGBA = _createGreyBoxVMImage));
      EList<VirtualDisk> _deltaOverlay_1 = it_1.getDeltaOverlay();
      VMImage _createVirtualDiskKvmHyp = this.createVirtualDiskKvmHyp(this.storage1);
      _deltaOverlay_1.add((this.vmimageKvmHypervisor = _createVirtualDiskKvmHyp));
    };
    VirtualDisk _doubleArrow = ObjectExtensions.<VirtualDisk>operator_doubleArrow(_createVirtualDisk, _function);
    _volumesAndImages.add(_doubleArrow);
    EList<VirtualNetwork> _virtualNetworks = it.getVirtualNetworks();
    VirtualNetwork _createVirtualNetwork = this.lcoref.createVirtualNetwork();
    final Procedure1<VirtualNetwork> _function_1 = (VirtualNetwork it_1) -> {
      it_1.setName("Single virtual Network Layout");
    };
    VirtualNetwork _doubleArrow_1 = ObjectExtensions.<VirtualNetwork>operator_doubleArrow(_createVirtualNetwork, _function_1);
    _virtualNetworks.add((this.vnetwork = _doubleArrow_1));
    this.hypNumber = 0;
    EList<Rack> _racks = this.physicalDcModel.getRacks();
    for (final Rack rack : _racks) {
      EList<AbstractNode> _nodes = rack.getNodes();
      for (final AbstractNode an : _nodes) {
        if ((an instanceof ComputeNode)) {
          EList<VirtualDisk> _volumesAndImages_1 = it.getVolumesAndImages();
          EList<StorageSpecification> _storageSpecifications = ((ComputeNode)an).getStorageSpecifications();
          StorageSpecification _last = IterableExtensions.<StorageSpecification>last(_storageSpecifications);
          VMImage _createVirtualDiskKvmHyp = this.createVirtualDiskKvmHyp(_last);
          _volumesAndImages_1.add((this.vmimageKvmHypervisor = _createVirtualDiskKvmHyp));
          EList<Hypervisor> _hypervisors = it.getHypervisors();
          Hypervisor _createHypervisor = this.lcoref.createHypervisor();
          final Procedure1<Hypervisor> _function_2 = (Hypervisor it_1) -> {
            it_1.setNode(((ComputeNode)an));
            it_1.setHypervisorType(this.hvtype_kvm);
            VirtualDisk _createVirtualDisk_1 = this.lcoref.createVirtualDisk();
            final Procedure1<VirtualDisk> _function_3 = (VirtualDisk it_2) -> {
              int _plusPlus = this.hypNumber++;
              String _plus = ("Overlay for KVM Hypervisor #" + Integer.valueOf(_plusPlus));
              it_2.setName(_plus);
              Unit<DataAmount> _GIGA = SI.<DataAmount>GIGA(NonSI.BYTE);
              Amount<DataAmount> _valueOf_1 = Amount.<DataAmount>valueOf(0.5, _GIGA);
              it_2.setCapacity(_valueOf_1);
              Unit<DataAmount> _GIGA_1 = SI.<DataAmount>GIGA(NonSI.BYTE);
              Amount<DataAmount> _valueOf_2 = Amount.<DataAmount>valueOf(0.2, _GIGA_1);
              it_2.setUsedCapacity(_valueOf_2);
              it_2.setParent(this.vmimageKvmHypervisor);
              EList<StorageSpecification> _storageSpecifications_1 = ((ComputeNode)an).getStorageSpecifications();
              StorageSpecification _last_1 = IterableExtensions.<StorageSpecification>last(_storageSpecifications_1);
              it_2.setStorageLocation(_last_1);
            };
            VirtualDisk _doubleArrow_2 = ObjectExtensions.<VirtualDisk>operator_doubleArrow(_createVirtualDisk_1, _function_3);
            it_1.setRootVolume(_doubleArrow_2);
          };
          Hypervisor _doubleArrow_2 = ObjectExtensions.<Hypervisor>operator_doubleArrow(_createHypervisor, _function_2);
          _hypervisors.add(_doubleArrow_2);
        }
      }
    }
    EList<ApplicationTemplate> _applicationTemplates = it.getApplicationTemplates();
    GreyBoxApplicationTemplate _createGreyBoxApplicationTemplate = this.laf.createGreyBoxApplicationTemplate();
    final Procedure1<GreyBoxApplicationTemplate> _function_3 = (GreyBoxApplicationTemplate it_1) -> {
      it_1.setName("Molpro DFT Template (Demonstration Purpose only)");
      GreyBoxVMImageBehaviour _createGreyBoxVMImageBehaviour = this.laf.createGreyBoxVMImageBehaviour();
      final Procedure1<GreyBoxVMImageBehaviour> _function_4 = (GreyBoxVMImageBehaviour it_2) -> {
        it_2.setVmImage(this.vmimageGBA);
        EList<MonitorableResource> _referenceResourceSpecifications = it_2.getReferenceResourceSpecifications();
        ProcessingUnitSpecification _createCpu = this.createCpu();
        _referenceResourceSpecifications.add((this.apptempCpu = _createCpu));
        EList<MonitorableResource> _referenceResourceSpecifications_1 = it_2.getReferenceResourceSpecifications();
        StorageSpecification _createStorageSsd = this.createStorageSsd();
        _referenceResourceSpecifications_1.add((this.apptempStorageSsd = _createStorageSsd));
        this.createGBWorkloadDFT(it_2, this.apptempCpu, this.apptempStorageSsd);
      };
      GreyBoxVMImageBehaviour _doubleArrow_3 = ObjectExtensions.<GreyBoxVMImageBehaviour>operator_doubleArrow(_createGreyBoxVMImageBehaviour, _function_4);
      it_1.setGreyBoxVMImageBehaviour(_doubleArrow_3);
    };
    GreyBoxApplicationTemplate _doubleArrow_3 = ObjectExtensions.<GreyBoxApplicationTemplate>operator_doubleArrow(_createGreyBoxApplicationTemplate, _function_3);
    _applicationTemplates.add(_doubleArrow_3);
    EList<ApplicationTemplate> _applicationTemplates_1 = it.getApplicationTemplates();
    GreyBoxApplicationTemplate _createGreyBoxApplicationTemplate_1 = this.laf.createGreyBoxApplicationTemplate();
    final Procedure1<GreyBoxApplicationTemplate> _function_4 = (GreyBoxApplicationTemplate it_1) -> {
      it_1.setName("Molpro CCSD Template");
      GreyBoxVMImageBehaviour _createGreyBoxVMImageBehaviour = this.laf.createGreyBoxVMImageBehaviour();
      final Procedure1<GreyBoxVMImageBehaviour> _function_5 = (GreyBoxVMImageBehaviour it_2) -> {
        it_2.setVmImage(this.vmimageGBA);
        EList<MonitorableResource> _referenceResourceSpecifications = it_2.getReferenceResourceSpecifications();
        ProcessingUnitSpecification _createCpu = this.createCpu();
        _referenceResourceSpecifications.add((this.apptempCpu = _createCpu));
        EList<MonitorableResource> _referenceResourceSpecifications_1 = it_2.getReferenceResourceSpecifications();
        StorageSpecification _createStorageSsd = this.createStorageSsd();
        _referenceResourceSpecifications_1.add((this.apptempStorageSsd = _createStorageSsd));
        this.createGBWorkload(it_2, this.apptempCpu, this.apptempStorageSsd);
      };
      GreyBoxVMImageBehaviour _doubleArrow_4 = ObjectExtensions.<GreyBoxVMImageBehaviour>operator_doubleArrow(_createGreyBoxVMImageBehaviour, _function_5);
      it_1.setGreyBoxVMImageBehaviour((this.vmimagebehaviourGba = _doubleArrow_4));
    };
    GreyBoxApplicationTemplate _doubleArrow_4 = ObjectExtensions.<GreyBoxApplicationTemplate>operator_doubleArrow(_createGreyBoxApplicationTemplate_1, _function_4);
    _applicationTemplates_1.add((this.apptempGba = _doubleArrow_4));
    int hypervisorNumber = 0;
    for (final ComputeNode an_1 : this.node) {
      {
        final int hn = hypervisorNumber;
        EList<Hypervisor> _hypervisors_1 = it.getHypervisors();
        for (final Hypervisor hyp : _hypervisors_1) {
          ComputeNode _node = hyp.getNode();
          boolean _equals = Objects.equal(_node, an_1);
          if (_equals) {
            EList<VirtualDisk> _volumesAndImages_2 = it.getVolumesAndImages();
            EList<StorageSpecification> _storageSpecifications_1 = an_1.getStorageSpecifications();
            StorageSpecification _last_1 = IterableExtensions.<StorageSpecification>last(_storageSpecifications_1);
            VMImage _createGreyBoxVMImage = this.createGreyBoxVMImage(_last_1);
            _volumesAndImages_2.add((this.vmimageGBA = _createGreyBoxVMImage));
            ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, this.numberVirtualMachinesPerPhysicalNode, true);
            for (final int i : _doubleDotLessThan) {
              {
                VirtualDisk _createVirtualDisk_1 = this.lcoref.createVirtualDisk();
                final Procedure1<VirtualDisk> _function_5 = (VirtualDisk it_1) -> {
                  it_1.setName(((("Overlay for VM #" + Integer.valueOf(hn)) + "-") + Integer.valueOf(i)));
                  Unit<DataAmount> _GIGA = SI.<DataAmount>GIGA(NonSI.BYTE);
                  Amount<DataAmount> _valueOf_1 = Amount.<DataAmount>valueOf(40.0, _GIGA);
                  it_1.setCapacity(_valueOf_1);
                  Unit<DataAmount> _GIGA_1 = SI.<DataAmount>GIGA(NonSI.BYTE);
                  Amount<DataAmount> _valueOf_2 = Amount.<DataAmount>valueOf(20.4, _GIGA_1);
                  it_1.setUsedCapacity(_valueOf_2);
                  EList<StorageSpecification> _storageSpecifications_2 = an_1.getStorageSpecifications();
                  StorageSpecification _last_2 = IterableExtensions.<StorageSpecification>last(_storageSpecifications_2);
                  it_1.setStorageLocation(_last_2);
                };
                final VirtualDisk vmImageGBAOverlay = ObjectExtensions.<VirtualDisk>operator_doubleArrow(_createVirtualDisk_1, _function_5);
                EList<VirtualDisk> _deltaOverlay = this.vmimageGBA.getDeltaOverlay();
                _deltaOverlay.add(vmImageGBAOverlay);
                EList<VirtualMachine> _virtualMachines = hyp.getVirtualMachines();
                VirtualMachine _createVirtualMachine = this.lcoref.createVirtualMachine();
                final Procedure1<VirtualMachine> _function_6 = (VirtualMachine it_1) -> {
                  it_1.setName(((("GBA VM #" + Integer.valueOf(hn)) + "-") + Integer.valueOf(i)));
                  it_1.setState(VM_State.RUNNING);
                  EList<VirtualProcessingUnit> _virtualProcessingUnits = it_1.getVirtualProcessingUnits();
                  VirtualProcessingUnit _createVirtualProcessingUnit = this.lcoref.createVirtualProcessingUnit();
                  final Procedure1<VirtualProcessingUnit> _function_7 = (VirtualProcessingUnit it_2) -> {
                    it_2.setVirtualCores(1);
                    it_2.setName("vCPU Flavour 1");
                    ArchitectureType _createOrGet = ArchitectureTypeUtil.INSTANCE.createOrGet(this.architectureRepo, ArchitectureTypeUtil.ARCHITECTURE_TYPE_x86_GENERIC_UUID);
                    it_2.setArchitectureType(_createOrGet);
                  };
                  VirtualProcessingUnit _doubleArrow_5 = ObjectExtensions.<VirtualProcessingUnit>operator_doubleArrow(_createVirtualProcessingUnit, _function_7);
                  _virtualProcessingUnits.add((this.vcpu1 = _doubleArrow_5));
                  VMImageInstance _createVMImageInstance = this.lcoref.createVMImageInstance();
                  final Procedure1<VMImageInstance> _function_8 = (VMImageInstance it_2) -> {
                    it_2.setRootDisk(vmImageGBAOverlay);
                  };
                  VMImageInstance _doubleArrow_6 = ObjectExtensions.<VMImageInstance>operator_doubleArrow(_createVMImageInstance, _function_8);
                  it_1.setVMImageInstance(_doubleArrow_6);
                  EList<VirtualMemory> _virtualMemoryUnits = it_1.getVirtualMemoryUnits();
                  VirtualMemory _createVirtualMemory = this.lcoref.createVirtualMemory();
                  final Procedure1<VirtualMemory> _function_9 = (VirtualMemory it_2) -> {
                    Unit<DataAmount> _GIGA = SI.<DataAmount>GIGA(DataAmount.UNIT);
                    Amount<DataAmount> _valueOf_1 = Amount.<DataAmount>valueOf((8 * 8), _GIGA);
                    it_2.setProvisioned(_valueOf_1);
                  };
                  VirtualMemory _doubleArrow_7 = ObjectExtensions.<VirtualMemory>operator_doubleArrow(_createVirtualMemory, _function_9);
                  _virtualMemoryUnits.add((this.vmem1 = _doubleArrow_7));
                  GreyBoxVMBehaviour _createGreyBoxVMBehaviour = this.laf.createGreyBoxVMBehaviour();
                  final Procedure1<GreyBoxVMBehaviour> _function_10 = (GreyBoxVMBehaviour it_2) -> {
                    it_2.setName(((("CCSD Behaviour #" + Integer.valueOf(hn)) + "-") + Integer.valueOf(i)));
                    EList<ProcessingUnitSpecification> _cpuSpecifications = an_1.getCpuSpecifications();
                    ProcessingUnitSpecification _last_2 = IterableExtensions.<ProcessingUnitSpecification>last(_cpuSpecifications);
                    EList<StorageSpecification> _storageSpecifications_2 = an_1.getStorageSpecifications();
                    StorageSpecification _last_3 = IterableExtensions.<StorageSpecification>last(_storageSpecifications_2);
                    this.createGBWorkload(it_2, _last_2, _last_3);
                    it_2.setVmImageBehaviour(this.vmimagebehaviourGba);
                  };
                  GreyBoxVMBehaviour _doubleArrow_8 = ObjectExtensions.<GreyBoxVMBehaviour>operator_doubleArrow(_createGreyBoxVMBehaviour, _function_10);
                  it_1.setRuntimeApplicationModel(_doubleArrow_8);
                };
                VirtualMachine _doubleArrow_5 = ObjectExtensions.<VirtualMachine>operator_doubleArrow(_createVirtualMachine, _function_6);
                _virtualMachines.add((this.vmCurrent = _doubleArrow_5));
                EList<ApplicationInstance> _applicationInstances = it.getApplicationInstances();
                GreyBoxApplicationInstance _createGreyBoxApplicationInstance = this.laf.createGreyBoxApplicationInstance();
                final Procedure1<GreyBoxApplicationInstance> _function_7 = (GreyBoxApplicationInstance it_1) -> {
                  it_1.setApplicationTemplate(this.apptempGba);
                  it_1.setVirtualMachine(this.vmCurrent);
                };
                GreyBoxApplicationInstance _doubleArrow_6 = ObjectExtensions.<GreyBoxApplicationInstance>operator_doubleArrow(_createGreyBoxApplicationInstance, _function_7);
                _applicationInstances.add(_doubleArrow_6);
              }
            }
          }
        }
        hypervisorNumber++;
      }
    }
    EList<VirtualNetworkInterconnect> _virtualNetworkInterconnects = it.getVirtualNetworkInterconnects();
    VirtualNetworkInterconnect _createVirtualNetworkInterconnect = this.lcoref.createVirtualNetworkInterconnect();
    final Procedure1<VirtualNetworkInterconnect> _function_5 = (VirtualNetworkInterconnect it_1) -> {
      it_1.setName("Single vNIC Layout");
      EList<ConnectedVirtualEntity> _connectedVirtualEntity = it_1.getConnectedVirtualEntity();
      _connectedVirtualEntity.add(this.vnetwork);
    };
    VirtualNetworkInterconnect _doubleArrow_5 = ObjectExtensions.<VirtualNetworkInterconnect>operator_doubleArrow(_createVirtualNetworkInterconnect, _function_5);
    _virtualNetworkInterconnects.add((this.vnic1 = _doubleArrow_5));
    EList<Hypervisor> _hypervisors_1 = it.getHypervisors();
    for (final Hypervisor hyp : _hypervisors_1) {
      EList<VirtualMachine> _virtualMachines = hyp.getVirtualMachines();
      for (final VirtualMachine vm : _virtualMachines) {
        EList<ConnectedVirtualEntity> _connectedVirtualEntity = this.vnic1.getConnectedVirtualEntity();
        _connectedVirtualEntity.add(vm);
      }
    }
  }));
}
