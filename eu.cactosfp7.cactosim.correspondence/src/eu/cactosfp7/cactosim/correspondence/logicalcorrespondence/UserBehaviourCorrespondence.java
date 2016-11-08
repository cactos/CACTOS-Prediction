/**
 */
package eu.cactosfp7.cactosim.correspondence.logicalcorrespondence;

import eu.cactosfp7.identifier.Identifier;

import eu.cactosfp7.infrastructuremodels.logicaldc.application.UserBehaviour;

import org.scaledl.usageevolution.Usage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Behaviour Correspondence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.UserBehaviourCorrespondence#getLogicalCorrespondenceRepository <em>Logical Correspondence Repository</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.UserBehaviourCorrespondence#getCactosUserBehaviour <em>Cactos User Behaviour</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.UserBehaviourCorrespondence#getPalladioUsage <em>Palladio Usage</em>}</li>
 * </ul>
 *
 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalcorrespondencePackage#getUserBehaviourCorrespondence()
 * @model
 * @generated
 */
public interface UserBehaviourCorrespondence extends Identifier {
        /**
	 * Returns the value of the '<em><b>Logical Correspondence Repository</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalCorrespondenceRepository#getUserBehaviourCorrespondences <em>User Behaviour Correspondences</em>}'.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Logical Correspondence Repository</em>' container reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>Logical Correspondence Repository</em>' container reference.
	 * @see #setLogicalCorrespondenceRepository(LogicalCorrespondenceRepository)
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalcorrespondencePackage#getUserBehaviourCorrespondence_LogicalCorrespondenceRepository()
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalCorrespondenceRepository#getUserBehaviourCorrespondences
	 * @model opposite="userBehaviourCorrespondences" transient="false"
	 * @generated
	 */
        LogicalCorrespondenceRepository getLogicalCorrespondenceRepository();

        /**
	 * Sets the value of the '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.UserBehaviourCorrespondence#getLogicalCorrespondenceRepository <em>Logical Correspondence Repository</em>}' container reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logical Correspondence Repository</em>' container reference.
	 * @see #getLogicalCorrespondenceRepository()
	 * @generated
	 */
        void setLogicalCorrespondenceRepository(LogicalCorrespondenceRepository value);

        /**
	 * Returns the value of the '<em><b>Cactos User Behaviour</b></em>' reference.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Cactos User Behaviour</em>' reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>Cactos User Behaviour</em>' reference.
	 * @see #setCactosUserBehaviour(UserBehaviour)
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalcorrespondencePackage#getUserBehaviourCorrespondence_CactosUserBehaviour()
	 * @model required="true"
	 * @generated
	 */
        UserBehaviour getCactosUserBehaviour();

        /**
	 * Sets the value of the '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.UserBehaviourCorrespondence#getCactosUserBehaviour <em>Cactos User Behaviour</em>}' reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cactos User Behaviour</em>' reference.
	 * @see #getCactosUserBehaviour()
	 * @generated
	 */
        void setCactosUserBehaviour(UserBehaviour value);

        /**
	 * Returns the value of the '<em><b>Palladio Usage</b></em>' reference.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Palladio Usage</em>' reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>Palladio Usage</em>' reference.
	 * @see #setPalladioUsage(Usage)
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalcorrespondencePackage#getUserBehaviourCorrespondence_PalladioUsage()
	 * @model required="true"
	 * @generated
	 */
        Usage getPalladioUsage();

        /**
	 * Sets the value of the '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.UserBehaviourCorrespondence#getPalladioUsage <em>Palladio Usage</em>}' reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Palladio Usage</em>' reference.
	 * @see #getPalladioUsage()
	 * @generated
	 */
        void setPalladioUsage(Usage value);

} // UserBehaviourCorrespondence
