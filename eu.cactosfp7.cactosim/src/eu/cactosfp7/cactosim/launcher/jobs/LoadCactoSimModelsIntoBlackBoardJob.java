package eu.cactosfp7.cactosim.launcher.jobs;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.palladiosimulator.analyzer.workflow.jobs.PreparePCMBlackboardPartitionJob;

import de.fzi.power.specification.resources.PowerModelConstants;
import de.uka.ipd.sdq.workflow.jobs.CleanupFailedException;
import de.uka.ipd.sdq.workflow.jobs.IBlackboardInteractingJob;
import de.uka.ipd.sdq.workflow.jobs.IJob;
import de.uka.ipd.sdq.workflow.jobs.JobFailedException;
import de.uka.ipd.sdq.workflow.jobs.SequentialBlackboardInteractingJob;
import de.uka.ipd.sdq.workflow.jobs.UserCanceledException;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.ResourceSetPartition;
import eu.cactosfp7.cactosim.launcher.CactoSimConstants;
import eu.cactosfp7.cactosim.launcher.CactoSimWorkflowConfiguration;

public class LoadCactoSimModelsIntoBlackBoardJob extends SequentialBlackboardInteractingJob<MDSDBlackboard> implements IJob,
    IBlackboardInteractingJob<MDSDBlackboard> {

    public static final String CACTOS_MODELS_PARTITION_ID = "eu.cactosfp7.cactosim.cactos.partition";
    private CactoSimWorkflowConfiguration configuration;

    public LoadCactoSimModelsIntoBlackBoardJob(CactoSimWorkflowConfiguration configuration) {
        this.configuration = configuration;
    }

    @Override
    public void execute(IProgressMonitor monitor) throws JobFailedException, UserCanceledException {
        final String cactosPDCFile = configuration.getCactosPDCFile();
        ResourceSetPartition partition = new ResourceSetPartition();
        this.getBlackboard().addPartition(CACTOS_MODELS_PARTITION_ID, partition);
        URI createURI = URI.createURI(cactosPDCFile);
        Resource pdcResource = partition.loadModel(createURI);
        partition.loadModel(URI.createURI(CactoSimConstants.PATHMAP_METRIC_SPEC_MODELS_COMMON_METRICS_METRICSPEC));
        partition.loadModel(PreparePCMBlackboardPartitionJob.PCM_PALLADIO_PRIMITIVE_TYPE_REPOSITORY_URI);
        partition.loadModel(URI.createURI(PowerModelConstants.PATHMAP_POWER_MODEL_MODELS_COMMON_POWER_MODELS_POWERMODEL));
        partition.loadModel(URI.createURI("pathmap://POWER_MODELS_MODELS/models/commonSpecification.spec"));
    }

    @Override
    public void cleanup(IProgressMonitor monitor) throws CleanupFailedException {
        // TODO Auto-generated method stub

    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return null;
    }

}
