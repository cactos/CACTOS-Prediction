package eu.cactosfp7.cactosim.loadbalancerscalingrecorder;

import java.util.Map;

import javax.measure.Measure;
import javax.measure.unit.SI;

import org.eclipse.emf.common.notify.Notification;
import org.palladiosimulator.edp2.models.measuringpoint.MeasuringpointFactory;
import org.palladiosimulator.edp2.models.measuringpoint.StringMeasuringPoint;
import org.palladiosimulator.metricspec.constants.MetricDescriptionConstants;
import org.palladiosimulator.recorderframework.IRecorder;
import org.palladiosimulator.recorderframework.utils.RecorderExtensionHelper;
import org.palladiosimulator.simulizar.interpreter.listener.AbstractRecordingProbeFrameworkListenerDecorator;
import org.palladiosimulator.simulizar.modelobserver.AbstractModelObserver;
import org.palladiosimulator.simulizar.runtimestate.AbstractSimuLizarRuntimeState;

import de.uka.ipd.sdq.simucomframework.SimuComConfig;
import de.uka.ipd.sdq.simulation.abstractsimengine.ISimulationControl;
import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalCorrespondenceRepository;
import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalcorrespondencePackage;
import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ScalableVMImageConnectorCorrespondence;

public class LogicalCorrespondenceRepositorySyncer extends AbstractModelObserver<LogicalCorrespondenceRepository>{

	public LogicalCorrespondenceRepositorySyncer() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initialize(AbstractSimuLizarRuntimeState runtimeState) {
		runtimeState.getModelAccess().getGlobalPCMModel()
			.getElement(LogicalcorrespondencePackage.eINSTANCE.getLogicalCorrespondenceRepository())
			.stream().findAny()
			.map(LogicalCorrespondenceRepository.class::cast)
			.ifPresent(repo -> {
				this.initialize(repo, runtimeState);
				repo.getScalableConnectorCorrespondences().stream()
					.forEach(this::startWatchingConnector);
			});
	}
	
	@Override
	protected void add(Notification notification) {
		if (LogicalcorrespondencePackage.eINSTANCE.getLogicalCorrespondenceRepository_ScalableConnectorCorrespondences().equals(
				notification.getFeature())) {
			ScalableVMImageConnectorCorrespondence corr = (ScalableVMImageConnectorCorrespondence) notification.getNewValue();
			startWatchingConnector(corr);
		};
		super.add(notification);
	}
	
	protected void startWatchingConnector(ScalableVMImageConnectorCorrespondence corr) {
		StringMeasuringPoint point = MeasuringpointFactory.eINSTANCE.createStringMeasuringPoint();
		point.setMeasuringPointRepository(MeasuringpointFactory.eINSTANCE.createMeasuringPointRepository());
		point.setMeasuringPoint(String.format("Number of Instances of Service: %s (Connector: %s) for Application: %s",
				corr.getCactosConnector().getServiceRequiredRole().getName(),
				corr.getCactosConnector().getId(),
				corr.getCactosApplicationInstance().getId()));
		
		Map<String, Object> recorderConfigurationMap = AbstractRecordingProbeFrameworkListenerDecorator
				.createRecorderConfigMapWithAcceptedMetricAndMeasuringPoint(
						MetricDescriptionConstants.NUMBER_OF_RESOURCE_CONTAINERS_OVER_TIME,
						point);
 		IRecorder baseRecorder = initializeRecorder(recorderConfigurationMap);
 		final ISimulationControl simulationControl = this.runtimeModel.getModel().getSimulationControl(); 
 		ConnectorCorrespondenceMeasurementSource source = new ConnectorCorrespondenceMeasurementSource(
 				corr,
 				() -> Measure.valueOf(simulationControl.getCurrentSimulationTime(), SI.SECOND)); 
 		corr.getPalladio().eAdapters().add(source);
 		source.addObserver(baseRecorder);
 		source.takeNewMeasurement();
	}
	
	 protected IRecorder initializeRecorder(final Map<String, Object> recorderConfigMap) {
        assert recorderConfigMap != null;

        final SimuComConfig config = this.runtimeModel.getModel().getConfiguration();
        final IRecorder recorder = RecorderExtensionHelper
                .instantiateRecorderImplementationForRecorder(config.getRecorderName());
        recorder.initialize(config.getRecorderConfigurationFactory().createRecorderConfiguration(recorderConfigMap));

        return recorder;
    }

}
