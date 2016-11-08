/**
 */
package eu.cactosfp7.cactosim.correspondence.measurementcorrespondence;

import eu.cactosfp7.identifier.Identifier;
import org.palladiosimulator.monitorrepository.MeasurementSpecification;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Monitored Cactos Entity To Monitor Correspondence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.measurementcorrespondence.MonitoredCactosEntityToMonitorCorrespondence#getCactos <em>Cactos</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.measurementcorrespondence.MonitoredCactosEntityToMonitorCorrespondence#getPalladio <em>Palladio</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.measurementcorrespondence.MonitoredCactosEntityToMonitorCorrespondence#getMonitorCorrespondenceRepository <em>Monitor Correspondence Repository</em>}</li>
 * </ul>
 *
 * @see eu.cactosfp7.cactosim.correspondence.measurementcorrespondence.MeasurementcorrespondencePackage#getMonitoredCactosEntityToMonitorCorrespondence()
 * @model
 * @generated
 */
public interface MonitoredCactosEntityToMonitorCorrespondence extends Identifier {
	/**
	 * Returns the value of the '<em><b>Cactos</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cactos</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cactos</em>' reference.
	 * @see #setCactos(Identifier)
	 * @see eu.cactosfp7.cactosim.correspondence.measurementcorrespondence.MeasurementcorrespondencePackage#getMonitoredCactosEntityToMonitorCorrespondence_Cactos()
	 * @model required="true"
	 * @generated
	 */
	Identifier getCactos();

	/**
	 * Sets the value of the '{@link eu.cactosfp7.cactosim.correspondence.measurementcorrespondence.MonitoredCactosEntityToMonitorCorrespondence#getCactos <em>Cactos</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cactos</em>' reference.
	 * @see #getCactos()
	 * @generated
	 */
	void setCactos(Identifier value);

	/**
	 * Returns the value of the '<em><b>Palladio</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Palladio</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Palladio</em>' reference.
	 * @see #setPalladio(MeasurementSpecification)
	 * @see eu.cactosfp7.cactosim.correspondence.measurementcorrespondence.MeasurementcorrespondencePackage#getMonitoredCactosEntityToMonitorCorrespondence_Palladio()
	 * @model required="true"
	 * @generated
	 */
	MeasurementSpecification getPalladio();

	/**
	 * Sets the value of the '{@link eu.cactosfp7.cactosim.correspondence.measurementcorrespondence.MonitoredCactosEntityToMonitorCorrespondence#getPalladio <em>Palladio</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Palladio</em>' reference.
	 * @see #getPalladio()
	 * @generated
	 */
	void setPalladio(MeasurementSpecification value);

	/**
	 * Returns the value of the '<em><b>Monitor Correspondence Repository</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link eu.cactosfp7.cactosim.correspondence.measurementcorrespondence.MonitorCorrespondenceRepository#getMonitoredCactosEntityToMonitorCorrespondences <em>Monitored Cactos Entity To Monitor Correspondences</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Monitor Correspondence Repository</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monitor Correspondence Repository</em>' container reference.
	 * @see #setMonitorCorrespondenceRepository(MonitorCorrespondenceRepository)
	 * @see eu.cactosfp7.cactosim.correspondence.measurementcorrespondence.MeasurementcorrespondencePackage#getMonitoredCactosEntityToMonitorCorrespondence_MonitorCorrespondenceRepository()
	 * @see eu.cactosfp7.cactosim.correspondence.measurementcorrespondence.MonitorCorrespondenceRepository#getMonitoredCactosEntityToMonitorCorrespondences
	 * @model opposite="monitoredCactosEntityToMonitorCorrespondences" transient="false"
	 * @generated
	 */
	MonitorCorrespondenceRepository getMonitorCorrespondenceRepository();

	/**
	 * Sets the value of the '{@link eu.cactosfp7.cactosim.correspondence.measurementcorrespondence.MonitoredCactosEntityToMonitorCorrespondence#getMonitorCorrespondenceRepository <em>Monitor Correspondence Repository</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Monitor Correspondence Repository</em>' container reference.
	 * @see #getMonitorCorrespondenceRepository()
	 * @generated
	 */
	void setMonitorCorrespondenceRepository(MonitorCorrespondenceRepository value);

} // MonitoredCactosEntityToMonitorCorrespondence
