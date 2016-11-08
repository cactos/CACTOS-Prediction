package eu.cactosfp7.cactosim.modelextractor.util;

public class Interval {
    
    private long min;
    private long max;

    public Interval(long initialValue) {
        this.min = initialValue;
        this.max = initialValue;
    }
    
    public void addMeasurement(long timestamp) {
        if(timestamp < this.min) {
            this.min = timestamp;
        } else if (timestamp > this.max) {
            this.max = timestamp;
        }
    }
    
    public long getMax() {
        return this.max;
    }
    
    public long getMin() {
        return this.min;
    }
}
