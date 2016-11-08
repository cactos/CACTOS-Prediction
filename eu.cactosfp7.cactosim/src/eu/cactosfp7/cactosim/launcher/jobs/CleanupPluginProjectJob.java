package eu.cactosfp7.cactosim.launcher.jobs;

import java.io.File;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.palladiosimulator.analyzer.workflow.jobs.CreatePluginProjectJob;

import de.uka.ipd.sdq.workflow.jobs.CleanupFailedException;
import de.uka.ipd.sdq.workflow.jobs.IJob;
import de.uka.ipd.sdq.workflow.jobs.JobFailedException;
import de.uka.ipd.sdq.workflow.jobs.UserCanceledException;
import eu.cactosfp7.cactosim.launcher.CactoSimWorkflowConfiguration;

public class CleanupPluginProjectJob implements IJob {

    private final String myProjectId;
    /** Logger for this class. */
    private static final Logger LOGGER = Logger.getLogger(CleanupPluginProjectJob.class);

    public CleanupPluginProjectJob(CactoSimWorkflowConfiguration configuration) {
        this.myProjectId = configuration.getStoragePluginID();
    }

    @Override
    public void execute(IProgressMonitor monitor) throws JobFailedException, UserCanceledException {
        IProject myProject = CreatePluginProjectJob.getProject(this.myProjectId);
        try {
            deleteProject(monitor, myProject);
        } catch (CoreException e) {            
        }
    }

    @Override
    public void cleanup(IProgressMonitor monitor) throws CleanupFailedException {
        // TODO Auto-generated method stub

    }

    @Override
    public String getName() {
        return "Cleanup Plugin Project";
    }
    
    /**
     * @param monitor
     * @param myProject
     * @throws RollbackFailedException
     */
    private void deleteProject(IProgressMonitor monitor, IProject myProject)
            throws CoreException {
        if(LOGGER.isEnabledFor(Level.INFO)) {
            LOGGER.info("Deleting project " + myProject.getName());
        }

        myProject.close(monitor);
        myProject.delete(IResource.ALWAYS_DELETE_PROJECT_CONTENT, monitor);
        ResourcesPlugin.getWorkspace().getRoot().refreshLocal(1, monitor);

        if (pluginFolderExists()) {
            // Eclipse failed in fully cleaning the directory
            clearPluginFolder();
        }
        
        
    }
    
    /**
     * @return true, if the folder used for the simulation plugin exists in the
     *         filesystem, false otherwise
     */
    private boolean pluginFolderExists() {
        File pluginFolder = ResourcesPlugin.getWorkspace().getRoot()
                .getRawLocation().append(myProjectId).toFile();

        return pluginFolder.exists();
    }
    
    /**
     * clears the simulation plugin folder
     */
    private void clearPluginFolder() {
        File pluginFolder = ResourcesPlugin.getWorkspace().getRoot()
                .getRawLocation().append(this.myProjectId).toFile();

        deleteFolder(pluginFolder);
    }
    
    /**
     * deletes a folder and all of its contents recursively
     *
     * @param folder
     *            the folder to be deleted
     * @return true on success, false otherwise
     */
    private boolean deleteFolder(File folder) {
        if (folder.isDirectory()) {
            for (File child : folder.listFiles()) {
                if (!deleteFolder(child)) {
                    return false;
                }
            }
        }

        // empty folders can be deleted directly
        return folder.delete();
    }

}
