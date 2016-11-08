package eu.cactosfp7.cactosim.correspondence.simulizar.ui.configuration;

import java.util.HashMap;
import java.util.Map;

import org.palladiosimulator.simulizar.ui.configuration.extensions.AbstractExtensionFileInputConfigurationBuilder;
import org.palladiosimulator.simulizar.ui.configuration.extensions.ExtensionFileInputConfiguration;
import org.palladiosimulator.simulizar.ui.configuration.extensions.ExtensionInputType;

/**Input dialog for the LogicalCorrespondenceRepository.
 * @author hgroenda
 *
 */
public class CorrespondenceLogicalRepositoryFileInputConfigBuilder extends AbstractExtensionFileInputConfigurationBuilder {
	/** Key name for the repository file. */
    public static final Object CORRESPONDENCE_LOGICAL_REPOSITORY_FILE = "correspondenceLogicalRepositoryFile";
	/** File extension of valid models. */
    private static final String[] CORRESPONDENCE_LOGICAL_REPOSITORY_FILE_EXTENSION = new String[] {"*.logicalcorrespondence"};
	/** Dialog text when selecting a model file. */
    private static final Object CORRESPONDENCE_LOGICAL_REPOSITORY_DIALOG = "Correlation Model containing the Logical Correspondence Repository used for mapping between CACTOS and Palladio models.";
	/** Group label in the dialog for all necessary input fields. */
    private static final Object CORRESPONDENCE_LOGICAL_REPOSITORY_GROUP_LABEL = "Select the Correlation Model with the Logical Correspondence Repository.";
    
    @Override
    public ExtensionFileInputConfiguration buildConfiguration() {
        Map<String, Object> properties = new HashMap<>(6);

        properties.put(ExtensionFileInputConfiguration.DefaultPropertyKeys.CONFIG_ATTRIBUTE_NAME_KEY,
                CORRESPONDENCE_LOGICAL_REPOSITORY_FILE);
        properties.put(ExtensionFileInputConfiguration.DefaultPropertyKeys.FILE_RESTRICTIONS_KEY,
                CORRESPONDENCE_LOGICAL_REPOSITORY_FILE_EXTENSION);
        properties.put(ExtensionFileInputConfiguration.DefaultPropertyKeys.DEFAULT_URI_KEY, "");
        properties.put(ExtensionFileInputConfiguration.DefaultPropertyKeys.DIALOG_TITLE_KEY, 
                CORRESPONDENCE_LOGICAL_REPOSITORY_DIALOG);
        properties.put(ExtensionFileInputConfiguration.DefaultPropertyKeys.GROUP_LABEL_KEY, 
                CORRESPONDENCE_LOGICAL_REPOSITORY_GROUP_LABEL);
        properties.put(ExtensionFileInputConfiguration.DefaultPropertyKeys.INPUT_TYPE_KEY, ExtensionInputType.FILE);

        return new ExtensionFileInputConfiguration(properties);
    }
}
