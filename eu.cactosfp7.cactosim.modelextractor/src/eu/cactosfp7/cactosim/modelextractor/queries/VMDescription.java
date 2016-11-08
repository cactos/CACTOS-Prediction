package eu.cactosfp7.cactosim.modelextractor.queries;

public class VMDescription extends IntervalBasedDescription {

    private String initialPlacement;
    private String name;
    private String uuid;

    public VMDescription(String uuid, long timestamp) {
        super(timestamp);
        this.uuid = uuid;
    }

    public void addInitialPlacement(String nodeName) {
        this.initialPlacement = nodeName;
    }
    
    public String getInitialPlacement() {
        return this.initialPlacement;
    }

    public void addName(String initialPlacementHw) {
        this.name = initialPlacementHw;
    }
    
    public String getName() {
        return this.name;
    }

    public String getUuid() {
        return this.uuid;
    }

}
