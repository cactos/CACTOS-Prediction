/**
 */
package eu.cactosfp7.cactosim.experimentscenario.request;

import eu.cactosfp7.cactosim.experimentscenario.selector.PreviouslySuspendedApplicationSelector;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resume Application Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.cactosim.experimentscenario.request.ResumeApplicationRequest#getPreviouslySuspendedApplicationSelector <em>Previously Suspended Application Selector</em>}</li>
 * </ul>
 *
 * @see eu.cactosfp7.cactosim.experimentscenario.request.RequestPackage#getResumeApplicationRequest()
 * @model
 * @generated
 */
public interface ResumeApplicationRequest extends ExperimentScenarioRequest {
	/**
	 * Returns the value of the '<em><b>Previously Suspended Application Selector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previously Suspended Application Selector</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previously Suspended Application Selector</em>' containment reference.
	 * @see #setPreviouslySuspendedApplicationSelector(PreviouslySuspendedApplicationSelector)
	 * @see eu.cactosfp7.cactosim.experimentscenario.request.RequestPackage#getResumeApplicationRequest_PreviouslySuspendedApplicationSelector()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	PreviouslySuspendedApplicationSelector getPreviouslySuspendedApplicationSelector();

	/**
	 * Sets the value of the '{@link eu.cactosfp7.cactosim.experimentscenario.request.ResumeApplicationRequest#getPreviouslySuspendedApplicationSelector <em>Previously Suspended Application Selector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previously Suspended Application Selector</em>' containment reference.
	 * @see #getPreviouslySuspendedApplicationSelector()
	 * @generated
	 */
	void setPreviouslySuspendedApplicationSelector(PreviouslySuspendedApplicationSelector value);

} // ResumeApplicationRequest
