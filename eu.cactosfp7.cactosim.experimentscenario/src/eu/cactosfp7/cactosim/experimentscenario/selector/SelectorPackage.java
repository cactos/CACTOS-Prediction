/**
 */
package eu.cactosfp7.cactosim.experimentscenario.selector;

import eu.cactosfp7.identifier.IdentifierPackage;
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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see eu.cactosfp7.cactosim.experimentscenario.selector.SelectorFactory
 * @model kind="package"
 * @generated
 */
public interface SelectorPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "selector";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.cactosfp7.eu/ExperimentScenarioModel/Selector/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "selector";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SelectorPackage eINSTANCE = eu.cactosfp7.cactosim.experimentscenario.selector.impl.SelectorPackageImpl.init();

	/**
	 * The meta object id for the '{@link eu.cactosfp7.cactosim.experimentscenario.selector.impl.ApplicationInstanceSelectorImpl <em>Application Instance Selector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.cactosfp7.cactosim.experimentscenario.selector.impl.ApplicationInstanceSelectorImpl
	 * @see eu.cactosfp7.cactosim.experimentscenario.selector.impl.SelectorPackageImpl#getApplicationInstanceSelector()
	 * @generated
	 */
	int APPLICATION_INSTANCE_SELECTOR = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int APPLICATION_INSTANCE_SELECTOR__ID = IdentifierPackage.IDENTIFIER__ID;

    /**
	 * The number of structural features of the '<em>Application Instance Selector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_INSTANCE_SELECTOR_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Id Has To Be Unique</em>' operation.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int APPLICATION_INSTANCE_SELECTOR___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP = IdentifierPackage.IDENTIFIER___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP;

    /**
	 * The number of operations of the '<em>Application Instance Selector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_INSTANCE_SELECTOR_OPERATION_COUNT = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.cactosfp7.cactosim.experimentscenario.selector.impl.InitiallyRunningInstanceSelectorImpl <em>Initially Running Instance Selector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.cactosfp7.cactosim.experimentscenario.selector.impl.InitiallyRunningInstanceSelectorImpl
	 * @see eu.cactosfp7.cactosim.experimentscenario.selector.impl.SelectorPackageImpl#getInitiallyRunningInstanceSelector()
	 * @generated
	 */
	int INITIALLY_RUNNING_INSTANCE_SELECTOR = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int INITIALLY_RUNNING_INSTANCE_SELECTOR__ID = APPLICATION_INSTANCE_SELECTOR__ID;

    /**
	 * The feature id for the '<em><b>Application Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALLY_RUNNING_INSTANCE_SELECTOR__APPLICATION_INSTANCE = APPLICATION_INSTANCE_SELECTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Initially Running Instance Selector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALLY_RUNNING_INSTANCE_SELECTOR_FEATURE_COUNT = APPLICATION_INSTANCE_SELECTOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Id Has To Be Unique</em>' operation.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int INITIALLY_RUNNING_INSTANCE_SELECTOR___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP = APPLICATION_INSTANCE_SELECTOR___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP;

    /**
	 * The number of operations of the '<em>Initially Running Instance Selector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALLY_RUNNING_INSTANCE_SELECTOR_OPERATION_COUNT = APPLICATION_INSTANCE_SELECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.cactosfp7.cactosim.experimentscenario.selector.impl.PreviouslyStartedApplicationSelectorImpl <em>Previously Started Application Selector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.cactosfp7.cactosim.experimentscenario.selector.impl.PreviouslyStartedApplicationSelectorImpl
	 * @see eu.cactosfp7.cactosim.experimentscenario.selector.impl.SelectorPackageImpl#getPreviouslyStartedApplicationSelector()
	 * @generated
	 */
	int PREVIOUSLY_STARTED_APPLICATION_SELECTOR = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int PREVIOUSLY_STARTED_APPLICATION_SELECTOR__ID = APPLICATION_INSTANCE_SELECTOR__ID;

    /**
	 * The feature id for the '<em><b>Start Application Request</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREVIOUSLY_STARTED_APPLICATION_SELECTOR__START_APPLICATION_REQUEST = APPLICATION_INSTANCE_SELECTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Previously Started Application Selector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREVIOUSLY_STARTED_APPLICATION_SELECTOR_FEATURE_COUNT = APPLICATION_INSTANCE_SELECTOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Id Has To Be Unique</em>' operation.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int PREVIOUSLY_STARTED_APPLICATION_SELECTOR___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP = APPLICATION_INSTANCE_SELECTOR___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP;

    /**
	 * The number of operations of the '<em>Previously Started Application Selector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREVIOUSLY_STARTED_APPLICATION_SELECTOR_OPERATION_COUNT = APPLICATION_INSTANCE_SELECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.cactosfp7.cactosim.experimentscenario.selector.impl.PreviouslySuspendedApplicationSelectorImpl <em>Previously Suspended Application Selector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.cactosfp7.cactosim.experimentscenario.selector.impl.PreviouslySuspendedApplicationSelectorImpl
	 * @see eu.cactosfp7.cactosim.experimentscenario.selector.impl.SelectorPackageImpl#getPreviouslySuspendedApplicationSelector()
	 * @generated
	 */
	int PREVIOUSLY_SUSPENDED_APPLICATION_SELECTOR = 2;

	/**
	 * The feature id for the '<em><b>Suspend Request</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREVIOUSLY_SUSPENDED_APPLICATION_SELECTOR__SUSPEND_REQUEST = 0;

	/**
	 * The number of structural features of the '<em>Previously Suspended Application Selector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREVIOUSLY_SUSPENDED_APPLICATION_SELECTOR_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Previously Suspended Application Selector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREVIOUSLY_SUSPENDED_APPLICATION_SELECTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.cactosfp7.cactosim.experimentscenario.selector.impl.SuspendedInstanceSelectorImpl <em>Suspended Instance Selector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.cactosfp7.cactosim.experimentscenario.selector.impl.SuspendedInstanceSelectorImpl
	 * @see eu.cactosfp7.cactosim.experimentscenario.selector.impl.SelectorPackageImpl#getSuspendedInstanceSelector()
	 * @generated
	 */
	int SUSPENDED_INSTANCE_SELECTOR = 3;

	/**
	 * The number of structural features of the '<em>Suspended Instance Selector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSPENDED_INSTANCE_SELECTOR_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Suspended Instance Selector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSPENDED_INSTANCE_SELECTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.cactosfp7.cactosim.experimentscenario.selector.impl.NonWhiteBoxApplicationInstanceSelectorImpl <em>Non White Box Application Instance Selector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.cactosfp7.cactosim.experimentscenario.selector.impl.NonWhiteBoxApplicationInstanceSelectorImpl
	 * @see eu.cactosfp7.cactosim.experimentscenario.selector.impl.SelectorPackageImpl#getNonWhiteBoxApplicationInstanceSelector()
	 * @generated
	 */
	int NON_WHITE_BOX_APPLICATION_INSTANCE_SELECTOR = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int NON_WHITE_BOX_APPLICATION_INSTANCE_SELECTOR__ID = APPLICATION_INSTANCE_SELECTOR__ID;

    /**
	 * The number of structural features of the '<em>Non White Box Application Instance Selector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_WHITE_BOX_APPLICATION_INSTANCE_SELECTOR_FEATURE_COUNT = APPLICATION_INSTANCE_SELECTOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Id Has To Be Unique</em>' operation.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int NON_WHITE_BOX_APPLICATION_INSTANCE_SELECTOR___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP = APPLICATION_INSTANCE_SELECTOR___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP;

    /**
	 * The number of operations of the '<em>Non White Box Application Instance Selector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_WHITE_BOX_APPLICATION_INSTANCE_SELECTOR_OPERATION_COUNT = APPLICATION_INSTANCE_SELECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.cactosfp7.cactosim.experimentscenario.selector.impl.BlackBoxApplicationInstanceSelectorImpl <em>Black Box Application Instance Selector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.cactosfp7.cactosim.experimentscenario.selector.impl.BlackBoxApplicationInstanceSelectorImpl
	 * @see eu.cactosfp7.cactosim.experimentscenario.selector.impl.SelectorPackageImpl#getBlackBoxApplicationInstanceSelector()
	 * @generated
	 */
	int BLACK_BOX_APPLICATION_INSTANCE_SELECTOR = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int BLACK_BOX_APPLICATION_INSTANCE_SELECTOR__ID = NON_WHITE_BOX_APPLICATION_INSTANCE_SELECTOR__ID;

    /**
	 * The number of structural features of the '<em>Black Box Application Instance Selector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACK_BOX_APPLICATION_INSTANCE_SELECTOR_FEATURE_COUNT = NON_WHITE_BOX_APPLICATION_INSTANCE_SELECTOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Id Has To Be Unique</em>' operation.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int BLACK_BOX_APPLICATION_INSTANCE_SELECTOR___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP = NON_WHITE_BOX_APPLICATION_INSTANCE_SELECTOR___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP;

    /**
	 * The number of operations of the '<em>Black Box Application Instance Selector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACK_BOX_APPLICATION_INSTANCE_SELECTOR_OPERATION_COUNT = NON_WHITE_BOX_APPLICATION_INSTANCE_SELECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.cactosfp7.cactosim.experimentscenario.selector.impl.GreyBoxApplicationInstanceSelectorImpl <em>Grey Box Application Instance Selector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.cactosfp7.cactosim.experimentscenario.selector.impl.GreyBoxApplicationInstanceSelectorImpl
	 * @see eu.cactosfp7.cactosim.experimentscenario.selector.impl.SelectorPackageImpl#getGreyBoxApplicationInstanceSelector()
	 * @generated
	 */
	int GREY_BOX_APPLICATION_INSTANCE_SELECTOR = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int GREY_BOX_APPLICATION_INSTANCE_SELECTOR__ID = NON_WHITE_BOX_APPLICATION_INSTANCE_SELECTOR__ID;

    /**
	 * The number of structural features of the '<em>Grey Box Application Instance Selector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREY_BOX_APPLICATION_INSTANCE_SELECTOR_FEATURE_COUNT = NON_WHITE_BOX_APPLICATION_INSTANCE_SELECTOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Id Has To Be Unique</em>' operation.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int GREY_BOX_APPLICATION_INSTANCE_SELECTOR___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP = NON_WHITE_BOX_APPLICATION_INSTANCE_SELECTOR___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP;

    /**
	 * The number of operations of the '<em>Grey Box Application Instance Selector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREY_BOX_APPLICATION_INSTANCE_SELECTOR_OPERATION_COUNT = NON_WHITE_BOX_APPLICATION_INSTANCE_SELECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.cactosfp7.cactosim.experimentscenario.selector.impl.WhiteBoxApplicationInstanceSelectorImpl <em>White Box Application Instance Selector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.cactosfp7.cactosim.experimentscenario.selector.impl.WhiteBoxApplicationInstanceSelectorImpl
	 * @see eu.cactosfp7.cactosim.experimentscenario.selector.impl.SelectorPackageImpl#getWhiteBoxApplicationInstanceSelector()
	 * @generated
	 */
	int WHITE_BOX_APPLICATION_INSTANCE_SELECTOR = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int WHITE_BOX_APPLICATION_INSTANCE_SELECTOR__ID = APPLICATION_INSTANCE_SELECTOR__ID;

    /**
	 * The number of structural features of the '<em>White Box Application Instance Selector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHITE_BOX_APPLICATION_INSTANCE_SELECTOR_FEATURE_COUNT = APPLICATION_INSTANCE_SELECTOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Id Has To Be Unique</em>' operation.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int WHITE_BOX_APPLICATION_INSTANCE_SELECTOR___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP = APPLICATION_INSTANCE_SELECTOR___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP;

    /**
	 * The number of operations of the '<em>White Box Application Instance Selector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHITE_BOX_APPLICATION_INSTANCE_SELECTOR_OPERATION_COUNT = APPLICATION_INSTANCE_SELECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.cactosfp7.cactosim.experimentscenario.selector.impl.InitiallyRunningWhiteBoxApplicationInstanceSelectorImpl <em>Initially Running White Box Application Instance Selector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.cactosfp7.cactosim.experimentscenario.selector.impl.InitiallyRunningWhiteBoxApplicationInstanceSelectorImpl
	 * @see eu.cactosfp7.cactosim.experimentscenario.selector.impl.SelectorPackageImpl#getInitiallyRunningWhiteBoxApplicationInstanceSelector()
	 * @generated
	 */
	int INITIALLY_RUNNING_WHITE_BOX_APPLICATION_INSTANCE_SELECTOR = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int INITIALLY_RUNNING_WHITE_BOX_APPLICATION_INSTANCE_SELECTOR__ID = WHITE_BOX_APPLICATION_INSTANCE_SELECTOR__ID;

    /**
	 * The feature id for the '<em><b>Application Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALLY_RUNNING_WHITE_BOX_APPLICATION_INSTANCE_SELECTOR__APPLICATION_INSTANCE = WHITE_BOX_APPLICATION_INSTANCE_SELECTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Initially Running White Box Application Instance Selector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALLY_RUNNING_WHITE_BOX_APPLICATION_INSTANCE_SELECTOR_FEATURE_COUNT = WHITE_BOX_APPLICATION_INSTANCE_SELECTOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Id Has To Be Unique</em>' operation.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int INITIALLY_RUNNING_WHITE_BOX_APPLICATION_INSTANCE_SELECTOR___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP = WHITE_BOX_APPLICATION_INSTANCE_SELECTOR___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP;

    /**
	 * The number of operations of the '<em>Initially Running White Box Application Instance Selector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALLY_RUNNING_WHITE_BOX_APPLICATION_INSTANCE_SELECTOR_OPERATION_COUNT = WHITE_BOX_APPLICATION_INSTANCE_SELECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.cactosfp7.cactosim.experimentscenario.selector.impl.InitiallyRunningGreyBoxApplicationInstanceSelectorImpl <em>Initially Running Grey Box Application Instance Selector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.cactosfp7.cactosim.experimentscenario.selector.impl.InitiallyRunningGreyBoxApplicationInstanceSelectorImpl
	 * @see eu.cactosfp7.cactosim.experimentscenario.selector.impl.SelectorPackageImpl#getInitiallyRunningGreyBoxApplicationInstanceSelector()
	 * @generated
	 */
	int INITIALLY_RUNNING_GREY_BOX_APPLICATION_INSTANCE_SELECTOR = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int INITIALLY_RUNNING_GREY_BOX_APPLICATION_INSTANCE_SELECTOR__ID = INITIALLY_RUNNING_INSTANCE_SELECTOR__ID;

    /**
	 * The feature id for the '<em><b>Application Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALLY_RUNNING_GREY_BOX_APPLICATION_INSTANCE_SELECTOR__APPLICATION_INSTANCE = INITIALLY_RUNNING_INSTANCE_SELECTOR__APPLICATION_INSTANCE;

	/**
	 * The number of structural features of the '<em>Initially Running Grey Box Application Instance Selector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALLY_RUNNING_GREY_BOX_APPLICATION_INSTANCE_SELECTOR_FEATURE_COUNT = INITIALLY_RUNNING_INSTANCE_SELECTOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Id Has To Be Unique</em>' operation.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int INITIALLY_RUNNING_GREY_BOX_APPLICATION_INSTANCE_SELECTOR___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP = INITIALLY_RUNNING_INSTANCE_SELECTOR___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP;

    /**
	 * The number of operations of the '<em>Initially Running Grey Box Application Instance Selector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALLY_RUNNING_GREY_BOX_APPLICATION_INSTANCE_SELECTOR_OPERATION_COUNT = INITIALLY_RUNNING_INSTANCE_SELECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.cactosfp7.cactosim.experimentscenario.selector.impl.InitiallyRunningBlackBoxApplicationInstanceSelectorImpl <em>Initially Running Black Box Application Instance Selector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.cactosfp7.cactosim.experimentscenario.selector.impl.InitiallyRunningBlackBoxApplicationInstanceSelectorImpl
	 * @see eu.cactosfp7.cactosim.experimentscenario.selector.impl.SelectorPackageImpl#getInitiallyRunningBlackBoxApplicationInstanceSelector()
	 * @generated
	 */
	int INITIALLY_RUNNING_BLACK_BOX_APPLICATION_INSTANCE_SELECTOR = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int INITIALLY_RUNNING_BLACK_BOX_APPLICATION_INSTANCE_SELECTOR__ID = BLACK_BOX_APPLICATION_INSTANCE_SELECTOR__ID;

    /**
	 * The feature id for the '<em><b>Application Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALLY_RUNNING_BLACK_BOX_APPLICATION_INSTANCE_SELECTOR__APPLICATION_INSTANCE = BLACK_BOX_APPLICATION_INSTANCE_SELECTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Initially Running Black Box Application Instance Selector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALLY_RUNNING_BLACK_BOX_APPLICATION_INSTANCE_SELECTOR_FEATURE_COUNT = BLACK_BOX_APPLICATION_INSTANCE_SELECTOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Id Has To Be Unique</em>' operation.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int INITIALLY_RUNNING_BLACK_BOX_APPLICATION_INSTANCE_SELECTOR___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP = BLACK_BOX_APPLICATION_INSTANCE_SELECTOR___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP;

    /**
	 * The number of operations of the '<em>Initially Running Black Box Application Instance Selector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALLY_RUNNING_BLACK_BOX_APPLICATION_INSTANCE_SELECTOR_OPERATION_COUNT = BLACK_BOX_APPLICATION_INSTANCE_SELECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.cactosfp7.cactosim.experimentscenario.selector.impl.PreviouslyStartedWhiteBoxApplicationInstanceSelectorImpl <em>Previously Started White Box Application Instance Selector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.cactosfp7.cactosim.experimentscenario.selector.impl.PreviouslyStartedWhiteBoxApplicationInstanceSelectorImpl
	 * @see eu.cactosfp7.cactosim.experimentscenario.selector.impl.SelectorPackageImpl#getPreviouslyStartedWhiteBoxApplicationInstanceSelector()
	 * @generated
	 */
	int PREVIOUSLY_STARTED_WHITE_BOX_APPLICATION_INSTANCE_SELECTOR = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int PREVIOUSLY_STARTED_WHITE_BOX_APPLICATION_INSTANCE_SELECTOR__ID = WHITE_BOX_APPLICATION_INSTANCE_SELECTOR__ID;

    /**
	 * The feature id for the '<em><b>Start Application Request</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREVIOUSLY_STARTED_WHITE_BOX_APPLICATION_INSTANCE_SELECTOR__START_APPLICATION_REQUEST = WHITE_BOX_APPLICATION_INSTANCE_SELECTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Previously Started White Box Application Instance Selector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREVIOUSLY_STARTED_WHITE_BOX_APPLICATION_INSTANCE_SELECTOR_FEATURE_COUNT = WHITE_BOX_APPLICATION_INSTANCE_SELECTOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Id Has To Be Unique</em>' operation.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int PREVIOUSLY_STARTED_WHITE_BOX_APPLICATION_INSTANCE_SELECTOR___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP = WHITE_BOX_APPLICATION_INSTANCE_SELECTOR___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP;

    /**
	 * The number of operations of the '<em>Previously Started White Box Application Instance Selector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREVIOUSLY_STARTED_WHITE_BOX_APPLICATION_INSTANCE_SELECTOR_OPERATION_COUNT = WHITE_BOX_APPLICATION_INSTANCE_SELECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.cactosfp7.cactosim.experimentscenario.selector.impl.PreviouslyStartedBlackBoxApplicationSelectorImpl <em>Previously Started Black Box Application Selector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.cactosfp7.cactosim.experimentscenario.selector.impl.PreviouslyStartedBlackBoxApplicationSelectorImpl
	 * @see eu.cactosfp7.cactosim.experimentscenario.selector.impl.SelectorPackageImpl#getPreviouslyStartedBlackBoxApplicationSelector()
	 * @generated
	 */
	int PREVIOUSLY_STARTED_BLACK_BOX_APPLICATION_SELECTOR = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int PREVIOUSLY_STARTED_BLACK_BOX_APPLICATION_SELECTOR__ID = PREVIOUSLY_STARTED_APPLICATION_SELECTOR__ID;

    /**
	 * The feature id for the '<em><b>Start Application Request</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREVIOUSLY_STARTED_BLACK_BOX_APPLICATION_SELECTOR__START_APPLICATION_REQUEST = PREVIOUSLY_STARTED_APPLICATION_SELECTOR__START_APPLICATION_REQUEST;

	/**
	 * The number of structural features of the '<em>Previously Started Black Box Application Selector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREVIOUSLY_STARTED_BLACK_BOX_APPLICATION_SELECTOR_FEATURE_COUNT = PREVIOUSLY_STARTED_APPLICATION_SELECTOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Id Has To Be Unique</em>' operation.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int PREVIOUSLY_STARTED_BLACK_BOX_APPLICATION_SELECTOR___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP = PREVIOUSLY_STARTED_APPLICATION_SELECTOR___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP;

    /**
	 * The number of operations of the '<em>Previously Started Black Box Application Selector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREVIOUSLY_STARTED_BLACK_BOX_APPLICATION_SELECTOR_OPERATION_COUNT = PREVIOUSLY_STARTED_APPLICATION_SELECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.cactosfp7.cactosim.experimentscenario.selector.impl.PreviouslyStartedGreyBoxApplicationSelectorImpl <em>Previously Started Grey Box Application Selector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.cactosfp7.cactosim.experimentscenario.selector.impl.PreviouslyStartedGreyBoxApplicationSelectorImpl
	 * @see eu.cactosfp7.cactosim.experimentscenario.selector.impl.SelectorPackageImpl#getPreviouslyStartedGreyBoxApplicationSelector()
	 * @generated
	 */
	int PREVIOUSLY_STARTED_GREY_BOX_APPLICATION_SELECTOR = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int PREVIOUSLY_STARTED_GREY_BOX_APPLICATION_SELECTOR__ID = PREVIOUSLY_STARTED_APPLICATION_SELECTOR__ID;

    /**
	 * The feature id for the '<em><b>Start Application Request</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREVIOUSLY_STARTED_GREY_BOX_APPLICATION_SELECTOR__START_APPLICATION_REQUEST = PREVIOUSLY_STARTED_APPLICATION_SELECTOR__START_APPLICATION_REQUEST;

	/**
	 * The number of structural features of the '<em>Previously Started Grey Box Application Selector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREVIOUSLY_STARTED_GREY_BOX_APPLICATION_SELECTOR_FEATURE_COUNT = PREVIOUSLY_STARTED_APPLICATION_SELECTOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Id Has To Be Unique</em>' operation.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int PREVIOUSLY_STARTED_GREY_BOX_APPLICATION_SELECTOR___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP = PREVIOUSLY_STARTED_APPLICATION_SELECTOR___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP;

    /**
	 * The number of operations of the '<em>Previously Started Grey Box Application Selector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREVIOUSLY_STARTED_GREY_BOX_APPLICATION_SELECTOR_OPERATION_COUNT = PREVIOUSLY_STARTED_APPLICATION_SELECTOR_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link eu.cactosfp7.cactosim.experimentscenario.selector.InitiallyRunningInstanceSelector <em>Initially Running Instance Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initially Running Instance Selector</em>'.
	 * @see eu.cactosfp7.cactosim.experimentscenario.selector.InitiallyRunningInstanceSelector
	 * @generated
	 */
	EClass getInitiallyRunningInstanceSelector();

	/**
	 * Returns the meta object for the reference '{@link eu.cactosfp7.cactosim.experimentscenario.selector.InitiallyRunningInstanceSelector#getApplicationInstance <em>Application Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Application Instance</em>'.
	 * @see eu.cactosfp7.cactosim.experimentscenario.selector.InitiallyRunningInstanceSelector#getApplicationInstance()
	 * @see #getInitiallyRunningInstanceSelector()
	 * @generated
	 */
	EReference getInitiallyRunningInstanceSelector_ApplicationInstance();

	/**
	 * Returns the meta object for class '{@link eu.cactosfp7.cactosim.experimentscenario.selector.PreviouslyStartedApplicationSelector <em>Previously Started Application Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Previously Started Application Selector</em>'.
	 * @see eu.cactosfp7.cactosim.experimentscenario.selector.PreviouslyStartedApplicationSelector
	 * @generated
	 */
	EClass getPreviouslyStartedApplicationSelector();

	/**
	 * Returns the meta object for the reference '{@link eu.cactosfp7.cactosim.experimentscenario.selector.PreviouslyStartedApplicationSelector#getStartApplicationRequest <em>Start Application Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start Application Request</em>'.
	 * @see eu.cactosfp7.cactosim.experimentscenario.selector.PreviouslyStartedApplicationSelector#getStartApplicationRequest()
	 * @see #getPreviouslyStartedApplicationSelector()
	 * @generated
	 */
	EReference getPreviouslyStartedApplicationSelector_StartApplicationRequest();

	/**
	 * Returns the meta object for class '{@link eu.cactosfp7.cactosim.experimentscenario.selector.PreviouslySuspendedApplicationSelector <em>Previously Suspended Application Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Previously Suspended Application Selector</em>'.
	 * @see eu.cactosfp7.cactosim.experimentscenario.selector.PreviouslySuspendedApplicationSelector
	 * @generated
	 */
	EClass getPreviouslySuspendedApplicationSelector();

	/**
	 * Returns the meta object for the reference '{@link eu.cactosfp7.cactosim.experimentscenario.selector.PreviouslySuspendedApplicationSelector#getSuspendRequest <em>Suspend Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Suspend Request</em>'.
	 * @see eu.cactosfp7.cactosim.experimentscenario.selector.PreviouslySuspendedApplicationSelector#getSuspendRequest()
	 * @see #getPreviouslySuspendedApplicationSelector()
	 * @generated
	 */
	EReference getPreviouslySuspendedApplicationSelector_SuspendRequest();

	/**
	 * Returns the meta object for class '{@link eu.cactosfp7.cactosim.experimentscenario.selector.SuspendedInstanceSelector <em>Suspended Instance Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Suspended Instance Selector</em>'.
	 * @see eu.cactosfp7.cactosim.experimentscenario.selector.SuspendedInstanceSelector
	 * @generated
	 */
	EClass getSuspendedInstanceSelector();

	/**
	 * Returns the meta object for class '{@link eu.cactosfp7.cactosim.experimentscenario.selector.BlackBoxApplicationInstanceSelector <em>Black Box Application Instance Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Black Box Application Instance Selector</em>'.
	 * @see eu.cactosfp7.cactosim.experimentscenario.selector.BlackBoxApplicationInstanceSelector
	 * @generated
	 */
	EClass getBlackBoxApplicationInstanceSelector();

	/**
	 * Returns the meta object for class '{@link eu.cactosfp7.cactosim.experimentscenario.selector.NonWhiteBoxApplicationInstanceSelector <em>Non White Box Application Instance Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Non White Box Application Instance Selector</em>'.
	 * @see eu.cactosfp7.cactosim.experimentscenario.selector.NonWhiteBoxApplicationInstanceSelector
	 * @generated
	 */
	EClass getNonWhiteBoxApplicationInstanceSelector();

	/**
	 * Returns the meta object for class '{@link eu.cactosfp7.cactosim.experimentscenario.selector.GreyBoxApplicationInstanceSelector <em>Grey Box Application Instance Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grey Box Application Instance Selector</em>'.
	 * @see eu.cactosfp7.cactosim.experimentscenario.selector.GreyBoxApplicationInstanceSelector
	 * @generated
	 */
	EClass getGreyBoxApplicationInstanceSelector();

	/**
	 * Returns the meta object for class '{@link eu.cactosfp7.cactosim.experimentscenario.selector.WhiteBoxApplicationInstanceSelector <em>White Box Application Instance Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>White Box Application Instance Selector</em>'.
	 * @see eu.cactosfp7.cactosim.experimentscenario.selector.WhiteBoxApplicationInstanceSelector
	 * @generated
	 */
	EClass getWhiteBoxApplicationInstanceSelector();

	/**
	 * Returns the meta object for class '{@link eu.cactosfp7.cactosim.experimentscenario.selector.InitiallyRunningWhiteBoxApplicationInstanceSelector <em>Initially Running White Box Application Instance Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initially Running White Box Application Instance Selector</em>'.
	 * @see eu.cactosfp7.cactosim.experimentscenario.selector.InitiallyRunningWhiteBoxApplicationInstanceSelector
	 * @generated
	 */
	EClass getInitiallyRunningWhiteBoxApplicationInstanceSelector();

	/**
	 * Returns the meta object for class '{@link eu.cactosfp7.cactosim.experimentscenario.selector.InitiallyRunningGreyBoxApplicationInstanceSelector <em>Initially Running Grey Box Application Instance Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initially Running Grey Box Application Instance Selector</em>'.
	 * @see eu.cactosfp7.cactosim.experimentscenario.selector.InitiallyRunningGreyBoxApplicationInstanceSelector
	 * @generated
	 */
	EClass getInitiallyRunningGreyBoxApplicationInstanceSelector();

	/**
	 * Returns the meta object for class '{@link eu.cactosfp7.cactosim.experimentscenario.selector.InitiallyRunningBlackBoxApplicationInstanceSelector <em>Initially Running Black Box Application Instance Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initially Running Black Box Application Instance Selector</em>'.
	 * @see eu.cactosfp7.cactosim.experimentscenario.selector.InitiallyRunningBlackBoxApplicationInstanceSelector
	 * @generated
	 */
	EClass getInitiallyRunningBlackBoxApplicationInstanceSelector();

	/**
	 * Returns the meta object for class '{@link eu.cactosfp7.cactosim.experimentscenario.selector.PreviouslyStartedWhiteBoxApplicationInstanceSelector <em>Previously Started White Box Application Instance Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Previously Started White Box Application Instance Selector</em>'.
	 * @see eu.cactosfp7.cactosim.experimentscenario.selector.PreviouslyStartedWhiteBoxApplicationInstanceSelector
	 * @generated
	 */
	EClass getPreviouslyStartedWhiteBoxApplicationInstanceSelector();

	/**
	 * Returns the meta object for class '{@link eu.cactosfp7.cactosim.experimentscenario.selector.PreviouslyStartedBlackBoxApplicationSelector <em>Previously Started Black Box Application Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Previously Started Black Box Application Selector</em>'.
	 * @see eu.cactosfp7.cactosim.experimentscenario.selector.PreviouslyStartedBlackBoxApplicationSelector
	 * @generated
	 */
	EClass getPreviouslyStartedBlackBoxApplicationSelector();

	/**
	 * Returns the meta object for class '{@link eu.cactosfp7.cactosim.experimentscenario.selector.PreviouslyStartedGreyBoxApplicationSelector <em>Previously Started Grey Box Application Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Previously Started Grey Box Application Selector</em>'.
	 * @see eu.cactosfp7.cactosim.experimentscenario.selector.PreviouslyStartedGreyBoxApplicationSelector
	 * @generated
	 */
	EClass getPreviouslyStartedGreyBoxApplicationSelector();

	/**
	 * Returns the meta object for class '{@link eu.cactosfp7.cactosim.experimentscenario.selector.ApplicationInstanceSelector <em>Application Instance Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application Instance Selector</em>'.
	 * @see eu.cactosfp7.cactosim.experimentscenario.selector.ApplicationInstanceSelector
	 * @generated
	 */
	EClass getApplicationInstanceSelector();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SelectorFactory getSelectorFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link eu.cactosfp7.cactosim.experimentscenario.selector.impl.InitiallyRunningInstanceSelectorImpl <em>Initially Running Instance Selector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.cactosfp7.cactosim.experimentscenario.selector.impl.InitiallyRunningInstanceSelectorImpl
		 * @see eu.cactosfp7.cactosim.experimentscenario.selector.impl.SelectorPackageImpl#getInitiallyRunningInstanceSelector()
		 * @generated
		 */
		EClass INITIALLY_RUNNING_INSTANCE_SELECTOR = eINSTANCE.getInitiallyRunningInstanceSelector();

		/**
		 * The meta object literal for the '<em><b>Application Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIALLY_RUNNING_INSTANCE_SELECTOR__APPLICATION_INSTANCE = eINSTANCE.getInitiallyRunningInstanceSelector_ApplicationInstance();

		/**
		 * The meta object literal for the '{@link eu.cactosfp7.cactosim.experimentscenario.selector.impl.PreviouslyStartedApplicationSelectorImpl <em>Previously Started Application Selector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.cactosfp7.cactosim.experimentscenario.selector.impl.PreviouslyStartedApplicationSelectorImpl
		 * @see eu.cactosfp7.cactosim.experimentscenario.selector.impl.SelectorPackageImpl#getPreviouslyStartedApplicationSelector()
		 * @generated
		 */
		EClass PREVIOUSLY_STARTED_APPLICATION_SELECTOR = eINSTANCE.getPreviouslyStartedApplicationSelector();

		/**
		 * The meta object literal for the '<em><b>Start Application Request</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREVIOUSLY_STARTED_APPLICATION_SELECTOR__START_APPLICATION_REQUEST = eINSTANCE.getPreviouslyStartedApplicationSelector_StartApplicationRequest();

		/**
		 * The meta object literal for the '{@link eu.cactosfp7.cactosim.experimentscenario.selector.impl.PreviouslySuspendedApplicationSelectorImpl <em>Previously Suspended Application Selector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.cactosfp7.cactosim.experimentscenario.selector.impl.PreviouslySuspendedApplicationSelectorImpl
		 * @see eu.cactosfp7.cactosim.experimentscenario.selector.impl.SelectorPackageImpl#getPreviouslySuspendedApplicationSelector()
		 * @generated
		 */
		EClass PREVIOUSLY_SUSPENDED_APPLICATION_SELECTOR = eINSTANCE.getPreviouslySuspendedApplicationSelector();

		/**
		 * The meta object literal for the '<em><b>Suspend Request</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREVIOUSLY_SUSPENDED_APPLICATION_SELECTOR__SUSPEND_REQUEST = eINSTANCE.getPreviouslySuspendedApplicationSelector_SuspendRequest();

		/**
		 * The meta object literal for the '{@link eu.cactosfp7.cactosim.experimentscenario.selector.impl.SuspendedInstanceSelectorImpl <em>Suspended Instance Selector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.cactosfp7.cactosim.experimentscenario.selector.impl.SuspendedInstanceSelectorImpl
		 * @see eu.cactosfp7.cactosim.experimentscenario.selector.impl.SelectorPackageImpl#getSuspendedInstanceSelector()
		 * @generated
		 */
		EClass SUSPENDED_INSTANCE_SELECTOR = eINSTANCE.getSuspendedInstanceSelector();

		/**
		 * The meta object literal for the '{@link eu.cactosfp7.cactosim.experimentscenario.selector.impl.BlackBoxApplicationInstanceSelectorImpl <em>Black Box Application Instance Selector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.cactosfp7.cactosim.experimentscenario.selector.impl.BlackBoxApplicationInstanceSelectorImpl
		 * @see eu.cactosfp7.cactosim.experimentscenario.selector.impl.SelectorPackageImpl#getBlackBoxApplicationInstanceSelector()
		 * @generated
		 */
		EClass BLACK_BOX_APPLICATION_INSTANCE_SELECTOR = eINSTANCE.getBlackBoxApplicationInstanceSelector();

		/**
		 * The meta object literal for the '{@link eu.cactosfp7.cactosim.experimentscenario.selector.impl.NonWhiteBoxApplicationInstanceSelectorImpl <em>Non White Box Application Instance Selector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.cactosfp7.cactosim.experimentscenario.selector.impl.NonWhiteBoxApplicationInstanceSelectorImpl
		 * @see eu.cactosfp7.cactosim.experimentscenario.selector.impl.SelectorPackageImpl#getNonWhiteBoxApplicationInstanceSelector()
		 * @generated
		 */
		EClass NON_WHITE_BOX_APPLICATION_INSTANCE_SELECTOR = eINSTANCE.getNonWhiteBoxApplicationInstanceSelector();

		/**
		 * The meta object literal for the '{@link eu.cactosfp7.cactosim.experimentscenario.selector.impl.GreyBoxApplicationInstanceSelectorImpl <em>Grey Box Application Instance Selector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.cactosfp7.cactosim.experimentscenario.selector.impl.GreyBoxApplicationInstanceSelectorImpl
		 * @see eu.cactosfp7.cactosim.experimentscenario.selector.impl.SelectorPackageImpl#getGreyBoxApplicationInstanceSelector()
		 * @generated
		 */
		EClass GREY_BOX_APPLICATION_INSTANCE_SELECTOR = eINSTANCE.getGreyBoxApplicationInstanceSelector();

		/**
		 * The meta object literal for the '{@link eu.cactosfp7.cactosim.experimentscenario.selector.impl.WhiteBoxApplicationInstanceSelectorImpl <em>White Box Application Instance Selector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.cactosfp7.cactosim.experimentscenario.selector.impl.WhiteBoxApplicationInstanceSelectorImpl
		 * @see eu.cactosfp7.cactosim.experimentscenario.selector.impl.SelectorPackageImpl#getWhiteBoxApplicationInstanceSelector()
		 * @generated
		 */
		EClass WHITE_BOX_APPLICATION_INSTANCE_SELECTOR = eINSTANCE.getWhiteBoxApplicationInstanceSelector();

		/**
		 * The meta object literal for the '{@link eu.cactosfp7.cactosim.experimentscenario.selector.impl.InitiallyRunningWhiteBoxApplicationInstanceSelectorImpl <em>Initially Running White Box Application Instance Selector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.cactosfp7.cactosim.experimentscenario.selector.impl.InitiallyRunningWhiteBoxApplicationInstanceSelectorImpl
		 * @see eu.cactosfp7.cactosim.experimentscenario.selector.impl.SelectorPackageImpl#getInitiallyRunningWhiteBoxApplicationInstanceSelector()
		 * @generated
		 */
		EClass INITIALLY_RUNNING_WHITE_BOX_APPLICATION_INSTANCE_SELECTOR = eINSTANCE.getInitiallyRunningWhiteBoxApplicationInstanceSelector();

		/**
		 * The meta object literal for the '{@link eu.cactosfp7.cactosim.experimentscenario.selector.impl.InitiallyRunningGreyBoxApplicationInstanceSelectorImpl <em>Initially Running Grey Box Application Instance Selector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.cactosfp7.cactosim.experimentscenario.selector.impl.InitiallyRunningGreyBoxApplicationInstanceSelectorImpl
		 * @see eu.cactosfp7.cactosim.experimentscenario.selector.impl.SelectorPackageImpl#getInitiallyRunningGreyBoxApplicationInstanceSelector()
		 * @generated
		 */
		EClass INITIALLY_RUNNING_GREY_BOX_APPLICATION_INSTANCE_SELECTOR = eINSTANCE.getInitiallyRunningGreyBoxApplicationInstanceSelector();

		/**
		 * The meta object literal for the '{@link eu.cactosfp7.cactosim.experimentscenario.selector.impl.InitiallyRunningBlackBoxApplicationInstanceSelectorImpl <em>Initially Running Black Box Application Instance Selector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.cactosfp7.cactosim.experimentscenario.selector.impl.InitiallyRunningBlackBoxApplicationInstanceSelectorImpl
		 * @see eu.cactosfp7.cactosim.experimentscenario.selector.impl.SelectorPackageImpl#getInitiallyRunningBlackBoxApplicationInstanceSelector()
		 * @generated
		 */
		EClass INITIALLY_RUNNING_BLACK_BOX_APPLICATION_INSTANCE_SELECTOR = eINSTANCE.getInitiallyRunningBlackBoxApplicationInstanceSelector();

		/**
		 * The meta object literal for the '{@link eu.cactosfp7.cactosim.experimentscenario.selector.impl.PreviouslyStartedWhiteBoxApplicationInstanceSelectorImpl <em>Previously Started White Box Application Instance Selector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.cactosfp7.cactosim.experimentscenario.selector.impl.PreviouslyStartedWhiteBoxApplicationInstanceSelectorImpl
		 * @see eu.cactosfp7.cactosim.experimentscenario.selector.impl.SelectorPackageImpl#getPreviouslyStartedWhiteBoxApplicationInstanceSelector()
		 * @generated
		 */
		EClass PREVIOUSLY_STARTED_WHITE_BOX_APPLICATION_INSTANCE_SELECTOR = eINSTANCE.getPreviouslyStartedWhiteBoxApplicationInstanceSelector();

		/**
		 * The meta object literal for the '{@link eu.cactosfp7.cactosim.experimentscenario.selector.impl.PreviouslyStartedBlackBoxApplicationSelectorImpl <em>Previously Started Black Box Application Selector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.cactosfp7.cactosim.experimentscenario.selector.impl.PreviouslyStartedBlackBoxApplicationSelectorImpl
		 * @see eu.cactosfp7.cactosim.experimentscenario.selector.impl.SelectorPackageImpl#getPreviouslyStartedBlackBoxApplicationSelector()
		 * @generated
		 */
		EClass PREVIOUSLY_STARTED_BLACK_BOX_APPLICATION_SELECTOR = eINSTANCE.getPreviouslyStartedBlackBoxApplicationSelector();

		/**
		 * The meta object literal for the '{@link eu.cactosfp7.cactosim.experimentscenario.selector.impl.PreviouslyStartedGreyBoxApplicationSelectorImpl <em>Previously Started Grey Box Application Selector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.cactosfp7.cactosim.experimentscenario.selector.impl.PreviouslyStartedGreyBoxApplicationSelectorImpl
		 * @see eu.cactosfp7.cactosim.experimentscenario.selector.impl.SelectorPackageImpl#getPreviouslyStartedGreyBoxApplicationSelector()
		 * @generated
		 */
		EClass PREVIOUSLY_STARTED_GREY_BOX_APPLICATION_SELECTOR = eINSTANCE.getPreviouslyStartedGreyBoxApplicationSelector();

		/**
		 * The meta object literal for the '{@link eu.cactosfp7.cactosim.experimentscenario.selector.impl.ApplicationInstanceSelectorImpl <em>Application Instance Selector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.cactosfp7.cactosim.experimentscenario.selector.impl.ApplicationInstanceSelectorImpl
		 * @see eu.cactosfp7.cactosim.experimentscenario.selector.impl.SelectorPackageImpl#getApplicationInstanceSelector()
		 * @generated
		 */
		EClass APPLICATION_INSTANCE_SELECTOR = eINSTANCE.getApplicationInstanceSelector();

	}

} //SelectorPackage
