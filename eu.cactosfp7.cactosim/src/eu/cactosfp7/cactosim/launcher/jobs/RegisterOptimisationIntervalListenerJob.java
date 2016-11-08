package eu.cactosfp7.cactosim.launcher.jobs;

import java.util.Optional;
import java.util.stream.Collectors;

import javax.measure.unit.SI;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.palladiosimulator.analyzer.workflow.jobs.LoadPCMModelsIntoBlackboardJob;
import org.palladiosimulator.metricspec.constants.MetricDescriptionConstants;
import org.palladiosimulator.monitorrepository.MonitorRepository;
import org.palladiosimulator.monitorrepository.MonitorRepositoryPackage;
import org.palladiosimulator.monitorrepository.ProcessingType;
import org.palladiosimulator.monitorrepository.TimeDrivenAggregation;

import de.uka.ipd.sdq.workflow.jobs.IBlackboardInteractingJob;
import de.uka.ipd.sdq.workflow.jobs.JobFailedException;
import de.uka.ipd.sdq.workflow.jobs.SequentialBlackboardInteractingJob;
import de.uka.ipd.sdq.workflow.jobs.UserCanceledException;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.ResourceSetPartition;
import eu.cactosfp7.cactosim.launcher.CactoSimWorkflowConfiguration;
import eu.cactosfp7.infrastructuremodels.logicaldc.core.LogicalDCModel;
import eu.cactosfp7.infrastructuremodels.logicaldc.core.impl.CorePackageImpl;

public class RegisterOptimisationIntervalListenerJob extends SequentialBlackboardInteractingJob<MDSDBlackboard> implements IBlackboardInteractingJob<MDSDBlackboard> {
    private CactoSimWorkflowConfiguration configuration;

    public RegisterOptimisationIntervalListenerJob(final CactoSimWorkflowConfiguration configuration) {
        this.configuration = configuration;
    }
    
    @Override
    public void execute(IProgressMonitor monitor) throws JobFailedException, UserCanceledException {
        ResourceSetPartition pcmPartition = this.getBlackboard().getPartition(LoadPCMModelsIntoBlackboardJob.PCM_MODELS_PARTITION_ID);
        
        Optional<TimeDrivenAggregation> cyclicInterval = EcoreUtil.<TimeDrivenAggregation>getObjectsByType(
                EcoreUtil.<MonitorRepository>getObjectsByType(pcmPartition.getContents(URI.createURI(this.configuration.getMonitorRepositoryFile())), 
                        MonitorRepositoryPackage.eINSTANCE.getMonitorRepository()).stream()
        		.flatMap(repo -> repo.getMonitors().stream())
        		.filter(mon -> mon.getMeasurementSpecifications().size() == 1)
        		.flatMap(mon -> mon.getMeasurementSpecifications().stream())
        		.filter(spec -> spec.getMetricDescription().getId().equals(MetricDescriptionConstants.POINT_IN_TIME_METRIC.getId()))
        		.map(spec -> spec.getProcessingType()).collect(Collectors.toList()),
        		MonitorRepositoryPackage.eINSTANCE.getTimeDrivenAggregation())        		
                .stream().findAny();
        
        cyclicInterval.ifPresent(cyclInterval -> {
            Optional.of(EcoreUtil.getObjectByType(pcmPartition.getContents(URI.createURI(this.configuration.getCactosPDCFile())),
            	CorePackageImpl.eINSTANCE.getLogicalDCModel()))
            		.map(LogicalDCModel.class::cast)
            		.ifPresent(model -> {
            		    model.eAdapters().add(new AdapterImpl() {
            			public void notifyChanged(Notification msg) {
            			    if (msg.getFeature().equals(CorePackageImpl.eINSTANCE.getLogicalDCModel_CyclicOptimizationInterval())) {
            				cyclInterval.setWindowLength(model.getCyclicOptimizationInterval().doubleValue(SI.SECOND));
            			    }
            			}
            		    });
            		});    
        });
    }

}
