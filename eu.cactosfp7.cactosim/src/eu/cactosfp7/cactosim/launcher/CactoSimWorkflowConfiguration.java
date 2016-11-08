package eu.cactosfp7.cactosim.launcher;

import java.util.Map;

import org.palladiosimulator.simulizar.runconfig.SimuLizarWorkflowConfiguration;

public class CactoSimWorkflowConfiguration extends SimuLizarWorkflowConfiguration {

	private String usageSequenceRepositoryFile;
    private String cactosLogicalCorrespondenceFile;
    private String cactosPhysicalCorrespondenceFile;
    private String cactosPdc;
    private String cactosMeasurementCorrespondenceFile;
	private String cactosEsm;

    public CactoSimWorkflowConfiguration(Map<String, Object> attributes) {
        super(attributes);
    }

    public String getCactosPDCFile() {
        return this.cactosPdc;
    }
    
    public void setCactosPDCFile(String cactosPdc) {
        this.cactosPdc = cactosPdc;
    }
    
    
    public String getCactosESMFile() {
    	return this.cactosEsm;
    }
    
	public void setCactosESMFile(String esmFile) {
		this.cactosEsm = esmFile;	
	}
    
    public void validateAndFreeze() {
        
    }

    public String getCactosPhysicalCorrespondenceFile() {
        return this.cactosPhysicalCorrespondenceFile;
    }
    
    public void setCactosPhysicalCorrespondenceFile(final String cactosPhysicalCorrespondenceFile) {
        this.cactosPhysicalCorrespondenceFile = cactosPhysicalCorrespondenceFile;
    }

    public String getCactosLogicalCorrespondenceFile() {
        return this.cactosLogicalCorrespondenceFile;
    }
    
    public void setCactosLogicalCorrespondenceFile(final String cactosLogicalCorrespondenceFile) {
        this.cactosLogicalCorrespondenceFile = cactosLogicalCorrespondenceFile;
    }

    public void setCactosMeasurementCorrespondenceFile(final String measurementCorrespondenceFile) {
        this.cactosMeasurementCorrespondenceFile = measurementCorrespondenceFile;
    }
    
    public String getCactosMeasurementCorrespondenceFile() {
        return this.cactosMeasurementCorrespondenceFile;
    }

	public String getUsageSequenceRepositoryFile() {
		return usageSequenceRepositoryFile;
	}

	public void setUsageSequenceRepositoryFile(final String usageSequenceRepositoryFile) {
		this.usageSequenceRepositoryFile = usageSequenceRepositoryFile;
	}

}
