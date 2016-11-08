/**
 */
package eu.cactosfp7.cactosim.correspondence.measurementcorrespondence;

import eu.cactosfp7.identifier.IdentifierPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see eu.cactosfp7.cactosim.correspondence.measurementcorrespondence.MeasurementcorrespondenceFactory
 * @model kind="package"
 * @generated
 */
public interface MeasurementcorrespondencePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "measurementcorrespondence";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.cactosfp7.eu/Correspondence/Measurement/1.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "measurementcorrespondence";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MeasurementcorrespondencePackage eINSTANCE = eu.cactosfp7.cactosim.correspondence.measurementcorrespondence.impl.MeasurementcorrespondencePackageImpl.init();

	/**
	 * The meta object id for the '{@link eu.cactosfp7.cactosim.correspondence.measurementcorrespondence.impl.MonitoredCactosEntityToMonitorCorrespondenceImpl <em>Monitored Cactos Entity To Monitor Correspondence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.cactosfp7.cactosim.correspondence.measurementcorrespondence.impl.MonitoredCactosEntityToMonitorCorrespondenceImpl
	 * @see eu.cactosfp7.cactosim.correspondence.measurementcorrespondence.impl.MeasurementcorrespondencePackageImpl#getMonitoredCactosEntityToMonitorCorrespondence()
	 * @generated
	 */
	int MONITORED_CACTOS_ENTITY_TO_MONITOR_CORRESPONDENCE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORED_CACTOS_ENTITY_TO_MONITOR_CORRESPONDENCE__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Cactos</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORED_CACTOS_ENTITY_TO_MONITOR_CORRESPONDENCE__CACTOS = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Palladio</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORED_CACTOS_ENTITY_TO_MONITOR_CORRESPONDENCE__PALLADIO = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Monitor Correspondence Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORED_CACTOS_ENTITY_TO_MONITOR_CORRESPONDENCE__MONITOR_CORRESPONDENCE_REPOSITORY = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Monitored Cactos Entity To Monitor Correspondence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORED_CACTOS_ENTITY_TO_MONITOR_CORRESPONDENCE_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link eu.cactosfp7.cactosim.correspondence.measurementcorrespondence.impl.MonitorCorrespondenceRepositoryImpl <em>Monitor Correspondence Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.cactosfp7.cactosim.correspondence.measurementcorrespondence.impl.MonitorCorrespondenceRepositoryImpl
	 * @see eu.cactosfp7.cactosim.correspondence.measurementcorrespondence.impl.MeasurementcorrespondencePackageImpl#getMonitorCorrespondenceRepository()
	 * @generated
	 */
	int MONITOR_CORRESPONDENCE_REPOSITORY = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR_CORRESPONDENCE_REPOSITORY__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Monitored Cactos Entity To Monitor Correspondences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR_CORRESPONDENCE_REPOSITORY__MONITORED_CACTOS_ENTITY_TO_MONITOR_CORRESPONDENCES = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Monitor Correspondence Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR_CORRESPONDENCE_REPOSITORY_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link eu.cactosfp7.cactosim.correspondence.measurementcorrespondence.MonitoredCactosEntityToMonitorCorrespondence <em>Monitored Cactos Entity To Monitor Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Monitored Cactos Entity To Monitor Correspondence</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.measurementcorrespondence.MonitoredCactosEntityToMonitorCorrespondence
	 * @generated
	 */
	EClass getMonitoredCactosEntityToMonitorCorrespondence();

	/**
	 * Returns the meta object for the reference '{@link eu.cactosfp7.cactosim.correspondence.measurementcorrespondence.MonitoredCactosEntityToMonitorCorrespondence#getCactos <em>Cactos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cactos</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.measurementcorrespondence.MonitoredCactosEntityToMonitorCorrespondence#getCactos()
	 * @see #getMonitoredCactosEntityToMonitorCorrespondence()
	 * @generated
	 */
	EReference getMonitoredCactosEntityToMonitorCorrespondence_Cactos();

	/**
	 * Returns the meta object for the reference '{@link eu.cactosfp7.cactosim.correspondence.measurementcorrespondence.MonitoredCactosEntityToMonitorCorrespondence#getPalladio <em>Palladio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Palladio</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.measurementcorrespondence.MonitoredCactosEntityToMonitorCorrespondence#getPalladio()
	 * @see #getMonitoredCactosEntityToMonitorCorrespondence()
	 * @generated
	 */
	EReference getMonitoredCactosEntityToMonitorCorrespondence_Palladio();

	/**
	 * Returns the meta object for the container reference '{@link eu.cactosfp7.cactosim.correspondence.measurementcorrespondence.MonitoredCactosEntityToMonitorCorrespondence#getMonitorCorrespondenceRepository <em>Monitor Correspondence Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Monitor Correspondence Repository</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.measurementcorrespondence.MonitoredCactosEntityToMonitorCorrespondence#getMonitorCorrespondenceRepository()
	 * @see #getMonitoredCactosEntityToMonitorCorrespondence()
	 * @generated
	 */
	EReference getMonitoredCactosEntityToMonitorCorrespondence_MonitorCorrespondenceRepository();

	/**
	 * Returns the meta object for class '{@link eu.cactosfp7.cactosim.correspondence.measurementcorrespondence.MonitorCorrespondenceRepository <em>Monitor Correspondence Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Monitor Correspondence Repository</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.measurementcorrespondence.MonitorCorrespondenceRepository
	 * @generated
	 */
	EClass getMonitorCorrespondenceRepository();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.cactosfp7.cactosim.correspondence.measurementcorrespondence.MonitorCorrespondenceRepository#getMonitoredCactosEntityToMonitorCorrespondences <em>Monitored Cactos Entity To Monitor Correspondences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Monitored Cactos Entity To Monitor Correspondences</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.measurementcorrespondence.MonitorCorrespondenceRepository#getMonitoredCactosEntityToMonitorCorrespondences()
	 * @see #getMonitorCorrespondenceRepository()
	 * @generated
	 */
	EReference getMonitorCorrespondenceRepository_MonitoredCactosEntityToMonitorCorrespondences();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MeasurementcorrespondenceFactory getMeasurementcorrespondenceFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link eu.cactosfp7.cactosim.correspondence.measurementcorrespondence.impl.MonitoredCactosEntityToMonitorCorrespondenceImpl <em>Monitored Cactos Entity To Monitor Correspondence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.cactosfp7.cactosim.correspondence.measurementcorrespondence.impl.MonitoredCactosEntityToMonitorCorrespondenceImpl
		 * @see eu.cactosfp7.cactosim.correspondence.measurementcorrespondence.impl.MeasurementcorrespondencePackageImpl#getMonitoredCactosEntityToMonitorCorrespondence()
		 * @generated
		 */
		EClass MONITORED_CACTOS_ENTITY_TO_MONITOR_CORRESPONDENCE = eINSTANCE.getMonitoredCactosEntityToMonitorCorrespondence();

		/**
		 * The meta object literal for the '<em><b>Cactos</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MONITORED_CACTOS_ENTITY_TO_MONITOR_CORRESPONDENCE__CACTOS = eINSTANCE.getMonitoredCactosEntityToMonitorCorrespondence_Cactos();

		/**
		 * The meta object literal for the '<em><b>Palladio</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MONITORED_CACTOS_ENTITY_TO_MONITOR_CORRESPONDENCE__PALLADIO = eINSTANCE.getMonitoredCactosEntityToMonitorCorrespondence_Palladio();

		/**
		 * The meta object literal for the '<em><b>Monitor Correspondence Repository</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MONITORED_CACTOS_ENTITY_TO_MONITOR_CORRESPONDENCE__MONITOR_CORRESPONDENCE_REPOSITORY = eINSTANCE.getMonitoredCactosEntityToMonitorCorrespondence_MonitorCorrespondenceRepository();

		/**
		 * The meta object literal for the '{@link eu.cactosfp7.cactosim.correspondence.measurementcorrespondence.impl.MonitorCorrespondenceRepositoryImpl <em>Monitor Correspondence Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.cactosfp7.cactosim.correspondence.measurementcorrespondence.impl.MonitorCorrespondenceRepositoryImpl
		 * @see eu.cactosfp7.cactosim.correspondence.measurementcorrespondence.impl.MeasurementcorrespondencePackageImpl#getMonitorCorrespondenceRepository()
		 * @generated
		 */
		EClass MONITOR_CORRESPONDENCE_REPOSITORY = eINSTANCE.getMonitorCorrespondenceRepository();

		/**
		 * The meta object literal for the '<em><b>Monitored Cactos Entity To Monitor Correspondences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MONITOR_CORRESPONDENCE_REPOSITORY__MONITORED_CACTOS_ENTITY_TO_MONITOR_CORRESPONDENCES = eINSTANCE.getMonitorCorrespondenceRepository_MonitoredCactosEntityToMonitorCorrespondences();

	}

} //MeasurementcorrespondencePackage
