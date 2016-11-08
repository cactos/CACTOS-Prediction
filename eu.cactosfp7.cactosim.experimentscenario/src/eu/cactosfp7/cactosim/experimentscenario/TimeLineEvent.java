/**
 */
package eu.cactosfp7.cactosim.experimentscenario;

import eu.cactosfp7.cactosim.experimentscenario.request.ExperimentScenarioRequest;

import eu.cactosfp7.identifier.Identifier;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Line Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.cactosim.experimentscenario.TimeLineEvent#getExperimentScenarioRequest <em>Experiment Scenario Request</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.experimentscenario.TimeLineEvent#getEventStatus <em>Event Status</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.experimentscenario.TimeLineEvent#getExperimentScenarioTimeline <em>Experiment Scenario Timeline</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.experimentscenario.TimeLineEvent#getRelativeTimeEvents <em>Relative Time Events</em>}</li>
 * </ul>
 *
 * @see eu.cactosfp7.cactosim.experimentscenario.ExperimentscenarioPackage#getTimeLineEvent()
 * @model abstract="true"
 * @generated
 */
public interface TimeLineEvent extends EObject, Identifier {
	/**
	 * Returns the value of the '<em><b>Experiment Scenario Request</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link eu.cactosfp7.cactosim.experimentscenario.request.ExperimentScenarioRequest#getTimelineEvent <em>Timeline Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Experiment Scenario Request</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Experiment Scenario Request</em>' containment reference.
	 * @see #setExperimentScenarioRequest(ExperimentScenarioRequest)
	 * @see eu.cactosfp7.cactosim.experimentscenario.ExperimentscenarioPackage#getTimeLineEvent_ExperimentScenarioRequest()
	 * @see eu.cactosfp7.cactosim.experimentscenario.request.ExperimentScenarioRequest#getTimelineEvent
	 * @model opposite="timelineEvent" containment="true" required="true" ordered="false"
	 * @generated
	 */
	ExperimentScenarioRequest getExperimentScenarioRequest();

	/**
	 * Sets the value of the '{@link eu.cactosfp7.cactosim.experimentscenario.TimeLineEvent#getExperimentScenarioRequest <em>Experiment Scenario Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Experiment Scenario Request</em>' containment reference.
	 * @see #getExperimentScenarioRequest()
	 * @generated
	 */
	void setExperimentScenarioRequest(ExperimentScenarioRequest value);

	/**
	 * Returns the value of the '<em><b>Event Status</b></em>' attribute.
	 * The default value is <code>"PENDING"</code>.
	 * The literals are from the enumeration {@link eu.cactosfp7.cactosim.experimentscenario.EventStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Status</em>' attribute.
	 * @see eu.cactosfp7.cactosim.experimentscenario.EventStatus
	 * @see #setEventStatus(EventStatus)
	 * @see eu.cactosfp7.cactosim.experimentscenario.ExperimentscenarioPackage#getTimeLineEvent_EventStatus()
	 * @model default="PENDING" required="true" ordered="false"
	 * @generated
	 */
	EventStatus getEventStatus();

	/**
	 * Sets the value of the '{@link eu.cactosfp7.cactosim.experimentscenario.TimeLineEvent#getEventStatus <em>Event Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Status</em>' attribute.
	 * @see eu.cactosfp7.cactosim.experimentscenario.EventStatus
	 * @see #getEventStatus()
	 * @generated
	 */
	void setEventStatus(EventStatus value);

	/**
	 * Returns the value of the '<em><b>Experiment Scenario Timeline</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link eu.cactosfp7.cactosim.experimentscenario.ExperimentScenarioTimeLine#getTimeLineEvents <em>Time Line Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Experiment Scenario Timeline</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Experiment Scenario Timeline</em>' container reference.
	 * @see #setExperimentScenarioTimeline(ExperimentScenarioTimeLine)
	 * @see eu.cactosfp7.cactosim.experimentscenario.ExperimentscenarioPackage#getTimeLineEvent_ExperimentScenarioTimeline()
	 * @see eu.cactosfp7.cactosim.experimentscenario.ExperimentScenarioTimeLine#getTimeLineEvents
	 * @model opposite="timeLineEvents" required="true" transient="false" ordered="false"
	 * @generated
	 */
	ExperimentScenarioTimeLine getExperimentScenarioTimeline();

	/**
	 * Sets the value of the '{@link eu.cactosfp7.cactosim.experimentscenario.TimeLineEvent#getExperimentScenarioTimeline <em>Experiment Scenario Timeline</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Experiment Scenario Timeline</em>' container reference.
	 * @see #getExperimentScenarioTimeline()
	 * @generated
	 */
	void setExperimentScenarioTimeline(ExperimentScenarioTimeLine value);

	/**
	 * Returns the value of the '<em><b>Relative Time Events</b></em>' reference list.
	 * The list contents are of type {@link eu.cactosfp7.cactosim.experimentscenario.RelativeTimeEvent}.
	 * It is bidirectional and its opposite is '{@link eu.cactosfp7.cactosim.experimentscenario.RelativeTimeEvent#getReferenceEvent <em>Reference Event</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Relative Time Events</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Relative Time Events</em>' reference list.
	 * @see eu.cactosfp7.cactosim.experimentscenario.ExperimentscenarioPackage#getTimeLineEvent_RelativeTimeEvents()
	 * @see eu.cactosfp7.cactosim.experimentscenario.RelativeTimeEvent#getReferenceEvent
	 * @model opposite="referenceEvent" ordered="false"
	 * @generated
	 */
    EList<RelativeTimeEvent> getRelativeTimeEvents();

} // TimeLineEvent
