/**
 */
package eu.cactosfp7.cactosim.experimentscenario.request.impl;

import eu.cactosfp7.cactosim.experimentscenario.request.ReconfigureScalableImageConnectorRequest;
import eu.cactosfp7.cactosim.experimentscenario.request.RequestPackage;

import eu.cactosfp7.cactosim.experimentscenario.selector.WhiteBoxApplicationInstanceSelector;

import eu.cactosfp7.infrastructuremodels.logicaldc.application.LoadBalancingPolicy;
import eu.cactosfp7.infrastructuremodels.logicaldc.application.ScalableVMImageConnector;

import javax.measure.quantity.Duration;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.jscience.physics.amount.Amount;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reconfigure Scalable Image Connector Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.cactosim.experimentscenario.request.impl.ReconfigureScalableImageConnectorRequestImpl#getWhiteBoxApplicationInstanceSelector <em>White Box Application Instance Selector</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.experimentscenario.request.impl.ReconfigureScalableImageConnectorRequestImpl#getLoadBalancingPolicy <em>Load Balancing Policy</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.experimentscenario.request.impl.ReconfigureScalableImageConnectorRequestImpl#getAutoscalingAnalysisInterval <em>Autoscaling Analysis Interval</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.experimentscenario.request.impl.ReconfigureScalableImageConnectorRequestImpl#getTargetConnector <em>Target Connector</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReconfigureScalableImageConnectorRequestImpl extends ExperimentScenarioRequestImpl implements ReconfigureScalableImageConnectorRequest {
	/**
	 * The default value of the '{@link #getLoadBalancingPolicy() <em>Load Balancing Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadBalancingPolicy()
	 * @generated
	 * @ordered
	 */
	protected static final LoadBalancingPolicy LOAD_BALANCING_POLICY_EDEFAULT = LoadBalancingPolicy.ROUND_ROBIN;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReconfigureScalableImageConnectorRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequestPackage.Literals.RECONFIGURE_SCALABLE_IMAGE_CONNECTOR_REQUEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WhiteBoxApplicationInstanceSelector getWhiteBoxApplicationInstanceSelector() {
		return (WhiteBoxApplicationInstanceSelector)eDynamicGet(RequestPackage.RECONFIGURE_SCALABLE_IMAGE_CONNECTOR_REQUEST__WHITE_BOX_APPLICATION_INSTANCE_SELECTOR, RequestPackage.Literals.RECONFIGURE_SCALABLE_IMAGE_CONNECTOR_REQUEST__WHITE_BOX_APPLICATION_INSTANCE_SELECTOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhiteBoxApplicationInstanceSelector(WhiteBoxApplicationInstanceSelector newWhiteBoxApplicationInstanceSelector, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newWhiteBoxApplicationInstanceSelector, RequestPackage.RECONFIGURE_SCALABLE_IMAGE_CONNECTOR_REQUEST__WHITE_BOX_APPLICATION_INSTANCE_SELECTOR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWhiteBoxApplicationInstanceSelector(WhiteBoxApplicationInstanceSelector newWhiteBoxApplicationInstanceSelector) {
		eDynamicSet(RequestPackage.RECONFIGURE_SCALABLE_IMAGE_CONNECTOR_REQUEST__WHITE_BOX_APPLICATION_INSTANCE_SELECTOR, RequestPackage.Literals.RECONFIGURE_SCALABLE_IMAGE_CONNECTOR_REQUEST__WHITE_BOX_APPLICATION_INSTANCE_SELECTOR, newWhiteBoxApplicationInstanceSelector);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LoadBalancingPolicy getLoadBalancingPolicy() {
		return (LoadBalancingPolicy)eDynamicGet(RequestPackage.RECONFIGURE_SCALABLE_IMAGE_CONNECTOR_REQUEST__LOAD_BALANCING_POLICY, RequestPackage.Literals.RECONFIGURE_SCALABLE_IMAGE_CONNECTOR_REQUEST__LOAD_BALANCING_POLICY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLoadBalancingPolicy(LoadBalancingPolicy newLoadBalancingPolicy) {
		eDynamicSet(RequestPackage.RECONFIGURE_SCALABLE_IMAGE_CONNECTOR_REQUEST__LOAD_BALANCING_POLICY, RequestPackage.Literals.RECONFIGURE_SCALABLE_IMAGE_CONNECTOR_REQUEST__LOAD_BALANCING_POLICY, newLoadBalancingPolicy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Amount<Duration> getAutoscalingAnalysisInterval() {
		return (Amount<Duration>)eDynamicGet(RequestPackage.RECONFIGURE_SCALABLE_IMAGE_CONNECTOR_REQUEST__AUTOSCALING_ANALYSIS_INTERVAL, RequestPackage.Literals.RECONFIGURE_SCALABLE_IMAGE_CONNECTOR_REQUEST__AUTOSCALING_ANALYSIS_INTERVAL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAutoscalingAnalysisInterval(Amount<Duration> newAutoscalingAnalysisInterval) {
		eDynamicSet(RequestPackage.RECONFIGURE_SCALABLE_IMAGE_CONNECTOR_REQUEST__AUTOSCALING_ANALYSIS_INTERVAL, RequestPackage.Literals.RECONFIGURE_SCALABLE_IMAGE_CONNECTOR_REQUEST__AUTOSCALING_ANALYSIS_INTERVAL, newAutoscalingAnalysisInterval);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScalableVMImageConnector getTargetConnector() {
		return (ScalableVMImageConnector)eDynamicGet(RequestPackage.RECONFIGURE_SCALABLE_IMAGE_CONNECTOR_REQUEST__TARGET_CONNECTOR, RequestPackage.Literals.RECONFIGURE_SCALABLE_IMAGE_CONNECTOR_REQUEST__TARGET_CONNECTOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScalableVMImageConnector basicGetTargetConnector() {
		return (ScalableVMImageConnector)eDynamicGet(RequestPackage.RECONFIGURE_SCALABLE_IMAGE_CONNECTOR_REQUEST__TARGET_CONNECTOR, RequestPackage.Literals.RECONFIGURE_SCALABLE_IMAGE_CONNECTOR_REQUEST__TARGET_CONNECTOR, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetConnector(ScalableVMImageConnector newTargetConnector) {
		eDynamicSet(RequestPackage.RECONFIGURE_SCALABLE_IMAGE_CONNECTOR_REQUEST__TARGET_CONNECTOR, RequestPackage.Literals.RECONFIGURE_SCALABLE_IMAGE_CONNECTOR_REQUEST__TARGET_CONNECTOR, newTargetConnector);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RequestPackage.RECONFIGURE_SCALABLE_IMAGE_CONNECTOR_REQUEST__WHITE_BOX_APPLICATION_INSTANCE_SELECTOR:
				return basicSetWhiteBoxApplicationInstanceSelector(null, msgs);
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
			case RequestPackage.RECONFIGURE_SCALABLE_IMAGE_CONNECTOR_REQUEST__WHITE_BOX_APPLICATION_INSTANCE_SELECTOR:
				return getWhiteBoxApplicationInstanceSelector();
			case RequestPackage.RECONFIGURE_SCALABLE_IMAGE_CONNECTOR_REQUEST__LOAD_BALANCING_POLICY:
				return getLoadBalancingPolicy();
			case RequestPackage.RECONFIGURE_SCALABLE_IMAGE_CONNECTOR_REQUEST__AUTOSCALING_ANALYSIS_INTERVAL:
				return getAutoscalingAnalysisInterval();
			case RequestPackage.RECONFIGURE_SCALABLE_IMAGE_CONNECTOR_REQUEST__TARGET_CONNECTOR:
				if (resolve) return getTargetConnector();
				return basicGetTargetConnector();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RequestPackage.RECONFIGURE_SCALABLE_IMAGE_CONNECTOR_REQUEST__WHITE_BOX_APPLICATION_INSTANCE_SELECTOR:
				setWhiteBoxApplicationInstanceSelector((WhiteBoxApplicationInstanceSelector)newValue);
				return;
			case RequestPackage.RECONFIGURE_SCALABLE_IMAGE_CONNECTOR_REQUEST__LOAD_BALANCING_POLICY:
				setLoadBalancingPolicy((LoadBalancingPolicy)newValue);
				return;
			case RequestPackage.RECONFIGURE_SCALABLE_IMAGE_CONNECTOR_REQUEST__AUTOSCALING_ANALYSIS_INTERVAL:
				setAutoscalingAnalysisInterval((Amount<Duration>)newValue);
				return;
			case RequestPackage.RECONFIGURE_SCALABLE_IMAGE_CONNECTOR_REQUEST__TARGET_CONNECTOR:
				setTargetConnector((ScalableVMImageConnector)newValue);
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
			case RequestPackage.RECONFIGURE_SCALABLE_IMAGE_CONNECTOR_REQUEST__WHITE_BOX_APPLICATION_INSTANCE_SELECTOR:
				setWhiteBoxApplicationInstanceSelector((WhiteBoxApplicationInstanceSelector)null);
				return;
			case RequestPackage.RECONFIGURE_SCALABLE_IMAGE_CONNECTOR_REQUEST__LOAD_BALANCING_POLICY:
				setLoadBalancingPolicy(LOAD_BALANCING_POLICY_EDEFAULT);
				return;
			case RequestPackage.RECONFIGURE_SCALABLE_IMAGE_CONNECTOR_REQUEST__AUTOSCALING_ANALYSIS_INTERVAL:
				setAutoscalingAnalysisInterval((Amount<Duration>)null);
				return;
			case RequestPackage.RECONFIGURE_SCALABLE_IMAGE_CONNECTOR_REQUEST__TARGET_CONNECTOR:
				setTargetConnector((ScalableVMImageConnector)null);
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
			case RequestPackage.RECONFIGURE_SCALABLE_IMAGE_CONNECTOR_REQUEST__WHITE_BOX_APPLICATION_INSTANCE_SELECTOR:
				return getWhiteBoxApplicationInstanceSelector() != null;
			case RequestPackage.RECONFIGURE_SCALABLE_IMAGE_CONNECTOR_REQUEST__LOAD_BALANCING_POLICY:
				return getLoadBalancingPolicy() != LOAD_BALANCING_POLICY_EDEFAULT;
			case RequestPackage.RECONFIGURE_SCALABLE_IMAGE_CONNECTOR_REQUEST__AUTOSCALING_ANALYSIS_INTERVAL:
				return getAutoscalingAnalysisInterval() != null;
			case RequestPackage.RECONFIGURE_SCALABLE_IMAGE_CONNECTOR_REQUEST__TARGET_CONNECTOR:
				return basicGetTargetConnector() != null;
		}
		return super.eIsSet(featureID);
	}

} //ReconfigureScalableImageConnectorRequestImpl
