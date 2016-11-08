package eu.cactosfp7.cactosim.modelextractor.queries;

import javax.measure.quantity.Quantity;
import javax.measure.unit.Unit;

public class BasicTargetMetric extends BasicMonitoredMetric implements TargetMetric {

    public BasicTargetMetric(String columnName, String columnQualifier, Unit<? extends Quantity> unit) {
        super(columnName, columnQualifier, unit);
    }

}
