/**
 */
package eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl;

import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ArrivalRateMeasurementCorrespondence;
import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalcorrespondencePackage;
import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ProvidedServiceCorrespondence;
import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ServiceInstanceArrivalRateMeasurementCorrespondence;

import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ServiceOperationInstanceArrivalRateMeasurementCorrespondence;
import eu.cactosfp7.identifier.impl.IdentifierImpl;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Instance Arrival Rate Measurement Correspondence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.ServiceInstanceArrivalRateMeasurementCorrespondenceImpl#getArrivalRateMeasurementCorrespondence <em>Arrival Rate Measurement Correspondence</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.ServiceInstanceArrivalRateMeasurementCorrespondenceImpl#getCactosServiceCorrespondence <em>Cactos Service Correspondence</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.ServiceInstanceArrivalRateMeasurementCorrespondenceImpl#getServiceOperationInstanceCorrespondence <em>Service Operation Instance Correspondence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceInstanceArrivalRateMeasurementCorrespondenceImpl extends IdentifierImpl implements ServiceInstanceArrivalRateMeasurementCorrespondence {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceInstanceArrivalRateMeasurementCorrespondenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogicalcorrespondencePackage.Literals.SERVICE_INSTANCE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrivalRateMeasurementCorrespondence getArrivalRateMeasurementCorrespondence() {
		return (ArrivalRateMeasurementCorrespondence)eDynamicGet(LogicalcorrespondencePackage.SERVICE_INSTANCE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE, LogicalcorrespondencePackage.Literals.SERVICE_INSTANCE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArrivalRateMeasurementCorrespondence(ArrivalRateMeasurementCorrespondence newArrivalRateMeasurementCorrespondence, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newArrivalRateMeasurementCorrespondence, LogicalcorrespondencePackage.SERVICE_INSTANCE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArrivalRateMeasurementCorrespondence(ArrivalRateMeasurementCorrespondence newArrivalRateMeasurementCorrespondence) {
		eDynamicSet(LogicalcorrespondencePackage.SERVICE_INSTANCE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE, LogicalcorrespondencePackage.Literals.SERVICE_INSTANCE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE, newArrivalRateMeasurementCorrespondence);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidedServiceCorrespondence getCactosServiceCorrespondence() {
		return (ProvidedServiceCorrespondence)eDynamicGet(LogicalcorrespondencePackage.SERVICE_INSTANCE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__CACTOS_SERVICE_CORRESPONDENCE, LogicalcorrespondencePackage.Literals.SERVICE_INSTANCE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__CACTOS_SERVICE_CORRESPONDENCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidedServiceCorrespondence basicGetCactosServiceCorrespondence() {
		return (ProvidedServiceCorrespondence)eDynamicGet(LogicalcorrespondencePackage.SERVICE_INSTANCE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__CACTOS_SERVICE_CORRESPONDENCE, LogicalcorrespondencePackage.Literals.SERVICE_INSTANCE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__CACTOS_SERVICE_CORRESPONDENCE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCactosServiceCorrespondence(ProvidedServiceCorrespondence newCactosServiceCorrespondence) {
		eDynamicSet(LogicalcorrespondencePackage.SERVICE_INSTANCE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__CACTOS_SERVICE_CORRESPONDENCE, LogicalcorrespondencePackage.Literals.SERVICE_INSTANCE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__CACTOS_SERVICE_CORRESPONDENCE, newCactosServiceCorrespondence);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ServiceOperationInstanceArrivalRateMeasurementCorrespondence> getServiceOperationInstanceCorrespondence() {
		return (EList<ServiceOperationInstanceArrivalRateMeasurementCorrespondence>)eDynamicGet(LogicalcorrespondencePackage.SERVICE_INSTANCE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__SERVICE_OPERATION_INSTANCE_CORRESPONDENCE, LogicalcorrespondencePackage.Literals.SERVICE_INSTANCE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__SERVICE_OPERATION_INSTANCE_CORRESPONDENCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogicalcorrespondencePackage.SERVICE_INSTANCE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetArrivalRateMeasurementCorrespondence((ArrivalRateMeasurementCorrespondence)otherEnd, msgs);
			case LogicalcorrespondencePackage.SERVICE_INSTANCE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__SERVICE_OPERATION_INSTANCE_CORRESPONDENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getServiceOperationInstanceCorrespondence()).basicAdd(otherEnd, msgs);
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
			case LogicalcorrespondencePackage.SERVICE_INSTANCE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE:
				return basicSetArrivalRateMeasurementCorrespondence(null, msgs);
			case LogicalcorrespondencePackage.SERVICE_INSTANCE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__SERVICE_OPERATION_INSTANCE_CORRESPONDENCE:
				return ((InternalEList<?>)getServiceOperationInstanceCorrespondence()).basicRemove(otherEnd, msgs);
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
			case LogicalcorrespondencePackage.SERVICE_INSTANCE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE:
				return eInternalContainer().eInverseRemove(this, LogicalcorrespondencePackage.ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__SERVICE_INSTANCE_MEASUREMENT_CORRESPONDENCES, ArrivalRateMeasurementCorrespondence.class, msgs);
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
			case LogicalcorrespondencePackage.SERVICE_INSTANCE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE:
				return getArrivalRateMeasurementCorrespondence();
			case LogicalcorrespondencePackage.SERVICE_INSTANCE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__CACTOS_SERVICE_CORRESPONDENCE:
				if (resolve) return getCactosServiceCorrespondence();
				return basicGetCactosServiceCorrespondence();
			case LogicalcorrespondencePackage.SERVICE_INSTANCE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__SERVICE_OPERATION_INSTANCE_CORRESPONDENCE:
				return getServiceOperationInstanceCorrespondence();
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
			case LogicalcorrespondencePackage.SERVICE_INSTANCE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE:
				setArrivalRateMeasurementCorrespondence((ArrivalRateMeasurementCorrespondence)newValue);
				return;
			case LogicalcorrespondencePackage.SERVICE_INSTANCE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__CACTOS_SERVICE_CORRESPONDENCE:
				setCactosServiceCorrespondence((ProvidedServiceCorrespondence)newValue);
				return;
			case LogicalcorrespondencePackage.SERVICE_INSTANCE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__SERVICE_OPERATION_INSTANCE_CORRESPONDENCE:
				getServiceOperationInstanceCorrespondence().clear();
				getServiceOperationInstanceCorrespondence().addAll((Collection<? extends ServiceOperationInstanceArrivalRateMeasurementCorrespondence>)newValue);
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
			case LogicalcorrespondencePackage.SERVICE_INSTANCE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE:
				setArrivalRateMeasurementCorrespondence((ArrivalRateMeasurementCorrespondence)null);
				return;
			case LogicalcorrespondencePackage.SERVICE_INSTANCE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__CACTOS_SERVICE_CORRESPONDENCE:
				setCactosServiceCorrespondence((ProvidedServiceCorrespondence)null);
				return;
			case LogicalcorrespondencePackage.SERVICE_INSTANCE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__SERVICE_OPERATION_INSTANCE_CORRESPONDENCE:
				getServiceOperationInstanceCorrespondence().clear();
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
			case LogicalcorrespondencePackage.SERVICE_INSTANCE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE:
				return getArrivalRateMeasurementCorrespondence() != null;
			case LogicalcorrespondencePackage.SERVICE_INSTANCE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__CACTOS_SERVICE_CORRESPONDENCE:
				return basicGetCactosServiceCorrespondence() != null;
			case LogicalcorrespondencePackage.SERVICE_INSTANCE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__SERVICE_OPERATION_INSTANCE_CORRESPONDENCE:
				return !getServiceOperationInstanceCorrespondence().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ServiceInstanceArrivalRateMeasurementCorrespondenceImpl
