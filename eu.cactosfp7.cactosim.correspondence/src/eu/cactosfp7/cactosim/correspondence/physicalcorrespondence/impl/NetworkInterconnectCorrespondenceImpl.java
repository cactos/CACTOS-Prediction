/**
 */
package eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl;

import eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.NetworkInterconnectCorrespondence;
import eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalCorrespondenceRepository;
import eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalcorrespondencePackage;

import eu.cactosfp7.identifier.impl.IdentifierImpl;

import eu.cactosfp7.infrastructuremodels.physicaldc.core.NetworkInterconnect;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.palladiosimulator.pcm.resourceenvironment.LinkingResource;
import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Network Interconnect Correspondence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.NetworkInterconnectCorrespondenceImpl#getCactos <em>Cactos</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.NetworkInterconnectCorrespondenceImpl#getPalladio <em>Palladio</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.NetworkInterconnectCorrespondenceImpl#getPhysicalCorrespondenceRepository <em>Physical Correspondence Repository</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.NetworkInterconnectCorrespondenceImpl#getReconfigurationController <em>Reconfiguration Controller</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NetworkInterconnectCorrespondenceImpl extends IdentifierImpl implements NetworkInterconnectCorrespondence {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NetworkInterconnectCorrespondenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PhysicalcorrespondencePackage.Literals.NETWORK_INTERCONNECT_CORRESPONDENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<NetworkInterconnect> getCactos() {
		return (EList<NetworkInterconnect>)eDynamicGet(PhysicalcorrespondencePackage.NETWORK_INTERCONNECT_CORRESPONDENCE__CACTOS, PhysicalcorrespondencePackage.Literals.NETWORK_INTERCONNECT_CORRESPONDENCE__CACTOS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkingResource getPalladio() {
		return (LinkingResource)eDynamicGet(PhysicalcorrespondencePackage.NETWORK_INTERCONNECT_CORRESPONDENCE__PALLADIO, PhysicalcorrespondencePackage.Literals.NETWORK_INTERCONNECT_CORRESPONDENCE__PALLADIO, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkingResource basicGetPalladio() {
		return (LinkingResource)eDynamicGet(PhysicalcorrespondencePackage.NETWORK_INTERCONNECT_CORRESPONDENCE__PALLADIO, PhysicalcorrespondencePackage.Literals.NETWORK_INTERCONNECT_CORRESPONDENCE__PALLADIO, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPalladio(LinkingResource newPalladio) {
		eDynamicSet(PhysicalcorrespondencePackage.NETWORK_INTERCONNECT_CORRESPONDENCE__PALLADIO, PhysicalcorrespondencePackage.Literals.NETWORK_INTERCONNECT_CORRESPONDENCE__PALLADIO, newPalladio);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalCorrespondenceRepository getPhysicalCorrespondenceRepository() {
		return (PhysicalCorrespondenceRepository)eDynamicGet(PhysicalcorrespondencePackage.NETWORK_INTERCONNECT_CORRESPONDENCE__PHYSICAL_CORRESPONDENCE_REPOSITORY, PhysicalcorrespondencePackage.Literals.NETWORK_INTERCONNECT_CORRESPONDENCE__PHYSICAL_CORRESPONDENCE_REPOSITORY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPhysicalCorrespondenceRepository(PhysicalCorrespondenceRepository newPhysicalCorrespondenceRepository, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPhysicalCorrespondenceRepository, PhysicalcorrespondencePackage.NETWORK_INTERCONNECT_CORRESPONDENCE__PHYSICAL_CORRESPONDENCE_REPOSITORY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhysicalCorrespondenceRepository(PhysicalCorrespondenceRepository newPhysicalCorrespondenceRepository) {
		eDynamicSet(PhysicalcorrespondencePackage.NETWORK_INTERCONNECT_CORRESPONDENCE__PHYSICAL_CORRESPONDENCE_REPOSITORY, PhysicalcorrespondencePackage.Literals.NETWORK_INTERCONNECT_CORRESPONDENCE__PHYSICAL_CORRESPONDENCE_REPOSITORY, newPhysicalCorrespondenceRepository);
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ResourceContainer getReconfigurationController() {
		return (ResourceContainer)eDynamicGet(PhysicalcorrespondencePackage.NETWORK_INTERCONNECT_CORRESPONDENCE__RECONFIGURATION_CONTROLLER, PhysicalcorrespondencePackage.Literals.NETWORK_INTERCONNECT_CORRESPONDENCE__RECONFIGURATION_CONTROLLER, true, true);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ResourceContainer basicGetReconfigurationController() {
		return (ResourceContainer)eDynamicGet(PhysicalcorrespondencePackage.NETWORK_INTERCONNECT_CORRESPONDENCE__RECONFIGURATION_CONTROLLER, PhysicalcorrespondencePackage.Literals.NETWORK_INTERCONNECT_CORRESPONDENCE__RECONFIGURATION_CONTROLLER, false, true);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setReconfigurationController(ResourceContainer newReconfigurationController) {
		eDynamicSet(PhysicalcorrespondencePackage.NETWORK_INTERCONNECT_CORRESPONDENCE__RECONFIGURATION_CONTROLLER, PhysicalcorrespondencePackage.Literals.NETWORK_INTERCONNECT_CORRESPONDENCE__RECONFIGURATION_CONTROLLER, newReconfigurationController);
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PhysicalcorrespondencePackage.NETWORK_INTERCONNECT_CORRESPONDENCE__PHYSICAL_CORRESPONDENCE_REPOSITORY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPhysicalCorrespondenceRepository((PhysicalCorrespondenceRepository)otherEnd, msgs);
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
			case PhysicalcorrespondencePackage.NETWORK_INTERCONNECT_CORRESPONDENCE__PHYSICAL_CORRESPONDENCE_REPOSITORY:
				return basicSetPhysicalCorrespondenceRepository(null, msgs);
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
			case PhysicalcorrespondencePackage.NETWORK_INTERCONNECT_CORRESPONDENCE__PHYSICAL_CORRESPONDENCE_REPOSITORY:
				return eInternalContainer().eInverseRemove(this, PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__NETWORK_INTERCONNECT_CORRESPONDENCES, PhysicalCorrespondenceRepository.class, msgs);
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
			case PhysicalcorrespondencePackage.NETWORK_INTERCONNECT_CORRESPONDENCE__CACTOS:
				return getCactos();
			case PhysicalcorrespondencePackage.NETWORK_INTERCONNECT_CORRESPONDENCE__PALLADIO:
				if (resolve) return getPalladio();
				return basicGetPalladio();
			case PhysicalcorrespondencePackage.NETWORK_INTERCONNECT_CORRESPONDENCE__PHYSICAL_CORRESPONDENCE_REPOSITORY:
				return getPhysicalCorrespondenceRepository();
			case PhysicalcorrespondencePackage.NETWORK_INTERCONNECT_CORRESPONDENCE__RECONFIGURATION_CONTROLLER:
				if (resolve) return getReconfigurationController();
				return basicGetReconfigurationController();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PhysicalcorrespondencePackage.NETWORK_INTERCONNECT_CORRESPONDENCE__CACTOS:
				getCactos().clear();
				getCactos().addAll((Collection<? extends NetworkInterconnect>)newValue);
				return;
			case PhysicalcorrespondencePackage.NETWORK_INTERCONNECT_CORRESPONDENCE__PALLADIO:
				setPalladio((LinkingResource)newValue);
				return;
			case PhysicalcorrespondencePackage.NETWORK_INTERCONNECT_CORRESPONDENCE__PHYSICAL_CORRESPONDENCE_REPOSITORY:
				setPhysicalCorrespondenceRepository((PhysicalCorrespondenceRepository)newValue);
				return;
			case PhysicalcorrespondencePackage.NETWORK_INTERCONNECT_CORRESPONDENCE__RECONFIGURATION_CONTROLLER:
				setReconfigurationController((ResourceContainer)newValue);
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
			case PhysicalcorrespondencePackage.NETWORK_INTERCONNECT_CORRESPONDENCE__CACTOS:
				getCactos().clear();
				return;
			case PhysicalcorrespondencePackage.NETWORK_INTERCONNECT_CORRESPONDENCE__PALLADIO:
				setPalladio((LinkingResource)null);
				return;
			case PhysicalcorrespondencePackage.NETWORK_INTERCONNECT_CORRESPONDENCE__PHYSICAL_CORRESPONDENCE_REPOSITORY:
				setPhysicalCorrespondenceRepository((PhysicalCorrespondenceRepository)null);
				return;
			case PhysicalcorrespondencePackage.NETWORK_INTERCONNECT_CORRESPONDENCE__RECONFIGURATION_CONTROLLER:
				setReconfigurationController((ResourceContainer)null);
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
			case PhysicalcorrespondencePackage.NETWORK_INTERCONNECT_CORRESPONDENCE__CACTOS:
				return !getCactos().isEmpty();
			case PhysicalcorrespondencePackage.NETWORK_INTERCONNECT_CORRESPONDENCE__PALLADIO:
				return basicGetPalladio() != null;
			case PhysicalcorrespondencePackage.NETWORK_INTERCONNECT_CORRESPONDENCE__PHYSICAL_CORRESPONDENCE_REPOSITORY:
				return getPhysicalCorrespondenceRepository() != null;
			case PhysicalcorrespondencePackage.NETWORK_INTERCONNECT_CORRESPONDENCE__RECONFIGURATION_CONTROLLER:
				return basicGetReconfigurationController() != null;
		}
		return super.eIsSet(featureID);
	}

} //NetworkInterconnectCorrespondenceImpl
