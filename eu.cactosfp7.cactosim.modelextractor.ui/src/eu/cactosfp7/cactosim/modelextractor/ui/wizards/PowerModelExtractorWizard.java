package eu.cactosfp7.cactosim.modelextractor.ui.wizards;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

import javax.measure.quantity.Power;

import org.eclipse.jface.wizard.Wizard;

import eu.cactosfp7.cactosim.modelextractor.queries.IPowerMeasurementQuery;
import eu.cactosfp7.cactosim.modelextractor.queries.NodeDescription;
import eu.cactosfp7.cactosim.modelextractor.queries.PowerMeasurementDelegate;
import eu.cactosfp7.cactosim.regression.r.AbstractNonLinearRegression;
import eu.cactosfp7.cactosim.regression.r.DoubleModelParameter;
import eu.cactosfp7.infrastructuremodels.physicaldc.power.binding.PowerModelBinding;

public class PowerModelExtractorWizard extends IntervalSelectionDependentWizard {

    private IPowerMeasurementQuery powerQuery;
    private PowerModelBinding powerModelBinding;
    private PowerModelPage powerModelPage;

    public PowerModelExtractorWizard(NodeDescription description, IPowerMeasurementQuery powerQuery, PowerModelBinding powerModelBinding) {
        this.powerQuery = powerQuery;
        this.powerModelBinding = powerModelBinding;
        this.powerModelPage = new PowerModelPage(description, powerQuery, powerModelBinding, this.selectQueryIntervalPage);
        addPage(powerModelPage);
    }

    @Override
    public boolean performFinish() {
        boolean successful = true;
        powerQuery.setPowerBinding(powerModelPage.getResultingModel(), powerModelBinding, powerModelPage.getParameters());
        try {
            powerModelBinding.eResource().save(Collections.EMPTY_MAP);
        } catch (IOException e) {
            successful = false;
        }
        return successful;
    }

}
