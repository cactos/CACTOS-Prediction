package eu.cactosfp7.cactosim.runconfig;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.palladiosimulator.analyzer.workflow.ConstantsContainer;

import de.uka.ipd.sdq.simucomframework.SimuComConfig;
import de.uka.ipd.sdq.workflow.launchconfig.AbstractWorkflowBasedRunConfiguration;
import de.uka.ipd.sdq.workflow.launchconfig.AbstractWorkflowConfigurationBuilder;
import eu.cactosfp7.cactosim.launcher.CactoSimConstants;
import eu.cactosfp7.cactosim.launcher.CactoSimWorkflowConfiguration;

public class CactoSimConfigurationBuilder extends AbstractWorkflowConfigurationBuilder {

    public CactoSimConfigurationBuilder(ILaunchConfiguration configuration, String mode) throws CoreException {
        super(configuration, mode);
    }

    @Override
    public void fillConfiguration(AbstractWorkflowBasedRunConfiguration configuration) throws CoreException {
        CactoSimWorkflowConfiguration config = (CactoSimWorkflowConfiguration) configuration;
        config.setSimulateFailures(getBooleanAttribute(SimuComConfig.SIMULATE_FAILURES));
        
        config.setCactosPDCFile(getStringAttribute(CactoSimConstants.LOGICALDCMODEL_FILE));
        config.setCactosESMFile(getStringAttribute(CactoSimConstants.EXPERIMENTSCENARIOMODEL_FILE));

        // temporary data location
        config.setStoragePluginID(getStringAttribute(ConstantsContainer.TEMPORARY_DATA_LOCATION));
        config.setDeleteTemporaryDataAfterAnalysis(getBooleanAttribute(ConstantsContainer.DELETE_TEMPORARY_DATA_AFTER_ANALYSIS));

        // Initialize SimuCom config.
        SimuComConfig simuComConfig = new SimuComConfig(this.configuration.getAttributes(), config.isDebug());
        config.setSimuComConfiguration(simuComConfig);
    }

}
