package fix

import eu.cactosfp7.infrastructuremodels.logicaldc.application.WhiteBoxApplicationInstance
import eu.cactosfp7.infrastructuremodels.logicaldc.application.util.NonIdCopier
import eu.cactosfp7.infrastructuremodels.logicaldc.core.LogicalDCModel
import eu.cactosfp7.infrastructuremodels.logicaldc.hypervisor.util.HypervisorResourceFactoryImpl
import eu.cactosfp7.infrastructuremodels.physicaldc.architecturetype.util.ArchitecturetypeResourceFactoryImpl
import eu.cactosfp7.infrastructuremodels.physicaldc.core.util.CoreResourceFactoryImpl
import eu.cactosfp7.infrastructuremodels.physicaldc.power.binding.util.BindingResourceFactoryImpl
import eu.cactosfp7.infrastructuremodels.physicaldc.power.specification.util.SpecificationResourceFactoryImpl
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import eu.cactosfp7.infrastructuremodels.logicaldc.core.impl.CorePackageImpl

class FixStorageAccess {
	def static void main(String[] args) {
		val rs = new ResourceSetImpl
		val m = rs.resourceFactoryRegistry.extensionToFactoryMap
	    
	   	m.put("architecturetype", new ArchitecturetypeResourceFactoryImpl())
	    m.put("hypervisor", new HypervisorResourceFactoryImpl())
	    m.put("pdcbinding", new BindingResourceFactoryImpl())
	    m.put("pdcspec", new SpecificationResourceFactoryImpl())
	    m.put("physical", new CoreResourceFactoryImpl())
	    m.put("logical", new eu.cactosfp7.infrastructuremodels.logicaldc.core.util.CoreResourceFactoryImpl())
	    
	    rs.packageRegistry.put(CorePackageImpl.eNS_URI, CorePackageImpl.eINSTANCE)
	    
	    var res = rs.getResource(URI.createURI("uulm-testbed.logical"), true)
	    
	    res.getContents().filter(LogicalDCModel).forEach[dcModel | {
	    	dcModel.applicationInstances.filter(WhiteBoxApplicationInstance).forEach[appInst | 
	    		appInst.composedVMs.forEach[cvm | 
	    			if (cvm.virtualMachine.VMImageInstance.rootDisk.storageLocation == null) {
	    				val vmCopy = NonIdCopier.nonIdCopy(cvm.virtualMachine.VMImageInstance.rootDisk)
	    				vmCopy.storageLocation = cvm.virtualMachine.hypervisor.rootVolume.storageLocation
	    				cvm.virtualMachine.VMImageInstance.rootDisk = vmCopy	    				
	    				dcModel.volumesAndImages += vmCopy
	    			}
	    		]
	    		
	    	]
	    }]
	    res.save({})
	}	
	
}