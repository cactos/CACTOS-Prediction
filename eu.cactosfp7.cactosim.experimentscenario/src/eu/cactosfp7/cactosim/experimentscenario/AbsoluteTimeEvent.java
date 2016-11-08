/**
 */
package eu.cactosfp7.cactosim.experimentscenario;

import javax.measure.quantity.Duration;

import org.jscience.physics.amount.Amount;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Absolute Time Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.cactosim.experimentscenario.AbsoluteTimeEvent#getSimulationTime <em>Simulation Time</em>}</li>
 * </ul>
 *
 * @see eu.cactosfp7.cactosim.experimentscenario.ExperimentscenarioPackage#getAbsoluteTimeEvent()
 * @model
 * @generated
 */
public interface AbsoluteTimeEvent extends TimeLineEvent {
	/**
	 * Returns the value of the '<em><b>Simulation Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simulation Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simulation Time</em>' attribute.
	 * @see #setSimulationTime(Amount)
	 * @see eu.cactosfp7.cactosim.experimentscenario.ExperimentscenarioPackage#getAbsoluteTimeEvent_SimulationTime()
	 * @model dataType="eu.cactosfp7.infrastructuremodels.physicaldc.util.Amount<eu.cactosfp7.infrastructuremodels.physicaldc.util.Duration>" required="true" ordered="false"
	 * @generated
	 */
	Amount<Duration> getSimulationTime();

	/**
	 * Sets the value of the '{@link eu.cactosfp7.cactosim.experimentscenario.AbsoluteTimeEvent#getSimulationTime <em>Simulation Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simulation Time</em>' attribute.
	 * @see #getSimulationTime()
	 * @generated
	 */
	void setSimulationTime(Amount<Duration> value);

} // AbsoluteTimeEvent
