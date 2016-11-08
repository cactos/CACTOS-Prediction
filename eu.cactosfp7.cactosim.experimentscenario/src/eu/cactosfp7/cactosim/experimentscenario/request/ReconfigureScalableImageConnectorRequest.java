/**
 */
package eu.cactosfp7.cactosim.experimentscenario.request;

import eu.cactosfp7.cactosim.experimentscenario.selector.WhiteBoxApplicationInstanceSelector;

import eu.cactosfp7.infrastructuremodels.logicaldc.application.LoadBalancingPolicy;
import eu.cactosfp7.infrastructuremodels.logicaldc.application.ScalableVMImageConnector;

import javax.measure.quantity.Duration;

import org.jscience.physics.amount.Amount;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reconfigure Scalable Image Connector Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.cactosim.experimentscenario.request.ReconfigureScalableImageConnectorRequest#getWhiteBoxApplicationInstanceSelector <em>White Box Application Instance Selector</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.experimentscenario.request.ReconfigureScalableImageConnectorRequest#getLoadBalancingPolicy <em>Load Balancing Policy</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.experimentscenario.request.ReconfigureScalableImageConnectorRequest#getAutoscalingAnalysisInterval <em>Autoscaling Analysis Interval</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.experimentscenario.request.ReconfigureScalableImageConnectorRequest#getTargetConnector <em>Target Connector</em>}</li>
 * </ul>
 *
 * @see eu.cactosfp7.cactosim.experimentscenario.request.RequestPackage#getReconfigureScalableImageConnectorRequest()
 * @model
 * @generated
 */
public interface ReconfigureScalableImageConnectorRequest extends ExperimentScenarioRequest {
	/**
	 * Returns the value of the '<em><b>White Box Application Instance Selector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>White Box Application Instance Selector</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>White Box Application Instance Selector</em>' containment reference.
	 * @see #setWhiteBoxApplicationInstanceSelector(WhiteBoxApplicationInstanceSelector)
	 * @see eu.cactosfp7.cactosim.experimentscenario.request.RequestPackage#getReconfigureScalableImageConnectorRequest_WhiteBoxApplicationInstanceSelector()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	WhiteBoxApplicationInstanceSelector getWhiteBoxApplicationInstanceSelector();

	/**
	 * Sets the value of the '{@link eu.cactosfp7.cactosim.experimentscenario.request.ReconfigureScalableImageConnectorRequest#getWhiteBoxApplicationInstanceSelector <em>White Box Application Instance Selector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>White Box Application Instance Selector</em>' containment reference.
	 * @see #getWhiteBoxApplicationInstanceSelector()
	 * @generated
	 */
	void setWhiteBoxApplicationInstanceSelector(WhiteBoxApplicationInstanceSelector value);

	/**
	 * Returns the value of the '<em><b>Load Balancing Policy</b></em>' attribute.
	 * The literals are from the enumeration {@link eu.cactosfp7.infrastructuremodels.logicaldc.application.LoadBalancingPolicy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Load Balancing Policy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load Balancing Policy</em>' attribute.
	 * @see eu.cactosfp7.infrastructuremodels.logicaldc.application.LoadBalancingPolicy
	 * @see #setLoadBalancingPolicy(LoadBalancingPolicy)
	 * @see eu.cactosfp7.cactosim.experimentscenario.request.RequestPackage#getReconfigureScalableImageConnectorRequest_LoadBalancingPolicy()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	LoadBalancingPolicy getLoadBalancingPolicy();

	/**
	 * Sets the value of the '{@link eu.cactosfp7.cactosim.experimentscenario.request.ReconfigureScalableImageConnectorRequest#getLoadBalancingPolicy <em>Load Balancing Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load Balancing Policy</em>' attribute.
	 * @see eu.cactosfp7.infrastructuremodels.logicaldc.application.LoadBalancingPolicy
	 * @see #getLoadBalancingPolicy()
	 * @generated
	 */
	void setLoadBalancingPolicy(LoadBalancingPolicy value);

	/**
	 * Returns the value of the '<em><b>Autoscaling Analysis Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autoscaling Analysis Interval</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autoscaling Analysis Interval</em>' attribute.
	 * @see #setAutoscalingAnalysisInterval(Amount)
	 * @see eu.cactosfp7.cactosim.experimentscenario.request.RequestPackage#getReconfigureScalableImageConnectorRequest_AutoscalingAnalysisInterval()
	 * @model dataType="eu.cactosfp7.infrastructuremodels.physicaldc.util.Amount<eu.cactosfp7.infrastructuremodels.physicaldc.util.Duration>" required="true" ordered="false"
	 * @generated
	 */
	Amount<Duration> getAutoscalingAnalysisInterval();

	/**
	 * Sets the value of the '{@link eu.cactosfp7.cactosim.experimentscenario.request.ReconfigureScalableImageConnectorRequest#getAutoscalingAnalysisInterval <em>Autoscaling Analysis Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Autoscaling Analysis Interval</em>' attribute.
	 * @see #getAutoscalingAnalysisInterval()
	 * @generated
	 */
	void setAutoscalingAnalysisInterval(Amount<Duration> value);

	/**
	 * Returns the value of the '<em><b>Target Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Connector</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Connector</em>' reference.
	 * @see #setTargetConnector(ScalableVMImageConnector)
	 * @see eu.cactosfp7.cactosim.experimentscenario.request.RequestPackage#getReconfigureScalableImageConnectorRequest_TargetConnector()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ScalableVMImageConnector getTargetConnector();

	/**
	 * Sets the value of the '{@link eu.cactosfp7.cactosim.experimentscenario.request.ReconfigureScalableImageConnectorRequest#getTargetConnector <em>Target Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Connector</em>' reference.
	 * @see #getTargetConnector()
	 * @generated
	 */
	void setTargetConnector(ScalableVMImageConnector value);

} // ReconfigureScalableImageConnectorRequest
