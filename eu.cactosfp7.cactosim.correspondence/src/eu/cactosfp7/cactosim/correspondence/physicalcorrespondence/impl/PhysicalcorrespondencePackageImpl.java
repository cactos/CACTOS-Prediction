/**
 */
package eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl;

import de.fzi.power.binding.BindingPackage;
import de.fzi.power.infrastructure.InfrastructurePackage;
import de.fzi.power.specification.SpecificationPackage;
import de.fzi.power.util.UtilPackage;
import eu.cactosfp7.cactosim.correspondence.CorrespondencePackage;

import eu.cactosfp7.cactosim.correspondence.impl.CorrespondencePackageImpl;

import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalcorrespondencePackage;

import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.LogicalcorrespondencePackageImpl;

import eu.cactosfp7.cactosim.correspondence.measurementcorrespondence.MeasurementcorrespondencePackage;
import eu.cactosfp7.cactosim.correspondence.measurementcorrespondence.impl.MeasurementcorrespondencePackageImpl;
import eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.AbstractNodeCorrespondence;
import eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.ArchitectureTypeCorrespondence;
import eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.InterconnectMeasurementCorrespondence;
import eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.MemoryMeasurementCorrespondence;
import eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.MemorySpecificationCorrespondence;
import eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.NetworkInterconnectCorrespondence;
import eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalCorrespondenceRepository;
import eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalcorrespondenceFactory;
import eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalcorrespondencePackage;
import eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PowerConsumingEntityMeasurementCorrespondence;
import eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PowerConsumingResourceCorrespondence;
import eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PowerProvidingEntityCorrespondence;
import eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.ProcessingUnitSpecificationCorrespondence;
import eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PuMeasurementCorrespondence;
import eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.RackCorrespondence;
import eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.StorageMeasurementCorrespondence;
import eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.StorageSpecificationCorrespondence;
import eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.SwitchCorrespondence;

import eu.cactosfp7.identifier.IdentifierPackage;

import eu.cactosfp7.infrastructuremodels.load.logical.impl.LogicalPackageImpl;

import eu.cactosfp7.infrastructuremodels.load.physical.impl.PhysicalPackageImpl;
import eu.cactosfp7.infrastructuremodels.physicaldc.architecturetype.impl.ArchitecturetypePackageImpl;

import eu.cactosfp7.infrastructuremodels.physicaldc.core.impl.CorePackageImpl;

import eu.cactosfp7.infrastructuremodels.physicaldc.power.impl.PowerPackageImpl;
import eu.cactosfp7.optimisationplan.OptimisationplanPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.palladiosimulator.pcm.resourceenvironment.ResourceenvironmentPackage;

