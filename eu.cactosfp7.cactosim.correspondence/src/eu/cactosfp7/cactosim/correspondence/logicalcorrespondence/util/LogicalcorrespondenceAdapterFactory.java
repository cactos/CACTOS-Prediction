/**
 */
package eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.util;

import eu.cactosfp7.cactosim.correspondence.LoadCorrespondence;

import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.*;

import eu.cactosfp7.identifier.Identifier;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalcorrespondencePackage
 * @generated
 */
public class LogicalcorrespondenceAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LogicalcorrespondencePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalcorrespondenceAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = LogicalcorrespondencePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogicalcorrespondenceSwitch<Adapter> modelSwitch =
		new LogicalcorrespondenceSwitch<Adapter>() {
			@Override
			public Adapter caseVirtualMemoryMeasurementCorrespondence(VirtualMemoryMeasurementCorrespondence object) {
				return createVirtualMemoryMeasurementCorrespondenceAdapter();
			}
			@Override
			public Adapter caseVirtualNetworkInterconnectMeasurementCorrespondence(VirtualNetworkInterconnectMeasurementCorrespondence object) {
				return createVirtualNetworkInterconnectMeasurementCorrespondenceAdapter();
			}
			@Override
			public Adapter caseVirtualProcessingUnitMeasurementCorrespondence(VirtualProcessingUnitMeasurementCorrespondence object) {
				return createVirtualProcessingUnitMeasurementCorrespondenceAdapter();
			}
			@Override
			public Adapter caseLogicalDiskReadMeasurementCorrespondence(LogicalDiskReadMeasurementCorrespondence object) {
				return createLogicalDiskReadMeasurementCorrespondenceAdapter();
			}
			@Override
			public Adapter caseLogicalDiskWriteMeasurementCorrespondence(LogicalDiskWriteMeasurementCorrespondence object) {
				return createLogicalDiskWriteMeasurementCorrespondenceAdapter();
			}
			@Override
			public Adapter caseLogicalCorrespondenceRepository(LogicalCorrespondenceRepository object) {
				return createLogicalCorrespondenceRepositoryAdapter();
			}
			@Override
			public Adapter caseVMImageInstanceCorrespondence(VMImageInstanceCorrespondence object) {
				return createVMImageInstanceCorrespondenceAdapter();
			}
			@Override
			public Adapter caseVMImageCorrespondence(VMImageCorrespondence object) {
				return createVMImageCorrespondenceAdapter();
			}
			@Override
			public Adapter caseVirtualNetworkInterconnectCorrespondence(VirtualNetworkInterconnectCorrespondence object) {
				return createVirtualNetworkInterconnectCorrespondenceAdapter();
			}
			@Override
			public Adapter caseVirtualMachineCorrespondence(VirtualMachineCorrespondence object) {
				return createVirtualMachineCorrespondenceAdapter();
			}
			@Override
			public Adapter caseHypervisorCorrespondence(HypervisorCorrespondence object) {
				return createHypervisorCorrespondenceAdapter();
			}
			@Override
			public Adapter caseNetworkAttachedStorageCorrespondence(NetworkAttachedStorageCorrespondence object) {
				return createNetworkAttachedStorageCorrespondenceAdapter();
			}
			@Override
			public Adapter caseOptimisationPlanCorrespondence(OptimisationPlanCorrespondence object) {
				return createOptimisationPlanCorrespondenceAdapter();
			}
			@Override
			public Adapter caseProvidedServiceCorrespondence(ProvidedServiceCorrespondence object) {
				return createProvidedServiceCorrespondenceAdapter();
			}
			@Override
			public Adapter caseRequiredServiceCorrespondence(RequiredServiceCorrespondence object) {
				return createRequiredServiceCorrespondenceAdapter();
			}
			@Override
			public Adapter caseScalableVMImageConnectorCorrespondence(ScalableVMImageConnectorCorrespondence object) {
				return createScalableVMImageConnectorCorrespondenceAdapter();
			}
			@Override
			public Adapter caseUserBehaviourCorrespondence(UserBehaviourCorrespondence object) {
				return createUserBehaviourCorrespondenceAdapter();
			}
			@Override
			public Adapter caseRequestArrivalRateMeasurementCorrespondence(RequestArrivalRateMeasurementCorrespondence object) {
				return createRequestArrivalRateMeasurementCorrespondenceAdapter();
			}
			@Override
			public Adapter caseResponseArrivalRateMeasurementCorrespondence(ResponseArrivalRateMeasurementCorrespondence object) {
				return createResponseArrivalRateMeasurementCorrespondenceAdapter();
			}
			@Override
			public Adapter caseServiceInstanceArrivalRateMeasurementCorrespondence(ServiceInstanceArrivalRateMeasurementCorrespondence object) {
				return createServiceInstanceArrivalRateMeasurementCorrespondenceAdapter();
			}
			@Override
			public Adapter caseServiceOperationInstanceArrivalRateMeasurementCorrespondence(ServiceOperationInstanceArrivalRateMeasurementCorrespondence object) {
				return createServiceOperationInstanceArrivalRateMeasurementCorrespondenceAdapter();
			}
			@Override
			public Adapter caseArrivalRateMeasurementCorrespondence(ArrivalRateMeasurementCorrespondence object) {
				return createArrivalRateMeasurementCorrespondenceAdapter();
			}
			@Override
			public Adapter caseServiceOperationCorrespondence(ServiceOperationCorrespondence object) {
				return createServiceOperationCorrespondenceAdapter();
			}
			@Override
			public Adapter caseApplicationProvidedServiceCorrespondence(ApplicationProvidedServiceCorrespondence object) {
				return createApplicationProvidedServiceCorrespondenceAdapter();
			}
			@Override
			public Adapter caseIdentifier(Identifier object) {
				return createIdentifierAdapter();
			}
			@Override
			public Adapter caseLoadCorrespondence(LoadCorrespondence object) {
				return createLoadCorrespondenceAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VirtualMemoryMeasurementCorrespondence <em>Virtual Memory Measurement Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VirtualMemoryMeasurementCorrespondence
	 * @generated
	 */
	public Adapter createVirtualMemoryMeasurementCorrespondenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VirtualNetworkInterconnectMeasurementCorrespondence <em>Virtual Network Interconnect Measurement Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VirtualNetworkInterconnectMeasurementCorrespondence
	 * @generated
	 */
	public Adapter createVirtualNetworkInterconnectMeasurementCorrespondenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VirtualProcessingUnitMeasurementCorrespondence <em>Virtual Processing Unit Measurement Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VirtualProcessingUnitMeasurementCorrespondence
	 * @generated
	 */
	public Adapter createVirtualProcessingUnitMeasurementCorrespondenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalDiskReadMeasurementCorrespondence <em>Logical Disk Read Measurement Correspondence</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalDiskReadMeasurementCorrespondence
	 * @generated
	 */
    public Adapter createLogicalDiskReadMeasurementCorrespondenceAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalDiskWriteMeasurementCorrespondence <em>Logical Disk Write Measurement Correspondence</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalDiskWriteMeasurementCorrespondence
	 * @generated
	 */
    public Adapter createLogicalDiskWriteMeasurementCorrespondenceAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalCorrespondenceRepository <em>Logical Correspondence Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalCorrespondenceRepository
	 * @generated
	 */
	public Adapter createLogicalCorrespondenceRepositoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VMImageInstanceCorrespondence <em>VM Image Instance Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VMImageInstanceCorrespondence
	 * @generated
	 */
	public Adapter createVMImageInstanceCorrespondenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VMImageCorrespondence <em>VM Image Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VMImageCorrespondence
	 * @generated
	 */
	public Adapter createVMImageCorrespondenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VirtualNetworkInterconnectCorrespondence <em>Virtual Network Interconnect Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VirtualNetworkInterconnectCorrespondence
	 * @generated
	 */
	public Adapter createVirtualNetworkInterconnectCorrespondenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VirtualMachineCorrespondence <em>Virtual Machine Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VirtualMachineCorrespondence
	 * @generated
	 */
	public Adapter createVirtualMachineCorrespondenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.HypervisorCorrespondence <em>Hypervisor Correspondence</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.HypervisorCorrespondence
	 * @generated
	 */
    public Adapter createHypervisorCorrespondenceAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.NetworkAttachedStorageCorrespondence <em>Network Attached Storage Correspondence</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.NetworkAttachedStorageCorrespondence
	 * @generated
	 */
    public Adapter createNetworkAttachedStorageCorrespondenceAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.OptimisationPlanCorrespondence <em>Optimisation Plan Correspondence</em>}'.
	 * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.OptimisationPlanCorrespondence
	 * @generated
	 */
        public Adapter createOptimisationPlanCorrespondenceAdapter() {
		return null;
	}

/**
	 * Creates a new adapter for an object of class '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ProvidedServiceCorrespondence <em>Provided Service Correspondence</em>}'.
	 * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ProvidedServiceCorrespondence
	 * @generated
	 */
        public Adapter createProvidedServiceCorrespondenceAdapter() {
		return null;
	}

/**
	 * Creates a new adapter for an object of class '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.RequiredServiceCorrespondence <em>Required Service Correspondence</em>}'.
	 * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.RequiredServiceCorrespondence
	 * @generated
	 */
        public Adapter createRequiredServiceCorrespondenceAdapter() {
		return null;
	}

/**
	 * Creates a new adapter for an object of class '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ScalableVMImageConnectorCorrespondence <em>Scalable VM Image Connector Correspondence</em>}'.
	 * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ScalableVMImageConnectorCorrespondence
	 * @generated
	 */
        public Adapter createScalableVMImageConnectorCorrespondenceAdapter() {
		return null;
	}

/**
	 * Creates a new adapter for an object of class '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.UserBehaviourCorrespondence <em>User Behaviour Correspondence</em>}'.
	 * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.UserBehaviourCorrespondence
	 * @generated
	 */
        public Adapter createUserBehaviourCorrespondenceAdapter() {
		return null;
	}

/**
	 * Creates a new adapter for an object of class '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.RequestArrivalRateMeasurementCorrespondence <em>Request Arrival Rate Measurement Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.RequestArrivalRateMeasurementCorrespondence
	 * @generated
	 */
	public Adapter createRequestArrivalRateMeasurementCorrespondenceAdapter() {
		return null;
	}

/**
	 * Creates a new adapter for an object of class '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ResponseArrivalRateMeasurementCorrespondence <em>Response Arrival Rate Measurement Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ResponseArrivalRateMeasurementCorrespondence
	 * @generated
	 */
	public Adapter createResponseArrivalRateMeasurementCorrespondenceAdapter() {
		return null;
	}

/**
	 * Creates a new adapter for an object of class '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ServiceInstanceArrivalRateMeasurementCorrespondence <em>Service Instance Arrival Rate Measurement Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ServiceInstanceArrivalRateMeasurementCorrespondence
	 * @generated
	 */
	public Adapter createServiceInstanceArrivalRateMeasurementCorrespondenceAdapter() {
		return null;
	}

/**
	 * Creates a new adapter for an object of class '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ServiceOperationInstanceArrivalRateMeasurementCorrespondence <em>Service Operation Instance Arrival Rate Measurement Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ServiceOperationInstanceArrivalRateMeasurementCorrespondence
	 * @generated
	 */
	public Adapter createServiceOperationInstanceArrivalRateMeasurementCorrespondenceAdapter() {
		return null;
	}

/**
	 * Creates a new adapter for an object of class '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ArrivalRateMeasurementCorrespondence <em>Arrival Rate Measurement Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ArrivalRateMeasurementCorrespondence
	 * @generated
	 */
	public Adapter createArrivalRateMeasurementCorrespondenceAdapter() {
		return null;
	}

/**
	 * Creates a new adapter for an object of class '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ServiceOperationCorrespondence <em>Service Operation Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ServiceOperationCorrespondence
	 * @generated
	 */
	public Adapter createServiceOperationCorrespondenceAdapter() {
		return null;
	}

/**
	 * Creates a new adapter for an object of class '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ApplicationProvidedServiceCorrespondence <em>Application Provided Service Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ApplicationProvidedServiceCorrespondence
	 * @generated
	 */
	public Adapter createApplicationProvidedServiceCorrespondenceAdapter() {
		return null;
	}

/**
	 * Creates a new adapter for an object of class '{@link eu.cactosfp7.identifier.Identifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.cactosfp7.identifier.Identifier
	 * @generated
	 */
	public Adapter createIdentifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.cactosfp7.cactosim.correspondence.LoadCorrespondence <em>Load Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.cactosfp7.cactosim.correspondence.LoadCorrespondence
	 * @generated
	 */
	public Adapter createLoadCorrespondenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //LogicalcorrespondenceAdapterFactory
