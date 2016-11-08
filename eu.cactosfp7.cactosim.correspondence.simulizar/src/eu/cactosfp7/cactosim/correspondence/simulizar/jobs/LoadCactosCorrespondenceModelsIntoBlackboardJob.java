package eu.cactosfp7.cactosim.correspondence.simulizar.jobs;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;

import de.uka.ipd.sdq.workflow.extension.AbstractExtensionJobConfiguration;
import de.uka.ipd.sdq.workflow.extension.AbstractWorkflowExtensionJob;
import de.uka.ipd.sdq.workflow.jobs.CleanupFailedException;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.ResourceSetPartition;
import eu.cactosfp7.cactosim.correspondence.simulizar.jobs.partition.CactosCorrespondenceModelsResourceSetPartition;
import eu.cactosfp7.cactosim.correspondence.simulizar.runconfig.LoadCactosCorrespondenceModelsIntoBlackboardJobConfig;

/**Job for loading correspondence models in the appropriate partition of the blackboard.
 * @author stier, hgroenda
 *
 */
public class LoadCactosCorrespondenceModelsIntoBlackboardJob extends AbstractWorkflowExtensionJob<MDSDBlackboard> {

    /** ID of the partition for CACTOS Correspondence Models in the blackboard. */
	public static final String CACTOS_CORRESPONDENCE_MODELS_PARTITION_ID = "eu.cactosfp7.cactosim.correspondence";

    /** Location of the logical repository of the correlation. */
    private String logicalCorrelationPath;
    /** Location of the physical repository of the correlation. */
    private String physicalCorrelationPath;

    @Override
    public void setJobConfiguration(AbstractExtensionJobConfiguration configuration) {
		if (!(configuration instanceof LoadCactosCorrespondenceModelsIntoBlackboardJobConfig)) {
			throw new IllegalArgumentException("Given configuration must be of type "
					+ LoadCactosCorrespondenceModelsIntoBlackboardJobConfig.class.getCanonicalName());
		}
        LoadCactosCorrespondenceModelsIntoBlackboardJobConfig loadConfig = ((LoadCactosCorrespondenceModelsIntoBlackboardJobConfig) configuration);
        this.logicalCorrelationPath = loadConfig.getLogicalCorrelationPath();
        this.physicalCorrelationPath = loadConfig.getPhysicalCorrelationPath();
        super.setJobConfiguration(configuration);
    }
    
    @Override
    public void setBlackboard(MDSDBlackboard blackboard) throws IllegalArgumentException {
        if(blackboard == null) {
            throw new IllegalArgumentException("Blackboard must not be null.");
        }
        super.setBlackboard(blackboard);
    }
    
    @Override
    public MDSDBlackboard getBlackboard() {
        return this.myBlackboard;
    }
    
    @Override
    public void cleanup(IProgressMonitor monitor) throws CleanupFailedException {
    	// intentionally left blank
    }
    
    @Override
    public void execute(IProgressMonitor monitor) {
        if(this.myBlackboard == null) {
            throw new IllegalStateException("Blackboard hadn't been initialized.");
        }
        CactosCorrespondenceModelsResourceSetPartition partition = new CactosCorrespondenceModelsResourceSetPartition();
        if(!(this.logicalCorrelationPath.equals("") || this.physicalCorrelationPath.equals(""))) {
            loadModel(partition, this.logicalCorrelationPath);
            loadModel(partition, this.physicalCorrelationPath);
        }
        this.myBlackboard.addPartition(CACTOS_CORRESPONDENCE_MODELS_PARTITION_ID, partition);
        partition.resolveAllProxies();
    }

    private static void loadModel(ResourceSetPartition partition, String path) {
        partition.loadModel(URI.createURI(!path.startsWith("platform:") ? "file:///" + path : path));
    }
}
