/**
 */
package eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl;

import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalCorrespondenceRepository;
import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalcorrespondencePackage;
import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.UserBehaviourCorrespondence;

import eu.cactosfp7.identifier.impl.IdentifierImpl;

import eu.cactosfp7.infrastructuremodels.logicaldc.application.UserBehaviour;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.scaledl.usageevolution.Usage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Behaviour Correspondence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.UserBehaviourCorrespondenceImpl#getLogicalCorrespondenceRepository <em>Logical Correspondence Repository</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.UserBehaviourCorrespondenceImpl#getCactosUserBehaviour <em>Cactos User Behaviour</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.UserBehaviourCorrespondenceImpl#getPalladioUsage <em>Palladio Usage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserBehaviourCorrespondenceImpl extends IdentifierImpl implements UserBehaviourCorrespondence {
        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        protected UserBehaviourCorrespondenceImpl() {
		super();
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        @Override
        protected EClass eStaticClass() {
		return LogicalcorrespondencePackage.Literals.USER_BEHAVIOUR_CORRESPONDENCE;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public LogicalCorrespondenceRepository getLogicalCorrespondenceRepository() {
		return (LogicalCorrespondenceRepository)eDynamicGet(LogicalcorrespondencePackage.USER_BEHAVIOUR_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY, LogicalcorrespondencePackage.Literals.USER_BEHAVIOUR_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY, true, true);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public NotificationChain basicSetLogicalCorrespondenceRepository(LogicalCorrespondenceRepository newLogicalCorrespondenceRepository, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newLogicalCorrespondenceRepository, LogicalcorrespondencePackage.USER_BEHAVIOUR_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY, msgs);
		return msgs;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public void setLogicalCorrespondenceRepository(LogicalCorrespondenceRepository newLogicalCorrespondenceRepository) {
		eDynamicSet(LogicalcorrespondencePackage.USER_BEHAVIOUR_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY, LogicalcorrespondencePackage.Literals.USER_BEHAVIOUR_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY, newLogicalCorrespondenceRepository);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public UserBehaviour getCactosUserBehaviour() {
		return (UserBehaviour)eDynamicGet(LogicalcorrespondencePackage.USER_BEHAVIOUR_CORRESPONDENCE__CACTOS_USER_BEHAVIOUR, LogicalcorrespondencePackage.Literals.USER_BEHAVIOUR_CORRESPONDENCE__CACTOS_USER_BEHAVIOUR, true, true);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public UserBehaviour basicGetCactosUserBehaviour() {
		return (UserBehaviour)eDynamicGet(LogicalcorrespondencePackage.USER_BEHAVIOUR_CORRESPONDENCE__CACTOS_USER_BEHAVIOUR, LogicalcorrespondencePackage.Literals.USER_BEHAVIOUR_CORRESPONDENCE__CACTOS_USER_BEHAVIOUR, false, true);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public void setCactosUserBehaviour(UserBehaviour newCactosUserBehaviour) {
		eDynamicSet(LogicalcorrespondencePackage.USER_BEHAVIOUR_CORRESPONDENCE__CACTOS_USER_BEHAVIOUR, LogicalcorrespondencePackage.Literals.USER_BEHAVIOUR_CORRESPONDENCE__CACTOS_USER_BEHAVIOUR, newCactosUserBehaviour);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public Usage getPalladioUsage() {
		return (Usage)eDynamicGet(LogicalcorrespondencePackage.USER_BEHAVIOUR_CORRESPONDENCE__PALLADIO_USAGE, LogicalcorrespondencePackage.Literals.USER_BEHAVIOUR_CORRESPONDENCE__PALLADIO_USAGE, true, true);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public Usage basicGetPalladioUsage() {
		return (Usage)eDynamicGet(LogicalcorrespondencePackage.USER_BEHAVIOUR_CORRESPONDENCE__PALLADIO_USAGE, LogicalcorrespondencePackage.Literals.USER_BEHAVIOUR_CORRESPONDENCE__PALLADIO_USAGE, false, true);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public void setPalladioUsage(Usage newPalladioUsage) {
		eDynamicSet(LogicalcorrespondencePackage.USER_BEHAVIOUR_CORRESPONDENCE__PALLADIO_USAGE, LogicalcorrespondencePackage.Literals.USER_BEHAVIOUR_CORRESPONDENCE__PALLADIO_USAGE, newPalladioUsage);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        @Override
        public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogicalcorrespondencePackage.USER_BEHAVIOUR_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY:
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
			case LogicalcorrespondencePackage.USER_BEHAVIOUR_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY:
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
			case LogicalcorrespondencePackage.USER_BEHAVIOUR_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY:
				return eInternalContainer().eInverseRemove(this, LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__USER_BEHAVIOUR_CORRESPONDENCES, LogicalCorrespondenceRepository.class, msgs);
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
			case LogicalcorrespondencePackage.USER_BEHAVIOUR_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY:
				return getLogicalCorrespondenceRepository();
			case LogicalcorrespondencePackage.USER_BEHAVIOUR_CORRESPONDENCE__CACTOS_USER_BEHAVIOUR:
				if (resolve) return getCactosUserBehaviour();
				return basicGetCactosUserBehaviour();
			case LogicalcorrespondencePackage.USER_BEHAVIOUR_CORRESPONDENCE__PALLADIO_USAGE:
				if (resolve) return getPalladioUsage();
				return basicGetPalladioUsage();
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
			case LogicalcorrespondencePackage.USER_BEHAVIOUR_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY:
				setLogicalCorrespondenceRepository((LogicalCorrespondenceRepository)newValue);
				return;
			case LogicalcorrespondencePackage.USER_BEHAVIOUR_CORRESPONDENCE__CACTOS_USER_BEHAVIOUR:
				setCactosUserBehaviour((UserBehaviour)newValue);
				return;
			case LogicalcorrespondencePackage.USER_BEHAVIOUR_CORRESPONDENCE__PALLADIO_USAGE:
				setPalladioUsage((Usage)newValue);
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
			case LogicalcorrespondencePackage.USER_BEHAVIOUR_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY:
				setLogicalCorrespondenceRepository((LogicalCorrespondenceRepository)null);
				return;
			case LogicalcorrespondencePackage.USER_BEHAVIOUR_CORRESPONDENCE__CACTOS_USER_BEHAVIOUR:
				setCactosUserBehaviour((UserBehaviour)null);
				return;
			case LogicalcorrespondencePackage.USER_BEHAVIOUR_CORRESPONDENCE__PALLADIO_USAGE:
				setPalladioUsage((Usage)null);
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
			case LogicalcorrespondencePackage.USER_BEHAVIOUR_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY:
				return getLogicalCorrespondenceRepository() != null;
			case LogicalcorrespondencePackage.USER_BEHAVIOUR_CORRESPONDENCE__CACTOS_USER_BEHAVIOUR:
				return basicGetCactosUserBehaviour() != null;
			case LogicalcorrespondencePackage.USER_BEHAVIOUR_CORRESPONDENCE__PALLADIO_USAGE:
				return basicGetPalladioUsage() != null;
		}
		return super.eIsSet(featureID);
	}

} //UserBehaviourCorrespondenceImpl
