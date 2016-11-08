package eu.cactosfp7.cactosim.cactoscale2edp2.ui;

import java.util.List;

import org.palladiosimulator.metricspec.MetricSetDescription;

import eu.cactosfp7.infrastructuremodels.physicaldc.core.ComputeNode;

public class MetricIdentifier {

    private MetricSetDescription metricSet;
    private String tableName;
    private String familyName;
    private List<String> columns;
    private String name;
    private ComputeNode node;

    public MetricIdentifier(ComputeNode node, String tableName, String familyName, List<String> columns, String name, MetricSetDescription metricSet) {
        this.tableName = tableName;
        this.familyName = familyName;
        this.columns = columns;
        this.name = name;
        this.metricSet = metricSet;
        this.node = node;
    }

    public String getName() {
        return this.name;
    }
    
    public ComputeNode getNode() {
        return node;
    }

    public String getFamilyName() {
        return familyName;
    }

    public MetricSetDescription getMetricSet() {
        return metricSet;
    }
    
    public List<String> getColumnNames() {
        return this.columns;
    }

    public String getTableName() {
        return tableName;
    }

}
