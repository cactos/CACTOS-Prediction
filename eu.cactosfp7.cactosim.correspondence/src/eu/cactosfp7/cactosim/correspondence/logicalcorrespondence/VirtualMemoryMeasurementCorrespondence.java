/**
 */
package eu.cactosfp7.cactosim.correspondence.logicalcorrespondence;

import eu.cactosfp7.cactosim.correspondence.LoadCorrespondence;

import eu.cactosfp7.infrastructuremodels.load.logical.VirtualMemoryMeasurement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Virtual Memory Measurement Correspondence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VirtualMemoryMeasurementCorrespondence#getCactos <em>Cactos</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VirtualMemoryMeasurementCorrespondence#getLogicalCorrespondenceRepository <em>Logical Correspondence Repository</em>}</li>
 * </ul>
 *
 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalcorrespondencePackage#getVirtualMemoryMeasurementCorrespondence()
 * @model
 * @generated
 */
public interface VirtualMemoryMeasurementCorrespondence extends LoadCorrespondence {
	/**
	 * Returns the value of the '<em><b>Cactos</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cactos</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cactos</em>' reference.
	 * @see #setCactos(VirtualMemoryMeasurement)
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalcorrespondencePackage#getVirtualMemoryMeasurementCorrespondence_Cactos()
	 * @model required="true"
	 * @generated
	 */
	VirtualMemoryMeasurement getCactos();

	/**
	 * Sets the value of the '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VirtualMemoryMeasurementCorrespondence#getCactos <em>Cactos</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cactos</em>' reference.
	 * @see #getCactos()
	 * @generated
	 */
	void setCactos(VirtualMemoryMeasurement value);

	/**
	 * Returns the value of the '<em><b>Logical Correspondence Repository</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalCorrespondenceRepository#getVirtualMemoryMeasurementCorrespondences <em>Virtual Memory Measurement Correspondences</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logical Correspondence Repository</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logical Correspondence Repository</em>' container reference.
	 * @see #setLogicalCorrespondenceRepository(LogicalCorrespondenceRepository)
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalcorrespondencePackage#getVirtualMemoryMeasurementCorrespondence_LogicalCorrespondenceRepository()
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalCorrespondenceRepository#getVirtualMemoryMeasurementCorrespondences
	 * @model opposite="virtualMemoryMeasurementCorrespondences" required="true" transient="false"
	 * @generated
	 */
	LogicalCorrespondenceRepository getLogicalCorrespondenceRepository();

	/**
	 * Sets the value of the '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VirtualMemoryMeasurementCorrespondence#getLogicalCorrespondenceRepository <em>Logical Correspondence Repository</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logical Correspondence Repository</em>' container reference.
	 * @see #getLogicalCorrespondenceRepository()
	 * @generated
	 */
	void setLogicalCorrespondenceRepository(LogicalCorrespondenceRepository value);

} // VirtualMemoryMeasurementCorrespondence
