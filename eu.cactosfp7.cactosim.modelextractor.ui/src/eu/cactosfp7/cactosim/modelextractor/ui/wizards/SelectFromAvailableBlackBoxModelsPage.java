package eu.cactosfp7.cactosim.modelextractor.ui.wizards;

import java.io.IOException;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

import org.apache.hadoop.hbase.client.Connection;
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
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.CheckboxTableViewer;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;

import eu.cactosfp7.cactosim.modelextractor.connection.ConnectionManager;
import eu.cactosfp7.cactosim.modelextractor.queries.BlackBoxVmQuery;
import eu.cactosfp7.cactosim.modelextractor.queries.VMDescription;
import eu.cactosfp7.cactosim.modelextractor.queries.VmOverview;
import eu.cactosfp7.cactosim.modelextractor.ui.TimeFrameSelection;
import eu.cactosfp7.cactosim.modelextractor.ui.VmFilter;
import eu.cactosfp7.infrastructuremodels.logicaldc.core.LogicalDCModel;

public abstract class SelectFromAvailableBlackBoxModelsPage extends WizardPage implements IWizardPage {

    private boolean lastVisible = false;
    private VmOverview overview;
    private CheckboxTableViewer tableViewer;
    private TimeFrameSelection lowerTimeFrame;
    private TimeFrameSelection upperTimeFrame;
    private SelectQueryIntervalPage selectQueryIntervalPage;
    private BlackBoxVmQuery query;
    private VMTableViewerComparator comparator;
	
	private static final Map<String, Function<VMDescription, Comparable<?>>> COLUMN_COMPARISON_PROVIDERS = new HashMap<>(); 
	private static final String[] titles = { "Name", "UUID", "Placement", "First Measurement Time", "Last Measurement Time" };
	static {
		COLUMN_COMPARISON_PROVIDERS.put(titles[0], VMDescription::getName);
		COLUMN_COMPARISON_PROVIDERS.put(titles[1], VMDescription::getUuid);
		COLUMN_COMPARISON_PROVIDERS.put(titles[2], VMDescription::getInitialPlacement);
		COLUMN_COMPARISON_PROVIDERS.put(titles[3], vm -> vm.getInterval().getMin());
		COLUMN_COMPARISON_PROVIDERS.put(titles[4], vm -> vm.getInterval().getMax());
	}
    public abstract LogicalDCModel getModel();

    public SelectFromAvailableBlackBoxModelsPage(final SelectQueryIntervalPage selectQueryIntervalPage, BlackBoxVmQuery query) {
        super("Select extracted Black-Box Models Page");
        this.selectQueryIntervalPage = selectQueryIntervalPage;
        this.query = query;
        
        setTitle("Select extracted Black-Box Models");
        setDescription("Please select the time frame and VMs you want to extract and add to the CACTOS model.");
    }

    @Override
    public void createControl(final Composite parent) {
        
        Composite container = new Composite(parent, SWT.NONE);
        GridLayout layout = new GridLayout();
        layout.numColumns = 2;
        container.setLayout(layout);
        setControl(container);
        
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
        tableViewer.setContentProvider(ArrayContentProvider.getInstance());
        this.comparator = new VMTableViewerComparator();
        tableViewer.setComparator(this.comparator);
        final Table table = tableViewer.getTable();
        GridData columnGrid = new GridData(GridData.FILL_BOTH);
        columnGrid.horizontalSpan = 2;
        table.setLayoutData(columnGrid);
        table.setHeaderVisible(true);
        table.setLinesVisible(true); 
        table.getVerticalBar().setVisible(true);
        
        TableViewerColumn nameCol = createTableViewerColumn(titles[0], 100, 0);
        nameCol.setLabelProvider(new ColumnLabelProvider() {
            @Override
            public String getText(Object element) {
                return ((VMDescription) element).getName();
            }
        });

        TableViewerColumn uuidCol = createTableViewerColumn(titles[1], 100, 1);
        uuidCol.setLabelProvider(new ColumnLabelProvider() {
            @Override
            public String getText(Object element) {
                return ((VMDescription) element).getUuid();
            }
        });

        TableViewerColumn deploymentCol = createTableViewerColumn(titles[2], 100, 2);
        deploymentCol.setLabelProvider(new ColumnLabelProvider() {
            @Override
            public String getText(Object element) {
                return ((VMDescription) element).getInitialPlacement();
            }
        });      
        
        TableViewerColumn firstCol = createTableViewerColumn(titles[3], 150, 3);
        firstCol.setLabelProvider(new ColumnLabelProvider() {
            @Override
            public String getText(Object element) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(((VMDescription) element).getInterval().getMin());
                return DateFormat.getDateTimeInstance().format(calendar.getTime());
            }
        });

