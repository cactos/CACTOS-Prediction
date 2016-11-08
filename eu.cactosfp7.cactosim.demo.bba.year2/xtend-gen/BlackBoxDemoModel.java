import eu.cactosfp7.infrastructuremodels.logicaldc.application.ApplicationFactory;
import eu.cactosfp7.infrastructuremodels.logicaldc.core.LogicalDCModel;
import eu.cactosfp7.infrastructuremodels.logicaldc.core.VMImage;
import eu.cactosfp7.infrastructuremodels.logicaldc.core.VirtualMemory;
import eu.cactosfp7.infrastructuremodels.logicaldc.core.VirtualNetwork;
import eu.cactosfp7.infrastructuremodels.logicaldc.core.VirtualNetworkInterconnect;
import eu.cactosfp7.infrastructuremodels.logicaldc.core.VirtualProcessingUnit;
import eu.cactosfp7.infrastructuremodels.logicaldc.core.Volume;
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
import javax.measure.unit.NonSI;
import javax.measure.unit.SI;
import javax.measure.unit.Unit;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.DoubleExtensions;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.jscience.physics.amount.Amount;
import tools.descartes.dlim.DlimFactory;

@SuppressWarnings("all")
public class BlackBoxDemoModel {
  /**
   * Specifies the number of (identical) physical nodes with VMs on it that are created for the demo case.
   */
  private int numberPhysicalNodes = 6;
  
  /**
   * Specifies the number of (identical) physical nodes without VMs on it that are created for the demo case and are initially shut down.
   */
  private int numberUnusedPhysicalNodes = 10;
  
  /**
   * Specifies the number of (identical) virtual machines that are created for each physical node.
   */
  private int numberVirtualMachinesPerPhysicalNode = 16;
  
  private Double totalDuration = Double.valueOf(3600.0);
  
  private Double startValue = Double.valueOf(Amount.<Frequency>valueOf((((2.6 * 16) * 0.5) / this.numberVirtualMachinesPerPhysicalNode), SI.<Frequency>GIGA(SI.HERTZ)).doubleValue(SI.<Frequency>MEGA(SI.HERTZ)));
  
  private Double startDuration = Double.valueOf(400.0);
  
  private Double middleValue = Double.valueOf(Amount.<Frequency>valueOf((((2.6 * 16) * 1.05) / this.numberVirtualMachinesPerPhysicalNode), SI.<Frequency>GIGA(SI.HERTZ)).doubleValue(SI.<Frequency>MEGA(SI.HERTZ)));
  
  private Double middleDuration = Double.valueOf(1000.0);
  
  private Double endValue = Double.valueOf(Amount.<Frequency>valueOf((((2.6 * 16) * 0.3) / this.numberVirtualMachinesPerPhysicalNode), SI.<Frequency>GIGA(SI.HERTZ)).doubleValue(SI.<Frequency>MEGA(SI.HERTZ)));
  
  private Double endDuration = Double.valueOf((DoubleExtensions.operator_minus(this.totalDuration, this.startDuration) - (this.middleDuration).doubleValue()));
  
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
  
  /**
   * Descartes Load Intensity Model Factory
   */
  private DlimFactory df = DlimFactory.eINSTANCE;
  
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
  
  private Volume volume1;
  
  private VMImage vmimageMolpro;
  
