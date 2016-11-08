/**
 */
package eu.cactosfp7.cactosim.experimentscenario;

import eu.cactosfp7.identifier.IdentifierPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see eu.cactosfp7.cactosim.experimentscenario.ExperimentscenarioFactory
 * @model kind="package"
 * @generated
 */
public interface ExperimentscenarioPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "experimentscenario";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.cactosfp7.eu/ExperimentScenarioModel/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "experimentscenario";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExperimentscenarioPackage eINSTANCE = eu.cactosfp7.cactosim.experimentscenario.impl.ExperimentscenarioPackageImpl.init();

	/**
	 * The meta object id for the '{@link eu.cactosfp7.cactosim.experimentscenario.impl.TimeLineEventImpl <em>Time Line Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.cactosfp7.cactosim.experimentscenario.impl.TimeLineEventImpl
	 * @see eu.cactosfp7.cactosim.experimentscenario.impl.ExperimentscenarioPackageImpl#getTimeLineEvent()
	 * @generated
	 */
	int TIME_LINE_EVENT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int TIME_LINE_EVENT__ID = IdentifierPackage.IDENTIFIER__ID;

    /**
	 * The feature id for the '<em><b>Experiment Scenario Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_LINE_EVENT__EXPERIMENT_SCENARIO_REQUEST = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Event Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_LINE_EVENT__EVENT_STATUS = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Experiment Scenario Timeline</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_LINE_EVENT__EXPERIMENT_SCENARIO_TIMELINE = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Relative Time Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int TIME_LINE_EVENT__RELATIVE_TIME_EVENTS = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 3;

    /**
	 * The number of structural features of the '<em>Time Line Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_LINE_EVENT_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Id Has To Be Unique</em>' operation.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int TIME_LINE_EVENT___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP = IdentifierPackage.IDENTIFIER___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP;

    /**
	 * The number of operations of the '<em>Time Line Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_LINE_EVENT_OPERATION_COUNT = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.cactosfp7.cactosim.experimentscenario.impl.AbsoluteTimeEventImpl <em>Absolute Time Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.cactosfp7.cactosim.experimentscenario.impl.AbsoluteTimeEventImpl
	 * @see eu.cactosfp7.cactosim.experimentscenario.impl.ExperimentscenarioPackageImpl#getAbsoluteTimeEvent()
	 * @generated
	 */
	int ABSOLUTE_TIME_EVENT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ABSOLUTE_TIME_EVENT__ID = TIME_LINE_EVENT__ID;

    /**
	 * The feature id for the '<em><b>Experiment Scenario Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_TIME_EVENT__EXPERIMENT_SCENARIO_REQUEST = TIME_LINE_EVENT__EXPERIMENT_SCENARIO_REQUEST;

	/**
	 * The feature id for the '<em><b>Event Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_TIME_EVENT__EVENT_STATUS = TIME_LINE_EVENT__EVENT_STATUS;

	/**
	 * The feature id for the '<em><b>Experiment Scenario Timeline</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_TIME_EVENT__EXPERIMENT_SCENARIO_TIMELINE = TIME_LINE_EVENT__EXPERIMENT_SCENARIO_TIMELINE;

	/**
	 * The feature id for the '<em><b>Relative Time Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ABSOLUTE_TIME_EVENT__RELATIVE_TIME_EVENTS = TIME_LINE_EVENT__RELATIVE_TIME_EVENTS;

    /**
	 * The feature id for the '<em><b>Simulation Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_TIME_EVENT__SIMULATION_TIME = TIME_LINE_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Absolute Time Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_TIME_EVENT_FEATURE_COUNT = TIME_LINE_EVENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Id Has To Be Unique</em>' operation.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ABSOLUTE_TIME_EVENT___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP = TIME_LINE_EVENT___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP;

    /**
	 * The number of operations of the '<em>Absolute Time Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_TIME_EVENT_OPERATION_COUNT = TIME_LINE_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.cactosfp7.cactosim.experimentscenario.impl.ExperimentScenarioTimeLineImpl <em>Experiment Scenario Time Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.cactosfp7.cactosim.experimentscenario.impl.ExperimentScenarioTimeLineImpl
	 * @see eu.cactosfp7.cactosim.experimentscenario.impl.ExperimentscenarioPackageImpl#getExperimentScenarioTimeLine()
	 * @generated
	 */
	int EXPERIMENT_SCENARIO_TIME_LINE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int EXPERIMENT_SCENARIO_TIME_LINE__ID = IdentifierPackage.IDENTIFIER__ID;

    /**
	 * The feature id for the '<em><b>Simulation Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_SCENARIO_TIME_LINE__SIMULATION_RESOLUTION = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

				/**
	 * The feature id for the '<em><b>Placement Compatibility Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_SCENARIO_TIME_LINE__PLACEMENT_COMPATIBILITY_MODE = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

				/**
	 * The feature id for the '<em><b>Time Line Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_SCENARIO_TIME_LINE__TIME_LINE_EVENTS = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Experiment Scenario Time Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_SCENARIO_TIME_LINE_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Id Has To Be Unique</em>' operation.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int EXPERIMENT_SCENARIO_TIME_LINE___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP = IdentifierPackage.IDENTIFIER___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP;

    /**
	 * The number of operations of the '<em>Experiment Scenario Time Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_SCENARIO_TIME_LINE_OPERATION_COUNT = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.cactosfp7.cactosim.experimentscenario.impl.RelativeTimeEventImpl <em>Relative Time Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.cactosfp7.cactosim.experimentscenario.impl.RelativeTimeEventImpl
	 * @see eu.cactosfp7.cactosim.experimentscenario.impl.ExperimentscenarioPackageImpl#getRelativeTimeEvent()
	 * @generated
	 */
	int RELATIVE_TIME_EVENT = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RELATIVE_TIME_EVENT__ID = TIME_LINE_EVENT__ID;

    /**
	 * The feature id for the '<em><b>Experiment Scenario Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_TIME_EVENT__EXPERIMENT_SCENARIO_REQUEST = TIME_LINE_EVENT__EXPERIMENT_SCENARIO_REQUEST;

	/**
	 * The feature id for the '<em><b>Event Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_TIME_EVENT__EVENT_STATUS = TIME_LINE_EVENT__EVENT_STATUS;

	/**
	 * The feature id for the '<em><b>Experiment Scenario Timeline</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_TIME_EVENT__EXPERIMENT_SCENARIO_TIMELINE = TIME_LINE_EVENT__EXPERIMENT_SCENARIO_TIMELINE;

	/**
	 * The feature id for the '<em><b>Relative Time Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RELATIVE_TIME_EVENT__RELATIVE_TIME_EVENTS = TIME_LINE_EVENT__RELATIVE_TIME_EVENTS;

    /**
	 * The feature id for the '<em><b>Interval Since Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_TIME_EVENT__INTERVAL_SINCE_EVENT = TIME_LINE_EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reference Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_TIME_EVENT__REFERENCE_EVENT = TIME_LINE_EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Relative Time Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_TIME_EVENT_FEATURE_COUNT = TIME_LINE_EVENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Id Has To Be Unique</em>' operation.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RELATIVE_TIME_EVENT___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP = TIME_LINE_EVENT___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP;

    /**
	 * The number of operations of the '<em>Relative Time Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_TIME_EVENT_OPERATION_COUNT = TIME_LINE_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.cactosfp7.cactosim.experimentscenario.EventStatus <em>Event Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.cactosfp7.cactosim.experimentscenario.EventStatus
	 * @see eu.cactosfp7.cactosim.experimentscenario.impl.ExperimentscenarioPackageImpl#getEventStatus()
	 * @generated
	 */
	int EVENT_STATUS = 4;


	/**
	 * The meta object id for the '{@link eu.cactosfp7.cactosim.experimentscenario.EPlacementCompatibilityMode <em>EPlacement Compatibility Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.cactosfp7.cactosim.experimentscenario.EPlacementCompatibilityMode
	 * @see eu.cactosfp7.cactosim.experimentscenario.impl.ExperimentscenarioPackageImpl#getEPlacementCompatibilityMode()
	 * @generated
	 */
	int EPLACEMENT_COMPATIBILITY_MODE = 5;


	/**
	 * Returns the meta object for class '{@link eu.cactosfp7.cactosim.experimentscenario.AbsoluteTimeEvent <em>Absolute Time Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Absolute Time Event</em>'.
	 * @see eu.cactosfp7.cactosim.experimentscenario.AbsoluteTimeEvent
	 * @generated
	 */
	EClass getAbsoluteTimeEvent();

	/**
	 * Returns the meta object for the attribute '{@link eu.cactosfp7.cactosim.experimentscenario.AbsoluteTimeEvent#getSimulationTime <em>Simulation Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Simulation Time</em>'.
	 * @see eu.cactosfp7.cactosim.experimentscenario.AbsoluteTimeEvent#getSimulationTime()
	 * @see #getAbsoluteTimeEvent()
	 * @generated
	 */
	EAttribute getAbsoluteTimeEvent_SimulationTime();

	/**
	 * Returns the meta object for class '{@link eu.cactosfp7.cactosim.experimentscenario.TimeLineEvent <em>Time Line Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Line Event</em>'.
	 * @see eu.cactosfp7.cactosim.experimentscenario.TimeLineEvent
	 * @generated
	 */
	EClass getTimeLineEvent();

	/**
	 * Returns the meta object for the containment reference '{@link eu.cactosfp7.cactosim.experimentscenario.TimeLineEvent#getExperimentScenarioRequest <em>Experiment Scenario Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Experiment Scenario Request</em>'.
	 * @see eu.cactosfp7.cactosim.experimentscenario.TimeLineEvent#getExperimentScenarioRequest()
	 * @see #getTimeLineEvent()
	 * @generated
	 */
	EReference getTimeLineEvent_ExperimentScenarioRequest();

	/**
	 * Returns the meta object for the attribute '{@link eu.cactosfp7.cactosim.experimentscenario.TimeLineEvent#getEventStatus <em>Event Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Status</em>'.
	 * @see eu.cactosfp7.cactosim.experimentscenario.TimeLineEvent#getEventStatus()
	 * @see #getTimeLineEvent()
	 * @generated
	 */
	EAttribute getTimeLineEvent_EventStatus();

	/**
	 * Returns the meta object for the container reference '{@link eu.cactosfp7.cactosim.experimentscenario.TimeLineEvent#getExperimentScenarioTimeline <em>Experiment Scenario Timeline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Experiment Scenario Timeline</em>'.
	 * @see eu.cactosfp7.cactosim.experimentscenario.TimeLineEvent#getExperimentScenarioTimeline()
	 * @see #getTimeLineEvent()
	 * @generated
	 */
	EReference getTimeLineEvent_ExperimentScenarioTimeline();

	/**
	 * Returns the meta object for the reference list '{@link eu.cactosfp7.cactosim.experimentscenario.TimeLineEvent#getRelativeTimeEvents <em>Relative Time Events</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Relative Time Events</em>'.
	 * @see eu.cactosfp7.cactosim.experimentscenario.TimeLineEvent#getRelativeTimeEvents()
	 * @see #getTimeLineEvent()
	 * @generated
	 */
    EReference getTimeLineEvent_RelativeTimeEvents();

    /**
	 * Returns the meta object for class '{@link eu.cactosfp7.cactosim.experimentscenario.ExperimentScenarioTimeLine <em>Experiment Scenario Time Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Experiment Scenario Time Line</em>'.
	 * @see eu.cactosfp7.cactosim.experimentscenario.ExperimentScenarioTimeLine
	 * @generated
	 */
	EClass getExperimentScenarioTimeLine();

	/**
	 * Returns the meta object for the attribute '{@link eu.cactosfp7.cactosim.experimentscenario.ExperimentScenarioTimeLine#getSimulationResolution <em>Simulation Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Simulation Resolution</em>'.
	 * @see eu.cactosfp7.cactosim.experimentscenario.ExperimentScenarioTimeLine#getSimulationResolution()
	 * @see #getExperimentScenarioTimeLine()
	 * @generated
	 */
	EAttribute getExperimentScenarioTimeLine_SimulationResolution();

	/**
	 * Returns the meta object for the attribute '{@link eu.cactosfp7.cactosim.experimentscenario.ExperimentScenarioTimeLine#getPlacementCompatibilityMode <em>Placement Compatibility Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Placement Compatibility Mode</em>'.
	 * @see eu.cactosfp7.cactosim.experimentscenario.ExperimentScenarioTimeLine#getPlacementCompatibilityMode()
	 * @see #getExperimentScenarioTimeLine()
	 * @generated
	 */
	EAttribute getExperimentScenarioTimeLine_PlacementCompatibilityMode();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.cactosfp7.cactosim.experimentscenario.ExperimentScenarioTimeLine#getTimeLineEvents <em>Time Line Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Time Line Events</em>'.
	 * @see eu.cactosfp7.cactosim.experimentscenario.ExperimentScenarioTimeLine#getTimeLineEvents()
	 * @see #getExperimentScenarioTimeLine()
	 * @generated
	 */
	EReference getExperimentScenarioTimeLine_TimeLineEvents();

	/**
	 * Returns the meta object for class '{@link eu.cactosfp7.cactosim.experimentscenario.RelativeTimeEvent <em>Relative Time Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relative Time Event</em>'.
	 * @see eu.cactosfp7.cactosim.experimentscenario.RelativeTimeEvent
	 * @generated
	 */
	EClass getRelativeTimeEvent();

	/**
	 * Returns the meta object for the attribute '{@link eu.cactosfp7.cactosim.experimentscenario.RelativeTimeEvent#getIntervalSinceEvent <em>Interval Since Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interval Since Event</em>'.
	 * @see eu.cactosfp7.cactosim.experimentscenario.RelativeTimeEvent#getIntervalSinceEvent()
	 * @see #getRelativeTimeEvent()
	 * @generated
	 */
	EAttribute getRelativeTimeEvent_IntervalSinceEvent();

	/**
	 * Returns the meta object for the reference '{@link eu.cactosfp7.cactosim.experimentscenario.RelativeTimeEvent#getReferenceEvent <em>Reference Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference Event</em>'.
	 * @see eu.cactosfp7.cactosim.experimentscenario.RelativeTimeEvent#getReferenceEvent()
	 * @see #getRelativeTimeEvent()
	 * @generated
	 */
	EReference getRelativeTimeEvent_ReferenceEvent();

	/**
	 * Returns the meta object for enum '{@link eu.cactosfp7.cactosim.experimentscenario.EventStatus <em>Event Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Event Status</em>'.
	 * @see eu.cactosfp7.cactosim.experimentscenario.EventStatus
	 * @generated
	 */
	EEnum getEventStatus();

	/**
	 * Returns the meta object for enum '{@link eu.cactosfp7.cactosim.experimentscenario.EPlacementCompatibilityMode <em>EPlacement Compatibility Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EPlacement Compatibility Mode</em>'.
	 * @see eu.cactosfp7.cactosim.experimentscenario.EPlacementCompatibilityMode
	 * @generated
	 */
	EEnum getEPlacementCompatibilityMode();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ExperimentscenarioFactory getExperimentscenarioFactory();

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
		 * The meta object literal for the '{@link eu.cactosfp7.cactosim.experimentscenario.impl.AbsoluteTimeEventImpl <em>Absolute Time Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.cactosfp7.cactosim.experimentscenario.impl.AbsoluteTimeEventImpl
		 * @see eu.cactosfp7.cactosim.experimentscenario.impl.ExperimentscenarioPackageImpl#getAbsoluteTimeEvent()
		 * @generated
		 */
		EClass ABSOLUTE_TIME_EVENT = eINSTANCE.getAbsoluteTimeEvent();

		/**
		 * The meta object literal for the '<em><b>Simulation Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSOLUTE_TIME_EVENT__SIMULATION_TIME = eINSTANCE.getAbsoluteTimeEvent_SimulationTime();

		/**
		 * The meta object literal for the '{@link eu.cactosfp7.cactosim.experimentscenario.impl.TimeLineEventImpl <em>Time Line Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.cactosfp7.cactosim.experimentscenario.impl.TimeLineEventImpl
		 * @see eu.cactosfp7.cactosim.experimentscenario.impl.ExperimentscenarioPackageImpl#getTimeLineEvent()
		 * @generated
		 */
		EClass TIME_LINE_EVENT = eINSTANCE.getTimeLineEvent();

		/**
		 * The meta object literal for the '<em><b>Experiment Scenario Request</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_LINE_EVENT__EXPERIMENT_SCENARIO_REQUEST = eINSTANCE.getTimeLineEvent_ExperimentScenarioRequest();

		/**
		 * The meta object literal for the '<em><b>Event Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_LINE_EVENT__EVENT_STATUS = eINSTANCE.getTimeLineEvent_EventStatus();

		/**
		 * The meta object literal for the '<em><b>Experiment Scenario Timeline</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_LINE_EVENT__EXPERIMENT_SCENARIO_TIMELINE = eINSTANCE.getTimeLineEvent_ExperimentScenarioTimeline();

		/**
		 * The meta object literal for the '<em><b>Relative Time Events</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference TIME_LINE_EVENT__RELATIVE_TIME_EVENTS = eINSTANCE.getTimeLineEvent_RelativeTimeEvents();

        /**
		 * The meta object literal for the '{@link eu.cactosfp7.cactosim.experimentscenario.impl.ExperimentScenarioTimeLineImpl <em>Experiment Scenario Time Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.cactosfp7.cactosim.experimentscenario.impl.ExperimentScenarioTimeLineImpl
		 * @see eu.cactosfp7.cactosim.experimentscenario.impl.ExperimentscenarioPackageImpl#getExperimentScenarioTimeLine()
		 * @generated
		 */
		EClass EXPERIMENT_SCENARIO_TIME_LINE = eINSTANCE.getExperimentScenarioTimeLine();

		/**
		 * The meta object literal for the '<em><b>Simulation Resolution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPERIMENT_SCENARIO_TIME_LINE__SIMULATION_RESOLUTION = eINSTANCE.getExperimentScenarioTimeLine_SimulationResolution();

		/**
		 * The meta object literal for the '<em><b>Placement Compatibility Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPERIMENT_SCENARIO_TIME_LINE__PLACEMENT_COMPATIBILITY_MODE = eINSTANCE.getExperimentScenarioTimeLine_PlacementCompatibilityMode();

		/**
		 * The meta object literal for the '<em><b>Time Line Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPERIMENT_SCENARIO_TIME_LINE__TIME_LINE_EVENTS = eINSTANCE.getExperimentScenarioTimeLine_TimeLineEvents();

		/**
		 * The meta object literal for the '{@link eu.cactosfp7.cactosim.experimentscenario.impl.RelativeTimeEventImpl <em>Relative Time Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.cactosfp7.cactosim.experimentscenario.impl.RelativeTimeEventImpl
		 * @see eu.cactosfp7.cactosim.experimentscenario.impl.ExperimentscenarioPackageImpl#getRelativeTimeEvent()
		 * @generated
		 */
		EClass RELATIVE_TIME_EVENT = eINSTANCE.getRelativeTimeEvent();

		/**
		 * The meta object literal for the '<em><b>Interval Since Event</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIVE_TIME_EVENT__INTERVAL_SINCE_EVENT = eINSTANCE.getRelativeTimeEvent_IntervalSinceEvent();

		/**
		 * The meta object literal for the '<em><b>Reference Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIVE_TIME_EVENT__REFERENCE_EVENT = eINSTANCE.getRelativeTimeEvent_ReferenceEvent();

		/**
		 * The meta object literal for the '{@link eu.cactosfp7.cactosim.experimentscenario.EventStatus <em>Event Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.cactosfp7.cactosim.experimentscenario.EventStatus
		 * @see eu.cactosfp7.cactosim.experimentscenario.impl.ExperimentscenarioPackageImpl#getEventStatus()
		 * @generated
		 */
		EEnum EVENT_STATUS = eINSTANCE.getEventStatus();

		/**
		 * The meta object literal for the '{@link eu.cactosfp7.cactosim.experimentscenario.EPlacementCompatibilityMode <em>EPlacement Compatibility Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.cactosfp7.cactosim.experimentscenario.EPlacementCompatibilityMode
		 * @see eu.cactosfp7.cactosim.experimentscenario.impl.ExperimentscenarioPackageImpl#getEPlacementCompatibilityMode()
		 * @generated
		 */
		EEnum EPLACEMENT_COMPATIBILITY_MODE = eINSTANCE.getEPlacementCompatibilityMode();

	}

} //ExperimentscenarioPackage
