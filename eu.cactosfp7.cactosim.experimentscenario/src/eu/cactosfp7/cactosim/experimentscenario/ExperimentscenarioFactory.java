/**
 */
package eu.cactosfp7.cactosim.experimentscenario;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see eu.cactosfp7.cactosim.experimentscenario.ExperimentscenarioPackage
 * @generated
 */
public interface ExperimentscenarioFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExperimentscenarioFactory eINSTANCE = eu.cactosfp7.cactosim.experimentscenario.impl.ExperimentscenarioFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Absolute Time Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Absolute Time Event</em>'.
	 * @generated
	 */
	AbsoluteTimeEvent createAbsoluteTimeEvent();

	/**
	 * Returns a new object of class '<em>Experiment Scenario Time Line</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Experiment Scenario Time Line</em>'.
	 * @generated
	 */
	ExperimentScenarioTimeLine createExperimentScenarioTimeLine();

	/**
	 * Returns a new object of class '<em>Relative Time Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relative Time Event</em>'.
	 * @generated
	 */
	RelativeTimeEvent createRelativeTimeEvent();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ExperimentscenarioPackage getExperimentscenarioPackage();

} //ExperimentscenarioFactory
