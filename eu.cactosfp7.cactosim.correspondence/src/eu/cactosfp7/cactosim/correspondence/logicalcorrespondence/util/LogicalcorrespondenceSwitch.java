/**
 */
package eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.util;

import eu.cactosfp7.cactosim.correspondence.LoadCorrespondence;

import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.*;

import eu.cactosfp7.identifier.Identifier;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalcorrespondencePackage
 * @generated
 */
public class LogicalcorrespondenceSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LogicalcorrespondencePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalcorrespondenceSwitch() {
		if (modelPackage == null) {
			modelPackage = LogicalcorrespondencePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case LogicalcorrespondencePackage.VIRTUAL_MEMORY_MEASUREMENT_CORRESPONDENCE: {
				VirtualMemoryMeasurementCorrespondence virtualMemoryMeasurementCorrespondence = (VirtualMemoryMeasurementCorrespondence)theEObject;
				T result = caseVirtualMemoryMeasurementCorrespondence(virtualMemoryMeasurementCorrespondence);
				if (result == null) result = caseLoadCorrespondence(virtualMemoryMeasurementCorrespondence);
				if (result == null) result = caseIdentifier(virtualMemoryMeasurementCorrespondence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalcorrespondencePackage.VIRTUAL_NETWORK_INTERCONNECT_MEASUREMENT_CORRESPONDENCE: {
				VirtualNetworkInterconnectMeasurementCorrespondence virtualNetworkInterconnectMeasurementCorrespondence = (VirtualNetworkInterconnectMeasurementCorrespondence)theEObject;
				T result = caseVirtualNetworkInterconnectMeasurementCorrespondence(virtualNetworkInterconnectMeasurementCorrespondence);
				if (result == null) result = caseLoadCorrespondence(virtualNetworkInterconnectMeasurementCorrespondence);
				if (result == null) result = caseIdentifier(virtualNetworkInterconnectMeasurementCorrespondence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalcorrespondencePackage.VIRTUAL_PROCESSING_UNIT_MEASUREMENT_CORRESPONDENCE: {
				VirtualProcessingUnitMeasurementCorrespondence virtualProcessingUnitMeasurementCorrespondence = (VirtualProcessingUnitMeasurementCorrespondence)theEObject;
				T result = caseVirtualProcessingUnitMeasurementCorrespondence(virtualProcessingUnitMeasurementCorrespondence);
				if (result == null) result = caseLoadCorrespondence(virtualProcessingUnitMeasurementCorrespondence);
				if (result == null) result = caseIdentifier(virtualProcessingUnitMeasurementCorrespondence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalcorrespondencePackage.LOGICAL_DISK_READ_MEASUREMENT_CORRESPONDENCE: {
				LogicalDiskReadMeasurementCorrespondence logicalDiskReadMeasurementCorrespondence = (LogicalDiskReadMeasurementCorrespondence)theEObject;
				T result = caseLogicalDiskReadMeasurementCorrespondence(logicalDiskReadMeasurementCorrespondence);
				if (result == null) result = caseLoadCorrespondence(logicalDiskReadMeasurementCorrespondence);
				if (result == null) result = caseIdentifier(logicalDiskReadMeasurementCorrespondence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalcorrespondencePackage.LOGICAL_DISK_WRITE_MEASUREMENT_CORRESPONDENCE: {
				LogicalDiskWriteMeasurementCorrespondence logicalDiskWriteMeasurementCorrespondence = (LogicalDiskWriteMeasurementCorrespondence)theEObject;
				T result = caseLogicalDiskWriteMeasurementCorrespondence(logicalDiskWriteMeasurementCorrespondence);
				if (result == null) result = caseLoadCorrespondence(logicalDiskWriteMeasurementCorrespondence);
				if (result == null) result = caseIdentifier(logicalDiskWriteMeasurementCorrespondence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY: {
				LogicalCorrespondenceRepository logicalCorrespondenceRepository = (LogicalCorrespondenceRepository)theEObject;
				T result = caseLogicalCorrespondenceRepository(logicalCorrespondenceRepository);
				if (result == null) result = caseIdentifier(logicalCorrespondenceRepository);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalcorrespondencePackage.VM_IMAGE_INSTANCE_CORRESPONDENCE: {
				VMImageInstanceCorrespondence vmImageInstanceCorrespondence = (VMImageInstanceCorrespondence)theEObject;
				T result = caseVMImageInstanceCorrespondence(vmImageInstanceCorrespondence);
				if (result == null) result = caseIdentifier(vmImageInstanceCorrespondence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalcorrespondencePackage.VM_IMAGE_CORRESPONDENCE: {
				VMImageCorrespondence vmImageCorrespondence = (VMImageCorrespondence)theEObject;
				T result = caseVMImageCorrespondence(vmImageCorrespondence);
				if (result == null) result = caseIdentifier(vmImageCorrespondence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalcorrespondencePackage.VIRTUAL_NETWORK_INTERCONNECT_CORRESPONDENCE: {
				VirtualNetworkInterconnectCorrespondence virtualNetworkInterconnectCorrespondence = (VirtualNetworkInterconnectCorrespondence)theEObject;
				T result = caseVirtualNetworkInterconnectCorrespondence(virtualNetworkInterconnectCorrespondence);
				if (result == null) result = caseIdentifier(virtualNetworkInterconnectCorrespondence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalcorrespondencePackage.VIRTUAL_MACHINE_CORRESPONDENCE: {
				VirtualMachineCorrespondence virtualMachineCorrespondence = (VirtualMachineCorrespondence)theEObject;
				T result = caseVirtualMachineCorrespondence(virtualMachineCorrespondence);
				if (result == null) result = caseIdentifier(virtualMachineCorrespondence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalcorrespondencePackage.HYPERVISOR_CORRESPONDENCE: {
				HypervisorCorrespondence hypervisorCorrespondence = (HypervisorCorrespondence)theEObject;
				T result = caseHypervisorCorrespondence(hypervisorCorrespondence);
				if (result == null) result = caseIdentifier(hypervisorCorrespondence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalcorrespondencePackage.NETWORK_ATTACHED_STORAGE_CORRESPONDENCE: {
				NetworkAttachedStorageCorrespondence networkAttachedStorageCorrespondence = (NetworkAttachedStorageCorrespondence)theEObject;
				T result = caseNetworkAttachedStorageCorrespondence(networkAttachedStorageCorrespondence);
				if (result == null) result = caseIdentifier(networkAttachedStorageCorrespondence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalcorrespondencePackage.OPTIMISATION_PLAN_CORRESPONDENCE: {
				OptimisationPlanCorrespondence optimisationPlanCorrespondence = (OptimisationPlanCorrespondence)theEObject;
				T result = caseOptimisationPlanCorrespondence(optimisationPlanCorrespondence);
				if (result == null) result = caseIdentifier(optimisationPlanCorrespondence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalcorrespondencePackage.PROVIDED_SERVICE_CORRESPONDENCE: {
				ProvidedServiceCorrespondence providedServiceCorrespondence = (ProvidedServiceCorrespondence)theEObject;
				T result = caseProvidedServiceCorrespondence(providedServiceCorrespondence);
				if (result == null) result = caseIdentifier(providedServiceCorrespondence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalcorrespondencePackage.REQUIRED_SERVICE_CORRESPONDENCE: {
				RequiredServiceCorrespondence requiredServiceCorrespondence = (RequiredServiceCorrespondence)theEObject;
				T result = caseRequiredServiceCorrespondence(requiredServiceCorrespondence);
				if (result == null) result = caseIdentifier(requiredServiceCorrespondence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalcorrespondencePackage.SCALABLE_VM_IMAGE_CONNECTOR_CORRESPONDENCE: {
				ScalableVMImageConnectorCorrespondence scalableVMImageConnectorCorrespondence = (ScalableVMImageConnectorCorrespondence)theEObject;
				T result = caseScalableVMImageConnectorCorrespondence(scalableVMImageConnectorCorrespondence);
				if (result == null) result = caseIdentifier(scalableVMImageConnectorCorrespondence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalcorrespondencePackage.USER_BEHAVIOUR_CORRESPONDENCE: {
				UserBehaviourCorrespondence userBehaviourCorrespondence = (UserBehaviourCorrespondence)theEObject;
				T result = caseUserBehaviourCorrespondence(userBehaviourCorrespondence);
				if (result == null) result = caseIdentifier(userBehaviourCorrespondence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalcorrespondencePackage.REQUEST_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE: {
				RequestArrivalRateMeasurementCorrespondence requestArrivalRateMeasurementCorrespondence = (RequestArrivalRateMeasurementCorrespondence)theEObject;
				T result = caseRequestArrivalRateMeasurementCorrespondence(requestArrivalRateMeasurementCorrespondence);
				if (result == null) result = caseArrivalRateMeasurementCorrespondence(requestArrivalRateMeasurementCorrespondence);
				if (result == null) result = caseIdentifier(requestArrivalRateMeasurementCorrespondence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalcorrespondencePackage.RESPONSE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE: {
				ResponseArrivalRateMeasurementCorrespondence responseArrivalRateMeasurementCorrespondence = (ResponseArrivalRateMeasurementCorrespondence)theEObject;
				T result = caseResponseArrivalRateMeasurementCorrespondence(responseArrivalRateMeasurementCorrespondence);
				if (result == null) result = caseArrivalRateMeasurementCorrespondence(responseArrivalRateMeasurementCorrespondence);
				if (result == null) result = caseIdentifier(responseArrivalRateMeasurementCorrespondence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalcorrespondencePackage.SERVICE_INSTANCE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE: {
				ServiceInstanceArrivalRateMeasurementCorrespondence serviceInstanceArrivalRateMeasurementCorrespondence = (ServiceInstanceArrivalRateMeasurementCorrespondence)theEObject;
				T result = caseServiceInstanceArrivalRateMeasurementCorrespondence(serviceInstanceArrivalRateMeasurementCorrespondence);
				if (result == null) result = caseIdentifier(serviceInstanceArrivalRateMeasurementCorrespondence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalcorrespondencePackage.SERVICE_OPERATION_INSTANCE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE: {
				ServiceOperationInstanceArrivalRateMeasurementCorrespondence serviceOperationInstanceArrivalRateMeasurementCorrespondence = (ServiceOperationInstanceArrivalRateMeasurementCorrespondence)theEObject;
				T result = caseServiceOperationInstanceArrivalRateMeasurementCorrespondence(serviceOperationInstanceArrivalRateMeasurementCorrespondence);
				if (result == null) result = caseLoadCorrespondence(serviceOperationInstanceArrivalRateMeasurementCorrespondence);
				if (result == null) result = caseIdentifier(serviceOperationInstanceArrivalRateMeasurementCorrespondence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalcorrespondencePackage.ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE: {
				ArrivalRateMeasurementCorrespondence arrivalRateMeasurementCorrespondence = (ArrivalRateMeasurementCorrespondence)theEObject;
				T result = caseArrivalRateMeasurementCorrespondence(arrivalRateMeasurementCorrespondence);
				if (result == null) result = caseIdentifier(arrivalRateMeasurementCorrespondence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalcorrespondencePackage.SERVICE_OPERATION_CORRESPONDENCE: {
				ServiceOperationCorrespondence serviceOperationCorrespondence = (ServiceOperationCorrespondence)theEObject;
				T result = caseServiceOperationCorrespondence(serviceOperationCorrespondence);
				if (result == null) result = caseIdentifier(serviceOperationCorrespondence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalcorrespondencePackage.APPLICATION_PROVIDED_SERVICE_CORRESPONDENCE: {
				ApplicationProvidedServiceCorrespondence applicationProvidedServiceCorrespondence = (ApplicationProvidedServiceCorrespondence)theEObject;
				T result = caseApplicationProvidedServiceCorrespondence(applicationProvidedServiceCorrespondence);
				if (result == null) result = caseIdentifier(applicationProvidedServiceCorrespondence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Virtual Memory Measurement Correspondence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Virtual Memory Measurement Correspondence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVirtualMemoryMeasurementCorrespondence(VirtualMemoryMeasurementCorrespondence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Virtual Network Interconnect Measurement Correspondence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Virtual Network Interconnect Measurement Correspondence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVirtualNetworkInterconnectMeasurementCorrespondence(VirtualNetworkInterconnectMeasurementCorrespondence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Virtual Processing Unit Measurement Correspondence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Virtual Processing Unit Measurement Correspondence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVirtualProcessingUnitMeasurementCorrespondence(VirtualProcessingUnitMeasurementCorrespondence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logical Disk Read Measurement Correspondence</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logical Disk Read Measurement Correspondence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseLogicalDiskReadMeasurementCorrespondence(LogicalDiskReadMeasurementCorrespondence object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Logical Disk Write Measurement Correspondence</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logical Disk Write Measurement Correspondence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseLogicalDiskWriteMeasurementCorrespondence(LogicalDiskWriteMeasurementCorrespondence object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Logical Correspondence Repository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logical Correspondence Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogicalCorrespondenceRepository(LogicalCorrespondenceRepository object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VM Image Instance Correspondence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VM Image Instance Correspondence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVMImageInstanceCorrespondence(VMImageInstanceCorrespondence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VM Image Correspondence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VM Image Correspondence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVMImageCorrespondence(VMImageCorrespondence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Virtual Network Interconnect Correspondence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Virtual Network Interconnect Correspondence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVirtualNetworkInterconnectCorrespondence(VirtualNetworkInterconnectCorrespondence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Virtual Machine Correspondence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Virtual Machine Correspondence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVirtualMachineCorrespondence(VirtualMachineCorrespondence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hypervisor Correspondence</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hypervisor Correspondence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseHypervisorCorrespondence(HypervisorCorrespondence object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Network Attached Storage Correspondence</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network Attached Storage Correspondence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseNetworkAttachedStorageCorrespondence(NetworkAttachedStorageCorrespondence object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Optimisation Plan Correspondence</em>'.
	 * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Optimisation Plan Correspondence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
        public T caseOptimisationPlanCorrespondence(OptimisationPlanCorrespondence object) {
		return null;
	}

/**
	 * Returns the result of interpreting the object as an instance of '<em>Provided Service Correspondence</em>'.
	 * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Provided Service Correspondence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
        public T caseProvidedServiceCorrespondence(ProvidedServiceCorrespondence object) {
		return null;
	}

/**
	 * Returns the result of interpreting the object as an instance of '<em>Required Service Correspondence</em>'.
	 * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Required Service Correspondence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
        public T caseRequiredServiceCorrespondence(RequiredServiceCorrespondence object) {
		return null;
	}

/**
	 * Returns the result of interpreting the object as an instance of '<em>Scalable VM Image Connector Correspondence</em>'.
	 * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scalable VM Image Connector Correspondence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
        public T caseScalableVMImageConnectorCorrespondence(ScalableVMImageConnectorCorrespondence object) {
		return null;
	}

/**
	 * Returns the result of interpreting the object as an instance of '<em>User Behaviour Correspondence</em>'.
	 * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Behaviour Correspondence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
        public T caseUserBehaviourCorrespondence(UserBehaviourCorrespondence object) {
		return null;
	}

/**
	 * Returns the result of interpreting the object as an instance of '<em>Request Arrival Rate Measurement Correspondence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Request Arrival Rate Measurement Correspondence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequestArrivalRateMeasurementCorrespondence(RequestArrivalRateMeasurementCorrespondence object) {
		return null;
	}

/**
	 * Returns the result of interpreting the object as an instance of '<em>Response Arrival Rate Measurement Correspondence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Response Arrival Rate Measurement Correspondence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponseArrivalRateMeasurementCorrespondence(ResponseArrivalRateMeasurementCorrespondence object) {
		return null;
	}

/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Instance Arrival Rate Measurement Correspondence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Instance Arrival Rate Measurement Correspondence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceInstanceArrivalRateMeasurementCorrespondence(ServiceInstanceArrivalRateMeasurementCorrespondence object) {
		return null;
	}

/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Operation Instance Arrival Rate Measurement Correspondence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Operation Instance Arrival Rate Measurement Correspondence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceOperationInstanceArrivalRateMeasurementCorrespondence(ServiceOperationInstanceArrivalRateMeasurementCorrespondence object) {
		return null;
	}

/**
	 * Returns the result of interpreting the object as an instance of '<em>Arrival Rate Measurement Correspondence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arrival Rate Measurement Correspondence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrivalRateMeasurementCorrespondence(ArrivalRateMeasurementCorrespondence object) {
		return null;
	}

/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Operation Correspondence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Operation Correspondence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceOperationCorrespondence(ServiceOperationCorrespondence object) {
		return null;
	}

/**
	 * Returns the result of interpreting the object as an instance of '<em>Application Provided Service Correspondence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application Provided Service Correspondence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplicationProvidedServiceCorrespondence(ApplicationProvidedServiceCorrespondence object) {
		return null;
	}

/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifier(Identifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Load Correspondence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Load Correspondence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoadCorrespondence(LoadCorrespondence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //LogicalcorrespondenceSwitch
