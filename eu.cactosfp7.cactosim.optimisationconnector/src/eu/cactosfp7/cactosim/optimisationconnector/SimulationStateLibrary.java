/**
 * 
 */
package eu.cactosfp7.cactosim.optimisationconnector;

import java.text.Normalizer;
import java.util.Date;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.measure.quantity.Frequency;
import javax.measure.unit.SI;

import org.eclipse.m2m.qvt.oml.blackbox.java.Operation;
import org.eclipse.m2m.qvt.oml.blackbox.java.Operation.Kind;
import org.jscience.physics.amount.Amount;
import org.palladiosimulator.simulizar.action.context.ExecutionContext;
import org.palladiosimulator.simulizar.action.interpreter.ExecutionContextKeeper;
import org.palladiosimulator.simulizar.runtimestate.AbstractSimuLizarRuntimeState;
import org.palladiosimulator.simulizar.simulationevents.PeriodicallyTriggeredSimulationEntity;

import de.uka.ipd.sdq.simucomframework.SimuComSimProcess;

/**QVT Black-Box Library for accessing the simulation state.
 * @author hgroenda
 *
 */
public class SimulationStateLibrary {
	/** Logger of this class. */
	private static final Logger logger = Logger.getLogger(SimulationStateLibrary.class.getCanonicalName());
	
	/** Runtime state of the simulation. Set by {@link SimulationRuntimeStateAccessor}. */
	public static AbstractSimuLizarRuntimeState state = null; 
	
	public SimulationStateLibrary() {
	}

	/**
	 * @return The time in the simulation. <code>0</code> if there was an error accessing the state.
	 */
	public static double getSimulationTime() {
		// do not use: state.getModel().getSimulationStatus().getCurrentSimulationTime();
		try {
			return state.getModel().getSimulationControl().getCurrentSimulationTime();
		} catch (RuntimeException e) {
			logger.log(Level.SEVERE, "Failure when accessing runtime state to query simulation time. ", e);
		}
		return 0;
	}
	
	/**
	 * @return gets the timestamp in the simulation time and returns it as Date.
	 */
	public Date getTimestampForSimulationTime() {
    	// second to millisecond conversion
    	return new Date(new Double(getSimulationTime()*1000).longValue());
    }
	
	@Operation(kind = Kind.QUERY, contextual = true)
	public static boolean equalTo(Date timestamp1, Date timestamp2) {
	    return timestamp1.getTime() == timestamp2.getTime();
	}
	
	@Operation(kind = Kind.QUERY, contextual = true)
	public static boolean before(Date timestamp1, Date timestamp2, Double delta) {
	    return timestamp1.getTime() < (timestamp2.getTime() - 1000 * delta);
	}

	/**Converter to Palladio RD-SEFF specification.
	 * @param frequency Frequency.
	 * @return String representation in Palladio format.
	 */
	@SuppressWarnings("unchecked")
	public String frequencyToProcessingRateSpecification(@SuppressWarnings("rawtypes") Amount frequency) {
		return Long.toString(((Amount<Frequency> )frequency).longValue(SI.HERTZ));
	}
	
	/**Converts a string to a valid variable name using the ASCII alphabet.
	 * All converted strings start with an underscore.
	 * @param str the string to convert.
	 * @return converted and normalized string.
	 */
	public String convertToASCII(String str) {
		if (str == null) return null;
		String result = Normalizer.normalize(str, Normalizer.Form.NFD);
		return "_" + result.replaceAll("\\W", "_");
	}
	
	public static void pauseExecutionForAmountOfSimulationTime(ExecutionContext context, double timeToPause) {
		final SimuComSimProcess processForContext = 
				ExecutionContextKeeper.getInstance().getProcessForContext(context)
				.orElseThrow(() -> new RuntimeException("ExecutionContext is not mapped to SimuComSimProcess. Make"
					+ " sure to only call this operation from a running TransientEffectInterpreter session."));
		AtomicBoolean timeProcessed = new AtomicBoolean(false);
		
		PeriodicallyTriggeredSimulationEntity entity = new PeriodicallyTriggeredSimulationEntity(
				SimulationStateLibrary.state.getModel(), timeToPause, timeToPause) {
			@Override
			protected void triggerInternal() {
				timeProcessed.set(true);
				processForContext.activate();
			}
		};
		
		while (!timeProcessed.get()) {
			processForContext.passivate();
		}
		
		entity.stopScheduling();
	}
}
