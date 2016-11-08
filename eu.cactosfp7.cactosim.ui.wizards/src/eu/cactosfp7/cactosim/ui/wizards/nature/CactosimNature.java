package eu.cactosfp7.cactosim.ui.wizards.nature;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.runtime.CoreException;

public class CactosimNature implements IProjectNature {

    public static final String NATURE_ID = "eu.cactosfp7.cactosim.CactosimNature";
    
    @Override
    public void configure() throws CoreException {
        // TODO Auto-generated method stub

    }

    @Override
    public void deconfigure() throws CoreException {
        // TODO Auto-generated method stub

    }

    @Override
    public IProject getProject() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void setProject(IProject project) {
        // TODO Auto-generated method stub

    }

}
