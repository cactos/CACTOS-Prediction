/**
 */
package eu.cactosfp7.cactosim.correspondence.logicalcorrespondence;

import eu.cactosfp7.cactosim.correspondence.CorrespondencePackage;

import eu.cactosfp7.identifier.IdentifierPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalcorrespondenceFactory
 * @model kind="package"
 * @generated
 */
public interface LogicalcorrespondencePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "logicalcorrespondence";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.cactosfp7.eu/Correspondence/Logical/1.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "logicalcorrespondence";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LogicalcorrespondencePackage eINSTANCE = eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.LogicalcorrespondencePackageImpl.init();

	/**
	 * The meta object id for the '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.VirtualMemoryMeasurementCorrespondenceImpl <em>Virtual Memory Measurement Correspondence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.VirtualMemoryMeasurementCorrespondenceImpl
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.LogicalcorrespondencePackageImpl#getVirtualMemoryMeasurementCorrespondence()
	 * @generated
	 */
	int VIRTUAL_MEMORY_MEASUREMENT_CORRESPONDENCE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MEMORY_MEASUREMENT_CORRESPONDENCE__ID = CorrespondencePackage.LOAD_CORRESPONDENCE__ID;

	/**
	 * The feature id for the '<em><b>Palladio</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MEMORY_MEASUREMENT_CORRESPONDENCE__PALLADIO = CorrespondencePackage.LOAD_CORRESPONDENCE__PALLADIO;

	/**
	 * The feature id for the '<em><b>Cactos</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MEMORY_MEASUREMENT_CORRESPONDENCE__CACTOS = CorrespondencePackage.LOAD_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Logical Correspondence Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MEMORY_MEASUREMENT_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY = CorrespondencePackage.LOAD_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Virtual Memory Measurement Correspondence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MEMORY_MEASUREMENT_CORRESPONDENCE_FEATURE_COUNT = CorrespondencePackage.LOAD_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.VirtualNetworkInterconnectMeasurementCorrespondenceImpl <em>Virtual Network Interconnect Measurement Correspondence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.VirtualNetworkInterconnectMeasurementCorrespondenceImpl
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.LogicalcorrespondencePackageImpl#getVirtualNetworkInterconnectMeasurementCorrespondence()
	 * @generated
	 */
	int VIRTUAL_NETWORK_INTERCONNECT_MEASUREMENT_CORRESPONDENCE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NETWORK_INTERCONNECT_MEASUREMENT_CORRESPONDENCE__ID = CorrespondencePackage.LOAD_CORRESPONDENCE__ID;

	/**
	 * The feature id for the '<em><b>Palladio</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NETWORK_INTERCONNECT_MEASUREMENT_CORRESPONDENCE__PALLADIO = CorrespondencePackage.LOAD_CORRESPONDENCE__PALLADIO;

	/**
	 * The feature id for the '<em><b>Cactos</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NETWORK_INTERCONNECT_MEASUREMENT_CORRESPONDENCE__CACTOS = CorrespondencePackage.LOAD_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Logical Correspondence Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NETWORK_INTERCONNECT_MEASUREMENT_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY = CorrespondencePackage.LOAD_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Virtual Network Interconnect Measurement Correspondence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NETWORK_INTERCONNECT_MEASUREMENT_CORRESPONDENCE_FEATURE_COUNT = CorrespondencePackage.LOAD_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.VirtualProcessingUnitMeasurementCorrespondenceImpl <em>Virtual Processing Unit Measurement Correspondence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.VirtualProcessingUnitMeasurementCorrespondenceImpl
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.LogicalcorrespondencePackageImpl#getVirtualProcessingUnitMeasurementCorrespondence()
	 * @generated
	 */
	int VIRTUAL_PROCESSING_UNIT_MEASUREMENT_CORRESPONDENCE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PROCESSING_UNIT_MEASUREMENT_CORRESPONDENCE__ID = CorrespondencePackage.LOAD_CORRESPONDENCE__ID;

	/**
	 * The feature id for the '<em><b>Palladio</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PROCESSING_UNIT_MEASUREMENT_CORRESPONDENCE__PALLADIO = CorrespondencePackage.LOAD_CORRESPONDENCE__PALLADIO;

	/**
	 * The feature id for the '<em><b>Cactos</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PROCESSING_UNIT_MEASUREMENT_CORRESPONDENCE__CACTOS = CorrespondencePackage.LOAD_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Logical Correspondence Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PROCESSING_UNIT_MEASUREMENT_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY = CorrespondencePackage.LOAD_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Virtual Processing Unit Measurement Correspondence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PROCESSING_UNIT_MEASUREMENT_CORRESPONDENCE_FEATURE_COUNT = CorrespondencePackage.LOAD_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.LogicalDiskReadMeasurementCorrespondenceImpl <em>Logical Disk Read Measurement Correspondence</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.LogicalDiskReadMeasurementCorrespondenceImpl
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.LogicalcorrespondencePackageImpl#getLogicalDiskReadMeasurementCorrespondence()
	 * @generated
	 */
    int LOGICAL_DISK_READ_MEASUREMENT_CORRESPONDENCE = 3;

    /**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int LOGICAL_DISK_READ_MEASUREMENT_CORRESPONDENCE__ID = CorrespondencePackage.LOAD_CORRESPONDENCE__ID;

    /**
	 * The feature id for the '<em><b>Palladio</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int LOGICAL_DISK_READ_MEASUREMENT_CORRESPONDENCE__PALLADIO = CorrespondencePackage.LOAD_CORRESPONDENCE__PALLADIO;

    /**
	 * The feature id for the '<em><b>Cactos</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int LOGICAL_DISK_READ_MEASUREMENT_CORRESPONDENCE__CACTOS = CorrespondencePackage.LOAD_CORRESPONDENCE_FEATURE_COUNT + 0;

    /**
	 * The feature id for the '<em><b>Logical Correspondence Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int LOGICAL_DISK_READ_MEASUREMENT_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY = CorrespondencePackage.LOAD_CORRESPONDENCE_FEATURE_COUNT + 1;

    /**
	 * The number of structural features of the '<em>Logical Disk Read Measurement Correspondence</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int LOGICAL_DISK_READ_MEASUREMENT_CORRESPONDENCE_FEATURE_COUNT = CorrespondencePackage.LOAD_CORRESPONDENCE_FEATURE_COUNT + 2;

    /**
	 * The meta object id for the '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.LogicalDiskWriteMeasurementCorrespondenceImpl <em>Logical Disk Write Measurement Correspondence</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.LogicalDiskWriteMeasurementCorrespondenceImpl
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.LogicalcorrespondencePackageImpl#getLogicalDiskWriteMeasurementCorrespondence()
	 * @generated
	 */
    int LOGICAL_DISK_WRITE_MEASUREMENT_CORRESPONDENCE = 4;

    /**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int LOGICAL_DISK_WRITE_MEASUREMENT_CORRESPONDENCE__ID = CorrespondencePackage.LOAD_CORRESPONDENCE__ID;

    /**
	 * The feature id for the '<em><b>Palladio</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int LOGICAL_DISK_WRITE_MEASUREMENT_CORRESPONDENCE__PALLADIO = CorrespondencePackage.LOAD_CORRESPONDENCE__PALLADIO;

    /**
	 * The feature id for the '<em><b>Cactos</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int LOGICAL_DISK_WRITE_MEASUREMENT_CORRESPONDENCE__CACTOS = CorrespondencePackage.LOAD_CORRESPONDENCE_FEATURE_COUNT + 0;

    /**
	 * The feature id for the '<em><b>Logical Correspondence Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int LOGICAL_DISK_WRITE_MEASUREMENT_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY = CorrespondencePackage.LOAD_CORRESPONDENCE_FEATURE_COUNT + 1;

    /**
	 * The number of structural features of the '<em>Logical Disk Write Measurement Correspondence</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int LOGICAL_DISK_WRITE_MEASUREMENT_CORRESPONDENCE_FEATURE_COUNT = CorrespondencePackage.LOAD_CORRESPONDENCE_FEATURE_COUNT + 2;

    /**
	 * The meta object id for the '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.LogicalCorrespondenceRepositoryImpl <em>Logical Correspondence Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.LogicalCorrespondenceRepositoryImpl
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.LogicalcorrespondencePackageImpl#getLogicalCorrespondenceRepository()
	 * @generated
	 */
	int LOGICAL_CORRESPONDENCE_REPOSITORY = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CORRESPONDENCE_REPOSITORY__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Virtual Memory Measurement Correspondences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CORRESPONDENCE_REPOSITORY__VIRTUAL_MEMORY_MEASUREMENT_CORRESPONDENCES = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Virtual Network Interconnect Measurement Correspondences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CORRESPONDENCE_REPOSITORY__VIRTUAL_NETWORK_INTERCONNECT_MEASUREMENT_CORRESPONDENCES = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Virtual Processing Unit Measurement Correspondences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CORRESPONDENCE_REPOSITORY__VIRTUAL_PROCESSING_UNIT_MEASUREMENT_CORRESPONDENCES = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Volume Measurement Correspondences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CORRESPONDENCE_REPOSITORY__VOLUME_MEASUREMENT_CORRESPONDENCES = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Virtual Network Interconnects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CORRESPONDENCE_REPOSITORY__VIRTUAL_NETWORK_INTERCONNECTS = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Vm Image Correspondences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CORRESPONDENCE_REPOSITORY__VM_IMAGE_CORRESPONDENCES = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Vm Image Instance Correspondences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CORRESPONDENCE_REPOSITORY__VM_IMAGE_INSTANCE_CORRESPONDENCES = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Virtual Machine Correspondences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CORRESPONDENCE_REPOSITORY__VIRTUAL_MACHINE_CORRESPONDENCES = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Hypervisor Correspondences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int LOGICAL_CORRESPONDENCE_REPOSITORY__HYPERVISOR_CORRESPONDENCES = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 8;

    /**
	 * The feature id for the '<em><b>Network Attached Storage Correspondences</b></em>' reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int LOGICAL_CORRESPONDENCE_REPOSITORY__NETWORK_ATTACHED_STORAGE_CORRESPONDENCES = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 9;

    /**
	 * The feature id for the '<em><b>Logical Dc Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CORRESPONDENCE_REPOSITORY__LOGICAL_DC_MODEL = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Logical Load Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CORRESPONDENCE_REPOSITORY__LOGICAL_LOAD_MODEL = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Correspondence Established</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CORRESPONDENCE_REPOSITORY__CORRESPONDENCE_ESTABLISHED = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Optimisation Plan Correspondence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int LOGICAL_CORRESPONDENCE_REPOSITORY__OPTIMISATION_PLAN_CORRESPONDENCE = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 13;

        /**
	 * The feature id for the '<em><b>Provided Service Correspondences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int LOGICAL_CORRESPONDENCE_REPOSITORY__PROVIDED_SERVICE_CORRESPONDENCES = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 14;

        /**
	 * The feature id for the '<em><b>Required Service Correspondences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int LOGICAL_CORRESPONDENCE_REPOSITORY__REQUIRED_SERVICE_CORRESPONDENCES = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 15;

        /**
	 * The feature id for the '<em><b>Scalable Connector Correspondences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int LOGICAL_CORRESPONDENCE_REPOSITORY__SCALABLE_CONNECTOR_CORRESPONDENCES = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 16;

        /**
	 * The feature id for the '<em><b>User Behaviour Correspondences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int LOGICAL_CORRESPONDENCE_REPOSITORY__USER_BEHAVIOUR_CORRESPONDENCES = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 17;

        /**
	 * The feature id for the '<em><b>Arrival Rate Measurement Correspondences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CORRESPONDENCE_REPOSITORY__ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCES = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 18;

								/**
	 * The feature id for the '<em><b>Service Operation Correspondences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CORRESPONDENCE_REPOSITORY__SERVICE_OPERATION_CORRESPONDENCES = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 19;

								/**
	 * The feature id for the '<em><b>Application Provided Service Correspondences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CORRESPONDENCE_REPOSITORY__APPLICATION_PROVIDED_SERVICE_CORRESPONDENCES = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 20;

								/**
	 * The number of structural features of the '<em>Logical Correspondence Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CORRESPONDENCE_REPOSITORY_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 21;

	/**
	 * The meta object id for the '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.VMImageInstanceCorrespondenceImpl <em>VM Image Instance Correspondence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.VMImageInstanceCorrespondenceImpl
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.LogicalcorrespondencePackageImpl#getVMImageInstanceCorrespondence()
	 * @generated
	 */
	int VM_IMAGE_INSTANCE_CORRESPONDENCE = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_IMAGE_INSTANCE_CORRESPONDENCE__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Cactos</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_IMAGE_INSTANCE_CORRESPONDENCE__CACTOS = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Palladio</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_IMAGE_INSTANCE_CORRESPONDENCE__PALLADIO = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Logical Correspondence Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_IMAGE_INSTANCE_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>VM Image Instance Correspondence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_IMAGE_INSTANCE_CORRESPONDENCE_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.VMImageCorrespondenceImpl <em>VM Image Correspondence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.VMImageCorrespondenceImpl
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.LogicalcorrespondencePackageImpl#getVMImageCorrespondence()
	 * @generated
	 */
	int VM_IMAGE_CORRESPONDENCE = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_IMAGE_CORRESPONDENCE__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Cactos</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_IMAGE_CORRESPONDENCE__CACTOS = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Palladio</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_IMAGE_CORRESPONDENCE__PALLADIO = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Logical Correspondence Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_IMAGE_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>VM Image Correspondence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_IMAGE_CORRESPONDENCE_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.VirtualNetworkInterconnectCorrespondenceImpl <em>Virtual Network Interconnect Correspondence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.VirtualNetworkInterconnectCorrespondenceImpl
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.LogicalcorrespondencePackageImpl#getVirtualNetworkInterconnectCorrespondence()
	 * @generated
	 */
	int VIRTUAL_NETWORK_INTERCONNECT_CORRESPONDENCE = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NETWORK_INTERCONNECT_CORRESPONDENCE__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Cactos</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NETWORK_INTERCONNECT_CORRESPONDENCE__CACTOS = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Palladio</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NETWORK_INTERCONNECT_CORRESPONDENCE__PALLADIO = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Logical Correspondence Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NETWORK_INTERCONNECT_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Virtual Network Interconnect Correspondence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NETWORK_INTERCONNECT_CORRESPONDENCE_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.VirtualMachineCorrespondenceImpl <em>Virtual Machine Correspondence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.VirtualMachineCorrespondenceImpl
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.LogicalcorrespondencePackageImpl#getVirtualMachineCorrespondence()
	 * @generated
	 */
	int VIRTUAL_MACHINE_CORRESPONDENCE = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_CORRESPONDENCE__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Cactos</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_CORRESPONDENCE__CACTOS = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Palladio</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_CORRESPONDENCE__PALLADIO = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Logical Correspondence Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Palladio Storage Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int VIRTUAL_MACHINE_CORRESPONDENCE__PALLADIO_STORAGE_CONNECTOR = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 3;

    /**
	 * The feature id for the '<em><b>Palladio Usage</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int VIRTUAL_MACHINE_CORRESPONDENCE__PALLADIO_USAGE = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 4;

    /**
	 * The number of structural features of the '<em>Virtual Machine Correspondence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_CORRESPONDENCE_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 5;


	/**
	 * The meta object id for the '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.HypervisorCorrespondenceImpl <em>Hypervisor Correspondence</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.HypervisorCorrespondenceImpl
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.LogicalcorrespondencePackageImpl#getHypervisorCorrespondence()
	 * @generated
	 */
    int HYPERVISOR_CORRESPONDENCE = 10;

    /**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int HYPERVISOR_CORRESPONDENCE__ID = IdentifierPackage.IDENTIFIER__ID;

    /**
	 * The feature id for the '<em><b>Cactos</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int HYPERVISOR_CORRESPONDENCE__CACTOS = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

    /**
	 * The feature id for the '<em><b>Palladio</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int HYPERVISOR_CORRESPONDENCE__PALLADIO = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

    /**
	 * The feature id for the '<em><b>Logical Correspondence Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int HYPERVISOR_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

    /**
	 * The number of structural features of the '<em>Hypervisor Correspondence</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int HYPERVISOR_CORRESPONDENCE_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 3;


    /**
	 * The meta object id for the '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.NetworkAttachedStorageCorrespondenceImpl <em>Network Attached Storage Correspondence</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.NetworkAttachedStorageCorrespondenceImpl
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.LogicalcorrespondencePackageImpl#getNetworkAttachedStorageCorrespondence()
	 * @generated
	 */
    int NETWORK_ATTACHED_STORAGE_CORRESPONDENCE = 11;

    /**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int NETWORK_ATTACHED_STORAGE_CORRESPONDENCE__ID = IdentifierPackage.IDENTIFIER__ID;

    /**
	 * The feature id for the '<em><b>Cactos</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int NETWORK_ATTACHED_STORAGE_CORRESPONDENCE__CACTOS = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

    /**
	 * The feature id for the '<em><b>Palladio</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int NETWORK_ATTACHED_STORAGE_CORRESPONDENCE__PALLADIO = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

    /**
	 * The feature id for the '<em><b>Logical Correspondence Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int NETWORK_ATTACHED_STORAGE_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

    /**
	 * The number of structural features of the '<em>Network Attached Storage Correspondence</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int NETWORK_ATTACHED_STORAGE_CORRESPONDENCE_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 3;


    /**
	 * The meta object id for the '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.OptimisationPlanCorrespondenceImpl <em>Optimisation Plan Correspondence</em>}' class.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.OptimisationPlanCorrespondenceImpl
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.LogicalcorrespondencePackageImpl#getOptimisationPlanCorrespondence()
	 * @generated
	 */
        int OPTIMISATION_PLAN_CORRESPONDENCE = 12;

