package eu.cactosfp7.cactosim.optimisationtime.util;

import javax.measure.Measure;
import javax.measure.quantity.Duration;
import javax.measure.unit.SI;

import org.palladiosimulator.commons.designpatterns.AbstractObservable;

public class OptimisationDurationRegistry extends AbstractObservable<IOptimisationDurationListener> {

    private static OptimisationDurationRegistry INSTANCE;
    private Double durationInSeconds;

    private OptimisationDurationRegistry() {
    }

    public static OptimisationDurationRegistry getNotifier() {
        if(INSTANCE == null) {
            INSTANCE = new OptimisationDurationRegistry();
        }
        return INSTANCE;
    }

    public void setLastDuration(double durationInSeconds) {
        this.durationInSeconds = durationInSeconds;
    }
    
    public void notifyListeners() {
        OptimisationExecutedEvent event = new OptimisationExecutedEvent(Measure.valueOf(this.durationInSeconds, SI.SECOND));
        for(IOptimisationDurationListener listener : this.getObservers()) {
            listener.optimisationExecuted(event);
        }
    }

    public Measure<Double, Duration> getLastDuration() {
        return Measure.valueOf(this.durationInSeconds, SI.SECOND);
    }

}
