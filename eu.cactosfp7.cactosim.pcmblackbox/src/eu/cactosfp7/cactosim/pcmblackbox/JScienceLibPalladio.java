package eu.cactosfp7.cactosim.pcmblackbox;

import javax.measure.Measure;
import javax.measure.unit.Unit;

public class JScienceLibPalladio {
    public boolean isCompatibleWith(Unit<?> pcmUnit, String cactosUnitString) {
        return Unit.valueOf(cactosUnitString).isCompatible(pcmUnit);
    }
    
    public Measure<?,?> createEJSMeasureFromDoubleAndUnit(double value, String unitName) {
        Unit<?> unit = Unit.valueOf(unitName);
        return Measure.valueOf(value, unit);
    }
}
