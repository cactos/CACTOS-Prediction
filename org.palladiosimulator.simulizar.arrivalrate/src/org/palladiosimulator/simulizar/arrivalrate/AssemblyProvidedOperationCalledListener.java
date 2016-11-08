package org.palladiosimulator.simulizar.arrivalrate;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.repository.ProvidedRole;
import org.palladiosimulator.pcm.repository.Role;
import org.palladiosimulator.pcm.repository.Signature;
import org.palladiosimulator.pcmmeasuringpoint.AssemblyOperationMeasuringPoint;
import org.palladiosimulator.probeframework.probes.Probe;
import org.palladiosimulator.probeframework.probes.TriggeredProbe;
import org.palladiosimulator.simulizar.interpreter.listener.AbstractInterpreterListener;
import org.palladiosimulator.simulizar.interpreter.listener.AssemblyProvidedOperationPassedEvent;

import de.uka.ipd.sdq.simucomframework.model.SimuComModel;
import de.uka.ipd.sdq.simucomframework.probes.TakeCurrentSimulationTimeProbe;

public class AssemblyProvidedOperationCalledListener extends AbstractInterpreterListener {
	
	protected final Map<String, Map<String, Map<String, TriggeredProbe>>> beginInterpretationProbes = new HashMap<>();
	protected final Map<String, Map<String, Map<String, TriggeredProbe>>> endInterpretationProbes = new HashMap<>();
	
	public Probe getOrCreateAndRegisterCallInterpretationStartProbe(final AssemblyOperationMeasuringPoint measuringPoint,
            final SimuComModel simuComModel) {
		return getProbe(measuringPoint.getRole(), measuringPoint.getAssembly(), measuringPoint.getOperationSignature(), beginInterpretationProbes)
				.orElseGet(() -> storeProbe(new TakeCurrentSimulationTimeProbe(simuComModel.getSimulationControl()), 
								measuringPoint, 
								beginInterpretationProbes));
	}

	public Probe getOrCreateAndRegisterCallInterpretationStopProbe(final AssemblyOperationMeasuringPoint measuringPoint,
            final SimuComModel simuComModel) {
		return getProbe(measuringPoint.getRole(), measuringPoint.getAssembly(), measuringPoint.getOperationSignature(), endInterpretationProbes)
				.orElseGet(() -> storeProbe(new TakeCurrentSimulationTimeProbe(simuComModel.getSimulationControl()), 
								measuringPoint, 
								endInterpretationProbes));
	}
	
	public void removeStartProbe(final AssemblyOperationMeasuringPoint measuringPoint, final Probe probe) {
		if (getProbe(measuringPoint.getRole(), measuringPoint.getAssembly(), measuringPoint.getOperationSignature(), beginInterpretationProbes)
				.equals(probe)) {
			removeProbe(measuringPoint, beginInterpretationProbes);
		}
	}
	
	public void removeStopProbe(final AssemblyOperationMeasuringPoint measuringPoint, final Probe probe) {
		if (getProbe(measuringPoint.getRole(), measuringPoint.getAssembly(), measuringPoint.getOperationSignature(), beginInterpretationProbes)
				.equals(probe)) {
			removeProbe(measuringPoint, endInterpretationProbes);
		}
	}
	
	protected static Optional<TriggeredProbe> getProbe(final Role role, final AssemblyContext assemblyContext, final Signature signature, 
			final Map<String, Map<String, Map<String, TriggeredProbe>>> probes) {
		return Optional.ofNullable(probes.get(role.getId()))
			.flatMap(m -> Optional.ofNullable(m.get(assemblyContext.getId())))
			.flatMap(m -> Optional.ofNullable(m.get(signature.getId())));
	}
	
	private static TriggeredProbe storeProbe(TriggeredProbe probe, final AssemblyOperationMeasuringPoint measuringPoint, 
			Map<String, Map<String, Map<String, TriggeredProbe>>> probes) {
		if (!probes.containsKey(measuringPoint.getRole().getId()))
			probes.put(measuringPoint.getRole().getId(), new HashMap<>());
		Map<String, Map<String, TriggeredProbe>> assemblySignatureMap = probes.get(measuringPoint.getRole().getId());
		
		if (!assemblySignatureMap.containsKey(measuringPoint.getAssembly().getId())) 
			assemblySignatureMap.put(measuringPoint.getAssembly().getId(), new HashMap<>());
		Map<String, TriggeredProbe> signatureMap = assemblySignatureMap.get(measuringPoint.getAssembly().getId());
		
		signatureMap.put(measuringPoint.getOperationSignature().getId(), probe);
		return probe;
	}
	
	private static void removeProbe(final AssemblyOperationMeasuringPoint measuringPoint, 
			Map<String, Map<String, Map<String, TriggeredProbe>>> probes) {
		if (!probes.containsKey(measuringPoint.getRole().getId()))
			probes.put(measuringPoint.getRole().getId(), new HashMap<>());
		Map<String, Map<String, TriggeredProbe>> assemblySignatureMap = probes.get(measuringPoint.getRole().getId());
		
		if (!assemblySignatureMap.containsKey(measuringPoint.getAssembly().getId())) 
			assemblySignatureMap.put(measuringPoint.getAssembly().getId(), new HashMap<>());
		Map<String, TriggeredProbe> signatureMap = assemblySignatureMap.get(measuringPoint.getAssembly().getId());
		
		signatureMap.remove(measuringPoint.getOperationSignature().getId());
	}

	@Override
	public <R extends ProvidedRole, S extends Signature> void beginAssemblyProvidedOperationCallInterpretation(
			AssemblyProvidedOperationPassedEvent<R, S> event) {
		getProbe(event.getModelElement(), event.getAssemblyContext(), event.getSignature(), beginInterpretationProbes)
			.ifPresent(TriggeredProbe::takeMeasurement);
	}
	
	@Override
	public <R extends ProvidedRole, S extends Signature> void endAssemblyProvidedOperationCallInterpretation(
			AssemblyProvidedOperationPassedEvent<R, S> event) {
		getProbe(event.getModelElement(), event.getAssemblyContext(), event.getSignature(), endInterpretationProbes)
			.ifPresent(TriggeredProbe::takeMeasurement);
	}
}
