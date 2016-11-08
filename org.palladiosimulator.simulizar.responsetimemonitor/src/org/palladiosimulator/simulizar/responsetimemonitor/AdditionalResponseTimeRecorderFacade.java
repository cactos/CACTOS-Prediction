package org.palladiosimulator.simulizar.responsetimemonitor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.edp2.models.measuringpoint.MeasuringPoint;
import org.palladiosimulator.metricspec.constants.MetricDescriptionConstants;
import org.palladiosimulator.monitorrepository.MeasurementSpecification;
import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.pcm.repository.OperationSignature;
import org.palladiosimulator.pcm.usagemodel.UsageScenario;
import org.palladiosimulator.probeframework.calculator.Calculator;
import org.palladiosimulator.probeframework.probes.TriggeredProbe;
import org.palladiosimulator.simulizar.interpreter.listener.AbstractInterpreterListener;
import org.palladiosimulator.simulizar.interpreter.listener.ModelElementPassedEvent;
import org.palladiosimulator.simulizar.runtimestate.AbstractSimuLizarRuntimeState;
import org.palladiosimulator.simulizar.utils.MonitorRepositoryUtil;

import de.uka.ipd.sdq.simucomframework.probes.TakeCurrentSimulationTimeProbe;

public class AdditionalResponseTimeRecorderFacade extends AbstractInterpreterListener {
	private final Map<String, List<TriggeredProbe>> currentTimeProbes = new HashMap<>();
	private final Map<String, Calculator> currentCalculators = new HashMap<>();
	private final AbstractSimuLizarRuntimeState simulizarRuntimeState;
	private static final int START_PROBE_INDEX = 0;
    private static final int STOP_PROBE_INDEX = 1;
	
	public AdditionalResponseTimeRecorderFacade(AbstractSimuLizarRuntimeState state) {
		this.simulizarRuntimeState = state;
		state.getEventNotificationHelper().addObserver(this);
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void setupResponseTimeRecorder(MeasurementSpecification spec) {
		if (!MetricDescriptionConstants.RESPONSE_TIME_METRIC.getId()
				.equals(spec.getMetricDescription().getId())) {
			throw new IllegalArgumentException("Response time calculator can only be initialized for response time metric");
		}
        if (spec.getMonitor().isActivated()) {
            final MeasuringPoint measuringPoint = spec.getMonitor().getMeasuringPoint();
            
            List probes = new ArrayList(2);
            probes.add(new TakeCurrentSimulationTimeProbe(this.simulizarRuntimeState.getModel().getSimulationControl()));
            probes.add(new TakeCurrentSimulationTimeProbe(this.simulizarRuntimeState.getModel().getSimulationControl()));
            final EObject modelElement = MonitorRepositoryUtil.getMonitoredElement(measuringPoint);
            
            final List probesList = Collections.unmodifiableList(probes);
            
            this.currentTimeProbes.put(((Entity) modelElement).getId(), probesList);
            final Calculator calculator = this.simulizarRuntimeState.getModel()
            		.getProbeFrameworkContext().getCalculatorFactory()
            			.buildResponseTimeCalculator(measuringPoint, probesList);
            currentCalculators.put(((Entity) modelElement).getId(), calculator);
        }		
	}
	
	public void unregisterResponseTimeRecorder(MeasurementSpecification spec) {
		if (!MetricDescriptionConstants.RESPONSE_TIME_METRIC_TUPLE.getId()
				.equals(spec.getMetricDescription().getId())) {
			throw new IllegalArgumentException("Response time calculator can only be removed for response time metric");
		}
		final EObject modelElement = MonitorRepositoryUtil.getMonitoredElement(
				spec.getMonitor().getMeasuringPoint());
		Calculator calc = currentCalculators.remove(((Entity) modelElement).getId());
		calc.preUnregister();
		this.currentTimeProbes.remove(((Entity) modelElement).getId());
	}

	
    /**
     * @param <T>
     * @param event
     */
    private <T extends Entity> void startMeasurement(final ModelElementPassedEvent<T> event) {
        if (this.currentTimeProbes.containsKey(((Entity) event.getModelElement()).getId())
                && this.simulizarRuntimeState.getModel().getSimulationControl().isRunning()) {
            this.currentTimeProbes.get(((Entity) event.getModelElement()).getId()).get(START_PROBE_INDEX)
                    .takeMeasurement(event.getThread().getRequestContext());
        }
    }

    /**
     * @param event
     */
    private <T extends Entity> void endMeasurement(final ModelElementPassedEvent<T> event) {
        if (this.currentTimeProbes.containsKey(((Entity) event.getModelElement()).getId())
        		&& this.simulizarRuntimeState.getModel().getSimulationControl().isRunning()) {
            this.currentTimeProbes.get(((Entity) event.getModelElement()).getId()).get(STOP_PROBE_INDEX)
                    .takeMeasurement(event.getThread().getRequestContext());
        }
    }
	
	@Override
	public void beginSystemOperationCallInterpretation(ModelElementPassedEvent<OperationSignature> event) {
		this.startMeasurement(event);
	}
	
	@Override
	public void endSystemOperationCallInterpretation(ModelElementPassedEvent<OperationSignature> event) {
		this.endMeasurement(event);
	}
	
	@Override
	public void beginUsageScenarioInterpretation(ModelElementPassedEvent<UsageScenario> event) {
		this.startMeasurement(event);
	}
	
	@Override
	public void endUsageScenarioInterpretation(ModelElementPassedEvent<UsageScenario> event) {
		this.endMeasurement(event);
	}
	
}
