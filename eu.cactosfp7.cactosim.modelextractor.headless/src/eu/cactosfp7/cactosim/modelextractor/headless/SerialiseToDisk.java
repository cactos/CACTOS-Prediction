package eu.cactosfp7.cactosim.modelextractor.headless;

import java.io.IOException;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class SerialiseToDisk {

	
	public static void serialise(List<Resource> resources) {

		for (Resource resource : resources) {
			try {
				resource.save(null);
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public static Resource createResource(Collection<EObject> model, String filePath) {

		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put(Resource.Factory.Registry.DEFAULT_EXTENSION,  new XMIResourceFactoryImpl());// new
																		// XMIResourceFactoryImpl()

		URI architecturetypeURI = URI.createURI(filePath);
		Resource resource = resourceSet.createResource(architecturetypeURI);

		resource.getContents().addAll(model);// longest
		return resource;

	}
}
