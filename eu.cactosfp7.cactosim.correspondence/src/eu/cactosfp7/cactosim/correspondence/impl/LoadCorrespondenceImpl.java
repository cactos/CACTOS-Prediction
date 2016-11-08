/**
 */
package eu.cactosfp7.cactosim.correspondence.impl;

import eu.cactosfp7.cactosim.correspondence.CorrespondencePackage;
import eu.cactosfp7.cactosim.correspondence.LoadCorrespondence;

import eu.cactosfp7.identifier.impl.IdentifierImpl;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.runtimemeasurement.RuntimeMeasurement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Load Correspondence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.impl.LoadCorrespondenceImpl#getPalladio <em>Palladio</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class LoadCorrespondenceImpl extends IdentifierImpl implements LoadCorrespondence {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoadCorrespondenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorrespondencePackage.Literals.LOAD_CORRESPONDENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeMeasurement getPalladio() {
		return (RuntimeMeasurement)eDynamicGet(CorrespondencePackage.LOAD_CORRESPONDENCE__PALLADIO, CorrespondencePackage.Literals.LOAD_CORRESPONDENCE__PALLADIO, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeMeasurement basicGetPalladio() {
		return (RuntimeMeasurement)eDynamicGet(CorrespondencePackage.LOAD_CORRESPONDENCE__PALLADIO, CorrespondencePackage.Literals.LOAD_CORRESPONDENCE__PALLADIO, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPalladio(RuntimeMeasurement newPalladio) {
		eDynamicSet(CorrespondencePackage.LOAD_CORRESPONDENCE__PALLADIO, CorrespondencePackage.Literals.LOAD_CORRESPONDENCE__PALLADIO, newPalladio);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorrespondencePackage.LOAD_CORRESPONDENCE__PALLADIO:
				if (resolve) return getPalladio();
				return basicGetPalladio();
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
			case CorrespondencePackage.LOAD_CORRESPONDENCE__PALLADIO:
				setPalladio((RuntimeMeasurement)newValue);
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
			case CorrespondencePackage.LOAD_CORRESPONDENCE__PALLADIO:
				setPalladio((RuntimeMeasurement)null);
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
			case CorrespondencePackage.LOAD_CORRESPONDENCE__PALLADIO:
				return basicGetPalladio() != null;
		}
		return super.eIsSet(featureID);
	}

} //LoadCorrespondenceImpl
