package org.palladiosimulator.simulizar.arrivalrate;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.measure.Measure;
import javax.measure.quantity.Frequency;

import org.palladiosimulator.measurementframework.MeasuringValue;
import org.palladiosimulator.metricspec.MetricSetDescription;
import org.palladiosimulator.metricspec.constants.MetricDescriptionConstants;
import org.palladiosimulator.monitorrepository.MeasurementSpecification;
import org.palladiosimulator.recorderframework.IRecorder;
import org.palladiosimulator.recorderframework.config.IRecorderConfiguration;
import org.palladiosimulator.runtimemeasurement.RuntimeMeasurementModel;
import org.palladiosimulator.simulizar.metrics.PRMRecorder;

public class ArrivalRateRuntimeModelRecorder extends PRMRecorder implements IRecorder {
	protected static final Set<String> SUPPORTED_INPUT_METRIC_IDS = new HashSet<>(
			Arrays.asList(
					MetricDescriptionConstants.REQUEST_ARRIVAL_RATE_TUPLE.getId(),
					MetricDescriptionConstants.RESPONSE_ARRIVAL_RATE_TUPLE.getId()
				)
			);
	
	protected final MetricSetDescription inputMetric;
	
	public ArrivalRateRuntimeModelRecorder(RuntimeMeasurementModel prmAccess,
			MeasurementSpecification measurementSpecification) {
		super(prmAccess, measurementSpecification);

        if (prmAccess == null || measurementSpecification == null) {
            throw new IllegalArgumentException("At least one argument is null.");
        }
        
        if (!SUPPORTED_INPUT_METRIC_IDS.contains(measurementSpecification.getMetricDescription().getId()))
        	throw new IllegalArgumentException("Metric of given MeasurementSpecification instance must be either "
                    + MetricDescriptionConstants.REQUEST_ARRIVAL_RATE_TUPLE.getName() + " or "
            		+ MetricDescriptionConstants.RESPONSE_ARRIVAL_RATE_TUPLE.getName() + "!");
        this.inputMetric = (MetricSetDescription) measurementSpecification.getMetricDescription();
	}

	@Override
	public void newMeasurementAvailable(MeasuringValue newMeasurement) {
        if (newMeasurement == null
                || !newMeasurement.isCompatibleWith(inputMetric)) {
            throw new IllegalArgumentException("New available measurement is compatible with required metric!");
        }
        
        Measure<Long, Frequency> rateMeasure = newMeasurement
                .getMeasureForMetric(this.inputMetric.getSubsumedMetrics().get(1));
        
        updateMeasurementValue(rateMeasure.doubleValue(rateMeasure.getUnit()));
	}

	@Override
	public void preUnregister() {
		this.detachFromPRM();
	}

	@Override
	public void initialize(IRecorderConfiguration recorderConfiguration) {
		
	}

	@Override
	public void writeData(MeasuringValue measurement) {
		this.newMeasurementAvailable(measurement);
	}

	@Override
	public void flush() {
		
	}

}
