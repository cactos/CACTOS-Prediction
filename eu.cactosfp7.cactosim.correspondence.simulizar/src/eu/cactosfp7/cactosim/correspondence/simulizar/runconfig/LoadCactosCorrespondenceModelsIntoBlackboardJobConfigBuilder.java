package eu.cactosfp7.cactosim.correspondence.simulizar.runconfig;

import java.util.Map;

import de.uka.ipd.sdq.workflow.extension.AbstractExtensionJobConfiguration;
import de.uka.ipd.sdq.workflow.extension.AbstractWorkflowExtensionConfigurationBuilder;
import eu.cactosfp7.cactosim.correspondence.simulizar.ui.configuration.CorrespondenceLogicalRepositoryFileInputConfigBuilder;
import eu.cactosfp7.cactosim.correspondence.simulizar.ui.configuration.CorrespondencePhysicalRepositoryFileInputConfigBuilder;

/**Configuration builder for the job loading the correspondence models.
 * @author hgroenda
 *
 */
public class LoadCactosCorrespondenceModelsIntoBlackboardJobConfigBuilder extends AbstractWorkflowExtensionConfigurationBuilder {

    @Override
    public AbstractExtensionJobConfiguration buildConfiguration(Map<String, Object> properties) {
        if(properties == null 
                || !properties.containsKey(CorrespondenceLogicalRepositoryFileInputConfigBuilder.CORRESPONDENCE_LOGICAL_REPOSITORY_FILE)
                || !properties.containsKey(CorrespondencePhysicalRepositoryFileInputConfigBuilder.CORRESPONDENCE_PHYSICAL_REPOSITORY_FILE)) {
            throw new IllegalArgumentException("Not all necessary CACTOS Correspondence Model file paths had been initialised.");
        }
		return new LoadCactosCorrespondenceModelsIntoBlackboardJobConfig(
				String.valueOf(properties.get(CorrespondenceLogicalRepositoryFileInputConfigBuilder.CORRESPONDENCE_LOGICAL_REPOSITORY_FILE)),
				String.valueOf(properties.get(CorrespondencePhysicalRepositoryFileInputConfigBuilder.CORRESPONDENCE_PHYSICAL_REPOSITORY_FILE)));
    }

}
