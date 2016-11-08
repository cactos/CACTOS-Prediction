/**
 */
package eu.cactosfp7.cactosim.experimentscenario.request;

import eu.cactosfp7.cactosim.experimentscenario.selector.ApplicationInstanceSelector;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Terminate Application Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.cactosim.experimentscenario.request.TerminateApplicationRequest#getRunningApplicationSelector <em>Running Application Selector</em>}</li>
 * </ul>
 *
 * @see eu.cactosfp7.cactosim.experimentscenario.request.RequestPackage#getTerminateApplicationRequest()
 * @model
 * @generated
 */
public interface TerminateApplicationRequest extends ExperimentScenarioRequest {
	/**
	 * Returns the value of the '<em><b>Running Application Selector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Running Application Selector</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Running Application Selector</em>' containment reference.
	 * @see #setRunningApplicationSelector(ApplicationInstanceSelector)
	 * @see eu.cactosfp7.cactosim.experimentscenario.request.RequestPackage#getTerminateApplicationRequest_RunningApplicationSelector()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	ApplicationInstanceSelector getRunningApplicationSelector();

	/**
	 * Sets the value of the '{@link eu.cactosfp7.cactosim.experimentscenario.request.TerminateApplicationRequest#getRunningApplicationSelector <em>Running Application Selector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Running Application Selector</em>' containment reference.
	 * @see #getRunningApplicationSelector()
	 * @generated
	 */
	void setRunningApplicationSelector(ApplicationInstanceSelector value);

} // TerminateApplicationRequest
