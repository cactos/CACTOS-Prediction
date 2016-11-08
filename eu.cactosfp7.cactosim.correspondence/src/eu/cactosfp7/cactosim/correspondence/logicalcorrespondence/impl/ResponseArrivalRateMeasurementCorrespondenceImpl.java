/**
 */
package eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl;

import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalcorrespondencePackage;
import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ResponseArrivalRateMeasurementCorrespondence;
import eu.cactosfp7.infrastructuremodels.load.logical.ResponseArrivalRateMeasurement;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Response Arrival Rate Measurement Correspondence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.ResponseArrivalRateMeasurementCorrespondenceImpl#getResponseArrivalRateMeasurement <em>Response Arrival Rate Measurement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResponseArrivalRateMeasurementCorrespondenceImpl extends ArrivalRateMeasurementCorrespondenceImpl implements ResponseArrivalRateMeasurementCorrespondence {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResponseArrivalRateMeasurementCorrespondenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogicalcorrespondencePackage.Literals.RESPONSE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseArrivalRateMeasurement getResponseArrivalRateMeasurement() {
		return (ResponseArrivalRateMeasurement)eDynamicGet(LogicalcorrespondencePackage.RESPONSE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__RESPONSE_ARRIVAL_RATE_MEASUREMENT, LogicalcorrespondencePackage.Literals.RESPONSE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__RESPONSE_ARRIVAL_RATE_MEASUREMENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseArrivalRateMeasurement basicGetResponseArrivalRateMeasurement() {
		return (ResponseArrivalRateMeasurement)eDynamicGet(LogicalcorrespondencePackage.RESPONSE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__RESPONSE_ARRIVAL_RATE_MEASUREMENT, LogicalcorrespondencePackage.Literals.RESPONSE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__RESPONSE_ARRIVAL_RATE_MEASUREMENT, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponseArrivalRateMeasurement(ResponseArrivalRateMeasurement newResponseArrivalRateMeasurement) {
		eDynamicSet(LogicalcorrespondencePackage.RESPONSE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__RESPONSE_ARRIVAL_RATE_MEASUREMENT, LogicalcorrespondencePackage.Literals.RESPONSE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__RESPONSE_ARRIVAL_RATE_MEASUREMENT, newResponseArrivalRateMeasurement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LogicalcorrespondencePackage.RESPONSE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__RESPONSE_ARRIVAL_RATE_MEASUREMENT:
				if (resolve) return getResponseArrivalRateMeasurement();
				return basicGetResponseArrivalRateMeasurement();
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
			case LogicalcorrespondencePackage.RESPONSE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__RESPONSE_ARRIVAL_RATE_MEASUREMENT:
				setResponseArrivalRateMeasurement((ResponseArrivalRateMeasurement)newValue);
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
			case LogicalcorrespondencePackage.RESPONSE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__RESPONSE_ARRIVAL_RATE_MEASUREMENT:
				setResponseArrivalRateMeasurement((ResponseArrivalRateMeasurement)null);
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
			case LogicalcorrespondencePackage.RESPONSE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__RESPONSE_ARRIVAL_RATE_MEASUREMENT:
				return basicGetResponseArrivalRateMeasurement() != null;
		}
		return super.eIsSet(featureID);
	}

} //ResponseArrivalRateMeasurementCorrespondenceImpl
