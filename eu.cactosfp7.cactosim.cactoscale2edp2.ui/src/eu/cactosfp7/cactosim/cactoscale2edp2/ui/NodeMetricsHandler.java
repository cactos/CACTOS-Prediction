package eu.cactosfp7.cactosim.cactoscale2edp2.ui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.handlers.HandlerUtil;

import eu.cactosfp7.infrastructuremodels.physicaldc.util.NamedElement;
import eu.cactosfp7.infrastructuremodels.physicaldc.util.impl.UtilPackageImpl;

public class NodeMetricsHandler extends AbstractHandler implements IHandler {

    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
        final ISelection selection = HandlerUtil.getCurrentSelection(event);
        if(selection instanceof TreeSelection) {
            List<NamedElement> selectedElements = new ArrayList<NamedElement>(EcoreUtil.<NamedElement>getObjectsByType(((TreeSelection) selection).toList(), UtilPackageImpl.eINSTANCE.getNamedElement()));
            if(selectedElements.size() > 0) {
                Job job = new Job("Importing CactoScale Historic Measurements into EDP2.") {
                    @Override
                    protected IStatus run(IProgressMonitor monitor) {
                        Display.getDefault().syncExec(new Runnable() {
                            public void run() {
                                final WizardDialog dialog = new WizardDialog(HandlerUtil.getActiveShell(event), new HistoricDatabaseToEdp2Wizard(selectedElements));
                                dialog.setBlockOnOpen(true);
                                dialog.open();
                            }
                        });
                        return Status.OK_STATUS;
                    }
                };
                job.setUser(true);
                job.schedule();
            }
        }
        return null;
    }

}
