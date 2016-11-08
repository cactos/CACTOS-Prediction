package eu.cactosfp7.cactosim.modelextractor.ui.wizards;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

import eu.cactosfp7.cactosim.launcher.CactoSimConstants;
import eu.cactosfp7.infrastructuremodels.logicaldc.core.LogicalDCModel;
import eu.cactosfp7.infrastructuremodels.logicaldc.util.LogicaldcResourceFactoryImpl;
import de.uka.ipd.sdq.workflow.launchconfig.tabs.TabHelper;

public class SelectLdcModelPage extends WizardPage {
    
    private ModifyListener modifyListener;
    private Text textLogicalDC;
    
    private LogicalDCModel model;

    public SelectLdcModelPage() {
        super("Select CACTOS Logical Data Centre Model for which Experiments Events are to be imported.");
        setTitle("Select Logical Data Centre Model.");
        setDescription("Please select the Logical Data Centre Model for which you want to extract a set of Experiment Scenario events.");
        this.setPageComplete(false);
    }
    
    @Override
    public void createControl(Composite parent) {
        final LogicaldcResourceFactoryImpl factory = new LogicaldcResourceFactoryImpl();
        modifyListener = new ModifyListener() {
            public void modifyText(ModifyEvent e) {
                try {
                    ResourceSet resourceSet = new ResourceSetImpl();
                    Resource logicalDCResource = resourceSet.createResource(URI.createURI(textLogicalDC.getText()));
                    logicalDCResource.load(Collections.EMPTY_MAP);
                    model = (LogicalDCModel) logicalDCResource.getContents().get(0);
                    SelectLdcModelPage.this.setPageComplete(true);
                } catch(IllegalArgumentException | IOException exception) {
                    SelectLdcModelPage.this.setPageComplete(false);
                }
            }
            
        };
        Composite container = new Composite(parent, SWT.NONE);
        GridLayout layout = new GridLayout();
        container.setLayout(layout);
        setControl(container);
        this.textLogicalDC = new Text(container, SWT.SINGLE | SWT.BORDER);
        TabHelper.createFileInputSection(container, modifyListener, "Logical Data Centre Model", CactoSimConstants.LOGICALDCMODEL_FILE_EXTENSION, textLogicalDC, "Select the Logical Data Centre Model File", getShell(), CactoSimConstants.DEFAULT_LOGICAL_CORE_FILE);
    }

    public LogicalDCModel getLdcModel() {
        return this.model;
    }

    @Override
    public void setPageComplete(boolean complete) {
        super.setPageComplete(complete);
        if(complete) {
            ResourceSet set = model.eResource().getResourceSet();
            int size = 0;
            while(size < set.getResources().size()) {
                EcoreUtil.resolveAll(set);                
                size = set.getResources().size();
            }
        }
    }
}
