package org.palladiosimulator.simulizar.simulationtime;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.palladiosimulator.metricspec.constants.MetricDescriptionConstants;
import org.palladiosimulator.monitorrepository.MeasurementSpecification;
import org.palladiosimulator.monitorrepository.MonitorRepositoryPackage;
import org.palladiosimulator.monitorrepository.TimeDriven;
import org.palladiosimulator.monitorrepository.TimeDrivenAggregation;
import org.palladiosimulator.monitorrepository.util.MonitorRepositorySwitch;
import org.palladiosimulator.runtimemeasurement.RuntimeMeasurementModel;
import org.palladiosimulator.simulizar.interpreter.listener.AbstractRecordingProbeFrameworkListenerDecorator;
import org.palladiosimulator.simulizar.simulationevents.PeriodicallyTriggeredSimulationEntity;

import de.uka.ipd.sdq.simucomframework.model.SimuComModel;
import de.uka.ipd.sdq.simulation.abstractsimengine.ISimulationControl;

public class SimulationTimeProbeFrameworkListenerDecorator extends AbstractRecordingProbeFrameworkListenerDecorator {
    public class TemporalCharacterizationUpdateListener extends AdapterImpl {
	private PeriodicallyTriggeredSimulationEntity simulationEntity;
	
	protected TemporalCharacterizationUpdateListener(PeriodicallyTriggeredSimulationEntity simulationEntity) {
	    this.simulationEntity = simulationEntity;
	}
	
	@Override
	public void notifyChanged(Notification msg) {
	    if (msg.getFeature().equals(MonitorRepositoryPackage.eINSTANCE.getTimeDriven_WindowLength())
		    && msg.getNewDoubleValue() != msg.getOldDoubleValue()) {
		double nextTime = simulationEntity.getSimulationTimeOfNextEventTrigger() - msg.getOldDoubleValue() + msg.getNewDoubleValue() 
			- SimulationTimeProbeFrameworkListenerDecorator.this.getProbeFrameworkListener().getSimuComModel().getSimulationControl().getCurrentSimulationTime();
		simulationEntity.setDelayAndReinitialize(Math.max(nextTime, 0.0), msg.getNewDoubleValue());
	    }
	    super.notifyChanged(msg);
	}
    }
    
    @Override
    public void registerMeasurements() {
        super.registerMeasurements();
        initTimeMeasurements();
    }
    
    private void initTimeMeasurements() {
        Collection<MeasurementSpecification> measurementSpecificationsForMetricDescription = getProbeFrameworkListener().getMeasurementSpecificationsForMetricDescription(MetricDescriptionConstants.POINT_IN_TIME_METRIC);
        //RegisterCalculatorFactoryDecorator calcFactory = RegisterCalculatorFactoryDecorator.class
        //        .cast(getProbeFrameworkListener().getCalculatorFactory());
        
        RuntimeMeasurementModel runtimeMeasurementModel = this.getProbeFrameworkListener().getRuntimeMeasurementModel();
        final SimuComModel model = this.getProbeFrameworkListener().getSimuComModel();
        final ISimulationControl simulationControl = model.getSimulationControl();
        for(MeasurementSpecification spec : measurementSpecificationsForMetricDescription) {
            final SimulationTimeRecorder simulationTimeRecorder = new SimulationTimeRecorder(runtimeMeasurementModel, spec);
        	
            new MonitorRepositorySwitch<Void>() {
            
            @Override
        	public Void caseTimeDriven(TimeDriven object) {
        	    setUpSimulationEntity(object.getWindowIncrement(), object);
        	    return null;
        	};
        	
        	private void setUpSimulationEntity(double initialDelay, TimeDriven timeDriven) {
        	    PeriodicallyTriggeredSimulationEntity entity = new PeriodicallyTriggeredSimulationEntity(model, initialDelay, timeDriven.getWindowLength()) {
                        @Override
                        protected void triggerInternal() {
                            simulationTimeRecorder.newMeasurementAvailable(simulationControl.getCurrentSimulationTime());
                        }
                    };
                    timeDriven.eAdapters().add(new TemporalCharacterizationUpdateListener(entity));
        	}
            }.doSwitch(spec.getProcessingType());
        }
    }
}
