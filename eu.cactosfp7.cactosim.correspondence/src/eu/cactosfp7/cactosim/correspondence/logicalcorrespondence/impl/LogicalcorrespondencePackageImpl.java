/**
 */
package eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl;

import de.fzi.power.binding.BindingPackage;
import de.fzi.power.infrastructure.InfrastructurePackage;
import de.fzi.power.specification.SpecificationPackage;
import de.fzi.power.util.UtilPackage;
import eu.cactosfp7.cactosim.correspondence.CorrespondencePackage;

import eu.cactosfp7.cactosim.correspondence.impl.CorrespondencePackageImpl;

import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ApplicationProvidedServiceCorrespondence;
import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ArrivalRateMeasurementCorrespondence;
import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.HypervisorCorrespondence;
import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalCorrespondenceRepository;
import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalDiskReadMeasurementCorrespondence;
import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalDiskWriteMeasurementCorrespondence;
import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalcorrespondenceFactory;
import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalcorrespondencePackage;
import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.NetworkAttachedStorageCorrespondence;
import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.OptimisationPlanCorrespondence;
import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ProvidedServiceCorrespondence;
import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.RequestArrivalRateMeasurementCorrespondence;
import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.RequiredServiceCorrespondence;
import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ResponseArrivalRateMeasurementCorrespondence;
import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ScalableVMImageConnectorCorrespondence;
import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ServiceInstanceArrivalRateMeasurementCorrespondence;
import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ServiceOperationCorrespondence;
import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ServiceOperationInstanceArrivalRateMeasurementCorrespondence;
import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.UserBehaviourCorrespondence;
import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VMImageCorrespondence;
import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VMImageInstanceCorrespondence;
import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VirtualMachineCorrespondence;
import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VirtualMemoryMeasurementCorrespondence;
import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VirtualNetworkInterconnectCorrespondence;
import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VirtualNetworkInterconnectMeasurementCorrespondence;
import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VirtualProcessingUnitMeasurementCorrespondence;
import eu.cactosfp7.cactosim.correspondence.measurementcorrespondence.MeasurementcorrespondencePackage;
import eu.cactosfp7.cactosim.correspondence.measurementcorrespondence.impl.MeasurementcorrespondencePackageImpl;
import eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalcorrespondencePackage;

import eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.PhysicalcorrespondencePackageImpl;

import eu.cactosfp7.identifier.IdentifierPackage;

import eu.cactosfp7.infrastructuremodels.load.logical.impl.LogicalPackageImpl;

import eu.cactosfp7.infrastructuremodels.load.physical.impl.PhysicalPackageImpl;
import eu.cactosfp7.infrastructuremodels.logicaldc.application.impl.ApplicationPackageImpl;
import eu.cactosfp7.infrastructuremodels.physicaldc.core.impl.CorePackageImpl;
import eu.cactosfp7.optimisationplan.OptimisationplanPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.palladiosimulator.pcm.allocation.AllocationPackage;

import org.palladiosimulator.pcm.core.composition.CompositionPackage;

import org.palladiosimulator.pcm.repository.RepositoryPackage;

import org.palladiosimulator.pcm.resourceenvironment.ResourceenvironmentPackage;

import org.palladiosimulator.runtimemeasurement.RuntimeMeasurementPackage;
import org.scaledl.usageevolution.UsageevolutionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LogicalcorrespondencePackageImpl extends EPackageImpl implements LogicalcorrespondencePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass virtualMemoryMeasurementCorrespondenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass virtualNetworkInterconnectMeasurementCorrespondenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass virtualProcessingUnitMeasurementCorrespondenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass logicalDiskReadMeasurementCorrespondenceEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass logicalDiskWriteMeasurementCorrespondenceEClass = null;

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicalCorrespondenceRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vmImageInstanceCorrespondenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vmImageCorrespondenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass virtualNetworkInterconnectCorrespondenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass virtualMachineCorrespondenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass hypervisorCorrespondenceEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass networkAttachedStorageCorrespondenceEClass = null;

    /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        private EClass optimisationPlanCorrespondenceEClass = null;

