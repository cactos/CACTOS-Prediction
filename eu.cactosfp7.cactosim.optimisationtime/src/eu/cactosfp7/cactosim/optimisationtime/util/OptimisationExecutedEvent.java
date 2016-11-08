package eu.cactosfp7.cactosim.optimisationtime.util;

import javax.measure.Measure;
import javax.measure.quantity.Duration;

public class OptimisationExecutedEvent {

    private final Measure<Double, Duration> duration;

    public OptimisationExecutedEvent(final Measure<Double, Duration> duration) {
        this.duration = duration;
    }
    
    public Measure<Double, Duration> getDuration() {
        return this.duration;
    }

}
