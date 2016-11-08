import eu.cactosfp7.infrastructuremodels.logicaldc.application.ApplicationFactory
import eu.cactosfp7.infrastructuremodels.logicaldc.application.ComposedVMImage
import eu.cactosfp7.infrastructuremodels.logicaldc.application.ControlFlowAction
import eu.cactosfp7.infrastructuremodels.logicaldc.application.ControlFlowVariable
import eu.cactosfp7.infrastructuremodels.logicaldc.application.LoadBalancingPolicy
import eu.cactosfp7.infrastructuremodels.logicaldc.application.ResourceDemandAction
import eu.cactosfp7.infrastructuremodels.logicaldc.application.ScalableVMImageConnector
import eu.cactosfp7.infrastructuremodels.logicaldc.application.ServiceEffect
import eu.cactosfp7.infrastructuremodels.logicaldc.application.ServiceInterface
import eu.cactosfp7.infrastructuremodels.logicaldc.application.ServiceOperation
import eu.cactosfp7.infrastructuremodels.logicaldc.application.ServiceProvidedRole
import eu.cactosfp7.infrastructuremodels.logicaldc.application.ServiceRequiredRole
import eu.cactosfp7.infrastructuremodels.logicaldc.application.UserBehaviour
import eu.cactosfp7.infrastructuremodels.logicaldc.application.VMImageConnector
import eu.cactosfp7.infrastructuremodels.logicaldc.application.VariableAssignment
import eu.cactosfp7.infrastructuremodels.logicaldc.application.WhiteBoxApplicationTemplate
import eu.cactosfp7.infrastructuremodels.logicaldc.application.WhiteBoxUserBehaviourTemplate
import eu.cactosfp7.infrastructuremodels.logicaldc.application.WhiteBoxVMImageBehaviour
import eu.cactosfp7.infrastructuremodels.logicaldc.application.entity.ProvidedRole
import eu.cactosfp7.infrastructuremodels.logicaldc.application.util.NonIdCopier
import eu.cactosfp7.infrastructuremodels.logicaldc.core.Flavour
import eu.cactosfp7.infrastructuremodels.logicaldc.core.Hypervisor
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
import eu.cactosfp7.infrastructuremodels.physicaldc.core.NetworkAttachedStorage
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
import javax.measure.quantity.DataRate
import javax.measure.quantity.Dimensionless
import javax.measure.unit.NonSI
import javax.measure.unit.SI
import javax.measure.unit.Unit
import org.jscience.physics.amount.Amount
import tools.descartes.dlim.DlimFactory

/** This demonstration scenario show a white-box application running on the Flexiant Testbed.
 * It contains a white-box application description of the DataPlay application. 
 * This includes a description of the application template as well as running instances. 
 * It does not contain descriptions of other applications or VMs.
 * TODO(WP3/WP4, modeling support Henning) The behaviour should match the real (measured) behaviour.
 * 
 */
class WhiteBoxDemoModel {
	
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
	
	// create demo model of data centre
	var Rack rack1;
	var Rack rack2;
	var Rack rack3;
	var Switch switch1;
	var PowerDistributionUnit pduMain;
	var PowerDistributionUnit pduRack1;
	var PowerDistributionUnit pduRack2;
	var PowerDistributionUnit pduRack3;
	var ProcessingUnitSpecification cpu1;
	var MemorySpecification mem1;
	var StorageSpecification storage1;
	var NetworkInterconnect nic1;
	var Flavour flavourSmall;
	var Flavour flavourSmallPowerful;
	var Flavour flavourMedium;
	var Flavour flavourMediumMemory;
	var Flavour flavourLarge;
	var VMImage vmimageKvmHypervisor;
	
	var VMImage vmimageLoadBalancerHttp;
	var VMImage vmimageFrontend;
	var VMImage vmimageMaster;
	var VMImage vmimageCassandra;
	var VMImage vmimageRedis;
	var VMImage vmimageLoadBalancerPgpool;
	var VMImage vmimagePostgresql;
	var MonitorableResource apptempCpu;
	var MonitorableResource apptempStorage;
	var WhiteBoxApplicationTemplate apptempDataPlay;
	var WhiteBoxVMImageBehaviour vmimagebehaviourLoadBalancerFrontend; 
	var WhiteBoxVMImageBehaviour vmimagebehaviourFrontend;
	var WhiteBoxVMImageBehaviour vmimagebehaviourLoadBalancerMaster; 
	var WhiteBoxVMImageBehaviour vmimagebehaviourMaster; 
	var WhiteBoxVMImageBehaviour vmimagebehaviourCassandra; 
	var WhiteBoxVMImageBehaviour vmimagebehaviourRedis; 
	var WhiteBoxVMImageBehaviour vmimagebehaviourLoadBalancerPgpool;
	var WhiteBoxVMImageBehaviour vmimagebehaviourPostgresql;
	var ServiceInterface ifaceHttp;
	var ServiceOperation soHttpGet; 
	var ServiceInterface ifaceSql;
	var ServiceOperation soSqlExecute; 
	var ServiceInterface ifaceGeneric;
	var ServiceOperation soGenericProcess; 
	var ServiceProvidedRole provroleLBFrontend;
	var ServiceRequiredRole reqroleLBFrontendFrontend;
	var ServiceProvidedRole provroleFrontend;
	var ServiceRequiredRole reqroleFrontendLBMaster;
	var ServiceProvidedRole provroleLBMaster;
	var ServiceRequiredRole reqroleLBMasterMaster;
	var ServiceProvidedRole provroleMaster;
	var ServiceRequiredRole reqroleMasterCassandra;
	var ServiceRequiredRole reqroleMasterRedis;
	var ServiceRequiredRole reqroleMasterLBPgpool;
	var ServiceProvidedRole provroleLBPgpool;
	var ServiceRequiredRole reqroleLBPgpoolPostgresql;
	var ServiceProvidedRole provroleCassandra;
	var ServiceProvidedRole provroleRedis;
	var ServiceProvidedRole provrolePostgresql;
	
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
	var int hypNumber;

