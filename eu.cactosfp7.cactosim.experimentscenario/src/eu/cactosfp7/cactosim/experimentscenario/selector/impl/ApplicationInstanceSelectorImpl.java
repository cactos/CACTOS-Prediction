/**
 */
package eu.cactosfp7.cactosim.experimentscenario.selector.impl;

import eu.cactosfp7.cactosim.experimentscenario.selector.ApplicationInstanceSelector;
import eu.cactosfp7.cactosim.experimentscenario.selector.SelectorPackage;

import eu.cactosfp7.identifier.impl.IdentifierImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application Instance Selector</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class ApplicationInstanceSelectorImpl extends IdentifierImpl implements ApplicationInstanceSelector {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationInstanceSelectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SelectorPackage.Literals.APPLICATION_INSTANCE_SELECTOR;
	}

} //ApplicationInstanceSelectorImpl
