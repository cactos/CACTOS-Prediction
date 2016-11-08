package eu.cactosfp7.cactosim.ui.launcher.configuration;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;

import de.uka.ipd.sdq.codegen.simucontroller.runconfig.SimuComConfigurationTab;
import de.uka.ipd.sdq.codegen.simucontroller.runconfig.SimuConfigurationTab;
import de.uka.ipd.sdq.workflow.launchconfig.extension.ExtendableTabGroup;
import de.uka.ipd.sdq.workflow.launchconfig.tabs.DebugEnabledCommonTab;

public class InterpreterConfigurationTab extends ExtendableTabGroup {

    @Override
    public void createTabs(ILaunchConfigurationDialog dialog, String mode) {
        List<ILaunchConfigurationTab> tabs = new ArrayList<ILaunchConfigurationTab>();
        ILaunchConfigurationTab commonTab = new DebugEnabledCommonTab();
        tabs.add(new CactoSimFileNamesInputTab());
        tabs.add(new SimuComConfigurationTab());
        tabs.add(new SimuConfigurationTab());
        tabs.add(commonTab);
        setTabs(tabs.toArray(new ILaunchConfigurationTab[] {}));
    }

}