/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int OPTIMISATION_PLAN_CORRESPONDENCE__ID = IdentifierPackage.IDENTIFIER__ID;

/**
	 * The feature id for the '<em><b>Last Optimisation Plan</b></em>' reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int OPTIMISATION_PLAN_CORRESPONDENCE__LAST_OPTIMISATION_PLAN = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

/**
	 * The feature id for the '<em><b>Logical Correspondence Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int OPTIMISATION_PLAN_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

/**
	 * The number of structural features of the '<em>Optimisation Plan Correspondence</em>' class.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int OPTIMISATION_PLAN_CORRESPONDENCE_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;


/**
	 * The meta object id for the '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.ProvidedServiceCorrespondenceImpl <em>Provided Service Correspondence</em>}' class.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.ProvidedServiceCorrespondenceImpl
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.LogicalcorrespondencePackageImpl#getProvidedServiceCorrespondence()
	 * @generated
	 */
        int PROVIDED_SERVICE_CORRESPONDENCE = 13;

/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int PROVIDED_SERVICE_CORRESPONDENCE__ID = IdentifierPackage.IDENTIFIER__ID;

/**
	 * The feature id for the '<em><b>Cactos Role</b></em>' reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int PROVIDED_SERVICE_CORRESPONDENCE__CACTOS_ROLE = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

/**
	 * The feature id for the '<em><b>Cactos VM</b></em>' reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int PROVIDED_SERVICE_CORRESPONDENCE__CACTOS_VM = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

/**
	 * The feature id for the '<em><b>Palladio Role</b></em>' reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int PROVIDED_SERVICE_CORRESPONDENCE__PALLADIO_ROLE = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

/**
	 * The feature id for the '<em><b>Logical Correspondence Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int PROVIDED_SERVICE_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 3;

/**
	 * The number of structural features of the '<em>Provided Service Correspondence</em>' class.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int PROVIDED_SERVICE_CORRESPONDENCE_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 4;

/**
	 * The meta object id for the '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.RequiredServiceCorrespondenceImpl <em>Required Service Correspondence</em>}' class.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.RequiredServiceCorrespondenceImpl
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.LogicalcorrespondencePackageImpl#getRequiredServiceCorrespondence()
	 * @generated
	 */
        int REQUIRED_SERVICE_CORRESPONDENCE = 14;

/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int REQUIRED_SERVICE_CORRESPONDENCE__ID = IdentifierPackage.IDENTIFIER__ID;

/**
	 * The feature id for the '<em><b>Cactos Role</b></em>' reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int REQUIRED_SERVICE_CORRESPONDENCE__CACTOS_ROLE = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

/**
	 * The feature id for the '<em><b>Cactos VM</b></em>' reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int REQUIRED_SERVICE_CORRESPONDENCE__CACTOS_VM = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

/**
	 * The feature id for the '<em><b>Palladio Role</b></em>' reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int REQUIRED_SERVICE_CORRESPONDENCE__PALLADIO_ROLE = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

/**
	 * The feature id for the '<em><b>Logical Correspondence Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int REQUIRED_SERVICE_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 3;

/**
	 * The number of structural features of the '<em>Required Service Correspondence</em>' class.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int REQUIRED_SERVICE_CORRESPONDENCE_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 4;


/**
	 * The meta object id for the '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.ScalableVMImageConnectorCorrespondenceImpl <em>Scalable VM Image Connector Correspondence</em>}' class.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.ScalableVMImageConnectorCorrespondenceImpl
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.LogicalcorrespondencePackageImpl#getScalableVMImageConnectorCorrespondence()
	 * @generated
	 */
        int SCALABLE_VM_IMAGE_CONNECTOR_CORRESPONDENCE = 15;

/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int SCALABLE_VM_IMAGE_CONNECTOR_CORRESPONDENCE__ID = IdentifierPackage.IDENTIFIER__ID;

/**
	 * The feature id for the '<em><b>Cactos Application Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int SCALABLE_VM_IMAGE_CONNECTOR_CORRESPONDENCE__CACTOS_APPLICATION_INSTANCE = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

/**
	 * The feature id for the '<em><b>Cactos Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int SCALABLE_VM_IMAGE_CONNECTOR_CORRESPONDENCE__CACTOS_CONNECTOR = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

/**
	 * The feature id for the '<em><b>Palladio</b></em>' reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int SCALABLE_VM_IMAGE_CONNECTOR_CORRESPONDENCE__PALLADIO = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

/**
	 * The feature id for the '<em><b>Logical Correspondence Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int SCALABLE_VM_IMAGE_CONNECTOR_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 3;

/**
	 * The feature id for the '<em><b>Maximum Instance Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALABLE_VM_IMAGE_CONNECTOR_CORRESPONDENCE__MAXIMUM_INSTANCE_NUMBER = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 4;

/**
	 * The number of structural features of the '<em>Scalable VM Image Connector Correspondence</em>' class.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int SCALABLE_VM_IMAGE_CONNECTOR_CORRESPONDENCE_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 5;


/**
	 * The meta object id for the '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.UserBehaviourCorrespondenceImpl <em>User Behaviour Correspondence</em>}' class.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.UserBehaviourCorrespondenceImpl
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.LogicalcorrespondencePackageImpl#getUserBehaviourCorrespondence()
	 * @generated
	 */
        int USER_BEHAVIOUR_CORRESPONDENCE = 16;

/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int USER_BEHAVIOUR_CORRESPONDENCE__ID = IdentifierPackage.IDENTIFIER__ID;

/**
	 * The feature id for the '<em><b>Logical Correspondence Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int USER_BEHAVIOUR_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

/**
	 * The feature id for the '<em><b>Cactos User Behaviour</b></em>' reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int USER_BEHAVIOUR_CORRESPONDENCE__CACTOS_USER_BEHAVIOUR = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

/**
	 * The feature id for the '<em><b>Palladio Usage</b></em>' reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int USER_BEHAVIOUR_CORRESPONDENCE__PALLADIO_USAGE = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

/**
	 * The number of structural features of the '<em>User Behaviour Correspondence</em>' class.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
        int USER_BEHAVIOUR_CORRESPONDENCE_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 3;


/**
	 * The meta object id for the '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.ArrivalRateMeasurementCorrespondenceImpl <em>Arrival Rate Measurement Correspondence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.ArrivalRateMeasurementCorrespondenceImpl
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.LogicalcorrespondencePackageImpl#getArrivalRateMeasurementCorrespondence()
	 * @generated
	 */
	int ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE = 21;

/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__ID = IdentifierPackage.IDENTIFIER__ID;

/**
	 * The feature id for the '<em><b>Service Instance Measurement Correspondences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__SERVICE_INSTANCE_MEASUREMENT_CORRESPONDENCES = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

/**
	 * The feature id for the '<em><b>Logical Correspondence Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

/**
	 * The number of structural features of the '<em>Arrival Rate Measurement Correspondence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

/**
	 * The meta object id for the '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.RequestArrivalRateMeasurementCorrespondenceImpl <em>Request Arrival Rate Measurement Correspondence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.RequestArrivalRateMeasurementCorrespondenceImpl
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.LogicalcorrespondencePackageImpl#getRequestArrivalRateMeasurementCorrespondence()
	 * @generated
	 */
	int REQUEST_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE = 17;

/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__ID = ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__ID;

/**
	 * The feature id for the '<em><b>Service Instance Measurement Correspondences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__SERVICE_INSTANCE_MEASUREMENT_CORRESPONDENCES = ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__SERVICE_INSTANCE_MEASUREMENT_CORRESPONDENCES;

/**
	 * The feature id for the '<em><b>Logical Correspondence Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY = ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY;

/**
	 * The feature id for the '<em><b>Request Arrival Rate Measurement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__REQUEST_ARRIVAL_RATE_MEASUREMENT = ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE_FEATURE_COUNT + 0;

/**
	 * The number of structural features of the '<em>Request Arrival Rate Measurement Correspondence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE_FEATURE_COUNT = ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE_FEATURE_COUNT + 1;

/**
	 * The meta object id for the '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.ResponseArrivalRateMeasurementCorrespondenceImpl <em>Response Arrival Rate Measurement Correspondence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.ResponseArrivalRateMeasurementCorrespondenceImpl
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.LogicalcorrespondencePackageImpl#getResponseArrivalRateMeasurementCorrespondence()
	 * @generated
	 */
	int RESPONSE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE = 18;

/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__ID = ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__ID;

/**
	 * The feature id for the '<em><b>Service Instance Measurement Correspondences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__SERVICE_INSTANCE_MEASUREMENT_CORRESPONDENCES = ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__SERVICE_INSTANCE_MEASUREMENT_CORRESPONDENCES;

/**
	 * The feature id for the '<em><b>Logical Correspondence Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY = ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY;

/**
	 * The feature id for the '<em><b>Response Arrival Rate Measurement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__RESPONSE_ARRIVAL_RATE_MEASUREMENT = ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE_FEATURE_COUNT + 0;

/**
	 * The number of structural features of the '<em>Response Arrival Rate Measurement Correspondence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE_FEATURE_COUNT = ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE_FEATURE_COUNT + 1;

/**
	 * The meta object id for the '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.ServiceInstanceArrivalRateMeasurementCorrespondenceImpl <em>Service Instance Arrival Rate Measurement Correspondence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.ServiceInstanceArrivalRateMeasurementCorrespondenceImpl
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.LogicalcorrespondencePackageImpl#getServiceInstanceArrivalRateMeasurementCorrespondence()
	 * @generated
	 */
	int SERVICE_INSTANCE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE = 19;

