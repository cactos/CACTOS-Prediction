/**
 */
package eu.cactosfp7.cactosim.experimentscenario.selector.impl;

import eu.cactosfp7.cactosim.experimentscenario.request.SuspendApplicationRequest;

import eu.cactosfp7.cactosim.experimentscenario.selector.PreviouslySuspendedApplicationSelector;
import eu.cactosfp7.cactosim.experimentscenario.selector.SelectorPackage;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Previously Suspended Application Selector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.cactosim.experimentscenario.selector.impl.PreviouslySuspendedApplicationSelectorImpl#getSuspendRequest <em>Suspend Request</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PreviouslySuspendedApplicationSelectorImpl extends MinimalEObjectImpl.Container implements PreviouslySuspendedApplicationSelector {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PreviouslySuspendedApplicationSelectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SelectorPackage.Literals.PREVIOUSLY_SUSPENDED_APPLICATION_SELECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SuspendApplicationRequest getSuspendRequest() {
		return (SuspendApplicationRequest)eDynamicGet(SelectorPackage.PREVIOUSLY_SUSPENDED_APPLICATION_SELECTOR__SUSPEND_REQUEST, SelectorPackage.Literals.PREVIOUSLY_SUSPENDED_APPLICATION_SELECTOR__SUSPEND_REQUEST, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuspendApplicationRequest basicGetSuspendRequest() {
		return (SuspendApplicationRequest)eDynamicGet(SelectorPackage.PREVIOUSLY_SUSPENDED_APPLICATION_SELECTOR__SUSPEND_REQUEST, SelectorPackage.Literals.PREVIOUSLY_SUSPENDED_APPLICATION_SELECTOR__SUSPEND_REQUEST, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSuspendRequest(SuspendApplicationRequest newSuspendRequest) {
		eDynamicSet(SelectorPackage.PREVIOUSLY_SUSPENDED_APPLICATION_SELECTOR__SUSPEND_REQUEST, SelectorPackage.Literals.PREVIOUSLY_SUSPENDED_APPLICATION_SELECTOR__SUSPEND_REQUEST, newSuspendRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SelectorPackage.PREVIOUSLY_SUSPENDED_APPLICATION_SELECTOR__SUSPEND_REQUEST:
				if (resolve) return getSuspendRequest();
				return basicGetSuspendRequest();
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
			case SelectorPackage.PREVIOUSLY_SUSPENDED_APPLICATION_SELECTOR__SUSPEND_REQUEST:
				setSuspendRequest((SuspendApplicationRequest)newValue);
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
			case SelectorPackage.PREVIOUSLY_SUSPENDED_APPLICATION_SELECTOR__SUSPEND_REQUEST:
				setSuspendRequest((SuspendApplicationRequest)null);
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
			case SelectorPackage.PREVIOUSLY_SUSPENDED_APPLICATION_SELECTOR__SUSPEND_REQUEST:
				return basicGetSuspendRequest() != null;
		}
		return super.eIsSet(featureID);
	}

} //PreviouslySuspendedApplicationSelectorImpl
