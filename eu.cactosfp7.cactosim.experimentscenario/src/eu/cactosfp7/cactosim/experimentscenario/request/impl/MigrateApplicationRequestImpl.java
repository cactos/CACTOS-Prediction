/**
 */
package eu.cactosfp7.cactosim.experimentscenario.request.impl;

import eu.cactosfp7.cactosim.experimentscenario.request.MigrateApplicationRequest;
import eu.cactosfp7.cactosim.experimentscenario.request.RequestPackage;

import eu.cactosfp7.cactosim.experimentscenario.selector.ApplicationInstanceSelector;

import eu.cactosfp7.infrastructuremodels.physicaldc.core.ComputeNode;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Migrate Application Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.cactosim.experimentscenario.request.impl.MigrateApplicationRequestImpl#getTargetPhysicalNode <em>Target Physical Node</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.experimentscenario.request.impl.MigrateApplicationRequestImpl#getApplicationInstanceSelector <em>Application Instance Selector</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MigrateApplicationRequestImpl extends ExperimentScenarioRequestImpl implements MigrateApplicationRequest {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MigrateApplicationRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequestPackage.Literals.MIGRATE_APPLICATION_REQUEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComputeNode getTargetPhysicalNode() {
		return (ComputeNode)eDynamicGet(RequestPackage.MIGRATE_APPLICATION_REQUEST__TARGET_PHYSICAL_NODE, RequestPackage.Literals.MIGRATE_APPLICATION_REQUEST__TARGET_PHYSICAL_NODE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComputeNode basicGetTargetPhysicalNode() {
		return (ComputeNode)eDynamicGet(RequestPackage.MIGRATE_APPLICATION_REQUEST__TARGET_PHYSICAL_NODE, RequestPackage.Literals.MIGRATE_APPLICATION_REQUEST__TARGET_PHYSICAL_NODE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetPhysicalNode(ComputeNode newTargetPhysicalNode) {
		eDynamicSet(RequestPackage.MIGRATE_APPLICATION_REQUEST__TARGET_PHYSICAL_NODE, RequestPackage.Literals.MIGRATE_APPLICATION_REQUEST__TARGET_PHYSICAL_NODE, newTargetPhysicalNode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ApplicationInstanceSelector getApplicationInstanceSelector() {
		return (ApplicationInstanceSelector)eDynamicGet(RequestPackage.MIGRATE_APPLICATION_REQUEST__APPLICATION_INSTANCE_SELECTOR, RequestPackage.Literals.MIGRATE_APPLICATION_REQUEST__APPLICATION_INSTANCE_SELECTOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApplicationInstanceSelector(ApplicationInstanceSelector newApplicationInstanceSelector, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newApplicationInstanceSelector, RequestPackage.MIGRATE_APPLICATION_REQUEST__APPLICATION_INSTANCE_SELECTOR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApplicationInstanceSelector(ApplicationInstanceSelector newApplicationInstanceSelector) {
		eDynamicSet(RequestPackage.MIGRATE_APPLICATION_REQUEST__APPLICATION_INSTANCE_SELECTOR, RequestPackage.Literals.MIGRATE_APPLICATION_REQUEST__APPLICATION_INSTANCE_SELECTOR, newApplicationInstanceSelector);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RequestPackage.MIGRATE_APPLICATION_REQUEST__APPLICATION_INSTANCE_SELECTOR:
				return basicSetApplicationInstanceSelector(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RequestPackage.MIGRATE_APPLICATION_REQUEST__TARGET_PHYSICAL_NODE:
				if (resolve) return getTargetPhysicalNode();
				return basicGetTargetPhysicalNode();
			case RequestPackage.MIGRATE_APPLICATION_REQUEST__APPLICATION_INSTANCE_SELECTOR:
				return getApplicationInstanceSelector();
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
			case RequestPackage.MIGRATE_APPLICATION_REQUEST__TARGET_PHYSICAL_NODE:
				setTargetPhysicalNode((ComputeNode)newValue);
				return;
			case RequestPackage.MIGRATE_APPLICATION_REQUEST__APPLICATION_INSTANCE_SELECTOR:
				setApplicationInstanceSelector((ApplicationInstanceSelector)newValue);
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
			case RequestPackage.MIGRATE_APPLICATION_REQUEST__TARGET_PHYSICAL_NODE:
				setTargetPhysicalNode((ComputeNode)null);
				return;
			case RequestPackage.MIGRATE_APPLICATION_REQUEST__APPLICATION_INSTANCE_SELECTOR:
				setApplicationInstanceSelector((ApplicationInstanceSelector)null);
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
			case RequestPackage.MIGRATE_APPLICATION_REQUEST__TARGET_PHYSICAL_NODE:
				return basicGetTargetPhysicalNode() != null;
			case RequestPackage.MIGRATE_APPLICATION_REQUEST__APPLICATION_INSTANCE_SELECTOR:
				return getApplicationInstanceSelector() != null;
		}
		return super.eIsSet(featureID);
	}

} //MigrateApplicationRequestImpl
