package org.palladiosimulator.simulizar.responsetimemonitor;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.palladiosimulator.metricspec.constants.MetricDescriptionConstants;
import org.palladiosimulator.monitorrepository.MeasurementSpecification;
import org.palladiosimulator.monitorrepository.Monitor;
import org.palladiosimulator.monitorrepository.MonitorRepository;
import org.palladiosimulator.monitorrepository.MonitorRepositoryPackage;
import org.palladiosimulator.pcmmeasuringpoint.PcmmeasuringpointPackage;
import org.palladiosimulator.simulizar.modelobserver.AbstractModelObserver;
import org.palladiosimulator.simulizar.runtimestate.AbstractSimuLizarRuntimeState;

public class ResponseTimeMonitorRepositorySyncer extends AbstractModelObserver<MonitorRepository> {
	protected AdditionalResponseTimeRecorderFacade recorderFacade;
	protected Set<String> COMPATIBLE_RESPONSE_TIME_METRIC_IDS = new HashSet<>(
			Arrays.asList(
					MetricDescriptionConstants.RESPONSE_TIME_METRIC.getId()));
	
	@Override
	public void initialize(AbstractSimuLizarRuntimeState runtimeState) {
		Optional.ofNullable(runtimeState.getModelAccess().getMonitorRepositoryModel())
			.ifPresent(repo -> initialize(repo, runtimeState));			
	}
	
	@Override
	public void initialize(MonitorRepository model, AbstractSimuLizarRuntimeState runtimeState) {
		super.initialize(model, runtimeState);
		
		recorderFacade = new AdditionalResponseTimeRecorderFacade(runtimeState);
	}
	
	private void processMeasurementSpecification(MeasurementSpecification spec) {
		if (COMPATIBLE_RESPONSE_TIME_METRIC_IDS.contains(spec.getMetricDescription().getId())) {
			recorderFacade.setupResponseTimeRecorder(spec);
		}
	}
	
	private void processMeasurementSpecificationRemoval(MeasurementSpecification spec) {
		if (COMPATIBLE_RESPONSE_TIME_METRIC_IDS.contains(spec.getMetricDescription().getId())) {
			recorderFacade.unregisterResponseTimeRecorder(spec);
		}
	}
	
	@Override
	protected void add(Notification notification) {
		if (MonitorRepositoryPackage.eINSTANCE.getMonitorRepository_Monitors().equals(notification.getFeature())) {
			Monitor newMonitor = (Monitor) notification.getNewValue();
			if (PcmmeasuringpointPackage.eINSTANCE.getUsageScenarioMeasuringPoint().isInstance(newMonitor.getMeasuringPoint())) {
				newMonitor.getMeasurementSpecifications().stream()
					.forEach(this::processMeasurementSpecification);
			}
		}
		if (MonitorRepositoryPackage.eINSTANCE.getMonitor_MeasurementSpecifications().equals(notification.getFeature())) {
			MeasurementSpecification spec = (MeasurementSpecification) notification.getNewValue();
			if (PcmmeasuringpointPackage.eINSTANCE.getUsageScenarioMeasuringPoint().isInstance(spec.getMonitor().getMeasuringPoint())) {
				processMeasurementSpecification(spec);
			}
		}
		super.add(notification);
	}
	
	@Override
	protected void remove(Notification notification) {
		if (MonitorRepositoryPackage.eINSTANCE.getMonitorRepository_Monitors().equals(notification.getFeature())) {
			Monitor newMonitor = (Monitor) notification.getOldValue();
			if (PcmmeasuringpointPackage.eINSTANCE.getUsageScenarioMeasuringPoint().isInstance(newMonitor.getMeasuringPoint())) {
				newMonitor.getMeasurementSpecifications().stream()
					.forEach(this::processMeasurementSpecificationRemoval);
			}
		}
		if (MonitorRepositoryPackage.eINSTANCE.getMonitor_MeasurementSpecifications().equals(notification.getFeature())) {
			MeasurementSpecification spec = (MeasurementSpecification) notification.getNewValue();
			if (PcmmeasuringpointPackage.eINSTANCE.getUsageScenarioMeasuringPoint().isInstance(spec.getMonitor().getMeasuringPoint())) {
				processMeasurementSpecificationRemoval(spec);
			}
		}
		super.remove(notification);
	}
}
