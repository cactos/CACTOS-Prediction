/**
 */
package eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl;

import eu.cactosfp7.cactosim.correspondence.impl.LoadCorrespondenceImpl;

import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalcorrespondencePackage;
import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ServiceInstanceArrivalRateMeasurementCorrespondence;
import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ServiceOperationInstanceArrivalRateMeasurementCorrespondence;

import eu.cactosfp7.infrastructuremodels.logicaldc.application.ServiceOperation;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Operation Instance Arrival Rate Measurement Correspondence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.ServiceOperationInstanceArrivalRateMeasurementCorrespondenceImpl#getServiceInstanceArrivalRateMeasurementCorrespondence <em>Service Instance Arrival Rate Measurement Correspondence</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.ServiceOperationInstanceArrivalRateMeasurementCorrespondenceImpl#getCactosServiceOperation <em>Cactos Service Operation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceOperationInstanceArrivalRateMeasurementCorrespondenceImpl extends LoadCorrespondenceImpl implements ServiceOperationInstanceArrivalRateMeasurementCorrespondence {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceOperationInstanceArrivalRateMeasurementCorrespondenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogicalcorrespondencePackage.Literals.SERVICE_OPERATION_INSTANCE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceInstanceArrivalRateMeasurementCorrespondence getServiceInstanceArrivalRateMeasurementCorrespondence() {
		return (ServiceInstanceArrivalRateMeasurementCorrespondence)eDynamicGet(LogicalcorrespondencePackage.SERVICE_OPERATION_INSTANCE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__SERVICE_INSTANCE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE, LogicalcorrespondencePackage.Literals.SERVICE_OPERATION_INSTANCE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__SERVICE_INSTANCE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceInstanceArrivalRateMeasurementCorrespondence(ServiceInstanceArrivalRateMeasurementCorrespondence newServiceInstanceArrivalRateMeasurementCorrespondence, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newServiceInstanceArrivalRateMeasurementCorrespondence, LogicalcorrespondencePackage.SERVICE_OPERATION_INSTANCE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__SERVICE_INSTANCE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceInstanceArrivalRateMeasurementCorrespondence(ServiceInstanceArrivalRateMeasurementCorrespondence newServiceInstanceArrivalRateMeasurementCorrespondence) {
		eDynamicSet(LogicalcorrespondencePackage.SERVICE_OPERATION_INSTANCE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__SERVICE_INSTANCE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE, LogicalcorrespondencePackage.Literals.SERVICE_OPERATION_INSTANCE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__SERVICE_INSTANCE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE, newServiceInstanceArrivalRateMeasurementCorrespondence);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceOperation getCactosServiceOperation() {
		return (ServiceOperation)eDynamicGet(LogicalcorrespondencePackage.SERVICE_OPERATION_INSTANCE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__CACTOS_SERVICE_OPERATION, LogicalcorrespondencePackage.Literals.SERVICE_OPERATION_INSTANCE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__CACTOS_SERVICE_OPERATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceOperation basicGetCactosServiceOperation() {
		return (ServiceOperation)eDynamicGet(LogicalcorrespondencePackage.SERVICE_OPERATION_INSTANCE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__CACTOS_SERVICE_OPERATION, LogicalcorrespondencePackage.Literals.SERVICE_OPERATION_INSTANCE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__CACTOS_SERVICE_OPERATION, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCactosServiceOperation(ServiceOperation newCactosServiceOperation) {
		eDynamicSet(LogicalcorrespondencePackage.SERVICE_OPERATION_INSTANCE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__CACTOS_SERVICE_OPERATION, LogicalcorrespondencePackage.Literals.SERVICE_OPERATION_INSTANCE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__CACTOS_SERVICE_OPERATION, newCactosServiceOperation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogicalcorrespondencePackage.SERVICE_OPERATION_INSTANCE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__SERVICE_INSTANCE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetServiceInstanceArrivalRateMeasurementCorrespondence((ServiceInstanceArrivalRateMeasurementCorrespondence)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogicalcorrespondencePackage.SERVICE_OPERATION_INSTANCE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__SERVICE_INSTANCE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE:
				return basicSetServiceInstanceArrivalRateMeasurementCorrespondence(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case LogicalcorrespondencePackage.SERVICE_OPERATION_INSTANCE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__SERVICE_INSTANCE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE:
				return eInternalContainer().eInverseRemove(this, LogicalcorrespondencePackage.SERVICE_INSTANCE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__SERVICE_OPERATION_INSTANCE_CORRESPONDENCE, ServiceInstanceArrivalRateMeasurementCorrespondence.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LogicalcorrespondencePackage.SERVICE_OPERATION_INSTANCE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__SERVICE_INSTANCE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE:
				return getServiceInstanceArrivalRateMeasurementCorrespondence();
			case LogicalcorrespondencePackage.SERVICE_OPERATION_INSTANCE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__CACTOS_SERVICE_OPERATION:
				if (resolve) return getCactosServiceOperation();
				return basicGetCactosServiceOperation();
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
			case LogicalcorrespondencePackage.SERVICE_OPERATION_INSTANCE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__SERVICE_INSTANCE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE:
				setServiceInstanceArrivalRateMeasurementCorrespondence((ServiceInstanceArrivalRateMeasurementCorrespondence)newValue);
				return;
			case LogicalcorrespondencePackage.SERVICE_OPERATION_INSTANCE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__CACTOS_SERVICE_OPERATION:
				setCactosServiceOperation((ServiceOperation)newValue);
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
			case LogicalcorrespondencePackage.SERVICE_OPERATION_INSTANCE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__SERVICE_INSTANCE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE:
				setServiceInstanceArrivalRateMeasurementCorrespondence((ServiceInstanceArrivalRateMeasurementCorrespondence)null);
				return;
			case LogicalcorrespondencePackage.SERVICE_OPERATION_INSTANCE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__CACTOS_SERVICE_OPERATION:
				setCactosServiceOperation((ServiceOperation)null);
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
			case LogicalcorrespondencePackage.SERVICE_OPERATION_INSTANCE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__SERVICE_INSTANCE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE:
				return getServiceInstanceArrivalRateMeasurementCorrespondence() != null;
			case LogicalcorrespondencePackage.SERVICE_OPERATION_INSTANCE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__CACTOS_SERVICE_OPERATION:
				return basicGetCactosServiceOperation() != null;
		}
		return super.eIsSet(featureID);
	}

} //ServiceOperationInstanceArrivalRateMeasurementCorrespondenceImpl
