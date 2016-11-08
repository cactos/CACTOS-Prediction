/**
 */
package eu.cactosfp7.cactosim.correspondence.physicalcorrespondence;

import eu.cactosfp7.identifier.Identifier;

import eu.cactosfp7.infrastructuremodels.load.physical.PhysicalLoadModel;

import eu.cactosfp7.infrastructuremodels.physicaldc.core.PhysicalDCModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Physical Correspondence Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalCorrespondenceRepository#isCorrespondenceEstablished <em>Correspondence Established</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalCorrespondenceRepository#getPuMeasurementCorrespondences <em>Pu Measurement Correspondences</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalCorrespondenceRepository#getMemoryMeasurementCorrespondences <em>Memory Measurement Correspondences</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalCorrespondenceRepository#getStorageMeasurementCorrespondences <em>Storage Measurement Correspondences</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalCorrespondenceRepository#getInterconnectMeasurementCorrespondences <em>Interconnect Measurement Correspondences</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalCorrespondenceRepository#getSwitchCorrespondences <em>Switch Correspondences</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalCorrespondenceRepository#getRackCorrespondences <em>Rack Correspondences</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalCorrespondenceRepository#getAbstractNodeCorrespondences <em>Abstract Node Correspondences</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalCorrespondenceRepository#getMemorySpecificationCorrespondences <em>Memory Specification Correspondences</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalCorrespondenceRepository#getStorageSpecificationCorrespondences <em>Storage Specification Correspondences</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalCorrespondenceRepository#getNetworkInterconnectCorrespondences <em>Network Interconnect Correspondences</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalCorrespondenceRepository#getProcessingUnitSpecificationCorrespondences <em>Processing Unit Specification Correspondences</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalCorrespondenceRepository#getPhysicalDcModel <em>Physical Dc Model</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalCorrespondenceRepository#getPhysicalLoadModel <em>Physical Load Model</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalCorrespondenceRepository#getPowerConsumingEntityMeasurementCorrespondences <em>Power Consuming Entity Measurement Correspondences</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalCorrespondenceRepository#getPowerProvidingEntityCorrespondences <em>Power Providing Entity Correspondences</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalCorrespondenceRepository#getPowerConsumingResourceCorrespondences <em>Power Consuming Resource Correspondences</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalCorrespondenceRepository#getArchitectureTypeCorrespondences <em>Architecture Type Correspondences</em>}</li>
 * </ul>
 *
 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalcorrespondencePackage#getPhysicalCorrespondenceRepository()
 * @model
 * @generated
 */
public interface PhysicalCorrespondenceRepository extends Identifier {
	/**
	 * Returns the value of the '<em><b>Correspondence Established</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Correspondence Established</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Correspondence Established</em>' attribute.
	 * @see #setCorrespondenceEstablished(boolean)
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalcorrespondencePackage#getPhysicalCorrespondenceRepository_CorrespondenceEstablished()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isCorrespondenceEstablished();

	/**
	 * Sets the value of the '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalCorrespondenceRepository#isCorrespondenceEstablished <em>Correspondence Established</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Correspondence Established</em>' attribute.
	 * @see #isCorrespondenceEstablished()
	 * @generated
	 */
	void setCorrespondenceEstablished(boolean value);

	/**
	 * Returns the value of the '<em><b>Pu Measurement Correspondences</b></em>' containment reference list.
	 * The list contents are of type {@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PuMeasurementCorrespondence}.
	 * It is bidirectional and its opposite is '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PuMeasurementCorrespondence#getPhysicalCorrespondenceRepository <em>Physical Correspondence Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pu Measurement Correspondences</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pu Measurement Correspondences</em>' containment reference list.
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalcorrespondencePackage#getPhysicalCorrespondenceRepository_PuMeasurementCorrespondences()
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PuMeasurementCorrespondence#getPhysicalCorrespondenceRepository
	 * @model opposite="physicalCorrespondenceRepository" containment="true"
	 * @generated
	 */
	EList<PuMeasurementCorrespondence> getPuMeasurementCorrespondences();

