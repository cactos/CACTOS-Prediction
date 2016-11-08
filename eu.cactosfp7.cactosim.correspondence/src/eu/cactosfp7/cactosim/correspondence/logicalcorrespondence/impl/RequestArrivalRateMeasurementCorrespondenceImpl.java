/**
 */
package eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl;

import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalcorrespondencePackage;
import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.RequestArrivalRateMeasurementCorrespondence;
import eu.cactosfp7.infrastructuremodels.load.logical.RequestArrivalRateMeasurement;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Request Arrival Rate Measurement Correspondence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.RequestArrivalRateMeasurementCorrespondenceImpl#getRequestArrivalRateMeasurement <em>Request Arrival Rate Measurement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequestArrivalRateMeasurementCorrespondenceImpl extends ArrivalRateMeasurementCorrespondenceImpl implements RequestArrivalRateMeasurementCorrespondence {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequestArrivalRateMeasurementCorrespondenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogicalcorrespondencePackage.Literals.REQUEST_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestArrivalRateMeasurement getRequestArrivalRateMeasurement() {
		return (RequestArrivalRateMeasurement)eDynamicGet(LogicalcorrespondencePackage.REQUEST_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__REQUEST_ARRIVAL_RATE_MEASUREMENT, LogicalcorrespondencePackage.Literals.REQUEST_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__REQUEST_ARRIVAL_RATE_MEASUREMENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestArrivalRateMeasurement basicGetRequestArrivalRateMeasurement() {
		return (RequestArrivalRateMeasurement)eDynamicGet(LogicalcorrespondencePackage.REQUEST_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__REQUEST_ARRIVAL_RATE_MEASUREMENT, LogicalcorrespondencePackage.Literals.REQUEST_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__REQUEST_ARRIVAL_RATE_MEASUREMENT, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestArrivalRateMeasurement(RequestArrivalRateMeasurement newRequestArrivalRateMeasurement) {
		eDynamicSet(LogicalcorrespondencePackage.REQUEST_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__REQUEST_ARRIVAL_RATE_MEASUREMENT, LogicalcorrespondencePackage.Literals.REQUEST_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__REQUEST_ARRIVAL_RATE_MEASUREMENT, newRequestArrivalRateMeasurement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LogicalcorrespondencePackage.REQUEST_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__REQUEST_ARRIVAL_RATE_MEASUREMENT:
				if (resolve) return getRequestArrivalRateMeasurement();
				return basicGetRequestArrivalRateMeasurement();
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
			case LogicalcorrespondencePackage.REQUEST_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__REQUEST_ARRIVAL_RATE_MEASUREMENT:
				setRequestArrivalRateMeasurement((RequestArrivalRateMeasurement)newValue);
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
			case LogicalcorrespondencePackage.REQUEST_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__REQUEST_ARRIVAL_RATE_MEASUREMENT:
				setRequestArrivalRateMeasurement((RequestArrivalRateMeasurement)null);
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
			case LogicalcorrespondencePackage.REQUEST_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__REQUEST_ARRIVAL_RATE_MEASUREMENT:
				return basicGetRequestArrivalRateMeasurement() != null;
		}
		return super.eIsSet(featureID);
	}

} //RequestArrivalRateMeasurementCorrespondenceImpl
