/**
 */
package eu.cactosfp7.cactosim.experimentscenario.request.util;

import eu.cactosfp7.cactosim.experimentscenario.request.*;

import eu.cactosfp7.identifier.util.IdentifierValidator;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see eu.cactosfp7.cactosim.experimentscenario.request.RequestPackage
 * @generated
 */
public class RequestValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RequestValidator INSTANCE = new RequestValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "eu.cactosfp7.cactosim.experimentscenario.request";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Application Instance Must Be Of The Right Template' of 'Start Application Request'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int START_APPLICATION_REQUEST__APPLICATION_INSTANCE_MUST_BE_OF_THE_RIGHT_TEMPLATE = 1;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 1;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected IdentifierValidator identifierValidator;

    /**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestValidator() {
		super();
		identifierValidator = IdentifierValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return RequestPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case RequestPackage.RECONFIGURE_OPTIMIZATION_ALGORITHM_REQUEST:
				return validateReconfigureOptimizationAlgorithmRequest((ReconfigureOptimizationAlgorithmRequest)value, diagnostics, context);
			case RequestPackage.MIGRATE_APPLICATION_REQUEST:
				return validateMigrateApplicationRequest((MigrateApplicationRequest)value, diagnostics, context);
			case RequestPackage.START_APPLICATION_REQUEST:
				return validateStartApplicationRequest((StartApplicationRequest)value, diagnostics, context);
			case RequestPackage.SUSPEND_APPLICATION_REQUEST:
				return validateSuspendApplicationRequest((SuspendApplicationRequest)value, diagnostics, context);
			case RequestPackage.TERMINATE_APPLICATION_REQUEST:
				return validateTerminateApplicationRequest((TerminateApplicationRequest)value, diagnostics, context);
			case RequestPackage.CHANGE_OPTIMIZATION_INTERVAL_REQUEST:
				return validateChangeOptimizationIntervalRequest((ChangeOptimizationIntervalRequest)value, diagnostics, context);
			case RequestPackage.RECONFIGURE_SCALABLE_IMAGE_CONNECTOR_REQUEST:
				return validateReconfigureScalableImageConnectorRequest((ReconfigureScalableImageConnectorRequest)value, diagnostics, context);
			case RequestPackage.SET_PHYSICAL_NODE_STATE_REQUEST:
				return validateSetPhysicalNodeStateRequest((SetPhysicalNodeStateRequest)value, diagnostics, context);
			case RequestPackage.RESUME_APPLICATION_REQUEST:
				return validateResumeApplicationRequest((ResumeApplicationRequest)value, diagnostics, context);
			case RequestPackage.EXPERIMENT_SCENARIO_REQUEST:
				return validateExperimentScenarioRequest((ExperimentScenarioRequest)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReconfigureOptimizationAlgorithmRequest(ReconfigureOptimizationAlgorithmRequest reconfigureOptimizationAlgorithmRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(reconfigureOptimizationAlgorithmRequest, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(reconfigureOptimizationAlgorithmRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(reconfigureOptimizationAlgorithmRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(reconfigureOptimizationAlgorithmRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(reconfigureOptimizationAlgorithmRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(reconfigureOptimizationAlgorithmRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(reconfigureOptimizationAlgorithmRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(reconfigureOptimizationAlgorithmRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(reconfigureOptimizationAlgorithmRequest, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_idHasToBeUnique(reconfigureOptimizationAlgorithmRequest, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMigrateApplicationRequest(MigrateApplicationRequest migrateApplicationRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(migrateApplicationRequest, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(migrateApplicationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(migrateApplicationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(migrateApplicationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(migrateApplicationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(migrateApplicationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(migrateApplicationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(migrateApplicationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(migrateApplicationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_idHasToBeUnique(migrateApplicationRequest, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStartApplicationRequest(StartApplicationRequest startApplicationRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(startApplicationRequest, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(startApplicationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(startApplicationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(startApplicationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(startApplicationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(startApplicationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(startApplicationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(startApplicationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(startApplicationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_idHasToBeUnique(startApplicationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validateStartApplicationRequest_applicationInstanceMustBeOfTheRightTemplate(startApplicationRequest, diagnostics, context);
		return result;
	}

	/**
	 * Validates the applicationInstanceMustBeOfTheRightTemplate constraint of '<em>Start Application Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStartApplicationRequest_applicationInstanceMustBeOfTheRightTemplate(StartApplicationRequest startApplicationRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return startApplicationRequest.applicationInstanceMustBeOfTheRightTemplate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSuspendApplicationRequest(SuspendApplicationRequest suspendApplicationRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(suspendApplicationRequest, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(suspendApplicationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(suspendApplicationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(suspendApplicationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(suspendApplicationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(suspendApplicationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(suspendApplicationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(suspendApplicationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(suspendApplicationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_idHasToBeUnique(suspendApplicationRequest, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTerminateApplicationRequest(TerminateApplicationRequest terminateApplicationRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(terminateApplicationRequest, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(terminateApplicationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(terminateApplicationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(terminateApplicationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(terminateApplicationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(terminateApplicationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(terminateApplicationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(terminateApplicationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(terminateApplicationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_idHasToBeUnique(terminateApplicationRequest, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChangeOptimizationIntervalRequest(ChangeOptimizationIntervalRequest changeOptimizationIntervalRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(changeOptimizationIntervalRequest, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(changeOptimizationIntervalRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(changeOptimizationIntervalRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(changeOptimizationIntervalRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(changeOptimizationIntervalRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(changeOptimizationIntervalRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(changeOptimizationIntervalRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(changeOptimizationIntervalRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(changeOptimizationIntervalRequest, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_idHasToBeUnique(changeOptimizationIntervalRequest, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReconfigureScalableImageConnectorRequest(ReconfigureScalableImageConnectorRequest reconfigureScalableImageConnectorRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(reconfigureScalableImageConnectorRequest, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(reconfigureScalableImageConnectorRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(reconfigureScalableImageConnectorRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(reconfigureScalableImageConnectorRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(reconfigureScalableImageConnectorRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(reconfigureScalableImageConnectorRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(reconfigureScalableImageConnectorRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(reconfigureScalableImageConnectorRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(reconfigureScalableImageConnectorRequest, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_idHasToBeUnique(reconfigureScalableImageConnectorRequest, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSetPhysicalNodeStateRequest(SetPhysicalNodeStateRequest setPhysicalNodeStateRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(setPhysicalNodeStateRequest, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(setPhysicalNodeStateRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(setPhysicalNodeStateRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(setPhysicalNodeStateRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(setPhysicalNodeStateRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(setPhysicalNodeStateRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(setPhysicalNodeStateRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(setPhysicalNodeStateRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(setPhysicalNodeStateRequest, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_idHasToBeUnique(setPhysicalNodeStateRequest, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResumeApplicationRequest(ResumeApplicationRequest resumeApplicationRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(resumeApplicationRequest, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(resumeApplicationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(resumeApplicationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(resumeApplicationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(resumeApplicationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(resumeApplicationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(resumeApplicationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(resumeApplicationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(resumeApplicationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_idHasToBeUnique(resumeApplicationRequest, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExperimentScenarioRequest(ExperimentScenarioRequest experimentScenarioRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(experimentScenarioRequest, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(experimentScenarioRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(experimentScenarioRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(experimentScenarioRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(experimentScenarioRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(experimentScenarioRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(experimentScenarioRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(experimentScenarioRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(experimentScenarioRequest, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_idHasToBeUnique(experimentScenarioRequest, diagnostics, context);
		return result;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //RequestValidator
