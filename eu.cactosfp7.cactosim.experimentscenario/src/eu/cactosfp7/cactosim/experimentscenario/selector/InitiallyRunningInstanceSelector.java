/**
 */
package eu.cactosfp7.cactosim.experimentscenario.selector;

import eu.cactosfp7.infrastructuremodels.logicaldc.application.ApplicationInstance;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Initially Running Instance Selector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.cactosim.experimentscenario.selector.InitiallyRunningInstanceSelector#getApplicationInstance <em>Application Instance</em>}</li>
 * </ul>
 *
 * @see eu.cactosfp7.cactosim.experimentscenario.selector.SelectorPackage#getInitiallyRunningInstanceSelector()
 * @model abstract="true"
 * @generated
 */
public interface InitiallyRunningInstanceSelector<instanceTypeParameter extends ApplicationInstance> extends ApplicationInstanceSelector {
	/**
	 * Returns the value of the '<em><b>Application Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application Instance</em>' reference.
	 * @see #setApplicationInstance(ApplicationInstance)
	 * @see eu.cactosfp7.cactosim.experimentscenario.selector.SelectorPackage#getInitiallyRunningInstanceSelector_ApplicationInstance()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	instanceTypeParameter getApplicationInstance();

	/**
	 * Sets the value of the '{@link eu.cactosfp7.cactosim.experimentscenario.selector.InitiallyRunningInstanceSelector#getApplicationInstance <em>Application Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application Instance</em>' reference.
	 * @see #getApplicationInstance()
	 * @generated
	 */
	void setApplicationInstance(instanceTypeParameter value);

} // InitiallyRunningInstanceSelector
