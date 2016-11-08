/**
 */
package eu.cactosfp7.cactosim.experimentscenario.selector.util;

import eu.cactosfp7.cactosim.experimentscenario.selector.*;

import eu.cactosfp7.identifier.Identifier;
import eu.cactosfp7.infrastructuremodels.logicaldc.application.ApplicationInstance;

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
 * @see eu.cactosfp7.cactosim.experimentscenario.selector.SelectorPackage
 * @generated
 */
public class SelectorSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SelectorPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectorSwitch() {
		if (modelPackage == null) {
			modelPackage = SelectorPackage.eINSTANCE;
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
			case SelectorPackage.INITIALLY_RUNNING_INSTANCE_SELECTOR: {
				InitiallyRunningInstanceSelector<?> initiallyRunningInstanceSelector = (InitiallyRunningInstanceSelector<?>)theEObject;
				T result = caseInitiallyRunningInstanceSelector(initiallyRunningInstanceSelector);
				if (result == null) result = caseApplicationInstanceSelector(initiallyRunningInstanceSelector);
				if (result == null) result = caseIdentifier(initiallyRunningInstanceSelector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SelectorPackage.PREVIOUSLY_STARTED_APPLICATION_SELECTOR: {
				PreviouslyStartedApplicationSelector<?> previouslyStartedApplicationSelector = (PreviouslyStartedApplicationSelector<?>)theEObject;
				T result = casePreviouslyStartedApplicationSelector(previouslyStartedApplicationSelector);
				if (result == null) result = caseApplicationInstanceSelector(previouslyStartedApplicationSelector);
				if (result == null) result = caseIdentifier(previouslyStartedApplicationSelector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SelectorPackage.PREVIOUSLY_SUSPENDED_APPLICATION_SELECTOR: {
				PreviouslySuspendedApplicationSelector previouslySuspendedApplicationSelector = (PreviouslySuspendedApplicationSelector)theEObject;
				T result = casePreviouslySuspendedApplicationSelector(previouslySuspendedApplicationSelector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SelectorPackage.SUSPENDED_INSTANCE_SELECTOR: {
				SuspendedInstanceSelector suspendedInstanceSelector = (SuspendedInstanceSelector)theEObject;
				T result = caseSuspendedInstanceSelector(suspendedInstanceSelector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SelectorPackage.BLACK_BOX_APPLICATION_INSTANCE_SELECTOR: {
				BlackBoxApplicationInstanceSelector blackBoxApplicationInstanceSelector = (BlackBoxApplicationInstanceSelector)theEObject;
				T result = caseBlackBoxApplicationInstanceSelector(blackBoxApplicationInstanceSelector);
				if (result == null) result = caseNonWhiteBoxApplicationInstanceSelector(blackBoxApplicationInstanceSelector);
				if (result == null) result = caseApplicationInstanceSelector(blackBoxApplicationInstanceSelector);
				if (result == null) result = caseIdentifier(blackBoxApplicationInstanceSelector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SelectorPackage.NON_WHITE_BOX_APPLICATION_INSTANCE_SELECTOR: {
				NonWhiteBoxApplicationInstanceSelector nonWhiteBoxApplicationInstanceSelector = (NonWhiteBoxApplicationInstanceSelector)theEObject;
				T result = caseNonWhiteBoxApplicationInstanceSelector(nonWhiteBoxApplicationInstanceSelector);
				if (result == null) result = caseApplicationInstanceSelector(nonWhiteBoxApplicationInstanceSelector);
				if (result == null) result = caseIdentifier(nonWhiteBoxApplicationInstanceSelector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SelectorPackage.GREY_BOX_APPLICATION_INSTANCE_SELECTOR: {
				GreyBoxApplicationInstanceSelector greyBoxApplicationInstanceSelector = (GreyBoxApplicationInstanceSelector)theEObject;
				T result = caseGreyBoxApplicationInstanceSelector(greyBoxApplicationInstanceSelector);
				if (result == null) result = caseNonWhiteBoxApplicationInstanceSelector(greyBoxApplicationInstanceSelector);
				if (result == null) result = caseApplicationInstanceSelector(greyBoxApplicationInstanceSelector);
				if (result == null) result = caseIdentifier(greyBoxApplicationInstanceSelector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SelectorPackage.WHITE_BOX_APPLICATION_INSTANCE_SELECTOR: {
				WhiteBoxApplicationInstanceSelector whiteBoxApplicationInstanceSelector = (WhiteBoxApplicationInstanceSelector)theEObject;
				T result = caseWhiteBoxApplicationInstanceSelector(whiteBoxApplicationInstanceSelector);
				if (result == null) result = caseApplicationInstanceSelector(whiteBoxApplicationInstanceSelector);
				if (result == null) result = caseIdentifier(whiteBoxApplicationInstanceSelector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SelectorPackage.INITIALLY_RUNNING_WHITE_BOX_APPLICATION_INSTANCE_SELECTOR: {
				InitiallyRunningWhiteBoxApplicationInstanceSelector initiallyRunningWhiteBoxApplicationInstanceSelector = (InitiallyRunningWhiteBoxApplicationInstanceSelector)theEObject;
				T result = caseInitiallyRunningWhiteBoxApplicationInstanceSelector(initiallyRunningWhiteBoxApplicationInstanceSelector);
				if (result == null) result = caseWhiteBoxApplicationInstanceSelector(initiallyRunningWhiteBoxApplicationInstanceSelector);
				if (result == null) result = caseInitiallyRunningInstanceSelector(initiallyRunningWhiteBoxApplicationInstanceSelector);
				if (result == null) result = caseApplicationInstanceSelector(initiallyRunningWhiteBoxApplicationInstanceSelector);
				if (result == null) result = caseIdentifier(initiallyRunningWhiteBoxApplicationInstanceSelector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SelectorPackage.INITIALLY_RUNNING_GREY_BOX_APPLICATION_INSTANCE_SELECTOR: {
				InitiallyRunningGreyBoxApplicationInstanceSelector initiallyRunningGreyBoxApplicationInstanceSelector = (InitiallyRunningGreyBoxApplicationInstanceSelector)theEObject;
				T result = caseInitiallyRunningGreyBoxApplicationInstanceSelector(initiallyRunningGreyBoxApplicationInstanceSelector);
				if (result == null) result = caseInitiallyRunningInstanceSelector(initiallyRunningGreyBoxApplicationInstanceSelector);
				if (result == null) result = caseGreyBoxApplicationInstanceSelector(initiallyRunningGreyBoxApplicationInstanceSelector);
				if (result == null) result = caseNonWhiteBoxApplicationInstanceSelector(initiallyRunningGreyBoxApplicationInstanceSelector);
				if (result == null) result = caseApplicationInstanceSelector(initiallyRunningGreyBoxApplicationInstanceSelector);
				if (result == null) result = caseIdentifier(initiallyRunningGreyBoxApplicationInstanceSelector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SelectorPackage.INITIALLY_RUNNING_BLACK_BOX_APPLICATION_INSTANCE_SELECTOR: {
				InitiallyRunningBlackBoxApplicationInstanceSelector initiallyRunningBlackBoxApplicationInstanceSelector = (InitiallyRunningBlackBoxApplicationInstanceSelector)theEObject;
				T result = caseInitiallyRunningBlackBoxApplicationInstanceSelector(initiallyRunningBlackBoxApplicationInstanceSelector);
				if (result == null) result = caseBlackBoxApplicationInstanceSelector(initiallyRunningBlackBoxApplicationInstanceSelector);
				if (result == null) result = caseInitiallyRunningInstanceSelector(initiallyRunningBlackBoxApplicationInstanceSelector);
				if (result == null) result = caseNonWhiteBoxApplicationInstanceSelector(initiallyRunningBlackBoxApplicationInstanceSelector);
				if (result == null) result = caseApplicationInstanceSelector(initiallyRunningBlackBoxApplicationInstanceSelector);
				if (result == null) result = caseIdentifier(initiallyRunningBlackBoxApplicationInstanceSelector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SelectorPackage.PREVIOUSLY_STARTED_WHITE_BOX_APPLICATION_INSTANCE_SELECTOR: {
				PreviouslyStartedWhiteBoxApplicationInstanceSelector previouslyStartedWhiteBoxApplicationInstanceSelector = (PreviouslyStartedWhiteBoxApplicationInstanceSelector)theEObject;
				T result = casePreviouslyStartedWhiteBoxApplicationInstanceSelector(previouslyStartedWhiteBoxApplicationInstanceSelector);
				if (result == null) result = caseWhiteBoxApplicationInstanceSelector(previouslyStartedWhiteBoxApplicationInstanceSelector);
				if (result == null) result = casePreviouslyStartedApplicationSelector(previouslyStartedWhiteBoxApplicationInstanceSelector);
				if (result == null) result = caseApplicationInstanceSelector(previouslyStartedWhiteBoxApplicationInstanceSelector);
				if (result == null) result = caseIdentifier(previouslyStartedWhiteBoxApplicationInstanceSelector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SelectorPackage.PREVIOUSLY_STARTED_BLACK_BOX_APPLICATION_SELECTOR: {
				PreviouslyStartedBlackBoxApplicationSelector previouslyStartedBlackBoxApplicationSelector = (PreviouslyStartedBlackBoxApplicationSelector)theEObject;
				T result = casePreviouslyStartedBlackBoxApplicationSelector(previouslyStartedBlackBoxApplicationSelector);
				if (result == null) result = casePreviouslyStartedApplicationSelector(previouslyStartedBlackBoxApplicationSelector);
				if (result == null) result = caseBlackBoxApplicationInstanceSelector(previouslyStartedBlackBoxApplicationSelector);
				if (result == null) result = caseNonWhiteBoxApplicationInstanceSelector(previouslyStartedBlackBoxApplicationSelector);
				if (result == null) result = caseApplicationInstanceSelector(previouslyStartedBlackBoxApplicationSelector);
				if (result == null) result = caseIdentifier(previouslyStartedBlackBoxApplicationSelector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SelectorPackage.PREVIOUSLY_STARTED_GREY_BOX_APPLICATION_SELECTOR: {
				PreviouslyStartedGreyBoxApplicationSelector previouslyStartedGreyBoxApplicationSelector = (PreviouslyStartedGreyBoxApplicationSelector)theEObject;
				T result = casePreviouslyStartedGreyBoxApplicationSelector(previouslyStartedGreyBoxApplicationSelector);
				if (result == null) result = casePreviouslyStartedApplicationSelector(previouslyStartedGreyBoxApplicationSelector);
				if (result == null) result = caseGreyBoxApplicationInstanceSelector(previouslyStartedGreyBoxApplicationSelector);
				if (result == null) result = caseNonWhiteBoxApplicationInstanceSelector(previouslyStartedGreyBoxApplicationSelector);
				if (result == null) result = caseApplicationInstanceSelector(previouslyStartedGreyBoxApplicationSelector);
				if (result == null) result = caseIdentifier(previouslyStartedGreyBoxApplicationSelector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SelectorPackage.APPLICATION_INSTANCE_SELECTOR: {
				ApplicationInstanceSelector applicationInstanceSelector = (ApplicationInstanceSelector)theEObject;
				T result = caseApplicationInstanceSelector(applicationInstanceSelector);
				if (result == null) result = caseIdentifier(applicationInstanceSelector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Initially Running Instance Selector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initially Running Instance Selector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <instanceTypeParameter extends ApplicationInstance> T caseInitiallyRunningInstanceSelector(InitiallyRunningInstanceSelector<instanceTypeParameter> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Previously Started Application Selector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Previously Started Application Selector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <instanceTypeParameter extends ApplicationInstance> T casePreviouslyStartedApplicationSelector(PreviouslyStartedApplicationSelector<instanceTypeParameter> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Previously Suspended Application Selector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Previously Suspended Application Selector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePreviouslySuspendedApplicationSelector(PreviouslySuspendedApplicationSelector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Suspended Instance Selector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Suspended Instance Selector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuspendedInstanceSelector(SuspendedInstanceSelector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Black Box Application Instance Selector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Black Box Application Instance Selector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlackBoxApplicationInstanceSelector(BlackBoxApplicationInstanceSelector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Non White Box Application Instance Selector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Non White Box Application Instance Selector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNonWhiteBoxApplicationInstanceSelector(NonWhiteBoxApplicationInstanceSelector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Grey Box Application Instance Selector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Grey Box Application Instance Selector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGreyBoxApplicationInstanceSelector(GreyBoxApplicationInstanceSelector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>White Box Application Instance Selector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>White Box Application Instance Selector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWhiteBoxApplicationInstanceSelector(WhiteBoxApplicationInstanceSelector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Initially Running White Box Application Instance Selector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initially Running White Box Application Instance Selector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInitiallyRunningWhiteBoxApplicationInstanceSelector(InitiallyRunningWhiteBoxApplicationInstanceSelector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Initially Running Grey Box Application Instance Selector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initially Running Grey Box Application Instance Selector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInitiallyRunningGreyBoxApplicationInstanceSelector(InitiallyRunningGreyBoxApplicationInstanceSelector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Initially Running Black Box Application Instance Selector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initially Running Black Box Application Instance Selector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInitiallyRunningBlackBoxApplicationInstanceSelector(InitiallyRunningBlackBoxApplicationInstanceSelector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Previously Started White Box Application Instance Selector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Previously Started White Box Application Instance Selector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePreviouslyStartedWhiteBoxApplicationInstanceSelector(PreviouslyStartedWhiteBoxApplicationInstanceSelector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Previously Started Black Box Application Selector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Previously Started Black Box Application Selector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePreviouslyStartedBlackBoxApplicationSelector(PreviouslyStartedBlackBoxApplicationSelector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Previously Started Grey Box Application Selector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Previously Started Grey Box Application Selector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePreviouslyStartedGreyBoxApplicationSelector(PreviouslyStartedGreyBoxApplicationSelector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application Instance Selector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application Instance Selector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplicationInstanceSelector(ApplicationInstanceSelector object) {
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

} //SelectorSwitch
