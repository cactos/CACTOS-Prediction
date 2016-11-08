/**
 */
package eu.cactosfp7.cactosim.experimentscenario.request.impl;

import eu.cactosfp7.cactosim.experimentscenario.request.ReconfigureOptimizationAlgorithmRequest;
import eu.cactosfp7.cactosim.experimentscenario.request.RequestPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reconfigure Optimization Algorithm Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.cactosim.experimentscenario.request.impl.ReconfigureOptimizationAlgorithmRequestImpl#getAlgorithmName <em>Algorithm Name</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.experimentscenario.request.impl.ReconfigureOptimizationAlgorithmRequestImpl#getAlgorithmParameters <em>Algorithm Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReconfigureOptimizationAlgorithmRequestImpl extends ExperimentScenarioRequestImpl implements ReconfigureOptimizationAlgorithmRequest {
	/**
	 * The default value of the '{@link #getAlgorithmName() <em>Algorithm Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgorithmName()
	 * @generated
	 * @ordered
	 */
	protected static final String ALGORITHM_NAME_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReconfigureOptimizationAlgorithmRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequestPackage.Literals.RECONFIGURE_OPTIMIZATION_ALGORITHM_REQUEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAlgorithmName() {
		return (String)eDynamicGet(RequestPackage.RECONFIGURE_OPTIMIZATION_ALGORITHM_REQUEST__ALGORITHM_NAME, RequestPackage.Literals.RECONFIGURE_OPTIMIZATION_ALGORITHM_REQUEST__ALGORITHM_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAlgorithmName(String newAlgorithmName) {
		eDynamicSet(RequestPackage.RECONFIGURE_OPTIMIZATION_ALGORITHM_REQUEST__ALGORITHM_NAME, RequestPackage.Literals.RECONFIGURE_OPTIMIZATION_ALGORITHM_REQUEST__ALGORITHM_NAME, newAlgorithmName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public EMap<String, String> getAlgorithmParameters() {
		return (EMap<String, String>)eDynamicGet(RequestPackage.RECONFIGURE_OPTIMIZATION_ALGORITHM_REQUEST__ALGORITHM_PARAMETERS, RequestPackage.Literals.RECONFIGURE_OPTIMIZATION_ALGORITHM_REQUEST__ALGORITHM_PARAMETERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RequestPackage.RECONFIGURE_OPTIMIZATION_ALGORITHM_REQUEST__ALGORITHM_PARAMETERS:
				return ((InternalEList<?>)getAlgorithmParameters()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RequestPackage.RECONFIGURE_OPTIMIZATION_ALGORITHM_REQUEST__ALGORITHM_NAME:
				return getAlgorithmName();
			case RequestPackage.RECONFIGURE_OPTIMIZATION_ALGORITHM_REQUEST__ALGORITHM_PARAMETERS:
				if (coreType) return getAlgorithmParameters();
				else return getAlgorithmParameters().map();
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
			case RequestPackage.RECONFIGURE_OPTIMIZATION_ALGORITHM_REQUEST__ALGORITHM_NAME:
				setAlgorithmName((String)newValue);
				return;
			case RequestPackage.RECONFIGURE_OPTIMIZATION_ALGORITHM_REQUEST__ALGORITHM_PARAMETERS:
				((EStructuralFeature.Setting)getAlgorithmParameters()).set(newValue);
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
			case RequestPackage.RECONFIGURE_OPTIMIZATION_ALGORITHM_REQUEST__ALGORITHM_NAME:
				setAlgorithmName(ALGORITHM_NAME_EDEFAULT);
				return;
			case RequestPackage.RECONFIGURE_OPTIMIZATION_ALGORITHM_REQUEST__ALGORITHM_PARAMETERS:
				getAlgorithmParameters().clear();
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
			case RequestPackage.RECONFIGURE_OPTIMIZATION_ALGORITHM_REQUEST__ALGORITHM_NAME:
				return ALGORITHM_NAME_EDEFAULT == null ? getAlgorithmName() != null : !ALGORITHM_NAME_EDEFAULT.equals(getAlgorithmName());
			case RequestPackage.RECONFIGURE_OPTIMIZATION_ALGORITHM_REQUEST__ALGORITHM_PARAMETERS:
				return !getAlgorithmParameters().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ReconfigureOptimizationAlgorithmRequestImpl
