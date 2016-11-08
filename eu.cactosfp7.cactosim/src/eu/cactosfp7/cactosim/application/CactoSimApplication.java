package eu.cactosfp7.cactosim.application;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.filesystem.URIUtil;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.palladiosimulator.analyzer.workflow.ConstantsContainer;
import org.palladiosimulator.edp2.batchexport.BatchExporter;
import org.palladiosimulator.edp2.impl.RepositoryManager;
import org.palladiosimulator.edp2.models.Repository.Repository;
import org.palladiosimulator.edp2.repository.local.LocalDirectoryRepositoryHelper;
import org.palladiosimulator.recorderframework.edp2.config.EDP2RecorderConfigurationFactory;

import de.uka.ipd.sdq.simucomframework.SimuComConfig;
import de.uka.ipd.sdq.workflow.BlackboardBasedWorkflow;
import de.uka.ipd.sdq.workflow.jobs.JobFailedException;
import de.uka.ipd.sdq.workflow.jobs.SequentialBlackboardInteractingJob;
import de.uka.ipd.sdq.workflow.jobs.UserCanceledException;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;
import eu.cactosfp7.cactosim.experimentscenario.ExperimentScenarioTimeLine;
import eu.cactosfp7.cactosim.launcher.CactoSimWorkflowConfiguration;
import eu.cactosfp7.cactosim.launcher.jobs.CactoSimRootCompositeJob;
import eu.cactosfp7.infrastructuremodels.logicaldc.core.LogicalDCModel;

public class CactoSimApplication implements IApplication {

    @Override
    public Object start(IApplicationContext context) throws Exception {
        final String[] args = (String[]) context.getArguments().get("application.args");
        // check arguments
        if (args.length < 1) {
            System.out.println("The mandatory parameters have not been specified.");
            return IApplication.EXIT_OK;
        }
        
        // Get location of Logical DC Model
        String ldcAbsolutePath = URIUtil.toURI(args[0]).toString();
        
        // Get duration of simulation    
        String simulationDurationString = args[1];    
        
        // Load Logical DC Model
        //final LogicalDCModel model = getLDCModel(ldcLocation);
        
        ExperimentScenarioTimeLine timeLine = null;
        
        Map<String, Object> attributes = createSimulationProperties();
        CactoSimWorkflowConfiguration config = new CactoSimWorkflowConfiguration(attributes);
        
        config.setSimulateFailures(false);
        config.setCactosPDCFile(ldcAbsolutePath);
        
        // temporary data location
        config.setStoragePluginID(ConstantsContainer.DEFAULT_TEMPORARY_DATA_LOCATION);
        config.setDeleteTemporaryDataAfterAnalysis(true);
        
        final File file = new File(new Path(args[2]).toOSString());
        final String repositoryID = URI.createFileURI(file.getAbsolutePath()).toString();
        final Repository ldRepository = RepositoryManager
                .getRepositoryFromUUID(repositoryID);

        Repository repository;
        if (ldRepository == null) {
            // create LocalDirectory Repository
            repository = LocalDirectoryRepositoryHelper.initializeLocalDirectoryRepository(file);        
            RepositoryManager.getCentralRepository().getAvailableRepositories().add(repository);
        } else {
            // found existing LocalDirectory Repository
            repository = ldRepository;
        } 
        attributes.put(EDP2RecorderConfigurationFactory.REPOSITORY_ID, repository.getId());
        
        // Set simulation time
        config.getAttributes().put(SimuComConfig.SIMULATION_TIME, simulationDurationString);
        
        // Initialize SimuCom config.
        SimuComConfig simuComConfig = new SimuComConfig(config.getAttributes(), config.isDebug());
        config.setSimuComConfiguration(simuComConfig);
        
        // Get location of Experiment Scenario if set
        if(args.length > 3) {
            config.setCactosESMFile(URIUtil.toURI(args[3]).toString());
        }
        
        // run experiments via blackboard-based workflow
        CactoSimRootCompositeJob cactoSimRootCompositeJob = new CactoSimRootCompositeJob(config, true);
        cactoSimRootCompositeJob.add(new SequentialBlackboardInteractingJob<MDSDBlackboard>() {
            @Override
            public void execute(IProgressMonitor monitor) throws JobFailedException, UserCanceledException {
                BatchExporter.batchExport(repository, file.getAbsolutePath());
            }
        });
        final MDSDBlackboard blackboard = new MDSDBlackboard();
        final BlackboardBasedWorkflow<MDSDBlackboard> workflow = new BlackboardBasedWorkflow<MDSDBlackboard>(
                cactoSimRootCompositeJob, blackboard);
        workflow.run();
        
        return IApplication.EXIT_OK;
    }

    private ExperimentScenarioTimeLine getExperimentScenarioModel(Path experimentScenarioLocation) {
        final Resource r = getResourceFromPath(experimentScenarioLocation);
        ExperimentScenarioTimeLine timeLine = (ExperimentScenarioTimeLine) r.getContents().get(0);
        return timeLine;
    }

    private static LogicalDCModel getLDCModel(Path ldcLocation) {
        final Resource r = getResourceFromPath(ldcLocation);
        final LogicalDCModel ldcModel = (LogicalDCModel) r.getContents().get(0);
        return ldcModel;        
    }

    private static Resource getResourceFromPath(Path ldcLocation) {
        final ResourceSet resourceSet = new ResourceSetImpl();
        URI fileURI = URI.createFileURI(ldcLocation.toOSString());
        final Resource r = resourceSet.getResource(fileURI, true);
        return r;
    }
    
    private Map<String, Object> createSimulationProperties() {
        final Map<String, Object> properties = new HashMap<String, Object>();

        properties.put(SimuComConfig.SIMULATE_FAILURES, false);
        properties.put(SimuComConfig.SIMULATE_LINKING_RESOURCES, false);
        properties.put(SimuComConfig.USE_FIXED_SEED, false);
        properties.put(SimuComConfig.PERSISTENCE_RECORDER_NAME,
                org.palladiosimulator.recorderframework.edp2.Activator.EDP2_ID);
        properties.put(SimuComConfig.SIMULATOR_ID, "de.uka.ipd.sdq.codegen.simucontroller.simulizar");
        properties.put(SimuComConfig.EXPERIMENT_RUN, SimuComConfig.DEFAULT_EXPERIMENT_RUN);
        properties.put(SimuComConfig.MAXIMUM_MEASUREMENT_COUNT, "-1");
        properties.put(SimuComConfig.VERBOSE_LOGGING, false);
        properties.put(SimuComConfig.VARIATION_ID, SimuComConfig.DEFAULT_VARIATION_NAME);
        properties.put("de.uka.ipd.sdq.workflowengine.debuglevel", "2");

        return properties;
    }

    @Override
    public void stop() {
        // TODO Auto-generated method stub

    }

}
