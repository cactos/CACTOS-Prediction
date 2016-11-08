package eu.cactosfp7.cactosim.modelextractor.queries;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.measure.Measure;
import javax.measure.quantity.Dimensionless;
import javax.measure.quantity.Power;
import javax.measure.quantity.Quantity;
import javax.measure.unit.NonSI;
import javax.measure.unit.SI;
import javax.measure.unit.Unit;

import org.apache.hadoop.hbase.Cell;
import org.apache.hadoop.hbase.CellUtil;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.Connection;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.client.ResultScanner;
import org.apache.hadoop.hbase.client.Scan;
import org.apache.hadoop.hbase.client.Table;
import org.apache.hadoop.hbase.util.Bytes;
import org.apache.hadoop.hbase.util.Pair;
import org.jscience.physics.amount.Amount;
import org.vedantatree.expressionoasis.ExpressionContext;
import org.vedantatree.expressionoasis.ExpressionEngine;
import org.vedantatree.expressionoasis.exceptions.ExpressionEngineException;
import org.vedantatree.expressionoasis.expressions.Expression;

import eu.cactosfp7.cactosim.modelextractor.settings.Settings;
import eu.cactosfp7.cactosim.modelextractor.util.Constants;
import eu.cactosfp7.cactosim.regression.r.AbstractNonLinearRegression;
import eu.cactosfp7.cactosim.regression.r.ConstantModelParameter;
import eu.cactosfp7.cactosim.regression.r.DoubleModelParameter;
import eu.cactosfp7.cactosim.regression.r.NonLinearSquaresRegression;
import eu.cactosfp7.cactosim.regression.r.RobustNonLinearSquaresRegression;
import eu.cactosfp7.cactosim.regression.r.TargetMeasurements;
import eu.cactosfp7.cactosim.regression.r.VariableMeasurements;
import eu.cactosfp7.infrastructuremodels.physicaldc.core.AbstractNode;
import eu.cactosfp7.infrastructuremodels.physicaldc.power.binding.FixedFactorValue;
import eu.cactosfp7.infrastructuremodels.physicaldc.power.binding.PowerModelBinding;

public abstract class AbstractPowerMeasurementQuery implements IPowerMeasurementQuery {

    protected Connection conn;

    public AbstractPowerMeasurementQuery(Connection conn) {
        super();
        this.conn = conn;
    }

    /* (non-Javadoc)
     * @see eu.cactosfp7.cactosim.modelextractor.queries.IPowerMeasurementQuery#addNodeMeasurement(eu.cactosfp7.cactosim.modelextractor.queries.NodeOverview, org.apache.hadoop.hbase.Cell)
     */
    @Override
    public abstract void addNodeMeasurement(NodeOverview overview, Cell cell);

    /* (non-Javadoc)
     * @see eu.cactosfp7.cactosim.modelextractor.queries.IPowerMeasurementQuery#getNodeOverview(org.apache.hadoop.hbase.client.Connection)
     */
    @Override
    public NodeOverview getNodeOverview() throws IOException {
        Table table = this.conn.getTable(TableName.valueOf(Settings.getSettings().getProperty(Constants.CN_HISTORY)));
        NodeOverview overview = new NodeOverview();
        Scan s = new Scan();
        s.setCaching(1000);
        byte[] columnFamily = Bytes.toBytes(Settings.getSettings().getProperty(Constants.POWER_UTIL_FAMILY));
        byte[] column = Bytes.toBytes(Constants.POWER_NODE);
        s.addColumn(columnFamily, column);
        ResultScanner scanner = table.getScanner(s);
        for(Result res : scanner) {
            Cell cell = res.getColumnLatestCell(columnFamily, column);
            addNodeMeasurement(overview, cell);
        }
        
        return overview;
    }