/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INSTANCE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__ID = IdentifierPackage.IDENTIFIER__ID;

/**
	 * The feature id for the '<em><b>Arrival Rate Measurement Correspondence</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INSTANCE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

/**
	 * The feature id for the '<em><b>Cactos Service Correspondence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INSTANCE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__CACTOS_SERVICE_CORRESPONDENCE = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

/**
	 * The feature id for the '<em><b>Service Operation Instance Correspondence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INSTANCE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__SERVICE_OPERATION_INSTANCE_CORRESPONDENCE = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

/**
	 * The number of structural features of the '<em>Service Instance Arrival Rate Measurement Correspondence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INSTANCE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 3;


/**
	 * The meta object id for the '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.ServiceOperationInstanceArrivalRateMeasurementCorrespondenceImpl <em>Service Operation Instance Arrival Rate Measurement Correspondence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.ServiceOperationInstanceArrivalRateMeasurementCorrespondenceImpl
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.LogicalcorrespondencePackageImpl#getServiceOperationInstanceArrivalRateMeasurementCorrespondence()
	 * @generated
	 */
	int SERVICE_OPERATION_INSTANCE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE = 20;

/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_INSTANCE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__ID = CorrespondencePackage.LOAD_CORRESPONDENCE__ID;

/**
	 * The feature id for the '<em><b>Palladio</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_INSTANCE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__PALLADIO = CorrespondencePackage.LOAD_CORRESPONDENCE__PALLADIO;

/**
	 * The feature id for the '<em><b>Service Instance Arrival Rate Measurement Correspondence</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_INSTANCE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__SERVICE_INSTANCE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE = CorrespondencePackage.LOAD_CORRESPONDENCE_FEATURE_COUNT + 0;

/**
	 * The feature id for the '<em><b>Cactos Service Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_INSTANCE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__CACTOS_SERVICE_OPERATION = CorrespondencePackage.LOAD_CORRESPONDENCE_FEATURE_COUNT + 1;

/**
	 * The number of structural features of the '<em>Service Operation Instance Arrival Rate Measurement Correspondence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_INSTANCE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE_FEATURE_COUNT = CorrespondencePackage.LOAD_CORRESPONDENCE_FEATURE_COUNT + 2;


/**
	 * The meta object id for the '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.ServiceOperationCorrespondenceImpl <em>Service Operation Correspondence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.ServiceOperationCorrespondenceImpl
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.LogicalcorrespondencePackageImpl#getServiceOperationCorrespondence()
	 * @generated
	 */
	int SERVICE_OPERATION_CORRESPONDENCE = 22;

/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_CORRESPONDENCE__ID = IdentifierPackage.IDENTIFIER__ID;

/**
	 * The feature id for the '<em><b>Logical Correspondence Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

/**
	 * The feature id for the '<em><b>Cactos</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_CORRESPONDENCE__CACTOS = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

/**
	 * The feature id for the '<em><b>Palladio</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_CORRESPONDENCE__PALLADIO = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

/**
	 * The number of structural features of the '<em>Service Operation Correspondence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_CORRESPONDENCE_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 3;


/**
	 * The meta object id for the '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.ApplicationProvidedServiceCorrespondenceImpl <em>Application Provided Service Correspondence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.ApplicationProvidedServiceCorrespondenceImpl
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.LogicalcorrespondencePackageImpl#getApplicationProvidedServiceCorrespondence()
	 * @generated
	 */
	int APPLICATION_PROVIDED_SERVICE_CORRESPONDENCE = 23;

/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_PROVIDED_SERVICE_CORRESPONDENCE__ID = IdentifierPackage.IDENTIFIER__ID;

