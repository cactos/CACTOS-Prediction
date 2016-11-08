package eu.cactosfp7.cactosim.modelextractor.queries;

import eu.cactosfp7.cactosim.modelextractor.util.Interval;

public class IntervalBasedDescription {

    protected Interval interval;
    
    public IntervalBasedDescription(long timestamp) {
        this.interval = new Interval(timestamp);
    }

    public void addMeasurement(long timestamp) {
        this.interval.addMeasurement(timestamp);
    }


    public Interval getInterval() {
        return this.interval;
    }
    
}