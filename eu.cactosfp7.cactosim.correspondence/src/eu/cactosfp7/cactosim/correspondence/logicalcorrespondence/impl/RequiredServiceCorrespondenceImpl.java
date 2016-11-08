/**
 */
package eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl;

import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalCorrespondenceRepository;
import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalcorrespondencePackage;
import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.RequiredServiceCorrespondence;

import eu.cactosfp7.identifier.impl.IdentifierImpl;

import eu.cactosfp7.infrastructuremodels.logicaldc.application.ServiceRequiredRole;

import eu.cactosfp7.infrastructuremodels.logicaldc.core.VirtualMachine;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.palladiosimulator.pcm.repository.OperationRequiredRole;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Required Service Correspondence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.RequiredServiceCorrespondenceImpl#getCactosRole <em>Cactos Role</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.RequiredServiceCorrespondenceImpl#getCactosVM <em>Cactos VM</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.RequiredServiceCorrespondenceImpl#getPalladioRole <em>Palladio Role</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.RequiredServiceCorrespondenceImpl#getLogicalCorrespondenceRepository <em>Logical Correspondence Repository</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequiredServiceCorrespondenceImpl extends IdentifierImpl implements RequiredServiceCorrespondence {
        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        protected RequiredServiceCorrespondenceImpl() {
		super();
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        @Override
        protected EClass eStaticClass() {
		return LogicalcorrespondencePackage.Literals.REQUIRED_SERVICE_CORRESPONDENCE;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public ServiceRequiredRole getCactosRole() {
		return (ServiceRequiredRole)eDynamicGet(LogicalcorrespondencePackage.REQUIRED_SERVICE_CORRESPONDENCE__CACTOS_ROLE, LogicalcorrespondencePackage.Literals.REQUIRED_SERVICE_CORRESPONDENCE__CACTOS_ROLE, true, true);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public ServiceRequiredRole basicGetCactosRole() {
		return (ServiceRequiredRole)eDynamicGet(LogicalcorrespondencePackage.REQUIRED_SERVICE_CORRESPONDENCE__CACTOS_ROLE, LogicalcorrespondencePackage.Literals.REQUIRED_SERVICE_CORRESPONDENCE__CACTOS_ROLE, false, true);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public void setCactosRole(ServiceRequiredRole newCactosRole) {
		eDynamicSet(LogicalcorrespondencePackage.REQUIRED_SERVICE_CORRESPONDENCE__CACTOS_ROLE, LogicalcorrespondencePackage.Literals.REQUIRED_SERVICE_CORRESPONDENCE__CACTOS_ROLE, newCactosRole);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public VirtualMachine getCactosVM() {
		return (VirtualMachine)eDynamicGet(LogicalcorrespondencePackage.REQUIRED_SERVICE_CORRESPONDENCE__CACTOS_VM, LogicalcorrespondencePackage.Literals.REQUIRED_SERVICE_CORRESPONDENCE__CACTOS_VM, true, true);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public VirtualMachine basicGetCactosVM() {
		return (VirtualMachine)eDynamicGet(LogicalcorrespondencePackage.REQUIRED_SERVICE_CORRESPONDENCE__CACTOS_VM, LogicalcorrespondencePackage.Literals.REQUIRED_SERVICE_CORRESPONDENCE__CACTOS_VM, false, true);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public void setCactosVM(VirtualMachine newCactosVM) {
		eDynamicSet(LogicalcorrespondencePackage.REQUIRED_SERVICE_CORRESPONDENCE__CACTOS_VM, LogicalcorrespondencePackage.Literals.REQUIRED_SERVICE_CORRESPONDENCE__CACTOS_VM, newCactosVM);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public OperationRequiredRole getPalladioRole() {
		return (OperationRequiredRole)eDynamicGet(LogicalcorrespondencePackage.REQUIRED_SERVICE_CORRESPONDENCE__PALLADIO_ROLE, LogicalcorrespondencePackage.Literals.REQUIRED_SERVICE_CORRESPONDENCE__PALLADIO_ROLE, true, true);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public OperationRequiredRole basicGetPalladioRole() {
		return (OperationRequiredRole)eDynamicGet(LogicalcorrespondencePackage.REQUIRED_SERVICE_CORRESPONDENCE__PALLADIO_ROLE, LogicalcorrespondencePackage.Literals.REQUIRED_SERVICE_CORRESPONDENCE__PALLADIO_ROLE, false, true);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public void setPalladioRole(OperationRequiredRole newPalladioRole) {
		eDynamicSet(LogicalcorrespondencePackage.REQUIRED_SERVICE_CORRESPONDENCE__PALLADIO_ROLE, LogicalcorrespondencePackage.Literals.REQUIRED_SERVICE_CORRESPONDENCE__PALLADIO_ROLE, newPalladioRole);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public LogicalCorrespondenceRepository getLogicalCorrespondenceRepository() {
		return (LogicalCorrespondenceRepository)eDynamicGet(LogicalcorrespondencePackage.REQUIRED_SERVICE_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY, LogicalcorrespondencePackage.Literals.REQUIRED_SERVICE_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY, true, true);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public NotificationChain basicSetLogicalCorrespondenceRepository(LogicalCorrespondenceRepository newLogicalCorrespondenceRepository, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newLogicalCorrespondenceRepository, LogicalcorrespondencePackage.REQUIRED_SERVICE_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY, msgs);
		return msgs;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public void setLogicalCorrespondenceRepository(LogicalCorrespondenceRepository newLogicalCorrespondenceRepository) {
		eDynamicSet(LogicalcorrespondencePackage.REQUIRED_SERVICE_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY, LogicalcorrespondencePackage.Literals.REQUIRED_SERVICE_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY, newLogicalCorrespondenceRepository);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        @Override
        public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogicalcorrespondencePackage.REQUIRED_SERVICE_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY:
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
			case LogicalcorrespondencePackage.REQUIRED_SERVICE_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY:
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
			case LogicalcorrespondencePackage.REQUIRED_SERVICE_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY:
				return eInternalContainer().eInverseRemove(this, LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__REQUIRED_SERVICE_CORRESPONDENCES, LogicalCorrespondenceRepository.class, msgs);
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
			case LogicalcorrespondencePackage.REQUIRED_SERVICE_CORRESPONDENCE__CACTOS_ROLE:
				if (resolve) return getCactosRole();
				return basicGetCactosRole();
			case LogicalcorrespondencePackage.REQUIRED_SERVICE_CORRESPONDENCE__CACTOS_VM:
				if (resolve) return getCactosVM();
				return basicGetCactosVM();
			case LogicalcorrespondencePackage.REQUIRED_SERVICE_CORRESPONDENCE__PALLADIO_ROLE:
				if (resolve) return getPalladioRole();
				return basicGetPalladioRole();
			case LogicalcorrespondencePackage.REQUIRED_SERVICE_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY:
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
			case LogicalcorrespondencePackage.REQUIRED_SERVICE_CORRESPONDENCE__CACTOS_ROLE:
				setCactosRole((ServiceRequiredRole)newValue);
				return;
			case LogicalcorrespondencePackage.REQUIRED_SERVICE_CORRESPONDENCE__CACTOS_VM:
				setCactosVM((VirtualMachine)newValue);
				return;
			case LogicalcorrespondencePackage.REQUIRED_SERVICE_CORRESPONDENCE__PALLADIO_ROLE:
				setPalladioRole((OperationRequiredRole)newValue);
				return;
			case LogicalcorrespondencePackage.REQUIRED_SERVICE_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY:
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
			case LogicalcorrespondencePackage.REQUIRED_SERVICE_CORRESPONDENCE__CACTOS_ROLE:
				setCactosRole((ServiceRequiredRole)null);
				return;
			case LogicalcorrespondencePackage.REQUIRED_SERVICE_CORRESPONDENCE__CACTOS_VM:
				setCactosVM((VirtualMachine)null);
				return;
			case LogicalcorrespondencePackage.REQUIRED_SERVICE_CORRESPONDENCE__PALLADIO_ROLE:
				setPalladioRole((OperationRequiredRole)null);
				return;
			case LogicalcorrespondencePackage.REQUIRED_SERVICE_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY:
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
			case LogicalcorrespondencePackage.REQUIRED_SERVICE_CORRESPONDENCE__CACTOS_ROLE:
				return basicGetCactosRole() != null;
			case LogicalcorrespondencePackage.REQUIRED_SERVICE_CORRESPONDENCE__CACTOS_VM:
				return basicGetCactosVM() != null;
			case LogicalcorrespondencePackage.REQUIRED_SERVICE_CORRESPONDENCE__PALLADIO_ROLE:
				return basicGetPalladioRole() != null;
			case LogicalcorrespondencePackage.REQUIRED_SERVICE_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY:
				return getLogicalCorrespondenceRepository() != null;
		}
		return super.eIsSet(featureID);
	}

} //RequiredServiceCorrespondenceImpl
