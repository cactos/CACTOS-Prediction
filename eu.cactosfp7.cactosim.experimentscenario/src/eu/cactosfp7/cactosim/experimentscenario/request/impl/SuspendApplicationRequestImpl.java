/**
 */
package eu.cactosfp7.cactosim.experimentscenario.request.impl;

import eu.cactosfp7.cactosim.experimentscenario.request.RequestPackage;
import eu.cactosfp7.cactosim.experimentscenario.request.SuspendApplicationRequest;

import eu.cactosfp7.cactosim.experimentscenario.selector.ApplicationInstanceSelector;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Suspend Application Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.cactosim.experimentscenario.request.impl.SuspendApplicationRequestImpl#getRunningApplicationSelector <em>Running Application Selector</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SuspendApplicationRequestImpl extends ExperimentScenarioRequestImpl implements SuspendApplicationRequest {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SuspendApplicationRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequestPackage.Literals.SUSPEND_APPLICATION_REQUEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ApplicationInstanceSelector getRunningApplicationSelector() {
		return (ApplicationInstanceSelector)eDynamicGet(RequestPackage.SUSPEND_APPLICATION_REQUEST__RUNNING_APPLICATION_SELECTOR, RequestPackage.Literals.SUSPEND_APPLICATION_REQUEST__RUNNING_APPLICATION_SELECTOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRunningApplicationSelector(ApplicationInstanceSelector newRunningApplicationSelector, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newRunningApplicationSelector, RequestPackage.SUSPEND_APPLICATION_REQUEST__RUNNING_APPLICATION_SELECTOR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRunningApplicationSelector(ApplicationInstanceSelector newRunningApplicationSelector) {
		eDynamicSet(RequestPackage.SUSPEND_APPLICATION_REQUEST__RUNNING_APPLICATION_SELECTOR, RequestPackage.Literals.SUSPEND_APPLICATION_REQUEST__RUNNING_APPLICATION_SELECTOR, newRunningApplicationSelector);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RequestPackage.SUSPEND_APPLICATION_REQUEST__RUNNING_APPLICATION_SELECTOR:
				return basicSetRunningApplicationSelector(null, msgs);
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
			case RequestPackage.SUSPEND_APPLICATION_REQUEST__RUNNING_APPLICATION_SELECTOR:
				return getRunningApplicationSelector();
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
			case RequestPackage.SUSPEND_APPLICATION_REQUEST__RUNNING_APPLICATION_SELECTOR:
				setRunningApplicationSelector((ApplicationInstanceSelector)newValue);
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
			case RequestPackage.SUSPEND_APPLICATION_REQUEST__RUNNING_APPLICATION_SELECTOR:
				setRunningApplicationSelector((ApplicationInstanceSelector)null);
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
			case RequestPackage.SUSPEND_APPLICATION_REQUEST__RUNNING_APPLICATION_SELECTOR:
				return getRunningApplicationSelector() != null;
		}
		return super.eIsSet(featureID);
	}

} //SuspendApplicationRequestImpl
