/**
 */
package eu.cactosfp7.cactosim.correspondence.measurementcorrespondence;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see eu.cactosfp7.cactosim.correspondence.measurementcorrespondence.MeasurementcorrespondencePackage
 * @generated
 */
public interface MeasurementcorrespondenceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MeasurementcorrespondenceFactory eINSTANCE = eu.cactosfp7.cactosim.correspondence.measurementcorrespondence.impl.MeasurementcorrespondenceFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Monitored Cactos Entity To Monitor Correspondence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Monitored Cactos Entity To Monitor Correspondence</em>'.
	 * @generated
	 */
	MonitoredCactosEntityToMonitorCorrespondence createMonitoredCactosEntityToMonitorCorrespondence();

	/**
	 * Returns a new object of class '<em>Monitor Correspondence Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Monitor Correspondence Repository</em>'.
	 * @generated
	 */
	MonitorCorrespondenceRepository createMonitorCorrespondenceRepository();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MeasurementcorrespondencePackage getMeasurementcorrespondencePackage();

} //MeasurementcorrespondenceFactory
