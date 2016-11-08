import eu.cactosfp7.infrastructuremodels.logicaldc.application.ApplicationFactory
import eu.cactosfp7.infrastructuremodels.logicaldc.core.VMImage
import eu.cactosfp7.infrastructuremodels.logicaldc.core.VM_State
import eu.cactosfp7.infrastructuremodels.logicaldc.core.VirtualMemory
import eu.cactosfp7.infrastructuremodels.logicaldc.core.VirtualNetwork
import eu.cactosfp7.infrastructuremodels.logicaldc.core.VirtualNetworkInterconnect
import eu.cactosfp7.infrastructuremodels.logicaldc.core.VirtualProcessingUnit
import eu.cactosfp7.infrastructuremodels.logicaldc.hypervisor.HypervisorFactory
import eu.cactosfp7.infrastructuremodels.logicaldc.hypervisor.HypervisorType
import eu.cactosfp7.infrastructuremodels.physicaldc.architecturetype.ArchitecturetypeFactory
import eu.cactosfp7.infrastructuremodels.physicaldc.architecturetype.util.ArchitectureTypeUtil
import eu.cactosfp7.infrastructuremodels.physicaldc.core.AbstractNode
import eu.cactosfp7.infrastructuremodels.physicaldc.core.ComputeNode
import eu.cactosfp7.infrastructuremodels.physicaldc.core.CoreFactory
import eu.cactosfp7.infrastructuremodels.physicaldc.core.MemorySpecification
import eu.cactosfp7.infrastructuremodels.physicaldc.core.NetworkInterconnect
import eu.cactosfp7.infrastructuremodels.physicaldc.core.NodeState
import eu.cactosfp7.infrastructuremodels.physicaldc.core.PowerDistributionUnit
import eu.cactosfp7.infrastructuremodels.physicaldc.core.ProcessingUnitSpecification
import eu.cactosfp7.infrastructuremodels.physicaldc.core.Rack
import eu.cactosfp7.infrastructuremodels.physicaldc.core.StorageSpecification
import eu.cactosfp7.infrastructuremodels.physicaldc.core.Switch
import eu.cactosfp7.infrastructuremodels.physicaldc.power.binding.BindingFactory
import eu.cactosfp7.infrastructuremodels.physicaldc.power.binding.PowerModelBinding
import eu.cactosfp7.infrastructuremodels.physicaldc.power.specification.FixedFactor
import eu.cactosfp7.infrastructuremodels.physicaldc.power.specification.PowerModel
import eu.cactosfp7.infrastructuremodels.physicaldc.power.specification.SpecificationFactory
import eu.cactosfp7.infrastructuremodels.physicaldc.util.UtilFactory
import javax.measure.quantity.DataAmount
import javax.measure.quantity.DataRate
import javax.measure.quantity.Dimensionless
import javax.measure.unit.NonSI
import javax.measure.unit.SI
import org.jscience.physics.amount.Amount
import tools.descartes.dlim.DlimFactory
import tools.descartes.dlim.Operator
import eu.cactosfp7.infrastructuremodels.logicaldc.application.BlackBoxApplicationTemplate
import eu.cactosfp7.infrastructuremodels.logicaldc.application.BlackBoxWorkload
import eu.cactosfp7.infrastructuremodels.physicaldc.core.MonitorableResource
import eu.cactosfp7.infrastructuremodels.logicaldc.core.VirtualMachine
import eu.cactosfp7.infrastructuremodels.logicaldc.application.BlackBoxVMImageBehaviour
import eu.cactosfp7.infrastructuremodels.logicaldc.core.VirtualDisk
import eu.cactosfp7.infrastructuremodels.logicaldc.core.Flavour
import eu.cactosfp7.cactosim.experimentscenario.ExperimentscenarioFactory
import eu.cactosfp7.cactosim.experimentscenario.request.RequestFactory
import eu.cactosfp7.cactosim.experimentscenario.selector.SelectorFactory
import eu.cactosfp7.infrastructuremodels.logicaldc.application.BlackBoxApplicationInstance
import eu.cactosfp7.cactosim.experimentscenario.selector.BlackBoxApplicationInstanceSelector
import eu.cactosfp7.cactosim.experimentscenario.selector.PreviouslyStartedApplicationSelector
import eu.cactosfp7.cactosim.experimentscenario.selector.PreviouslyStartedBlackBoxApplicationSelector
import eu.cactosfp7.cactosim.experimentscenario.selector.InitiallyRunningBlackBoxApplicationInstanceSelector
import eu.cactosfp7.cactosim.experimentscenario.request.StartApplicationRequest

