package eu.cactosfp7.cactosim.modelextractor.ui.wizards;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;

import org.apache.hadoop.hbase.client.Connection;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.wizard.IWizard;

import eu.cactosfp7.cactosim.experimentscenario.ExperimentScenarioTimeLine;
import eu.cactosfp7.cactosim.modelextractor.connection.ConnectionManager;
import eu.cactosfp7.cactosim.modelextractor.queries.BlackBoxVmQuery;
import eu.cactosfp7.cactosim.modelextractor.queries.VMDescription;
import eu.cactosfp7.cactosim.modelextractor.util.Interval;
import eu.cactosfp7.infrastructuremodels.logicaldc.core.LogicalDCModel;

public class ScenarioExtractorWizard extends IntervalSelectionDependentWizard implements IWizard {

    private BlackBoxVmQuery query = new BlackBoxVmQuery();
    private ConnectionManager connectionManager = ConnectionManager.getInstance();
    private URI scenarioURI;
    private SelectFromAvailableBlackBoxModelsPage selectionPage;    
    private SelectLdcModelPage selectLdcModelPage;

    public ScenarioExtractorWizard(final ExperimentScenarioTimeLine scenario) {
       this.scenarioURI = scenario.eResource().getURI();
       this.selectLdcModelPage = new SelectLdcModelPage();
       this.selectionPage = new SelectFromAvailableBlackBoxModelsPage(this.selectQueryIntervalPage, query) {
           public LogicalDCModel getModel() {
               return selectLdcModelPage.getLdcModel();
           }
       };
       addPage(selectLdcModelPage);
       addPage(selectionPage);
    }
    
    @Override
    public boolean canFinish() {
        return this.selectLdcModelPage.isPageComplete() && this.selectionPage.isPageComplete();
    }
    
    @Override
    public boolean performFinish() {
        Collection<VMDescription> selectedVmDescriptions = this.selectionPage.getSelectedVmDescriptions();
        Date lowerDate = this.selectionPage.getLowerTime();
        Connection connection = connectionManager.getConnection();
        boolean successful = true;
        LogicalDCModel ldcModel = this.selectLdcModelPage.getLdcModel();
        Resource scenarioResource = ldcModel.eResource().getResourceSet().createResource(scenarioURI);
        try {
            scenarioResource.load(Collections.EMPTY_MAP);
        } catch (IOException e1) {
            return false;
        }
        ExperimentScenarioTimeLine scenario = (ExperimentScenarioTimeLine) scenarioResource.getContents().get(0);
        Interval consideredInterval = new Interval(lowerDate.getTime());
        consideredInterval.addMeasurement(this.selectionPage.getUpperTime().getTime());
        try {
            for(VMDescription selectedVm : selectedVmDescriptions) {
                query.queryAndAttachVmBehavior(ldcModel, scenario, connection, selectedVm, consideredInterval);
            }
            ldcModel.eResource().save(Collections.EMPTY_MAP);
            scenario.eResource().save(Collections.EMPTY_MAP);
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
}
