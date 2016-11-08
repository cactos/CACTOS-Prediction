package eu.cactosfp7.cactosim.loadbalancerscalingrecorder;

import java.util.function.Supplier;

import javax.measure.Measure;
import javax.measure.quantity.Duration;
import javax.measure.unit.Unit;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.palladiosimulator.measurementframework.MeasuringValue;
import org.palladiosimulator.measurementframework.TupleMeasurement;
import org.palladiosimulator.measurementframework.listener.MeasurementSource;
import org.palladiosimulator.metricspec.constants.MetricDescriptionConstants;
import org.palladiosimulator.pcm.core.entity.EntityPackage;
import org.palladiosimulator.pcm.repository.BasicComponent;
import org.palladiosimulator.pcm.repository.RepositoryPackage;

import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ScalableVMImageConnectorCorrespondence;

public class ConnectorCorrespondenceMeasurementSource extends MeasurementSource implements Adapter {

	private BasicComponent component;
	private Notifier target;
	private Supplier<Measure<Double, Duration>> simulationTimeProvider;
	
	public ConnectorCorrespondenceMeasurementSource(ScalableVMImageConnectorCorrespondence correspondence,
			Supplier<Measure<Double, Duration>> simulationTimeProvider) {
		super(MetricDescriptionConstants.NUMBER_OF_RESOURCE_CONTAINERS_OVER_TIME);
		this.component = correspondence.getPalladio();
		this.simulationTimeProvider = simulationTimeProvider;
	}

	@Override
	public void notifyChanged(Notification notification) {
		if (EntityPackage.eINSTANCE.getInterfaceRequiringEntity_RequiredRoles_InterfaceRequiringEntity()
				.equals(notification.getFeature())) {
			if (notification.getEventType() == Notification.ADD
					|| notification.getEventType() == Notification.REMOVE) {
				takeNewMeasurement();
			};
		}
	}
	
	public void takeNewMeasurement() {
		MeasuringValue val = new TupleMeasurement(
				MetricDescriptionConstants.NUMBER_OF_RESOURCE_CONTAINERS_OVER_TIME,
				Measure.valueOf(component.getRequiredRoles_InterfaceRequiringEntity().stream()
						.filter(RepositoryPackage.eINSTANCE.getOperationRequiredRole()::isInstance)
						.count(), Unit.ONE),
				simulationTimeProvider.get());
		this.notifyMeasurementSourceListener(val);
	}

	@Override
	public Notifier getTarget() {
		return this.target;
	}

	@Override
	public void setTarget(Notifier newTarget) {
		this.target = newTarget;
	}

	@Override
	public boolean isAdapterForType(Object type) {
		return false;
	}

}
