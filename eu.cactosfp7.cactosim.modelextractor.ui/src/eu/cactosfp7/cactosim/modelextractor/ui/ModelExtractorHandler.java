package eu.cactosfp7.cactosim.modelextractor.ui;

import java.io.IOException;

import org.apache.hadoop.hbase.client.Connection;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.handlers.HandlerUtil;

import eu.cactosfp7.cactosim.modelextractor.connection.ConnectionManager;
import eu.cactosfp7.cactosim.modelextractor.queries.BlackBoxVmQuery;
import eu.cactosfp7.cactosim.modelextractor.queries.NodeDescription;
import eu.cactosfp7.cactosim.modelextractor.queries.NodeOverview;
import eu.cactosfp7.cactosim.modelextractor.queries.OpenStackPowerMeasurementQuery;
import eu.cactosfp7.cactosim.modelextractor.queries.VmOverview;
import eu.cactosfp7.cactosim.modelextractor.ui.wizards.ModelExtractorWizard;
import eu.cactosfp7.infrastructuremodels.logicaldc.core.LogicalDCModel;

public class ModelExtractorHandler extends AbstractHandler implements IHandler {

    @Override
    public Object execute(final ExecutionEvent event) throws ExecutionException {
        final ISelection selection = HandlerUtil.getCurrentSelection(event);

        if (selection instanceof TreeSelection) {
            final TreeSelection treeSelection = (TreeSelection) selection;
            if (treeSelection.getFirstElement() instanceof LogicalDCModel) {
                final LogicalDCModel ldcModel = (LogicalDCModel) treeSelection.getFirstElement();
                Job job = new Job("Getting VM overview from historic database.") {
                    @Override
                    protected IStatus run(IProgressMonitor monitor) {
                        Connection connection = null;
                        try {
                            openDialog(event, ldcModel);
                            return Status.OK_STATUS;
                        } catch (IllegalStateException e) {
                            openErrorMesage();
                        } finally {
                            if(connection != null && !connection.isClosed())
                             try {
                                 connection.close();
                             } catch (IOException e) {
                                 openErrorMesage();
                             }
                        }
                        return Status.CANCEL_STATUS;
                    }                    
                };
                job.setUser(true);
                job.schedule();
            } else {
                openErrorMesage();
            }
        } else {
            openErrorMesage();
        }
        return null;
    }
    
    private void openDialog(final ExecutionEvent event, final LogicalDCModel ldcModel) {
        Display.getDefault().syncExec(new Runnable() {
            public void run() {
                final WizardDialog dialog = new WizardDialog(HandlerUtil.getActiveShell(event), new ModelExtractorWizard(ldcModel));
                dialog.setBlockOnOpen(true);
                dialog.open();
            }
        });
    }

    private void openErrorMesage() {
        Display.getDefault().asyncExec(new Runnable() {
            public void run() {
                final Shell shell = Activator.getDefault().getWorkbench().getActiveWorkbenchWindow().getShell();
                ErrorDialog.openError(
                        shell,
                        "Select Logical DC Model",
                        "VM behaviour model import failed.",
                        new Status(IStatus.ERROR, Activator.PLUGIN_ID, "You need to select a Logical DC Model to extract black-box VM behaviours from the configured historical database."));
            }
        });
    }
}
