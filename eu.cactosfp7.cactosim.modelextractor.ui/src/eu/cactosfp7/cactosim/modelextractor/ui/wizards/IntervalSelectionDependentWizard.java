package eu.cactosfp7.cactosim.modelextractor.ui.wizards;

import org.eclipse.jface.wizard.IWizard;
import org.eclipse.jface.wizard.Wizard;

public abstract class IntervalSelectionDependentWizard extends Wizard {
    
    protected SelectQueryIntervalPage selectQueryIntervalPage;

    public IntervalSelectionDependentWizard() {
        super();
        selectQueryIntervalPage = new SelectQueryIntervalPage();
        addPage(selectQueryIntervalPage);
    }

}