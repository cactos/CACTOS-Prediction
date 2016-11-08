package eu.cactosfp7.cactosim.modelextractor.ui;

import java.util.Calendar;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.widgets.DateTime;

import eu.cactosfp7.cactosim.modelextractor.queries.BlackBoxVmQuery;
import eu.cactosfp7.cactosim.modelextractor.queries.VMDescription;
import eu.cactosfp7.cactosim.modelextractor.queries.VmOverview;
import eu.cactosfp7.cactosim.modelextractor.ui.wizards.SelectFromAvailableBlackBoxModelsPage;
import eu.cactosfp7.infrastructuremodels.logicaldc.core.Hypervisor;
import eu.cactosfp7.infrastructuremodels.logicaldc.core.LogicalDCModel;

public class VmFilter extends ViewerFilter {

    private VmOverview overview;
    private SelectFromAvailableBlackBoxModelsPage selectFromAvailableBlackBoxModelsPage;

    public VmFilter(VmOverview overview, SelectFromAvailableBlackBoxModelsPage selectFromAvailableBlackBoxModelsPage) {
        this.overview = overview;
        this.selectFromAvailableBlackBoxModelsPage = selectFromAvailableBlackBoxModelsPage;
    }

    @Override
    public boolean select(Viewer viewer, Object parentElement, Object element) {
        VMDescription description = (VMDescription) element;
        
        if(this.selectFromAvailableBlackBoxModelsPage.getModel() == null) {
            return false;
        }
        
        Hypervisor host = BlackBoxVmQuery.getHost(this.selectFromAvailableBlackBoxModelsPage.getModel(),description.getInitialPlacement());
        
        if(host == null) {
            return false;
        }        
        
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(overview.getLowerBound());
        long lowerEpoch = calendar.getTimeInMillis();
        calendar.setTime(overview.getUpperBound());
        long upperEpoch = calendar.getTimeInMillis();
        
        if(lowerEpoch > description.getInterval().getMax() || upperEpoch < description.getInterval().getMin()
                || host == null) {
            return false;
        }
        
        return true;
    }

}
