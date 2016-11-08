/**
 */
package eu.cactosfp7.cactosim.experimentscenario.impl;

import eu.cactosfp7.cactosim.experimentscenario.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class ExperimentscenarioFactoryImpl extends EFactoryImpl implements ExperimentscenarioFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExperimentscenarioFactory init() {
		try {
			ExperimentscenarioFactory theExperimentscenarioFactory = (ExperimentscenarioFactory)EPackage.Registry.INSTANCE.getEFactory(ExperimentscenarioPackage.eNS_URI);
			if (theExperimentscenarioFactory != null) {
				return theExperimentscenarioFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ExperimentscenarioFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExperimentscenarioFactoryImpl() {
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
			case ExperimentscenarioPackage.ABSOLUTE_TIME_EVENT: return createAbsoluteTimeEvent();
			case ExperimentscenarioPackage.EXPERIMENT_SCENARIO_TIME_LINE: return createExperimentScenarioTimeLine();
			case ExperimentscenarioPackage.RELATIVE_TIME_EVENT: return createRelativeTimeEvent();
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
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ExperimentscenarioPackage.EVENT_STATUS:
				return createEventStatusFromString(eDataType, initialValue);
			case ExperimentscenarioPackage.EPLACEMENT_COMPATIBILITY_MODE:
				return createEPlacementCompatibilityModeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ExperimentscenarioPackage.EVENT_STATUS:
				return convertEventStatusToString(eDataType, instanceValue);
			case ExperimentscenarioPackage.EPLACEMENT_COMPATIBILITY_MODE:
				return convertEPlacementCompatibilityModeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbsoluteTimeEvent createAbsoluteTimeEvent() {
		AbsoluteTimeEventImpl absoluteTimeEvent = new AbsoluteTimeEventImpl();
		return absoluteTimeEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExperimentScenarioTimeLine createExperimentScenarioTimeLine() {
		ExperimentScenarioTimeLineImpl experimentScenarioTimeLine = new ExperimentScenarioTimeLineImpl();
		return experimentScenarioTimeLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelativeTimeEvent createRelativeTimeEvent() {
		RelativeTimeEventImpl relativeTimeEvent = new RelativeTimeEventImpl();
		return relativeTimeEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventStatus createEventStatusFromString(EDataType eDataType, String initialValue) {
		EventStatus result = EventStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEventStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPlacementCompatibilityMode createEPlacementCompatibilityModeFromString(EDataType eDataType, String initialValue) {
		EPlacementCompatibilityMode result = EPlacementCompatibilityMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEPlacementCompatibilityModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExperimentscenarioPackage getExperimentscenarioPackage() {
		return (ExperimentscenarioPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ExperimentscenarioPackage getPackage() {
		return ExperimentscenarioPackage.eINSTANCE;
	}

} //ExperimentscenarioFactoryImpl
