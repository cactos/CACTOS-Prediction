package eu.cactosfp7.cactosim.modelextractor.headless;

import java.util.Collection;
import java.util.LinkedList;

import org.eclipse.emf.cdo.view.CDOView;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;

import eu.cactosfp7.infrastructuremodels.logicaldc.core.LogicalDCModel;
import eu.cactosfp7.infrastructuremodels.logicaldc.hypervisor.HypervisorRepository;
import eu.cactosfp7.infrastructuremodels.physicaldc.architecturetype.ArchitectureTypeRepository;
import eu.cactosfp7.infrastructuremodels.physicaldc.core.PhysicalDCModel;

/**
 * Setters and getters Class that stores the models retrieved from the CDO 
 * 
 * @author svorobs2
 *
 */
public class CDOModelsHolder {
	

	Collection<EObject> ARCHITECTURETYPE;// =  (Collection<EObject>) ArchitecturetypeFactoryImpl.INSTANCE.createArchitectureType();
	Collection<EObject> HYPERVISOR;// = HypervisorFactory.INSTANCE.createHypervisorType();
	Collection<EObject> LOGICAL_LOAD;// = LogicalFactory.INSTANCE.createLogicalLoadModel();
	Collection<EObject> PHYSICAL;// = CoreFactory.INSTANCE.createPhysicalDCModel();
	Collection<EObject> LOGICAL;// = eu.cactosfp7.infrastructuremodels.logicaldc.core.CoreFactory.INSTANCE.createLogicalDCModel();
	Collection<EObject> PHYSICAL_LOAD;// = PhysicalFactory.INSTANCE.createPhysicalLoadModel();
	Collection<EObject> PLANS;// = OptimisationplanFactory.eINSTANCE.createOptimisationPlan();
	
	
	/**
	 * @return the ARCHITECTURETYPE
	 */
	public Collection<EObject> get_ARCHITECTURETYPE() {
		return ARCHITECTURETYPE;
	}
	/**
	 * @param architecturetype the ARCHITECTURETYPE to set
	 */
	public void set_ARCHITECTURETYPE(Collection<EObject> architecturetype) {
		this.ARCHITECTURETYPE = architecturetype;
	}
	/**
	 * @return the HYPERVISOR
	 */
	public Collection<EObject> get_HYPERVISOR() {
		return HYPERVISOR;
	}
	/**
	 * @param HYPERVISOR the HYPERVISOR to set
	 */
	public void set_HYPERVISOR(Collection<EObject> HYPERVISOR) {
		this.HYPERVISOR = HYPERVISOR;
	}
	/**
	 * @return the LOGICAL_LOAD
	 */
	public Collection<EObject> get_LOGICAL_LOAD() {
		return LOGICAL_LOAD;
	}
	/**
	 * @param LOGICAL_LOAD the LOGICAL_LOAD to set
	 */
	public void set_LOGICAL_LOAD(Collection<EObject> LOGICAL_LOAD) {
		this.LOGICAL_LOAD = LOGICAL_LOAD;
	}
	/**
	 * @return the PHYSICAL
	 */
	public Collection<EObject> get_PHYSICAL() {
		return PHYSICAL;
	}
	/**
	 * @param PHYSICAL the PHYSICAL to set
	 */
	public void set_PHYSICAL(Collection<EObject> PHYSICAL) {
		this.PHYSICAL = PHYSICAL;
	}
	/**
	 * @return the LOGICAL
	 */
	public Collection<EObject> get_LOGICAL() {
		return LOGICAL;
	}
	/**
	 * @param LOGICAL the LOGICAL to set
	 */
	public void set_LOGICAL(Collection<EObject> LOGICAL) {
		this.LOGICAL = LOGICAL;
	}
	/**
	 * @return the PHYSICAL_LOAD
	 */
	public Collection<EObject> get_PHYSICAL_LOAD() {
		return PHYSICAL_LOAD;
	}
	/**
	 * @param PHYSICAL_LOAD the PHYSICAL_LOAD to set
	 */
	public void set_PHYSICAL_LOAD(Collection<EObject> PHYSICAL_LOAD) {
		this.PHYSICAL_LOAD = PHYSICAL_LOAD;
	}
	/**
	 * @return the PLANS
	 */
	public Collection<EObject> get_PLANS() {
		return PLANS;
	}
	/**
	 * @param PLANS the PLANS to set
	 */
	public void set_PLANS(Collection<EObject> PLANS) {
		this.PLANS =PLANS;
	}
	
	/**
	 * Automatically populate the collections of model elements using the CDOView and the address to the running CDO server (e.g. localhost).
	 * In other words pull resources from CDO server and serialize them as local EObject collections. 
	 * Note: The order of grouping models via set methods is important to not to break references.
	 * 
	 * @param roView
	 * @param CDOResourceRoot
	 */
	public void populateCDOModelsHolder (CDOView roView, String CDOResourceRoot) {
		
 		Copier copier = new Copier(true, true);
 		
 		Collection<EObject> allElements = new LinkedList<EObject>();
 		allElements.addAll(roView.getResource(CDOResourceRoot+"/architecturetype").getContents());
 		allElements.addAll(roView.getResource(CDOResourceRoot+"/hypervisor").getContents());
 		allElements.addAll(roView.getResource(CDOResourceRoot+"/logical").getContents());
 		allElements.addAll(roView.getResource(CDOResourceRoot+"/physical").getContents());
 		
 		/**
 		 * These models are not currently supported by CactoSim v 1.0
 		 */
 		//allElements.addAll(roView.getResource(CDOResourceRoot+"/plans").getContents());
 		//allElements.addAll(roView.getResource(CDOResourceRoot+"/logical_load").getContents());
 		//allElements.addAll(roView.getResource(CDOResourceRoot+"/physical_load").getContents());
 		
 		allElements = copier.copyAll(allElements);
 		
 		//needed to make references local
 		copier.copyReferences();
 		
 		for (EObject el : allElements) {
 			
 			Collection<EObject> objCollection= new LinkedList<EObject>();
 			
 			if (el instanceof ArchitectureTypeRepository) {
 				objCollection.add(el);
 				this.set_ARCHITECTURETYPE(objCollection);
 			} else if(el instanceof HypervisorRepository) {
 				objCollection.add(el);
 				this.set_HYPERVISOR(objCollection);
 			} else if(el instanceof PhysicalDCModel) {
 				objCollection.add(el);
 				this.set_PHYSICAL(objCollection);
 			} else if(el instanceof LogicalDCModel) {
 				objCollection.add(el);
 				this.set_LOGICAL(objCollection);
 			}
 		}
	

	}
	
	
	
	
}	