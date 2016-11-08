package eu.cactosfp7.cactosim.launcher;

import org.eclipse.emf.common.util.URI;

public class CactoSimConstants {
	public static final String PHYSICAL_CORE_EXTENSION = "*.core";
	public static final String PHYSICAL_PRIME_EXTENSION = "*.physical";
	public static final String LOGICAL_CORE_EXTENSION = "*.core";
	public static final String LOGICAL_PRIME_EXTENSION = "*.logical";
	public static final String OPTINTERVAL_FILE_EXTENSION = "*.optinterval";
	public static final String EXPERIMENT_SCENARIO_FILE_EXTENSION = "*.experimentscenario";
	
	//Model URI strings for BB load
	public static final String PHYSICAL_CORE_FILE = "Physical Data Center Core File";
	public static final String LOGICAL_CORE_FILE = "Logical Data Center Core File";
	public static final String SIMUCOM_PATH = "PCM Models Folder";
	public static final String LOGICAL_LOAD_FILE = "Logical Data Center Load File";
	public static final String PHYSICAL_LOAD_FILE = "Physical Data Center Load File";
	public static final String EXPERIMENT_SCENARIO_FILE = "Experiment Scenario Model File";
	
	
	//Default directories and values for file names
	public static final String DEFAULT_PCM_FOLDER = "";
	public static final String DEFAULT_PHYSICAL_CORE_FILE = "";
	public static final String DEFAULT_LOGICAL_CORE_FILE = "";
	public static final URI TRANSFORMATION_URI = URI.createURI("platform:/plugin/eu.cactosfp7.cactosim.infrastructuremodelstopcm/transforms/infrastructuremodels2pcm.qvto");
	public static final URI FLATTEN_TRANSFORMATION_URI = URI.createURI("platform:/plugin/eu.cactosfp7.cactosim.infrastructuremodelstopcm/transforms/flattenPhysicalNetwork.qvto");

    // Model filenames configuration identifiers
    public static final String PHYSICALDCMODEL_FILE = "physicaDcModel";
    public static final String LOGICALDCMODEL_FILE = "logicalDcModel";
    public static final String EXPERIMENTSCENARIOMODEL_FILE = "experimentScenarioModel";
    public static final String RECONFIGURATION_RULES_FOLDER = "platform:/plugin/eu.cactosfp7.cactosim.vmi.controller.transformations/transformations";
    public static final String STARTSIMULATIONTICKBUTTON = "startSimulationTickButton";
    
    
    /*
     * Set the file extensions which the dialogs will use as selection filter and for file name
     * validation.
     */
    public static final String[] PHYSICALDCMODEL_FILE_EXTENSION = new String[] { PHYSICAL_CORE_EXTENSION, PHYSICAL_PRIME_EXTENSION };
    public static final String[] LOGICALDCMODEL_FILE_EXTENSION = new String[] { LOGICAL_CORE_EXTENSION, LOGICAL_PRIME_EXTENSION };
    public static final String[] EXPERIMENTSCENARIOMODEL_FILE_EXTENSION = new String[] { EXPERIMENT_SCENARIO_FILE_EXTENSION };
    
    // Default values
    /** Default URI of the CCM files. */
    public static final String DEFAULT_PHYSICALDCMODEL_FILE = "";
    public static final String DEFAULT_LOGICALDCMODEL_FILE = "";
    public static final String DEFAULT_EXPERIMENT_SCENARIO_FILE = "";
    
    /** Default value for tick*/
    public static final Boolean DEFAULT_STARTSIMULATIONTICKBUTTON = false;
    /** Default URI of the folder that will contain the PCM files. */
    public static final String DEFAULT_RECONFIGURATION_RULES_OUTPUTFOLDER = "PCM";
    
    //plug-in with image ID and PATH 
	public static final String OPTIMISATION_INTERVAL = "";
    public static final String PATHMAP_METRIC_SPEC_MODELS_COMMON_METRICS_METRICSPEC = "pathmap://METRIC_SPEC_MODELS/commonMetrics.metricspec";
    public static final String CACTOS_OPTIMISATION_PLAN_ACTION_REPOSITORY_PATH = "platform:/plugin/eu.cactosfp7.cactosim.optimisationplan.action.repository/model/optimisationplan.actions";
    public static final String CACTOS_EXPERIMENT_SCENARIO_ACTION_REPOSITORY_PATH = "platform:/plugin/eu.cactosfp7.cactosim.experimentscenario.action.repository/model/experimentscenario.actions";
	
}
