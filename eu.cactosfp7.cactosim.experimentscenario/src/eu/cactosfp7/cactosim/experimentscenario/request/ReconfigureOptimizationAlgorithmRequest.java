/**
 */
package eu.cactosfp7.cactosim.experimentscenario.request;

import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reconfigure Optimization Algorithm Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.cactosim.experimentscenario.request.ReconfigureOptimizationAlgorithmRequest#getAlgorithmName <em>Algorithm Name</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.experimentscenario.request.ReconfigureOptimizationAlgorithmRequest#getAlgorithmParameters <em>Algorithm Parameters</em>}</li>
 * </ul>
 *
 * @see eu.cactosfp7.cactosim.experimentscenario.request.RequestPackage#getReconfigureOptimizationAlgorithmRequest()
 * @model
 * @generated
 */
public interface ReconfigureOptimizationAlgorithmRequest extends ExperimentScenarioRequest {
	/**
	 * Returns the value of the '<em><b>Algorithm Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Algorithm Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Algorithm Name</em>' attribute.
	 * @see #setAlgorithmName(String)
	 * @see eu.cactosfp7.cactosim.experimentscenario.request.RequestPackage#getReconfigureOptimizationAlgorithmRequest_AlgorithmName()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getAlgorithmName();

	/**
	 * Sets the value of the '{@link eu.cactosfp7.cactosim.experimentscenario.request.ReconfigureOptimizationAlgorithmRequest#getAlgorithmName <em>Algorithm Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Algorithm Name</em>' attribute.
	 * @see #getAlgorithmName()
	 * @generated
	 */
	void setAlgorithmName(String value);

	/**
	 * Returns the value of the '<em><b>Algorithm Parameters</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Algorithm Parameters</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Algorithm Parameters</em>' map.
	 * @see eu.cactosfp7.cactosim.experimentscenario.request.RequestPackage#getReconfigureOptimizationAlgorithmRequest_AlgorithmParameters()
	 * @model mapType="eu.cactosfp7.infrastructuremodels.physicaldc.util.EStringToEStringObjectMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" ordered="false"
	 * @generated
	 */
	EMap<String, String> getAlgorithmParameters();

} // ReconfigureOptimizationAlgorithmRequest
