/**
 */
package eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl;

import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalCorrespondenceRepository;
import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalcorrespondencePackage;
import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.NetworkAttachedStorageCorrespondence;

import eu.cactosfp7.identifier.impl.IdentifierImpl;

import eu.cactosfp7.infrastructuremodels.physicaldc.core.NetworkAttachedStorage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.palladiosimulator.pcm.allocation.AllocationContext;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Network Attached Storage Correspondence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.NetworkAttachedStorageCorrespondenceImpl#getCactos <em>Cactos</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.NetworkAttachedStorageCorrespondenceImpl#getPalladio <em>Palladio</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.NetworkAttachedStorageCorrespondenceImpl#getLogicalCorrespondenceRepository <em>Logical Correspondence Repository</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NetworkAttachedStorageCorrespondenceImpl extends IdentifierImpl implements NetworkAttachedStorageCorrespondence {
    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected NetworkAttachedStorageCorrespondenceImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return LogicalcorrespondencePackage.Literals.NETWORK_ATTACHED_STORAGE_CORRESPONDENCE;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NetworkAttachedStorage getCactos() {
		return (NetworkAttachedStorage)eDynamicGet(LogicalcorrespondencePackage.NETWORK_ATTACHED_STORAGE_CORRESPONDENCE__CACTOS, LogicalcorrespondencePackage.Literals.NETWORK_ATTACHED_STORAGE_CORRESPONDENCE__CACTOS, true, true);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NetworkAttachedStorage basicGetCactos() {
		return (NetworkAttachedStorage)eDynamicGet(LogicalcorrespondencePackage.NETWORK_ATTACHED_STORAGE_CORRESPONDENCE__CACTOS, LogicalcorrespondencePackage.Literals.NETWORK_ATTACHED_STORAGE_CORRESPONDENCE__CACTOS, false, true);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setCactos(NetworkAttachedStorage newCactos) {
		eDynamicSet(LogicalcorrespondencePackage.NETWORK_ATTACHED_STORAGE_CORRESPONDENCE__CACTOS, LogicalcorrespondencePackage.Literals.NETWORK_ATTACHED_STORAGE_CORRESPONDENCE__CACTOS, newCactos);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public AllocationContext getPalladio() {
		return (AllocationContext)eDynamicGet(LogicalcorrespondencePackage.NETWORK_ATTACHED_STORAGE_CORRESPONDENCE__PALLADIO, LogicalcorrespondencePackage.Literals.NETWORK_ATTACHED_STORAGE_CORRESPONDENCE__PALLADIO, true, true);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public AllocationContext basicGetPalladio() {
		return (AllocationContext)eDynamicGet(LogicalcorrespondencePackage.NETWORK_ATTACHED_STORAGE_CORRESPONDENCE__PALLADIO, LogicalcorrespondencePackage.Literals.NETWORK_ATTACHED_STORAGE_CORRESPONDENCE__PALLADIO, false, true);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setPalladio(AllocationContext newPalladio) {
		eDynamicSet(LogicalcorrespondencePackage.NETWORK_ATTACHED_STORAGE_CORRESPONDENCE__PALLADIO, LogicalcorrespondencePackage.Literals.NETWORK_ATTACHED_STORAGE_CORRESPONDENCE__PALLADIO, newPalladio);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public LogicalCorrespondenceRepository getLogicalCorrespondenceRepository() {
		return (LogicalCorrespondenceRepository)eDynamicGet(LogicalcorrespondencePackage.NETWORK_ATTACHED_STORAGE_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY, LogicalcorrespondencePackage.Literals.NETWORK_ATTACHED_STORAGE_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY, true, true);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public LogicalCorrespondenceRepository basicGetLogicalCorrespondenceRepository() {
		return (LogicalCorrespondenceRepository)eDynamicGet(LogicalcorrespondencePackage.NETWORK_ATTACHED_STORAGE_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY, LogicalcorrespondencePackage.Literals.NETWORK_ATTACHED_STORAGE_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY, false, true);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetLogicalCorrespondenceRepository(LogicalCorrespondenceRepository newLogicalCorrespondenceRepository, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newLogicalCorrespondenceRepository, LogicalcorrespondencePackage.NETWORK_ATTACHED_STORAGE_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY, msgs);
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setLogicalCorrespondenceRepository(LogicalCorrespondenceRepository newLogicalCorrespondenceRepository) {
		eDynamicSet(LogicalcorrespondencePackage.NETWORK_ATTACHED_STORAGE_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY, LogicalcorrespondencePackage.Literals.NETWORK_ATTACHED_STORAGE_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY, newLogicalCorrespondenceRepository);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogicalcorrespondencePackage.NETWORK_ATTACHED_STORAGE_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY:
				LogicalCorrespondenceRepository logicalCorrespondenceRepository = basicGetLogicalCorrespondenceRepository();
				if (logicalCorrespondenceRepository != null)
					msgs = ((InternalEObject)logicalCorrespondenceRepository).eInverseRemove(this, LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__NETWORK_ATTACHED_STORAGE_CORRESPONDENCES, LogicalCorrespondenceRepository.class, msgs);
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
			case LogicalcorrespondencePackage.NETWORK_ATTACHED_STORAGE_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY:
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
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LogicalcorrespondencePackage.NETWORK_ATTACHED_STORAGE_CORRESPONDENCE__CACTOS:
				if (resolve) return getCactos();
				return basicGetCactos();
			case LogicalcorrespondencePackage.NETWORK_ATTACHED_STORAGE_CORRESPONDENCE__PALLADIO:
				if (resolve) return getPalladio();
				return basicGetPalladio();
			case LogicalcorrespondencePackage.NETWORK_ATTACHED_STORAGE_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY:
				if (resolve) return getLogicalCorrespondenceRepository();
				return basicGetLogicalCorrespondenceRepository();
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
			case LogicalcorrespondencePackage.NETWORK_ATTACHED_STORAGE_CORRESPONDENCE__CACTOS:
				setCactos((NetworkAttachedStorage)newValue);
				return;
			case LogicalcorrespondencePackage.NETWORK_ATTACHED_STORAGE_CORRESPONDENCE__PALLADIO:
				setPalladio((AllocationContext)newValue);
				return;
			case LogicalcorrespondencePackage.NETWORK_ATTACHED_STORAGE_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY:
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
			case LogicalcorrespondencePackage.NETWORK_ATTACHED_STORAGE_CORRESPONDENCE__CACTOS:
				setCactos((NetworkAttachedStorage)null);
				return;
			case LogicalcorrespondencePackage.NETWORK_ATTACHED_STORAGE_CORRESPONDENCE__PALLADIO:
				setPalladio((AllocationContext)null);
				return;
			case LogicalcorrespondencePackage.NETWORK_ATTACHED_STORAGE_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY:
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
			case LogicalcorrespondencePackage.NETWORK_ATTACHED_STORAGE_CORRESPONDENCE__CACTOS:
				return basicGetCactos() != null;
			case LogicalcorrespondencePackage.NETWORK_ATTACHED_STORAGE_CORRESPONDENCE__PALLADIO:
				return basicGetPalladio() != null;
			case LogicalcorrespondencePackage.NETWORK_ATTACHED_STORAGE_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY:
				return basicGetLogicalCorrespondenceRepository() != null;
		}
		return super.eIsSet(featureID);
	}

} //NetworkAttachedStorageCorrespondenceImpl
