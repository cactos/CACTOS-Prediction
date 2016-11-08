/**
 */
package eu.cactosfp7.cactosim.correspondence.logicalcorrespondence;

import eu.cactosfp7.identifier.Identifier;

import eu.cactosfp7.infrastructuremodels.logicaldc.application.ServiceRequiredRole;

import eu.cactosfp7.infrastructuremodels.logicaldc.core.VirtualMachine;

import org.palladiosimulator.pcm.repository.OperationRequiredRole;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Required Service Correspondence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.RequiredServiceCorrespondence#getCactosRole <em>Cactos Role</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.RequiredServiceCorrespondence#getCactosVM <em>Cactos VM</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.RequiredServiceCorrespondence#getPalladioRole <em>Palladio Role</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.RequiredServiceCorrespondence#getLogicalCorrespondenceRepository <em>Logical Correspondence Repository</em>}</li>
 * </ul>
 *
 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalcorrespondencePackage#getRequiredServiceCorrespondence()
 * @model
 * @generated
 */
public interface RequiredServiceCorrespondence extends Identifier {
        /**
	 * Returns the value of the '<em><b>Cactos Role</b></em>' reference.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Cactos Role</em>' reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>Cactos Role</em>' reference.
	 * @see #setCactosRole(ServiceRequiredRole)
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalcorrespondencePackage#getRequiredServiceCorrespondence_CactosRole()
	 * @model required="true"
	 * @generated
	 */
        ServiceRequiredRole getCactosRole();

        /**
	 * Sets the value of the '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.RequiredServiceCorrespondence#getCactosRole <em>Cactos Role</em>}' reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cactos Role</em>' reference.
	 * @see #getCactosRole()
	 * @generated
	 */
        void setCactosRole(ServiceRequiredRole value);

        /**
	 * Returns the value of the '<em><b>Cactos VM</b></em>' reference.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Cactos VM</em>' reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>Cactos VM</em>' reference.
	 * @see #setCactosVM(VirtualMachine)
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalcorrespondencePackage#getRequiredServiceCorrespondence_CactosVM()
	 * @model required="true"
	 * @generated
	 */
        VirtualMachine getCactosVM();

        /**
	 * Sets the value of the '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.RequiredServiceCorrespondence#getCactosVM <em>Cactos VM</em>}' reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cactos VM</em>' reference.
	 * @see #getCactosVM()
	 * @generated
	 */
        void setCactosVM(VirtualMachine value);

        /**
	 * Returns the value of the '<em><b>Palladio Role</b></em>' reference.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Palladio Role</em>' reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>Palladio Role</em>' reference.
	 * @see #setPalladioRole(OperationRequiredRole)
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalcorrespondencePackage#getRequiredServiceCorrespondence_PalladioRole()
	 * @model required="true"
	 * @generated
	 */
        OperationRequiredRole getPalladioRole();

        /**
	 * Sets the value of the '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.RequiredServiceCorrespondence#getPalladioRole <em>Palladio Role</em>}' reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Palladio Role</em>' reference.
	 * @see #getPalladioRole()
	 * @generated
	 */
        void setPalladioRole(OperationRequiredRole value);

        /**
	 * Returns the value of the '<em><b>Logical Correspondence Repository</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalCorrespondenceRepository#getRequiredServiceCorrespondences <em>Required Service Correspondences</em>}'.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Logical Correspondence Repository</em>' container reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>Logical Correspondence Repository</em>' container reference.
	 * @see #setLogicalCorrespondenceRepository(LogicalCorrespondenceRepository)
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalcorrespondencePackage#getRequiredServiceCorrespondence_LogicalCorrespondenceRepository()
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalCorrespondenceRepository#getRequiredServiceCorrespondences
	 * @model opposite="requiredServiceCorrespondences" transient="false"
	 * @generated
	 */
        LogicalCorrespondenceRepository getLogicalCorrespondenceRepository();

        /**
	 * Sets the value of the '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.RequiredServiceCorrespondence#getLogicalCorrespondenceRepository <em>Logical Correspondence Repository</em>}' container reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logical Correspondence Repository</em>' container reference.
	 * @see #getLogicalCorrespondenceRepository()
	 * @generated
	 */
        void setLogicalCorrespondenceRepository(LogicalCorrespondenceRepository value);

} // RequiredServiceCorrespondence
