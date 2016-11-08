/**
 */
package eu.cactosfp7.cactosim.experimentscenario.request.impl;

import eu.cactosfp7.cactosim.experimentscenario.request.RequestPackage;
import eu.cactosfp7.cactosim.experimentscenario.request.ResumeApplicationRequest;

import eu.cactosfp7.cactosim.experimentscenario.selector.PreviouslySuspendedApplicationSelector;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resume Application Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.cactosim.experimentscenario.request.impl.ResumeApplicationRequestImpl#getPreviouslySuspendedApplicationSelector <em>Previously Suspended Application Selector</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResumeApplicationRequestImpl extends ExperimentScenarioRequestImpl implements ResumeApplicationRequest {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResumeApplicationRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequestPackage.Literals.RESUME_APPLICATION_REQUEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PreviouslySuspendedApplicationSelector getPreviouslySuspendedApplicationSelector() {
		return (PreviouslySuspendedApplicationSelector)eDynamicGet(RequestPackage.RESUME_APPLICATION_REQUEST__PREVIOUSLY_SUSPENDED_APPLICATION_SELECTOR, RequestPackage.Literals.RESUME_APPLICATION_REQUEST__PREVIOUSLY_SUSPENDED_APPLICATION_SELECTOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreviouslySuspendedApplicationSelector(PreviouslySuspendedApplicationSelector newPreviouslySuspendedApplicationSelector, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newPreviouslySuspendedApplicationSelector, RequestPackage.RESUME_APPLICATION_REQUEST__PREVIOUSLY_SUSPENDED_APPLICATION_SELECTOR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPreviouslySuspendedApplicationSelector(PreviouslySuspendedApplicationSelector newPreviouslySuspendedApplicationSelector) {
		eDynamicSet(RequestPackage.RESUME_APPLICATION_REQUEST__PREVIOUSLY_SUSPENDED_APPLICATION_SELECTOR, RequestPackage.Literals.RESUME_APPLICATION_REQUEST__PREVIOUSLY_SUSPENDED_APPLICATION_SELECTOR, newPreviouslySuspendedApplicationSelector);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RequestPackage.RESUME_APPLICATION_REQUEST__PREVIOUSLY_SUSPENDED_APPLICATION_SELECTOR:
				return basicSetPreviouslySuspendedApplicationSelector(null, msgs);
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
			case RequestPackage.RESUME_APPLICATION_REQUEST__PREVIOUSLY_SUSPENDED_APPLICATION_SELECTOR:
				return getPreviouslySuspendedApplicationSelector();
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
			case RequestPackage.RESUME_APPLICATION_REQUEST__PREVIOUSLY_SUSPENDED_APPLICATION_SELECTOR:
				setPreviouslySuspendedApplicationSelector((PreviouslySuspendedApplicationSelector)newValue);
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
			case RequestPackage.RESUME_APPLICATION_REQUEST__PREVIOUSLY_SUSPENDED_APPLICATION_SELECTOR:
				setPreviouslySuspendedApplicationSelector((PreviouslySuspendedApplicationSelector)null);
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
			case RequestPackage.RESUME_APPLICATION_REQUEST__PREVIOUSLY_SUSPENDED_APPLICATION_SELECTOR:
				return getPreviouslySuspendedApplicationSelector() != null;
		}
		return super.eIsSet(featureID);
	}

} //ResumeApplicationRequestImpl
