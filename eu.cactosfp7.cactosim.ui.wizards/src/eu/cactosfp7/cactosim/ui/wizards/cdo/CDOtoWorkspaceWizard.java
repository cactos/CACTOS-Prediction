package eu.cactosfp7.cactosim.ui.wizards.cdo;

import java.lang.reflect.InvocationTargetException;
import java.net.URI;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard;

import eu.cactosfp7.cactosim.ui.wizards.CactosimNewProject;
import eu.cactosfp7.cactosim.cdo.CDOtoWorkspaceConverter;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Wizard facilitates process of collecting user data for retrieving CACTOS
 * models from CDO Storage to the local eclipse workspace.
 * 
 * @author svorobs2
 *
 */
public class CDOtoWorkspaceWizard extends Wizard implements INewWizard, IExecutableExtension {

	private final static Logger LOGGER = Logger.getLogger(CDOtoWorkspaceWizard.class.getName());

	protected CDOWizardPage pageOne;
	protected WizardNewProjectCreationPage pageZero;
	private IConfigurationElement _configurationElement;

	public CDOtoWorkspaceWizard() {
		super();
		setNeedsProgressMonitor(true);
	}

	@Override
	public String getWindowTitle() {
		// General window name near the icon. Appears in all pages
		return "New CactoSim project";
	}

	@Override
	public void addPages() {
		pageZero = new WizardNewProjectCreationPage("CactoSim new project - Creates new workspace project");
		pageZero.setTitle("New CactoSim project");
		pageZero.setDescription("Create new project to host models from CDO storage");
		// cannot press "finish" before "next"
		pageZero.setPageComplete(false);
		addPage(pageZero);

		pageOne = new CDOWizardPage();

		addPage(pageOne);

	}

	@Override
	public boolean performFinish() {

		LOGGER.setLevel(Level.INFO);

		String workspaceName = pageZero.getProjectName();
		String CDOADDRESS = pageOne.serverAddrText();
		String CDOREPONAME = pageOne.repoNameText();
		String CDORESOURCEROOT = pageOne.folderNameText();
		String CDOPASSWORD = pageOne.CDOPasswordText();
		String CDOUSERNAME = pageOne.CDOUsernameText();

		LOGGER.info("-----------------Values obtained from Wizard Pages----------------");
		LOGGER.info("workspaceName:" + workspaceName + "\nCDOADDRESS:" + CDOADDRESS + "\nCDOREPONAME:" + CDOREPONAME
				+ "\nCDORESOURCEROOT:" + CDORESOURCEROOT + "\nUsername:" + CDOUSERNAME + "\nPassword lenght:"
				+ Integer.toString(CDOPASSWORD.length()));

		/**
		 * 1. Create workspace project
		 */

		URI fileLocation = null;
		if (!pageZero.useDefaults()) {
			fileLocation = pageZero.getLocationURI();
		}

		// Creates workspace
		try {
			CactosimNewProject.createProject(workspaceName, fileLocation);
		} catch (CoreException e) {
			MessageDialog.openError(getShell(), "Erorr found",
					"Error Class: "+ e.getClass().getName()+"\nMessage:"+e.toString());
		}

		/**
		 * Connecting and creating
		 * 
		 */

		try {
			getContainer().run(true, true, new IRunnableWithProgress() {
				String workspaceName = pageZero.getProjectName();
				String CDOAddress = pageOne.serverAddrText();
				String CDORepoName = pageOne.repoNameText();
				String CDOResourceRoot = pageOne.folderNameText();
				String CDOPassword = pageOne.CDOPasswordText();
				String CDOUsername = pageOne.CDOUsernameText();

				public void run(IProgressMonitor monitor) throws InterruptedException, InvocationTargetException {
					monitor.beginTask("Retrieving Models ", 1);
					// monitor.subTask(Integer.toString(sum1));
					try {
						@SuppressWarnings("unused")
						CDOtoWorkspaceConverter startCDOToWorkspaceToEMFConversion = new CDOtoWorkspaceConverter(
								workspaceName, CDOAddress, CDORepoName, CDOResourceRoot, CDOUsername, CDOPassword);
						startCDOToWorkspaceToEMFConversion.CDOtoWorkspace();
					} catch (Exception e) {
						//throwing allowed exception to display the error message up the stack
						throw new InvocationTargetException(e, "Unable to connect to CDO.\nError Class: "+ e.getClass().getName()+"\nMessage:"+e.toString());
						
					}
					monitor.worked(1);

					monitor.done();
				}
			});
		} catch (InvocationTargetException e) {
			MessageDialog.openError(getShell(), "Erorr found",
					"Error Class: "+ e.getClass().getName()+"\nMessage:"+e.toString());
		} catch (InterruptedException e) {
			MessageDialog.openError(getShell(), "Erorr found",
					"Error Class: "+ e.getClass().getName()+"\nMessage:"+e.toString());
		}
		/**
		 * Not sure what this does here
		 */
		BasicNewProjectResourceWizard.updatePerspective(_configurationElement);

		// TODO Return a summary of retrieved models
		// MessageDialog.openInformation(this.getShell(), "message", "summary");

		return true;
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setInitializationData(IConfigurationElement config, String propertyName, Object data)
			throws CoreException {

		_configurationElement = config;

	}

}
