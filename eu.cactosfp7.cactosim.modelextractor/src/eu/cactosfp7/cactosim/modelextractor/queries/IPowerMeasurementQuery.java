package eu.cactosfp7.cactosim.modelextractor.queries;

import java.io.IOException;
import java.util.List;

import javax.measure.quantity.Power;

import org.apache.hadoop.hbase.Cell;
import org.apache.hadoop.hbase.client.Connection;
import org.vedantatree.expressionoasis.exceptions.ExpressionEngineException;

import eu.cactosfp7.cactosim.regression.r.AbstractNonLinearRegression;
import eu.cactosfp7.cactosim.regression.r.DoubleModelParameter;
import eu.cactosfp7.infrastructuremodels.physicaldc.core.AbstractNode;
import eu.cactosfp7.infrastructuremodels.physicaldc.power.binding.PowerModelBinding;

public interface IPowerMeasurementQuery {

    void addNodeMeasurement(NodeOverview overview, Cell cell);

    NodeOverview getNodeOverview() throws IOException;

    void addCPUMetric(NodeDescription description);

    AbstractNonLinearRegression<Power> constructPowerModel(NodeDescription description, PowerModelBinding binding,
            long lowerBound, long upperBound)
            throws IOException, ExpressionEngineException;

    void setPowerBinding(AbstractNonLinearRegression<Power> regression, PowerModelBinding binding,
            List<DoubleModelParameter<Power>> modelParameters);

    NodeDescription selectNode(NodeOverview overview, AbstractNode node);

}