/**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        private EClass providedServiceCorrespondenceEClass = null;

/**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        private EClass requiredServiceCorrespondenceEClass = null;

/**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        private EClass scalableVMImageConnectorCorrespondenceEClass = null;

/**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        private EClass userBehaviourCorrespondenceEClass = null;

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requestArrivalRateMeasurementCorrespondenceEClass = null;

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass responseArrivalRateMeasurementCorrespondenceEClass = null;

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceInstanceArrivalRateMeasurementCorrespondenceEClass = null;

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceOperationInstanceArrivalRateMeasurementCorrespondenceEClass = null;

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrivalRateMeasurementCorrespondenceEClass = null;

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceOperationCorrespondenceEClass = null;

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationProvidedServiceCorrespondenceEClass = null;

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
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalcorrespondencePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LogicalcorrespondencePackageImpl() {
		super(eNS_URI, LogicalcorrespondenceFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link LogicalcorrespondencePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LogicalcorrespondencePackage init() {
		if (isInited) return (LogicalcorrespondencePackage)EPackage.Registry.INSTANCE.getEPackage(LogicalcorrespondencePackage.eNS_URI);

		// Obtain or create and register package
		LogicalcorrespondencePackageImpl theLogicalcorrespondencePackage = (LogicalcorrespondencePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof LogicalcorrespondencePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new LogicalcorrespondencePackageImpl());

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
		MeasurementcorrespondencePackageImpl theMeasurementcorrespondencePackage = (MeasurementcorrespondencePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MeasurementcorrespondencePackage.eNS_URI) instanceof MeasurementcorrespondencePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MeasurementcorrespondencePackage.eNS_URI) : MeasurementcorrespondencePackage.eINSTANCE);

		// Create package meta-data objects
		theLogicalcorrespondencePackage.createPackageContents();
		theCorrespondencePackage.createPackageContents();
		thePhysicalcorrespondencePackage.createPackageContents();
		theMeasurementcorrespondencePackage.createPackageContents();

		// Initialize created meta-data
		theLogicalcorrespondencePackage.initializePackageContents();
		theCorrespondencePackage.initializePackageContents();
		thePhysicalcorrespondencePackage.initializePackageContents();
		theMeasurementcorrespondencePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theLogicalcorrespondencePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LogicalcorrespondencePackage.eNS_URI, theLogicalcorrespondencePackage);
		return theLogicalcorrespondencePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVirtualMemoryMeasurementCorrespondence() {
		return virtualMemoryMeasurementCorrespondenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVirtualMemoryMeasurementCorrespondence_Cactos() {
		return (EReference)virtualMemoryMeasurementCorrespondenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVirtualMemoryMeasurementCorrespondence_LogicalCorrespondenceRepository() {
		return (EReference)virtualMemoryMeasurementCorrespondenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVirtualNetworkInterconnectMeasurementCorrespondence() {
		return virtualNetworkInterconnectMeasurementCorrespondenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVirtualNetworkInterconnectMeasurementCorrespondence_Cactos() {
		return (EReference)virtualNetworkInterconnectMeasurementCorrespondenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVirtualNetworkInterconnectMeasurementCorrespondence_LogicalCorrespondenceRepository() {
		return (EReference)virtualNetworkInterconnectMeasurementCorrespondenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVirtualProcessingUnitMeasurementCorrespondence() {
		return virtualProcessingUnitMeasurementCorrespondenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVirtualProcessingUnitMeasurementCorrespondence_Cactos() {
		return (EReference)virtualProcessingUnitMeasurementCorrespondenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVirtualProcessingUnitMeasurementCorrespondence_LogicalCorrespondenceRepository() {
		return (EReference)virtualProcessingUnitMeasurementCorrespondenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getLogicalDiskReadMeasurementCorrespondence() {
		return logicalDiskReadMeasurementCorrespondenceEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getLogicalDiskReadMeasurementCorrespondence_Cactos() {
		return (EReference)logicalDiskReadMeasurementCorrespondenceEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getLogicalDiskReadMeasurementCorrespondence_LogicalCorrespondenceRepository() {
		return (EReference)logicalDiskReadMeasurementCorrespondenceEClass.getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getLogicalDiskWriteMeasurementCorrespondence() {
		return logicalDiskWriteMeasurementCorrespondenceEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getLogicalDiskWriteMeasurementCorrespondence_Cactos() {
		return (EReference)logicalDiskWriteMeasurementCorrespondenceEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getLogicalDiskWriteMeasurementCorrespondence_LogicalCorrespondenceRepository() {
		return (EReference)logicalDiskWriteMeasurementCorrespondenceEClass.getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogicalCorrespondenceRepository() {
		return logicalCorrespondenceRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicalCorrespondenceRepository_VirtualMemoryMeasurementCorrespondences() {
		return (EReference)logicalCorrespondenceRepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicalCorrespondenceRepository_VirtualNetworkInterconnectMeasurementCorrespondences() {
		return (EReference)logicalCorrespondenceRepositoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicalCorrespondenceRepository_VirtualProcessingUnitMeasurementCorrespondences() {
		return (EReference)logicalCorrespondenceRepositoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicalCorrespondenceRepository_VolumeMeasurementCorrespondences() {
		return (EReference)logicalCorrespondenceRepositoryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicalCorrespondenceRepository_VirtualNetworkInterconnects() {
		return (EReference)logicalCorrespondenceRepositoryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicalCorrespondenceRepository_VmImageCorrespondences() {
		return (EReference)logicalCorrespondenceRepositoryEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicalCorrespondenceRepository_VmImageInstanceCorrespondences() {
		return (EReference)logicalCorrespondenceRepositoryEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicalCorrespondenceRepository_VirtualMachineCorrespondences() {
		return (EReference)logicalCorrespondenceRepositoryEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getLogicalCorrespondenceRepository_HypervisorCorrespondences() {
		return (EReference)logicalCorrespondenceRepositoryEClass.getEStructuralFeatures().get(8);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getLogicalCorrespondenceRepository_NetworkAttachedStorageCorrespondences() {
		return (EReference)logicalCorrespondenceRepositoryEClass.getEStructuralFeatures().get(9);
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicalCorrespondenceRepository_LogicalDcModel() {
		return (EReference)logicalCorrespondenceRepositoryEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicalCorrespondenceRepository_LogicalLoadModel() {
		return (EReference)logicalCorrespondenceRepositoryEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogicalCorrespondenceRepository_CorrespondenceEstablished() {
		return (EAttribute)logicalCorrespondenceRepositoryEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EReference getLogicalCorrespondenceRepository_OptimisationPlanCorrespondence() {
		return (EReference)logicalCorrespondenceRepositoryEClass.getEStructuralFeatures().get(13);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EReference getLogicalCorrespondenceRepository_ProvidedServiceCorrespondences() {
		return (EReference)logicalCorrespondenceRepositoryEClass.getEStructuralFeatures().get(14);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EReference getLogicalCorrespondenceRepository_RequiredServiceCorrespondences() {
		return (EReference)logicalCorrespondenceRepositoryEClass.getEStructuralFeatures().get(15);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EReference getLogicalCorrespondenceRepository_ScalableConnectorCorrespondences() {
		return (EReference)logicalCorrespondenceRepositoryEClass.getEStructuralFeatures().get(16);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EReference getLogicalCorrespondenceRepository_UserBehaviourCorrespondences() {
		return (EReference)logicalCorrespondenceRepositoryEClass.getEStructuralFeatures().get(17);
	}

        /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicalCorrespondenceRepository_ArrivalRateMeasurementCorrespondences() {
		return (EReference)logicalCorrespondenceRepositoryEClass.getEStructuralFeatures().get(18);
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicalCorrespondenceRepository_ServiceOperationCorrespondences() {
		return (EReference)logicalCorrespondenceRepositoryEClass.getEStructuralFeatures().get(19);
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicalCorrespondenceRepository_ApplicationProvidedServiceCorrespondences() {
		return (EReference)logicalCorrespondenceRepositoryEClass.getEStructuralFeatures().get(20);
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVMImageInstanceCorrespondence() {
		return vmImageInstanceCorrespondenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVMImageInstanceCorrespondence_Cactos() {
		return (EReference)vmImageInstanceCorrespondenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVMImageInstanceCorrespondence_Palladio() {
		return (EReference)vmImageInstanceCorrespondenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVMImageInstanceCorrespondence_LogicalCorrespondenceRepository() {
		return (EReference)vmImageInstanceCorrespondenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVMImageCorrespondence() {
		return vmImageCorrespondenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVMImageCorrespondence_Cactos() {
		return (EReference)vmImageCorrespondenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVMImageCorrespondence_Palladio() {
		return (EReference)vmImageCorrespondenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVMImageCorrespondence_LogicalCorrespondenceRepository() {
		return (EReference)vmImageCorrespondenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVirtualNetworkInterconnectCorrespondence() {
		return virtualNetworkInterconnectCorrespondenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVirtualNetworkInterconnectCorrespondence_Cactos() {
		return (EReference)virtualNetworkInterconnectCorrespondenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVirtualNetworkInterconnectCorrespondence_Palladio() {
		return (EReference)virtualNetworkInterconnectCorrespondenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVirtualNetworkInterconnectCorrespondence_LogicalCorrespondenceRepository() {
		return (EReference)virtualNetworkInterconnectCorrespondenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVirtualMachineCorrespondence() {
		return virtualMachineCorrespondenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVirtualMachineCorrespondence_Cactos() {
		return (EReference)virtualMachineCorrespondenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVirtualMachineCorrespondence_Palladio() {
		return (EReference)virtualMachineCorrespondenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVirtualMachineCorrespondence_LogicalCorrespondenceRepository() {
		return (EReference)virtualMachineCorrespondenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getVirtualMachineCorrespondence_PalladioStorageConnector() {
		return (EReference)virtualMachineCorrespondenceEClass.getEStructuralFeatures().get(3);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getVirtualMachineCorrespondence_PalladioUsage() {
		return (EReference)virtualMachineCorrespondenceEClass.getEStructuralFeatures().get(4);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getHypervisorCorrespondence() {
		return hypervisorCorrespondenceEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getHypervisorCorrespondence_Cactos() {
		return (EReference)hypervisorCorrespondenceEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getHypervisorCorrespondence_Palladio() {
		return (EReference)hypervisorCorrespondenceEClass.getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getHypervisorCorrespondence_LogicalCorrespondenceRepository() {
		return (EReference)hypervisorCorrespondenceEClass.getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getNetworkAttachedStorageCorrespondence() {
		return networkAttachedStorageCorrespondenceEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getNetworkAttachedStorageCorrespondence_Cactos() {
		return (EReference)networkAttachedStorageCorrespondenceEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getNetworkAttachedStorageCorrespondence_Palladio() {
		return (EReference)networkAttachedStorageCorrespondenceEClass.getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getNetworkAttachedStorageCorrespondence_LogicalCorrespondenceRepository() {
		return (EReference)networkAttachedStorageCorrespondenceEClass.getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EClass getOptimisationPlanCorrespondence() {
		return optimisationPlanCorrespondenceEClass;
	}

/**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EReference getOptimisationPlanCorrespondence_LastOptimisationPlan() {
		return (EReference)optimisationPlanCorrespondenceEClass.getEStructuralFeatures().get(0);
	}

/**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EReference getOptimisationPlanCorrespondence_LogicalCorrespondenceRepository() {
		return (EReference)optimisationPlanCorrespondenceEClass.getEStructuralFeatures().get(1);
	}

/**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EClass getProvidedServiceCorrespondence() {
		return providedServiceCorrespondenceEClass;
	}

/**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EReference getProvidedServiceCorrespondence_CactosRole() {
		return (EReference)providedServiceCorrespondenceEClass.getEStructuralFeatures().get(0);
	}

/**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EReference getProvidedServiceCorrespondence_CactosVM() {
		return (EReference)providedServiceCorrespondenceEClass.getEStructuralFeatures().get(1);
	}

/**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EReference getProvidedServiceCorrespondence_PalladioRole() {
		return (EReference)providedServiceCorrespondenceEClass.getEStructuralFeatures().get(2);
	}

/**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EReference getProvidedServiceCorrespondence_LogicalCorrespondenceRepository() {
		return (EReference)providedServiceCorrespondenceEClass.getEStructuralFeatures().get(3);
	}

/**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EClass getRequiredServiceCorrespondence() {
		return requiredServiceCorrespondenceEClass;
	}

/**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EReference getRequiredServiceCorrespondence_CactosRole() {
		return (EReference)requiredServiceCorrespondenceEClass.getEStructuralFeatures().get(0);
	}

/**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EReference getRequiredServiceCorrespondence_CactosVM() {
		return (EReference)requiredServiceCorrespondenceEClass.getEStructuralFeatures().get(1);
	}

/**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EReference getRequiredServiceCorrespondence_PalladioRole() {
		return (EReference)requiredServiceCorrespondenceEClass.getEStructuralFeatures().get(2);
	}

/**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EReference getRequiredServiceCorrespondence_LogicalCorrespondenceRepository() {
		return (EReference)requiredServiceCorrespondenceEClass.getEStructuralFeatures().get(3);
	}

/**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EClass getScalableVMImageConnectorCorrespondence() {
		return scalableVMImageConnectorCorrespondenceEClass;
	}

/**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EReference getScalableVMImageConnectorCorrespondence_CactosConnector() {
		return (EReference)scalableVMImageConnectorCorrespondenceEClass.getEStructuralFeatures().get(1);
	}

/**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EReference getScalableVMImageConnectorCorrespondence_Palladio() {
		return (EReference)scalableVMImageConnectorCorrespondenceEClass.getEStructuralFeatures().get(2);
	}

/**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EReference getScalableVMImageConnectorCorrespondence_LogicalCorrespondenceRepository() {
		return (EReference)scalableVMImageConnectorCorrespondenceEClass.getEStructuralFeatures().get(3);
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScalableVMImageConnectorCorrespondence_MaximumInstanceNumber() {
		return (EAttribute)scalableVMImageConnectorCorrespondenceEClass.getEStructuralFeatures().get(4);
	}

/**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EReference getScalableVMImageConnectorCorrespondence_CactosApplicationInstance() {
		return (EReference)scalableVMImageConnectorCorrespondenceEClass.getEStructuralFeatures().get(0);
	}

/**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EClass getUserBehaviourCorrespondence() {
		return userBehaviourCorrespondenceEClass;
	}

/**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EReference getUserBehaviourCorrespondence_LogicalCorrespondenceRepository() {
		return (EReference)userBehaviourCorrespondenceEClass.getEStructuralFeatures().get(0);
	}

/**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EReference getUserBehaviourCorrespondence_CactosUserBehaviour() {
		return (EReference)userBehaviourCorrespondenceEClass.getEStructuralFeatures().get(1);
	}

/**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EReference getUserBehaviourCorrespondence_PalladioUsage() {
		return (EReference)userBehaviourCorrespondenceEClass.getEStructuralFeatures().get(2);
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequestArrivalRateMeasurementCorrespondence() {
		return requestArrivalRateMeasurementCorrespondenceEClass;
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequestArrivalRateMeasurementCorrespondence_RequestArrivalRateMeasurement() {
		return (EReference)requestArrivalRateMeasurementCorrespondenceEClass.getEStructuralFeatures().get(0);
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResponseArrivalRateMeasurementCorrespondence() {
		return responseArrivalRateMeasurementCorrespondenceEClass;
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponseArrivalRateMeasurementCorrespondence_ResponseArrivalRateMeasurement() {
		return (EReference)responseArrivalRateMeasurementCorrespondenceEClass.getEStructuralFeatures().get(0);
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceInstanceArrivalRateMeasurementCorrespondence() {
		return serviceInstanceArrivalRateMeasurementCorrespondenceEClass;
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceInstanceArrivalRateMeasurementCorrespondence_ArrivalRateMeasurementCorrespondence() {
		return (EReference)serviceInstanceArrivalRateMeasurementCorrespondenceEClass.getEStructuralFeatures().get(0);
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceInstanceArrivalRateMeasurementCorrespondence_CactosServiceCorrespondence() {
		return (EReference)serviceInstanceArrivalRateMeasurementCorrespondenceEClass.getEStructuralFeatures().get(1);
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceInstanceArrivalRateMeasurementCorrespondence_ServiceOperationInstanceCorrespondence() {
		return (EReference)serviceInstanceArrivalRateMeasurementCorrespondenceEClass.getEStructuralFeatures().get(2);
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceOperationInstanceArrivalRateMeasurementCorrespondence() {
		return serviceOperationInstanceArrivalRateMeasurementCorrespondenceEClass;
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceOperationInstanceArrivalRateMeasurementCorrespondence_ServiceInstanceArrivalRateMeasurementCorrespondence() {
		return (EReference)serviceOperationInstanceArrivalRateMeasurementCorrespondenceEClass.getEStructuralFeatures().get(0);
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceOperationInstanceArrivalRateMeasurementCorrespondence_CactosServiceOperation() {
		return (EReference)serviceOperationInstanceArrivalRateMeasurementCorrespondenceEClass.getEStructuralFeatures().get(1);
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArrivalRateMeasurementCorrespondence() {
		return arrivalRateMeasurementCorrespondenceEClass;
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrivalRateMeasurementCorrespondence_ServiceInstanceMeasurementCorrespondences() {
		return (EReference)arrivalRateMeasurementCorrespondenceEClass.getEStructuralFeatures().get(0);
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrivalRateMeasurementCorrespondence_LogicalCorrespondenceRepository() {
		return (EReference)arrivalRateMeasurementCorrespondenceEClass.getEStructuralFeatures().get(1);
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceOperationCorrespondence() {
		return serviceOperationCorrespondenceEClass;
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceOperationCorrespondence_LogicalCorrespondenceRepository() {
		return (EReference)serviceOperationCorrespondenceEClass.getEStructuralFeatures().get(0);
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceOperationCorrespondence_Cactos() {
		return (EReference)serviceOperationCorrespondenceEClass.getEStructuralFeatures().get(1);
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceOperationCorrespondence_Palladio() {
		return (EReference)serviceOperationCorrespondenceEClass.getEStructuralFeatures().get(2);
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplicationProvidedServiceCorrespondence() {
		return applicationProvidedServiceCorrespondenceEClass;
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplicationProvidedServiceCorrespondence_CactosApplication() {
		return (EReference)applicationProvidedServiceCorrespondenceEClass.getEStructuralFeatures().get(0);
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplicationProvidedServiceCorrespondence_PalladioSystemRole() {
		return (EReference)applicationProvidedServiceCorrespondenceEClass.getEStructuralFeatures().get(1);
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplicationProvidedServiceCorrespondence_CactosRole() {
		return (EReference)applicationProvidedServiceCorrespondenceEClass.getEStructuralFeatures().get(2);
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplicationProvidedServiceCorrespondence_LogicalCorrespondenceRepository() {
		return (EReference)applicationProvidedServiceCorrespondenceEClass.getEStructuralFeatures().get(3);
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalcorrespondenceFactory getLogicalcorrespondenceFactory() {
		return (LogicalcorrespondenceFactory)getEFactoryInstance();
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
		virtualMemoryMeasurementCorrespondenceEClass = createEClass(VIRTUAL_MEMORY_MEASUREMENT_CORRESPONDENCE);
		createEReference(virtualMemoryMeasurementCorrespondenceEClass, VIRTUAL_MEMORY_MEASUREMENT_CORRESPONDENCE__CACTOS);
		createEReference(virtualMemoryMeasurementCorrespondenceEClass, VIRTUAL_MEMORY_MEASUREMENT_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY);

		virtualNetworkInterconnectMeasurementCorrespondenceEClass = createEClass(VIRTUAL_NETWORK_INTERCONNECT_MEASUREMENT_CORRESPONDENCE);
		createEReference(virtualNetworkInterconnectMeasurementCorrespondenceEClass, VIRTUAL_NETWORK_INTERCONNECT_MEASUREMENT_CORRESPONDENCE__CACTOS);
		createEReference(virtualNetworkInterconnectMeasurementCorrespondenceEClass, VIRTUAL_NETWORK_INTERCONNECT_MEASUREMENT_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY);

		virtualProcessingUnitMeasurementCorrespondenceEClass = createEClass(VIRTUAL_PROCESSING_UNIT_MEASUREMENT_CORRESPONDENCE);
		createEReference(virtualProcessingUnitMeasurementCorrespondenceEClass, VIRTUAL_PROCESSING_UNIT_MEASUREMENT_CORRESPONDENCE__CACTOS);
		createEReference(virtualProcessingUnitMeasurementCorrespondenceEClass, VIRTUAL_PROCESSING_UNIT_MEASUREMENT_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY);

		logicalDiskReadMeasurementCorrespondenceEClass = createEClass(LOGICAL_DISK_READ_MEASUREMENT_CORRESPONDENCE);
		createEReference(logicalDiskReadMeasurementCorrespondenceEClass, LOGICAL_DISK_READ_MEASUREMENT_CORRESPONDENCE__CACTOS);
		createEReference(logicalDiskReadMeasurementCorrespondenceEClass, LOGICAL_DISK_READ_MEASUREMENT_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY);

		logicalDiskWriteMeasurementCorrespondenceEClass = createEClass(LOGICAL_DISK_WRITE_MEASUREMENT_CORRESPONDENCE);
		createEReference(logicalDiskWriteMeasurementCorrespondenceEClass, LOGICAL_DISK_WRITE_MEASUREMENT_CORRESPONDENCE__CACTOS);
		createEReference(logicalDiskWriteMeasurementCorrespondenceEClass, LOGICAL_DISK_WRITE_MEASUREMENT_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY);

		logicalCorrespondenceRepositoryEClass = createEClass(LOGICAL_CORRESPONDENCE_REPOSITORY);
		createEReference(logicalCorrespondenceRepositoryEClass, LOGICAL_CORRESPONDENCE_REPOSITORY__VIRTUAL_MEMORY_MEASUREMENT_CORRESPONDENCES);
		createEReference(logicalCorrespondenceRepositoryEClass, LOGICAL_CORRESPONDENCE_REPOSITORY__VIRTUAL_NETWORK_INTERCONNECT_MEASUREMENT_CORRESPONDENCES);
		createEReference(logicalCorrespondenceRepositoryEClass, LOGICAL_CORRESPONDENCE_REPOSITORY__VIRTUAL_PROCESSING_UNIT_MEASUREMENT_CORRESPONDENCES);
		createEReference(logicalCorrespondenceRepositoryEClass, LOGICAL_CORRESPONDENCE_REPOSITORY__VOLUME_MEASUREMENT_CORRESPONDENCES);
		createEReference(logicalCorrespondenceRepositoryEClass, LOGICAL_CORRESPONDENCE_REPOSITORY__VIRTUAL_NETWORK_INTERCONNECTS);
		createEReference(logicalCorrespondenceRepositoryEClass, LOGICAL_CORRESPONDENCE_REPOSITORY__VM_IMAGE_CORRESPONDENCES);
		createEReference(logicalCorrespondenceRepositoryEClass, LOGICAL_CORRESPONDENCE_REPOSITORY__VM_IMAGE_INSTANCE_CORRESPONDENCES);
		createEReference(logicalCorrespondenceRepositoryEClass, LOGICAL_CORRESPONDENCE_REPOSITORY__VIRTUAL_MACHINE_CORRESPONDENCES);
		createEReference(logicalCorrespondenceRepositoryEClass, LOGICAL_CORRESPONDENCE_REPOSITORY__HYPERVISOR_CORRESPONDENCES);
		createEReference(logicalCorrespondenceRepositoryEClass, LOGICAL_CORRESPONDENCE_REPOSITORY__NETWORK_ATTACHED_STORAGE_CORRESPONDENCES);
		createEReference(logicalCorrespondenceRepositoryEClass, LOGICAL_CORRESPONDENCE_REPOSITORY__LOGICAL_DC_MODEL);
		createEReference(logicalCorrespondenceRepositoryEClass, LOGICAL_CORRESPONDENCE_REPOSITORY__LOGICAL_LOAD_MODEL);
		createEAttribute(logicalCorrespondenceRepositoryEClass, LOGICAL_CORRESPONDENCE_REPOSITORY__CORRESPONDENCE_ESTABLISHED);
		createEReference(logicalCorrespondenceRepositoryEClass, LOGICAL_CORRESPONDENCE_REPOSITORY__OPTIMISATION_PLAN_CORRESPONDENCE);
		createEReference(logicalCorrespondenceRepositoryEClass, LOGICAL_CORRESPONDENCE_REPOSITORY__PROVIDED_SERVICE_CORRESPONDENCES);
		createEReference(logicalCorrespondenceRepositoryEClass, LOGICAL_CORRESPONDENCE_REPOSITORY__REQUIRED_SERVICE_CORRESPONDENCES);
		createEReference(logicalCorrespondenceRepositoryEClass, LOGICAL_CORRESPONDENCE_REPOSITORY__SCALABLE_CONNECTOR_CORRESPONDENCES);
		createEReference(logicalCorrespondenceRepositoryEClass, LOGICAL_CORRESPONDENCE_REPOSITORY__USER_BEHAVIOUR_CORRESPONDENCES);
		createEReference(logicalCorrespondenceRepositoryEClass, LOGICAL_CORRESPONDENCE_REPOSITORY__ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCES);
		createEReference(logicalCorrespondenceRepositoryEClass, LOGICAL_CORRESPONDENCE_REPOSITORY__SERVICE_OPERATION_CORRESPONDENCES);
		createEReference(logicalCorrespondenceRepositoryEClass, LOGICAL_CORRESPONDENCE_REPOSITORY__APPLICATION_PROVIDED_SERVICE_CORRESPONDENCES);

		vmImageInstanceCorrespondenceEClass = createEClass(VM_IMAGE_INSTANCE_CORRESPONDENCE);
		createEReference(vmImageInstanceCorrespondenceEClass, VM_IMAGE_INSTANCE_CORRESPONDENCE__CACTOS);
		createEReference(vmImageInstanceCorrespondenceEClass, VM_IMAGE_INSTANCE_CORRESPONDENCE__PALLADIO);
		createEReference(vmImageInstanceCorrespondenceEClass, VM_IMAGE_INSTANCE_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY);

		vmImageCorrespondenceEClass = createEClass(VM_IMAGE_CORRESPONDENCE);
		createEReference(vmImageCorrespondenceEClass, VM_IMAGE_CORRESPONDENCE__CACTOS);
		createEReference(vmImageCorrespondenceEClass, VM_IMAGE_CORRESPONDENCE__PALLADIO);
		createEReference(vmImageCorrespondenceEClass, VM_IMAGE_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY);

		virtualNetworkInterconnectCorrespondenceEClass = createEClass(VIRTUAL_NETWORK_INTERCONNECT_CORRESPONDENCE);
		createEReference(virtualNetworkInterconnectCorrespondenceEClass, VIRTUAL_NETWORK_INTERCONNECT_CORRESPONDENCE__CACTOS);
		createEReference(virtualNetworkInterconnectCorrespondenceEClass, VIRTUAL_NETWORK_INTERCONNECT_CORRESPONDENCE__PALLADIO);
		createEReference(virtualNetworkInterconnectCorrespondenceEClass, VIRTUAL_NETWORK_INTERCONNECT_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY);

		virtualMachineCorrespondenceEClass = createEClass(VIRTUAL_MACHINE_CORRESPONDENCE);
		createEReference(virtualMachineCorrespondenceEClass, VIRTUAL_MACHINE_CORRESPONDENCE__CACTOS);
		createEReference(virtualMachineCorrespondenceEClass, VIRTUAL_MACHINE_CORRESPONDENCE__PALLADIO);
		createEReference(virtualMachineCorrespondenceEClass, VIRTUAL_MACHINE_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY);
		createEReference(virtualMachineCorrespondenceEClass, VIRTUAL_MACHINE_CORRESPONDENCE__PALLADIO_STORAGE_CONNECTOR);
		createEReference(virtualMachineCorrespondenceEClass, VIRTUAL_MACHINE_CORRESPONDENCE__PALLADIO_USAGE);

		hypervisorCorrespondenceEClass = createEClass(HYPERVISOR_CORRESPONDENCE);
		createEReference(hypervisorCorrespondenceEClass, HYPERVISOR_CORRESPONDENCE__CACTOS);
		createEReference(hypervisorCorrespondenceEClass, HYPERVISOR_CORRESPONDENCE__PALLADIO);
		createEReference(hypervisorCorrespondenceEClass, HYPERVISOR_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY);

		networkAttachedStorageCorrespondenceEClass = createEClass(NETWORK_ATTACHED_STORAGE_CORRESPONDENCE);
		createEReference(networkAttachedStorageCorrespondenceEClass, NETWORK_ATTACHED_STORAGE_CORRESPONDENCE__CACTOS);
		createEReference(networkAttachedStorageCorrespondenceEClass, NETWORK_ATTACHED_STORAGE_CORRESPONDENCE__PALLADIO);
		createEReference(networkAttachedStorageCorrespondenceEClass, NETWORK_ATTACHED_STORAGE_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY);

		optimisationPlanCorrespondenceEClass = createEClass(OPTIMISATION_PLAN_CORRESPONDENCE);
		createEReference(optimisationPlanCorrespondenceEClass, OPTIMISATION_PLAN_CORRESPONDENCE__LAST_OPTIMISATION_PLAN);
		createEReference(optimisationPlanCorrespondenceEClass, OPTIMISATION_PLAN_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY);

		providedServiceCorrespondenceEClass = createEClass(PROVIDED_SERVICE_CORRESPONDENCE);
		createEReference(providedServiceCorrespondenceEClass, PROVIDED_SERVICE_CORRESPONDENCE__CACTOS_ROLE);
		createEReference(providedServiceCorrespondenceEClass, PROVIDED_SERVICE_CORRESPONDENCE__CACTOS_VM);
		createEReference(providedServiceCorrespondenceEClass, PROVIDED_SERVICE_CORRESPONDENCE__PALLADIO_ROLE);
		createEReference(providedServiceCorrespondenceEClass, PROVIDED_SERVICE_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY);

		requiredServiceCorrespondenceEClass = createEClass(REQUIRED_SERVICE_CORRESPONDENCE);
		createEReference(requiredServiceCorrespondenceEClass, REQUIRED_SERVICE_CORRESPONDENCE__CACTOS_ROLE);
		createEReference(requiredServiceCorrespondenceEClass, REQUIRED_SERVICE_CORRESPONDENCE__CACTOS_VM);
		createEReference(requiredServiceCorrespondenceEClass, REQUIRED_SERVICE_CORRESPONDENCE__PALLADIO_ROLE);
		createEReference(requiredServiceCorrespondenceEClass, REQUIRED_SERVICE_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY);

		scalableVMImageConnectorCorrespondenceEClass = createEClass(SCALABLE_VM_IMAGE_CONNECTOR_CORRESPONDENCE);
		createEReference(scalableVMImageConnectorCorrespondenceEClass, SCALABLE_VM_IMAGE_CONNECTOR_CORRESPONDENCE__CACTOS_APPLICATION_INSTANCE);
		createEReference(scalableVMImageConnectorCorrespondenceEClass, SCALABLE_VM_IMAGE_CONNECTOR_CORRESPONDENCE__CACTOS_CONNECTOR);
		createEReference(scalableVMImageConnectorCorrespondenceEClass, SCALABLE_VM_IMAGE_CONNECTOR_CORRESPONDENCE__PALLADIO);
		createEReference(scalableVMImageConnectorCorrespondenceEClass, SCALABLE_VM_IMAGE_CONNECTOR_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY);
		createEAttribute(scalableVMImageConnectorCorrespondenceEClass, SCALABLE_VM_IMAGE_CONNECTOR_CORRESPONDENCE__MAXIMUM_INSTANCE_NUMBER);

		userBehaviourCorrespondenceEClass = createEClass(USER_BEHAVIOUR_CORRESPONDENCE);
		createEReference(userBehaviourCorrespondenceEClass, USER_BEHAVIOUR_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY);
		createEReference(userBehaviourCorrespondenceEClass, USER_BEHAVIOUR_CORRESPONDENCE__CACTOS_USER_BEHAVIOUR);
		createEReference(userBehaviourCorrespondenceEClass, USER_BEHAVIOUR_CORRESPONDENCE__PALLADIO_USAGE);

		requestArrivalRateMeasurementCorrespondenceEClass = createEClass(REQUEST_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE);
		createEReference(requestArrivalRateMeasurementCorrespondenceEClass, REQUEST_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__REQUEST_ARRIVAL_RATE_MEASUREMENT);

		responseArrivalRateMeasurementCorrespondenceEClass = createEClass(RESPONSE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE);
		createEReference(responseArrivalRateMeasurementCorrespondenceEClass, RESPONSE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__RESPONSE_ARRIVAL_RATE_MEASUREMENT);

		serviceInstanceArrivalRateMeasurementCorrespondenceEClass = createEClass(SERVICE_INSTANCE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE);
		createEReference(serviceInstanceArrivalRateMeasurementCorrespondenceEClass, SERVICE_INSTANCE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE);
		createEReference(serviceInstanceArrivalRateMeasurementCorrespondenceEClass, SERVICE_INSTANCE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__CACTOS_SERVICE_CORRESPONDENCE);
		createEReference(serviceInstanceArrivalRateMeasurementCorrespondenceEClass, SERVICE_INSTANCE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__SERVICE_OPERATION_INSTANCE_CORRESPONDENCE);

		serviceOperationInstanceArrivalRateMeasurementCorrespondenceEClass = createEClass(SERVICE_OPERATION_INSTANCE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE);
		createEReference(serviceOperationInstanceArrivalRateMeasurementCorrespondenceEClass, SERVICE_OPERATION_INSTANCE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__SERVICE_INSTANCE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE);
		createEReference(serviceOperationInstanceArrivalRateMeasurementCorrespondenceEClass, SERVICE_OPERATION_INSTANCE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__CACTOS_SERVICE_OPERATION);

		arrivalRateMeasurementCorrespondenceEClass = createEClass(ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE);
		createEReference(arrivalRateMeasurementCorrespondenceEClass, ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__SERVICE_INSTANCE_MEASUREMENT_CORRESPONDENCES);
		createEReference(arrivalRateMeasurementCorrespondenceEClass, ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY);

		serviceOperationCorrespondenceEClass = createEClass(SERVICE_OPERATION_CORRESPONDENCE);
		createEReference(serviceOperationCorrespondenceEClass, SERVICE_OPERATION_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY);
		createEReference(serviceOperationCorrespondenceEClass, SERVICE_OPERATION_CORRESPONDENCE__CACTOS);
		createEReference(serviceOperationCorrespondenceEClass, SERVICE_OPERATION_CORRESPONDENCE__PALLADIO);

		applicationProvidedServiceCorrespondenceEClass = createEClass(APPLICATION_PROVIDED_SERVICE_CORRESPONDENCE);
		createEReference(applicationProvidedServiceCorrespondenceEClass, APPLICATION_PROVIDED_SERVICE_CORRESPONDENCE__CACTOS_APPLICATION);
		createEReference(applicationProvidedServiceCorrespondenceEClass, APPLICATION_PROVIDED_SERVICE_CORRESPONDENCE__PALLADIO_SYSTEM_ROLE);
		createEReference(applicationProvidedServiceCorrespondenceEClass, APPLICATION_PROVIDED_SERVICE_CORRESPONDENCE__CACTOS_ROLE);
		createEReference(applicationProvidedServiceCorrespondenceEClass, APPLICATION_PROVIDED_SERVICE_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY);
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
		LogicalPackageImpl theLogicalPackage = (LogicalPackageImpl)EPackage.Registry.INSTANCE.getEPackage(LogicalPackageImpl.eNS_URI);
		IdentifierPackage theIdentifierPackage = (IdentifierPackage)EPackage.Registry.INSTANCE.getEPackage(IdentifierPackage.eNS_URI);
		eu.cactosfp7.infrastructuremodels.logicaldc.core.impl.CorePackageImpl theCorePackage = (eu.cactosfp7.infrastructuremodels.logicaldc.core.impl.CorePackageImpl)EPackage.Registry.INSTANCE.getEPackage(eu.cactosfp7.infrastructuremodels.logicaldc.core.impl.CorePackageImpl.eNS_URI);
		CompositionPackage theCompositionPackage = (CompositionPackage)EPackage.Registry.INSTANCE.getEPackage(CompositionPackage.eNS_URI);
		RepositoryPackage theRepositoryPackage = (RepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(RepositoryPackage.eNS_URI);
		ResourceenvironmentPackage theResourceenvironmentPackage = (ResourceenvironmentPackage)EPackage.Registry.INSTANCE.getEPackage(ResourceenvironmentPackage.eNS_URI);
		AllocationPackage theAllocationPackage = (AllocationPackage)EPackage.Registry.INSTANCE.getEPackage(AllocationPackage.eNS_URI);
		UsageevolutionPackage theUsageevolutionPackage = (UsageevolutionPackage)EPackage.Registry.INSTANCE.getEPackage(UsageevolutionPackage.eNS_URI);
		CorePackageImpl theCorePackage_1 = (CorePackageImpl)EPackage.Registry.INSTANCE.getEPackage(CorePackageImpl.eNS_URI);
		OptimisationplanPackage theOptimisationplanPackage = (OptimisationplanPackage)EPackage.Registry.INSTANCE.getEPackage(OptimisationplanPackage.eNS_URI);
		ApplicationPackageImpl theApplicationPackage = (ApplicationPackageImpl)EPackage.Registry.INSTANCE.getEPackage(ApplicationPackageImpl.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		virtualMemoryMeasurementCorrespondenceEClass.getESuperTypes().add(theCorrespondencePackage.getLoadCorrespondence());
		virtualNetworkInterconnectMeasurementCorrespondenceEClass.getESuperTypes().add(theCorrespondencePackage.getLoadCorrespondence());
		virtualProcessingUnitMeasurementCorrespondenceEClass.getESuperTypes().add(theCorrespondencePackage.getLoadCorrespondence());
		logicalDiskReadMeasurementCorrespondenceEClass.getESuperTypes().add(theCorrespondencePackage.getLoadCorrespondence());
		logicalDiskWriteMeasurementCorrespondenceEClass.getESuperTypes().add(theCorrespondencePackage.getLoadCorrespondence());
		logicalCorrespondenceRepositoryEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		vmImageInstanceCorrespondenceEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		vmImageCorrespondenceEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		virtualNetworkInterconnectCorrespondenceEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		virtualMachineCorrespondenceEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		hypervisorCorrespondenceEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		networkAttachedStorageCorrespondenceEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		optimisationPlanCorrespondenceEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		providedServiceCorrespondenceEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		requiredServiceCorrespondenceEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		scalableVMImageConnectorCorrespondenceEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		userBehaviourCorrespondenceEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		requestArrivalRateMeasurementCorrespondenceEClass.getESuperTypes().add(this.getArrivalRateMeasurementCorrespondence());
		responseArrivalRateMeasurementCorrespondenceEClass.getESuperTypes().add(this.getArrivalRateMeasurementCorrespondence());
		serviceInstanceArrivalRateMeasurementCorrespondenceEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		serviceOperationInstanceArrivalRateMeasurementCorrespondenceEClass.getESuperTypes().add(theCorrespondencePackage.getLoadCorrespondence());
		arrivalRateMeasurementCorrespondenceEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		serviceOperationCorrespondenceEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		applicationProvidedServiceCorrespondenceEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());

		// Initialize classes and features; add operations and parameters
		initEClass(virtualMemoryMeasurementCorrespondenceEClass, VirtualMemoryMeasurementCorrespondence.class, "VirtualMemoryMeasurementCorrespondence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVirtualMemoryMeasurementCorrespondence_Cactos(), theLogicalPackage.getVirtualMemoryMeasurement(), null, "cactos", null, 1, 1, VirtualMemoryMeasurementCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVirtualMemoryMeasurementCorrespondence_LogicalCorrespondenceRepository(), this.getLogicalCorrespondenceRepository(), this.getLogicalCorrespondenceRepository_VirtualMemoryMeasurementCorrespondences(), "logicalCorrespondenceRepository", null, 1, 1, VirtualMemoryMeasurementCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(virtualNetworkInterconnectMeasurementCorrespondenceEClass, VirtualNetworkInterconnectMeasurementCorrespondence.class, "VirtualNetworkInterconnectMeasurementCorrespondence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVirtualNetworkInterconnectMeasurementCorrespondence_Cactos(), theLogicalPackage.getVirtualNetworkInterconnectMeasurement(), null, "cactos", null, 1, 1, VirtualNetworkInterconnectMeasurementCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVirtualNetworkInterconnectMeasurementCorrespondence_LogicalCorrespondenceRepository(), this.getLogicalCorrespondenceRepository(), this.getLogicalCorrespondenceRepository_VirtualNetworkInterconnectMeasurementCorrespondences(), "logicalCorrespondenceRepository", null, 1, 1, VirtualNetworkInterconnectMeasurementCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(virtualProcessingUnitMeasurementCorrespondenceEClass, VirtualProcessingUnitMeasurementCorrespondence.class, "VirtualProcessingUnitMeasurementCorrespondence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVirtualProcessingUnitMeasurementCorrespondence_Cactos(), theLogicalPackage.getVirtualProcessingUnitsMeasurement(), null, "cactos", null, 1, 1, VirtualProcessingUnitMeasurementCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVirtualProcessingUnitMeasurementCorrespondence_LogicalCorrespondenceRepository(), this.getLogicalCorrespondenceRepository(), this.getLogicalCorrespondenceRepository_VirtualProcessingUnitMeasurementCorrespondences(), "logicalCorrespondenceRepository", null, 1, 1, VirtualProcessingUnitMeasurementCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(logicalDiskReadMeasurementCorrespondenceEClass, LogicalDiskReadMeasurementCorrespondence.class, "LogicalDiskReadMeasurementCorrespondence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLogicalDiskReadMeasurementCorrespondence_Cactos(), theLogicalPackage.getVirtualDiskMeasurement(), null, "cactos", null, 1, 1, LogicalDiskReadMeasurementCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogicalDiskReadMeasurementCorrespondence_LogicalCorrespondenceRepository(), this.getLogicalCorrespondenceRepository(), this.getLogicalCorrespondenceRepository_VolumeMeasurementCorrespondences(), "logicalCorrespondenceRepository", null, 1, 1, LogicalDiskReadMeasurementCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(logicalDiskWriteMeasurementCorrespondenceEClass, LogicalDiskWriteMeasurementCorrespondence.class, "LogicalDiskWriteMeasurementCorrespondence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLogicalDiskWriteMeasurementCorrespondence_Cactos(), theLogicalPackage.getVirtualDiskMeasurement(), null, "cactos", null, 1, 1, LogicalDiskWriteMeasurementCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogicalDiskWriteMeasurementCorrespondence_LogicalCorrespondenceRepository(), this.getLogicalCorrespondenceRepository(), null, "logicalCorrespondenceRepository", null, 1, 1, LogicalDiskWriteMeasurementCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(logicalCorrespondenceRepositoryEClass, LogicalCorrespondenceRepository.class, "LogicalCorrespondenceRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLogicalCorrespondenceRepository_VirtualMemoryMeasurementCorrespondences(), this.getVirtualMemoryMeasurementCorrespondence(), this.getVirtualMemoryMeasurementCorrespondence_LogicalCorrespondenceRepository(), "virtualMemoryMeasurementCorrespondences", null, 0, -1, LogicalCorrespondenceRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogicalCorrespondenceRepository_VirtualNetworkInterconnectMeasurementCorrespondences(), this.getVirtualNetworkInterconnectMeasurementCorrespondence(), this.getVirtualNetworkInterconnectMeasurementCorrespondence_LogicalCorrespondenceRepository(), "virtualNetworkInterconnectMeasurementCorrespondences", null, 0, -1, LogicalCorrespondenceRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogicalCorrespondenceRepository_VirtualProcessingUnitMeasurementCorrespondences(), this.getVirtualProcessingUnitMeasurementCorrespondence(), this.getVirtualProcessingUnitMeasurementCorrespondence_LogicalCorrespondenceRepository(), "virtualProcessingUnitMeasurementCorrespondences", null, 0, -1, LogicalCorrespondenceRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogicalCorrespondenceRepository_VolumeMeasurementCorrespondences(), this.getLogicalDiskReadMeasurementCorrespondence(), this.getLogicalDiskReadMeasurementCorrespondence_LogicalCorrespondenceRepository(), "volumeMeasurementCorrespondences", null, 0, -1, LogicalCorrespondenceRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogicalCorrespondenceRepository_VirtualNetworkInterconnects(), this.getVirtualNetworkInterconnectCorrespondence(), this.getVirtualNetworkInterconnectCorrespondence_LogicalCorrespondenceRepository(), "virtualNetworkInterconnects", null, 0, -1, LogicalCorrespondenceRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLogicalCorrespondenceRepository_VmImageCorrespondences(), this.getVMImageCorrespondence(), this.getVMImageCorrespondence_LogicalCorrespondenceRepository(), "vmImageCorrespondences", null, 0, -1, LogicalCorrespondenceRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLogicalCorrespondenceRepository_VmImageInstanceCorrespondences(), this.getVMImageInstanceCorrespondence(), this.getVMImageInstanceCorrespondence_LogicalCorrespondenceRepository(), "vmImageInstanceCorrespondences", null, 0, -1, LogicalCorrespondenceRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogicalCorrespondenceRepository_VirtualMachineCorrespondences(), this.getVirtualMachineCorrespondence(), this.getVirtualMachineCorrespondence_LogicalCorrespondenceRepository(), "virtualMachineCorrespondences", null, 0, -1, LogicalCorrespondenceRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogicalCorrespondenceRepository_HypervisorCorrespondences(), this.getHypervisorCorrespondence(), this.getHypervisorCorrespondence_LogicalCorrespondenceRepository(), "hypervisorCorrespondences", null, 0, -1, LogicalCorrespondenceRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogicalCorrespondenceRepository_NetworkAttachedStorageCorrespondences(), this.getNetworkAttachedStorageCorrespondence(), this.getNetworkAttachedStorageCorrespondence_LogicalCorrespondenceRepository(), "networkAttachedStorageCorrespondences", null, 0, -1, LogicalCorrespondenceRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogicalCorrespondenceRepository_LogicalDcModel(), theCorePackage.getLogicalDCModel(), null, "logicalDcModel", null, 1, 1, LogicalCorrespondenceRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogicalCorrespondenceRepository_LogicalLoadModel(), theLogicalPackage.getLogicalLoadModel(), null, "logicalLoadModel", null, 1, 1, LogicalCorrespondenceRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogicalCorrespondenceRepository_CorrespondenceEstablished(), ecorePackage.getEBoolean(), "correspondenceEstablished", "false", 1, 1, LogicalCorrespondenceRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogicalCorrespondenceRepository_OptimisationPlanCorrespondence(), this.getOptimisationPlanCorrespondence(), this.getOptimisationPlanCorrespondence_LogicalCorrespondenceRepository(), "optimisationPlanCorrespondence", null, 0, 1, LogicalCorrespondenceRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogicalCorrespondenceRepository_ProvidedServiceCorrespondences(), this.getProvidedServiceCorrespondence(), this.getProvidedServiceCorrespondence_LogicalCorrespondenceRepository(), "providedServiceCorrespondences", null, 0, -1, LogicalCorrespondenceRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogicalCorrespondenceRepository_RequiredServiceCorrespondences(), this.getRequiredServiceCorrespondence(), this.getRequiredServiceCorrespondence_LogicalCorrespondenceRepository(), "requiredServiceCorrespondences", null, 0, -1, LogicalCorrespondenceRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogicalCorrespondenceRepository_ScalableConnectorCorrespondences(), this.getScalableVMImageConnectorCorrespondence(), this.getScalableVMImageConnectorCorrespondence_LogicalCorrespondenceRepository(), "scalableConnectorCorrespondences", null, 0, -1, LogicalCorrespondenceRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogicalCorrespondenceRepository_UserBehaviourCorrespondences(), this.getUserBehaviourCorrespondence(), this.getUserBehaviourCorrespondence_LogicalCorrespondenceRepository(), "userBehaviourCorrespondences", null, 0, -1, LogicalCorrespondenceRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogicalCorrespondenceRepository_ArrivalRateMeasurementCorrespondences(), this.getArrivalRateMeasurementCorrespondence(), this.getArrivalRateMeasurementCorrespondence_LogicalCorrespondenceRepository(), "arrivalRateMeasurementCorrespondences", null, 0, -1, LogicalCorrespondenceRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogicalCorrespondenceRepository_ServiceOperationCorrespondences(), this.getServiceOperationCorrespondence(), this.getServiceOperationCorrespondence_LogicalCorrespondenceRepository(), "serviceOperationCorrespondences", null, 0, -1, LogicalCorrespondenceRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogicalCorrespondenceRepository_ApplicationProvidedServiceCorrespondences(), this.getApplicationProvidedServiceCorrespondence(), this.getApplicationProvidedServiceCorrespondence_LogicalCorrespondenceRepository(), "applicationProvidedServiceCorrespondences", null, 0, -1, LogicalCorrespondenceRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vmImageInstanceCorrespondenceEClass, VMImageInstanceCorrespondence.class, "VMImageInstanceCorrespondence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVMImageInstanceCorrespondence_Cactos(), theCorePackage.getVMImageInstance(), null, "cactos", null, 1, 1, VMImageInstanceCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVMImageInstanceCorrespondence_Palladio(), theCompositionPackage.getAssemblyContext(), null, "palladio", null, 1, 1, VMImageInstanceCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVMImageInstanceCorrespondence_LogicalCorrespondenceRepository(), this.getLogicalCorrespondenceRepository(), this.getLogicalCorrespondenceRepository_VmImageInstanceCorrespondences(), "logicalCorrespondenceRepository", null, 1, 1, VMImageInstanceCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vmImageCorrespondenceEClass, VMImageCorrespondence.class, "VMImageCorrespondence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVMImageCorrespondence_Cactos(), theCorePackage.getVMImage(), null, "cactos", null, 1, 1, VMImageCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getVMImageCorrespondence_Palladio(), theRepositoryPackage.getBasicComponent(), null, "palladio", null, 1, 1, VMImageCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVMImageCorrespondence_LogicalCorrespondenceRepository(), this.getLogicalCorrespondenceRepository(), this.getLogicalCorrespondenceRepository_VmImageCorrespondences(), "logicalCorrespondenceRepository", null, 1, 1, VMImageCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(virtualNetworkInterconnectCorrespondenceEClass, VirtualNetworkInterconnectCorrespondence.class, "VirtualNetworkInterconnectCorrespondence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVirtualNetworkInterconnectCorrespondence_Cactos(), theCorePackage.getVirtualNetworkInterconnect(), null, "cactos", null, 1, 1, VirtualNetworkInterconnectCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVirtualNetworkInterconnectCorrespondence_Palladio(), theResourceenvironmentPackage.getLinkingResource(), null, "palladio", null, 1, 1, VirtualNetworkInterconnectCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVirtualNetworkInterconnectCorrespondence_LogicalCorrespondenceRepository(), this.getLogicalCorrespondenceRepository(), this.getLogicalCorrespondenceRepository_VirtualNetworkInterconnects(), "logicalCorrespondenceRepository", null, 1, 1, VirtualNetworkInterconnectCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(virtualMachineCorrespondenceEClass, VirtualMachineCorrespondence.class, "VirtualMachineCorrespondence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVirtualMachineCorrespondence_Cactos(), theCorePackage.getVirtualMachine(), null, "cactos", null, 1, 1, VirtualMachineCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVirtualMachineCorrespondence_Palladio(), theAllocationPackage.getAllocationContext(), null, "palladio", null, 1, 1, VirtualMachineCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVirtualMachineCorrespondence_LogicalCorrespondenceRepository(), this.getLogicalCorrespondenceRepository(), this.getLogicalCorrespondenceRepository_VirtualMachineCorrespondences(), "logicalCorrespondenceRepository", null, 1, 1, VirtualMachineCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVirtualMachineCorrespondence_PalladioStorageConnector(), theCompositionPackage.getAssemblyInfrastructureConnector(), null, "palladioStorageConnector", null, 0, 1, VirtualMachineCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVirtualMachineCorrespondence_PalladioUsage(), theUsageevolutionPackage.getUsage(), null, "palladioUsage", null, 0, 1, VirtualMachineCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hypervisorCorrespondenceEClass, HypervisorCorrespondence.class, "HypervisorCorrespondence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHypervisorCorrespondence_Cactos(), theCorePackage.getHypervisor(), null, "cactos", null, 1, 1, HypervisorCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHypervisorCorrespondence_Palladio(), theAllocationPackage.getAllocationContext(), null, "palladio", null, 1, 1, HypervisorCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHypervisorCorrespondence_LogicalCorrespondenceRepository(), this.getLogicalCorrespondenceRepository(), this.getLogicalCorrespondenceRepository_HypervisorCorrespondences(), "logicalCorrespondenceRepository", null, 0, 1, HypervisorCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(networkAttachedStorageCorrespondenceEClass, NetworkAttachedStorageCorrespondence.class, "NetworkAttachedStorageCorrespondence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNetworkAttachedStorageCorrespondence_Cactos(), theCorePackage_1.getNetworkAttachedStorage(), null, "cactos", null, 1, 1, NetworkAttachedStorageCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNetworkAttachedStorageCorrespondence_Palladio(), theAllocationPackage.getAllocationContext(), null, "palladio", null, 1, 1, NetworkAttachedStorageCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNetworkAttachedStorageCorrespondence_LogicalCorrespondenceRepository(), this.getLogicalCorrespondenceRepository(), this.getLogicalCorrespondenceRepository_NetworkAttachedStorageCorrespondences(), "logicalCorrespondenceRepository", null, 0, 1, NetworkAttachedStorageCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(optimisationPlanCorrespondenceEClass, OptimisationPlanCorrespondence.class, "OptimisationPlanCorrespondence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOptimisationPlanCorrespondence_LastOptimisationPlan(), theOptimisationplanPackage.getOptimisationPlan(), null, "lastOptimisationPlan", null, 1, 1, OptimisationPlanCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOptimisationPlanCorrespondence_LogicalCorrespondenceRepository(), this.getLogicalCorrespondenceRepository(), this.getLogicalCorrespondenceRepository_OptimisationPlanCorrespondence(), "logicalCorrespondenceRepository", null, 1, 1, OptimisationPlanCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(providedServiceCorrespondenceEClass, ProvidedServiceCorrespondence.class, "ProvidedServiceCorrespondence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProvidedServiceCorrespondence_CactosRole(), theApplicationPackage.getServiceProvidedRole(), null, "cactosRole", null, 1, 1, ProvidedServiceCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProvidedServiceCorrespondence_CactosVM(), theCorePackage.getVirtualMachine(), null, "cactosVM", null, 1, 1, ProvidedServiceCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProvidedServiceCorrespondence_PalladioRole(), theRepositoryPackage.getOperationProvidedRole(), null, "palladioRole", null, 1, 1, ProvidedServiceCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProvidedServiceCorrespondence_LogicalCorrespondenceRepository(), this.getLogicalCorrespondenceRepository(), this.getLogicalCorrespondenceRepository_ProvidedServiceCorrespondences(), "logicalCorrespondenceRepository", null, 0, 1, ProvidedServiceCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requiredServiceCorrespondenceEClass, RequiredServiceCorrespondence.class, "RequiredServiceCorrespondence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequiredServiceCorrespondence_CactosRole(), theApplicationPackage.getServiceRequiredRole(), null, "cactosRole", null, 1, 1, RequiredServiceCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequiredServiceCorrespondence_CactosVM(), theCorePackage.getVirtualMachine(), null, "cactosVM", null, 1, 1, RequiredServiceCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequiredServiceCorrespondence_PalladioRole(), theRepositoryPackage.getOperationRequiredRole(), null, "palladioRole", null, 1, 1, RequiredServiceCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequiredServiceCorrespondence_LogicalCorrespondenceRepository(), this.getLogicalCorrespondenceRepository(), this.getLogicalCorrespondenceRepository_RequiredServiceCorrespondences(), "logicalCorrespondenceRepository", null, 0, 1, RequiredServiceCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scalableVMImageConnectorCorrespondenceEClass, ScalableVMImageConnectorCorrespondence.class, "ScalableVMImageConnectorCorrespondence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScalableVMImageConnectorCorrespondence_CactosApplicationInstance(), theApplicationPackage.getWhiteBoxApplicationInstance(), null, "cactosApplicationInstance", null, 0, 1, ScalableVMImageConnectorCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScalableVMImageConnectorCorrespondence_CactosConnector(), theApplicationPackage.getScalableVMImageConnector(), null, "cactosConnector", null, 0, 1, ScalableVMImageConnectorCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScalableVMImageConnectorCorrespondence_Palladio(), theRepositoryPackage.getBasicComponent(), null, "palladio", null, 0, 1, ScalableVMImageConnectorCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScalableVMImageConnectorCorrespondence_LogicalCorrespondenceRepository(), this.getLogicalCorrespondenceRepository(), this.getLogicalCorrespondenceRepository_ScalableConnectorCorrespondences(), "logicalCorrespondenceRepository", null, 0, 1, ScalableVMImageConnectorCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScalableVMImageConnectorCorrespondence_MaximumInstanceNumber(), theEcorePackage.getEInt(), "maximumInstanceNumber", "0", 1, 1, ScalableVMImageConnectorCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userBehaviourCorrespondenceEClass, UserBehaviourCorrespondence.class, "UserBehaviourCorrespondence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUserBehaviourCorrespondence_LogicalCorrespondenceRepository(), this.getLogicalCorrespondenceRepository(), this.getLogicalCorrespondenceRepository_UserBehaviourCorrespondences(), "logicalCorrespondenceRepository", null, 0, 1, UserBehaviourCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUserBehaviourCorrespondence_CactosUserBehaviour(), theApplicationPackage.getUserBehaviour(), null, "cactosUserBehaviour", null, 1, 1, UserBehaviourCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUserBehaviourCorrespondence_PalladioUsage(), theUsageevolutionPackage.getUsage(), null, "palladioUsage", null, 1, 1, UserBehaviourCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requestArrivalRateMeasurementCorrespondenceEClass, RequestArrivalRateMeasurementCorrespondence.class, "RequestArrivalRateMeasurementCorrespondence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequestArrivalRateMeasurementCorrespondence_RequestArrivalRateMeasurement(), theLogicalPackage.getRequestArrivalRateMeasurement(), null, "requestArrivalRateMeasurement", null, 0, 1, RequestArrivalRateMeasurementCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(responseArrivalRateMeasurementCorrespondenceEClass, ResponseArrivalRateMeasurementCorrespondence.class, "ResponseArrivalRateMeasurementCorrespondence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResponseArrivalRateMeasurementCorrespondence_ResponseArrivalRateMeasurement(), theLogicalPackage.getResponseArrivalRateMeasurement(), null, "responseArrivalRateMeasurement", null, 1, 1, ResponseArrivalRateMeasurementCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceInstanceArrivalRateMeasurementCorrespondenceEClass, ServiceInstanceArrivalRateMeasurementCorrespondence.class, "ServiceInstanceArrivalRateMeasurementCorrespondence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceInstanceArrivalRateMeasurementCorrespondence_ArrivalRateMeasurementCorrespondence(), this.getArrivalRateMeasurementCorrespondence(), this.getArrivalRateMeasurementCorrespondence_ServiceInstanceMeasurementCorrespondences(), "arrivalRateMeasurementCorrespondence", null, 0, 1, ServiceInstanceArrivalRateMeasurementCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceInstanceArrivalRateMeasurementCorrespondence_CactosServiceCorrespondence(), this.getProvidedServiceCorrespondence(), null, "cactosServiceCorrespondence", null, 1, 1, ServiceInstanceArrivalRateMeasurementCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceInstanceArrivalRateMeasurementCorrespondence_ServiceOperationInstanceCorrespondence(), this.getServiceOperationInstanceArrivalRateMeasurementCorrespondence(), this.getServiceOperationInstanceArrivalRateMeasurementCorrespondence_ServiceInstanceArrivalRateMeasurementCorrespondence(), "serviceOperationInstanceCorrespondence", null, 0, -1, ServiceInstanceArrivalRateMeasurementCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceOperationInstanceArrivalRateMeasurementCorrespondenceEClass, ServiceOperationInstanceArrivalRateMeasurementCorrespondence.class, "ServiceOperationInstanceArrivalRateMeasurementCorrespondence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceOperationInstanceArrivalRateMeasurementCorrespondence_ServiceInstanceArrivalRateMeasurementCorrespondence(), this.getServiceInstanceArrivalRateMeasurementCorrespondence(), this.getServiceInstanceArrivalRateMeasurementCorrespondence_ServiceOperationInstanceCorrespondence(), "serviceInstanceArrivalRateMeasurementCorrespondence", null, 0, 1, ServiceOperationInstanceArrivalRateMeasurementCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceOperationInstanceArrivalRateMeasurementCorrespondence_CactosServiceOperation(), theApplicationPackage.getServiceOperation(), null, "cactosServiceOperation", null, 1, 1, ServiceOperationInstanceArrivalRateMeasurementCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arrivalRateMeasurementCorrespondenceEClass, ArrivalRateMeasurementCorrespondence.class, "ArrivalRateMeasurementCorrespondence", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArrivalRateMeasurementCorrespondence_ServiceInstanceMeasurementCorrespondences(), this.getServiceInstanceArrivalRateMeasurementCorrespondence(), this.getServiceInstanceArrivalRateMeasurementCorrespondence_ArrivalRateMeasurementCorrespondence(), "serviceInstanceMeasurementCorrespondences", null, 0, -1, ArrivalRateMeasurementCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArrivalRateMeasurementCorrespondence_LogicalCorrespondenceRepository(), this.getLogicalCorrespondenceRepository(), this.getLogicalCorrespondenceRepository_ArrivalRateMeasurementCorrespondences(), "logicalCorrespondenceRepository", null, 0, 1, ArrivalRateMeasurementCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceOperationCorrespondenceEClass, ServiceOperationCorrespondence.class, "ServiceOperationCorrespondence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceOperationCorrespondence_LogicalCorrespondenceRepository(), this.getLogicalCorrespondenceRepository(), this.getLogicalCorrespondenceRepository_ServiceOperationCorrespondences(), "logicalCorrespondenceRepository", null, 0, 1, ServiceOperationCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceOperationCorrespondence_Cactos(), theApplicationPackage.getServiceOperation(), null, "cactos", null, 0, 1, ServiceOperationCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceOperationCorrespondence_Palladio(), theRepositoryPackage.getOperationSignature(), null, "palladio", null, 0, 1, ServiceOperationCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(applicationProvidedServiceCorrespondenceEClass, ApplicationProvidedServiceCorrespondence.class, "ApplicationProvidedServiceCorrespondence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getApplicationProvidedServiceCorrespondence_CactosApplication(), theApplicationPackage.getApplicationInstance(), null, "cactosApplication", null, 0, 1, ApplicationProvidedServiceCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplicationProvidedServiceCorrespondence_PalladioSystemRole(), theRepositoryPackage.getOperationProvidedRole(), null, "palladioSystemRole", null, 0, 1, ApplicationProvidedServiceCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplicationProvidedServiceCorrespondence_CactosRole(), theApplicationPackage.getServiceProvidedRole(), null, "cactosRole", null, 0, 1, ApplicationProvidedServiceCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplicationProvidedServiceCorrespondence_LogicalCorrespondenceRepository(), this.getLogicalCorrespondenceRepository(), this.getLogicalCorrespondenceRepository_ApplicationProvidedServiceCorrespondences(), "logicalCorrespondenceRepository", null, 0, 1, ApplicationProvidedServiceCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //LogicalcorrespondencePackageImpl
