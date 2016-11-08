/**
 */
package eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl;

import eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PhysicalcorrespondenceFactoryImpl extends EFactoryImpl implements PhysicalcorrespondenceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PhysicalcorrespondenceFactory init() {
		try {
			PhysicalcorrespondenceFactory thePhysicalcorrespondenceFactory = (PhysicalcorrespondenceFactory)EPackage.Registry.INSTANCE.getEFactory(PhysicalcorrespondencePackage.eNS_URI);
			if (thePhysicalcorrespondenceFactory != null) {
				return thePhysicalcorrespondenceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PhysicalcorrespondenceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalcorrespondenceFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PhysicalcorrespondencePackage.PU_MEASUREMENT_CORRESPONDENCE: return (EObject)createPuMeasurementCorrespondence();
			case PhysicalcorrespondencePackage.MEMORY_MEASUREMENT_CORRESPONDENCE: return (EObject)createMemoryMeasurementCorrespondence();
			case PhysicalcorrespondencePackage.STORAGE_MEASUREMENT_CORRESPONDENCE: return (EObject)createStorageMeasurementCorrespondence();
			case PhysicalcorrespondencePackage.INTERCONNECT_MEASUREMENT_CORRESPONDENCE: return (EObject)createInterconnectMeasurementCorrespondence();
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY: return (EObject)createPhysicalCorrespondenceRepository();
			case PhysicalcorrespondencePackage.SWITCH_CORRESPONDENCE: return (EObject)createSwitchCorrespondence();
			case PhysicalcorrespondencePackage.RACK_CORRESPONDENCE: return (EObject)createRackCorrespondence();
			case PhysicalcorrespondencePackage.ABSTRACT_NODE_CORRESPONDENCE: return (EObject)createAbstractNodeCorrespondence();
			case PhysicalcorrespondencePackage.MEMORY_SPECIFICATION_CORRESPONDENCE: return (EObject)createMemorySpecificationCorrespondence();
			case PhysicalcorrespondencePackage.STORAGE_SPECIFICATION_CORRESPONDENCE: return (EObject)createStorageSpecificationCorrespondence();
			case PhysicalcorrespondencePackage.NETWORK_INTERCONNECT_CORRESPONDENCE: return (EObject)createNetworkInterconnectCorrespondence();
			case PhysicalcorrespondencePackage.PROCESSING_UNIT_SPECIFICATION_CORRESPONDENCE: return (EObject)createProcessingUnitSpecificationCorrespondence();
			case PhysicalcorrespondencePackage.POWER_CONSUMING_ENTITY_MEASUREMENT_CORRESPONDENCE: return (EObject)createPowerConsumingEntityMeasurementCorrespondence();
			case PhysicalcorrespondencePackage.POWER_PROVIDING_ENTITY_CORRESPONDENCE: return (EObject)createPowerProvidingEntityCorrespondence();
			case PhysicalcorrespondencePackage.POWER_CONSUMING_RESOURCE_CORRESPONDENCE: return (EObject)createPowerConsumingResourceCorrespondence();
			case PhysicalcorrespondencePackage.ARCHITECTURE_TYPE_CORRESPONDENCE: return (EObject)createArchitectureTypeCorrespondence();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PuMeasurementCorrespondence createPuMeasurementCorrespondence() {
		PuMeasurementCorrespondenceImpl puMeasurementCorrespondence = new PuMeasurementCorrespondenceImpl();
		return puMeasurementCorrespondence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryMeasurementCorrespondence createMemoryMeasurementCorrespondence() {
		MemoryMeasurementCorrespondenceImpl memoryMeasurementCorrespondence = new MemoryMeasurementCorrespondenceImpl();
		return memoryMeasurementCorrespondence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StorageMeasurementCorrespondence createStorageMeasurementCorrespondence() {
		StorageMeasurementCorrespondenceImpl storageMeasurementCorrespondence = new StorageMeasurementCorrespondenceImpl();
		return storageMeasurementCorrespondence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterconnectMeasurementCorrespondence createInterconnectMeasurementCorrespondence() {
		InterconnectMeasurementCorrespondenceImpl interconnectMeasurementCorrespondence = new InterconnectMeasurementCorrespondenceImpl();
		return interconnectMeasurementCorrespondence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalCorrespondenceRepository createPhysicalCorrespondenceRepository() {
		PhysicalCorrespondenceRepositoryImpl physicalCorrespondenceRepository = new PhysicalCorrespondenceRepositoryImpl();
		return physicalCorrespondenceRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwitchCorrespondence createSwitchCorrespondence() {
		SwitchCorrespondenceImpl switchCorrespondence = new SwitchCorrespondenceImpl();
		return switchCorrespondence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RackCorrespondence createRackCorrespondence() {
		RackCorrespondenceImpl rackCorrespondence = new RackCorrespondenceImpl();
		return rackCorrespondence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractNodeCorrespondence createAbstractNodeCorrespondence() {
		AbstractNodeCorrespondenceImpl abstractNodeCorrespondence = new AbstractNodeCorrespondenceImpl();
		return abstractNodeCorrespondence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemorySpecificationCorrespondence createMemorySpecificationCorrespondence() {
		MemorySpecificationCorrespondenceImpl memorySpecificationCorrespondence = new MemorySpecificationCorrespondenceImpl();
		return memorySpecificationCorrespondence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StorageSpecificationCorrespondence createStorageSpecificationCorrespondence() {
		StorageSpecificationCorrespondenceImpl storageSpecificationCorrespondence = new StorageSpecificationCorrespondenceImpl();
		return storageSpecificationCorrespondence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkInterconnectCorrespondence createNetworkInterconnectCorrespondence() {
		NetworkInterconnectCorrespondenceImpl networkInterconnectCorrespondence = new NetworkInterconnectCorrespondenceImpl();
		return networkInterconnectCorrespondence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingUnitSpecificationCorrespondence createProcessingUnitSpecificationCorrespondence() {
		ProcessingUnitSpecificationCorrespondenceImpl processingUnitSpecificationCorrespondence = new ProcessingUnitSpecificationCorrespondenceImpl();
		return processingUnitSpecificationCorrespondence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerConsumingEntityMeasurementCorrespondence createPowerConsumingEntityMeasurementCorrespondence() {
		PowerConsumingEntityMeasurementCorrespondenceImpl powerConsumingEntityMeasurementCorrespondence = new PowerConsumingEntityMeasurementCorrespondenceImpl();
		return powerConsumingEntityMeasurementCorrespondence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerProvidingEntityCorrespondence createPowerProvidingEntityCorrespondence() {
		PowerProvidingEntityCorrespondenceImpl powerProvidingEntityCorrespondence = new PowerProvidingEntityCorrespondenceImpl();
		return powerProvidingEntityCorrespondence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerConsumingResourceCorrespondence createPowerConsumingResourceCorrespondence() {
		PowerConsumingResourceCorrespondenceImpl powerConsumingResourceCorrespondence = new PowerConsumingResourceCorrespondenceImpl();
		return powerConsumingResourceCorrespondence;
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ArchitectureTypeCorrespondence createArchitectureTypeCorrespondence() {
		ArchitectureTypeCorrespondenceImpl architectureTypeCorrespondence = new ArchitectureTypeCorrespondenceImpl();
		return architectureTypeCorrespondence;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalcorrespondencePackage getPhysicalcorrespondencePackage() {
		return (PhysicalcorrespondencePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PhysicalcorrespondencePackage getPackage() {
		return PhysicalcorrespondencePackage.eINSTANCE;
	}

} //PhysicalcorrespondenceFactoryImpl
