package eu.cactosfp7.cactosim.experimentscenario.executor;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.resource.Resource;
import org.palladiosimulator.analyzer.workflow.jobs.LoadPCMModelsIntoBlackboardJob;
import org.palladiosimulator.metricspec.constants.MetricDescriptionConstants;
import org.palladiosimulator.monitorrepository.MeasurementSpecification;
import org.palladiosimulator.runtimemeasurement.RuntimeMeasurementModel;
import org.palladiosimulator.simulizar.interpreter.listener.AbstractRecordingProbeFrameworkListenerDecorator;
import org.palladiosimulator.simulizar.simulationtime.SimulationTimeRecorder;

import de.uka.ipd.sdq.simucomframework.model.SimuComModel;
import de.uka.ipd.sdq.workflow.blackboard.IBlackboard;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.ResourceSetPartition;
import eu.cactosfp7.cactosim.experimentscenario.ExperimentScenarioTimeLine;
import eu.cactosfp7.cactosim.experimentscenario.ExperimentscenarioPackage;

public class TimeLineEventProbeFrameworkListenerDecorator extends AbstractRecordingProbeFrameworkListenerDecorator {
    
    @Override
    public void registerMeasurements() {
        super.registerMeasurements();
        initTimeMeasurements();
    }
    
    private void initTimeMeasurements() {
        RuntimeMeasurementModel runtimeMeasurementModel = this.getProbeFrameworkListener().getRuntimeMeasurementModel();
        
        SimuComModel model = this.getProbeFrameworkListener().getSimuComModel();
        
        IBlackboard<ResourceSetPartition> blackboard = this.getProbeFrameworkListener().getModelAccess().getBlackboard();
        
        if (!blackboard.hasPartition(LoadPCMModelsIntoBlackboardJob.PCM_MODELS_PARTITION_ID)) return;
        
        ResourceSetPartition cactos_partition = blackboard.getPartition(LoadPCMModelsIntoBlackboardJob.PCM_MODELS_PARTITION_ID);
        
        List<ExperimentScenarioTimeLine> scenarios = cactos_partition.getResourceSet().getResources().stream()
            .filter((Resource r) -> r.getContents().size() > 0)
            .filter((Resource r) -> r.getContents().get(0).eClass().getEPackage().getNsURI().equals(ExperimentscenarioPackage.eNS_URI))
            .map((Resource r) -> r.getContents())
            .flatMap(Collection::stream).map(ExperimentScenarioTimeLine.class::cast).collect(Collectors.toList());
            
        if (!scenarios.isEmpty()) {
            Iterable<MeasurementSpecification> trigger_measurements = this.getProbeFrameworkListener()
                    .getMeasurementSpecificationsForMetricDescription(MetricDescriptionConstants.EXTERNAL_EVENT_TIME_METRIC);
            
            for(MeasurementSpecification spec : trigger_measurements) {
                final SimulationTimeRecorder simulationTimeRecorder = new SimulationTimeRecorder(runtimeMeasurementModel, spec);
                
                for(ExperimentScenarioTimeLine timeline: scenarios) {
                    (new TimeLineEventScheduler(model, timeline))
                        .onEventScheduling(((e, t) -> simulationTimeRecorder.newMeasurementAvailable(t)));
                }
            }
        }
    }
}
