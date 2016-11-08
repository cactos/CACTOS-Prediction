/**
 */
package eu.cactosfp7.cactosim.experimentscenario.selector.impl;

import eu.cactosfp7.cactosim.experimentscenario.selector.InitiallyRunningInstanceSelector;
import eu.cactosfp7.cactosim.experimentscenario.selector.SelectorPackage;

import eu.cactosfp7.infrastructuremodels.logicaldc.application.ApplicationInstance;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Initially Running Instance Selector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.cactosim.experimentscenario.selector.impl.InitiallyRunningInstanceSelectorImpl#getApplicationInstance <em>Application Instance</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class InitiallyRunningInstanceSelectorImpl<instanceTypeParameter extends ApplicationInstance> extends ApplicationInstanceSelectorImpl implements InitiallyRunningInstanceSelector<instanceTypeParameter> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InitiallyRunningInstanceSelectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SelectorPackage.Literals.INITIALLY_RUNNING_INSTANCE_SELECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public instanceTypeParameter getApplicationInstance() {
		return (instanceTypeParameter)eDynamicGet(SelectorPackage.INITIALLY_RUNNING_INSTANCE_SELECTOR__APPLICATION_INSTANCE, SelectorPackage.Literals.INITIALLY_RUNNING_INSTANCE_SELECTOR__APPLICATION_INSTANCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public instanceTypeParameter basicGetApplicationInstance() {
		return (instanceTypeParameter)eDynamicGet(SelectorPackage.INITIALLY_RUNNING_INSTANCE_SELECTOR__APPLICATION_INSTANCE, SelectorPackage.Literals.INITIALLY_RUNNING_INSTANCE_SELECTOR__APPLICATION_INSTANCE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApplicationInstance(instanceTypeParameter newApplicationInstance) {
		eDynamicSet(SelectorPackage.INITIALLY_RUNNING_INSTANCE_SELECTOR__APPLICATION_INSTANCE, SelectorPackage.Literals.INITIALLY_RUNNING_INSTANCE_SELECTOR__APPLICATION_INSTANCE, newApplicationInstance);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SelectorPackage.INITIALLY_RUNNING_INSTANCE_SELECTOR__APPLICATION_INSTANCE:
				if (resolve) return getApplicationInstance();
				return basicGetApplicationInstance();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SelectorPackage.INITIALLY_RUNNING_INSTANCE_SELECTOR__APPLICATION_INSTANCE:
				setApplicationInstance((instanceTypeParameter)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SelectorPackage.INITIALLY_RUNNING_INSTANCE_SELECTOR__APPLICATION_INSTANCE:
				setApplicationInstance((instanceTypeParameter)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SelectorPackage.INITIALLY_RUNNING_INSTANCE_SELECTOR__APPLICATION_INSTANCE:
				return basicGetApplicationInstance() != null;
		}
		return super.eIsSet(featureID);
	}

} //InitiallyRunningInstanceSelectorImpl
