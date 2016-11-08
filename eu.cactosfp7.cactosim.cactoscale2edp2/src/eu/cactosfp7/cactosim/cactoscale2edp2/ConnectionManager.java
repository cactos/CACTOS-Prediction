package eu.cactosfp7.cactosim.cactoscale2edp2;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.HConstants;
import org.apache.hadoop.hbase.client.Connection;
import org.apache.hadoop.hbase.client.ConnectionFactory;

public class ConnectionManager {

    private Connection connection;
    
    private static ConnectionManager INSTANCE = new ConnectionManager();
    
    private ConnectionManager() {
        
    }
    
    public static ConnectionManager getInstance() {
        return INSTANCE;
    }

    public Connection getConnection() {
        if(this.connection == null || this.connection.isClosed()) {
            this.establishConnection();
        }
        return this.connection;
    }
    
    private boolean establishConnection() {
        final Configuration config = this.createConfiguration();
        boolean successfulConnection = false;
        try {
            connection = ConnectionFactory.createConnection(config);
            successfulConnection = true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return successfulConnection;
    }
    
    private Configuration createConfiguration() {
        Configuration config = HBaseConfiguration.create();
        Settings settings = Settings.getSettings();
        config.set(HConstants.ZOOKEEPER_QUORUM, settings.getProperty(HConstants.ZOOKEEPER_QUORUM));
        config.set(HConstants.ZOOKEEPER_CLIENT_PORT, settings.getProperty(HConstants.ZOOKEEPER_CLIENT_PORT));
        config.set("hbase.client.retries.number", Integer.toString(1));
        config.set("zookeeper.session.timeout", Integer.toString(60000));
        config.set("zookeeper.recovery.retry", Integer.toString(1));
        return config;
    }
}
