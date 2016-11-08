/**
 */
package eu.cactosfp7.cactosim.correspondence.measurementcorrespondence.impl;

import eu.cactosfp7.cactosim.correspondence.measurementcorrespondence.MeasurementcorrespondencePackage;
import eu.cactosfp7.cactosim.correspondence.measurementcorrespondence.MonitorCorrespondenceRepository;
import eu.cactosfp7.cactosim.correspondence.measurementcorrespondence.MonitoredCactosEntityToMonitorCorrespondence;
import eu.cactosfp7.identifier.Identifier;
import eu.cactosfp7.identifier.impl.IdentifierImpl;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.palladiosimulator.monitorrepository.MeasurementSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Monitored Cactos Entity To Monitor Correspondence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.measurementcorrespondence.impl.MonitoredCactosEntityToMonitorCorrespondenceImpl#getCactos <em>Cactos</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.measurementcorrespondence.impl.MonitoredCactosEntityToMonitorCorrespondenceImpl#getPalladio <em>Palladio</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.measurementcorrespondence.impl.MonitoredCactosEntityToMonitorCorrespondenceImpl#getMonitorCorrespondenceRepository <em>Monitor Correspondence Repository</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MonitoredCactosEntityToMonitorCorrespondenceImpl extends IdentifierImpl implements MonitoredCactosEntityToMonitorCorrespondence {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MonitoredCactosEntityToMonitorCorrespondenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeasurementcorrespondencePackage.Literals.MONITORED_CACTOS_ENTITY_TO_MONITOR_CORRESPONDENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getCactos() {
		return (Identifier)eDynamicGet(MeasurementcorrespondencePackage.MONITORED_CACTOS_ENTITY_TO_MONITOR_CORRESPONDENCE__CACTOS, MeasurementcorrespondencePackage.Literals.MONITORED_CACTOS_ENTITY_TO_MONITOR_CORRESPONDENCE__CACTOS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier basicGetCactos() {
		return (Identifier)eDynamicGet(MeasurementcorrespondencePackage.MONITORED_CACTOS_ENTITY_TO_MONITOR_CORRESPONDENCE__CACTOS, MeasurementcorrespondencePackage.Literals.MONITORED_CACTOS_ENTITY_TO_MONITOR_CORRESPONDENCE__CACTOS, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCactos(Identifier newCactos) {
		eDynamicSet(MeasurementcorrespondencePackage.MONITORED_CACTOS_ENTITY_TO_MONITOR_CORRESPONDENCE__CACTOS, MeasurementcorrespondencePackage.Literals.MONITORED_CACTOS_ENTITY_TO_MONITOR_CORRESPONDENCE__CACTOS, newCactos);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementSpecification getPalladio() {
		return (MeasurementSpecification)eDynamicGet(MeasurementcorrespondencePackage.MONITORED_CACTOS_ENTITY_TO_MONITOR_CORRESPONDENCE__PALLADIO, MeasurementcorrespondencePackage.Literals.MONITORED_CACTOS_ENTITY_TO_MONITOR_CORRESPONDENCE__PALLADIO, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementSpecification basicGetPalladio() {
		return (MeasurementSpecification)eDynamicGet(MeasurementcorrespondencePackage.MONITORED_CACTOS_ENTITY_TO_MONITOR_CORRESPONDENCE__PALLADIO, MeasurementcorrespondencePackage.Literals.MONITORED_CACTOS_ENTITY_TO_MONITOR_CORRESPONDENCE__PALLADIO, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPalladio(MeasurementSpecification newPalladio) {
		eDynamicSet(MeasurementcorrespondencePackage.MONITORED_CACTOS_ENTITY_TO_MONITOR_CORRESPONDENCE__PALLADIO, MeasurementcorrespondencePackage.Literals.MONITORED_CACTOS_ENTITY_TO_MONITOR_CORRESPONDENCE__PALLADIO, newPalladio);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonitorCorrespondenceRepository getMonitorCorrespondenceRepository() {
		return (MonitorCorrespondenceRepository)eDynamicGet(MeasurementcorrespondencePackage.MONITORED_CACTOS_ENTITY_TO_MONITOR_CORRESPONDENCE__MONITOR_CORRESPONDENCE_REPOSITORY, MeasurementcorrespondencePackage.Literals.MONITORED_CACTOS_ENTITY_TO_MONITOR_CORRESPONDENCE__MONITOR_CORRESPONDENCE_REPOSITORY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMonitorCorrespondenceRepository(MonitorCorrespondenceRepository newMonitorCorrespondenceRepository, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newMonitorCorrespondenceRepository, MeasurementcorrespondencePackage.MONITORED_CACTOS_ENTITY_TO_MONITOR_CORRESPONDENCE__MONITOR_CORRESPONDENCE_REPOSITORY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMonitorCorrespondenceRepository(MonitorCorrespondenceRepository newMonitorCorrespondenceRepository) {
		eDynamicSet(MeasurementcorrespondencePackage.MONITORED_CACTOS_ENTITY_TO_MONITOR_CORRESPONDENCE__MONITOR_CORRESPONDENCE_REPOSITORY, MeasurementcorrespondencePackage.Literals.MONITORED_CACTOS_ENTITY_TO_MONITOR_CORRESPONDENCE__MONITOR_CORRESPONDENCE_REPOSITORY, newMonitorCorrespondenceRepository);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MeasurementcorrespondencePackage.MONITORED_CACTOS_ENTITY_TO_MONITOR_CORRESPONDENCE__MONITOR_CORRESPONDENCE_REPOSITORY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetMonitorCorrespondenceRepository((MonitorCorrespondenceRepository)otherEnd, msgs);
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
			case MeasurementcorrespondencePackage.MONITORED_CACTOS_ENTITY_TO_MONITOR_CORRESPONDENCE__MONITOR_CORRESPONDENCE_REPOSITORY:
				return basicSetMonitorCorrespondenceRepository(null, msgs);
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
			case MeasurementcorrespondencePackage.MONITORED_CACTOS_ENTITY_TO_MONITOR_CORRESPONDENCE__MONITOR_CORRESPONDENCE_REPOSITORY:
				return eInternalContainer().eInverseRemove(this, MeasurementcorrespondencePackage.MONITOR_CORRESPONDENCE_REPOSITORY__MONITORED_CACTOS_ENTITY_TO_MONITOR_CORRESPONDENCES, MonitorCorrespondenceRepository.class, msgs);
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
			case MeasurementcorrespondencePackage.MONITORED_CACTOS_ENTITY_TO_MONITOR_CORRESPONDENCE__CACTOS:
				if (resolve) return getCactos();
				return basicGetCactos();
			case MeasurementcorrespondencePackage.MONITORED_CACTOS_ENTITY_TO_MONITOR_CORRESPONDENCE__PALLADIO:
				if (resolve) return getPalladio();
				return basicGetPalladio();
			case MeasurementcorrespondencePackage.MONITORED_CACTOS_ENTITY_TO_MONITOR_CORRESPONDENCE__MONITOR_CORRESPONDENCE_REPOSITORY:
				return getMonitorCorrespondenceRepository();
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
			case MeasurementcorrespondencePackage.MONITORED_CACTOS_ENTITY_TO_MONITOR_CORRESPONDENCE__CACTOS:
				setCactos((Identifier)newValue);
				return;
			case MeasurementcorrespondencePackage.MONITORED_CACTOS_ENTITY_TO_MONITOR_CORRESPONDENCE__PALLADIO:
				setPalladio((MeasurementSpecification)newValue);
				return;
			case MeasurementcorrespondencePackage.MONITORED_CACTOS_ENTITY_TO_MONITOR_CORRESPONDENCE__MONITOR_CORRESPONDENCE_REPOSITORY:
				setMonitorCorrespondenceRepository((MonitorCorrespondenceRepository)newValue);
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
			case MeasurementcorrespondencePackage.MONITORED_CACTOS_ENTITY_TO_MONITOR_CORRESPONDENCE__CACTOS:
				setCactos((Identifier)null);
				return;
			case MeasurementcorrespondencePackage.MONITORED_CACTOS_ENTITY_TO_MONITOR_CORRESPONDENCE__PALLADIO:
				setPalladio((MeasurementSpecification)null);
				return;
			case MeasurementcorrespondencePackage.MONITORED_CACTOS_ENTITY_TO_MONITOR_CORRESPONDENCE__MONITOR_CORRESPONDENCE_REPOSITORY:
				setMonitorCorrespondenceRepository((MonitorCorrespondenceRepository)null);
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
			case MeasurementcorrespondencePackage.MONITORED_CACTOS_ENTITY_TO_MONITOR_CORRESPONDENCE__CACTOS:
				return basicGetCactos() != null;
			case MeasurementcorrespondencePackage.MONITORED_CACTOS_ENTITY_TO_MONITOR_CORRESPONDENCE__PALLADIO:
				return basicGetPalladio() != null;
			case MeasurementcorrespondencePackage.MONITORED_CACTOS_ENTITY_TO_MONITOR_CORRESPONDENCE__MONITOR_CORRESPONDENCE_REPOSITORY:
				return getMonitorCorrespondenceRepository() != null;
		}
		return super.eIsSet(featureID);
	}

} //MonitoredCactosEntityToMonitorCorrespondenceImpl