	/**
	 * Returns the value of the '<em><b>Memory Measurement Correspondences</b></em>' containment reference list.
	 * The list contents are of type {@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.MemoryMeasurementCorrespondence}.
	 * It is bidirectional and its opposite is '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.MemoryMeasurementCorrespondence#getPhysicalCorrespondenceRepository <em>Physical Correspondence Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Memory Measurement Correspondences</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory Measurement Correspondences</em>' containment reference list.
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalcorrespondencePackage#getPhysicalCorrespondenceRepository_MemoryMeasurementCorrespondences()
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.MemoryMeasurementCorrespondence#getPhysicalCorrespondenceRepository
	 * @model opposite="physicalCorrespondenceRepository" containment="true"
	 * @generated
	 */
	EList<MemoryMeasurementCorrespondence> getMemoryMeasurementCorrespondences();

	/**
	 * Returns the value of the '<em><b>Storage Measurement Correspondences</b></em>' containment reference list.
	 * The list contents are of type {@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.StorageMeasurementCorrespondence}.
	 * It is bidirectional and its opposite is '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.StorageMeasurementCorrespondence#getPhysicalCorrespondenceRepository <em>Physical Correspondence Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Storage Measurement Correspondences</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Storage Measurement Correspondences</em>' containment reference list.
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalcorrespondencePackage#getPhysicalCorrespondenceRepository_StorageMeasurementCorrespondences()
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.StorageMeasurementCorrespondence#getPhysicalCorrespondenceRepository
	 * @model opposite="physicalCorrespondenceRepository" containment="true"
	 * @generated
	 */
	EList<StorageMeasurementCorrespondence> getStorageMeasurementCorrespondences();

	/**
	 * Returns the value of the '<em><b>Interconnect Measurement Correspondences</b></em>' containment reference list.
	 * The list contents are of type {@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.InterconnectMeasurementCorrespondence}.
	 * It is bidirectional and its opposite is '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.InterconnectMeasurementCorrespondence#getPhysicalCorrespondenceRepository <em>Physical Correspondence Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interconnect Measurement Correspondences</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interconnect Measurement Correspondences</em>' containment reference list.
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalcorrespondencePackage#getPhysicalCorrespondenceRepository_InterconnectMeasurementCorrespondences()
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.InterconnectMeasurementCorrespondence#getPhysicalCorrespondenceRepository
	 * @model opposite="physicalCorrespondenceRepository" containment="true"
	 * @generated
	 */
	EList<InterconnectMeasurementCorrespondence> getInterconnectMeasurementCorrespondences();

	/**
	 * Returns the value of the '<em><b>Switch Correspondences</b></em>' containment reference list.
	 * The list contents are of type {@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.SwitchCorrespondence}.
	 * It is bidirectional and its opposite is '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.SwitchCorrespondence#getPhysicalCorrespondenceRepository <em>Physical Correspondence Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Switch Correspondences</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Switch Correspondences</em>' containment reference list.
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalcorrespondencePackage#getPhysicalCorrespondenceRepository_SwitchCorrespondences()
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.SwitchCorrespondence#getPhysicalCorrespondenceRepository
	 * @model opposite="physicalCorrespondenceRepository" containment="true" ordered="false"
	 * @generated
	 */
	EList<SwitchCorrespondence> getSwitchCorrespondences();

	/**
	 * Returns the value of the '<em><b>Rack Correspondences</b></em>' containment reference list.
	 * The list contents are of type {@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.RackCorrespondence}.
	 * It is bidirectional and its opposite is '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.RackCorrespondence#getPhysicalCorrespondenceRepository <em>Physical Correspondence Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rack Correspondences</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rack Correspondences</em>' containment reference list.
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalcorrespondencePackage#getPhysicalCorrespondenceRepository_RackCorrespondences()
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.RackCorrespondence#getPhysicalCorrespondenceRepository
	 * @model opposite="physicalCorrespondenceRepository" containment="true" ordered="false"
	 * @generated
	 */
	EList<RackCorrespondence> getRackCorrespondences();

	/**
	 * Returns the value of the '<em><b>Abstract Node Correspondences</b></em>' containment reference list.
	 * The list contents are of type {@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.AbstractNodeCorrespondence}.
	 * It is bidirectional and its opposite is '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.AbstractNodeCorrespondence#getPhysicalCorrespondenceRepository <em>Physical Correspondence Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Node Correspondences</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Node Correspondences</em>' containment reference list.
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalcorrespondencePackage#getPhysicalCorrespondenceRepository_AbstractNodeCorrespondences()
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.AbstractNodeCorrespondence#getPhysicalCorrespondenceRepository
	 * @model opposite="physicalCorrespondenceRepository" containment="true" ordered="false"
	 * @generated
	 */
	EList<AbstractNodeCorrespondence> getAbstractNodeCorrespondences();

