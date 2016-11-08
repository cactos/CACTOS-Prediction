package eu.cactosfp7.cactosim.modelextractor.headless;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import eu.cactosfp7.cactosim.modelextractor.headless.LoadEmfFromDiskLinkedRef;
import javax.measure.quantity.Power;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

import org.apache.hadoop.hbase.client.Connection;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.vedantatree.expressionoasis.exceptions.ExpressionEngineException;

import com.thoughtworks.xstream.XStream;

import eu.cactosfp7.cactosim.experimentscenario.ExperimentScenarioTimeLine;
import eu.cactosfp7.cactosim.modelextractor.connection.ConnectionManager;
import eu.cactosfp7.cactosim.modelextractor.queries.BlackBoxVmQuery;
import eu.cactosfp7.cactosim.modelextractor.queries.VMDescription;
import eu.cactosfp7.cactosim.modelextractor.queries.VmOverview;
import eu.cactosfp7.cactosim.modelextractor.util.Interval;
import eu.cactosfp7.infrastructuremodels.logicaldc.core.Hypervisor;
import eu.cactosfp7.infrastructuremodels.logicaldc.core.LogicalDCModel;
import eu.cactosfp7.infrastructuremodels.physicaldc.power.binding.PowerModelBinding;


public class AppModelExtractorHeadless implements IApplication {
	
    /**
     * {@inheritDoc}
     */
    @Override
    public Object start(final IApplicationContext context) throws Exception {
    	final String[] args = (String[]) context.getArguments().get("application.args");
    	
    	try{
    		System.out.println(args[0]);
    	}catch(Exception e){
    		System.out.println("Error: No arguments specified." +e.getMessage()+"\n");
    		help();
    		System.exit(0);
    	}
    	
    	switch(args[0]){
    	case "cdo":
			String username = args[1];
			String password = args[2];
			//"omistack-vm144.e-technik.uni-ulm.de:2036"
			String CDOAddress = args[3];
			String CDORepoName = "repo1";
			// "uulm-testbed"
			String CDOResourceRoot = args[4];
			String localModelsFilename = "dummy unused";
			
			this.getCdo(localModelsFilename, CDOAddress, CDORepoName, CDOResourceRoot, username, password);
			
	        return IApplication.EXIT_OK;
	        
    	case "app-list":
       		
    		long upperBound;
    		long lowerBound;
    		String ldcmFilePath;
    		try{
    			upperBound = Long.parseLong(args[1]);
    			lowerBound = Long.parseLong(args[2]);
    			ldcmFilePath = args[3];
    			
    		}catch(Exception e){
    			System.out.println("##No range specified taking values of the last 10min##\n");
    			ldcmFilePath = args[1];
        		upperBound = System.currentTimeMillis();
        		lowerBound = upperBound - 600000;//10 min back
    		}
    		

    		//load ldcm to remove apps that has non existing nodes
    		LoadEmfFromDiskLinkedRef modelLoader = new LoadEmfFromDiskLinkedRef();
    		LogicalDCModel ldcmodel = null;
    		try {
    			ldcmodel = (LogicalDCModel)modelLoader.loadData(ldcmFilePath);
    		} catch (FileNotFoundException e1) {
    			// TODO Auto-generated catch block
    			e1.printStackTrace();
    		} catch (IOException e1) {
    			// TODO Auto-generated catch block
    			e1.printStackTrace();
    		}

    		this.getAppList(upperBound, lowerBound, ldcmodel);
    		
            return IApplication.EXIT_OK;
            
    	case "add-apps":
    		String ldcModelFilePath;
			String vmOverviewFilePath;
    		try{
    			ldcModelFilePath = args[1];
    			vmOverviewFilePath = args[2];
    			
        		this.addApps(ldcModelFilePath,vmOverviewFilePath);
        		
    		}catch (Exception e){
    			e.printStackTrace();
    		}

            return IApplication.EXIT_OK;
            
    	default :
    		System.out.println("##Help Section##\n");
			help();
			
			
			return IApplication.EXIT_OK;
    	
    	}

    }

