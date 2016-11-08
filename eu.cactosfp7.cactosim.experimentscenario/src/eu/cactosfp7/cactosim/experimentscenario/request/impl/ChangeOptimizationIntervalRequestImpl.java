/**
 */
package eu.cactosfp7.cactosim.experimentscenario.request.impl;

import eu.cactosfp7.cactosim.experimentscenario.request.ChangeOptimizationIntervalRequest;
import eu.cactosfp7.cactosim.experimentscenario.request.RequestPackage;

import javax.measure.quantity.Duration;

import org.eclipse.emf.ecore.EClass;

import org.jscience.physics.amount.Amount;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Change Optimization Interval Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.cactosim.experimentscenario.request.impl.ChangeOptimizationIntervalRequestImpl#getOptimizationInterval <em>Optimization Interval</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChangeOptimizationIntervalRequestImpl extends ExperimentScenarioRequestImpl implements ChangeOptimizationIntervalRequest {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChangeOptimizationIntervalRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequestPackage.Literals.CHANGE_OPTIMIZATION_INTERVAL_REQUEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Amount<Duration> getOptimizationInterval() {
		return (Amount<Duration>)eDynamicGet(RequestPackage.CHANGE_OPTIMIZATION_INTERVAL_REQUEST__OPTIMIZATION_INTERVAL, RequestPackage.Literals.CHANGE_OPTIMIZATION_INTERVAL_REQUEST__OPTIMIZATION_INTERVAL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOptimizationInterval(Amount<Duration> newOptimizationInterval) {
		eDynamicSet(RequestPackage.CHANGE_OPTIMIZATION_INTERVAL_REQUEST__OPTIMIZATION_INTERVAL, RequestPackage.Literals.CHANGE_OPTIMIZATION_INTERVAL_REQUEST__OPTIMIZATION_INTERVAL, newOptimizationInterval);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RequestPackage.CHANGE_OPTIMIZATION_INTERVAL_REQUEST__OPTIMIZATION_INTERVAL:
				return getOptimizationInterval();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RequestPackage.CHANGE_OPTIMIZATION_INTERVAL_REQUEST__OPTIMIZATION_INTERVAL:
				setOptimizationInterval((Amount<Duration>)newValue);
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
			case RequestPackage.CHANGE_OPTIMIZATION_INTERVAL_REQUEST__OPTIMIZATION_INTERVAL:
				setOptimizationInterval((Amount<Duration>)null);
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
			case RequestPackage.CHANGE_OPTIMIZATION_INTERVAL_REQUEST__OPTIMIZATION_INTERVAL:
				return getOptimizationInterval() != null;
		}
		return super.eIsSet(featureID);
	}

} //ChangeOptimizationIntervalRequestImpl
