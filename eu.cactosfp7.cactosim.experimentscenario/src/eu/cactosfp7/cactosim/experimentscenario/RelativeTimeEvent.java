/**
 */
package eu.cactosfp7.cactosim.experimentscenario;

import javax.measure.quantity.Duration;

import org.jscience.physics.amount.Amount;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relative Time Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.cactosim.experimentscenario.RelativeTimeEvent#getIntervalSinceEvent <em>Interval Since Event</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.experimentscenario.RelativeTimeEvent#getReferenceEvent <em>Reference Event</em>}</li>
 * </ul>
 *
 * @see eu.cactosfp7.cactosim.experimentscenario.ExperimentscenarioPackage#getRelativeTimeEvent()
 * @model
 * @generated
 */
public interface RelativeTimeEvent extends TimeLineEvent {
	/**
	 * Returns the value of the '<em><b>Interval Since Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interval Since Event</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interval Since Event</em>' attribute.
	 * @see #setIntervalSinceEvent(Amount)
	 * @see eu.cactosfp7.cactosim.experimentscenario.ExperimentscenarioPackage#getRelativeTimeEvent_IntervalSinceEvent()
	 * @model dataType="eu.cactosfp7.infrastructuremodels.physicaldc.util.Amount<eu.cactosfp7.infrastructuremodels.physicaldc.util.Duration>" required="true" ordered="false"
	 * @generated
	 */
	Amount<Duration> getIntervalSinceEvent();

	/**
	 * Sets the value of the '{@link eu.cactosfp7.cactosim.experimentscenario.RelativeTimeEvent#getIntervalSinceEvent <em>Interval Since Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interval Since Event</em>' attribute.
	 * @see #getIntervalSinceEvent()
	 * @generated
	 */
	void setIntervalSinceEvent(Amount<Duration> value);

	/**
	 * Returns the value of the '<em><b>Reference Event</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link eu.cactosfp7.cactosim.experimentscenario.TimeLineEvent#getRelativeTimeEvents <em>Relative Time Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Event</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Event</em>' reference.
	 * @see #setReferenceEvent(TimeLineEvent)
	 * @see eu.cactosfp7.cactosim.experimentscenario.ExperimentscenarioPackage#getRelativeTimeEvent_ReferenceEvent()
	 * @see eu.cactosfp7.cactosim.experimentscenario.TimeLineEvent#getRelativeTimeEvents
	 * @model opposite="relativeTimeEvents" required="true" ordered="false"
	 * @generated
	 */
	TimeLineEvent getReferenceEvent();

	/**
	 * Sets the value of the '{@link eu.cactosfp7.cactosim.experimentscenario.RelativeTimeEvent#getReferenceEvent <em>Reference Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Event</em>' reference.
	 * @see #getReferenceEvent()
	 * @generated
	 */
	void setReferenceEvent(TimeLineEvent value);

} // RelativeTimeEvent
