import com.google.common.base.Objects;
import eu.cactosfp7.cactosim.experimentscenario.AbsoluteTimeEvent;
import eu.cactosfp7.cactosim.experimentscenario.ExperimentScenarioTimeLine;
import eu.cactosfp7.cactosim.experimentscenario.ExperimentscenarioFactory;
import eu.cactosfp7.cactosim.experimentscenario.TimeLineEvent;
import eu.cactosfp7.cactosim.experimentscenario.request.ExperimentScenarioRequest;
import eu.cactosfp7.cactosim.experimentscenario.request.MigrateApplicationRequest;
import eu.cactosfp7.cactosim.experimentscenario.request.RequestFactory;
import eu.cactosfp7.cactosim.experimentscenario.request.SetPhysicalNodeStateRequest;
import eu.cactosfp7.cactosim.experimentscenario.request.StartApplicationRequest;
import eu.cactosfp7.cactosim.experimentscenario.selector.PreviouslyStartedBlackBoxApplicationSelector;
import eu.cactosfp7.cactosim.experimentscenario.selector.SelectorFactory;
import eu.cactosfp7.infrastructuremodels.logicaldc.application.ApplicationFactory;
import eu.cactosfp7.infrastructuremodels.logicaldc.application.ApplicationInstance;
import eu.cactosfp7.infrastructuremodels.logicaldc.application.ApplicationTemplate;
import eu.cactosfp7.infrastructuremodels.logicaldc.application.BlackBoxApplicationInstance;
import eu.cactosfp7.infrastructuremodels.logicaldc.application.BlackBoxApplicationTemplate;
import eu.cactosfp7.infrastructuremodels.logicaldc.application.BlackBoxVMBehaviour;
import eu.cactosfp7.infrastructuremodels.logicaldc.application.BlackBoxVMImageBehaviour;
import eu.cactosfp7.infrastructuremodels.logicaldc.application.BlackBoxWorkload;
import eu.cactosfp7.infrastructuremodels.logicaldc.core.ConnectedVirtualEntity;
import eu.cactosfp7.infrastructuremodels.logicaldc.core.Flavour;
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
import org.eclipse.xtext.xbase.lib.DoubleExtensions;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.jscience.physics.amount.Amount;
import tools.descartes.dlim.Combinator;
import tools.descartes.dlim.Constant;
import tools.descartes.dlim.DlimFactory;
import tools.descartes.dlim.LinearTrend;
import tools.descartes.dlim.NormalNoise;
import tools.descartes.dlim.Operator;
import tools.descartes.dlim.Sequence;
import tools.descartes.dlim.TimeDependentFunctionContainer;

