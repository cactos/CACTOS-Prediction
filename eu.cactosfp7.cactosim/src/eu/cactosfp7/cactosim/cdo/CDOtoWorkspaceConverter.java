package eu.cactosfp7.cactosim.cdo;

import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import javax.measure.quantity.DataAmount;
import javax.measure.unit.SI;

import org.eclipse.emf.cdo.view.CDOView;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.jscience.physics.amount.Amount;

import eu.cactosfp7.infrastructuremodels.logicaldc.application.ApplicationFactory;
import eu.cactosfp7.infrastructuremodels.logicaldc.application.ApplicationInstance;
import eu.cactosfp7.infrastructuremodels.logicaldc.application.ComposedVM;
import eu.cactosfp7.infrastructuremodels.logicaldc.application.GreyBoxApplicationInstance;
import eu.cactosfp7.infrastructuremodels.logicaldc.application.WhiteBoxApplicationInstance;
import eu.cactosfp7.infrastructuremodels.logicaldc.application.impl.ApplicationPackageImpl;
import eu.cactosfp7.infrastructuremodels.logicaldc.application.util.ApplicationSwitch;
import eu.cactosfp7.infrastructuremodels.logicaldc.application.util.NonIdCopier;
import eu.cactosfp7.infrastructuremodels.logicaldc.core.CoreFactory;
import eu.cactosfp7.infrastructuremodels.logicaldc.core.Hypervisor;
import eu.cactosfp7.infrastructuremodels.logicaldc.core.LogicalDCModel;
import eu.cactosfp7.infrastructuremodels.logicaldc.core.VMImage;
import eu.cactosfp7.infrastructuremodels.logicaldc.core.VMImageInstance;
import eu.cactosfp7.infrastructuremodels.logicaldc.core.VirtualDisk;
import eu.cactosfp7.infrastructuremodels.logicaldc.core.VirtualMachine;
import eu.cactosfp7.infrastructuremodels.physicaldc.core.AbstractNode;
import eu.cactosfp7.infrastructuremodels.physicaldc.core.NetworkAttachedStorage;
import eu.cactosfp7.infrastructuremodels.physicaldc.core.Rack;
import eu.cactosfp7.infrastructuremodels.physicaldc.core.StorageSpecification;
import eu.cactosfp7.infrastructuremodels.physicaldc.core.impl.CorePackageImpl;
import eu.cactosfp7.infrastructuremodels.physicaldc.power.specification.presentation.SpecificationActionBarContributor;

/**
 * Class is called by the eclipse Wizard to connect to the CDO server and
 * serialize models to local files in the eclipse workspace.
 * 
 * @author svorobs2, stier
 *
 */
public class CDOtoWorkspaceConverter {
	private CDOModelsHolder CDOModels = new CDOModelsHolder();
	private String workspaceName;
	private String cdoAddress;
	private String cdoRepoName;
	private String cdoResourceRoot;
	private String cdoUsername;
	private String cdoPassword;

	/**
	 * @param workspaceName
	 *            Name of the eclipse workspace.
	 * @param CDOAddress
	 *            URI of the CDO storage.
	 * @param CDORepoName
	 *            CDO repository name by default "repo1".
	 * @param CDOResourceRoot
	 *            The root folder of the models such as "uulm-testbed".
	 * @throws Exception
	 */
	public CDOtoWorkspaceConverter(String workspaceName, String CDOAddress, String CDORepoName, String CDOResourceRoot,
			String username, String password) throws Exception {
		this.workspaceName = workspaceName;
		this.cdoAddress = CDOAddress;
		this.cdoRepoName = CDORepoName;
		this.cdoResourceRoot = CDOResourceRoot;
		this.cdoUsername = username;
		this.cdoPassword = password;
	}

