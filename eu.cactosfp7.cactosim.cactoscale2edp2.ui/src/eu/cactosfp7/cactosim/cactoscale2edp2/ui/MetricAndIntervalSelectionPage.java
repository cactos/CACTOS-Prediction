package eu.cactosfp7.cactosim.cactoscale2edp2.ui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.beans.BeanProperties;
import org.eclipse.core.databinding.observable.value.DateAndTimeObservableValue;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.validation.IValidator;
import org.eclipse.core.databinding.validation.ValidationStatus;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.databinding.swt.ISWTObservableValue;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.CheckboxTableViewer;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.palladiosimulator.metricspec.constants.MetricDescriptionConstants;

import eu.cactosfp7.cactosim.cactoscale2edp2.Settings;
import eu.cactosfp7.cactosim.cactoscale2edp2.util.Constants;
import eu.cactosfp7.infrastructuremodels.physicaldc.core.ComputeNode;
import eu.cactosfp7.infrastructuremodels.physicaldc.core.util.CoreSwitch;
import eu.cactosfp7.infrastructuremodels.physicaldc.util.NamedElement;

public class MetricAndIntervalSelectionPage extends WizardPage {

    private TimeFrameSelection lowerTimeFrame;
    private TimeFrameSelection upperTimeFrame;
    private CheckboxTableViewer tableViewer;
    private List<NamedElement> elements;

    public MetricAndIntervalSelectionPage(
            DatasourceSelectionPage sourcePage, List<NamedElement> selectedElement) {
        super("Select interval and extracted metric.");   
        this.elements = selectedElement;
    }

    @Override
    public void createControl(Composite parent) {
        
        Composite container = new Composite(parent, SWT.NONE);
        GridLayout layout = new GridLayout();
        layout.numColumns = 2;
        container.setLayout(layout);
        
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
        
        this.tableViewer = CheckboxTableViewer.newCheckList(container,
                SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL | SWT.FULL_SELECTION | SWT.BORDER);
        
        final Settings settings = Settings.getSettings();
        CoreSwitch<List<MetricIdentifier>> physicalSwitch = new CoreSwitch<List<MetricIdentifier>>() {
            @Override
            public List<MetricIdentifier> caseComputeNode(ComputeNode object) {
                String tableName = settings.getProperty(Constants.CN_HISTORY);
                String familyName = settings.getProperty(Constants.HW_UTIL_FAMILY);
                List<String> metricNames = new ArrayList<String>(Arrays.asList(Settings.getSettings().getProperty(Constants.CPU_METRIC_NAMES).split(",")));
                MetricIdentifier cpuMetrics = new MetricIdentifier(object, tableName, familyName, metricNames, "CPU Utilisation", MetricDescriptionConstants.UTILIZATION_OF_ACTIVE_RESOURCE_TUPLE);
                MetricIdentifier powerMetrics = new MetricIdentifier(object, tableName, Settings.getSettings().getProperty(Constants.POWER_UTIL_FAMILY), Collections.singletonList(Constants.POWER_CONSUMPTION),
                        "Power Consumption", MetricDescriptionConstants.POWER_CONSUMPTION_TUPLE);
                return Arrays.asList(new MetricIdentifier[] {cpuMetrics, powerMetrics});
            }
        };
        
        List<MetricIdentifier> availableMetrics = new ArrayList<MetricIdentifier>();
        
        for(NamedElement element : elements) {
            availableMetrics.addAll(physicalSwitch.doSwitch(element));
        }
        
        tableViewer.setContentProvider(ArrayContentProvider.getInstance());
        final Table table = tableViewer.getTable();
        GridData columnGrid = new GridData(GridData.FILL_BOTH);
        columnGrid.horizontalSpan = 2;
        table.setLayoutData(columnGrid);
        table.setHeaderVisible(true);
        table.setLinesVisible(true); 
        table.getVerticalBar().setVisible(true);
        String[] titles = {"Node Name", "Metric Name"};
        TableViewerColumn nodeCol = createTableViewerColumn(titles[0], 100, 0);
        nodeCol.setLabelProvider(new ColumnLabelProvider() {
            @Override
            public String getText(Object element) {
                return ((MetricIdentifier) element).getNode().getName();
            }
        });
        TableViewerColumn nameCol = createTableViewerColumn(titles[1], 100, 0);
        nameCol.setLabelProvider(new ColumnLabelProvider() {
            @Override
            public String getText(Object element) {
                return ((MetricIdentifier) element).getName();
            }
        });
        this.tableViewer.setInput(availableMetrics);
        setControl(container);
    }
    
    private TableViewerColumn createTableViewerColumn(String title, int bound, final int colNumber) {
        final TableViewerColumn viewerColumn = new TableViewerColumn(this.tableViewer,
            SWT.NONE, colNumber);
        final TableColumn column = viewerColumn.getColumn();
        column.setText(title);
        column.setWidth(bound);
        column.setResizable(true);
        column.setMoveable(true);
        return viewerColumn;
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
    
    public List<MetricIdentifier> getSelectedMetrics() {
        Object[] checkedElements = this.tableViewer.getCheckedElements();
        return Arrays.asList(Arrays.copyOf(checkedElements, checkedElements.length, MetricIdentifier[].class));
    }

    public Date getStartDate() {
        return this.lowerTimeFrame.getDate();
    }

    public Date getEndDate() {
        return this.upperTimeFrame.getDate();
    }

}
