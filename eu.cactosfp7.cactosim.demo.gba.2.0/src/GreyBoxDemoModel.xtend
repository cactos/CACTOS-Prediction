import eu.cactosfp7.infrastructuremodels.logicaldc.application.ApplicationFactory
import eu.cactosfp7.infrastructuremodels.logicaldc.application.GreyBoxApplicationTemplate
import eu.cactosfp7.infrastructuremodels.logicaldc.application.GreyBoxBehaviour
import eu.cactosfp7.infrastructuremodels.logicaldc.core.VMImage
import eu.cactosfp7.infrastructuremodels.logicaldc.core.VM_State
import eu.cactosfp7.infrastructuremodels.logicaldc.core.VirtualMachine
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
import eu.cactosfp7.infrastructuremodels.physicaldc.core.MonitorableResource
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
import eu.cactosfp7.infrastructuremodels.logicaldc.application.GreyBoxVMImageBehaviour
import eu.cactosfp7.infrastructuremodels.logicaldc.core.VirtualDisk

/**Creates a Grey-Box Demonstration Model.
 * There are only Grey-Box applications in the model.
 * Storage access of VMs is local.
 */
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
	var VMImage vmimageKvmHypervisor;
	
	var VMImage vmimageGBA;
	var GreyBoxApplicationTemplate apptempGba;
	var GreyBoxVMImageBehaviour vmimagebehaviourGba;
	var MonitorableResource apptempCpu;
	var MonitorableResource apptempStorageSsd;
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
	
	def createGBWorkload(GreyBoxBehaviour gbb, MonitorableResource cpu, MonitorableResource storage) {
		// 4 phases, based on GreyBox Model Molpro/Input/Application Models.xlsx
		gbb.workloadPhases += laf.createWorkloadPhase => [
			name = "CCSD Phase 1"
			resourceDemands += laf.createResourceDemand => [
				amount = Amount.valueOf(35374, SI.GIGA(Dimensionless.UNIT)) as Amount<? extends Quantity>
				onResource = cpu
			]
			resourceDemands += laf.createResourceDemand => [
				amount = Amount.valueOf(189, SI.GIGA(NonSI.BYTE)) as Amount<? extends Quantity>
				onResource = storage
			]
		]
		gbb.workloadPhases += laf.createWorkloadPhase => [
			name = "CCSD Phase 2"
			resourceDemands += laf.createResourceDemand => [
				amount = Amount.valueOf(115, SI.GIGA(Dimensionless.UNIT)) as Amount<? extends Quantity>
				onResource = cpu
			]
			resourceDemands += laf.createResourceDemand => [
				amount = Amount.valueOf(234, SI.GIGA(NonSI.BYTE)) as Amount<? extends Quantity>
				onResource = storage
			]
		]
		gbb.workloadPhases += laf.createWorkloadPhase => [
			name = "CCSD Phase 3"
			resourceDemands += laf.createResourceDemand => [
				amount = Amount.valueOf(28259, SI.GIGA(Dimensionless.UNIT)) as Amount<? extends Quantity>
				onResource = cpu
			]
			resourceDemands += laf.createResourceDemand => [
				amount = Amount.valueOf(172, SI.GIGA(NonSI.BYTE)) as Amount<? extends Quantity>
				onResource = storage
			]
		]
		gbb.workloadPhases += laf.createWorkloadPhase => [
			name = "CCSD Phase 4"
			resourceDemands += laf.createResourceDemand => [
				amount = Amount.valueOf(2212, SI.GIGA(Dimensionless.UNIT)) as Amount<? extends Quantity>
				onResource = cpu
			]
			resourceDemands += laf.createResourceDemand => [
				amount = Amount.valueOf(422, SI.GIGA(NonSI.BYTE)) as Amount<? extends Quantity>
				onResource = storage
			]
		]
	}

	def createGBWorkloadDFT(GreyBoxBehaviour gbb, MonitorableResource cpu, MonitorableResource storage) {
		// Demonstration only, no measured values
		gbb.workloadPhases += laf.createWorkloadPhase => [
			name = "DFT Single Phase"
			resourceDemands += laf.createResourceDemand => [
				amount = Amount.valueOf(9999, SI.GIGA(Dimensionless.UNIT)) as Amount<? extends Quantity>
				onResource = cpu
			]
			resourceDemands += laf.createResourceDemand => [
				amount = Amount.valueOf(99, SI.GIGA(NonSI.BYTE)) as Amount<? extends Quantity>
				onResource = storage
			]
		]
	}
	
	def StorageSpecification createStorageSsd() {
		pcoref.createStorageSpecification => [
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
	
	def ProcessingUnitSpecification createCpu() {
		pcoref.createProcessingUnitSpecification => [
			name = "Intel(R) Core(TM) i5-3470"
			frequency = Amount.valueOf(3.2, SI.GIGA(SI.HERTZ))
			numberOfCores = 1
			supportsTurboMode = false
			architectureType = ArchitectureTypeUtil.INSTANCE.createOrGet(architectureRepo, ArchitectureTypeUtil.ARCHITECTURE_TYPE_x86_GENERIC_UUID)
			powerModelBinding = pmb;
		]
	}
	
	def VMImage createGreyBoxVMImage(StorageSpecification storage) {
		lcoref.createVMImage => [
			name = "Molpro VM Image"
			capacity = Amount.valueOf(12.0, SI.GIGA(NonSI.BYTE))
			usedCapacity = Amount.valueOf(5.0, SI.GIGA(NonSI.BYTE))
			storageLocation = storage
		]
	}
	
	def VMImage createVirtualDiskKvmHyp(StorageSpecification storage) {
		lcoref.createVMImage => [
			name = "KvmHypervisor"
			capacity = Amount.valueOf(4.0, SI.TERA(NonSI.BYTE))
			usedCapacity = Amount.valueOf(3.0, SI.GIGA(NonSI.BYTE))
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
				if (i < numberNodesHdd) {
					storageSpecifications += storage1 = pcoref.createStorageSpecification => [
						name = "Local HDD #" + i
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
					storageSpecifications += storage1 = createStorageSsd()
					storage1.name = "Local SSD #" + i
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
		// showing non-virtual-disk-based VMImages
		volumesAndImages += lcoref.createVirtualDisk => [
			name = "Virtual Disk storing VMImages, e.g. Grey-Box Applications Image(s)."
			capacity = Amount.valueOf(5.0, SI.TERA(NonSI.BYTE))
			storageLocation = storage1
			deltaOverlay += vmimageGBA = createGreyBoxVMImage(storage1)
			deltaOverlay += vmimageKvmHypervisor = createVirtualDiskKvmHyp(storage1)
		]
		virtualNetworks += vnetwork = lcoref.createVirtualNetwork => [
			name = "Single virtual Network Layout"
		]
		// add hypervisors for all nodes 
		hypNumber = 0;
		for (rack : physicalDcModel.racks) {
			for (an : rack.nodes) {
				if (an instanceof ComputeNode) {
					volumesAndImages += vmimageKvmHypervisor = createVirtualDiskKvmHyp(an.storageSpecifications.last)
					hypervisors += lcoref.createHypervisor => [
						node = an
						hypervisorType = hvtype_kvm
						rootVolume = lcoref.createVirtualDisk => [
							name = "Overlay for KVM Hypervisor #" + hypNumber++
							capacity = Amount.valueOf(0.5, SI.GIGA(NonSI.BYTE))
							usedCapacity = Amount.valueOf(0.2, SI.GIGA(NonSI.BYTE))
							parent = vmimageKvmHypervisor
							storageLocation = an.storageSpecifications.last 
						]
					]
				}
			}
		}
		applicationTemplates += laf.createGreyBoxApplicationTemplate => [
			name = "Molpro DFT Template (Demonstration Purpose only)"
			greyBoxVMImageBehaviour = laf.createGreyBoxVMImageBehaviour => [
				vmImage = vmimageGBA
				referenceResourceSpecifications += apptempCpu = createCpu()
				referenceResourceSpecifications += apptempStorageSsd = createStorageSsd()
				createGBWorkloadDFT(it, apptempCpu, apptempStorageSsd)
			] 
		]
		applicationTemplates += apptempGba = laf.createGreyBoxApplicationTemplate => [
			name = "Molpro CCSD Template"
			greyBoxVMImageBehaviour = vmimagebehaviourGba = laf.createGreyBoxVMImageBehaviour => [
				vmImage = vmimageGBA
				referenceResourceSpecifications += apptempCpu = createCpu()
				referenceResourceSpecifications += apptempStorageSsd = createStorageSsd()
				createGBWorkload(it, apptempCpu, apptempStorageSsd)
			]
		]
		var int hypervisorNumber = 0;
		for (an : node) {
			val hn = hypervisorNumber
			for (hyp : hypervisors) {
				if (hyp.node == an) {
					// create copy of root disk system on the local node
					volumesAndImages += vmimageGBA = createGreyBoxVMImage(an.storageSpecifications.last)
					// virtual machines per physical node
					for (int i : 0..<numberVirtualMachinesPerPhysicalNode) {
						// create overlay on local disc
						val VirtualDisk vmImageGBAOverlay = lcoref.createVirtualDisk => [
							name = "Overlay for VM #" + hn + "-" + i
							capacity = Amount.valueOf(40.0, SI.GIGA(NonSI.BYTE))
							usedCapacity = Amount.valueOf(20.4, SI.GIGA(NonSI.BYTE))
							storageLocation = an.storageSpecifications.last
						]
						vmimageGBA.deltaOverlay += vmImageGBAOverlay
						hyp.virtualMachines += vmCurrent = lcoref.createVirtualMachine => [
							name = "GBA VM #" + hn + "-" + i
							state = VM_State.RUNNING
							// set runtimeApplicationModel if of interest
							virtualProcessingUnits += vcpu1 = lcoref.createVirtualProcessingUnit => [
								virtualCores = 1
								name = "vCPU Flavour 1"
								architectureType = ArchitectureTypeUtil.INSTANCE.createOrGet(architectureRepo, ArchitectureTypeUtil.ARCHITECTURE_TYPE_x86_GENERIC_UUID)
							]
							VMImageInstance =  lcoref.createVMImageInstance => [
								rootDisk = vmImageGBAOverlay
							]
							virtualMemoryUnits += vmem1 = lcoref.createVirtualMemory => [
								provisioned = Amount.valueOf(8*8, SI.GIGA(DataAmount.UNIT))
							]
							runtimeApplicationModel = laf.createGreyBoxVMBehaviour => [
								name = "CCSD Behaviour #" + hn + "-" + i
								createGBWorkload(it, an.cpuSpecifications.last, an.storageSpecifications.last)
								vmImageBehaviour = vmimagebehaviourGba
							]
						]
						// no PU affinity
						// in line assignment of application instance and VM as this is simpler in this code
						applicationInstances += laf.createGreyBoxApplicationInstance => [
							applicationTemplate = apptempGba
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
	
}
