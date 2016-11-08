/**
 */
package eu.cactosfp7.cactosim.experimentscenario.request;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see eu.cactosfp7.cactosim.experimentscenario.request.RequestPackage
 * @generated
 */
public interface RequestFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RequestFactory eINSTANCE = eu.cactosfp7.cactosim.experimentscenario.request.impl.RequestFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Reconfigure Optimization Algorithm Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reconfigure Optimization Algorithm Request</em>'.
	 * @generated
	 */
	ReconfigureOptimizationAlgorithmRequest createReconfigureOptimizationAlgorithmRequest();

	/**
	 * Returns a new object of class '<em>Migrate Application Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Migrate Application Request</em>'.
	 * @generated
	 */
	MigrateApplicationRequest createMigrateApplicationRequest();

	/**
	 * Returns a new object of class '<em>Start Application Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Start Application Request</em>'.
	 * @generated
	 */
	StartApplicationRequest createStartApplicationRequest();

	/**
	 * Returns a new object of class '<em>Suspend Application Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Suspend Application Request</em>'.
	 * @generated
	 */
	SuspendApplicationRequest createSuspendApplicationRequest();

	/**
	 * Returns a new object of class '<em>Terminate Application Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Terminate Application Request</em>'.
	 * @generated
	 */
	TerminateApplicationRequest createTerminateApplicationRequest();

	/**
	 * Returns a new object of class '<em>Change Optimization Interval Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Change Optimization Interval Request</em>'.
	 * @generated
	 */
	ChangeOptimizationIntervalRequest createChangeOptimizationIntervalRequest();

	/**
	 * Returns a new object of class '<em>Reconfigure Scalable Image Connector Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reconfigure Scalable Image Connector Request</em>'.
	 * @generated
	 */
	ReconfigureScalableImageConnectorRequest createReconfigureScalableImageConnectorRequest();

	/**
	 * Returns a new object of class '<em>Set Physical Node State Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set Physical Node State Request</em>'.
	 * @generated
	 */
	SetPhysicalNodeStateRequest createSetPhysicalNodeStateRequest();

	/**
	 * Returns a new object of class '<em>Resume Application Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resume Application Request</em>'.
	 * @generated
	 */
	ResumeApplicationRequest createResumeApplicationRequest();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RequestPackage getRequestPackage();

} //RequestFactory
