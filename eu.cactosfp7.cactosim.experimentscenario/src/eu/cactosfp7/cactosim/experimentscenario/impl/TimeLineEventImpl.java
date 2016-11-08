/**
 */
package eu.cactosfp7.cactosim.experimentscenario.impl;

import eu.cactosfp7.cactosim.experimentscenario.EventStatus;
import eu.cactosfp7.cactosim.experimentscenario.ExperimentScenarioTimeLine;
import eu.cactosfp7.cactosim.experimentscenario.ExperimentscenarioPackage;
import eu.cactosfp7.cactosim.experimentscenario.RelativeTimeEvent;
import eu.cactosfp7.cactosim.experimentscenario.TimeLineEvent;

import eu.cactosfp7.cactosim.experimentscenario.request.ExperimentScenarioRequest;

import eu.cactosfp7.identifier.impl.IdentifierImpl;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Line Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.cactosim.experimentscenario.impl.TimeLineEventImpl#getExperimentScenarioRequest <em>Experiment Scenario Request</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.experimentscenario.impl.TimeLineEventImpl#getEventStatus <em>Event Status</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.experimentscenario.impl.TimeLineEventImpl#getExperimentScenarioTimeline <em>Experiment Scenario Timeline</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.experimentscenario.impl.TimeLineEventImpl#getRelativeTimeEvents <em>Relative Time Events</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TimeLineEventImpl extends IdentifierImpl implements TimeLineEvent {
	/**
	 * The default value of the '{@link #getEventStatus() <em>Event Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventStatus()
	 * @generated
	 * @ordered
	 */
	protected static final EventStatus EVENT_STATUS_EDEFAULT = EventStatus.PENDING;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeLineEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExperimentscenarioPackage.Literals.TIME_LINE_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
    public ExperimentScenarioRequest getExperimentScenarioRequest() {
		return (ExperimentScenarioRequest)eDynamicGet(ExperimentscenarioPackage.TIME_LINE_EVENT__EXPERIMENT_SCENARIO_REQUEST, ExperimentscenarioPackage.Literals.TIME_LINE_EVENT__EXPERIMENT_SCENARIO_REQUEST, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExperimentScenarioRequest(ExperimentScenarioRequest newExperimentScenarioRequest, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newExperimentScenarioRequest, ExperimentscenarioPackage.TIME_LINE_EVENT__EXPERIMENT_SCENARIO_REQUEST, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
    public void setExperimentScenarioRequest(ExperimentScenarioRequest newExperimentScenarioRequest) {
		eDynamicSet(ExperimentscenarioPackage.TIME_LINE_EVENT__EXPERIMENT_SCENARIO_REQUEST, ExperimentscenarioPackage.Literals.TIME_LINE_EVENT__EXPERIMENT_SCENARIO_REQUEST, newExperimentScenarioRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
    public EventStatus getEventStatus() {
		return (EventStatus)eDynamicGet(ExperimentscenarioPackage.TIME_LINE_EVENT__EVENT_STATUS, ExperimentscenarioPackage.Literals.TIME_LINE_EVENT__EVENT_STATUS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
    public void setEventStatus(EventStatus newEventStatus) {
		eDynamicSet(ExperimentscenarioPackage.TIME_LINE_EVENT__EVENT_STATUS, ExperimentscenarioPackage.Literals.TIME_LINE_EVENT__EVENT_STATUS, newEventStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExperimentScenarioTimeLine getExperimentScenarioTimeline() {
		return (ExperimentScenarioTimeLine)eDynamicGet(ExperimentscenarioPackage.TIME_LINE_EVENT__EXPERIMENT_SCENARIO_TIMELINE, ExperimentscenarioPackage.Literals.TIME_LINE_EVENT__EXPERIMENT_SCENARIO_TIMELINE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExperimentScenarioTimeline(ExperimentScenarioTimeLine newExperimentScenarioTimeline, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newExperimentScenarioTimeline, ExperimentscenarioPackage.TIME_LINE_EVENT__EXPERIMENT_SCENARIO_TIMELINE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExperimentScenarioTimeline(ExperimentScenarioTimeLine newExperimentScenarioTimeline) {
		eDynamicSet(ExperimentscenarioPackage.TIME_LINE_EVENT__EXPERIMENT_SCENARIO_TIMELINE, ExperimentscenarioPackage.Literals.TIME_LINE_EVENT__EXPERIMENT_SCENARIO_TIMELINE, newExperimentScenarioTimeline);
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    @SuppressWarnings("unchecked")
    public EList<RelativeTimeEvent> getRelativeTimeEvents() {
		return (EList<RelativeTimeEvent>)eDynamicGet(ExperimentscenarioPackage.TIME_LINE_EVENT__RELATIVE_TIME_EVENTS, ExperimentscenarioPackage.Literals.TIME_LINE_EVENT__RELATIVE_TIME_EVENTS, true, true);
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
			case ExperimentscenarioPackage.TIME_LINE_EVENT__EXPERIMENT_SCENARIO_REQUEST:
				ExperimentScenarioRequest experimentScenarioRequest = getExperimentScenarioRequest();
				if (experimentScenarioRequest != null)
					msgs = ((InternalEObject)experimentScenarioRequest).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExperimentscenarioPackage.TIME_LINE_EVENT__EXPERIMENT_SCENARIO_REQUEST, null, msgs);
				return basicSetExperimentScenarioRequest((ExperimentScenarioRequest)otherEnd, msgs);
			case ExperimentscenarioPackage.TIME_LINE_EVENT__EXPERIMENT_SCENARIO_TIMELINE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetExperimentScenarioTimeline((ExperimentScenarioTimeLine)otherEnd, msgs);
			case ExperimentscenarioPackage.TIME_LINE_EVENT__RELATIVE_TIME_EVENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRelativeTimeEvents()).basicAdd(otherEnd, msgs);
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
			case ExperimentscenarioPackage.TIME_LINE_EVENT__EXPERIMENT_SCENARIO_REQUEST:
				return basicSetExperimentScenarioRequest(null, msgs);
			case ExperimentscenarioPackage.TIME_LINE_EVENT__EXPERIMENT_SCENARIO_TIMELINE:
				return basicSetExperimentScenarioTimeline(null, msgs);
			case ExperimentscenarioPackage.TIME_LINE_EVENT__RELATIVE_TIME_EVENTS:
				return ((InternalEList<?>)getRelativeTimeEvents()).basicRemove(otherEnd, msgs);
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
			case ExperimentscenarioPackage.TIME_LINE_EVENT__EXPERIMENT_SCENARIO_TIMELINE:
				return eInternalContainer().eInverseRemove(this, ExperimentscenarioPackage.EXPERIMENT_SCENARIO_TIME_LINE__TIME_LINE_EVENTS, ExperimentScenarioTimeLine.class, msgs);
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
			case ExperimentscenarioPackage.TIME_LINE_EVENT__EXPERIMENT_SCENARIO_REQUEST:
				return getExperimentScenarioRequest();
			case ExperimentscenarioPackage.TIME_LINE_EVENT__EVENT_STATUS:
				return getEventStatus();
			case ExperimentscenarioPackage.TIME_LINE_EVENT__EXPERIMENT_SCENARIO_TIMELINE:
				return getExperimentScenarioTimeline();
			case ExperimentscenarioPackage.TIME_LINE_EVENT__RELATIVE_TIME_EVENTS:
				return getRelativeTimeEvents();
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
			case ExperimentscenarioPackage.TIME_LINE_EVENT__EXPERIMENT_SCENARIO_REQUEST:
				setExperimentScenarioRequest((ExperimentScenarioRequest)newValue);
				return;
			case ExperimentscenarioPackage.TIME_LINE_EVENT__EVENT_STATUS:
				setEventStatus((EventStatus)newValue);
				return;
			case ExperimentscenarioPackage.TIME_LINE_EVENT__EXPERIMENT_SCENARIO_TIMELINE:
				setExperimentScenarioTimeline((ExperimentScenarioTimeLine)newValue);
				return;
			case ExperimentscenarioPackage.TIME_LINE_EVENT__RELATIVE_TIME_EVENTS:
				getRelativeTimeEvents().clear();
				getRelativeTimeEvents().addAll((Collection<? extends RelativeTimeEvent>)newValue);
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
			case ExperimentscenarioPackage.TIME_LINE_EVENT__EXPERIMENT_SCENARIO_REQUEST:
				setExperimentScenarioRequest((ExperimentScenarioRequest)null);
				return;
			case ExperimentscenarioPackage.TIME_LINE_EVENT__EVENT_STATUS:
				setEventStatus(EVENT_STATUS_EDEFAULT);
				return;
			case ExperimentscenarioPackage.TIME_LINE_EVENT__EXPERIMENT_SCENARIO_TIMELINE:
				setExperimentScenarioTimeline((ExperimentScenarioTimeLine)null);
				return;
			case ExperimentscenarioPackage.TIME_LINE_EVENT__RELATIVE_TIME_EVENTS:
				getRelativeTimeEvents().clear();
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
			case ExperimentscenarioPackage.TIME_LINE_EVENT__EXPERIMENT_SCENARIO_REQUEST:
				return getExperimentScenarioRequest() != null;
			case ExperimentscenarioPackage.TIME_LINE_EVENT__EVENT_STATUS:
				return getEventStatus() != EVENT_STATUS_EDEFAULT;
			case ExperimentscenarioPackage.TIME_LINE_EVENT__EXPERIMENT_SCENARIO_TIMELINE:
				return getExperimentScenarioTimeline() != null;
			case ExperimentscenarioPackage.TIME_LINE_EVENT__RELATIVE_TIME_EVENTS:
				return !getRelativeTimeEvents().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TimeLineEventImpl
