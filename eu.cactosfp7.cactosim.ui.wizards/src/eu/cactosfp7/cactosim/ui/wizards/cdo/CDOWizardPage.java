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
 * Wizard page that collects information for the CDO Storage models location
 * 
 * @author svorobs2
 *
 */
public class CDOWizardPage extends WizardPage {
	public static final String ID = "eu.cactosfp7.cactosim.ui.wizards.cdo";

	private Text serverAddrText;
	private Text repoNameText;
	private Text folderNameText;
	private Text usernameText;
	private Text passwordText;
	private Composite container;

	public CDOWizardPage() {
		/**
		 * Top decorations of the wizard window
		 */
		super("New CACTOS models");
		setTitle("Create new project resourcet");
		setDescription("Retrieve models from CDO store");

	}

	@Override
	public void createControl(Composite parent) {
		container = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 2;

		Label serverAddr = new Label(container, SWT.NONE);
		serverAddr.setText("CDO storage address:");
		serverAddrText = new Text(container, SWT.BORDER | SWT.SINGLE);
		serverAddrText.setText("");
		serverAddrText.setEnabled(true);
		serverAddrText.addKeyListener(new KeyListener() {

			@Override
			public void keyPressed(KeyEvent e) {
			}

			//make sure all of the fields are not empty
			@Override
			public void keyReleased(KeyEvent e) {
				if (!serverAddrText.getText().isEmpty() && !folderNameText.getText().isEmpty() && !usernameText.getText().isEmpty()) {
					setErrorMessage(null);
					setPageComplete(true);

				}else{
					setErrorMessage("Server address is missing");
				}
				
			}

		});

		Label repoName = new Label(container, SWT.NONE);
		repoName.setText("CDO repository name:");
		repoNameText = new Text(container, SWT.BORDER | SWT.SINGLE);
		repoNameText.setText("repo1");
		repoNameText.setEnabled(true);

		// TODO: need to change to the automatically list the root folders names
		Label folderName = new Label(container, SWT.NONE);
		folderName.setText("CDO resource folder name:");
		folderNameText = new Text(container, SWT.BORDER | SWT.SINGLE);
		folderNameText.setText("");
		folderNameText.setEnabled(true);
		folderNameText.addKeyListener(new KeyListener() {

			@Override
			public void keyPressed(KeyEvent e) {
			}

			//make sure all of the fields are not empty
			@Override
			public void keyReleased(KeyEvent e) {
				if (!serverAddrText.getText().isEmpty() && !folderNameText.getText().isEmpty() && !usernameText.getText().isEmpty()) {
					setErrorMessage(null);
					setPageComplete(true);

				}else{
					setErrorMessage("Folder name is missing");
				}
				
			}

		});
		

		Label username = new Label(container, SWT.NONE);
		username.setText("CDO repository Username:");
		usernameText = new Text(container, SWT.BORDER | SWT.SINGLE);
		usernameText.setText("");
		usernameText.setEnabled(true);
		usernameText.addKeyListener(new KeyListener() {

			@Override
			public void keyPressed(KeyEvent e) {
			}

			//make sure all of the fields are not empty
			@Override
			public void keyReleased(KeyEvent e) {
				if (!serverAddrText.getText().isEmpty() && !folderNameText.getText().isEmpty() && !usernameText.getText().isEmpty()) {
					setErrorMessage(null);
					setPageComplete(true);

				}else{
					setErrorMessage("User name is missing");
				}
				
			}

		});
		

		Label password = new Label(container, SWT.NONE);
		password.setText("CDO repository Password:");
		passwordText = new Text(container, SWT.BORDER | SWT.PASSWORD);

		passwordText.setText("");
		passwordText.setEnabled(true);

		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		serverAddrText.setLayoutData(gd);
		repoNameText.setLayoutData(gd);
		folderNameText.setLayoutData(gd);
		usernameText.setLayoutData(gd);
		passwordText.setLayoutData(gd);

		// required to avoid an error in the system
		setControl(container);
		setPageComplete(false);

	}
	//Setters and getters
	public String CDOUsernameText() {
		return usernameText.getText();
	}

	public String CDOPasswordText() {
		return passwordText.getText();
	}

	public String serverAddrText() {
		return serverAddrText.getText();
	}

	public String repoNameText() {
		return repoNameText.getText();
	}

	public String folderNameText() {
		return folderNameText.getText();
	}

}
