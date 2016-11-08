/**
 */
package eu.cactosfp7.cactosim.correspondence.physicalcorrespondence;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalcorrespondencePackage
 * @generated
 */
public interface PhysicalcorrespondenceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PhysicalcorrespondenceFactory eINSTANCE = eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.PhysicalcorrespondenceFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Pu Measurement Correspondence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pu Measurement Correspondence</em>'.
	 * @generated
	 */
	PuMeasurementCorrespondence createPuMeasurementCorrespondence();

	/**
	 * Returns a new object of class '<em>Memory Measurement Correspondence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Memory Measurement Correspondence</em>'.
	 * @generated
	 */
	MemoryMeasurementCorrespondence createMemoryMeasurementCorrespondence();

	/**
	 * Returns a new object of class '<em>Storage Measurement Correspondence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Storage Measurement Correspondence</em>'.
	 * @generated
	 */
	StorageMeasurementCorrespondence createStorageMeasurementCorrespondence();

	/**
	 * Returns a new object of class '<em>Interconnect Measurement Correspondence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interconnect Measurement Correspondence</em>'.
	 * @generated
	 */
	InterconnectMeasurementCorrespondence createInterconnectMeasurementCorrespondence();

	/**
	 * Returns a new object of class '<em>Physical Correspondence Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Physical Correspondence Repository</em>'.
	 * @generated
	 */
	PhysicalCorrespondenceRepository createPhysicalCorrespondenceRepository();

	/**
	 * Returns a new object of class '<em>Switch Correspondence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Switch Correspondence</em>'.
	 * @generated
	 */
	SwitchCorrespondence createSwitchCorrespondence();

	/**
	 * Returns a new object of class '<em>Rack Correspondence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rack Correspondence</em>'.
	 * @generated
	 */
	RackCorrespondence createRackCorrespondence();

	/**
	 * Returns a new object of class '<em>Abstract Node Correspondence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abstract Node Correspondence</em>'.
	 * @generated
	 */
	AbstractNodeCorrespondence createAbstractNodeCorrespondence();

	/**
	 * Returns a new object of class '<em>Memory Specification Correspondence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Memory Specification Correspondence</em>'.
	 * @generated
	 */
	MemorySpecificationCorrespondence createMemorySpecificationCorrespondence();

	/**
	 * Returns a new object of class '<em>Storage Specification Correspondence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Storage Specification Correspondence</em>'.
	 * @generated
	 */
	StorageSpecificationCorrespondence createStorageSpecificationCorrespondence();

	/**
	 * Returns a new object of class '<em>Network Interconnect Correspondence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Network Interconnect Correspondence</em>'.
	 * @generated
	 */
	NetworkInterconnectCorrespondence createNetworkInterconnectCorrespondence();

	/**
	 * Returns a new object of class '<em>Processing Unit Specification Correspondence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Processing Unit Specification Correspondence</em>'.
	 * @generated
	 */
	ProcessingUnitSpecificationCorrespondence createProcessingUnitSpecificationCorrespondence();

	/**
	 * Returns a new object of class '<em>Power Consuming Entity Measurement Correspondence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Power Consuming Entity Measurement Correspondence</em>'.
	 * @generated
	 */
	PowerConsumingEntityMeasurementCorrespondence createPowerConsumingEntityMeasurementCorrespondence();

	/**
	 * Returns a new object of class '<em>Power Providing Entity Correspondence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Power Providing Entity Correspondence</em>'.
	 * @generated
	 */
	PowerProvidingEntityCorrespondence createPowerProvidingEntityCorrespondence();

	/**
	 * Returns a new object of class '<em>Power Consuming Resource Correspondence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Power Consuming Resource Correspondence</em>'.
	 * @generated
	 */
	PowerConsumingResourceCorrespondence createPowerConsumingResourceCorrespondence();

	/**
	 * Returns a new object of class '<em>Architecture Type Correspondence</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Architecture Type Correspondence</em>'.
	 * @generated
	 */
    ArchitectureTypeCorrespondence createArchitectureTypeCorrespondence();

    /**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PhysicalcorrespondencePackage getPhysicalcorrespondencePackage();

} //PhysicalcorrespondenceFactory
