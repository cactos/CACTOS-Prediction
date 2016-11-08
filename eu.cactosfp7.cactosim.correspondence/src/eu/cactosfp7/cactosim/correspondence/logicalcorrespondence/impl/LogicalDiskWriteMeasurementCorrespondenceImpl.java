/**
 */
package eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl;

import eu.cactosfp7.cactosim.correspondence.impl.LoadCorrespondenceImpl;

import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalCorrespondenceRepository;
import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalDiskWriteMeasurementCorrespondence;
import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalcorrespondencePackage;

import eu.cactosfp7.infrastructuremodels.load.logical.VirtualDiskMeasurement;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logical Disk Write Measurement Correspondence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.LogicalDiskWriteMeasurementCorrespondenceImpl#getCactos <em>Cactos</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.LogicalDiskWriteMeasurementCorrespondenceImpl#getLogicalCorrespondenceRepository <em>Logical Correspondence Repository</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LogicalDiskWriteMeasurementCorrespondenceImpl extends LoadCorrespondenceImpl implements LogicalDiskWriteMeasurementCorrespondence {
    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected LogicalDiskWriteMeasurementCorrespondenceImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return LogicalcorrespondencePackage.Literals.LOGICAL_DISK_WRITE_MEASUREMENT_CORRESPONDENCE;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public VirtualDiskMeasurement getCactos() {
		return (VirtualDiskMeasurement)eDynamicGet(LogicalcorrespondencePackage.LOGICAL_DISK_WRITE_MEASUREMENT_CORRESPONDENCE__CACTOS, LogicalcorrespondencePackage.Literals.LOGICAL_DISK_WRITE_MEASUREMENT_CORRESPONDENCE__CACTOS, true, true);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public VirtualDiskMeasurement basicGetCactos() {
		return (VirtualDiskMeasurement)eDynamicGet(LogicalcorrespondencePackage.LOGICAL_DISK_WRITE_MEASUREMENT_CORRESPONDENCE__CACTOS, LogicalcorrespondencePackage.Literals.LOGICAL_DISK_WRITE_MEASUREMENT_CORRESPONDENCE__CACTOS, false, true);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setCactos(VirtualDiskMeasurement newCactos) {
		eDynamicSet(LogicalcorrespondencePackage.LOGICAL_DISK_WRITE_MEASUREMENT_CORRESPONDENCE__CACTOS, LogicalcorrespondencePackage.Literals.LOGICAL_DISK_WRITE_MEASUREMENT_CORRESPONDENCE__CACTOS, newCactos);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public LogicalCorrespondenceRepository getLogicalCorrespondenceRepository() {
		return (LogicalCorrespondenceRepository)eDynamicGet(LogicalcorrespondencePackage.LOGICAL_DISK_WRITE_MEASUREMENT_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY, LogicalcorrespondencePackage.Literals.LOGICAL_DISK_WRITE_MEASUREMENT_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY, true, true);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public LogicalCorrespondenceRepository basicGetLogicalCorrespondenceRepository() {
		return (LogicalCorrespondenceRepository)eDynamicGet(LogicalcorrespondencePackage.LOGICAL_DISK_WRITE_MEASUREMENT_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY, LogicalcorrespondencePackage.Literals.LOGICAL_DISK_WRITE_MEASUREMENT_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY, false, true);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setLogicalCorrespondenceRepository(LogicalCorrespondenceRepository newLogicalCorrespondenceRepository) {
		eDynamicSet(LogicalcorrespondencePackage.LOGICAL_DISK_WRITE_MEASUREMENT_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY, LogicalcorrespondencePackage.Literals.LOGICAL_DISK_WRITE_MEASUREMENT_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY, newLogicalCorrespondenceRepository);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LogicalcorrespondencePackage.LOGICAL_DISK_WRITE_MEASUREMENT_CORRESPONDENCE__CACTOS:
				if (resolve) return getCactos();
				return basicGetCactos();
			case LogicalcorrespondencePackage.LOGICAL_DISK_WRITE_MEASUREMENT_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY:
				if (resolve) return getLogicalCorrespondenceRepository();
				return basicGetLogicalCorrespondenceRepository();
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
			case LogicalcorrespondencePackage.LOGICAL_DISK_WRITE_MEASUREMENT_CORRESPONDENCE__CACTOS:
				setCactos((VirtualDiskMeasurement)newValue);
				return;
			case LogicalcorrespondencePackage.LOGICAL_DISK_WRITE_MEASUREMENT_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY:
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
			case LogicalcorrespondencePackage.LOGICAL_DISK_WRITE_MEASUREMENT_CORRESPONDENCE__CACTOS:
				setCactos((VirtualDiskMeasurement)null);
				return;
			case LogicalcorrespondencePackage.LOGICAL_DISK_WRITE_MEASUREMENT_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY:
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
			case LogicalcorrespondencePackage.LOGICAL_DISK_WRITE_MEASUREMENT_CORRESPONDENCE__CACTOS:
				return basicGetCactos() != null;
			case LogicalcorrespondencePackage.LOGICAL_DISK_WRITE_MEASUREMENT_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY:
				return basicGetLogicalCorrespondenceRepository() != null;
		}
		return super.eIsSet(featureID);
	}

} //LogicalDiskWriteMeasurementCorrespondenceImpl
