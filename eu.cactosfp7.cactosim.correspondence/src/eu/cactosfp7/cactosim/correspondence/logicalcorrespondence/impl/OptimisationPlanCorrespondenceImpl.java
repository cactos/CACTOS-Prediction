/**
 */
package eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl;

import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalCorrespondenceRepository;
import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalcorrespondencePackage;
import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.OptimisationPlanCorrespondence;

import eu.cactosfp7.identifier.impl.IdentifierImpl;
import eu.cactosfp7.optimisationplan.OptimisationPlan;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Optimisation Plan Correspondence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.OptimisationPlanCorrespondenceImpl#getLastOptimisationPlan <em>Last Optimisation Plan</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.OptimisationPlanCorrespondenceImpl#getLogicalCorrespondenceRepository <em>Logical Correspondence Repository</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OptimisationPlanCorrespondenceImpl extends IdentifierImpl implements OptimisationPlanCorrespondence {
        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        protected OptimisationPlanCorrespondenceImpl() {
		super();
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        @Override
        protected EClass eStaticClass() {
		return LogicalcorrespondencePackage.Literals.OPTIMISATION_PLAN_CORRESPONDENCE;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public OptimisationPlan getLastOptimisationPlan() {
		return (OptimisationPlan)eDynamicGet(LogicalcorrespondencePackage.OPTIMISATION_PLAN_CORRESPONDENCE__LAST_OPTIMISATION_PLAN, LogicalcorrespondencePackage.Literals.OPTIMISATION_PLAN_CORRESPONDENCE__LAST_OPTIMISATION_PLAN, true, true);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public OptimisationPlan basicGetLastOptimisationPlan() {
		return (OptimisationPlan)eDynamicGet(LogicalcorrespondencePackage.OPTIMISATION_PLAN_CORRESPONDENCE__LAST_OPTIMISATION_PLAN, LogicalcorrespondencePackage.Literals.OPTIMISATION_PLAN_CORRESPONDENCE__LAST_OPTIMISATION_PLAN, false, true);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public void setLastOptimisationPlan(OptimisationPlan newLastOptimisationPlan) {
		eDynamicSet(LogicalcorrespondencePackage.OPTIMISATION_PLAN_CORRESPONDENCE__LAST_OPTIMISATION_PLAN, LogicalcorrespondencePackage.Literals.OPTIMISATION_PLAN_CORRESPONDENCE__LAST_OPTIMISATION_PLAN, newLastOptimisationPlan);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public LogicalCorrespondenceRepository getLogicalCorrespondenceRepository() {
		return (LogicalCorrespondenceRepository)eDynamicGet(LogicalcorrespondencePackage.OPTIMISATION_PLAN_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY, LogicalcorrespondencePackage.Literals.OPTIMISATION_PLAN_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY, true, true);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public NotificationChain basicSetLogicalCorrespondenceRepository(LogicalCorrespondenceRepository newLogicalCorrespondenceRepository, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newLogicalCorrespondenceRepository, LogicalcorrespondencePackage.OPTIMISATION_PLAN_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY, msgs);
		return msgs;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public void setLogicalCorrespondenceRepository(LogicalCorrespondenceRepository newLogicalCorrespondenceRepository) {
		eDynamicSet(LogicalcorrespondencePackage.OPTIMISATION_PLAN_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY, LogicalcorrespondencePackage.Literals.OPTIMISATION_PLAN_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY, newLogicalCorrespondenceRepository);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        @Override
        public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogicalcorrespondencePackage.OPTIMISATION_PLAN_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetLogicalCorrespondenceRepository((LogicalCorrespondenceRepository)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        @Override
        public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogicalcorrespondencePackage.OPTIMISATION_PLAN_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY:
				return basicSetLogicalCorrespondenceRepository(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        @Override
        public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case LogicalcorrespondencePackage.OPTIMISATION_PLAN_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY:
				return eInternalContainer().eInverseRemove(this, LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__OPTIMISATION_PLAN_CORRESPONDENCE, LogicalCorrespondenceRepository.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        @Override
        public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LogicalcorrespondencePackage.OPTIMISATION_PLAN_CORRESPONDENCE__LAST_OPTIMISATION_PLAN:
				if (resolve) return getLastOptimisationPlan();
				return basicGetLastOptimisationPlan();
			case LogicalcorrespondencePackage.OPTIMISATION_PLAN_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY:
				return getLogicalCorrespondenceRepository();
		}
		return super.eGet(featureID, resolve, coreType);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        @Override
        public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LogicalcorrespondencePackage.OPTIMISATION_PLAN_CORRESPONDENCE__LAST_OPTIMISATION_PLAN:
				setLastOptimisationPlan((OptimisationPlan)newValue);
				return;
			case LogicalcorrespondencePackage.OPTIMISATION_PLAN_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY:
				setLogicalCorrespondenceRepository((LogicalCorrespondenceRepository)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        @Override
        public void eUnset(int featureID) {
		switch (featureID) {
			case LogicalcorrespondencePackage.OPTIMISATION_PLAN_CORRESPONDENCE__LAST_OPTIMISATION_PLAN:
				setLastOptimisationPlan((OptimisationPlan)null);
				return;
			case LogicalcorrespondencePackage.OPTIMISATION_PLAN_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY:
				setLogicalCorrespondenceRepository((LogicalCorrespondenceRepository)null);
				return;
		}
		super.eUnset(featureID);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        @Override
        public boolean eIsSet(int featureID) {
		switch (featureID) {
			case LogicalcorrespondencePackage.OPTIMISATION_PLAN_CORRESPONDENCE__LAST_OPTIMISATION_PLAN:
				return basicGetLastOptimisationPlan() != null;
			case LogicalcorrespondencePackage.OPTIMISATION_PLAN_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY:
				return getLogicalCorrespondenceRepository() != null;
		}
		return super.eIsSet(featureID);
	}

} //OptimisationPlanCorrespondenceImpl
