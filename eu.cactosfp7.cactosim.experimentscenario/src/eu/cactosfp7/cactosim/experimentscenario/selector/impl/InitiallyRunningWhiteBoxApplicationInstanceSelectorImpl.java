/**
 */
package eu.cactosfp7.cactosim.experimentscenario.selector.impl;

import eu.cactosfp7.cactosim.experimentscenario.selector.InitiallyRunningInstanceSelector;
import eu.cactosfp7.cactosim.experimentscenario.selector.InitiallyRunningWhiteBoxApplicationInstanceSelector;
import eu.cactosfp7.cactosim.experimentscenario.selector.SelectorPackage;
import eu.cactosfp7.infrastructuremodels.logicaldc.application.WhiteBoxApplicationInstance;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Initially Running White Box Application Instance Selector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.cactosim.experimentscenario.selector.impl.InitiallyRunningWhiteBoxApplicationInstanceSelectorImpl#getApplicationInstance <em>Application Instance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InitiallyRunningWhiteBoxApplicationInstanceSelectorImpl extends WhiteBoxApplicationInstanceSelectorImpl implements InitiallyRunningWhiteBoxApplicationInstanceSelector {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InitiallyRunningWhiteBoxApplicationInstanceSelectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SelectorPackage.Literals.INITIALLY_RUNNING_WHITE_BOX_APPLICATION_INSTANCE_SELECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
    public WhiteBoxApplicationInstance getApplicationInstance() {
		return (WhiteBoxApplicationInstance)eDynamicGet(SelectorPackage.INITIALLY_RUNNING_WHITE_BOX_APPLICATION_INSTANCE_SELECTOR__APPLICATION_INSTANCE, SelectorPackage.Literals.INITIALLY_RUNNING_INSTANCE_SELECTOR__APPLICATION_INSTANCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhiteBoxApplicationInstance basicGetApplicationInstance() {
		return (WhiteBoxApplicationInstance)eDynamicGet(SelectorPackage.INITIALLY_RUNNING_WHITE_BOX_APPLICATION_INSTANCE_SELECTOR__APPLICATION_INSTANCE, SelectorPackage.Literals.INITIALLY_RUNNING_INSTANCE_SELECTOR__APPLICATION_INSTANCE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
    public void setApplicationInstance(WhiteBoxApplicationInstance newApplicationInstance) {
		eDynamicSet(SelectorPackage.INITIALLY_RUNNING_WHITE_BOX_APPLICATION_INSTANCE_SELECTOR__APPLICATION_INSTANCE, SelectorPackage.Literals.INITIALLY_RUNNING_INSTANCE_SELECTOR__APPLICATION_INSTANCE, newApplicationInstance);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SelectorPackage.INITIALLY_RUNNING_WHITE_BOX_APPLICATION_INSTANCE_SELECTOR__APPLICATION_INSTANCE:
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
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SelectorPackage.INITIALLY_RUNNING_WHITE_BOX_APPLICATION_INSTANCE_SELECTOR__APPLICATION_INSTANCE:
				setApplicationInstance((WhiteBoxApplicationInstance)newValue);
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
			case SelectorPackage.INITIALLY_RUNNING_WHITE_BOX_APPLICATION_INSTANCE_SELECTOR__APPLICATION_INSTANCE:
				setApplicationInstance((WhiteBoxApplicationInstance)null);
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
			case SelectorPackage.INITIALLY_RUNNING_WHITE_BOX_APPLICATION_INSTANCE_SELECTOR__APPLICATION_INSTANCE:
				return basicGetApplicationInstance() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == InitiallyRunningInstanceSelector.class) {
			switch (derivedFeatureID) {
				case SelectorPackage.INITIALLY_RUNNING_WHITE_BOX_APPLICATION_INSTANCE_SELECTOR__APPLICATION_INSTANCE: return SelectorPackage.INITIALLY_RUNNING_INSTANCE_SELECTOR__APPLICATION_INSTANCE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == InitiallyRunningInstanceSelector.class) {
			switch (baseFeatureID) {
				case SelectorPackage.INITIALLY_RUNNING_INSTANCE_SELECTOR__APPLICATION_INSTANCE: return SelectorPackage.INITIALLY_RUNNING_WHITE_BOX_APPLICATION_INSTANCE_SELECTOR__APPLICATION_INSTANCE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //InitiallyRunningWhiteBoxApplicationInstanceSelectorImpl
