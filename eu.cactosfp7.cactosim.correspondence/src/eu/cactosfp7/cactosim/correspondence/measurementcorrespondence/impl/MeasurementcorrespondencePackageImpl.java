/**
 */
package eu.cactosfp7.cactosim.correspondence.measurementcorrespondence.impl;

import de.fzi.power.binding.BindingPackage;

import de.fzi.power.infrastructure.InfrastructurePackage;

import de.fzi.power.specification.SpecificationPackage;

import de.fzi.power.util.UtilPackage;

import eu.cactosfp7.cactosim.correspondence.CorrespondencePackage;

import eu.cactosfp7.cactosim.correspondence.impl.CorrespondencePackageImpl;

import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalcorrespondencePackage;

import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.LogicalcorrespondencePackageImpl;

import eu.cactosfp7.cactosim.correspondence.measurementcorrespondence.MeasurementcorrespondenceFactory;
import eu.cactosfp7.cactosim.correspondence.measurementcorrespondence.MeasurementcorrespondencePackage;
import eu.cactosfp7.cactosim.correspondence.measurementcorrespondence.MonitorCorrespondenceRepository;
import eu.cactosfp7.cactosim.correspondence.measurementcorrespondence.MonitoredCactosEntityToMonitorCorrespondence;

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

import org.palladiosimulator.monitorrepository.MonitorRepositoryPackage;