    /* (non-Javadoc)
     * @see eu.cactosfp7.cactosim.modelextractor.queries.IPowerMeasurementQuery#addCPUMetric(eu.cactosfp7.cactosim.modelextractor.queries.NodeDescription)
     */
    @Override
    public void addCPUMetric(NodeDescription description) {
        final Unit<Dimensionless> utilInPercent = NonSI.PERCENT;
        final Unit<Dimensionless> targetMetric = Unit.ONE;
        String[] metricNames = Settings.getSettings().getProperty(Constants.CPU_METRIC_NAMES).split(",");
        List<AbstractMonitoredMetric> metrics = new ArrayList<AbstractMonitoredMetric>();
        for(int idx = 0; idx < metricNames.length; idx++) {
            BasicMonitoredMetric cpuCur = new BasicMonitoredMetric(Constants.HARDWARE_UTIL, metricNames[idx], utilInPercent, targetMetric);
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

    /* (non-Javadoc)
     * @see eu.cactosfp7.cactosim.modelextractor.queries.IPowerMeasurementQuery#constructPowerModel(eu.cactosfp7.infrastructuremodels.physicaldc.power.binding.PowerModelBinding, org.apache.hadoop.hbase.client.Connection, eu.cactosfp7.cactosim.modelextractor.queries.NodeDescription, long, long)
     */
    @Override
    public AbstractNonLinearRegression<Power> constructPowerModel(NodeDescription description, PowerModelBinding binding, long lowerBound, long upperBound)
            throws IOException, ExpressionEngineException {
                Table table = conn.getTable(TableName.valueOf(Settings.getSettings().getProperty(Constants.CN_HISTORY)));
                byte[] startRow = Bytes.toBytes(description.getName() + "-" + lowerBound);
                byte[] finishRow = Bytes.toBytes(description.getName() + "-" + (upperBound+1));
                Scan s = new Scan(startRow, finishRow);
                s.setCaching(1000);
                Map<AbstractMonitoredMetric<Quantity>, Amount<Quantity>> lastValues = new HashMap<AbstractMonitoredMetric<Quantity>, Amount<Quantity>>();
                List<AbstractMonitoredMetric<Quantity>> orderedMetric = new ArrayList<AbstractMonitoredMetric<Quantity>>();
                List<Pair<Long,Amount<Quantity>[]>> measurements = new ArrayList<Pair<Long,Amount<Quantity>[]>>();
                for(AbstractMonitoredMetric m : description.getMonitoredMetrics()) {
                    m.addToScan(s);
                }
                ResultScanner scanner = table.getScanner(s);
                int beginIndex = description.getName().length() + 1;
                
                try {
                    for(final Result res : scanner) {
                        for(AbstractMonitoredMetric<Quantity> m : description.getMonitoredMetrics()) {
                            Amount<Quantity> resultAmount = m.handleResult(res);
                            if(resultAmount != null) {
                                lastValues.put(m, resultAmount);                    
                            }
                        }
                        if(lastValues.size() == description.getMonitoredMetrics().size()) {
                            Amount<Quantity>[] values = new Amount[lastValues.size()];
                            if(orderedMetric.size() == 0) {
                                orderedMetric.addAll(lastValues.keySet());
                            }
                            for(int idx = 0; idx < orderedMetric.size(); idx++) {
                                values[idx] = lastValues.get(orderedMetric.get(idx));
                            }
                            Pair<Long, Amount<Quantity>[]> curTuple = new Pair<Long,Amount<Quantity>[]>(Long.valueOf(Bytes.toString(res.getRow()).substring(beginIndex)), values);
                            measurements.add(curTuple);
                        }
                    }
                } finally {
                    scanner.close();
                }
            
                List<VariableMeasurements> measurementsInput = new ArrayList<VariableMeasurements>();
                
                for(AbstractMonitoredMetric<?> metric : lastValues.keySet()) {
                    if(!(metric instanceof TargetMetric)) {
                        Unit unit = metric.getTargetUnit();
                        String unitString = unit.toString();
                        measurementsInput.add(new VariableMeasurements(unitString.equals("") || unitString.equals("%")? "u" : unitString, unit, new double[measurements.size()]));
                    }
                }
                
                double[] targetValues = new double[measurements.size()];
                TargetMeasurements targetMetric = null;
                
                int idx = 0;
                for(Pair<Long,Amount<Quantity>[]> measurementTuple : measurements) {
                    Iterator<AbstractMonitoredMetric<Quantity>> metricIt = orderedMetric.iterator();
                    Iterator<Amount<Quantity>> measurementIt = Arrays.asList(measurementTuple.getSecond()).iterator();
                    Iterator<VariableMeasurements> variableMeasurementsIt = measurementsInput.iterator();
                    Amount<Quantity> curMeasurement = null;
                    AbstractMonitoredMetric<Quantity> curMetric = null;
                    VariableMeasurements curVariableMeasurement = null;
                    while(metricIt.hasNext() && measurementIt.hasNext()) {
                        curMetric = metricIt.next(); 
                        curMeasurement = measurementIt.next();
                        if(curMetric instanceof TargetMetric) {
                            targetValues[idx] = curMeasurement.doubleValue(curMeasurement.getUnit());
                            targetMetric = new TargetMeasurements("p", curMeasurement.getUnit(), targetValues);
                        } else {
                            if(variableMeasurementsIt.hasNext()) {
                                curVariableMeasurement = variableMeasurementsIt.next();                        
                                curVariableMeasurement.getValues()[idx] = curMeasurement.doubleValue(curMetric.getTargetUnit());
                            }
                        }                
                    }
                    idx++;
                } 
                
                
                
                Expression expression = null;
                String expressionString = binding.getPowerModel().getExpression();
                try {
                    expression = ExpressionEngine.compileExpression(expressionString, new ExpressionContext(), false);
                } catch (ExpressionEngineException e) {
                    throw new ExpressionEngineException("The specified power model \"" + expressionString + "\" is inconsistent with the power model bindings.", e);
                }
                
                List<ConstantModelParameter<?, Power>> params = new ArrayList<ConstantModelParameter<?, Power>>();
                for(FixedFactorValue value : binding.getFixedFactorValues()) {
                    Amount<Power> valueAmount = value.getValue();
                    params.add(new DoubleModelParameter<Power>(value.getName(), 
                            Measure.valueOf(valueAmount.getEstimatedValue(), valueAmount.getUnit())));
                }
                AbstractNonLinearRegression<Power> regression = new RobustNonLinearSquaresRegression<Power>(expression, measurementsInput, params, targetMetric);
                return regression;
            }

    /* (non-Javadoc)
     * @see eu.cactosfp7.cactosim.modelextractor.queries.IPowerMeasurementQuery#setPowerBinding(eu.cactosfp7.cactosim.regression.r.AbstractNonLinearRegression, eu.cactosfp7.infrastructuremodels.physicaldc.power.binding.PowerModelBinding, java.util.List)
     */
    @Override
    public void setPowerBinding(AbstractNonLinearRegression<Power> regression, PowerModelBinding binding, List<DoubleModelParameter<Power>> modelParameters) {
        for(DoubleModelParameter<Power> param : modelParameters) {
            for(FixedFactorValue factor : binding.getFixedFactorValues()) {
                if(factor.getName().equals(param.getName())) {
                    Measure<Double, Power> paramMeasure = param.getValue();
                    factor.setValue(Amount.valueOf(paramMeasure.getValue(), paramMeasure.getUnit()));
                }
            }
        }
    }

    /* (non-Javadoc)
     * @see eu.cactosfp7.cactosim.modelextractor.queries.IPowerMeasurementQuery#selectNode(eu.cactosfp7.cactosim.modelextractor.queries.NodeOverview, eu.cactosfp7.infrastructuremodels.physicaldc.core.AbstractNode)
     */
    @Override
    public NodeDescription selectNode(NodeOverview overview, AbstractNode node) {
        return overview.getDescriptions().get(node.getName());
    }

}