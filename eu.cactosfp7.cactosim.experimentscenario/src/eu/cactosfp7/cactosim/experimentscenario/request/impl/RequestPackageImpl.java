/**
 */
package eu.cactosfp7.cactosim.experimentscenario.request.impl;

import eu.cactosfp7.cactosim.experimentscenario.ExperimentscenarioPackage;

import eu.cactosfp7.cactosim.experimentscenario.impl.ExperimentscenarioPackageImpl;

import eu.cactosfp7.cactosim.experimentscenario.request.ChangeOptimizationIntervalRequest;
import eu.cactosfp7.cactosim.experimentscenario.request.ExperimentScenarioRequest;
import eu.cactosfp7.cactosim.experimentscenario.request.MigrateApplicationRequest;
import eu.cactosfp7.cactosim.experimentscenario.request.ReconfigureOptimizationAlgorithmRequest;
import eu.cactosfp7.cactosim.experimentscenario.request.ReconfigureScalableImageConnectorRequest;
import eu.cactosfp7.cactosim.experimentscenario.request.RequestFactory;
import eu.cactosfp7.cactosim.experimentscenario.request.RequestPackage;
import eu.cactosfp7.cactosim.experimentscenario.request.ResumeApplicationRequest;
import eu.cactosfp7.cactosim.experimentscenario.request.SetPhysicalNodeStateRequest;
import eu.cactosfp7.cactosim.experimentscenario.request.StartApplicationRequest;
import eu.cactosfp7.cactosim.experimentscenario.request.SuspendApplicationRequest;
import eu.cactosfp7.cactosim.experimentscenario.request.TerminateApplicationRequest;