	private static void help() {
		System.out.println("Welcome to User Guide:\n "
				+ "1. Get CDO models:"
				+ "AppModelExtractorHeadless <cdo> <password> <cdoUrl> <cdoFolder> <serialisedFileName>"
				+ "\n Example:"
				+ "\n AppModelExtractorHeadless cdo admin passwd https://cdo.server.ie:2342 /dcModels localModels"
				+ "\n"
				+ "2. Get application list:"
				+ "AppModelExtractorHeadless <app-list> <startUnixTime> <stopUnixTime>"
				+ "\n Example:"
				+ "\n AppModelExtractorHeadless app-list 1232412 2143422"
				+ "\n Tip: empty parameters will retrieve application models list for the last 10 min"
				+ "\n"
				+ "3. AppModelExtractorHeadless <add-apps> <ldcModelFilePath> <vmOverviewFilePath>");
	}
	
	
	
	private void getCdo(String localModelsFilename, String CDOAddress, String CDORepoName, String CDOResourceRoot, String username, String password){
		
		try {			
			CDOtoWorkspaceConverter cdoConverter = new CDOtoWorkspaceConverter(localModelsFilename, CDOAddress, CDORepoName, CDOResourceRoot, username, password);
			cdoConverter.CDOtoWorkspace();
			System.out.println("\n##Models Retrieved, check your local folder##\n");
		} catch (Exception e) {
			System.out.println("\n##Model Retrieval Error##\nCheck your info");
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		}
	}
	
	private void getAppList(long upperBound, long lowerBound, LogicalDCModel ldcmodel){
		
		//open connection
		Connection connection = null;
        try {
        	connection = ConnectionManager.getInstance().getConnection();
            BlackBoxVmQuery bbVmQuery = new BlackBoxVmQuery();
            VmOverview overview = bbVmQuery.getVmOverview(connection, lowerBound, upperBound);
            //copy the map values to remove
            Map<String, VMDescription> vmDescriptions = new HashMap<String, VMDescription> (overview.getDescriptions());
            
            System.out.println( "List retrieved, starting cleaning\n");
            //remove non existing nodes 
            for(String key : vmDescriptions.keySet()){
            	
            	boolean contains=false;
                for(Hypervisor hv: ldcmodel.getHypervisors()){
                	if(hv.getNode().getName().equals(vmDescriptions.get(key).getInitialPlacement())){
                		contains =true;
                	}
            
                }
                //if node name not found in the ldcm model we adding to the removal list
                if(contains==false){
                	//
                	overview.getDescriptions().remove(key);
                
                }
            	
            }
                        
            
            XStream xstream = new XStream();
            xstream.alias("vmoverview", VmOverview.class);
            xstream.alias("vmdescription", VMDescription.class);
            
            String xml = xstream.toXML(overview);

            PrintWriter out = new PrintWriter("vmAppList.xml");
            out.println(xml);
            out.close();
            
            for(String key : vmDescriptions.keySet()){
            	System.out.println( "\nEntry ID:"+key);
            	System.out.println( "VM UUID:"+ vmDescriptions.get(key).getUuid());
            	System.out.println( "VM Name:"+ vmDescriptions.get(key).getName());
            	System.out.println( "VM Initial Placement Node:"+ vmDescriptions.get(key).getInitialPlacement());
            }

        } catch (IOException e) {
        	System.out.println(e.getMessage());
        	
        } finally {
            if(connection != null && !connection.isClosed()) {
                try {
                     connection.close();
                } catch (IOException e) {
                	System.out.println(e.getMessage());
                }
            }
        }
        
        
        
	}//end getAppList
	
