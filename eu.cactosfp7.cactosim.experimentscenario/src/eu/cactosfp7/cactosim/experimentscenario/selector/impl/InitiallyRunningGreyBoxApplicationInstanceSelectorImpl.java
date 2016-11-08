/**
 */
package eu.cactosfp7.cactosim.experimentscenario.selector.impl;

import eu.cactosfp7.cactosim.experimentscenario.selector.InitiallyRunningGreyBoxApplicationInstanceSelector;
import eu.cactosfp7.cactosim.experimentscenario.selector.SelectorPackage;

import eu.cactosfp7.infrastructuremodels.logicaldc.application.GreyBoxApplicationInstance;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Initially Running Grey Box Application Instance Selector</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class InitiallyRunningGreyBoxApplicationInstanceSelectorImpl extends InitiallyRunningInstanceSelectorImpl<GreyBoxApplicationInstance> implements InitiallyRunningGreyBoxApplicationInstanceSelector {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InitiallyRunningGreyBoxApplicationInstanceSelectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SelectorPackage.Literals.INITIALLY_RUNNING_GREY_BOX_APPLICATION_INSTANCE_SELECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setApplicationInstance(GreyBoxApplicationInstance newApplicationInstance) {
		super.setApplicationInstance(newApplicationInstance);
	}

} //InitiallyRunningGreyBoxApplicationInstanceSelectorImpl
