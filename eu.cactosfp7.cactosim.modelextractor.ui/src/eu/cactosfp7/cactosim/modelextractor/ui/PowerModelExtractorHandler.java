package eu.cactosfp7.cactosim.modelextractor.ui;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

import javax.measure.quantity.Power;

import org.apache.hadoop.hbase.client.Connection;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
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
import org.vedantatree.expressionoasis.exceptions.ExpressionEngineException;

import eu.cactosfp7.cactosim.modelextractor.connection.ConnectionManager;
import eu.cactosfp7.cactosim.modelextractor.queries.IPowerMeasurementQuery;
import eu.cactosfp7.cactosim.modelextractor.queries.NodeDescription;
import eu.cactosfp7.cactosim.modelextractor.queries.NodeOverview;
import eu.cactosfp7.cactosim.modelextractor.queries.OpenStackPowerMeasurementQuery;
import eu.cactosfp7.cactosim.modelextractor.queries.PowerMeasurementDelegate;
import eu.cactosfp7.cactosim.modelextractor.ui.wizards.ModelExtractorWizard;
import eu.cactosfp7.cactosim.modelextractor.ui.wizards.PowerModelExtractorWizard;
import eu.cactosfp7.cactosim.regression.r.AbstractNonLinearRegression;
import eu.cactosfp7.cactosim.regression.r.DoubleModelParameter;
import eu.cactosfp7.infrastructuremodels.physicaldc.core.ComputeNode;
import eu.cactosfp7.infrastructuremodels.physicaldc.power.binding.PowerModelBinding;

public class PowerModelExtractorHandler extends AbstractHandler {

    @Override
    public Object execute(final ExecutionEvent event) throws ExecutionException {
        final ISelection selection = HandlerUtil.getCurrentSelection(event);

        if (selection instanceof TreeSelection) {
            final TreeSelection treeSelection = (TreeSelection) selection;
            if (treeSelection.getFirstElement() instanceof ComputeNode) {
                final ComputeNode node = (ComputeNode) treeSelection.getFirstElement();
                Job job = new Job("Inferring power model from measurements in historical database.") {
                    @Override
                    protected IStatus run(IProgressMonitor monitor) {
                        Connection connection = null;
                        try {
                            connection = ConnectionManager.getInstance().getConnection();
                            IPowerMeasurementQuery powerQuery = new PowerMeasurementDelegate(connection);
                            NodeOverview overview = powerQuery.getNodeOverview(); 
                            NodeDescription selectedNode = powerQuery.selectNode(overview, node);
                            powerQuery.addCPUMetric(selectedNode);
                            PowerModelBinding binding = node.getCpuSpecifications().get(0).getPowerModelBinding();
                            // TODO make implementation more generic. Currently only first CPU supported.
                            openDialog(selectedNode, powerQuery, event, binding);
                        } catch (IOException e) {
                            openErrorMesage();
                        } finally {
                            if(connection != null && !connection.isClosed()) {
                                try {
                                     connection.close();
                                } catch (IOException e) {
                                    openErrorMesage();
                                }
                            }
                        }
                        return Status.CANCEL_STATUS;
                    }

                    private void openDialog(final NodeDescription description, final IPowerMeasurementQuery powerQuery, final ExecutionEvent event, final PowerModelBinding powerModelBinding) {
                        Display.getDefault().syncExec(new Runnable() {
                            public void run() {
                                final WizardDialog dialog = new WizardDialog(HandlerUtil.getActiveShell(event), new PowerModelExtractorWizard(description, powerQuery, powerModelBinding));
                                dialog.setBlockOnOpen(true);
                                dialog.open();
                            }
                        });
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

    private void openErrorMesage() {
        Display.getDefault().asyncExec(new Runnable() {
            public void run() {
                final Shell shell = Activator.getDefault().getWorkbench().getActiveWorkbenchWindow().getShell();
                ErrorDialog.openError(
                        shell,
                        "Infer Power Model",
                        "Inference of power model failed.",
                        new Status(IStatus.ERROR, Activator.PLUGIN_ID, "You need to select a Compute Node for which the Power Model should be inferred."));
            }
        });
    }
    
    private void openErrorInvalidPowerModel() {
        Display.getDefault().asyncExec(new Runnable() {
            public void run() {
                final Shell shell = Activator.getDefault().getWorkbench().getActiveWorkbenchWindow().getShell();
                ErrorDialog.openError(
                        shell,
                        "Infer Power Model",
                        "Inference of power model failed.",
                        new Status(IStatus.ERROR, Activator.PLUGIN_ID, "You need to enter a valid power model that has consistent FixedValues."));
            }
        });
    }
}