	private void addApps(String ldcModelFilePath,String vmOverviewFilePath){
		//1. logical model file
		LoadEmfFromDiskLinkedRef modelLoader = new LoadEmfFromDiskLinkedRef();
		LogicalDCModel ldcmodel = null;
		try {
			ldcmodel = (LogicalDCModel)modelLoader.loadData(ldcModelFilePath);
			
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
        
        ExperimentScenarioTimeLine scenario = eu.cactosfp7.cactosim.experimentscenario.ExperimentscenarioFactory.eINSTANCE.createExperimentScenarioTimeLine();


		//2. Load selected Overview xml file
		File xmlFile = new File(vmOverviewFilePath);

		//3. deserialise xml file
		VmOverview vmOverviewDeserealised = new VmOverview();
		List<VMDescription> vmDescriptionsDeserealised = new LinkedList<VMDescription>();
		long lowerBound = 123;
		long upperBound = 123;
		
		try{
			
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(xmlFile);
			doc.getDocumentElement().normalize();
			
			System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
			lowerBound = Long.parseLong(doc.getElementsByTagName("minValue").item(0).getTextContent());
			upperBound = Long.parseLong(doc.getElementsByTagName("maxValue").item(0).getTextContent());

			
			NodeList descriptionList = doc.getElementsByTagName("entry");
			
			for(int i = 0; i < descriptionList.getLength(); i++){
				
//				<entry>
//			      <string>59ecc4b2-08f6-4ba7-b2f7-94dfcfb67dd2</string>
//			      <vmdescription>
//			        <interval>
//			          <min>1469116087056</min>
//			          <max>1472654626709</max>
//			        </interval>
//			        <initialPlacement>computenode19</initialPlacement>
//			        <name>instance-00001159</name>
//			        <uuid>59ecc4b2-08f6-4ba7-b2f7-94dfcfb67dd2</uuid>
//			      </vmdescription>
//			    </entry>
				//String uuid, long timestamp
				
				Node entry = descriptionList.item(i);
				
				if (entry.getNodeType() == Node.ELEMENT_NODE) {

					Element eElement = (Element) entry;
				
					String uuid_str = eElement.getElementsByTagName("string").item(0).getTextContent();
					String min = eElement.getElementsByTagName("min").item(0).getTextContent();
					String max = eElement.getElementsByTagName("max").item(0).getTextContent();
					String initialPlacement = eElement.getElementsByTagName("initialPlacement").item(0).getTextContent();
					String name = eElement.getElementsByTagName("name").item(0).getTextContent();
					String uuid = eElement.getElementsByTagName("uuid").item(0).getTextContent();
					
					
//					vmOverviewDeserealised.addInitialPlacement(uuid, initialPlacement);
//					vmOverviewDeserealised.addName(uuid, initialPlacement);
//					vmOverviewDeserealised.addVmMeasurement(uuid, upperBound);
					
					
					VMDescription vmDescription = new VMDescription(uuid_str, Long.parseLong(min));
					vmDescription.addName(name);
					vmDescription.addInitialPlacement(initialPlacement);
					vmDescription.addMeasurement(Long.parseLong(max));
					vmDescription.getUuid();
					//add to the general list
					vmDescriptionsDeserealised.add(vmDescription);
				
				}

			}
			
			System.out.println("No of Descriptions :" + descriptionList.getLength());
			
			
		}catch (Exception e){
			e.printStackTrace();
		}

		
		//4. for each overview query and attach
		
		//open connection
		Connection connection = null;
        try {
        	connection = ConnectionManager.getInstance().getConnection();
            BlackBoxVmQuery bbVmQuery = new BlackBoxVmQuery();

        for(VMDescription vmDescription : vmDescriptionsDeserealised){
        	System.out.println( "\nEntry ID:"+vmDescription.getName());
        	System.out.println( "VM UUID:"+ vmDescription.getUuid());
        	System.out.println( "VM Name:"+ vmDescription.getName());
        	System.out.println( "VM Initial Placement Node:"+ vmDescription.getInitialPlacement());
        	try{
        		//old
        		//bbVmQuery.queryAndAttachVmBehaviour(ldcmodel, connection, vmDescription, lowerBound, upperBound);
        		
        		Interval consideredInterval = new Interval(upperBound);
        		consideredInterval.addMeasurement(lowerBound);
        		
        		bbVmQuery.queryAndAttachVmBehavior(ldcmodel, scenario, connection, vmDescription, consideredInterval);
        	}catch(Exception e){
        		System.out.println("Unable to attach this VM. Error:"+e.getMessage());
        	}
        	
        }
        
        }catch(Exception e){
        	System.out.println(e.getMessage());
        	e.printStackTrace();
        }
        
		//5. save the logical model
        ResourceSet resourceSet = new ResourceSetImpl();
		Resource scenarioResource = resourceSet.createResource(URI.createURI("uulm-testbed.experimentscenario"));
		scenarioResource.getContents().add(scenario);// longest
        
        try {
			ldcmodel.eResource().save(Collections.EMPTY_MAP);
			scenarioResource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
        
        }// end of addApps

    /**
     * {@inheritDoc}
     */
    @Override
    public void stop() {
        
    }

}
