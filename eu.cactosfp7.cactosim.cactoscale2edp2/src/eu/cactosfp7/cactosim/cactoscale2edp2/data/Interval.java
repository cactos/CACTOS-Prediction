package eu.cactosfp7.cactosim.cactoscale2edp2.data;

import java.util.Date;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class Interval {
    
    private Date startTime;
    private Date endTime;

    public Interval(Date startTime, Date endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
        
    }

    public Date getStartTime() {
        return this.startTime;
    }

    public Date getEndTime() {
        return this.endTime;
    }
    
    @Override
    public String toString() {
        return "Interval from " + this.startTime.toString() + " to " + this.endTime;
    }

}