	/**
	 * Returns the value of the '<em><b>Memory Specification Correspondences</b></em>' containment reference list.
	 * The list contents are of type {@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.MemorySpecificationCorrespondence}.
	 * It is bidirectional and its opposite is '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.MemorySpecificationCorrespondence#getPhysicalCorrespondenceRepository <em>Physical Correspondence Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Memory Specification Correspondences</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory Specification Correspondences</em>' containment reference list.
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalcorrespondencePackage#getPhysicalCorrespondenceRepository_MemorySpecificationCorrespondences()
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.MemorySpecificationCorrespondence#getPhysicalCorrespondenceRepository
	 * @model opposite="physicalCorrespondenceRepository" containment="true" ordered="false"
	 * @generated
	 */
	EList<MemorySpecificationCorrespondence> getMemorySpecificationCorrespondences();

	/**
	 * Returns the value of the '<em><b>Storage Specification Correspondences</b></em>' containment reference list.
	 * The list contents are of type {@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.StorageSpecificationCorrespondence}.
	 * It is bidirectional and its opposite is '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.StorageSpecificationCorrespondence#getPhysicalCorrespondenceRepository <em>Physical Correspondence Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Storage Specification Correspondences</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Storage Specification Correspondences</em>' containment reference list.
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalcorrespondencePackage#getPhysicalCorrespondenceRepository_StorageSpecificationCorrespondences()
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.StorageSpecificationCorrespondence#getPhysicalCorrespondenceRepository
	 * @model opposite="physicalCorrespondenceRepository" containment="true" ordered="false"
	 * @generated
	 */
	EList<StorageSpecificationCorrespondence> getStorageSpecificationCorrespondences();

	/**
	 * Returns the value of the '<em><b>Network Interconnect Correspondences</b></em>' containment reference list.
	 * The list contents are of type {@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.NetworkInterconnectCorrespondence}.
	 * It is bidirectional and its opposite is '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.NetworkInterconnectCorrespondence#getPhysicalCorrespondenceRepository <em>Physical Correspondence Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Network Interconnect Correspondences</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network Interconnect Correspondences</em>' containment reference list.
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalcorrespondencePackage#getPhysicalCorrespondenceRepository_NetworkInterconnectCorrespondences()
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.NetworkInterconnectCorrespondence#getPhysicalCorrespondenceRepository
	 * @model opposite="physicalCorrespondenceRepository" containment="true" ordered="false"
	 * @generated
	 */
	EList<NetworkInterconnectCorrespondence> getNetworkInterconnectCorrespondences();

	/**
	 * Returns the value of the '<em><b>Processing Unit Specification Correspondences</b></em>' containment reference list.
	 * The list contents are of type {@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.ProcessingUnitSpecificationCorrespondence}.
	 * It is bidirectional and its opposite is '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.ProcessingUnitSpecificationCorrespondence#getPhysicalCorrespondenceRepository <em>Physical Correspondence Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processing Unit Specification Correspondences</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processing Unit Specification Correspondences</em>' containment reference list.
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalcorrespondencePackage#getPhysicalCorrespondenceRepository_ProcessingUnitSpecificationCorrespondences()
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.ProcessingUnitSpecificationCorrespondence#getPhysicalCorrespondenceRepository
	 * @model opposite="physicalCorrespondenceRepository" containment="true" ordered="false"
	 * @generated
	 */
	EList<ProcessingUnitSpecificationCorrespondence> getProcessingUnitSpecificationCorrespondences();

	/**
	 * Returns the value of the '<em><b>Physical Dc Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Physical Dc Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Physical Dc Model</em>' reference.
	 * @see #setPhysicalDcModel(PhysicalDCModel)
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalcorrespondencePackage#getPhysicalCorrespondenceRepository_PhysicalDcModel()
	 * @model required="true"
	 * @generated
	 */
	PhysicalDCModel getPhysicalDcModel();

	/**
	 * Sets the value of the '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalCorrespondenceRepository#getPhysicalDcModel <em>Physical Dc Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Physical Dc Model</em>' reference.
	 * @see #getPhysicalDcModel()
	 * @generated
	 */
	void setPhysicalDcModel(PhysicalDCModel value);

