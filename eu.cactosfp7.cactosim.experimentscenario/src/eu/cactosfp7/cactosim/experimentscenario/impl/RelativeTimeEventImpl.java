/**
 */
package eu.cactosfp7.cactosim.experimentscenario.impl;

import eu.cactosfp7.cactosim.experimentscenario.ExperimentscenarioPackage;
import eu.cactosfp7.cactosim.experimentscenario.RelativeTimeEvent;
import eu.cactosfp7.cactosim.experimentscenario.TimeLineEvent;

import javax.measure.quantity.Duration;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.jscience.physics.amount.Amount;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relative Time Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.cactosim.experimentscenario.impl.RelativeTimeEventImpl#getIntervalSinceEvent <em>Interval Since Event</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.experimentscenario.impl.RelativeTimeEventImpl#getReferenceEvent <em>Reference Event</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelativeTimeEventImpl extends TimeLineEventImpl implements RelativeTimeEvent {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelativeTimeEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExperimentscenarioPackage.Literals.RELATIVE_TIME_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
    public Amount<Duration> getIntervalSinceEvent() {
		return (Amount<Duration>)eDynamicGet(ExperimentscenarioPackage.RELATIVE_TIME_EVENT__INTERVAL_SINCE_EVENT, ExperimentscenarioPackage.Literals.RELATIVE_TIME_EVENT__INTERVAL_SINCE_EVENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
    public void setIntervalSinceEvent(Amount<Duration> newIntervalSinceEvent) {
		eDynamicSet(ExperimentscenarioPackage.RELATIVE_TIME_EVENT__INTERVAL_SINCE_EVENT, ExperimentscenarioPackage.Literals.RELATIVE_TIME_EVENT__INTERVAL_SINCE_EVENT, newIntervalSinceEvent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
    public TimeLineEvent getReferenceEvent() {
		return (TimeLineEvent)eDynamicGet(ExperimentscenarioPackage.RELATIVE_TIME_EVENT__REFERENCE_EVENT, ExperimentscenarioPackage.Literals.RELATIVE_TIME_EVENT__REFERENCE_EVENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeLineEvent basicGetReferenceEvent() {
		return (TimeLineEvent)eDynamicGet(ExperimentscenarioPackage.RELATIVE_TIME_EVENT__REFERENCE_EVENT, ExperimentscenarioPackage.Literals.RELATIVE_TIME_EVENT__REFERENCE_EVENT, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetReferenceEvent(TimeLineEvent newReferenceEvent, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newReferenceEvent, ExperimentscenarioPackage.RELATIVE_TIME_EVENT__REFERENCE_EVENT, msgs);
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
    public void setReferenceEvent(TimeLineEvent newReferenceEvent) {
		eDynamicSet(ExperimentscenarioPackage.RELATIVE_TIME_EVENT__REFERENCE_EVENT, ExperimentscenarioPackage.Literals.RELATIVE_TIME_EVENT__REFERENCE_EVENT, newReferenceEvent);
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExperimentscenarioPackage.RELATIVE_TIME_EVENT__REFERENCE_EVENT:
				TimeLineEvent referenceEvent = basicGetReferenceEvent();
				if (referenceEvent != null)
					msgs = ((InternalEObject)referenceEvent).eInverseRemove(this, ExperimentscenarioPackage.TIME_LINE_EVENT__RELATIVE_TIME_EVENTS, TimeLineEvent.class, msgs);
				return basicSetReferenceEvent((TimeLineEvent)otherEnd, msgs);
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
			case ExperimentscenarioPackage.RELATIVE_TIME_EVENT__REFERENCE_EVENT:
				return basicSetReferenceEvent(null, msgs);
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
			case ExperimentscenarioPackage.RELATIVE_TIME_EVENT__INTERVAL_SINCE_EVENT:
				return getIntervalSinceEvent();
			case ExperimentscenarioPackage.RELATIVE_TIME_EVENT__REFERENCE_EVENT:
				if (resolve) return getReferenceEvent();
				return basicGetReferenceEvent();
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
			case ExperimentscenarioPackage.RELATIVE_TIME_EVENT__INTERVAL_SINCE_EVENT:
				setIntervalSinceEvent((Amount<Duration>)newValue);
				return;
			case ExperimentscenarioPackage.RELATIVE_TIME_EVENT__REFERENCE_EVENT:
				setReferenceEvent((TimeLineEvent)newValue);
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
			case ExperimentscenarioPackage.RELATIVE_TIME_EVENT__INTERVAL_SINCE_EVENT:
				setIntervalSinceEvent((Amount<Duration>)null);
				return;
			case ExperimentscenarioPackage.RELATIVE_TIME_EVENT__REFERENCE_EVENT:
				setReferenceEvent((TimeLineEvent)null);
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
			case ExperimentscenarioPackage.RELATIVE_TIME_EVENT__INTERVAL_SINCE_EVENT:
				return getIntervalSinceEvent() != null;
			case ExperimentscenarioPackage.RELATIVE_TIME_EVENT__REFERENCE_EVENT:
				return basicGetReferenceEvent() != null;
		}
		return super.eIsSet(featureID);
	}

} //RelativeTimeEventImpl
