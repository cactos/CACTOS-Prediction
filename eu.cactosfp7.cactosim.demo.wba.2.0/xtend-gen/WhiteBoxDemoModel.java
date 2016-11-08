import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import eu.cactosfp7.infrastructuremodels.logicaldc.application.ApplicationCallAction;
import eu.cactosfp7.infrastructuremodels.logicaldc.application.ApplicationFactory;
import eu.cactosfp7.infrastructuremodels.logicaldc.application.ApplicationInstance;
import eu.cactosfp7.infrastructuremodels.logicaldc.application.ApplicationTemplate;
import eu.cactosfp7.infrastructuremodels.logicaldc.application.ComposedVM;
import eu.cactosfp7.infrastructuremodels.logicaldc.application.ComposedVMImage;
import eu.cactosfp7.infrastructuremodels.logicaldc.application.ConstantOpenWorkload;
import eu.cactosfp7.infrastructuremodels.logicaldc.application.ControlFlowAction;
import eu.cactosfp7.infrastructuremodels.logicaldc.application.ControlFlowVariable;
import eu.cactosfp7.infrastructuremodels.logicaldc.application.LoadBalancingPolicy;
import eu.cactosfp7.infrastructuremodels.logicaldc.application.ResourceDemandAction;
import eu.cactosfp7.infrastructuremodels.logicaldc.application.ScalableVMImageConnector;
import eu.cactosfp7.infrastructuremodels.logicaldc.application.ServiceEffect;
import eu.cactosfp7.infrastructuremodels.logicaldc.application.ServiceInterface;
import eu.cactosfp7.infrastructuremodels.logicaldc.application.ServiceOperation;
import eu.cactosfp7.infrastructuremodels.logicaldc.application.ServiceOperationCallAction;
import eu.cactosfp7.infrastructuremodels.logicaldc.application.ServiceProvidedRole;
import eu.cactosfp7.infrastructuremodels.logicaldc.application.ServiceRequiredRole;
import eu.cactosfp7.infrastructuremodels.logicaldc.application.SetVariableAction;
import eu.cactosfp7.infrastructuremodels.logicaldc.application.UserBehaviour;
import eu.cactosfp7.infrastructuremodels.logicaldc.application.VMImageConnector;
import eu.cactosfp7.infrastructuremodels.logicaldc.application.VariableAssignment;
import eu.cactosfp7.infrastructuremodels.logicaldc.application.VariableResourceDemand;
import eu.cactosfp7.infrastructuremodels.logicaldc.application.WhiteBoxApplicationInstance;
import eu.cactosfp7.infrastructuremodels.logicaldc.application.WhiteBoxApplicationTemplate;
import eu.cactosfp7.infrastructuremodels.logicaldc.application.WhiteBoxUserBehaviourInstance;
import eu.cactosfp7.infrastructuremodels.logicaldc.application.WhiteBoxUserBehaviourTemplate;
import eu.cactosfp7.infrastructuremodels.logicaldc.application.WhiteBoxVMBehaviour;
import eu.cactosfp7.infrastructuremodels.logicaldc.application.WhiteBoxVMImageBehaviour;
import eu.cactosfp7.infrastructuremodels.logicaldc.application.entity.ProvidedRole;
import eu.cactosfp7.infrastructuremodels.logicaldc.application.entity.RequiredRole;
import eu.cactosfp7.infrastructuremodels.logicaldc.application.util.NonIdCopier;
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
import java.util.ArrayList;
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
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.jscience.physics.amount.Amount;

/**
 * This demonstration scenario show a white-box application running on the Flexiant Testbed.
 * It contains a white-box application description of the DataPlay application.
 * This includes a description of the application template as well as running instances.
 * It does not contain descriptions of other applications or VMs.
 * TODO(WP3/WP4, modeling support Henning) The behaviour should match the real (measured) behaviour.
 */
@SuppressWarnings("all")
public class WhiteBoxDemoModel {
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
  
  private Rack rack3;
  
  private Switch switch1;
  
  private PowerDistributionUnit pduMain;
  
  private PowerDistributionUnit pduRack1;
  
  private PowerDistributionUnit pduRack2;
  
  private PowerDistributionUnit pduRack3;
  
  private ProcessingUnitSpecification cpu1;
  
  private MemorySpecification mem1;
  
  private StorageSpecification storage1;
  
  private NetworkInterconnect nic1;
  
  private Flavour flavourSmall;
  
  private Flavour flavourSmallPowerful;
  
  private Flavour flavourMedium;
  
  private Flavour flavourMediumMemory;
  
  private Flavour flavourLarge;
  
  private VMImage vmimageKvmHypervisor;
  
  private VMImage vmimageLoadBalancerHttp;
  
  private VMImage vmimageFrontend;
  
  private VMImage vmimageMaster;
  
  private VMImage vmimageCassandra;
  
  private VMImage vmimageRedis;
  
  private VMImage vmimageLoadBalancerPgpool;
  
  private VMImage vmimagePostgresql;
  
  private MonitorableResource apptempCpu;
  
  private MonitorableResource apptempStorage;
  
  private WhiteBoxApplicationTemplate apptempDataPlay;
  
  private WhiteBoxVMImageBehaviour vmimagebehaviourLoadBalancerFrontend;
  
  private WhiteBoxVMImageBehaviour vmimagebehaviourFrontend;
  
  private WhiteBoxVMImageBehaviour vmimagebehaviourLoadBalancerMaster;
  
  private WhiteBoxVMImageBehaviour vmimagebehaviourMaster;
  
  private WhiteBoxVMImageBehaviour vmimagebehaviourCassandra;
  
  private WhiteBoxVMImageBehaviour vmimagebehaviourRedis;
  
  private WhiteBoxVMImageBehaviour vmimagebehaviourLoadBalancerPgpool;
  
  private WhiteBoxVMImageBehaviour vmimagebehaviourPostgresql;
  
  private ServiceInterface ifaceHttp;
  
  private ServiceOperation soHttpGet;
  
  private ServiceInterface ifaceSql;
  
  private ServiceOperation soSqlExecute;
  
  private ServiceInterface ifaceGeneric;
  
  private ServiceOperation soGenericProcess;
  
  private ServiceProvidedRole provroleLBFrontend;
  
  private ServiceRequiredRole reqroleLBFrontendFrontend;
  
  private ServiceProvidedRole provroleFrontend;
  
  private ServiceRequiredRole reqroleFrontendLBMaster;
  
  private ServiceProvidedRole provroleLBMaster;
  
  private ServiceRequiredRole reqroleLBMasterMaster;
  
  private ServiceProvidedRole provroleMaster;
  
  private ServiceRequiredRole reqroleMasterCassandra;
  
  private ServiceRequiredRole reqroleMasterRedis;
  
  private ServiceRequiredRole reqroleMasterLBPgpool;
  
  private ServiceProvidedRole provroleLBPgpool;
  
  private ServiceRequiredRole reqroleLBPgpoolPostgresql;
  
  private ServiceProvidedRole provroleCassandra;
  
  private ServiceProvidedRole provroleRedis;
  
  private ServiceProvidedRole provrolePostgresql;
  
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
  
  private int hypNumber;
  
  public MemorySpecification createMemory32() {
    MemorySpecification _createMemorySpecification = this.pcoref.createMemorySpecification();
    final Procedure1<MemorySpecification> _function = (MemorySpecification it) -> {
      it.setName("32GB DDR3-RAM");
      Unit<DataAmount> _GIGA = SI.<DataAmount>GIGA(NonSI.BYTE);
      Amount<DataAmount> _valueOf = Amount.<DataAmount>valueOf(220, _GIGA);
      it.setSize(_valueOf);
      Bandwidth _createBandwidth = this.puf.createBandwidth();
      final Procedure1<Bandwidth> _function_1 = (Bandwidth it_1) -> {
        Unit<DataRate> _GIGA_1 = SI.<DataRate>GIGA(DataRate.UNIT);
        Amount<DataRate> _valueOf_1 = Amount.<DataRate>valueOf((23.984 * 8), _GIGA_1);
        it_1.setValue(_valueOf_1);
      };
      Bandwidth _doubleArrow = ObjectExtensions.<Bandwidth>operator_doubleArrow(_createBandwidth, _function_1);
      it.setBandwidthRead(_doubleArrow);
      Bandwidth _createBandwidth_1 = this.puf.createBandwidth();
      final Procedure1<Bandwidth> _function_2 = (Bandwidth it_1) -> {
        Unit<DataRate> _GIGA_1 = SI.<DataRate>GIGA(DataRate.UNIT);
        Amount<DataRate> _valueOf_1 = Amount.<DataRate>valueOf((25.132 * 8), _GIGA_1);
        it_1.setValue(_valueOf_1);
      };
      Bandwidth _doubleArrow_1 = ObjectExtensions.<Bandwidth>operator_doubleArrow(_createBandwidth_1, _function_2);
      it.setBandwidthWrite(_doubleArrow_1);
    };
    return ObjectExtensions.<MemorySpecification>operator_doubleArrow(_createMemorySpecification, _function);
  }
  
  public MemorySpecification createMemory64() {
    MemorySpecification _createMemorySpecification = this.pcoref.createMemorySpecification();
    final Procedure1<MemorySpecification> _function = (MemorySpecification it) -> {
      it.setName("64GB DDR3-RAM");
      Unit<DataAmount> _GIGA = SI.<DataAmount>GIGA(NonSI.BYTE);
      Amount<DataAmount> _valueOf = Amount.<DataAmount>valueOf(64, _GIGA);
      it.setSize(_valueOf);
      Bandwidth _createBandwidth = this.puf.createBandwidth();
      final Procedure1<Bandwidth> _function_1 = (Bandwidth it_1) -> {
        Unit<DataRate> _GIGA_1 = SI.<DataRate>GIGA(DataRate.UNIT);
        Amount<DataRate> _valueOf_1 = Amount.<DataRate>valueOf((23.984 * 8), _GIGA_1);
        it_1.setValue(_valueOf_1);
      };
      Bandwidth _doubleArrow = ObjectExtensions.<Bandwidth>operator_doubleArrow(_createBandwidth, _function_1);
      it.setBandwidthRead(_doubleArrow);
      Bandwidth _createBandwidth_1 = this.puf.createBandwidth();
      final Procedure1<Bandwidth> _function_2 = (Bandwidth it_1) -> {
        Unit<DataRate> _GIGA_1 = SI.<DataRate>GIGA(DataRate.UNIT);
        Amount<DataRate> _valueOf_1 = Amount.<DataRate>valueOf((25.132 * 8), _GIGA_1);
        it_1.setValue(_valueOf_1);
      };
      Bandwidth _doubleArrow_1 = ObjectExtensions.<Bandwidth>operator_doubleArrow(_createBandwidth_1, _function_2);
      it.setBandwidthWrite(_doubleArrow_1);
    };
    return ObjectExtensions.<MemorySpecification>operator_doubleArrow(_createMemorySpecification, _function);
  }
  
  public MemorySpecification createMemory128() {
    MemorySpecification _createMemorySpecification = this.pcoref.createMemorySpecification();
    final Procedure1<MemorySpecification> _function = (MemorySpecification it) -> {
      it.setName("128GB DDR3-RAM");
      Unit<DataAmount> _GIGA = SI.<DataAmount>GIGA(NonSI.BYTE);
      Amount<DataAmount> _valueOf = Amount.<DataAmount>valueOf(128, _GIGA);
      it.setSize(_valueOf);
      Bandwidth _createBandwidth = this.puf.createBandwidth();
      final Procedure1<Bandwidth> _function_1 = (Bandwidth it_1) -> {
        Unit<DataRate> _GIGA_1 = SI.<DataRate>GIGA(DataRate.UNIT);
        Amount<DataRate> _valueOf_1 = Amount.<DataRate>valueOf((23.984 * 8), _GIGA_1);
        it_1.setValue(_valueOf_1);
      };
      Bandwidth _doubleArrow = ObjectExtensions.<Bandwidth>operator_doubleArrow(_createBandwidth, _function_1);
      it.setBandwidthRead(_doubleArrow);
      Bandwidth _createBandwidth_1 = this.puf.createBandwidth();
      final Procedure1<Bandwidth> _function_2 = (Bandwidth it_1) -> {
        Unit<DataRate> _GIGA_1 = SI.<DataRate>GIGA(DataRate.UNIT);
        Amount<DataRate> _valueOf_1 = Amount.<DataRate>valueOf((25.132 * 8), _GIGA_1);
        it_1.setValue(_valueOf_1);
      };
      Bandwidth _doubleArrow_1 = ObjectExtensions.<Bandwidth>operator_doubleArrow(_createBandwidth_1, _function_2);
      it.setBandwidthWrite(_doubleArrow_1);
    };
    return ObjectExtensions.<MemorySpecification>operator_doubleArrow(_createMemorySpecification, _function);
  }
  
  public StorageSpecification createStorageTemplate() {
    return this.createStorageHdd();
  }
  