/**
	 * The feature id for the '<em><b>Cactos Application</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_PROVIDED_SERVICE_CORRESPONDENCE__CACTOS_APPLICATION = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

/**
	 * The feature id for the '<em><b>Palladio System Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_PROVIDED_SERVICE_CORRESPONDENCE__PALLADIO_SYSTEM_ROLE = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

/**
	 * The feature id for the '<em><b>Cactos Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_PROVIDED_SERVICE_CORRESPONDENCE__CACTOS_ROLE = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

/**
	 * The feature id for the '<em><b>Logical Correspondence Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_PROVIDED_SERVICE_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 3;

/**
	 * The number of structural features of the '<em>Application Provided Service Correspondence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_PROVIDED_SERVICE_CORRESPONDENCE_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 4;


/**
	 * Returns the meta object for class '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VirtualMemoryMeasurementCorrespondence <em>Virtual Memory Measurement Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Virtual Memory Measurement Correspondence</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VirtualMemoryMeasurementCorrespondence
	 * @generated
	 */
	EClass getVirtualMemoryMeasurementCorrespondence();

	/**
	 * Returns the meta object for the reference '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VirtualMemoryMeasurementCorrespondence#getCactos <em>Cactos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cactos</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VirtualMemoryMeasurementCorrespondence#getCactos()
	 * @see #getVirtualMemoryMeasurementCorrespondence()
	 * @generated
	 */
	EReference getVirtualMemoryMeasurementCorrespondence_Cactos();

	/**
	 * Returns the meta object for the container reference '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VirtualMemoryMeasurementCorrespondence#getLogicalCorrespondenceRepository <em>Logical Correspondence Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Logical Correspondence Repository</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VirtualMemoryMeasurementCorrespondence#getLogicalCorrespondenceRepository()
	 * @see #getVirtualMemoryMeasurementCorrespondence()
	 * @generated
	 */
	EReference getVirtualMemoryMeasurementCorrespondence_LogicalCorrespondenceRepository();

	/**
	 * Returns the meta object for class '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VirtualNetworkInterconnectMeasurementCorrespondence <em>Virtual Network Interconnect Measurement Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Virtual Network Interconnect Measurement Correspondence</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VirtualNetworkInterconnectMeasurementCorrespondence
	 * @generated
	 */
	EClass getVirtualNetworkInterconnectMeasurementCorrespondence();

	/**
	 * Returns the meta object for the reference '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VirtualNetworkInterconnectMeasurementCorrespondence#getCactos <em>Cactos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cactos</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VirtualNetworkInterconnectMeasurementCorrespondence#getCactos()
	 * @see #getVirtualNetworkInterconnectMeasurementCorrespondence()
	 * @generated
	 */
	EReference getVirtualNetworkInterconnectMeasurementCorrespondence_Cactos();

	/**
	 * Returns the meta object for the container reference '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VirtualNetworkInterconnectMeasurementCorrespondence#getLogicalCorrespondenceRepository <em>Logical Correspondence Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Logical Correspondence Repository</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VirtualNetworkInterconnectMeasurementCorrespondence#getLogicalCorrespondenceRepository()
	 * @see #getVirtualNetworkInterconnectMeasurementCorrespondence()
	 * @generated
	 */
	EReference getVirtualNetworkInterconnectMeasurementCorrespondence_LogicalCorrespondenceRepository();

	/**
	 * Returns the meta object for class '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VirtualProcessingUnitMeasurementCorrespondence <em>Virtual Processing Unit Measurement Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Virtual Processing Unit Measurement Correspondence</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VirtualProcessingUnitMeasurementCorrespondence
	 * @generated
	 */
	EClass getVirtualProcessingUnitMeasurementCorrespondence();

	/**
	 * Returns the meta object for the reference '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VirtualProcessingUnitMeasurementCorrespondence#getCactos <em>Cactos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cactos</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VirtualProcessingUnitMeasurementCorrespondence#getCactos()
	 * @see #getVirtualProcessingUnitMeasurementCorrespondence()
	 * @generated
	 */
	EReference getVirtualProcessingUnitMeasurementCorrespondence_Cactos();

	/**
	 * Returns the meta object for the container reference '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VirtualProcessingUnitMeasurementCorrespondence#getLogicalCorrespondenceRepository <em>Logical Correspondence Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Logical Correspondence Repository</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VirtualProcessingUnitMeasurementCorrespondence#getLogicalCorrespondenceRepository()
	 * @see #getVirtualProcessingUnitMeasurementCorrespondence()
	 * @generated
	 */
	EReference getVirtualProcessingUnitMeasurementCorrespondence_LogicalCorrespondenceRepository();

	/**
	 * Returns the meta object for class '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalDiskReadMeasurementCorrespondence <em>Logical Disk Read Measurement Correspondence</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical Disk Read Measurement Correspondence</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalDiskReadMeasurementCorrespondence
	 * @generated
	 */
    EClass getLogicalDiskReadMeasurementCorrespondence();

    /**
	 * Returns the meta object for the reference '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalDiskReadMeasurementCorrespondence#getCactos <em>Cactos</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cactos</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalDiskReadMeasurementCorrespondence#getCactos()
	 * @see #getLogicalDiskReadMeasurementCorrespondence()
	 * @generated
	 */
    EReference getLogicalDiskReadMeasurementCorrespondence_Cactos();

    /**
	 * Returns the meta object for the container reference '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalDiskReadMeasurementCorrespondence#getLogicalCorrespondenceRepository <em>Logical Correspondence Repository</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Logical Correspondence Repository</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalDiskReadMeasurementCorrespondence#getLogicalCorrespondenceRepository()
	 * @see #getLogicalDiskReadMeasurementCorrespondence()
	 * @generated
	 */
    EReference getLogicalDiskReadMeasurementCorrespondence_LogicalCorrespondenceRepository();

    /**
	 * Returns the meta object for class '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalDiskWriteMeasurementCorrespondence <em>Logical Disk Write Measurement Correspondence</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical Disk Write Measurement Correspondence</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalDiskWriteMeasurementCorrespondence
	 * @generated
	 */
    EClass getLogicalDiskWriteMeasurementCorrespondence();

    /**
	 * Returns the meta object for the reference '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalDiskWriteMeasurementCorrespondence#getCactos <em>Cactos</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cactos</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalDiskWriteMeasurementCorrespondence#getCactos()
	 * @see #getLogicalDiskWriteMeasurementCorrespondence()
	 * @generated
	 */
    EReference getLogicalDiskWriteMeasurementCorrespondence_Cactos();

    /**
	 * Returns the meta object for the reference '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalDiskWriteMeasurementCorrespondence#getLogicalCorrespondenceRepository <em>Logical Correspondence Repository</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Logical Correspondence Repository</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalDiskWriteMeasurementCorrespondence#getLogicalCorrespondenceRepository()
	 * @see #getLogicalDiskWriteMeasurementCorrespondence()
	 * @generated
	 */
    EReference getLogicalDiskWriteMeasurementCorrespondence_LogicalCorrespondenceRepository();

    /**
	 * Returns the meta object for class '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalCorrespondenceRepository <em>Logical Correspondence Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical Correspondence Repository</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalCorrespondenceRepository
	 * @generated
	 */
	EClass getLogicalCorrespondenceRepository();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalCorrespondenceRepository#getVirtualMemoryMeasurementCorrespondences <em>Virtual Memory Measurement Correspondences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Virtual Memory Measurement Correspondences</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalCorrespondenceRepository#getVirtualMemoryMeasurementCorrespondences()
	 * @see #getLogicalCorrespondenceRepository()
	 * @generated
	 */
	EReference getLogicalCorrespondenceRepository_VirtualMemoryMeasurementCorrespondences();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalCorrespondenceRepository#getVirtualNetworkInterconnectMeasurementCorrespondences <em>Virtual Network Interconnect Measurement Correspondences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Virtual Network Interconnect Measurement Correspondences</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalCorrespondenceRepository#getVirtualNetworkInterconnectMeasurementCorrespondences()
	 * @see #getLogicalCorrespondenceRepository()
	 * @generated
	 */
	EReference getLogicalCorrespondenceRepository_VirtualNetworkInterconnectMeasurementCorrespondences();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalCorrespondenceRepository#getVirtualProcessingUnitMeasurementCorrespondences <em>Virtual Processing Unit Measurement Correspondences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Virtual Processing Unit Measurement Correspondences</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalCorrespondenceRepository#getVirtualProcessingUnitMeasurementCorrespondences()
	 * @see #getLogicalCorrespondenceRepository()
	 * @generated
	 */
	EReference getLogicalCorrespondenceRepository_VirtualProcessingUnitMeasurementCorrespondences();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalCorrespondenceRepository#getVolumeMeasurementCorrespondences <em>Volume Measurement Correspondences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Volume Measurement Correspondences</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalCorrespondenceRepository#getVolumeMeasurementCorrespondences()
	 * @see #getLogicalCorrespondenceRepository()
	 * @generated
	 */
	EReference getLogicalCorrespondenceRepository_VolumeMeasurementCorrespondences();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalCorrespondenceRepository#getVirtualNetworkInterconnects <em>Virtual Network Interconnects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Virtual Network Interconnects</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalCorrespondenceRepository#getVirtualNetworkInterconnects()
	 * @see #getLogicalCorrespondenceRepository()
	 * @generated
	 */
	EReference getLogicalCorrespondenceRepository_VirtualNetworkInterconnects();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalCorrespondenceRepository#getVmImageCorrespondences <em>Vm Image Correspondences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vm Image Correspondences</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalCorrespondenceRepository#getVmImageCorrespondences()
	 * @see #getLogicalCorrespondenceRepository()
	 * @generated
	 */
	EReference getLogicalCorrespondenceRepository_VmImageCorrespondences();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalCorrespondenceRepository#getVmImageInstanceCorrespondences <em>Vm Image Instance Correspondences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vm Image Instance Correspondences</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalCorrespondenceRepository#getVmImageInstanceCorrespondences()
	 * @see #getLogicalCorrespondenceRepository()
	 * @generated
	 */
	EReference getLogicalCorrespondenceRepository_VmImageInstanceCorrespondences();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalCorrespondenceRepository#getVirtualMachineCorrespondences <em>Virtual Machine Correspondences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Virtual Machine Correspondences</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalCorrespondenceRepository#getVirtualMachineCorrespondences()
	 * @see #getLogicalCorrespondenceRepository()
	 * @generated
	 */
	EReference getLogicalCorrespondenceRepository_VirtualMachineCorrespondences();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalCorrespondenceRepository#getHypervisorCorrespondences <em>Hypervisor Correspondences</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hypervisor Correspondences</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalCorrespondenceRepository#getHypervisorCorrespondences()
	 * @see #getLogicalCorrespondenceRepository()
	 * @generated
	 */
    EReference getLogicalCorrespondenceRepository_HypervisorCorrespondences();

    /**
	 * Returns the meta object for the reference list '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalCorrespondenceRepository#getNetworkAttachedStorageCorrespondences <em>Network Attached Storage Correspondences</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Network Attached Storage Correspondences</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalCorrespondenceRepository#getNetworkAttachedStorageCorrespondences()
	 * @see #getLogicalCorrespondenceRepository()
	 * @generated
	 */
    EReference getLogicalCorrespondenceRepository_NetworkAttachedStorageCorrespondences();

    /**
	 * Returns the meta object for the reference '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalCorrespondenceRepository#getLogicalDcModel <em>Logical Dc Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Logical Dc Model</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalCorrespondenceRepository#getLogicalDcModel()
	 * @see #getLogicalCorrespondenceRepository()
	 * @generated
	 */
	EReference getLogicalCorrespondenceRepository_LogicalDcModel();

	/**
	 * Returns the meta object for the reference '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalCorrespondenceRepository#getLogicalLoadModel <em>Logical Load Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Logical Load Model</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalCorrespondenceRepository#getLogicalLoadModel()
	 * @see #getLogicalCorrespondenceRepository()
	 * @generated
	 */
	EReference getLogicalCorrespondenceRepository_LogicalLoadModel();

	/**
	 * Returns the meta object for the attribute '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalCorrespondenceRepository#isCorrespondenceEstablished <em>Correspondence Established</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Correspondence Established</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalCorrespondenceRepository#isCorrespondenceEstablished()
	 * @see #getLogicalCorrespondenceRepository()
	 * @generated
	 */
	EAttribute getLogicalCorrespondenceRepository_CorrespondenceEstablished();

	/**
	 * Returns the meta object for the containment reference '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalCorrespondenceRepository#getOptimisationPlanCorrespondence <em>Optimisation Plan Correspondence</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Optimisation Plan Correspondence</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalCorrespondenceRepository#getOptimisationPlanCorrespondence()
	 * @see #getLogicalCorrespondenceRepository()
	 * @generated
	 */
        EReference getLogicalCorrespondenceRepository_OptimisationPlanCorrespondence();

        /**
	 * Returns the meta object for the containment reference list '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalCorrespondenceRepository#getProvidedServiceCorrespondences <em>Provided Service Correspondences</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Provided Service Correspondences</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalCorrespondenceRepository#getProvidedServiceCorrespondences()
	 * @see #getLogicalCorrespondenceRepository()
	 * @generated
	 */
        EReference getLogicalCorrespondenceRepository_ProvidedServiceCorrespondences();

        /**
	 * Returns the meta object for the containment reference list '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalCorrespondenceRepository#getRequiredServiceCorrespondences <em>Required Service Correspondences</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Required Service Correspondences</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalCorrespondenceRepository#getRequiredServiceCorrespondences()
	 * @see #getLogicalCorrespondenceRepository()
	 * @generated
	 */
        EReference getLogicalCorrespondenceRepository_RequiredServiceCorrespondences();

        /**
	 * Returns the meta object for the containment reference list '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalCorrespondenceRepository#getScalableConnectorCorrespondences <em>Scalable Connector Correspondences</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scalable Connector Correspondences</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalCorrespondenceRepository#getScalableConnectorCorrespondences()
	 * @see #getLogicalCorrespondenceRepository()
	 * @generated
	 */
        EReference getLogicalCorrespondenceRepository_ScalableConnectorCorrespondences();

        /**
	 * Returns the meta object for the containment reference list '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalCorrespondenceRepository#getUserBehaviourCorrespondences <em>User Behaviour Correspondences</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>User Behaviour Correspondences</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalCorrespondenceRepository#getUserBehaviourCorrespondences()
	 * @see #getLogicalCorrespondenceRepository()
	 * @generated
	 */
        EReference getLogicalCorrespondenceRepository_UserBehaviourCorrespondences();

        /**
	 * Returns the meta object for the containment reference list '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalCorrespondenceRepository#getArrivalRateMeasurementCorrespondences <em>Arrival Rate Measurement Correspondences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arrival Rate Measurement Correspondences</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalCorrespondenceRepository#getArrivalRateMeasurementCorrespondences()
	 * @see #getLogicalCorrespondenceRepository()
	 * @generated
	 */
	EReference getLogicalCorrespondenceRepository_ArrivalRateMeasurementCorrespondences();

								/**
	 * Returns the meta object for the containment reference list '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalCorrespondenceRepository#getServiceOperationCorrespondences <em>Service Operation Correspondences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service Operation Correspondences</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalCorrespondenceRepository#getServiceOperationCorrespondences()
	 * @see #getLogicalCorrespondenceRepository()
	 * @generated
	 */
	EReference getLogicalCorrespondenceRepository_ServiceOperationCorrespondences();

								/**
	 * Returns the meta object for the containment reference list '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalCorrespondenceRepository#getApplicationProvidedServiceCorrespondences <em>Application Provided Service Correspondences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Application Provided Service Correspondences</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalCorrespondenceRepository#getApplicationProvidedServiceCorrespondences()
	 * @see #getLogicalCorrespondenceRepository()
	 * @generated
	 */
	EReference getLogicalCorrespondenceRepository_ApplicationProvidedServiceCorrespondences();

								/**
	 * Returns the meta object for class '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VMImageInstanceCorrespondence <em>VM Image Instance Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VM Image Instance Correspondence</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VMImageInstanceCorrespondence
	 * @generated
	 */
	EClass getVMImageInstanceCorrespondence();

	/**
	 * Returns the meta object for the reference '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VMImageInstanceCorrespondence#getCactos <em>Cactos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cactos</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VMImageInstanceCorrespondence#getCactos()
	 * @see #getVMImageInstanceCorrespondence()
	 * @generated
	 */
	EReference getVMImageInstanceCorrespondence_Cactos();

	/**
	 * Returns the meta object for the reference '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VMImageInstanceCorrespondence#getPalladio <em>Palladio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Palladio</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VMImageInstanceCorrespondence#getPalladio()
	 * @see #getVMImageInstanceCorrespondence()
	 * @generated
	 */
	EReference getVMImageInstanceCorrespondence_Palladio();

	/**
	 * Returns the meta object for the container reference '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VMImageInstanceCorrespondence#getLogicalCorrespondenceRepository <em>Logical Correspondence Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Logical Correspondence Repository</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VMImageInstanceCorrespondence#getLogicalCorrespondenceRepository()
	 * @see #getVMImageInstanceCorrespondence()
	 * @generated
	 */
	EReference getVMImageInstanceCorrespondence_LogicalCorrespondenceRepository();

	/**
	 * Returns the meta object for class '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VMImageCorrespondence <em>VM Image Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VM Image Correspondence</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VMImageCorrespondence
	 * @generated
	 */
	EClass getVMImageCorrespondence();

	/**
	 * Returns the meta object for the reference '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VMImageCorrespondence#getCactos <em>Cactos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cactos</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VMImageCorrespondence#getCactos()
	 * @see #getVMImageCorrespondence()
	 * @generated
	 */
	EReference getVMImageCorrespondence_Cactos();

	/**
	 * Returns the meta object for the reference '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VMImageCorrespondence#getPalladio <em>Palladio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Palladio</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VMImageCorrespondence#getPalladio()
	 * @see #getVMImageCorrespondence()
	 * @generated
	 */
	EReference getVMImageCorrespondence_Palladio();

	/**
	 * Returns the meta object for the container reference '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VMImageCorrespondence#getLogicalCorrespondenceRepository <em>Logical Correspondence Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Logical Correspondence Repository</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VMImageCorrespondence#getLogicalCorrespondenceRepository()
	 * @see #getVMImageCorrespondence()
	 * @generated
	 */
	EReference getVMImageCorrespondence_LogicalCorrespondenceRepository();

	/**
	 * Returns the meta object for class '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VirtualNetworkInterconnectCorrespondence <em>Virtual Network Interconnect Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Virtual Network Interconnect Correspondence</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VirtualNetworkInterconnectCorrespondence
	 * @generated
	 */
	EClass getVirtualNetworkInterconnectCorrespondence();

	/**
	 * Returns the meta object for the reference '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VirtualNetworkInterconnectCorrespondence#getCactos <em>Cactos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cactos</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VirtualNetworkInterconnectCorrespondence#getCactos()
	 * @see #getVirtualNetworkInterconnectCorrespondence()
	 * @generated
	 */
	EReference getVirtualNetworkInterconnectCorrespondence_Cactos();

	/**
	 * Returns the meta object for the reference '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VirtualNetworkInterconnectCorrespondence#getPalladio <em>Palladio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Palladio</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VirtualNetworkInterconnectCorrespondence#getPalladio()
	 * @see #getVirtualNetworkInterconnectCorrespondence()
	 * @generated
	 */
	EReference getVirtualNetworkInterconnectCorrespondence_Palladio();

	/**
	 * Returns the meta object for the container reference '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VirtualNetworkInterconnectCorrespondence#getLogicalCorrespondenceRepository <em>Logical Correspondence Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Logical Correspondence Repository</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VirtualNetworkInterconnectCorrespondence#getLogicalCorrespondenceRepository()
	 * @see #getVirtualNetworkInterconnectCorrespondence()
	 * @generated
	 */
	EReference getVirtualNetworkInterconnectCorrespondence_LogicalCorrespondenceRepository();

	/**
	 * Returns the meta object for class '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VirtualMachineCorrespondence <em>Virtual Machine Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Virtual Machine Correspondence</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VirtualMachineCorrespondence
	 * @generated
	 */
	EClass getVirtualMachineCorrespondence();

	/**
	 * Returns the meta object for the reference '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VirtualMachineCorrespondence#getCactos <em>Cactos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cactos</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VirtualMachineCorrespondence#getCactos()
	 * @see #getVirtualMachineCorrespondence()
	 * @generated
	 */
	EReference getVirtualMachineCorrespondence_Cactos();

	/**
	 * Returns the meta object for the reference '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VirtualMachineCorrespondence#getPalladio <em>Palladio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Palladio</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VirtualMachineCorrespondence#getPalladio()
	 * @see #getVirtualMachineCorrespondence()
	 * @generated
	 */
	EReference getVirtualMachineCorrespondence_Palladio();

	/**
	 * Returns the meta object for the container reference '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VirtualMachineCorrespondence#getLogicalCorrespondenceRepository <em>Logical Correspondence Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Logical Correspondence Repository</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VirtualMachineCorrespondence#getLogicalCorrespondenceRepository()
	 * @see #getVirtualMachineCorrespondence()
	 * @generated
	 */
	EReference getVirtualMachineCorrespondence_LogicalCorrespondenceRepository();

	/**
	 * Returns the meta object for the reference '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VirtualMachineCorrespondence#getPalladioStorageConnector <em>Palladio Storage Connector</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Palladio Storage Connector</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VirtualMachineCorrespondence#getPalladioStorageConnector()
	 * @see #getVirtualMachineCorrespondence()
	 * @generated
	 */
    EReference getVirtualMachineCorrespondence_PalladioStorageConnector();

    /**
	 * Returns the meta object for the reference '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VirtualMachineCorrespondence#getPalladioUsage <em>Palladio Usage</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Palladio Usage</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VirtualMachineCorrespondence#getPalladioUsage()
	 * @see #getVirtualMachineCorrespondence()
	 * @generated
	 */
    EReference getVirtualMachineCorrespondence_PalladioUsage();

    /**
	 * Returns the meta object for class '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.HypervisorCorrespondence <em>Hypervisor Correspondence</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hypervisor Correspondence</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.HypervisorCorrespondence
	 * @generated
	 */
    EClass getHypervisorCorrespondence();

    /**
	 * Returns the meta object for the reference '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.HypervisorCorrespondence#getCactos <em>Cactos</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cactos</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.HypervisorCorrespondence#getCactos()
	 * @see #getHypervisorCorrespondence()
	 * @generated
	 */
    EReference getHypervisorCorrespondence_Cactos();

    /**
	 * Returns the meta object for the reference '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.HypervisorCorrespondence#getPalladio <em>Palladio</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Palladio</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.HypervisorCorrespondence#getPalladio()
	 * @see #getHypervisorCorrespondence()
	 * @generated
	 */
    EReference getHypervisorCorrespondence_Palladio();

    /**
	 * Returns the meta object for the container reference '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.HypervisorCorrespondence#getLogicalCorrespondenceRepository <em>Logical Correspondence Repository</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Logical Correspondence Repository</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.HypervisorCorrespondence#getLogicalCorrespondenceRepository()
	 * @see #getHypervisorCorrespondence()
	 * @generated
	 */
    EReference getHypervisorCorrespondence_LogicalCorrespondenceRepository();

    /**
	 * Returns the meta object for class '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.NetworkAttachedStorageCorrespondence <em>Network Attached Storage Correspondence</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Attached Storage Correspondence</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.NetworkAttachedStorageCorrespondence
	 * @generated
	 */
    EClass getNetworkAttachedStorageCorrespondence();

    /**
	 * Returns the meta object for the reference '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.NetworkAttachedStorageCorrespondence#getCactos <em>Cactos</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cactos</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.NetworkAttachedStorageCorrespondence#getCactos()
	 * @see #getNetworkAttachedStorageCorrespondence()
	 * @generated
	 */
    EReference getNetworkAttachedStorageCorrespondence_Cactos();

    /**
	 * Returns the meta object for the reference '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.NetworkAttachedStorageCorrespondence#getPalladio <em>Palladio</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Palladio</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.NetworkAttachedStorageCorrespondence#getPalladio()
	 * @see #getNetworkAttachedStorageCorrespondence()
	 * @generated
	 */
    EReference getNetworkAttachedStorageCorrespondence_Palladio();

    /**
	 * Returns the meta object for the reference '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.NetworkAttachedStorageCorrespondence#getLogicalCorrespondenceRepository <em>Logical Correspondence Repository</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Logical Correspondence Repository</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.NetworkAttachedStorageCorrespondence#getLogicalCorrespondenceRepository()
	 * @see #getNetworkAttachedStorageCorrespondence()
	 * @generated
	 */
    EReference getNetworkAttachedStorageCorrespondence_LogicalCorrespondenceRepository();

    /**
	 * Returns the meta object for class '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.OptimisationPlanCorrespondence <em>Optimisation Plan Correspondence</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Optimisation Plan Correspondence</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.OptimisationPlanCorrespondence
	 * @generated
	 */
        EClass getOptimisationPlanCorrespondence();

