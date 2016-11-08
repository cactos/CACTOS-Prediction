import eu.cactosfp7.infrastructuremodels.logicaldc.application.ApplicationFactory
import eu.cactosfp7.infrastructuremodels.logicaldc.core.VMImage
import eu.cactosfp7.infrastructuremodels.logicaldc.core.VM_State
import eu.cactosfp7.infrastructuremodels.logicaldc.core.VirtualMemory
import eu.cactosfp7.infrastructuremodels.logicaldc.core.VirtualNetwork
import eu.cactosfp7.infrastructuremodels.logicaldc.core.VirtualNetworkInterconnect
import eu.cactosfp7.infrastructuremodels.logicaldc.core.VirtualProcessingUnit
import eu.cactosfp7.infrastructuremodels.logicaldc.core.Volume
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
import javax.measure.quantity.Quantity
import javax.measure.unit.NonSI
import javax.measure.unit.SI
import org.jscience.physics.amount.Amount

class GreyBoxDemoModel {
	// Demonstration Scenario Creation Settings
	/** Specifies the number of (identical) physical nodes with VMs on it that are created for the demo case. */
	int numberPhysicalNodes = 16
	/** Specifies the number of nodes with HDDs, the others are assigned SSDs. */
	int numberNodesHdd = 8
	/** Specifies the number of (identical) physical nodes without VMs on it that are created for the demo case and are initially shut down. */
	int numberUnusedPhysicalNodes = 0
	/** Specifies the number of (identical) virtual machines that are created for each physical node. */
	int numberVirtualMachinesPerPhysicalNode = 1
	
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
	var NetworkInterconnect nic1;
	var Volume volume1;
	var VMImage vmimageMolpro;
	var VMImage vmimageBBA;
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
				unit = SI.WATT;
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
				cpuSpecifications += cpu1 = pcoref.createProcessingUnitSpecification => [
					name = "Intel(R) Core(TM) i5-3470"
					frequency = Amount.valueOf(3.2, SI.GIGA(SI.HERTZ))
					numberOfCores = 1
					supportsTurboMode = false
					architectureType = ArchitectureTypeUtil.INSTANCE.createOrGet(architectureRepo, ArchitectureTypeUtil.ARCHITECTURE_TYPE_x86_GENERIC_UUID)
					powerModelBinding = pmb;
				]
				if (i < numberNodesHdd) {
					storageSpecifications += storage1 = pcoref.createStorageSpecification => [
						name = "Local HDD"
						size = Amount.valueOf(220, SI.GIGA(NonSI.BYTE))
						readDelay = Amount.valueOf(0, SI.SECOND);
						readBandwidth = puf.createBandwidth => [
							value = Amount.valueOf(70*8, SI.MEGA(DataRate.UNIT)) // 70 MByte / s
						]
						writeDelay = Amount.valueOf(0, SI.SECOND); 
						writeBandwidth = puf.createBandwidth => [
							value = Amount.valueOf(70*8, SI.MEGA(DataRate.UNIT)) // 70 MByte / s
						]
					]
				} else {
					storageSpecifications += storage1 = pcoref.createStorageSpecification => [
						name = "Local SSD"
						size = Amount.valueOf(220, SI.GIGA(NonSI.BYTE))
						readDelay = Amount.valueOf(0, SI.SECOND);
						readBandwidth = puf.createBandwidth => [
							value = Amount.valueOf(120*8, SI.MEGA(DataRate.UNIT)) // 120 MByte / s
						]
						writeDelay = Amount.valueOf(0, SI.SECOND); 
						writeBandwidth = puf.createBandwidth => [
							value = Amount.valueOf(120*8, SI.MEGA(DataRate.UNIT)) // 120 MByte / s
						]
					]
				}
				memorySpecifications += mem1 = pcoref.createMemorySpecification => [
					name = "DDR3-RAM"
					size = Amount.valueOf(16, SI.GIGA(NonSI.BYTE))
					bandwidthRead = puf.createBandwidth => [
						value = Amount.valueOf(23.984*8, SI.GIGA(DataRate.UNIT)) // 23984 MB/s http://www.corsair.com/de-de/blog/2014/september/ddr3_vs_ddr4_synthetic
					]
					bandwidthWrite = puf.createBandwidth => [
						value = Amount.valueOf(25.132*8, SI.GIGA(DataRate.UNIT)) // see above
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
		volumes += volume1 = lcoref.createVolume => [
			size = Amount.valueOf(12.0, SI.GIGA(NonSI.BYTE))
			storageLocation = storage1
		]
		vmImages +=	vmimageMolpro = lcoref.createVMImage => [
			name = "Molpro Image"
			size = Amount.valueOf(2.0, SI.GIGA(NonSI.BYTE))
			applicationTypeTag = "MolproCcsd"
			volume += volume1
			storageLocation = storage1
		]
		vmImages +=	vmimageBBA = lcoref.createVMImage => [
			name = "Black-Box Application Image"
			applicationTypeTag = "Black-Box"
			size = Amount.valueOf(1.2, SI.GIGA(NonSI.BYTE))
			volume += volume1
			storageLocation = storage1
		]
		virtualNetworks += vnetwork = lcoref.createVirtualNetwork => [
			name = "Single virtual Network Layout"
		]
		// add hypervisors for all nodes 
		for (rack : physicalDcModel.racks) {
			for (an : rack.nodes) {
				if (an instanceof ComputeNode) {
					hypervisors += lcoref.createHypervisor => [
						node = an
						hypervisorType = hvtype_kvm
					]
				}
			}
		}
		for (an : node) {
			for (hyp : hypervisors) {
				if (hyp.node == an) {
					// virtual machines per physical node
					for (int i : 0..<numberVirtualMachinesPerPhysicalNode) {
						hyp.virtualMachines += lcoref.createVirtualMachine => [
							name = "BBA " + i
							state = VM_State.RUNNING
							// set runtimeApplicationModel if of interest
							virtualProcessingUnits += vcpu1 = lcoref.createVirtualProcessingUnit => [
								virtualCores = 1
								name = "vCPU Flavour 1"
								architectureType = ArchitectureTypeUtil.INSTANCE.createOrGet(architectureRepo, ArchitectureTypeUtil.ARCHITECTURE_TYPE_x86_GENERIC_UUID)
							]
							VMImageInstance =  lcoref.createVMImageInstance => [
								isRunLocally = true
								localStorageSize = Amount.valueOf(200*8, SI.GIGA(DataAmount.UNIT))
								volumes += volume1
								executedVMImage = vmimageMolpro
							]
							virtualMemoryUnits += vmem1 = lcoref.createVirtualMemory => [
								provisioned = Amount.valueOf(8*8, SI.GIGA(DataAmount.UNIT))
							]
							runtimeApplicationModel = laf.createGreyBoxApplication => [
								// 4 phases, based on GreyBox Model Molpro/Input/Application Models.xlsx
								workloadPhases += laf.createWorkloadPhase => [
									resourceDemands += laf.createResourceDemand => [
										amount = Amount.valueOf(35374, SI.GIGA(Dimensionless.UNIT)) as Amount<? extends Quantity>
										resourceSpecification = cpu1
									]
									resourceDemands += laf.createResourceDemand => [
										amount = Amount.valueOf(189, SI.GIGA(NonSI.BYTE)) as Amount<? extends Quantity>
										resourceSpecification = storage1
									]
								]
								workloadPhases += laf.createWorkloadPhase => [
									resourceDemands += laf.createResourceDemand => [
										amount = Amount.valueOf(115, SI.GIGA(Dimensionless.UNIT)) as Amount<? extends Quantity>
										resourceSpecification = cpu1
									]
									resourceDemands += laf.createResourceDemand => [
										amount = Amount.valueOf(234, SI.GIGA(NonSI.BYTE)) as Amount<? extends Quantity>
										resourceSpecification = storage1
									]
								]
								workloadPhases += laf.createWorkloadPhase => [
									resourceDemands += laf.createResourceDemand => [
										amount = Amount.valueOf(28259, SI.GIGA(Dimensionless.UNIT)) as Amount<? extends Quantity>
										resourceSpecification = cpu1
									]
									resourceDemands += laf.createResourceDemand => [
										amount = Amount.valueOf(172, SI.GIGA(NonSI.BYTE)) as Amount<? extends Quantity>
										resourceSpecification = storage1
									]
								]
								workloadPhases += laf.createWorkloadPhase => [
									resourceDemands += laf.createResourceDemand => [
										amount = Amount.valueOf(2212, SI.GIGA(Dimensionless.UNIT)) as Amount<? extends Quantity>
										resourceSpecification = cpu1
									]
									resourceDemands += laf.createResourceDemand => [
										amount = Amount.valueOf(422, SI.GIGA(NonSI.BYTE)) as Amount<? extends Quantity>
										resourceSpecification = storage1
									]
								]
							] 
						]
						// no PU affinity
					}
				}
			}
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
	
}