/**Creates a Black-Box Demonstration Model.
 * There are only Black-Box applications in the model.
 * Storage access of VMs is remote.
 */
class BlackBoxDemoModel {
	// Demonstration Scenario Creation Settings
	/** Specifies the number of (identical) physical nodes with VMs on it that are created for the demo case. */
	int numberPhysicalNodes = 6
	/** Specifies the number of (identical) physical nodes without VMs on it that are created for the demo case and are initially shut down. */
	int numberUnusedPhysicalNodes = 10
	/** Specifies the number of (identical) virtual machines that are created for each physical node. */
	int numberVirtualMachinesPerPhysicalNode = 16
	Double totalDuration = 3600.0 
	Double startValue = Amount.valueOf(2.6*16*0.5/numberVirtualMachinesPerPhysicalNode, SI.GIGA(SI.HERTZ)).doubleValue(SI.MEGA(SI.HERTZ))
	Double startDuration = 400.0;
	Double middleValue = Amount.valueOf(2.6*16*1.05/numberVirtualMachinesPerPhysicalNode, SI.GIGA(SI.HERTZ)).doubleValue(SI.MEGA(SI.HERTZ))
	Double middleDuration = 1000.0;
	Double endValue = Amount.valueOf(2.6*16*0.3/numberVirtualMachinesPerPhysicalNode, SI.GIGA(SI.HERTZ)).doubleValue(SI.MEGA(SI.HERTZ))
	Double endDuration = totalDuration - startDuration - middleDuration
	
	// initialize Factories
	/** Architecture type Factory */
	ArchitecturetypeFactory af = ArchitecturetypeFactory.INSTANCE; 
	/** Physical Core Factory */
	CoreFactory pcoref = CoreFactory.INSTANCE;
	/** Physical Util Factory */
	UtilFactory putilf = UtilFactory.INSTANCE;
	/** Logical Core Factory */
	eu.cactosfp7.infrastructuremodels.logicaldc.core.CoreFactory lcoref = eu.cactosfp7.infrastructuremodels.logicaldc.core.CoreFactory.INSTANCE;
	/** Physical Utility Factory */
	UtilFactory puf = UtilFactory.INSTANCE;
	/** Hypervisor Factory */
	HypervisorFactory hf = HypervisorFactory.INSTANCE;
	/** PDC Binding Factory */
	BindingFactory pbf = BindingFactory.INSTANCE;
	/** PDC Specification Factory */
	SpecificationFactory psf = SpecificationFactory.INSTANCE;
	/** Logical Application Factory */
	ApplicationFactory laf = ApplicationFactory.INSTANCE;
	/** Descartes Load Intensity Model Factory */
	DlimFactory df = DlimFactory.eINSTANCE;
	/** Experiment Scenario Factory */
	ExperimentscenarioFactory esf = ExperimentscenarioFactory.eINSTANCE;
	/** Request Factory for experiment Scenario */
	RequestFactory rf = RequestFactory.eINSTANCE;
	/** Application Instance Selector Factory for experiment Scenario */
	SelectorFactory sf = SelectorFactory.eINSTANCE;
	
