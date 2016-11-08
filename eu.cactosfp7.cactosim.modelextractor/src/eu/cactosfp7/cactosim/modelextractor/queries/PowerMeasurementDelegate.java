package eu.cactosfp7.cactosim.modelextractor.queries;

import java.io.IOException;
import java.util.List;

import javax.measure.quantity.Power;

import org.apache.hadoop.hbase.Cell;
import org.apache.hadoop.hbase.client.Connection;
import org.vedantatree.expressionoasis.exceptions.ExpressionEngineException;

import eu.cactosfp7.cactosim.modelextractor.settings.Settings;
import eu.cactosfp7.cactosim.modelextractor.util.Constants;
import eu.cactosfp7.cactosim.regression.r.AbstractNonLinearRegression;
import eu.cactosfp7.cactosim.regression.r.DoubleModelParameter;
import eu.cactosfp7.infrastructuremodels.physicaldc.core.AbstractNode;
import eu.cactosfp7.infrastructuremodels.physicaldc.power.binding.PowerModelBinding;

public class PowerMeasurementDelegate implements IPowerMeasurementQuery {
    
    private IPowerMeasurementQuery query;
    
    public PowerMeasurementDelegate(Connection connection) {
        if(Settings.getSettings().getProperty(Constants.CLOUD_MIDDLEWARE).equals(Constants.FCO_NAME)) {
            query = new FCOPowerMeasurementQuery(connection);
        } else {
            query = new OpenStackPowerMeasurementQuery(connection);
        }
    }

    @Override
    public void addNodeMeasurement(NodeOverview overview, Cell cell) {
        query.addNodeMeasurement(overview, cell);
    }

    @Override
    public NodeOverview getNodeOverview() throws IOException {
        return query.getNodeOverview();
    }

    @Override
    public void addCPUMetric(NodeDescription description) {
        query.addCPUMetric(description);
    }

    @Override
    public AbstractNonLinearRegression<Power> constructPowerModel(NodeDescription description, PowerModelBinding binding, 
            long lowerBound, long upperBound)
            throws IOException, ExpressionEngineException {
        return query.constructPowerModel(description, binding, lowerBound, upperBound);
    }

    @Override
    public void setPowerBinding(AbstractNonLinearRegression<Power> regression, PowerModelBinding binding,
            List<DoubleModelParameter<Power>> modelParameters) {
        query.setPowerBinding(regression, binding, modelParameters);        
    }

    @Override
    public NodeDescription selectNode(NodeOverview overview, AbstractNode node) {
        return query.selectNode(overview, node);
    }

}
