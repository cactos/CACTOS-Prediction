package org.palladiosimulator.simulizar.arrivalrate;

import java.util.Collection;
import java.util.Optional;

import org.eclipse.emf.common.notify.Notification;
import org.palladiosimulator.edp2.util.MetricDescriptionUtility;
import org.palladiosimulator.metricspec.constants.MetricDescriptionConstants;
import org.palladiosimulator.monitorrepository.Aggregation;
import org.palladiosimulator.monitorrepository.MeasurementSpecification;
import org.palladiosimulator.monitorrepository.Monitor;
import org.palladiosimulator.monitorrepository.MonitorRepository;
import org.palladiosimulator.monitorrepository.MonitorRepositoryPackage;
import org.palladiosimulator.pcmmeasuringpoint.PcmmeasuringpointPackage;
import org.palladiosimulator.simulizar.modelobserver.AbstractModelObserver;
import org.palladiosimulator.simulizar.runtimestate.AbstractSimuLizarRuntimeState;

public class ArrivalRateMonitorRepositorySyncer extends AbstractModelObserver<MonitorRepository> {
	protected ConcurrentExecutingInvocationsRecorderFacade recorderFacade;
	
	@Override
	public void initialize(AbstractSimuLizarRuntimeState runtimeState) {
		Optional.ofNullable(runtimeState.getModelAccess().getMonitorRepositoryModel())
			.ifPresent(repo -> initialize(repo, runtimeState));			
	}
	
	@Override
	public void initialize(MonitorRepository model, AbstractSimuLizarRuntimeState runtimeState) {
		super.initialize(model, runtimeState);
		
		recorderFacade = new ConcurrentExecutingInvocationsRecorderFacade(runtimeState);
	
		model.getMonitors().stream()
			.filter(monitor -> PcmmeasuringpointPackage.eINSTANCE.getAssemblyOperationMeasuringPoint().isInstance(monitor.getMeasuringPoint()))
			.map(Monitor::getMeasurementSpecifications).flatMap(Collection::stream)
			.filter(spec -> !(spec instanceof Aggregation))
			.forEach(this::processMeasurementSpecification);
	}
	
	private void processMeasurementSpecification(MeasurementSpecification spec) {
		if (MetricDescriptionUtility.metricDescriptionIdsEqual(
				MetricDescriptionConstants.REQUEST_ARRIVAL_RATE_TUPLE, spec.getMetricDescription())) {
			recorderFacade.setupRequestArrivalRateRecorder(spec);
		} else if (MetricDescriptionUtility.metricDescriptionIdsEqual(
				MetricDescriptionConstants.RESPONSE_ARRIVAL_RATE_TUPLE, spec.getMetricDescription())) {
			recorderFacade.setupResponseArrivalRateRecorder(spec);			
		} else if (MetricDescriptionUtility.metricDescriptionIdsEqual(
				MetricDescriptionConstants.NUMBER_OF_CONCURRENTLY_EXECUTING_INVOCATIONS_TUPLE, spec.getMetricDescription())) {
			recorderFacade.setUpConcurrentlyInvocationsRecorder(spec);			
		}
	}
	
	private void processMeasurementSpecificationRemoval(MeasurementSpecification spec) {
		if (MetricDescriptionUtility.metricDescriptionIdsEqual(
				MetricDescriptionConstants.REQUEST_ARRIVAL_RATE_TUPLE, spec.getMetricDescription())) {
			recorderFacade.unregisterRequestArrivalRateRecorder(spec);
		} else if (MetricDescriptionUtility.metricDescriptionIdsEqual(
				MetricDescriptionConstants.RESPONSE_ARRIVAL_RATE_TUPLE, spec.getMetricDescription())) {
			recorderFacade.unregisterResponseArrivalRateRecorder(spec);			
		} else if (MetricDescriptionUtility.metricDescriptionIdsEqual(
				MetricDescriptionConstants.NUMBER_OF_CONCURRENTLY_EXECUTING_INVOCATIONS_TUPLE, spec.getMetricDescription())) {
			throw new RuntimeException("Runtime deletions of Number of Concurrently Executing Invocation Measurings is not implemented");	
		}
	}
	
	
	@Override
	protected void add(Notification notification) {
		if (MonitorRepositoryPackage.eINSTANCE.getMonitorRepository_Monitors().equals(notification.getFeature())) {
			Monitor newMonitor = (Monitor) notification.getNewValue();
			if (PcmmeasuringpointPackage.eINSTANCE.getAssemblyOperationMeasuringPoint().isInstance(newMonitor.getMeasuringPoint())) {
				newMonitor.getMeasurementSpecifications().stream()
					.filter(spec -> !(spec instanceof Aggregation))
					.forEach(this::processMeasurementSpecification);
			}
		}
		if (MonitorRepositoryPackage.eINSTANCE.getMonitor_MeasurementSpecifications().equals(notification.getFeature())) {
			MeasurementSpecification spec = (MeasurementSpecification) notification.getNewValue();
			if (PcmmeasuringpointPackage.eINSTANCE.getAssemblyOperationMeasuringPoint().isInstance(spec.getMonitor().getMeasuringPoint()) 
					&& !(spec instanceof Aggregation)) {
				processMeasurementSpecification(spec);
			}
		}
		super.add(notification);
	}
	
	@Override
	protected void remove(Notification notification) {
		if (MonitorRepositoryPackage.eINSTANCE.getMonitorRepository_Monitors().equals(notification.getFeature())) {
			Monitor newMonitor = (Monitor) notification.getOldValue();
			if (PcmmeasuringpointPackage.eINSTANCE.getAssemblyOperationMeasuringPoint().isInstance(newMonitor.getMeasuringPoint())) {
				newMonitor.getMeasurementSpecifications().stream()
					.filter(spec -> !(spec instanceof Aggregation))
					.forEach(this::processMeasurementSpecificationRemoval);
			}
		}
		if (MonitorRepositoryPackage.eINSTANCE.getMonitor_MeasurementSpecifications().equals(notification.getFeature())) {
			MeasurementSpecification spec = (MeasurementSpecification) notification.getNewValue();
			if (PcmmeasuringpointPackage.eINSTANCE.getAssemblyOperationMeasuringPoint().isInstance(spec.getMonitor().getMeasuringPoint()) 
					&& !(spec instanceof Aggregation)) {
				processMeasurementSpecificationRemoval(spec);
			}
		}
		super.remove(notification);
	}
}
