/**
 */
package eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl;

import eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalCorrespondenceRepository;
import eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalcorrespondencePackage;
import eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.ProcessingUnitSpecificationCorrespondence;

import eu.cactosfp7.identifier.impl.IdentifierImpl;

import eu.cactosfp7.infrastructuremodels.physicaldc.core.ProcessingUnitSpecification;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.palladiosimulator.pcm.resourceenvironment.ProcessingResourceSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Processing Unit Specification Correspondence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.ProcessingUnitSpecificationCorrespondenceImpl#getCactos <em>Cactos</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.ProcessingUnitSpecificationCorrespondenceImpl#getPalladio <em>Palladio</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.ProcessingUnitSpecificationCorrespondenceImpl#getPhysicalCorrespondenceRepository <em>Physical Correspondence Repository</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessingUnitSpecificationCorrespondenceImpl extends IdentifierImpl implements ProcessingUnitSpecificationCorrespondence {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessingUnitSpecificationCorrespondenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PhysicalcorrespondencePackage.Literals.PROCESSING_UNIT_SPECIFICATION_CORRESPONDENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingUnitSpecification getCactos() {
		return (ProcessingUnitSpecification)eDynamicGet(PhysicalcorrespondencePackage.PROCESSING_UNIT_SPECIFICATION_CORRESPONDENCE__CACTOS, PhysicalcorrespondencePackage.Literals.PROCESSING_UNIT_SPECIFICATION_CORRESPONDENCE__CACTOS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingUnitSpecification basicGetCactos() {
		return (ProcessingUnitSpecification)eDynamicGet(PhysicalcorrespondencePackage.PROCESSING_UNIT_SPECIFICATION_CORRESPONDENCE__CACTOS, PhysicalcorrespondencePackage.Literals.PROCESSING_UNIT_SPECIFICATION_CORRESPONDENCE__CACTOS, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCactos(ProcessingUnitSpecification newCactos) {
		eDynamicSet(PhysicalcorrespondencePackage.PROCESSING_UNIT_SPECIFICATION_CORRESPONDENCE__CACTOS, PhysicalcorrespondencePackage.Literals.PROCESSING_UNIT_SPECIFICATION_CORRESPONDENCE__CACTOS, newCactos);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingResourceSpecification getPalladio() {
		return (ProcessingResourceSpecification)eDynamicGet(PhysicalcorrespondencePackage.PROCESSING_UNIT_SPECIFICATION_CORRESPONDENCE__PALLADIO, PhysicalcorrespondencePackage.Literals.PROCESSING_UNIT_SPECIFICATION_CORRESPONDENCE__PALLADIO, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingResourceSpecification basicGetPalladio() {
		return (ProcessingResourceSpecification)eDynamicGet(PhysicalcorrespondencePackage.PROCESSING_UNIT_SPECIFICATION_CORRESPONDENCE__PALLADIO, PhysicalcorrespondencePackage.Literals.PROCESSING_UNIT_SPECIFICATION_CORRESPONDENCE__PALLADIO, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPalladio(ProcessingResourceSpecification newPalladio) {
		eDynamicSet(PhysicalcorrespondencePackage.PROCESSING_UNIT_SPECIFICATION_CORRESPONDENCE__PALLADIO, PhysicalcorrespondencePackage.Literals.PROCESSING_UNIT_SPECIFICATION_CORRESPONDENCE__PALLADIO, newPalladio);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalCorrespondenceRepository getPhysicalCorrespondenceRepository() {
		return (PhysicalCorrespondenceRepository)eDynamicGet(PhysicalcorrespondencePackage.PROCESSING_UNIT_SPECIFICATION_CORRESPONDENCE__PHYSICAL_CORRESPONDENCE_REPOSITORY, PhysicalcorrespondencePackage.Literals.PROCESSING_UNIT_SPECIFICATION_CORRESPONDENCE__PHYSICAL_CORRESPONDENCE_REPOSITORY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPhysicalCorrespondenceRepository(PhysicalCorrespondenceRepository newPhysicalCorrespondenceRepository, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPhysicalCorrespondenceRepository, PhysicalcorrespondencePackage.PROCESSING_UNIT_SPECIFICATION_CORRESPONDENCE__PHYSICAL_CORRESPONDENCE_REPOSITORY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhysicalCorrespondenceRepository(PhysicalCorrespondenceRepository newPhysicalCorrespondenceRepository) {
		eDynamicSet(PhysicalcorrespondencePackage.PROCESSING_UNIT_SPECIFICATION_CORRESPONDENCE__PHYSICAL_CORRESPONDENCE_REPOSITORY, PhysicalcorrespondencePackage.Literals.PROCESSING_UNIT_SPECIFICATION_CORRESPONDENCE__PHYSICAL_CORRESPONDENCE_REPOSITORY, newPhysicalCorrespondenceRepository);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PhysicalcorrespondencePackage.PROCESSING_UNIT_SPECIFICATION_CORRESPONDENCE__PHYSICAL_CORRESPONDENCE_REPOSITORY:
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
			case PhysicalcorrespondencePackage.PROCESSING_UNIT_SPECIFICATION_CORRESPONDENCE__PHYSICAL_CORRESPONDENCE_REPOSITORY:
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
			case PhysicalcorrespondencePackage.PROCESSING_UNIT_SPECIFICATION_CORRESPONDENCE__PHYSICAL_CORRESPONDENCE_REPOSITORY:
				return eInternalContainer().eInverseRemove(this, PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__PROCESSING_UNIT_SPECIFICATION_CORRESPONDENCES, PhysicalCorrespondenceRepository.class, msgs);
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
			case PhysicalcorrespondencePackage.PROCESSING_UNIT_SPECIFICATION_CORRESPONDENCE__CACTOS:
				if (resolve) return getCactos();
				return basicGetCactos();
			case PhysicalcorrespondencePackage.PROCESSING_UNIT_SPECIFICATION_CORRESPONDENCE__PALLADIO:
				if (resolve) return getPalladio();
				return basicGetPalladio();
			case PhysicalcorrespondencePackage.PROCESSING_UNIT_SPECIFICATION_CORRESPONDENCE__PHYSICAL_CORRESPONDENCE_REPOSITORY:
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
			case PhysicalcorrespondencePackage.PROCESSING_UNIT_SPECIFICATION_CORRESPONDENCE__CACTOS:
				setCactos((ProcessingUnitSpecification)newValue);
				return;
			case PhysicalcorrespondencePackage.PROCESSING_UNIT_SPECIFICATION_CORRESPONDENCE__PALLADIO:
				setPalladio((ProcessingResourceSpecification)newValue);
				return;
			case PhysicalcorrespondencePackage.PROCESSING_UNIT_SPECIFICATION_CORRESPONDENCE__PHYSICAL_CORRESPONDENCE_REPOSITORY:
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
			case PhysicalcorrespondencePackage.PROCESSING_UNIT_SPECIFICATION_CORRESPONDENCE__CACTOS:
				setCactos((ProcessingUnitSpecification)null);
				return;
			case PhysicalcorrespondencePackage.PROCESSING_UNIT_SPECIFICATION_CORRESPONDENCE__PALLADIO:
				setPalladio((ProcessingResourceSpecification)null);
				return;
			case PhysicalcorrespondencePackage.PROCESSING_UNIT_SPECIFICATION_CORRESPONDENCE__PHYSICAL_CORRESPONDENCE_REPOSITORY:
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
			case PhysicalcorrespondencePackage.PROCESSING_UNIT_SPECIFICATION_CORRESPONDENCE__CACTOS:
				return basicGetCactos() != null;
			case PhysicalcorrespondencePackage.PROCESSING_UNIT_SPECIFICATION_CORRESPONDENCE__PALLADIO:
				return basicGetPalladio() != null;
			case PhysicalcorrespondencePackage.PROCESSING_UNIT_SPECIFICATION_CORRESPONDENCE__PHYSICAL_CORRESPONDENCE_REPOSITORY:
				return getPhysicalCorrespondenceRepository() != null;
		}
		return super.eIsSet(featureID);
	}

} //ProcessingUnitSpecificationCorrespondenceImpl
