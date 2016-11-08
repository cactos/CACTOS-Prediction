/**
 */
package eu.cactosfp7.cactosim.correspondence.physicalcorrespondence;

import eu.cactosfp7.cactosim.correspondence.LoadCorrespondence;

import eu.cactosfp7.infrastructuremodels.load.physical.StorageMeasurement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Storage Measurement Correspondence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.StorageMeasurementCorrespondence#getCactos <em>Cactos</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.StorageMeasurementCorrespondence#getPhysicalCorrespondenceRepository <em>Physical Correspondence Repository</em>}</li>
 * </ul>
 *
 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalcorrespondencePackage#getStorageMeasurementCorrespondence()
 * @model
 * @generated
 */
public interface StorageMeasurementCorrespondence extends LoadCorrespondence {
	/**
	 * Returns the value of the '<em><b>Cactos</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cactos</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cactos</em>' reference.
	 * @see #setCactos(StorageMeasurement)
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalcorrespondencePackage#getStorageMeasurementCorrespondence_Cactos()
	 * @model required="true"
	 * @generated
	 */
	StorageMeasurement getCactos();

	/**
	 * Sets the value of the '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.StorageMeasurementCorrespondence#getCactos <em>Cactos</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cactos</em>' reference.
	 * @see #getCactos()
	 * @generated
	 */
	void setCactos(StorageMeasurement value);

	/**
	 * Returns the value of the '<em><b>Physical Correspondence Repository</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalCorrespondenceRepository#getStorageMeasurementCorrespondences <em>Storage Measurement Correspondences</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Physical Correspondence Repository</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Physical Correspondence Repository</em>' container reference.
	 * @see #setPhysicalCorrespondenceRepository(PhysicalCorrespondenceRepository)
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalcorrespondencePackage#getStorageMeasurementCorrespondence_PhysicalCorrespondenceRepository()
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalCorrespondenceRepository#getStorageMeasurementCorrespondences
	 * @model opposite="storageMeasurementCorrespondences" required="true" transient="false"
	 * @generated
	 */
	PhysicalCorrespondenceRepository getPhysicalCorrespondenceRepository();

	/**
	 * Sets the value of the '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.StorageMeasurementCorrespondence#getPhysicalCorrespondenceRepository <em>Physical Correspondence Repository</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Physical Correspondence Repository</em>' container reference.
	 * @see #getPhysicalCorrespondenceRepository()
	 * @generated
	 */
	void setPhysicalCorrespondenceRepository(PhysicalCorrespondenceRepository value);

} // StorageMeasurementCorrespondence
