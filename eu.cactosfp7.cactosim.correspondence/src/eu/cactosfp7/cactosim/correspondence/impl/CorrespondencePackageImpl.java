/**
 */
package eu.cactosfp7.cactosim.correspondence.impl;

import de.fzi.power.binding.BindingPackage;
import de.fzi.power.infrastructure.InfrastructurePackage;
import de.fzi.power.specification.SpecificationPackage;
import de.fzi.power.util.UtilPackage;
import eu.cactosfp7.cactosim.correspondence.CorrespondenceFactory;
import eu.cactosfp7.cactosim.correspondence.CorrespondencePackage;
import eu.cactosfp7.cactosim.correspondence.LoadCorrespondence;

import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalcorrespondencePackage;

import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.LogicalcorrespondencePackageImpl;

import eu.cactosfp7.cactosim.correspondence.measurementcorrespondence.MeasurementcorrespondencePackage;
import eu.cactosfp7.cactosim.correspondence.measurementcorrespondence.impl.MeasurementcorrespondencePackageImpl;
import eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalcorrespondencePackage;

import eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.PhysicalcorrespondencePackageImpl;

import eu.cactosfp7.identifier.IdentifierPackage;

import eu.cactosfp7.infrastructuremodels.load.logical.impl.LogicalPackageImpl;

import eu.cactosfp7.infrastructuremodels.load.physical.impl.PhysicalPackageImpl;
import eu.cactosfp7.optimisationplan.OptimisationplanPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.palladiosimulator.runtimemeasurement.RuntimeMeasurementPackage;
import org.scaledl.usageevolution.UsageevolutionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CorrespondencePackageImpl extends EPackageImpl implements CorrespondencePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loadCorrespondenceEClass = null;

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
	 * @see eu.cactosfp7.cactosim.correspondence.CorrespondencePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CorrespondencePackageImpl() {
		super(eNS_URI, CorrespondenceFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CorrespondencePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CorrespondencePackage init() {
		if (isInited) return (CorrespondencePackage)EPackage.Registry.INSTANCE.getEPackage(CorrespondencePackage.eNS_URI);

		// Obtain or create and register package
		CorrespondencePackageImpl theCorrespondencePackage = (CorrespondencePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CorrespondencePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CorrespondencePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		LogicalPackageImpl.eINSTANCE.eClass();
		PhysicalPackageImpl.eINSTANCE.eClass();
		OptimisationplanPackage.eINSTANCE.eClass();
		UtilPackage.eINSTANCE.eClass();
		SpecificationPackage.eINSTANCE.eClass();
		BindingPackage.eINSTANCE.eClass();
		InfrastructurePackage.eINSTANCE.eClass();
		RuntimeMeasurementPackage.eINSTANCE.eClass();
		UsageevolutionPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		PhysicalcorrespondencePackageImpl thePhysicalcorrespondencePackage = (PhysicalcorrespondencePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PhysicalcorrespondencePackage.eNS_URI) instanceof PhysicalcorrespondencePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PhysicalcorrespondencePackage.eNS_URI) : PhysicalcorrespondencePackage.eINSTANCE);
		LogicalcorrespondencePackageImpl theLogicalcorrespondencePackage = (LogicalcorrespondencePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LogicalcorrespondencePackage.eNS_URI) instanceof LogicalcorrespondencePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LogicalcorrespondencePackage.eNS_URI) : LogicalcorrespondencePackage.eINSTANCE);
		MeasurementcorrespondencePackageImpl theMeasurementcorrespondencePackage = (MeasurementcorrespondencePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MeasurementcorrespondencePackage.eNS_URI) instanceof MeasurementcorrespondencePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MeasurementcorrespondencePackage.eNS_URI) : MeasurementcorrespondencePackage.eINSTANCE);

		// Create package meta-data objects
		theCorrespondencePackage.createPackageContents();
		thePhysicalcorrespondencePackage.createPackageContents();
		theLogicalcorrespondencePackage.createPackageContents();
		theMeasurementcorrespondencePackage.createPackageContents();

		// Initialize created meta-data
		theCorrespondencePackage.initializePackageContents();
		thePhysicalcorrespondencePackage.initializePackageContents();
		theLogicalcorrespondencePackage.initializePackageContents();
		theMeasurementcorrespondencePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCorrespondencePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CorrespondencePackage.eNS_URI, theCorrespondencePackage);
		return theCorrespondencePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoadCorrespondence() {
		return loadCorrespondenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoadCorrespondence_Palladio() {
		return (EReference)loadCorrespondenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorrespondenceFactory getCorrespondenceFactory() {
		return (CorrespondenceFactory)getEFactoryInstance();
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
		loadCorrespondenceEClass = createEClass(LOAD_CORRESPONDENCE);
		createEReference(loadCorrespondenceEClass, LOAD_CORRESPONDENCE__PALLADIO);
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
		PhysicalcorrespondencePackage thePhysicalcorrespondencePackage = (PhysicalcorrespondencePackage)EPackage.Registry.INSTANCE.getEPackage(PhysicalcorrespondencePackage.eNS_URI);
		LogicalcorrespondencePackage theLogicalcorrespondencePackage = (LogicalcorrespondencePackage)EPackage.Registry.INSTANCE.getEPackage(LogicalcorrespondencePackage.eNS_URI);
		MeasurementcorrespondencePackage theMeasurementcorrespondencePackage = (MeasurementcorrespondencePackage)EPackage.Registry.INSTANCE.getEPackage(MeasurementcorrespondencePackage.eNS_URI);
		IdentifierPackage theIdentifierPackage = (IdentifierPackage)EPackage.Registry.INSTANCE.getEPackage(IdentifierPackage.eNS_URI);
		RuntimeMeasurementPackage theRuntimeMeasurementPackage = (RuntimeMeasurementPackage)EPackage.Registry.INSTANCE.getEPackage(RuntimeMeasurementPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(thePhysicalcorrespondencePackage);
		getESubpackages().add(theLogicalcorrespondencePackage);
		getESubpackages().add(theMeasurementcorrespondencePackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		loadCorrespondenceEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());

		// Initialize classes and features; add operations and parameters
		initEClass(loadCorrespondenceEClass, LoadCorrespondence.class, "LoadCorrespondence", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLoadCorrespondence_Palladio(), theRuntimeMeasurementPackage.getRuntimeMeasurement(), null, "palladio", null, 1, 1, LoadCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //CorrespondencePackageImpl
