package org.palladiosimulator.simulizar.arrivalrate;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import javax.measure.Measure;
import javax.measure.quantity.Duration;
import javax.measure.unit.SI;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.palladiosimulator.edp2.models.measuringpoint.MeasuringpointFactory;
import org.palladiosimulator.edp2.models.measuringpoint.StringMeasuringPoint;
import org.palladiosimulator.experimentanalysis.DiscardAllElementsPriorToLowerBoundStrategy;
import org.palladiosimulator.experimentanalysis.SlidingWindowRecorder;
import org.palladiosimulator.experimentanalysis.windowaggregators.SlidingWindowAggregator;
import org.palladiosimulator.measurementframework.listener.MeasurementSource;
import org.palladiosimulator.metricspec.MetricDescription;
import org.palladiosimulator.metricspec.constants.MetricDescriptionConstants;
import org.palladiosimulator.monitorrepository.MeasurementSpecification;
import org.palladiosimulator.monitorrepository.MonitorRepository;
import org.palladiosimulator.monitorrepository.MonitorRepositoryPackage;
import org.palladiosimulator.monitorrepository.TimeDriven;
import org.palladiosimulator.pcmmeasuringpoint.AssemblyOperationMeasuringPoint;
import org.palladiosimulator.probeframework.measurement.ProbeMeasurement;
import org.palladiosimulator.probeframework.probes.Probe;
import org.palladiosimulator.probeframework.probes.listener.IProbeListener;
import org.palladiosimulator.recorderframework.IRecorder;
import org.palladiosimulator.recorderframework.utils.RecorderExtensionHelper;
import org.palladiosimulator.simulizar.interpreter.listener.AbstractRecordingProbeFrameworkListenerDecorator;
import org.palladiosimulator.simulizar.runtimestate.AbstractSimuLizarRuntimeState;
import org.palladiosimulator.simulizar.slidingwindow.impl.SimulizarSlidingWindow;

import de.uka.ipd.sdq.simucomframework.SimuComConfig;
import de.uka.ipd.sdq.simucomframework.model.SimuComModel;

public class ConcurrentExecutingInvocationsRecorderFacade  {
	private class SimpleIdentityMeasurementSource extends MeasurementSource implements IProbeListener {
		public SimpleIdentityMeasurementSource(MetricDescription metricDesciption) {
			super(metricDesciption);
		}

		@Override
		public void newProbeMeasurementAvailable(ProbeMeasurement probeMeasurement) {			
			this.notifyMeasurementSourceListener(probeMeasurement.getBasicMeasurement());			
		}
	}
	private AssemblyProvidedOperationCalledListener listener = new AssemblyProvidedOperationCalledListener();
	private AbstractSimuLizarRuntimeState simulizarRuntimeState; 
	
	protected Map<Probe, MeasurementSource> probeMeasurementSources = new HashMap<>();
	
	protected Map<MeasurementSource, Map<MeasurementSpecification, IRecorder>> registeredSourceRecorders = new HashMap<>();
	protected Map<MeasurementSource, Map<MeasurementSpecification, SimulizarSlidingWindow>> registeredSlidingWindows = new HashMap<>();
	
	public ConcurrentExecutingInvocationsRecorderFacade(AbstractSimuLizarRuntimeState state) {
		this.simulizarRuntimeState = state;
		this.probeMeasurementSources = new HashMap<Probe, MeasurementSource>();
		state.getEventNotificationHelper().addObserver(listener);
	}
	
	protected MeasurementSource getMeasurementSourceForProbe(final Probe probe) {
		if (!probeMeasurementSources.containsKey(probe)) {
			SimpleIdentityMeasurementSource source = new SimpleIdentityMeasurementSource(probe.getMetricDesciption());
			probe.addObserver(source);
			probeMeasurementSources.put(probe, source);
		}
			
		return probeMeasurementSources.get(probe);
	}
	
	public void setupRequestArrivalRateRecorder(MeasurementSpecification spec) {
		Probe startProbe = listener.getOrCreateAndRegisterCallInterpretationStartProbe(
				(AssemblyOperationMeasuringPoint) spec.getMonitor().getMeasuringPoint(), 
				this.simulizarRuntimeState.getModel());
		
		setupArrivalRateRecorder(getMeasurementSourceForProbe(startProbe), 
				spec, this.simulizarRuntimeState.getModel());
	}
	
	public void unregisterRequestArrivalRateRecorder(MeasurementSpecification spec) {
		Probe startProbe = listener.getOrCreateAndRegisterCallInterpretationStartProbe(
				(AssemblyOperationMeasuringPoint) spec.getMonitor().getMeasuringPoint(), 
				this.simulizarRuntimeState.getModel());
		MeasurementSource source = getMeasurementSourceForProbe(startProbe);
		removeArrivalRateRecorder(source, spec);
		
		if (registeredSourceRecorders.get(source).isEmpty()) {
			listener.removeStartProbe(
				(AssemblyOperationMeasuringPoint) spec.getMonitor().getMeasuringPoint(), startProbe);
		}
	}
	
	public void setupResponseArrivalRateRecorder(MeasurementSpecification spec) {
		Probe stopProbe = listener.getOrCreateAndRegisterCallInterpretationStopProbe(
				(AssemblyOperationMeasuringPoint) spec.getMonitor().getMeasuringPoint(), 
				this.simulizarRuntimeState.getModel());
		
		setupArrivalRateRecorder(getMeasurementSourceForProbe(stopProbe), 
				spec, this.simulizarRuntimeState.getModel());
	}
	
	public void unregisterResponseArrivalRateRecorder(MeasurementSpecification spec) {
		Probe stopProbe = listener.getOrCreateAndRegisterCallInterpretationStopProbe(
				(AssemblyOperationMeasuringPoint) spec.getMonitor().getMeasuringPoint(), 
				this.simulizarRuntimeState.getModel());
		MeasurementSource source = getMeasurementSourceForProbe(stopProbe);
		removeArrivalRateRecorder(source, spec);
		
		if (registeredSourceRecorders.get(source).isEmpty()) {
			listener.removeStartProbe(
				(AssemblyOperationMeasuringPoint) spec.getMonitor().getMeasuringPoint(), stopProbe);
		}
	}
	
	public void setUpConcurrentlyInvocationsRecorder(MeasurementSpecification spec) {
		Probe startProbe = listener.getOrCreateAndRegisterCallInterpretationStartProbe(
				(AssemblyOperationMeasuringPoint) spec.getMonitor().getMeasuringPoint(), 
				this.simulizarRuntimeState.getModel());
		Probe stopProbe = listener.getOrCreateAndRegisterCallInterpretationStopProbe(
				(AssemblyOperationMeasuringPoint) spec.getMonitor().getMeasuringPoint(), 
				this.simulizarRuntimeState.getModel());
		NumberOfConcurrentlyExecutingInvocationsCalculator calc = new NumberOfConcurrentlyExecutingInvocationsCalculator(
				MetricDescriptionConstants.NUMBER_OF_CONCURRENTLY_EXECUTING_INVOCATIONS_TUPLE,
				spec.getMonitor().getMeasuringPoint(), startProbe, stopProbe);
		Map<String, Object> recorderConfigurationMap = AbstractRecordingProbeFrameworkListenerDecorator
				.createRecorderConfigMapWithAcceptedMetricAndMeasuringPoint(
						MetricDescriptionConstants.NUMBER_OF_CONCURRENTLY_EXECUTING_INVOCATIONS_TUPLE, 
						spec.getMonitor().getMeasuringPoint());
		IRecorder recorder = initializeRecorder(recorderConfigurationMap);
		storeElementForMeasurementSourceAndSpecification(recorder, registeredSourceRecorders, 
				getMeasurementSourceForProbe(startProbe), spec);
		storeElementForMeasurementSourceAndSpecification(recorder, registeredSourceRecorders, 
				getMeasurementSourceForProbe(stopProbe), spec);
		calc.addObserver(recorder);
	}
	
	
	private void setupArrivalRateRecorder(MeasurementSource source, MeasurementSpecification measurementSpec,
            SimuComModel model) {

        if (!(measurementSpec.getProcessingType() instanceof TimeDriven)) {
            throw new IllegalArgumentException("MetricDescription (Arrival Rate) '"
                    + measurementSpec.getName() + "' of Monitor '"
                    + measurementSpec.getMonitor().getEntityName()
                    + "' must provide a ProcessingType of Type " + TimeDriven.class.toString());
        }

        TimeDriven timeDriven = (TimeDriven) measurementSpec.getProcessingType();

        StringMeasuringPoint persistentMeasuringPoint = MeasuringpointFactory.eINSTANCE.createStringMeasuringPoint();
        persistentMeasuringPoint.setMeasuringPoint(measurementSpec.getMonitor().getMeasuringPoint().getStringRepresentation());
        
        measurementSpec.getMonitor().getMeasuringPoint()
        		.getMeasuringPointRepository().getMeasuringPoints().add(persistentMeasuringPoint);
        Map<String, Object> recorderConfigurationMap = AbstractRecordingProbeFrameworkListenerDecorator
        		.createRecorderConfigMapWithAcceptedMetricAndMeasuringPoint(
        				measurementSpec.getMetricDescription(),
        				persistentMeasuringPoint);

        IRecorder baseRecorder = initializeRecorder(recorderConfigurationMap);

        SimulizarSlidingWindow window = new SimulizarSlidingWindow(
        		timeDriven.getWindowLengthAsMeasure(), timeDriven.getWindowIncrementAsMeasure(),
        		Measure.valueOf(this.simulizarRuntimeState.getModel().getSimulationControl().getCurrentSimulationTime(), SI.SECOND),
                MetricDescriptionConstants.POINT_IN_TIME_METRIC, 
                new DiscardAllElementsPriorToLowerBoundStrategy(), 
                model);
        
        storeElementForMeasurementSourceAndSpecification(window, registeredSlidingWindows,
        		source, measurementSpec);
        
        SlidingWindowAggregator arrivalRateAggregator = new SlidingWindowArrivalRateAggregator(
        		measurementSpec.getMetricDescription(), 
        		baseRecorder);
        
        IRecorder recorder = new SlidingWindowRecorder(window, arrivalRateAggregator); 
        source.addObserver(recorder);
        storeElementForMeasurementSourceAndSpecification(recorder, registeredSourceRecorders, 
        		source, measurementSpec);
        
        // forward utilization measurements to RuntimeMeasurementModel (the former PRM)
        arrivalRateAggregator.addRecorder(new ArrivalRateRuntimeModelRecorder(
        		simulizarRuntimeState.getModelAccess().getRuntimeMeasurementModel(), measurementSpec));
    }
	
	
	private void removeArrivalRateRecorder(MeasurementSource measurementSourceForProbe, MeasurementSpecification spec) {
		getElementForMeasurementSourceAndSpecification(registeredSlidingWindows, measurementSourceForProbe, spec)
			.ifPresent(window -> window.flushAndStopAggregation());
		getElementForMeasurementSourceAndSpecification(registeredSourceRecorders, measurementSourceForProbe, spec)
			.ifPresent(measurementSourceForProbe::removeObserver);
		
		removeElementForMeasurementSourceAndSpecification(registeredSlidingWindows, measurementSourceForProbe, spec);
		removeElementForMeasurementSourceAndSpecification(registeredSourceRecorders, measurementSourceForProbe, spec);
	}
	
    protected IRecorder initializeRecorder(final Map<String, Object> recorderConfigMap) {
        assert recorderConfigMap != null;

        final SimuComConfig config = this.simulizarRuntimeState.getModel().getConfiguration();
        final IRecorder recorder = RecorderExtensionHelper
                .instantiateRecorderImplementationForRecorder(config.getRecorderName());
        recorder.initialize(config.getRecorderConfigurationFactory().createRecorderConfiguration(recorderConfigMap));

        return recorder;
    }
    
	private static <E, K1, K2> void storeElementForMeasurementSourceAndSpecification(E element, Map<K1, Map<K2, E>> entityMap, 
			K1 firstKey, K2 secondKey) {
		if (!entityMap.containsKey(firstKey)) {
			entityMap.put(firstKey, new HashMap<>());
		}
		entityMap.get(firstKey).put(secondKey, element);
	}
	
	private static <T> Optional<T> getElementForMeasurementSourceAndSpecification(Map<MeasurementSource, Map<MeasurementSpecification, T>> entityMap, 
			MeasurementSource measurementSource, MeasurementSpecification spec) {
		return Optional.ofNullable(entityMap.get(measurementSource)).flatMap(
				specToEntity -> Optional.ofNullable(specToEntity.get(spec)));
	}
	
	private static <E, K1, K2> void removeElementForMeasurementSourceAndSpecification(Map<K1, Map<K2, E>> entityMap, 
			K1 firstKey, K2 secondKey) {
		Optional.ofNullable(entityMap.get(firstKey))
			.ifPresent(map -> map.remove(secondKey));
	}
}
