/**
 */
package eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl;

import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalCorrespondenceRepository;
import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalcorrespondencePackage;
import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VirtualNetworkInterconnectCorrespondence;

import eu.cactosfp7.identifier.impl.IdentifierImpl;

import eu.cactosfp7.infrastructuremodels.logicaldc.core.VirtualNetworkInterconnect;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.palladiosimulator.pcm.resourceenvironment.LinkingResource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Virtual Network Interconnect Correspondence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.VirtualNetworkInterconnectCorrespondenceImpl#getCactos <em>Cactos</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.VirtualNetworkInterconnectCorrespondenceImpl#getPalladio <em>Palladio</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.VirtualNetworkInterconnectCorrespondenceImpl#getLogicalCorrespondenceRepository <em>Logical Correspondence Repository</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VirtualNetworkInterconnectCorrespondenceImpl extends IdentifierImpl implements VirtualNetworkInterconnectCorrespondence {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VirtualNetworkInterconnectCorrespondenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogicalcorrespondencePackage.Literals.VIRTUAL_NETWORK_INTERCONNECT_CORRESPONDENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualNetworkInterconnect getCactos() {
		return (VirtualNetworkInterconnect)eDynamicGet(LogicalcorrespondencePackage.VIRTUAL_NETWORK_INTERCONNECT_CORRESPONDENCE__CACTOS, LogicalcorrespondencePackage.Literals.VIRTUAL_NETWORK_INTERCONNECT_CORRESPONDENCE__CACTOS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualNetworkInterconnect basicGetCactos() {
		return (VirtualNetworkInterconnect)eDynamicGet(LogicalcorrespondencePackage.VIRTUAL_NETWORK_INTERCONNECT_CORRESPONDENCE__CACTOS, LogicalcorrespondencePackage.Literals.VIRTUAL_NETWORK_INTERCONNECT_CORRESPONDENCE__CACTOS, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCactos(VirtualNetworkInterconnect newCactos) {
		eDynamicSet(LogicalcorrespondencePackage.VIRTUAL_NETWORK_INTERCONNECT_CORRESPONDENCE__CACTOS, LogicalcorrespondencePackage.Literals.VIRTUAL_NETWORK_INTERCONNECT_CORRESPONDENCE__CACTOS, newCactos);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkingResource getPalladio() {
		return (LinkingResource)eDynamicGet(LogicalcorrespondencePackage.VIRTUAL_NETWORK_INTERCONNECT_CORRESPONDENCE__PALLADIO, LogicalcorrespondencePackage.Literals.VIRTUAL_NETWORK_INTERCONNECT_CORRESPONDENCE__PALLADIO, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkingResource basicGetPalladio() {
		return (LinkingResource)eDynamicGet(LogicalcorrespondencePackage.VIRTUAL_NETWORK_INTERCONNECT_CORRESPONDENCE__PALLADIO, LogicalcorrespondencePackage.Literals.VIRTUAL_NETWORK_INTERCONNECT_CORRESPONDENCE__PALLADIO, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPalladio(LinkingResource newPalladio) {
		eDynamicSet(LogicalcorrespondencePackage.VIRTUAL_NETWORK_INTERCONNECT_CORRESPONDENCE__PALLADIO, LogicalcorrespondencePackage.Literals.VIRTUAL_NETWORK_INTERCONNECT_CORRESPONDENCE__PALLADIO, newPalladio);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalCorrespondenceRepository getLogicalCorrespondenceRepository() {
		return (LogicalCorrespondenceRepository)eDynamicGet(LogicalcorrespondencePackage.VIRTUAL_NETWORK_INTERCONNECT_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY, LogicalcorrespondencePackage.Literals.VIRTUAL_NETWORK_INTERCONNECT_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLogicalCorrespondenceRepository(LogicalCorrespondenceRepository newLogicalCorrespondenceRepository, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newLogicalCorrespondenceRepository, LogicalcorrespondencePackage.VIRTUAL_NETWORK_INTERCONNECT_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogicalCorrespondenceRepository(LogicalCorrespondenceRepository newLogicalCorrespondenceRepository) {
		eDynamicSet(LogicalcorrespondencePackage.VIRTUAL_NETWORK_INTERCONNECT_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY, LogicalcorrespondencePackage.Literals.VIRTUAL_NETWORK_INTERCONNECT_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY, newLogicalCorrespondenceRepository);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogicalcorrespondencePackage.VIRTUAL_NETWORK_INTERCONNECT_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY:
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
			case LogicalcorrespondencePackage.VIRTUAL_NETWORK_INTERCONNECT_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY:
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
			case LogicalcorrespondencePackage.VIRTUAL_NETWORK_INTERCONNECT_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY:
				return eInternalContainer().eInverseRemove(this, LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__VIRTUAL_NETWORK_INTERCONNECTS, LogicalCorrespondenceRepository.class, msgs);
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
			case LogicalcorrespondencePackage.VIRTUAL_NETWORK_INTERCONNECT_CORRESPONDENCE__CACTOS:
				if (resolve) return getCactos();
				return basicGetCactos();
			case LogicalcorrespondencePackage.VIRTUAL_NETWORK_INTERCONNECT_CORRESPONDENCE__PALLADIO:
				if (resolve) return getPalladio();
				return basicGetPalladio();
			case LogicalcorrespondencePackage.VIRTUAL_NETWORK_INTERCONNECT_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY:
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
			case LogicalcorrespondencePackage.VIRTUAL_NETWORK_INTERCONNECT_CORRESPONDENCE__CACTOS:
				setCactos((VirtualNetworkInterconnect)newValue);
				return;
			case LogicalcorrespondencePackage.VIRTUAL_NETWORK_INTERCONNECT_CORRESPONDENCE__PALLADIO:
				setPalladio((LinkingResource)newValue);
				return;
			case LogicalcorrespondencePackage.VIRTUAL_NETWORK_INTERCONNECT_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY:
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
			case LogicalcorrespondencePackage.VIRTUAL_NETWORK_INTERCONNECT_CORRESPONDENCE__CACTOS:
				setCactos((VirtualNetworkInterconnect)null);
				return;
			case LogicalcorrespondencePackage.VIRTUAL_NETWORK_INTERCONNECT_CORRESPONDENCE__PALLADIO:
				setPalladio((LinkingResource)null);
				return;
			case LogicalcorrespondencePackage.VIRTUAL_NETWORK_INTERCONNECT_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY:
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
			case LogicalcorrespondencePackage.VIRTUAL_NETWORK_INTERCONNECT_CORRESPONDENCE__CACTOS:
				return basicGetCactos() != null;
			case LogicalcorrespondencePackage.VIRTUAL_NETWORK_INTERCONNECT_CORRESPONDENCE__PALLADIO:
				return basicGetPalladio() != null;
			case LogicalcorrespondencePackage.VIRTUAL_NETWORK_INTERCONNECT_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY:
				return getLogicalCorrespondenceRepository() != null;
		}
		return super.eIsSet(featureID);
	}

} //VirtualNetworkInterconnectCorrespondenceImpl
