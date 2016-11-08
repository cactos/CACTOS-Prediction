/**
 */
package eu.cactosfp7.cactosim.experimentscenario.selector.impl;

import eu.cactosfp7.cactosim.experimentscenario.selector.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SelectorFactoryImpl extends EFactoryImpl implements SelectorFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SelectorFactory init() {
		try {
			SelectorFactory theSelectorFactory = (SelectorFactory)EPackage.Registry.INSTANCE.getEFactory(SelectorPackage.eNS_URI);
			if (theSelectorFactory != null) {
				return theSelectorFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SelectorFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectorFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SelectorPackage.PREVIOUSLY_SUSPENDED_APPLICATION_SELECTOR: return createPreviouslySuspendedApplicationSelector();
			case SelectorPackage.SUSPENDED_INSTANCE_SELECTOR: return createSuspendedInstanceSelector();
			case SelectorPackage.INITIALLY_RUNNING_WHITE_BOX_APPLICATION_INSTANCE_SELECTOR: return createInitiallyRunningWhiteBoxApplicationInstanceSelector();
			case SelectorPackage.INITIALLY_RUNNING_GREY_BOX_APPLICATION_INSTANCE_SELECTOR: return createInitiallyRunningGreyBoxApplicationInstanceSelector();
			case SelectorPackage.INITIALLY_RUNNING_BLACK_BOX_APPLICATION_INSTANCE_SELECTOR: return createInitiallyRunningBlackBoxApplicationInstanceSelector();
			case SelectorPackage.PREVIOUSLY_STARTED_WHITE_BOX_APPLICATION_INSTANCE_SELECTOR: return createPreviouslyStartedWhiteBoxApplicationInstanceSelector();
			case SelectorPackage.PREVIOUSLY_STARTED_BLACK_BOX_APPLICATION_SELECTOR: return createPreviouslyStartedBlackBoxApplicationSelector();
			case SelectorPackage.PREVIOUSLY_STARTED_GREY_BOX_APPLICATION_SELECTOR: return createPreviouslyStartedGreyBoxApplicationSelector();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PreviouslySuspendedApplicationSelector createPreviouslySuspendedApplicationSelector() {
		PreviouslySuspendedApplicationSelectorImpl previouslySuspendedApplicationSelector = new PreviouslySuspendedApplicationSelectorImpl();
		return previouslySuspendedApplicationSelector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SuspendedInstanceSelector createSuspendedInstanceSelector() {
		SuspendedInstanceSelectorImpl suspendedInstanceSelector = new SuspendedInstanceSelectorImpl();
		return suspendedInstanceSelector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InitiallyRunningWhiteBoxApplicationInstanceSelector createInitiallyRunningWhiteBoxApplicationInstanceSelector() {
		InitiallyRunningWhiteBoxApplicationInstanceSelectorImpl initiallyRunningWhiteBoxApplicationInstanceSelector = new InitiallyRunningWhiteBoxApplicationInstanceSelectorImpl();
		return initiallyRunningWhiteBoxApplicationInstanceSelector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InitiallyRunningGreyBoxApplicationInstanceSelector createInitiallyRunningGreyBoxApplicationInstanceSelector() {
		InitiallyRunningGreyBoxApplicationInstanceSelectorImpl initiallyRunningGreyBoxApplicationInstanceSelector = new InitiallyRunningGreyBoxApplicationInstanceSelectorImpl();
		return initiallyRunningGreyBoxApplicationInstanceSelector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InitiallyRunningBlackBoxApplicationInstanceSelector createInitiallyRunningBlackBoxApplicationInstanceSelector() {
		InitiallyRunningBlackBoxApplicationInstanceSelectorImpl initiallyRunningBlackBoxApplicationInstanceSelector = new InitiallyRunningBlackBoxApplicationInstanceSelectorImpl();
		return initiallyRunningBlackBoxApplicationInstanceSelector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PreviouslyStartedWhiteBoxApplicationInstanceSelector createPreviouslyStartedWhiteBoxApplicationInstanceSelector() {
		PreviouslyStartedWhiteBoxApplicationInstanceSelectorImpl previouslyStartedWhiteBoxApplicationInstanceSelector = new PreviouslyStartedWhiteBoxApplicationInstanceSelectorImpl();
		return previouslyStartedWhiteBoxApplicationInstanceSelector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PreviouslyStartedBlackBoxApplicationSelector createPreviouslyStartedBlackBoxApplicationSelector() {
		PreviouslyStartedBlackBoxApplicationSelectorImpl previouslyStartedBlackBoxApplicationSelector = new PreviouslyStartedBlackBoxApplicationSelectorImpl();
		return previouslyStartedBlackBoxApplicationSelector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PreviouslyStartedGreyBoxApplicationSelector createPreviouslyStartedGreyBoxApplicationSelector() {
		PreviouslyStartedGreyBoxApplicationSelectorImpl previouslyStartedGreyBoxApplicationSelector = new PreviouslyStartedGreyBoxApplicationSelectorImpl();
		return previouslyStartedGreyBoxApplicationSelector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SelectorPackage getSelectorPackage() {
		return (SelectorPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SelectorPackage getPackage() {
		return SelectorPackage.eINSTANCE;
	}

} //SelectorFactoryImpl
