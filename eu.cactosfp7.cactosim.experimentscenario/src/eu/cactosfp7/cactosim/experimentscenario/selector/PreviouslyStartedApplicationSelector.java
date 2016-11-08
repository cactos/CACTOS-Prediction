/**
 */
package eu.cactosfp7.cactosim.experimentscenario.selector;

import eu.cactosfp7.cactosim.experimentscenario.request.StartApplicationRequest;

import eu.cactosfp7.infrastructuremodels.logicaldc.application.ApplicationInstance;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Previously Started Application Selector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.cactosim.experimentscenario.selector.PreviouslyStartedApplicationSelector#getStartApplicationRequest <em>Start Application Request</em>}</li>
 * </ul>
 *
 * @see eu.cactosfp7.cactosim.experimentscenario.selector.SelectorPackage#getPreviouslyStartedApplicationSelector()
 * @model abstract="true"
 * @generated
 */
public interface PreviouslyStartedApplicationSelector<instanceTypeParameter extends ApplicationInstance> extends ApplicationInstanceSelector {
	/**
	 * Returns the value of the '<em><b>Start Application Request</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Application Request</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Application Request</em>' reference.
	 * @see #setStartApplicationRequest(StartApplicationRequest)
	 * @see eu.cactosfp7.cactosim.experimentscenario.selector.SelectorPackage#getPreviouslyStartedApplicationSelector_StartApplicationRequest()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	StartApplicationRequest getStartApplicationRequest();

	/**
	 * Sets the value of the '{@link eu.cactosfp7.cactosim.experimentscenario.selector.PreviouslyStartedApplicationSelector#getStartApplicationRequest <em>Start Application Request</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Application Request</em>' reference.
	 * @see #getStartApplicationRequest()
	 * @generated
	 */
	void setStartApplicationRequest(StartApplicationRequest value);

} // PreviouslyStartedApplicationSelector
