package eu.cactosfp7.cactosim.cactoscale2edp2;
import java.util.Dictionary;

import org.osgi.service.cm.ConfigurationException;
import org.osgi.service.cm.ManagedService;

public class Settings implements ManagedService {

    public static final String IN_FCO_MODE = "Cloud_Middleware";
    public static final Object FCO_MODE = "FCO";
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
