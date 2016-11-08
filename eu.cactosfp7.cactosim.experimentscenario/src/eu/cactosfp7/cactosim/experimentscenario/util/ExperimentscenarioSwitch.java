/**
 */
package eu.cactosfp7.cactosim.experimentscenario.util;

import eu.cactosfp7.cactosim.experimentscenario.*;

import eu.cactosfp7.identifier.Identifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see eu.cactosfp7.cactosim.experimentscenario.ExperimentscenarioPackage
 * @generated
 */
public class ExperimentscenarioSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ExperimentscenarioPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExperimentscenarioSwitch() {
		if (modelPackage == null) {
			modelPackage = ExperimentscenarioPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ExperimentscenarioPackage.ABSOLUTE_TIME_EVENT: {
				AbsoluteTimeEvent absoluteTimeEvent = (AbsoluteTimeEvent)theEObject;
				T result = caseAbsoluteTimeEvent(absoluteTimeEvent);
				if (result == null) result = caseTimeLineEvent(absoluteTimeEvent);
				if (result == null) result = caseIdentifier(absoluteTimeEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExperimentscenarioPackage.TIME_LINE_EVENT: {
				TimeLineEvent timeLineEvent = (TimeLineEvent)theEObject;
				T result = caseTimeLineEvent(timeLineEvent);
				if (result == null) result = caseIdentifier(timeLineEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExperimentscenarioPackage.EXPERIMENT_SCENARIO_TIME_LINE: {
				ExperimentScenarioTimeLine experimentScenarioTimeLine = (ExperimentScenarioTimeLine)theEObject;
				T result = caseExperimentScenarioTimeLine(experimentScenarioTimeLine);
				if (result == null) result = caseIdentifier(experimentScenarioTimeLine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExperimentscenarioPackage.RELATIVE_TIME_EVENT: {
				RelativeTimeEvent relativeTimeEvent = (RelativeTimeEvent)theEObject;
				T result = caseRelativeTimeEvent(relativeTimeEvent);
				if (result == null) result = caseTimeLineEvent(relativeTimeEvent);
				if (result == null) result = caseIdentifier(relativeTimeEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Absolute Time Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Absolute Time Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbsoluteTimeEvent(AbsoluteTimeEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Line Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Line Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeLineEvent(TimeLineEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Experiment Scenario Time Line</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Experiment Scenario Time Line</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExperimentScenarioTimeLine(ExperimentScenarioTimeLine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relative Time Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relative Time Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelativeTimeEvent(RelativeTimeEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifier</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseIdentifier(Identifier object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ExperimentscenarioSwitch
