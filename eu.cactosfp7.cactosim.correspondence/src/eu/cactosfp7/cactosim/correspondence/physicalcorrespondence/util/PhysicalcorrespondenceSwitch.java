/**
 */
package eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.util;

import eu.cactosfp7.cactosim.correspondence.LoadCorrespondence;

import eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.*;

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
 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalcorrespondencePackage
 * @generated
 */
public class PhysicalcorrespondenceSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PhysicalcorrespondencePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalcorrespondenceSwitch() {
		if (modelPackage == null) {
			modelPackage = PhysicalcorrespondencePackage.eINSTANCE;
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
			case PhysicalcorrespondencePackage.PU_MEASUREMENT_CORRESPONDENCE: {
				PuMeasurementCorrespondence puMeasurementCorrespondence = (PuMeasurementCorrespondence)theEObject;
				T result = casePuMeasurementCorrespondence(puMeasurementCorrespondence);
				if (result == null) result = caseLoadCorrespondence(puMeasurementCorrespondence);
				if (result == null) result = caseIdentifier(puMeasurementCorrespondence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhysicalcorrespondencePackage.MEMORY_MEASUREMENT_CORRESPONDENCE: {
				MemoryMeasurementCorrespondence memoryMeasurementCorrespondence = (MemoryMeasurementCorrespondence)theEObject;
				T result = caseMemoryMeasurementCorrespondence(memoryMeasurementCorrespondence);
				if (result == null) result = caseLoadCorrespondence(memoryMeasurementCorrespondence);
				if (result == null) result = caseIdentifier(memoryMeasurementCorrespondence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhysicalcorrespondencePackage.STORAGE_MEASUREMENT_CORRESPONDENCE: {
				StorageMeasurementCorrespondence storageMeasurementCorrespondence = (StorageMeasurementCorrespondence)theEObject;
				T result = caseStorageMeasurementCorrespondence(storageMeasurementCorrespondence);
				if (result == null) result = caseLoadCorrespondence(storageMeasurementCorrespondence);
				if (result == null) result = caseIdentifier(storageMeasurementCorrespondence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhysicalcorrespondencePackage.INTERCONNECT_MEASUREMENT_CORRESPONDENCE: {
				InterconnectMeasurementCorrespondence interconnectMeasurementCorrespondence = (InterconnectMeasurementCorrespondence)theEObject;
				T result = caseInterconnectMeasurementCorrespondence(interconnectMeasurementCorrespondence);
				if (result == null) result = caseLoadCorrespondence(interconnectMeasurementCorrespondence);
				if (result == null) result = caseIdentifier(interconnectMeasurementCorrespondence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY: {
				PhysicalCorrespondenceRepository physicalCorrespondenceRepository = (PhysicalCorrespondenceRepository)theEObject;
				T result = casePhysicalCorrespondenceRepository(physicalCorrespondenceRepository);
				if (result == null) result = caseIdentifier(physicalCorrespondenceRepository);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhysicalcorrespondencePackage.SWITCH_CORRESPONDENCE: {
				SwitchCorrespondence switchCorrespondence = (SwitchCorrespondence)theEObject;
				T result = caseSwitchCorrespondence(switchCorrespondence);
				if (result == null) result = caseIdentifier(switchCorrespondence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhysicalcorrespondencePackage.RACK_CORRESPONDENCE: {
				RackCorrespondence rackCorrespondence = (RackCorrespondence)theEObject;
				T result = caseRackCorrespondence(rackCorrespondence);
				if (result == null) result = caseIdentifier(rackCorrespondence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhysicalcorrespondencePackage.ABSTRACT_NODE_CORRESPONDENCE: {
				AbstractNodeCorrespondence abstractNodeCorrespondence = (AbstractNodeCorrespondence)theEObject;
				T result = caseAbstractNodeCorrespondence(abstractNodeCorrespondence);
				if (result == null) result = caseIdentifier(abstractNodeCorrespondence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhysicalcorrespondencePackage.MEMORY_SPECIFICATION_CORRESPONDENCE: {
				MemorySpecificationCorrespondence memorySpecificationCorrespondence = (MemorySpecificationCorrespondence)theEObject;
				T result = caseMemorySpecificationCorrespondence(memorySpecificationCorrespondence);
				if (result == null) result = caseIdentifier(memorySpecificationCorrespondence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhysicalcorrespondencePackage.STORAGE_SPECIFICATION_CORRESPONDENCE: {
				StorageSpecificationCorrespondence storageSpecificationCorrespondence = (StorageSpecificationCorrespondence)theEObject;
				T result = caseStorageSpecificationCorrespondence(storageSpecificationCorrespondence);
				if (result == null) result = caseIdentifier(storageSpecificationCorrespondence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhysicalcorrespondencePackage.NETWORK_INTERCONNECT_CORRESPONDENCE: {
				NetworkInterconnectCorrespondence networkInterconnectCorrespondence = (NetworkInterconnectCorrespondence)theEObject;
				T result = caseNetworkInterconnectCorrespondence(networkInterconnectCorrespondence);
				if (result == null) result = caseIdentifier(networkInterconnectCorrespondence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhysicalcorrespondencePackage.PROCESSING_UNIT_SPECIFICATION_CORRESPONDENCE: {
				ProcessingUnitSpecificationCorrespondence processingUnitSpecificationCorrespondence = (ProcessingUnitSpecificationCorrespondence)theEObject;
				T result = caseProcessingUnitSpecificationCorrespondence(processingUnitSpecificationCorrespondence);
				if (result == null) result = caseIdentifier(processingUnitSpecificationCorrespondence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhysicalcorrespondencePackage.POWER_CONSUMING_ENTITY_MEASUREMENT_CORRESPONDENCE: {
				PowerConsumingEntityMeasurementCorrespondence powerConsumingEntityMeasurementCorrespondence = (PowerConsumingEntityMeasurementCorrespondence)theEObject;
				T result = casePowerConsumingEntityMeasurementCorrespondence(powerConsumingEntityMeasurementCorrespondence);
				if (result == null) result = caseLoadCorrespondence(powerConsumingEntityMeasurementCorrespondence);
				if (result == null) result = caseIdentifier(powerConsumingEntityMeasurementCorrespondence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhysicalcorrespondencePackage.POWER_PROVIDING_ENTITY_CORRESPONDENCE: {
				PowerProvidingEntityCorrespondence powerProvidingEntityCorrespondence = (PowerProvidingEntityCorrespondence)theEObject;
				T result = casePowerProvidingEntityCorrespondence(powerProvidingEntityCorrespondence);
				if (result == null) result = caseIdentifier(powerProvidingEntityCorrespondence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhysicalcorrespondencePackage.POWER_CONSUMING_RESOURCE_CORRESPONDENCE: {
				PowerConsumingResourceCorrespondence powerConsumingResourceCorrespondence = (PowerConsumingResourceCorrespondence)theEObject;
				T result = casePowerConsumingResourceCorrespondence(powerConsumingResourceCorrespondence);
				if (result == null) result = caseIdentifier(powerConsumingResourceCorrespondence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhysicalcorrespondencePackage.ARCHITECTURE_TYPE_CORRESPONDENCE: {
				ArchitectureTypeCorrespondence architectureTypeCorrespondence = (ArchitectureTypeCorrespondence)theEObject;
				T result = caseArchitectureTypeCorrespondence(architectureTypeCorrespondence);
				if (result == null) result = caseIdentifier(architectureTypeCorrespondence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pu Measurement Correspondence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pu Measurement Correspondence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePuMeasurementCorrespondence(PuMeasurementCorrespondence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Memory Measurement Correspondence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Memory Measurement Correspondence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMemoryMeasurementCorrespondence(MemoryMeasurementCorrespondence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Storage Measurement Correspondence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Storage Measurement Correspondence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStorageMeasurementCorrespondence(StorageMeasurementCorrespondence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interconnect Measurement Correspondence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interconnect Measurement Correspondence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterconnectMeasurementCorrespondence(InterconnectMeasurementCorrespondence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Physical Correspondence Repository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Physical Correspondence Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhysicalCorrespondenceRepository(PhysicalCorrespondenceRepository object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Switch Correspondence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Switch Correspondence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwitchCorrespondence(SwitchCorrespondence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rack Correspondence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rack Correspondence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRackCorrespondence(RackCorrespondence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Node Correspondence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Node Correspondence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractNodeCorrespondence(AbstractNodeCorrespondence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Memory Specification Correspondence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Memory Specification Correspondence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMemorySpecificationCorrespondence(MemorySpecificationCorrespondence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Storage Specification Correspondence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Storage Specification Correspondence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStorageSpecificationCorrespondence(StorageSpecificationCorrespondence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network Interconnect Correspondence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network Interconnect Correspondence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetworkInterconnectCorrespondence(NetworkInterconnectCorrespondence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Processing Unit Specification Correspondence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Processing Unit Specification Correspondence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessingUnitSpecificationCorrespondence(ProcessingUnitSpecificationCorrespondence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Power Consuming Entity Measurement Correspondence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Power Consuming Entity Measurement Correspondence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePowerConsumingEntityMeasurementCorrespondence(PowerConsumingEntityMeasurementCorrespondence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Power Providing Entity Correspondence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Power Providing Entity Correspondence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePowerProvidingEntityCorrespondence(PowerProvidingEntityCorrespondence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Power Consuming Resource Correspondence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Power Consuming Resource Correspondence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePowerConsumingResourceCorrespondence(PowerConsumingResourceCorrespondence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Architecture Type Correspondence</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Architecture Type Correspondence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseArchitectureTypeCorrespondence(ArchitectureTypeCorrespondence object) {
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

} //PhysicalcorrespondenceSwitch
