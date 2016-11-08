package eu.cactosfp7.cactosim.optimisationtime.probes;
import javax.measure.Measure;
import javax.measure.quantity.Duration;

import org.palladiosimulator.metricspec.constants.MetricDescriptionConstants;
import org.palladiosimulator.probeframework.measurement.RequestContext;
import org.palladiosimulator.probeframework.probes.BasicTriggeredProbe;

import eu.cactosfp7.cactosim.optimisationtime.util.IOptimisationDurationListener;
import eu.cactosfp7.cactosim.optimisationtime.util.OptimisationDurationRegistry;
import eu.cactosfp7.cactosim.optimisationtime.util.OptimisationExecutedEvent;

public class TakeOptimisationDurationProbe extends BasicTriggeredProbe<Double, Duration> implements IOptimisationDurationListener {

    private final OptimisationDurationRegistry registry;

    public TakeOptimisationDurationProbe(OptimisationDurationRegistry registry) {
        super(MetricDescriptionConstants.OPTIMISATION_TIME_METRIC);
        this.registry = registry;
    }

    @Override
    protected Measure<Double, Duration> getBasicMeasure(RequestContext measurementContext) {
        return registry.getLastDuration();
    }

    @Override
    public void optimisationExecuted(OptimisationExecutedEvent event) {
        this.takeMeasurement();
    }

}
