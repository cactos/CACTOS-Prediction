package eu.cactosfp7.cactosim.cactoscale2edp2.ui;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.palladiosimulator.edp2.EDP2Plugin;
import org.palladiosimulator.edp2.impl.RepositoryManager;
import org.palladiosimulator.edp2.models.Repository.Repository;
import org.palladiosimulator.edp2.ui.dialogs.datasource.ConfigureDatasourceDialog;
import org.palladiosimulator.edp2.ui.dialogs.datasource.DatasourceListContentProvider;
import org.palladiosimulator.edp2.ui.dialogs.datasource.DatasourceListLabelProvider;
import org.palladiosimulator.edp2.ui.wizards.datasource.OpenDataSourceWizard;

/**
 * Select data source in which historic measurements are imported. 
 * Based on 
 * {@link org.palladiosimulator.edp2.ui.dialogs.datasource.DatasourceDialog} by
 * Sebastian Lehrig.
 * @author stier
 *
 */
public class DatasourceSelectionPage extends WizardPage {
    
    private static final String DIALOG_TITLE = "Select the Data Source in which to import the Measurements.";
    private Button addButton, removeButton, openButton;
    private TableViewer viewer;
    private Repository selectedRepository;
    
    public DatasourceSelectionPage() {
        super(DIALOG_TITLE);
    }

    @Override
    public void createControl(Composite parent) {
        Composite container = new Composite(parent, SWT.NONE);
        container.setLayout(new FormLayout());
        container.setLayoutData(new GridData(GridData.FILL_BOTH));
        setControl(container);

        /** 'Add..' button */
        addButton = new Button(container, SWT.NONE);
        final FormData fd_addButton = new FormData();
        fd_addButton.right = new FormAttachment(100, -5);
        fd_addButton.bottom = new FormAttachment(0, 31);
        fd_addButton.top = new FormAttachment(0, 5);
        addButton.setLayoutData(fd_addButton);
        addButton.setText("Add..");

        /** 'Remove' button */
        removeButton = new Button(container, SWT.NONE);
        final FormData fd_removeButton = new FormData();
        fd_removeButton.right = new FormAttachment(100, -5);
        fd_removeButton.bottom = new FormAttachment(0, 61);
        fd_removeButton.top = new FormAttachment(0, 35);
        removeButton.setLayoutData(fd_removeButton);
        removeButton.setText("Remove");

        /** 'Open..' button */
        openButton = new Button(container, SWT.NONE);
        final FormData fd_openButton = new FormData();
        fd_openButton.left = new FormAttachment(100, -84);
        fd_openButton.right = new FormAttachment(100, -5);
        fd_openButton.bottom = new FormAttachment(0, 91);
        fd_openButton.top = new FormAttachment(0, 65);
        openButton.setLayoutData(fd_openButton);
        openButton.setText("Open..");

        final Label separator = new Label(container, SWT.SEPARATOR | SWT.HORIZONTAL);
        final FormData fd_label = new FormData();
        fd_label.bottom = new FormAttachment(100, 2);
        fd_label.right = new FormAttachment(100, 2);
        fd_label.left = new FormAttachment(0, -6);
        separator.setLayoutData(fd_label);
        separator.setText("Label");

        Table list = new Table(container, SWT.BORDER);
        fd_label.top = new FormAttachment(list, 28, SWT.DEFAULT);
        fd_removeButton.left = new FormAttachment(list, 6, SWT.DEFAULT);
        fd_addButton.left = new FormAttachment(list, 6, SWT.DEFAULT);
        final FormData fd_list = new FormData();
        fd_list.bottom = new FormAttachment(100, -32);
        fd_list.right = new FormAttachment(100, -89);
        fd_list.top = new FormAttachment(0, 4);
        fd_list.left = new FormAttachment(0, 5);
        list.setLayoutData(fd_list);

        /** create a ListViewer */
        viewer = new TableViewer(list);
        viewer.setContentProvider(new DatasourceListContentProvider());
        viewer.setLabelProvider(new DatasourceListLabelProvider());
        viewer.addSelectionChangedListener(new ISelectionChangedListener() {

            @Override
            public void selectionChanged(SelectionChangedEvent event) {
                ISelection selection = event.getSelection();
                if (selection instanceof IStructuredSelection) {
                    IStructuredSelection sel = (IStructuredSelection) selection;
                    Object object = sel.getFirstElement();
                    selectedRepository = (Repository) object;
                    setPageComplete(true);
                }
            }
        });
        viewer.setInput(EDP2Plugin.INSTANCE.getRepositories().getAvailableRepositories());
        setTitle(DIALOG_TITLE);
        
        setRemoveButtonAction(new SelectionAdapter() {

            /*
             * (non-Javadoc)
             * 
             * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.
             * SelectionEvent)
             */
            @Override
            public void widgetSelected(final SelectionEvent e) {
                RepositoryManager.removeRepository(EDP2Plugin.INSTANCE.getRepositories(), selectedRepository);
                viewer.refresh();
                setPageComplete(false);
            }
        });

        setAddButtonAction(new SelectionAdapter() {

            /*
             * (non-Javadoc)
             * 
             * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.
             * SelectionEvent)
             */
            @Override
            public void widgetSelected(final SelectionEvent e) {
                final OpenDataSourceWizard w = new OpenDataSourceWizard();
                // AddNewDataSourceWizard w = new AddNewDataSourceWizard();
                // w.init(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getWorkbench(),
                // null);
                // Instantiates the wizard container with the wizard and opens it
                final WizardDialog dialog = new WizardDialog(e.display.getActiveShell(), w);
                dialog.create();
                dialog.setTitle(ConfigureDatasourceDialog.ADD_WIZARD_TITLE);
                dialog.open();
                viewer.refresh();
            }

        });

        setOpenButtonAction(new SelectionAdapter() {

            /*
             * (non-Javadoc)
             * 
             * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.
             * SelectionEvent)
             */
            @Override
            public void widgetSelected(final SelectionEvent e) {
                final OpenDataSourceWizard w = new OpenDataSourceWizard();

                // Instantiates the wizard container with the wizard and opens it
                final WizardDialog dialog = new WizardDialog(e.display.getActiveShell(), w);
                dialog.create();
                dialog.setTitle(ConfigureDatasourceDialog.OPEN_WIZARD_TITLE);
                dialog.open();
                viewer.refresh();
            }
        });
    }
    
    public Repository getSelectedRepository() {
        return this.selectedRepository;
    }
    
    @Override
    public boolean isPageComplete() {
        return super.isPageComplete() && this.selectedRepository != null;
    }
    
    protected void setAddButtonAction(SelectionListener listener) {
        addButton.addSelectionListener(listener);
    }

    protected void setRemoveButtonAction(SelectionListener listener) {
        removeButton.addSelectionListener(listener);
    }

    protected void setOpenButtonAction(SelectionListener listener) {
        openButton.addSelectionListener(listener);
    }

}
