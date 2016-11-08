/**
 */
package eu.cactosfp7.cactosim.experimentscenario.request.util;

import eu.cactosfp7.cactosim.experimentscenario.request.*;

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
 * @see eu.cactosfp7.cactosim.experimentscenario.request.RequestPackage
 * @generated
 */
public class RequestSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RequestPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestSwitch() {
		if (modelPackage == null) {
			modelPackage = RequestPackage.eINSTANCE;
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
			case RequestPackage.RECONFIGURE_OPTIMIZATION_ALGORITHM_REQUEST: {
				ReconfigureOptimizationAlgorithmRequest reconfigureOptimizationAlgorithmRequest = (ReconfigureOptimizationAlgorithmRequest)theEObject;
				T result = caseReconfigureOptimizationAlgorithmRequest(reconfigureOptimizationAlgorithmRequest);
				if (result == null) result = caseExperimentScenarioRequest(reconfigureOptimizationAlgorithmRequest);
				if (result == null) result = caseIdentifier(reconfigureOptimizationAlgorithmRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RequestPackage.MIGRATE_APPLICATION_REQUEST: {
				MigrateApplicationRequest migrateApplicationRequest = (MigrateApplicationRequest)theEObject;
				T result = caseMigrateApplicationRequest(migrateApplicationRequest);
				if (result == null) result = caseExperimentScenarioRequest(migrateApplicationRequest);
				if (result == null) result = caseIdentifier(migrateApplicationRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RequestPackage.START_APPLICATION_REQUEST: {
				StartApplicationRequest startApplicationRequest = (StartApplicationRequest)theEObject;
				T result = caseStartApplicationRequest(startApplicationRequest);
				if (result == null) result = caseExperimentScenarioRequest(startApplicationRequest);
				if (result == null) result = caseIdentifier(startApplicationRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RequestPackage.SUSPEND_APPLICATION_REQUEST: {
				SuspendApplicationRequest suspendApplicationRequest = (SuspendApplicationRequest)theEObject;
				T result = caseSuspendApplicationRequest(suspendApplicationRequest);
				if (result == null) result = caseExperimentScenarioRequest(suspendApplicationRequest);
				if (result == null) result = caseIdentifier(suspendApplicationRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RequestPackage.TERMINATE_APPLICATION_REQUEST: {
				TerminateApplicationRequest terminateApplicationRequest = (TerminateApplicationRequest)theEObject;
				T result = caseTerminateApplicationRequest(terminateApplicationRequest);
				if (result == null) result = caseExperimentScenarioRequest(terminateApplicationRequest);
				if (result == null) result = caseIdentifier(terminateApplicationRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RequestPackage.CHANGE_OPTIMIZATION_INTERVAL_REQUEST: {
				ChangeOptimizationIntervalRequest changeOptimizationIntervalRequest = (ChangeOptimizationIntervalRequest)theEObject;
				T result = caseChangeOptimizationIntervalRequest(changeOptimizationIntervalRequest);
				if (result == null) result = caseExperimentScenarioRequest(changeOptimizationIntervalRequest);
				if (result == null) result = caseIdentifier(changeOptimizationIntervalRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RequestPackage.RECONFIGURE_SCALABLE_IMAGE_CONNECTOR_REQUEST: {
				ReconfigureScalableImageConnectorRequest reconfigureScalableImageConnectorRequest = (ReconfigureScalableImageConnectorRequest)theEObject;
				T result = caseReconfigureScalableImageConnectorRequest(reconfigureScalableImageConnectorRequest);
				if (result == null) result = caseExperimentScenarioRequest(reconfigureScalableImageConnectorRequest);
				if (result == null) result = caseIdentifier(reconfigureScalableImageConnectorRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RequestPackage.SET_PHYSICAL_NODE_STATE_REQUEST: {
				SetPhysicalNodeStateRequest setPhysicalNodeStateRequest = (SetPhysicalNodeStateRequest)theEObject;
				T result = caseSetPhysicalNodeStateRequest(setPhysicalNodeStateRequest);
				if (result == null) result = caseExperimentScenarioRequest(setPhysicalNodeStateRequest);
				if (result == null) result = caseIdentifier(setPhysicalNodeStateRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RequestPackage.RESUME_APPLICATION_REQUEST: {
				ResumeApplicationRequest resumeApplicationRequest = (ResumeApplicationRequest)theEObject;
				T result = caseResumeApplicationRequest(resumeApplicationRequest);
				if (result == null) result = caseExperimentScenarioRequest(resumeApplicationRequest);
				if (result == null) result = caseIdentifier(resumeApplicationRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RequestPackage.EXPERIMENT_SCENARIO_REQUEST: {
				ExperimentScenarioRequest experimentScenarioRequest = (ExperimentScenarioRequest)theEObject;
				T result = caseExperimentScenarioRequest(experimentScenarioRequest);
				if (result == null) result = caseIdentifier(experimentScenarioRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reconfigure Optimization Algorithm Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reconfigure Optimization Algorithm Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReconfigureOptimizationAlgorithmRequest(ReconfigureOptimizationAlgorithmRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Migrate Application Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Migrate Application Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMigrateApplicationRequest(MigrateApplicationRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Start Application Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Start Application Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStartApplicationRequest(StartApplicationRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Suspend Application Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Suspend Application Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuspendApplicationRequest(SuspendApplicationRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Terminate Application Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Terminate Application Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerminateApplicationRequest(TerminateApplicationRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Optimization Interval Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Optimization Interval Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangeOptimizationIntervalRequest(ChangeOptimizationIntervalRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reconfigure Scalable Image Connector Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reconfigure Scalable Image Connector Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReconfigureScalableImageConnectorRequest(ReconfigureScalableImageConnectorRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Physical Node State Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Physical Node State Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetPhysicalNodeStateRequest(SetPhysicalNodeStateRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resume Application Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resume Application Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResumeApplicationRequest(ResumeApplicationRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Experiment Scenario Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Experiment Scenario Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExperimentScenarioRequest(ExperimentScenarioRequest object) {
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

} //RequestSwitch
