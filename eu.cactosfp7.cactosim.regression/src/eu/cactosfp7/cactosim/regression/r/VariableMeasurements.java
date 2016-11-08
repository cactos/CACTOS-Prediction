package eu.cactosfp7.cactosim.regression.r;

import javax.measure.quantity.Quantity;
import javax.measure.unit.Unit;

public class VariableMeasurements extends Measurements {
    
    public VariableMeasurements(String name, Unit<? extends Quantity> unit, double[] values) {
        super(name, unit, values);        
    }    
}
