/**
 */
package eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl;

import eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalCorrespondenceRepository;
import eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalcorrespondencePackage;
import eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.StorageSpecificationCorrespondence;

import eu.cactosfp7.identifier.impl.IdentifierImpl;

import eu.cactosfp7.infrastructuremodels.physicaldc.core.StorageSpecification;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.palladiosimulator.pcm.resourceenvironment.ProcessingResourceSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Storage Specification Correspondence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.StorageSpecificationCorrespondenceImpl#getCactos <em>Cactos</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.StorageSpecificationCorrespondenceImpl#getPalladio <em>Palladio</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.StorageSpecificationCorrespondenceImpl#getPhysicalCorrespondenceRepository <em>Physical Correspondence Repository</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StorageSpecificationCorrespondenceImpl extends IdentifierImpl implements StorageSpecificationCorrespondence {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StorageSpecificationCorrespondenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PhysicalcorrespondencePackage.Literals.STORAGE_SPECIFICATION_CORRESPONDENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StorageSpecification getCactos() {
		return (StorageSpecification)eDynamicGet(PhysicalcorrespondencePackage.STORAGE_SPECIFICATION_CORRESPONDENCE__CACTOS, PhysicalcorrespondencePackage.Literals.STORAGE_SPECIFICATION_CORRESPONDENCE__CACTOS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StorageSpecification basicGetCactos() {
		return (StorageSpecification)eDynamicGet(PhysicalcorrespondencePackage.STORAGE_SPECIFICATION_CORRESPONDENCE__CACTOS, PhysicalcorrespondencePackage.Literals.STORAGE_SPECIFICATION_CORRESPONDENCE__CACTOS, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCactos(StorageSpecification newCactos) {
		eDynamicSet(PhysicalcorrespondencePackage.STORAGE_SPECIFICATION_CORRESPONDENCE__CACTOS, PhysicalcorrespondencePackage.Literals.STORAGE_SPECIFICATION_CORRESPONDENCE__CACTOS, newCactos);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingResourceSpecification getPalladio() {
		return (ProcessingResourceSpecification)eDynamicGet(PhysicalcorrespondencePackage.STORAGE_SPECIFICATION_CORRESPONDENCE__PALLADIO, PhysicalcorrespondencePackage.Literals.STORAGE_SPECIFICATION_CORRESPONDENCE__PALLADIO, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingResourceSpecification basicGetPalladio() {
		return (ProcessingResourceSpecification)eDynamicGet(PhysicalcorrespondencePackage.STORAGE_SPECIFICATION_CORRESPONDENCE__PALLADIO, PhysicalcorrespondencePackage.Literals.STORAGE_SPECIFICATION_CORRESPONDENCE__PALLADIO, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPalladio(ProcessingResourceSpecification newPalladio) {
		eDynamicSet(PhysicalcorrespondencePackage.STORAGE_SPECIFICATION_CORRESPONDENCE__PALLADIO, PhysicalcorrespondencePackage.Literals.STORAGE_SPECIFICATION_CORRESPONDENCE__PALLADIO, newPalladio);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalCorrespondenceRepository getPhysicalCorrespondenceRepository() {
		return (PhysicalCorrespondenceRepository)eDynamicGet(PhysicalcorrespondencePackage.STORAGE_SPECIFICATION_CORRESPONDENCE__PHYSICAL_CORRESPONDENCE_REPOSITORY, PhysicalcorrespondencePackage.Literals.STORAGE_SPECIFICATION_CORRESPONDENCE__PHYSICAL_CORRESPONDENCE_REPOSITORY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPhysicalCorrespondenceRepository(PhysicalCorrespondenceRepository newPhysicalCorrespondenceRepository, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPhysicalCorrespondenceRepository, PhysicalcorrespondencePackage.STORAGE_SPECIFICATION_CORRESPONDENCE__PHYSICAL_CORRESPONDENCE_REPOSITORY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhysicalCorrespondenceRepository(PhysicalCorrespondenceRepository newPhysicalCorrespondenceRepository) {
		eDynamicSet(PhysicalcorrespondencePackage.STORAGE_SPECIFICATION_CORRESPONDENCE__PHYSICAL_CORRESPONDENCE_REPOSITORY, PhysicalcorrespondencePackage.Literals.STORAGE_SPECIFICATION_CORRESPONDENCE__PHYSICAL_CORRESPONDENCE_REPOSITORY, newPhysicalCorrespondenceRepository);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PhysicalcorrespondencePackage.STORAGE_SPECIFICATION_CORRESPONDENCE__PHYSICAL_CORRESPONDENCE_REPOSITORY:
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
			case PhysicalcorrespondencePackage.STORAGE_SPECIFICATION_CORRESPONDENCE__PHYSICAL_CORRESPONDENCE_REPOSITORY:
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
			case PhysicalcorrespondencePackage.STORAGE_SPECIFICATION_CORRESPONDENCE__PHYSICAL_CORRESPONDENCE_REPOSITORY:
				return eInternalContainer().eInverseRemove(this, PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__STORAGE_SPECIFICATION_CORRESPONDENCES, PhysicalCorrespondenceRepository.class, msgs);
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
			case PhysicalcorrespondencePackage.STORAGE_SPECIFICATION_CORRESPONDENCE__CACTOS:
				if (resolve) return getCactos();
				return basicGetCactos();
			case PhysicalcorrespondencePackage.STORAGE_SPECIFICATION_CORRESPONDENCE__PALLADIO:
				if (resolve) return getPalladio();
				return basicGetPalladio();
			case PhysicalcorrespondencePackage.STORAGE_SPECIFICATION_CORRESPONDENCE__PHYSICAL_CORRESPONDENCE_REPOSITORY:
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
			case PhysicalcorrespondencePackage.STORAGE_SPECIFICATION_CORRESPONDENCE__CACTOS:
				setCactos((StorageSpecification)newValue);
				return;
			case PhysicalcorrespondencePackage.STORAGE_SPECIFICATION_CORRESPONDENCE__PALLADIO:
				setPalladio((ProcessingResourceSpecification)newValue);
				return;
			case PhysicalcorrespondencePackage.STORAGE_SPECIFICATION_CORRESPONDENCE__PHYSICAL_CORRESPONDENCE_REPOSITORY:
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
			case PhysicalcorrespondencePackage.STORAGE_SPECIFICATION_CORRESPONDENCE__CACTOS:
				setCactos((StorageSpecification)null);
				return;
			case PhysicalcorrespondencePackage.STORAGE_SPECIFICATION_CORRESPONDENCE__PALLADIO:
				setPalladio((ProcessingResourceSpecification)null);
				return;
			case PhysicalcorrespondencePackage.STORAGE_SPECIFICATION_CORRESPONDENCE__PHYSICAL_CORRESPONDENCE_REPOSITORY:
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
			case PhysicalcorrespondencePackage.STORAGE_SPECIFICATION_CORRESPONDENCE__CACTOS:
				return basicGetCactos() != null;
			case PhysicalcorrespondencePackage.STORAGE_SPECIFICATION_CORRESPONDENCE__PALLADIO:
				return basicGetPalladio() != null;
			case PhysicalcorrespondencePackage.STORAGE_SPECIFICATION_CORRESPONDENCE__PHYSICAL_CORRESPONDENCE_REPOSITORY:
				return getPhysicalCorrespondenceRepository() != null;
		}
		return super.eIsSet(featureID);
	}

} //StorageSpecificationCorrespondenceImpl
