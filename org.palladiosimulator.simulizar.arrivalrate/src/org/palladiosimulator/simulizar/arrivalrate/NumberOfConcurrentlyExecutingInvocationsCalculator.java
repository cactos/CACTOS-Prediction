package org.palladiosimulator.simulizar.arrivalrate;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;

import javax.measure.Measure;
import javax.measure.quantity.Dimensionless;
import javax.measure.unit.Unit;

import org.palladiosimulator.edp2.models.measuringpoint.MeasuringPoint;
import org.palladiosimulator.measurementframework.BasicMeasurement;
import org.palladiosimulator.measurementframework.MeasuringValue;
import org.palladiosimulator.measurementframework.TupleMeasurement;
import org.palladiosimulator.measurementframework.listener.MeasurementSource;
import org.palladiosimulator.metricspec.BaseMetricDescription;
import org.palladiosimulator.metricspec.MetricDescription;
import org.palladiosimulator.metricspec.MetricSetDescription;
import org.palladiosimulator.probeframework.measurement.ProbeMeasurement;
import org.palladiosimulator.probeframework.probes.Probe;
import org.palladiosimulator.probeframework.probes.listener.IProbeListener;

public class NumberOfConcurrentlyExecutingInvocationsCalculator extends MeasurementSource {
	  
	protected final AtomicLong concurrentExecutions = new AtomicLong(0);
	protected final Probe startProbe;
	protected final Probe stopProbe;
	
	protected final MeasuringPoint measuringPoint;

	public NumberOfConcurrentlyExecutingInvocationsCalculator(MetricDescription metricDesciption, final MeasuringPoint measuringPoint,
			Probe startProbe, Probe stopProbe) {
		super(metricDesciption);
		
		this.startProbe = startProbe;
		this.stopProbe = stopProbe;
		
		startProbe.addObserver(new IProbeListener() {
			@Override
			public void newProbeMeasurementAvailable(ProbeMeasurement probeMeasurement) {
				NumberOfConcurrentlyExecutingInvocationsCalculator.this.handleStartInvocation(probeMeasurement);
			}
		});
		
		this.stopProbe.addObserver(new IProbeListener() {
			@Override
			public void newProbeMeasurementAvailable(ProbeMeasurement probeMeasurement) {
				NumberOfConcurrentlyExecutingInvocationsCalculator.this.handleStopInvocation(probeMeasurement);
			}
		});
		
		this.measuringPoint = measuringPoint;	
	}
	
	protected void handleStartInvocation(ProbeMeasurement probeMeasurement) {
		fireCalculated(probeMeasurement, concurrentExecutions.incrementAndGet());	
	}
	
	protected void handleStopInvocation(ProbeMeasurement probeMeasurement) {
		fireCalculated(probeMeasurement, concurrentExecutions.decrementAndGet());
	}

    /**
     * Triggers the calculation of a measurement based on a given set of probe measurements. Also
     * informs all registered observers about this new measurement.
     *
     * @param probeMeasurements
     *            Probe measurements conforming to the registered probes of this calculator.
     */
    private void fireCalculated(final ProbeMeasurement probeMeasurement, long amountExecutions) {
        final MeasuringValue calculatedMeasures = calculate(probeMeasurement, amountExecutions);
        notifyMeasurementSourceListener(calculatedMeasures);    
    }    
	
    protected MeasuringValue calculate(ProbeMeasurement probeMeasurement, long amountExecutions) {
		final MeasuringValue startTimeMeasuringValue = probeMeasurement.getBasicMeasurement();
        
        final Measure<Long, Dimensionless> amountExecutionsMeasure = Measure.valueOf(amountExecutions, Unit.ONE);
        final MeasuringValue amountExecutionsMeasuringValue = new BasicMeasurement<Long, Dimensionless>(amountExecutionsMeasure,
                (BaseMetricDescription) ((MetricSetDescription) this.getMetricDesciption()).getSubsumedMetrics().get(1));
        
        return new TupleMeasurement(Arrays.asList(startTimeMeasuringValue, amountExecutionsMeasuringValue), 
        		(MetricSetDescription) this.getMetricDesciption());
    }

}