	def MemorySpecification createMemory32() {
		pcoref.createMemorySpecification => [
			name = "32GB DDR3-RAM"
			size = Amount.valueOf(220, SI.GIGA(NonSI.BYTE))
			bandwidthRead = puf.createBandwidth => [
				value = Amount.valueOf(23.984*8, SI.GIGA(DataRate.UNIT)) // 23984 MB/s http://www.corsair.com/de-de/blog/2014/september/ddr3_vs_ddr4_synthetic
			]
			bandwidthWrite = puf.createBandwidth => [
				value = Amount.valueOf(25.132*8, SI.GIGA(DataRate.UNIT)) // see above
			] 
		]
	}
	
	def MemorySpecification createMemory64() {
		pcoref.createMemorySpecification => [
			name = "64GB DDR3-RAM"
			size = Amount.valueOf(64, SI.GIGA(NonSI.BYTE))
			bandwidthRead = puf.createBandwidth => [
				value = Amount.valueOf(23.984*8, SI.GIGA(DataRate.UNIT))
			]
			bandwidthWrite = puf.createBandwidth => [
				value = Amount.valueOf(25.132*8, SI.GIGA(DataRate.UNIT))
			] 
		]
	}
	
	def MemorySpecification createMemory128() {
		pcoref.createMemorySpecification => [
			name = "128GB DDR3-RAM"
			size = Amount.valueOf(128, SI.GIGA(NonSI.BYTE))
			bandwidthRead = puf.createBandwidth => [
				value = Amount.valueOf(23.984*8, SI.GIGA(DataRate.UNIT))
			]
			bandwidthWrite = puf.createBandwidth => [
				value = Amount.valueOf(25.132*8, SI.GIGA(DataRate.UNIT))
			] 
		]
	}
	
	def StorageSpecification createStorageTemplate() {
		createStorageHdd()
	}	

