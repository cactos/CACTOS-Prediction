/**
 */
package eu.cactosfp7.cactosim.experimentscenario.selector.impl;

import eu.cactosfp7.cactosim.experimentscenario.ExperimentscenarioPackage;

import eu.cactosfp7.cactosim.experimentscenario.impl.ExperimentscenarioPackageImpl;

import eu.cactosfp7.cactosim.experimentscenario.request.RequestPackage;

import eu.cactosfp7.cactosim.experimentscenario.request.impl.RequestPackageImpl;

import eu.cactosfp7.cactosim.experimentscenario.selector.ApplicationInstanceSelector;
import eu.cactosfp7.cactosim.experimentscenario.selector.BlackBoxApplicationInstanceSelector;
import eu.cactosfp7.cactosim.experimentscenario.selector.GreyBoxApplicationInstanceSelector;
import eu.cactosfp7.cactosim.experimentscenario.selector.InitiallyRunningBlackBoxApplicationInstanceSelector;
import eu.cactosfp7.cactosim.experimentscenario.selector.InitiallyRunningGreyBoxApplicationInstanceSelector;
import eu.cactosfp7.cactosim.experimentscenario.selector.InitiallyRunningInstanceSelector;
import eu.cactosfp7.cactosim.experimentscenario.selector.InitiallyRunningWhiteBoxApplicationInstanceSelector;
import eu.cactosfp7.cactosim.experimentscenario.selector.NonWhiteBoxApplicationInstanceSelector;
import eu.cactosfp7.cactosim.experimentscenario.selector.PreviouslyStartedApplicationSelector;
import eu.cactosfp7.cactosim.experimentscenario.selector.PreviouslyStartedBlackBoxApplicationSelector;
import eu.cactosfp7.cactosim.experimentscenario.selector.PreviouslyStartedGreyBoxApplicationSelector;
import eu.cactosfp7.cactosim.experimentscenario.selector.PreviouslyStartedWhiteBoxApplicationInstanceSelector;
import eu.cactosfp7.cactosim.experimentscenario.selector.PreviouslySuspendedApplicationSelector;
import eu.cactosfp7.cactosim.experimentscenario.selector.SelectorFactory;
import eu.cactosfp7.cactosim.experimentscenario.selector.SelectorPackage;
import eu.cactosfp7.cactosim.experimentscenario.selector.SuspendedInstanceSelector;
import eu.cactosfp7.cactosim.experimentscenario.selector.WhiteBoxApplicationInstanceSelector;

import eu.cactosfp7.identifier.IdentifierPackage;
import eu.cactosfp7.infrastructuremodels.logicaldc.application.impl.ApplicationPackageImpl;

import eu.cactosfp7.infrastructuremodels.logicaldc.hypervisor.impl.HypervisorPackageImpl;

import eu.cactosfp7.infrastructuremodels.physicaldc.architecturetype.impl.ArchitecturetypePackageImpl;

import eu.cactosfp7.infrastructuremodels.physicaldc.core.impl.CorePackageImpl;

import eu.cactosfp7.infrastructuremodels.physicaldc.power.impl.PowerPackageImpl;

import eu.cactosfp7.infrastructuremodels.physicaldc.util.impl.UtilPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;

