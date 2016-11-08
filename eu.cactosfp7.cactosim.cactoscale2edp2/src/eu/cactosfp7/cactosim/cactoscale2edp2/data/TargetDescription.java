package eu.cactosfp7.cactosim.cactoscale2edp2.data;

import org.palladiosimulator.metricspec.MetricSetDescription;

import eu.cactosfp7.infrastructuremodels.physicaldc.core.ComputeNode;

public class TargetDescription {

    private Interval interval;
    private String columnName;
    private String qualifierName;
    private MetricSetDescription metricSetDescription;
    private String tableName;
    private ComputeNode computeNode;
    
    public TargetDescription(ComputeNode computeNode, Interval interval, String tableName, String columnName, String qualifierName, MetricSetDescription metricSetDescription) {
        this.computeNode = computeNode;
        this.interval = interval;
        this.columnName = columnName;
        this.qualifierName = qualifierName;
        this.metricSetDescription = metricSetDescription;
        this.tableName = tableName;
    }

    public String getTableName() {
        return this.tableName;
    }

    public String getName() {
        return this.computeNode.getName();
    }
    
    public ComputeNode getNode() {
        return this.computeNode;
    }

    public long getLowerBound() {
        return this.interval.getStartTime().getTime();
    }

    public long getUpperBound() {
        return this.interval.getEndTime().getTime();
    }

    public String getColumnName() {
        return this.columnName;
    }

    public String getQualifierName() {
        return this.qualifierName;
    }

    public MetricSetDescription getMetricSetDescription() {
        return this.metricSetDescription;
    }

}
