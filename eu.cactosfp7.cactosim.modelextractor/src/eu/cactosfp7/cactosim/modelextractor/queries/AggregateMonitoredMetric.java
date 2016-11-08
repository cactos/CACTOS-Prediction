package eu.cactosfp7.cactosim.modelextractor.queries;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.measure.quantity.Quantity;
import javax.measure.unit.Unit;

import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.client.Scan;
import org.jscience.physics.amount.Amount;

public abstract class AggregateMonitoredMetric<T extends Quantity> extends AbstractMonitoredMetric<T> {

    private List<AbstractMonitoredMetric> aggregatedMetrics;
    protected Map<AbstractMonitoredMetric, Amount<T>> lastValues = new HashMap<AbstractMonitoredMetric, Amount<T>>();

    public AggregateMonitoredMetric(Unit<T> unit, List<AbstractMonitoredMetric> aggregatedMetrics) {
        super(unit);
        this.aggregatedMetrics = aggregatedMetrics;
        
    }

    @Override
    public void addToScan(Scan s) {
        for(AbstractMonitoredMetric m : aggregatedMetrics) {
            m.addToScan(s);
        }
    }
    
    public Amount<T> handleResult(Result res) {
        List<Amount<T>> values = new ArrayList<Amount<T>>();
        for(AbstractMonitoredMetric<T> m : aggregatedMetrics) {
            Amount<T> tempResult = m.handleResult(res);
            if(tempResult != null) {
                lastValues.put(m, tempResult);                
            }
            values.add(lastValues.get(m));
        }
        
        if(lastValues.size() == aggregatedMetrics.size()) {
            return this.aggregateValues(values);
        }
        return null;
    }
    
    public abstract Amount<T> aggregateValues(List<Amount<T>> values);
    
}