import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SelectorPackageImpl extends EPackageImpl implements SelectorPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initiallyRunningInstanceSelectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass previouslyStartedApplicationSelectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass previouslySuspendedApplicationSelectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass suspendedInstanceSelectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blackBoxApplicationInstanceSelectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nonWhiteBoxApplicationInstanceSelectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass greyBoxApplicationInstanceSelectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whiteBoxApplicationInstanceSelectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initiallyRunningWhiteBoxApplicationInstanceSelectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initiallyRunningGreyBoxApplicationInstanceSelectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initiallyRunningBlackBoxApplicationInstanceSelectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass previouslyStartedWhiteBoxApplicationInstanceSelectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass previouslyStartedBlackBoxApplicationSelectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass previouslyStartedGreyBoxApplicationSelectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationInstanceSelectorEClass = null;

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
	 * @see eu.cactosfp7.cactosim.experimentscenario.selector.SelectorPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SelectorPackageImpl() {
		super(eNS_URI, SelectorFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SelectorPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SelectorPackage init() {
		if (isInited) return (SelectorPackage)EPackage.Registry.INSTANCE.getEPackage(SelectorPackage.eNS_URI);

		// Obtain or create and register package
		SelectorPackageImpl theSelectorPackage = (SelectorPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SelectorPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SelectorPackageImpl());

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
		RequestPackageImpl theRequestPackage = (RequestPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RequestPackage.eNS_URI) instanceof RequestPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RequestPackage.eNS_URI) : RequestPackage.eINSTANCE);

		// Create package meta-data objects
		theSelectorPackage.createPackageContents();
		theExperimentscenarioPackage.createPackageContents();
		theRequestPackage.createPackageContents();

		// Initialize created meta-data
		theSelectorPackage.initializePackageContents();
		theExperimentscenarioPackage.initializePackageContents();
		theRequestPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSelectorPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SelectorPackage.eNS_URI, theSelectorPackage);
		return theSelectorPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
    public EClass getInitiallyRunningInstanceSelector() {
		return initiallyRunningInstanceSelectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
    public EReference getInitiallyRunningInstanceSelector_ApplicationInstance() {
		return (EReference)initiallyRunningInstanceSelectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
    public EClass getPreviouslyStartedApplicationSelector() {
		return previouslyStartedApplicationSelectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
    public EReference getPreviouslyStartedApplicationSelector_StartApplicationRequest() {
		return (EReference)previouslyStartedApplicationSelectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
    public EClass getPreviouslySuspendedApplicationSelector() {
		return previouslySuspendedApplicationSelectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
    public EReference getPreviouslySuspendedApplicationSelector_SuspendRequest() {
		return (EReference)previouslySuspendedApplicationSelectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
    public EClass getSuspendedInstanceSelector() {
		return suspendedInstanceSelectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
    public EClass getBlackBoxApplicationInstanceSelector() {
		return blackBoxApplicationInstanceSelectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
    public EClass getNonWhiteBoxApplicationInstanceSelector() {
		return nonWhiteBoxApplicationInstanceSelectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
    public EClass getGreyBoxApplicationInstanceSelector() {
		return greyBoxApplicationInstanceSelectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
    public EClass getWhiteBoxApplicationInstanceSelector() {
		return whiteBoxApplicationInstanceSelectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
    public EClass getInitiallyRunningWhiteBoxApplicationInstanceSelector() {
		return initiallyRunningWhiteBoxApplicationInstanceSelectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
    public EClass getInitiallyRunningGreyBoxApplicationInstanceSelector() {
		return initiallyRunningGreyBoxApplicationInstanceSelectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
    public EClass getInitiallyRunningBlackBoxApplicationInstanceSelector() {
		return initiallyRunningBlackBoxApplicationInstanceSelectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
    public EClass getPreviouslyStartedWhiteBoxApplicationInstanceSelector() {
		return previouslyStartedWhiteBoxApplicationInstanceSelectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
    public EClass getPreviouslyStartedBlackBoxApplicationSelector() {
		return previouslyStartedBlackBoxApplicationSelectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
    public EClass getPreviouslyStartedGreyBoxApplicationSelector() {
		return previouslyStartedGreyBoxApplicationSelectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
    public EClass getApplicationInstanceSelector() {
		return applicationInstanceSelectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
    public SelectorFactory getSelectorFactory() {
		return (SelectorFactory)getEFactoryInstance();
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
		initiallyRunningInstanceSelectorEClass = createEClass(INITIALLY_RUNNING_INSTANCE_SELECTOR);
		createEReference(initiallyRunningInstanceSelectorEClass, INITIALLY_RUNNING_INSTANCE_SELECTOR__APPLICATION_INSTANCE);

		previouslyStartedApplicationSelectorEClass = createEClass(PREVIOUSLY_STARTED_APPLICATION_SELECTOR);
		createEReference(previouslyStartedApplicationSelectorEClass, PREVIOUSLY_STARTED_APPLICATION_SELECTOR__START_APPLICATION_REQUEST);

		previouslySuspendedApplicationSelectorEClass = createEClass(PREVIOUSLY_SUSPENDED_APPLICATION_SELECTOR);
		createEReference(previouslySuspendedApplicationSelectorEClass, PREVIOUSLY_SUSPENDED_APPLICATION_SELECTOR__SUSPEND_REQUEST);

		suspendedInstanceSelectorEClass = createEClass(SUSPENDED_INSTANCE_SELECTOR);

		blackBoxApplicationInstanceSelectorEClass = createEClass(BLACK_BOX_APPLICATION_INSTANCE_SELECTOR);

		nonWhiteBoxApplicationInstanceSelectorEClass = createEClass(NON_WHITE_BOX_APPLICATION_INSTANCE_SELECTOR);

		greyBoxApplicationInstanceSelectorEClass = createEClass(GREY_BOX_APPLICATION_INSTANCE_SELECTOR);

		whiteBoxApplicationInstanceSelectorEClass = createEClass(WHITE_BOX_APPLICATION_INSTANCE_SELECTOR);

		initiallyRunningWhiteBoxApplicationInstanceSelectorEClass = createEClass(INITIALLY_RUNNING_WHITE_BOX_APPLICATION_INSTANCE_SELECTOR);

		initiallyRunningGreyBoxApplicationInstanceSelectorEClass = createEClass(INITIALLY_RUNNING_GREY_BOX_APPLICATION_INSTANCE_SELECTOR);

		initiallyRunningBlackBoxApplicationInstanceSelectorEClass = createEClass(INITIALLY_RUNNING_BLACK_BOX_APPLICATION_INSTANCE_SELECTOR);

		previouslyStartedWhiteBoxApplicationInstanceSelectorEClass = createEClass(PREVIOUSLY_STARTED_WHITE_BOX_APPLICATION_INSTANCE_SELECTOR);

		previouslyStartedBlackBoxApplicationSelectorEClass = createEClass(PREVIOUSLY_STARTED_BLACK_BOX_APPLICATION_SELECTOR);

		previouslyStartedGreyBoxApplicationSelectorEClass = createEClass(PREVIOUSLY_STARTED_GREY_BOX_APPLICATION_SELECTOR);

		applicationInstanceSelectorEClass = createEClass(APPLICATION_INSTANCE_SELECTOR);
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
		ApplicationPackageImpl theApplicationPackage = (ApplicationPackageImpl)EPackage.Registry.INSTANCE.getEPackage(ApplicationPackageImpl.eNS_URI);
		RequestPackage theRequestPackage = (RequestPackage)EPackage.Registry.INSTANCE.getEPackage(RequestPackage.eNS_URI);
		IdentifierPackage theIdentifierPackage = (IdentifierPackage)EPackage.Registry.INSTANCE.getEPackage(IdentifierPackage.eNS_URI);

		// Create type parameters
		ETypeParameter initiallyRunningInstanceSelectorEClass_instanceTypeParameter = addETypeParameter(initiallyRunningInstanceSelectorEClass, "instanceTypeParameter");
		ETypeParameter previouslyStartedApplicationSelectorEClass_instanceTypeParameter = addETypeParameter(previouslyStartedApplicationSelectorEClass, "instanceTypeParameter");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(theApplicationPackage.getApplicationInstance());
		initiallyRunningInstanceSelectorEClass_instanceTypeParameter.getEBounds().add(g1);
		g1 = createEGenericType(theApplicationPackage.getApplicationInstance());
		previouslyStartedApplicationSelectorEClass_instanceTypeParameter.getEBounds().add(g1);

		// Add supertypes to classes
		initiallyRunningInstanceSelectorEClass.getESuperTypes().add(this.getApplicationInstanceSelector());
		previouslyStartedApplicationSelectorEClass.getESuperTypes().add(this.getApplicationInstanceSelector());
		blackBoxApplicationInstanceSelectorEClass.getESuperTypes().add(this.getNonWhiteBoxApplicationInstanceSelector());
		nonWhiteBoxApplicationInstanceSelectorEClass.getESuperTypes().add(this.getApplicationInstanceSelector());
		greyBoxApplicationInstanceSelectorEClass.getESuperTypes().add(this.getNonWhiteBoxApplicationInstanceSelector());
		whiteBoxApplicationInstanceSelectorEClass.getESuperTypes().add(this.getApplicationInstanceSelector());
		g1 = createEGenericType(this.getWhiteBoxApplicationInstanceSelector());
		initiallyRunningWhiteBoxApplicationInstanceSelectorEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getInitiallyRunningInstanceSelector());
		EGenericType g2 = createEGenericType(theApplicationPackage.getWhiteBoxApplicationInstance());
		g1.getETypeArguments().add(g2);
		initiallyRunningWhiteBoxApplicationInstanceSelectorEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getInitiallyRunningInstanceSelector());
		g2 = createEGenericType(theApplicationPackage.getGreyBoxApplicationInstance());
		g1.getETypeArguments().add(g2);
		initiallyRunningGreyBoxApplicationInstanceSelectorEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getGreyBoxApplicationInstanceSelector());
		initiallyRunningGreyBoxApplicationInstanceSelectorEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getBlackBoxApplicationInstanceSelector());
		initiallyRunningBlackBoxApplicationInstanceSelectorEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getInitiallyRunningInstanceSelector());
		g2 = createEGenericType(theApplicationPackage.getBlackBoxApplicationInstance());
		g1.getETypeArguments().add(g2);
		initiallyRunningBlackBoxApplicationInstanceSelectorEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getWhiteBoxApplicationInstanceSelector());
		previouslyStartedWhiteBoxApplicationInstanceSelectorEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getPreviouslyStartedApplicationSelector());
		g2 = createEGenericType(theApplicationPackage.getWhiteBoxApplicationInstance());
		g1.getETypeArguments().add(g2);
		previouslyStartedWhiteBoxApplicationInstanceSelectorEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getPreviouslyStartedApplicationSelector());
		g2 = createEGenericType(theApplicationPackage.getBlackBoxApplicationInstance());
		g1.getETypeArguments().add(g2);
		previouslyStartedBlackBoxApplicationSelectorEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getBlackBoxApplicationInstanceSelector());
		previouslyStartedBlackBoxApplicationSelectorEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getPreviouslyStartedApplicationSelector());
		g2 = createEGenericType(theApplicationPackage.getGreyBoxApplicationInstance());
		g1.getETypeArguments().add(g2);
		previouslyStartedGreyBoxApplicationSelectorEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getGreyBoxApplicationInstanceSelector());
		previouslyStartedGreyBoxApplicationSelectorEClass.getEGenericSuperTypes().add(g1);
		applicationInstanceSelectorEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());

		// Initialize classes, features, and operations; add parameters
		initEClass(initiallyRunningInstanceSelectorEClass, InitiallyRunningInstanceSelector.class, "InitiallyRunningInstanceSelector", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(initiallyRunningInstanceSelectorEClass_instanceTypeParameter);
		initEReference(getInitiallyRunningInstanceSelector_ApplicationInstance(), g1, null, "applicationInstance", null, 1, 1, InitiallyRunningInstanceSelector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(previouslyStartedApplicationSelectorEClass, PreviouslyStartedApplicationSelector.class, "PreviouslyStartedApplicationSelector", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPreviouslyStartedApplicationSelector_StartApplicationRequest(), theRequestPackage.getStartApplicationRequest(), null, "startApplicationRequest", null, 1, 1, PreviouslyStartedApplicationSelector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(previouslySuspendedApplicationSelectorEClass, PreviouslySuspendedApplicationSelector.class, "PreviouslySuspendedApplicationSelector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPreviouslySuspendedApplicationSelector_SuspendRequest(), theRequestPackage.getSuspendApplicationRequest(), null, "suspendRequest", null, 1, 1, PreviouslySuspendedApplicationSelector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(suspendedInstanceSelectorEClass, SuspendedInstanceSelector.class, "SuspendedInstanceSelector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(blackBoxApplicationInstanceSelectorEClass, BlackBoxApplicationInstanceSelector.class, "BlackBoxApplicationInstanceSelector", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nonWhiteBoxApplicationInstanceSelectorEClass, NonWhiteBoxApplicationInstanceSelector.class, "NonWhiteBoxApplicationInstanceSelector", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(greyBoxApplicationInstanceSelectorEClass, GreyBoxApplicationInstanceSelector.class, "GreyBoxApplicationInstanceSelector", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(whiteBoxApplicationInstanceSelectorEClass, WhiteBoxApplicationInstanceSelector.class, "WhiteBoxApplicationInstanceSelector", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(initiallyRunningWhiteBoxApplicationInstanceSelectorEClass, InitiallyRunningWhiteBoxApplicationInstanceSelector.class, "InitiallyRunningWhiteBoxApplicationInstanceSelector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(initiallyRunningGreyBoxApplicationInstanceSelectorEClass, InitiallyRunningGreyBoxApplicationInstanceSelector.class, "InitiallyRunningGreyBoxApplicationInstanceSelector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(initiallyRunningBlackBoxApplicationInstanceSelectorEClass, InitiallyRunningBlackBoxApplicationInstanceSelector.class, "InitiallyRunningBlackBoxApplicationInstanceSelector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(previouslyStartedWhiteBoxApplicationInstanceSelectorEClass, PreviouslyStartedWhiteBoxApplicationInstanceSelector.class, "PreviouslyStartedWhiteBoxApplicationInstanceSelector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(previouslyStartedBlackBoxApplicationSelectorEClass, PreviouslyStartedBlackBoxApplicationSelector.class, "PreviouslyStartedBlackBoxApplicationSelector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(previouslyStartedGreyBoxApplicationSelectorEClass, PreviouslyStartedGreyBoxApplicationSelector.class, "PreviouslyStartedGreyBoxApplicationSelector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(applicationInstanceSelectorEClass, ApplicationInstanceSelector.class, "ApplicationInstanceSelector", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //SelectorPackageImpl
