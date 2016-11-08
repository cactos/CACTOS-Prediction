package eu.cactosfp7.cactosim.cactoscale2edp2.ui;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.wizard.Wizard;

import eu.cactosfp7.cactosim.cactoscale2edp2.ConnectionManager;
import eu.cactosfp7.cactosim.cactoscale2edp2.EDP2Importer;
import eu.cactosfp7.cactosim.cactoscale2edp2.HistoricDBImporter;
import eu.cactosfp7.cactosim.cactoscale2edp2.data.HistoricMeasurements;
import eu.cactosfp7.cactosim.cactoscale2edp2.data.Interval;
import eu.cactosfp7.cactosim.cactoscale2edp2.data.TargetDescription;
import eu.cactosfp7.infrastructuremodels.physicaldc.core.PhysicalDCModel;
import eu.cactosfp7.infrastructuremodels.physicaldc.util.NamedElement;

public class HistoricDatabaseToEdp2Wizard extends Wizard {
    
    
    private MetricAndIntervalSelectionPage intervalPage;
    private DatasourceSelectionPage sourcePage;
    private List<NamedElement> namedElements;
    
    public HistoricDatabaseToEdp2Wizard(List<NamedElement> selectedElements) {
        this.namedElements = selectedElements;
        this.sourcePage = new DatasourceSelectionPage();
        this.intervalPage = new MetricAndIntervalSelectionPage(this.sourcePage, selectedElements);
        this.addPage(this.sourcePage);
        this.addPage(this.intervalPage);
    }

    @Override
    public boolean performFinish() {
        HistoricDBImporter historicDBImporter = new HistoricDBImporter(ConnectionManager.getInstance().getConnection());
        List<MetricIdentifier> selectedMetrics = this.intervalPage.getSelectedMetrics();
        
        List<TargetDescription> descList = new ArrayList<TargetDescription>();
        for(MetricIdentifier curMetric : selectedMetrics) {
            Interval interval = new Interval(this.intervalPage.getStartDate(), this.intervalPage.getEndDate());
            for(String curColumnName : curMetric.getColumnNames()) {
                TargetDescription desc = new TargetDescription(curMetric.getNode(), interval, curMetric.getTableName(), curMetric.getFamilyName(), curColumnName, curMetric.getMetricSet());                            
                descList.add(desc);
            }
        }
        PhysicalDCModel dcModel = null;
        TreeIterator<EObject> contents = EcoreUtil.getAllContents(namedElements.get(0).eResource(), true);
        boolean notFound = true;
        while(notFound && contents.hasNext()) {
            EObject curObject = contents.next();
            if(curObject instanceof PhysicalDCModel) {
                notFound = false;
                dcModel = (PhysicalDCModel) curObject;
            }
        }
        HistoricMeasurements measurements = null;
        try {

            measurements = historicDBImporter.importMeasurements(descList, dcModel.getId(), new Interval(this.intervalPage.getStartDate(), this.intervalPage.getEndDate()));
        } catch (IOException e) {
            // TODO error message
        }
        EDP2Importer importer = new EDP2Importer(sourcePage.getSelectedRepository());
        importer.importData(measurements);
        return true;
    }

}
