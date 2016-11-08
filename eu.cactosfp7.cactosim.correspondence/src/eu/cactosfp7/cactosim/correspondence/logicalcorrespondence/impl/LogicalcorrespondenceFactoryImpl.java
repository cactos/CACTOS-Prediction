/**
 */
package eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl;

import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LogicalcorrespondenceFactoryImpl extends EFactoryImpl implements LogicalcorrespondenceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LogicalcorrespondenceFactory init() {
		try {
			LogicalcorrespondenceFactory theLogicalcorrespondenceFactory = (LogicalcorrespondenceFactory)EPackage.Registry.INSTANCE.getEFactory(LogicalcorrespondencePackage.eNS_URI);
			if (theLogicalcorrespondenceFactory != null) {
				return theLogicalcorrespondenceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LogicalcorrespondenceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalcorrespondenceFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case LogicalcorrespondencePackage.VIRTUAL_MEMORY_MEASUREMENT_CORRESPONDENCE: return (EObject)createVirtualMemoryMeasurementCorrespondence();
			case LogicalcorrespondencePackage.VIRTUAL_NETWORK_INTERCONNECT_MEASUREMENT_CORRESPONDENCE: return (EObject)createVirtualNetworkInterconnectMeasurementCorrespondence();
			case LogicalcorrespondencePackage.VIRTUAL_PROCESSING_UNIT_MEASUREMENT_CORRESPONDENCE: return (EObject)createVirtualProcessingUnitMeasurementCorrespondence();
			case LogicalcorrespondencePackage.LOGICAL_DISK_READ_MEASUREMENT_CORRESPONDENCE: return (EObject)createLogicalDiskReadMeasurementCorrespondence();
			case LogicalcorrespondencePackage.LOGICAL_DISK_WRITE_MEASUREMENT_CORRESPONDENCE: return (EObject)createLogicalDiskWriteMeasurementCorrespondence();
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY: return (EObject)createLogicalCorrespondenceRepository();
			case LogicalcorrespondencePackage.VM_IMAGE_INSTANCE_CORRESPONDENCE: return (EObject)createVMImageInstanceCorrespondence();
			case LogicalcorrespondencePackage.VM_IMAGE_CORRESPONDENCE: return (EObject)createVMImageCorrespondence();
			case LogicalcorrespondencePackage.VIRTUAL_NETWORK_INTERCONNECT_CORRESPONDENCE: return (EObject)createVirtualNetworkInterconnectCorrespondence();
			case LogicalcorrespondencePackage.VIRTUAL_MACHINE_CORRESPONDENCE: return (EObject)createVirtualMachineCorrespondence();
			case LogicalcorrespondencePackage.HYPERVISOR_CORRESPONDENCE: return (EObject)createHypervisorCorrespondence();
			case LogicalcorrespondencePackage.NETWORK_ATTACHED_STORAGE_CORRESPONDENCE: return (EObject)createNetworkAttachedStorageCorrespondence();
			case LogicalcorrespondencePackage.OPTIMISATION_PLAN_CORRESPONDENCE: return (EObject)createOptimisationPlanCorrespondence();
			case LogicalcorrespondencePackage.PROVIDED_SERVICE_CORRESPONDENCE: return (EObject)createProvidedServiceCorrespondence();
			case LogicalcorrespondencePackage.REQUIRED_SERVICE_CORRESPONDENCE: return (EObject)createRequiredServiceCorrespondence();
			case LogicalcorrespondencePackage.SCALABLE_VM_IMAGE_CONNECTOR_CORRESPONDENCE: return (EObject)createScalableVMImageConnectorCorrespondence();
			case LogicalcorrespondencePackage.USER_BEHAVIOUR_CORRESPONDENCE: return (EObject)createUserBehaviourCorrespondence();
			case LogicalcorrespondencePackage.REQUEST_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE: return (EObject)createRequestArrivalRateMeasurementCorrespondence();
			case LogicalcorrespondencePackage.RESPONSE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE: return (EObject)createResponseArrivalRateMeasurementCorrespondence();
			case LogicalcorrespondencePackage.SERVICE_INSTANCE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE: return (EObject)createServiceInstanceArrivalRateMeasurementCorrespondence();
			case LogicalcorrespondencePackage.SERVICE_OPERATION_INSTANCE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE: return (EObject)createServiceOperationInstanceArrivalRateMeasurementCorrespondence();
			case LogicalcorrespondencePackage.SERVICE_OPERATION_CORRESPONDENCE: return (EObject)createServiceOperationCorrespondence();
			case LogicalcorrespondencePackage.APPLICATION_PROVIDED_SERVICE_CORRESPONDENCE: return (EObject)createApplicationProvidedServiceCorrespondence();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualMemoryMeasurementCorrespondence createVirtualMemoryMeasurementCorrespondence() {
		VirtualMemoryMeasurementCorrespondenceImpl virtualMemoryMeasurementCorrespondence = new VirtualMemoryMeasurementCorrespondenceImpl();
		return virtualMemoryMeasurementCorrespondence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualNetworkInterconnectMeasurementCorrespondence createVirtualNetworkInterconnectMeasurementCorrespondence() {
		VirtualNetworkInterconnectMeasurementCorrespondenceImpl virtualNetworkInterconnectMeasurementCorrespondence = new VirtualNetworkInterconnectMeasurementCorrespondenceImpl();
		return virtualNetworkInterconnectMeasurementCorrespondence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualProcessingUnitMeasurementCorrespondence createVirtualProcessingUnitMeasurementCorrespondence() {
		VirtualProcessingUnitMeasurementCorrespondenceImpl virtualProcessingUnitMeasurementCorrespondence = new VirtualProcessingUnitMeasurementCorrespondenceImpl();
		return virtualProcessingUnitMeasurementCorrespondence;
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public LogicalDiskReadMeasurementCorrespondence createLogicalDiskReadMeasurementCorrespondence() {
		LogicalDiskReadMeasurementCorrespondenceImpl logicalDiskReadMeasurementCorrespondence = new LogicalDiskReadMeasurementCorrespondenceImpl();
		return logicalDiskReadMeasurementCorrespondence;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public LogicalDiskWriteMeasurementCorrespondence createLogicalDiskWriteMeasurementCorrespondence() {
		LogicalDiskWriteMeasurementCorrespondenceImpl logicalDiskWriteMeasurementCorrespondence = new LogicalDiskWriteMeasurementCorrespondenceImpl();
		return logicalDiskWriteMeasurementCorrespondence;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalCorrespondenceRepository createLogicalCorrespondenceRepository() {
		LogicalCorrespondenceRepositoryImpl logicalCorrespondenceRepository = new LogicalCorrespondenceRepositoryImpl();
		return logicalCorrespondenceRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VMImageInstanceCorrespondence createVMImageInstanceCorrespondence() {
		VMImageInstanceCorrespondenceImpl vmImageInstanceCorrespondence = new VMImageInstanceCorrespondenceImpl();
		return vmImageInstanceCorrespondence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VMImageCorrespondence createVMImageCorrespondence() {
		VMImageCorrespondenceImpl vmImageCorrespondence = new VMImageCorrespondenceImpl();
		return vmImageCorrespondence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualNetworkInterconnectCorrespondence createVirtualNetworkInterconnectCorrespondence() {
		VirtualNetworkInterconnectCorrespondenceImpl virtualNetworkInterconnectCorrespondence = new VirtualNetworkInterconnectCorrespondenceImpl();
		return virtualNetworkInterconnectCorrespondence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualMachineCorrespondence createVirtualMachineCorrespondence() {
		VirtualMachineCorrespondenceImpl virtualMachineCorrespondence = new VirtualMachineCorrespondenceImpl();
		return virtualMachineCorrespondence;
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public HypervisorCorrespondence createHypervisorCorrespondence() {
		HypervisorCorrespondenceImpl hypervisorCorrespondence = new HypervisorCorrespondenceImpl();
		return hypervisorCorrespondence;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NetworkAttachedStorageCorrespondence createNetworkAttachedStorageCorrespondence() {
		NetworkAttachedStorageCorrespondenceImpl networkAttachedStorageCorrespondence = new NetworkAttachedStorageCorrespondenceImpl();
		return networkAttachedStorageCorrespondence;
	}

    /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public OptimisationPlanCorrespondence createOptimisationPlanCorrespondence() {
		OptimisationPlanCorrespondenceImpl optimisationPlanCorrespondence = new OptimisationPlanCorrespondenceImpl();
		return optimisationPlanCorrespondence;
	}

/**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public ProvidedServiceCorrespondence createProvidedServiceCorrespondence() {
		ProvidedServiceCorrespondenceImpl providedServiceCorrespondence = new ProvidedServiceCorrespondenceImpl();
		return providedServiceCorrespondence;
	}

/**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public RequiredServiceCorrespondence createRequiredServiceCorrespondence() {
		RequiredServiceCorrespondenceImpl requiredServiceCorrespondence = new RequiredServiceCorrespondenceImpl();
		return requiredServiceCorrespondence;
	}

/**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public ScalableVMImageConnectorCorrespondence createScalableVMImageConnectorCorrespondence() {
		ScalableVMImageConnectorCorrespondenceImpl scalableVMImageConnectorCorrespondence = new ScalableVMImageConnectorCorrespondenceImpl();
		return scalableVMImageConnectorCorrespondence;
	}

/**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public UserBehaviourCorrespondence createUserBehaviourCorrespondence() {
		UserBehaviourCorrespondenceImpl userBehaviourCorrespondence = new UserBehaviourCorrespondenceImpl();
		return userBehaviourCorrespondence;
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestArrivalRateMeasurementCorrespondence createRequestArrivalRateMeasurementCorrespondence() {
		RequestArrivalRateMeasurementCorrespondenceImpl requestArrivalRateMeasurementCorrespondence = new RequestArrivalRateMeasurementCorrespondenceImpl();
		return requestArrivalRateMeasurementCorrespondence;
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseArrivalRateMeasurementCorrespondence createResponseArrivalRateMeasurementCorrespondence() {
		ResponseArrivalRateMeasurementCorrespondenceImpl responseArrivalRateMeasurementCorrespondence = new ResponseArrivalRateMeasurementCorrespondenceImpl();
		return responseArrivalRateMeasurementCorrespondence;
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceInstanceArrivalRateMeasurementCorrespondence createServiceInstanceArrivalRateMeasurementCorrespondence() {
		ServiceInstanceArrivalRateMeasurementCorrespondenceImpl serviceInstanceArrivalRateMeasurementCorrespondence = new ServiceInstanceArrivalRateMeasurementCorrespondenceImpl();
		return serviceInstanceArrivalRateMeasurementCorrespondence;
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceOperationInstanceArrivalRateMeasurementCorrespondence createServiceOperationInstanceArrivalRateMeasurementCorrespondence() {
		ServiceOperationInstanceArrivalRateMeasurementCorrespondenceImpl serviceOperationInstanceArrivalRateMeasurementCorrespondence = new ServiceOperationInstanceArrivalRateMeasurementCorrespondenceImpl();
		return serviceOperationInstanceArrivalRateMeasurementCorrespondence;
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceOperationCorrespondence createServiceOperationCorrespondence() {
		ServiceOperationCorrespondenceImpl serviceOperationCorrespondence = new ServiceOperationCorrespondenceImpl();
		return serviceOperationCorrespondence;
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationProvidedServiceCorrespondence createApplicationProvidedServiceCorrespondence() {
		ApplicationProvidedServiceCorrespondenceImpl applicationProvidedServiceCorrespondence = new ApplicationProvidedServiceCorrespondenceImpl();
		return applicationProvidedServiceCorrespondence;
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalcorrespondencePackage getLogicalcorrespondencePackage() {
		return (LogicalcorrespondencePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LogicalcorrespondencePackage getPackage() {
		return LogicalcorrespondencePackage.eINSTANCE;
	}

} //LogicalcorrespondenceFactoryImpl
