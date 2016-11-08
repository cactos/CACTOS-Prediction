package eu.cactosfp7.cactosim.cactoscale2edp2.data;

import java.util.ArrayList;
import java.util.List;

import javax.measure.Measure;
import javax.measure.quantity.Duration;

import org.apache.commons.lang3.tuple.Pair;
import org.palladiosimulator.metricspec.MetricSetDescription;

public class HistoricMeasure {
    
    private MetricSetDescription description;
    private List<Pair<Measure<?, Duration>,Measure<Double,?>>> measurements = new ArrayList<Pair<Measure<?,Duration>,Measure<Double,?>>>();
    private String name;

    public HistoricMeasure(String name, MetricSetDescription description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return this.name;
    }

    public MetricSetDescription getMetricSetDescription() {
        return this.description;
    }

    public List<Pair<Measure<?, Duration>,Measure<Double,?>>> getMeasurements() {
        return this.measurements;
    }

}
