/**
 */
package eu.cactosfp7.cactosim.correspondence.measurementcorrespondence.impl;

import eu.cactosfp7.cactosim.correspondence.measurementcorrespondence.MeasurementcorrespondencePackage;
import eu.cactosfp7.cactosim.correspondence.measurementcorrespondence.MonitorCorrespondenceRepository;
import eu.cactosfp7.cactosim.correspondence.measurementcorrespondence.MonitoredCactosEntityToMonitorCorrespondence;
import eu.cactosfp7.identifier.impl.IdentifierImpl;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Monitor Correspondence Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.measurementcorrespondence.impl.MonitorCorrespondenceRepositoryImpl#getMonitoredCactosEntityToMonitorCorrespondences <em>Monitored Cactos Entity To Monitor Correspondences</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MonitorCorrespondenceRepositoryImpl extends IdentifierImpl implements MonitorCorrespondenceRepository {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MonitorCorrespondenceRepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeasurementcorrespondencePackage.Literals.MONITOR_CORRESPONDENCE_REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<MonitoredCactosEntityToMonitorCorrespondence> getMonitoredCactosEntityToMonitorCorrespondences() {
		return (EList<MonitoredCactosEntityToMonitorCorrespondence>)eDynamicGet(MeasurementcorrespondencePackage.MONITOR_CORRESPONDENCE_REPOSITORY__MONITORED_CACTOS_ENTITY_TO_MONITOR_CORRESPONDENCES, MeasurementcorrespondencePackage.Literals.MONITOR_CORRESPONDENCE_REPOSITORY__MONITORED_CACTOS_ENTITY_TO_MONITOR_CORRESPONDENCES, true, true);
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
			case MeasurementcorrespondencePackage.MONITOR_CORRESPONDENCE_REPOSITORY__MONITORED_CACTOS_ENTITY_TO_MONITOR_CORRESPONDENCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMonitoredCactosEntityToMonitorCorrespondences()).basicAdd(otherEnd, msgs);
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
			case MeasurementcorrespondencePackage.MONITOR_CORRESPONDENCE_REPOSITORY__MONITORED_CACTOS_ENTITY_TO_MONITOR_CORRESPONDENCES:
				return ((InternalEList<?>)getMonitoredCactosEntityToMonitorCorrespondences()).basicRemove(otherEnd, msgs);
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
			case MeasurementcorrespondencePackage.MONITOR_CORRESPONDENCE_REPOSITORY__MONITORED_CACTOS_ENTITY_TO_MONITOR_CORRESPONDENCES:
				return getMonitoredCactosEntityToMonitorCorrespondences();
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
			case MeasurementcorrespondencePackage.MONITOR_CORRESPONDENCE_REPOSITORY__MONITORED_CACTOS_ENTITY_TO_MONITOR_CORRESPONDENCES:
				getMonitoredCactosEntityToMonitorCorrespondences().clear();
				getMonitoredCactosEntityToMonitorCorrespondences().addAll((Collection<? extends MonitoredCactosEntityToMonitorCorrespondence>)newValue);
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
			case MeasurementcorrespondencePackage.MONITOR_CORRESPONDENCE_REPOSITORY__MONITORED_CACTOS_ENTITY_TO_MONITOR_CORRESPONDENCES:
				getMonitoredCactosEntityToMonitorCorrespondences().clear();
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
			case MeasurementcorrespondencePackage.MONITOR_CORRESPONDENCE_REPOSITORY__MONITORED_CACTOS_ENTITY_TO_MONITOR_CORRESPONDENCES:
				return !getMonitoredCactosEntityToMonitorCorrespondences().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MonitorCorrespondenceRepositoryImpl
