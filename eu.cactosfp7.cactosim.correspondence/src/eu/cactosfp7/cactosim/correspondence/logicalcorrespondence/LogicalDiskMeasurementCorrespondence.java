/**
 */
package eu.cactosfp7.cactosim.correspondence.logicalcorrespondence;

import eu.cactosfp7.cactosim.correspondence.LoadCorrespondence;

import eu.cactosfp7.infrastructuremodels.load.logical.VirtualDiskMeasurement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logical Disk Measurement Correspondence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalDiskMeasurementCorrespondence#getCactos <em>Cactos</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalDiskMeasurementCorrespondence#getLogicalCorrespondenceRepository <em>Logical Correspondence Repository</em>}</li>
 * </ul>
 *
 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalcorrespondencePackage#getLogicalDiskMeasurementCorrespondence()
 * @model
 * @generated
 */
public interface LogicalDiskMeasurementCorrespondence extends LoadCorrespondence {
    /**
     * Returns the value of the '<em><b>Cactos</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Cactos</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Cactos</em>' reference.
     * @see #setCactos(VirtualDiskMeasurement)
     * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalcorrespondencePackage#getLogicalDiskMeasurementCorrespondence_Cactos()
     * @model required="true"
     * @generated
     */
    VirtualDiskMeasurement getCactos();

    /**
     * Sets the value of the '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalDiskMeasurementCorrespondence#getCactos <em>Cactos</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Cactos</em>' reference.
     * @see #getCactos()
     * @generated
     */
    void setCactos(VirtualDiskMeasurement value);

    /**
     * Returns the value of the '<em><b>Logical Correspondence Repository</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalCorrespondenceRepository#getVolumeMeasurementCorrespondences <em>Volume Measurement Correspondences</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Logical Correspondence Repository</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Logical Correspondence Repository</em>' container reference.
     * @see #setLogicalCorrespondenceRepository(LogicalCorrespondenceRepository)
     * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalcorrespondencePackage#getLogicalDiskMeasurementCorrespondence_LogicalCorrespondenceRepository()
     * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalCorrespondenceRepository#getVolumeMeasurementCorrespondences
     * @model opposite="volumeMeasurementCorrespondences" required="true" transient="false"
     * @generated
     */
    LogicalCorrespondenceRepository getLogicalCorrespondenceRepository();

    /**
     * Sets the value of the '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalDiskMeasurementCorrespondence#getLogicalCorrespondenceRepository <em>Logical Correspondence Repository</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Logical Correspondence Repository</em>' container reference.
     * @see #getLogicalCorrespondenceRepository()
     * @generated
     */
    void setLogicalCorrespondenceRepository(LogicalCorrespondenceRepository value);

} // LogicalDiskMeasurementCorrespondence
