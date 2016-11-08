/**
 */
package eu.cactosfp7.cactosim.experimentscenario.request;

import javax.measure.quantity.Duration;

import org.jscience.physics.amount.Amount;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Change Optimization Interval Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.cactosim.experimentscenario.request.ChangeOptimizationIntervalRequest#getOptimizationInterval <em>Optimization Interval</em>}</li>
 * </ul>
 *
 * @see eu.cactosfp7.cactosim.experimentscenario.request.RequestPackage#getChangeOptimizationIntervalRequest()
 * @model
 * @generated
 */
public interface ChangeOptimizationIntervalRequest extends ExperimentScenarioRequest {
	/**
	 * Returns the value of the '<em><b>Optimization Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Optimization Interval</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optimization Interval</em>' attribute.
	 * @see #setOptimizationInterval(Amount)
	 * @see eu.cactosfp7.cactosim.experimentscenario.request.RequestPackage#getChangeOptimizationIntervalRequest_OptimizationInterval()
	 * @model dataType="eu.cactosfp7.infrastructuremodels.physicaldc.util.Amount<eu.cactosfp7.infrastructuremodels.physicaldc.util.Duration>" required="true" ordered="false"
	 * @generated
	 */
	Amount<Duration> getOptimizationInterval();

	/**
	 * Sets the value of the '{@link eu.cactosfp7.cactosim.experimentscenario.request.ChangeOptimizationIntervalRequest#getOptimizationInterval <em>Optimization Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optimization Interval</em>' attribute.
	 * @see #getOptimizationInterval()
	 * @generated
	 */
	void setOptimizationInterval(Amount<Duration> value);

} // ChangeOptimizationIntervalRequest
