package eu.cactosfp7.cactosim.cactoscale2edp2;

import java.util.HashMap;
import java.util.Map;

import javax.measure.Measure;
import javax.measure.quantity.Duration;
import javax.measure.unit.SI;

import org.apache.commons.lang3.tuple.Pair;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataFactory;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentGroup;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentRun;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentSetting;
import org.palladiosimulator.edp2.models.ExperimentData.Measurement;
import org.palladiosimulator.edp2.models.ExperimentData.MeasurementRange;
import org.palladiosimulator.edp2.models.ExperimentData.MeasuringType;
import org.palladiosimulator.edp2.models.Repository.Repository;
import org.palladiosimulator.edp2.models.measuringpoint.MeasuringPointRepository;
import org.palladiosimulator.edp2.models.measuringpoint.MeasuringpointFactory;
import org.palladiosimulator.edp2.models.measuringpoint.StringMeasuringPoint;
import org.palladiosimulator.edp2.util.MeasurementsUtility;
import org.palladiosimulator.measurementframework.MeasuringValue;
import org.palladiosimulator.measurementframework.TupleMeasurement;
import org.palladiosimulator.metricspec.MetricDescription;
import org.palladiosimulator.metricspec.MetricSetDescription;
import org.palladiosimulator.metricspec.MetricSpecPackage;

import eu.cactosfp7.cactosim.cactoscale2edp2.data.HistoricMeasure;
import eu.cactosfp7.cactosim.cactoscale2edp2.data.HistoricMeasurements;
import eu.cactosfp7.cactosim.cactoscale2edp2.data.Interval;

public class EDP2Importer {
    
    private final static ExperimentDataFactory EXPERIMENT_DATA_FACTORY = ExperimentDataFactory.eINSTANCE;
    private final static MeasuringpointFactory MEASURING_POINT_FACTORY = MeasuringpointFactory.eINSTANCE;
    
    private Repository repo;

    public EDP2Importer(Repository repo) {
        this.repo = repo;
    }
    
    public void importData(HistoricMeasurements measures) {
        ExperimentGroup group = EXPERIMENT_DATA_FACTORY.createExperimentGroup();
        group.setPurpose(measures.getDCName());
        group.setRepository(repo);
        Interval interval = measures.getInterval();
        ExperimentSetting setting = EXPERIMENT_DATA_FACTORY.createExperimentSetting(group, interval.toString());
        Map<HistoricMeasure, MeasuringType> metadataMap = addMetadata(setting, measures);
        ExperimentRun run = EXPERIMENT_DATA_FACTORY.createExperimentRun(setting);
        for(HistoricMeasure measure : measures.getHistoricMeasures()) {
            run.setStartTime(interval.getStartTime());
            final long duration = interval.getEndTime().getTime() - interval.getStartTime().getTime();
            run.setDuration(Measure.valueOf(duration, SI.MILLI(SI.SECOND)));
            MeasuringType mType = metadataMap.get(measure);
            final Measurement measurement = EXPERIMENT_DATA_FACTORY.createMeasurement(mType);
            final MeasurementRange typeMeasurementRange = EXPERIMENT_DATA_FACTORY.createMeasurementRange(measurement);
            measurement.getMeasurementRanges().add(typeMeasurementRange);
            run.getMeasurement().add(measurement);
            MeasurementsUtility.createDAOsForRawMeasurements(EXPERIMENT_DATA_FACTORY.createRawMeasurements(typeMeasurementRange));
            for(Pair<Measure<?, Duration>, Measure<Double,?>> curPair : measure.getMeasurements()) {
                Measure<?,Duration> time = curPair.getKey();
                Measure<Double, ?> value = curPair.getValue();
                final MeasuringValue m1 = new TupleMeasurement((MetricSetDescription) mType.getMetric(), time, value);
                MeasurementsUtility.storeMeasurement(measurement, m1);
            }
        }
    }
    
    private Map<HistoricMeasure,MeasuringType> addMetadata(ExperimentSetting setting, HistoricMeasurements measurements) {
        Map<HistoricMeasure,MeasuringType> types = new HashMap<HistoricMeasure, MeasuringType>();
        final MeasuringPointRepository measuringPointRepo = MEASURING_POINT_FACTORY
                .createMeasuringPointRepository();
        setting.getExperimentGroup().getMeasuringPointRepositories().add(measuringPointRepo);
        for(HistoricMeasure measure : measurements.getHistoricMeasures()) {
            StringMeasuringPoint stringMeasuringPoint = MEASURING_POINT_FACTORY.createStringMeasuringPoint();
            stringMeasuringPoint.setMeasuringPoint(measure.getName());
            stringMeasuringPoint.setMeasuringPointRepository(measuringPointRepo);
            final MeasuringType mType = EXPERIMENT_DATA_FACTORY.createMeasuringType(stringMeasuringPoint, measure.getMetricSetDescription());
            mType.setExperimentGroup(setting.getExperimentGroup());
            setting.getMeasuringTypes().add(mType);
            types.put(measure, mType);
        }
        return types;
    }
    
    /**
     * Helper method that checks whether the required metric ({@code required}) equals the provided
     * one ({@code available}) or is subsumed by it..
     *
     * @param required
     *            the required metric
     * @param available
     *            the available metric
     * 
     * @return true, the required metric is satisfied by Measurements of the available metric
     */
    public static boolean isRequiredMetricSatisfiedBy(final MetricDescription required,
            final MetricDescription available) {
        boolean result = false;
        if (MetricSpecPackage.eINSTANCE.getMetricSetDescription().isInstance(required)) {
            final MetricSetDescription requiredSet = (MetricSetDescription) required;
            result = true;
            for (MetricDescription subsumedMetric : requiredSet.getSubsumedMetrics()) {
                result &= isRequiredMetricSatisfiedBy(subsumedMetric, available);
            }
        } else if (required.equals(available)) {
            result = true;
        } else if (required.getId().equals(available.getId())) {
            result = true;
        } else if (MetricSpecPackage.eINSTANCE.getMetricSetDescription().isInstance(available)) {
            MetricSetDescription availableSet = (MetricSetDescription) available;
            for (MetricDescription desc : availableSet.getSubsumedMetrics()) {
                result |= isRequiredMetricSatisfiedBy(required, desc);
            }
        }
        return result;
    }
}
