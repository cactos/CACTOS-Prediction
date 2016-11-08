package eu.cactosfp7.cactosim.ui.wizards.cdo;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

/**
 * Wizard page that collects information for the EMF Storage project 
 * @author svorobs2
 *
 */
public class EMFWizardPage extends WizardPage {
  public static final String ID = "eu.cactosfp7.cactosim.ui.wizards.cdo";
  
  private Text EMFProjectNameText;
  private Composite container;

  public EMFWizardPage() {
	  
    super("New CACTOS models");
    setTitle("Create new project resource");
    setDescription("Retrieve models to local EMF store");
  
  }

  @Override
  public void createControl(Composite parent) {
    container = new Composite(parent, SWT.NONE);
    GridLayout layout = new GridLayout();
    container.setLayout(layout);
    layout.numColumns = 2;
    
    Label serverAddr = new Label(container, SWT.NONE);
    serverAddr.setText("EMF store project name:");
    EMFProjectNameText = new Text(container, SWT.BORDER | SWT.SINGLE);
    
    
    //TODO: get the live version of what is written on the page One
    CDOWizardPage PageOne = (CDOWizardPage) getWizard().getPreviousPage(this);
    EMFProjectNameText.setText(PageOne.folderNameText());
    EMFProjectNameText.setEnabled(true);
    EMFProjectNameText.addKeyListener(new KeyListener() {

		@Override
		public void keyPressed(KeyEvent e) {
		}

		//make sure all of the fields are not empty
		@Override
		public void keyReleased(KeyEvent e) {
			if (!EMFProjectNameText.getText().isEmpty()) {
				setErrorMessage(null);
				setPageComplete(true);

			}else{
				setErrorMessage("Project name is missing");
			}
			
		}

	});
    
    GridData gd = new GridData(GridData.FILL_HORIZONTAL);
    EMFProjectNameText.setLayoutData(gd);
    
    // required to avoid an error in the system
    setControl(container);
    setPageComplete(true);

  }

  public String EMFProjectNameText() {
    return EMFProjectNameText.getText();
  }
  


}
 