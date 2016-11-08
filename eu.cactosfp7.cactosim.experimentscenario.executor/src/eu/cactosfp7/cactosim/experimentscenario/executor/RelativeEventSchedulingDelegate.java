package eu.cactosfp7.cactosim.experimentscenario.executor;

import java.util.Optional;
import java.util.function.Consumer;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;

import eu.cactosfp7.cactosim.experimentscenario.EventStatus;
import eu.cactosfp7.cactosim.experimentscenario.RelativeTimeEvent;
import eu.cactosfp7.cactosim.experimentscenario.TimeLineEvent;
import eu.cactosfp7.cactosim.experimentscenario.util.ExperimentscenarioSwitch;

public class RelativeEventSchedulingDelegate extends AdapterImpl {
   
    private static final ExperimentscenarioSwitch<Optional<TimeLineEvent>> EVENT_SWITCH = 
            new ExperimentscenarioSwitch<Optional<TimeLineEvent>>() {
        @Override
        public Optional<TimeLineEvent> caseTimeLineEvent(TimeLineEvent object) {
            return Optional.of(object);
        }
        
        public Optional<TimeLineEvent> defaultCase(EObject object) {
            return Optional.empty();
        };
    };

    protected Consumer<RelativeTimeEvent> schedulingRoutine;


    public RelativeEventSchedulingDelegate(Consumer<RelativeTimeEvent> schedulingRoutine) {
        this.schedulingRoutine = schedulingRoutine;
    }

    public void delayProcessingOfRelatedTimeEvents(TimeLineEvent event) {
	if (event.getRelativeTimeEvents().size() > 0)
            event.eAdapters().add(this);
    }
    
    @Override
    public void notifyChanged(final Notification msg) {
        super.notifyChanged(msg);
        
        EVENT_SWITCH.doSwitch((EObject) msg.getNotifier())
                    .filter(ev -> EventStatus.PROCESSED_SUCCESS.equals(msg.getNewValue()))
                    .filter(ev -> EventStatus.IN_EXECUTION.equals(msg.getOldValue()))
                    .ifPresent(this::scheduleAndUnsubscribe);
    }
    
    private void scheduleAndUnsubscribe(TimeLineEvent event) {
        event.eAdapters().remove(this);
        event.getRelativeTimeEvents().forEach(schedulingRoutine);
    }
}
