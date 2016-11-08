/**
 */
package eu.cactosfp7.cactosim.experimentscenario.selector;

import eu.cactosfp7.cactosim.experimentscenario.request.SuspendApplicationRequest;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Previously Suspended Application Selector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.cactosim.experimentscenario.selector.PreviouslySuspendedApplicationSelector#getSuspendRequest <em>Suspend Request</em>}</li>
 * </ul>
 *
 * @see eu.cactosfp7.cactosim.experimentscenario.selector.SelectorPackage#getPreviouslySuspendedApplicationSelector()
 * @model
 * @generated
 */
public interface PreviouslySuspendedApplicationSelector extends EObject {
	/**
	 * Returns the value of the '<em><b>Suspend Request</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Suspend Request</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suspend Request</em>' reference.
	 * @see #setSuspendRequest(SuspendApplicationRequest)
	 * @see eu.cactosfp7.cactosim.experimentscenario.selector.SelectorPackage#getPreviouslySuspendedApplicationSelector_SuspendRequest()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	SuspendApplicationRequest getSuspendRequest();

	/**
	 * Sets the value of the '{@link eu.cactosfp7.cactosim.experimentscenario.selector.PreviouslySuspendedApplicationSelector#getSuspendRequest <em>Suspend Request</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Suspend Request</em>' reference.
	 * @see #getSuspendRequest()
	 * @generated
	 */
	void setSuspendRequest(SuspendApplicationRequest value);

} // PreviouslySuspendedApplicationSelector