	// create demo model of data centre
	var Rack rack1;
	var Rack rack2;
	var ComputeNode[] node = newArrayOfSize(numberPhysicalNodes)
	var Switch switch1;
	var PowerDistributionUnit pduMain;
	var PowerDistributionUnit pduRack1;
	var PowerDistributionUnit pduRack2;
	var ProcessingUnitSpecification cpu1;
	var MemorySpecification mem1;
	var StorageSpecification storage1;
	var Flavour flavour1;
	var NetworkInterconnect nic1;
	var VMImage vmimageKvmHypervisor;
	var VMImage vmimageBBA;
	var ProcessingUnitSpecification bbaRefCpu;
	var BlackBoxApplicationTemplate bbappt;
	var BlackBoxVMImageBehaviour vmimagebehaviourBba
	var VirtualMachine vmCurrent;
	var VirtualNetwork vnetwork;
	var HypervisorType hvtype_kvm;
	var VirtualMemory vmem1;
	var VirtualProcessingUnit vcpu1;
	var VirtualNetworkInterconnect vnic1;
	var PowerModelBinding pmb;
	var PowerModel powermodel;
	var ComputeNode cn;
	var FixedFactor ff_min;
	var FixedFactor ff_max;
	var hypNumber = 0;
	
	def BlackBoxWorkload createBBWorkload(MonitorableResource onCPU) {
		laf.createBlackBoxWorkload => [
			onResource = onCPU
			name = "Black Box Workload for vCPU"
			resourceDemandUnit = NonSI.BYTE.divide(SI.SECOND)
			resourceDemandRates = df.createSequence => [
				terminateAfterLoops = -1
				terminateAfterTime = totalDuration
				sequenceFunctionContainers += df.createTimeDependentFunctionContainer => [
					duration = startDuration
					function = df.createConstant => [
						constant = startValue
					]
				]
				sequenceFunctionContainers += df.createTimeDependentFunctionContainer => [
					duration = middleDuration
					function = df.createLinearTrend => [
						functionOutputAtStart = startValue
						functionOutputAtEnd = middleValue
					]
				]
				sequenceFunctionContainers += df.createTimeDependentFunctionContainer => [
					duration = endDuration
					function = df.createConstant => [
						constant = endValue
					]
				]
				combine += df.createCombinator => [
					operator = Operator.ADD
					function = df.createNormalNoise => [
						mean = 0;
						standardDeviation = 40;
					]											
				]
			]
		]
	}
	
	def ProcessingUnitSpecification createCpu() {
		pcoref.createProcessingUnitSpecification => [
			name = "CPU Intel x86_64 Rev. D"
			frequency = Amount.valueOf(2.6, SI.GIGA(SI.HERTZ))
			numberOfCores = 16
			supportsTurboMode = false
			architectureType = ArchitectureTypeUtil.INSTANCE.createOrGet(architectureRepo, ArchitectureTypeUtil.ARCHITECTURE_TYPE_x86_GENERIC_UUID)
			powerModelBinding = pmb;
		]
	}
	
	def VMImage createBlackBoxVMImage(StorageSpecification storage) {
		lcoref.createVMImage => [
			name = "Black-Box VM Image"
			capacity = Amount.valueOf(2.0, SI.GIGA(NonSI.BYTE))
			usedCapacity = Amount.valueOf(1.2, SI.GIGA(NonSI.BYTE))
			storageLocation = storage
		]
	}
	
	// Architecture Type Repository
	public val architectureRepo = af.createArchitectureTypeRepository => [
	]
	
	// Hypervisor Repository
	public val hypervisorRepository = hf.createHypervisorRepository => [
		hypervisorTypes += hvtype_kvm = hf.createHypervisorType => [
			name = "kvm"
		]
	]
	
	// PDC Power Model Repository
	public val pdcSpecRepo = psf.createPowerModelRepository => [
		name = "Generated for Year 2 Demonstration"
		powerModels += powermodel = psf.createPowerModel => [
			name = "Linear Power Model"
			expression = "minConsumption+u*(maxConsumption-minConsumption)"
			consumptionFactors += ff_min = psf.createFixedFactor => [
				name = "minConsumption"
			]
			consumptionFactors += ff_max = psf.createFixedFactor => [
				name = "maxConsumption"
			]
			consumptionFactors += psf.createMeasuredFactor => [
				name = "u"
				unit = Dimensionless.UNIT;
			]
		]
	]
	
