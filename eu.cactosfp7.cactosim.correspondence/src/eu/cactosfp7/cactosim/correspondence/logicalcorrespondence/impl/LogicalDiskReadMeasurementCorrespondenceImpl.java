/**
 */
package eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl;

import eu.cactosfp7.cactosim.correspondence.impl.LoadCorrespondenceImpl;

import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalCorrespondenceRepository;
import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalDiskReadMeasurementCorrespondence;
import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalcorrespondencePackage;

import eu.cactosfp7.infrastructuremodels.load.logical.VirtualDiskMeasurement;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logical Disk Read Measurement Correspondence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.LogicalDiskReadMeasurementCorrespondenceImpl#getCactos <em>Cactos</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.LogicalDiskReadMeasurementCorrespondenceImpl#getLogicalCorrespondenceRepository <em>Logical Correspondence Repository</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LogicalDiskReadMeasurementCorrespondenceImpl extends LoadCorrespondenceImpl implements LogicalDiskReadMeasurementCorrespondence {
    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected LogicalDiskReadMeasurementCorrespondenceImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return LogicalcorrespondencePackage.Literals.LOGICAL_DISK_READ_MEASUREMENT_CORRESPONDENCE;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public VirtualDiskMeasurement getCactos() {
		return (VirtualDiskMeasurement)eDynamicGet(LogicalcorrespondencePackage.LOGICAL_DISK_READ_MEASUREMENT_CORRESPONDENCE__CACTOS, LogicalcorrespondencePackage.Literals.LOGICAL_DISK_READ_MEASUREMENT_CORRESPONDENCE__CACTOS, true, true);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public VirtualDiskMeasurement basicGetCactos() {
		return (VirtualDiskMeasurement)eDynamicGet(LogicalcorrespondencePackage.LOGICAL_DISK_READ_MEASUREMENT_CORRESPONDENCE__CACTOS, LogicalcorrespondencePackage.Literals.LOGICAL_DISK_READ_MEASUREMENT_CORRESPONDENCE__CACTOS, false, true);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setCactos(VirtualDiskMeasurement newCactos) {
		eDynamicSet(LogicalcorrespondencePackage.LOGICAL_DISK_READ_MEASUREMENT_CORRESPONDENCE__CACTOS, LogicalcorrespondencePackage.Literals.LOGICAL_DISK_READ_MEASUREMENT_CORRESPONDENCE__CACTOS, newCactos);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public LogicalCorrespondenceRepository getLogicalCorrespondenceRepository() {
		return (LogicalCorrespondenceRepository)eDynamicGet(LogicalcorrespondencePackage.LOGICAL_DISK_READ_MEASUREMENT_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY, LogicalcorrespondencePackage.Literals.LOGICAL_DISK_READ_MEASUREMENT_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY, true, true);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetLogicalCorrespondenceRepository(LogicalCorrespondenceRepository newLogicalCorrespondenceRepository, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newLogicalCorrespondenceRepository, LogicalcorrespondencePackage.LOGICAL_DISK_READ_MEASUREMENT_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY, msgs);
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setLogicalCorrespondenceRepository(LogicalCorrespondenceRepository newLogicalCorrespondenceRepository) {
		eDynamicSet(LogicalcorrespondencePackage.LOGICAL_DISK_READ_MEASUREMENT_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY, LogicalcorrespondencePackage.Literals.LOGICAL_DISK_READ_MEASUREMENT_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY, newLogicalCorrespondenceRepository);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogicalcorrespondencePackage.LOGICAL_DISK_READ_MEASUREMENT_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetLogicalCorrespondenceRepository((LogicalCorrespondenceRepository)otherEnd, msgs);
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
			case LogicalcorrespondencePackage.LOGICAL_DISK_READ_MEASUREMENT_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY:
				return basicSetLogicalCorrespondenceRepository(null, msgs);
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
			case LogicalcorrespondencePackage.LOGICAL_DISK_READ_MEASUREMENT_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY:
				return eInternalContainer().eInverseRemove(this, LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__VOLUME_MEASUREMENT_CORRESPONDENCES, LogicalCorrespondenceRepository.class, msgs);
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
			case LogicalcorrespondencePackage.LOGICAL_DISK_READ_MEASUREMENT_CORRESPONDENCE__CACTOS:
				if (resolve) return getCactos();
				return basicGetCactos();
			case LogicalcorrespondencePackage.LOGICAL_DISK_READ_MEASUREMENT_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY:
				return getLogicalCorrespondenceRepository();
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
			case LogicalcorrespondencePackage.LOGICAL_DISK_READ_MEASUREMENT_CORRESPONDENCE__CACTOS:
				setCactos((VirtualDiskMeasurement)newValue);
				return;
			case LogicalcorrespondencePackage.LOGICAL_DISK_READ_MEASUREMENT_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY:
				setLogicalCorrespondenceRepository((LogicalCorrespondenceRepository)newValue);
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
			case LogicalcorrespondencePackage.LOGICAL_DISK_READ_MEASUREMENT_CORRESPONDENCE__CACTOS:
				setCactos((VirtualDiskMeasurement)null);
				return;
			case LogicalcorrespondencePackage.LOGICAL_DISK_READ_MEASUREMENT_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY:
				setLogicalCorrespondenceRepository((LogicalCorrespondenceRepository)null);
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
			case LogicalcorrespondencePackage.LOGICAL_DISK_READ_MEASUREMENT_CORRESPONDENCE__CACTOS:
				return basicGetCactos() != null;
			case LogicalcorrespondencePackage.LOGICAL_DISK_READ_MEASUREMENT_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY:
				return getLogicalCorrespondenceRepository() != null;
		}
		return super.eIsSet(featureID);
	}

} //LogicalDiskReadMeasurementCorrespondenceImpl
