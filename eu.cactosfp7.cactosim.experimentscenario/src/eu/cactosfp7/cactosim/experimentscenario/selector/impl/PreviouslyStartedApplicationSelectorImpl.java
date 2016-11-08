/**
 */
package eu.cactosfp7.cactosim.experimentscenario.selector.impl;

import eu.cactosfp7.cactosim.experimentscenario.request.StartApplicationRequest;

import eu.cactosfp7.cactosim.experimentscenario.selector.PreviouslyStartedApplicationSelector;
import eu.cactosfp7.cactosim.experimentscenario.selector.SelectorPackage;

import eu.cactosfp7.infrastructuremodels.logicaldc.application.ApplicationInstance;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Previously Started Application Selector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.cactosim.experimentscenario.selector.impl.PreviouslyStartedApplicationSelectorImpl#getStartApplicationRequest <em>Start Application Request</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PreviouslyStartedApplicationSelectorImpl<instanceTypeParameter extends ApplicationInstance> extends ApplicationInstanceSelectorImpl implements PreviouslyStartedApplicationSelector<instanceTypeParameter> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PreviouslyStartedApplicationSelectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SelectorPackage.Literals.PREVIOUSLY_STARTED_APPLICATION_SELECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StartApplicationRequest getStartApplicationRequest() {
		return (StartApplicationRequest)eDynamicGet(SelectorPackage.PREVIOUSLY_STARTED_APPLICATION_SELECTOR__START_APPLICATION_REQUEST, SelectorPackage.Literals.PREVIOUSLY_STARTED_APPLICATION_SELECTOR__START_APPLICATION_REQUEST, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartApplicationRequest basicGetStartApplicationRequest() {
		return (StartApplicationRequest)eDynamicGet(SelectorPackage.PREVIOUSLY_STARTED_APPLICATION_SELECTOR__START_APPLICATION_REQUEST, SelectorPackage.Literals.PREVIOUSLY_STARTED_APPLICATION_SELECTOR__START_APPLICATION_REQUEST, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartApplicationRequest(StartApplicationRequest newStartApplicationRequest) {
		eDynamicSet(SelectorPackage.PREVIOUSLY_STARTED_APPLICATION_SELECTOR__START_APPLICATION_REQUEST, SelectorPackage.Literals.PREVIOUSLY_STARTED_APPLICATION_SELECTOR__START_APPLICATION_REQUEST, newStartApplicationRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SelectorPackage.PREVIOUSLY_STARTED_APPLICATION_SELECTOR__START_APPLICATION_REQUEST:
				if (resolve) return getStartApplicationRequest();
				return basicGetStartApplicationRequest();
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
			case SelectorPackage.PREVIOUSLY_STARTED_APPLICATION_SELECTOR__START_APPLICATION_REQUEST:
				setStartApplicationRequest((StartApplicationRequest)newValue);
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
			case SelectorPackage.PREVIOUSLY_STARTED_APPLICATION_SELECTOR__START_APPLICATION_REQUEST:
				setStartApplicationRequest((StartApplicationRequest)null);
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
			case SelectorPackage.PREVIOUSLY_STARTED_APPLICATION_SELECTOR__START_APPLICATION_REQUEST:
				return basicGetStartApplicationRequest() != null;
		}
		return super.eIsSet(featureID);
	}

} //PreviouslyStartedApplicationSelectorImpl
