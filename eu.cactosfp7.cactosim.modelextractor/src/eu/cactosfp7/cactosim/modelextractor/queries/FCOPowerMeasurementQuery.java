package eu.cactosfp7.cactosim.modelextractor.queries;

import java.util.ArrayList;
import java.util.List;

import javax.measure.quantity.Dimensionless;
import javax.measure.quantity.Quantity;
import javax.measure.unit.NonSI;
import javax.measure.unit.SI;
import javax.measure.unit.Unit;

import org.apache.hadoop.hbase.Cell;
import org.apache.hadoop.hbase.client.Connection;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.util.Bytes;
import org.jscience.physics.amount.Amount;

import eu.cactosfp7.cactosim.modelextractor.settings.Settings;
import eu.cactosfp7.cactosim.modelextractor.util.Constants;

public class FCOPowerMeasurementQuery extends AbstractPowerMeasurementQuery {

    public FCOPowerMeasurementQuery(Connection conn) {
        super(conn);
    }

    @Override
    public void addNodeMeasurement(NodeOverview overview, Cell cell) {
        String keyString = Bytes.toString(cell.getRow());
        long timestamp = cell.getTimestamp();
        String nodeName = keyString.substring(0, keyString.length() - String.valueOf(timestamp).length()-1);
        overview.addNodeMeasurement(nodeName, timestamp);
    }
    
    /* (non-Javadoc)
     * @see eu.cactosfp7.cactosim.modelextractor.queries.IPowerMeasurementQuery#addCPUMetric(eu.cactosfp7.cactosim.modelextractor.queries.NodeDescription)
     */
    @Override
    public void addCPUMetric(NodeDescription description) {
        final Unit<Dimensionless> utilInPercent = Dimensionless.UNIT;
        final Unit<Dimensionless> targetMetric = Unit.ONE;
        String[] metricNames = Settings.getSettings().getProperty(Constants.CPU_METRIC_NAMES).split(",");
        List<AbstractMonitoredMetric> metrics = new ArrayList<AbstractMonitoredMetric>();
        for(int idx = 0; idx < metricNames.length; idx++) {
            BasicMonitoredMetric cpuCur = new BasicMonitoredMetric(Constants.HARDWARE_UTIL, metricNames[idx], utilInPercent, targetMetric) {
                @Override
                public Amount<Quantity> handleResult(Result res) {
                    Amount<Quantity> result = super.handleResult(res);
                    /* Fix the FCO Historic Database not accounting for hyperthreads (factor 2).
                     * Fix the FCO monitoring values: Normalize by factor 1.6.
                     */
                    if(result != null) {
                        result = result.divide(2d*1.6);
                        Amount<Quantity> maxUtil = Amount.valueOf(1.0, result.getUnit());
                        if(result.isLargerThan(maxUtil)) {
                            result = maxUtil;
                        }
                    }
                    return result;
                }
            };
            metrics.add(cpuCur);
        }
        BasicTargetMetric power = new BasicTargetMetric(Settings.getSettings().getProperty(Constants.POWER_UTIL_FAMILY), Constants.POWER_CONSUMPTION, SI.WATT);

        AggregateMonitoredMetric aggregate = new AggregateMonitoredMetric<Dimensionless>(targetMetric, metrics) { 

            
            @Override
            public Amount<Dimensionless> aggregateValues(List<Amount<Dimensionless>> values) {
                Amount<Dimensionless> result = Amount.valueOf(0, utilInPercent);
                for(Amount<? extends Quantity> value : values) {
                    result = result.plus(value);
                }
                return result;
            }
        };
        description.addMonitoredMetric(aggregate);
        description.addMonitoredMetric(power);
    }

}
