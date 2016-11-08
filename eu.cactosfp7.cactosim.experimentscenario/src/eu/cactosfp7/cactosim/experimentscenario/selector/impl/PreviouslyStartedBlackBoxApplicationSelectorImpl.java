/**
 */
package eu.cactosfp7.cactosim.experimentscenario.selector.impl;

import eu.cactosfp7.cactosim.experimentscenario.selector.PreviouslyStartedBlackBoxApplicationSelector;
import eu.cactosfp7.cactosim.experimentscenario.selector.SelectorPackage;

import eu.cactosfp7.infrastructuremodels.logicaldc.application.BlackBoxApplicationInstance;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Previously Started Black Box Application Selector</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PreviouslyStartedBlackBoxApplicationSelectorImpl extends PreviouslyStartedApplicationSelectorImpl<BlackBoxApplicationInstance> implements PreviouslyStartedBlackBoxApplicationSelector {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PreviouslyStartedBlackBoxApplicationSelectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SelectorPackage.Literals.PREVIOUSLY_STARTED_BLACK_BOX_APPLICATION_SELECTOR;
	}

} //PreviouslyStartedBlackBoxApplicationSelectorImpl
