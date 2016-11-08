package eu.cactosfp7.cactosim.launcher;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.palladiosimulator.simulizar.launcher.PCMInterpreterLauncher;

import de.uka.ipd.sdq.codegen.simucontroller.runconfig.SimuComWorkflowConfiguration;
import de.uka.ipd.sdq.workflow.jobs.IJob;
import eu.cactosfp7.cactosim.launcher.jobs.CactoSimRootCompositeJob;
import eu.cactosfp7.cactosim.runconfig.CactoSimConfigurationBuilder;

public class CactoSimLauncher extends PCMInterpreterLauncher {
    
    @Override
    protected IJob createWorkflowJob(final SimuComWorkflowConfiguration config, final ILaunch launch)
            throws CoreException {
        if (!(config instanceof CactoSimWorkflowConfiguration)) {
            throw new IllegalArgumentException("CactoSimWorkflowConfiguration expected for CactoSimLauncher");
        }
        
        return new CactoSimRootCompositeJob((CactoSimWorkflowConfiguration) config, false);
    }
    
    @Override
    protected CactoSimWorkflowConfiguration deriveConfiguration(ILaunchConfiguration configuration, final String mode) throws CoreException {
        CactoSimWorkflowConfiguration config = new CactoSimWorkflowConfiguration(configuration.getAttributes());
        
        (new CactoSimConfigurationBuilder(configuration, mode)).fillConfiguration(config);
        
        return config;
    }
    
    // TODO initialisation of configuration is executed prior to createWorkflowJob
}
