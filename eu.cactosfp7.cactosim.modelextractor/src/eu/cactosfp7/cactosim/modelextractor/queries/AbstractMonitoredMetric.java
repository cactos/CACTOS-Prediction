package eu.cactosfp7.cactosim.modelextractor.queries;

import javax.measure.quantity.Quantity;
import javax.measure.unit.Unit;

import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.client.Scan;
import org.jscience.physics.amount.Amount;

public abstract class AbstractMonitoredMetric<T extends Quantity> {

    protected Unit<T> sourceUnit;
    protected Unit<T> targetUnit;

    public AbstractMonitoredMetric(Unit<T> unit) {
        this(unit, unit);
    }

    public AbstractMonitoredMetric(Unit<T> sourceUnit, Unit<T> targetUnit) {
        this.sourceUnit = sourceUnit;
        this.targetUnit = targetUnit;
    }

    public Unit<T> getSourceUnit() {
        return this.sourceUnit;
    }
    
    public Unit<T> getTargetUnit() {
        return this.targetUnit;
    }

    public abstract void addToScan(Scan s);

    public abstract Amount<T> handleResult(Result res);

}