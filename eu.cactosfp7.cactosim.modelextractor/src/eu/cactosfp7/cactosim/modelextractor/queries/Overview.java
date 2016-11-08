package eu.cactosfp7.cactosim.modelextractor.queries;

import java.util.HashMap;
import java.util.Map;

public abstract class Overview<Description> {

    protected Map<String,Description> descriptions = new HashMap<String,Description>();
    protected long minValue = Long.MAX_VALUE;
    protected long maxValue = Long.MIN_VALUE;
    
    protected void addMeasurement(long timestamp) {
        if(this.maxValue < timestamp) this.maxValue = timestamp;
        if(this.minValue > timestamp) this.minValue = timestamp;
    }    
    
    public Map<String,Description> getDescriptions() {
        return this.descriptions;
    }

}