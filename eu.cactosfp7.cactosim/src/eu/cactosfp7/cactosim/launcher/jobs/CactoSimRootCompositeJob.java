package eu.cactosfp7.cactosim.launcher.jobs;

import org.palladiosimulator.analyzer.workflow.jobs.CreatePluginProjectJob;
import org.palladiosimulator.analyzer.workflow.jobs.LoadPCMModelsIntoBlackboardJob;
import org.palladiosimulator.simulizar.launcher.jobs.LoadSimuLizarModelsIntoBlackboardJob;
import org.palladiosimulator.simulizar.launcher.jobs.PCMStartInterpretationJob;

import de.uka.ipd.sdq.workflow.jobs.IBlackboardInteractingJob;
import de.uka.ipd.sdq.workflow.jobs.SequentialBlackboardInteractingJob;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;
import eu.cactosfp7.cactosim.launcher.CactoSimWorkflowConfiguration;

public class CactoSimRootCompositeJob extends SequentialBlackboardInteractingJob<MDSDBlackboard> implements
IBlackboardInteractingJob<MDSDBlackboard> {
    
    public CactoSimRootCompositeJob(final CactoSimWorkflowConfiguration configuration, boolean isHeadless) {
        super(false);
        
        this.setBlackboard(new MDSDBlackboard());
        
        this.add(new LoadCactoSimModelsIntoBlackBoardJob(configuration));
        if(isHeadless) {
            this.add(new CleanupPluginProjectJob(configuration));
        }
        this.add(new CreatePluginProjectJob(configuration));
        this.add(new LoadExperimentScenarioIntoBlackBoardJob(configuration, LoadCactoSimModelsIntoBlackBoardJob.CACTOS_MODELS_PARTITION_ID));
        this.add(new CactoSimToPCMTransformationsJob(configuration));
        this.add(new InitializePCMModelsFromCactosPartitionJob(configuration));
        this.add(new LoadSimuLizarModelsIntoBlackboardJob(configuration, false));
        this.add(new LoadAdditionalModelsIntoPCMBlackBoardJob(configuration));
        this.add(new LoadCorrespondenceModelsIntoBlackBoardJob(configuration));
        this.add(new LoadExperimentScenarioIntoBlackBoardJob(configuration, LoadPCMModelsIntoBlackboardJob.PCM_MODELS_PARTITION_ID));
        this.add(new RegisterOptimisationIntervalListenerJob(configuration));
        this.add(new PCMStartInterpretationJob(configuration));
        
    }
}
