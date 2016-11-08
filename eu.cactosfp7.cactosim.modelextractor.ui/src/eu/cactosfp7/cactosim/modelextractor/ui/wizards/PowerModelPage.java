package eu.cactosfp7.cactosim.modelextractor.ui.wizards;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.measure.quantity.Power;

import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.vedantatree.expressionoasis.exceptions.ExpressionEngineException;

import eu.cactosfp7.cactosim.modelextractor.queries.IPowerMeasurementQuery;
import eu.cactosfp7.cactosim.modelextractor.queries.NodeDescription;
import eu.cactosfp7.cactosim.regression.r.AbstractNonLinearRegression;
import eu.cactosfp7.cactosim.regression.r.DoubleModelParameter;
import eu.cactosfp7.cactosim.regression.r.ModelParameter;
import eu.cactosfp7.infrastructuremodels.physicaldc.power.binding.PowerModelBinding;

public class PowerModelPage extends WizardPage {
    private PowerModelBinding powerModelBinding;
    private SelectQueryIntervalPage queryIntervalPage;
    Canvas plotGroup;
    FormData formData;
    Composite container;
    private List<DoubleModelParameter<Power>> modelParameters;
    TableViewer viewer;
    private IPowerMeasurementQuery powerQuery;
    private AbstractNonLinearRegression<Power> model;
    private NodeDescription nodeDescription;

    public PowerModelPage(NodeDescription description, IPowerMeasurementQuery powerQuery, PowerModelBinding powerModelBinding, 
            SelectQueryIntervalPage selectQueryIntervalPage) {
        super("Confirm extracted Power Model");
        nodeDescription = description;
        this.powerQuery = powerQuery;
        this.powerModelBinding = powerModelBinding;
        this.queryIntervalPage = selectQueryIntervalPage;
        setTitle("Extracted Power Model");
        setDescription("View and Confirm the Extracted Power Model Parameters.");
    }

    @Override
    public void createControl(Composite parent) {        
        container = new Composite(parent, SWT.NULL);
        FormLayout layout = new FormLayout();
        container.setLayout(layout);
        plotGroup = new Canvas(container, SWT.CENTER);
        formData = new FormData();
        formData.width = 600;
        formData.height = 400;
        plotGroup.setLayoutData(formData);
        setControl(new Composite(container, SWT.NONE));        

        viewer = new TableViewer(container, SWT.MULTI | SWT.BORDER);
        viewer.setContentProvider(ArrayContentProvider.getInstance());
        final Table table = viewer.getTable();
        FormData parameterForm = new FormData();
        //parameterForm.top.offset = 4;
        table.setLayoutData(parameterForm);
        String[] titles = { "Parameter", "Value", "Unit"};
        table.setHeaderVisible(true);
        
        TableViewerColumn nameCol = createTableViewerColumn(viewer, titles[0], 100, 0);
        nameCol.setLabelProvider(new ColumnLabelProvider() {
            @Override
            public String getText(Object element) {
                return ((DoubleModelParameter<Power>) element).getName();
            }
        });
        
        TableViewerColumn valueCol = createTableViewerColumn(viewer, titles[1], 100, 1);
        valueCol.setLabelProvider(new ColumnLabelProvider() {
            @Override
            public String getText(Object element) {
                DoubleModelParameter<Power> doubleParam = ((DoubleModelParameter<Power>) element);
                return doubleParam.getValue().getValue().toString();
            }
        });
        
        TableViewerColumn unitCol = createTableViewerColumn(viewer, titles[2], 100, 2);
        unitCol.setLabelProvider(new ColumnLabelProvider() {
            @Override
            public String getText(Object element) {
                return ((DoubleModelParameter<Power>) element).getUnit().toString();
            }
        });  
        
        String powerModelInfo = "Power Model: " + this.powerModelBinding.getPowerModel().getExpression();
        Label label = new Label(container, SWT.LEFT);
        label.setText(powerModelInfo);
        FormData modelForm = new FormData();
        label.setLayoutData(modelForm);
        modelForm.top = new FormAttachment(plotGroup, 4);
        parameterForm.top = new FormAttachment(label, 4);
        modelForm.width = formData.width;
        TableColumn[] tableColumns = table.getColumns();
        for(int idx = 0; idx < tableColumns.length; idx++) {
            tableColumns[idx].pack();
        }
    }
    
    private TableViewerColumn createTableViewerColumn(TableViewer viewer, String title, int bound, final int colNumber) {
        final TableViewerColumn viewerColumn = new TableViewerColumn(viewer,
            SWT.NONE, colNumber);
        final TableColumn column = viewerColumn.getColumn();
        column.setText(title);
        column.setWidth(bound);
        column.setResizable(true);
        column.setMoveable(true);
        return viewerColumn;
        
    }
    
    @Override
    public void setVisible(boolean visible) {
        super.setVisible(visible);  
        if (visible) {
            try {
                model = powerQuery.constructPowerModel(this.nodeDescription, this.powerModelBinding,  
                        this.queryIntervalPage.getLowerTime().getTime(), 
                        this.queryIntervalPage.getUpperTime().getTime());
            } catch (IOException e1) {
                throw new RuntimeException(e1);
            } catch (ExpressionEngineException e1) {
                throw new RuntimeException(e1);
            }
            this.modelParameters = model.constructModel();
            viewer.setInput(modelParameters);
            File plotFile;
            try {
                plotFile = model.generateVectorPlot(formData.width, formData.height, this.getShell().getFont().getFontData()[0].getHeight());
            } catch (IOException e) {
                throw new IllegalStateException("Could not access the file generated by R. Check file access privileges.", e);
            }
            plotGroup.setBackgroundImage(new Image(Display.getCurrent(), plotFile.getAbsolutePath()));
            final Point newSize = this.getShell().computeSize(SWT.DEFAULT, SWT.DEFAULT, true);
            this.getShell().setSize(newSize);
        }
    }
    
    public List<DoubleModelParameter<Power>> getParameters() {
        return modelParameters;
    }

    public AbstractNonLinearRegression<Power> getResultingModel() {
        return this.model;
    }
}
