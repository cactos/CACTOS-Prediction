/**
 */
package eu.cactosfp7.cactosim.experimentscenario.util;

import eu.cactosfp7.cactosim.experimentscenario.*;

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
 * @see eu.cactosfp7.cactosim.experimentscenario.ExperimentscenarioPackage
 * @generated
 */
public class ExperimentscenarioAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ExperimentscenarioPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExperimentscenarioAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ExperimentscenarioPackage.eINSTANCE;
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
	protected ExperimentscenarioSwitch<Adapter> modelSwitch =
		new ExperimentscenarioSwitch<Adapter>() {
			@Override
			public Adapter caseAbsoluteTimeEvent(AbsoluteTimeEvent object) {
				return createAbsoluteTimeEventAdapter();
			}
			@Override
			public Adapter caseTimeLineEvent(TimeLineEvent object) {
				return createTimeLineEventAdapter();
			}
			@Override
			public Adapter caseExperimentScenarioTimeLine(ExperimentScenarioTimeLine object) {
				return createExperimentScenarioTimeLineAdapter();
			}
			@Override
			public Adapter caseRelativeTimeEvent(RelativeTimeEvent object) {
				return createRelativeTimeEventAdapter();
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
	 * Creates a new adapter for an object of class '{@link eu.cactosfp7.cactosim.experimentscenario.AbsoluteTimeEvent <em>Absolute Time Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.cactosfp7.cactosim.experimentscenario.AbsoluteTimeEvent
	 * @generated
	 */
	public Adapter createAbsoluteTimeEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.cactosfp7.cactosim.experimentscenario.TimeLineEvent <em>Time Line Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.cactosfp7.cactosim.experimentscenario.TimeLineEvent
	 * @generated
	 */
	public Adapter createTimeLineEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.cactosfp7.cactosim.experimentscenario.ExperimentScenarioTimeLine <em>Experiment Scenario Time Line</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.cactosfp7.cactosim.experimentscenario.ExperimentScenarioTimeLine
	 * @generated
	 */
	public Adapter createExperimentScenarioTimeLineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.cactosfp7.cactosim.experimentscenario.RelativeTimeEvent <em>Relative Time Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.cactosfp7.cactosim.experimentscenario.RelativeTimeEvent
	 * @generated
	 */
	public Adapter createRelativeTimeEventAdapter() {
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

} //ExperimentscenarioAdapterFactory
