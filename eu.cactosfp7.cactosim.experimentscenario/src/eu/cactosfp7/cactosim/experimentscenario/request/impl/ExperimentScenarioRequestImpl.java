/**
 */
package eu.cactosfp7.cactosim.experimentscenario.request.impl;

import eu.cactosfp7.cactosim.experimentscenario.ExperimentscenarioPackage;
import eu.cactosfp7.cactosim.experimentscenario.TimeLineEvent;

import eu.cactosfp7.cactosim.experimentscenario.request.ExperimentScenarioRequest;
import eu.cactosfp7.cactosim.experimentscenario.request.RequestPackage;

import eu.cactosfp7.identifier.impl.IdentifierImpl;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Experiment Scenario Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.cactosim.experimentscenario.request.impl.ExperimentScenarioRequestImpl#getTimelineEvent <em>Timeline Event</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ExperimentScenarioRequestImpl extends IdentifierImpl implements ExperimentScenarioRequest {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExperimentScenarioRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequestPackage.Literals.EXPERIMENT_SCENARIO_REQUEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
    public TimeLineEvent getTimelineEvent() {
		return (TimeLineEvent)eDynamicGet(RequestPackage.EXPERIMENT_SCENARIO_REQUEST__TIMELINE_EVENT, RequestPackage.Literals.EXPERIMENT_SCENARIO_REQUEST__TIMELINE_EVENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimelineEvent(TimeLineEvent newTimelineEvent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTimelineEvent, RequestPackage.EXPERIMENT_SCENARIO_REQUEST__TIMELINE_EVENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
    public void setTimelineEvent(TimeLineEvent newTimelineEvent) {
		eDynamicSet(RequestPackage.EXPERIMENT_SCENARIO_REQUEST__TIMELINE_EVENT, RequestPackage.Literals.EXPERIMENT_SCENARIO_REQUEST__TIMELINE_EVENT, newTimelineEvent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RequestPackage.EXPERIMENT_SCENARIO_REQUEST__TIMELINE_EVENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTimelineEvent((TimeLineEvent)otherEnd, msgs);
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
			case RequestPackage.EXPERIMENT_SCENARIO_REQUEST__TIMELINE_EVENT:
				return basicSetTimelineEvent(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case RequestPackage.EXPERIMENT_SCENARIO_REQUEST__TIMELINE_EVENT:
				return eInternalContainer().eInverseRemove(this, ExperimentscenarioPackage.TIME_LINE_EVENT__EXPERIMENT_SCENARIO_REQUEST, TimeLineEvent.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RequestPackage.EXPERIMENT_SCENARIO_REQUEST__TIMELINE_EVENT:
				return getTimelineEvent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RequestPackage.EXPERIMENT_SCENARIO_REQUEST__TIMELINE_EVENT:
				setTimelineEvent((TimeLineEvent)newValue);
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
			case RequestPackage.EXPERIMENT_SCENARIO_REQUEST__TIMELINE_EVENT:
				setTimelineEvent((TimeLineEvent)null);
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
			case RequestPackage.EXPERIMENT_SCENARIO_REQUEST__TIMELINE_EVENT:
				return getTimelineEvent() != null;
		}
		return super.eIsSet(featureID);
	}

} //ExperimentScenarioRequestImpl
