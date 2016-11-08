/**
 * 
 */
package eu.cactosfp7.cactosim.modelextractor.headless;

import org.eclipse.emf.cdo.net4j.CDONet4jSession;
import java.net.UnknownHostException;
import org.eclipse.emf.cdo.net4j.CDONet4jSessionConfiguration;
import org.eclipse.emf.cdo.net4j.CDONet4jUtil;
import org.eclipse.net4j.Net4jUtil;
import org.eclipse.net4j.connector.IConnector;
import org.eclipse.net4j.tcp.TCPUtil;
import org.eclipse.net4j.util.container.IPluginContainer;
import org.eclipse.net4j.util.lifecycle.ILifecycle;
import org.eclipse.net4j.util.lifecycle.LifecycleEventAdapter;
import org.eclipse.net4j.util.lifecycle.LifecycleUtil;
import org.eclipse.net4j.util.security.IPasswordCredentialsProvider;
import org.eclipse.net4j.util.security.PasswordCredentialsProvider;


/**
 * Singleton class promoting reuse of connection to CDO server.
 * 
 * @author svorobs2
 *
 */
public class CDOSessionControl {
	private CDONet4jSession session;
	private static CDOSessionControl instance;
	
	private CDOSessionControl(){}
	
	
    public static CDOSessionControl getInstance(){
        if(instance == null){
            instance = new CDOSessionControl();
        }
        return instance;
    }
	
	
	/**
	 * Create CDO session by using name of the repository (usually "repo1") and CDO URL.
	 * Session is reused or started if null.
	 * 
	 * @param repoName name of the repository
	 * @param CDOAddress URL for the CDO server
	 * @return CDONet4jSession session that can be used for read-only view or r/w transaction creation
	 */
	public CDONet4jSession getSession(String CDOAddress,String repoName, String user,String password) throws UnknownHostException{
		if (this.session==null){
			
		this.session = getCDOSession(CDOAddress,repoName,user,password);
		
		//this.session.options().setGeneratedPackageEmulationEnabled(true);
		

		}
		return this.session;
	}
	

	/**
	 * Create CDO session by using name of the repository (usually "repo1"), CDO URL , username and password
	 * 
	 * @param serverAddress
	 * @param repositoryName
	 * @param user
	 * @param password
	 * @return
	 */
	public static CDONet4jSession getCDOSession(final String serverAddress, final String repositoryName, final String user, final String password) throws UnknownHostException {
		Net4jUtil.prepareContainer(IPluginContainer.INSTANCE); // Register Net4j factories
        TCPUtil.prepareContainer(IPluginContainer.INSTANCE); // Register TCP factories
	    CDONet4jUtil.prepareContainer(IPluginContainer.INSTANCE); // Register CDO factories
	    LifecycleUtil.activate(IPluginContainer.INSTANCE);
        
	    final IConnector connector = TCPUtil.getConnector(IPluginContainer.INSTANCE, serverAddress);
 
	    IPasswordCredentialsProvider credentialsProvider = new PasswordCredentialsProvider(user, password);
	    
        final CDONet4jSessionConfiguration config = CDONet4jUtil
                .createNet4jSessionConfiguration();
        config.setConnector(connector);
        config.setRepositoryName(repositoryName);
        config.setCredentialsProvider(credentialsProvider);
 
        final CDONet4jSession session = config.openNet4jSession();
		session.addListener(new LifecycleEventAdapter() {
			@Override
			protected void onDeactivated(ILifecycle lifecycle) {
			connector.close();
			}
		});
		//session.getPackageRegistry().putEPackage(OptimisationplanPackage.eINSTANCE);
		
		return session;
	}


}
