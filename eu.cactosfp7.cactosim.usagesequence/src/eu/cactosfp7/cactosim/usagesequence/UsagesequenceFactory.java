/**
 */
package eu.cactosfp7.cactosim.usagesequence;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see eu.cactosfp7.cactosim.usagesequence.UsagesequencePackage
 * @generated
 */
public interface UsagesequenceFactory extends EFactory {
    /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    UsagesequenceFactory eINSTANCE = eu.cactosfp7.cactosim.usagesequence.impl.UsagesequenceFactoryImpl.init();

    /**
	 * Returns a new object of class '<em>Usage Sequence Repository</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Usage Sequence Repository</em>'.
	 * @generated
	 */
    UsageSequenceRepository createUsageSequenceRepository();

    /**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
    UsagesequencePackage getUsagesequencePackage();

} //UsagesequenceFactory
