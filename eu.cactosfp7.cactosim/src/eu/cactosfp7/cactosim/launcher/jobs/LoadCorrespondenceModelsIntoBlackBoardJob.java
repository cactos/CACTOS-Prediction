package eu.cactosfp7.cactosim.launcher.jobs;

import org.eclipse.core.runtime.IProgressMonitor;
import org.palladiosimulator.analyzer.workflow.jobs.LoadPCMModelsIntoBlackboardJob;

import de.uka.ipd.sdq.workflow.jobs.IBlackboardInteractingJob;
import de.uka.ipd.sdq.workflow.jobs.JobFailedException;
import de.uka.ipd.sdq.workflow.jobs.SequentialBlackboardInteractingJob;
import de.uka.ipd.sdq.workflow.jobs.UserCanceledException;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.ResourceSetPartition;
import eu.cactosfp7.cactosim.launcher.CactoSimWorkflowConfiguration;

public class LoadCorrespondenceModelsIntoBlackBoardJob extends SequentialBlackboardInteractingJob<MDSDBlackboard> implements
IBlackboardInteractingJob<MDSDBlackboard> {
    
    private CactoSimWorkflowConfiguration configuration;

    public LoadCorrespondenceModelsIntoBlackBoardJob(final CactoSimWorkflowConfiguration configuration) {
        this.configuration = configuration;
    }
    
    @Override
    public void execute(IProgressMonitor monitor) throws JobFailedException, UserCanceledException {
        final String cactosLogicalCorrespondenceFile = this.configuration.getCactosLogicalCorrespondenceFile();
        final String cactosPhysicalCorrespondenceFile = this.configuration.getCactosPhysicalCorrespondenceFile();
        final String cactosMeasurementCorrespondenceFile = this.configuration.getCactosMeasurementCorrespondenceFile();
        ResourceSetPartition pcmPartition = this.getBlackboard().getPartition(LoadPCMModelsIntoBlackboardJob.PCM_MODELS_PARTITION_ID);
        pcmPartition.loadModel(org.eclipse.emf.common.util.URI.createURI(cactosLogicalCorrespondenceFile));
        pcmPartition.loadModel(org.eclipse.emf.common.util.URI.createURI(cactosPhysicalCorrespondenceFile));   
        pcmPartition.loadModel(org.eclipse.emf.common.util.URI.createURI(cactosMeasurementCorrespondenceFile));
        pcmPartition.resolveAllProxies();
    }
}
