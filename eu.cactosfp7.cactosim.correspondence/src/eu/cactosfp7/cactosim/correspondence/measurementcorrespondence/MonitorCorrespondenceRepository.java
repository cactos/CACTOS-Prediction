/**
 */
package eu.cactosfp7.cactosim.correspondence.measurementcorrespondence;

import eu.cactosfp7.identifier.Identifier;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Monitor Correspondence Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.measurementcorrespondence.MonitorCorrespondenceRepository#getMonitoredCactosEntityToMonitorCorrespondences <em>Monitored Cactos Entity To Monitor Correspondences</em>}</li>
 * </ul>
 *
 * @see eu.cactosfp7.cactosim.correspondence.measurementcorrespondence.MeasurementcorrespondencePackage#getMonitorCorrespondenceRepository()
 * @model
 * @generated
 */
public interface MonitorCorrespondenceRepository extends Identifier {
	/**
	 * Returns the value of the '<em><b>Monitored Cactos Entity To Monitor Correspondences</b></em>' containment reference list.
	 * The list contents are of type {@link eu.cactosfp7.cactosim.correspondence.measurementcorrespondence.MonitoredCactosEntityToMonitorCorrespondence}.
	 * It is bidirectional and its opposite is '{@link eu.cactosfp7.cactosim.correspondence.measurementcorrespondence.MonitoredCactosEntityToMonitorCorrespondence#getMonitorCorrespondenceRepository <em>Monitor Correspondence Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Monitored Cactos Entity To Monitor Correspondences</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monitored Cactos Entity To Monitor Correspondences</em>' containment reference list.
	 * @see eu.cactosfp7.cactosim.correspondence.measurementcorrespondence.MeasurementcorrespondencePackage#getMonitorCorrespondenceRepository_MonitoredCactosEntityToMonitorCorrespondences()
	 * @see eu.cactosfp7.cactosim.correspondence.measurementcorrespondence.MonitoredCactosEntityToMonitorCorrespondence#getMonitorCorrespondenceRepository
	 * @model opposite="monitorCorrespondenceRepository" containment="true"
	 * @generated
	 */
	EList<MonitoredCactosEntityToMonitorCorrespondence> getMonitoredCactosEntityToMonitorCorrespondences();

} // MonitorCorrespondenceRepository
