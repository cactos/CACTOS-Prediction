package eu.cactosfp7.cactosim.correspondence.simulizar.runconfig;

import de.uka.ipd.sdq.workflow.extension.AbstractExtensionJobConfiguration;
import eu.cactosfp7.cactosim.correspondence.simulizar.jobs.LoadCactosCorrespondenceModelsIntoBlackboardJob;

/**Configuration storing all information to load the correspondence models in the {@link LoadCactosCorrespondenceModelsIntoBlackboardJob}.
 * @author hgroenda, stier
 *
 */
public class LoadCactosCorrespondenceModelsIntoBlackboardJobConfig extends AbstractExtensionJobConfiguration  {

    /** Location of the logical repository of the correlation. */
    private String logicalCorrelationPath;
    /** Location of the physical repository of the correlation. */
    private String physicalCorrelationPath;

    public LoadCactosCorrespondenceModelsIntoBlackboardJobConfig(String logicalCorrelationPath, String physicalCorrelationPath) {
    	this.logicalCorrelationPath = logicalCorrelationPath;
    	this.physicalCorrelationPath = physicalCorrelationPath;
    }
    
    @Override
    public String getErrorMessage() {
        return "Invalid CACTOS Correspondence Models configuration.";
    }

    @Override
    public void setDefaults() {
    	this.logicalCorrelationPath = "";
    	this.physicalCorrelationPath = "";
    }

	/**
	 * @return Path to the logical correlation repository.
	 */
	public String getLogicalCorrelationPath() {
		return logicalCorrelationPath;
	}

	/**
	 * @return Path to the physical correlation repository.
	 */
	public String getPhysicalCorrelationPath() {
		return physicalCorrelationPath;
	}

    
}