	// PDC Power Model Binding Repository
	public val pdcBindingRepo = pbf.createPowerModelBindingRepository => [
		powerModelBindings += pmb = pbf.createPowerModelBinding => [
			name = "Linear Consumption Model"
			powerModel = powermodel
			fixedFactorValues += pbf.createFixedFactorValue => [
				name = "minConsumption"
				value = Amount.valueOf(270.0, SI.WATT);
				boundFactor = ff_min
			]
			fixedFactorValues += pbf.createFixedFactorValue => [
				name = "maxConsumption"
				value = Amount.valueOf(700.0, SI.WATT);
				boundFactor = ff_max
			]
		]
	]
	
	// Physical DC Model
	public val physicalDcModel = pcoref.createPhysicalDCModel => [
		powerSupplies += pduMain = pcoref.createPowerDistributionUnit => [
			name = "Main PDU"
			suppliablePeakPower = Amount.valueOf(3.2, SI.KILO(SI.WATT))
			powerCap = Amount.valueOf(3, SI.KILO(SI.WATT))
		]
		powerSupplies += pduRack1 = pcoref.createPowerDistributionUnit => [
			name = "Rack 1 PDU"
			suppliablePeakPower = Amount.valueOf(2, SI.KILO(SI.WATT))
			powerCap = Amount.valueOf(2, SI.KILO(SI.WATT));
			powerProvidingEntities += pduMain
		]
		powerSupplies += pduRack2 = pcoref.createPowerDistributionUnit => [
			name = "Rack 2 PDU"
			suppliablePeakPower = Amount.valueOf(2, SI.KILO(SI.WATT))
			powerCap = Amount.valueOf(2, SI.KILO(SI.WATT));
			powerProvidingEntities += pduMain
		]
		racks += rack1 = pcoref.createRack => [
			name = "Dell 08-15"
			powerSupplies += pduRack1
		]
		racks += rack2 = pcoref.createRack => [
			name = "Dell 08-15"
			powerSupplies += pduRack2
		]
		for (int i : 0..<numberPhysicalNodes+numberUnusedPhysicalNodes) {
			cn = pcoref.createComputeNode => [
				name = "Compute Node " + i
				state = NodeState.RUNNING
				cpuSpecifications += cpu1 = createCpu()
				storageSpecifications += storage1 = pcoref.createStorageSpecification => [
					name = "Local HDD #" + i
					size = Amount.valueOf(1, SI.TERA(NonSI.BYTE))
					readDelay = Amount.valueOf(0, SI.SECOND);
					readBandwidth = puf.createBandwidth => [
						value = Amount.valueOf(35*8, SI.MEGA(DataRate.UNIT)) // 35 MByte / s
					]
					writeDelay = Amount.valueOf(0, SI.SECOND); 
					writeBandwidth = puf.createBandwidth => [
						value = Amount.valueOf(35*8, SI.MEGA(DataRate.UNIT)) // 35 MByte / s
					]
				]
				memorySpecifications += mem1 = pcoref.createMemorySpecification => [
					name = "DDR-RAM"
					size = Amount.valueOf(128, SI.GIGA(NonSI.BYTE))
					bandwidthRead = puf.createBandwidth => [
						value = Amount.valueOf(17.54*8, SI.GIGA(DataRate.UNIT)) // 17,54 GByte / s
					]
					bandwidthWrite = puf.createBandwidth => [
						value = Amount.valueOf(17.54*8, SI.GIGA(DataRate.UNIT)) // 17,54 GByte / s
					]
				]
				powerConsumingEntities += cpu1
				powerConsumingEntities += storage1
				powerConsumingEntities += mem1
			]
			if (i < numberPhysicalNodes) {
				node.set(i, cn)
				rack1.nodes += cn
				pduRack1.powerConsumingEntities += cn;
			} else {
				rack2.nodes += cn
				pduRack2.powerConsumingEntities += cn;
			}
		}
		// add NAS
		rack2.nodes += pcoref.createNetworkAttachedStorage => [
			name = "Main"
			storageSpecifications += storage1 = pcoref.createStorageSpecification => [
				name = "NAS (Virtual) HDD"
				size = Amount.valueOf(500, SI.TERA(NonSI.BYTE))
				readDelay = Amount.valueOf(0, SI.SECOND);
				readBandwidth = puf.createBandwidth => [
					value = Amount.valueOf(120*8, SI.MEGA(DataRate.UNIT)) // 120 MByte / s
				]
				writeDelay = Amount.valueOf(0, SI.SECOND); 
				writeBandwidth = puf.createBandwidth => [
					value = Amount.valueOf(120*8, SI.MEGA(DataRate.UNIT)) // 120 MByte / s
				]
			]
		]
		pduRack2.powerConsumingEntities += rack2.nodes.last
		networkInterconnects += nic1 = pcoref.createNetworkInterconnect => [
			name = "Single NIC Layout"
			for (AbstractNode an : rack1.nodes) {
				connectedEntities += an;
			}
			bandwidth = putilf.createBandwidth => [
				value = Amount.valueOf(1.0, SI.GIGA(DataRate.UNIT))
			]
		]
		switches +=	switch1 = pcoref.createSwitch => [
			name = "Single Switch Layout"
		]
		nic1.connectedEntities += switch1;
		clusters +=	pcoref.createCluster => [
			name = "Single Cluster Layout"
			clusterId = 1
			for (an : rack1.nodes) {
				containedNodes += an
			}
		]
	]
	