import org.palladiosimulator.runtimemeasurement.RuntimeMeasurementPackage;
import org.scaledl.usageevolution.UsageevolutionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MeasurementcorrespondencePackageImpl extends EPackageImpl implements MeasurementcorrespondencePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass monitoredCactosEntityToMonitorCorrespondenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass monitorCorrespondenceRepositoryEClass = null;

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
	 * @see eu.cactosfp7.cactosim.correspondence.measurementcorrespondence.MeasurementcorrespondencePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MeasurementcorrespondencePackageImpl() {
		super(eNS_URI, MeasurementcorrespondenceFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MeasurementcorrespondencePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MeasurementcorrespondencePackage init() {
		if (isInited) return (MeasurementcorrespondencePackage)EPackage.Registry.INSTANCE.getEPackage(MeasurementcorrespondencePackage.eNS_URI);

		// Obtain or create and register package
		MeasurementcorrespondencePackageImpl theMeasurementcorrespondencePackage = (MeasurementcorrespondencePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MeasurementcorrespondencePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MeasurementcorrespondencePackageImpl());

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
		CorrespondencePackageImpl theCorrespondencePackage = (CorrespondencePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorrespondencePackage.eNS_URI) instanceof CorrespondencePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorrespondencePackage.eNS_URI) : CorrespondencePackage.eINSTANCE);
		PhysicalcorrespondencePackageImpl thePhysicalcorrespondencePackage = (PhysicalcorrespondencePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PhysicalcorrespondencePackage.eNS_URI) instanceof PhysicalcorrespondencePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PhysicalcorrespondencePackage.eNS_URI) : PhysicalcorrespondencePackage.eINSTANCE);
		LogicalcorrespondencePackageImpl theLogicalcorrespondencePackage = (LogicalcorrespondencePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LogicalcorrespondencePackage.eNS_URI) instanceof LogicalcorrespondencePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LogicalcorrespondencePackage.eNS_URI) : LogicalcorrespondencePackage.eINSTANCE);

		// Create package meta-data objects
		theMeasurementcorrespondencePackage.createPackageContents();
		theCorrespondencePackage.createPackageContents();
		thePhysicalcorrespondencePackage.createPackageContents();
		theLogicalcorrespondencePackage.createPackageContents();

		// Initialize created meta-data
		theMeasurementcorrespondencePackage.initializePackageContents();
		theCorrespondencePackage.initializePackageContents();
		thePhysicalcorrespondencePackage.initializePackageContents();
		theLogicalcorrespondencePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMeasurementcorrespondencePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MeasurementcorrespondencePackage.eNS_URI, theMeasurementcorrespondencePackage);
		return theMeasurementcorrespondencePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMonitoredCactosEntityToMonitorCorrespondence() {
		return monitoredCactosEntityToMonitorCorrespondenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMonitoredCactosEntityToMonitorCorrespondence_Cactos() {
		return (EReference)monitoredCactosEntityToMonitorCorrespondenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMonitoredCactosEntityToMonitorCorrespondence_Palladio() {
		return (EReference)monitoredCactosEntityToMonitorCorrespondenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMonitoredCactosEntityToMonitorCorrespondence_MonitorCorrespondenceRepository() {
		return (EReference)monitoredCactosEntityToMonitorCorrespondenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMonitorCorrespondenceRepository() {
		return monitorCorrespondenceRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMonitorCorrespondenceRepository_MonitoredCactosEntityToMonitorCorrespondences() {
		return (EReference)monitorCorrespondenceRepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementcorrespondenceFactory getMeasurementcorrespondenceFactory() {
		return (MeasurementcorrespondenceFactory)getEFactoryInstance();
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
		monitoredCactosEntityToMonitorCorrespondenceEClass = createEClass(MONITORED_CACTOS_ENTITY_TO_MONITOR_CORRESPONDENCE);
		createEReference(monitoredCactosEntityToMonitorCorrespondenceEClass, MONITORED_CACTOS_ENTITY_TO_MONITOR_CORRESPONDENCE__CACTOS);
		createEReference(monitoredCactosEntityToMonitorCorrespondenceEClass, MONITORED_CACTOS_ENTITY_TO_MONITOR_CORRESPONDENCE__PALLADIO);
		createEReference(monitoredCactosEntityToMonitorCorrespondenceEClass, MONITORED_CACTOS_ENTITY_TO_MONITOR_CORRESPONDENCE__MONITOR_CORRESPONDENCE_REPOSITORY);

		monitorCorrespondenceRepositoryEClass = createEClass(MONITOR_CORRESPONDENCE_REPOSITORY);
		createEReference(monitorCorrespondenceRepositoryEClass, MONITOR_CORRESPONDENCE_REPOSITORY__MONITORED_CACTOS_ENTITY_TO_MONITOR_CORRESPONDENCES);
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
		IdentifierPackage theIdentifierPackage = (IdentifierPackage)EPackage.Registry.INSTANCE.getEPackage(IdentifierPackage.eNS_URI);
		MonitorRepositoryPackage theMonitorRepositoryPackage = (MonitorRepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(MonitorRepositoryPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		monitoredCactosEntityToMonitorCorrespondenceEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		monitorCorrespondenceRepositoryEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());

		// Initialize classes and features; add operations and parameters
		initEClass(monitoredCactosEntityToMonitorCorrespondenceEClass, MonitoredCactosEntityToMonitorCorrespondence.class, "MonitoredCactosEntityToMonitorCorrespondence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMonitoredCactosEntityToMonitorCorrespondence_Cactos(), theIdentifierPackage.getIdentifier(), null, "cactos", null, 1, 1, MonitoredCactosEntityToMonitorCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMonitoredCactosEntityToMonitorCorrespondence_Palladio(), theMonitorRepositoryPackage.getMeasurementSpecification(), null, "palladio", null, 1, 1, MonitoredCactosEntityToMonitorCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMonitoredCactosEntityToMonitorCorrespondence_MonitorCorrespondenceRepository(), this.getMonitorCorrespondenceRepository(), this.getMonitorCorrespondenceRepository_MonitoredCactosEntityToMonitorCorrespondences(), "monitorCorrespondenceRepository", null, 0, 1, MonitoredCactosEntityToMonitorCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(monitorCorrespondenceRepositoryEClass, MonitorCorrespondenceRepository.class, "MonitorCorrespondenceRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMonitorCorrespondenceRepository_MonitoredCactosEntityToMonitorCorrespondences(), this.getMonitoredCactosEntityToMonitorCorrespondence(), this.getMonitoredCactosEntityToMonitorCorrespondence_MonitorCorrespondenceRepository(), "monitoredCactosEntityToMonitorCorrespondences", null, 0, -1, MonitorCorrespondenceRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //MeasurementcorrespondencePackageImpl
