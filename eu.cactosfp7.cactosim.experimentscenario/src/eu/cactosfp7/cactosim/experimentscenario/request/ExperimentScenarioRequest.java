/**
 */
package eu.cactosfp7.cactosim.experimentscenario.request;

import eu.cactosfp7.cactosim.experimentscenario.TimeLineEvent;

import eu.cactosfp7.identifier.Identifier;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Experiment Scenario Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.cactosim.experimentscenario.request.ExperimentScenarioRequest#getTimelineEvent <em>Timeline Event</em>}</li>
 * </ul>
 *
 * @see eu.cactosfp7.cactosim.experimentscenario.request.RequestPackage#getExperimentScenarioRequest()
 * @model abstract="true"
 * @generated
 */
public interface ExperimentScenarioRequest extends EObject, Identifier {
	/**
	 * Returns the value of the '<em><b>Timeline Event</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link eu.cactosfp7.cactosim.experimentscenario.TimeLineEvent#getExperimentScenarioRequest <em>Experiment Scenario Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timeline Event</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timeline Event</em>' container reference.
	 * @see #setTimelineEvent(TimeLineEvent)
	 * @see eu.cactosfp7.cactosim.experimentscenario.request.RequestPackage#getExperimentScenarioRequest_TimelineEvent()
	 * @see eu.cactosfp7.cactosim.experimentscenario.TimeLineEvent#getExperimentScenarioRequest
	 * @model opposite="experimentScenarioRequest" required="true" transient="false" ordered="false"
	 * @generated
	 */
	TimeLineEvent getTimelineEvent();

	/**
	 * Sets the value of the '{@link eu.cactosfp7.cactosim.experimentscenario.request.ExperimentScenarioRequest#getTimelineEvent <em>Timeline Event</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timeline Event</em>' container reference.
	 * @see #getTimelineEvent()
	 * @generated
	 */
	void setTimelineEvent(TimeLineEvent value);

} // ExperimentScenarioRequest
