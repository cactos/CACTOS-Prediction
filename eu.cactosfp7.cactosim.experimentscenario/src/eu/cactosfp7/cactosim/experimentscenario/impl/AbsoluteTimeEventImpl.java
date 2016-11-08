/**
 */
package eu.cactosfp7.cactosim.experimentscenario.impl;

import eu.cactosfp7.cactosim.experimentscenario.AbsoluteTimeEvent;
import eu.cactosfp7.cactosim.experimentscenario.ExperimentscenarioPackage;

import javax.measure.quantity.Duration;

import org.eclipse.emf.ecore.EClass;

import org.jscience.physics.amount.Amount;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Absolute Time Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.cactosim.experimentscenario.impl.AbsoluteTimeEventImpl#getSimulationTime <em>Simulation Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AbsoluteTimeEventImpl extends TimeLineEventImpl implements AbsoluteTimeEvent {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbsoluteTimeEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExperimentscenarioPackage.Literals.ABSOLUTE_TIME_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Amount<Duration> getSimulationTime() {
		return (Amount<Duration>)eDynamicGet(ExperimentscenarioPackage.ABSOLUTE_TIME_EVENT__SIMULATION_TIME, ExperimentscenarioPackage.Literals.ABSOLUTE_TIME_EVENT__SIMULATION_TIME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSimulationTime(Amount<Duration> newSimulationTime) {
		eDynamicSet(ExperimentscenarioPackage.ABSOLUTE_TIME_EVENT__SIMULATION_TIME, ExperimentscenarioPackage.Literals.ABSOLUTE_TIME_EVENT__SIMULATION_TIME, newSimulationTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExperimentscenarioPackage.ABSOLUTE_TIME_EVENT__SIMULATION_TIME:
				return getSimulationTime();
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
			case ExperimentscenarioPackage.ABSOLUTE_TIME_EVENT__SIMULATION_TIME:
				setSimulationTime((Amount<Duration>)newValue);
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
			case ExperimentscenarioPackage.ABSOLUTE_TIME_EVENT__SIMULATION_TIME:
				setSimulationTime((Amount<Duration>)null);
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
			case ExperimentscenarioPackage.ABSOLUTE_TIME_EVENT__SIMULATION_TIME:
				return getSimulationTime() != null;
		}
		return super.eIsSet(featureID);
	}

} //AbsoluteTimeEventImpl