import org.palladiosimulator.pcm.resourcetype.ResourcetypePackage;
import org.palladiosimulator.runtimemeasurement.RuntimeMeasurementPackage;
import org.scaledl.usageevolution.UsageevolutionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PhysicalcorrespondencePackageImpl extends EPackageImpl implements PhysicalcorrespondencePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass puMeasurementCorrespondenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memoryMeasurementCorrespondenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storageMeasurementCorrespondenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interconnectMeasurementCorrespondenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalCorrespondenceRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass switchCorrespondenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rackCorrespondenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractNodeCorrespondenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memorySpecificationCorrespondenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storageSpecificationCorrespondenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkInterconnectCorrespondenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processingUnitSpecificationCorrespondenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass powerConsumingEntityMeasurementCorrespondenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass powerProvidingEntityCorrespondenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass powerConsumingResourceCorrespondenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass architectureTypeCorrespondenceEClass = null;

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
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalcorrespondencePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PhysicalcorrespondencePackageImpl() {
		super(eNS_URI, PhysicalcorrespondenceFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PhysicalcorrespondencePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PhysicalcorrespondencePackage init() {
		if (isInited) return (PhysicalcorrespondencePackage)EPackage.Registry.INSTANCE.getEPackage(PhysicalcorrespondencePackage.eNS_URI);

		// Obtain or create and register package
		PhysicalcorrespondencePackageImpl thePhysicalcorrespondencePackage = (PhysicalcorrespondencePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PhysicalcorrespondencePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PhysicalcorrespondencePackageImpl());

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
		LogicalcorrespondencePackageImpl theLogicalcorrespondencePackage = (LogicalcorrespondencePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LogicalcorrespondencePackage.eNS_URI) instanceof LogicalcorrespondencePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LogicalcorrespondencePackage.eNS_URI) : LogicalcorrespondencePackage.eINSTANCE);
		MeasurementcorrespondencePackageImpl theMeasurementcorrespondencePackage = (MeasurementcorrespondencePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MeasurementcorrespondencePackage.eNS_URI) instanceof MeasurementcorrespondencePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MeasurementcorrespondencePackage.eNS_URI) : MeasurementcorrespondencePackage.eINSTANCE);

		// Create package meta-data objects
		thePhysicalcorrespondencePackage.createPackageContents();
		theCorrespondencePackage.createPackageContents();
		theLogicalcorrespondencePackage.createPackageContents();
		theMeasurementcorrespondencePackage.createPackageContents();

		// Initialize created meta-data
		thePhysicalcorrespondencePackage.initializePackageContents();
		theCorrespondencePackage.initializePackageContents();
		theLogicalcorrespondencePackage.initializePackageContents();
		theMeasurementcorrespondencePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePhysicalcorrespondencePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PhysicalcorrespondencePackage.eNS_URI, thePhysicalcorrespondencePackage);
		return thePhysicalcorrespondencePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPuMeasurementCorrespondence() {
		return puMeasurementCorrespondenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPuMeasurementCorrespondence_Cactos() {
		return (EReference)puMeasurementCorrespondenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPuMeasurementCorrespondence_PhysicalCorrespondenceRepository() {
		return (EReference)puMeasurementCorrespondenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMemoryMeasurementCorrespondence() {
		return memoryMeasurementCorrespondenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMemoryMeasurementCorrespondence_Cactos() {
		return (EReference)memoryMeasurementCorrespondenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMemoryMeasurementCorrespondence_PhysicalCorrespondenceRepository() {
		return (EReference)memoryMeasurementCorrespondenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStorageMeasurementCorrespondence() {
		return storageMeasurementCorrespondenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStorageMeasurementCorrespondence_Cactos() {
		return (EReference)storageMeasurementCorrespondenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStorageMeasurementCorrespondence_PhysicalCorrespondenceRepository() {
		return (EReference)storageMeasurementCorrespondenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterconnectMeasurementCorrespondence() {
		return interconnectMeasurementCorrespondenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterconnectMeasurementCorrespondence_Cactos() {
		return (EReference)interconnectMeasurementCorrespondenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterconnectMeasurementCorrespondence_PhysicalCorrespondenceRepository() {
		return (EReference)interconnectMeasurementCorrespondenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicalCorrespondenceRepository() {
		return physicalCorrespondenceRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicalCorrespondenceRepository_CorrespondenceEstablished() {
		return (EAttribute)physicalCorrespondenceRepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalCorrespondenceRepository_PuMeasurementCorrespondences() {
		return (EReference)physicalCorrespondenceRepositoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalCorrespondenceRepository_MemoryMeasurementCorrespondences() {
		return (EReference)physicalCorrespondenceRepositoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalCorrespondenceRepository_StorageMeasurementCorrespondences() {
		return (EReference)physicalCorrespondenceRepositoryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalCorrespondenceRepository_InterconnectMeasurementCorrespondences() {
		return (EReference)physicalCorrespondenceRepositoryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalCorrespondenceRepository_SwitchCorrespondences() {
		return (EReference)physicalCorrespondenceRepositoryEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalCorrespondenceRepository_RackCorrespondences() {
		return (EReference)physicalCorrespondenceRepositoryEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalCorrespondenceRepository_AbstractNodeCorrespondences() {
		return (EReference)physicalCorrespondenceRepositoryEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalCorrespondenceRepository_MemorySpecificationCorrespondences() {
		return (EReference)physicalCorrespondenceRepositoryEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalCorrespondenceRepository_StorageSpecificationCorrespondences() {
		return (EReference)physicalCorrespondenceRepositoryEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalCorrespondenceRepository_NetworkInterconnectCorrespondences() {
		return (EReference)physicalCorrespondenceRepositoryEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalCorrespondenceRepository_ProcessingUnitSpecificationCorrespondences() {
		return (EReference)physicalCorrespondenceRepositoryEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalCorrespondenceRepository_PhysicalDcModel() {
		return (EReference)physicalCorrespondenceRepositoryEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalCorrespondenceRepository_PhysicalLoadModel() {
		return (EReference)physicalCorrespondenceRepositoryEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalCorrespondenceRepository_PowerConsumingEntityMeasurementCorrespondences() {
		return (EReference)physicalCorrespondenceRepositoryEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalCorrespondenceRepository_PowerProvidingEntityCorrespondences() {
		return (EReference)physicalCorrespondenceRepositoryEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalCorrespondenceRepository_PowerConsumingResourceCorrespondences() {
		return (EReference)physicalCorrespondenceRepositoryEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getPhysicalCorrespondenceRepository_ArchitectureTypeCorrespondences() {
		return (EReference)physicalCorrespondenceRepositoryEClass.getEStructuralFeatures().get(17);
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwitchCorrespondence() {
		return switchCorrespondenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwitchCorrespondence_Cactos() {
		return (EReference)switchCorrespondenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwitchCorrespondence_Palladio() {
		return (EReference)switchCorrespondenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwitchCorrespondence_PhysicalCorrespondenceRepository() {
		return (EReference)switchCorrespondenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRackCorrespondence() {
		return rackCorrespondenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRackCorrespondence_Cactos() {
		return (EReference)rackCorrespondenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRackCorrespondence_Palladio() {
		return (EReference)rackCorrespondenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRackCorrespondence_PhysicalCorrespondenceRepository() {
		return (EReference)rackCorrespondenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractNodeCorrespondence() {
		return abstractNodeCorrespondenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractNodeCorrespondence_Cactos() {
		return (EReference)abstractNodeCorrespondenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractNodeCorrespondence_Palladio() {
		return (EReference)abstractNodeCorrespondenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractNodeCorrespondence_PhysicalCorrespondenceRepository() {
		return (EReference)abstractNodeCorrespondenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMemorySpecificationCorrespondence() {
		return memorySpecificationCorrespondenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMemorySpecificationCorrespondence_Cactos() {
		return (EReference)memorySpecificationCorrespondenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMemorySpecificationCorrespondence_Palladio() {
		return (EReference)memorySpecificationCorrespondenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMemorySpecificationCorrespondence_PhysicalCorrespondenceRepository() {
		return (EReference)memorySpecificationCorrespondenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStorageSpecificationCorrespondence() {
		return storageSpecificationCorrespondenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStorageSpecificationCorrespondence_Cactos() {
		return (EReference)storageSpecificationCorrespondenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStorageSpecificationCorrespondence_Palladio() {
		return (EReference)storageSpecificationCorrespondenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStorageSpecificationCorrespondence_PhysicalCorrespondenceRepository() {
		return (EReference)storageSpecificationCorrespondenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNetworkInterconnectCorrespondence() {
		return networkInterconnectCorrespondenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNetworkInterconnectCorrespondence_Cactos() {
		return (EReference)networkInterconnectCorrespondenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNetworkInterconnectCorrespondence_Palladio() {
		return (EReference)networkInterconnectCorrespondenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNetworkInterconnectCorrespondence_PhysicalCorrespondenceRepository() {
		return (EReference)networkInterconnectCorrespondenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getNetworkInterconnectCorrespondence_ReconfigurationController() {
		return (EReference)networkInterconnectCorrespondenceEClass.getEStructuralFeatures().get(3);
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessingUnitSpecificationCorrespondence() {
		return processingUnitSpecificationCorrespondenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessingUnitSpecificationCorrespondence_Cactos() {
		return (EReference)processingUnitSpecificationCorrespondenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessingUnitSpecificationCorrespondence_Palladio() {
		return (EReference)processingUnitSpecificationCorrespondenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessingUnitSpecificationCorrespondence_PhysicalCorrespondenceRepository() {
		return (EReference)processingUnitSpecificationCorrespondenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPowerConsumingEntityMeasurementCorrespondence() {
		return powerConsumingEntityMeasurementCorrespondenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPowerConsumingEntityMeasurementCorrespondence_Cactos() {
		return (EReference)powerConsumingEntityMeasurementCorrespondenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPowerConsumingEntityMeasurementCorrespondence_PhysicalCorrespondenceRepository() {
		return (EReference)powerConsumingEntityMeasurementCorrespondenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPowerProvidingEntityCorrespondence() {
		return powerProvidingEntityCorrespondenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPowerProvidingEntityCorrespondence_Cactos() {
		return (EReference)powerProvidingEntityCorrespondenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPowerProvidingEntityCorrespondence_Palladio() {
		return (EReference)powerProvidingEntityCorrespondenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPowerProvidingEntityCorrespondence_PhysicalCorrespondenceRepository() {
		return (EReference)powerProvidingEntityCorrespondenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPowerConsumingResourceCorrespondence() {
		return powerConsumingResourceCorrespondenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPowerConsumingResourceCorrespondence_Cactos() {
		return (EReference)powerConsumingResourceCorrespondenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPowerConsumingResourceCorrespondence_Palladio() {
		return (EReference)powerConsumingResourceCorrespondenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPowerConsumingResourceCorrespondence_PhysicalCorrespondenceRepository() {
		return (EReference)powerConsumingResourceCorrespondenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getArchitectureTypeCorrespondence() {
		return architectureTypeCorrespondenceEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getArchitectureTypeCorrespondence_Cactos() {
		return (EReference)architectureTypeCorrespondenceEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getArchitectureTypeCorrespondence_Palladio() {
		return (EReference)architectureTypeCorrespondenceEClass.getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getArchitectureTypeCorrespondence_PhysicalCorrespondenceRepository() {
		return (EReference)architectureTypeCorrespondenceEClass.getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalcorrespondenceFactory getPhysicalcorrespondenceFactory() {
		return (PhysicalcorrespondenceFactory)getEFactoryInstance();
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
		puMeasurementCorrespondenceEClass = createEClass(PU_MEASUREMENT_CORRESPONDENCE);
		createEReference(puMeasurementCorrespondenceEClass, PU_MEASUREMENT_CORRESPONDENCE__CACTOS);
		createEReference(puMeasurementCorrespondenceEClass, PU_MEASUREMENT_CORRESPONDENCE__PHYSICAL_CORRESPONDENCE_REPOSITORY);

		memoryMeasurementCorrespondenceEClass = createEClass(MEMORY_MEASUREMENT_CORRESPONDENCE);
		createEReference(memoryMeasurementCorrespondenceEClass, MEMORY_MEASUREMENT_CORRESPONDENCE__CACTOS);
		createEReference(memoryMeasurementCorrespondenceEClass, MEMORY_MEASUREMENT_CORRESPONDENCE__PHYSICAL_CORRESPONDENCE_REPOSITORY);

		storageMeasurementCorrespondenceEClass = createEClass(STORAGE_MEASUREMENT_CORRESPONDENCE);
		createEReference(storageMeasurementCorrespondenceEClass, STORAGE_MEASUREMENT_CORRESPONDENCE__CACTOS);
		createEReference(storageMeasurementCorrespondenceEClass, STORAGE_MEASUREMENT_CORRESPONDENCE__PHYSICAL_CORRESPONDENCE_REPOSITORY);

		interconnectMeasurementCorrespondenceEClass = createEClass(INTERCONNECT_MEASUREMENT_CORRESPONDENCE);
		createEReference(interconnectMeasurementCorrespondenceEClass, INTERCONNECT_MEASUREMENT_CORRESPONDENCE__CACTOS);
		createEReference(interconnectMeasurementCorrespondenceEClass, INTERCONNECT_MEASUREMENT_CORRESPONDENCE__PHYSICAL_CORRESPONDENCE_REPOSITORY);

		physicalCorrespondenceRepositoryEClass = createEClass(PHYSICAL_CORRESPONDENCE_REPOSITORY);
		createEAttribute(physicalCorrespondenceRepositoryEClass, PHYSICAL_CORRESPONDENCE_REPOSITORY__CORRESPONDENCE_ESTABLISHED);
		createEReference(physicalCorrespondenceRepositoryEClass, PHYSICAL_CORRESPONDENCE_REPOSITORY__PU_MEASUREMENT_CORRESPONDENCES);
		createEReference(physicalCorrespondenceRepositoryEClass, PHYSICAL_CORRESPONDENCE_REPOSITORY__MEMORY_MEASUREMENT_CORRESPONDENCES);
		createEReference(physicalCorrespondenceRepositoryEClass, PHYSICAL_CORRESPONDENCE_REPOSITORY__STORAGE_MEASUREMENT_CORRESPONDENCES);
		createEReference(physicalCorrespondenceRepositoryEClass, PHYSICAL_CORRESPONDENCE_REPOSITORY__INTERCONNECT_MEASUREMENT_CORRESPONDENCES);
		createEReference(physicalCorrespondenceRepositoryEClass, PHYSICAL_CORRESPONDENCE_REPOSITORY__SWITCH_CORRESPONDENCES);
		createEReference(physicalCorrespondenceRepositoryEClass, PHYSICAL_CORRESPONDENCE_REPOSITORY__RACK_CORRESPONDENCES);
		createEReference(physicalCorrespondenceRepositoryEClass, PHYSICAL_CORRESPONDENCE_REPOSITORY__ABSTRACT_NODE_CORRESPONDENCES);
		createEReference(physicalCorrespondenceRepositoryEClass, PHYSICAL_CORRESPONDENCE_REPOSITORY__MEMORY_SPECIFICATION_CORRESPONDENCES);
		createEReference(physicalCorrespondenceRepositoryEClass, PHYSICAL_CORRESPONDENCE_REPOSITORY__STORAGE_SPECIFICATION_CORRESPONDENCES);
		createEReference(physicalCorrespondenceRepositoryEClass, PHYSICAL_CORRESPONDENCE_REPOSITORY__NETWORK_INTERCONNECT_CORRESPONDENCES);
		createEReference(physicalCorrespondenceRepositoryEClass, PHYSICAL_CORRESPONDENCE_REPOSITORY__PROCESSING_UNIT_SPECIFICATION_CORRESPONDENCES);
		createEReference(physicalCorrespondenceRepositoryEClass, PHYSICAL_CORRESPONDENCE_REPOSITORY__PHYSICAL_DC_MODEL);
		createEReference(physicalCorrespondenceRepositoryEClass, PHYSICAL_CORRESPONDENCE_REPOSITORY__PHYSICAL_LOAD_MODEL);
		createEReference(physicalCorrespondenceRepositoryEClass, PHYSICAL_CORRESPONDENCE_REPOSITORY__POWER_CONSUMING_ENTITY_MEASUREMENT_CORRESPONDENCES);
		createEReference(physicalCorrespondenceRepositoryEClass, PHYSICAL_CORRESPONDENCE_REPOSITORY__POWER_PROVIDING_ENTITY_CORRESPONDENCES);
		createEReference(physicalCorrespondenceRepositoryEClass, PHYSICAL_CORRESPONDENCE_REPOSITORY__POWER_CONSUMING_RESOURCE_CORRESPONDENCES);
		createEReference(physicalCorrespondenceRepositoryEClass, PHYSICAL_CORRESPONDENCE_REPOSITORY__ARCHITECTURE_TYPE_CORRESPONDENCES);

		switchCorrespondenceEClass = createEClass(SWITCH_CORRESPONDENCE);
		createEReference(switchCorrespondenceEClass, SWITCH_CORRESPONDENCE__CACTOS);
		createEReference(switchCorrespondenceEClass, SWITCH_CORRESPONDENCE__PALLADIO);
		createEReference(switchCorrespondenceEClass, SWITCH_CORRESPONDENCE__PHYSICAL_CORRESPONDENCE_REPOSITORY);

		rackCorrespondenceEClass = createEClass(RACK_CORRESPONDENCE);
		createEReference(rackCorrespondenceEClass, RACK_CORRESPONDENCE__CACTOS);
		createEReference(rackCorrespondenceEClass, RACK_CORRESPONDENCE__PALLADIO);
		createEReference(rackCorrespondenceEClass, RACK_CORRESPONDENCE__PHYSICAL_CORRESPONDENCE_REPOSITORY);

		abstractNodeCorrespondenceEClass = createEClass(ABSTRACT_NODE_CORRESPONDENCE);
		createEReference(abstractNodeCorrespondenceEClass, ABSTRACT_NODE_CORRESPONDENCE__CACTOS);
		createEReference(abstractNodeCorrespondenceEClass, ABSTRACT_NODE_CORRESPONDENCE__PALLADIO);
		createEReference(abstractNodeCorrespondenceEClass, ABSTRACT_NODE_CORRESPONDENCE__PHYSICAL_CORRESPONDENCE_REPOSITORY);

		memorySpecificationCorrespondenceEClass = createEClass(MEMORY_SPECIFICATION_CORRESPONDENCE);
		createEReference(memorySpecificationCorrespondenceEClass, MEMORY_SPECIFICATION_CORRESPONDENCE__CACTOS);
		createEReference(memorySpecificationCorrespondenceEClass, MEMORY_SPECIFICATION_CORRESPONDENCE__PALLADIO);
		createEReference(memorySpecificationCorrespondenceEClass, MEMORY_SPECIFICATION_CORRESPONDENCE__PHYSICAL_CORRESPONDENCE_REPOSITORY);

		storageSpecificationCorrespondenceEClass = createEClass(STORAGE_SPECIFICATION_CORRESPONDENCE);
		createEReference(storageSpecificationCorrespondenceEClass, STORAGE_SPECIFICATION_CORRESPONDENCE__CACTOS);
		createEReference(storageSpecificationCorrespondenceEClass, STORAGE_SPECIFICATION_CORRESPONDENCE__PALLADIO);
		createEReference(storageSpecificationCorrespondenceEClass, STORAGE_SPECIFICATION_CORRESPONDENCE__PHYSICAL_CORRESPONDENCE_REPOSITORY);

		networkInterconnectCorrespondenceEClass = createEClass(NETWORK_INTERCONNECT_CORRESPONDENCE);
		createEReference(networkInterconnectCorrespondenceEClass, NETWORK_INTERCONNECT_CORRESPONDENCE__CACTOS);
		createEReference(networkInterconnectCorrespondenceEClass, NETWORK_INTERCONNECT_CORRESPONDENCE__PALLADIO);
		createEReference(networkInterconnectCorrespondenceEClass, NETWORK_INTERCONNECT_CORRESPONDENCE__PHYSICAL_CORRESPONDENCE_REPOSITORY);
		createEReference(networkInterconnectCorrespondenceEClass, NETWORK_INTERCONNECT_CORRESPONDENCE__RECONFIGURATION_CONTROLLER);

		processingUnitSpecificationCorrespondenceEClass = createEClass(PROCESSING_UNIT_SPECIFICATION_CORRESPONDENCE);
		createEReference(processingUnitSpecificationCorrespondenceEClass, PROCESSING_UNIT_SPECIFICATION_CORRESPONDENCE__CACTOS);
		createEReference(processingUnitSpecificationCorrespondenceEClass, PROCESSING_UNIT_SPECIFICATION_CORRESPONDENCE__PALLADIO);
		createEReference(processingUnitSpecificationCorrespondenceEClass, PROCESSING_UNIT_SPECIFICATION_CORRESPONDENCE__PHYSICAL_CORRESPONDENCE_REPOSITORY);

		powerConsumingEntityMeasurementCorrespondenceEClass = createEClass(POWER_CONSUMING_ENTITY_MEASUREMENT_CORRESPONDENCE);
		createEReference(powerConsumingEntityMeasurementCorrespondenceEClass, POWER_CONSUMING_ENTITY_MEASUREMENT_CORRESPONDENCE__CACTOS);
		createEReference(powerConsumingEntityMeasurementCorrespondenceEClass, POWER_CONSUMING_ENTITY_MEASUREMENT_CORRESPONDENCE__PHYSICAL_CORRESPONDENCE_REPOSITORY);

		powerProvidingEntityCorrespondenceEClass = createEClass(POWER_PROVIDING_ENTITY_CORRESPONDENCE);
		createEReference(powerProvidingEntityCorrespondenceEClass, POWER_PROVIDING_ENTITY_CORRESPONDENCE__CACTOS);
		createEReference(powerProvidingEntityCorrespondenceEClass, POWER_PROVIDING_ENTITY_CORRESPONDENCE__PALLADIO);
		createEReference(powerProvidingEntityCorrespondenceEClass, POWER_PROVIDING_ENTITY_CORRESPONDENCE__PHYSICAL_CORRESPONDENCE_REPOSITORY);

		powerConsumingResourceCorrespondenceEClass = createEClass(POWER_CONSUMING_RESOURCE_CORRESPONDENCE);
		createEReference(powerConsumingResourceCorrespondenceEClass, POWER_CONSUMING_RESOURCE_CORRESPONDENCE__CACTOS);
		createEReference(powerConsumingResourceCorrespondenceEClass, POWER_CONSUMING_RESOURCE_CORRESPONDENCE__PALLADIO);
		createEReference(powerConsumingResourceCorrespondenceEClass, POWER_CONSUMING_RESOURCE_CORRESPONDENCE__PHYSICAL_CORRESPONDENCE_REPOSITORY);

		architectureTypeCorrespondenceEClass = createEClass(ARCHITECTURE_TYPE_CORRESPONDENCE);
		createEReference(architectureTypeCorrespondenceEClass, ARCHITECTURE_TYPE_CORRESPONDENCE__CACTOS);
		createEReference(architectureTypeCorrespondenceEClass, ARCHITECTURE_TYPE_CORRESPONDENCE__PALLADIO);
		createEReference(architectureTypeCorrespondenceEClass, ARCHITECTURE_TYPE_CORRESPONDENCE__PHYSICAL_CORRESPONDENCE_REPOSITORY);
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
		CorrespondencePackage theCorrespondencePackage = (CorrespondencePackage)EPackage.Registry.INSTANCE.getEPackage(CorrespondencePackage.eNS_URI);
		PhysicalPackageImpl thePhysicalPackage = (PhysicalPackageImpl)EPackage.Registry.INSTANCE.getEPackage(PhysicalPackageImpl.eNS_URI);
		IdentifierPackage theIdentifierPackage = (IdentifierPackage)EPackage.Registry.INSTANCE.getEPackage(IdentifierPackage.eNS_URI);
		CorePackageImpl theCorePackage = (CorePackageImpl)EPackage.Registry.INSTANCE.getEPackage(CorePackageImpl.eNS_URI);
		ResourceenvironmentPackage theResourceenvironmentPackage = (ResourceenvironmentPackage)EPackage.Registry.INSTANCE.getEPackage(ResourceenvironmentPackage.eNS_URI);
		PowerPackageImpl thePowerPackage = (PowerPackageImpl)EPackage.Registry.INSTANCE.getEPackage(PowerPackageImpl.eNS_URI);
		InfrastructurePackage theInfrastructurePackage = (InfrastructurePackage)EPackage.Registry.INSTANCE.getEPackage(InfrastructurePackage.eNS_URI);
		ArchitecturetypePackageImpl theArchitecturetypePackage = (ArchitecturetypePackageImpl)EPackage.Registry.INSTANCE.getEPackage(ArchitecturetypePackageImpl.eNS_URI);
		ResourcetypePackage theResourcetypePackage = (ResourcetypePackage)EPackage.Registry.INSTANCE.getEPackage(ResourcetypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		puMeasurementCorrespondenceEClass.getESuperTypes().add(theCorrespondencePackage.getLoadCorrespondence());
		memoryMeasurementCorrespondenceEClass.getESuperTypes().add(theCorrespondencePackage.getLoadCorrespondence());
		storageMeasurementCorrespondenceEClass.getESuperTypes().add(theCorrespondencePackage.getLoadCorrespondence());
		interconnectMeasurementCorrespondenceEClass.getESuperTypes().add(theCorrespondencePackage.getLoadCorrespondence());
		physicalCorrespondenceRepositoryEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		switchCorrespondenceEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		rackCorrespondenceEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		abstractNodeCorrespondenceEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		memorySpecificationCorrespondenceEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		storageSpecificationCorrespondenceEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		networkInterconnectCorrespondenceEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		processingUnitSpecificationCorrespondenceEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		powerConsumingEntityMeasurementCorrespondenceEClass.getESuperTypes().add(theCorrespondencePackage.getLoadCorrespondence());
		powerProvidingEntityCorrespondenceEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		powerConsumingResourceCorrespondenceEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		architectureTypeCorrespondenceEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());

		// Initialize classes and features; add operations and parameters
		initEClass(puMeasurementCorrespondenceEClass, PuMeasurementCorrespondence.class, "PuMeasurementCorrespondence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPuMeasurementCorrespondence_Cactos(), thePhysicalPackage.getPuMeasurement(), null, "cactos", null, 1, 1, PuMeasurementCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPuMeasurementCorrespondence_PhysicalCorrespondenceRepository(), this.getPhysicalCorrespondenceRepository(), this.getPhysicalCorrespondenceRepository_PuMeasurementCorrespondences(), "physicalCorrespondenceRepository", null, 1, 1, PuMeasurementCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(memoryMeasurementCorrespondenceEClass, MemoryMeasurementCorrespondence.class, "MemoryMeasurementCorrespondence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMemoryMeasurementCorrespondence_Cactos(), thePhysicalPackage.getMemoryMeasurement(), null, "cactos", null, 1, 1, MemoryMeasurementCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMemoryMeasurementCorrespondence_PhysicalCorrespondenceRepository(), this.getPhysicalCorrespondenceRepository(), this.getPhysicalCorrespondenceRepository_MemoryMeasurementCorrespondences(), "physicalCorrespondenceRepository", null, 1, 1, MemoryMeasurementCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(storageMeasurementCorrespondenceEClass, StorageMeasurementCorrespondence.class, "StorageMeasurementCorrespondence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStorageMeasurementCorrespondence_Cactos(), thePhysicalPackage.getStorageMeasurement(), null, "cactos", null, 1, 1, StorageMeasurementCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStorageMeasurementCorrespondence_PhysicalCorrespondenceRepository(), this.getPhysicalCorrespondenceRepository(), this.getPhysicalCorrespondenceRepository_StorageMeasurementCorrespondences(), "physicalCorrespondenceRepository", null, 1, 1, StorageMeasurementCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interconnectMeasurementCorrespondenceEClass, InterconnectMeasurementCorrespondence.class, "InterconnectMeasurementCorrespondence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterconnectMeasurementCorrespondence_Cactos(), thePhysicalPackage.getInterconnectMeasurement(), null, "cactos", null, 1, 1, InterconnectMeasurementCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterconnectMeasurementCorrespondence_PhysicalCorrespondenceRepository(), this.getPhysicalCorrespondenceRepository(), this.getPhysicalCorrespondenceRepository_InterconnectMeasurementCorrespondences(), "physicalCorrespondenceRepository", null, 1, 1, InterconnectMeasurementCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(physicalCorrespondenceRepositoryEClass, PhysicalCorrespondenceRepository.class, "PhysicalCorrespondenceRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPhysicalCorrespondenceRepository_CorrespondenceEstablished(), ecorePackage.getEBoolean(), "correspondenceEstablished", "false", 1, 1, PhysicalCorrespondenceRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalCorrespondenceRepository_PuMeasurementCorrespondences(), this.getPuMeasurementCorrespondence(), this.getPuMeasurementCorrespondence_PhysicalCorrespondenceRepository(), "puMeasurementCorrespondences", null, 0, -1, PhysicalCorrespondenceRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalCorrespondenceRepository_MemoryMeasurementCorrespondences(), this.getMemoryMeasurementCorrespondence(), this.getMemoryMeasurementCorrespondence_PhysicalCorrespondenceRepository(), "memoryMeasurementCorrespondences", null, 0, -1, PhysicalCorrespondenceRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalCorrespondenceRepository_StorageMeasurementCorrespondences(), this.getStorageMeasurementCorrespondence(), this.getStorageMeasurementCorrespondence_PhysicalCorrespondenceRepository(), "storageMeasurementCorrespondences", null, 0, -1, PhysicalCorrespondenceRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalCorrespondenceRepository_InterconnectMeasurementCorrespondences(), this.getInterconnectMeasurementCorrespondence(), this.getInterconnectMeasurementCorrespondence_PhysicalCorrespondenceRepository(), "interconnectMeasurementCorrespondences", null, 0, -1, PhysicalCorrespondenceRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalCorrespondenceRepository_SwitchCorrespondences(), this.getSwitchCorrespondence(), this.getSwitchCorrespondence_PhysicalCorrespondenceRepository(), "switchCorrespondences", null, 0, -1, PhysicalCorrespondenceRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPhysicalCorrespondenceRepository_RackCorrespondences(), this.getRackCorrespondence(), this.getRackCorrespondence_PhysicalCorrespondenceRepository(), "rackCorrespondences", null, 0, -1, PhysicalCorrespondenceRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPhysicalCorrespondenceRepository_AbstractNodeCorrespondences(), this.getAbstractNodeCorrespondence(), this.getAbstractNodeCorrespondence_PhysicalCorrespondenceRepository(), "abstractNodeCorrespondences", null, 0, -1, PhysicalCorrespondenceRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPhysicalCorrespondenceRepository_MemorySpecificationCorrespondences(), this.getMemorySpecificationCorrespondence(), this.getMemorySpecificationCorrespondence_PhysicalCorrespondenceRepository(), "memorySpecificationCorrespondences", null, 0, -1, PhysicalCorrespondenceRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPhysicalCorrespondenceRepository_StorageSpecificationCorrespondences(), this.getStorageSpecificationCorrespondence(), this.getStorageSpecificationCorrespondence_PhysicalCorrespondenceRepository(), "storageSpecificationCorrespondences", null, 0, -1, PhysicalCorrespondenceRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPhysicalCorrespondenceRepository_NetworkInterconnectCorrespondences(), this.getNetworkInterconnectCorrespondence(), this.getNetworkInterconnectCorrespondence_PhysicalCorrespondenceRepository(), "networkInterconnectCorrespondences", null, 0, -1, PhysicalCorrespondenceRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPhysicalCorrespondenceRepository_ProcessingUnitSpecificationCorrespondences(), this.getProcessingUnitSpecificationCorrespondence(), this.getProcessingUnitSpecificationCorrespondence_PhysicalCorrespondenceRepository(), "processingUnitSpecificationCorrespondences", null, 0, -1, PhysicalCorrespondenceRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPhysicalCorrespondenceRepository_PhysicalDcModel(), theCorePackage.getPhysicalDCModel(), null, "physicalDcModel", null, 1, 1, PhysicalCorrespondenceRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalCorrespondenceRepository_PhysicalLoadModel(), thePhysicalPackage.getPhysicalLoadModel(), null, "physicalLoadModel", null, 1, 1, PhysicalCorrespondenceRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalCorrespondenceRepository_PowerConsumingEntityMeasurementCorrespondences(), this.getPowerConsumingEntityMeasurementCorrespondence(), this.getPowerConsumingEntityMeasurementCorrespondence_PhysicalCorrespondenceRepository(), "powerConsumingEntityMeasurementCorrespondences", null, 0, -1, PhysicalCorrespondenceRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalCorrespondenceRepository_PowerProvidingEntityCorrespondences(), this.getPowerProvidingEntityCorrespondence(), this.getPowerProvidingEntityCorrespondence_PhysicalCorrespondenceRepository(), "powerProvidingEntityCorrespondences", null, 0, -1, PhysicalCorrespondenceRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalCorrespondenceRepository_PowerConsumingResourceCorrespondences(), this.getPowerConsumingResourceCorrespondence(), this.getPowerConsumingResourceCorrespondence_PhysicalCorrespondenceRepository(), "powerConsumingResourceCorrespondences", null, 0, -1, PhysicalCorrespondenceRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalCorrespondenceRepository_ArchitectureTypeCorrespondences(), this.getArchitectureTypeCorrespondence(), this.getArchitectureTypeCorrespondence_PhysicalCorrespondenceRepository(), "architectureTypeCorrespondences", null, 0, -1, PhysicalCorrespondenceRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(switchCorrespondenceEClass, SwitchCorrespondence.class, "SwitchCorrespondence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSwitchCorrespondence_Cactos(), theCorePackage.getSwitch(), null, "cactos", null, 1, 1, SwitchCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSwitchCorrespondence_Palladio(), theResourceenvironmentPackage.getLinkingResource(), null, "palladio", null, 1, 1, SwitchCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSwitchCorrespondence_PhysicalCorrespondenceRepository(), this.getPhysicalCorrespondenceRepository(), this.getPhysicalCorrespondenceRepository_SwitchCorrespondences(), "physicalCorrespondenceRepository", null, 1, 1, SwitchCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rackCorrespondenceEClass, RackCorrespondence.class, "RackCorrespondence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRackCorrespondence_Cactos(), theCorePackage.getRack(), null, "cactos", null, 1, 1, RackCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRackCorrespondence_Palladio(), theResourceenvironmentPackage.getResourceContainer(), null, "palladio", null, 1, -1, RackCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRackCorrespondence_PhysicalCorrespondenceRepository(), this.getPhysicalCorrespondenceRepository(), this.getPhysicalCorrespondenceRepository_RackCorrespondences(), "physicalCorrespondenceRepository", null, 1, 1, RackCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractNodeCorrespondenceEClass, AbstractNodeCorrespondence.class, "AbstractNodeCorrespondence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractNodeCorrespondence_Cactos(), theCorePackage.getAbstractNode(), null, "cactos", null, 1, 1, AbstractNodeCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractNodeCorrespondence_Palladio(), theResourceenvironmentPackage.getResourceContainer(), null, "palladio", null, 1, 1, AbstractNodeCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractNodeCorrespondence_PhysicalCorrespondenceRepository(), this.getPhysicalCorrespondenceRepository(), this.getPhysicalCorrespondenceRepository_AbstractNodeCorrespondences(), "physicalCorrespondenceRepository", null, 1, 1, AbstractNodeCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(memorySpecificationCorrespondenceEClass, MemorySpecificationCorrespondence.class, "MemorySpecificationCorrespondence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMemorySpecificationCorrespondence_Cactos(), theCorePackage.getMemorySpecification(), null, "cactos", null, 1, 1, MemorySpecificationCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMemorySpecificationCorrespondence_Palladio(), theResourceenvironmentPackage.getProcessingResourceSpecification(), null, "palladio", null, 1, 1, MemorySpecificationCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMemorySpecificationCorrespondence_PhysicalCorrespondenceRepository(), this.getPhysicalCorrespondenceRepository(), this.getPhysicalCorrespondenceRepository_MemorySpecificationCorrespondences(), "physicalCorrespondenceRepository", null, 1, 1, MemorySpecificationCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(storageSpecificationCorrespondenceEClass, StorageSpecificationCorrespondence.class, "StorageSpecificationCorrespondence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStorageSpecificationCorrespondence_Cactos(), theCorePackage.getStorageSpecification(), null, "cactos", null, 1, 1, StorageSpecificationCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStorageSpecificationCorrespondence_Palladio(), theResourceenvironmentPackage.getProcessingResourceSpecification(), null, "palladio", null, 1, 1, StorageSpecificationCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStorageSpecificationCorrespondence_PhysicalCorrespondenceRepository(), this.getPhysicalCorrespondenceRepository(), this.getPhysicalCorrespondenceRepository_StorageSpecificationCorrespondences(), "physicalCorrespondenceRepository", null, 1, 1, StorageSpecificationCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(networkInterconnectCorrespondenceEClass, NetworkInterconnectCorrespondence.class, "NetworkInterconnectCorrespondence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNetworkInterconnectCorrespondence_Cactos(), theCorePackage.getNetworkInterconnect(), null, "cactos", null, 1, -1, NetworkInterconnectCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNetworkInterconnectCorrespondence_Palladio(), theResourceenvironmentPackage.getLinkingResource(), null, "palladio", null, 1, 1, NetworkInterconnectCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNetworkInterconnectCorrespondence_PhysicalCorrespondenceRepository(), this.getPhysicalCorrespondenceRepository(), this.getPhysicalCorrespondenceRepository_NetworkInterconnectCorrespondences(), "physicalCorrespondenceRepository", null, 1, 1, NetworkInterconnectCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNetworkInterconnectCorrespondence_ReconfigurationController(), theResourceenvironmentPackage.getResourceContainer(), null, "reconfigurationController", null, 0, 1, NetworkInterconnectCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processingUnitSpecificationCorrespondenceEClass, ProcessingUnitSpecificationCorrespondence.class, "ProcessingUnitSpecificationCorrespondence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcessingUnitSpecificationCorrespondence_Cactos(), theCorePackage.getProcessingUnitSpecification(), null, "cactos", null, 1, 1, ProcessingUnitSpecificationCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessingUnitSpecificationCorrespondence_Palladio(), theResourceenvironmentPackage.getProcessingResourceSpecification(), null, "palladio", null, 1, 1, ProcessingUnitSpecificationCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessingUnitSpecificationCorrespondence_PhysicalCorrespondenceRepository(), this.getPhysicalCorrespondenceRepository(), this.getPhysicalCorrespondenceRepository_ProcessingUnitSpecificationCorrespondences(), "physicalCorrespondenceRepository", null, 1, 1, ProcessingUnitSpecificationCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(powerConsumingEntityMeasurementCorrespondenceEClass, PowerConsumingEntityMeasurementCorrespondence.class, "PowerConsumingEntityMeasurementCorrespondence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPowerConsumingEntityMeasurementCorrespondence_Cactos(), thePhysicalPackage.getPowerConsumingEntityMeasurement(), null, "cactos", null, 1, 1, PowerConsumingEntityMeasurementCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPowerConsumingEntityMeasurementCorrespondence_PhysicalCorrespondenceRepository(), this.getPhysicalCorrespondenceRepository(), this.getPhysicalCorrespondenceRepository_PowerConsumingEntityMeasurementCorrespondences(), "physicalCorrespondenceRepository", null, 1, 1, PowerConsumingEntityMeasurementCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(powerProvidingEntityCorrespondenceEClass, PowerProvidingEntityCorrespondence.class, "PowerProvidingEntityCorrespondence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPowerProvidingEntityCorrespondence_Cactos(), thePowerPackage.getPowerProvidingEntity(), null, "cactos", null, 1, 1, PowerProvidingEntityCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPowerProvidingEntityCorrespondence_Palladio(), theInfrastructurePackage.getPowerProvidingEntity(), null, "palladio", null, 1, 1, PowerProvidingEntityCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPowerProvidingEntityCorrespondence_PhysicalCorrespondenceRepository(), this.getPhysicalCorrespondenceRepository(), this.getPhysicalCorrespondenceRepository_PowerProvidingEntityCorrespondences(), "physicalCorrespondenceRepository", null, 1, 1, PowerProvidingEntityCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(powerConsumingResourceCorrespondenceEClass, PowerConsumingResourceCorrespondence.class, "PowerConsumingResourceCorrespondence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPowerConsumingResourceCorrespondence_Cactos(), thePowerPackage.getPowerConsumingEntity(), null, "cactos", null, 1, 1, PowerConsumingResourceCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPowerConsumingResourceCorrespondence_Palladio(), theInfrastructurePackage.getStatefulPowerConsumingResource(), null, "palladio", null, 1, 1, PowerConsumingResourceCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPowerConsumingResourceCorrespondence_PhysicalCorrespondenceRepository(), this.getPhysicalCorrespondenceRepository(), this.getPhysicalCorrespondenceRepository_PowerConsumingResourceCorrespondences(), "physicalCorrespondenceRepository", null, 1, 1, PowerConsumingResourceCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(architectureTypeCorrespondenceEClass, ArchitectureTypeCorrespondence.class, "ArchitectureTypeCorrespondence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArchitectureTypeCorrespondence_Cactos(), theArchitecturetypePackage.getArchitectureType(), null, "cactos", null, 1, 1, ArchitectureTypeCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArchitectureTypeCorrespondence_Palladio(), theResourcetypePackage.getProcessingResourceType(), null, "palladio", null, 1, 1, ArchitectureTypeCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArchitectureTypeCorrespondence_PhysicalCorrespondenceRepository(), this.getPhysicalCorrespondenceRepository(), this.getPhysicalCorrespondenceRepository_ArchitectureTypeCorrespondences(), "physicalCorrespondenceRepository", null, 1, 1, ArchitectureTypeCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //PhysicalcorrespondencePackageImpl
