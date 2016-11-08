package eu.cactosfp7.cactosim.launcher.jobs;

import org.eclipse.core.runtime.IProgressMonitor;
import org.palladiosimulator.monitorrepository.MonitorRepositoryPackage;
import org.palladiosimulator.pcm.allocation.AllocationPackage;
import org.palladiosimulator.pcm.usagemodel.UsagemodelPackage;
import org.scaledl.usageevolution.UsageevolutionPackage;

import de.uka.ipd.sdq.workflow.jobs.CleanupFailedException;
import de.uka.ipd.sdq.workflow.jobs.IBlackboardInteractingJob;
import de.uka.ipd.sdq.workflow.jobs.JobFailedException;
import de.uka.ipd.sdq.workflow.jobs.SequentialBlackboardInteractingJob;
import de.uka.ipd.sdq.workflow.jobs.UserCanceledException;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.ResourceSetPartition;
import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalcorrespondencePackage;
import eu.cactosfp7.cactosim.correspondence.measurementcorrespondence.MeasurementcorrespondencePackage;
import eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalcorrespondencePackage;
import eu.cactosfp7.cactosim.launcher.CactoSimConstants;
import eu.cactosfp7.cactosim.launcher.CactoSimWorkflowConfiguration;
import eu.cactosfp7.cactosim.usagesequence.UsagesequencePackage;
import eu.cactosfp7.cactosim.util.PathUtil;

public class InitializePCMModelsFromCactosPartitionJob extends SequentialBlackboardInteractingJob<MDSDBlackboard> implements
    IBlackboardInteractingJob<MDSDBlackboard> {

    private CactoSimWorkflowConfiguration configuration;

    public InitializePCMModelsFromCactosPartitionJob(CactoSimWorkflowConfiguration configuration) {
        this.configuration = configuration;
    }

    @Override
    public void execute(IProgressMonitor monitor) throws JobFailedException, UserCanceledException {
        ResourceSetPartition cactosPartition = this.getBlackboard().getPartition(LoadCactoSimModelsIntoBlackBoardJob.CACTOS_MODELS_PARTITION_ID);
        
        this.configuration.setAllocationFiles(PathUtil.getPathsAsString(cactosPartition.getElement(AllocationPackage.eINSTANCE.getAllocation())));
        this.configuration.setUsageEvolutionFile(PathUtil.getPathAsString(cactosPartition.getElement(UsageevolutionPackage.eINSTANCE.getUsageEvolution())));
        this.configuration.setUsageModelFile(PathUtil.getPathAsString(cactosPartition.getElement(UsagemodelPackage.eINSTANCE.getUsageModel())));
        this.configuration.setUsageSequenceRepositoryFile(PathUtil.getPathAsString(cactosPartition.getElement(UsagesequencePackage.eINSTANCE.getUsageSequenceRepository())));
        this.configuration.setReconfigurationRulesFolder(CactoSimConstants.RECONFIGURATION_RULES_FOLDER);
        this.configuration.setMonitorRepositoryFile(PathUtil.getPathAsString(cactosPartition.getElement(MonitorRepositoryPackage.eINSTANCE.getMonitorRepository())));
        this.configuration.setServiceLevelObjectivesFile("");
        this.configuration.setCactosLogicalCorrespondenceFile(PathUtil.getPathAsString(cactosPartition.getElement(LogicalcorrespondencePackage.eINSTANCE.getLogicalCorrespondenceRepository())));
        this.configuration.setCactosPhysicalCorrespondenceFile(PathUtil.getPathAsString(cactosPartition.getElement(PhysicalcorrespondencePackage.eINSTANCE.getPhysicalCorrespondenceRepository())));
        this.configuration.setCactosMeasurementCorrespondenceFile(PathUtil.getPathAsString(cactosPartition.getElement(MeasurementcorrespondencePackage.eINSTANCE.getMonitorCorrespondenceRepository())));
        
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