/**
	 * Returns the meta object for the reference '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.OptimisationPlanCorrespondence#getLastOptimisationPlan <em>Last Optimisation Plan</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Last Optimisation Plan</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.OptimisationPlanCorrespondence#getLastOptimisationPlan()
	 * @see #getOptimisationPlanCorrespondence()
	 * @generated
	 */
        EReference getOptimisationPlanCorrespondence_LastOptimisationPlan();

/**
	 * Returns the meta object for the container reference '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.OptimisationPlanCorrespondence#getLogicalCorrespondenceRepository <em>Logical Correspondence Repository</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Logical Correspondence Repository</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.OptimisationPlanCorrespondence#getLogicalCorrespondenceRepository()
	 * @see #getOptimisationPlanCorrespondence()
	 * @generated
	 */
        EReference getOptimisationPlanCorrespondence_LogicalCorrespondenceRepository();

/**
	 * Returns the meta object for class '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ProvidedServiceCorrespondence <em>Provided Service Correspondence</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provided Service Correspondence</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ProvidedServiceCorrespondence
	 * @generated
	 */
        EClass getProvidedServiceCorrespondence();

/**
	 * Returns the meta object for the reference '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ProvidedServiceCorrespondence#getCactosRole <em>Cactos Role</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cactos Role</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ProvidedServiceCorrespondence#getCactosRole()
	 * @see #getProvidedServiceCorrespondence()
	 * @generated
	 */
        EReference getProvidedServiceCorrespondence_CactosRole();

/**
	 * Returns the meta object for the reference '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ProvidedServiceCorrespondence#getCactosVM <em>Cactos VM</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cactos VM</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ProvidedServiceCorrespondence#getCactosVM()
	 * @see #getProvidedServiceCorrespondence()
	 * @generated
	 */
        EReference getProvidedServiceCorrespondence_CactosVM();

/**
	 * Returns the meta object for the reference '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ProvidedServiceCorrespondence#getPalladioRole <em>Palladio Role</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Palladio Role</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ProvidedServiceCorrespondence#getPalladioRole()
	 * @see #getProvidedServiceCorrespondence()
	 * @generated
	 */
        EReference getProvidedServiceCorrespondence_PalladioRole();

/**
	 * Returns the meta object for the container reference '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ProvidedServiceCorrespondence#getLogicalCorrespondenceRepository <em>Logical Correspondence Repository</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Logical Correspondence Repository</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ProvidedServiceCorrespondence#getLogicalCorrespondenceRepository()
	 * @see #getProvidedServiceCorrespondence()
	 * @generated
	 */
        EReference getProvidedServiceCorrespondence_LogicalCorrespondenceRepository();

/**
	 * Returns the meta object for class '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.RequiredServiceCorrespondence <em>Required Service Correspondence</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Required Service Correspondence</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.RequiredServiceCorrespondence
	 * @generated
	 */
        EClass getRequiredServiceCorrespondence();

/**
	 * Returns the meta object for the reference '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.RequiredServiceCorrespondence#getCactosRole <em>Cactos Role</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cactos Role</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.RequiredServiceCorrespondence#getCactosRole()
	 * @see #getRequiredServiceCorrespondence()
	 * @generated
	 */
        EReference getRequiredServiceCorrespondence_CactosRole();

/**
	 * Returns the meta object for the reference '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.RequiredServiceCorrespondence#getCactosVM <em>Cactos VM</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cactos VM</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.RequiredServiceCorrespondence#getCactosVM()
	 * @see #getRequiredServiceCorrespondence()
	 * @generated
	 */
        EReference getRequiredServiceCorrespondence_CactosVM();

/**
	 * Returns the meta object for the reference '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.RequiredServiceCorrespondence#getPalladioRole <em>Palladio Role</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Palladio Role</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.RequiredServiceCorrespondence#getPalladioRole()
	 * @see #getRequiredServiceCorrespondence()
	 * @generated
	 */
        EReference getRequiredServiceCorrespondence_PalladioRole();

/**
	 * Returns the meta object for the container reference '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.RequiredServiceCorrespondence#getLogicalCorrespondenceRepository <em>Logical Correspondence Repository</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Logical Correspondence Repository</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.RequiredServiceCorrespondence#getLogicalCorrespondenceRepository()
	 * @see #getRequiredServiceCorrespondence()
	 * @generated
	 */
        EReference getRequiredServiceCorrespondence_LogicalCorrespondenceRepository();

/**
	 * Returns the meta object for class '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ScalableVMImageConnectorCorrespondence <em>Scalable VM Image Connector Correspondence</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scalable VM Image Connector Correspondence</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ScalableVMImageConnectorCorrespondence
	 * @generated
	 */
        EClass getScalableVMImageConnectorCorrespondence();

/**
	 * Returns the meta object for the reference '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ScalableVMImageConnectorCorrespondence#getCactosConnector <em>Cactos Connector</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cactos Connector</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ScalableVMImageConnectorCorrespondence#getCactosConnector()
	 * @see #getScalableVMImageConnectorCorrespondence()
	 * @generated
	 */
        EReference getScalableVMImageConnectorCorrespondence_CactosConnector();

/**
	 * Returns the meta object for the reference '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ScalableVMImageConnectorCorrespondence#getPalladio <em>Palladio</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Palladio</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ScalableVMImageConnectorCorrespondence#getPalladio()
	 * @see #getScalableVMImageConnectorCorrespondence()
	 * @generated
	 */
        EReference getScalableVMImageConnectorCorrespondence_Palladio();

/**
	 * Returns the meta object for the container reference '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ScalableVMImageConnectorCorrespondence#getLogicalCorrespondenceRepository <em>Logical Correspondence Repository</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Logical Correspondence Repository</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ScalableVMImageConnectorCorrespondence#getLogicalCorrespondenceRepository()
	 * @see #getScalableVMImageConnectorCorrespondence()
	 * @generated
	 */
        EReference getScalableVMImageConnectorCorrespondence_LogicalCorrespondenceRepository();

/**
	 * Returns the meta object for the attribute '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ScalableVMImageConnectorCorrespondence#getMaximumInstanceNumber <em>Maximum Instance Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum Instance Number</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ScalableVMImageConnectorCorrespondence#getMaximumInstanceNumber()
	 * @see #getScalableVMImageConnectorCorrespondence()
	 * @generated
	 */
	EAttribute getScalableVMImageConnectorCorrespondence_MaximumInstanceNumber();

/**
	 * Returns the meta object for the reference '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ScalableVMImageConnectorCorrespondence#getCactosApplicationInstance <em>Cactos Application Instance</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cactos Application Instance</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ScalableVMImageConnectorCorrespondence#getCactosApplicationInstance()
	 * @see #getScalableVMImageConnectorCorrespondence()
	 * @generated
	 */
        EReference getScalableVMImageConnectorCorrespondence_CactosApplicationInstance();

/**
	 * Returns the meta object for class '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.UserBehaviourCorrespondence <em>User Behaviour Correspondence</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Behaviour Correspondence</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.UserBehaviourCorrespondence
	 * @generated
	 */
        EClass getUserBehaviourCorrespondence();

/**
	 * Returns the meta object for the container reference '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.UserBehaviourCorrespondence#getLogicalCorrespondenceRepository <em>Logical Correspondence Repository</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Logical Correspondence Repository</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.UserBehaviourCorrespondence#getLogicalCorrespondenceRepository()
	 * @see #getUserBehaviourCorrespondence()
	 * @generated
	 */
        EReference getUserBehaviourCorrespondence_LogicalCorrespondenceRepository();

/**
	 * Returns the meta object for the reference '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.UserBehaviourCorrespondence#getCactosUserBehaviour <em>Cactos User Behaviour</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cactos User Behaviour</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.UserBehaviourCorrespondence#getCactosUserBehaviour()
	 * @see #getUserBehaviourCorrespondence()
	 * @generated
	 */
        EReference getUserBehaviourCorrespondence_CactosUserBehaviour();

/**
	 * Returns the meta object for the reference '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.UserBehaviourCorrespondence#getPalladioUsage <em>Palladio Usage</em>}'.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Palladio Usage</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.UserBehaviourCorrespondence#getPalladioUsage()
	 * @see #getUserBehaviourCorrespondence()
	 * @generated
	 */
        EReference getUserBehaviourCorrespondence_PalladioUsage();

/**
	 * Returns the meta object for class '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.RequestArrivalRateMeasurementCorrespondence <em>Request Arrival Rate Measurement Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request Arrival Rate Measurement Correspondence</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.RequestArrivalRateMeasurementCorrespondence
	 * @generated
	 */
	EClass getRequestArrivalRateMeasurementCorrespondence();

/**
	 * Returns the meta object for the reference '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.RequestArrivalRateMeasurementCorrespondence#getRequestArrivalRateMeasurement <em>Request Arrival Rate Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Request Arrival Rate Measurement</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.RequestArrivalRateMeasurementCorrespondence#getRequestArrivalRateMeasurement()
	 * @see #getRequestArrivalRateMeasurementCorrespondence()
	 * @generated
	 */
	EReference getRequestArrivalRateMeasurementCorrespondence_RequestArrivalRateMeasurement();

/**
	 * Returns the meta object for class '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ResponseArrivalRateMeasurementCorrespondence <em>Response Arrival Rate Measurement Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response Arrival Rate Measurement Correspondence</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ResponseArrivalRateMeasurementCorrespondence
	 * @generated
	 */
	EClass getResponseArrivalRateMeasurementCorrespondence();

/**
	 * Returns the meta object for the reference '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ResponseArrivalRateMeasurementCorrespondence#getResponseArrivalRateMeasurement <em>Response Arrival Rate Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Response Arrival Rate Measurement</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ResponseArrivalRateMeasurementCorrespondence#getResponseArrivalRateMeasurement()
	 * @see #getResponseArrivalRateMeasurementCorrespondence()
	 * @generated
	 */
	EReference getResponseArrivalRateMeasurementCorrespondence_ResponseArrivalRateMeasurement();

/**
	 * Returns the meta object for class '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ServiceInstanceArrivalRateMeasurementCorrespondence <em>Service Instance Arrival Rate Measurement Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Instance Arrival Rate Measurement Correspondence</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ServiceInstanceArrivalRateMeasurementCorrespondence
	 * @generated
	 */
	EClass getServiceInstanceArrivalRateMeasurementCorrespondence();

/**
	 * Returns the meta object for the container reference '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ServiceInstanceArrivalRateMeasurementCorrespondence#getArrivalRateMeasurementCorrespondence <em>Arrival Rate Measurement Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Arrival Rate Measurement Correspondence</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ServiceInstanceArrivalRateMeasurementCorrespondence#getArrivalRateMeasurementCorrespondence()
	 * @see #getServiceInstanceArrivalRateMeasurementCorrespondence()
	 * @generated
	 */
	EReference getServiceInstanceArrivalRateMeasurementCorrespondence_ArrivalRateMeasurementCorrespondence();

/**
	 * Returns the meta object for the reference '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ServiceInstanceArrivalRateMeasurementCorrespondence#getCactosServiceCorrespondence <em>Cactos Service Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cactos Service Correspondence</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ServiceInstanceArrivalRateMeasurementCorrespondence#getCactosServiceCorrespondence()
	 * @see #getServiceInstanceArrivalRateMeasurementCorrespondence()
	 * @generated
	 */
	EReference getServiceInstanceArrivalRateMeasurementCorrespondence_CactosServiceCorrespondence();

/**
	 * Returns the meta object for the containment reference list '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ServiceInstanceArrivalRateMeasurementCorrespondence#getServiceOperationInstanceCorrespondence <em>Service Operation Instance Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service Operation Instance Correspondence</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ServiceInstanceArrivalRateMeasurementCorrespondence#getServiceOperationInstanceCorrespondence()
	 * @see #getServiceInstanceArrivalRateMeasurementCorrespondence()
	 * @generated
	 */
	EReference getServiceInstanceArrivalRateMeasurementCorrespondence_ServiceOperationInstanceCorrespondence();

