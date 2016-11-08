package eu.cactosfp7.cactosim.cactoscale2edp2;

import java.io.IOException;
import java.util.List;

import javax.measure.Measure;
import javax.measure.quantity.Dimensionless;
import javax.measure.quantity.Duration;
import javax.measure.quantity.Power;
import javax.measure.quantity.Quantity;
import javax.measure.unit.NonSI;
import javax.measure.unit.SI;

import org.apache.hadoop.hbase.Cell;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.Connection;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.client.ResultScanner;
import org.apache.hadoop.hbase.client.Scan;
import org.apache.hadoop.hbase.client.Table;
import org.apache.hadoop.hbase.util.Bytes;
import org.eclipse.net4j.util.concurrent.NonBlockingIntCounter;
import org.jscience.physics.amount.Amount;
import org.palladiosimulator.metricspec.constants.MetricDescriptionConstants;
import org.apache.commons.lang3.math.NumberUtils;
import org.apache.commons.lang3.tuple.Pair;

import eu.cactosfp7.cactosim.cactoscale2edp2.data.HistoricMeasure;
import eu.cactosfp7.cactosim.cactoscale2edp2.data.HistoricMeasurements;
import eu.cactosfp7.cactosim.cactoscale2edp2.data.Interval;
import eu.cactosfp7.cactosim.cactoscale2edp2.data.TargetDescription;

public class HistoricDBImporter {
    
    private Connection conn;

    public HistoricDBImporter(Connection conn) {
        this.conn = conn;
    }
    
    public HistoricMeasurements importMeasurements(List<TargetDescription> descList, String dataCenterName, Interval interval) throws IOException {
        HistoricMeasurements measurements = new HistoricMeasurements(dataCenterName, interval);
        boolean isInFcoMode = Settings.getSettings().getProperty(Settings.IN_FCO_MODE).equals(Settings.FCO_MODE);
        for(TargetDescription desc : descList) {
            Table table = conn.getTable(TableName.valueOf(desc.getTableName()));
            byte[] startRow = Bytes.toBytes(desc.getName() + "-" + 1);
            byte[] finishRow = Bytes.toBytes(desc.getName() + "-" + 9);
            Scan s = new Scan(startRow, finishRow);
            s.setTimeRange(desc.getLowerBound(), (desc.getUpperBound()+1));
            byte[] columnBytes = Bytes.toBytes(desc.getColumnName());
            byte[] qualifierBytes = Bytes.toBytes(desc.getQualifierName());
            s.addColumn(columnBytes, qualifierBytes);
            ResultScanner scanner = table.getScanner(s);
            HistoricMeasure historicMeasure = new HistoricMeasure(desc.getName(), desc.getMetricSetDescription());
            measurements.getHistoricMeasures().add(historicMeasure);
            for(final Result res : scanner) {
                Cell cell = res.getColumnLatestCell(columnBytes, qualifierBytes);
                String valueString = Bytes.toString(cell.getValue());
                valueString = valueString.replace("%", "");                
                Measure time = Measure.valueOf((double) (cell.getTimestamp()-desc.getLowerBound()), SI.MILLI(SI.SECOND));
                Amount<? extends Quantity> intermediate = null;
                if(EDP2Importer.isRequiredMetricSatisfiedBy(MetricDescriptionConstants.POWER_CONSUMPTION, desc.getMetricSetDescription())) {
                    intermediate = Amount.valueOf(Double.parseDouble(valueString), SI.WATT);
                }else if(NumberUtils.isNumber(valueString)) {
                    if(isInFcoMode) {
                        /* Fix the FCO Historic Database not accounting for hyperthreads (factor 2).
                         * Fix the FCO monitoring values: Normalize by factor 1.6.
                         */
                        intermediate = Amount.valueOf(Double.parseDouble(valueString)/(2d*1.6), Dimensionless.UNIT);
                    } else {
                        intermediate = Amount.valueOf(Double.parseDouble(valueString), NonSI.PERCENT);
                    }
                } else {
                    intermediate = Amount.valueOf(valueString);
                }
                Measure value = Measure.valueOf(intermediate.getEstimatedValue(), intermediate.getUnit());
                historicMeasure.getMeasurements().add(Pair.of(time, value));
            }
        }
        return measurements;
    }
}
