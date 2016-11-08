/**
 */
package eu.cactosfp7.cactosim.correspondence.logicalcorrespondence;

import eu.cactosfp7.identifier.Identifier;

import eu.cactosfp7.infrastructuremodels.logicaldc.application.ServiceProvidedRole;

import eu.cactosfp7.infrastructuremodels.logicaldc.core.VirtualMachine;

import org.palladiosimulator.pcm.repository.OperationProvidedRole;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provided Service Correspondence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ProvidedServiceCorrespondence#getCactosRole <em>Cactos Role</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ProvidedServiceCorrespondence#getCactosVM <em>Cactos VM</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ProvidedServiceCorrespondence#getPalladioRole <em>Palladio Role</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ProvidedServiceCorrespondence#getLogicalCorrespondenceRepository <em>Logical Correspondence Repository</em>}</li>
 * </ul>
 *
 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalcorrespondencePackage#getProvidedServiceCorrespondence()
 * @model
 * @generated
 */
public interface ProvidedServiceCorrespondence extends Identifier {
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
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalcorrespondencePackage#getProvidedServiceCorrespondence_CactosRole()
	 * @model required="true"
	 * @generated
	 */
        ServiceProvidedRole getCactosRole();

        /**
	 * Sets the value of the '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ProvidedServiceCorrespondence#getCactosRole <em>Cactos Role</em>}' reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cactos Role</em>' reference.
	 * @see #getCactosRole()
	 * @generated
	 */
        void setCactosRole(ServiceProvidedRole value);

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
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalcorrespondencePackage#getProvidedServiceCorrespondence_CactosVM()
	 * @model required="true"
	 * @generated
	 */
        VirtualMachine getCactosVM();

        /**
	 * Sets the value of the '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ProvidedServiceCorrespondence#getCactosVM <em>Cactos VM</em>}' reference.
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
	 * @see #setPalladioRole(OperationProvidedRole)
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalcorrespondencePackage#getProvidedServiceCorrespondence_PalladioRole()
	 * @model required="true"
	 * @generated
	 */
        OperationProvidedRole getPalladioRole();

        /**
	 * Sets the value of the '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ProvidedServiceCorrespondence#getPalladioRole <em>Palladio Role</em>}' reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Palladio Role</em>' reference.
	 * @see #getPalladioRole()
	 * @generated
	 */
        void setPalladioRole(OperationProvidedRole value);

        /**
	 * Returns the value of the '<em><b>Logical Correspondence Repository</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalCorrespondenceRepository#getProvidedServiceCorrespondences <em>Provided Service Correspondences</em>}'.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Logical Correspondence Repository</em>' container reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>Logical Correspondence Repository</em>' container reference.
	 * @see #setLogicalCorrespondenceRepository(LogicalCorrespondenceRepository)
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalcorrespondencePackage#getProvidedServiceCorrespondence_LogicalCorrespondenceRepository()
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalCorrespondenceRepository#getProvidedServiceCorrespondences
	 * @model opposite="providedServiceCorrespondences" transient="false"
	 * @generated
	 */
        LogicalCorrespondenceRepository getLogicalCorrespondenceRepository();

        /**
	 * Sets the value of the '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ProvidedServiceCorrespondence#getLogicalCorrespondenceRepository <em>Logical Correspondence Repository</em>}' container reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logical Correspondence Repository</em>' container reference.
	 * @see #getLogicalCorrespondenceRepository()
	 * @generated
	 */
        void setLogicalCorrespondenceRepository(LogicalCorrespondenceRepository value);

} // ProvidedServiceCorrespondence