	/**
	 * Method creates linked list of resources and saves them to the local
	 * eclipse workspace.
	 * @throws IOException 
	 * 
	 */
	public void CDOtoWorkspace() throws IOException {

        // Connecting to CDO repo and getting models
        CDOView roView = CDOSessionControl.getInstance()
                .getSession(cdoAddress, cdoRepoName, cdoUsername, cdoPassword).openView();
        CDOModels.populateCDOModelsHolder(roView, cdoResourceRoot);
	    
		List<Resource> resources = new LinkedList<Resource>();
		resources.add(createWorkspaceResource(CDOModels.get_ARCHITECTURETYPE(),
				workspaceName + "/" + cdoResourceRoot + ".architecturetype"));
		resources.add(createWorkspaceResource(CDOModels.get_HYPERVISOR(),
				workspaceName + "/" + cdoResourceRoot + ".hypervisor"));
		Resource logicalResource = createWorkspaceResource(CDOModels.get_LOGICAL(),
                workspaceName + "/" + cdoResourceRoot + ".logical");
		resources.add(logicalResource);
		resources.add(createWorkspaceResource(CDOModels.get_PHYSICAL(),
				workspaceName + "/" + cdoResourceRoot + ".physical"));

		LogicalDCModel model = (LogicalDCModel) logicalResource.getAllContents().next();
		removeIncompleteVMsAndApplications(model);
		enrichStorageModel(model);
		model.setCyclicOptimizationInterval(Amount.valueOf(60, SI.SECOND));
		
		for (Resource resource : resources) {

			resource.save(null);

		}
		
		roView.close();

		// Other available models in CDO
		// saveCDODCModel( CDOModelContainer.get_LOGICAL_LOAD(),
		// "/"+_WORKSPACENAME+"/"+_CDORESOURCEROOT+"-logicalLoad.core");
		// saveCDODCModel( CDOModelContainer.get_PHYSICAL_LOAD(),
		// "/"+_WORKSPACENAME+"/"+_CDORESOURCEROOT+"-physicalLoad.core");
		// saveCDODCModel( CDOModelContainer.get_PLANS(),
		// "/"+_WORKSPACENAME+"/"+_CDORESOURCEROOT+"-plans.xmi");

	}

    private void enrichStorageModel(LogicalDCModel model) {
        for(Hypervisor curHypervisor : model.getHypervisors()) {
            if(curHypervisor.getRootVolume() == null) {
                VirtualDisk virtualDisk = CoreFactory.INSTANCE.createVirtualDisk();
                virtualDisk.setName("Root Volume of " + curHypervisor.getNode().getName());
                virtualDisk.setCapacity((Amount<DataAmount>) Amount.valueOf(8, SI.GIGA(DataAmount.UNIT.getStandardUnit())));
                model.getVolumesAndImages().add(virtualDisk);
                
                StorageSpecification specification = null;
                if(curHypervisor.getNode().getStorageSpecifications().size() > 0) {
                    specification = curHypervisor.getNode().getStorageSpecifications().get(0);
                } else {
                    for(Rack curRack : curHypervisor.getNode().getRack().getPhysicalDCModel().getRacks()) {
                        AbstractNode node = (AbstractNode) EcoreUtil.getObjectByType(curRack.getNodes(), CorePackageImpl.eINSTANCE.getNetworkAttachedStorage());
                        if(node != null) {
                            specification = node.getStorageSpecifications().get(0);
                            break;
                        }
                    }
                }
                virtualDisk.setStorageLocation(specification);
                curHypervisor.setRootVolume(virtualDisk);
            }
            for(VirtualMachine curVm : curHypervisor.getVirtualMachines()) {
                if(curVm.getVMImageInstance().getRootDisk() == null) {
                    VirtualDisk rootVolumeHypervisor = curHypervisor.getRootVolume();
                    VirtualDisk vmImage = curVm.getRuntimeApplicationModel().getVmImageBehaviour().getVmImage();
                    VirtualDisk nonIdCopy = NonIdCopier.nonIdCopy(vmImage);
                    nonIdCopy.setName(vmImage.getName());
                    nonIdCopy.setStorageLocation(rootVolumeHypervisor.getStorageLocation());
                    model.getVolumesAndImages().add(nonIdCopy);
                    curVm.getVMImageInstance().setRootDisk(nonIdCopy);
                } else if (curVm.getVMImageInstance().getRootDisk().getStorageLocation() == null) {
                    VMImageInstance vmImageInstance = curVm.getVMImageInstance();
                    VirtualDisk rootDisk = vmImageInstance.getRootDisk();
                    VMImage overlayedImage = null;
                    Collection<VMImage> images = EcoreUtil.<VMImage>getObjectsByType(curHypervisor.getLogicalDCModel().getVolumesAndImages(), eu.cactosfp7.infrastructuremodels.logicaldc.core.impl.CorePackageImpl.eINSTANCE.getVMImage());
                    for(VMImage image : images) {
                        if(image.getName().equals(rootDisk.getName()) && image.getStorageLocation() != null && image.getStorageLocation().equals(curHypervisor.getRootVolume().getStorageLocation())) {
                            vmImageInstance.setRootDisk(image);
                            overlayedImage = image;
                            break;
                        }
                    }
                    if(overlayedImage == null && rootDisk instanceof VMImage) {
                        overlayedImage = NonIdCopier.<VMImage>nonIdCopy((VMImage) rootDisk);
                        overlayedImage.setStorageLocation(curHypervisor.getRootVolume().getStorageLocation());
                        curHypervisor.getLogicalDCModel().getVolumesAndImages().add(overlayedImage);
                    }

                    VirtualDisk overlay = CoreFactory.INSTANCE.createVirtualDisk();
                    curHypervisor.getLogicalDCModel().getVolumesAndImages().add(overlay);
                    vmImageInstance.setRootDisk(overlay);
                    overlayedImage.getDeltaOverlay().add(overlay);
                    overlay.setStorageLocation(curHypervisor.getRootVolume().getStorageLocation());
                }
            }
        }
    }

