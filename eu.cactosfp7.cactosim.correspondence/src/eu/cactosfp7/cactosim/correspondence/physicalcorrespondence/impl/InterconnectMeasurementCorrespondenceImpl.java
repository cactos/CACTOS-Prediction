/**
 */
package eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl;

import eu.cactosfp7.cactosim.correspondence.impl.LoadCorrespondenceImpl;

import eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.InterconnectMeasurementCorrespondence;
import eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalCorrespondenceRepository;
import eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalcorrespondencePackage;

import eu.cactosfp7.infrastructuremodels.load.physical.InterconnectMeasurement;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interconnect Measurement Correspondence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.InterconnectMeasurementCorrespondenceImpl#getCactos <em>Cactos</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.InterconnectMeasurementCorrespondenceImpl#getPhysicalCorrespondenceRepository <em>Physical Correspondence Repository</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterconnectMeasurementCorrespondenceImpl extends LoadCorrespondenceImpl implements InterconnectMeasurementCorrespondence {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterconnectMeasurementCorrespondenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PhysicalcorrespondencePackage.Literals.INTERCONNECT_MEASUREMENT_CORRESPONDENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterconnectMeasurement getCactos() {
		return (InterconnectMeasurement)eDynamicGet(PhysicalcorrespondencePackage.INTERCONNECT_MEASUREMENT_CORRESPONDENCE__CACTOS, PhysicalcorrespondencePackage.Literals.INTERCONNECT_MEASUREMENT_CORRESPONDENCE__CACTOS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterconnectMeasurement basicGetCactos() {
		return (InterconnectMeasurement)eDynamicGet(PhysicalcorrespondencePackage.INTERCONNECT_MEASUREMENT_CORRESPONDENCE__CACTOS, PhysicalcorrespondencePackage.Literals.INTERCONNECT_MEASUREMENT_CORRESPONDENCE__CACTOS, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCactos(InterconnectMeasurement newCactos) {
		eDynamicSet(PhysicalcorrespondencePackage.INTERCONNECT_MEASUREMENT_CORRESPONDENCE__CACTOS, PhysicalcorrespondencePackage.Literals.INTERCONNECT_MEASUREMENT_CORRESPONDENCE__CACTOS, newCactos);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalCorrespondenceRepository getPhysicalCorrespondenceRepository() {
		return (PhysicalCorrespondenceRepository)eDynamicGet(PhysicalcorrespondencePackage.INTERCONNECT_MEASUREMENT_CORRESPONDENCE__PHYSICAL_CORRESPONDENCE_REPOSITORY, PhysicalcorrespondencePackage.Literals.INTERCONNECT_MEASUREMENT_CORRESPONDENCE__PHYSICAL_CORRESPONDENCE_REPOSITORY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPhysicalCorrespondenceRepository(PhysicalCorrespondenceRepository newPhysicalCorrespondenceRepository, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPhysicalCorrespondenceRepository, PhysicalcorrespondencePackage.INTERCONNECT_MEASUREMENT_CORRESPONDENCE__PHYSICAL_CORRESPONDENCE_REPOSITORY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhysicalCorrespondenceRepository(PhysicalCorrespondenceRepository newPhysicalCorrespondenceRepository) {
		eDynamicSet(PhysicalcorrespondencePackage.INTERCONNECT_MEASUREMENT_CORRESPONDENCE__PHYSICAL_CORRESPONDENCE_REPOSITORY, PhysicalcorrespondencePackage.Literals.INTERCONNECT_MEASUREMENT_CORRESPONDENCE__PHYSICAL_CORRESPONDENCE_REPOSITORY, newPhysicalCorrespondenceRepository);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PhysicalcorrespondencePackage.INTERCONNECT_MEASUREMENT_CORRESPONDENCE__PHYSICAL_CORRESPONDENCE_REPOSITORY:
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
			case PhysicalcorrespondencePackage.INTERCONNECT_MEASUREMENT_CORRESPONDENCE__PHYSICAL_CORRESPONDENCE_REPOSITORY:
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
			case PhysicalcorrespondencePackage.INTERCONNECT_MEASUREMENT_CORRESPONDENCE__PHYSICAL_CORRESPONDENCE_REPOSITORY:
				return eInternalContainer().eInverseRemove(this, PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__INTERCONNECT_MEASUREMENT_CORRESPONDENCES, PhysicalCorrespondenceRepository.class, msgs);
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
			case PhysicalcorrespondencePackage.INTERCONNECT_MEASUREMENT_CORRESPONDENCE__CACTOS:
				if (resolve) return getCactos();
				return basicGetCactos();
			case PhysicalcorrespondencePackage.INTERCONNECT_MEASUREMENT_CORRESPONDENCE__PHYSICAL_CORRESPONDENCE_REPOSITORY:
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
			case PhysicalcorrespondencePackage.INTERCONNECT_MEASUREMENT_CORRESPONDENCE__CACTOS:
				setCactos((InterconnectMeasurement)newValue);
				return;
			case PhysicalcorrespondencePackage.INTERCONNECT_MEASUREMENT_CORRESPONDENCE__PHYSICAL_CORRESPONDENCE_REPOSITORY:
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
			case PhysicalcorrespondencePackage.INTERCONNECT_MEASUREMENT_CORRESPONDENCE__CACTOS:
				setCactos((InterconnectMeasurement)null);
				return;
			case PhysicalcorrespondencePackage.INTERCONNECT_MEASUREMENT_CORRESPONDENCE__PHYSICAL_CORRESPONDENCE_REPOSITORY:
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
			case PhysicalcorrespondencePackage.INTERCONNECT_MEASUREMENT_CORRESPONDENCE__CACTOS:
				return basicGetCactos() != null;
			case PhysicalcorrespondencePackage.INTERCONNECT_MEASUREMENT_CORRESPONDENCE__PHYSICAL_CORRESPONDENCE_REPOSITORY:
				return getPhysicalCorrespondenceRepository() != null;
		}
		return super.eIsSet(featureID);
	}

} //InterconnectMeasurementCorrespondenceImpl
