/**
 */
package eu.cactosfp7.cactosim.correspondence;

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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see eu.cactosfp7.cactosim.correspondence.CorrespondenceFactory
 * @model kind="package"
 * @generated
 */
public interface CorrespondencePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "correspondence";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.cactosfp7.eu/Correspondence/1.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "correspondence";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CorrespondencePackage eINSTANCE = eu.cactosfp7.cactosim.correspondence.impl.CorrespondencePackageImpl.init();

	/**
	 * The meta object id for the '{@link eu.cactosfp7.cactosim.correspondence.impl.LoadCorrespondenceImpl <em>Load Correspondence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.cactosfp7.cactosim.correspondence.impl.LoadCorrespondenceImpl
	 * @see eu.cactosfp7.cactosim.correspondence.impl.CorrespondencePackageImpl#getLoadCorrespondence()
	 * @generated
	 */
	int LOAD_CORRESPONDENCE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_CORRESPONDENCE__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Palladio</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_CORRESPONDENCE__PALLADIO = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Load Correspondence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_CORRESPONDENCE_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link eu.cactosfp7.cactosim.correspondence.LoadCorrespondence <em>Load Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Load Correspondence</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.LoadCorrespondence
	 * @generated
	 */
	EClass getLoadCorrespondence();

	/**
	 * Returns the meta object for the reference '{@link eu.cactosfp7.cactosim.correspondence.LoadCorrespondence#getPalladio <em>Palladio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Palladio</em>'.
	 * @see eu.cactosfp7.cactosim.correspondence.LoadCorrespondence#getPalladio()
	 * @see #getLoadCorrespondence()
	 * @generated
	 */
	EReference getLoadCorrespondence_Palladio();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CorrespondenceFactory getCorrespondenceFactory();

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
		 * The meta object literal for the '{@link eu.cactosfp7.cactosim.correspondence.impl.LoadCorrespondenceImpl <em>Load Correspondence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.cactosfp7.cactosim.correspondence.impl.LoadCorrespondenceImpl
		 * @see eu.cactosfp7.cactosim.correspondence.impl.CorrespondencePackageImpl#getLoadCorrespondence()
		 * @generated
		 */
		EClass LOAD_CORRESPONDENCE = eINSTANCE.getLoadCorrespondence();

		/**
		 * The meta object literal for the '<em><b>Palladio</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOAD_CORRESPONDENCE__PALLADIO = eINSTANCE.getLoadCorrespondence_Palladio();

	}

} //CorrespondencePackage
