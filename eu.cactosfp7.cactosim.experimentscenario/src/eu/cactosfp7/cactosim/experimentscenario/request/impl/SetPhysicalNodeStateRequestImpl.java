/**
 */
package eu.cactosfp7.cactosim.experimentscenario.request.impl;

import eu.cactosfp7.cactosim.experimentscenario.request.RequestPackage;
import eu.cactosfp7.cactosim.experimentscenario.request.SetPhysicalNodeStateRequest;

import eu.cactosfp7.infrastructuremodels.physicaldc.core.AbstractNode;
import eu.cactosfp7.infrastructuremodels.physicaldc.core.NodeState;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Set Physical Node State Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.cactosim.experimentscenario.request.impl.SetPhysicalNodeStateRequestImpl#getTargetNode <em>Target Node</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.experimentscenario.request.impl.SetPhysicalNodeStateRequestImpl#getTargetState <em>Target State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SetPhysicalNodeStateRequestImpl extends ExperimentScenarioRequestImpl implements SetPhysicalNodeStateRequest {
	/**
	 * The default value of the '{@link #getTargetState() <em>Target State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetState()
	 * @generated
	 * @ordered
	 */
	protected static final NodeState TARGET_STATE_EDEFAULT = NodeState.OFF;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetPhysicalNodeStateRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequestPackage.Literals.SET_PHYSICAL_NODE_STATE_REQUEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractNode getTargetNode() {
		return (AbstractNode)eDynamicGet(RequestPackage.SET_PHYSICAL_NODE_STATE_REQUEST__TARGET_NODE, RequestPackage.Literals.SET_PHYSICAL_NODE_STATE_REQUEST__TARGET_NODE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractNode basicGetTargetNode() {
		return (AbstractNode)eDynamicGet(RequestPackage.SET_PHYSICAL_NODE_STATE_REQUEST__TARGET_NODE, RequestPackage.Literals.SET_PHYSICAL_NODE_STATE_REQUEST__TARGET_NODE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetNode(AbstractNode newTargetNode) {
		eDynamicSet(RequestPackage.SET_PHYSICAL_NODE_STATE_REQUEST__TARGET_NODE, RequestPackage.Literals.SET_PHYSICAL_NODE_STATE_REQUEST__TARGET_NODE, newTargetNode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NodeState getTargetState() {
		return (NodeState)eDynamicGet(RequestPackage.SET_PHYSICAL_NODE_STATE_REQUEST__TARGET_STATE, RequestPackage.Literals.SET_PHYSICAL_NODE_STATE_REQUEST__TARGET_STATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetState(NodeState newTargetState) {
		eDynamicSet(RequestPackage.SET_PHYSICAL_NODE_STATE_REQUEST__TARGET_STATE, RequestPackage.Literals.SET_PHYSICAL_NODE_STATE_REQUEST__TARGET_STATE, newTargetState);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RequestPackage.SET_PHYSICAL_NODE_STATE_REQUEST__TARGET_NODE:
				if (resolve) return getTargetNode();
				return basicGetTargetNode();
			case RequestPackage.SET_PHYSICAL_NODE_STATE_REQUEST__TARGET_STATE:
				return getTargetState();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RequestPackage.SET_PHYSICAL_NODE_STATE_REQUEST__TARGET_NODE:
				setTargetNode((AbstractNode)newValue);
				return;
			case RequestPackage.SET_PHYSICAL_NODE_STATE_REQUEST__TARGET_STATE:
				setTargetState((NodeState)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RequestPackage.SET_PHYSICAL_NODE_STATE_REQUEST__TARGET_NODE:
				setTargetNode((AbstractNode)null);
				return;
			case RequestPackage.SET_PHYSICAL_NODE_STATE_REQUEST__TARGET_STATE:
				setTargetState(TARGET_STATE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RequestPackage.SET_PHYSICAL_NODE_STATE_REQUEST__TARGET_NODE:
				return basicGetTargetNode() != null;
			case RequestPackage.SET_PHYSICAL_NODE_STATE_REQUEST__TARGET_STATE:
				return getTargetState() != TARGET_STATE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //SetPhysicalNodeStateRequestImpl
