/**
 */
package eu.cactosfp7.cactosim.correspondence.physicalcorrespondence;

import eu.cactosfp7.identifier.Identifier;

import eu.cactosfp7.infrastructuremodels.physicaldc.core.StorageSpecification;

import org.palladiosimulator.pcm.resourceenvironment.ProcessingResourceSpecification;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Storage Specification Correspondence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.StorageSpecificationCorrespondence#getCactos <em>Cactos</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.StorageSpecificationCorrespondence#getPalladio <em>Palladio</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.StorageSpecificationCorrespondence#getPhysicalCorrespondenceRepository <em>Physical Correspondence Repository</em>}</li>
 * </ul>
 *
 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalcorrespondencePackage#getStorageSpecificationCorrespondence()
 * @model
 * @generated
 */
public interface StorageSpecificationCorrespondence extends Identifier {
	/**
	 * Returns the value of the '<em><b>Cactos</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cactos</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cactos</em>' reference.
	 * @see #setCactos(StorageSpecification)
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalcorrespondencePackage#getStorageSpecificationCorrespondence_Cactos()
	 * @model required="true"
	 * @generated
	 */
	StorageSpecification getCactos();

	/**
	 * Sets the value of the '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.StorageSpecificationCorrespondence#getCactos <em>Cactos</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cactos</em>' reference.
	 * @see #getCactos()
	 * @generated
	 */
	void setCactos(StorageSpecification value);

	/**
	 * Returns the value of the '<em><b>Palladio</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Palladio</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Palladio</em>' reference.
	 * @see #setPalladio(ProcessingResourceSpecification)
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalcorrespondencePackage#getStorageSpecificationCorrespondence_Palladio()
	 * @model required="true"
	 * @generated
	 */
	ProcessingResourceSpecification getPalladio();

	/**
	 * Sets the value of the '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.StorageSpecificationCorrespondence#getPalladio <em>Palladio</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Palladio</em>' reference.
	 * @see #getPalladio()
	 * @generated
	 */
	void setPalladio(ProcessingResourceSpecification value);

	/**
	 * Returns the value of the '<em><b>Physical Correspondence Repository</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalCorrespondenceRepository#getStorageSpecificationCorrespondences <em>Storage Specification Correspondences</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Physical Correspondence Repository</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Physical Correspondence Repository</em>' container reference.
	 * @see #setPhysicalCorrespondenceRepository(PhysicalCorrespondenceRepository)
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalcorrespondencePackage#getStorageSpecificationCorrespondence_PhysicalCorrespondenceRepository()
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalCorrespondenceRepository#getStorageSpecificationCorrespondences
	 * @model opposite="storageSpecificationCorrespondences" required="true" transient="false"
	 * @generated
	 */
	PhysicalCorrespondenceRepository getPhysicalCorrespondenceRepository();

	/**
	 * Sets the value of the '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.StorageSpecificationCorrespondence#getPhysicalCorrespondenceRepository <em>Physical Correspondence Repository</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Physical Correspondence Repository</em>' container reference.
	 * @see #getPhysicalCorrespondenceRepository()
	 * @generated
	 */
	void setPhysicalCorrespondenceRepository(PhysicalCorrespondenceRepository value);

} // StorageSpecificationCorrespondence
