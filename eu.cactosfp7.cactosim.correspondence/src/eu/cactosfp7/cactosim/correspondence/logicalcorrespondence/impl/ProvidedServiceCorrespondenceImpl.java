/**
 */
package eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl;

import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalCorrespondenceRepository;
import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalcorrespondencePackage;
import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ProvidedServiceCorrespondence;

import eu.cactosfp7.identifier.impl.IdentifierImpl;

import eu.cactosfp7.infrastructuremodels.logicaldc.application.ServiceProvidedRole;

import eu.cactosfp7.infrastructuremodels.logicaldc.core.VirtualMachine;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.palladiosimulator.pcm.repository.OperationProvidedRole;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Provided Service Correspondence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.ProvidedServiceCorrespondenceImpl#getCactosRole <em>Cactos Role</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.ProvidedServiceCorrespondenceImpl#getCactosVM <em>Cactos VM</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.ProvidedServiceCorrespondenceImpl#getPalladioRole <em>Palladio Role</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.ProvidedServiceCorrespondenceImpl#getLogicalCorrespondenceRepository <em>Logical Correspondence Repository</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProvidedServiceCorrespondenceImpl extends IdentifierImpl implements ProvidedServiceCorrespondence {
        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        protected ProvidedServiceCorrespondenceImpl() {
		super();
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        @Override
        protected EClass eStaticClass() {
		return LogicalcorrespondencePackage.Literals.PROVIDED_SERVICE_CORRESPONDENCE;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public ServiceProvidedRole getCactosRole() {
		return (ServiceProvidedRole)eDynamicGet(LogicalcorrespondencePackage.PROVIDED_SERVICE_CORRESPONDENCE__CACTOS_ROLE, LogicalcorrespondencePackage.Literals.PROVIDED_SERVICE_CORRESPONDENCE__CACTOS_ROLE, true, true);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public ServiceProvidedRole basicGetCactosRole() {
		return (ServiceProvidedRole)eDynamicGet(LogicalcorrespondencePackage.PROVIDED_SERVICE_CORRESPONDENCE__CACTOS_ROLE, LogicalcorrespondencePackage.Literals.PROVIDED_SERVICE_CORRESPONDENCE__CACTOS_ROLE, false, true);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public void setCactosRole(ServiceProvidedRole newCactosRole) {
		eDynamicSet(LogicalcorrespondencePackage.PROVIDED_SERVICE_CORRESPONDENCE__CACTOS_ROLE, LogicalcorrespondencePackage.Literals.PROVIDED_SERVICE_CORRESPONDENCE__CACTOS_ROLE, newCactosRole);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public VirtualMachine getCactosVM() {
		return (VirtualMachine)eDynamicGet(LogicalcorrespondencePackage.PROVIDED_SERVICE_CORRESPONDENCE__CACTOS_VM, LogicalcorrespondencePackage.Literals.PROVIDED_SERVICE_CORRESPONDENCE__CACTOS_VM, true, true);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public VirtualMachine basicGetCactosVM() {
		return (VirtualMachine)eDynamicGet(LogicalcorrespondencePackage.PROVIDED_SERVICE_CORRESPONDENCE__CACTOS_VM, LogicalcorrespondencePackage.Literals.PROVIDED_SERVICE_CORRESPONDENCE__CACTOS_VM, false, true);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public void setCactosVM(VirtualMachine newCactosVM) {
		eDynamicSet(LogicalcorrespondencePackage.PROVIDED_SERVICE_CORRESPONDENCE__CACTOS_VM, LogicalcorrespondencePackage.Literals.PROVIDED_SERVICE_CORRESPONDENCE__CACTOS_VM, newCactosVM);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public OperationProvidedRole getPalladioRole() {
		return (OperationProvidedRole)eDynamicGet(LogicalcorrespondencePackage.PROVIDED_SERVICE_CORRESPONDENCE__PALLADIO_ROLE, LogicalcorrespondencePackage.Literals.PROVIDED_SERVICE_CORRESPONDENCE__PALLADIO_ROLE, true, true);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public OperationProvidedRole basicGetPalladioRole() {
		return (OperationProvidedRole)eDynamicGet(LogicalcorrespondencePackage.PROVIDED_SERVICE_CORRESPONDENCE__PALLADIO_ROLE, LogicalcorrespondencePackage.Literals.PROVIDED_SERVICE_CORRESPONDENCE__PALLADIO_ROLE, false, true);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public void setPalladioRole(OperationProvidedRole newPalladioRole) {
		eDynamicSet(LogicalcorrespondencePackage.PROVIDED_SERVICE_CORRESPONDENCE__PALLADIO_ROLE, LogicalcorrespondencePackage.Literals.PROVIDED_SERVICE_CORRESPONDENCE__PALLADIO_ROLE, newPalladioRole);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public LogicalCorrespondenceRepository getLogicalCorrespondenceRepository() {
		return (LogicalCorrespondenceRepository)eDynamicGet(LogicalcorrespondencePackage.PROVIDED_SERVICE_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY, LogicalcorrespondencePackage.Literals.PROVIDED_SERVICE_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY, true, true);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public NotificationChain basicSetLogicalCorrespondenceRepository(LogicalCorrespondenceRepository newLogicalCorrespondenceRepository, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newLogicalCorrespondenceRepository, LogicalcorrespondencePackage.PROVIDED_SERVICE_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY, msgs);
		return msgs;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public void setLogicalCorrespondenceRepository(LogicalCorrespondenceRepository newLogicalCorrespondenceRepository) {
		eDynamicSet(LogicalcorrespondencePackage.PROVIDED_SERVICE_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY, LogicalcorrespondencePackage.Literals.PROVIDED_SERVICE_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY, newLogicalCorrespondenceRepository);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        @Override
        public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogicalcorrespondencePackage.PROVIDED_SERVICE_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY:
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
			case LogicalcorrespondencePackage.PROVIDED_SERVICE_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY:
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
			case LogicalcorrespondencePackage.PROVIDED_SERVICE_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY:
				return eInternalContainer().eInverseRemove(this, LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__PROVIDED_SERVICE_CORRESPONDENCES, LogicalCorrespondenceRepository.class, msgs);
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
			case LogicalcorrespondencePackage.PROVIDED_SERVICE_CORRESPONDENCE__CACTOS_ROLE:
				if (resolve) return getCactosRole();
				return basicGetCactosRole();
			case LogicalcorrespondencePackage.PROVIDED_SERVICE_CORRESPONDENCE__CACTOS_VM:
				if (resolve) return getCactosVM();
				return basicGetCactosVM();
			case LogicalcorrespondencePackage.PROVIDED_SERVICE_CORRESPONDENCE__PALLADIO_ROLE:
				if (resolve) return getPalladioRole();
				return basicGetPalladioRole();
			case LogicalcorrespondencePackage.PROVIDED_SERVICE_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY:
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
			case LogicalcorrespondencePackage.PROVIDED_SERVICE_CORRESPONDENCE__CACTOS_ROLE:
				setCactosRole((ServiceProvidedRole)newValue);
				return;
			case LogicalcorrespondencePackage.PROVIDED_SERVICE_CORRESPONDENCE__CACTOS_VM:
				setCactosVM((VirtualMachine)newValue);
				return;
			case LogicalcorrespondencePackage.PROVIDED_SERVICE_CORRESPONDENCE__PALLADIO_ROLE:
				setPalladioRole((OperationProvidedRole)newValue);
				return;
			case LogicalcorrespondencePackage.PROVIDED_SERVICE_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY:
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
			case LogicalcorrespondencePackage.PROVIDED_SERVICE_CORRESPONDENCE__CACTOS_ROLE:
				setCactosRole((ServiceProvidedRole)null);
				return;
			case LogicalcorrespondencePackage.PROVIDED_SERVICE_CORRESPONDENCE__CACTOS_VM:
				setCactosVM((VirtualMachine)null);
				return;
			case LogicalcorrespondencePackage.PROVIDED_SERVICE_CORRESPONDENCE__PALLADIO_ROLE:
				setPalladioRole((OperationProvidedRole)null);
				return;
			case LogicalcorrespondencePackage.PROVIDED_SERVICE_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY:
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
			case LogicalcorrespondencePackage.PROVIDED_SERVICE_CORRESPONDENCE__CACTOS_ROLE:
				return basicGetCactosRole() != null;
			case LogicalcorrespondencePackage.PROVIDED_SERVICE_CORRESPONDENCE__CACTOS_VM:
				return basicGetCactosVM() != null;
			case LogicalcorrespondencePackage.PROVIDED_SERVICE_CORRESPONDENCE__PALLADIO_ROLE:
				return basicGetPalladioRole() != null;
			case LogicalcorrespondencePackage.PROVIDED_SERVICE_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY:
				return getLogicalCorrespondenceRepository() != null;
		}
		return super.eIsSet(featureID);
	}

} //ProvidedServiceCorrespondenceImpl
