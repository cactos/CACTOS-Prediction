/**
 */
package eu.cactosfp7.cactosim.correspondence.logicalcorrespondence;

import eu.cactosfp7.identifier.Identifier;

import eu.cactosfp7.infrastructuremodels.logicaldc.application.ApplicationInstance;
import eu.cactosfp7.infrastructuremodels.logicaldc.application.ServiceProvidedRole;

import org.palladiosimulator.pcm.repository.OperationProvidedRole;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application Provided Service Correspondence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ApplicationProvidedServiceCorrespondence#getCactosApplication <em>Cactos Application</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ApplicationProvidedServiceCorrespondence#getPalladioSystemRole <em>Palladio System Role</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ApplicationProvidedServiceCorrespondence#getCactosRole <em>Cactos Role</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ApplicationProvidedServiceCorrespondence#getLogicalCorrespondenceRepository <em>Logical Correspondence Repository</em>}</li>
 * </ul>
 *
 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalcorrespondencePackage#getApplicationProvidedServiceCorrespondence()
 * @model
 * @generated
 */
public interface ApplicationProvidedServiceCorrespondence extends Identifier {
	/**
	 * Returns the value of the '<em><b>Cactos Application</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cactos Application</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cactos Application</em>' reference.
	 * @see #setCactosApplication(ApplicationInstance)
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalcorrespondencePackage#getApplicationProvidedServiceCorrespondence_CactosApplication()
	 * @model
	 * @generated
	 */
	ApplicationInstance getCactosApplication();

	/**
	 * Sets the value of the '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ApplicationProvidedServiceCorrespondence#getCactosApplication <em>Cactos Application</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cactos Application</em>' reference.
	 * @see #getCactosApplication()
	 * @generated
	 */
	void setCactosApplication(ApplicationInstance value);

	/**
	 * Returns the value of the '<em><b>Palladio System Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Palladio System Role</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Palladio System Role</em>' reference.
	 * @see #setPalladioSystemRole(OperationProvidedRole)
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalcorrespondencePackage#getApplicationProvidedServiceCorrespondence_PalladioSystemRole()
	 * @model
	 * @generated
	 */
	OperationProvidedRole getPalladioSystemRole();

	/**
	 * Sets the value of the '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ApplicationProvidedServiceCorrespondence#getPalladioSystemRole <em>Palladio System Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Palladio System Role</em>' reference.
	 * @see #getPalladioSystemRole()
	 * @generated
	 */
	void setPalladioSystemRole(OperationProvidedRole value);

	/**
	 * Returns the value of the '<em><b>Cactos Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cactos Role</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cactos Role</em>' reference.
	 * @see #setCactosRole(ServiceProvidedRole)
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalcorrespondencePackage#getApplicationProvidedServiceCorrespondence_CactosRole()
	 * @model
	 * @generated
	 */
	ServiceProvidedRole getCactosRole();

	/**
	 * Sets the value of the '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ApplicationProvidedServiceCorrespondence#getCactosRole <em>Cactos Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cactos Role</em>' reference.
	 * @see #getCactosRole()
	 * @generated
	 */
	void setCactosRole(ServiceProvidedRole value);

	/**
	 * Returns the value of the '<em><b>Logical Correspondence Repository</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalCorrespondenceRepository#getApplicationProvidedServiceCorrespondences <em>Application Provided Service Correspondences</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logical Correspondence Repository</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logical Correspondence Repository</em>' container reference.
	 * @see #setLogicalCorrespondenceRepository(LogicalCorrespondenceRepository)
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalcorrespondencePackage#getApplicationProvidedServiceCorrespondence_LogicalCorrespondenceRepository()
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalCorrespondenceRepository#getApplicationProvidedServiceCorrespondences
	 * @model opposite="applicationProvidedServiceCorrespondences" transient="false"
	 * @generated
	 */
	LogicalCorrespondenceRepository getLogicalCorrespondenceRepository();

	/**
	 * Sets the value of the '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ApplicationProvidedServiceCorrespondence#getLogicalCorrespondenceRepository <em>Logical Correspondence Repository</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logical Correspondence Repository</em>' container reference.
	 * @see #getLogicalCorrespondenceRepository()
	 * @generated
	 */
	void setLogicalCorrespondenceRepository(LogicalCorrespondenceRepository value);

} // ApplicationProvidedServiceCorrespondence
