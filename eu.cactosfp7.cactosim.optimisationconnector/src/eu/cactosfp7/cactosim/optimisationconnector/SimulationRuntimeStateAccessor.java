/**
 * 
 */
package eu.cactosfp7.cactosim.optimisationconnector;

import org.palladiosimulator.simulizar.runtimestate.IRuntimeStateAccessor;
import org.palladiosimulator.simulizar.runtimestate.AbstractSimuLizarRuntimeState;

/**Accessor to the simulation state.
 * 
 * @author hgroenda
 *
 */
public class SimulationRuntimeStateAccessor implements IRuntimeStateAccessor {

	public SimulationRuntimeStateAccessor() {
	}


	@Override
	public void setRuntimeStateModel(AbstractSimuLizarRuntimeState state) {
	    SimulationStateLibrary.state = state;
	}

}
