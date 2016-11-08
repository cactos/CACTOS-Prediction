package eu.cactosfp7.cactosim.modelextractor.queries;

import javax.measure.quantity.Quantity;
import javax.measure.unit.Unit;

import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.client.Scan;
import org.apache.hadoop.hbase.util.Bytes;
import org.jscience.physics.amount.Amount;

import eu.cactosfp7.cactosim.modelextractor.util.Constants;

public class BasicMonitoredMetric extends AbstractMonitoredMetric {
    private String columnName;
    private String columnQualifier;
    
    public BasicMonitoredMetric(String columnName, String columnQualifier, Unit<? extends Quantity> commonUnit) {
        this(columnName, columnQualifier, commonUnit, commonUnit);
    }
    
    public BasicMonitoredMetric(String columnName, String columnQualifier, Unit<? extends Quantity> sourceUnit, Unit<? extends Quantity> targetUnit) {
        super(sourceUnit, targetUnit);
        this.columnName = columnName;
        this.columnQualifier = columnQualifier;
    }
    
    public String getColumnName() {
        return this.columnName;
    }

    public String getColumnQualifier() {
        return this.columnQualifier;
    }

    @Override
    public void addToScan(Scan s) {
        byte[] metricColumn = Bytes.toBytes(getColumnName());
        byte[] metricQualifier = Bytes.toBytes(getColumnQualifier());
        s.addColumn(metricColumn, metricQualifier);
    }

    @Override
    public Amount<Quantity> handleResult(Result res) {
        Amount amount = null;
        
        byte[] metricColumn = Bytes.toBytes(getColumnName());
        byte[] metricQualifier = Bytes.toBytes(getColumnQualifier());
        if(res.containsColumn(metricColumn, metricQualifier)) {
            String valueString = Bytes.toString(res.getValue(metricColumn, metricQualifier));
            if(!valueString.equals(Constants.NULL_VALUE)) {
                amount = Amount.valueOf(Double.valueOf(valueString), getSourceUnit());
            }
        }
        
        return amount;
    }

}
