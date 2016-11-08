package eu.cactosfp7.cactosim.placementconnector;

import org.palladiosimulator.simulizar.runtimestate.AbstractSimuLizarRuntimeState;
import org.palladiosimulator.simulizar.runtimestate.IRuntimeStateAccessor;

import eu.cactosfp7.cactosim.experimentscenario.ExperimentScenarioTimeLine;
import eu.cactosfp7.cactosim.experimentscenario.ExperimentscenarioPackage;

public class PlacementSettingsRuntimeStateAccessor implements IRuntimeStateAccessor {

	@Override
	public void setRuntimeStateModel(AbstractSimuLizarRuntimeState state) {
		state.getModelAccess().getGlobalPCMModel().getResourceSet()
			.getResources().stream()
			.flatMap(r -> r.getContents().stream())
			.filter(ExperimentscenarioPackage.eINSTANCE.getExperimentScenarioTimeLine()::isInstance)
			.map(ExperimentScenarioTimeLine.class::cast)
			.findAny().ifPresent(tl -> {
				PlacementConnector.compatibilityMode = tl.getPlacementCompatibilityMode();
			});
	}

}
