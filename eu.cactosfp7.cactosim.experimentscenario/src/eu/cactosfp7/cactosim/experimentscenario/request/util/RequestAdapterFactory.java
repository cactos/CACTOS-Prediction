/**
 */
package eu.cactosfp7.cactosim.experimentscenario.request.util;

import eu.cactosfp7.cactosim.experimentscenario.request.*;

import eu.cactosfp7.identifier.Identifier;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see eu.cactosfp7.cactosim.experimentscenario.request.RequestPackage
 * @generated
 */
public class RequestAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RequestPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RequestPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequestSwitch<Adapter> modelSwitch =
		new RequestSwitch<Adapter>() {
			@Override
			public Adapter caseReconfigureOptimizationAlgorithmRequest(ReconfigureOptimizationAlgorithmRequest object) {
				return createReconfigureOptimizationAlgorithmRequestAdapter();
			}
			@Override
			public Adapter caseMigrateApplicationRequest(MigrateApplicationRequest object) {
				return createMigrateApplicationRequestAdapter();
			}
			@Override
			public Adapter caseStartApplicationRequest(StartApplicationRequest object) {
				return createStartApplicationRequestAdapter();
			}
			@Override
			public Adapter caseSuspendApplicationRequest(SuspendApplicationRequest object) {
				return createSuspendApplicationRequestAdapter();
			}
			@Override
			public Adapter caseTerminateApplicationRequest(TerminateApplicationRequest object) {
				return createTerminateApplicationRequestAdapter();
			}
			@Override
			public Adapter caseChangeOptimizationIntervalRequest(ChangeOptimizationIntervalRequest object) {
				return createChangeOptimizationIntervalRequestAdapter();
			}
			@Override
			public Adapter caseReconfigureScalableImageConnectorRequest(ReconfigureScalableImageConnectorRequest object) {
				return createReconfigureScalableImageConnectorRequestAdapter();
			}
			@Override
			public Adapter caseSetPhysicalNodeStateRequest(SetPhysicalNodeStateRequest object) {
				return createSetPhysicalNodeStateRequestAdapter();
			}
			@Override
			public Adapter caseResumeApplicationRequest(ResumeApplicationRequest object) {
				return createResumeApplicationRequestAdapter();
			}
			@Override
			public Adapter caseExperimentScenarioRequest(ExperimentScenarioRequest object) {
				return createExperimentScenarioRequestAdapter();
			}
			@Override
			public Adapter caseIdentifier(Identifier object) {
				return createIdentifierAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link eu.cactosfp7.cactosim.experimentscenario.request.ReconfigureOptimizationAlgorithmRequest <em>Reconfigure Optimization Algorithm Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.cactosfp7.cactosim.experimentscenario.request.ReconfigureOptimizationAlgorithmRequest
	 * @generated
	 */
	public Adapter createReconfigureOptimizationAlgorithmRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.cactosfp7.cactosim.experimentscenario.request.MigrateApplicationRequest <em>Migrate Application Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.cactosfp7.cactosim.experimentscenario.request.MigrateApplicationRequest
	 * @generated
	 */
	public Adapter createMigrateApplicationRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.cactosfp7.cactosim.experimentscenario.request.StartApplicationRequest <em>Start Application Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.cactosfp7.cactosim.experimentscenario.request.StartApplicationRequest
	 * @generated
	 */
	public Adapter createStartApplicationRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.cactosfp7.cactosim.experimentscenario.request.SuspendApplicationRequest <em>Suspend Application Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.cactosfp7.cactosim.experimentscenario.request.SuspendApplicationRequest
	 * @generated
	 */
	public Adapter createSuspendApplicationRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.cactosfp7.cactosim.experimentscenario.request.TerminateApplicationRequest <em>Terminate Application Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.cactosfp7.cactosim.experimentscenario.request.TerminateApplicationRequest
	 * @generated
	 */
	public Adapter createTerminateApplicationRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.cactosfp7.cactosim.experimentscenario.request.ChangeOptimizationIntervalRequest <em>Change Optimization Interval Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.cactosfp7.cactosim.experimentscenario.request.ChangeOptimizationIntervalRequest
	 * @generated
	 */
	public Adapter createChangeOptimizationIntervalRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.cactosfp7.cactosim.experimentscenario.request.ReconfigureScalableImageConnectorRequest <em>Reconfigure Scalable Image Connector Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.cactosfp7.cactosim.experimentscenario.request.ReconfigureScalableImageConnectorRequest
	 * @generated
	 */
	public Adapter createReconfigureScalableImageConnectorRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.cactosfp7.cactosim.experimentscenario.request.SetPhysicalNodeStateRequest <em>Set Physical Node State Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.cactosfp7.cactosim.experimentscenario.request.SetPhysicalNodeStateRequest
	 * @generated
	 */
	public Adapter createSetPhysicalNodeStateRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.cactosfp7.cactosim.experimentscenario.request.ResumeApplicationRequest <em>Resume Application Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.cactosfp7.cactosim.experimentscenario.request.ResumeApplicationRequest
	 * @generated
	 */
	public Adapter createResumeApplicationRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.cactosfp7.cactosim.experimentscenario.request.ExperimentScenarioRequest <em>Experiment Scenario Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.cactosfp7.cactosim.experimentscenario.request.ExperimentScenarioRequest
	 * @generated
	 */
	public Adapter createExperimentScenarioRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.cactosfp7.identifier.Identifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.cactosfp7.identifier.Identifier
	 * @generated
	 */
    public Adapter createIdentifierAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //RequestAdapterFactory
