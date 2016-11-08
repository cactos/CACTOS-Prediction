package eu.cactosfp7.cactosim.experimentscenario.executor;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;

import javax.measure.quantity.Duration;
import javax.measure.unit.SI;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.jscience.physics.amount.Amount;

import de.uka.ipd.sdq.simucomframework.model.SimuComModel;
import eu.cactosfp7.cactosim.experimentscenario.AbsoluteTimeEvent;
import eu.cactosfp7.cactosim.experimentscenario.EventStatus;
import eu.cactosfp7.cactosim.experimentscenario.ExperimentScenarioTimeLine;
import eu.cactosfp7.cactosim.experimentscenario.RelativeTimeEvent;
import eu.cactosfp7.cactosim.experimentscenario.TimeLineEvent;
import eu.cactosfp7.cactosim.experimentscenario.util.ExperimentscenarioSwitch;

public class TimeLineEventScheduler {
    
    protected static final Function<Amount<Duration>, Double> defaultSimulationTimeCalculator =
            x -> x.to(SI.SECOND).getEstimatedValue();
            
    private static final Logger LOGGER = Logger.getLogger(TimeLineEventScheduler.class);
    
    private static final ExperimentscenarioSwitch<Optional<AbsoluteTimeEvent>> ABSOLUTE_TIME_EVENT_FILTER_SWITCH = 
            new ExperimentscenarioSwitch<Optional<AbsoluteTimeEvent>>() {
        public Optional<AbsoluteTimeEvent> caseAbsoluteTimeEvent(AbsoluteTimeEvent object) {
            return Optional.of(object);
        }
       @Override
        public Optional<AbsoluteTimeEvent> defaultCase(EObject object) {
           return Optional.empty();
        }
    };
    
    private final RelativeEventSchedulingDelegate relativeDelegate;
    private final Function<Amount<Duration>, Double> simulationTimeCalculator;
    
    private final Set<BiConsumer<? super TimeLineEvent, Double>> eventFireListeners = new LinkedHashSet<BiConsumer<? super TimeLineEvent, Double>>();

    public TimeLineEventScheduler(final SimuComModel model, ExperimentScenarioTimeLine timeLine) {
        this(model, timeLine, defaultSimulationTimeCalculator);
    }
    
    public TimeLineEventScheduler(final SimuComModel model, ExperimentScenarioTimeLine timeLine, 
            Function<Amount<Duration>, Double> simulationTimeFromRealTime) {
        this.relativeDelegate = new RelativeEventSchedulingDelegate((evt) -> this.scheduleEventStatusUpdate(model, evt));
        this.simulationTimeCalculator = simulationTimeFromRealTime;
        
        timeLine.getTimeLineEvents().stream()
            .map(ABSOLUTE_TIME_EVENT_FILTER_SWITCH::doSwitch).filter(Optional::isPresent).map(Optional::get)
            .forEach(event -> scheduleEventStatusUpdate(model, event));
    }

    private void scheduleEventStatusUpdate(SimuComModel model, AbsoluteTimeEvent event) {
        (new SimuComUpdateSimulationEntityEvent(model)).scheduleUpdateAt(event, (evt -> updateProc(evt, model.getSimulationControl().getCurrentSimulationTime())), 
                    simulationTimeCalculator.apply(event.getSimulationTime()));
        this.relativeDelegate.delayProcessingOfRelatedTimeEvents(event);
    }
    
    private void scheduleEventStatusUpdate(SimuComModel model, RelativeTimeEvent event) {
        (new SimuComUpdateSimulationEntityEvent(model)).scheduleUpdateIn(event, (evt -> updateProc(evt, model.getSimulationControl().getCurrentSimulationTime())), 
                simulationTimeCalculator.apply(event.getIntervalSinceEvent()));
        this.relativeDelegate.delayProcessingOfRelatedTimeEvents(event);
    }
        
        
    
    private <T extends TimeLineEvent> void updateProc(T event, double simulationTime) {
        if (LOGGER.isDebugEnabled()) {
            LOGGER.warn("Scheduled Update to " + event.toString() + " occurred at simulation time " + simulationTime);
        }
        event.setEventStatus(EventStatus.SCHEDULED);
        eventFireListeners.forEach(listener -> listener.accept(event, simulationTime));
        
    }
    
    public void onEventScheduling(BiConsumer<? super TimeLineEvent, Double> consumer) {
        eventFireListeners.add(consumer);
    }
}
