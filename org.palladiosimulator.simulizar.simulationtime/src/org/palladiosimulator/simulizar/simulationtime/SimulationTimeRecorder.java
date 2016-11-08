package org.palladiosimulator.simulizar.simulationtime;

import org.palladiosimulator.monitorrepository.MeasurementSpecification;
import org.palladiosimulator.runtimemeasurement.RuntimeMeasurementModel;
import org.palladiosimulator.simulizar.metrics.PRMRecorder;

public class SimulationTimeRecorder extends PRMRecorder {

    public SimulationTimeRecorder(RuntimeMeasurementModel prmAccess, MeasurementSpecification measurementSpecification) {
        super(prmAccess, measurementSpecification);
    }
    
    public void newMeasurementAvailable(double newValue) {
        this.updateMeasurementValue(newValue);
    }

}
