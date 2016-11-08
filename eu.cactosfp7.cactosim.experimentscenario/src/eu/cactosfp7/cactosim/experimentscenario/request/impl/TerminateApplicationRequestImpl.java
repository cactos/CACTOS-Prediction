/**
 */
package eu.cactosfp7.cactosim.experimentscenario.request.impl;

import eu.cactosfp7.cactosim.experimentscenario.request.RequestPackage;
import eu.cactosfp7.cactosim.experimentscenario.request.TerminateApplicationRequest;

import eu.cactosfp7.cactosim.experimentscenario.selector.ApplicationInstanceSelector;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Terminate Application Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.cactosim.experimentscenario.request.impl.TerminateApplicationRequestImpl#getRunningApplicationSelector <em>Running Application Selector</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TerminateApplicationRequestImpl extends ExperimentScenarioRequestImpl implements TerminateApplicationRequest {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TerminateApplicationRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequestPackage.Literals.TERMINATE_APPLICATION_REQUEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ApplicationInstanceSelector getRunningApplicationSelector() {
		return (ApplicationInstanceSelector)eDynamicGet(RequestPackage.TERMINATE_APPLICATION_REQUEST__RUNNING_APPLICATION_SELECTOR, RequestPackage.Literals.TERMINATE_APPLICATION_REQUEST__RUNNING_APPLICATION_SELECTOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRunningApplicationSelector(ApplicationInstanceSelector newRunningApplicationSelector, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newRunningApplicationSelector, RequestPackage.TERMINATE_APPLICATION_REQUEST__RUNNING_APPLICATION_SELECTOR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRunningApplicationSelector(ApplicationInstanceSelector newRunningApplicationSelector) {
		eDynamicSet(RequestPackage.TERMINATE_APPLICATION_REQUEST__RUNNING_APPLICATION_SELECTOR, RequestPackage.Literals.TERMINATE_APPLICATION_REQUEST__RUNNING_APPLICATION_SELECTOR, newRunningApplicationSelector);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RequestPackage.TERMINATE_APPLICATION_REQUEST__RUNNING_APPLICATION_SELECTOR:
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
			case RequestPackage.TERMINATE_APPLICATION_REQUEST__RUNNING_APPLICATION_SELECTOR:
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
			case RequestPackage.TERMINATE_APPLICATION_REQUEST__RUNNING_APPLICATION_SELECTOR:
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
			case RequestPackage.TERMINATE_APPLICATION_REQUEST__RUNNING_APPLICATION_SELECTOR:
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
			case RequestPackage.TERMINATE_APPLICATION_REQUEST__RUNNING_APPLICATION_SELECTOR:
				return getRunningApplicationSelector() != null;
		}
		return super.eIsSet(featureID);
	}

} //TerminateApplicationRequestImpl