/**
	 * Returns the meta object for class '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ServiceOperationInstanceArrivalRateMeasurementCorrespondence <em>Service Operation Instance Arrival Rate Measurement Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Operation Instance Arrival Rate Measurement Correspondence</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ServiceOperationInstanceArrivalRateMeasurementCorrespondence
	 * @generated
	 */
	EClass getServiceOperationInstanceArrivalRateMeasurementCorrespondence();

/**
	 * Returns the meta object for the container reference '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ServiceOperationInstanceArrivalRateMeasurementCorrespondence#getServiceInstanceArrivalRateMeasurementCorrespondence <em>Service Instance Arrival Rate Measurement Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Service Instance Arrival Rate Measurement Correspondence</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ServiceOperationInstanceArrivalRateMeasurementCorrespondence#getServiceInstanceArrivalRateMeasurementCorrespondence()
	 * @see #getServiceOperationInstanceArrivalRateMeasurementCorrespondence()
	 * @generated
	 */
	EReference getServiceOperationInstanceArrivalRateMeasurementCorrespondence_ServiceInstanceArrivalRateMeasurementCorrespondence();

/**
	 * Returns the meta object for the reference '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ServiceOperationInstanceArrivalRateMeasurementCorrespondence#getCactosServiceOperation <em>Cactos Service Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cactos Service Operation</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ServiceOperationInstanceArrivalRateMeasurementCorrespondence#getCactosServiceOperation()
	 * @see #getServiceOperationInstanceArrivalRateMeasurementCorrespondence()
	 * @generated
	 */
	EReference getServiceOperationInstanceArrivalRateMeasurementCorrespondence_CactosServiceOperation();

/**
	 * Returns the meta object for class '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ArrivalRateMeasurementCorrespondence <em>Arrival Rate Measurement Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arrival Rate Measurement Correspondence</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ArrivalRateMeasurementCorrespondence
	 * @generated
	 */
	EClass getArrivalRateMeasurementCorrespondence();

/**
	 * Returns the meta object for the containment reference list '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ArrivalRateMeasurementCorrespondence#getServiceInstanceMeasurementCorrespondences <em>Service Instance Measurement Correspondences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service Instance Measurement Correspondences</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ArrivalRateMeasurementCorrespondence#getServiceInstanceMeasurementCorrespondences()
	 * @see #getArrivalRateMeasurementCorrespondence()
	 * @generated
	 */
	EReference getArrivalRateMeasurementCorrespondence_ServiceInstanceMeasurementCorrespondences();

/**
	 * Returns the meta object for the container reference '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ArrivalRateMeasurementCorrespondence#getLogicalCorrespondenceRepository <em>Logical Correspondence Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Logical Correspondence Repository</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ArrivalRateMeasurementCorrespondence#getLogicalCorrespondenceRepository()
	 * @see #getArrivalRateMeasurementCorrespondence()
	 * @generated
	 */
	EReference getArrivalRateMeasurementCorrespondence_LogicalCorrespondenceRepository();

/**
	 * Returns the meta object for class '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ServiceOperationCorrespondence <em>Service Operation Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Operation Correspondence</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ServiceOperationCorrespondence
	 * @generated
	 */
	EClass getServiceOperationCorrespondence();

/**
	 * Returns the meta object for the container reference '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ServiceOperationCorrespondence#getLogicalCorrespondenceRepository <em>Logical Correspondence Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Logical Correspondence Repository</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ServiceOperationCorrespondence#getLogicalCorrespondenceRepository()
	 * @see #getServiceOperationCorrespondence()
	 * @generated
	 */
	EReference getServiceOperationCorrespondence_LogicalCorrespondenceRepository();

/**
	 * Returns the meta object for the reference '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ServiceOperationCorrespondence#getCactos <em>Cactos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cactos</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ServiceOperationCorrespondence#getCactos()
	 * @see #getServiceOperationCorrespondence()
	 * @generated
	 */
	EReference getServiceOperationCorrespondence_Cactos();

/**
	 * Returns the meta object for the reference '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ServiceOperationCorrespondence#getPalladio <em>Palladio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Palladio</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ServiceOperationCorrespondence#getPalladio()
	 * @see #getServiceOperationCorrespondence()
	 * @generated
	 */
	EReference getServiceOperationCorrespondence_Palladio();

/**
	 * Returns the meta object for class '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ApplicationProvidedServiceCorrespondence <em>Application Provided Service Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application Provided Service Correspondence</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ApplicationProvidedServiceCorrespondence
	 * @generated
	 */
	EClass getApplicationProvidedServiceCorrespondence();

/**
	 * Returns the meta object for the reference '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ApplicationProvidedServiceCorrespondence#getCactosApplication <em>Cactos Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cactos Application</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ApplicationProvidedServiceCorrespondence#getCactosApplication()
	 * @see #getApplicationProvidedServiceCorrespondence()
	 * @generated
	 */
	EReference getApplicationProvidedServiceCorrespondence_CactosApplication();

/**
	 * Returns the meta object for the reference '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ApplicationProvidedServiceCorrespondence#getPalladioSystemRole <em>Palladio System Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Palladio System Role</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ApplicationProvidedServiceCorrespondence#getPalladioSystemRole()
	 * @see #getApplicationProvidedServiceCorrespondence()
	 * @generated
	 */
	EReference getApplicationProvidedServiceCorrespondence_PalladioSystemRole();

/**
	 * Returns the meta object for the reference '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ApplicationProvidedServiceCorrespondence#getCactosRole <em>Cactos Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cactos Role</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ApplicationProvidedServiceCorrespondence#getCactosRole()
	 * @see #getApplicationProvidedServiceCorrespondence()
	 * @generated
	 */
	EReference getApplicationProvidedServiceCorrespondence_CactosRole();

/**
	 * Returns the meta object for the container reference '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ApplicationProvidedServiceCorrespondence#getLogicalCorrespondenceRepository <em>Logical Correspondence Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Logical Correspondence Repository</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ApplicationProvidedServiceCorrespondence#getLogicalCorrespondenceRepository()
	 * @see #getApplicationProvidedServiceCorrespondence()
	 * @generated
	 */
	EReference getApplicationProvidedServiceCorrespondence_LogicalCorrespondenceRepository();

