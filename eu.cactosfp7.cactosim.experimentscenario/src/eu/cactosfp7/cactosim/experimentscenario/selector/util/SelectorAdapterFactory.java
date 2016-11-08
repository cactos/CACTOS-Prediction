/**
 */
package eu.cactosfp7.cactosim.experimentscenario.selector.util;

import eu.cactosfp7.cactosim.experimentscenario.selector.*;

import eu.cactosfp7.identifier.Identifier;
import eu.cactosfp7.infrastructuremodels.logicaldc.application.ApplicationInstance;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see eu.cactosfp7.cactosim.experimentscenario.selector.SelectorPackage
 * @generated
 */
public class SelectorAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SelectorPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectorAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SelectorPackage.eINSTANCE;
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
	protected SelectorSwitch<Adapter> modelSwitch =
		new SelectorSwitch<Adapter>() {
			@Override
			public <instanceTypeParameter extends ApplicationInstance> Adapter caseInitiallyRunningInstanceSelector(InitiallyRunningInstanceSelector<instanceTypeParameter> object) {
				return createInitiallyRunningInstanceSelectorAdapter();
			}
			@Override
			public <instanceTypeParameter extends ApplicationInstance> Adapter casePreviouslyStartedApplicationSelector(PreviouslyStartedApplicationSelector<instanceTypeParameter> object) {
				return createPreviouslyStartedApplicationSelectorAdapter();
			}
			@Override
			public Adapter casePreviouslySuspendedApplicationSelector(PreviouslySuspendedApplicationSelector object) {
				return createPreviouslySuspendedApplicationSelectorAdapter();
			}
			@Override
			public Adapter caseSuspendedInstanceSelector(SuspendedInstanceSelector object) {
				return createSuspendedInstanceSelectorAdapter();
			}
			@Override
			public Adapter caseBlackBoxApplicationInstanceSelector(BlackBoxApplicationInstanceSelector object) {
				return createBlackBoxApplicationInstanceSelectorAdapter();
			}
			@Override
			public Adapter caseNonWhiteBoxApplicationInstanceSelector(NonWhiteBoxApplicationInstanceSelector object) {
				return createNonWhiteBoxApplicationInstanceSelectorAdapter();
			}
			@Override
			public Adapter caseGreyBoxApplicationInstanceSelector(GreyBoxApplicationInstanceSelector object) {
				return createGreyBoxApplicationInstanceSelectorAdapter();
			}
			@Override
			public Adapter caseWhiteBoxApplicationInstanceSelector(WhiteBoxApplicationInstanceSelector object) {
				return createWhiteBoxApplicationInstanceSelectorAdapter();
			}
			@Override
			public Adapter caseInitiallyRunningWhiteBoxApplicationInstanceSelector(InitiallyRunningWhiteBoxApplicationInstanceSelector object) {
				return createInitiallyRunningWhiteBoxApplicationInstanceSelectorAdapter();
			}
			@Override
			public Adapter caseInitiallyRunningGreyBoxApplicationInstanceSelector(InitiallyRunningGreyBoxApplicationInstanceSelector object) {
				return createInitiallyRunningGreyBoxApplicationInstanceSelectorAdapter();
			}
			@Override
			public Adapter caseInitiallyRunningBlackBoxApplicationInstanceSelector(InitiallyRunningBlackBoxApplicationInstanceSelector object) {
				return createInitiallyRunningBlackBoxApplicationInstanceSelectorAdapter();
			}
			@Override
			public Adapter casePreviouslyStartedWhiteBoxApplicationInstanceSelector(PreviouslyStartedWhiteBoxApplicationInstanceSelector object) {
				return createPreviouslyStartedWhiteBoxApplicationInstanceSelectorAdapter();
			}
			@Override
			public Adapter casePreviouslyStartedBlackBoxApplicationSelector(PreviouslyStartedBlackBoxApplicationSelector object) {
				return createPreviouslyStartedBlackBoxApplicationSelectorAdapter();
			}
			@Override
			public Adapter casePreviouslyStartedGreyBoxApplicationSelector(PreviouslyStartedGreyBoxApplicationSelector object) {
				return createPreviouslyStartedGreyBoxApplicationSelectorAdapter();
			}
			@Override
			public Adapter caseApplicationInstanceSelector(ApplicationInstanceSelector object) {
				return createApplicationInstanceSelectorAdapter();
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
	 * Creates a new adapter for an object of class '{@link eu.cactosfp7.cactosim.experimentscenario.selector.InitiallyRunningInstanceSelector <em>Initially Running Instance Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.cactosfp7.cactosim.experimentscenario.selector.InitiallyRunningInstanceSelector
	 * @generated
	 */
	public Adapter createInitiallyRunningInstanceSelectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.cactosfp7.cactosim.experimentscenario.selector.PreviouslyStartedApplicationSelector <em>Previously Started Application Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.cactosfp7.cactosim.experimentscenario.selector.PreviouslyStartedApplicationSelector
	 * @generated
	 */
	public Adapter createPreviouslyStartedApplicationSelectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.cactosfp7.cactosim.experimentscenario.selector.PreviouslySuspendedApplicationSelector <em>Previously Suspended Application Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.cactosfp7.cactosim.experimentscenario.selector.PreviouslySuspendedApplicationSelector
	 * @generated
	 */
	public Adapter createPreviouslySuspendedApplicationSelectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.cactosfp7.cactosim.experimentscenario.selector.SuspendedInstanceSelector <em>Suspended Instance Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.cactosfp7.cactosim.experimentscenario.selector.SuspendedInstanceSelector
	 * @generated
	 */
	public Adapter createSuspendedInstanceSelectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.cactosfp7.cactosim.experimentscenario.selector.BlackBoxApplicationInstanceSelector <em>Black Box Application Instance Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.cactosfp7.cactosim.experimentscenario.selector.BlackBoxApplicationInstanceSelector
	 * @generated
	 */
	public Adapter createBlackBoxApplicationInstanceSelectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.cactosfp7.cactosim.experimentscenario.selector.NonWhiteBoxApplicationInstanceSelector <em>Non White Box Application Instance Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.cactosfp7.cactosim.experimentscenario.selector.NonWhiteBoxApplicationInstanceSelector
	 * @generated
	 */
	public Adapter createNonWhiteBoxApplicationInstanceSelectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.cactosfp7.cactosim.experimentscenario.selector.GreyBoxApplicationInstanceSelector <em>Grey Box Application Instance Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.cactosfp7.cactosim.experimentscenario.selector.GreyBoxApplicationInstanceSelector
	 * @generated
	 */
	public Adapter createGreyBoxApplicationInstanceSelectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.cactosfp7.cactosim.experimentscenario.selector.WhiteBoxApplicationInstanceSelector <em>White Box Application Instance Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.cactosfp7.cactosim.experimentscenario.selector.WhiteBoxApplicationInstanceSelector
	 * @generated
	 */
	public Adapter createWhiteBoxApplicationInstanceSelectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.cactosfp7.cactosim.experimentscenario.selector.InitiallyRunningWhiteBoxApplicationInstanceSelector <em>Initially Running White Box Application Instance Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.cactosfp7.cactosim.experimentscenario.selector.InitiallyRunningWhiteBoxApplicationInstanceSelector
	 * @generated
	 */
	public Adapter createInitiallyRunningWhiteBoxApplicationInstanceSelectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.cactosfp7.cactosim.experimentscenario.selector.InitiallyRunningGreyBoxApplicationInstanceSelector <em>Initially Running Grey Box Application Instance Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.cactosfp7.cactosim.experimentscenario.selector.InitiallyRunningGreyBoxApplicationInstanceSelector
	 * @generated
	 */
	public Adapter createInitiallyRunningGreyBoxApplicationInstanceSelectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.cactosfp7.cactosim.experimentscenario.selector.InitiallyRunningBlackBoxApplicationInstanceSelector <em>Initially Running Black Box Application Instance Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.cactosfp7.cactosim.experimentscenario.selector.InitiallyRunningBlackBoxApplicationInstanceSelector
	 * @generated
	 */
	public Adapter createInitiallyRunningBlackBoxApplicationInstanceSelectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.cactosfp7.cactosim.experimentscenario.selector.PreviouslyStartedWhiteBoxApplicationInstanceSelector <em>Previously Started White Box Application Instance Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.cactosfp7.cactosim.experimentscenario.selector.PreviouslyStartedWhiteBoxApplicationInstanceSelector
	 * @generated
	 */
	public Adapter createPreviouslyStartedWhiteBoxApplicationInstanceSelectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.cactosfp7.cactosim.experimentscenario.selector.PreviouslyStartedBlackBoxApplicationSelector <em>Previously Started Black Box Application Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.cactosfp7.cactosim.experimentscenario.selector.PreviouslyStartedBlackBoxApplicationSelector
	 * @generated
	 */
	public Adapter createPreviouslyStartedBlackBoxApplicationSelectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.cactosfp7.cactosim.experimentscenario.selector.PreviouslyStartedGreyBoxApplicationSelector <em>Previously Started Grey Box Application Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.cactosfp7.cactosim.experimentscenario.selector.PreviouslyStartedGreyBoxApplicationSelector
	 * @generated
	 */
	public Adapter createPreviouslyStartedGreyBoxApplicationSelectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.cactosfp7.cactosim.experimentscenario.selector.ApplicationInstanceSelector <em>Application Instance Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.cactosfp7.cactosim.experimentscenario.selector.ApplicationInstanceSelector
	 * @generated
	 */
	public Adapter createApplicationInstanceSelectorAdapter() {
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

} //SelectorAdapterFactory