	// Logical DC Model
	public val logicalDcModel = lcoref.createLogicalDCModel => [
		cyclicOptimizationInterval = Amount.valueOf(60, SI.SECOND)
		// showing virtual-disk-based VMImages
		volumesAndImages += lcoref.createVirtualDisk => [
			name = "Virtual Disk storing VMImages, e.g. Black-Box Application Image(s)."
			capacity = Amount.valueOf(5.0, SI.TERA(NonSI.BYTE))
			storageLocation = storage1
			deltaOverlay += vmimageBBA = createBlackBoxVMImage(storage1)
			deltaOverlay += vmimageKvmHypervisor = lcoref.createVMImage => [
				name = "KvmHypervisor"
				capacity = Amount.valueOf(4.0, SI.TERA(NonSI.BYTE))
				usedCapacity = Amount.valueOf(3.0, SI.GIGA(NonSI.BYTE))
				storageLocation = storage1
			]
		]
		virtualNetworks += vnetwork = lcoref.createVirtualNetwork => [
			name = "Single virtual Network Layout"
		]
		// add hypervisors for all nodes
		hypNumber = 0;
		for (rack : physicalDcModel.racks) {
			for (an : rack.nodes) {
				if (an instanceof ComputeNode) {
					hypervisors += lcoref.createHypervisor => [
						node = an
						hypervisorType = hvtype_kvm
						rootVolume = lcoref.createVirtualDisk => [
							name = "Overlay for KVM Hypervisor #" + hypNumber++
							capacity = Amount.valueOf(0.5, SI.GIGA(NonSI.BYTE))
							usedCapacity = Amount.valueOf(0.2, SI.GIGA(NonSI.BYTE))
							parent = vmimageKvmHypervisor
							storageLocation = vmimageKvmHypervisor.storageLocation 
						]
					]
				}
			}
		}
		applicationTemplates += bbappt = laf.createBlackBoxApplicationTemplate => [
			name = "Black-Box Application Model Demo (non-repeating)"
			blackBoxVMImageBehaviour = vmimagebehaviourBba = laf.createBlackBoxVMImageBehaviour => [
				vmImage = vmimageBBA
				referenceResourceSpecifications += bbaRefCpu = createCpu()
				patternIsRepeating = false
				blackBoxWorkloads += createBBWorkload(bbaRefCpu)
			]
		]
		
		flavours += flavour1 = lcoref.createFlavour => [
			name = "GenericX86Small";
			architectureType = ArchitectureTypeUtil.INSTANCE.createOrGet(architectureRepo, ArchitectureTypeUtil.ARCHITECTURE_TYPE_x86_GENERIC_UUID);
			numberVirtualCores = 1;
			sizeRam = Amount.valueOf(8*8, SI.GIGA(DataAmount.UNIT));
			sizeStorage = Amount.valueOf(20.0, SI.GIGA(NonSI.BYTE));
		]
		
		var int hypervisorNumber = 0;
		for (an : node) {
			val hn = hypervisorNumber
			for (hyp : hypervisors) {
				if (hyp.node == an) {
					// no copy of root disk - remote storage only
					// virtual machines per physical node
					for (int i : 0..<numberVirtualMachinesPerPhysicalNode) {
						val VirtualDisk vmImageBBAOverlay = lcoref.createVirtualDisk => [
							name = "Overlay for VM #" + hn + "-" + i
							capacity = flavour1.sizeStorage;
							usedCapacity = Amount.valueOf(0.02, SI.GIGA(NonSI.BYTE))
							storageLocation = storage1
						]
						vmimageBBA.deltaOverlay += vmImageBBAOverlay 
						hyp.virtualMachines += vmCurrent = lcoref.createVirtualMachine => [
							name = "BBA VM #" + hn + "-" + i
							state = VM_State.RUNNING
							// set runtimeApplicationModel if of interest
							virtualProcessingUnits += vcpu1 = lcoref.createVirtualProcessingUnit => [
								virtualCores = flavour1.numberVirtualCores;
								name = "vCPU " + flavour1.name;
								architectureType = flavour1.architectureType;
							]
							VMImageInstance =  lcoref.createVMImageInstance => [
								rootDisk = vmImageBBAOverlay
							]
							virtualMemoryUnits += vmem1 = lcoref.createVirtualMemory => [
								provisioned = flavour1.sizeRam;
							]
							runtimeApplicationModel = laf.createBlackBoxVMBehaviour => [
								name = "Black-Box Application VM Behaviour (non-repeating) #" + hn + "-" + i
								patternIsRepeating = false
								blackBoxWorkloads += createBBWorkload(cpu1)
								vmImageBehaviour = vmimagebehaviourBba
							]
						]
						// no PU affinity
						// in line assignment of application instance and VM as this is simpler in this code
						applicationInstances += laf.createBlackBoxApplicationInstance => [
							applicationTemplate = bbappt
							virtualMachine = vmCurrent
						]
					}
				}
			}
			hypervisorNumber++
		}
		
		virtualNetworkInterconnects +=	vnic1 = lcoref.createVirtualNetworkInterconnect => [
			name = "Single vNIC Layout"
			connectedVirtualEntity += vnetwork
		]
		for (hyp : hypervisors) {
			for (vm : hyp.virtualMachines) {
				vnic1.connectedVirtualEntity += vm
			}
		}
	]
	
