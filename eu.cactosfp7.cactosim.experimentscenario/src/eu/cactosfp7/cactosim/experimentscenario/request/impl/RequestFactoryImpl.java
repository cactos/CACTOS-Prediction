/**
 */
package eu.cactosfp7.cactosim.experimentscenario.request.impl;

import eu.cactosfp7.cactosim.experimentscenario.request.*;

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
public class RequestFactoryImpl extends EFactoryImpl implements RequestFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RequestFactory init() {
		try {
			RequestFactory theRequestFactory = (RequestFactory)EPackage.Registry.INSTANCE.getEFactory(RequestPackage.eNS_URI);
			if (theRequestFactory != null) {
				return theRequestFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RequestFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestFactoryImpl() {
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
			case RequestPackage.RECONFIGURE_OPTIMIZATION_ALGORITHM_REQUEST: return createReconfigureOptimizationAlgorithmRequest();
			case RequestPackage.MIGRATE_APPLICATION_REQUEST: return createMigrateApplicationRequest();
			case RequestPackage.START_APPLICATION_REQUEST: return createStartApplicationRequest();
			case RequestPackage.SUSPEND_APPLICATION_REQUEST: return createSuspendApplicationRequest();
			case RequestPackage.TERMINATE_APPLICATION_REQUEST: return createTerminateApplicationRequest();
			case RequestPackage.CHANGE_OPTIMIZATION_INTERVAL_REQUEST: return createChangeOptimizationIntervalRequest();
			case RequestPackage.RECONFIGURE_SCALABLE_IMAGE_CONNECTOR_REQUEST: return createReconfigureScalableImageConnectorRequest();
			case RequestPackage.SET_PHYSICAL_NODE_STATE_REQUEST: return createSetPhysicalNodeStateRequest();
			case RequestPackage.RESUME_APPLICATION_REQUEST: return createResumeApplicationRequest();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReconfigureOptimizationAlgorithmRequest createReconfigureOptimizationAlgorithmRequest() {
		ReconfigureOptimizationAlgorithmRequestImpl reconfigureOptimizationAlgorithmRequest = new ReconfigureOptimizationAlgorithmRequestImpl();
		return reconfigureOptimizationAlgorithmRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MigrateApplicationRequest createMigrateApplicationRequest() {
		MigrateApplicationRequestImpl migrateApplicationRequest = new MigrateApplicationRequestImpl();
		return migrateApplicationRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StartApplicationRequest createStartApplicationRequest() {
		StartApplicationRequestImpl startApplicationRequest = new StartApplicationRequestImpl();
		return startApplicationRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SuspendApplicationRequest createSuspendApplicationRequest() {
		SuspendApplicationRequestImpl suspendApplicationRequest = new SuspendApplicationRequestImpl();
		return suspendApplicationRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminateApplicationRequest createTerminateApplicationRequest() {
		TerminateApplicationRequestImpl terminateApplicationRequest = new TerminateApplicationRequestImpl();
		return terminateApplicationRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChangeOptimizationIntervalRequest createChangeOptimizationIntervalRequest() {
		ChangeOptimizationIntervalRequestImpl changeOptimizationIntervalRequest = new ChangeOptimizationIntervalRequestImpl();
		return changeOptimizationIntervalRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReconfigureScalableImageConnectorRequest createReconfigureScalableImageConnectorRequest() {
		ReconfigureScalableImageConnectorRequestImpl reconfigureScalableImageConnectorRequest = new ReconfigureScalableImageConnectorRequestImpl();
		return reconfigureScalableImageConnectorRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SetPhysicalNodeStateRequest createSetPhysicalNodeStateRequest() {
		SetPhysicalNodeStateRequestImpl setPhysicalNodeStateRequest = new SetPhysicalNodeStateRequestImpl();
		return setPhysicalNodeStateRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResumeApplicationRequest createResumeApplicationRequest() {
		ResumeApplicationRequestImpl resumeApplicationRequest = new ResumeApplicationRequestImpl();
		return resumeApplicationRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequestPackage getRequestPackage() {
		return (RequestPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RequestPackage getPackage() {
		return RequestPackage.eINSTANCE;
	}

} //RequestFactoryImpl
