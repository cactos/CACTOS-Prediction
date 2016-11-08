/**
 */
package eu.cactosfp7.cactosim.usagesequence;

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
 * @see eu.cactosfp7.cactosim.usagesequence.UsagesequenceFactory
 * @model kind="package"
 * @generated
 */
public interface UsagesequencePackage extends EPackage {
    /**
	 * The package name.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    String eNAME = "usagesequence";

    /**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    String eNS_URI = "http://www.cactosfp7.eu/CactoSim/UsageSequence/1.1";

    /**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    String eNS_PREFIX = "usagesequence";

    /**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    UsagesequencePackage eINSTANCE = eu.cactosfp7.cactosim.usagesequence.impl.UsagesequencePackageImpl.init();

    /**
	 * The meta object id for the '{@link eu.cactosfp7.cactosim.usagesequence.impl.UsageSequenceRepositoryImpl <em>Usage Sequence Repository</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see eu.cactosfp7.cactosim.usagesequence.impl.UsageSequenceRepositoryImpl
	 * @see eu.cactosfp7.cactosim.usagesequence.impl.UsagesequencePackageImpl#getUsageSequenceRepository()
	 * @generated
	 */
    int USAGE_SEQUENCE_REPOSITORY = 0;

    /**
	 * The feature id for the '<em><b>Sequences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int USAGE_SEQUENCE_REPOSITORY__SEQUENCES = 0;

    /**
	 * The number of structural features of the '<em>Usage Sequence Repository</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int USAGE_SEQUENCE_REPOSITORY_FEATURE_COUNT = 1;


    /**
	 * Returns the meta object for class '{@link eu.cactosfp7.cactosim.usagesequence.UsageSequenceRepository <em>Usage Sequence Repository</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Usage Sequence Repository</em>'.
	 * @see eu.cactosfp7.cactosim.usagesequence.UsageSequenceRepository
	 * @generated
	 */
    EClass getUsageSequenceRepository();

    /**
	 * Returns the meta object for the containment reference list '{@link eu.cactosfp7.cactosim.usagesequence.UsageSequenceRepository#getSequences <em>Sequences</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sequences</em>'.
	 * @see eu.cactosfp7.cactosim.usagesequence.UsageSequenceRepository#getSequences()
	 * @see #getUsageSequenceRepository()
	 * @generated
	 */
    EReference getUsageSequenceRepository_Sequences();

    /**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
    UsagesequenceFactory getUsagesequenceFactory();

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
		 * The meta object literal for the '{@link eu.cactosfp7.cactosim.usagesequence.impl.UsageSequenceRepositoryImpl <em>Usage Sequence Repository</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see eu.cactosfp7.cactosim.usagesequence.impl.UsageSequenceRepositoryImpl
		 * @see eu.cactosfp7.cactosim.usagesequence.impl.UsagesequencePackageImpl#getUsageSequenceRepository()
		 * @generated
		 */
        EClass USAGE_SEQUENCE_REPOSITORY = eINSTANCE.getUsageSequenceRepository();

        /**
		 * The meta object literal for the '<em><b>Sequences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference USAGE_SEQUENCE_REPOSITORY__SEQUENCES = eINSTANCE.getUsageSequenceRepository_Sequences();

    }

} //UsagesequencePackage
