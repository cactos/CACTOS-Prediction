package eu.cactosfp7.cactosim.modelextractor.settings;

import java.io.IOException;
import java.util.Dictionary;

import org.apache.hadoop.hbase.client.Connection;
import org.osgi.service.cm.ConfigurationException;
import org.osgi.service.cm.ManagedService;

import eu.cactosfp7.cactosim.modelextractor.connection.ConnectionManager;
import eu.cactosfp7.cactosim.modelextractor.queries.BlackBoxVmQuery;
import eu.cactosfp7.cactosim.modelextractor.queries.VMDescription;
import eu.cactosfp7.cactosim.modelextractor.queries.VmOverview;
import eu.cactosfp7.infrastructuremodels.logicaldc.core.VirtualMachine;

public class Settings implements ManagedService {

    private static Settings INSTANCE;
    private Dictionary<String, ?> properties;
    
    public Settings() {
        INSTANCE = this;
    }
    
    public static Settings getSettings() {
        return INSTANCE;
    }
    
    @Override
    public void updated(Dictionary<String, ?> properties) throws ConfigurationException {
        this.properties = properties;
    }

    public String getProperty(String property) {
        return this.properties.get(property).toString();
    }

}