        TableViewerColumn lastCol = createTableViewerColumn(titles[4], 150, 4);
        lastCol.setLabelProvider(new ColumnLabelProvider() {
            @Override
            public String getText(Object element) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(((VMDescription) element).getInterval().getMax());
                return DateFormat.getDateTimeInstance().format(calendar.getTime());
            }
        });
    }
    
    @Override
    public void setVisible(boolean visible) {
        super.setVisible(visible);
        if(visible) {
            if(!lastVisible) {
                Connection connection = ConnectionManager.getInstance().getConnection();
                lowerTimeFrame.setValue(this.selectQueryIntervalPage.getLowerTime());
                upperTimeFrame.setValue(this.selectQueryIntervalPage.getUpperTime());
                try {
                    this.overview = query.getVmOverview(connection, this.getLowerTime().getTime(), this.getUpperTime().getTime());
                } catch (IOException e) {
                    throw new IllegalStateException(e);
                }
            }
            tableViewer.setInput(overview.getDescriptions().values());
            tableViewer.addSelectionChangedListener(new ISelectionChangedListener() {

                @Override
                public void selectionChanged(SelectionChangedEvent event) {
                    if(tableViewer.getCheckedElements().length > 0) {
                        setPageComplete(true);
                    } else {
                        setPageComplete(false);
                    }
                }            
            });
            VmFilter filter = new VmFilter(overview, this);
            tableViewer.addFilter(filter);
        }
        lastVisible = visible;
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

    public Collection<VMDescription> getSelectedVmDescriptions() {
        Object[] checkedElements = tableViewer.getCheckedElements();
        return Arrays.asList(Arrays.copyOf(checkedElements, checkedElements.length, VMDescription[].class));
    }
    
    private TableViewerColumn createTableViewerColumn(String title, int bound, final int colNumber) {
        final TableViewerColumn viewerColumn = new TableViewerColumn(tableViewer,
            SWT.NONE, colNumber);
        final TableColumn column = viewerColumn.getColumn();
        column.setText(title);
        column.setWidth(bound);
        column.setResizable(true);
        column.setMoveable(true);
        column.addSelectionListener(getSelectionAdapter(column, title));
        return viewerColumn;
      }

    private SelectionListener getSelectionAdapter(final TableColumn column, String title) {
		return new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				comparator.setColumnValueGetter(COLUMN_COMPARISON_PROVIDERS.get(title));
				SelectFromAvailableBlackBoxModelsPage.this.tableViewer.getTable().setSortColumn(column);
				SelectFromAvailableBlackBoxModelsPage.this.tableViewer.getTable().setSortDirection(
						comparator.isReverseSort() ? SWT.UP : SWT.DOWN);
				SelectFromAvailableBlackBoxModelsPage.this.tableViewer.refresh();
			}
		};
	}

	public Date getLowerTime() {
        return this.lowerTimeFrame.getDate();
    }

    public Date getUpperTime() {
        return this.upperTimeFrame.getDate();
    }
    
    @Override
    public boolean isPageComplete() {
        return this.lowerTimeFrame.getDate().compareTo(this.upperTimeFrame.getDate()) <= 0;
    }

}
