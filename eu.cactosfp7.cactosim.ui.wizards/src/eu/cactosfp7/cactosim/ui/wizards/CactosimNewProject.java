package eu.cactosfp7.cactosim.ui.wizards;

import java.net.URI;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.CoreException;

public class CactosimNewProject {
    /**
     * Creates an empty eclipse workspace project for manual model creation from scratch. 
     * Variables are passed from the "New CactoSim Project" wizard
     * 
     * @param projectName the name of the project
     * @param location URI where project will be set
     * @return - IProject Object
     * @throws CoreException 
     */
    public static IProject createProject(String projectName, URI location) throws CoreException {
        //check if variables are not empty
    	Assert.isNotNull(projectName);
        Assert.isTrue(projectName.trim().length() > 0);
        IProject project = createBaseProject(projectName, location);

        return project;
    }


    private static IProject createBaseProject(String projectName, URI location) throws CoreException {
      
        IProject newProject = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);

        if (!newProject.exists()) {
            URI projectLocation = location;
            IProjectDescription desc = newProject.getWorkspace().newProjectDescription(newProject.getName());
            if (location != null && ResourcesPlugin.getWorkspace().getRoot().getLocationURI().equals(location)) {
                projectLocation = null;
            }

            desc.setLocationURI(projectLocation);
            
                newProject.create(desc, null);
                if (!newProject.isOpen()) {
                    newProject.open(null);
                }
            
            
            
        }

        return newProject;
    }

}
