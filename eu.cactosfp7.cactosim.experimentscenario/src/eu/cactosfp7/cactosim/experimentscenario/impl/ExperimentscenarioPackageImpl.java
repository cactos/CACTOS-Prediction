/**
 */
package eu.cactosfp7.cactosim.experimentscenario.impl;

import eu.cactosfp7.cactosim.experimentscenario.AbsoluteTimeEvent;
import eu.cactosfp7.cactosim.experimentscenario.EPlacementCompatibilityMode;
import eu.cactosfp7.cactosim.experimentscenario.EventStatus;
import eu.cactosfp7.cactosim.experimentscenario.ExperimentScenarioTimeLine;
import eu.cactosfp7.cactosim.experimentscenario.ExperimentscenarioFactory;
import eu.cactosfp7.cactosim.experimentscenario.ExperimentscenarioPackage;
import eu.cactosfp7.cactosim.experimentscenario.RelativeTimeEvent;
import eu.cactosfp7.cactosim.experimentscenario.TimeLineEvent;

import eu.cactosfp7.cactosim.experimentscenario.request.RequestPackage;

import eu.cactosfp7.cactosim.experimentscenario.request.impl.RequestPackageImpl;

import eu.cactosfp7.cactosim.experimentscenario.selector.SelectorPackage;

import eu.cactosfp7.cactosim.experimentscenario.selector.impl.SelectorPackageImpl;

import eu.cactosfp7.identifier.IdentifierPackage;
import eu.cactosfp7.infrastructuremodels.logicaldc.application.impl.ApplicationPackageImpl;

import eu.cactosfp7.infrastructuremodels.logicaldc.hypervisor.impl.HypervisorPackageImpl;

import eu.cactosfp7.infrastructuremodels.physicaldc.architecturetype.impl.ArchitecturetypePackageImpl;

import eu.cactosfp7.infrastructuremodels.physicaldc.core.impl.CorePackageImpl;

import eu.cactosfp7.infrastructuremodels.physicaldc.power.impl.PowerPackageImpl;

