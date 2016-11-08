/**
 */
package eu.cactosfp7.cactosim.correspondence.physicalcorrespondence;

import eu.cactosfp7.identifier.Identifier;

import eu.cactosfp7.infrastructuremodels.physicaldc.core.MemorySpecification;

import org.palladiosimulator.pcm.resourceenvironment.ProcessingResourceSpecification;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Memory Specification Correspondence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.MemorySpecificationCorrespondence#getCactos <em>Cactos</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.MemorySpecificationCorrespondence#getPalladio <em>Palladio</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.MemorySpecificationCorrespondence#getPhysicalCorrespondenceRepository <em>Physical Correspondence Repository</em>}</li>
 * </ul>
 *
 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalcorrespondencePackage#getMemorySpecificationCorrespondence()
 * @model
 * @generated
 */
public interface MemorySpecificationCorrespondence extends Identifier {
	/**
	 * Returns the value of the '<em><b>Cactos</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cactos</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cactos</em>' reference.
	 * @see #setCactos(MemorySpecification)
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalcorrespondencePackage#getMemorySpecificationCorrespondence_Cactos()
	 * @model required="true"
	 * @generated
	 */
	MemorySpecification getCactos();

	/**
	 * Sets the value of the '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.MemorySpecificationCorrespondence#getCactos <em>Cactos</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cactos</em>' reference.
	 * @see #getCactos()
	 * @generated
	 */
	void setCactos(MemorySpecification value);

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
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalcorrespondencePackage#getMemorySpecificationCorrespondence_Palladio()
	 * @model required="true"
	 * @generated
	 */
	ProcessingResourceSpecification getPalladio();

	/**
	 * Sets the value of the '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.MemorySpecificationCorrespondence#getPalladio <em>Palladio</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Palladio</em>' reference.
	 * @see #getPalladio()
	 * @generated
	 */
	void setPalladio(ProcessingResourceSpecification value);

	/**
	 * Returns the value of the '<em><b>Physical Correspondence Repository</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalCorrespondenceRepository#getMemorySpecificationCorrespondences <em>Memory Specification Correspondences</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Physical Correspondence Repository</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Physical Correspondence Repository</em>' container reference.
	 * @see #setPhysicalCorrespondenceRepository(PhysicalCorrespondenceRepository)
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalcorrespondencePackage#getMemorySpecificationCorrespondence_PhysicalCorrespondenceRepository()
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalCorrespondenceRepository#getMemorySpecificationCorrespondences
	 * @model opposite="memorySpecificationCorrespondences" required="true" transient="false"
	 * @generated
	 */
	PhysicalCorrespondenceRepository getPhysicalCorrespondenceRepository();

	/**
	 * Sets the value of the '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.MemorySpecificationCorrespondence#getPhysicalCorrespondenceRepository <em>Physical Correspondence Repository</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Physical Correspondence Repository</em>' container reference.
	 * @see #getPhysicalCorrespondenceRepository()
	 * @generated
	 */
	void setPhysicalCorrespondenceRepository(PhysicalCorrespondenceRepository value);

} // MemorySpecificationCorrespondence
