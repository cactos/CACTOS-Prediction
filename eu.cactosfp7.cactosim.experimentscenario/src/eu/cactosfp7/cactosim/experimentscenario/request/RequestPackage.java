/**
 */
package eu.cactosfp7.cactosim.experimentscenario.request;

import eu.cactosfp7.identifier.IdentifierPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see eu.cactosfp7.cactosim.experimentscenario.request.RequestFactory
 * @model kind="package"
 * @generated
 */
public interface RequestPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "request";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.cactosfp7.eu/ExperimentScenarioModel/Request/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "request";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RequestPackage eINSTANCE = eu.cactosfp7.cactosim.experimentscenario.request.impl.RequestPackageImpl.init();

	/**
	 * The meta object id for the '{@link eu.cactosfp7.cactosim.experimentscenario.request.impl.ExperimentScenarioRequestImpl <em>Experiment Scenario Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.cactosfp7.cactosim.experimentscenario.request.impl.ExperimentScenarioRequestImpl
	 * @see eu.cactosfp7.cactosim.experimentscenario.request.impl.RequestPackageImpl#getExperimentScenarioRequest()
	 * @generated
	 */
	int EXPERIMENT_SCENARIO_REQUEST = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int EXPERIMENT_SCENARIO_REQUEST__ID = IdentifierPackage.IDENTIFIER__ID;

    /**
	 * The feature id for the '<em><b>Timeline Event</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_SCENARIO_REQUEST__TIMELINE_EVENT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Experiment Scenario Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_SCENARIO_REQUEST_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Id Has To Be Unique</em>' operation.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int EXPERIMENT_SCENARIO_REQUEST___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP = IdentifierPackage.IDENTIFIER___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP;

    /**
	 * The number of operations of the '<em>Experiment Scenario Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_SCENARIO_REQUEST_OPERATION_COUNT = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.cactosfp7.cactosim.experimentscenario.request.impl.ReconfigureOptimizationAlgorithmRequestImpl <em>Reconfigure Optimization Algorithm Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.cactosfp7.cactosim.experimentscenario.request.impl.ReconfigureOptimizationAlgorithmRequestImpl
	 * @see eu.cactosfp7.cactosim.experimentscenario.request.impl.RequestPackageImpl#getReconfigureOptimizationAlgorithmRequest()
	 * @generated
	 */
	int RECONFIGURE_OPTIMIZATION_ALGORITHM_REQUEST = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RECONFIGURE_OPTIMIZATION_ALGORITHM_REQUEST__ID = EXPERIMENT_SCENARIO_REQUEST__ID;

    /**
	 * The feature id for the '<em><b>Timeline Event</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURE_OPTIMIZATION_ALGORITHM_REQUEST__TIMELINE_EVENT = EXPERIMENT_SCENARIO_REQUEST__TIMELINE_EVENT;

	/**
	 * The feature id for the '<em><b>Algorithm Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURE_OPTIMIZATION_ALGORITHM_REQUEST__ALGORITHM_NAME = EXPERIMENT_SCENARIO_REQUEST_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Algorithm Parameters</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURE_OPTIMIZATION_ALGORITHM_REQUEST__ALGORITHM_PARAMETERS = EXPERIMENT_SCENARIO_REQUEST_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Reconfigure Optimization Algorithm Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURE_OPTIMIZATION_ALGORITHM_REQUEST_FEATURE_COUNT = EXPERIMENT_SCENARIO_REQUEST_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Id Has To Be Unique</em>' operation.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RECONFIGURE_OPTIMIZATION_ALGORITHM_REQUEST___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP = EXPERIMENT_SCENARIO_REQUEST___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP;

    /**
	 * The number of operations of the '<em>Reconfigure Optimization Algorithm Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURE_OPTIMIZATION_ALGORITHM_REQUEST_OPERATION_COUNT = EXPERIMENT_SCENARIO_REQUEST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.cactosfp7.cactosim.experimentscenario.request.impl.MigrateApplicationRequestImpl <em>Migrate Application Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.cactosfp7.cactosim.experimentscenario.request.impl.MigrateApplicationRequestImpl
	 * @see eu.cactosfp7.cactosim.experimentscenario.request.impl.RequestPackageImpl#getMigrateApplicationRequest()
	 * @generated
	 */
	int MIGRATE_APPLICATION_REQUEST = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MIGRATE_APPLICATION_REQUEST__ID = EXPERIMENT_SCENARIO_REQUEST__ID;

    /**
	 * The feature id for the '<em><b>Timeline Event</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATE_APPLICATION_REQUEST__TIMELINE_EVENT = EXPERIMENT_SCENARIO_REQUEST__TIMELINE_EVENT;

	/**
	 * The feature id for the '<em><b>Target Physical Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATE_APPLICATION_REQUEST__TARGET_PHYSICAL_NODE = EXPERIMENT_SCENARIO_REQUEST_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Application Instance Selector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATE_APPLICATION_REQUEST__APPLICATION_INSTANCE_SELECTOR = EXPERIMENT_SCENARIO_REQUEST_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Migrate Application Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATE_APPLICATION_REQUEST_FEATURE_COUNT = EXPERIMENT_SCENARIO_REQUEST_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Id Has To Be Unique</em>' operation.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MIGRATE_APPLICATION_REQUEST___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP = EXPERIMENT_SCENARIO_REQUEST___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP;

    /**
	 * The number of operations of the '<em>Migrate Application Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATE_APPLICATION_REQUEST_OPERATION_COUNT = EXPERIMENT_SCENARIO_REQUEST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.cactosfp7.cactosim.experimentscenario.request.impl.StartApplicationRequestImpl <em>Start Application Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.cactosfp7.cactosim.experimentscenario.request.impl.StartApplicationRequestImpl
	 * @see eu.cactosfp7.cactosim.experimentscenario.request.impl.RequestPackageImpl#getStartApplicationRequest()
	 * @generated
	 */
	int START_APPLICATION_REQUEST = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int START_APPLICATION_REQUEST__ID = EXPERIMENT_SCENARIO_REQUEST__ID;

    /**
	 * The feature id for the '<em><b>Timeline Event</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_APPLICATION_REQUEST__TIMELINE_EVENT = EXPERIMENT_SCENARIO_REQUEST__TIMELINE_EVENT;

	/**
	 * The feature id for the '<em><b>Application Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_APPLICATION_REQUEST__APPLICATION_TEMPLATE = EXPERIMENT_SCENARIO_REQUEST_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Application Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_APPLICATION_REQUEST__APPLICATION_INSTANCE = EXPERIMENT_SCENARIO_REQUEST_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Vm Flavour</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int START_APPLICATION_REQUEST__VM_FLAVOUR = EXPERIMENT_SCENARIO_REQUEST_FEATURE_COUNT + 2;

    /**
	 * The feature id for the '<em><b>Input Parameters</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_APPLICATION_REQUEST__INPUT_PARAMETERS = EXPERIMENT_SCENARIO_REQUEST_FEATURE_COUNT + 3;

				/**
	 * The number of structural features of the '<em>Start Application Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_APPLICATION_REQUEST_FEATURE_COUNT = EXPERIMENT_SCENARIO_REQUEST_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Id Has To Be Unique</em>' operation.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int START_APPLICATION_REQUEST___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP = EXPERIMENT_SCENARIO_REQUEST___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP;

    /**
	 * The operation id for the '<em>Application Instance Must Be Of The Right Template</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_APPLICATION_REQUEST___APPLICATION_INSTANCE_MUST_BE_OF_THE_RIGHT_TEMPLATE__DIAGNOSTICCHAIN_MAP = EXPERIMENT_SCENARIO_REQUEST_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Start Application Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_APPLICATION_REQUEST_OPERATION_COUNT = EXPERIMENT_SCENARIO_REQUEST_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link eu.cactosfp7.cactosim.experimentscenario.request.impl.SuspendApplicationRequestImpl <em>Suspend Application Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.cactosfp7.cactosim.experimentscenario.request.impl.SuspendApplicationRequestImpl
	 * @see eu.cactosfp7.cactosim.experimentscenario.request.impl.RequestPackageImpl#getSuspendApplicationRequest()
	 * @generated
	 */
	int SUSPEND_APPLICATION_REQUEST = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SUSPEND_APPLICATION_REQUEST__ID = EXPERIMENT_SCENARIO_REQUEST__ID;

    /**
	 * The feature id for the '<em><b>Timeline Event</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSPEND_APPLICATION_REQUEST__TIMELINE_EVENT = EXPERIMENT_SCENARIO_REQUEST__TIMELINE_EVENT;

	/**
	 * The feature id for the '<em><b>Running Application Selector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSPEND_APPLICATION_REQUEST__RUNNING_APPLICATION_SELECTOR = EXPERIMENT_SCENARIO_REQUEST_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Suspend Application Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSPEND_APPLICATION_REQUEST_FEATURE_COUNT = EXPERIMENT_SCENARIO_REQUEST_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Id Has To Be Unique</em>' operation.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SUSPEND_APPLICATION_REQUEST___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP = EXPERIMENT_SCENARIO_REQUEST___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP;

    /**
	 * The number of operations of the '<em>Suspend Application Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSPEND_APPLICATION_REQUEST_OPERATION_COUNT = EXPERIMENT_SCENARIO_REQUEST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.cactosfp7.cactosim.experimentscenario.request.impl.TerminateApplicationRequestImpl <em>Terminate Application Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.cactosfp7.cactosim.experimentscenario.request.impl.TerminateApplicationRequestImpl
	 * @see eu.cactosfp7.cactosim.experimentscenario.request.impl.RequestPackageImpl#getTerminateApplicationRequest()
	 * @generated
	 */
	int TERMINATE_APPLICATION_REQUEST = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int TERMINATE_APPLICATION_REQUEST__ID = EXPERIMENT_SCENARIO_REQUEST__ID;

    /**
	 * The feature id for the '<em><b>Timeline Event</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATE_APPLICATION_REQUEST__TIMELINE_EVENT = EXPERIMENT_SCENARIO_REQUEST__TIMELINE_EVENT;

	/**
	 * The feature id for the '<em><b>Running Application Selector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATE_APPLICATION_REQUEST__RUNNING_APPLICATION_SELECTOR = EXPERIMENT_SCENARIO_REQUEST_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Terminate Application Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATE_APPLICATION_REQUEST_FEATURE_COUNT = EXPERIMENT_SCENARIO_REQUEST_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Id Has To Be Unique</em>' operation.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int TERMINATE_APPLICATION_REQUEST___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP = EXPERIMENT_SCENARIO_REQUEST___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP;

    /**
	 * The number of operations of the '<em>Terminate Application Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATE_APPLICATION_REQUEST_OPERATION_COUNT = EXPERIMENT_SCENARIO_REQUEST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.cactosfp7.cactosim.experimentscenario.request.impl.ChangeOptimizationIntervalRequestImpl <em>Change Optimization Interval Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.cactosfp7.cactosim.experimentscenario.request.impl.ChangeOptimizationIntervalRequestImpl
	 * @see eu.cactosfp7.cactosim.experimentscenario.request.impl.RequestPackageImpl#getChangeOptimizationIntervalRequest()
	 * @generated
	 */
	int CHANGE_OPTIMIZATION_INTERVAL_REQUEST = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CHANGE_OPTIMIZATION_INTERVAL_REQUEST__ID = EXPERIMENT_SCENARIO_REQUEST__ID;

    /**
	 * The feature id for the '<em><b>Timeline Event</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_OPTIMIZATION_INTERVAL_REQUEST__TIMELINE_EVENT = EXPERIMENT_SCENARIO_REQUEST__TIMELINE_EVENT;

	/**
	 * The feature id for the '<em><b>Optimization Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_OPTIMIZATION_INTERVAL_REQUEST__OPTIMIZATION_INTERVAL = EXPERIMENT_SCENARIO_REQUEST_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Change Optimization Interval Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_OPTIMIZATION_INTERVAL_REQUEST_FEATURE_COUNT = EXPERIMENT_SCENARIO_REQUEST_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Id Has To Be Unique</em>' operation.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CHANGE_OPTIMIZATION_INTERVAL_REQUEST___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP = EXPERIMENT_SCENARIO_REQUEST___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP;

    /**
	 * The number of operations of the '<em>Change Optimization Interval Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_OPTIMIZATION_INTERVAL_REQUEST_OPERATION_COUNT = EXPERIMENT_SCENARIO_REQUEST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.cactosfp7.cactosim.experimentscenario.request.impl.ReconfigureScalableImageConnectorRequestImpl <em>Reconfigure Scalable Image Connector Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.cactosfp7.cactosim.experimentscenario.request.impl.ReconfigureScalableImageConnectorRequestImpl
	 * @see eu.cactosfp7.cactosim.experimentscenario.request.impl.RequestPackageImpl#getReconfigureScalableImageConnectorRequest()
	 * @generated
	 */
	int RECONFIGURE_SCALABLE_IMAGE_CONNECTOR_REQUEST = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RECONFIGURE_SCALABLE_IMAGE_CONNECTOR_REQUEST__ID = EXPERIMENT_SCENARIO_REQUEST__ID;

    /**
	 * The feature id for the '<em><b>Timeline Event</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURE_SCALABLE_IMAGE_CONNECTOR_REQUEST__TIMELINE_EVENT = EXPERIMENT_SCENARIO_REQUEST__TIMELINE_EVENT;

	/**
	 * The feature id for the '<em><b>White Box Application Instance Selector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURE_SCALABLE_IMAGE_CONNECTOR_REQUEST__WHITE_BOX_APPLICATION_INSTANCE_SELECTOR = EXPERIMENT_SCENARIO_REQUEST_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Load Balancing Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURE_SCALABLE_IMAGE_CONNECTOR_REQUEST__LOAD_BALANCING_POLICY = EXPERIMENT_SCENARIO_REQUEST_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Autoscaling Analysis Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURE_SCALABLE_IMAGE_CONNECTOR_REQUEST__AUTOSCALING_ANALYSIS_INTERVAL = EXPERIMENT_SCENARIO_REQUEST_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Target Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURE_SCALABLE_IMAGE_CONNECTOR_REQUEST__TARGET_CONNECTOR = EXPERIMENT_SCENARIO_REQUEST_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Reconfigure Scalable Image Connector Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURE_SCALABLE_IMAGE_CONNECTOR_REQUEST_FEATURE_COUNT = EXPERIMENT_SCENARIO_REQUEST_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Id Has To Be Unique</em>' operation.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RECONFIGURE_SCALABLE_IMAGE_CONNECTOR_REQUEST___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP = EXPERIMENT_SCENARIO_REQUEST___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP;

    /**
	 * The number of operations of the '<em>Reconfigure Scalable Image Connector Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURE_SCALABLE_IMAGE_CONNECTOR_REQUEST_OPERATION_COUNT = EXPERIMENT_SCENARIO_REQUEST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.cactosfp7.cactosim.experimentscenario.request.impl.SetPhysicalNodeStateRequestImpl <em>Set Physical Node State Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.cactosfp7.cactosim.experimentscenario.request.impl.SetPhysicalNodeStateRequestImpl
	 * @see eu.cactosfp7.cactosim.experimentscenario.request.impl.RequestPackageImpl#getSetPhysicalNodeStateRequest()
	 * @generated
	 */
	int SET_PHYSICAL_NODE_STATE_REQUEST = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SET_PHYSICAL_NODE_STATE_REQUEST__ID = EXPERIMENT_SCENARIO_REQUEST__ID;

    /**
	 * The feature id for the '<em><b>Timeline Event</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_PHYSICAL_NODE_STATE_REQUEST__TIMELINE_EVENT = EXPERIMENT_SCENARIO_REQUEST__TIMELINE_EVENT;

	/**
	 * The feature id for the '<em><b>Target Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_PHYSICAL_NODE_STATE_REQUEST__TARGET_NODE = EXPERIMENT_SCENARIO_REQUEST_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_PHYSICAL_NODE_STATE_REQUEST__TARGET_STATE = EXPERIMENT_SCENARIO_REQUEST_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Set Physical Node State Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_PHYSICAL_NODE_STATE_REQUEST_FEATURE_COUNT = EXPERIMENT_SCENARIO_REQUEST_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Id Has To Be Unique</em>' operation.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SET_PHYSICAL_NODE_STATE_REQUEST___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP = EXPERIMENT_SCENARIO_REQUEST___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP;

    /**
	 * The number of operations of the '<em>Set Physical Node State Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_PHYSICAL_NODE_STATE_REQUEST_OPERATION_COUNT = EXPERIMENT_SCENARIO_REQUEST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.cactosfp7.cactosim.experimentscenario.request.impl.ResumeApplicationRequestImpl <em>Resume Application Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.cactosfp7.cactosim.experimentscenario.request.impl.ResumeApplicationRequestImpl
	 * @see eu.cactosfp7.cactosim.experimentscenario.request.impl.RequestPackageImpl#getResumeApplicationRequest()
	 * @generated
	 */
	int RESUME_APPLICATION_REQUEST = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RESUME_APPLICATION_REQUEST__ID = EXPERIMENT_SCENARIO_REQUEST__ID;

    /**
	 * The feature id for the '<em><b>Timeline Event</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESUME_APPLICATION_REQUEST__TIMELINE_EVENT = EXPERIMENT_SCENARIO_REQUEST__TIMELINE_EVENT;

	/**
	 * The feature id for the '<em><b>Previously Suspended Application Selector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESUME_APPLICATION_REQUEST__PREVIOUSLY_SUSPENDED_APPLICATION_SELECTOR = EXPERIMENT_SCENARIO_REQUEST_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Resume Application Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESUME_APPLICATION_REQUEST_FEATURE_COUNT = EXPERIMENT_SCENARIO_REQUEST_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Id Has To Be Unique</em>' operation.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RESUME_APPLICATION_REQUEST___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP = EXPERIMENT_SCENARIO_REQUEST___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP;

    /**
	 * The number of operations of the '<em>Resume Application Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESUME_APPLICATION_REQUEST_OPERATION_COUNT = EXPERIMENT_SCENARIO_REQUEST_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link eu.cactosfp7.cactosim.experimentscenario.request.ReconfigureOptimizationAlgorithmRequest <em>Reconfigure Optimization Algorithm Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reconfigure Optimization Algorithm Request</em>'.
	 * @see eu.cactosfp7.cactosim.experimentscenario.request.ReconfigureOptimizationAlgorithmRequest
	 * @generated
	 */
	EClass getReconfigureOptimizationAlgorithmRequest();

	/**
	 * Returns the meta object for the attribute '{@link eu.cactosfp7.cactosim.experimentscenario.request.ReconfigureOptimizationAlgorithmRequest#getAlgorithmName <em>Algorithm Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Algorithm Name</em>'.
	 * @see eu.cactosfp7.cactosim.experimentscenario.request.ReconfigureOptimizationAlgorithmRequest#getAlgorithmName()
	 * @see #getReconfigureOptimizationAlgorithmRequest()
	 * @generated
	 */
	EAttribute getReconfigureOptimizationAlgorithmRequest_AlgorithmName();

	/**
	 * Returns the meta object for the map '{@link eu.cactosfp7.cactosim.experimentscenario.request.ReconfigureOptimizationAlgorithmRequest#getAlgorithmParameters <em>Algorithm Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Algorithm Parameters</em>'.
	 * @see eu.cactosfp7.cactosim.experimentscenario.request.ReconfigureOptimizationAlgorithmRequest#getAlgorithmParameters()
	 * @see #getReconfigureOptimizationAlgorithmRequest()
	 * @generated
	 */
	EReference getReconfigureOptimizationAlgorithmRequest_AlgorithmParameters();

	/**
	 * Returns the meta object for class '{@link eu.cactosfp7.cactosim.experimentscenario.request.MigrateApplicationRequest <em>Migrate Application Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Migrate Application Request</em>'.
	 * @see eu.cactosfp7.cactosim.experimentscenario.request.MigrateApplicationRequest
	 * @generated
	 */
	EClass getMigrateApplicationRequest();

	/**
	 * Returns the meta object for the reference '{@link eu.cactosfp7.cactosim.experimentscenario.request.MigrateApplicationRequest#getTargetPhysicalNode <em>Target Physical Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Physical Node</em>'.
	 * @see eu.cactosfp7.cactosim.experimentscenario.request.MigrateApplicationRequest#getTargetPhysicalNode()
	 * @see #getMigrateApplicationRequest()
	 * @generated
	 */
	EReference getMigrateApplicationRequest_TargetPhysicalNode();

	/**
	 * Returns the meta object for the containment reference '{@link eu.cactosfp7.cactosim.experimentscenario.request.MigrateApplicationRequest#getApplicationInstanceSelector <em>Application Instance Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Application Instance Selector</em>'.
	 * @see eu.cactosfp7.cactosim.experimentscenario.request.MigrateApplicationRequest#getApplicationInstanceSelector()
	 * @see #getMigrateApplicationRequest()
	 * @generated
	 */
	EReference getMigrateApplicationRequest_ApplicationInstanceSelector();

	/**
	 * Returns the meta object for class '{@link eu.cactosfp7.cactosim.experimentscenario.request.StartApplicationRequest <em>Start Application Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start Application Request</em>'.
	 * @see eu.cactosfp7.cactosim.experimentscenario.request.StartApplicationRequest
	 * @generated
	 */
	EClass getStartApplicationRequest();

	/**
	 * Returns the meta object for the reference '{@link eu.cactosfp7.cactosim.experimentscenario.request.StartApplicationRequest#getApplicationTemplate <em>Application Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Application Template</em>'.
	 * @see eu.cactosfp7.cactosim.experimentscenario.request.StartApplicationRequest#getApplicationTemplate()
	 * @see #getStartApplicationRequest()
	 * @generated
	 */
	EReference getStartApplicationRequest_ApplicationTemplate();

	/**
	 * Returns the meta object for the reference '{@link eu.cactosfp7.cactosim.experimentscenario.request.StartApplicationRequest#getApplicationInstance <em>Application Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Application Instance</em>'.
	 * @see eu.cactosfp7.cactosim.experimentscenario.request.StartApplicationRequest#getApplicationInstance()
	 * @see #getStartApplicationRequest()
	 * @generated
	 */
	EReference getStartApplicationRequest_ApplicationInstance();

	/**
	 * Returns the meta object for the reference '{@link eu.cactosfp7.cactosim.experimentscenario.request.StartApplicationRequest#getVmFlavour <em>Vm Flavour</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Vm Flavour</em>'.
	 * @see eu.cactosfp7.cactosim.experimentscenario.request.StartApplicationRequest#getVmFlavour()
	 * @see #getStartApplicationRequest()
	 * @generated
	 */
    EReference getStartApplicationRequest_VmFlavour();

    /**
	 * Returns the meta object for the map '{@link eu.cactosfp7.cactosim.experimentscenario.request.StartApplicationRequest#getInputParameters <em>Input Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Input Parameters</em>'.
	 * @see eu.cactosfp7.cactosim.experimentscenario.request.StartApplicationRequest#getInputParameters()
	 * @see #getStartApplicationRequest()
	 * @generated
	 */
	EReference getStartApplicationRequest_InputParameters();

				/**
	 * Returns the meta object for the '{@link eu.cactosfp7.cactosim.experimentscenario.request.StartApplicationRequest#applicationInstanceMustBeOfTheRightTemplate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Application Instance Must Be Of The Right Template</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Application Instance Must Be Of The Right Template</em>' operation.
	 * @see eu.cactosfp7.cactosim.experimentscenario.request.StartApplicationRequest#applicationInstanceMustBeOfTheRightTemplate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getStartApplicationRequest__ApplicationInstanceMustBeOfTheRightTemplate__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link eu.cactosfp7.cactosim.experimentscenario.request.SuspendApplicationRequest <em>Suspend Application Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Suspend Application Request</em>'.
	 * @see eu.cactosfp7.cactosim.experimentscenario.request.SuspendApplicationRequest
	 * @generated
	 */
	EClass getSuspendApplicationRequest();

	/**
	 * Returns the meta object for the containment reference '{@link eu.cactosfp7.cactosim.experimentscenario.request.SuspendApplicationRequest#getRunningApplicationSelector <em>Running Application Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Running Application Selector</em>'.
	 * @see eu.cactosfp7.cactosim.experimentscenario.request.SuspendApplicationRequest#getRunningApplicationSelector()
	 * @see #getSuspendApplicationRequest()
	 * @generated
	 */
	EReference getSuspendApplicationRequest_RunningApplicationSelector();

	/**
	 * Returns the meta object for class '{@link eu.cactosfp7.cactosim.experimentscenario.request.TerminateApplicationRequest <em>Terminate Application Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Terminate Application Request</em>'.
	 * @see eu.cactosfp7.cactosim.experimentscenario.request.TerminateApplicationRequest
	 * @generated
	 */
	EClass getTerminateApplicationRequest();

	/**
	 * Returns the meta object for the containment reference '{@link eu.cactosfp7.cactosim.experimentscenario.request.TerminateApplicationRequest#getRunningApplicationSelector <em>Running Application Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Running Application Selector</em>'.
	 * @see eu.cactosfp7.cactosim.experimentscenario.request.TerminateApplicationRequest#getRunningApplicationSelector()
	 * @see #getTerminateApplicationRequest()
	 * @generated
	 */
	EReference getTerminateApplicationRequest_RunningApplicationSelector();

	/**
	 * Returns the meta object for class '{@link eu.cactosfp7.cactosim.experimentscenario.request.ChangeOptimizationIntervalRequest <em>Change Optimization Interval Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Optimization Interval Request</em>'.
	 * @see eu.cactosfp7.cactosim.experimentscenario.request.ChangeOptimizationIntervalRequest
	 * @generated
	 */
	EClass getChangeOptimizationIntervalRequest();

	/**
	 * Returns the meta object for the attribute '{@link eu.cactosfp7.cactosim.experimentscenario.request.ChangeOptimizationIntervalRequest#getOptimizationInterval <em>Optimization Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optimization Interval</em>'.
	 * @see eu.cactosfp7.cactosim.experimentscenario.request.ChangeOptimizationIntervalRequest#getOptimizationInterval()
	 * @see #getChangeOptimizationIntervalRequest()
	 * @generated
	 */
	EAttribute getChangeOptimizationIntervalRequest_OptimizationInterval();

	/**
	 * Returns the meta object for class '{@link eu.cactosfp7.cactosim.experimentscenario.request.ReconfigureScalableImageConnectorRequest <em>Reconfigure Scalable Image Connector Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reconfigure Scalable Image Connector Request</em>'.
	 * @see eu.cactosfp7.cactosim.experimentscenario.request.ReconfigureScalableImageConnectorRequest
	 * @generated
	 */
	EClass getReconfigureScalableImageConnectorRequest();

	/**
	 * Returns the meta object for the containment reference '{@link eu.cactosfp7.cactosim.experimentscenario.request.ReconfigureScalableImageConnectorRequest#getWhiteBoxApplicationInstanceSelector <em>White Box Application Instance Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>White Box Application Instance Selector</em>'.
	 * @see eu.cactosfp7.cactosim.experimentscenario.request.ReconfigureScalableImageConnectorRequest#getWhiteBoxApplicationInstanceSelector()
	 * @see #getReconfigureScalableImageConnectorRequest()
	 * @generated
	 */
	EReference getReconfigureScalableImageConnectorRequest_WhiteBoxApplicationInstanceSelector();

	/**
	 * Returns the meta object for the attribute '{@link eu.cactosfp7.cactosim.experimentscenario.request.ReconfigureScalableImageConnectorRequest#getLoadBalancingPolicy <em>Load Balancing Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Load Balancing Policy</em>'.
	 * @see eu.cactosfp7.cactosim.experimentscenario.request.ReconfigureScalableImageConnectorRequest#getLoadBalancingPolicy()
	 * @see #getReconfigureScalableImageConnectorRequest()
	 * @generated
	 */
	EAttribute getReconfigureScalableImageConnectorRequest_LoadBalancingPolicy();

	/**
	 * Returns the meta object for the attribute '{@link eu.cactosfp7.cactosim.experimentscenario.request.ReconfigureScalableImageConnectorRequest#getAutoscalingAnalysisInterval <em>Autoscaling Analysis Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Autoscaling Analysis Interval</em>'.
	 * @see eu.cactosfp7.cactosim.experimentscenario.request.ReconfigureScalableImageConnectorRequest#getAutoscalingAnalysisInterval()
	 * @see #getReconfigureScalableImageConnectorRequest()
	 * @generated
	 */
	EAttribute getReconfigureScalableImageConnectorRequest_AutoscalingAnalysisInterval();

	/**
	 * Returns the meta object for the reference '{@link eu.cactosfp7.cactosim.experimentscenario.request.ReconfigureScalableImageConnectorRequest#getTargetConnector <em>Target Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Connector</em>'.
	 * @see eu.cactosfp7.cactosim.experimentscenario.request.ReconfigureScalableImageConnectorRequest#getTargetConnector()
	 * @see #getReconfigureScalableImageConnectorRequest()
	 * @generated
	 */
	EReference getReconfigureScalableImageConnectorRequest_TargetConnector();

	/**
	 * Returns the meta object for class '{@link eu.cactosfp7.cactosim.experimentscenario.request.SetPhysicalNodeStateRequest <em>Set Physical Node State Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Physical Node State Request</em>'.
	 * @see eu.cactosfp7.cactosim.experimentscenario.request.SetPhysicalNodeStateRequest
	 * @generated
	 */
	EClass getSetPhysicalNodeStateRequest();

	/**
	 * Returns the meta object for the reference '{@link eu.cactosfp7.cactosim.experimentscenario.request.SetPhysicalNodeStateRequest#getTargetNode <em>Target Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Node</em>'.
	 * @see eu.cactosfp7.cactosim.experimentscenario.request.SetPhysicalNodeStateRequest#getTargetNode()
	 * @see #getSetPhysicalNodeStateRequest()
	 * @generated
	 */
	EReference getSetPhysicalNodeStateRequest_TargetNode();

	/**
	 * Returns the meta object for the attribute '{@link eu.cactosfp7.cactosim.experimentscenario.request.SetPhysicalNodeStateRequest#getTargetState <em>Target State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target State</em>'.
	 * @see eu.cactosfp7.cactosim.experimentscenario.request.SetPhysicalNodeStateRequest#getTargetState()
	 * @see #getSetPhysicalNodeStateRequest()
	 * @generated
	 */
	EAttribute getSetPhysicalNodeStateRequest_TargetState();

	/**
	 * Returns the meta object for class '{@link eu.cactosfp7.cactosim.experimentscenario.request.ResumeApplicationRequest <em>Resume Application Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resume Application Request</em>'.
	 * @see eu.cactosfp7.cactosim.experimentscenario.request.ResumeApplicationRequest
	 * @generated
	 */
	EClass getResumeApplicationRequest();

	/**
	 * Returns the meta object for the containment reference '{@link eu.cactosfp7.cactosim.experimentscenario.request.ResumeApplicationRequest#getPreviouslySuspendedApplicationSelector <em>Previously Suspended Application Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Previously Suspended Application Selector</em>'.
	 * @see eu.cactosfp7.cactosim.experimentscenario.request.ResumeApplicationRequest#getPreviouslySuspendedApplicationSelector()
	 * @see #getResumeApplicationRequest()
	 * @generated
	 */
	EReference getResumeApplicationRequest_PreviouslySuspendedApplicationSelector();

	/**
	 * Returns the meta object for class '{@link eu.cactosfp7.cactosim.experimentscenario.request.ExperimentScenarioRequest <em>Experiment Scenario Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Experiment Scenario Request</em>'.
	 * @see eu.cactosfp7.cactosim.experimentscenario.request.ExperimentScenarioRequest
	 * @generated
	 */
	EClass getExperimentScenarioRequest();

	/**
	 * Returns the meta object for the container reference '{@link eu.cactosfp7.cactosim.experimentscenario.request.ExperimentScenarioRequest#getTimelineEvent <em>Timeline Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Timeline Event</em>'.
	 * @see eu.cactosfp7.cactosim.experimentscenario.request.ExperimentScenarioRequest#getTimelineEvent()
	 * @see #getExperimentScenarioRequest()
	 * @generated
	 */
	EReference getExperimentScenarioRequest_TimelineEvent();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RequestFactory getRequestFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link eu.cactosfp7.cactosim.experimentscenario.request.impl.ReconfigureOptimizationAlgorithmRequestImpl <em>Reconfigure Optimization Algorithm Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.cactosfp7.cactosim.experimentscenario.request.impl.ReconfigureOptimizationAlgorithmRequestImpl
		 * @see eu.cactosfp7.cactosim.experimentscenario.request.impl.RequestPackageImpl#getReconfigureOptimizationAlgorithmRequest()
		 * @generated
		 */
		EClass RECONFIGURE_OPTIMIZATION_ALGORITHM_REQUEST = eINSTANCE.getReconfigureOptimizationAlgorithmRequest();

		/**
		 * The meta object literal for the '<em><b>Algorithm Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECONFIGURE_OPTIMIZATION_ALGORITHM_REQUEST__ALGORITHM_NAME = eINSTANCE.getReconfigureOptimizationAlgorithmRequest_AlgorithmName();

		/**
		 * The meta object literal for the '<em><b>Algorithm Parameters</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECONFIGURE_OPTIMIZATION_ALGORITHM_REQUEST__ALGORITHM_PARAMETERS = eINSTANCE.getReconfigureOptimizationAlgorithmRequest_AlgorithmParameters();

		/**
		 * The meta object literal for the '{@link eu.cactosfp7.cactosim.experimentscenario.request.impl.MigrateApplicationRequestImpl <em>Migrate Application Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.cactosfp7.cactosim.experimentscenario.request.impl.MigrateApplicationRequestImpl
		 * @see eu.cactosfp7.cactosim.experimentscenario.request.impl.RequestPackageImpl#getMigrateApplicationRequest()
		 * @generated
		 */
		EClass MIGRATE_APPLICATION_REQUEST = eINSTANCE.getMigrateApplicationRequest();

		/**
		 * The meta object literal for the '<em><b>Target Physical Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MIGRATE_APPLICATION_REQUEST__TARGET_PHYSICAL_NODE = eINSTANCE.getMigrateApplicationRequest_TargetPhysicalNode();

		/**
		 * The meta object literal for the '<em><b>Application Instance Selector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MIGRATE_APPLICATION_REQUEST__APPLICATION_INSTANCE_SELECTOR = eINSTANCE.getMigrateApplicationRequest_ApplicationInstanceSelector();

		/**
		 * The meta object literal for the '{@link eu.cactosfp7.cactosim.experimentscenario.request.impl.StartApplicationRequestImpl <em>Start Application Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.cactosfp7.cactosim.experimentscenario.request.impl.StartApplicationRequestImpl
		 * @see eu.cactosfp7.cactosim.experimentscenario.request.impl.RequestPackageImpl#getStartApplicationRequest()
		 * @generated
		 */
		EClass START_APPLICATION_REQUEST = eINSTANCE.getStartApplicationRequest();

		/**
		 * The meta object literal for the '<em><b>Application Template</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference START_APPLICATION_REQUEST__APPLICATION_TEMPLATE = eINSTANCE.getStartApplicationRequest_ApplicationTemplate();

		/**
		 * The meta object literal for the '<em><b>Application Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference START_APPLICATION_REQUEST__APPLICATION_INSTANCE = eINSTANCE.getStartApplicationRequest_ApplicationInstance();

		/**
		 * The meta object literal for the '<em><b>Vm Flavour</b></em>' reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference START_APPLICATION_REQUEST__VM_FLAVOUR = eINSTANCE.getStartApplicationRequest_VmFlavour();

        /**
		 * The meta object literal for the '<em><b>Input Parameters</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference START_APPLICATION_REQUEST__INPUT_PARAMETERS = eINSTANCE.getStartApplicationRequest_InputParameters();

								/**
		 * The meta object literal for the '<em><b>Application Instance Must Be Of The Right Template</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation START_APPLICATION_REQUEST___APPLICATION_INSTANCE_MUST_BE_OF_THE_RIGHT_TEMPLATE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getStartApplicationRequest__ApplicationInstanceMustBeOfTheRightTemplate__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link eu.cactosfp7.cactosim.experimentscenario.request.impl.SuspendApplicationRequestImpl <em>Suspend Application Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.cactosfp7.cactosim.experimentscenario.request.impl.SuspendApplicationRequestImpl
		 * @see eu.cactosfp7.cactosim.experimentscenario.request.impl.RequestPackageImpl#getSuspendApplicationRequest()
		 * @generated
		 */
		EClass SUSPEND_APPLICATION_REQUEST = eINSTANCE.getSuspendApplicationRequest();

		/**
		 * The meta object literal for the '<em><b>Running Application Selector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUSPEND_APPLICATION_REQUEST__RUNNING_APPLICATION_SELECTOR = eINSTANCE.getSuspendApplicationRequest_RunningApplicationSelector();

		/**
		 * The meta object literal for the '{@link eu.cactosfp7.cactosim.experimentscenario.request.impl.TerminateApplicationRequestImpl <em>Terminate Application Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.cactosfp7.cactosim.experimentscenario.request.impl.TerminateApplicationRequestImpl
		 * @see eu.cactosfp7.cactosim.experimentscenario.request.impl.RequestPackageImpl#getTerminateApplicationRequest()
		 * @generated
		 */
		EClass TERMINATE_APPLICATION_REQUEST = eINSTANCE.getTerminateApplicationRequest();

		/**
		 * The meta object literal for the '<em><b>Running Application Selector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERMINATE_APPLICATION_REQUEST__RUNNING_APPLICATION_SELECTOR = eINSTANCE.getTerminateApplicationRequest_RunningApplicationSelector();

		/**
		 * The meta object literal for the '{@link eu.cactosfp7.cactosim.experimentscenario.request.impl.ChangeOptimizationIntervalRequestImpl <em>Change Optimization Interval Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.cactosfp7.cactosim.experimentscenario.request.impl.ChangeOptimizationIntervalRequestImpl
		 * @see eu.cactosfp7.cactosim.experimentscenario.request.impl.RequestPackageImpl#getChangeOptimizationIntervalRequest()
		 * @generated
		 */
		EClass CHANGE_OPTIMIZATION_INTERVAL_REQUEST = eINSTANCE.getChangeOptimizationIntervalRequest();

		/**
		 * The meta object literal for the '<em><b>Optimization Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_OPTIMIZATION_INTERVAL_REQUEST__OPTIMIZATION_INTERVAL = eINSTANCE.getChangeOptimizationIntervalRequest_OptimizationInterval();

		/**
		 * The meta object literal for the '{@link eu.cactosfp7.cactosim.experimentscenario.request.impl.ReconfigureScalableImageConnectorRequestImpl <em>Reconfigure Scalable Image Connector Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.cactosfp7.cactosim.experimentscenario.request.impl.ReconfigureScalableImageConnectorRequestImpl
		 * @see eu.cactosfp7.cactosim.experimentscenario.request.impl.RequestPackageImpl#getReconfigureScalableImageConnectorRequest()
		 * @generated
		 */
		EClass RECONFIGURE_SCALABLE_IMAGE_CONNECTOR_REQUEST = eINSTANCE.getReconfigureScalableImageConnectorRequest();

		/**
		 * The meta object literal for the '<em><b>White Box Application Instance Selector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECONFIGURE_SCALABLE_IMAGE_CONNECTOR_REQUEST__WHITE_BOX_APPLICATION_INSTANCE_SELECTOR = eINSTANCE.getReconfigureScalableImageConnectorRequest_WhiteBoxApplicationInstanceSelector();

		/**
		 * The meta object literal for the '<em><b>Load Balancing Policy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECONFIGURE_SCALABLE_IMAGE_CONNECTOR_REQUEST__LOAD_BALANCING_POLICY = eINSTANCE.getReconfigureScalableImageConnectorRequest_LoadBalancingPolicy();

		/**
		 * The meta object literal for the '<em><b>Autoscaling Analysis Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECONFIGURE_SCALABLE_IMAGE_CONNECTOR_REQUEST__AUTOSCALING_ANALYSIS_INTERVAL = eINSTANCE.getReconfigureScalableImageConnectorRequest_AutoscalingAnalysisInterval();

		/**
		 * The meta object literal for the '<em><b>Target Connector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECONFIGURE_SCALABLE_IMAGE_CONNECTOR_REQUEST__TARGET_CONNECTOR = eINSTANCE.getReconfigureScalableImageConnectorRequest_TargetConnector();

		/**
		 * The meta object literal for the '{@link eu.cactosfp7.cactosim.experimentscenario.request.impl.SetPhysicalNodeStateRequestImpl <em>Set Physical Node State Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.cactosfp7.cactosim.experimentscenario.request.impl.SetPhysicalNodeStateRequestImpl
		 * @see eu.cactosfp7.cactosim.experimentscenario.request.impl.RequestPackageImpl#getSetPhysicalNodeStateRequest()
		 * @generated
		 */
		EClass SET_PHYSICAL_NODE_STATE_REQUEST = eINSTANCE.getSetPhysicalNodeStateRequest();

		/**
		 * The meta object literal for the '<em><b>Target Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_PHYSICAL_NODE_STATE_REQUEST__TARGET_NODE = eINSTANCE.getSetPhysicalNodeStateRequest_TargetNode();

		/**
		 * The meta object literal for the '<em><b>Target State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_PHYSICAL_NODE_STATE_REQUEST__TARGET_STATE = eINSTANCE.getSetPhysicalNodeStateRequest_TargetState();

		/**
		 * The meta object literal for the '{@link eu.cactosfp7.cactosim.experimentscenario.request.impl.ResumeApplicationRequestImpl <em>Resume Application Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.cactosfp7.cactosim.experimentscenario.request.impl.ResumeApplicationRequestImpl
		 * @see eu.cactosfp7.cactosim.experimentscenario.request.impl.RequestPackageImpl#getResumeApplicationRequest()
		 * @generated
		 */
		EClass RESUME_APPLICATION_REQUEST = eINSTANCE.getResumeApplicationRequest();

		/**
		 * The meta object literal for the '<em><b>Previously Suspended Application Selector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESUME_APPLICATION_REQUEST__PREVIOUSLY_SUSPENDED_APPLICATION_SELECTOR = eINSTANCE.getResumeApplicationRequest_PreviouslySuspendedApplicationSelector();

		/**
		 * The meta object literal for the '{@link eu.cactosfp7.cactosim.experimentscenario.request.impl.ExperimentScenarioRequestImpl <em>Experiment Scenario Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.cactosfp7.cactosim.experimentscenario.request.impl.ExperimentScenarioRequestImpl
		 * @see eu.cactosfp7.cactosim.experimentscenario.request.impl.RequestPackageImpl#getExperimentScenarioRequest()
		 * @generated
		 */
		EClass EXPERIMENT_SCENARIO_REQUEST = eINSTANCE.getExperimentScenarioRequest();

		/**
		 * The meta object literal for the '<em><b>Timeline Event</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPERIMENT_SCENARIO_REQUEST__TIMELINE_EVENT = eINSTANCE.getExperimentScenarioRequest_TimelineEvent();

	}

} //RequestPackage