	public val experimentScenarioModel = esf.createExperimentScenarioTimeLine => [
		val startEvent = esf.createAbsoluteTimeEvent => [
			it.simulationTime = Amount.valueOf(startDuration + 0.2 * (middleDuration - startDuration), SI.SECOND);
			it.experimentScenarioRequest = rf.createStartApplicationRequest => [
				it.applicationTemplate = bbappt
				it.vmFlavour = flavour1;
			]
		]
		timeLineEvents += startEvent
		if (numberUnusedPhysicalNodes > 0) {
			val nodeToSwitchOn = rack2.nodes.findFirst[true];
			timeLineEvents += esf.createAbsoluteTimeEvent => [
				it.simulationTime = Amount.valueOf(startDuration + 0.4 * (middleDuration - startDuration), SI.SECOND);
				it.experimentScenarioRequest = rf.createSetPhysicalNodeStateRequest => [
					it.targetNode = nodeToSwitchOn;
					it.targetState = NodeState.RUNNING;
				]
			]
			timeLineEvents += esf.createAbsoluteTimeEvent => [
				it.simulationTime = Amount.valueOf(startDuration + 0.8 * (middleDuration - startDuration), SI.SECOND);
				it.experimentScenarioRequest = rf.createMigrateApplicationRequest => [
					it.applicationInstanceSelector = sf.createPreviouslyStartedBlackBoxApplicationSelector => [
						it.startApplicationRequest = startEvent.experimentScenarioRequest as StartApplicationRequest
					]
					it.targetPhysicalNode = nodeToSwitchOn as ComputeNode
				]
			]	
		}
	]
	
}
