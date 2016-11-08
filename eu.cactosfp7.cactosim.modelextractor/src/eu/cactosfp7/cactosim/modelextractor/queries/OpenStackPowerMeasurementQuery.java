package eu.cactosfp7.cactosim.modelextractor.queries;

import org.apache.hadoop.hbase.Cell;
import org.apache.hadoop.hbase.CellUtil;
import org.apache.hadoop.hbase.client.Connection;
import org.apache.hadoop.hbase.util.Bytes;

public class OpenStackPowerMeasurementQuery extends AbstractPowerMeasurementQuery {
    
    public OpenStackPowerMeasurementQuery(Connection conn) {
        super(conn);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void addNodeMeasurement(NodeOverview overview, Cell cell) {
        overview.addNodeMeasurement(Bytes.toString(CellUtil.cloneValue(cell)), cell.getTimestamp());
    }
}