  private VMImage vmimageBBA;
  
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
          ProcessingUnitSpecification _createProcessingUnitSpecification = this.pcoref.createProcessingUnitSpecification();
          final Procedure1<ProcessingUnitSpecification> _function_6 = (ProcessingUnitSpecification it_2) -> {
            it_2.setName("CPU Intel x86_64 Rev. D");
            Unit<Frequency> _GIGA = SI.<Frequency>GIGA(SI.HERTZ);
            Amount<Frequency> _valueOf = Amount.<Frequency>valueOf(2.6, _GIGA);
            it_2.setFrequency(_valueOf);
            it_2.setNumberOfCores(16);
            it_2.setSupportsTurboMode(Boolean.valueOf(false));
            ArchitectureType _createOrGet = ArchitectureTypeUtil.INSTANCE.createOrGet(this.architectureRepo, ArchitectureTypeUtil.ARCHITECTURE_TYPE_x86_GENERIC_UUID);
            it_2.setArchitectureType(_createOrGet);
            it_2.setPowerModelBinding(this.pmb);
          };
          ProcessingUnitSpecification _doubleArrow_5 = ObjectExtensions.<ProcessingUnitSpecification>operator_doubleArrow(_createProcessingUnitSpecification, _function_6);
          _cpuSpecifications.add((this.cpu1 = _doubleArrow_5));
          EList<StorageSpecification> _storageSpecifications = it_1.getStorageSpecifications();
          StorageSpecification _createStorageSpecification = this.pcoref.createStorageSpecification();
          final Procedure1<StorageSpecification> _function_7 = (StorageSpecification it_2) -> {
            it_2.setName("Local HDD");
            Unit<DataAmount> _TERA = SI.<DataAmount>TERA(NonSI.BYTE);
            Amount<DataAmount> _valueOf = Amount.<DataAmount>valueOf(1, _TERA);
            it_2.setSize(_valueOf);
            Amount<Duration> _valueOf_1 = Amount.<Duration>valueOf(0, SI.SECOND);
            it_2.setReadDelay(_valueOf_1);
            Bandwidth _createBandwidth = this.puf.createBandwidth();
            final Procedure1<Bandwidth> _function_8 = (Bandwidth it_3) -> {
              Unit<DataRate> _MEGA = SI.<DataRate>MEGA(DataRate.UNIT);
              Amount<DataRate> _valueOf_2 = Amount.<DataRate>valueOf((35 * 8), _MEGA);
              it_3.setValue(_valueOf_2);
            };
            Bandwidth _doubleArrow_6 = ObjectExtensions.<Bandwidth>operator_doubleArrow(_createBandwidth, _function_8);
            it_2.setReadBandwidth(_doubleArrow_6);
            Amount<Duration> _valueOf_2 = Amount.<Duration>valueOf(0, SI.SECOND);
            it_2.setWriteDelay(_valueOf_2);
            Bandwidth _createBandwidth_1 = this.puf.createBandwidth();
            final Procedure1<Bandwidth> _function_9 = (Bandwidth it_3) -> {
              Unit<DataRate> _MEGA = SI.<DataRate>MEGA(DataRate.UNIT);
              Amount<DataRate> _valueOf_3 = Amount.<DataRate>valueOf((35 * 8), _MEGA);
              it_3.setValue(_valueOf_3);
            };
            Bandwidth _doubleArrow_7 = ObjectExtensions.<Bandwidth>operator_doubleArrow(_createBandwidth_1, _function_9);
            it_2.setWriteBandwidth(_doubleArrow_7);
          };
          StorageSpecification _doubleArrow_6 = ObjectExtensions.<StorageSpecification>operator_doubleArrow(_createStorageSpecification, _function_7);
          _storageSpecifications.add((this.storage1 = _doubleArrow_6));
          EList<MemorySpecification> _memorySpecifications = it_1.getMemorySpecifications();
          MemorySpecification _createMemorySpecification = this.pcoref.createMemorySpecification();
          final Procedure1<MemorySpecification> _function_8 = (MemorySpecification it_2) -> {
            it_2.setName("DDR-RAM");
            Unit<DataAmount> _GIGA = SI.<DataAmount>GIGA(NonSI.BYTE);
            Amount<DataAmount> _valueOf = Amount.<DataAmount>valueOf(128, _GIGA);
            it_2.setSize(_valueOf);
            Bandwidth _createBandwidth = this.puf.createBandwidth();
            final Procedure1<Bandwidth> _function_9 = (Bandwidth it_3) -> {
              Unit<DataRate> _GIGA_1 = SI.<DataRate>GIGA(DataRate.UNIT);
              Amount<DataRate> _valueOf_1 = Amount.<DataRate>valueOf((17.54 * 8), _GIGA_1);
              it_3.setValue(_valueOf_1);
            };
            Bandwidth _doubleArrow_7 = ObjectExtensions.<Bandwidth>operator_doubleArrow(_createBandwidth, _function_9);
            it_2.setBandwidthRead(_doubleArrow_7);
            Bandwidth _createBandwidth_1 = this.puf.createBandwidth();
            final Procedure1<Bandwidth> _function_10 = (Bandwidth it_3) -> {
              Unit<DataRate> _GIGA_1 = SI.<DataRate>GIGA(DataRate.UNIT);
              Amount<DataRate> _valueOf_1 = Amount.<DataRate>valueOf((17.54 * 8), _GIGA_1);
              it_3.setValue(_valueOf_1);
            };
            Bandwidth _doubleArrow_8 = ObjectExtensions.<Bandwidth>operator_doubleArrow(_createBandwidth_1, _function_10);
            it_2.setBandwidthWrite(_doubleArrow_8);
          };
          MemorySpecification _doubleArrow_7 = ObjectExtensions.<MemorySpecification>operator_doubleArrow(_createMemorySpecification, _function_8);
          _memorySpecifications.add((this.mem1 = _doubleArrow_7));
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
    EList<NetworkInterconnect> _networkInterconnects = it.getNetworkInterconnects();
    NetworkInterconnect _createNetworkInterconnect = this.pcoref.createNetworkInterconnect();
    final Procedure1<NetworkInterconnect> _function_5 = (NetworkInterconnect it_1) -> {
      it_1.setName("Single NIC Layout");
      EList<AbstractNode> _nodes = this.rack1.getNodes();
      for (final AbstractNode an : _nodes) {
        EList<ConnectedEntity> _connectedEntities = it_1.getConnectedEntities();
        _connectedEntities.add(an);
      }
      Bandwidth _createBandwidth = this.putilf.createBandwidth();
      final Procedure1<Bandwidth> _function_6 = (Bandwidth it_2) -> {
        Unit<DataRate> _GIGA = SI.<DataRate>GIGA(DataRate.UNIT);
        Amount<DataRate> _valueOf = Amount.<DataRate>valueOf(1.0, _GIGA);
        it_2.setValue(_valueOf);
      };
      Bandwidth _doubleArrow_5 = ObjectExtensions.<Bandwidth>operator_doubleArrow(_createBandwidth, _function_6);
      it_1.setBandwidth(_doubleArrow_5);
    };
    NetworkInterconnect _doubleArrow_5 = ObjectExtensions.<NetworkInterconnect>operator_doubleArrow(_createNetworkInterconnect, _function_5);
    _networkInterconnects.add((this.nic1 = _doubleArrow_5));
    EList<Switch> _switches = it.getSwitches();
    Switch _createSwitch = this.pcoref.createSwitch();
    final Procedure1<Switch> _function_6 = (Switch it_1) -> {
      it_1.setName("Single Switch Layout");
    };
    Switch _doubleArrow_6 = ObjectExtensions.<Switch>operator_doubleArrow(_createSwitch, _function_6);
    _switches.add((this.switch1 = _doubleArrow_6));
    EList<ConnectedEntity> _connectedEntities = this.nic1.getConnectedEntities();
    _connectedEntities.add(this.switch1);
    EList<Cluster> _clusters = it.getClusters();
    Cluster _createCluster = this.pcoref.createCluster();
    final Procedure1<Cluster> _function_7 = (Cluster it_1) -> {
      it_1.setName("Single Cluster Layout");
      it_1.setClusterId(1);
      EList<AbstractNode> _nodes = this.rack1.getNodes();
      for (final AbstractNode an : _nodes) {
        EList<AbstractNode> _containedNodes = it_1.getContainedNodes();
        _containedNodes.add(an);
      }
    };
    Cluster _doubleArrow_7 = ObjectExtensions.<Cluster>operator_doubleArrow(_createCluster, _function_7);
    _clusters.add(_doubleArrow_7);
  }));
  
  public final LogicalDCModel logicalDcModel /* Skipped initializer because of errors */;
}
