package eu.cactosfp7.cactosim.modelextractor.queries;

import java.util.ArrayList;
import java.util.List;

public class NodeDescription extends IntervalBasedDescription {

    private String name;
    private List<AbstractMonitoredMetric> monitoredMetrics = new ArrayList<>();

    public NodeDescription(String name, long timestamp) {
        super(timestamp);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<AbstractMonitoredMetric> getMonitoredMetrics() {
        return monitoredMetrics;
    }
    
    public void addMonitoredMetric(AbstractMonitoredMetric metric) {
        this.monitoredMetrics.add(metric);
    }

}
