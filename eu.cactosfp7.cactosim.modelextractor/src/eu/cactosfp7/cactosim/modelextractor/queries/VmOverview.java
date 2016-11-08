package eu.cactosfp7.cactosim.modelextractor.queries;

import java.util.Calendar;
import java.util.Date;
import java.util.Map;


public class VmOverview extends Overview<VMDescription> {
    
    public void addVmMeasurement(String vmUuid, long timestamp) {
        IntervalBasedDescription description = descriptions.get(vmUuid);
        if (description == null) {
            descriptions.put(vmUuid, new VMDescription(vmUuid, timestamp));
        }
        descriptions.get(vmUuid).addMeasurement(timestamp);
        
        addMeasurement(timestamp);
    }

    public void addInitialPlacement(String vmUuid, String nodeName) {
        this.descriptions.get(vmUuid).addInitialPlacement(nodeName);        
    }

    public void addName(String vmUuid, String initialPlacementHw) {
        this.descriptions.get(vmUuid).addName(initialPlacementHw); 
    }

    public Date getLowerBound() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(minValue);
        return calendar.getTime();
    }
    
    public Date getUpperBound() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(maxValue);
        return calendar.getTime();
    }
}
