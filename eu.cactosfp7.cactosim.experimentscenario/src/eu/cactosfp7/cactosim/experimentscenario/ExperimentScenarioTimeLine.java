/**
 */
package eu.cactosfp7.cactosim.experimentscenario;

import eu.cactosfp7.identifier.Identifier;
import javax.measure.quantity.Duration;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import org.jscience.physics.amount.Amount;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Experiment Scenario Time Line</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.cactosim.experimentscenario.ExperimentScenarioTimeLine#getSimulationResolution <em>Simulation Resolution</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.experimentscenario.ExperimentScenarioTimeLine#getPlacementCompatibilityMode <em>Placement Compatibility Mode</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.experimentscenario.ExperimentScenarioTimeLine#getTimeLineEvents <em>Time Line Events</em>}</li>
 * </ul>
 *
 * @see eu.cactosfp7.cactosim.experimentscenario.ExperimentscenarioPackage#getExperimentScenarioTimeLine()
 * @model
 * @generated
 */
public interface ExperimentScenarioTimeLine extends EObject, Identifier {
	/**
	 * Returns the value of the '<em><b>Simulation Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simulation Resolution</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simulation Resolution</em>' attribute.
	 * @see #setSimulationResolution(Amount)
	 * @see eu.cactosfp7.cactosim.experimentscenario.ExperimentscenarioPackage#getExperimentScenarioTimeLine_SimulationResolution()
	 * @model dataType="eu.cactosfp7.infrastructuremodels.physicaldc.util.Amount<eu.cactosfp7.infrastructuremodels.physicaldc.util.Duration>" required="true" ordered="false"
	 * @generated
	 */
	Amount<Duration> getSimulationResolution();

	/**
	 * Sets the value of the '{@link eu.cactosfp7.cactosim.experimentscenario.ExperimentScenarioTimeLine#getSimulationResolution <em>Simulation Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simulation Resolution</em>' attribute.
	 * @see #getSimulationResolution()
	 * @generated
	 */
	void setSimulationResolution(Amount<Duration> value);

	/**
	 * Returns the value of the '<em><b>Placement Compatibility Mode</b></em>' attribute.
	 * The default value is <code>"SimplePlacement"</code>.
	 * The literals are from the enumeration {@link eu.cactosfp7.cactosim.experimentscenario.EPlacementCompatibilityMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Placement Compatibility Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Placement Compatibility Mode</em>' attribute.
	 * @see eu.cactosfp7.cactosim.experimentscenario.EPlacementCompatibilityMode
	 * @see #setPlacementCompatibilityMode(EPlacementCompatibilityMode)
	 * @see eu.cactosfp7.cactosim.experimentscenario.ExperimentscenarioPackage#getExperimentScenarioTimeLine_PlacementCompatibilityMode()
	 * @model default="SimplePlacement" required="true" ordered="false"
	 * @generated
	 */
	EPlacementCompatibilityMode getPlacementCompatibilityMode();

	/**
	 * Sets the value of the '{@link eu.cactosfp7.cactosim.experimentscenario.ExperimentScenarioTimeLine#getPlacementCompatibilityMode <em>Placement Compatibility Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Placement Compatibility Mode</em>' attribute.
	 * @see eu.cactosfp7.cactosim.experimentscenario.EPlacementCompatibilityMode
	 * @see #getPlacementCompatibilityMode()
	 * @generated
	 */
	void setPlacementCompatibilityMode(EPlacementCompatibilityMode value);

	/**
	 * Returns the value of the '<em><b>Time Line Events</b></em>' containment reference list.
	 * The list contents are of type {@link eu.cactosfp7.cactosim.experimentscenario.TimeLineEvent}.
	 * It is bidirectional and its opposite is '{@link eu.cactosfp7.cactosim.experimentscenario.TimeLineEvent#getExperimentScenarioTimeline <em>Experiment Scenario Timeline</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Line Events</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Line Events</em>' containment reference list.
	 * @see eu.cactosfp7.cactosim.experimentscenario.ExperimentscenarioPackage#getExperimentScenarioTimeLine_TimeLineEvents()
	 * @see eu.cactosfp7.cactosim.experimentscenario.TimeLineEvent#getExperimentScenarioTimeline
	 * @model opposite="experimentScenarioTimeline" containment="true"
	 * @generated
	 */
	EList<TimeLineEvent> getTimeLineEvents();

} // ExperimentScenarioTimeLine
