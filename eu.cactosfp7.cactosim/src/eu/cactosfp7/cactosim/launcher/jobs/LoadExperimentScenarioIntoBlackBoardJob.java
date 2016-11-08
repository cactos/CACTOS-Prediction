package eu.cactosfp7.cactosim.launcher.jobs;

import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.palladiosimulator.pcm.repository.BasicComponent;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.repository.RepositoryPackage;
import org.palladiosimulator.pcm.repository.util.RepositorySwitch;
import org.palladiosimulator.pcm.resourcetype.ProcessingResourceType;
import org.palladiosimulator.pcm.seff.InternalAction;
import org.palladiosimulator.pcm.seff.ResourceDemandingSEFF;
import org.palladiosimulator.pcm.seff.seff_performance.ParametricResourceDemand;
import org.palladiosimulator.pcm.seff.util.SeffSwitch;

import de.uka.ipd.sdq.workflow.jobs.IBlackboardInteractingJob;
import de.uka.ipd.sdq.workflow.jobs.JobFailedException;
import de.uka.ipd.sdq.workflow.jobs.SequentialBlackboardInteractingJob;
import de.uka.ipd.sdq.workflow.jobs.UserCanceledException;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.ResourceSetPartition;
import eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalCorrespondenceRepository;
import eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalcorrespondencePackage;
import eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.ProcessingUnitSpecificationCorrespondence;
import eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.util.PhysicalcorrespondenceSwitch;
import eu.cactosfp7.cactosim.experimentscenario.ExperimentscenarioFactory;
import eu.cactosfp7.cactosim.launcher.CactoSimConstants;
import eu.cactosfp7.cactosim.launcher.CactoSimWorkflowConfiguration;

public class LoadExperimentScenarioIntoBlackBoardJob extends SequentialBlackboardInteractingJob<MDSDBlackboard> implements
IBlackboardInteractingJob<MDSDBlackboard> {
    private static final String PCM_RESOURCE_TYPE_CPU_ID = "_oro4gG3fEdy4YaaT-RYrLQ";
    private static final Predicate<? super ParametricResourceDemand> FILTER_CPU_RESOURCE_DEMAND = 
            (t) -> t.getRequiredResource_ParametricResourceDemand().getId().equals(PCM_RESOURCE_TYPE_CPU_ID);

    private static final RepositorySwitch<Collection<ParametricResourceDemand>> RETRIEVE_PARAMETRIC_RESOURCE_DEMANDS = new RepositorySwitch<Collection<ParametricResourceDemand>>() {
        public Collection<ParametricResourceDemand> caseRepository(Repository object) {
            return object.getComponents__Repository().stream()
                .map(this::doSwitch).flatMap(Collection::stream).collect(Collectors.toSet());
        };
        
        public java.util.Collection<ParametricResourceDemand> caseBasicComponent(BasicComponent object) {
            return object.getServiceEffectSpecifications__BasicComponent().stream()
                .map(RETRIEVE_PARAMETRIC_RESOURCE_DEMAND_FROM_SEFF::doSwitch).flatMap(Collection::stream).collect(Collectors.toList());
        };
        
        public java.util.Collection<ParametricResourceDemand> defaultCase(EObject object) {
            return Collections.emptySet();
        };
    };
    
    private static final SeffSwitch<Collection<ParametricResourceDemand>> RETRIEVE_PARAMETRIC_RESOURCE_DEMAND_FROM_SEFF = new SeffSwitch<Collection<ParametricResourceDemand>>() {
        public java.util.Collection<ParametricResourceDemand> caseResourceDemandingSEFF(ResourceDemandingSEFF object) {
            return object.getSteps_Behaviour().stream()
                    .map(this::doSwitch).flatMap(Collection::stream).collect(Collectors.toSet());
        };
        
        public java.util.Collection<ParametricResourceDemand> caseInternalAction(InternalAction object) {
            return object.getResourceDemand_Action();
        };
        
        public java.util.Collection<ParametricResourceDemand> defaultCase(org.eclipse.emf.ecore.EObject object) {
            return Collections.emptySet();
        };
    };

    private final CactoSimWorkflowConfiguration configuration;
	private final String partitionID;

    public LoadExperimentScenarioIntoBlackBoardJob(final CactoSimWorkflowConfiguration configuration, final String partitionID) {
        this.configuration = configuration;
        this.partitionID = partitionID;
    }
    
    @Override
    public void execute(IProgressMonitor monitor) throws JobFailedException, UserCanceledException {
        ResourceSetPartition pcmPartition = this.getBlackboard().getPartition(partitionID);
           
        if (this.configuration.getCactosESMFile() != null && !this.configuration.getCactosESMFile().trim().isEmpty()) {
            pcmPartition.loadModel(URI.createURI(this.configuration.getCactosESMFile()));
        } else {
            Resource r = pcmPartition.getResourceSet().createResource(URI.createURI(
        	    getBasePath() + "/timeline.experimentscenario"));
            r.getContents().add(ExperimentscenarioFactory.eINSTANCE.createExperimentScenarioTimeLine());
        }
        
        pcmPartition.loadModel(URI.createURI(CactoSimConstants.CACTOS_EXPERIMENT_SCENARIO_ACTION_REPOSITORY_PATH));
        pcmPartition.loadModel(URI.createURI(CactoSimConstants.CACTOS_OPTIMISATION_PLAN_ACTION_REPOSITORY_PATH));
            
        pcmPartition.resolveAllProxies();
        
        getCactosProcessingResourceType(pcmPartition).ifPresent(type -> {            
            pcmPartition.getElement(RepositoryPackage.eINSTANCE.getRepository()).stream()
                .filter(x -> true)
                .map(RETRIEVE_PARAMETRIC_RESOURCE_DEMANDS::doSwitch).flatMap(Collection::stream)
                .filter(FILTER_CPU_RESOURCE_DEMAND)
                .forEach(prt -> prt.setRequiredResource_ParametricResourceDemand(type));
        });
    }
    
    private Optional<ProcessingResourceType> getCactosProcessingResourceType(ResourceSetPartition pcmPartition) {
    	if (!pcmPartition.hasElement(PhysicalcorrespondencePackage.eINSTANCE.getPhysicalCorrespondenceRepository()))
    		return Optional.empty();
    	
        return pcmPartition.getElement(PhysicalcorrespondencePackage.eINSTANCE.getPhysicalCorrespondenceRepository()).stream()
                .map(new PhysicalcorrespondenceSwitch<Optional<ProcessingResourceType>>() {
                    public Optional<ProcessingResourceType> casePhysicalCorrespondenceRepository(PhysicalCorrespondenceRepository object) {
                        return object.getProcessingUnitSpecificationCorrespondences().stream()
                                .map(this::doSwitch).filter(Optional::isPresent).map(Optional::get).findAny();
                    };
                    
                    public Optional<ProcessingResourceType> caseProcessingUnitSpecificationCorrespondence(ProcessingUnitSpecificationCorrespondence object) {
                        return Optional.of(object.getPalladio().getActiveResourceType_ActiveResourceSpecification());
                    };
                }::doSwitch).filter(Optional::isPresent).map(Optional::get).findAny();
    }
    
    private String getBasePath() {
        String basePath = "platform:/resource/" + this.configuration.getStoragePluginID() + "/cactosmodels";
        return basePath;
    }

}
