package eu.cactosfp7.cactosim.launcher.jobs;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.palladiosimulator.analyzer.workflow.jobs.LoadPCMModelsIntoBlackboardJob;

import de.uka.ipd.sdq.workflow.jobs.IBlackboardInteractingJob;
import de.uka.ipd.sdq.workflow.jobs.JobFailedException;
import de.uka.ipd.sdq.workflow.jobs.SequentialBlackboardInteractingJob;
import de.uka.ipd.sdq.workflow.jobs.UserCanceledException;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.ResourceSetPartition;
import eu.cactosfp7.cactosim.launcher.CactoSimConstants;
import eu.cactosfp7.cactosim.launcher.CactoSimWorkflowConfiguration;

public class LoadAdditionalModelsIntoPCMBlackBoardJob extends SequentialBlackboardInteractingJob<MDSDBlackboard> implements
IBlackboardInteractingJob<MDSDBlackboard> {
    
    private CactoSimWorkflowConfiguration configuration;

    public LoadAdditionalModelsIntoPCMBlackBoardJob(final CactoSimWorkflowConfiguration configuration) {
        this.configuration = configuration;
    }
    
    @Override
    public void execute(IProgressMonitor monitor) throws JobFailedException, UserCanceledException {
    	ResourceSetPartition pcmPartition = this.getBlackboard().getPartition(LoadPCMModelsIntoBlackboardJob.PCM_MODELS_PARTITION_ID);
        pcmPartition.loadModel(URI.createURI(CactoSimConstants.PATHMAP_METRIC_SPEC_MODELS_COMMON_METRICS_METRICSPEC));        
        pcmPartition.loadModel(URI.createURI(this.configuration.getUsageSequenceRepositoryFile()));
        pcmPartition.resolveAllProxies();
    }    
   

}
