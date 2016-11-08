/**
 */
package eu.cactosfp7.cactosim.experimentscenario.request;

import eu.cactosfp7.cactosim.experimentscenario.selector.ApplicationInstanceSelector;

import eu.cactosfp7.infrastructuremodels.physicaldc.core.ComputeNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Migrate Application Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.cactosim.experimentscenario.request.MigrateApplicationRequest#getTargetPhysicalNode <em>Target Physical Node</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.experimentscenario.request.MigrateApplicationRequest#getApplicationInstanceSelector <em>Application Instance Selector</em>}</li>
 * </ul>
 *
 * @see eu.cactosfp7.cactosim.experimentscenario.request.RequestPackage#getMigrateApplicationRequest()
 * @model
 * @generated
 */
public interface MigrateApplicationRequest extends ExperimentScenarioRequest {
	/**
	 * Returns the value of the '<em><b>Target Physical Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Physical Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Physical Node</em>' reference.
	 * @see #setTargetPhysicalNode(ComputeNode)
	 * @see eu.cactosfp7.cactosim.experimentscenario.request.RequestPackage#getMigrateApplicationRequest_TargetPhysicalNode()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ComputeNode getTargetPhysicalNode();

	/**
	 * Sets the value of the '{@link eu.cactosfp7.cactosim.experimentscenario.request.MigrateApplicationRequest#getTargetPhysicalNode <em>Target Physical Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Physical Node</em>' reference.
	 * @see #getTargetPhysicalNode()
	 * @generated
	 */
	void setTargetPhysicalNode(ComputeNode value);

	/**
	 * Returns the value of the '<em><b>Application Instance Selector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application Instance Selector</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application Instance Selector</em>' containment reference.
	 * @see #setApplicationInstanceSelector(ApplicationInstanceSelector)
	 * @see eu.cactosfp7.cactosim.experimentscenario.request.RequestPackage#getMigrateApplicationRequest_ApplicationInstanceSelector()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	ApplicationInstanceSelector getApplicationInstanceSelector();

	/**
	 * Sets the value of the '{@link eu.cactosfp7.cactosim.experimentscenario.request.MigrateApplicationRequest#getApplicationInstanceSelector <em>Application Instance Selector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application Instance Selector</em>' containment reference.
	 * @see #getApplicationInstanceSelector()
	 * @generated
	 */
	void setApplicationInstanceSelector(ApplicationInstanceSelector value);

} // MigrateApplicationRequest