	def StorageSpecification createStorageHdd() {
		pcoref.createStorageSpecification => [
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
	
	def NetworkAttachedStorage createClusterStorage(Rack rack, PowerDistributionUnit pduRack, String clusterName) {
		// add NAS
		val NetworkAttachedStorage nas = pcoref.createNetworkAttachedStorage => [
			name = clusterName
			storageSpecifications += storage1 = pcoref.createStorageSpecification => [
				name = " Virtual Storage on Cluster "+ clusterName
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
		pduRack.powerConsumingEntities += nas
		rack.nodes += nas
		nas
	}
		
	def ProcessingUnitSpecification createCpuTemplate() {
		createCpu4();
	}
	
	def ProcessingUnitSpecification createCpu32() {
		pcoref.createProcessingUnitSpecification => [
			name = "Quad-Core AMD Opteron™ Processor 8356"
			frequency = Amount.valueOf(1.8, SI.GIGA(SI.HERTZ))
			numberOfCores = 32
			supportsTurboMode = false
			architectureType = ArchitectureTypeUtil.INSTANCE.createOrGet(architectureRepo, ArchitectureTypeUtil.ARCHITECTURE_TYPE_x86_GENERIC_UUID)
			//powerModelBinding = pmb;
		]
	}
	
	def ProcessingUnitSpecification createCpu16() {
		pcoref.createProcessingUnitSpecification => [
			name = "Quad-Core AMD Opteron™ Processor 8356"
			frequency = Amount.valueOf(1.1, SI.GIGA(SI.HERTZ))
			numberOfCores = 16
			supportsTurboMode = false
			architectureType = ArchitectureTypeUtil.INSTANCE.createOrGet(architectureRepo, ArchitectureTypeUtil.ARCHITECTURE_TYPE_x86_GENERIC_UUID)
			//powerModelBinding = pmb;
		]
	}
	
	def ProcessingUnitSpecification createCpu8() {
		pcoref.createProcessingUnitSpecification => [
			name = "AMD Opteron™ Processor 6212"
			frequency = Amount.valueOf(2.6, SI.GIGA(SI.HERTZ))
			numberOfCores = 8
			supportsTurboMode = false
			architectureType = ArchitectureTypeUtil.INSTANCE.createOrGet(architectureRepo, ArchitectureTypeUtil.ARCHITECTURE_TYPE_x86_GENERIC_UUID)
			//powerModelBinding = pmb;
		]
	}

	def ProcessingUnitSpecification createCpu4() {
		pcoref.createProcessingUnitSpecification => [
			name = "AMD Opteron™ Processor 6320"
			frequency = Amount.valueOf(1.4, SI.GIGA(SI.HERTZ))
			numberOfCores = 4
			supportsTurboMode = false
			architectureType = ArchitectureTypeUtil.INSTANCE.createOrGet(architectureRepo, ArchitectureTypeUtil.ARCHITECTURE_TYPE_x86_GENERIC_UUID)
			//powerModelBinding = pmb;
		]
	}
	
	def VMImage createVmImageGeneric(String title, StorageSpecification storage) {
		lcoref.createVMImage => [
			name = title
			capacity = Amount.valueOf(8.0, SI.GIGA(NonSI.BYTE))
			usedCapacity = Amount.valueOf(5.0, SI.GIGA(NonSI.BYTE))
			//storageLocation = storage
		]
	}

	def WhiteBoxVMImageBehaviour createWhiteBoxImageBehaviour(VMImage vmimage, Flavour flavour, ServiceProvidedRole provRole,
		ServiceOperation provroleOperation, ServiceRequiredRole reqRole, ServiceOperation operation,
		VariableAssignment inputAssignment, String amountCpu, Unit<?> unitCpu, String amountStorage, Unit<?> unitStorage,
		VariableAssignment returnAssignment) {
		laf.createWhiteBoxVMImageBehaviour => [
			vmImage = vmimage
			defaultFlavour = flavour
			referenceResourceSpecifications += apptempCpu = createCpuTemplate()
			referenceResourceSpecifications += apptempStorage = createStorageTemplate()
			serviceEffects +=
					createBehaviourDemandCallReturn(provRole, provroleOperation, reqRole, operation, inputAssignment,
						createResourceDemandAction(amountCpu, unitCpu, apptempCpu, amountStorage, unitStorage,
							apptempStorage), 
						returnAssignment)
		]
	}
	
	def ResourceDemandAction createResourceDemandAction(
		String amountCpu,
		Unit<?> unitCpu,
		MonitorableResource cpu,
		String amountStorage,
		Unit<?> unitStorage,
		MonitorableResource storage) {
		laf.createResourceDemandAction => [
			if (amountCpu != null && unitCpu != null && cpu != null) {
				resourceDemands += laf.createVariableResourceDemand => [
					amount = amountCpu
					unit = unitCpu
					onResource = cpu
				]
			}
			if (amountStorage != null && unitStorage != null && storage != null) {
				resourceDemands += laf.createVariableResourceDemand => [
					amount = amountStorage
					unit = unitStorage
					onResource = storage
				]
			}
		]
	}
	
	def ServiceEffect createBehaviourDemandCallReturn(ServiceProvidedRole provRole, ServiceOperation provroleOperation,
			ServiceRequiredRole reqRole, ServiceOperation operation, VariableAssignment inputAssignment,
			ResourceDemandAction rda, VariableAssignment returnAssignment) {
		val list = newArrayList();
		var ControlFlowAction currentAction;
		var ControlFlowAction lastAction;
		// Start action
		list += lastAction = currentAction = laf.createStartAction
		// Input assignment
		if (inputAssignment != null) {
			list += currentAction = laf.createSetVariableAction => [
				variableAssignments += inputAssignment
			]
			currentAction.predecessingControlFlowAction = lastAction
			lastAction = currentAction
		}
		// Resource demand
		if (rda != null) {
			list += currentAction = rda
			currentAction.predecessingControlFlowAction = lastAction
			lastAction = currentAction
		}
		// Service call
		if (reqRole != null && operation != null) {
			list += currentAction = laf.createServiceOperationCallAction => [
				serviceRequiredRole = reqRole
				serviceOperationOfRequiredRole = operation
			]
			currentAction.predecessingControlFlowAction = lastAction
			lastAction = currentAction
		}
		// Result assignment
		if (returnAssignment != null) {
			list += currentAction = laf.createSetVariableAction => [
				variableAssignments += returnAssignment
			]
			currentAction.predecessingControlFlowAction = lastAction
			lastAction = currentAction
		}
		// Stop action
		list += currentAction = laf.createStopAction
		currentAction.predecessingControlFlowAction = lastAction
	
		laf.createServiceEffect => [
			forServiceOperation = provroleOperation
			forServiceProvidedRole = provRole
			controlFlowActions += list
		]
	}
	
	var int numberTemplateInstances = 0;
	/**Instantiate a White-Box Application Template.
	 * All VMImages are instantiated on the same node.
	 * All scalable VMs have a scaling factor of 1.
	 */
	def instantiateApplicationTemplate(WhiteBoxApplicationTemplate wbat, Hypervisor hyp) {
		numberTemplateInstances = numberTemplateInstances + 1
		// create new instance and add it to the logical model
		wbat.logicalDCModel.applicationInstances += laf.createWhiteBoxApplicationInstance => [
			applicationTemplate = wbat
			for(ComposedVMImage cvmi : wbat.composedVMImages) {
				var numberInstances = 0;
				for (VMImageConnector vmic : wbat.vmImageConnectors) {
					if (vmic instanceof ScalableVMImageConnector) {
						for (ProvidedRole pr : cvmi.providedRoles) {
							if (pr instanceof ServiceProvidedRole) {
								if (pr == vmic.serviceProvidedRole) {
									numberInstances += vmic.defaultInstances
								}
							}
						}
					}
				}
				if (numberInstances == 0) 
					numberInstances = 1
				for (var num = 1; num < numberInstances+1; num++) {
					val instanceNumber = num
					val VirtualMachine vm = lcoref.createVirtualMachine => [
						val nme = wbat.name + "A" + numberTemplateInstances + "I" + instanceNumber + "-" + cvmi.name
						name = nme
						state = VM_State.RUNNING
						// assign CPU and MEM to VM
						virtualProcessingUnits += vcpu1 = lcoref.createVirtualProcessingUnit => [
							virtualCores = cvmi.vmImageBehaviour.defaultFlavour.numberVirtualCores
							name = "vCPU based on Flavour " + cvmi.vmImageBehaviour.defaultFlavour.name
							architectureType = ArchitectureTypeUtil.INSTANCE.createOrGet(architectureRepo, ArchitectureTypeUtil.ARCHITECTURE_TYPE_x86_GENERIC_UUID)
						]
						virtualMemoryUnits += vmem1 = lcoref.createVirtualMemory => [
							provisioned = cvmi.vmImageBehaviour.defaultFlavour.sizeRam
						]
						VMImageInstance = lcoref.createVMImageInstance => [
							rootDisk = lcoref.createVirtualDisk => [
								name = "Overlay for VM " + nme + " based on Flavour " + cvmi.vmImageBehaviour.defaultFlavour.name
								capacity = cvmi.vmImageBehaviour.defaultFlavour.sizeStorage
								usedCapacity = Amount.valueOf(0.05, SI.GIGA(NonSI.BYTE))
								parent = cvmi.vmImageBehaviour.vmImage
								storageLocation = parent.storageLocation 
							]
						]
						runtimeApplicationModel = laf.createWhiteBoxVMBehaviour => [
							name = "WhiteBox VM Behaviour based on ComposedVM " + cvmi.name
							vmImageBehaviour = cvmi.vmImageBehaviour
							for (ServiceEffect se : cvmi.vmImageBehaviour.serviceEffects) {
								serviceEffects += NonIdCopier.nonIdCopy(se)
							}
						]
					]
					hyp.virtualMachines += vm
					composedVMs += laf.createComposedVM => [
						composedVMImage = cvmi
						virtualMachine = vm
				]
				}
			}
			for (WhiteBoxUserBehaviourTemplate tmpl : wbat.whiteBoxUserBehaviourTemplate) {
				whiteBoxUserBehaviourInstance += laf.createWhiteBoxUserBehaviourInstance => [
					name = "WhiteBox User Behaviour based on User Behaviour Template " + tmpl.name
					for (UserBehaviour ub : tmpl.userBehaviours) {
						userBehaviours += NonIdCopier.nonIdCopy(ub)
					}
				]
			}
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
		powerSupplies += pduRack3 = pcoref.createPowerDistributionUnit => [
			name = "Rack 3 PDU"
			suppliablePeakPower = Amount.valueOf(2, SI.KILO(SI.WATT))
			powerCap = Amount.valueOf(2, SI.KILO(SI.WATT));
			powerProvidingEntities += pduMain
		]
		racks += rack1 = pcoref.createRack => [
			name = "FCO rack A5"
			powerSupplies += pduRack1
		]
		racks += rack2 = pcoref.createRack => [
			name = "FCO rack A6"
			powerSupplies += pduRack2
		]
		racks += rack3 = pcoref.createRack => [
			name = "FCO rack A7"
			powerSupplies += pduRack3
		]
		rack2.nodes += cn = pcoref.createComputeNode => [
			name = "10.157.128.30"
			state = NodeState.RUNNING
			cpuSpecifications += cpu1 = createCpu32()
			memorySpecifications += mem1 = createMemory128()
		]
		pduRack2.powerConsumingEntities += cn;
		rack1.nodes += cn = pcoref.createComputeNode => [
			name = "10.157.128.31"
			state = NodeState.RUNNING
			cpuSpecifications += createCpu8()
			memorySpecifications += createMemory64()
		]
		pduRack1.powerConsumingEntities += cn;
		rack1.nodes += cn = pcoref.createComputeNode => [
			name = "10.157.128.32"
			state = NodeState.RUNNING
			cpuSpecifications += createCpu32()
			memorySpecifications += createMemory128()
		]
		pduRack1.powerConsumingEntities += cn;
		rack1.nodes += cn = pcoref.createComputeNode => [
			name = "10.158.128.11"
			state = NodeState.RUNNING
			cpuSpecifications += createCpu8()
			memorySpecifications += createMemory64()
		]
		pduRack1.powerConsumingEntities += cn;
		rack3.nodes += cn = pcoref.createComputeNode => [
			name = "10.158.128.12"
			state = NodeState.RUNNING
			cpuSpecifications += createCpu4()
			memorySpecifications += createMemory32()
		]
		pduRack3.powerConsumingEntities += cn;
		rack3.nodes += cn = pcoref.createComputeNode => [
			name = "10.158.128.13"
			state = NodeState.RUNNING
			cpuSpecifications += createCpu4()
			memorySpecifications += createMemory32()
		]
		pduRack3.powerConsumingEntities += cn;
		rack3.nodes += cn = pcoref.createComputeNode => [
			name = "10.158.128.14"
			state = NodeState.RUNNING
			cpuSpecifications += createCpu8()
			memorySpecifications += createMemory64()
		]
		pduRack3.powerConsumingEntities += cn;
		rack1.nodes += cn = pcoref.createComputeNode => [
			name = "10.158.128.15"
			state = NodeState.RUNNING
			cpuSpecifications += createCpu8()
			memorySpecifications += createMemory64()
		]
		pduRack1.powerConsumingEntities += cn;
		rack1.nodes += cn = pcoref.createComputeNode => [
			name = "10.158.128.16"
			state = NodeState.RUNNING
			cpuSpecifications += createCpu8()
			memorySpecifications += createMemory64()
		]
		pduRack1.powerConsumingEntities += cn;
		rack2.nodes += cn = pcoref.createComputeNode => [
			name = "10.158.128.17"
			state = NodeState.RUNNING
			cpuSpecifications += createCpu32()
			memorySpecifications += createMemory128()
		]
		pduRack2.powerConsumingEntities += cn;
		rack3.nodes += cn = pcoref.createComputeNode => [
			name = "10.158.128.18"
			state = NodeState.RUNNING
			cpuSpecifications += createCpu32()
			memorySpecifications += createMemory128()
		]
		pduRack3.powerConsumingEntities += cn;
		createClusterStorage(rack1, pduRack1, "CEPH Cluster 1")
		storage1 = createClusterStorage(rack2, pduRack2, "CEPH Cluster 2").storageSpecifications.last
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
			for (an : rack2.nodes) {
				containedNodes += an
			}
			for (an : rack3.nodes) {
				containedNodes += an
			}
		]
	]
	
	// Logical DC Model
	public val logicalDcModel = lcoref.createLogicalDCModel => [
		cyclicOptimizationInterval = Amount.valueOf(60, SI.SECOND)
		flavours += flavourSmall = lcoref.createFlavour => [
			architectureType = ArchitectureTypeUtil.INSTANCE.createOrGet(architectureRepo, ArchitectureTypeUtil.ARCHITECTURE_TYPE_x86_GENERIC_UUID)
			name = "Small"
			flavourRefVMI = "XXXX-XXXX-XXXX-XXXX"
			numberVirtualCores = 1
			sizeRam = Amount.valueOf(1, SI.GIGA(NonSI.BYTE))
			sizeStorage = Amount.valueOf(20, SI.GIGA(NonSI.BYTE))
		]
		flavours += flavourSmallPowerful = lcoref.createFlavour => [
			architectureType = ArchitectureTypeUtil.INSTANCE.createOrGet(architectureRepo, ArchitectureTypeUtil.ARCHITECTURE_TYPE_x86_GENERIC_UUID)
			name = "Small but Powerful"
			flavourRefVMI = "XXXX-XXXX-XXXX-XXYY"
			numberVirtualCores = 2
			sizeRam = Amount.valueOf(1, SI.GIGA(NonSI.BYTE))
			sizeStorage = Amount.valueOf(20, SI.GIGA(NonSI.BYTE))
		]
		flavours += flavourMedium = lcoref.createFlavour => [
			architectureType = ArchitectureTypeUtil.INSTANCE.createOrGet(architectureRepo, ArchitectureTypeUtil.ARCHITECTURE_TYPE_x86_GENERIC_UUID)
			name = "Medium"
			flavourRefVMI = "XXXX-XXXX-XXXX-YYYY"
			numberVirtualCores = 2
			sizeRam = Amount.valueOf(2, SI.GIGA(NonSI.BYTE))
			sizeStorage = Amount.valueOf(20, SI.GIGA(NonSI.BYTE))
		]
		flavours += flavourMediumMemory = lcoref.createFlavour => [
			architectureType = ArchitectureTypeUtil.INSTANCE.createOrGet(architectureRepo, ArchitectureTypeUtil.ARCHITECTURE_TYPE_x86_GENERIC_UUID)
			name = "Medium with larger Memory"
			flavourRefVMI = "XXXX-XXXX-XXXX-YYZZ"
			numberVirtualCores = 2
			sizeRam = Amount.valueOf(4, SI.GIGA(NonSI.BYTE))
			sizeStorage = Amount.valueOf(20, SI.GIGA(NonSI.BYTE))
		]
		flavours += flavourLarge = lcoref.createFlavour => [
			architectureType = ArchitectureTypeUtil.INSTANCE.createOrGet(architectureRepo, ArchitectureTypeUtil.ARCHITECTURE_TYPE_x86_GENERIC_UUID)
			name = "Large"
			flavourRefVMI = "XXXX-XXXX-XXXX-ZZZZ"
			numberVirtualCores = 4
			sizeRam = Amount.valueOf(8, SI.GIGA(NonSI.BYTE))
			sizeStorage = Amount.valueOf(20, SI.GIGA(NonSI.BYTE))
		]
		volumesAndImages += vmimageKvmHypervisor = createVmImageGeneric("KvmHypervisor", storage1)
		volumesAndImages += vmimageLoadBalancerHttp = createVmImageGeneric("LoadBalancerHttp", storage1)
		volumesAndImages += vmimageFrontend = createVmImageGeneric("Frontend", storage1)
		volumesAndImages += vmimageMaster = createVmImageGeneric("Master", storage1)
		volumesAndImages += vmimageCassandra = createVmImageGeneric("Cassandra", storage1)
		volumesAndImages += vmimageRedis = createVmImageGeneric("Redis", storage1)
		volumesAndImages += vmimageLoadBalancerPgpool = createVmImageGeneric("LoadBalancerPgpool", storage1)
		volumesAndImages += vmimagePostgresql = createVmImageGeneric("Postgresql / DataPlay Permanent Storage", storage1)
		virtualNetworks += vnetwork = lcoref.createVirtualNetwork => [
			name = "Single virtual Network Layout"
		]
		
		// add application interface type descriptions
		serviceInterfaces += ifaceHttp = laf.createServiceInterface => [
			name = "http"
			serviceOperations += soHttpGet = laf.createServiceOperation => [
				name = "get"
			]
			serviceOperations += laf.createServiceOperation => [
				name = "put"
			]
			serviceOperations += laf.createServiceOperation => [
				name = "post"
			]
			serviceOperations += laf.createServiceOperation => [
				name = "delete"
			]
		]
		serviceInterfaces += ifaceSql = laf.createServiceInterface => [
			name = "sql"
			serviceOperations += soSqlExecute = laf.createServiceOperation => [
				name = "execute"
			]
		]
		serviceInterfaces += ifaceGeneric = laf.createServiceInterface => [
			name = "generic"
			serviceOperations += soGenericProcess = laf.createServiceOperation => [
				name = "process"
			]
		]
		applicationTemplates += apptempDataPlay = laf.createWhiteBoxApplicationTemplate => [
			name = "DataPlay"
			// specify architecture of application
			composedVMImages += laf.createComposedVMImage => [
				name = "Load Balancer Frontend"
				providedRoles += provroleLBFrontend = laf.createServiceProvidedRole => [
					name = "Provided_LBFrontend_HTTP"
					serviceInterface = ifaceHttp
				]
				requiredRoles += reqroleLBFrontendFrontend = laf.createServiceRequiredRole => [
					name ="Required_LBFrontend_Frontend_HTTP"
					serviceInterface = ifaceHttp
				]
				vmImageBehaviour = vmimagebehaviourLoadBalancerFrontend = createWhiteBoxImageBehaviour(
										vmimageLoadBalancerHttp, flavourMedium, provroleLBFrontend, soHttpGet, reqroleLBFrontendFrontend, soHttpGet, null,
										"100", SI.KILO(SI.HERTZ), null, null, 
										null)
			]
			userFacingServices += provroleLBFrontend
			composedVMImages += laf.createComposedVMImage => [
				name = "Frontend"
				providedRoles += provroleFrontend = laf.createServiceProvidedRole => [
					name = "Provided_Frontend_HTTP"
					serviceInterface = ifaceHttp
				]
				requiredRoles += reqroleFrontendLBMaster = laf.createServiceRequiredRole => [
					name ="Required_Frontend_LBMaster_HTTP"
					serviceInterface = ifaceHttp
				]
				vmImageBehaviour = vmimagebehaviourFrontend = createWhiteBoxImageBehaviour(vmimageFrontend, flavourSmallPowerful, provroleFrontend, soHttpGet,
										reqroleFrontendLBMaster, soHttpGet, null, 
										"100", SI.KILO(SI.HERTZ), "2", SI.MEGA(NonSI.BYTE), 
										null)
			]
			composedVMImages += laf.createComposedVMImage => [
				name = "Load Balancer Master"
				providedRoles += provroleLBMaster = laf.createServiceProvidedRole => [
					name = "Provided_LBMaster_HTTP"
					serviceInterface = ifaceHttp
				]
				requiredRoles += reqroleLBMasterMaster= laf.createServiceRequiredRole => [
					name ="Required_LBMaster_Master_HTTP"
					serviceInterface = ifaceHttp
				]
				vmImageBehaviour = vmimagebehaviourLoadBalancerMaster = createWhiteBoxImageBehaviour(
										vmimageLoadBalancerHttp, flavourMedium, provroleLBMaster,
										soHttpGet, reqroleLBMasterMaster, soHttpGet, 
										laf.createVariableAssignment => [
											variable = ControlFlowVariable.REQUESTBYTESIZE
											value = "2*REQUEST.BYTESIZE"
										], 
										"100", SI.KILO(SI.HERTZ), null, null, 
										null)
			]
			composedVMImages += laf.createComposedVMImage => [
				name = "Master"
				providedRoles += provroleMaster = laf.createServiceProvidedRole => [
					name = "Provided_Master_HTTP"
					serviceInterface = ifaceHttp
				]
				requiredRoles += reqroleMasterLBPgpool = laf.createServiceRequiredRole => [
					name ="Required_Master_Pgpool_SQL"
					serviceInterface = ifaceSql
				]
				requiredRoles += reqroleMasterRedis = laf.createServiceRequiredRole => [
					name ="Required_Master_Redis_GENERIC"
					serviceInterface = ifaceGeneric
				]
				requiredRoles += reqroleMasterCassandra = laf.createServiceRequiredRole => [
					name ="Required_Master_Cassandra_GENERIC"
					serviceInterface = ifaceGeneric
				]
				vmImageBehaviour = vmimagebehaviourMaster = createWhiteBoxImageBehaviour(
										vmimageMaster, flavourMedium, provroleMaster, soHttpGet,
										reqroleMasterLBPgpool, soSqlExecute, null, 
										"3", SI.KILO(SI.HERTZ), "5", SI.MEGA(NonSI.BYTE), 
										null)
			]
			composedVMImages += laf.createComposedVMImage => [
				name = "Load Balancer PgPool"
				providedRoles += provroleLBPgpool = laf.createServiceProvidedRole => [
					name = "Provided_LBPgpool_SQL"
					serviceInterface = ifaceSql
				]
				requiredRoles += reqroleLBPgpoolPostgresql = laf.createServiceRequiredRole => [
					name ="Required_LBPgPool_Postgresql_SQL"
					serviceInterface = ifaceSql
				]
				vmImageBehaviour = vmimagebehaviourLoadBalancerPgpool = createWhiteBoxImageBehaviour(
										vmimageLoadBalancerPgpool, flavourMediumMemory, provroleLBPgpool,
										soSqlExecute, reqroleLBPgpoolPostgresql, soSqlExecute,
 										laf.createVariableAssignment => [
											variable = ControlFlowVariable.REQUESTBYTESIZE
											value = "70"
										], 
										"100", SI.KILO(SI.HERTZ), null, null, null)
			]
			composedVMImages += laf.createComposedVMImage => [
				name = "Cassandra"
				providedRoles += provroleCassandra = laf.createServiceProvidedRole => [
					name = "Provided_Cassandra_GENERIC"
					serviceInterface = ifaceGeneric
				]
				vmImageBehaviour = vmimagebehaviourCassandra = createWhiteBoxImageBehaviour(
					vmimageCassandra, flavourLarge, provroleCassandra,
										soGenericProcess, null, null, null, 
										"1", SI.KILO(SI.HERTZ), "1", SI.MEGA(NonSI.BYTE), 
										null)
			]
			composedVMImages += laf.createComposedVMImage => [
				name = "Redis"
				providedRoles += provroleRedis = laf.createServiceProvidedRole => [
					name = "Provided_Redis_GENERIC"
					serviceInterface = ifaceGeneric
				]
				vmImageBehaviour = vmimagebehaviourRedis = createWhiteBoxImageBehaviour(
										vmimageRedis, flavourSmall, 
										provroleCassandra,
										soGenericProcess,
										null,
										null,
										null,
										"1", SI.KILO(SI.HERTZ), "1", SI.MEGA(NonSI.BYTE),
										null
									)
			]
			composedVMImages += laf.createComposedVMImage => [
				name = "Postgresql"
				providedRoles += provrolePostgresql = laf.createServiceProvidedRole => [
					name = "Provided_Postgresql_SQL"
					serviceInterface = ifaceSql
				]
				val resultAssignment = laf.createVariableAssignment => [
					variable = ControlFlowVariable.RESPONSEBYTESIZE
					value = "IntPMF[(30;0.1)(1024;0.2)(4096;0.50)(1048576;0.2)]" // Byte returned from DB per query
				]
				vmImageBehaviour = vmimagebehaviourPostgresql = createWhiteBoxImageBehaviour(vmimagePostgresql, flavourMedium, provrolePostgresql,
										soSqlExecute, null, null, null, 
										"400", SI.KILO(SI.HERTZ), "Exp(0.5)", SI.MEGA(NonSI.BYTE), 
										resultAssignment)
			]
			vmImageConnectors += laf.createScalableVMImageConnector => [
				loadBalancingPolicy = LoadBalancingPolicy.ROUND_ROBIN
				autoScalingAnalysisInterval = Amount.valueOf(5, SI.SECOND)
				minInstances = 1
				defaultInstances = 1
				maxInstances = 3
				serviceRequiredRole = reqroleLBFrontendFrontend
				serviceProvidedRole = provroleFrontend
			]
			vmImageConnectors += laf.createVMImageConnector => [
				serviceRequiredRole = reqroleFrontendLBMaster
				serviceProvidedRole = provroleLBMaster
			]
			vmImageConnectors += laf.createScalableVMImageConnector => [
				loadBalancingPolicy = LoadBalancingPolicy.ROUND_ROBIN
				autoScalingAnalysisInterval = Amount.valueOf(5, SI.SECOND)
				minInstances = 2
				defaultInstances = 2
				maxInstances = 7
				serviceRequiredRole = reqroleLBMasterMaster
				serviceProvidedRole = provroleMaster
			]
			vmImageConnectors += laf.createVMImageConnector => [
				serviceRequiredRole = reqroleMasterCassandra
				serviceProvidedRole = provroleCassandra
			]
			vmImageConnectors += laf.createVMImageConnector => [
				serviceRequiredRole = reqroleMasterRedis
				serviceProvidedRole = provroleRedis
			]
			vmImageConnectors += laf.createVMImageConnector => [
				serviceRequiredRole = reqroleMasterLBPgpool
				serviceProvidedRole = provroleLBPgpool
			]
			vmImageConnectors += laf.createScalableVMImageConnector => [
				loadBalancingPolicy = LoadBalancingPolicy.ROUND_ROBIN
				autoScalingAnalysisInterval = Amount.valueOf(120, SI.SECOND)
				minInstances = 2
				defaultInstances = 2
				maxInstances = 5
				serviceRequiredRole = reqroleLBPgpoolPostgresql
				serviceProvidedRole = provrolePostgresql
			]
			// generic behaviour can be specified  
			whiteBoxUserBehaviourTemplate += laf.createWhiteBoxUserBehaviourTemplate => [
				name = "Typical Reference Scenario of DataPlay"
				// Add one user type with an OpenWorkload arrival behaviour 
				userBehaviours += laf.createUserBehaviour => [
					name = "User Type 01"
					arrivalRate = laf.createVariableOpenWorkload => [
						arrivalRate = df.createSequence => [
							terminateAfterLoops = -1
							terminateAfterTime = 1000
							sequenceFunctionContainers += df.createTimeDependentFunctionContainer => [
								duration = 100
								function = df.createConstant => [
									constant = 0.3;
								]
							];
							sequenceFunctionContainers += df.createTimeDependentFunctionContainer => [
								duration = 500
								function = df.createLinearTrend => [
									functionOutputAtStart = 0.3;
									functionOutputAtEnd = 30.0;
								]
							]
							sequenceFunctionContainers += df.createTimeDependentFunctionContainer => [
								duration = 50
								function = df.createConstant => [
									constant = 30;
								]
							];
							sequenceFunctionContainers += df.createTimeDependentFunctionContainer => [
								duration = 350
								function = df.createLinearTrend => [
									functionOutputAtStart = 30.0;
									functionOutputAtEnd = 0.3;
								]
							]
						]
						arrivalRateUnit = Unit.ONE.divide(SI.SECOND);
						//interarrivalTime = "0.3" // new user every 0.3 time units
						samplingInterval = Amount.valueOf(1.0, SI.SECOND);
						
					]
					var ControlFlowAction lastAction;
					var ControlFlowAction currentAction;
					// StartAction
					controlFlowActions += lastAction = laf.createStartAction
					// Set Parameters for Call
					controlFlowActions += currentAction = laf.createSetVariableAction => [
						variableAssignments += laf.createVariableAssignment => [
							variable = ControlFlowVariable.REQUESTBYTESIZE
							value = "20" // Byte
						]
					]
					// OperationCall
					currentAction.predecessingControlFlowAction = lastAction
					lastAction = currentAction;
					controlFlowActions += currentAction = laf.createApplicationCallAction => [
						serviceProvidedRole = provroleLBFrontend
						serviceOperationOfProvidedRole = soHttpGet
					]
					// StopAction
					currentAction.predecessingControlFlowAction = lastAction
					lastAction = currentAction;
					controlFlowActions += currentAction = laf.createStopAction
					currentAction.predecessingControlFlowAction = lastAction
					lastAction = currentAction;
				]
			]
		]
	]
}
