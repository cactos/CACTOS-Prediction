/**
 */
package eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl;

import eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.ArchitectureTypeCorrespondence;
import eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalCorrespondenceRepository;
import eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalcorrespondencePackage;

import eu.cactosfp7.identifier.impl.IdentifierImpl;

import eu.cactosfp7.infrastructuremodels.physicaldc.architecturetype.ArchitectureType;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.palladiosimulator.pcm.resourcetype.ProcessingResourceType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Architecture Type Correspondence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.ArchitectureTypeCorrespondenceImpl#getCactos <em>Cactos</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.ArchitectureTypeCorrespondenceImpl#getPalladio <em>Palladio</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.ArchitectureTypeCorrespondenceImpl#getPhysicalCorrespondenceRepository <em>Physical Correspondence Repository</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArchitectureTypeCorrespondenceImpl extends IdentifierImpl implements ArchitectureTypeCorrespondence {
    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected ArchitectureTypeCorrespondenceImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return PhysicalcorrespondencePackage.Literals.ARCHITECTURE_TYPE_CORRESPONDENCE;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ArchitectureType getCactos() {
		return (ArchitectureType)eDynamicGet(PhysicalcorrespondencePackage.ARCHITECTURE_TYPE_CORRESPONDENCE__CACTOS, PhysicalcorrespondencePackage.Literals.ARCHITECTURE_TYPE_CORRESPONDENCE__CACTOS, true, true);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ArchitectureType basicGetCactos() {
		return (ArchitectureType)eDynamicGet(PhysicalcorrespondencePackage.ARCHITECTURE_TYPE_CORRESPONDENCE__CACTOS, PhysicalcorrespondencePackage.Literals.ARCHITECTURE_TYPE_CORRESPONDENCE__CACTOS, false, true);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setCactos(ArchitectureType newCactos) {
		eDynamicSet(PhysicalcorrespondencePackage.ARCHITECTURE_TYPE_CORRESPONDENCE__CACTOS, PhysicalcorrespondencePackage.Literals.ARCHITECTURE_TYPE_CORRESPONDENCE__CACTOS, newCactos);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ProcessingResourceType getPalladio() {
		return (ProcessingResourceType)eDynamicGet(PhysicalcorrespondencePackage.ARCHITECTURE_TYPE_CORRESPONDENCE__PALLADIO, PhysicalcorrespondencePackage.Literals.ARCHITECTURE_TYPE_CORRESPONDENCE__PALLADIO, true, true);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ProcessingResourceType basicGetPalladio() {
		return (ProcessingResourceType)eDynamicGet(PhysicalcorrespondencePackage.ARCHITECTURE_TYPE_CORRESPONDENCE__PALLADIO, PhysicalcorrespondencePackage.Literals.ARCHITECTURE_TYPE_CORRESPONDENCE__PALLADIO, false, true);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setPalladio(ProcessingResourceType newPalladio) {
		eDynamicSet(PhysicalcorrespondencePackage.ARCHITECTURE_TYPE_CORRESPONDENCE__PALLADIO, PhysicalcorrespondencePackage.Literals.ARCHITECTURE_TYPE_CORRESPONDENCE__PALLADIO, newPalladio);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public PhysicalCorrespondenceRepository getPhysicalCorrespondenceRepository() {
		return (PhysicalCorrespondenceRepository)eDynamicGet(PhysicalcorrespondencePackage.ARCHITECTURE_TYPE_CORRESPONDENCE__PHYSICAL_CORRESPONDENCE_REPOSITORY, PhysicalcorrespondencePackage.Literals.ARCHITECTURE_TYPE_CORRESPONDENCE__PHYSICAL_CORRESPONDENCE_REPOSITORY, true, true);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetPhysicalCorrespondenceRepository(PhysicalCorrespondenceRepository newPhysicalCorrespondenceRepository, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPhysicalCorrespondenceRepository, PhysicalcorrespondencePackage.ARCHITECTURE_TYPE_CORRESPONDENCE__PHYSICAL_CORRESPONDENCE_REPOSITORY, msgs);
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setPhysicalCorrespondenceRepository(PhysicalCorrespondenceRepository newPhysicalCorrespondenceRepository) {
		eDynamicSet(PhysicalcorrespondencePackage.ARCHITECTURE_TYPE_CORRESPONDENCE__PHYSICAL_CORRESPONDENCE_REPOSITORY, PhysicalcorrespondencePackage.Literals.ARCHITECTURE_TYPE_CORRESPONDENCE__PHYSICAL_CORRESPONDENCE_REPOSITORY, newPhysicalCorrespondenceRepository);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PhysicalcorrespondencePackage.ARCHITECTURE_TYPE_CORRESPONDENCE__PHYSICAL_CORRESPONDENCE_REPOSITORY:
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
			case PhysicalcorrespondencePackage.ARCHITECTURE_TYPE_CORRESPONDENCE__PHYSICAL_CORRESPONDENCE_REPOSITORY:
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
			case PhysicalcorrespondencePackage.ARCHITECTURE_TYPE_CORRESPONDENCE__PHYSICAL_CORRESPONDENCE_REPOSITORY:
				return eInternalContainer().eInverseRemove(this, PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__ARCHITECTURE_TYPE_CORRESPONDENCES, PhysicalCorrespondenceRepository.class, msgs);
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
			case PhysicalcorrespondencePackage.ARCHITECTURE_TYPE_CORRESPONDENCE__CACTOS:
				if (resolve) return getCactos();
				return basicGetCactos();
			case PhysicalcorrespondencePackage.ARCHITECTURE_TYPE_CORRESPONDENCE__PALLADIO:
				if (resolve) return getPalladio();
				return basicGetPalladio();
			case PhysicalcorrespondencePackage.ARCHITECTURE_TYPE_CORRESPONDENCE__PHYSICAL_CORRESPONDENCE_REPOSITORY:
				return getPhysicalCorrespondenceRepository();
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
			case PhysicalcorrespondencePackage.ARCHITECTURE_TYPE_CORRESPONDENCE__CACTOS:
				setCactos((ArchitectureType)newValue);
				return;
			case PhysicalcorrespondencePackage.ARCHITECTURE_TYPE_CORRESPONDENCE__PALLADIO:
				setPalladio((ProcessingResourceType)newValue);
				return;
			case PhysicalcorrespondencePackage.ARCHITECTURE_TYPE_CORRESPONDENCE__PHYSICAL_CORRESPONDENCE_REPOSITORY:
				setPhysicalCorrespondenceRepository((PhysicalCorrespondenceRepository)newValue);
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
			case PhysicalcorrespondencePackage.ARCHITECTURE_TYPE_CORRESPONDENCE__CACTOS:
				setCactos((ArchitectureType)null);
				return;
			case PhysicalcorrespondencePackage.ARCHITECTURE_TYPE_CORRESPONDENCE__PALLADIO:
				setPalladio((ProcessingResourceType)null);
				return;
			case PhysicalcorrespondencePackage.ARCHITECTURE_TYPE_CORRESPONDENCE__PHYSICAL_CORRESPONDENCE_REPOSITORY:
				setPhysicalCorrespondenceRepository((PhysicalCorrespondenceRepository)null);
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
			case PhysicalcorrespondencePackage.ARCHITECTURE_TYPE_CORRESPONDENCE__CACTOS:
				return basicGetCactos() != null;
			case PhysicalcorrespondencePackage.ARCHITECTURE_TYPE_CORRESPONDENCE__PALLADIO:
				return basicGetPalladio() != null;
			case PhysicalcorrespondencePackage.ARCHITECTURE_TYPE_CORRESPONDENCE__PHYSICAL_CORRESPONDENCE_REPOSITORY:
				return getPhysicalCorrespondenceRepository() != null;
		}
		return super.eIsSet(featureID);
	}

} //ArchitectureTypeCorrespondenceImpl
