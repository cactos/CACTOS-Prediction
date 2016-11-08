package eu.cactosfp7.cactosim.experimentscenario.executor;

import java.util.function.Consumer;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;

import de.uka.ipd.sdq.simucomframework.entities.SimuComEntity;
import de.uka.ipd.sdq.simucomframework.model.SimuComModel;
import de.uka.ipd.sdq.simulation.abstractsimengine.AbstractSimEventDelegator;

public class SimuComUpdateSimulationEntityEvent extends AbstractSimEventDelegator<SimuComUpdateSimulationEntityEvent.ScheduledSimulationEntityUpdate<? extends EObject>> {
    protected class ScheduledSimulationEntityUpdate<T extends EObject> extends SimuComEntity {
        private final Runnable updateRoutine; 
        
        protected ScheduledSimulationEntityUpdate(SimuComModel model, String name, T element, Consumer<T> updater) {
            super(model, name);
            updateRoutine = (() -> updater.accept(element));
        }
        
        public void updateSimulationEntity() {
            this.updateRoutine.run();
        }
    }
            
    private static final Logger LOGGER = Logger.getLogger(SimuComUpdateSimulationEntityEvent.class);
    
    public SimuComUpdateSimulationEntityEvent(final SimuComModel model ) {
        super(model, "TimeLineTriggerEvent");
    }
    
    @Override
    public void eventRoutine(final ScheduledSimulationEntityUpdate<? extends EObject> who) {
        double simulationTime = this.getModel().getSimulationControl().getCurrentSimulationTime();
        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("TimeLine trigger event " + this.getName() + " occurred at simulation time "
                    + simulationTime);
        }
        
        if (this.getModel().getSimulationControl().isRunning()) {
            who.updateSimulationEntity();
        }
    }
    
    public <T extends EObject> void scheduleUpdateAt(T simulationElement, Consumer<T> updater, double pointInSimulationTime) {
        double simulationTime = this.getModel().getSimulationControl().getCurrentSimulationTime();
        this.scheduleUpdateIn(simulationElement, updater, pointInSimulationTime - simulationTime);
    }
    
    public <T extends EObject> void scheduleUpdateIn(T simulationElement, Consumer<T> updater, double timeFromNow) {
        this.schedule(new ScheduledSimulationEntityUpdate<T>((SimuComModel) this.getModel(), "Scheduled Event Update Entity", simulationElement, updater), 
                timeFromNow);
    }
}