import eu.cactosfp7.infrastructuremodels.physicaldc.util.impl.UtilPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExperimentscenarioPackageImpl extends EPackageImpl implements ExperimentscenarioPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass absoluteTimeEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeLineEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass experimentScenarioTimeLineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relativeTimeEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eventStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ePlacementCompatibilityModeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see eu.cactosfp7.cactosim.experimentscenario.ExperimentscenarioPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ExperimentscenarioPackageImpl() {
		super(eNS_URI, ExperimentscenarioFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ExperimentscenarioPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ExperimentscenarioPackage init() {
		if (isInited) return (ExperimentscenarioPackage)EPackage.Registry.INSTANCE.getEPackage(ExperimentscenarioPackage.eNS_URI);

		// Obtain or create and register package
		ExperimentscenarioPackageImpl theExperimentscenarioPackage = (ExperimentscenarioPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ExperimentscenarioPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ExperimentscenarioPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		ArchitecturetypePackageImpl.eINSTANCE.eClass();
		UtilPackageImpl.eINSTANCE.eClass();
		PowerPackageImpl.eINSTANCE.eClass();
		CorePackageImpl.eINSTANCE.eClass();
		HypervisorPackageImpl.eINSTANCE.eClass();
		ApplicationPackageImpl.eINSTANCE.eClass();
		eu.cactosfp7.infrastructuremodels.logicaldc.core.impl.CorePackageImpl.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		RequestPackageImpl theRequestPackage = (RequestPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RequestPackage.eNS_URI) instanceof RequestPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RequestPackage.eNS_URI) : RequestPackage.eINSTANCE);
		SelectorPackageImpl theSelectorPackage = (SelectorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SelectorPackage.eNS_URI) instanceof SelectorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SelectorPackage.eNS_URI) : SelectorPackage.eINSTANCE);

		// Create package meta-data objects
		theExperimentscenarioPackage.createPackageContents();
		theRequestPackage.createPackageContents();
		theSelectorPackage.createPackageContents();

		// Initialize created meta-data
		theExperimentscenarioPackage.initializePackageContents();
		theRequestPackage.initializePackageContents();
		theSelectorPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theExperimentscenarioPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ExperimentscenarioPackage.eNS_URI, theExperimentscenarioPackage);
		return theExperimentscenarioPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
    public EClass getAbsoluteTimeEvent() {
		return absoluteTimeEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
    public EAttribute getAbsoluteTimeEvent_SimulationTime() {
		return (EAttribute)absoluteTimeEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
    public EClass getTimeLineEvent() {
		return timeLineEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
    public EReference getTimeLineEvent_ExperimentScenarioRequest() {
		return (EReference)timeLineEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
    public EAttribute getTimeLineEvent_EventStatus() {
		return (EAttribute)timeLineEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTimeLineEvent_ExperimentScenarioTimeline() {
		return (EReference)timeLineEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public EReference getTimeLineEvent_RelativeTimeEvents() {
		return (EReference)timeLineEventEClass.getEStructuralFeatures().get(3);
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
    public EClass getExperimentScenarioTimeLine() {
		return experimentScenarioTimeLineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExperimentScenarioTimeLine_SimulationResolution() {
		return (EAttribute)experimentScenarioTimeLineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExperimentScenarioTimeLine_PlacementCompatibilityMode() {
		return (EAttribute)experimentScenarioTimeLineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
    public EReference getExperimentScenarioTimeLine_TimeLineEvents() {
		return (EReference)experimentScenarioTimeLineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
    public EClass getRelativeTimeEvent() {
		return relativeTimeEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
    public EAttribute getRelativeTimeEvent_IntervalSinceEvent() {
		return (EAttribute)relativeTimeEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
    public EReference getRelativeTimeEvent_ReferenceEvent() {
		return (EReference)relativeTimeEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
    public EEnum getEventStatus() {
		return eventStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getEPlacementCompatibilityMode() {
		return ePlacementCompatibilityModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
    public ExperimentscenarioFactory getExperimentscenarioFactory() {
		return (ExperimentscenarioFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		absoluteTimeEventEClass = createEClass(ABSOLUTE_TIME_EVENT);
		createEAttribute(absoluteTimeEventEClass, ABSOLUTE_TIME_EVENT__SIMULATION_TIME);

		timeLineEventEClass = createEClass(TIME_LINE_EVENT);
		createEReference(timeLineEventEClass, TIME_LINE_EVENT__EXPERIMENT_SCENARIO_REQUEST);
		createEAttribute(timeLineEventEClass, TIME_LINE_EVENT__EVENT_STATUS);
		createEReference(timeLineEventEClass, TIME_LINE_EVENT__EXPERIMENT_SCENARIO_TIMELINE);
		createEReference(timeLineEventEClass, TIME_LINE_EVENT__RELATIVE_TIME_EVENTS);

		experimentScenarioTimeLineEClass = createEClass(EXPERIMENT_SCENARIO_TIME_LINE);
		createEAttribute(experimentScenarioTimeLineEClass, EXPERIMENT_SCENARIO_TIME_LINE__SIMULATION_RESOLUTION);
		createEAttribute(experimentScenarioTimeLineEClass, EXPERIMENT_SCENARIO_TIME_LINE__PLACEMENT_COMPATIBILITY_MODE);
		createEReference(experimentScenarioTimeLineEClass, EXPERIMENT_SCENARIO_TIME_LINE__TIME_LINE_EVENTS);

		relativeTimeEventEClass = createEClass(RELATIVE_TIME_EVENT);
		createEAttribute(relativeTimeEventEClass, RELATIVE_TIME_EVENT__INTERVAL_SINCE_EVENT);
		createEReference(relativeTimeEventEClass, RELATIVE_TIME_EVENT__REFERENCE_EVENT);

		// Create enums
		eventStatusEEnum = createEEnum(EVENT_STATUS);
		ePlacementCompatibilityModeEEnum = createEEnum(EPLACEMENT_COMPATIBILITY_MODE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		RequestPackage theRequestPackage = (RequestPackage)EPackage.Registry.INSTANCE.getEPackage(RequestPackage.eNS_URI);
		SelectorPackage theSelectorPackage = (SelectorPackage)EPackage.Registry.INSTANCE.getEPackage(SelectorPackage.eNS_URI);
		UtilPackageImpl theUtilPackage = (UtilPackageImpl)EPackage.Registry.INSTANCE.getEPackage(UtilPackageImpl.eNS_URI);
		IdentifierPackage theIdentifierPackage = (IdentifierPackage)EPackage.Registry.INSTANCE.getEPackage(IdentifierPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theRequestPackage);
		getESubpackages().add(theSelectorPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		absoluteTimeEventEClass.getESuperTypes().add(this.getTimeLineEvent());
		timeLineEventEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		experimentScenarioTimeLineEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		relativeTimeEventEClass.getESuperTypes().add(this.getTimeLineEvent());

		// Initialize classes, features, and operations; add parameters
		initEClass(absoluteTimeEventEClass, AbsoluteTimeEvent.class, "AbsoluteTimeEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		EGenericType g1 = createEGenericType(theUtilPackage.getAmount());
		EGenericType g2 = createEGenericType(theUtilPackage.getDuration());
		g1.getETypeArguments().add(g2);
		initEAttribute(getAbsoluteTimeEvent_SimulationTime(), g1, "simulationTime", null, 1, 1, AbsoluteTimeEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(timeLineEventEClass, TimeLineEvent.class, "TimeLineEvent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTimeLineEvent_ExperimentScenarioRequest(), theRequestPackage.getExperimentScenarioRequest(), theRequestPackage.getExperimentScenarioRequest_TimelineEvent(), "experimentScenarioRequest", null, 1, 1, TimeLineEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTimeLineEvent_EventStatus(), this.getEventStatus(), "eventStatus", "PENDING", 1, 1, TimeLineEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTimeLineEvent_ExperimentScenarioTimeline(), this.getExperimentScenarioTimeLine(), this.getExperimentScenarioTimeLine_TimeLineEvents(), "experimentScenarioTimeline", null, 1, 1, TimeLineEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTimeLineEvent_RelativeTimeEvents(), this.getRelativeTimeEvent(), this.getRelativeTimeEvent_ReferenceEvent(), "relativeTimeEvents", null, 0, -1, TimeLineEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(experimentScenarioTimeLineEClass, ExperimentScenarioTimeLine.class, "ExperimentScenarioTimeLine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(theUtilPackage.getAmount());
		g2 = createEGenericType(theUtilPackage.getDuration());
		g1.getETypeArguments().add(g2);
		initEAttribute(getExperimentScenarioTimeLine_SimulationResolution(), g1, "simulationResolution", null, 1, 1, ExperimentScenarioTimeLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getExperimentScenarioTimeLine_PlacementCompatibilityMode(), this.getEPlacementCompatibilityMode(), "placementCompatibilityMode", "SimplePlacement", 1, 1, ExperimentScenarioTimeLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getExperimentScenarioTimeLine_TimeLineEvents(), this.getTimeLineEvent(), this.getTimeLineEvent_ExperimentScenarioTimeline(), "timeLineEvents", null, 0, -1, ExperimentScenarioTimeLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relativeTimeEventEClass, RelativeTimeEvent.class, "RelativeTimeEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(theUtilPackage.getAmount());
		g2 = createEGenericType(theUtilPackage.getDuration());
		g1.getETypeArguments().add(g2);
		initEAttribute(getRelativeTimeEvent_IntervalSinceEvent(), g1, "intervalSinceEvent", null, 1, 1, RelativeTimeEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRelativeTimeEvent_ReferenceEvent(), this.getTimeLineEvent(), this.getTimeLineEvent_RelativeTimeEvents(), "referenceEvent", null, 1, 1, RelativeTimeEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(eventStatusEEnum, EventStatus.class, "EventStatus");
		addEEnumLiteral(eventStatusEEnum, EventStatus.PROCESSED_SUCCESS);
		addEEnumLiteral(eventStatusEEnum, EventStatus.PROCESSED_FAILURE);
		addEEnumLiteral(eventStatusEEnum, EventStatus.PENDING);
		addEEnumLiteral(eventStatusEEnum, EventStatus.SCHEDULED);
		addEEnumLiteral(eventStatusEEnum, EventStatus.IN_EXECUTION);

		initEEnum(ePlacementCompatibilityModeEEnum, EPlacementCompatibilityMode.class, "EPlacementCompatibilityMode");
		addEEnumLiteral(ePlacementCompatibilityModeEEnum, EPlacementCompatibilityMode.REPETITIVE_RETRY);
		addEEnumLiteral(ePlacementCompatibilityModeEEnum, EPlacementCompatibilityMode.SIMPLE_PLACEMENT);

		// Create resource
		createResource(eNS_URI);
	}

} //ExperimentscenarioPackageImpl