/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LogicalcorrespondenceFactory getLogicalcorrespondenceFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.VirtualMemoryMeasurementCorrespondenceImpl <em>Virtual Memory Measurement Correspondence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.VirtualMemoryMeasurementCorrespondenceImpl
		 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.LogicalcorrespondencePackageImpl#getVirtualMemoryMeasurementCorrespondence()
		 * @generated
		 */
		EClass VIRTUAL_MEMORY_MEASUREMENT_CORRESPONDENCE = eINSTANCE.getVirtualMemoryMeasurementCorrespondence();

		/**
		 * The meta object literal for the '<em><b>Cactos</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_MEMORY_MEASUREMENT_CORRESPONDENCE__CACTOS = eINSTANCE.getVirtualMemoryMeasurementCorrespondence_Cactos();

		/**
		 * The meta object literal for the '<em><b>Logical Correspondence Repository</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_MEMORY_MEASUREMENT_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY = eINSTANCE.getVirtualMemoryMeasurementCorrespondence_LogicalCorrespondenceRepository();

		/**
		 * The meta object literal for the '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.VirtualNetworkInterconnectMeasurementCorrespondenceImpl <em>Virtual Network Interconnect Measurement Correspondence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.VirtualNetworkInterconnectMeasurementCorrespondenceImpl
		 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.LogicalcorrespondencePackageImpl#getVirtualNetworkInterconnectMeasurementCorrespondence()
		 * @generated
		 */
		EClass VIRTUAL_NETWORK_INTERCONNECT_MEASUREMENT_CORRESPONDENCE = eINSTANCE.getVirtualNetworkInterconnectMeasurementCorrespondence();

		/**
		 * The meta object literal for the '<em><b>Cactos</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_NETWORK_INTERCONNECT_MEASUREMENT_CORRESPONDENCE__CACTOS = eINSTANCE.getVirtualNetworkInterconnectMeasurementCorrespondence_Cactos();

		/**
		 * The meta object literal for the '<em><b>Logical Correspondence Repository</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_NETWORK_INTERCONNECT_MEASUREMENT_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY = eINSTANCE.getVirtualNetworkInterconnectMeasurementCorrespondence_LogicalCorrespondenceRepository();

		/**
		 * The meta object literal for the '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.VirtualProcessingUnitMeasurementCorrespondenceImpl <em>Virtual Processing Unit Measurement Correspondence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.VirtualProcessingUnitMeasurementCorrespondenceImpl
		 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.LogicalcorrespondencePackageImpl#getVirtualProcessingUnitMeasurementCorrespondence()
		 * @generated
		 */
		EClass VIRTUAL_PROCESSING_UNIT_MEASUREMENT_CORRESPONDENCE = eINSTANCE.getVirtualProcessingUnitMeasurementCorrespondence();

		/**
		 * The meta object literal for the '<em><b>Cactos</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_PROCESSING_UNIT_MEASUREMENT_CORRESPONDENCE__CACTOS = eINSTANCE.getVirtualProcessingUnitMeasurementCorrespondence_Cactos();

		/**
		 * The meta object literal for the '<em><b>Logical Correspondence Repository</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_PROCESSING_UNIT_MEASUREMENT_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY = eINSTANCE.getVirtualProcessingUnitMeasurementCorrespondence_LogicalCorrespondenceRepository();

		/**
		 * The meta object literal for the '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.LogicalDiskReadMeasurementCorrespondenceImpl <em>Logical Disk Read Measurement Correspondence</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.LogicalDiskReadMeasurementCorrespondenceImpl
		 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.LogicalcorrespondencePackageImpl#getLogicalDiskReadMeasurementCorrespondence()
		 * @generated
		 */
        EClass LOGICAL_DISK_READ_MEASUREMENT_CORRESPONDENCE = eINSTANCE.getLogicalDiskReadMeasurementCorrespondence();

        /**
		 * The meta object literal for the '<em><b>Cactos</b></em>' reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference LOGICAL_DISK_READ_MEASUREMENT_CORRESPONDENCE__CACTOS = eINSTANCE.getLogicalDiskReadMeasurementCorrespondence_Cactos();

        /**
		 * The meta object literal for the '<em><b>Logical Correspondence Repository</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference LOGICAL_DISK_READ_MEASUREMENT_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY = eINSTANCE.getLogicalDiskReadMeasurementCorrespondence_LogicalCorrespondenceRepository();

        /**
		 * The meta object literal for the '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.LogicalDiskWriteMeasurementCorrespondenceImpl <em>Logical Disk Write Measurement Correspondence</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.LogicalDiskWriteMeasurementCorrespondenceImpl
		 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.LogicalcorrespondencePackageImpl#getLogicalDiskWriteMeasurementCorrespondence()
		 * @generated
		 */
        EClass LOGICAL_DISK_WRITE_MEASUREMENT_CORRESPONDENCE = eINSTANCE.getLogicalDiskWriteMeasurementCorrespondence();

        /**
		 * The meta object literal for the '<em><b>Cactos</b></em>' reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference LOGICAL_DISK_WRITE_MEASUREMENT_CORRESPONDENCE__CACTOS = eINSTANCE.getLogicalDiskWriteMeasurementCorrespondence_Cactos();

        /**
		 * The meta object literal for the '<em><b>Logical Correspondence Repository</b></em>' reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference LOGICAL_DISK_WRITE_MEASUREMENT_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY = eINSTANCE.getLogicalDiskWriteMeasurementCorrespondence_LogicalCorrespondenceRepository();

        /**
		 * The meta object literal for the '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.LogicalCorrespondenceRepositoryImpl <em>Logical Correspondence Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.LogicalCorrespondenceRepositoryImpl
		 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.LogicalcorrespondencePackageImpl#getLogicalCorrespondenceRepository()
		 * @generated
		 */
		EClass LOGICAL_CORRESPONDENCE_REPOSITORY = eINSTANCE.getLogicalCorrespondenceRepository();

		/**
		 * The meta object literal for the '<em><b>Virtual Memory Measurement Correspondences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_CORRESPONDENCE_REPOSITORY__VIRTUAL_MEMORY_MEASUREMENT_CORRESPONDENCES = eINSTANCE.getLogicalCorrespondenceRepository_VirtualMemoryMeasurementCorrespondences();

		/**
		 * The meta object literal for the '<em><b>Virtual Network Interconnect Measurement Correspondences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_CORRESPONDENCE_REPOSITORY__VIRTUAL_NETWORK_INTERCONNECT_MEASUREMENT_CORRESPONDENCES = eINSTANCE.getLogicalCorrespondenceRepository_VirtualNetworkInterconnectMeasurementCorrespondences();

		/**
		 * The meta object literal for the '<em><b>Virtual Processing Unit Measurement Correspondences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_CORRESPONDENCE_REPOSITORY__VIRTUAL_PROCESSING_UNIT_MEASUREMENT_CORRESPONDENCES = eINSTANCE.getLogicalCorrespondenceRepository_VirtualProcessingUnitMeasurementCorrespondences();

		/**
		 * The meta object literal for the '<em><b>Volume Measurement Correspondences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_CORRESPONDENCE_REPOSITORY__VOLUME_MEASUREMENT_CORRESPONDENCES = eINSTANCE.getLogicalCorrespondenceRepository_VolumeMeasurementCorrespondences();

		/**
		 * The meta object literal for the '<em><b>Virtual Network Interconnects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_CORRESPONDENCE_REPOSITORY__VIRTUAL_NETWORK_INTERCONNECTS = eINSTANCE.getLogicalCorrespondenceRepository_VirtualNetworkInterconnects();

		/**
		 * The meta object literal for the '<em><b>Vm Image Correspondences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_CORRESPONDENCE_REPOSITORY__VM_IMAGE_CORRESPONDENCES = eINSTANCE.getLogicalCorrespondenceRepository_VmImageCorrespondences();

		/**
		 * The meta object literal for the '<em><b>Vm Image Instance Correspondences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_CORRESPONDENCE_REPOSITORY__VM_IMAGE_INSTANCE_CORRESPONDENCES = eINSTANCE.getLogicalCorrespondenceRepository_VmImageInstanceCorrespondences();

		/**
		 * The meta object literal for the '<em><b>Virtual Machine Correspondences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_CORRESPONDENCE_REPOSITORY__VIRTUAL_MACHINE_CORRESPONDENCES = eINSTANCE.getLogicalCorrespondenceRepository_VirtualMachineCorrespondences();

		/**
		 * The meta object literal for the '<em><b>Hypervisor Correspondences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference LOGICAL_CORRESPONDENCE_REPOSITORY__HYPERVISOR_CORRESPONDENCES = eINSTANCE.getLogicalCorrespondenceRepository_HypervisorCorrespondences();

        /**
		 * The meta object literal for the '<em><b>Network Attached Storage Correspondences</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference LOGICAL_CORRESPONDENCE_REPOSITORY__NETWORK_ATTACHED_STORAGE_CORRESPONDENCES = eINSTANCE.getLogicalCorrespondenceRepository_NetworkAttachedStorageCorrespondences();

        /**
		 * The meta object literal for the '<em><b>Logical Dc Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_CORRESPONDENCE_REPOSITORY__LOGICAL_DC_MODEL = eINSTANCE.getLogicalCorrespondenceRepository_LogicalDcModel();

		/**
		 * The meta object literal for the '<em><b>Logical Load Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_CORRESPONDENCE_REPOSITORY__LOGICAL_LOAD_MODEL = eINSTANCE.getLogicalCorrespondenceRepository_LogicalLoadModel();

		/**
		 * The meta object literal for the '<em><b>Correspondence Established</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGICAL_CORRESPONDENCE_REPOSITORY__CORRESPONDENCE_ESTABLISHED = eINSTANCE.getLogicalCorrespondenceRepository_CorrespondenceEstablished();

		/**
		 * The meta object literal for the '<em><b>Optimisation Plan Correspondence</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @generated
		 */
                EReference LOGICAL_CORRESPONDENCE_REPOSITORY__OPTIMISATION_PLAN_CORRESPONDENCE = eINSTANCE.getLogicalCorrespondenceRepository_OptimisationPlanCorrespondence();

                /**
		 * The meta object literal for the '<em><b>Provided Service Correspondences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @generated
		 */
                EReference LOGICAL_CORRESPONDENCE_REPOSITORY__PROVIDED_SERVICE_CORRESPONDENCES = eINSTANCE.getLogicalCorrespondenceRepository_ProvidedServiceCorrespondences();

                /**
		 * The meta object literal for the '<em><b>Required Service Correspondences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @generated
		 */
                EReference LOGICAL_CORRESPONDENCE_REPOSITORY__REQUIRED_SERVICE_CORRESPONDENCES = eINSTANCE.getLogicalCorrespondenceRepository_RequiredServiceCorrespondences();

                /**
		 * The meta object literal for the '<em><b>Scalable Connector Correspondences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @generated
		 */
                EReference LOGICAL_CORRESPONDENCE_REPOSITORY__SCALABLE_CONNECTOR_CORRESPONDENCES = eINSTANCE.getLogicalCorrespondenceRepository_ScalableConnectorCorrespondences();

                /**
		 * The meta object literal for the '<em><b>User Behaviour Correspondences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @generated
		 */
                EReference LOGICAL_CORRESPONDENCE_REPOSITORY__USER_BEHAVIOUR_CORRESPONDENCES = eINSTANCE.getLogicalCorrespondenceRepository_UserBehaviourCorrespondences();

                /**
		 * The meta object literal for the '<em><b>Arrival Rate Measurement Correspondences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_CORRESPONDENCE_REPOSITORY__ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCES = eINSTANCE.getLogicalCorrespondenceRepository_ArrivalRateMeasurementCorrespondences();

																/**
		 * The meta object literal for the '<em><b>Service Operation Correspondences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_CORRESPONDENCE_REPOSITORY__SERVICE_OPERATION_CORRESPONDENCES = eINSTANCE.getLogicalCorrespondenceRepository_ServiceOperationCorrespondences();

																/**
		 * The meta object literal for the '<em><b>Application Provided Service Correspondences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_CORRESPONDENCE_REPOSITORY__APPLICATION_PROVIDED_SERVICE_CORRESPONDENCES = eINSTANCE.getLogicalCorrespondenceRepository_ApplicationProvidedServiceCorrespondences();

																/**
		 * The meta object literal for the '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.VMImageInstanceCorrespondenceImpl <em>VM Image Instance Correspondence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.VMImageInstanceCorrespondenceImpl
		 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.LogicalcorrespondencePackageImpl#getVMImageInstanceCorrespondence()
		 * @generated
		 */
		EClass VM_IMAGE_INSTANCE_CORRESPONDENCE = eINSTANCE.getVMImageInstanceCorrespondence();

		/**
		 * The meta object literal for the '<em><b>Cactos</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VM_IMAGE_INSTANCE_CORRESPONDENCE__CACTOS = eINSTANCE.getVMImageInstanceCorrespondence_Cactos();

		/**
		 * The meta object literal for the '<em><b>Palladio</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VM_IMAGE_INSTANCE_CORRESPONDENCE__PALLADIO = eINSTANCE.getVMImageInstanceCorrespondence_Palladio();

		/**
		 * The meta object literal for the '<em><b>Logical Correspondence Repository</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VM_IMAGE_INSTANCE_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY = eINSTANCE.getVMImageInstanceCorrespondence_LogicalCorrespondenceRepository();

		/**
		 * The meta object literal for the '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.VMImageCorrespondenceImpl <em>VM Image Correspondence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.VMImageCorrespondenceImpl
		 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.LogicalcorrespondencePackageImpl#getVMImageCorrespondence()
		 * @generated
		 */
		EClass VM_IMAGE_CORRESPONDENCE = eINSTANCE.getVMImageCorrespondence();

		/**
		 * The meta object literal for the '<em><b>Cactos</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VM_IMAGE_CORRESPONDENCE__CACTOS = eINSTANCE.getVMImageCorrespondence_Cactos();

		/**
		 * The meta object literal for the '<em><b>Palladio</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VM_IMAGE_CORRESPONDENCE__PALLADIO = eINSTANCE.getVMImageCorrespondence_Palladio();

		/**
		 * The meta object literal for the '<em><b>Logical Correspondence Repository</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VM_IMAGE_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY = eINSTANCE.getVMImageCorrespondence_LogicalCorrespondenceRepository();

		/**
		 * The meta object literal for the '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.VirtualNetworkInterconnectCorrespondenceImpl <em>Virtual Network Interconnect Correspondence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.VirtualNetworkInterconnectCorrespondenceImpl
		 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.LogicalcorrespondencePackageImpl#getVirtualNetworkInterconnectCorrespondence()
		 * @generated
		 */
		EClass VIRTUAL_NETWORK_INTERCONNECT_CORRESPONDENCE = eINSTANCE.getVirtualNetworkInterconnectCorrespondence();

		/**
		 * The meta object literal for the '<em><b>Cactos</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_NETWORK_INTERCONNECT_CORRESPONDENCE__CACTOS = eINSTANCE.getVirtualNetworkInterconnectCorrespondence_Cactos();

		/**
		 * The meta object literal for the '<em><b>Palladio</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_NETWORK_INTERCONNECT_CORRESPONDENCE__PALLADIO = eINSTANCE.getVirtualNetworkInterconnectCorrespondence_Palladio();

		/**
		 * The meta object literal for the '<em><b>Logical Correspondence Repository</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_NETWORK_INTERCONNECT_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY = eINSTANCE.getVirtualNetworkInterconnectCorrespondence_LogicalCorrespondenceRepository();

		/**
		 * The meta object literal for the '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.VirtualMachineCorrespondenceImpl <em>Virtual Machine Correspondence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.VirtualMachineCorrespondenceImpl
		 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.LogicalcorrespondencePackageImpl#getVirtualMachineCorrespondence()
		 * @generated
		 */
		EClass VIRTUAL_MACHINE_CORRESPONDENCE = eINSTANCE.getVirtualMachineCorrespondence();

		/**
		 * The meta object literal for the '<em><b>Cactos</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_MACHINE_CORRESPONDENCE__CACTOS = eINSTANCE.getVirtualMachineCorrespondence_Cactos();

		/**
		 * The meta object literal for the '<em><b>Palladio</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_MACHINE_CORRESPONDENCE__PALLADIO = eINSTANCE.getVirtualMachineCorrespondence_Palladio();

		/**
		 * The meta object literal for the '<em><b>Logical Correspondence Repository</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_MACHINE_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY = eINSTANCE.getVirtualMachineCorrespondence_LogicalCorrespondenceRepository();

        /**
		 * The meta object literal for the '<em><b>Palladio Storage Connector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference VIRTUAL_MACHINE_CORRESPONDENCE__PALLADIO_STORAGE_CONNECTOR = eINSTANCE.getVirtualMachineCorrespondence_PalladioStorageConnector();

        /**
		 * The meta object literal for the '<em><b>Palladio Usage</b></em>' reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference VIRTUAL_MACHINE_CORRESPONDENCE__PALLADIO_USAGE = eINSTANCE.getVirtualMachineCorrespondence_PalladioUsage();

        /**
		 * The meta object literal for the '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.HypervisorCorrespondenceImpl <em>Hypervisor Correspondence</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.HypervisorCorrespondenceImpl
		 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.LogicalcorrespondencePackageImpl#getHypervisorCorrespondence()
		 * @generated
		 */
        EClass HYPERVISOR_CORRESPONDENCE = eINSTANCE.getHypervisorCorrespondence();

        /**
		 * The meta object literal for the '<em><b>Cactos</b></em>' reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference HYPERVISOR_CORRESPONDENCE__CACTOS = eINSTANCE.getHypervisorCorrespondence_Cactos();

        /**
		 * The meta object literal for the '<em><b>Palladio</b></em>' reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference HYPERVISOR_CORRESPONDENCE__PALLADIO = eINSTANCE.getHypervisorCorrespondence_Palladio();

        /**
		 * The meta object literal for the '<em><b>Logical Correspondence Repository</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference HYPERVISOR_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY = eINSTANCE.getHypervisorCorrespondence_LogicalCorrespondenceRepository();

        /**
		 * The meta object literal for the '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.NetworkAttachedStorageCorrespondenceImpl <em>Network Attached Storage Correspondence</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.NetworkAttachedStorageCorrespondenceImpl
		 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.LogicalcorrespondencePackageImpl#getNetworkAttachedStorageCorrespondence()
		 * @generated
		 */
        EClass NETWORK_ATTACHED_STORAGE_CORRESPONDENCE = eINSTANCE.getNetworkAttachedStorageCorrespondence();

        /**
		 * The meta object literal for the '<em><b>Cactos</b></em>' reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference NETWORK_ATTACHED_STORAGE_CORRESPONDENCE__CACTOS = eINSTANCE.getNetworkAttachedStorageCorrespondence_Cactos();

        /**
		 * The meta object literal for the '<em><b>Palladio</b></em>' reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference NETWORK_ATTACHED_STORAGE_CORRESPONDENCE__PALLADIO = eINSTANCE.getNetworkAttachedStorageCorrespondence_Palladio();

        /**
		 * The meta object literal for the '<em><b>Logical Correspondence Repository</b></em>' reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference NETWORK_ATTACHED_STORAGE_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY = eINSTANCE.getNetworkAttachedStorageCorrespondence_LogicalCorrespondenceRepository();

        /**
		 * The meta object literal for the '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.OptimisationPlanCorrespondenceImpl <em>Optimisation Plan Correspondence</em>}' class.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.OptimisationPlanCorrespondenceImpl
		 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.LogicalcorrespondencePackageImpl#getOptimisationPlanCorrespondence()
		 * @generated
		 */
                EClass OPTIMISATION_PLAN_CORRESPONDENCE = eINSTANCE.getOptimisationPlanCorrespondence();

        /**
		 * The meta object literal for the '<em><b>Last Optimisation Plan</b></em>' reference feature.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @generated
		 */
                EReference OPTIMISATION_PLAN_CORRESPONDENCE__LAST_OPTIMISATION_PLAN = eINSTANCE.getOptimisationPlanCorrespondence_LastOptimisationPlan();

        /**
		 * The meta object literal for the '<em><b>Logical Correspondence Repository</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @generated
		 */
                EReference OPTIMISATION_PLAN_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY = eINSTANCE.getOptimisationPlanCorrespondence_LogicalCorrespondenceRepository();

        /**
		 * The meta object literal for the '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.ProvidedServiceCorrespondenceImpl <em>Provided Service Correspondence</em>}' class.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.ProvidedServiceCorrespondenceImpl
		 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.LogicalcorrespondencePackageImpl#getProvidedServiceCorrespondence()
		 * @generated
		 */
                EClass PROVIDED_SERVICE_CORRESPONDENCE = eINSTANCE.getProvidedServiceCorrespondence();

        /**
		 * The meta object literal for the '<em><b>Cactos Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @generated
		 */
                EReference PROVIDED_SERVICE_CORRESPONDENCE__CACTOS_ROLE = eINSTANCE.getProvidedServiceCorrespondence_CactosRole();

        /**
		 * The meta object literal for the '<em><b>Cactos VM</b></em>' reference feature.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @generated
		 */
                EReference PROVIDED_SERVICE_CORRESPONDENCE__CACTOS_VM = eINSTANCE.getProvidedServiceCorrespondence_CactosVM();

        /**
		 * The meta object literal for the '<em><b>Palladio Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @generated
		 */
                EReference PROVIDED_SERVICE_CORRESPONDENCE__PALLADIO_ROLE = eINSTANCE.getProvidedServiceCorrespondence_PalladioRole();

        /**
		 * The meta object literal for the '<em><b>Logical Correspondence Repository</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @generated
		 */
                EReference PROVIDED_SERVICE_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY = eINSTANCE.getProvidedServiceCorrespondence_LogicalCorrespondenceRepository();

        /**
		 * The meta object literal for the '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.RequiredServiceCorrespondenceImpl <em>Required Service Correspondence</em>}' class.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.RequiredServiceCorrespondenceImpl
		 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.LogicalcorrespondencePackageImpl#getRequiredServiceCorrespondence()
		 * @generated
		 */
                EClass REQUIRED_SERVICE_CORRESPONDENCE = eINSTANCE.getRequiredServiceCorrespondence();

        /**
		 * The meta object literal for the '<em><b>Cactos Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @generated
		 */
                EReference REQUIRED_SERVICE_CORRESPONDENCE__CACTOS_ROLE = eINSTANCE.getRequiredServiceCorrespondence_CactosRole();

        /**
		 * The meta object literal for the '<em><b>Cactos VM</b></em>' reference feature.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @generated
		 */
                EReference REQUIRED_SERVICE_CORRESPONDENCE__CACTOS_VM = eINSTANCE.getRequiredServiceCorrespondence_CactosVM();

        /**
		 * The meta object literal for the '<em><b>Palladio Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @generated
		 */
                EReference REQUIRED_SERVICE_CORRESPONDENCE__PALLADIO_ROLE = eINSTANCE.getRequiredServiceCorrespondence_PalladioRole();

        /**
		 * The meta object literal for the '<em><b>Logical Correspondence Repository</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @generated
		 */
                EReference REQUIRED_SERVICE_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY = eINSTANCE.getRequiredServiceCorrespondence_LogicalCorrespondenceRepository();

        /**
		 * The meta object literal for the '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.ScalableVMImageConnectorCorrespondenceImpl <em>Scalable VM Image Connector Correspondence</em>}' class.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.ScalableVMImageConnectorCorrespondenceImpl
		 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.LogicalcorrespondencePackageImpl#getScalableVMImageConnectorCorrespondence()
		 * @generated
		 */
                EClass SCALABLE_VM_IMAGE_CONNECTOR_CORRESPONDENCE = eINSTANCE.getScalableVMImageConnectorCorrespondence();

        /**
		 * The meta object literal for the '<em><b>Cactos Connector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @generated
		 */
                EReference SCALABLE_VM_IMAGE_CONNECTOR_CORRESPONDENCE__CACTOS_CONNECTOR = eINSTANCE.getScalableVMImageConnectorCorrespondence_CactosConnector();

        /**
		 * The meta object literal for the '<em><b>Palladio</b></em>' reference feature.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @generated
		 */
                EReference SCALABLE_VM_IMAGE_CONNECTOR_CORRESPONDENCE__PALLADIO = eINSTANCE.getScalableVMImageConnectorCorrespondence_Palladio();

        /**
		 * The meta object literal for the '<em><b>Logical Correspondence Repository</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @generated
		 */
                EReference SCALABLE_VM_IMAGE_CONNECTOR_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY = eINSTANCE.getScalableVMImageConnectorCorrespondence_LogicalCorrespondenceRepository();

        /**
		 * The meta object literal for the '<em><b>Maximum Instance Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCALABLE_VM_IMAGE_CONNECTOR_CORRESPONDENCE__MAXIMUM_INSTANCE_NUMBER = eINSTANCE.getScalableVMImageConnectorCorrespondence_MaximumInstanceNumber();

								/**
		 * The meta object literal for the '<em><b>Cactos Application Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @generated
		 */
                EReference SCALABLE_VM_IMAGE_CONNECTOR_CORRESPONDENCE__CACTOS_APPLICATION_INSTANCE = eINSTANCE.getScalableVMImageConnectorCorrespondence_CactosApplicationInstance();

        /**
		 * The meta object literal for the '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.UserBehaviourCorrespondenceImpl <em>User Behaviour Correspondence</em>}' class.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.UserBehaviourCorrespondenceImpl
		 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.LogicalcorrespondencePackageImpl#getUserBehaviourCorrespondence()
		 * @generated
		 */
                EClass USER_BEHAVIOUR_CORRESPONDENCE = eINSTANCE.getUserBehaviourCorrespondence();

        /**
		 * The meta object literal for the '<em><b>Logical Correspondence Repository</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @generated
		 */
                EReference USER_BEHAVIOUR_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY = eINSTANCE.getUserBehaviourCorrespondence_LogicalCorrespondenceRepository();

        /**
		 * The meta object literal for the '<em><b>Cactos User Behaviour</b></em>' reference feature.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @generated
		 */
                EReference USER_BEHAVIOUR_CORRESPONDENCE__CACTOS_USER_BEHAVIOUR = eINSTANCE.getUserBehaviourCorrespondence_CactosUserBehaviour();

        /**
		 * The meta object literal for the '<em><b>Palladio Usage</b></em>' reference feature.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @generated
		 */
                EReference USER_BEHAVIOUR_CORRESPONDENCE__PALLADIO_USAGE = eINSTANCE.getUserBehaviourCorrespondence_PalladioUsage();

								/**
		 * The meta object literal for the '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.RequestArrivalRateMeasurementCorrespondenceImpl <em>Request Arrival Rate Measurement Correspondence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.RequestArrivalRateMeasurementCorrespondenceImpl
		 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.LogicalcorrespondencePackageImpl#getRequestArrivalRateMeasurementCorrespondence()
		 * @generated
		 */
		EClass REQUEST_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE = eINSTANCE.getRequestArrivalRateMeasurementCorrespondence();

								/**
		 * The meta object literal for the '<em><b>Request Arrival Rate Measurement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUEST_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__REQUEST_ARRIVAL_RATE_MEASUREMENT = eINSTANCE.getRequestArrivalRateMeasurementCorrespondence_RequestArrivalRateMeasurement();

								/**
		 * The meta object literal for the '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.ResponseArrivalRateMeasurementCorrespondenceImpl <em>Response Arrival Rate Measurement Correspondence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.ResponseArrivalRateMeasurementCorrespondenceImpl
		 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.LogicalcorrespondencePackageImpl#getResponseArrivalRateMeasurementCorrespondence()
		 * @generated
		 */
		EClass RESPONSE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE = eINSTANCE.getResponseArrivalRateMeasurementCorrespondence();

								/**
		 * The meta object literal for the '<em><b>Response Arrival Rate Measurement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__RESPONSE_ARRIVAL_RATE_MEASUREMENT = eINSTANCE.getResponseArrivalRateMeasurementCorrespondence_ResponseArrivalRateMeasurement();

								/**
		 * The meta object literal for the '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.ServiceInstanceArrivalRateMeasurementCorrespondenceImpl <em>Service Instance Arrival Rate Measurement Correspondence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.ServiceInstanceArrivalRateMeasurementCorrespondenceImpl
		 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.LogicalcorrespondencePackageImpl#getServiceInstanceArrivalRateMeasurementCorrespondence()
		 * @generated
		 */
		EClass SERVICE_INSTANCE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE = eINSTANCE.getServiceInstanceArrivalRateMeasurementCorrespondence();

								/**
		 * The meta object literal for the '<em><b>Arrival Rate Measurement Correspondence</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_INSTANCE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE = eINSTANCE.getServiceInstanceArrivalRateMeasurementCorrespondence_ArrivalRateMeasurementCorrespondence();

								/**
		 * The meta object literal for the '<em><b>Cactos Service Correspondence</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_INSTANCE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__CACTOS_SERVICE_CORRESPONDENCE = eINSTANCE.getServiceInstanceArrivalRateMeasurementCorrespondence_CactosServiceCorrespondence();

								/**
		 * The meta object literal for the '<em><b>Service Operation Instance Correspondence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_INSTANCE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__SERVICE_OPERATION_INSTANCE_CORRESPONDENCE = eINSTANCE.getServiceInstanceArrivalRateMeasurementCorrespondence_ServiceOperationInstanceCorrespondence();

								/**
		 * The meta object literal for the '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.ServiceOperationInstanceArrivalRateMeasurementCorrespondenceImpl <em>Service Operation Instance Arrival Rate Measurement Correspondence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.ServiceOperationInstanceArrivalRateMeasurementCorrespondenceImpl
		 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.LogicalcorrespondencePackageImpl#getServiceOperationInstanceArrivalRateMeasurementCorrespondence()
		 * @generated
		 */
		EClass SERVICE_OPERATION_INSTANCE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE = eINSTANCE.getServiceOperationInstanceArrivalRateMeasurementCorrespondence();

								/**
		 * The meta object literal for the '<em><b>Service Instance Arrival Rate Measurement Correspondence</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_OPERATION_INSTANCE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__SERVICE_INSTANCE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE = eINSTANCE.getServiceOperationInstanceArrivalRateMeasurementCorrespondence_ServiceInstanceArrivalRateMeasurementCorrespondence();

								/**
		 * The meta object literal for the '<em><b>Cactos Service Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_OPERATION_INSTANCE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__CACTOS_SERVICE_OPERATION = eINSTANCE.getServiceOperationInstanceArrivalRateMeasurementCorrespondence_CactosServiceOperation();

								/**
		 * The meta object literal for the '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.ArrivalRateMeasurementCorrespondenceImpl <em>Arrival Rate Measurement Correspondence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.ArrivalRateMeasurementCorrespondenceImpl
		 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.LogicalcorrespondencePackageImpl#getArrivalRateMeasurementCorrespondence()
		 * @generated
		 */
		EClass ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE = eINSTANCE.getArrivalRateMeasurementCorrespondence();

								/**
		 * The meta object literal for the '<em><b>Service Instance Measurement Correspondences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__SERVICE_INSTANCE_MEASUREMENT_CORRESPONDENCES = eINSTANCE.getArrivalRateMeasurementCorrespondence_ServiceInstanceMeasurementCorrespondences();

								/**
		 * The meta object literal for the '<em><b>Logical Correspondence Repository</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY = eINSTANCE.getArrivalRateMeasurementCorrespondence_LogicalCorrespondenceRepository();

								/**
		 * The meta object literal for the '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.ServiceOperationCorrespondenceImpl <em>Service Operation Correspondence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.ServiceOperationCorrespondenceImpl
		 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.LogicalcorrespondencePackageImpl#getServiceOperationCorrespondence()
		 * @generated
		 */
		EClass SERVICE_OPERATION_CORRESPONDENCE = eINSTANCE.getServiceOperationCorrespondence();

								/**
		 * The meta object literal for the '<em><b>Logical Correspondence Repository</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_OPERATION_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY = eINSTANCE.getServiceOperationCorrespondence_LogicalCorrespondenceRepository();

								/**
		 * The meta object literal for the '<em><b>Cactos</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_OPERATION_CORRESPONDENCE__CACTOS = eINSTANCE.getServiceOperationCorrespondence_Cactos();

								/**
		 * The meta object literal for the '<em><b>Palladio</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_OPERATION_CORRESPONDENCE__PALLADIO = eINSTANCE.getServiceOperationCorrespondence_Palladio();

								/**
		 * The meta object literal for the '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.ApplicationProvidedServiceCorrespondenceImpl <em>Application Provided Service Correspondence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.ApplicationProvidedServiceCorrespondenceImpl
		 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.LogicalcorrespondencePackageImpl#getApplicationProvidedServiceCorrespondence()
		 * @generated
		 */
		EClass APPLICATION_PROVIDED_SERVICE_CORRESPONDENCE = eINSTANCE.getApplicationProvidedServiceCorrespondence();

								/**
		 * The meta object literal for the '<em><b>Cactos Application</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION_PROVIDED_SERVICE_CORRESPONDENCE__CACTOS_APPLICATION = eINSTANCE.getApplicationProvidedServiceCorrespondence_CactosApplication();

								/**
		 * The meta object literal for the '<em><b>Palladio System Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION_PROVIDED_SERVICE_CORRESPONDENCE__PALLADIO_SYSTEM_ROLE = eINSTANCE.getApplicationProvidedServiceCorrespondence_PalladioSystemRole();

								/**
		 * The meta object literal for the '<em><b>Cactos Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION_PROVIDED_SERVICE_CORRESPONDENCE__CACTOS_ROLE = eINSTANCE.getApplicationProvidedServiceCorrespondence_CactosRole();

								/**
		 * The meta object literal for the '<em><b>Logical Correspondence Repository</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION_PROVIDED_SERVICE_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY = eINSTANCE.getApplicationProvidedServiceCorrespondence_LogicalCorrespondenceRepository();

	}

} //LogicalcorrespondencePackage
