package eu.cactosfp7.cactosim.optimisationplan.action.repository.black;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.m2m.qvt.oml.blackbox.java.Operation;
import org.eclipse.m2m.qvt.oml.blackbox.java.Operation.Kind;
import org.palladiosimulator.simulizar.action.context.ExecutionContext;
import org.palladiosimulator.simulizar.action.interpreter.ExecutionContextKeeper;

import de.uka.ipd.sdq.simucomframework.SimuComSimProcess;
import eu.cactosfp7.optimisationplan.ExecutionStatus;
import eu.cactosfp7.optimisationplan.OptimisationStep;
import eu.cactosfp7.optimisationplan.OptimisationplanPackage;

public class CactosOptimisationPlanActionBlackBoxLibrary {
	
	private static final Set<ExecutionStatus> NON_FINISHED_EXECUTION_STATES = new HashSet<>(Arrays.asList(
			ExecutionStatus.READY, 
			ExecutionStatus.IN_EXECUTION));
	
	@Operation(kind = Kind.HELPER, contextual = true)
    public static boolean passivateUntilOptimisationStepExecutionFinished(final ExecutionContext context, final OptimisationStep optimisationStep) {
	final SimuComSimProcess processForContext = 
		ExecutionContextKeeper.getInstance().getProcessForContext(context)
		.orElseThrow(() -> new RuntimeException("ExecutionContext is not mapped to SimuComSimProcess. Make"
			+ " sure to only call this operation from a running TransientEffectInterpreter session."));
		
		
		if (NON_FINISHED_EXECUTION_STATES.contains(optimisationStep.getExecutionStatus())) {
			Adapter notifier = new AdapterImpl() {
				   @Override
				public void notifyChanged(Notification msg) {
				    if (msg.getEventType() == Notification.SET
					    && OptimisationplanPackage.eINSTANCE.getOptimisationStep_ExecutionStatus().equals(msg.getFeature())
					    && optimisationStep.equals(msg.getNotifier())) {
				    	processForContext.activate();
				    }
				}
		    };
		    
		    optimisationStep.eAdapters().add(notifier);
		    
		    while (NON_FINISHED_EXECUTION_STATES.contains(optimisationStep.getExecutionStatus())) {
		    	processForContext.passivate();
		    }
		    
		    optimisationStep.eAdapters().remove(notifier);
		}
		
		if (ExecutionStatus.COMPLETED_SUCCESSFUL.equals(optimisationStep.getExecutionStatus())) {
			return true;
		} else  {
			return false;
		}
    }
}
