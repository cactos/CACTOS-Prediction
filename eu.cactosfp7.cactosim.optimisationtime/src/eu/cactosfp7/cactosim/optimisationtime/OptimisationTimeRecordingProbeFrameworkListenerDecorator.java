package eu.cactosfp7.cactosim.optimisationtime;

import static org.palladiosimulator.metricspec.constants.MetricDescriptionConstants.OPTIMISATION_TIME_METRIC_TUPLE;

import java.util.Collection;
import java.util.Map;

import org.palladiosimulator.edp2.models.measuringpoint.MeasuringPoint;
import org.palladiosimulator.monitorrepository.MeasurementSpecification;
import org.palladiosimulator.probeframework.calculator.Calculator;
import org.palladiosimulator.probeframework.probes.TriggeredProbe;
import org.palladiosimulator.simulizar.interpreter.listener.AbstractRecordingProbeFrameworkListenerDecorator;
import org.palladiosimulator.simulizar.interpreter.listener.AbstractProbeFrameworkListener;

import de.uka.ipd.sdq.simucomframework.resources.CalculatorHelper;
import eu.cactosfp7.cactosim.optimisationtime.probes.TakeOptimisationDurationProbe;
import eu.cactosfp7.cactosim.optimisationtime.util.IOptimisationDurationListener;
import eu.cactosfp7.cactosim.optimisationtime.util.OptimisationDurationRegistry;
import eu.cactosfp7.cactosim.optimisationtime.util.OptimisationExecutedEvent;

public class OptimisationTimeRecordingProbeFrameworkListenerDecorator
        extends AbstractRecordingProbeFrameworkListenerDecorator {
    
    @Override
    public void registerMeasurements() {
        super.registerMeasurements();
        initOptimisationTimeMeasurements();
    }

    private void initOptimisationTimeMeasurements() {
        final AbstractProbeFrameworkListener probeFrameworkListener = getProbeFrameworkListener();
        Collection<MeasurementSpecification> optimisationTimeMsmtSpecs = probeFrameworkListener.
                getMeasurementSpecificationsForMetricDescription(OPTIMISATION_TIME_METRIC_TUPLE);
        if(optimisationTimeMsmtSpecs.size() > 0) {
            MeasurementSpecification msmntSpec = optimisationTimeMsmtSpecs.iterator().next();
            MeasuringPoint mp = msmntSpec.getMonitor().getMeasuringPoint();
            OptimisationDurationRegistry notifier = OptimisationDurationRegistry.getNotifier();
            final TakeOptimisationDurationProbe optProbe = new TakeOptimisationDurationProbe(notifier);
            final TriggeredProbe optProbeOverTime = CalculatorHelper.getTriggeredProbeSetWithCurrentTime(OPTIMISATION_TIME_METRIC_TUPLE,
                    probeFrameworkListener.getSimuComModel().getSimulationControl(), optProbe);
            Calculator optimisationTimeCalculator = probeFrameworkListener.getCalculatorFactory().buildOptimisationTimeCalculator(mp, optProbeOverTime);
            notifier.addObserver(new IOptimisationDurationListener() {
                @Override
                public void optimisationExecuted(OptimisationExecutedEvent event) {
                    optProbeOverTime.takeMeasurement();
                }
            });            
            Map<String, Object> recorderConfigurationMap = createRecorderConfigMapWithAcceptedMetricAndMeasuringPoint(
                    OPTIMISATION_TIME_METRIC_TUPLE, mp);
            this.registerMeasurementsRecorder(optimisationTimeCalculator, initializeRecorder(recorderConfigurationMap));
        }
    }
    
}
