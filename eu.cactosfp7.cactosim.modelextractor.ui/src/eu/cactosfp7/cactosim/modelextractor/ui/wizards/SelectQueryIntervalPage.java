package eu.cactosfp7.cactosim.modelextractor.ui.wizards;

import java.util.Date;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.beans.BeanProperties;
import org.eclipse.core.databinding.observable.value.DateAndTimeObservableValue;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.validation.IValidator;
import org.eclipse.core.databinding.validation.ValidationStatus;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.jface.databinding.swt.ISWTObservableValue;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.swt.widgets.Group;

import eu.cactosfp7.cactosim.modelextractor.ui.TimeFrameSelection;

public class SelectQueryIntervalPage extends WizardPage {
    
    private TimeFrameSelection lowerTimeFrame;
    private TimeFrameSelection upperTimeFrame;
    
    public SelectQueryIntervalPage() {
        super("Select the Time Interval for which Data should be queried.");
    }

    @Override
    public void createControl(Composite parent) {
        
        Composite container = new Composite(parent, SWT.NONE);
        GridLayout layout = new GridLayout();
        layout.numColumns = 2;
        container.setLayout(layout);
        this.setControl(container);
        
        Group initialTime = new Group(container, SWT.NONE);
        initialTime.setText("Lower Bound");   
        GridData gridData = new GridData(SWT.FILL, SWT.FILL, true, false);
        initialTime.setLayoutData(gridData);
        initialTime.setLayout(new RowLayout(SWT.VERTICAL));

        this.lowerTimeFrame = new TimeFrameSelection();
        this.upperTimeFrame = new TimeFrameSelection();
        
        
        DateTime dateStart = new DateTime(initialTime, SWT.DATE | SWT.DROP_DOWN);
        DateTime timeStart = new DateTime(initialTime, SWT.TIME);
        addTimeSelection(lowerTimeFrame, dateStart, timeStart);
        
        Group lastTime = new Group(container, SWT.NONE);
        GridData lastGrid = new GridData(SWT.FILL, SWT.FILL, true, false);
        lastTime.setLayoutData(lastGrid);
        lastTime.setLayout(new RowLayout(SWT.VERTICAL));
        lastTime.setText("Upper Bound");
        DateTime dateEnd = new DateTime(lastTime, SWT.DATE | SWT.DROP_DOWN);
        DateTime timeEnd = new DateTime(lastTime, SWT.TIME);  
        addTimeSelection(upperTimeFrame, dateEnd, timeEnd);
    }

    private DataBindingContext addTimeSelection(final TimeFrameSelection timeFrame, final DateTime date, final DateTime time) {
        final DataBindingContext dataBindingCtx = new DataBindingContext();
        ISWTObservableValue observeDateStart = WidgetProperties.selection().observe(date);
        ISWTObservableValue observeTimeStart = WidgetProperties.selection().observe(time);
        final IObservableValue observeFullDate = new DateAndTimeObservableValue(observeDateStart, observeTimeStart);        
        IValidator validate = new IValidator() {

            @Override
            public IStatus validate(Object value) {
                return ValidationStatus.ok();
            }
        };
        
        UpdateValueStrategy strategy = new UpdateValueStrategy();
        strategy.setBeforeSetValidator(validate);
        dataBindingCtx.bindValue(observeFullDate, BeanProperties.value(TimeFrameSelection.class,"date").observe(timeFrame), strategy, strategy);
        return dataBindingCtx;
    }
    
    public Date getLowerTime() {
        return this.lowerTimeFrame.getDate();
    }

    public Date getUpperTime() {
        return this.upperTimeFrame.getDate();
    }
}
