import java.io.IOException;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import eu.cactosfp7.cactosim.experimentscenario.util.ExperimentscenarioResourceFactoryImpl;
import eu.cactosfp7.infrastructuremodels.logicaldc.hypervisor.util.HypervisorResourceFactoryImpl;
import eu.cactosfp7.infrastructuremodels.physicaldc.architecturetype.util.ArchitecturetypeResourceFactoryImpl;
import eu.cactosfp7.infrastructuremodels.physicaldc.core.util.CoreResourceFactoryImpl;
import eu.cactosfp7.infrastructuremodels.physicaldc.power.binding.util.BindingResourceFactoryImpl;
import eu.cactosfp7.infrastructuremodels.physicaldc.power.specification.util.SpecificationResourceFactoryImpl;

/**Generates a new demonstration model based on a Xtend specification.
 * @author hgroenda
 *
 */
public class GenerateBlackBoxDemoModel {
	/** Logger for this class. */
	private static final Logger logger = Logger.getLogger(GenerateBlackBoxDemoModel.class.getCanonicalName());

	/**Creates model files in the project root directory.
	 * @param args Not used.
	 */
	public static void main(String[] args) {
		// Register EMF factories
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
	    Map<String, Object> m = reg.getExtensionToFactoryMap();
	    m.put("architecturetype", new ArchitecturetypeResourceFactoryImpl());
	    m.put("hypervisor", new HypervisorResourceFactoryImpl());
	    m.put("pdcbinding", new BindingResourceFactoryImpl());
	    m.put("pdcspec", new SpecificationResourceFactoryImpl());
	    m.put("physical", new CoreResourceFactoryImpl());
	    m.put("logical", new eu.cactosfp7.infrastructuremodels.logicaldc.core.util.CoreResourceFactoryImpl());
	    m.put("experimentscenario", new ExperimentscenarioResourceFactoryImpl());

		ResourceSet resourceSet = new ResourceSetImpl();
	    Resource resource;
		final String modelName = "demoModel";

		// Create the model
		BlackBoxDemoModel demoModel = new BlackBoxDemoModel();
		// Architecture Type
		resource = resourceSet.createResource(URI.createURI(modelName + ".architecturetype"));
		resource.getContents().add(demoModel.architectureRepo);
		// Hypervisor
		resource = resourceSet.createResource(URI.createURI(modelName + ".hypervisor"));
		resource.getContents().add(demoModel.hypervisorRepository);
		// PDC Binding
		resource = resourceSet.createResource(URI.createURI(modelName + ".pdcbinding"));
		resource.getContents().add(demoModel.pdcBindingRepo);
		// PDC Spec
		resource = resourceSet.createResource(URI.createURI(modelName + ".pdcspec"));
		resource.getContents().add(demoModel.pdcSpecRepo);
		// Physical DC Model
		resource = resourceSet.createResource(URI.createURI(modelName + ".physical"));
		resource.getContents().add(demoModel.physicalDcModel);
		// Logical DC Model
		resource = resourceSet.createResource(URI.createURI(modelName + ".logical"));
		resource.getContents().add(demoModel.logicalDcModel);
		// Experiment Scenario Model
		resource = resourceSet.createResource(URI.createURI(modelName + ".experimentscenario"));
		resource.getContents().add(demoModel.experimentScenarioModel);
		
		// save
		for (Resource res : resourceSet.getResources()) {
			try {
				res.save(null);
			} catch (IOException e) {
				logger.log(Level.SEVERE,"Could not store resource. ", e);
			}
		}
		logger.info("Models created successfully.");
	}

}
