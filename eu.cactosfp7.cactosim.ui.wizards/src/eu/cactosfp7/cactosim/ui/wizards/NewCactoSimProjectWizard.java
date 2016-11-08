package eu.cactosfp7.cactosim.ui.wizards;

import java.net.URI;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard;

/**
 * The wizard for creating a blank CactoSim project in the workspace
 * @author svorobs2
 *
 */
public class NewCactoSimProjectWizard extends Wizard implements INewWizard, IExecutableExtension {

    private WizardNewProjectCreationPage pageOne;
    private IConfigurationElement configurationElement;
    
    public NewCactoSimProjectWizard() {
    }

    @Override
    public String getWindowTitle() {
  	//General window name near the icon. Appears in all pages 
      return "New CactoSim project";
    }
    
    @Override
    public void init(IWorkbench workbench, IStructuredSelection selection) {
        // TODO Auto-generated method stub
    }

    @Override
    public boolean performFinish() {
        String name = pageOne.getProjectName();
        URI location = null;
        if (!pageOne.useDefaults()) {
            location = pageOne.getLocationURI();
        }

        try {
			CactosimNewProject.createProject(name, location);
		} catch (CoreException e) {
			MessageDialog.openError(getShell(), "Erorr found",
					"Error Class: "+ e.getClass().getName()+"\nMessage:"+e.toString());
		}

        BasicNewProjectResourceWizard.updatePerspective(configurationElement);

        return true;
    }

    @Override
    public void addPages() {
        super.addPages();

        pageOne = new WizardNewProjectCreationPage("CactoSim new project - Creates blank project");
        pageOne.setTitle("CactoSim new project");
        pageOne.setDescription("New project with blank CACTOS models is created for fully manual model building.");

        addPage(pageOne);
    }

    @Override
    public void setInitializationData(IConfigurationElement config, String propertyName, Object data)
            throws CoreException {
        configurationElement = config;

    }

}
