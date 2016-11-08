package eu.cactosfp7.cactosim.modelextractor.queries;

public class NodeOverview extends Overview<NodeDescription> {

    public void addNodeMeasurement(String name, long timestamp) {
        NodeDescription description = descriptions.get(name);
        if (description == null) {
            descriptions.put(name, new NodeDescription(name, timestamp));
        }
        descriptions.get(name).addMeasurement(timestamp);
        
        addMeasurement(timestamp);
    }

}