import eu.cactosfp7.cactosim.experimentscenario.request.util.RequestValidator;

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
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RequestPackageImpl extends EPackageImpl implements RequestPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reconfigureOptimizationAlgorithmRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass migrateApplicationRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass startApplicationRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass suspendApplicationRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass terminateApplicationRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeOptimizationIntervalRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reconfigureScalableImageConnectorRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setPhysicalNodeStateRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resumeApplicationRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass experimentScenarioRequestEClass = null;

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
	 * @see eu.cactosfp7.cactosim.experimentscenario.request.RequestPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RequestPackageImpl() {
		super(eNS_URI, RequestFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RequestPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RequestPackage init() {
		if (isInited) return (RequestPackage)EPackage.Registry.INSTANCE.getEPackage(RequestPackage.eNS_URI);

		// Obtain or create and register package
		RequestPackageImpl theRequestPackage = (RequestPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RequestPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RequestPackageImpl());

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
		ExperimentscenarioPackageImpl theExperimentscenarioPackage = (ExperimentscenarioPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExperimentscenarioPackage.eNS_URI) instanceof ExperimentscenarioPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExperimentscenarioPackage.eNS_URI) : ExperimentscenarioPackage.eINSTANCE);
		SelectorPackageImpl theSelectorPackage = (SelectorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SelectorPackage.eNS_URI) instanceof SelectorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SelectorPackage.eNS_URI) : SelectorPackage.eINSTANCE);

		// Create package meta-data objects
		theRequestPackage.createPackageContents();
		theExperimentscenarioPackage.createPackageContents();
		theSelectorPackage.createPackageContents();

		// Initialize created meta-data
		theRequestPackage.initializePackageContents();
		theExperimentscenarioPackage.initializePackageContents();
		theSelectorPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theRequestPackage, 
			 new EValidator.Descriptor() {
				 @Override
				public EValidator getEValidator() {
					 return RequestValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theRequestPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RequestPackage.eNS_URI, theRequestPackage);
		return theRequestPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
    public EClass getReconfigureOptimizationAlgorithmRequest() {
		return reconfigureOptimizationAlgorithmRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
    public EAttribute getReconfigureOptimizationAlgorithmRequest_AlgorithmName() {
		return (EAttribute)reconfigureOptimizationAlgorithmRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
    public EReference getReconfigureOptimizationAlgorithmRequest_AlgorithmParameters() {
		return (EReference)reconfigureOptimizationAlgorithmRequestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
    public EClass getMigrateApplicationRequest() {
		return migrateApplicationRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
    public EReference getMigrateApplicationRequest_TargetPhysicalNode() {
		return (EReference)migrateApplicationRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
    public EReference getMigrateApplicationRequest_ApplicationInstanceSelector() {
		return (EReference)migrateApplicationRequestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
    public EClass getStartApplicationRequest() {
		return startApplicationRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
    public EReference getStartApplicationRequest_ApplicationTemplate() {
		return (EReference)startApplicationRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
    public EReference getStartApplicationRequest_ApplicationInstance() {
		return (EReference)startApplicationRequestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public EReference getStartApplicationRequest_VmFlavour() {
		return (EReference)startApplicationRequestEClass.getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStartApplicationRequest_InputParameters() {
		return (EReference)startApplicationRequestEClass.getEStructuralFeatures().get(3);
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
    public EOperation getStartApplicationRequest__ApplicationInstanceMustBeOfTheRightTemplate__DiagnosticChain_Map() {
		return startApplicationRequestEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
    public EClass getSuspendApplicationRequest() {
		return suspendApplicationRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
    public EReference getSuspendApplicationRequest_RunningApplicationSelector() {
		return (EReference)suspendApplicationRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
    public EClass getTerminateApplicationRequest() {
		return terminateApplicationRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
    public EReference getTerminateApplicationRequest_RunningApplicationSelector() {
		return (EReference)terminateApplicationRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
    public EClass getChangeOptimizationIntervalRequest() {
		return changeOptimizationIntervalRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
    public EAttribute getChangeOptimizationIntervalRequest_OptimizationInterval() {
		return (EAttribute)changeOptimizationIntervalRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
    public EClass getReconfigureScalableImageConnectorRequest() {
		return reconfigureScalableImageConnectorRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
    public EReference getReconfigureScalableImageConnectorRequest_WhiteBoxApplicationInstanceSelector() {
		return (EReference)reconfigureScalableImageConnectorRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
    public EAttribute getReconfigureScalableImageConnectorRequest_LoadBalancingPolicy() {
		return (EAttribute)reconfigureScalableImageConnectorRequestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
    public EAttribute getReconfigureScalableImageConnectorRequest_AutoscalingAnalysisInterval() {
		return (EAttribute)reconfigureScalableImageConnectorRequestEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
    public EReference getReconfigureScalableImageConnectorRequest_TargetConnector() {
		return (EReference)reconfigureScalableImageConnectorRequestEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
    public EClass getSetPhysicalNodeStateRequest() {
		return setPhysicalNodeStateRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
    public EReference getSetPhysicalNodeStateRequest_TargetNode() {
		return (EReference)setPhysicalNodeStateRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
    public EAttribute getSetPhysicalNodeStateRequest_TargetState() {
		return (EAttribute)setPhysicalNodeStateRequestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
    public EClass getResumeApplicationRequest() {
		return resumeApplicationRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
    public EReference getResumeApplicationRequest_PreviouslySuspendedApplicationSelector() {
		return (EReference)resumeApplicationRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
    public EClass getExperimentScenarioRequest() {
		return experimentScenarioRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
    public EReference getExperimentScenarioRequest_TimelineEvent() {
		return (EReference)experimentScenarioRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
    public RequestFactory getRequestFactory() {
		return (RequestFactory)getEFactoryInstance();
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
		reconfigureOptimizationAlgorithmRequestEClass = createEClass(RECONFIGURE_OPTIMIZATION_ALGORITHM_REQUEST);
		createEAttribute(reconfigureOptimizationAlgorithmRequestEClass, RECONFIGURE_OPTIMIZATION_ALGORITHM_REQUEST__ALGORITHM_NAME);
		createEReference(reconfigureOptimizationAlgorithmRequestEClass, RECONFIGURE_OPTIMIZATION_ALGORITHM_REQUEST__ALGORITHM_PARAMETERS);

		migrateApplicationRequestEClass = createEClass(MIGRATE_APPLICATION_REQUEST);
		createEReference(migrateApplicationRequestEClass, MIGRATE_APPLICATION_REQUEST__TARGET_PHYSICAL_NODE);
		createEReference(migrateApplicationRequestEClass, MIGRATE_APPLICATION_REQUEST__APPLICATION_INSTANCE_SELECTOR);

		startApplicationRequestEClass = createEClass(START_APPLICATION_REQUEST);
		createEReference(startApplicationRequestEClass, START_APPLICATION_REQUEST__APPLICATION_TEMPLATE);
		createEReference(startApplicationRequestEClass, START_APPLICATION_REQUEST__APPLICATION_INSTANCE);
		createEReference(startApplicationRequestEClass, START_APPLICATION_REQUEST__VM_FLAVOUR);
		createEReference(startApplicationRequestEClass, START_APPLICATION_REQUEST__INPUT_PARAMETERS);
		createEOperation(startApplicationRequestEClass, START_APPLICATION_REQUEST___APPLICATION_INSTANCE_MUST_BE_OF_THE_RIGHT_TEMPLATE__DIAGNOSTICCHAIN_MAP);

		suspendApplicationRequestEClass = createEClass(SUSPEND_APPLICATION_REQUEST);
		createEReference(suspendApplicationRequestEClass, SUSPEND_APPLICATION_REQUEST__RUNNING_APPLICATION_SELECTOR);

		terminateApplicationRequestEClass = createEClass(TERMINATE_APPLICATION_REQUEST);
		createEReference(terminateApplicationRequestEClass, TERMINATE_APPLICATION_REQUEST__RUNNING_APPLICATION_SELECTOR);

		changeOptimizationIntervalRequestEClass = createEClass(CHANGE_OPTIMIZATION_INTERVAL_REQUEST);
		createEAttribute(changeOptimizationIntervalRequestEClass, CHANGE_OPTIMIZATION_INTERVAL_REQUEST__OPTIMIZATION_INTERVAL);

		reconfigureScalableImageConnectorRequestEClass = createEClass(RECONFIGURE_SCALABLE_IMAGE_CONNECTOR_REQUEST);
		createEReference(reconfigureScalableImageConnectorRequestEClass, RECONFIGURE_SCALABLE_IMAGE_CONNECTOR_REQUEST__WHITE_BOX_APPLICATION_INSTANCE_SELECTOR);
		createEAttribute(reconfigureScalableImageConnectorRequestEClass, RECONFIGURE_SCALABLE_IMAGE_CONNECTOR_REQUEST__LOAD_BALANCING_POLICY);
		createEAttribute(reconfigureScalableImageConnectorRequestEClass, RECONFIGURE_SCALABLE_IMAGE_CONNECTOR_REQUEST__AUTOSCALING_ANALYSIS_INTERVAL);
		createEReference(reconfigureScalableImageConnectorRequestEClass, RECONFIGURE_SCALABLE_IMAGE_CONNECTOR_REQUEST__TARGET_CONNECTOR);

		setPhysicalNodeStateRequestEClass = createEClass(SET_PHYSICAL_NODE_STATE_REQUEST);
		createEReference(setPhysicalNodeStateRequestEClass, SET_PHYSICAL_NODE_STATE_REQUEST__TARGET_NODE);
		createEAttribute(setPhysicalNodeStateRequestEClass, SET_PHYSICAL_NODE_STATE_REQUEST__TARGET_STATE);

		resumeApplicationRequestEClass = createEClass(RESUME_APPLICATION_REQUEST);
		createEReference(resumeApplicationRequestEClass, RESUME_APPLICATION_REQUEST__PREVIOUSLY_SUSPENDED_APPLICATION_SELECTOR);

		experimentScenarioRequestEClass = createEClass(EXPERIMENT_SCENARIO_REQUEST);
		createEReference(experimentScenarioRequestEClass, EXPERIMENT_SCENARIO_REQUEST__TIMELINE_EVENT);
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
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		UtilPackageImpl theUtilPackage = (UtilPackageImpl)EPackage.Registry.INSTANCE.getEPackage(UtilPackageImpl.eNS_URI);
		CorePackageImpl theCorePackage = (CorePackageImpl)EPackage.Registry.INSTANCE.getEPackage(CorePackageImpl.eNS_URI);
		SelectorPackage theSelectorPackage = (SelectorPackage)EPackage.Registry.INSTANCE.getEPackage(SelectorPackage.eNS_URI);
		ApplicationPackageImpl theApplicationPackage = (ApplicationPackageImpl)EPackage.Registry.INSTANCE.getEPackage(ApplicationPackageImpl.eNS_URI);
		eu.cactosfp7.infrastructuremodels.logicaldc.core.impl.CorePackageImpl theCorePackage_1 = (eu.cactosfp7.infrastructuremodels.logicaldc.core.impl.CorePackageImpl)EPackage.Registry.INSTANCE.getEPackage(eu.cactosfp7.infrastructuremodels.logicaldc.core.impl.CorePackageImpl.eNS_URI);
		IdentifierPackage theIdentifierPackage = (IdentifierPackage)EPackage.Registry.INSTANCE.getEPackage(IdentifierPackage.eNS_URI);
		ExperimentscenarioPackage theExperimentscenarioPackage = (ExperimentscenarioPackage)EPackage.Registry.INSTANCE.getEPackage(ExperimentscenarioPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		reconfigureOptimizationAlgorithmRequestEClass.getESuperTypes().add(this.getExperimentScenarioRequest());
		migrateApplicationRequestEClass.getESuperTypes().add(this.getExperimentScenarioRequest());
		startApplicationRequestEClass.getESuperTypes().add(this.getExperimentScenarioRequest());
		suspendApplicationRequestEClass.getESuperTypes().add(this.getExperimentScenarioRequest());
		terminateApplicationRequestEClass.getESuperTypes().add(this.getExperimentScenarioRequest());
		changeOptimizationIntervalRequestEClass.getESuperTypes().add(this.getExperimentScenarioRequest());
		reconfigureScalableImageConnectorRequestEClass.getESuperTypes().add(this.getExperimentScenarioRequest());
		setPhysicalNodeStateRequestEClass.getESuperTypes().add(this.getExperimentScenarioRequest());
		resumeApplicationRequestEClass.getESuperTypes().add(this.getExperimentScenarioRequest());
		experimentScenarioRequestEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());

		// Initialize classes, features, and operations; add parameters
		initEClass(reconfigureOptimizationAlgorithmRequestEClass, ReconfigureOptimizationAlgorithmRequest.class, "ReconfigureOptimizationAlgorithmRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReconfigureOptimizationAlgorithmRequest_AlgorithmName(), theEcorePackage.getEString(), "algorithmName", null, 1, 1, ReconfigureOptimizationAlgorithmRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReconfigureOptimizationAlgorithmRequest_AlgorithmParameters(), theUtilPackage.getEStringToEStringObjectMapEntry(), null, "algorithmParameters", null, 0, -1, ReconfigureOptimizationAlgorithmRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(migrateApplicationRequestEClass, MigrateApplicationRequest.class, "MigrateApplicationRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMigrateApplicationRequest_TargetPhysicalNode(), theCorePackage.getComputeNode(), null, "targetPhysicalNode", null, 1, 1, MigrateApplicationRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMigrateApplicationRequest_ApplicationInstanceSelector(), theSelectorPackage.getApplicationInstanceSelector(), null, "applicationInstanceSelector", null, 1, 1, MigrateApplicationRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(startApplicationRequestEClass, StartApplicationRequest.class, "StartApplicationRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStartApplicationRequest_ApplicationTemplate(), theApplicationPackage.getApplicationTemplate(), null, "applicationTemplate", null, 1, 1, StartApplicationRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStartApplicationRequest_ApplicationInstance(), theApplicationPackage.getApplicationInstance(), null, "applicationInstance", null, 0, 1, StartApplicationRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStartApplicationRequest_VmFlavour(), theCorePackage_1.getFlavour(), null, "vmFlavour", null, 1, 1, StartApplicationRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStartApplicationRequest_InputParameters(), theUtilPackage.getEStringToEStringObjectMapEntry(), null, "inputParameters", null, 0, -1, StartApplicationRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		EOperation op = initEOperation(getStartApplicationRequest__ApplicationInstanceMustBeOfTheRightTemplate__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "applicationInstanceMustBeOfTheRightTemplate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(suspendApplicationRequestEClass, SuspendApplicationRequest.class, "SuspendApplicationRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSuspendApplicationRequest_RunningApplicationSelector(), theSelectorPackage.getApplicationInstanceSelector(), null, "runningApplicationSelector", null, 1, 1, SuspendApplicationRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(terminateApplicationRequestEClass, TerminateApplicationRequest.class, "TerminateApplicationRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTerminateApplicationRequest_RunningApplicationSelector(), theSelectorPackage.getApplicationInstanceSelector(), null, "runningApplicationSelector", null, 1, 1, TerminateApplicationRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(changeOptimizationIntervalRequestEClass, ChangeOptimizationIntervalRequest.class, "ChangeOptimizationIntervalRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(theUtilPackage.getAmount());
		g2 = createEGenericType(theUtilPackage.getDuration());
		g1.getETypeArguments().add(g2);
		initEAttribute(getChangeOptimizationIntervalRequest_OptimizationInterval(), g1, "optimizationInterval", null, 1, 1, ChangeOptimizationIntervalRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(reconfigureScalableImageConnectorRequestEClass, ReconfigureScalableImageConnectorRequest.class, "ReconfigureScalableImageConnectorRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReconfigureScalableImageConnectorRequest_WhiteBoxApplicationInstanceSelector(), theSelectorPackage.getWhiteBoxApplicationInstanceSelector(), null, "whiteBoxApplicationInstanceSelector", null, 1, 1, ReconfigureScalableImageConnectorRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getReconfigureScalableImageConnectorRequest_LoadBalancingPolicy(), theApplicationPackage.getLoadBalancingPolicy(), "loadBalancingPolicy", null, 1, 1, ReconfigureScalableImageConnectorRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		g1 = createEGenericType(theUtilPackage.getAmount());
		g2 = createEGenericType(theUtilPackage.getDuration());
		g1.getETypeArguments().add(g2);
		initEAttribute(getReconfigureScalableImageConnectorRequest_AutoscalingAnalysisInterval(), g1, "autoscalingAnalysisInterval", null, 1, 1, ReconfigureScalableImageConnectorRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReconfigureScalableImageConnectorRequest_TargetConnector(), theApplicationPackage.getScalableVMImageConnector(), null, "targetConnector", null, 1, 1, ReconfigureScalableImageConnectorRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(setPhysicalNodeStateRequestEClass, SetPhysicalNodeStateRequest.class, "SetPhysicalNodeStateRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSetPhysicalNodeStateRequest_TargetNode(), theCorePackage.getAbstractNode(), null, "targetNode", null, 1, 1, SetPhysicalNodeStateRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSetPhysicalNodeStateRequest_TargetState(), theCorePackage.getNodeState(), "targetState", null, 1, 1, SetPhysicalNodeStateRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(resumeApplicationRequestEClass, ResumeApplicationRequest.class, "ResumeApplicationRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResumeApplicationRequest_PreviouslySuspendedApplicationSelector(), theSelectorPackage.getPreviouslySuspendedApplicationSelector(), null, "previouslySuspendedApplicationSelector", null, 1, 1, ResumeApplicationRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(experimentScenarioRequestEClass, ExperimentScenarioRequest.class, "ExperimentScenarioRequest", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExperimentScenarioRequest_TimelineEvent(), theExperimentscenarioPackage.getTimeLineEvent(), theExperimentscenarioPackage.getTimeLineEvent_ExperimentScenarioRequest(), "timelineEvent", null, 1, 1, ExperimentScenarioRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
	}

} //RequestPackageImpl
