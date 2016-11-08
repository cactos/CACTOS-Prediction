/**
 */
package eu.cactosfp7.cactosim.experimentscenario.impl;

import eu.cactosfp7.cactosim.experimentscenario.EPlacementCompatibilityMode;
import eu.cactosfp7.cactosim.experimentscenario.ExperimentScenarioTimeLine;
import eu.cactosfp7.cactosim.experimentscenario.ExperimentscenarioPackage;
import eu.cactosfp7.cactosim.experimentscenario.TimeLineEvent;

import eu.cactosfp7.identifier.impl.IdentifierImpl;
import java.util.Collection;

import javax.measure.quantity.Duration;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.jscience.physics.amount.Amount;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Experiment Scenario Time Line</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.cactosim.experimentscenario.impl.ExperimentScenarioTimeLineImpl#getSimulationResolution <em>Simulation Resolution</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.experimentscenario.impl.ExperimentScenarioTimeLineImpl#getPlacementCompatibilityMode <em>Placement Compatibility Mode</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.experimentscenario.impl.ExperimentScenarioTimeLineImpl#getTimeLineEvents <em>Time Line Events</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExperimentScenarioTimeLineImpl extends IdentifierImpl implements ExperimentScenarioTimeLine {
	/**
	 * The default value of the '{@link #getPlacementCompatibilityMode() <em>Placement Compatibility Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlacementCompatibilityMode()
	 * @generated
	 * @ordered
	 */
	protected static final EPlacementCompatibilityMode PLACEMENT_COMPATIBILITY_MODE_EDEFAULT = EPlacementCompatibilityMode.SIMPLE_PLACEMENT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExperimentScenarioTimeLineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExperimentscenarioPackage.Literals.EXPERIMENT_SCENARIO_TIME_LINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Amount<Duration> getSimulationResolution() {
		return (Amount<Duration>)eDynamicGet(ExperimentscenarioPackage.EXPERIMENT_SCENARIO_TIME_LINE__SIMULATION_RESOLUTION, ExperimentscenarioPackage.Literals.EXPERIMENT_SCENARIO_TIME_LINE__SIMULATION_RESOLUTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSimulationResolution(Amount<Duration> newSimulationResolution) {
		eDynamicSet(ExperimentscenarioPackage.EXPERIMENT_SCENARIO_TIME_LINE__SIMULATION_RESOLUTION, ExperimentscenarioPackage.Literals.EXPERIMENT_SCENARIO_TIME_LINE__SIMULATION_RESOLUTION, newSimulationResolution);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EPlacementCompatibilityMode getPlacementCompatibilityMode() {
		return (EPlacementCompatibilityMode)eDynamicGet(ExperimentscenarioPackage.EXPERIMENT_SCENARIO_TIME_LINE__PLACEMENT_COMPATIBILITY_MODE, ExperimentscenarioPackage.Literals.EXPERIMENT_SCENARIO_TIME_LINE__PLACEMENT_COMPATIBILITY_MODE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlacementCompatibilityMode(EPlacementCompatibilityMode newPlacementCompatibilityMode) {
		eDynamicSet(ExperimentscenarioPackage.EXPERIMENT_SCENARIO_TIME_LINE__PLACEMENT_COMPATIBILITY_MODE, ExperimentscenarioPackage.Literals.EXPERIMENT_SCENARIO_TIME_LINE__PLACEMENT_COMPATIBILITY_MODE, newPlacementCompatibilityMode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
    @SuppressWarnings("unchecked")
	public EList<TimeLineEvent> getTimeLineEvents() {
		return (EList<TimeLineEvent>)eDynamicGet(ExperimentscenarioPackage.EXPERIMENT_SCENARIO_TIME_LINE__TIME_LINE_EVENTS, ExperimentscenarioPackage.Literals.EXPERIMENT_SCENARIO_TIME_LINE__TIME_LINE_EVENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExperimentscenarioPackage.EXPERIMENT_SCENARIO_TIME_LINE__TIME_LINE_EVENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTimeLineEvents()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExperimentscenarioPackage.EXPERIMENT_SCENARIO_TIME_LINE__TIME_LINE_EVENTS:
				return ((InternalEList<?>)getTimeLineEvents()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExperimentscenarioPackage.EXPERIMENT_SCENARIO_TIME_LINE__SIMULATION_RESOLUTION:
				return getSimulationResolution();
			case ExperimentscenarioPackage.EXPERIMENT_SCENARIO_TIME_LINE__PLACEMENT_COMPATIBILITY_MODE:
				return getPlacementCompatibilityMode();
			case ExperimentscenarioPackage.EXPERIMENT_SCENARIO_TIME_LINE__TIME_LINE_EVENTS:
				return getTimeLineEvents();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ExperimentscenarioPackage.EXPERIMENT_SCENARIO_TIME_LINE__SIMULATION_RESOLUTION:
				setSimulationResolution((Amount<Duration>)newValue);
				return;
			case ExperimentscenarioPackage.EXPERIMENT_SCENARIO_TIME_LINE__PLACEMENT_COMPATIBILITY_MODE:
				setPlacementCompatibilityMode((EPlacementCompatibilityMode)newValue);
				return;
			case ExperimentscenarioPackage.EXPERIMENT_SCENARIO_TIME_LINE__TIME_LINE_EVENTS:
				getTimeLineEvents().clear();
				getTimeLineEvents().addAll((Collection<? extends TimeLineEvent>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ExperimentscenarioPackage.EXPERIMENT_SCENARIO_TIME_LINE__SIMULATION_RESOLUTION:
				setSimulationResolution((Amount<Duration>)null);
				return;
			case ExperimentscenarioPackage.EXPERIMENT_SCENARIO_TIME_LINE__PLACEMENT_COMPATIBILITY_MODE:
				setPlacementCompatibilityMode(PLACEMENT_COMPATIBILITY_MODE_EDEFAULT);
				return;
			case ExperimentscenarioPackage.EXPERIMENT_SCENARIO_TIME_LINE__TIME_LINE_EVENTS:
				getTimeLineEvents().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ExperimentscenarioPackage.EXPERIMENT_SCENARIO_TIME_LINE__SIMULATION_RESOLUTION:
				return getSimulationResolution() != null;
			case ExperimentscenarioPackage.EXPERIMENT_SCENARIO_TIME_LINE__PLACEMENT_COMPATIBILITY_MODE:
				return getPlacementCompatibilityMode() != PLACEMENT_COMPATIBILITY_MODE_EDEFAULT;
			case ExperimentscenarioPackage.EXPERIMENT_SCENARIO_TIME_LINE__TIME_LINE_EVENTS:
				return !getTimeLineEvents().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ExperimentScenarioTimeLineImpl
