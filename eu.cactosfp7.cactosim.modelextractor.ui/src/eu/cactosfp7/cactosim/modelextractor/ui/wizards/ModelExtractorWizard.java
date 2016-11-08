package eu.cactosfp7.cactosim.modelextractor.ui.wizards;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;

import org.apache.hadoop.hbase.client.Connection;
import org.eclipse.jface.wizard.Wizard;

import eu.cactosfp7.cactosim.modelextractor.connection.ConnectionManager;
import eu.cactosfp7.cactosim.modelextractor.queries.BlackBoxVmQuery;
import eu.cactosfp7.cactosim.modelextractor.queries.VMDescription;
import eu.cactosfp7.cactosim.modelextractor.queries.VmOverview;
import eu.cactosfp7.infrastructuremodels.logicaldc.core.LogicalDCModel;

public class ModelExtractorWizard extends IntervalSelectionDependentWizard {

    private SelectFromAvailableBlackBoxModelsPage selectionPage;
    private BlackBoxVmQuery query = new BlackBoxVmQuery();
    private ConnectionManager connectionManager = ConnectionManager.getInstance();
    private LogicalDCModel ldcModel;

    public ModelExtractorWizard(final LogicalDCModel ldcModel) {
       this.ldcModel = ldcModel;
       selectionPage = new SelectFromAvailableBlackBoxModelsPage(this.selectQueryIntervalPage, this.query) {
           public LogicalDCModel getModel() {
               return ldcModel;
           }
       };
       addPage(selectionPage);
    }
    
    @Override
    public boolean canFinish() {
        return this.selectionPage.isPageComplete();
    }

    @Override
    public boolean performFinish() {
        Collection<VMDescription> selectedVmDescriptions = this.selectionPage.getSelectedVmDescriptions();
        Date lowerDate = this.selectionPage.getLowerTime();
        Date upperDate = this.selectionPage.getUpperTime();
        Connection connection = connectionManager.getConnection();
        boolean successful = true;
        try {
            for(VMDescription selectedVm : selectedVmDescriptions) {
                query.queryAndAttachVmBehaviour(ldcModel, connection, selectedVm, lowerDate.getTime(), upperDate.getTime());
            }
            ldcModel.eResource().save(Collections.EMPTY_MAP);
        } catch (IOException e) {
            successful = false;
        } finally {
            try {
                connection.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return successful;
    }
    
    @Override
    public String getWindowTitle() {
        return "Extract Black-Box VM Behaviour Models from Historical Database";
    }

}
