package eu.cactosfp7.cactosim.regression.r;

import javax.measure.quantity.Quantity;
import javax.measure.unit.Unit;

public class TargetMeasurements extends Measurements {

    public TargetMeasurements(String name, Unit<? extends Quantity> unit, double[] values) {
        super(name, unit, values);
    }

}
