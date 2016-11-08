package org.palladiosimulator.simulizar.arrivalrate;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.measure.Measure;
import javax.measure.quantity.Dimensionless;
import javax.measure.quantity.Duration;
import javax.measure.quantity.Frequency;
import javax.measure.unit.SI;
import javax.measure.unit.Unit;

import org.jscience.physics.amount.Amount;
import org.palladiosimulator.experimentanalysis.windowaggregators.SlidingWindowAggregator;
import org.palladiosimulator.measurementframework.MeasuringValue;
import org.palladiosimulator.measurementframework.TupleMeasurement;
import org.palladiosimulator.metricspec.MetricDescription;
import org.palladiosimulator.metricspec.MetricSetDescription;
import org.palladiosimulator.metricspec.constants.MetricDescriptionConstants;
import org.palladiosimulator.recorderframework.IRecorder;

import com.google.common.collect.Iterables;

public class SlidingWindowArrivalRateAggregator extends SlidingWindowAggregator {

	protected final MetricSetDescription resultingMetric;
	
	private static final Set<String> IDS_OF_SUPPORTED_METRICS = new HashSet<>(Arrays.asList(
				MetricDescriptionConstants.REQUEST_ARRIVAL_RATE_TUPLE.getId(),
				MetricDescriptionConstants.RESPONSE_ARRIVAL_RATE_TUPLE.getId()
			)); 

	public SlidingWindowArrivalRateAggregator(MetricDescription resultingMetric, IRecorder recorderToWriteInto) {
		super(recorderToWriteInto);
		
		if (!IDS_OF_SUPPORTED_METRICS.contains(resultingMetric.getId()))
			throw new IllegalArgumentException("The desired metric cannot be calculated by the SlidingWindowArrivalRateAggregator");
		
		this.resultingMetric = (MetricSetDescription) resultingMetric;
	}

	@Override
	public MetricDescription getExpectedWindowDataMetric() {
		return MetricDescriptionConstants.POINT_IN_TIME_METRIC;
	}

	@Override
	protected MeasuringValue processWindowData(Iterable<MeasuringValue> windowData,
			Measure<Double, Duration> windowLeftBound, Measure<Double, Duration> windowLength) {
		Amount<Dimensionless> arrivals = Amount.valueOf(Iterables.size(windowData), Unit.ONE);
		Amount<Frequency> arrivalRate = arrivals.divide(
				Amount.valueOf(windowLength.getValue(), 
				windowLength.getUnit()))
			.to(SI.HERTZ);
		Amount<Duration> pointInTime = Amount.valueOf(windowLeftBound.getValue(), windowLeftBound.getUnit()).plus(
				Amount.valueOf(windowLength.getValue(), windowLength.getUnit()));
		
		return new TupleMeasurement(this.resultingMetric, 
				Measure.valueOf(pointInTime.getEstimatedValue(), pointInTime.getUnit()),
				Measure.valueOf(arrivalRate.getEstimatedValue(), arrivalRate.getUnit()));
	}
	

}
