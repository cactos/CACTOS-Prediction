/**
 */
package eu.cactosfp7.cactosim.experimentscenario.request;

import eu.cactosfp7.infrastructuremodels.physicaldc.core.AbstractNode;
import eu.cactosfp7.infrastructuremodels.physicaldc.core.NodeState;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Physical Node State Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.cactosim.experimentscenario.request.SetPhysicalNodeStateRequest#getTargetNode <em>Target Node</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.experimentscenario.request.SetPhysicalNodeStateRequest#getTargetState <em>Target State</em>}</li>
 * </ul>
 *
 * @see eu.cactosfp7.cactosim.experimentscenario.request.RequestPackage#getSetPhysicalNodeStateRequest()
 * @model
 * @generated
 */
public interface SetPhysicalNodeStateRequest extends ExperimentScenarioRequest {
	/**
	 * Returns the value of the '<em><b>Target Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Node</em>' reference.
	 * @see #setTargetNode(AbstractNode)
	 * @see eu.cactosfp7.cactosim.experimentscenario.request.RequestPackage#getSetPhysicalNodeStateRequest_TargetNode()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	AbstractNode getTargetNode();

	/**
	 * Sets the value of the '{@link eu.cactosfp7.cactosim.experimentscenario.request.SetPhysicalNodeStateRequest#getTargetNode <em>Target Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Node</em>' reference.
	 * @see #getTargetNode()
	 * @generated
	 */
	void setTargetNode(AbstractNode value);

	/**
	 * Returns the value of the '<em><b>Target State</b></em>' attribute.
	 * The literals are from the enumeration {@link eu.cactosfp7.infrastructuremodels.physicaldc.core.NodeState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target State</em>' attribute.
	 * @see eu.cactosfp7.infrastructuremodels.physicaldc.core.NodeState
	 * @see #setTargetState(NodeState)
	 * @see eu.cactosfp7.cactosim.experimentscenario.request.RequestPackage#getSetPhysicalNodeStateRequest_TargetState()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	NodeState getTargetState();

	/**
	 * Sets the value of the '{@link eu.cactosfp7.cactosim.experimentscenario.request.SetPhysicalNodeStateRequest#getTargetState <em>Target State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target State</em>' attribute.
	 * @see eu.cactosfp7.infrastructuremodels.physicaldc.core.NodeState
	 * @see #getTargetState()
	 * @generated
	 */
	void setTargetState(NodeState value);

} // SetPhysicalNodeStateRequest
