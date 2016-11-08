package org.palladiosimulator.simulizar.arrivalrate;

import javax.measure.Measure;
import javax.measure.quantity.Dimensionless;

import org.palladiosimulator.edp2.util.MetricDescriptionUtility;
import org.palladiosimulator.measurementframework.MeasuringValue;
import org.palladiosimulator.measurementframework.listener.IMeasurementSourceListener;
import org.palladiosimulator.metricspec.constants.MetricDescriptionConstants;
import org.palladiosimulator.monitorrepository.MeasurementSpecification;
import org.palladiosimulator.runtimemeasurement.RuntimeMeasurementModel;
import org.palladiosimulator.simulizar.metrics.PRMRecorder;

public class ConcurrentExecutingInvocationsRuntimeModelRecorder extends PRMRecorder implements IMeasurementSourceListener {

	public ConcurrentExecutingInvocationsRuntimeModelRecorder(RuntimeMeasurementModel prmAccess,
			MeasurementSpecification measurementSpecification) {
		super(prmAccess, measurementSpecification);

        if (prmAccess == null || measurementSpecification == null) {
            throw new IllegalArgumentException("At least one argument is null.");
        }
        if (!MetricDescriptionUtility.metricDescriptionIdsEqual(measurementSpecification.getMetricDescription(),
                MetricDescriptionConstants.NUMBER_OF_CONCURRENTLY_EXECUTING_INVOCATIONS_TUPLE)) {
            throw new IllegalArgumentException("Metric of given MeasurementSpecification instance must be "
                    + MetricDescriptionConstants.NUMBER_OF_CONCURRENTLY_EXECUTING_INVOCATIONS_TUPLE.getName() + "!");
        }
	}

	@Override
	public void newMeasurementAvailable(MeasuringValue newMeasurement) {
        if (newMeasurement == null
                || !newMeasurement.isCompatibleWith(MetricDescriptionConstants.NUMBER_OF_CONCURRENTLY_EXECUTING_INVOCATIONS_TUPLE)) {
            throw new IllegalArgumentException("New available measurement is compatible with required metric!");
        }
        
        Measure<Long, Dimensionless> invocationsMeasure = newMeasurement
                .getMeasureForMetric(MetricDescriptionConstants.NUMBER_OF_CONCURRENTLY_EXECUTING_INVOCATIONS);
        updateMeasurementValue(invocationsMeasure.doubleValue(invocationsMeasure.getUnit()));
	}

	@Override
	public void preUnregister() {
		this.detachFromPRM();
	}

}
