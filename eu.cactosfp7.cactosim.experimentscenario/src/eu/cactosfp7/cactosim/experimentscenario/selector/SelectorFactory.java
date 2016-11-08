/**
 */
package eu.cactosfp7.cactosim.experimentscenario.selector;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see eu.cactosfp7.cactosim.experimentscenario.selector.SelectorPackage
 * @generated
 */
public interface SelectorFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SelectorFactory eINSTANCE = eu.cactosfp7.cactosim.experimentscenario.selector.impl.SelectorFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Previously Suspended Application Selector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Previously Suspended Application Selector</em>'.
	 * @generated
	 */
	PreviouslySuspendedApplicationSelector createPreviouslySuspendedApplicationSelector();

	/**
	 * Returns a new object of class '<em>Suspended Instance Selector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Suspended Instance Selector</em>'.
	 * @generated
	 */
	SuspendedInstanceSelector createSuspendedInstanceSelector();

	/**
	 * Returns a new object of class '<em>Initially Running White Box Application Instance Selector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Initially Running White Box Application Instance Selector</em>'.
	 * @generated
	 */
	InitiallyRunningWhiteBoxApplicationInstanceSelector createInitiallyRunningWhiteBoxApplicationInstanceSelector();

	/**
	 * Returns a new object of class '<em>Initially Running Grey Box Application Instance Selector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Initially Running Grey Box Application Instance Selector</em>'.
	 * @generated
	 */
	InitiallyRunningGreyBoxApplicationInstanceSelector createInitiallyRunningGreyBoxApplicationInstanceSelector();

	/**
	 * Returns a new object of class '<em>Initially Running Black Box Application Instance Selector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Initially Running Black Box Application Instance Selector</em>'.
	 * @generated
	 */
	InitiallyRunningBlackBoxApplicationInstanceSelector createInitiallyRunningBlackBoxApplicationInstanceSelector();

	/**
	 * Returns a new object of class '<em>Previously Started White Box Application Instance Selector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Previously Started White Box Application Instance Selector</em>'.
	 * @generated
	 */
	PreviouslyStartedWhiteBoxApplicationInstanceSelector createPreviouslyStartedWhiteBoxApplicationInstanceSelector();

	/**
	 * Returns a new object of class '<em>Previously Started Black Box Application Selector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Previously Started Black Box Application Selector</em>'.
	 * @generated
	 */
	PreviouslyStartedBlackBoxApplicationSelector createPreviouslyStartedBlackBoxApplicationSelector();

	/**
	 * Returns a new object of class '<em>Previously Started Grey Box Application Selector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Previously Started Grey Box Application Selector</em>'.
	 * @generated
	 */
	PreviouslyStartedGreyBoxApplicationSelector createPreviouslyStartedGreyBoxApplicationSelector();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SelectorPackage getSelectorPackage();

} //SelectorFactory
