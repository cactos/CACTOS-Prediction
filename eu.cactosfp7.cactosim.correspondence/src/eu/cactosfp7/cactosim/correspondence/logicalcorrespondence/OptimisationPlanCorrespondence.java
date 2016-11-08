/**
 */
package eu.cactosfp7.cactosim.correspondence.logicalcorrespondence;

import eu.cactosfp7.identifier.Identifier;
import eu.cactosfp7.optimisationplan.OptimisationPlan;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Optimisation Plan Correspondence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.OptimisationPlanCorrespondence#getLastOptimisationPlan <em>Last Optimisation Plan</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.OptimisationPlanCorrespondence#getLogicalCorrespondenceRepository <em>Logical Correspondence Repository</em>}</li>
 * </ul>
 *
 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalcorrespondencePackage#getOptimisationPlanCorrespondence()
 * @model
 * @generated
 */
public interface OptimisationPlanCorrespondence extends Identifier {
        /**
	 * Returns the value of the '<em><b>Last Optimisation Plan</b></em>' reference.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Last Optimisation Plan</em>' reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Optimisation Plan</em>' reference.
	 * @see #setLastOptimisationPlan(OptimisationPlan)
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalcorrespondencePackage#getOptimisationPlanCorrespondence_LastOptimisationPlan()
	 * @model required="true"
	 * @generated
	 */
        OptimisationPlan getLastOptimisationPlan();

        /**
	 * Sets the value of the '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.OptimisationPlanCorrespondence#getLastOptimisationPlan <em>Last Optimisation Plan</em>}' reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Optimisation Plan</em>' reference.
	 * @see #getLastOptimisationPlan()
	 * @generated
	 */
        void setLastOptimisationPlan(OptimisationPlan value);

        /**
	 * Returns the value of the '<em><b>Logical Correspondence Repository</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalCorrespondenceRepository#getOptimisationPlanCorrespondence <em>Optimisation Plan Correspondence</em>}'.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Logical Correspondence Repository</em>' container reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>Logical Correspondence Repository</em>' container reference.
	 * @see #setLogicalCorrespondenceRepository(LogicalCorrespondenceRepository)
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalcorrespondencePackage#getOptimisationPlanCorrespondence_LogicalCorrespondenceRepository()
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalCorrespondenceRepository#getOptimisationPlanCorrespondence
	 * @model opposite="optimisationPlanCorrespondence" required="true" transient="false"
	 * @generated
	 */
        LogicalCorrespondenceRepository getLogicalCorrespondenceRepository();

        /**
	 * Sets the value of the '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.OptimisationPlanCorrespondence#getLogicalCorrespondenceRepository <em>Logical Correspondence Repository</em>}' container reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logical Correspondence Repository</em>' container reference.
	 * @see #getLogicalCorrespondenceRepository()
	 * @generated
	 */
        void setLogicalCorrespondenceRepository(LogicalCorrespondenceRepository value);

} // OptimisationPlanCorrespondence
