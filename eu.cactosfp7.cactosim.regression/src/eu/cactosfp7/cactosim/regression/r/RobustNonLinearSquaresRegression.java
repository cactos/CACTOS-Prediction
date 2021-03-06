package eu.cactosfp7.cactosim.regression.r;

import java.util.Collections;
import java.util.List;

import javax.measure.quantity.Quantity;

import org.vedantatree.expressionoasis.expressions.Expression;

public class RobustNonLinearSquaresRegression<Q extends Quantity> extends AbstractNonLinearRegression<Q> {
    
    public RobustNonLinearSquaresRegression(Expression expression, List<VariableMeasurements> measurements,
            List<ConstantModelParameter<?, Q>> constants, TargetMeasurements targetMetric) {
        super(expression, measurements, constants, targetMetric);
    }


    private static final String R_COMMAND_PREFIX = "nlrob(";
    private static final String R_PACKAGE_NAME = "robustbase";

    @Override
    public String getFunctionName() {
        return R_COMMAND_PREFIX;
    }
    
    
    @Override
    protected Iterable<String> getRequiredPackages() {
        return Collections.singletonList(R_PACKAGE_NAME);
    }
}