	/**
	 * Returns the value of the '<em><b>Physical Load Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Physical Load Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Physical Load Model</em>' reference.
	 * @see #setPhysicalLoadModel(PhysicalLoadModel)
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalcorrespondencePackage#getPhysicalCorrespondenceRepository_PhysicalLoadModel()
	 * @model required="true"
	 * @generated
	 */
	PhysicalLoadModel getPhysicalLoadModel();

	/**
	 * Sets the value of the '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalCorrespondenceRepository#getPhysicalLoadModel <em>Physical Load Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Physical Load Model</em>' reference.
	 * @see #getPhysicalLoadModel()
	 * @generated
	 */
	void setPhysicalLoadModel(PhysicalLoadModel value);

	/**
	 * Returns the value of the '<em><b>Power Consuming Entity Measurement Correspondences</b></em>' containment reference list.
	 * The list contents are of type {@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PowerConsumingEntityMeasurementCorrespondence}.
	 * It is bidirectional and its opposite is '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PowerConsumingEntityMeasurementCorrespondence#getPhysicalCorrespondenceRepository <em>Physical Correspondence Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power Consuming Entity Measurement Correspondences</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power Consuming Entity Measurement Correspondences</em>' containment reference list.
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalcorrespondencePackage#getPhysicalCorrespondenceRepository_PowerConsumingEntityMeasurementCorrespondences()
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PowerConsumingEntityMeasurementCorrespondence#getPhysicalCorrespondenceRepository
	 * @model opposite="physicalCorrespondenceRepository" containment="true"
	 * @generated
	 */
	EList<PowerConsumingEntityMeasurementCorrespondence> getPowerConsumingEntityMeasurementCorrespondences();

	/**
	 * Returns the value of the '<em><b>Power Providing Entity Correspondences</b></em>' containment reference list.
	 * The list contents are of type {@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PowerProvidingEntityCorrespondence}.
	 * It is bidirectional and its opposite is '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PowerProvidingEntityCorrespondence#getPhysicalCorrespondenceRepository <em>Physical Correspondence Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power Providing Entity Correspondences</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power Providing Entity Correspondences</em>' containment reference list.
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalcorrespondencePackage#getPhysicalCorrespondenceRepository_PowerProvidingEntityCorrespondences()
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PowerProvidingEntityCorrespondence#getPhysicalCorrespondenceRepository
	 * @model opposite="physicalCorrespondenceRepository" containment="true"
	 * @generated
	 */
	EList<PowerProvidingEntityCorrespondence> getPowerProvidingEntityCorrespondences();

	/**
	 * Returns the value of the '<em><b>Power Consuming Resource Correspondences</b></em>' containment reference list.
	 * The list contents are of type {@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PowerConsumingResourceCorrespondence}.
	 * It is bidirectional and its opposite is '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PowerConsumingResourceCorrespondence#getPhysicalCorrespondenceRepository <em>Physical Correspondence Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power Consuming Resource Correspondences</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power Consuming Resource Correspondences</em>' containment reference list.
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalcorrespondencePackage#getPhysicalCorrespondenceRepository_PowerConsumingResourceCorrespondences()
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PowerConsumingResourceCorrespondence#getPhysicalCorrespondenceRepository
	 * @model opposite="physicalCorrespondenceRepository" containment="true"
	 * @generated
	 */
	EList<PowerConsumingResourceCorrespondence> getPowerConsumingResourceCorrespondences();

    /**
	 * Returns the value of the '<em><b>Architecture Type Correspondences</b></em>' containment reference list.
	 * The list contents are of type {@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.ArchitectureTypeCorrespondence}.
	 * It is bidirectional and its opposite is '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.ArchitectureTypeCorrespondence#getPhysicalCorrespondenceRepository <em>Physical Correspondence Repository</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Architecture Type Correspondences</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Architecture Type Correspondences</em>' containment reference list.
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalcorrespondencePackage#getPhysicalCorrespondenceRepository_ArchitectureTypeCorrespondences()
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.ArchitectureTypeCorrespondence#getPhysicalCorrespondenceRepository
	 * @model opposite="physicalCorrespondenceRepository" containment="true"
	 * @generated
	 */
    EList<ArchitectureTypeCorrespondence> getArchitectureTypeCorrespondences();

} // PhysicalCorrespondenceRepository
