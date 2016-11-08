/**
 */
package eu.cactosfp7.cactosim.usagesequence.impl;

import eu.cactosfp7.cactosim.usagesequence.*;

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
public class UsagesequenceFactoryImpl extends EFactoryImpl implements UsagesequenceFactory {
    /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public static UsagesequenceFactory init() {
		try {
			UsagesequenceFactory theUsagesequenceFactory = (UsagesequenceFactory)EPackage.Registry.INSTANCE.getEFactory(UsagesequencePackage.eNS_URI);
			if (theUsagesequenceFactory != null) {
				return theUsagesequenceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UsagesequenceFactoryImpl();
	}

    /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public UsagesequenceFactoryImpl() {
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
			case UsagesequencePackage.USAGE_SEQUENCE_REPOSITORY: return (EObject)createUsageSequenceRepository();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public UsageSequenceRepository createUsageSequenceRepository() {
		UsageSequenceRepositoryImpl usageSequenceRepository = new UsageSequenceRepositoryImpl();
		return usageSequenceRepository;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public UsagesequencePackage getUsagesequencePackage() {
		return (UsagesequencePackage)getEPackage();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
    @Deprecated
    public static UsagesequencePackage getPackage() {
		return UsagesequencePackage.eINSTANCE;
	}

} //UsagesequenceFactoryImpl
