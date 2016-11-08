package eu.cactosfp7.cactosim.ui.launcher.configuration;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.palladiosimulator.analyzer.workflow.ConstantsContainer;

import de.uka.ipd.sdq.workflow.launchconfig.LaunchConfigPlugin;
import de.uka.ipd.sdq.workflow.launchconfig.tabs.TabHelper;
import eu.cactosfp7.cactosim.launcher.CactoSimConstants;

public class CactoSimFileNamesInputTab extends AbstractLaunchConfigurationTab {

    private static final String LOGICAL_DATA_CENTRE_MODEL = "Logical Data Centre Model";
    private static final String EXPERIMENT_SCENARIO_MODEL = "(Optional) Experiment Scenario Model";
    
    private ModifyListener modifyListener;
    private Composite container;
    private Text textLogicalDC;
    private Text textESM;

    @Override
    public void createControl(Composite parent) {
        modifyListener = new ModifyListener() {

            public void modifyText(ModifyEvent e) {
                setDirty(true);
                updateLaunchConfigurationDialog();
            }
        };
        container = new Composite(parent, SWT.NONE);
        setControl(container);
        container.setLayout(new GridLayout());
        
        // Create Logical DC Model section
        textLogicalDC = new Text(container, SWT.SINGLE | SWT.BORDER);
        TabHelper.createFileInputSection(container, modifyListener, LOGICAL_DATA_CENTRE_MODEL, CactoSimConstants.LOGICALDCMODEL_FILE_EXTENSION,
        	textLogicalDC, "Select the Logical Data Centre Model File", getShell(), CactoSimConstants.DEFAULT_LOGICAL_CORE_FILE);
        
        // Create Logical DC Model section
        textESM = new Text(container, SWT.SINGLE | SWT.BORDER);
        TabHelper.createFileInputSection(container, modifyListener, EXPERIMENT_SCENARIO_MODEL, CactoSimConstants.EXPERIMENTSCENARIOMODEL_FILE_EXTENSION,
    		textESM, "(Optional) Select the Experiment Scenario Model File", getShell(), CactoSimConstants.DEFAULT_EXPERIMENT_SCENARIO_FILE);
   }

    @Override
    public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void initializeFrom(ILaunchConfiguration configuration) {
        try {
            textLogicalDC.setText(configuration.getAttribute(CactoSimConstants.LOGICALDCMODEL_FILE, CactoSimConstants.DEFAULT_LOGICALDCMODEL_FILE));
        } catch (CoreException e) {
            LaunchConfigPlugin.errorLogger(getName(), LOGICAL_DATA_CENTRE_MODEL, textLogicalDC.getText());
        }
        try {
            textESM.setText(configuration.getAttribute(CactoSimConstants.EXPERIMENTSCENARIOMODEL_FILE, CactoSimConstants.DEFAULT_EXPERIMENT_SCENARIO_FILE));
        } catch (CoreException e) {
            LaunchConfigPlugin.errorLogger(getName(), EXPERIMENT_SCENARIO_MODEL, textESM.getText());
        }
    }

    @Override
    public void performApply(ILaunchConfigurationWorkingCopy configuration) {
        configuration.setAttribute(CactoSimConstants.LOGICALDCMODEL_FILE, textLogicalDC.getText());
        configuration.setAttribute(CactoSimConstants.EXPERIMENTSCENARIOMODEL_FILE, textESM.getText());
    }

    @Override
    public String getName() {
        return "CACTOS Infrastructure Models";
    }
    
    @Override
    public boolean canSave() {
        return true;
    }
    
    public String getID() {
        return CactoSimFileNamesInputTab.class.getName();
    }

}