/**
 * Creates a Black-Box Demonstration Model.
 * There are only Black-Box applications in the model.
 * Storage access of VMs is remote.
 */
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
  
  /**
   * Experiment Scenario Factory
   */
  private ExperimentscenarioFactory esf = ExperimentscenarioFactory.eINSTANCE;
  
  /**
   * Request Factory for experiment Scenario
   */
  private RequestFactory rf = RequestFactory.eINSTANCE;
  
  /**
   * Application Instance Selector Factory for experiment Scenario
   */
  private SelectorFactory sf = SelectorFactory.eINSTANCE;
  
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
  
  private Flavour flavour1;
  
  private NetworkInterconnect nic1;
  
  private VMImage vmimageKvmHypervisor;
  
  private VMImage vmimageBBA;
  
  private ProcessingUnitSpecification bbaRefCpu;
  
  private BlackBoxApplicationTemplate bbappt;
  
  private BlackBoxVMImageBehaviour vmimagebehaviourBba;
  
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
  
  public BlackBoxWorkload createBBWorkload(final MonitorableResource onCPU) {
    BlackBoxWorkload _createBlackBoxWorkload = this.laf.createBlackBoxWorkload();
    final Procedure1<BlackBoxWorkload> _function = (BlackBoxWorkload it) -> {
      it.setOnResource(onCPU);
      it.setName("Black Box Workload for vCPU");
      Unit<? extends Quantity> _divide = NonSI.BYTE.divide(SI.SECOND);
      it.setResourceDemandUnit(_divide);
      Sequence _createSequence = this.df.createSequence();
      final Procedure1<Sequence> _function_1 = (Sequence it_1) -> {
        it_1.setTerminateAfterLoops((-1));
        it_1.setTerminateAfterTime((this.totalDuration).doubleValue());
        EList<TimeDependentFunctionContainer> _sequenceFunctionContainers = it_1.getSequenceFunctionContainers();
        TimeDependentFunctionContainer _createTimeDependentFunctionContainer = this.df.createTimeDependentFunctionContainer();
        final Procedure1<TimeDependentFunctionContainer> _function_2 = (TimeDependentFunctionContainer it_2) -> {
          it_2.setDuration((this.startDuration).doubleValue());
          Constant _createConstant = this.df.createConstant();
          final Procedure1<Constant> _function_3 = (Constant it_3) -> {
            it_3.setConstant((this.startValue).doubleValue());
          };
          Constant _doubleArrow = ObjectExtensions.<Constant>operator_doubleArrow(_createConstant, _function_3);
          it_2.setFunction(_doubleArrow);
        };
        TimeDependentFunctionContainer _doubleArrow = ObjectExtensions.<TimeDependentFunctionContainer>operator_doubleArrow(_createTimeDependentFunctionContainer, _function_2);
        _sequenceFunctionContainers.add(_doubleArrow);
        EList<TimeDependentFunctionContainer> _sequenceFunctionContainers_1 = it_1.getSequenceFunctionContainers();
        TimeDependentFunctionContainer _createTimeDependentFunctionContainer_1 = this.df.createTimeDependentFunctionContainer();
        final Procedure1<TimeDependentFunctionContainer> _function_3 = (TimeDependentFunctionContainer it_2) -> {
          it_2.setDuration((this.middleDuration).doubleValue());
          LinearTrend _createLinearTrend = this.df.createLinearTrend();
          final Procedure1<LinearTrend> _function_4 = (LinearTrend it_3) -> {
            it_3.setFunctionOutputAtStart((this.startValue).doubleValue());
            it_3.setFunctionOutputAtEnd((this.middleValue).doubleValue());
          };
          LinearTrend _doubleArrow_1 = ObjectExtensions.<LinearTrend>operator_doubleArrow(_createLinearTrend, _function_4);
          it_2.setFunction(_doubleArrow_1);
        };
        TimeDependentFunctionContainer _doubleArrow_1 = ObjectExtensions.<TimeDependentFunctionContainer>operator_doubleArrow(_createTimeDependentFunctionContainer_1, _function_3);
        _sequenceFunctionContainers_1.add(_doubleArrow_1);
        EList<TimeDependentFunctionContainer> _sequenceFunctionContainers_2 = it_1.getSequenceFunctionContainers();
        TimeDependentFunctionContainer _createTimeDependentFunctionContainer_2 = this.df.createTimeDependentFunctionContainer();
        final Procedure1<TimeDependentFunctionContainer> _function_4 = (TimeDependentFunctionContainer it_2) -> {
          it_2.setDuration((this.endDuration).doubleValue());
          Constant _createConstant = this.df.createConstant();
          final Procedure1<Constant> _function_5 = (Constant it_3) -> {
            it_3.setConstant((this.endValue).doubleValue());
          };
          Constant _doubleArrow_2 = ObjectExtensions.<Constant>operator_doubleArrow(_createConstant, _function_5);
          it_2.setFunction(_doubleArrow_2);
        };
        TimeDependentFunctionContainer _doubleArrow_2 = ObjectExtensions.<TimeDependentFunctionContainer>operator_doubleArrow(_createTimeDependentFunctionContainer_2, _function_4);
        _sequenceFunctionContainers_2.add(_doubleArrow_2);
        EList<Combinator> _combine = it_1.getCombine();
        Combinator _createCombinator = this.df.createCombinator();
        final Procedure1<Combinator> _function_5 = (Combinator it_2) -> {
          it_2.setOperator(Operator.ADD);
          NormalNoise _createNormalNoise = this.df.createNormalNoise();
          final Procedure1<NormalNoise> _function_6 = (NormalNoise it_3) -> {
            it_3.setMean(0);
            it_3.setStandardDeviation(40);
          };
          NormalNoise _doubleArrow_3 = ObjectExtensions.<NormalNoise>operator_doubleArrow(_createNormalNoise, _function_6);
          it_2.setFunction(_doubleArrow_3);
        };
        Combinator _doubleArrow_3 = ObjectExtensions.<Combinator>operator_doubleArrow(_createCombinator, _function_5);
        _combine.add(_doubleArrow_3);
      };
      Sequence _doubleArrow = ObjectExtensions.<Sequence>operator_doubleArrow(_createSequence, _function_1);
      it.setResourceDemandRates(_doubleArrow);
    };
    return ObjectExtensions.<BlackBoxWorkload>operator_doubleArrow(_createBlackBoxWorkload, _function);
  }
  
  public ProcessingUnitSpecification createCpu() {
    ProcessingUnitSpecification _createProcessingUnitSpecification = this.pcoref.createProcessingUnitSpecification();
    final Procedure1<ProcessingUnitSpecification> _function = (ProcessingUnitSpecification it) -> {
      it.setName("CPU Intel x86_64 Rev. D");
      Unit<Frequency> _GIGA = SI.<Frequency>GIGA(SI.HERTZ);
      Amount<Frequency> _valueOf = Amount.<Frequency>valueOf(2.6, _GIGA);
      it.setFrequency(_valueOf);
      it.setNumberOfCores(16);
      it.setSupportsTurboMode(Boolean.valueOf(false));
      ArchitectureType _createOrGet = ArchitectureTypeUtil.INSTANCE.createOrGet(this.architectureRepo, ArchitectureTypeUtil.ARCHITECTURE_TYPE_x86_GENERIC_UUID);
      it.setArchitectureType(_createOrGet);
      it.setPowerModelBinding(this.pmb);
    };
    return ObjectExtensions.<ProcessingUnitSpecification>operator_doubleArrow(_createProcessingUnitSpecification, _function);
  }
  
  public VMImage createBlackBoxVMImage(final StorageSpecification storage) {
    VMImage _createVMImage = this.lcoref.createVMImage();
    final Procedure1<VMImage> _function = (VMImage it) -> {
      it.setName("Black-Box VM Image");
      Unit<DataAmount> _GIGA = SI.<DataAmount>GIGA(NonSI.BYTE);
      Amount<DataAmount> _valueOf = Amount.<DataAmount>valueOf(2.0, _GIGA);
      it.setCapacity(_valueOf);
      Unit<DataAmount> _GIGA_1 = SI.<DataAmount>GIGA(NonSI.BYTE);
      Amount<DataAmount> _valueOf_1 = Amount.<DataAmount>valueOf(1.2, _GIGA_1);
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
          EList<StorageSpecification> _storageSpecifications = it_1.getStorageSpecifications();
          StorageSpecification _createStorageSpecification = this.pcoref.createStorageSpecification();
          final Procedure1<StorageSpecification> _function_6 = (StorageSpecification it_2) -> {
            it_2.setName(("Local HDD #" + Integer.valueOf(i)));
            Unit<DataAmount> _TERA = SI.<DataAmount>TERA(NonSI.BYTE);
            Amount<DataAmount> _valueOf = Amount.<DataAmount>valueOf(1, _TERA);
            it_2.setSize(_valueOf);
            Amount<Duration> _valueOf_1 = Amount.<Duration>valueOf(0, SI.SECOND);
            it_2.setReadDelay(_valueOf_1);
            Bandwidth _createBandwidth = this.puf.createBandwidth();
            final Procedure1<Bandwidth> _function_7 = (Bandwidth it_3) -> {
              Unit<DataRate> _MEGA = SI.<DataRate>MEGA(DataRate.UNIT);
              Amount<DataRate> _valueOf_2 = Amount.<DataRate>valueOf((35 * 8), _MEGA);
              it_3.setValue(_valueOf_2);
            };
            Bandwidth _doubleArrow_5 = ObjectExtensions.<Bandwidth>operator_doubleArrow(_createBandwidth, _function_7);
            it_2.setReadBandwidth(_doubleArrow_5);
            Amount<Duration> _valueOf_2 = Amount.<Duration>valueOf(0, SI.SECOND);
            it_2.setWriteDelay(_valueOf_2);
            Bandwidth _createBandwidth_1 = this.puf.createBandwidth();
            final Procedure1<Bandwidth> _function_8 = (Bandwidth it_3) -> {
              Unit<DataRate> _MEGA = SI.<DataRate>MEGA(DataRate.UNIT);
              Amount<DataRate> _valueOf_3 = Amount.<DataRate>valueOf((35 * 8), _MEGA);
              it_3.setValue(_valueOf_3);
            };
            Bandwidth _doubleArrow_6 = ObjectExtensions.<Bandwidth>operator_doubleArrow(_createBandwidth_1, _function_8);
            it_2.setWriteBandwidth(_doubleArrow_6);
          };
          StorageSpecification _doubleArrow_5 = ObjectExtensions.<StorageSpecification>operator_doubleArrow(_createStorageSpecification, _function_6);
          _storageSpecifications.add((this.storage1 = _doubleArrow_5));
          EList<MemorySpecification> _memorySpecifications = it_1.getMemorySpecifications();
          MemorySpecification _createMemorySpecification = this.pcoref.createMemorySpecification();
          final Procedure1<MemorySpecification> _function_7 = (MemorySpecification it_2) -> {
            it_2.setName("DDR-RAM");
            Unit<DataAmount> _GIGA = SI.<DataAmount>GIGA(NonSI.BYTE);
            Amount<DataAmount> _valueOf = Amount.<DataAmount>valueOf(128, _GIGA);
            it_2.setSize(_valueOf);
            Bandwidth _createBandwidth = this.puf.createBandwidth();
            final Procedure1<Bandwidth> _function_8 = (Bandwidth it_3) -> {
              Unit<DataRate> _GIGA_1 = SI.<DataRate>GIGA(DataRate.UNIT);
              Amount<DataRate> _valueOf_1 = Amount.<DataRate>valueOf((17.54 * 8), _GIGA_1);
              it_3.setValue(_valueOf_1);
            };
            Bandwidth _doubleArrow_6 = ObjectExtensions.<Bandwidth>operator_doubleArrow(_createBandwidth, _function_8);
            it_2.setBandwidthRead(_doubleArrow_6);
            Bandwidth _createBandwidth_1 = this.puf.createBandwidth();
            final Procedure1<Bandwidth> _function_9 = (Bandwidth it_3) -> {
              Unit<DataRate> _GIGA_1 = SI.<DataRate>GIGA(DataRate.UNIT);
              Amount<DataRate> _valueOf_1 = Amount.<DataRate>valueOf((17.54 * 8), _GIGA_1);
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
      it_1.setName("Virtual Disk storing VMImages, e.g. Black-Box Application Image(s).");
      Unit<DataAmount> _TERA = SI.<DataAmount>TERA(NonSI.BYTE);
      Amount<DataAmount> _valueOf_1 = Amount.<DataAmount>valueOf(5.0, _TERA);
      it_1.setCapacity(_valueOf_1);
      it_1.setStorageLocation(this.storage1);
      EList<VirtualDisk> _deltaOverlay = it_1.getDeltaOverlay();
      VMImage _createBlackBoxVMImage = this.createBlackBoxVMImage(this.storage1);
      _deltaOverlay.add((this.vmimageBBA = _createBlackBoxVMImage));
      EList<VirtualDisk> _deltaOverlay_1 = it_1.getDeltaOverlay();
      VMImage _createVMImage = this.lcoref.createVMImage();
      final Procedure1<VMImage> _function_1 = (VMImage it_2) -> {
        it_2.setName("KvmHypervisor");
        Unit<DataAmount> _TERA_1 = SI.<DataAmount>TERA(NonSI.BYTE);
        Amount<DataAmount> _valueOf_2 = Amount.<DataAmount>valueOf(4.0, _TERA_1);
        it_2.setCapacity(_valueOf_2);
        Unit<DataAmount> _GIGA = SI.<DataAmount>GIGA(NonSI.BYTE);
        Amount<DataAmount> _valueOf_3 = Amount.<DataAmount>valueOf(3.0, _GIGA);
        it_2.setUsedCapacity(_valueOf_3);
        it_2.setStorageLocation(this.storage1);
      };
      VMImage _doubleArrow = ObjectExtensions.<VMImage>operator_doubleArrow(_createVMImage, _function_1);
      _deltaOverlay_1.add((this.vmimageKvmHypervisor = _doubleArrow));
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
              StorageSpecification _storageLocation = this.vmimageKvmHypervisor.getStorageLocation();
              it_2.setStorageLocation(_storageLocation);
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
    BlackBoxApplicationTemplate _createBlackBoxApplicationTemplate = this.laf.createBlackBoxApplicationTemplate();
    final Procedure1<BlackBoxApplicationTemplate> _function_3 = (BlackBoxApplicationTemplate it_1) -> {
      it_1.setName("Black-Box Application Model Demo (non-repeating)");
      BlackBoxVMImageBehaviour _createBlackBoxVMImageBehaviour = this.laf.createBlackBoxVMImageBehaviour();
      final Procedure1<BlackBoxVMImageBehaviour> _function_4 = (BlackBoxVMImageBehaviour it_2) -> {
        it_2.setVmImage(this.vmimageBBA);
        EList<MonitorableResource> _referenceResourceSpecifications = it_2.getReferenceResourceSpecifications();
        ProcessingUnitSpecification _createCpu = this.createCpu();
        _referenceResourceSpecifications.add((this.bbaRefCpu = _createCpu));
        it_2.setPatternIsRepeating(false);
        EList<BlackBoxWorkload> _blackBoxWorkloads = it_2.getBlackBoxWorkloads();
        BlackBoxWorkload _createBBWorkload = this.createBBWorkload(this.bbaRefCpu);
        _blackBoxWorkloads.add(_createBBWorkload);
      };
      BlackBoxVMImageBehaviour _doubleArrow_3 = ObjectExtensions.<BlackBoxVMImageBehaviour>operator_doubleArrow(_createBlackBoxVMImageBehaviour, _function_4);
      it_1.setBlackBoxVMImageBehaviour((this.vmimagebehaviourBba = _doubleArrow_3));
    };
    BlackBoxApplicationTemplate _doubleArrow_3 = ObjectExtensions.<BlackBoxApplicationTemplate>operator_doubleArrow(_createBlackBoxApplicationTemplate, _function_3);
    _applicationTemplates.add((this.bbappt = _doubleArrow_3));
    EList<Flavour> _flavours = it.getFlavours();
    Flavour _createFlavour = this.lcoref.createFlavour();
    final Procedure1<Flavour> _function_4 = (Flavour it_1) -> {
      it_1.setName("GenericX86Small");
      ArchitectureType _createOrGet = ArchitectureTypeUtil.INSTANCE.createOrGet(this.architectureRepo, ArchitectureTypeUtil.ARCHITECTURE_TYPE_x86_GENERIC_UUID);
      it_1.setArchitectureType(_createOrGet);
      it_1.setNumberVirtualCores(1);
      Unit<DataAmount> _GIGA = SI.<DataAmount>GIGA(DataAmount.UNIT);
      Amount<DataAmount> _valueOf_1 = Amount.<DataAmount>valueOf((8 * 8), _GIGA);
      it_1.setSizeRam(_valueOf_1);
      Unit<DataAmount> _GIGA_1 = SI.<DataAmount>GIGA(NonSI.BYTE);
      Amount<DataAmount> _valueOf_2 = Amount.<DataAmount>valueOf(20.0, _GIGA_1);
      it_1.setSizeStorage(_valueOf_2);
    };
    Flavour _doubleArrow_4 = ObjectExtensions.<Flavour>operator_doubleArrow(_createFlavour, _function_4);
    _flavours.add((this.flavour1 = _doubleArrow_4));
    int hypervisorNumber = 0;
    for (final ComputeNode an_1 : this.node) {
      {
        final int hn = hypervisorNumber;
        EList<Hypervisor> _hypervisors_1 = it.getHypervisors();
        for (final Hypervisor hyp : _hypervisors_1) {
          ComputeNode _node = hyp.getNode();
          boolean _equals = Objects.equal(_node, an_1);
          if (_equals) {
            ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, this.numberVirtualMachinesPerPhysicalNode, true);
            for (final int i : _doubleDotLessThan) {
              {
                VirtualDisk _createVirtualDisk_1 = this.lcoref.createVirtualDisk();
                final Procedure1<VirtualDisk> _function_5 = (VirtualDisk it_1) -> {
                  it_1.setName(((("Overlay for VM #" + Integer.valueOf(hn)) + "-") + Integer.valueOf(i)));
                  Amount<DataAmount> _sizeStorage = this.flavour1.getSizeStorage();
                  it_1.setCapacity(_sizeStorage);
                  Unit<DataAmount> _GIGA = SI.<DataAmount>GIGA(NonSI.BYTE);
                  Amount<DataAmount> _valueOf_1 = Amount.<DataAmount>valueOf(0.02, _GIGA);
                  it_1.setUsedCapacity(_valueOf_1);
                  it_1.setStorageLocation(this.storage1);
                };
                final VirtualDisk vmImageBBAOverlay = ObjectExtensions.<VirtualDisk>operator_doubleArrow(_createVirtualDisk_1, _function_5);
                EList<VirtualDisk> _deltaOverlay = this.vmimageBBA.getDeltaOverlay();
                _deltaOverlay.add(vmImageBBAOverlay);
                EList<VirtualMachine> _virtualMachines = hyp.getVirtualMachines();
                VirtualMachine _createVirtualMachine = this.lcoref.createVirtualMachine();
                final Procedure1<VirtualMachine> _function_6 = (VirtualMachine it_1) -> {
                  it_1.setName(((("BBA VM #" + Integer.valueOf(hn)) + "-") + Integer.valueOf(i)));
                  it_1.setState(VM_State.RUNNING);
                  EList<VirtualProcessingUnit> _virtualProcessingUnits = it_1.getVirtualProcessingUnits();
                  VirtualProcessingUnit _createVirtualProcessingUnit = this.lcoref.createVirtualProcessingUnit();
                  final Procedure1<VirtualProcessingUnit> _function_7 = (VirtualProcessingUnit it_2) -> {
                    int _numberVirtualCores = this.flavour1.getNumberVirtualCores();
                    it_2.setVirtualCores(_numberVirtualCores);
                    String _name = this.flavour1.getName();
                    String _plus = ("vCPU " + _name);
                    it_2.setName(_plus);
                    ArchitectureType _architectureType = this.flavour1.getArchitectureType();
                    it_2.setArchitectureType(_architectureType);
                  };
                  VirtualProcessingUnit _doubleArrow_5 = ObjectExtensions.<VirtualProcessingUnit>operator_doubleArrow(_createVirtualProcessingUnit, _function_7);
                  _virtualProcessingUnits.add((this.vcpu1 = _doubleArrow_5));
                  VMImageInstance _createVMImageInstance = this.lcoref.createVMImageInstance();
                  final Procedure1<VMImageInstance> _function_8 = (VMImageInstance it_2) -> {
                    it_2.setRootDisk(vmImageBBAOverlay);
                  };
                  VMImageInstance _doubleArrow_6 = ObjectExtensions.<VMImageInstance>operator_doubleArrow(_createVMImageInstance, _function_8);
                  it_1.setVMImageInstance(_doubleArrow_6);
                  EList<VirtualMemory> _virtualMemoryUnits = it_1.getVirtualMemoryUnits();
                  VirtualMemory _createVirtualMemory = this.lcoref.createVirtualMemory();
                  final Procedure1<VirtualMemory> _function_9 = (VirtualMemory it_2) -> {
                    Amount<DataAmount> _sizeRam = this.flavour1.getSizeRam();
                    it_2.setProvisioned(_sizeRam);
                  };
                  VirtualMemory _doubleArrow_7 = ObjectExtensions.<VirtualMemory>operator_doubleArrow(_createVirtualMemory, _function_9);
                  _virtualMemoryUnits.add((this.vmem1 = _doubleArrow_7));
                  BlackBoxVMBehaviour _createBlackBoxVMBehaviour = this.laf.createBlackBoxVMBehaviour();
                  final Procedure1<BlackBoxVMBehaviour> _function_10 = (BlackBoxVMBehaviour it_2) -> {
                    it_2.setName(((("Black-Box Application VM Behaviour (non-repeating) #" + Integer.valueOf(hn)) + "-") + Integer.valueOf(i)));
                    it_2.setPatternIsRepeating(false);
                    EList<BlackBoxWorkload> _blackBoxWorkloads = it_2.getBlackBoxWorkloads();
                    BlackBoxWorkload _createBBWorkload = this.createBBWorkload(this.cpu1);
                    _blackBoxWorkloads.add(_createBBWorkload);
                    it_2.setVmImageBehaviour(this.vmimagebehaviourBba);
                  };
                  BlackBoxVMBehaviour _doubleArrow_8 = ObjectExtensions.<BlackBoxVMBehaviour>operator_doubleArrow(_createBlackBoxVMBehaviour, _function_10);
                  it_1.setRuntimeApplicationModel(_doubleArrow_8);
                };
                VirtualMachine _doubleArrow_5 = ObjectExtensions.<VirtualMachine>operator_doubleArrow(_createVirtualMachine, _function_6);
                _virtualMachines.add((this.vmCurrent = _doubleArrow_5));
                EList<ApplicationInstance> _applicationInstances = it.getApplicationInstances();
                BlackBoxApplicationInstance _createBlackBoxApplicationInstance = this.laf.createBlackBoxApplicationInstance();
                final Procedure1<BlackBoxApplicationInstance> _function_7 = (BlackBoxApplicationInstance it_1) -> {
                  it_1.setApplicationTemplate(this.bbappt);
                  it_1.setVirtualMachine(this.vmCurrent);
                };
                BlackBoxApplicationInstance _doubleArrow_6 = ObjectExtensions.<BlackBoxApplicationInstance>operator_doubleArrow(_createBlackBoxApplicationInstance, _function_7);
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
  
  public final ExperimentScenarioTimeLine experimentScenarioModel = ObjectExtensions.<ExperimentScenarioTimeLine>operator_doubleArrow(this.esf.createExperimentScenarioTimeLine(), ((Procedure1<ExperimentScenarioTimeLine>) (ExperimentScenarioTimeLine it) -> {
    AbsoluteTimeEvent _createAbsoluteTimeEvent = this.esf.createAbsoluteTimeEvent();
    final Procedure1<AbsoluteTimeEvent> _function = (AbsoluteTimeEvent it_1) -> {
      double _minus = DoubleExtensions.operator_minus(this.middleDuration, this.startDuration);
      double _multiply = (0.2 * _minus);
      double _plus = ((this.startDuration).doubleValue() + _multiply);
      Amount<Duration> _valueOf = Amount.<Duration>valueOf(_plus, SI.SECOND);
      it_1.setSimulationTime(_valueOf);
      StartApplicationRequest _createStartApplicationRequest = this.rf.createStartApplicationRequest();
      final Procedure1<StartApplicationRequest> _function_1 = (StartApplicationRequest it_2) -> {
        it_2.setApplicationTemplate(this.bbappt);
        it_2.setVmFlavour(this.flavour1);
      };
      StartApplicationRequest _doubleArrow = ObjectExtensions.<StartApplicationRequest>operator_doubleArrow(_createStartApplicationRequest, _function_1);
      it_1.setExperimentScenarioRequest(_doubleArrow);
    };
    final AbsoluteTimeEvent startEvent = ObjectExtensions.<AbsoluteTimeEvent>operator_doubleArrow(_createAbsoluteTimeEvent, _function);
    EList<TimeLineEvent> _timeLineEvents = it.getTimeLineEvents();
    _timeLineEvents.add(startEvent);
    if ((this.numberUnusedPhysicalNodes > 0)) {
      EList<AbstractNode> _nodes = this.rack2.getNodes();
      final Function1<AbstractNode, Boolean> _function_1 = (AbstractNode it_1) -> {
        return Boolean.valueOf(true);
      };
      final AbstractNode nodeToSwitchOn = IterableExtensions.<AbstractNode>findFirst(_nodes, _function_1);
      EList<TimeLineEvent> _timeLineEvents_1 = it.getTimeLineEvents();
      AbsoluteTimeEvent _createAbsoluteTimeEvent_1 = this.esf.createAbsoluteTimeEvent();
      final Procedure1<AbsoluteTimeEvent> _function_2 = (AbsoluteTimeEvent it_1) -> {
        double _minus = DoubleExtensions.operator_minus(this.middleDuration, this.startDuration);
        double _multiply = (0.4 * _minus);
        double _plus = ((this.startDuration).doubleValue() + _multiply);
        Amount<Duration> _valueOf = Amount.<Duration>valueOf(_plus, SI.SECOND);
        it_1.setSimulationTime(_valueOf);
        SetPhysicalNodeStateRequest _createSetPhysicalNodeStateRequest = this.rf.createSetPhysicalNodeStateRequest();
        final Procedure1<SetPhysicalNodeStateRequest> _function_3 = (SetPhysicalNodeStateRequest it_2) -> {
          it_2.setTargetNode(nodeToSwitchOn);
          it_2.setTargetState(NodeState.RUNNING);
        };
        SetPhysicalNodeStateRequest _doubleArrow = ObjectExtensions.<SetPhysicalNodeStateRequest>operator_doubleArrow(_createSetPhysicalNodeStateRequest, _function_3);
        it_1.setExperimentScenarioRequest(_doubleArrow);
      };
      AbsoluteTimeEvent _doubleArrow = ObjectExtensions.<AbsoluteTimeEvent>operator_doubleArrow(_createAbsoluteTimeEvent_1, _function_2);
      _timeLineEvents_1.add(_doubleArrow);
      EList<TimeLineEvent> _timeLineEvents_2 = it.getTimeLineEvents();
      AbsoluteTimeEvent _createAbsoluteTimeEvent_2 = this.esf.createAbsoluteTimeEvent();
      final Procedure1<AbsoluteTimeEvent> _function_3 = (AbsoluteTimeEvent it_1) -> {
        double _minus = DoubleExtensions.operator_minus(this.middleDuration, this.startDuration);
        double _multiply = (0.8 * _minus);
        double _plus = ((this.startDuration).doubleValue() + _multiply);
        Amount<Duration> _valueOf = Amount.<Duration>valueOf(_plus, SI.SECOND);
        it_1.setSimulationTime(_valueOf);
        MigrateApplicationRequest _createMigrateApplicationRequest = this.rf.createMigrateApplicationRequest();
        final Procedure1<MigrateApplicationRequest> _function_4 = (MigrateApplicationRequest it_2) -> {
          PreviouslyStartedBlackBoxApplicationSelector _createPreviouslyStartedBlackBoxApplicationSelector = this.sf.createPreviouslyStartedBlackBoxApplicationSelector();
          final Procedure1<PreviouslyStartedBlackBoxApplicationSelector> _function_5 = (PreviouslyStartedBlackBoxApplicationSelector it_3) -> {
            ExperimentScenarioRequest _experimentScenarioRequest = startEvent.getExperimentScenarioRequest();
            it_3.setStartApplicationRequest(((StartApplicationRequest) _experimentScenarioRequest));
          };
          PreviouslyStartedBlackBoxApplicationSelector _doubleArrow_1 = ObjectExtensions.<PreviouslyStartedBlackBoxApplicationSelector>operator_doubleArrow(_createPreviouslyStartedBlackBoxApplicationSelector, _function_5);
          it_2.setApplicationInstanceSelector(_doubleArrow_1);
          it_2.setTargetPhysicalNode(((ComputeNode) nodeToSwitchOn));
        };
        MigrateApplicationRequest _doubleArrow_1 = ObjectExtensions.<MigrateApplicationRequest>operator_doubleArrow(_createMigrateApplicationRequest, _function_4);
        it_1.setExperimentScenarioRequest(_doubleArrow_1);
      };
      AbsoluteTimeEvent _doubleArrow_1 = ObjectExtensions.<AbsoluteTimeEvent>operator_doubleArrow(_createAbsoluteTimeEvent_2, _function_3);
      _timeLineEvents_2.add(_doubleArrow_1);
    }
  }));
}
