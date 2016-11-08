/**
 */
package eu.cactosfp7.cactosim.correspondence.physicalcorrespondence;

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
 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalcorrespondenceFactory
 * @model kind="package"
 * @generated
 */
public interface PhysicalcorrespondencePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "physicalcorrespondence";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.cactosfp7.eu/Correspondence/Physical/1.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "physicalcorrespondence";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PhysicalcorrespondencePackage eINSTANCE = eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.PhysicalcorrespondencePackageImpl.init();

	/**
	 * The meta object id for the '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.PuMeasurementCorrespondenceImpl <em>Pu Measurement Correspondence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.PuMeasurementCorrespondenceImpl
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.PhysicalcorrespondencePackageImpl#getPuMeasurementCorrespondence()
	 * @generated
	 */
	int PU_MEASUREMENT_CORRESPONDENCE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_MEASUREMENT_CORRESPONDENCE__ID = CorrespondencePackage.LOAD_CORRESPONDENCE__ID;

	/**
	 * The feature id for the '<em><b>Palladio</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_MEASUREMENT_CORRESPONDENCE__PALLADIO = CorrespondencePackage.LOAD_CORRESPONDENCE__PALLADIO;

	/**
	 * The feature id for the '<em><b>Cactos</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_MEASUREMENT_CORRESPONDENCE__CACTOS = CorrespondencePackage.LOAD_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Physical Correspondence Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_MEASUREMENT_CORRESPONDENCE__PHYSICAL_CORRESPONDENCE_REPOSITORY = CorrespondencePackage.LOAD_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pu Measurement Correspondence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_MEASUREMENT_CORRESPONDENCE_FEATURE_COUNT = CorrespondencePackage.LOAD_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.MemoryMeasurementCorrespondenceImpl <em>Memory Measurement Correspondence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.MemoryMeasurementCorrespondenceImpl
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.PhysicalcorrespondencePackageImpl#getMemoryMeasurementCorrespondence()
	 * @generated
	 */
	int MEMORY_MEASUREMENT_CORRESPONDENCE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_MEASUREMENT_CORRESPONDENCE__ID = CorrespondencePackage.LOAD_CORRESPONDENCE__ID;

	/**
	 * The feature id for the '<em><b>Palladio</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_MEASUREMENT_CORRESPONDENCE__PALLADIO = CorrespondencePackage.LOAD_CORRESPONDENCE__PALLADIO;

	/**
	 * The feature id for the '<em><b>Cactos</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_MEASUREMENT_CORRESPONDENCE__CACTOS = CorrespondencePackage.LOAD_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Physical Correspondence Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_MEASUREMENT_CORRESPONDENCE__PHYSICAL_CORRESPONDENCE_REPOSITORY = CorrespondencePackage.LOAD_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Memory Measurement Correspondence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_MEASUREMENT_CORRESPONDENCE_FEATURE_COUNT = CorrespondencePackage.LOAD_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.StorageMeasurementCorrespondenceImpl <em>Storage Measurement Correspondence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.StorageMeasurementCorrespondenceImpl
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.PhysicalcorrespondencePackageImpl#getStorageMeasurementCorrespondence()
	 * @generated
	 */
	int STORAGE_MEASUREMENT_CORRESPONDENCE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_MEASUREMENT_CORRESPONDENCE__ID = CorrespondencePackage.LOAD_CORRESPONDENCE__ID;

	/**
	 * The feature id for the '<em><b>Palladio</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_MEASUREMENT_CORRESPONDENCE__PALLADIO = CorrespondencePackage.LOAD_CORRESPONDENCE__PALLADIO;

	/**
	 * The feature id for the '<em><b>Cactos</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_MEASUREMENT_CORRESPONDENCE__CACTOS = CorrespondencePackage.LOAD_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Physical Correspondence Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_MEASUREMENT_CORRESPONDENCE__PHYSICAL_CORRESPONDENCE_REPOSITORY = CorrespondencePackage.LOAD_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Storage Measurement Correspondence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_MEASUREMENT_CORRESPONDENCE_FEATURE_COUNT = CorrespondencePackage.LOAD_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.InterconnectMeasurementCorrespondenceImpl <em>Interconnect Measurement Correspondence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.InterconnectMeasurementCorrespondenceImpl
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.PhysicalcorrespondencePackageImpl#getInterconnectMeasurementCorrespondence()
	 * @generated
	 */
	int INTERCONNECT_MEASUREMENT_CORRESPONDENCE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCONNECT_MEASUREMENT_CORRESPONDENCE__ID = CorrespondencePackage.LOAD_CORRESPONDENCE__ID;

	/**
	 * The feature id for the '<em><b>Palladio</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCONNECT_MEASUREMENT_CORRESPONDENCE__PALLADIO = CorrespondencePackage.LOAD_CORRESPONDENCE__PALLADIO;

	/**
	 * The feature id for the '<em><b>Cactos</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCONNECT_MEASUREMENT_CORRESPONDENCE__CACTOS = CorrespondencePackage.LOAD_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Physical Correspondence Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCONNECT_MEASUREMENT_CORRESPONDENCE__PHYSICAL_CORRESPONDENCE_REPOSITORY = CorrespondencePackage.LOAD_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Interconnect Measurement Correspondence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCONNECT_MEASUREMENT_CORRESPONDENCE_FEATURE_COUNT = CorrespondencePackage.LOAD_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.PhysicalCorrespondenceRepositoryImpl <em>Physical Correspondence Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.PhysicalCorrespondenceRepositoryImpl
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.PhysicalcorrespondencePackageImpl#getPhysicalCorrespondenceRepository()
	 * @generated
	 */
	int PHYSICAL_CORRESPONDENCE_REPOSITORY = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CORRESPONDENCE_REPOSITORY__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Correspondence Established</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CORRESPONDENCE_REPOSITORY__CORRESPONDENCE_ESTABLISHED = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pu Measurement Correspondences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CORRESPONDENCE_REPOSITORY__PU_MEASUREMENT_CORRESPONDENCES = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Memory Measurement Correspondences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CORRESPONDENCE_REPOSITORY__MEMORY_MEASUREMENT_CORRESPONDENCES = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Storage Measurement Correspondences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CORRESPONDENCE_REPOSITORY__STORAGE_MEASUREMENT_CORRESPONDENCES = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Interconnect Measurement Correspondences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CORRESPONDENCE_REPOSITORY__INTERCONNECT_MEASUREMENT_CORRESPONDENCES = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Switch Correspondences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CORRESPONDENCE_REPOSITORY__SWITCH_CORRESPONDENCES = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Rack Correspondences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CORRESPONDENCE_REPOSITORY__RACK_CORRESPONDENCES = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Abstract Node Correspondences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CORRESPONDENCE_REPOSITORY__ABSTRACT_NODE_CORRESPONDENCES = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Memory Specification Correspondences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CORRESPONDENCE_REPOSITORY__MEMORY_SPECIFICATION_CORRESPONDENCES = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Storage Specification Correspondences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CORRESPONDENCE_REPOSITORY__STORAGE_SPECIFICATION_CORRESPONDENCES = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Network Interconnect Correspondences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CORRESPONDENCE_REPOSITORY__NETWORK_INTERCONNECT_CORRESPONDENCES = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Processing Unit Specification Correspondences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CORRESPONDENCE_REPOSITORY__PROCESSING_UNIT_SPECIFICATION_CORRESPONDENCES = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Physical Dc Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CORRESPONDENCE_REPOSITORY__PHYSICAL_DC_MODEL = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Physical Load Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CORRESPONDENCE_REPOSITORY__PHYSICAL_LOAD_MODEL = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Power Consuming Entity Measurement Correspondences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CORRESPONDENCE_REPOSITORY__POWER_CONSUMING_ENTITY_MEASUREMENT_CORRESPONDENCES = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Power Providing Entity Correspondences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CORRESPONDENCE_REPOSITORY__POWER_PROVIDING_ENTITY_CORRESPONDENCES = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Power Consuming Resource Correspondences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CORRESPONDENCE_REPOSITORY__POWER_CONSUMING_RESOURCE_CORRESPONDENCES = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Architecture Type Correspondences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int PHYSICAL_CORRESPONDENCE_REPOSITORY__ARCHITECTURE_TYPE_CORRESPONDENCES = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 17;

    /**
	 * The number of structural features of the '<em>Physical Correspondence Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CORRESPONDENCE_REPOSITORY_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 18;

	/**
	 * The meta object id for the '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.SwitchCorrespondenceImpl <em>Switch Correspondence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.SwitchCorrespondenceImpl
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.PhysicalcorrespondencePackageImpl#getSwitchCorrespondence()
	 * @generated
	 */
	int SWITCH_CORRESPONDENCE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_CORRESPONDENCE__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Cactos</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_CORRESPONDENCE__CACTOS = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Palladio</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_CORRESPONDENCE__PALLADIO = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Physical Correspondence Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_CORRESPONDENCE__PHYSICAL_CORRESPONDENCE_REPOSITORY = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Switch Correspondence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_CORRESPONDENCE_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.RackCorrespondenceImpl <em>Rack Correspondence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.RackCorrespondenceImpl
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.PhysicalcorrespondencePackageImpl#getRackCorrespondence()
	 * @generated
	 */
	int RACK_CORRESPONDENCE = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RACK_CORRESPONDENCE__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Cactos</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RACK_CORRESPONDENCE__CACTOS = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Palladio</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RACK_CORRESPONDENCE__PALLADIO = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Physical Correspondence Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RACK_CORRESPONDENCE__PHYSICAL_CORRESPONDENCE_REPOSITORY = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Rack Correspondence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RACK_CORRESPONDENCE_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.AbstractNodeCorrespondenceImpl <em>Abstract Node Correspondence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.AbstractNodeCorrespondenceImpl
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.PhysicalcorrespondencePackageImpl#getAbstractNodeCorrespondence()
	 * @generated
	 */
	int ABSTRACT_NODE_CORRESPONDENCE = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE_CORRESPONDENCE__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Cactos</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE_CORRESPONDENCE__CACTOS = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Palladio</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE_CORRESPONDENCE__PALLADIO = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Physical Correspondence Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE_CORRESPONDENCE__PHYSICAL_CORRESPONDENCE_REPOSITORY = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Abstract Node Correspondence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE_CORRESPONDENCE_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.MemorySpecificationCorrespondenceImpl <em>Memory Specification Correspondence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.MemorySpecificationCorrespondenceImpl
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.PhysicalcorrespondencePackageImpl#getMemorySpecificationCorrespondence()
	 * @generated
	 */
	int MEMORY_SPECIFICATION_CORRESPONDENCE = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_SPECIFICATION_CORRESPONDENCE__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Cactos</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_SPECIFICATION_CORRESPONDENCE__CACTOS = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Palladio</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_SPECIFICATION_CORRESPONDENCE__PALLADIO = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Physical Correspondence Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_SPECIFICATION_CORRESPONDENCE__PHYSICAL_CORRESPONDENCE_REPOSITORY = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Memory Specification Correspondence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_SPECIFICATION_CORRESPONDENCE_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.StorageSpecificationCorrespondenceImpl <em>Storage Specification Correspondence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.StorageSpecificationCorrespondenceImpl
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.PhysicalcorrespondencePackageImpl#getStorageSpecificationCorrespondence()
	 * @generated
	 */
	int STORAGE_SPECIFICATION_CORRESPONDENCE = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_SPECIFICATION_CORRESPONDENCE__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Cactos</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_SPECIFICATION_CORRESPONDENCE__CACTOS = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Palladio</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_SPECIFICATION_CORRESPONDENCE__PALLADIO = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Physical Correspondence Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_SPECIFICATION_CORRESPONDENCE__PHYSICAL_CORRESPONDENCE_REPOSITORY = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Storage Specification Correspondence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_SPECIFICATION_CORRESPONDENCE_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.NetworkInterconnectCorrespondenceImpl <em>Network Interconnect Correspondence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.NetworkInterconnectCorrespondenceImpl
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.PhysicalcorrespondencePackageImpl#getNetworkInterconnectCorrespondence()
	 * @generated
	 */
	int NETWORK_INTERCONNECT_CORRESPONDENCE = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INTERCONNECT_CORRESPONDENCE__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Cactos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INTERCONNECT_CORRESPONDENCE__CACTOS = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Palladio</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INTERCONNECT_CORRESPONDENCE__PALLADIO = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Physical Correspondence Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INTERCONNECT_CORRESPONDENCE__PHYSICAL_CORRESPONDENCE_REPOSITORY = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Reconfiguration Controller</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int NETWORK_INTERCONNECT_CORRESPONDENCE__RECONFIGURATION_CONTROLLER = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 3;

    /**
	 * The number of structural features of the '<em>Network Interconnect Correspondence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INTERCONNECT_CORRESPONDENCE_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.ProcessingUnitSpecificationCorrespondenceImpl <em>Processing Unit Specification Correspondence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.ProcessingUnitSpecificationCorrespondenceImpl
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.PhysicalcorrespondencePackageImpl#getProcessingUnitSpecificationCorrespondence()
	 * @generated
	 */
	int PROCESSING_UNIT_SPECIFICATION_CORRESPONDENCE = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_UNIT_SPECIFICATION_CORRESPONDENCE__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Cactos</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_UNIT_SPECIFICATION_CORRESPONDENCE__CACTOS = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Palladio</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_UNIT_SPECIFICATION_CORRESPONDENCE__PALLADIO = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Physical Correspondence Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_UNIT_SPECIFICATION_CORRESPONDENCE__PHYSICAL_CORRESPONDENCE_REPOSITORY = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Processing Unit Specification Correspondence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_UNIT_SPECIFICATION_CORRESPONDENCE_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.PowerConsumingEntityMeasurementCorrespondenceImpl <em>Power Consuming Entity Measurement Correspondence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.PowerConsumingEntityMeasurementCorrespondenceImpl
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.PhysicalcorrespondencePackageImpl#getPowerConsumingEntityMeasurementCorrespondence()
	 * @generated
	 */
	int POWER_CONSUMING_ENTITY_MEASUREMENT_CORRESPONDENCE = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CONSUMING_ENTITY_MEASUREMENT_CORRESPONDENCE__ID = CorrespondencePackage.LOAD_CORRESPONDENCE__ID;

	/**
	 * The feature id for the '<em><b>Palladio</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CONSUMING_ENTITY_MEASUREMENT_CORRESPONDENCE__PALLADIO = CorrespondencePackage.LOAD_CORRESPONDENCE__PALLADIO;

	/**
	 * The feature id for the '<em><b>Cactos</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CONSUMING_ENTITY_MEASUREMENT_CORRESPONDENCE__CACTOS = CorrespondencePackage.LOAD_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Physical Correspondence Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CONSUMING_ENTITY_MEASUREMENT_CORRESPONDENCE__PHYSICAL_CORRESPONDENCE_REPOSITORY = CorrespondencePackage.LOAD_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Power Consuming Entity Measurement Correspondence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CONSUMING_ENTITY_MEASUREMENT_CORRESPONDENCE_FEATURE_COUNT = CorrespondencePackage.LOAD_CORRESPONDENCE_FEATURE_COUNT + 2;


	/**
	 * The meta object id for the '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.PowerProvidingEntityCorrespondenceImpl <em>Power Providing Entity Correspondence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.PowerProvidingEntityCorrespondenceImpl
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.PhysicalcorrespondencePackageImpl#getPowerProvidingEntityCorrespondence()
	 * @generated
	 */
	int POWER_PROVIDING_ENTITY_CORRESPONDENCE = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_PROVIDING_ENTITY_CORRESPONDENCE__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Cactos</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_PROVIDING_ENTITY_CORRESPONDENCE__CACTOS = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Palladio</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_PROVIDING_ENTITY_CORRESPONDENCE__PALLADIO = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Physical Correspondence Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_PROVIDING_ENTITY_CORRESPONDENCE__PHYSICAL_CORRESPONDENCE_REPOSITORY = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Power Providing Entity Correspondence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_PROVIDING_ENTITY_CORRESPONDENCE_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.PowerConsumingResourceCorrespondenceImpl <em>Power Consuming Resource Correspondence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.PowerConsumingResourceCorrespondenceImpl
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.PhysicalcorrespondencePackageImpl#getPowerConsumingResourceCorrespondence()
	 * @generated
	 */
	int POWER_CONSUMING_RESOURCE_CORRESPONDENCE = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CONSUMING_RESOURCE_CORRESPONDENCE__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Cactos</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CONSUMING_RESOURCE_CORRESPONDENCE__CACTOS = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Palladio</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CONSUMING_RESOURCE_CORRESPONDENCE__PALLADIO = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Physical Correspondence Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CONSUMING_RESOURCE_CORRESPONDENCE__PHYSICAL_CORRESPONDENCE_REPOSITORY = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Power Consuming Resource Correspondence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CONSUMING_RESOURCE_CORRESPONDENCE_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 3;


	/**
	 * The meta object id for the '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.ArchitectureTypeCorrespondenceImpl <em>Architecture Type Correspondence</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.ArchitectureTypeCorrespondenceImpl
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.PhysicalcorrespondencePackageImpl#getArchitectureTypeCorrespondence()
	 * @generated
	 */
    int ARCHITECTURE_TYPE_CORRESPONDENCE = 15;

    /**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ARCHITECTURE_TYPE_CORRESPONDENCE__ID = IdentifierPackage.IDENTIFIER__ID;

    /**
	 * The feature id for the '<em><b>Cactos</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ARCHITECTURE_TYPE_CORRESPONDENCE__CACTOS = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

    /**
	 * The feature id for the '<em><b>Palladio</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ARCHITECTURE_TYPE_CORRESPONDENCE__PALLADIO = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

    /**
	 * The feature id for the '<em><b>Physical Correspondence Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ARCHITECTURE_TYPE_CORRESPONDENCE__PHYSICAL_CORRESPONDENCE_REPOSITORY = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

    /**
	 * The number of structural features of the '<em>Architecture Type Correspondence</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ARCHITECTURE_TYPE_CORRESPONDENCE_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 3;


    /**
	 * Returns the meta object for class '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PuMeasurementCorrespondence <em>Pu Measurement Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pu Measurement Correspondence</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PuMeasurementCorrespondence
	 * @generated
	 */
	EClass getPuMeasurementCorrespondence();

	/**
	 * Returns the meta object for the reference '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PuMeasurementCorrespondence#getCactos <em>Cactos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cactos</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PuMeasurementCorrespondence#getCactos()
	 * @see #getPuMeasurementCorrespondence()
	 * @generated
	 */
	EReference getPuMeasurementCorrespondence_Cactos();

	/**
	 * Returns the meta object for the container reference '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PuMeasurementCorrespondence#getPhysicalCorrespondenceRepository <em>Physical Correspondence Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Physical Correspondence Repository</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PuMeasurementCorrespondence#getPhysicalCorrespondenceRepository()
	 * @see #getPuMeasurementCorrespondence()
	 * @generated
	 */
	EReference getPuMeasurementCorrespondence_PhysicalCorrespondenceRepository();

	/**
	 * Returns the meta object for class '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.MemoryMeasurementCorrespondence <em>Memory Measurement Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Memory Measurement Correspondence</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.MemoryMeasurementCorrespondence
	 * @generated
	 */
	EClass getMemoryMeasurementCorrespondence();

	/**
	 * Returns the meta object for the reference '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.MemoryMeasurementCorrespondence#getCactos <em>Cactos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cactos</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.MemoryMeasurementCorrespondence#getCactos()
	 * @see #getMemoryMeasurementCorrespondence()
	 * @generated
	 */
	EReference getMemoryMeasurementCorrespondence_Cactos();

	/**
	 * Returns the meta object for the container reference '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.MemoryMeasurementCorrespondence#getPhysicalCorrespondenceRepository <em>Physical Correspondence Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Physical Correspondence Repository</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.MemoryMeasurementCorrespondence#getPhysicalCorrespondenceRepository()
	 * @see #getMemoryMeasurementCorrespondence()
	 * @generated
	 */
	EReference getMemoryMeasurementCorrespondence_PhysicalCorrespondenceRepository();

	/**
	 * Returns the meta object for class '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.StorageMeasurementCorrespondence <em>Storage Measurement Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Storage Measurement Correspondence</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.StorageMeasurementCorrespondence
	 * @generated
	 */
	EClass getStorageMeasurementCorrespondence();

	/**
	 * Returns the meta object for the reference '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.StorageMeasurementCorrespondence#getCactos <em>Cactos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cactos</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.StorageMeasurementCorrespondence#getCactos()
	 * @see #getStorageMeasurementCorrespondence()
	 * @generated
	 */
	EReference getStorageMeasurementCorrespondence_Cactos();

	/**
	 * Returns the meta object for the container reference '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.StorageMeasurementCorrespondence#getPhysicalCorrespondenceRepository <em>Physical Correspondence Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Physical Correspondence Repository</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.StorageMeasurementCorrespondence#getPhysicalCorrespondenceRepository()
	 * @see #getStorageMeasurementCorrespondence()
	 * @generated
	 */
	EReference getStorageMeasurementCorrespondence_PhysicalCorrespondenceRepository();

	/**
	 * Returns the meta object for class '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.InterconnectMeasurementCorrespondence <em>Interconnect Measurement Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interconnect Measurement Correspondence</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.InterconnectMeasurementCorrespondence
	 * @generated
	 */
	EClass getInterconnectMeasurementCorrespondence();

	/**
	 * Returns the meta object for the reference '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.InterconnectMeasurementCorrespondence#getCactos <em>Cactos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cactos</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.InterconnectMeasurementCorrespondence#getCactos()
	 * @see #getInterconnectMeasurementCorrespondence()
	 * @generated
	 */
	EReference getInterconnectMeasurementCorrespondence_Cactos();

	/**
	 * Returns the meta object for the container reference '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.InterconnectMeasurementCorrespondence#getPhysicalCorrespondenceRepository <em>Physical Correspondence Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Physical Correspondence Repository</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.InterconnectMeasurementCorrespondence#getPhysicalCorrespondenceRepository()
	 * @see #getInterconnectMeasurementCorrespondence()
	 * @generated
	 */
	EReference getInterconnectMeasurementCorrespondence_PhysicalCorrespondenceRepository();

	/**
	 * Returns the meta object for class '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalCorrespondenceRepository <em>Physical Correspondence Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physical Correspondence Repository</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalCorrespondenceRepository
	 * @generated
	 */
	EClass getPhysicalCorrespondenceRepository();

	/**
	 * Returns the meta object for the attribute '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalCorrespondenceRepository#isCorrespondenceEstablished <em>Correspondence Established</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Correspondence Established</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalCorrespondenceRepository#isCorrespondenceEstablished()
	 * @see #getPhysicalCorrespondenceRepository()
	 * @generated
	 */
	EAttribute getPhysicalCorrespondenceRepository_CorrespondenceEstablished();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalCorrespondenceRepository#getPuMeasurementCorrespondences <em>Pu Measurement Correspondences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pu Measurement Correspondences</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalCorrespondenceRepository#getPuMeasurementCorrespondences()
	 * @see #getPhysicalCorrespondenceRepository()
	 * @generated
	 */
	EReference getPhysicalCorrespondenceRepository_PuMeasurementCorrespondences();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalCorrespondenceRepository#getMemoryMeasurementCorrespondences <em>Memory Measurement Correspondences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Memory Measurement Correspondences</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalCorrespondenceRepository#getMemoryMeasurementCorrespondences()
	 * @see #getPhysicalCorrespondenceRepository()
	 * @generated
	 */
	EReference getPhysicalCorrespondenceRepository_MemoryMeasurementCorrespondences();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalCorrespondenceRepository#getStorageMeasurementCorrespondences <em>Storage Measurement Correspondences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Storage Measurement Correspondences</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalCorrespondenceRepository#getStorageMeasurementCorrespondences()
	 * @see #getPhysicalCorrespondenceRepository()
	 * @generated
	 */
	EReference getPhysicalCorrespondenceRepository_StorageMeasurementCorrespondences();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalCorrespondenceRepository#getInterconnectMeasurementCorrespondences <em>Interconnect Measurement Correspondences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interconnect Measurement Correspondences</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalCorrespondenceRepository#getInterconnectMeasurementCorrespondences()
	 * @see #getPhysicalCorrespondenceRepository()
	 * @generated
	 */
	EReference getPhysicalCorrespondenceRepository_InterconnectMeasurementCorrespondences();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalCorrespondenceRepository#getSwitchCorrespondences <em>Switch Correspondences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Switch Correspondences</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalCorrespondenceRepository#getSwitchCorrespondences()
	 * @see #getPhysicalCorrespondenceRepository()
	 * @generated
	 */
	EReference getPhysicalCorrespondenceRepository_SwitchCorrespondences();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalCorrespondenceRepository#getRackCorrespondences <em>Rack Correspondences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rack Correspondences</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalCorrespondenceRepository#getRackCorrespondences()
	 * @see #getPhysicalCorrespondenceRepository()
	 * @generated
	 */
	EReference getPhysicalCorrespondenceRepository_RackCorrespondences();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalCorrespondenceRepository#getAbstractNodeCorrespondences <em>Abstract Node Correspondences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Node Correspondences</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalCorrespondenceRepository#getAbstractNodeCorrespondences()
	 * @see #getPhysicalCorrespondenceRepository()
	 * @generated
	 */
	EReference getPhysicalCorrespondenceRepository_AbstractNodeCorrespondences();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalCorrespondenceRepository#getMemorySpecificationCorrespondences <em>Memory Specification Correspondences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Memory Specification Correspondences</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalCorrespondenceRepository#getMemorySpecificationCorrespondences()
	 * @see #getPhysicalCorrespondenceRepository()
	 * @generated
	 */
	EReference getPhysicalCorrespondenceRepository_MemorySpecificationCorrespondences();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalCorrespondenceRepository#getStorageSpecificationCorrespondences <em>Storage Specification Correspondences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Storage Specification Correspondences</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalCorrespondenceRepository#getStorageSpecificationCorrespondences()
	 * @see #getPhysicalCorrespondenceRepository()
	 * @generated
	 */
	EReference getPhysicalCorrespondenceRepository_StorageSpecificationCorrespondences();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalCorrespondenceRepository#getNetworkInterconnectCorrespondences <em>Network Interconnect Correspondences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Network Interconnect Correspondences</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalCorrespondenceRepository#getNetworkInterconnectCorrespondences()
	 * @see #getPhysicalCorrespondenceRepository()
	 * @generated
	 */
	EReference getPhysicalCorrespondenceRepository_NetworkInterconnectCorrespondences();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalCorrespondenceRepository#getProcessingUnitSpecificationCorrespondences <em>Processing Unit Specification Correspondences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Processing Unit Specification Correspondences</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalCorrespondenceRepository#getProcessingUnitSpecificationCorrespondences()
	 * @see #getPhysicalCorrespondenceRepository()
	 * @generated
	 */
	EReference getPhysicalCorrespondenceRepository_ProcessingUnitSpecificationCorrespondences();

	/**
	 * Returns the meta object for the reference '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalCorrespondenceRepository#getPhysicalDcModel <em>Physical Dc Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Physical Dc Model</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalCorrespondenceRepository#getPhysicalDcModel()
	 * @see #getPhysicalCorrespondenceRepository()
	 * @generated
	 */
	EReference getPhysicalCorrespondenceRepository_PhysicalDcModel();

	/**
	 * Returns the meta object for the reference '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalCorrespondenceRepository#getPhysicalLoadModel <em>Physical Load Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Physical Load Model</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalCorrespondenceRepository#getPhysicalLoadModel()
	 * @see #getPhysicalCorrespondenceRepository()
	 * @generated
	 */
	EReference getPhysicalCorrespondenceRepository_PhysicalLoadModel();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalCorrespondenceRepository#getPowerConsumingEntityMeasurementCorrespondences <em>Power Consuming Entity Measurement Correspondences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Power Consuming Entity Measurement Correspondences</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalCorrespondenceRepository#getPowerConsumingEntityMeasurementCorrespondences()
	 * @see #getPhysicalCorrespondenceRepository()
	 * @generated
	 */
	EReference getPhysicalCorrespondenceRepository_PowerConsumingEntityMeasurementCorrespondences();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalCorrespondenceRepository#getPowerProvidingEntityCorrespondences <em>Power Providing Entity Correspondences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Power Providing Entity Correspondences</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalCorrespondenceRepository#getPowerProvidingEntityCorrespondences()
	 * @see #getPhysicalCorrespondenceRepository()
	 * @generated
	 */
	EReference getPhysicalCorrespondenceRepository_PowerProvidingEntityCorrespondences();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalCorrespondenceRepository#getPowerConsumingResourceCorrespondences <em>Power Consuming Resource Correspondences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Power Consuming Resource Correspondences</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalCorrespondenceRepository#getPowerConsumingResourceCorrespondences()
	 * @see #getPhysicalCorrespondenceRepository()
	 * @generated
	 */
	EReference getPhysicalCorrespondenceRepository_PowerConsumingResourceCorrespondences();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalCorrespondenceRepository#getArchitectureTypeCorrespondences <em>Architecture Type Correspondences</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Architecture Type Correspondences</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalCorrespondenceRepository#getArchitectureTypeCorrespondences()
	 * @see #getPhysicalCorrespondenceRepository()
	 * @generated
	 */
    EReference getPhysicalCorrespondenceRepository_ArchitectureTypeCorrespondences();

    /**
	 * Returns the meta object for class '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.SwitchCorrespondence <em>Switch Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switch Correspondence</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.SwitchCorrespondence
	 * @generated
	 */
	EClass getSwitchCorrespondence();

	/**
	 * Returns the meta object for the reference '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.SwitchCorrespondence#getCactos <em>Cactos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cactos</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.SwitchCorrespondence#getCactos()
	 * @see #getSwitchCorrespondence()
	 * @generated
	 */
	EReference getSwitchCorrespondence_Cactos();

	/**
	 * Returns the meta object for the reference '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.SwitchCorrespondence#getPalladio <em>Palladio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Palladio</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.SwitchCorrespondence#getPalladio()
	 * @see #getSwitchCorrespondence()
	 * @generated
	 */
	EReference getSwitchCorrespondence_Palladio();

	/**
	 * Returns the meta object for the container reference '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.SwitchCorrespondence#getPhysicalCorrespondenceRepository <em>Physical Correspondence Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Physical Correspondence Repository</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.SwitchCorrespondence#getPhysicalCorrespondenceRepository()
	 * @see #getSwitchCorrespondence()
	 * @generated
	 */
	EReference getSwitchCorrespondence_PhysicalCorrespondenceRepository();

	/**
	 * Returns the meta object for class '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.RackCorrespondence <em>Rack Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rack Correspondence</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.RackCorrespondence
	 * @generated
	 */
	EClass getRackCorrespondence();

	/**
	 * Returns the meta object for the reference '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.RackCorrespondence#getCactos <em>Cactos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cactos</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.RackCorrespondence#getCactos()
	 * @see #getRackCorrespondence()
	 * @generated
	 */
	EReference getRackCorrespondence_Cactos();

	/**
	 * Returns the meta object for the reference list '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.RackCorrespondence#getPalladio <em>Palladio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Palladio</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.RackCorrespondence#getPalladio()
	 * @see #getRackCorrespondence()
	 * @generated
	 */
	EReference getRackCorrespondence_Palladio();

	/**
	 * Returns the meta object for the container reference '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.RackCorrespondence#getPhysicalCorrespondenceRepository <em>Physical Correspondence Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Physical Correspondence Repository</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.RackCorrespondence#getPhysicalCorrespondenceRepository()
	 * @see #getRackCorrespondence()
	 * @generated
	 */
	EReference getRackCorrespondence_PhysicalCorrespondenceRepository();

	/**
	 * Returns the meta object for class '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.AbstractNodeCorrespondence <em>Abstract Node Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Node Correspondence</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.AbstractNodeCorrespondence
	 * @generated
	 */
	EClass getAbstractNodeCorrespondence();

	/**
	 * Returns the meta object for the reference '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.AbstractNodeCorrespondence#getCactos <em>Cactos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cactos</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.AbstractNodeCorrespondence#getCactos()
	 * @see #getAbstractNodeCorrespondence()
	 * @generated
	 */
	EReference getAbstractNodeCorrespondence_Cactos();

	/**
	 * Returns the meta object for the reference '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.AbstractNodeCorrespondence#getPalladio <em>Palladio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Palladio</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.AbstractNodeCorrespondence#getPalladio()
	 * @see #getAbstractNodeCorrespondence()
	 * @generated
	 */
	EReference getAbstractNodeCorrespondence_Palladio();

	/**
	 * Returns the meta object for the container reference '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.AbstractNodeCorrespondence#getPhysicalCorrespondenceRepository <em>Physical Correspondence Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Physical Correspondence Repository</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.AbstractNodeCorrespondence#getPhysicalCorrespondenceRepository()
	 * @see #getAbstractNodeCorrespondence()
	 * @generated
	 */
	EReference getAbstractNodeCorrespondence_PhysicalCorrespondenceRepository();

	/**
	 * Returns the meta object for class '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.MemorySpecificationCorrespondence <em>Memory Specification Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Memory Specification Correspondence</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.MemorySpecificationCorrespondence
	 * @generated
	 */
	EClass getMemorySpecificationCorrespondence();

	/**
	 * Returns the meta object for the reference '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.MemorySpecificationCorrespondence#getCactos <em>Cactos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cactos</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.MemorySpecificationCorrespondence#getCactos()
	 * @see #getMemorySpecificationCorrespondence()
	 * @generated
	 */
	EReference getMemorySpecificationCorrespondence_Cactos();

	/**
	 * Returns the meta object for the reference '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.MemorySpecificationCorrespondence#getPalladio <em>Palladio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Palladio</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.MemorySpecificationCorrespondence#getPalladio()
	 * @see #getMemorySpecificationCorrespondence()
	 * @generated
	 */
	EReference getMemorySpecificationCorrespondence_Palladio();

	/**
	 * Returns the meta object for the container reference '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.MemorySpecificationCorrespondence#getPhysicalCorrespondenceRepository <em>Physical Correspondence Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Physical Correspondence Repository</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.MemorySpecificationCorrespondence#getPhysicalCorrespondenceRepository()
	 * @see #getMemorySpecificationCorrespondence()
	 * @generated
	 */
	EReference getMemorySpecificationCorrespondence_PhysicalCorrespondenceRepository();

	/**
	 * Returns the meta object for class '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.StorageSpecificationCorrespondence <em>Storage Specification Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Storage Specification Correspondence</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.StorageSpecificationCorrespondence
	 * @generated
	 */
	EClass getStorageSpecificationCorrespondence();

	/**
	 * Returns the meta object for the reference '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.StorageSpecificationCorrespondence#getCactos <em>Cactos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cactos</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.StorageSpecificationCorrespondence#getCactos()
	 * @see #getStorageSpecificationCorrespondence()
	 * @generated
	 */
	EReference getStorageSpecificationCorrespondence_Cactos();

	/**
	 * Returns the meta object for the reference '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.StorageSpecificationCorrespondence#getPalladio <em>Palladio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Palladio</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.StorageSpecificationCorrespondence#getPalladio()
	 * @see #getStorageSpecificationCorrespondence()
	 * @generated
	 */
	EReference getStorageSpecificationCorrespondence_Palladio();

	/**
	 * Returns the meta object for the container reference '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.StorageSpecificationCorrespondence#getPhysicalCorrespondenceRepository <em>Physical Correspondence Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Physical Correspondence Repository</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.StorageSpecificationCorrespondence#getPhysicalCorrespondenceRepository()
	 * @see #getStorageSpecificationCorrespondence()
	 * @generated
	 */
	EReference getStorageSpecificationCorrespondence_PhysicalCorrespondenceRepository();

	/**
	 * Returns the meta object for class '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.NetworkInterconnectCorrespondence <em>Network Interconnect Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Interconnect Correspondence</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.NetworkInterconnectCorrespondence
	 * @generated
	 */
	EClass getNetworkInterconnectCorrespondence();

	/**
	 * Returns the meta object for the reference list '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.NetworkInterconnectCorrespondence#getCactos <em>Cactos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cactos</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.NetworkInterconnectCorrespondence#getCactos()
	 * @see #getNetworkInterconnectCorrespondence()
	 * @generated
	 */
	EReference getNetworkInterconnectCorrespondence_Cactos();

	/**
	 * Returns the meta object for the reference '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.NetworkInterconnectCorrespondence#getPalladio <em>Palladio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Palladio</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.NetworkInterconnectCorrespondence#getPalladio()
	 * @see #getNetworkInterconnectCorrespondence()
	 * @generated
	 */
	EReference getNetworkInterconnectCorrespondence_Palladio();

	/**
	 * Returns the meta object for the container reference '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.NetworkInterconnectCorrespondence#getPhysicalCorrespondenceRepository <em>Physical Correspondence Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Physical Correspondence Repository</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.NetworkInterconnectCorrespondence#getPhysicalCorrespondenceRepository()
	 * @see #getNetworkInterconnectCorrespondence()
	 * @generated
	 */
	EReference getNetworkInterconnectCorrespondence_PhysicalCorrespondenceRepository();

	/**
	 * Returns the meta object for the reference '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.NetworkInterconnectCorrespondence#getReconfigurationController <em>Reconfiguration Controller</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reconfiguration Controller</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.NetworkInterconnectCorrespondence#getReconfigurationController()
	 * @see #getNetworkInterconnectCorrespondence()
	 * @generated
	 */
    EReference getNetworkInterconnectCorrespondence_ReconfigurationController();

    /**
	 * Returns the meta object for class '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.ProcessingUnitSpecificationCorrespondence <em>Processing Unit Specification Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processing Unit Specification Correspondence</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.ProcessingUnitSpecificationCorrespondence
	 * @generated
	 */
	EClass getProcessingUnitSpecificationCorrespondence();

	/**
	 * Returns the meta object for the reference '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.ProcessingUnitSpecificationCorrespondence#getCactos <em>Cactos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cactos</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.ProcessingUnitSpecificationCorrespondence#getCactos()
	 * @see #getProcessingUnitSpecificationCorrespondence()
	 * @generated
	 */
	EReference getProcessingUnitSpecificationCorrespondence_Cactos();

	/**
	 * Returns the meta object for the reference '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.ProcessingUnitSpecificationCorrespondence#getPalladio <em>Palladio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Palladio</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.ProcessingUnitSpecificationCorrespondence#getPalladio()
	 * @see #getProcessingUnitSpecificationCorrespondence()
	 * @generated
	 */
	EReference getProcessingUnitSpecificationCorrespondence_Palladio();

	/**
	 * Returns the meta object for the container reference '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.ProcessingUnitSpecificationCorrespondence#getPhysicalCorrespondenceRepository <em>Physical Correspondence Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Physical Correspondence Repository</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.ProcessingUnitSpecificationCorrespondence#getPhysicalCorrespondenceRepository()
	 * @see #getProcessingUnitSpecificationCorrespondence()
	 * @generated
	 */
	EReference getProcessingUnitSpecificationCorrespondence_PhysicalCorrespondenceRepository();

	/**
	 * Returns the meta object for class '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PowerConsumingEntityMeasurementCorrespondence <em>Power Consuming Entity Measurement Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Power Consuming Entity Measurement Correspondence</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PowerConsumingEntityMeasurementCorrespondence
	 * @generated
	 */
	EClass getPowerConsumingEntityMeasurementCorrespondence();

	/**
	 * Returns the meta object for the reference '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PowerConsumingEntityMeasurementCorrespondence#getCactos <em>Cactos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cactos</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PowerConsumingEntityMeasurementCorrespondence#getCactos()
	 * @see #getPowerConsumingEntityMeasurementCorrespondence()
	 * @generated
	 */
	EReference getPowerConsumingEntityMeasurementCorrespondence_Cactos();

	/**
	 * Returns the meta object for the container reference '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PowerConsumingEntityMeasurementCorrespondence#getPhysicalCorrespondenceRepository <em>Physical Correspondence Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Physical Correspondence Repository</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PowerConsumingEntityMeasurementCorrespondence#getPhysicalCorrespondenceRepository()
	 * @see #getPowerConsumingEntityMeasurementCorrespondence()
	 * @generated
	 */
	EReference getPowerConsumingEntityMeasurementCorrespondence_PhysicalCorrespondenceRepository();

	/**
	 * Returns the meta object for class '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PowerProvidingEntityCorrespondence <em>Power Providing Entity Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Power Providing Entity Correspondence</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PowerProvidingEntityCorrespondence
	 * @generated
	 */
	EClass getPowerProvidingEntityCorrespondence();

	/**
	 * Returns the meta object for the reference '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PowerProvidingEntityCorrespondence#getCactos <em>Cactos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cactos</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PowerProvidingEntityCorrespondence#getCactos()
	 * @see #getPowerProvidingEntityCorrespondence()
	 * @generated
	 */
	EReference getPowerProvidingEntityCorrespondence_Cactos();

	/**
	 * Returns the meta object for the reference '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PowerProvidingEntityCorrespondence#getPalladio <em>Palladio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Palladio</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PowerProvidingEntityCorrespondence#getPalladio()
	 * @see #getPowerProvidingEntityCorrespondence()
	 * @generated
	 */
	EReference getPowerProvidingEntityCorrespondence_Palladio();

	/**
	 * Returns the meta object for the container reference '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PowerProvidingEntityCorrespondence#getPhysicalCorrespondenceRepository <em>Physical Correspondence Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Physical Correspondence Repository</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PowerProvidingEntityCorrespondence#getPhysicalCorrespondenceRepository()
	 * @see #getPowerProvidingEntityCorrespondence()
	 * @generated
	 */
	EReference getPowerProvidingEntityCorrespondence_PhysicalCorrespondenceRepository();

	/**
	 * Returns the meta object for class '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PowerConsumingResourceCorrespondence <em>Power Consuming Resource Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Power Consuming Resource Correspondence</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PowerConsumingResourceCorrespondence
	 * @generated
	 */
	EClass getPowerConsumingResourceCorrespondence();

	/**
	 * Returns the meta object for the reference '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PowerConsumingResourceCorrespondence#getCactos <em>Cactos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cactos</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PowerConsumingResourceCorrespondence#getCactos()
	 * @see #getPowerConsumingResourceCorrespondence()
	 * @generated
	 */
	EReference getPowerConsumingResourceCorrespondence_Cactos();

	/**
	 * Returns the meta object for the reference '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PowerConsumingResourceCorrespondence#getPalladio <em>Palladio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Palladio</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PowerConsumingResourceCorrespondence#getPalladio()
	 * @see #getPowerConsumingResourceCorrespondence()
	 * @generated
	 */
	EReference getPowerConsumingResourceCorrespondence_Palladio();

	/**
	 * Returns the meta object for the container reference '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PowerConsumingResourceCorrespondence#getPhysicalCorrespondenceRepository <em>Physical Correspondence Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Physical Correspondence Repository</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PowerConsumingResourceCorrespondence#getPhysicalCorrespondenceRepository()
	 * @see #getPowerConsumingResourceCorrespondence()
	 * @generated
	 */
	EReference getPowerConsumingResourceCorrespondence_PhysicalCorrespondenceRepository();

	/**
	 * Returns the meta object for class '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.ArchitectureTypeCorrespondence <em>Architecture Type Correspondence</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Architecture Type Correspondence</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.ArchitectureTypeCorrespondence
	 * @generated
	 */
    EClass getArchitectureTypeCorrespondence();

    /**
	 * Returns the meta object for the reference '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.ArchitectureTypeCorrespondence#getCactos <em>Cactos</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cactos</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.ArchitectureTypeCorrespondence#getCactos()
	 * @see #getArchitectureTypeCorrespondence()
	 * @generated
	 */
    EReference getArchitectureTypeCorrespondence_Cactos();

    /**
	 * Returns the meta object for the reference '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.ArchitectureTypeCorrespondence#getPalladio <em>Palladio</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Palladio</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.ArchitectureTypeCorrespondence#getPalladio()
	 * @see #getArchitectureTypeCorrespondence()
	 * @generated
	 */
    EReference getArchitectureTypeCorrespondence_Palladio();

    /**
	 * Returns the meta object for the container reference '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.ArchitectureTypeCorrespondence#getPhysicalCorrespondenceRepository <em>Physical Correspondence Repository</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Physical Correspondence Repository</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.ArchitectureTypeCorrespondence#getPhysicalCorrespondenceRepository()
	 * @see #getArchitectureTypeCorrespondence()
	 * @generated
	 */
    EReference getArchitectureTypeCorrespondence_PhysicalCorrespondenceRepository();

    /**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PhysicalcorrespondenceFactory getPhysicalcorrespondenceFactory();

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
		 * The meta object literal for the '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.PuMeasurementCorrespondenceImpl <em>Pu Measurement Correspondence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.PuMeasurementCorrespondenceImpl
		 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.PhysicalcorrespondencePackageImpl#getPuMeasurementCorrespondence()
		 * @generated
		 */
		EClass PU_MEASUREMENT_CORRESPONDENCE = eINSTANCE.getPuMeasurementCorrespondence();

		/**
		 * The meta object literal for the '<em><b>Cactos</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PU_MEASUREMENT_CORRESPONDENCE__CACTOS = eINSTANCE.getPuMeasurementCorrespondence_Cactos();

		/**
		 * The meta object literal for the '<em><b>Physical Correspondence Repository</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PU_MEASUREMENT_CORRESPONDENCE__PHYSICAL_CORRESPONDENCE_REPOSITORY = eINSTANCE.getPuMeasurementCorrespondence_PhysicalCorrespondenceRepository();

		/**
		 * The meta object literal for the '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.MemoryMeasurementCorrespondenceImpl <em>Memory Measurement Correspondence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.MemoryMeasurementCorrespondenceImpl
		 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.PhysicalcorrespondencePackageImpl#getMemoryMeasurementCorrespondence()
		 * @generated
		 */
		EClass MEMORY_MEASUREMENT_CORRESPONDENCE = eINSTANCE.getMemoryMeasurementCorrespondence();

		/**
		 * The meta object literal for the '<em><b>Cactos</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMORY_MEASUREMENT_CORRESPONDENCE__CACTOS = eINSTANCE.getMemoryMeasurementCorrespondence_Cactos();

		/**
		 * The meta object literal for the '<em><b>Physical Correspondence Repository</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMORY_MEASUREMENT_CORRESPONDENCE__PHYSICAL_CORRESPONDENCE_REPOSITORY = eINSTANCE.getMemoryMeasurementCorrespondence_PhysicalCorrespondenceRepository();

		/**
		 * The meta object literal for the '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.StorageMeasurementCorrespondenceImpl <em>Storage Measurement Correspondence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.StorageMeasurementCorrespondenceImpl
		 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.PhysicalcorrespondencePackageImpl#getStorageMeasurementCorrespondence()
		 * @generated
		 */
		EClass STORAGE_MEASUREMENT_CORRESPONDENCE = eINSTANCE.getStorageMeasurementCorrespondence();

		/**
		 * The meta object literal for the '<em><b>Cactos</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORAGE_MEASUREMENT_CORRESPONDENCE__CACTOS = eINSTANCE.getStorageMeasurementCorrespondence_Cactos();

		/**
		 * The meta object literal for the '<em><b>Physical Correspondence Repository</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORAGE_MEASUREMENT_CORRESPONDENCE__PHYSICAL_CORRESPONDENCE_REPOSITORY = eINSTANCE.getStorageMeasurementCorrespondence_PhysicalCorrespondenceRepository();

		/**
		 * The meta object literal for the '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.InterconnectMeasurementCorrespondenceImpl <em>Interconnect Measurement Correspondence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.InterconnectMeasurementCorrespondenceImpl
		 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.PhysicalcorrespondencePackageImpl#getInterconnectMeasurementCorrespondence()
		 * @generated
		 */
		EClass INTERCONNECT_MEASUREMENT_CORRESPONDENCE = eINSTANCE.getInterconnectMeasurementCorrespondence();

		/**
		 * The meta object literal for the '<em><b>Cactos</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERCONNECT_MEASUREMENT_CORRESPONDENCE__CACTOS = eINSTANCE.getInterconnectMeasurementCorrespondence_Cactos();

		/**
		 * The meta object literal for the '<em><b>Physical Correspondence Repository</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERCONNECT_MEASUREMENT_CORRESPONDENCE__PHYSICAL_CORRESPONDENCE_REPOSITORY = eINSTANCE.getInterconnectMeasurementCorrespondence_PhysicalCorrespondenceRepository();

		/**
		 * The meta object literal for the '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.PhysicalCorrespondenceRepositoryImpl <em>Physical Correspondence Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.PhysicalCorrespondenceRepositoryImpl
		 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.PhysicalcorrespondencePackageImpl#getPhysicalCorrespondenceRepository()
		 * @generated
		 */
		EClass PHYSICAL_CORRESPONDENCE_REPOSITORY = eINSTANCE.getPhysicalCorrespondenceRepository();

		/**
		 * The meta object literal for the '<em><b>Correspondence Established</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_CORRESPONDENCE_REPOSITORY__CORRESPONDENCE_ESTABLISHED = eINSTANCE.getPhysicalCorrespondenceRepository_CorrespondenceEstablished();

		/**
		 * The meta object literal for the '<em><b>Pu Measurement Correspondences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_CORRESPONDENCE_REPOSITORY__PU_MEASUREMENT_CORRESPONDENCES = eINSTANCE.getPhysicalCorrespondenceRepository_PuMeasurementCorrespondences();

		/**
		 * The meta object literal for the '<em><b>Memory Measurement Correspondences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_CORRESPONDENCE_REPOSITORY__MEMORY_MEASUREMENT_CORRESPONDENCES = eINSTANCE.getPhysicalCorrespondenceRepository_MemoryMeasurementCorrespondences();

		/**
		 * The meta object literal for the '<em><b>Storage Measurement Correspondences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_CORRESPONDENCE_REPOSITORY__STORAGE_MEASUREMENT_CORRESPONDENCES = eINSTANCE.getPhysicalCorrespondenceRepository_StorageMeasurementCorrespondences();

		/**
		 * The meta object literal for the '<em><b>Interconnect Measurement Correspondences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_CORRESPONDENCE_REPOSITORY__INTERCONNECT_MEASUREMENT_CORRESPONDENCES = eINSTANCE.getPhysicalCorrespondenceRepository_InterconnectMeasurementCorrespondences();

		/**
		 * The meta object literal for the '<em><b>Switch Correspondences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_CORRESPONDENCE_REPOSITORY__SWITCH_CORRESPONDENCES = eINSTANCE.getPhysicalCorrespondenceRepository_SwitchCorrespondences();

		/**
		 * The meta object literal for the '<em><b>Rack Correspondences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_CORRESPONDENCE_REPOSITORY__RACK_CORRESPONDENCES = eINSTANCE.getPhysicalCorrespondenceRepository_RackCorrespondences();

		/**
		 * The meta object literal for the '<em><b>Abstract Node Correspondences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_CORRESPONDENCE_REPOSITORY__ABSTRACT_NODE_CORRESPONDENCES = eINSTANCE.getPhysicalCorrespondenceRepository_AbstractNodeCorrespondences();

		/**
		 * The meta object literal for the '<em><b>Memory Specification Correspondences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_CORRESPONDENCE_REPOSITORY__MEMORY_SPECIFICATION_CORRESPONDENCES = eINSTANCE.getPhysicalCorrespondenceRepository_MemorySpecificationCorrespondences();

		/**
		 * The meta object literal for the '<em><b>Storage Specification Correspondences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_CORRESPONDENCE_REPOSITORY__STORAGE_SPECIFICATION_CORRESPONDENCES = eINSTANCE.getPhysicalCorrespondenceRepository_StorageSpecificationCorrespondences();

		/**
		 * The meta object literal for the '<em><b>Network Interconnect Correspondences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_CORRESPONDENCE_REPOSITORY__NETWORK_INTERCONNECT_CORRESPONDENCES = eINSTANCE.getPhysicalCorrespondenceRepository_NetworkInterconnectCorrespondences();

		/**
		 * The meta object literal for the '<em><b>Processing Unit Specification Correspondences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_CORRESPONDENCE_REPOSITORY__PROCESSING_UNIT_SPECIFICATION_CORRESPONDENCES = eINSTANCE.getPhysicalCorrespondenceRepository_ProcessingUnitSpecificationCorrespondences();

		/**
		 * The meta object literal for the '<em><b>Physical Dc Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_CORRESPONDENCE_REPOSITORY__PHYSICAL_DC_MODEL = eINSTANCE.getPhysicalCorrespondenceRepository_PhysicalDcModel();

		/**
		 * The meta object literal for the '<em><b>Physical Load Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_CORRESPONDENCE_REPOSITORY__PHYSICAL_LOAD_MODEL = eINSTANCE.getPhysicalCorrespondenceRepository_PhysicalLoadModel();

		/**
		 * The meta object literal for the '<em><b>Power Consuming Entity Measurement Correspondences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_CORRESPONDENCE_REPOSITORY__POWER_CONSUMING_ENTITY_MEASUREMENT_CORRESPONDENCES = eINSTANCE.getPhysicalCorrespondenceRepository_PowerConsumingEntityMeasurementCorrespondences();

		/**
		 * The meta object literal for the '<em><b>Power Providing Entity Correspondences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_CORRESPONDENCE_REPOSITORY__POWER_PROVIDING_ENTITY_CORRESPONDENCES = eINSTANCE.getPhysicalCorrespondenceRepository_PowerProvidingEntityCorrespondences();

		/**
		 * The meta object literal for the '<em><b>Power Consuming Resource Correspondences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_CORRESPONDENCE_REPOSITORY__POWER_CONSUMING_RESOURCE_CORRESPONDENCES = eINSTANCE.getPhysicalCorrespondenceRepository_PowerConsumingResourceCorrespondences();

		/**
		 * The meta object literal for the '<em><b>Architecture Type Correspondences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference PHYSICAL_CORRESPONDENCE_REPOSITORY__ARCHITECTURE_TYPE_CORRESPONDENCES = eINSTANCE.getPhysicalCorrespondenceRepository_ArchitectureTypeCorrespondences();

        /**
		 * The meta object literal for the '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.SwitchCorrespondenceImpl <em>Switch Correspondence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.SwitchCorrespondenceImpl
		 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.PhysicalcorrespondencePackageImpl#getSwitchCorrespondence()
		 * @generated
		 */
		EClass SWITCH_CORRESPONDENCE = eINSTANCE.getSwitchCorrespondence();

		/**
		 * The meta object literal for the '<em><b>Cactos</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH_CORRESPONDENCE__CACTOS = eINSTANCE.getSwitchCorrespondence_Cactos();

		/**
		 * The meta object literal for the '<em><b>Palladio</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH_CORRESPONDENCE__PALLADIO = eINSTANCE.getSwitchCorrespondence_Palladio();

		/**
		 * The meta object literal for the '<em><b>Physical Correspondence Repository</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH_CORRESPONDENCE__PHYSICAL_CORRESPONDENCE_REPOSITORY = eINSTANCE.getSwitchCorrespondence_PhysicalCorrespondenceRepository();

		/**
		 * The meta object literal for the '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.RackCorrespondenceImpl <em>Rack Correspondence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.RackCorrespondenceImpl
		 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.PhysicalcorrespondencePackageImpl#getRackCorrespondence()
		 * @generated
		 */
		EClass RACK_CORRESPONDENCE = eINSTANCE.getRackCorrespondence();

		/**
		 * The meta object literal for the '<em><b>Cactos</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RACK_CORRESPONDENCE__CACTOS = eINSTANCE.getRackCorrespondence_Cactos();

		/**
		 * The meta object literal for the '<em><b>Palladio</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RACK_CORRESPONDENCE__PALLADIO = eINSTANCE.getRackCorrespondence_Palladio();

		/**
		 * The meta object literal for the '<em><b>Physical Correspondence Repository</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RACK_CORRESPONDENCE__PHYSICAL_CORRESPONDENCE_REPOSITORY = eINSTANCE.getRackCorrespondence_PhysicalCorrespondenceRepository();

		/**
		 * The meta object literal for the '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.AbstractNodeCorrespondenceImpl <em>Abstract Node Correspondence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.AbstractNodeCorrespondenceImpl
		 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.PhysicalcorrespondencePackageImpl#getAbstractNodeCorrespondence()
		 * @generated
		 */
		EClass ABSTRACT_NODE_CORRESPONDENCE = eINSTANCE.getAbstractNodeCorrespondence();

		/**
		 * The meta object literal for the '<em><b>Cactos</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_NODE_CORRESPONDENCE__CACTOS = eINSTANCE.getAbstractNodeCorrespondence_Cactos();

		/**
		 * The meta object literal for the '<em><b>Palladio</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_NODE_CORRESPONDENCE__PALLADIO = eINSTANCE.getAbstractNodeCorrespondence_Palladio();

		/**
		 * The meta object literal for the '<em><b>Physical Correspondence Repository</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_NODE_CORRESPONDENCE__PHYSICAL_CORRESPONDENCE_REPOSITORY = eINSTANCE.getAbstractNodeCorrespondence_PhysicalCorrespondenceRepository();

		/**
		 * The meta object literal for the '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.MemorySpecificationCorrespondenceImpl <em>Memory Specification Correspondence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.MemorySpecificationCorrespondenceImpl
		 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.PhysicalcorrespondencePackageImpl#getMemorySpecificationCorrespondence()
		 * @generated
		 */
		EClass MEMORY_SPECIFICATION_CORRESPONDENCE = eINSTANCE.getMemorySpecificationCorrespondence();

		/**
		 * The meta object literal for the '<em><b>Cactos</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMORY_SPECIFICATION_CORRESPONDENCE__CACTOS = eINSTANCE.getMemorySpecificationCorrespondence_Cactos();

		/**
		 * The meta object literal for the '<em><b>Palladio</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMORY_SPECIFICATION_CORRESPONDENCE__PALLADIO = eINSTANCE.getMemorySpecificationCorrespondence_Palladio();

		/**
		 * The meta object literal for the '<em><b>Physical Correspondence Repository</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMORY_SPECIFICATION_CORRESPONDENCE__PHYSICAL_CORRESPONDENCE_REPOSITORY = eINSTANCE.getMemorySpecificationCorrespondence_PhysicalCorrespondenceRepository();

		/**
		 * The meta object literal for the '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.StorageSpecificationCorrespondenceImpl <em>Storage Specification Correspondence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.StorageSpecificationCorrespondenceImpl
		 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.PhysicalcorrespondencePackageImpl#getStorageSpecificationCorrespondence()
		 * @generated
		 */
		EClass STORAGE_SPECIFICATION_CORRESPONDENCE = eINSTANCE.getStorageSpecificationCorrespondence();

		/**
		 * The meta object literal for the '<em><b>Cactos</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORAGE_SPECIFICATION_CORRESPONDENCE__CACTOS = eINSTANCE.getStorageSpecificationCorrespondence_Cactos();

		/**
		 * The meta object literal for the '<em><b>Palladio</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORAGE_SPECIFICATION_CORRESPONDENCE__PALLADIO = eINSTANCE.getStorageSpecificationCorrespondence_Palladio();

		/**
		 * The meta object literal for the '<em><b>Physical Correspondence Repository</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORAGE_SPECIFICATION_CORRESPONDENCE__PHYSICAL_CORRESPONDENCE_REPOSITORY = eINSTANCE.getStorageSpecificationCorrespondence_PhysicalCorrespondenceRepository();

		/**
		 * The meta object literal for the '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.NetworkInterconnectCorrespondenceImpl <em>Network Interconnect Correspondence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.NetworkInterconnectCorrespondenceImpl
		 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.PhysicalcorrespondencePackageImpl#getNetworkInterconnectCorrespondence()
		 * @generated
		 */
		EClass NETWORK_INTERCONNECT_CORRESPONDENCE = eINSTANCE.getNetworkInterconnectCorrespondence();

		/**
		 * The meta object literal for the '<em><b>Cactos</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK_INTERCONNECT_CORRESPONDENCE__CACTOS = eINSTANCE.getNetworkInterconnectCorrespondence_Cactos();

		/**
		 * The meta object literal for the '<em><b>Palladio</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK_INTERCONNECT_CORRESPONDENCE__PALLADIO = eINSTANCE.getNetworkInterconnectCorrespondence_Palladio();

		/**
		 * The meta object literal for the '<em><b>Physical Correspondence Repository</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK_INTERCONNECT_CORRESPONDENCE__PHYSICAL_CORRESPONDENCE_REPOSITORY = eINSTANCE.getNetworkInterconnectCorrespondence_PhysicalCorrespondenceRepository();

		/**
		 * The meta object literal for the '<em><b>Reconfiguration Controller</b></em>' reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference NETWORK_INTERCONNECT_CORRESPONDENCE__RECONFIGURATION_CONTROLLER = eINSTANCE.getNetworkInterconnectCorrespondence_ReconfigurationController();

        /**
		 * The meta object literal for the '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.ProcessingUnitSpecificationCorrespondenceImpl <em>Processing Unit Specification Correspondence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.ProcessingUnitSpecificationCorrespondenceImpl
		 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.PhysicalcorrespondencePackageImpl#getProcessingUnitSpecificationCorrespondence()
		 * @generated
		 */
		EClass PROCESSING_UNIT_SPECIFICATION_CORRESPONDENCE = eINSTANCE.getProcessingUnitSpecificationCorrespondence();

		/**
		 * The meta object literal for the '<em><b>Cactos</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSING_UNIT_SPECIFICATION_CORRESPONDENCE__CACTOS = eINSTANCE.getProcessingUnitSpecificationCorrespondence_Cactos();

		/**
		 * The meta object literal for the '<em><b>Palladio</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSING_UNIT_SPECIFICATION_CORRESPONDENCE__PALLADIO = eINSTANCE.getProcessingUnitSpecificationCorrespondence_Palladio();

		/**
		 * The meta object literal for the '<em><b>Physical Correspondence Repository</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSING_UNIT_SPECIFICATION_CORRESPONDENCE__PHYSICAL_CORRESPONDENCE_REPOSITORY = eINSTANCE.getProcessingUnitSpecificationCorrespondence_PhysicalCorrespondenceRepository();

		/**
		 * The meta object literal for the '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.PowerConsumingEntityMeasurementCorrespondenceImpl <em>Power Consuming Entity Measurement Correspondence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.PowerConsumingEntityMeasurementCorrespondenceImpl
		 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.PhysicalcorrespondencePackageImpl#getPowerConsumingEntityMeasurementCorrespondence()
		 * @generated
		 */
		EClass POWER_CONSUMING_ENTITY_MEASUREMENT_CORRESPONDENCE = eINSTANCE.getPowerConsumingEntityMeasurementCorrespondence();

		/**
		 * The meta object literal for the '<em><b>Cactos</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POWER_CONSUMING_ENTITY_MEASUREMENT_CORRESPONDENCE__CACTOS = eINSTANCE.getPowerConsumingEntityMeasurementCorrespondence_Cactos();

		/**
		 * The meta object literal for the '<em><b>Physical Correspondence Repository</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POWER_CONSUMING_ENTITY_MEASUREMENT_CORRESPONDENCE__PHYSICAL_CORRESPONDENCE_REPOSITORY = eINSTANCE.getPowerConsumingEntityMeasurementCorrespondence_PhysicalCorrespondenceRepository();

		/**
		 * The meta object literal for the '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.PowerProvidingEntityCorrespondenceImpl <em>Power Providing Entity Correspondence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.PowerProvidingEntityCorrespondenceImpl
		 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.PhysicalcorrespondencePackageImpl#getPowerProvidingEntityCorrespondence()
		 * @generated
		 */
		EClass POWER_PROVIDING_ENTITY_CORRESPONDENCE = eINSTANCE.getPowerProvidingEntityCorrespondence();

		/**
		 * The meta object literal for the '<em><b>Cactos</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POWER_PROVIDING_ENTITY_CORRESPONDENCE__CACTOS = eINSTANCE.getPowerProvidingEntityCorrespondence_Cactos();

		/**
		 * The meta object literal for the '<em><b>Palladio</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POWER_PROVIDING_ENTITY_CORRESPONDENCE__PALLADIO = eINSTANCE.getPowerProvidingEntityCorrespondence_Palladio();

		/**
		 * The meta object literal for the '<em><b>Physical Correspondence Repository</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POWER_PROVIDING_ENTITY_CORRESPONDENCE__PHYSICAL_CORRESPONDENCE_REPOSITORY = eINSTANCE.getPowerProvidingEntityCorrespondence_PhysicalCorrespondenceRepository();

		/**
		 * The meta object literal for the '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.PowerConsumingResourceCorrespondenceImpl <em>Power Consuming Resource Correspondence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.PowerConsumingResourceCorrespondenceImpl
		 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.PhysicalcorrespondencePackageImpl#getPowerConsumingResourceCorrespondence()
		 * @generated
		 */
		EClass POWER_CONSUMING_RESOURCE_CORRESPONDENCE = eINSTANCE.getPowerConsumingResourceCorrespondence();

		/**
		 * The meta object literal for the '<em><b>Cactos</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POWER_CONSUMING_RESOURCE_CORRESPONDENCE__CACTOS = eINSTANCE.getPowerConsumingResourceCorrespondence_Cactos();

		/**
		 * The meta object literal for the '<em><b>Palladio</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POWER_CONSUMING_RESOURCE_CORRESPONDENCE__PALLADIO = eINSTANCE.getPowerConsumingResourceCorrespondence_Palladio();

		/**
		 * The meta object literal for the '<em><b>Physical Correspondence Repository</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POWER_CONSUMING_RESOURCE_CORRESPONDENCE__PHYSICAL_CORRESPONDENCE_REPOSITORY = eINSTANCE.getPowerConsumingResourceCorrespondence_PhysicalCorrespondenceRepository();

        /**
		 * The meta object literal for the '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.ArchitectureTypeCorrespondenceImpl <em>Architecture Type Correspondence</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.ArchitectureTypeCorrespondenceImpl
		 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.PhysicalcorrespondencePackageImpl#getArchitectureTypeCorrespondence()
		 * @generated
		 */
        EClass ARCHITECTURE_TYPE_CORRESPONDENCE = eINSTANCE.getArchitectureTypeCorrespondence();

        /**
		 * The meta object literal for the '<em><b>Cactos</b></em>' reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference ARCHITECTURE_TYPE_CORRESPONDENCE__CACTOS = eINSTANCE.getArchitectureTypeCorrespondence_Cactos();

        /**
		 * The meta object literal for the '<em><b>Palladio</b></em>' reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference ARCHITECTURE_TYPE_CORRESPONDENCE__PALLADIO = eINSTANCE.getArchitectureTypeCorrespondence_Palladio();

        /**
		 * The meta object literal for the '<em><b>Physical Correspondence Repository</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference ARCHITECTURE_TYPE_CORRESPONDENCE__PHYSICAL_CORRESPONDENCE_REPOSITORY = eINSTANCE.getArchitectureTypeCorrespondence_PhysicalCorrespondenceRepository();

	}

} //PhysicalcorrespondencePackage
