package eu.cactosfp7.cactosim.cactoscale2edp2.data;

import java.util.ArrayList;
import java.util.List;

public class HistoricMeasurements {

    private String dataCenterName;
    private Interval interval;
    private List<HistoricMeasure> historicMeasures = new ArrayList<HistoricMeasure>();

    public HistoricMeasurements(String dataCenterName, Interval interval) {
        this.dataCenterName = dataCenterName;
        this.interval = interval;
    }

    public String getDCName() {
        return this.dataCenterName;
    }

    public Interval getInterval() {
        return this.interval;
    }

    public List<HistoricMeasure> getHistoricMeasures() {
        return historicMeasures;
    }

}