    private void removeIncompleteVMsAndApplications(LogicalDCModel model) {
        for(Hypervisor curHypervisor : model.getHypervisors()) {
		    Iterator<VirtualMachine> iterator = curHypervisor.getVirtualMachines().iterator();
		    while(iterator.hasNext()) {
		        VirtualMachine curVm = iterator.next();
		        if(curVm.getRuntimeApplicationModel() == null) {
		            iterator.remove();
		        }
		    }
		}
		Iterator<ApplicationInstance> iterator = model.getApplicationInstances().iterator();
		while(iterator.hasNext()) {
		    ApplicationInstance curInstance = iterator.next();
		    new ApplicationSwitch<Void>() {
		        public Void caseWhiteBoxApplicationInstance(WhiteBoxApplicationInstance instance) {		            
		            boolean remove = false;
		            for(ComposedVM curComposedVm : instance.getComposedVMs()) {
		                if(curComposedVm.getVirtualMachine() == null) {
		                    remove = true;
		                    break;
		                }
		            }
		            if(remove) {
		                iterator.remove();
		            }
		            return null;
		        };
		        public Void caseGreyBoxApplicationInstance(GreyBoxApplicationInstance instance) {
		            if(instance.getVirtualMachine() == null) {
		                iterator.remove();
		            }
		            return null;
		        };
		    }.doSwitch(curInstance);
		}
    }

	/**
	 * Creating resource by combining EObject CDO models and local path leading
	 * to eclipse workspace.
	 * 
	 * @param modelRoots
	 *            Models retrieved from the CDO store.
	 * @param filePath
	 *            URI where file representing model will be stored locally in
	 *            the workspace.
	 * @return resource gives back resource ready for saving.
	 */
	public static Resource createWorkspaceResource(Collection<EObject> modelRoots, String filePath) {
		// Target Resource
		ResourceSet resourceSet = new ResourceSetImpl();

		/**
		 * The original XMI type was changed to "null" as it adds conflicting
		 * XMI version attribute to the file Original:
		 * resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().
		 * put(Resource.Factory.Registry.DEFAULT_EXTENSION,new
		 * XMIResourceFactoryImpl());
		 */

		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());

		URI architecturetypeURI = URI.createURI("platform:/resource/" + filePath);
		Resource resource = resourceSet.createResource(architecturetypeURI);

		resource.getContents().addAll(modelRoots);
		return resource;
	}
}