  public StorageSpecification createStorageHdd() {
    StorageSpecification _createStorageSpecification = this.pcoref.createStorageSpecification();
    final Procedure1<StorageSpecification> _function = (StorageSpecification it) -> {
      it.setName("Local HDD");
      Unit<DataAmount> _GIGA = SI.<DataAmount>GIGA(NonSI.BYTE);
      Amount<DataAmount> _valueOf = Amount.<DataAmount>valueOf(220, _GIGA);
      it.setSize(_valueOf);
      Amount<Duration> _valueOf_1 = Amount.<Duration>valueOf(0, SI.SECOND);
      it.setReadDelay(_valueOf_1);
      Bandwidth _createBandwidth = this.puf.createBandwidth();
      final Procedure1<Bandwidth> _function_1 = (Bandwidth it_1) -> {
        Unit<DataRate> _MEGA = SI.<DataRate>MEGA(DataRate.UNIT);
        Amount<DataRate> _valueOf_2 = Amount.<DataRate>valueOf((70 * 8), _MEGA);
        it_1.setValue(_valueOf_2);
      };
      Bandwidth _doubleArrow = ObjectExtensions.<Bandwidth>operator_doubleArrow(_createBandwidth, _function_1);
      it.setReadBandwidth(_doubleArrow);
      Amount<Duration> _valueOf_2 = Amount.<Duration>valueOf(0, SI.SECOND);
      it.setWriteDelay(_valueOf_2);
      Bandwidth _createBandwidth_1 = this.puf.createBandwidth();
      final Procedure1<Bandwidth> _function_2 = (Bandwidth it_1) -> {
        Unit<DataRate> _MEGA = SI.<DataRate>MEGA(DataRate.UNIT);
        Amount<DataRate> _valueOf_3 = Amount.<DataRate>valueOf((70 * 8), _MEGA);
        it_1.setValue(_valueOf_3);
      };
      Bandwidth _doubleArrow_1 = ObjectExtensions.<Bandwidth>operator_doubleArrow(_createBandwidth_1, _function_2);
      it.setWriteBandwidth(_doubleArrow_1);
    };
    return ObjectExtensions.<StorageSpecification>operator_doubleArrow(_createStorageSpecification, _function);
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
  
  public NetworkAttachedStorage createClusterStorage(final Rack rack, final PowerDistributionUnit pduRack, final String clusterName) {
    NetworkAttachedStorage _xblockexpression = null;
    {
      NetworkAttachedStorage _createNetworkAttachedStorage = this.pcoref.createNetworkAttachedStorage();
      final Procedure1<NetworkAttachedStorage> _function = (NetworkAttachedStorage it) -> {
        it.setName(clusterName);
        EList<StorageSpecification> _storageSpecifications = it.getStorageSpecifications();
        StorageSpecification _createStorageSpecification = this.pcoref.createStorageSpecification();
        final Procedure1<StorageSpecification> _function_1 = (StorageSpecification it_1) -> {
          it_1.setName((" Virtual Storage on Cluster " + clusterName));
          Unit<DataAmount> _TERA = SI.<DataAmount>TERA(NonSI.BYTE);
          Amount<DataAmount> _valueOf = Amount.<DataAmount>valueOf(500, _TERA);
          it_1.setSize(_valueOf);
          Amount<Duration> _valueOf_1 = Amount.<Duration>valueOf(0, SI.SECOND);
          it_1.setReadDelay(_valueOf_1);
          Bandwidth _createBandwidth = this.puf.createBandwidth();
          final Procedure1<Bandwidth> _function_2 = (Bandwidth it_2) -> {
            Unit<DataRate> _MEGA = SI.<DataRate>MEGA(DataRate.UNIT);
            Amount<DataRate> _valueOf_2 = Amount.<DataRate>valueOf((120 * 8), _MEGA);
            it_2.setValue(_valueOf_2);
          };
          Bandwidth _doubleArrow = ObjectExtensions.<Bandwidth>operator_doubleArrow(_createBandwidth, _function_2);
          it_1.setReadBandwidth(_doubleArrow);
          Amount<Duration> _valueOf_2 = Amount.<Duration>valueOf(0, SI.SECOND);
          it_1.setWriteDelay(_valueOf_2);
          Bandwidth _createBandwidth_1 = this.puf.createBandwidth();
          final Procedure1<Bandwidth> _function_3 = (Bandwidth it_2) -> {
            Unit<DataRate> _MEGA = SI.<DataRate>MEGA(DataRate.UNIT);
            Amount<DataRate> _valueOf_3 = Amount.<DataRate>valueOf((120 * 8), _MEGA);
            it_2.setValue(_valueOf_3);
          };
          Bandwidth _doubleArrow_1 = ObjectExtensions.<Bandwidth>operator_doubleArrow(_createBandwidth_1, _function_3);
          it_1.setWriteBandwidth(_doubleArrow_1);
        };
        StorageSpecification _doubleArrow = ObjectExtensions.<StorageSpecification>operator_doubleArrow(_createStorageSpecification, _function_1);
        _storageSpecifications.add((this.storage1 = _doubleArrow));
      };
      final NetworkAttachedStorage nas = ObjectExtensions.<NetworkAttachedStorage>operator_doubleArrow(_createNetworkAttachedStorage, _function);
      EList<PowerConsumingEntity> _powerConsumingEntities = pduRack.getPowerConsumingEntities();
      _powerConsumingEntities.add(nas);
      EList<AbstractNode> _nodes = rack.getNodes();
      _nodes.add(nas);
      _xblockexpression = nas;
    }
    return _xblockexpression;
  }
  
  public ProcessingUnitSpecification createCpuTemplate() {
    return this.createCpu4();
  }
  
  public ProcessingUnitSpecification createCpu32() {
    ProcessingUnitSpecification _createProcessingUnitSpecification = this.pcoref.createProcessingUnitSpecification();
    final Procedure1<ProcessingUnitSpecification> _function = (ProcessingUnitSpecification it) -> {
      it.setName("Quad-Core AMD Opteron™ Processor 8356");
      Unit<Frequency> _GIGA = SI.<Frequency>GIGA(SI.HERTZ);
      Amount<Frequency> _valueOf = Amount.<Frequency>valueOf(1.8, _GIGA);
      it.setFrequency(_valueOf);
      it.setNumberOfCores(32);
      it.setSupportsTurboMode(Boolean.valueOf(false));
      ArchitectureType _createOrGet = ArchitectureTypeUtil.INSTANCE.createOrGet(this.architectureRepo, ArchitectureTypeUtil.ARCHITECTURE_TYPE_x86_GENERIC_UUID);
      it.setArchitectureType(_createOrGet);
    };
    return ObjectExtensions.<ProcessingUnitSpecification>operator_doubleArrow(_createProcessingUnitSpecification, _function);
  }
  
  public ProcessingUnitSpecification createCpu16() {
    ProcessingUnitSpecification _createProcessingUnitSpecification = this.pcoref.createProcessingUnitSpecification();
    final Procedure1<ProcessingUnitSpecification> _function = (ProcessingUnitSpecification it) -> {
      it.setName("Quad-Core AMD Opteron™ Processor 8356");
      Unit<Frequency> _GIGA = SI.<Frequency>GIGA(SI.HERTZ);
      Amount<Frequency> _valueOf = Amount.<Frequency>valueOf(1.1, _GIGA);
      it.setFrequency(_valueOf);
      it.setNumberOfCores(16);
      it.setSupportsTurboMode(Boolean.valueOf(false));
      ArchitectureType _createOrGet = ArchitectureTypeUtil.INSTANCE.createOrGet(this.architectureRepo, ArchitectureTypeUtil.ARCHITECTURE_TYPE_x86_GENERIC_UUID);
      it.setArchitectureType(_createOrGet);
    };
    return ObjectExtensions.<ProcessingUnitSpecification>operator_doubleArrow(_createProcessingUnitSpecification, _function);
  }
  
  public ProcessingUnitSpecification createCpu8() {
    ProcessingUnitSpecification _createProcessingUnitSpecification = this.pcoref.createProcessingUnitSpecification();
    final Procedure1<ProcessingUnitSpecification> _function = (ProcessingUnitSpecification it) -> {
      it.setName("AMD Opteron™ Processor 6212");
      Unit<Frequency> _GIGA = SI.<Frequency>GIGA(SI.HERTZ);
      Amount<Frequency> _valueOf = Amount.<Frequency>valueOf(2.6, _GIGA);
      it.setFrequency(_valueOf);
      it.setNumberOfCores(8);
      it.setSupportsTurboMode(Boolean.valueOf(false));
      ArchitectureType _createOrGet = ArchitectureTypeUtil.INSTANCE.createOrGet(this.architectureRepo, ArchitectureTypeUtil.ARCHITECTURE_TYPE_x86_GENERIC_UUID);
      it.setArchitectureType(_createOrGet);
    };
    return ObjectExtensions.<ProcessingUnitSpecification>operator_doubleArrow(_createProcessingUnitSpecification, _function);
  }
  
  public ProcessingUnitSpecification createCpu4() {
    ProcessingUnitSpecification _createProcessingUnitSpecification = this.pcoref.createProcessingUnitSpecification();
    final Procedure1<ProcessingUnitSpecification> _function = (ProcessingUnitSpecification it) -> {
      it.setName("AMD Opteron™ Processor 6320");
      Unit<Frequency> _GIGA = SI.<Frequency>GIGA(SI.HERTZ);
      Amount<Frequency> _valueOf = Amount.<Frequency>valueOf(1.4, _GIGA);
      it.setFrequency(_valueOf);
      it.setNumberOfCores(4);
      it.setSupportsTurboMode(Boolean.valueOf(false));
      ArchitectureType _createOrGet = ArchitectureTypeUtil.INSTANCE.createOrGet(this.architectureRepo, ArchitectureTypeUtil.ARCHITECTURE_TYPE_x86_GENERIC_UUID);
      it.setArchitectureType(_createOrGet);
    };
    return ObjectExtensions.<ProcessingUnitSpecification>operator_doubleArrow(_createProcessingUnitSpecification, _function);
  }
  
  public VMImage createVmImageGeneric(final String title, final StorageSpecification storage) {
    VMImage _createVMImage = this.lcoref.createVMImage();
    final Procedure1<VMImage> _function = (VMImage it) -> {
      it.setName(title);
      Unit<DataAmount> _GIGA = SI.<DataAmount>GIGA(NonSI.BYTE);
      Amount<DataAmount> _valueOf = Amount.<DataAmount>valueOf(8.0, _GIGA);
      it.setCapacity(_valueOf);
      Unit<DataAmount> _GIGA_1 = SI.<DataAmount>GIGA(NonSI.BYTE);
      Amount<DataAmount> _valueOf_1 = Amount.<DataAmount>valueOf(5.0, _GIGA_1);
      it.setUsedCapacity(_valueOf_1);
    };
    return ObjectExtensions.<VMImage>operator_doubleArrow(_createVMImage, _function);
  }
  
  public WhiteBoxVMImageBehaviour createWhiteBoxImageBehaviour(final VMImage vmimage, final Flavour flavour, final ServiceProvidedRole provRole, final ServiceOperation provroleOperation, final ServiceRequiredRole reqRole, final ServiceOperation operation, final VariableAssignment inputAssignment, final String amountCpu, final Unit<?> unitCpu, final String amountStorage, final Unit<?> unitStorage, final VariableAssignment returnAssignment) {
    WhiteBoxVMImageBehaviour _createWhiteBoxVMImageBehaviour = this.laf.createWhiteBoxVMImageBehaviour();
    final Procedure1<WhiteBoxVMImageBehaviour> _function = (WhiteBoxVMImageBehaviour it) -> {
      it.setVmImage(vmimage);
      it.setDefaultFlavour(flavour);
      EList<MonitorableResource> _referenceResourceSpecifications = it.getReferenceResourceSpecifications();
      ProcessingUnitSpecification _createCpuTemplate = this.createCpuTemplate();
      _referenceResourceSpecifications.add((this.apptempCpu = _createCpuTemplate));
      EList<MonitorableResource> _referenceResourceSpecifications_1 = it.getReferenceResourceSpecifications();
      StorageSpecification _createStorageTemplate = this.createStorageTemplate();
      _referenceResourceSpecifications_1.add((this.apptempStorage = _createStorageTemplate));
      EList<ServiceEffect> _serviceEffects = it.getServiceEffects();
      ResourceDemandAction _createResourceDemandAction = this.createResourceDemandAction(amountCpu, unitCpu, this.apptempCpu, amountStorage, unitStorage, 
        this.apptempStorage);
      ServiceEffect _createBehaviourDemandCallReturn = this.createBehaviourDemandCallReturn(provRole, provroleOperation, reqRole, operation, inputAssignment, _createResourceDemandAction, returnAssignment);
      _serviceEffects.add(_createBehaviourDemandCallReturn);
    };
    return ObjectExtensions.<WhiteBoxVMImageBehaviour>operator_doubleArrow(_createWhiteBoxVMImageBehaviour, _function);
  }
  
  public ResourceDemandAction createResourceDemandAction(final String amountCpu, final Unit<?> unitCpu, final MonitorableResource cpu, final String amountStorage, final Unit<?> unitStorage, final MonitorableResource storage) {
    ResourceDemandAction _createResourceDemandAction = this.laf.createResourceDemandAction();
    final Procedure1<ResourceDemandAction> _function = (ResourceDemandAction it) -> {
      boolean _and = false;
      boolean _and_1 = false;
      boolean _notEquals = (!Objects.equal(amountCpu, null));
      if (!_notEquals) {
        _and_1 = false;
      } else {
        boolean _notEquals_1 = (!Objects.equal(unitCpu, null));
        _and_1 = _notEquals_1;
      }
      if (!_and_1) {
        _and = false;
      } else {
        boolean _notEquals_2 = (!Objects.equal(cpu, null));
        _and = _notEquals_2;
      }
      if (_and) {
        EList<VariableResourceDemand> _resourceDemands = it.getResourceDemands();
        VariableResourceDemand _createVariableResourceDemand = this.laf.createVariableResourceDemand();
        final Procedure1<VariableResourceDemand> _function_1 = (VariableResourceDemand it_1) -> {
          it_1.setAmount(amountCpu);
          it_1.setUnit(unitCpu);
          it_1.setOnResource(cpu);
        };
        VariableResourceDemand _doubleArrow = ObjectExtensions.<VariableResourceDemand>operator_doubleArrow(_createVariableResourceDemand, _function_1);
        _resourceDemands.add(_doubleArrow);
      }
      boolean _and_2 = false;
      boolean _and_3 = false;
      boolean _notEquals_3 = (!Objects.equal(amountStorage, null));
      if (!_notEquals_3) {
        _and_3 = false;
      } else {
        boolean _notEquals_4 = (!Objects.equal(unitStorage, null));
        _and_3 = _notEquals_4;
      }
      if (!_and_3) {
        _and_2 = false;
      } else {
        boolean _notEquals_5 = (!Objects.equal(storage, null));
        _and_2 = _notEquals_5;
      }
      if (_and_2) {
        EList<VariableResourceDemand> _resourceDemands_1 = it.getResourceDemands();
        VariableResourceDemand _createVariableResourceDemand_1 = this.laf.createVariableResourceDemand();
        final Procedure1<VariableResourceDemand> _function_2 = (VariableResourceDemand it_1) -> {
          it_1.setAmount(amountStorage);
          it_1.setUnit(unitStorage);
          it_1.setOnResource(storage);
        };
        VariableResourceDemand _doubleArrow_1 = ObjectExtensions.<VariableResourceDemand>operator_doubleArrow(_createVariableResourceDemand_1, _function_2);
        _resourceDemands_1.add(_doubleArrow_1);
      }
    };
    return ObjectExtensions.<ResourceDemandAction>operator_doubleArrow(_createResourceDemandAction, _function);
  }
  
  public ServiceEffect createBehaviourDemandCallReturn(final ServiceProvidedRole provRole, final ServiceOperation provroleOperation, final ServiceRequiredRole reqRole, final ServiceOperation operation, final VariableAssignment inputAssignment, final ResourceDemandAction rda, final VariableAssignment returnAssignment) {
    ServiceEffect _xblockexpression = null;
    {
      final ArrayList<ControlFlowAction> list = CollectionLiterals.<ControlFlowAction>newArrayList();
      ControlFlowAction currentAction = null;
      ControlFlowAction lastAction = null;
      list.add((lastAction = (currentAction = this.laf.createStartAction())));
      boolean _notEquals = (!Objects.equal(inputAssignment, null));
      if (_notEquals) {
        list.add((currentAction = ObjectExtensions.<SetVariableAction>operator_doubleArrow(this.laf.createSetVariableAction(), ((Procedure1<SetVariableAction>) (SetVariableAction it) -> {
          EList<VariableAssignment> _variableAssignments = it.getVariableAssignments();
          _variableAssignments.add(inputAssignment);
        }))));
        currentAction.setPredecessingControlFlowAction(lastAction);
        lastAction = currentAction;
      }
      boolean _notEquals_1 = (!Objects.equal(rda, null));
      if (_notEquals_1) {
        list.add((currentAction = rda));
        currentAction.setPredecessingControlFlowAction(lastAction);
        lastAction = currentAction;
      }
      boolean _and = false;
      boolean _notEquals_2 = (!Objects.equal(reqRole, null));
      if (!_notEquals_2) {
        _and = false;
      } else {
        boolean _notEquals_3 = (!Objects.equal(operation, null));
        _and = _notEquals_3;
      }
      if (_and) {
        list.add((currentAction = ObjectExtensions.<ServiceOperationCallAction>operator_doubleArrow(this.laf.createServiceOperationCallAction(), ((Procedure1<ServiceOperationCallAction>) (ServiceOperationCallAction it) -> {
          it.setServiceRequiredRole(reqRole);
          it.setServiceOperationOfRequiredRole(operation);
        }))));
        currentAction.setPredecessingControlFlowAction(lastAction);
        lastAction = currentAction;
      }
      boolean _notEquals_4 = (!Objects.equal(inputAssignment, null));
      if (_notEquals_4) {
        list.add((currentAction = ObjectExtensions.<SetVariableAction>operator_doubleArrow(this.laf.createSetVariableAction(), ((Procedure1<SetVariableAction>) (SetVariableAction it) -> {
          EList<VariableAssignment> _variableAssignments = it.getVariableAssignments();
          _variableAssignments.add(inputAssignment);
        }))));
        currentAction.setPredecessingControlFlowAction(lastAction);
        lastAction = currentAction;
      }
      list.add((currentAction = this.laf.createStopAction()));
      currentAction.setPredecessingControlFlowAction(lastAction);
      ServiceEffect _createServiceEffect = this.laf.createServiceEffect();
      final Procedure1<ServiceEffect> _function = (ServiceEffect it) -> {
        it.setForServiceOperation(provroleOperation);
        it.setForServiceProvidedRole(provRole);
        EList<ControlFlowAction> _controlFlowActions = it.getControlFlowActions();
        Iterables.<ControlFlowAction>addAll(_controlFlowActions, list);
      };
      _xblockexpression = ObjectExtensions.<ServiceEffect>operator_doubleArrow(_createServiceEffect, _function);
    }
    return _xblockexpression;
  }
  
  private int numberTemplateInstances = 0;
  
  /**
   * Instantiate a White-Box Application Template.
   * All VMImages are instantiated on the same node.
   * All scalable VMs have a scaling factor of 1.
   */
  public boolean instantiateApplicationTemplate(final WhiteBoxApplicationTemplate wbat, final Hypervisor hyp) {
    boolean _xblockexpression = false;
    {
      this.numberTemplateInstances = (this.numberTemplateInstances + 1);
      LogicalDCModel _logicalDCModel = wbat.getLogicalDCModel();
      EList<ApplicationInstance> _applicationInstances = _logicalDCModel.getApplicationInstances();
      WhiteBoxApplicationInstance _createWhiteBoxApplicationInstance = this.laf.createWhiteBoxApplicationInstance();
      final Procedure1<WhiteBoxApplicationInstance> _function = (WhiteBoxApplicationInstance it) -> {
        it.setApplicationTemplate(wbat);
        EList<ComposedVMImage> _composedVMImages = wbat.getComposedVMImages();
        for (final ComposedVMImage cvmi : _composedVMImages) {
          {
            int numberInstances = 0;
            EList<VMImageConnector> _vmImageConnectors = wbat.getVmImageConnectors();
            for (final VMImageConnector vmic : _vmImageConnectors) {
              if ((vmic instanceof ScalableVMImageConnector)) {
                EList<ProvidedRole> _providedRoles = cvmi.getProvidedRoles();
                for (final ProvidedRole pr : _providedRoles) {
                  if ((pr instanceof ServiceProvidedRole)) {
                    ServiceProvidedRole _serviceProvidedRole = ((ScalableVMImageConnector)vmic).getServiceProvidedRole();
                    boolean _equals = Objects.equal(pr, _serviceProvidedRole);
                    if (_equals) {
                      int _numberInstances = numberInstances;
                      int _defaultInstances = ((ScalableVMImageConnector)vmic).getDefaultInstances();
                      numberInstances = (_numberInstances + _defaultInstances);
                    }
                  }
                }
              }
            }
            if ((numberInstances == 0)) {
              numberInstances = 1;
            }
            for (int num = 1; (num < (numberInstances + 1)); num++) {
              {
                final int instanceNumber = num;
                VirtualMachine _createVirtualMachine = this.lcoref.createVirtualMachine();
                final Procedure1<VirtualMachine> _function_1 = (VirtualMachine it_1) -> {
                  String _name = wbat.getName();
                  String _plus = (_name + "A");
                  String _plus_1 = (_plus + Integer.valueOf(this.numberTemplateInstances));
                  String _plus_2 = (_plus_1 + "I");
                  String _plus_3 = (_plus_2 + Integer.valueOf(instanceNumber));
                  String _plus_4 = (_plus_3 + "-");
                  String _name_1 = cvmi.getName();
                  final String nme = (_plus_4 + _name_1);
                  it_1.setName(nme);
                  it_1.setState(VM_State.RUNNING);
                  EList<VirtualProcessingUnit> _virtualProcessingUnits = it_1.getVirtualProcessingUnits();
                  VirtualProcessingUnit _createVirtualProcessingUnit = this.lcoref.createVirtualProcessingUnit();
                  final Procedure1<VirtualProcessingUnit> _function_2 = (VirtualProcessingUnit it_2) -> {
                    WhiteBoxVMImageBehaviour _vmImageBehaviour = cvmi.getVmImageBehaviour();
                    Flavour _defaultFlavour = _vmImageBehaviour.getDefaultFlavour();
                    int _numberVirtualCores = _defaultFlavour.getNumberVirtualCores();
                    it_2.setVirtualCores(_numberVirtualCores);
                    WhiteBoxVMImageBehaviour _vmImageBehaviour_1 = cvmi.getVmImageBehaviour();
                    Flavour _defaultFlavour_1 = _vmImageBehaviour_1.getDefaultFlavour();
                    String _name_2 = _defaultFlavour_1.getName();
                    String _plus_5 = ("vCPU based on Flavour " + _name_2);
                    it_2.setName(_plus_5);
                    ArchitectureType _createOrGet = ArchitectureTypeUtil.INSTANCE.createOrGet(this.architectureRepo, ArchitectureTypeUtil.ARCHITECTURE_TYPE_x86_GENERIC_UUID);
                    it_2.setArchitectureType(_createOrGet);
                  };
                  VirtualProcessingUnit _doubleArrow = ObjectExtensions.<VirtualProcessingUnit>operator_doubleArrow(_createVirtualProcessingUnit, _function_2);
                  _virtualProcessingUnits.add((this.vcpu1 = _doubleArrow));
                  EList<VirtualMemory> _virtualMemoryUnits = it_1.getVirtualMemoryUnits();
                  VirtualMemory _createVirtualMemory = this.lcoref.createVirtualMemory();
                  final Procedure1<VirtualMemory> _function_3 = (VirtualMemory it_2) -> {
                    WhiteBoxVMImageBehaviour _vmImageBehaviour = cvmi.getVmImageBehaviour();
                    Flavour _defaultFlavour = _vmImageBehaviour.getDefaultFlavour();
                    Amount<DataAmount> _sizeRam = _defaultFlavour.getSizeRam();
                    it_2.setProvisioned(_sizeRam);
                  };
                  VirtualMemory _doubleArrow_1 = ObjectExtensions.<VirtualMemory>operator_doubleArrow(_createVirtualMemory, _function_3);
                  _virtualMemoryUnits.add((this.vmem1 = _doubleArrow_1));
                  VMImageInstance _createVMImageInstance = this.lcoref.createVMImageInstance();
                  final Procedure1<VMImageInstance> _function_4 = (VMImageInstance it_2) -> {
                    VirtualDisk _createVirtualDisk = this.lcoref.createVirtualDisk();
                    final Procedure1<VirtualDisk> _function_5 = (VirtualDisk it_3) -> {
                      WhiteBoxVMImageBehaviour _vmImageBehaviour = cvmi.getVmImageBehaviour();
                      Flavour _defaultFlavour = _vmImageBehaviour.getDefaultFlavour();
                      String _name_2 = _defaultFlavour.getName();
                      String _plus_5 = ((("Overlay for VM " + nme) + " based on Flavour ") + _name_2);
                      it_3.setName(_plus_5);
                      WhiteBoxVMImageBehaviour _vmImageBehaviour_1 = cvmi.getVmImageBehaviour();
                      Flavour _defaultFlavour_1 = _vmImageBehaviour_1.getDefaultFlavour();
                      Amount<DataAmount> _sizeStorage = _defaultFlavour_1.getSizeStorage();
                      it_3.setCapacity(_sizeStorage);
                      Unit<DataAmount> _GIGA = SI.<DataAmount>GIGA(NonSI.BYTE);
                      Amount<DataAmount> _valueOf = Amount.<DataAmount>valueOf(0.05, _GIGA);
                      it_3.setUsedCapacity(_valueOf);
                      WhiteBoxVMImageBehaviour _vmImageBehaviour_2 = cvmi.getVmImageBehaviour();
                      VirtualDisk _vmImage = _vmImageBehaviour_2.getVmImage();
                      it_3.setParent(_vmImage);
                      VirtualDisk _parent = it_3.getParent();
                      StorageSpecification _storageLocation = _parent.getStorageLocation();
                      it_3.setStorageLocation(_storageLocation);
                    };
                    VirtualDisk _doubleArrow_2 = ObjectExtensions.<VirtualDisk>operator_doubleArrow(_createVirtualDisk, _function_5);
                    it_2.setRootDisk(_doubleArrow_2);
                  };
                  VMImageInstance _doubleArrow_2 = ObjectExtensions.<VMImageInstance>operator_doubleArrow(_createVMImageInstance, _function_4);
                  it_1.setVMImageInstance(_doubleArrow_2);
                  WhiteBoxVMBehaviour _createWhiteBoxVMBehaviour = this.laf.createWhiteBoxVMBehaviour();
                  final Procedure1<WhiteBoxVMBehaviour> _function_5 = (WhiteBoxVMBehaviour it_2) -> {
                    WhiteBoxVMImageBehaviour _vmImageBehaviour = cvmi.getVmImageBehaviour();
                    it_2.setVmImageBehaviour(_vmImageBehaviour);
                    WhiteBoxVMImageBehaviour _vmImageBehaviour_1 = cvmi.getVmImageBehaviour();
                    EList<ServiceEffect> _serviceEffects = _vmImageBehaviour_1.getServiceEffects();
                    for (final ServiceEffect se : _serviceEffects) {
                      EList<ServiceEffect> _serviceEffects_1 = it_2.getServiceEffects();
                      ServiceEffect _nonIdCopy = NonIdCopier.<ServiceEffect>nonIdCopy(se);
                      _serviceEffects_1.add(_nonIdCopy);
                    }
                  };
                  WhiteBoxVMBehaviour _doubleArrow_3 = ObjectExtensions.<WhiteBoxVMBehaviour>operator_doubleArrow(_createWhiteBoxVMBehaviour, _function_5);
                  it_1.setRuntimeApplicationModel(_doubleArrow_3);
                };
                final VirtualMachine vm = ObjectExtensions.<VirtualMachine>operator_doubleArrow(_createVirtualMachine, _function_1);
                EList<VirtualMachine> _virtualMachines = hyp.getVirtualMachines();
                _virtualMachines.add(vm);
                EList<ComposedVM> _composedVMs = it.getComposedVMs();
                ComposedVM _createComposedVM = this.laf.createComposedVM();
                final Procedure1<ComposedVM> _function_2 = (ComposedVM it_1) -> {
                  it_1.setComposedVMImage(cvmi);
                  it_1.setVirtualMachine(vm);
                };
                ComposedVM _doubleArrow = ObjectExtensions.<ComposedVM>operator_doubleArrow(_createComposedVM, _function_2);
                _composedVMs.add(_doubleArrow);
              }
            }
          }
        }
        EList<WhiteBoxUserBehaviourTemplate> _whiteBoxUserBehaviourTemplate = wbat.getWhiteBoxUserBehaviourTemplate();
        for (final WhiteBoxUserBehaviourTemplate tmpl : _whiteBoxUserBehaviourTemplate) {
          EList<WhiteBoxUserBehaviourInstance> _whiteBoxUserBehaviourInstance = it.getWhiteBoxUserBehaviourInstance();
          WhiteBoxUserBehaviourInstance _createWhiteBoxUserBehaviourInstance = this.laf.createWhiteBoxUserBehaviourInstance();
          final Procedure1<WhiteBoxUserBehaviourInstance> _function_1 = (WhiteBoxUserBehaviourInstance it_1) -> {
            EList<UserBehaviour> _userBehaviours = tmpl.getUserBehaviours();
            for (final UserBehaviour ub : _userBehaviours) {
              EList<UserBehaviour> _userBehaviours_1 = it_1.getUserBehaviours();
              UserBehaviour _nonIdCopy = NonIdCopier.<UserBehaviour>nonIdCopy(ub);
              _userBehaviours_1.add(_nonIdCopy);
            }
          };
          WhiteBoxUserBehaviourInstance _doubleArrow = ObjectExtensions.<WhiteBoxUserBehaviourInstance>operator_doubleArrow(_createWhiteBoxUserBehaviourInstance, _function_1);
          _whiteBoxUserBehaviourInstance.add(_doubleArrow);
        }
      };
      WhiteBoxApplicationInstance _doubleArrow = ObjectExtensions.<WhiteBoxApplicationInstance>operator_doubleArrow(_createWhiteBoxApplicationInstance, _function);
      _xblockexpression = _applicationInstances.add(_doubleArrow);
    }
    return _xblockexpression;
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
    EList<PowerDistributionUnit> _powerSupplies_3 = it.getPowerSupplies();
    PowerDistributionUnit _createPowerDistributionUnit_3 = this.pcoref.createPowerDistributionUnit();
    final Procedure1<PowerDistributionUnit> _function_3 = (PowerDistributionUnit it_1) -> {
      it_1.setName("Rack 3 PDU");
      Unit<Power> _KILO = SI.<Power>KILO(SI.WATT);
      Amount<Power> _valueOf = Amount.<Power>valueOf(2, _KILO);
      it_1.setSuppliablePeakPower(_valueOf);
      Unit<Power> _KILO_1 = SI.<Power>KILO(SI.WATT);
      Amount<Power> _valueOf_1 = Amount.<Power>valueOf(2, _KILO_1);
      it_1.setPowerCap(_valueOf_1);
      EList<PowerProvidingEntity> _powerProvidingEntities = it_1.getPowerProvidingEntities();
      _powerProvidingEntities.add(this.pduMain);
    };
    PowerDistributionUnit _doubleArrow_3 = ObjectExtensions.<PowerDistributionUnit>operator_doubleArrow(_createPowerDistributionUnit_3, _function_3);
    _powerSupplies_3.add((this.pduRack3 = _doubleArrow_3));
    EList<Rack> _racks = it.getRacks();
    Rack _createRack = this.pcoref.createRack();
    final Procedure1<Rack> _function_4 = (Rack it_1) -> {
      it_1.setName("FCO rack A5");
      EList<PowerDistributionUnit> _powerSupplies_4 = it_1.getPowerSupplies();
      _powerSupplies_4.add(this.pduRack1);
    };
    Rack _doubleArrow_4 = ObjectExtensions.<Rack>operator_doubleArrow(_createRack, _function_4);
    _racks.add((this.rack1 = _doubleArrow_4));
    EList<Rack> _racks_1 = it.getRacks();
    Rack _createRack_1 = this.pcoref.createRack();
    final Procedure1<Rack> _function_5 = (Rack it_1) -> {
      it_1.setName("FCO rack A6");
      EList<PowerDistributionUnit> _powerSupplies_4 = it_1.getPowerSupplies();
      _powerSupplies_4.add(this.pduRack2);
    };
    Rack _doubleArrow_5 = ObjectExtensions.<Rack>operator_doubleArrow(_createRack_1, _function_5);
    _racks_1.add((this.rack2 = _doubleArrow_5));
    EList<Rack> _racks_2 = it.getRacks();
    Rack _createRack_2 = this.pcoref.createRack();
    final Procedure1<Rack> _function_6 = (Rack it_1) -> {
      it_1.setName("FCO rack A7");
      EList<PowerDistributionUnit> _powerSupplies_4 = it_1.getPowerSupplies();
      _powerSupplies_4.add(this.pduRack3);
    };
    Rack _doubleArrow_6 = ObjectExtensions.<Rack>operator_doubleArrow(_createRack_2, _function_6);
    _racks_2.add((this.rack3 = _doubleArrow_6));
    EList<AbstractNode> _nodes = this.rack2.getNodes();
    ComputeNode _createComputeNode = this.pcoref.createComputeNode();
    final Procedure1<ComputeNode> _function_7 = (ComputeNode it_1) -> {
      it_1.setName("10.157.128.30");
      it_1.setState(NodeState.RUNNING);
      EList<ProcessingUnitSpecification> _cpuSpecifications = it_1.getCpuSpecifications();
      ProcessingUnitSpecification _createCpu32 = this.createCpu32();
      _cpuSpecifications.add((this.cpu1 = _createCpu32));
      EList<MemorySpecification> _memorySpecifications = it_1.getMemorySpecifications();
      MemorySpecification _createMemory128 = this.createMemory128();
      _memorySpecifications.add((this.mem1 = _createMemory128));
    };
    ComputeNode _doubleArrow_7 = ObjectExtensions.<ComputeNode>operator_doubleArrow(_createComputeNode, _function_7);
    _nodes.add((this.cn = _doubleArrow_7));
    EList<PowerConsumingEntity> _powerConsumingEntities = this.pduRack2.getPowerConsumingEntities();
    _powerConsumingEntities.add(this.cn);
    EList<AbstractNode> _nodes_1 = this.rack1.getNodes();
    ComputeNode _createComputeNode_1 = this.pcoref.createComputeNode();
    final Procedure1<ComputeNode> _function_8 = (ComputeNode it_1) -> {
      it_1.setName("10.157.128.31");
      it_1.setState(NodeState.RUNNING);
      EList<ProcessingUnitSpecification> _cpuSpecifications = it_1.getCpuSpecifications();
      ProcessingUnitSpecification _createCpu8 = this.createCpu8();
      _cpuSpecifications.add(_createCpu8);
      EList<MemorySpecification> _memorySpecifications = it_1.getMemorySpecifications();
      MemorySpecification _createMemory64 = this.createMemory64();
      _memorySpecifications.add(_createMemory64);
    };
    ComputeNode _doubleArrow_8 = ObjectExtensions.<ComputeNode>operator_doubleArrow(_createComputeNode_1, _function_8);
    _nodes_1.add((this.cn = _doubleArrow_8));
    EList<PowerConsumingEntity> _powerConsumingEntities_1 = this.pduRack1.getPowerConsumingEntities();
    _powerConsumingEntities_1.add(this.cn);
    EList<AbstractNode> _nodes_2 = this.rack1.getNodes();
    ComputeNode _createComputeNode_2 = this.pcoref.createComputeNode();
    final Procedure1<ComputeNode> _function_9 = (ComputeNode it_1) -> {
      it_1.setName("10.157.128.32");
      it_1.setState(NodeState.RUNNING);
      EList<ProcessingUnitSpecification> _cpuSpecifications = it_1.getCpuSpecifications();
      ProcessingUnitSpecification _createCpu32 = this.createCpu32();
      _cpuSpecifications.add(_createCpu32);
      EList<MemorySpecification> _memorySpecifications = it_1.getMemorySpecifications();
      MemorySpecification _createMemory128 = this.createMemory128();
      _memorySpecifications.add(_createMemory128);
    };
    ComputeNode _doubleArrow_9 = ObjectExtensions.<ComputeNode>operator_doubleArrow(_createComputeNode_2, _function_9);
    _nodes_2.add((this.cn = _doubleArrow_9));
    EList<PowerConsumingEntity> _powerConsumingEntities_2 = this.pduRack1.getPowerConsumingEntities();
    _powerConsumingEntities_2.add(this.cn);
    EList<AbstractNode> _nodes_3 = this.rack1.getNodes();
    ComputeNode _createComputeNode_3 = this.pcoref.createComputeNode();
    final Procedure1<ComputeNode> _function_10 = (ComputeNode it_1) -> {
      it_1.setName("10.158.128.11");
      it_1.setState(NodeState.RUNNING);
      EList<ProcessingUnitSpecification> _cpuSpecifications = it_1.getCpuSpecifications();
      ProcessingUnitSpecification _createCpu8 = this.createCpu8();
      _cpuSpecifications.add(_createCpu8);
      EList<MemorySpecification> _memorySpecifications = it_1.getMemorySpecifications();
      MemorySpecification _createMemory64 = this.createMemory64();
      _memorySpecifications.add(_createMemory64);
    };
    ComputeNode _doubleArrow_10 = ObjectExtensions.<ComputeNode>operator_doubleArrow(_createComputeNode_3, _function_10);
    _nodes_3.add((this.cn = _doubleArrow_10));
    EList<PowerConsumingEntity> _powerConsumingEntities_3 = this.pduRack1.getPowerConsumingEntities();
    _powerConsumingEntities_3.add(this.cn);
    EList<AbstractNode> _nodes_4 = this.rack3.getNodes();
    ComputeNode _createComputeNode_4 = this.pcoref.createComputeNode();
    final Procedure1<ComputeNode> _function_11 = (ComputeNode it_1) -> {
      it_1.setName("10.158.128.12");
      it_1.setState(NodeState.RUNNING);
      EList<ProcessingUnitSpecification> _cpuSpecifications = it_1.getCpuSpecifications();
      ProcessingUnitSpecification _createCpu4 = this.createCpu4();
      _cpuSpecifications.add(_createCpu4);
      EList<MemorySpecification> _memorySpecifications = it_1.getMemorySpecifications();
      MemorySpecification _createMemory32 = this.createMemory32();
      _memorySpecifications.add(_createMemory32);
    };
    ComputeNode _doubleArrow_11 = ObjectExtensions.<ComputeNode>operator_doubleArrow(_createComputeNode_4, _function_11);
    _nodes_4.add((this.cn = _doubleArrow_11));
    EList<PowerConsumingEntity> _powerConsumingEntities_4 = this.pduRack3.getPowerConsumingEntities();
    _powerConsumingEntities_4.add(this.cn);
    EList<AbstractNode> _nodes_5 = this.rack3.getNodes();
    ComputeNode _createComputeNode_5 = this.pcoref.createComputeNode();
    final Procedure1<ComputeNode> _function_12 = (ComputeNode it_1) -> {
      it_1.setName("10.158.128.13");
      it_1.setState(NodeState.RUNNING);
      EList<ProcessingUnitSpecification> _cpuSpecifications = it_1.getCpuSpecifications();
      ProcessingUnitSpecification _createCpu4 = this.createCpu4();
      _cpuSpecifications.add(_createCpu4);
      EList<MemorySpecification> _memorySpecifications = it_1.getMemorySpecifications();
      MemorySpecification _createMemory32 = this.createMemory32();
      _memorySpecifications.add(_createMemory32);
    };
    ComputeNode _doubleArrow_12 = ObjectExtensions.<ComputeNode>operator_doubleArrow(_createComputeNode_5, _function_12);
    _nodes_5.add((this.cn = _doubleArrow_12));
    EList<PowerConsumingEntity> _powerConsumingEntities_5 = this.pduRack3.getPowerConsumingEntities();
    _powerConsumingEntities_5.add(this.cn);
    EList<AbstractNode> _nodes_6 = this.rack3.getNodes();
    ComputeNode _createComputeNode_6 = this.pcoref.createComputeNode();
    final Procedure1<ComputeNode> _function_13 = (ComputeNode it_1) -> {
      it_1.setName("10.158.128.14");
      it_1.setState(NodeState.RUNNING);
      EList<ProcessingUnitSpecification> _cpuSpecifications = it_1.getCpuSpecifications();
      ProcessingUnitSpecification _createCpu8 = this.createCpu8();
      _cpuSpecifications.add(_createCpu8);
      EList<MemorySpecification> _memorySpecifications = it_1.getMemorySpecifications();
      MemorySpecification _createMemory64 = this.createMemory64();
      _memorySpecifications.add(_createMemory64);
    };
    ComputeNode _doubleArrow_13 = ObjectExtensions.<ComputeNode>operator_doubleArrow(_createComputeNode_6, _function_13);
    _nodes_6.add((this.cn = _doubleArrow_13));
    EList<PowerConsumingEntity> _powerConsumingEntities_6 = this.pduRack3.getPowerConsumingEntities();
    _powerConsumingEntities_6.add(this.cn);
    EList<AbstractNode> _nodes_7 = this.rack1.getNodes();
    ComputeNode _createComputeNode_7 = this.pcoref.createComputeNode();
    final Procedure1<ComputeNode> _function_14 = (ComputeNode it_1) -> {
      it_1.setName("10.158.128.15");
      it_1.setState(NodeState.RUNNING);
      EList<ProcessingUnitSpecification> _cpuSpecifications = it_1.getCpuSpecifications();
      ProcessingUnitSpecification _createCpu8 = this.createCpu8();
      _cpuSpecifications.add(_createCpu8);
      EList<MemorySpecification> _memorySpecifications = it_1.getMemorySpecifications();
      MemorySpecification _createMemory64 = this.createMemory64();
      _memorySpecifications.add(_createMemory64);
    };
    ComputeNode _doubleArrow_14 = ObjectExtensions.<ComputeNode>operator_doubleArrow(_createComputeNode_7, _function_14);
    _nodes_7.add((this.cn = _doubleArrow_14));
    EList<PowerConsumingEntity> _powerConsumingEntities_7 = this.pduRack1.getPowerConsumingEntities();
    _powerConsumingEntities_7.add(this.cn);
    EList<AbstractNode> _nodes_8 = this.rack1.getNodes();
    ComputeNode _createComputeNode_8 = this.pcoref.createComputeNode();
    final Procedure1<ComputeNode> _function_15 = (ComputeNode it_1) -> {
      it_1.setName("10.158.128.16");
      it_1.setState(NodeState.RUNNING);
      EList<ProcessingUnitSpecification> _cpuSpecifications = it_1.getCpuSpecifications();
      ProcessingUnitSpecification _createCpu8 = this.createCpu8();
      _cpuSpecifications.add(_createCpu8);
      EList<MemorySpecification> _memorySpecifications = it_1.getMemorySpecifications();
      MemorySpecification _createMemory64 = this.createMemory64();
      _memorySpecifications.add(_createMemory64);
    };
    ComputeNode _doubleArrow_15 = ObjectExtensions.<ComputeNode>operator_doubleArrow(_createComputeNode_8, _function_15);
    _nodes_8.add((this.cn = _doubleArrow_15));
    EList<PowerConsumingEntity> _powerConsumingEntities_8 = this.pduRack1.getPowerConsumingEntities();
    _powerConsumingEntities_8.add(this.cn);
    EList<AbstractNode> _nodes_9 = this.rack2.getNodes();
    ComputeNode _createComputeNode_9 = this.pcoref.createComputeNode();
    final Procedure1<ComputeNode> _function_16 = (ComputeNode it_1) -> {
      it_1.setName("10.158.128.17");
      it_1.setState(NodeState.RUNNING);
      EList<ProcessingUnitSpecification> _cpuSpecifications = it_1.getCpuSpecifications();
      ProcessingUnitSpecification _createCpu32 = this.createCpu32();
      _cpuSpecifications.add(_createCpu32);
      EList<MemorySpecification> _memorySpecifications = it_1.getMemorySpecifications();
      MemorySpecification _createMemory128 = this.createMemory128();
      _memorySpecifications.add(_createMemory128);
    };
    ComputeNode _doubleArrow_16 = ObjectExtensions.<ComputeNode>operator_doubleArrow(_createComputeNode_9, _function_16);
    _nodes_9.add((this.cn = _doubleArrow_16));
    EList<PowerConsumingEntity> _powerConsumingEntities_9 = this.pduRack2.getPowerConsumingEntities();
    _powerConsumingEntities_9.add(this.cn);
    EList<AbstractNode> _nodes_10 = this.rack3.getNodes();
    ComputeNode _createComputeNode_10 = this.pcoref.createComputeNode();
    final Procedure1<ComputeNode> _function_17 = (ComputeNode it_1) -> {
      it_1.setName("10.158.128.18");
      it_1.setState(NodeState.RUNNING);
      EList<ProcessingUnitSpecification> _cpuSpecifications = it_1.getCpuSpecifications();
      ProcessingUnitSpecification _createCpu32 = this.createCpu32();
      _cpuSpecifications.add(_createCpu32);
      EList<MemorySpecification> _memorySpecifications = it_1.getMemorySpecifications();
      MemorySpecification _createMemory128 = this.createMemory128();
      _memorySpecifications.add(_createMemory128);
    };
    ComputeNode _doubleArrow_17 = ObjectExtensions.<ComputeNode>operator_doubleArrow(_createComputeNode_10, _function_17);
    _nodes_10.add((this.cn = _doubleArrow_17));
    EList<PowerConsumingEntity> _powerConsumingEntities_10 = this.pduRack3.getPowerConsumingEntities();
    _powerConsumingEntities_10.add(this.cn);
    this.createClusterStorage(this.rack1, this.pduRack1, "CEPH Cluster 1");
    NetworkAttachedStorage _createClusterStorage = this.createClusterStorage(this.rack2, this.pduRack2, "CEPH Cluster 2");
    EList<StorageSpecification> _storageSpecifications = _createClusterStorage.getStorageSpecifications();
    StorageSpecification _last = IterableExtensions.<StorageSpecification>last(_storageSpecifications);
    this.storage1 = _last;
    EList<NetworkInterconnect> _networkInterconnects = it.getNetworkInterconnects();
    NetworkInterconnect _createNetworkInterconnect = this.pcoref.createNetworkInterconnect();
    final Procedure1<NetworkInterconnect> _function_18 = (NetworkInterconnect it_1) -> {
      it_1.setName("Single NIC Layout");
      EList<AbstractNode> _nodes_11 = this.rack1.getNodes();
      for (final AbstractNode an : _nodes_11) {
        EList<ConnectedEntity> _connectedEntities = it_1.getConnectedEntities();
        _connectedEntities.add(an);
      }
      Bandwidth _createBandwidth = this.putilf.createBandwidth();
      final Procedure1<Bandwidth> _function_19 = (Bandwidth it_2) -> {
        Unit<DataRate> _GIGA = SI.<DataRate>GIGA(DataRate.UNIT);
        Amount<DataRate> _valueOf = Amount.<DataRate>valueOf(1.0, _GIGA);
        it_2.setValue(_valueOf);
      };
      Bandwidth _doubleArrow_18 = ObjectExtensions.<Bandwidth>operator_doubleArrow(_createBandwidth, _function_19);
      it_1.setBandwidth(_doubleArrow_18);
    };
    NetworkInterconnect _doubleArrow_18 = ObjectExtensions.<NetworkInterconnect>operator_doubleArrow(_createNetworkInterconnect, _function_18);
    _networkInterconnects.add((this.nic1 = _doubleArrow_18));
    EList<Switch> _switches = it.getSwitches();
    Switch _createSwitch = this.pcoref.createSwitch();
    final Procedure1<Switch> _function_19 = (Switch it_1) -> {
      it_1.setName("Single Switch Layout");
    };
    Switch _doubleArrow_19 = ObjectExtensions.<Switch>operator_doubleArrow(_createSwitch, _function_19);
    _switches.add((this.switch1 = _doubleArrow_19));
    EList<ConnectedEntity> _connectedEntities = this.nic1.getConnectedEntities();
    _connectedEntities.add(this.switch1);
    EList<Cluster> _clusters = it.getClusters();
    Cluster _createCluster = this.pcoref.createCluster();
    final Procedure1<Cluster> _function_20 = (Cluster it_1) -> {
      it_1.setName("Single Cluster Layout");
      it_1.setClusterId(1);
      EList<AbstractNode> _nodes_11 = this.rack1.getNodes();
      for (final AbstractNode an : _nodes_11) {
        EList<AbstractNode> _containedNodes = it_1.getContainedNodes();
        _containedNodes.add(an);
      }
      EList<AbstractNode> _nodes_12 = this.rack2.getNodes();
      for (final AbstractNode an_1 : _nodes_12) {
        EList<AbstractNode> _containedNodes_1 = it_1.getContainedNodes();
        _containedNodes_1.add(an_1);
      }
      EList<AbstractNode> _nodes_13 = this.rack3.getNodes();
      for (final AbstractNode an_2 : _nodes_13) {
        EList<AbstractNode> _containedNodes_2 = it_1.getContainedNodes();
        _containedNodes_2.add(an_2);
      }
    };
    Cluster _doubleArrow_20 = ObjectExtensions.<Cluster>operator_doubleArrow(_createCluster, _function_20);
    _clusters.add(_doubleArrow_20);
  }));
  
  public final LogicalDCModel logicalDcModel = ObjectExtensions.<LogicalDCModel>operator_doubleArrow(this.lcoref.createLogicalDCModel(), ((Procedure1<LogicalDCModel>) (LogicalDCModel it) -> {
    Amount<Duration> _valueOf = Amount.<Duration>valueOf(60, SI.SECOND);
    it.setCyclicOptimizationInterval(_valueOf);
    EList<Flavour> _flavours = it.getFlavours();
    Flavour _createFlavour = this.lcoref.createFlavour();
    final Procedure1<Flavour> _function = (Flavour it_1) -> {
      it_1.setName("Small");
      it_1.setFlavourRefVMI("XXXX-XXXX-XXXX-XXXX");
      it_1.setNumberVirtualCores(1);
      Unit<DataAmount> _GIGA = SI.<DataAmount>GIGA(NonSI.BYTE);
      Amount<DataAmount> _valueOf_1 = Amount.<DataAmount>valueOf(1, _GIGA);
      it_1.setSizeRam(_valueOf_1);
      Unit<DataAmount> _GIGA_1 = SI.<DataAmount>GIGA(NonSI.BYTE);
      Amount<DataAmount> _valueOf_2 = Amount.<DataAmount>valueOf(20, _GIGA_1);
      it_1.setSizeStorage(_valueOf_2);
    };
    Flavour _doubleArrow = ObjectExtensions.<Flavour>operator_doubleArrow(_createFlavour, _function);
    _flavours.add((this.flavourSmall = _doubleArrow));
    EList<Flavour> _flavours_1 = it.getFlavours();
    Flavour _createFlavour_1 = this.lcoref.createFlavour();
    final Procedure1<Flavour> _function_1 = (Flavour it_1) -> {
      it_1.setName("Small but Powerful");
      it_1.setFlavourRefVMI("XXXX-XXXX-XXXX-XXYY");
      it_1.setNumberVirtualCores(2);
      Unit<DataAmount> _GIGA = SI.<DataAmount>GIGA(NonSI.BYTE);
      Amount<DataAmount> _valueOf_1 = Amount.<DataAmount>valueOf(1, _GIGA);
      it_1.setSizeRam(_valueOf_1);
      Unit<DataAmount> _GIGA_1 = SI.<DataAmount>GIGA(NonSI.BYTE);
      Amount<DataAmount> _valueOf_2 = Amount.<DataAmount>valueOf(20, _GIGA_1);
      it_1.setSizeStorage(_valueOf_2);
    };
    Flavour _doubleArrow_1 = ObjectExtensions.<Flavour>operator_doubleArrow(_createFlavour_1, _function_1);
    _flavours_1.add((this.flavourSmallPowerful = _doubleArrow_1));
    EList<Flavour> _flavours_2 = it.getFlavours();
    Flavour _createFlavour_2 = this.lcoref.createFlavour();
    final Procedure1<Flavour> _function_2 = (Flavour it_1) -> {
      it_1.setName("Medium");
      it_1.setFlavourRefVMI("XXXX-XXXX-XXXX-YYYY");
      it_1.setNumberVirtualCores(2);
      Unit<DataAmount> _GIGA = SI.<DataAmount>GIGA(NonSI.BYTE);
      Amount<DataAmount> _valueOf_1 = Amount.<DataAmount>valueOf(2, _GIGA);
      it_1.setSizeRam(_valueOf_1);
      Unit<DataAmount> _GIGA_1 = SI.<DataAmount>GIGA(NonSI.BYTE);
      Amount<DataAmount> _valueOf_2 = Amount.<DataAmount>valueOf(20, _GIGA_1);
      it_1.setSizeStorage(_valueOf_2);
    };
    Flavour _doubleArrow_2 = ObjectExtensions.<Flavour>operator_doubleArrow(_createFlavour_2, _function_2);
    _flavours_2.add((this.flavourMedium = _doubleArrow_2));
    EList<Flavour> _flavours_3 = it.getFlavours();
    Flavour _createFlavour_3 = this.lcoref.createFlavour();
    final Procedure1<Flavour> _function_3 = (Flavour it_1) -> {
      it_1.setName("Medium with larger Memory");
      it_1.setFlavourRefVMI("XXXX-XXXX-XXXX-YYZZ");
      it_1.setNumberVirtualCores(2);
      Unit<DataAmount> _GIGA = SI.<DataAmount>GIGA(NonSI.BYTE);
      Amount<DataAmount> _valueOf_1 = Amount.<DataAmount>valueOf(4, _GIGA);
      it_1.setSizeRam(_valueOf_1);
      Unit<DataAmount> _GIGA_1 = SI.<DataAmount>GIGA(NonSI.BYTE);
      Amount<DataAmount> _valueOf_2 = Amount.<DataAmount>valueOf(20, _GIGA_1);
      it_1.setSizeStorage(_valueOf_2);
    };
    Flavour _doubleArrow_3 = ObjectExtensions.<Flavour>operator_doubleArrow(_createFlavour_3, _function_3);
    _flavours_3.add((this.flavourMediumMemory = _doubleArrow_3));
    EList<Flavour> _flavours_4 = it.getFlavours();
    Flavour _createFlavour_4 = this.lcoref.createFlavour();
    final Procedure1<Flavour> _function_4 = (Flavour it_1) -> {
      it_1.setName("Large");
      it_1.setFlavourRefVMI("XXXX-XXXX-XXXX-ZZZZ");
      it_1.setNumberVirtualCores(4);
      Unit<DataAmount> _GIGA = SI.<DataAmount>GIGA(NonSI.BYTE);
      Amount<DataAmount> _valueOf_1 = Amount.<DataAmount>valueOf(8, _GIGA);
      it_1.setSizeRam(_valueOf_1);
      Unit<DataAmount> _GIGA_1 = SI.<DataAmount>GIGA(NonSI.BYTE);
      Amount<DataAmount> _valueOf_2 = Amount.<DataAmount>valueOf(20, _GIGA_1);
      it_1.setSizeStorage(_valueOf_2);
    };
    Flavour _doubleArrow_4 = ObjectExtensions.<Flavour>operator_doubleArrow(_createFlavour_4, _function_4);
    _flavours_4.add((this.flavourLarge = _doubleArrow_4));
    EList<VirtualDisk> _volumesAndImages = it.getVolumesAndImages();
    VMImage _createVmImageGeneric = this.createVmImageGeneric("KvmHypervisor", this.storage1);
    _volumesAndImages.add((this.vmimageKvmHypervisor = _createVmImageGeneric));
    EList<VirtualDisk> _volumesAndImages_1 = it.getVolumesAndImages();
    VMImage _createVmImageGeneric_1 = this.createVmImageGeneric("LoadBalancerHttp", this.storage1);
    _volumesAndImages_1.add((this.vmimageLoadBalancerHttp = _createVmImageGeneric_1));
    EList<VirtualDisk> _volumesAndImages_2 = it.getVolumesAndImages();
    VMImage _createVmImageGeneric_2 = this.createVmImageGeneric("Frontend", this.storage1);
    _volumesAndImages_2.add((this.vmimageFrontend = _createVmImageGeneric_2));
    EList<VirtualDisk> _volumesAndImages_3 = it.getVolumesAndImages();
    VMImage _createVmImageGeneric_3 = this.createVmImageGeneric("Master", this.storage1);
    _volumesAndImages_3.add((this.vmimageMaster = _createVmImageGeneric_3));
    EList<VirtualDisk> _volumesAndImages_4 = it.getVolumesAndImages();
    VMImage _createVmImageGeneric_4 = this.createVmImageGeneric("Cassandra", this.storage1);
    _volumesAndImages_4.add((this.vmimageCassandra = _createVmImageGeneric_4));
    EList<VirtualDisk> _volumesAndImages_5 = it.getVolumesAndImages();
    VMImage _createVmImageGeneric_5 = this.createVmImageGeneric("Redis", this.storage1);
    _volumesAndImages_5.add((this.vmimageRedis = _createVmImageGeneric_5));
    EList<VirtualDisk> _volumesAndImages_6 = it.getVolumesAndImages();
    VMImage _createVmImageGeneric_6 = this.createVmImageGeneric("LoadBalancerPgpool", this.storage1);
    _volumesAndImages_6.add((this.vmimageLoadBalancerPgpool = _createVmImageGeneric_6));
    EList<VirtualDisk> _volumesAndImages_7 = it.getVolumesAndImages();
    VMImage _createVmImageGeneric_7 = this.createVmImageGeneric("Postgresql / DataPlay Permanent Storage", this.storage1);
    _volumesAndImages_7.add((this.vmimagePostgresql = _createVmImageGeneric_7));
    EList<VirtualNetwork> _virtualNetworks = it.getVirtualNetworks();
    VirtualNetwork _createVirtualNetwork = this.lcoref.createVirtualNetwork();
    final Procedure1<VirtualNetwork> _function_5 = (VirtualNetwork it_1) -> {
      it_1.setName("Single virtual Network Layout");
    };
    VirtualNetwork _doubleArrow_5 = ObjectExtensions.<VirtualNetwork>operator_doubleArrow(_createVirtualNetwork, _function_5);
    _virtualNetworks.add((this.vnetwork = _doubleArrow_5));
    EList<ServiceInterface> _serviceInterfaces = it.getServiceInterfaces();
    ServiceInterface _createServiceInterface = this.laf.createServiceInterface();
    final Procedure1<ServiceInterface> _function_6 = (ServiceInterface it_1) -> {
      it_1.setName("http");
      EList<ServiceOperation> _serviceOperations = it_1.getServiceOperations();
      ServiceOperation _createServiceOperation = this.laf.createServiceOperation();
      final Procedure1<ServiceOperation> _function_7 = (ServiceOperation it_2) -> {
        it_2.setName("get");
      };
      ServiceOperation _doubleArrow_6 = ObjectExtensions.<ServiceOperation>operator_doubleArrow(_createServiceOperation, _function_7);
      _serviceOperations.add((this.soHttpGet = _doubleArrow_6));
      EList<ServiceOperation> _serviceOperations_1 = it_1.getServiceOperations();
      ServiceOperation _createServiceOperation_1 = this.laf.createServiceOperation();
      final Procedure1<ServiceOperation> _function_8 = (ServiceOperation it_2) -> {
        it_2.setName("put");
      };
      ServiceOperation _doubleArrow_7 = ObjectExtensions.<ServiceOperation>operator_doubleArrow(_createServiceOperation_1, _function_8);
      _serviceOperations_1.add(_doubleArrow_7);
      EList<ServiceOperation> _serviceOperations_2 = it_1.getServiceOperations();
      ServiceOperation _createServiceOperation_2 = this.laf.createServiceOperation();
      final Procedure1<ServiceOperation> _function_9 = (ServiceOperation it_2) -> {
        it_2.setName("post");
      };
      ServiceOperation _doubleArrow_8 = ObjectExtensions.<ServiceOperation>operator_doubleArrow(_createServiceOperation_2, _function_9);
      _serviceOperations_2.add(_doubleArrow_8);
      EList<ServiceOperation> _serviceOperations_3 = it_1.getServiceOperations();
      ServiceOperation _createServiceOperation_3 = this.laf.createServiceOperation();
      final Procedure1<ServiceOperation> _function_10 = (ServiceOperation it_2) -> {
        it_2.setName("delete");
      };
      ServiceOperation _doubleArrow_9 = ObjectExtensions.<ServiceOperation>operator_doubleArrow(_createServiceOperation_3, _function_10);
      _serviceOperations_3.add(_doubleArrow_9);
    };
    ServiceInterface _doubleArrow_6 = ObjectExtensions.<ServiceInterface>operator_doubleArrow(_createServiceInterface, _function_6);
    _serviceInterfaces.add((this.ifaceHttp = _doubleArrow_6));
    EList<ServiceInterface> _serviceInterfaces_1 = it.getServiceInterfaces();
    ServiceInterface _createServiceInterface_1 = this.laf.createServiceInterface();
    final Procedure1<ServiceInterface> _function_7 = (ServiceInterface it_1) -> {
      it_1.setName("sql");
      EList<ServiceOperation> _serviceOperations = it_1.getServiceOperations();
      ServiceOperation _createServiceOperation = this.laf.createServiceOperation();
      final Procedure1<ServiceOperation> _function_8 = (ServiceOperation it_2) -> {
        it_2.setName("execute");
      };
      ServiceOperation _doubleArrow_7 = ObjectExtensions.<ServiceOperation>operator_doubleArrow(_createServiceOperation, _function_8);
      _serviceOperations.add((this.soSqlExecute = _doubleArrow_7));
    };
    ServiceInterface _doubleArrow_7 = ObjectExtensions.<ServiceInterface>operator_doubleArrow(_createServiceInterface_1, _function_7);
    _serviceInterfaces_1.add((this.ifaceSql = _doubleArrow_7));
    EList<ServiceInterface> _serviceInterfaces_2 = it.getServiceInterfaces();
    ServiceInterface _createServiceInterface_2 = this.laf.createServiceInterface();
    final Procedure1<ServiceInterface> _function_8 = (ServiceInterface it_1) -> {
      it_1.setName("generic");
      EList<ServiceOperation> _serviceOperations = it_1.getServiceOperations();
      ServiceOperation _createServiceOperation = this.laf.createServiceOperation();
      final Procedure1<ServiceOperation> _function_9 = (ServiceOperation it_2) -> {
        it_2.setName("process");
      };
      ServiceOperation _doubleArrow_8 = ObjectExtensions.<ServiceOperation>operator_doubleArrow(_createServiceOperation, _function_9);
      _serviceOperations.add((this.soGenericProcess = _doubleArrow_8));
    };
    ServiceInterface _doubleArrow_8 = ObjectExtensions.<ServiceInterface>operator_doubleArrow(_createServiceInterface_2, _function_8);
    _serviceInterfaces_2.add((this.ifaceGeneric = _doubleArrow_8));
    EList<ApplicationTemplate> _applicationTemplates = it.getApplicationTemplates();
    WhiteBoxApplicationTemplate _createWhiteBoxApplicationTemplate = this.laf.createWhiteBoxApplicationTemplate();
    final Procedure1<WhiteBoxApplicationTemplate> _function_9 = (WhiteBoxApplicationTemplate it_1) -> {
      it_1.setName("DataPlay");
      EList<ComposedVMImage> _composedVMImages = it_1.getComposedVMImages();
      ComposedVMImage _createComposedVMImage = this.laf.createComposedVMImage();
      final Procedure1<ComposedVMImage> _function_10 = (ComposedVMImage it_2) -> {
        it_2.setName("Load Balancer Frontend");
        EList<ProvidedRole> _providedRoles = it_2.getProvidedRoles();
        ServiceProvidedRole _createServiceProvidedRole = this.laf.createServiceProvidedRole();
        final Procedure1<ServiceProvidedRole> _function_11 = (ServiceProvidedRole it_3) -> {
          it_3.setName("Provided_LBFrontend_HTTP");
          it_3.setServiceInterface(this.ifaceHttp);
        };
        ServiceProvidedRole _doubleArrow_9 = ObjectExtensions.<ServiceProvidedRole>operator_doubleArrow(_createServiceProvidedRole, _function_11);
        _providedRoles.add((this.provroleLBFrontend = _doubleArrow_9));
        EList<RequiredRole> _requiredRoles = it_2.getRequiredRoles();
        ServiceRequiredRole _createServiceRequiredRole = this.laf.createServiceRequiredRole();
        final Procedure1<ServiceRequiredRole> _function_12 = (ServiceRequiredRole it_3) -> {
          it_3.setName("Required_LBFrontend_Frontend_HTTP");
          it_3.setServiceInterface(this.ifaceHttp);
        };
        ServiceRequiredRole _doubleArrow_10 = ObjectExtensions.<ServiceRequiredRole>operator_doubleArrow(_createServiceRequiredRole, _function_12);
        _requiredRoles.add((this.reqroleLBFrontendFrontend = _doubleArrow_10));
        Unit<Frequency> _KILO = SI.<Frequency>KILO(SI.HERTZ);
        WhiteBoxVMImageBehaviour _createWhiteBoxImageBehaviour = this.createWhiteBoxImageBehaviour(
          this.vmimageLoadBalancerHttp, this.flavourMedium, this.provroleLBFrontend, this.soHttpGet, this.reqroleLBFrontendFrontend, this.soHttpGet, null, 
          "100", _KILO, null, null, 
          null);
        it_2.setVmImageBehaviour((this.vmimagebehaviourLoadBalancerFrontend = _createWhiteBoxImageBehaviour));
      };
      ComposedVMImage _doubleArrow_9 = ObjectExtensions.<ComposedVMImage>operator_doubleArrow(_createComposedVMImage, _function_10);
      _composedVMImages.add(_doubleArrow_9);
      EList<ServiceProvidedRole> _userFacingServices = it_1.getUserFacingServices();
      _userFacingServices.add(this.provroleLBFrontend);
      EList<ComposedVMImage> _composedVMImages_1 = it_1.getComposedVMImages();
      ComposedVMImage _createComposedVMImage_1 = this.laf.createComposedVMImage();
      final Procedure1<ComposedVMImage> _function_11 = (ComposedVMImage it_2) -> {
        it_2.setName("Frontend");
        EList<ProvidedRole> _providedRoles = it_2.getProvidedRoles();
        ServiceProvidedRole _createServiceProvidedRole = this.laf.createServiceProvidedRole();
        final Procedure1<ServiceProvidedRole> _function_12 = (ServiceProvidedRole it_3) -> {
          it_3.setName("Provided_Frontend_HTTP");
          it_3.setServiceInterface(this.ifaceHttp);
        };
        ServiceProvidedRole _doubleArrow_10 = ObjectExtensions.<ServiceProvidedRole>operator_doubleArrow(_createServiceProvidedRole, _function_12);
        _providedRoles.add((this.provroleFrontend = _doubleArrow_10));
        EList<RequiredRole> _requiredRoles = it_2.getRequiredRoles();
        ServiceRequiredRole _createServiceRequiredRole = this.laf.createServiceRequiredRole();
        final Procedure1<ServiceRequiredRole> _function_13 = (ServiceRequiredRole it_3) -> {
          it_3.setName("Required_Frontend_LBMaster_HTTP");
          it_3.setServiceInterface(this.ifaceHttp);
        };
        ServiceRequiredRole _doubleArrow_11 = ObjectExtensions.<ServiceRequiredRole>operator_doubleArrow(_createServiceRequiredRole, _function_13);
        _requiredRoles.add((this.reqroleFrontendLBMaster = _doubleArrow_11));
        Unit<Frequency> _KILO = SI.<Frequency>KILO(SI.HERTZ);
        Unit<DataAmount> _MEGA = SI.<DataAmount>MEGA(NonSI.BYTE);
        WhiteBoxVMImageBehaviour _createWhiteBoxImageBehaviour = this.createWhiteBoxImageBehaviour(this.vmimageFrontend, this.flavourSmallPowerful, this.provroleFrontend, this.soHttpGet, 
          this.reqroleFrontendLBMaster, this.soHttpGet, null, 
          "100", _KILO, "2", _MEGA, 
          null);
        it_2.setVmImageBehaviour((this.vmimagebehaviourFrontend = _createWhiteBoxImageBehaviour));
      };
      ComposedVMImage _doubleArrow_10 = ObjectExtensions.<ComposedVMImage>operator_doubleArrow(_createComposedVMImage_1, _function_11);
      _composedVMImages_1.add(_doubleArrow_10);
      EList<ComposedVMImage> _composedVMImages_2 = it_1.getComposedVMImages();
      ComposedVMImage _createComposedVMImage_2 = this.laf.createComposedVMImage();
      final Procedure1<ComposedVMImage> _function_12 = (ComposedVMImage it_2) -> {
        it_2.setName("Load Balancer Master");
        EList<ProvidedRole> _providedRoles = it_2.getProvidedRoles();
        ServiceProvidedRole _createServiceProvidedRole = this.laf.createServiceProvidedRole();
        final Procedure1<ServiceProvidedRole> _function_13 = (ServiceProvidedRole it_3) -> {
          it_3.setName("Provided_LBMaster_HTTP");
          it_3.setServiceInterface(this.ifaceHttp);
        };
        ServiceProvidedRole _doubleArrow_11 = ObjectExtensions.<ServiceProvidedRole>operator_doubleArrow(_createServiceProvidedRole, _function_13);
        _providedRoles.add((this.provroleLBMaster = _doubleArrow_11));
        EList<RequiredRole> _requiredRoles = it_2.getRequiredRoles();
        ServiceRequiredRole _createServiceRequiredRole = this.laf.createServiceRequiredRole();
        final Procedure1<ServiceRequiredRole> _function_14 = (ServiceRequiredRole it_3) -> {
          it_3.setName("Required_LBMaster_Master_HTTP");
          it_3.setServiceInterface(this.ifaceHttp);
        };
        ServiceRequiredRole _doubleArrow_12 = ObjectExtensions.<ServiceRequiredRole>operator_doubleArrow(_createServiceRequiredRole, _function_14);
        _requiredRoles.add((this.reqroleLBMasterMaster = _doubleArrow_12));
        VariableAssignment _createVariableAssignment = this.laf.createVariableAssignment();
        final Procedure1<VariableAssignment> _function_15 = (VariableAssignment it_3) -> {
          it_3.setVariable(ControlFlowVariable.REQUESTBYTESIZE);
          it_3.setValue("2*REQUEST.BYTESIZE");
        };
        VariableAssignment _doubleArrow_13 = ObjectExtensions.<VariableAssignment>operator_doubleArrow(_createVariableAssignment, _function_15);
        Unit<Frequency> _KILO = SI.<Frequency>KILO(SI.HERTZ);
        WhiteBoxVMImageBehaviour _createWhiteBoxImageBehaviour = this.createWhiteBoxImageBehaviour(
          this.vmimageLoadBalancerHttp, this.flavourMedium, this.provroleLBMaster, 
          this.soHttpGet, this.reqroleLBMasterMaster, this.soHttpGet, _doubleArrow_13, 
          "100", _KILO, null, null, 
          null);
        it_2.setVmImageBehaviour((this.vmimagebehaviourLoadBalancerMaster = _createWhiteBoxImageBehaviour));
      };
      ComposedVMImage _doubleArrow_11 = ObjectExtensions.<ComposedVMImage>operator_doubleArrow(_createComposedVMImage_2, _function_12);
      _composedVMImages_2.add(_doubleArrow_11);
      EList<ComposedVMImage> _composedVMImages_3 = it_1.getComposedVMImages();
      ComposedVMImage _createComposedVMImage_3 = this.laf.createComposedVMImage();
      final Procedure1<ComposedVMImage> _function_13 = (ComposedVMImage it_2) -> {
        it_2.setName("Master");
        EList<ProvidedRole> _providedRoles = it_2.getProvidedRoles();
        ServiceProvidedRole _createServiceProvidedRole = this.laf.createServiceProvidedRole();
        final Procedure1<ServiceProvidedRole> _function_14 = (ServiceProvidedRole it_3) -> {
          it_3.setName("Provided_Master_HTTP");
          it_3.setServiceInterface(this.ifaceHttp);
        };
        ServiceProvidedRole _doubleArrow_12 = ObjectExtensions.<ServiceProvidedRole>operator_doubleArrow(_createServiceProvidedRole, _function_14);
        _providedRoles.add((this.provroleMaster = _doubleArrow_12));
        EList<RequiredRole> _requiredRoles = it_2.getRequiredRoles();
        ServiceRequiredRole _createServiceRequiredRole = this.laf.createServiceRequiredRole();
        final Procedure1<ServiceRequiredRole> _function_15 = (ServiceRequiredRole it_3) -> {
          it_3.setName("Required_Master_Pgpool_SQL");
          it_3.setServiceInterface(this.ifaceSql);
        };
        ServiceRequiredRole _doubleArrow_13 = ObjectExtensions.<ServiceRequiredRole>operator_doubleArrow(_createServiceRequiredRole, _function_15);
        _requiredRoles.add((this.reqroleMasterLBPgpool = _doubleArrow_13));
        EList<RequiredRole> _requiredRoles_1 = it_2.getRequiredRoles();
        ServiceRequiredRole _createServiceRequiredRole_1 = this.laf.createServiceRequiredRole();
        final Procedure1<ServiceRequiredRole> _function_16 = (ServiceRequiredRole it_3) -> {
          it_3.setName("Required_Master_Redis_GENERIC");
          it_3.setServiceInterface(this.ifaceGeneric);
        };
        ServiceRequiredRole _doubleArrow_14 = ObjectExtensions.<ServiceRequiredRole>operator_doubleArrow(_createServiceRequiredRole_1, _function_16);
        _requiredRoles_1.add((this.reqroleMasterRedis = _doubleArrow_14));
        EList<RequiredRole> _requiredRoles_2 = it_2.getRequiredRoles();
        ServiceRequiredRole _createServiceRequiredRole_2 = this.laf.createServiceRequiredRole();
        final Procedure1<ServiceRequiredRole> _function_17 = (ServiceRequiredRole it_3) -> {
          it_3.setName("Required_Master_Cassandra_GENERIC");
          it_3.setServiceInterface(this.ifaceGeneric);
        };
        ServiceRequiredRole _doubleArrow_15 = ObjectExtensions.<ServiceRequiredRole>operator_doubleArrow(_createServiceRequiredRole_2, _function_17);
        _requiredRoles_2.add((this.reqroleMasterCassandra = _doubleArrow_15));
        Unit<Frequency> _KILO = SI.<Frequency>KILO(SI.HERTZ);
        Unit<DataAmount> _MEGA = SI.<DataAmount>MEGA(NonSI.BYTE);
        WhiteBoxVMImageBehaviour _createWhiteBoxImageBehaviour = this.createWhiteBoxImageBehaviour(
          this.vmimageMaster, this.flavourMedium, this.provroleMaster, this.soHttpGet, 
          this.reqroleMasterLBPgpool, this.soSqlExecute, null, 
          "3", _KILO, "5", _MEGA, 
          null);
        it_2.setVmImageBehaviour((this.vmimagebehaviourMaster = _createWhiteBoxImageBehaviour));
      };
      ComposedVMImage _doubleArrow_12 = ObjectExtensions.<ComposedVMImage>operator_doubleArrow(_createComposedVMImage_3, _function_13);
      _composedVMImages_3.add(_doubleArrow_12);
      EList<ComposedVMImage> _composedVMImages_4 = it_1.getComposedVMImages();
      ComposedVMImage _createComposedVMImage_4 = this.laf.createComposedVMImage();
      final Procedure1<ComposedVMImage> _function_14 = (ComposedVMImage it_2) -> {
        it_2.setName("Load Balancer PgPool");
        EList<ProvidedRole> _providedRoles = it_2.getProvidedRoles();
        ServiceProvidedRole _createServiceProvidedRole = this.laf.createServiceProvidedRole();
        final Procedure1<ServiceProvidedRole> _function_15 = (ServiceProvidedRole it_3) -> {
          it_3.setName("Provided_LBPgpool_SQL");
          it_3.setServiceInterface(this.ifaceSql);
        };
        ServiceProvidedRole _doubleArrow_13 = ObjectExtensions.<ServiceProvidedRole>operator_doubleArrow(_createServiceProvidedRole, _function_15);
        _providedRoles.add((this.provroleLBPgpool = _doubleArrow_13));
        EList<RequiredRole> _requiredRoles = it_2.getRequiredRoles();
        ServiceRequiredRole _createServiceRequiredRole = this.laf.createServiceRequiredRole();
        final Procedure1<ServiceRequiredRole> _function_16 = (ServiceRequiredRole it_3) -> {
          it_3.setName("Required_LBPgPool_Postgresql_SQL");
          it_3.setServiceInterface(this.ifaceHttp);
        };
        ServiceRequiredRole _doubleArrow_14 = ObjectExtensions.<ServiceRequiredRole>operator_doubleArrow(_createServiceRequiredRole, _function_16);
        _requiredRoles.add((this.reqroleLBPgpoolPostgresql = _doubleArrow_14));
        VariableAssignment _createVariableAssignment = this.laf.createVariableAssignment();
        final Procedure1<VariableAssignment> _function_17 = (VariableAssignment it_3) -> {
          it_3.setVariable(ControlFlowVariable.REQUESTBYTESIZE);
          it_3.setValue("70");
        };
        VariableAssignment _doubleArrow_15 = ObjectExtensions.<VariableAssignment>operator_doubleArrow(_createVariableAssignment, _function_17);
        Unit<Frequency> _KILO = SI.<Frequency>KILO(SI.HERTZ);
        WhiteBoxVMImageBehaviour _createWhiteBoxImageBehaviour = this.createWhiteBoxImageBehaviour(
          this.vmimageLoadBalancerPgpool, this.flavourMediumMemory, this.provroleLBPgpool, 
          this.soSqlExecute, this.reqroleLBPgpoolPostgresql, this.soSqlExecute, _doubleArrow_15, 
          "100", _KILO, null, null, null);
        it_2.setVmImageBehaviour((this.vmimagebehaviourLoadBalancerPgpool = _createWhiteBoxImageBehaviour));
      };
      ComposedVMImage _doubleArrow_13 = ObjectExtensions.<ComposedVMImage>operator_doubleArrow(_createComposedVMImage_4, _function_14);
      _composedVMImages_4.add(_doubleArrow_13);
      EList<ComposedVMImage> _composedVMImages_5 = it_1.getComposedVMImages();
      ComposedVMImage _createComposedVMImage_5 = this.laf.createComposedVMImage();
      final Procedure1<ComposedVMImage> _function_15 = (ComposedVMImage it_2) -> {
        it_2.setName("Cassandra");
        EList<ProvidedRole> _providedRoles = it_2.getProvidedRoles();
        ServiceProvidedRole _createServiceProvidedRole = this.laf.createServiceProvidedRole();
        final Procedure1<ServiceProvidedRole> _function_16 = (ServiceProvidedRole it_3) -> {
          it_3.setName("Provided_Cassandra_GENERIC");
          it_3.setServiceInterface(this.ifaceGeneric);
        };
        ServiceProvidedRole _doubleArrow_14 = ObjectExtensions.<ServiceProvidedRole>operator_doubleArrow(_createServiceProvidedRole, _function_16);
        _providedRoles.add((this.provroleCassandra = _doubleArrow_14));
        Unit<Frequency> _KILO = SI.<Frequency>KILO(SI.HERTZ);
        Unit<DataAmount> _MEGA = SI.<DataAmount>MEGA(NonSI.BYTE);
        WhiteBoxVMImageBehaviour _createWhiteBoxImageBehaviour = this.createWhiteBoxImageBehaviour(
          this.vmimageCassandra, this.flavourLarge, this.provroleCassandra, 
          this.soGenericProcess, null, null, null, 
          "1", _KILO, "1", _MEGA, 
          null);
        it_2.setVmImageBehaviour((this.vmimagebehaviourCassandra = _createWhiteBoxImageBehaviour));
      };
      ComposedVMImage _doubleArrow_14 = ObjectExtensions.<ComposedVMImage>operator_doubleArrow(_createComposedVMImage_5, _function_15);
      _composedVMImages_5.add(_doubleArrow_14);
      EList<ComposedVMImage> _composedVMImages_6 = it_1.getComposedVMImages();
      ComposedVMImage _createComposedVMImage_6 = this.laf.createComposedVMImage();
      final Procedure1<ComposedVMImage> _function_16 = (ComposedVMImage it_2) -> {
        it_2.setName("Redis");
        EList<ProvidedRole> _providedRoles = it_2.getProvidedRoles();
        ServiceProvidedRole _createServiceProvidedRole = this.laf.createServiceProvidedRole();
        final Procedure1<ServiceProvidedRole> _function_17 = (ServiceProvidedRole it_3) -> {
          it_3.setName("Provided_Redis_GENERIC");
          it_3.setServiceInterface(this.ifaceGeneric);
        };
        ServiceProvidedRole _doubleArrow_15 = ObjectExtensions.<ServiceProvidedRole>operator_doubleArrow(_createServiceProvidedRole, _function_17);
        _providedRoles.add((this.provroleRedis = _doubleArrow_15));
        Unit<Frequency> _KILO = SI.<Frequency>KILO(SI.HERTZ);
        Unit<DataAmount> _MEGA = SI.<DataAmount>MEGA(NonSI.BYTE);
        WhiteBoxVMImageBehaviour _createWhiteBoxImageBehaviour = this.createWhiteBoxImageBehaviour(
          this.vmimageRedis, this.flavourSmall, 
          this.provroleCassandra, 
          this.soGenericProcess, 
          null, 
          null, 
          null, 
          "1", _KILO, "1", _MEGA, 
          null);
        it_2.setVmImageBehaviour((this.vmimagebehaviourRedis = _createWhiteBoxImageBehaviour));
      };
      ComposedVMImage _doubleArrow_15 = ObjectExtensions.<ComposedVMImage>operator_doubleArrow(_createComposedVMImage_6, _function_16);
      _composedVMImages_6.add(_doubleArrow_15);
      EList<ComposedVMImage> _composedVMImages_7 = it_1.getComposedVMImages();
      ComposedVMImage _createComposedVMImage_7 = this.laf.createComposedVMImage();
      final Procedure1<ComposedVMImage> _function_17 = (ComposedVMImage it_2) -> {
        it_2.setName("Postgresql");
        EList<ProvidedRole> _providedRoles = it_2.getProvidedRoles();
        ServiceProvidedRole _createServiceProvidedRole = this.laf.createServiceProvidedRole();
        final Procedure1<ServiceProvidedRole> _function_18 = (ServiceProvidedRole it_3) -> {
          it_3.setName("Provided_Postgresql_SQL");
          it_3.setServiceInterface(this.ifaceSql);
        };
        ServiceProvidedRole _doubleArrow_16 = ObjectExtensions.<ServiceProvidedRole>operator_doubleArrow(_createServiceProvidedRole, _function_18);
        _providedRoles.add((this.provrolePostgresql = _doubleArrow_16));
        VariableAssignment _createVariableAssignment = this.laf.createVariableAssignment();
        final Procedure1<VariableAssignment> _function_19 = (VariableAssignment it_3) -> {
          it_3.setVariable(ControlFlowVariable.RESPONSEBYTESIZE);
          it_3.setValue("IntPMF[(30;0.1)(1024;0.2)(4096;0.50)(1048576;0.2)]");
        };
        final VariableAssignment resultAssignment = ObjectExtensions.<VariableAssignment>operator_doubleArrow(_createVariableAssignment, _function_19);
        Unit<Frequency> _KILO = SI.<Frequency>KILO(SI.HERTZ);
        Unit<DataAmount> _MEGA = SI.<DataAmount>MEGA(NonSI.BYTE);
        WhiteBoxVMImageBehaviour _createWhiteBoxImageBehaviour = this.createWhiteBoxImageBehaviour(this.vmimagePostgresql, this.flavourMedium, this.provrolePostgresql, 
          this.soSqlExecute, null, null, null, 
          "400", _KILO, "Exp(0.5)", _MEGA, resultAssignment);
        it_2.setVmImageBehaviour((this.vmimagebehaviourPostgresql = _createWhiteBoxImageBehaviour));
      };
      ComposedVMImage _doubleArrow_16 = ObjectExtensions.<ComposedVMImage>operator_doubleArrow(_createComposedVMImage_7, _function_17);
      _composedVMImages_7.add(_doubleArrow_16);
      EList<VMImageConnector> _vmImageConnectors = it_1.getVmImageConnectors();
      ScalableVMImageConnector _createScalableVMImageConnector = this.laf.createScalableVMImageConnector();
      final Procedure1<ScalableVMImageConnector> _function_18 = (ScalableVMImageConnector it_2) -> {
        it_2.setLoadBalancingPolicy(LoadBalancingPolicy.ROUND_ROBIN);
        Amount<Duration> _valueOf_1 = Amount.<Duration>valueOf(5, SI.SECOND);
        it_2.setAutoScalingAnalysisInterval(_valueOf_1);
        it_2.setMinInstances(1);
        it_2.setDefaultInstances(1);
        it_2.setMaxInstances(3);
        it_2.setServiceRequiredRole(this.reqroleLBFrontendFrontend);
        it_2.setServiceProvidedRole(this.provroleFrontend);
      };
      ScalableVMImageConnector _doubleArrow_17 = ObjectExtensions.<ScalableVMImageConnector>operator_doubleArrow(_createScalableVMImageConnector, _function_18);
      _vmImageConnectors.add(_doubleArrow_17);
      EList<VMImageConnector> _vmImageConnectors_1 = it_1.getVmImageConnectors();
      VMImageConnector _createVMImageConnector = this.laf.createVMImageConnector();
      final Procedure1<VMImageConnector> _function_19 = (VMImageConnector it_2) -> {
        it_2.setServiceRequiredRole(this.reqroleFrontendLBMaster);
        it_2.setServiceProvidedRole(this.provroleMaster);
      };
      VMImageConnector _doubleArrow_18 = ObjectExtensions.<VMImageConnector>operator_doubleArrow(_createVMImageConnector, _function_19);
      _vmImageConnectors_1.add(_doubleArrow_18);
      EList<VMImageConnector> _vmImageConnectors_2 = it_1.getVmImageConnectors();
      ScalableVMImageConnector _createScalableVMImageConnector_1 = this.laf.createScalableVMImageConnector();
      final Procedure1<ScalableVMImageConnector> _function_20 = (ScalableVMImageConnector it_2) -> {
        it_2.setLoadBalancingPolicy(LoadBalancingPolicy.ROUND_ROBIN);
        Amount<Duration> _valueOf_1 = Amount.<Duration>valueOf(5, SI.SECOND);
        it_2.setAutoScalingAnalysisInterval(_valueOf_1);
        it_2.setMinInstances(2);
        it_2.setDefaultInstances(2);
        it_2.setMaxInstances(7);
        it_2.setServiceRequiredRole(this.reqroleLBMasterMaster);
        it_2.setServiceProvidedRole(this.provroleMaster);
      };
      ScalableVMImageConnector _doubleArrow_19 = ObjectExtensions.<ScalableVMImageConnector>operator_doubleArrow(_createScalableVMImageConnector_1, _function_20);
      _vmImageConnectors_2.add(_doubleArrow_19);
      EList<VMImageConnector> _vmImageConnectors_3 = it_1.getVmImageConnectors();
      VMImageConnector _createVMImageConnector_1 = this.laf.createVMImageConnector();
      final Procedure1<VMImageConnector> _function_21 = (VMImageConnector it_2) -> {
        it_2.setServiceRequiredRole(this.reqroleMasterCassandra);
        it_2.setServiceProvidedRole(this.provroleCassandra);
      };
      VMImageConnector _doubleArrow_20 = ObjectExtensions.<VMImageConnector>operator_doubleArrow(_createVMImageConnector_1, _function_21);
      _vmImageConnectors_3.add(_doubleArrow_20);
      EList<VMImageConnector> _vmImageConnectors_4 = it_1.getVmImageConnectors();
      VMImageConnector _createVMImageConnector_2 = this.laf.createVMImageConnector();
      final Procedure1<VMImageConnector> _function_22 = (VMImageConnector it_2) -> {
        it_2.setServiceRequiredRole(this.reqroleMasterRedis);
        it_2.setServiceProvidedRole(this.provroleRedis);
      };
      VMImageConnector _doubleArrow_21 = ObjectExtensions.<VMImageConnector>operator_doubleArrow(_createVMImageConnector_2, _function_22);
      _vmImageConnectors_4.add(_doubleArrow_21);
      EList<VMImageConnector> _vmImageConnectors_5 = it_1.getVmImageConnectors();
      VMImageConnector _createVMImageConnector_3 = this.laf.createVMImageConnector();
      final Procedure1<VMImageConnector> _function_23 = (VMImageConnector it_2) -> {
        it_2.setServiceRequiredRole(this.reqroleMasterLBPgpool);
        it_2.setServiceProvidedRole(this.provroleLBPgpool);
      };
      VMImageConnector _doubleArrow_22 = ObjectExtensions.<VMImageConnector>operator_doubleArrow(_createVMImageConnector_3, _function_23);
      _vmImageConnectors_5.add(_doubleArrow_22);
      EList<VMImageConnector> _vmImageConnectors_6 = it_1.getVmImageConnectors();
      ScalableVMImageConnector _createScalableVMImageConnector_2 = this.laf.createScalableVMImageConnector();
      final Procedure1<ScalableVMImageConnector> _function_24 = (ScalableVMImageConnector it_2) -> {
        it_2.setLoadBalancingPolicy(LoadBalancingPolicy.ROUND_ROBIN);
        Amount<Duration> _valueOf_1 = Amount.<Duration>valueOf(120, SI.SECOND);
        it_2.setAutoScalingAnalysisInterval(_valueOf_1);
        it_2.setMinInstances(2);
        it_2.setDefaultInstances(2);
        it_2.setMaxInstances(5);
        it_2.setServiceRequiredRole(this.reqroleLBPgpoolPostgresql);
        it_2.setServiceProvidedRole(this.provrolePostgresql);
      };
      ScalableVMImageConnector _doubleArrow_23 = ObjectExtensions.<ScalableVMImageConnector>operator_doubleArrow(_createScalableVMImageConnector_2, _function_24);
      _vmImageConnectors_6.add(_doubleArrow_23);
      EList<WhiteBoxUserBehaviourTemplate> _whiteBoxUserBehaviourTemplate = it_1.getWhiteBoxUserBehaviourTemplate();
      WhiteBoxUserBehaviourTemplate _createWhiteBoxUserBehaviourTemplate = this.laf.createWhiteBoxUserBehaviourTemplate();
      final Procedure1<WhiteBoxUserBehaviourTemplate> _function_25 = (WhiteBoxUserBehaviourTemplate it_2) -> {
        it_2.setName("Typical Reference Scenario of DataPlay");
        EList<UserBehaviour> _userBehaviours = it_2.getUserBehaviours();
        UserBehaviour _createUserBehaviour = this.laf.createUserBehaviour();
        final Procedure1<UserBehaviour> _function_26 = (UserBehaviour it_3) -> {
          it_3.setName("User Type 01");
          ConstantOpenWorkload _createConstantOpenWorkload = this.laf.createConstantOpenWorkload();
          final Procedure1<ConstantOpenWorkload> _function_27 = (ConstantOpenWorkload it_4) -> {
            it_4.setInterarrivalTime("0.3");
            it_4.setTimeUnit(SI.SECOND);
          };
          ConstantOpenWorkload _doubleArrow_24 = ObjectExtensions.<ConstantOpenWorkload>operator_doubleArrow(_createConstantOpenWorkload, _function_27);
          it_3.setArrivalRate(_doubleArrow_24);
          ControlFlowAction lastAction = null;
          ControlFlowAction currentAction = null;
          EList<ControlFlowAction> _controlFlowActions = it_3.getControlFlowActions();
          _controlFlowActions.add((lastAction = this.laf.createStartAction()));
          EList<ControlFlowAction> _controlFlowActions_1 = it_3.getControlFlowActions();
          _controlFlowActions_1.add((currentAction = ObjectExtensions.<SetVariableAction>operator_doubleArrow(this.laf.createSetVariableAction(), ((Procedure1<SetVariableAction>) (SetVariableAction it_4) -> {
            EList<VariableAssignment> _variableAssignments = it_4.getVariableAssignments();
            VariableAssignment _createVariableAssignment = this.laf.createVariableAssignment();
            final Procedure1<VariableAssignment> _function_28 = (VariableAssignment it_5) -> {
              it_5.setVariable(ControlFlowVariable.REQUESTBYTESIZE);
              it_5.setValue("20");
            };
            VariableAssignment _doubleArrow_25 = ObjectExtensions.<VariableAssignment>operator_doubleArrow(_createVariableAssignment, _function_28);
            _variableAssignments.add(_doubleArrow_25);
          }))));
          currentAction.setPredecessingControlFlowAction(lastAction);
          lastAction = currentAction;
          EList<ControlFlowAction> _controlFlowActions_2 = it_3.getControlFlowActions();
          _controlFlowActions_2.add((currentAction = ObjectExtensions.<ApplicationCallAction>operator_doubleArrow(this.laf.createApplicationCallAction(), ((Procedure1<ApplicationCallAction>) (ApplicationCallAction it_4) -> {
            it_4.setServiceProvidedRole(this.provroleLBFrontend);
            it_4.setServiceOperationOfProvidedRole(this.soHttpGet);
          }))));
          currentAction.setPredecessingControlFlowAction(lastAction);
          lastAction = currentAction;
          EList<ControlFlowAction> _controlFlowActions_3 = it_3.getControlFlowActions();
          _controlFlowActions_3.add((currentAction = this.laf.createStopAction()));
          currentAction.setPredecessingControlFlowAction(lastAction);
          lastAction = currentAction;
        };
        UserBehaviour _doubleArrow_24 = ObjectExtensions.<UserBehaviour>operator_doubleArrow(_createUserBehaviour, _function_26);
        _userBehaviours.add(_doubleArrow_24);
      };
      WhiteBoxUserBehaviourTemplate _doubleArrow_24 = ObjectExtensions.<WhiteBoxUserBehaviourTemplate>operator_doubleArrow(_createWhiteBoxUserBehaviourTemplate, _function_25);
      _whiteBoxUserBehaviourTemplate.add(_doubleArrow_24);
    };
    WhiteBoxApplicationTemplate _doubleArrow_9 = ObjectExtensions.<WhiteBoxApplicationTemplate>operator_doubleArrow(_createWhiteBoxApplicationTemplate, _function_9);
    _applicationTemplates.add((this.apptempDataPlay = _doubleArrow_9));
  }));
}
