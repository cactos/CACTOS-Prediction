package eu.cactosfp7.cactosim.placementconnector;
import java.util.List;
import java.util.Objects;
import java.util.logging.Logger;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.palladiosimulator.simulizar.action.context.ExecutionContext;

import eu.cactosfp7.cactoopt.placementservice.InitialPlacementAlgorithm;
import eu.cactosfp7.cactoopt.placementservice.impl.AbstractPlacementService;
import eu.cactosfp7.cactoopt.placementservice.registry.PlacementSettings;
import eu.cactosfp7.cactosim.experimentscenario.EPlacementCompatibilityMode;
import eu.cactosfp7.cactosim.optimisationconnector.SimulationStateLibrary;
import eu.cactosfp7.infrastructuremodels.load.logical.LogicalLoadModel;
import eu.cactosfp7.infrastructuremodels.load.physical.PhysicalLoadModel;
import eu.cactosfp7.infrastructuremodels.logicaldc.core.LogicalDCModel;
import eu.cactosfp7.infrastructuremodels.logicaldc.core.VirtualMachine;
import eu.cactosfp7.infrastructuremodels.physicaldc.core.PhysicalDCModel;
import eu.cactosfp7.optimisationplan.ExecutionStatus;
import eu.cactosfp7.optimisationplan.OptimisationPlan;
import eu.cactosfp7.optimisationplan.OptimisationPlanRepository;
import eu.cactosfp7.optimisationplan.OptimisationStep;
import eu.cactosfp7.optimisationplan.OptimisationplanPackage;
import eu.cactosfp7.optimisationplan.SequentialSteps;
import eu.cactosfp7.optimisationplan.VmPlacementAction;

/**Black-box Library implementation for QVTo allowing to access the Placementservice of CACTOS. 
 * @author krach
 *
 */
public class PlacementConnector {
    private static final Logger LOGGER = Logger.getLogger(PlacementConnector.class.getName());
    
    private static final URI PLACEMENT_PLAN_RESOURCE = URI.createURI("platform:/resource/org.palladiosimulator.temporary/cactosmodels/placement.optimisationplan");
	private static final int MAX_RETRY_COUNT = 10;
	private static final double RETRY_INTERVAL = 10.0;
	
	//Package visibility intended
	static EPlacementCompatibilityMode compatibilityMode = EPlacementCompatibilityMode.SIMPLE_PLACEMENT;
    
/**Requests the placement service to determine the optimal 
 * locations for the passed unallocated vms.
 * 
 * @param pdcm the physical data centre model.
 * @param ldcm the logical data centre model.
 * @param plm the physical load model.
 * @param llm the logical load model.
 * @param VM the list of virtual machines to place
 * @return Optimisation Plan containing the placement recommendations.
 */
public static OptimisationPlan determinePlacement(PhysicalDCModel pdcm, 
										   LogicalDCModel ldcm, 
										   PhysicalLoadModel plm, 
										   LogicalLoadModel llm, 
										   List<VirtualMachine> vmsToPlace, 
										   ExecutionContext context) {
        AbstractPlacementService placementService = (AbstractPlacementService) PlacementSettings.SELECTED_PLACEMENT;
        
        LOGGER.info(String.format("Placement algorithm called at simulation time: %1$.3f", SimulationStateLibrary.getSimulationTime()));
        
        InitialPlacementAlgorithm placementAlgorithm = placementService.getPlacementAlgorithm();
        Objects.requireNonNull(placementAlgorithm);
        
        ResourceSet resourceSet = pdcm.eResource().getResourceSet();
        Resource optResource = resourceSet.getResource(PLACEMENT_PLAN_RESOURCE, false);
        if(optResource == null) {
            optResource = resourceSet.createResource(PLACEMENT_PLAN_RESOURCE);
        }
        
        // Check if optimisation plans are currently executing
        int retryCount = 1;
        
        if (EPlacementCompatibilityMode.REPETITIVE_RETRY.equals(compatibilityMode)) {
	        while (containsOptimisationPlanInExecution(resourceSet) && (retryCount++ < MAX_RETRY_COUNT)) {
	        	LOGGER.info(String.format("Placement currently not possible (Optimisation running in parallel); will retry in %1$.1f seconds", 
	        			RETRY_INTERVAL)); 
	        	SimulationStateLibrary.pauseExecutionForAmountOfSimulationTime(context, RETRY_INTERVAL);
	        }
        }
        
        OptimisationPlan optimisationPlan = null;
        
        if (!(retryCount >= MAX_RETRY_COUNT)) {
        	optimisationPlan = placementAlgorithm.generateOptimizationPlan(pdcm, ldcm, plm, llm, vmsToPlace);
            
            //optResource.getContents().removeAll(optResource.getContents());
            if (optimisationPlan != null) {
                optResource.getContents().add(optimisationPlan);
                EcoreUtil.resolveAll(optimisationPlan);
            } else {
            	LOGGER.warning(String.format("Placement algorithm was not able to determine a suitable placement", retryCount));
            }
        } else {
        	LOGGER.warning(String.format("Placement ultimately failed after %d retries", retryCount));
        }
        
        if (optimisationPlan != null &&
        		OptimisationplanPackage.eINSTANCE.getSequentialSteps().isInstance(optimisationPlan.getOptimisationStep())) {
        	SequentialSteps steps = (SequentialSteps) optimisationPlan.getOptimisationStep();
        	if (steps.getOptimisationSteps().size() == 1) {
        		OptimisationStep step = steps.getOptimisationSteps().get(0);
        		if (OptimisationplanPackage.eINSTANCE.getVmPlacementAction().isInstance(step)) {
        			VmPlacementAction action = (VmPlacementAction) step;
        			LOGGER.info(String.format("Placement Service suggested to place [%s] on [%s]", action.getUnassignedVirtualMachine().getId(), action.getTargetHost().getNode().getId()));
        		} else {
        			LOGGER.warning("The Placement Service returned an incompatible optimisation action. Only VmPlacementAction is currently supported.");
        		}
        	} else if (steps.getOptimisationSteps().size() > 1) {
        		LOGGER.warning("The placement algorithm determined multiple placements at once which is currently not supported by the Runtime Management. Therefore, simulation results may be wrong");
        	} else {
        		LOGGER.warning("Placement algorithm was not able to determine a suitable placement");
        	}
        }
        return optimisationPlan;
    }
	
	private static boolean containsOptimisationPlanInExecution(ResourceSet resourceSet) {
		return resourceSet.getResources().stream().flatMap(r -> r.getContents().stream())
	        	.filter(OptimisationplanPackage.eINSTANCE.getOptimisationPlanRepository()::isInstance)
	        	.map(OptimisationPlanRepository.class::cast)
	        	.flatMap(repo -> repo.getOptimisationPlans().stream())
	        	.filter(plan -> ExecutionStatus.IN_EXECUTION.equals(plan.getExecutionStatus()))
	        	.findAny().isPresent();
	}
}
