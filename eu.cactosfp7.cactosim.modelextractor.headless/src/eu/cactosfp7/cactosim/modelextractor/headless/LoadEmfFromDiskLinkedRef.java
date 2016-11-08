package eu.cactosfp7.cactosim.modelextractor.headless;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;

import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

import eu.cactosfp7.infrastructuremodels.logicaldc.core.LogicalDCModel;

public class LoadEmfFromDiskLinkedRef {
	
	public EObject loadData(String fileName) throws FileNotFoundException, IOException {
		
		
		File source = new File(fileName);
		
        ResourceSet resourceSet = new ResourceSetImpl();
        Resource logicalDCResource = resourceSet.createResource(URI.createFileURI(source.getAbsolutePath()));
        logicalDCResource.load(Collections.EMPTY_MAP);
        EObject model =  logicalDCResource.getContents().get(0);
		

		return model;
	}
	
	public EObject createData(String fileName, EObject model){
		
		File source = new File(fileName);
		
        URI fileURI = URI.createFileURI(source.getAbsolutePath());
		
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.getResource(fileURI, true);
		resource.getContents().add(model);

		
		//EcoreUtil.resolveAll(resource);

		//TreeIterator<EObject> aa = r.getAllContents();
		TreeIterator<EObject> bb = resource.getAllContents();
		return model;
	}

}
