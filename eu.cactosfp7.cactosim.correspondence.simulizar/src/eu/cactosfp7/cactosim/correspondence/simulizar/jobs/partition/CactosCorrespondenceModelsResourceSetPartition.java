package eu.cactosfp7.cactosim.correspondence.simulizar.jobs.partition;

import java.util.List;

import org.apache.log4j.Logger;

import de.uka.ipd.sdq.workflow.mdsd.blackboard.ResourceSetPartition;
import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalCorrespondenceRepository;
import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalcorrespondencePackage;
import eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalCorrespondenceRepository;
import eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalcorrespondencePackage;

/**Accesses the resource set partition with correspondence models between CACTOS and Palladio.
 * @author stier, hgroenda
 *
 */
public class CactosCorrespondenceModelsResourceSetPartition extends ResourceSetPartition {
	/** Logger of this class. */
    private static final Logger LOGGER = Logger.getLogger(CactosCorrespondenceModelsResourceSetPartition.class.getName());
    /** Repository containing correspondences for the logical infrastructure. */
    private LogicalCorrespondenceRepository logicalCorrespondenceRepository;
    /** Repository containing correspondences for the physical infrastructure. */
    private PhysicalCorrespondenceRepository physicalCorrespondenceRepository;
    /** Flag indicating if the access to models has failed. Prevents multiple error log messages. */
    boolean accessFailedLogical = false;
    /** Flag indicating if the access to models has failed. Prevents multiple error log messages. */
    boolean accessFailedPhysical = false;

    /**
     * @return The repository. <code>null</code> if it could not be retrieved.
     */
    public LogicalCorrespondenceRepository getLogicalCorrespondenceRepository() {
        if(!accessFailedLogical && this.logicalCorrespondenceRepository == null) {
            this.logicalCorrespondenceRepository = loadLogicalCorrespondenceRepository();
        }
        return this.logicalCorrespondenceRepository;
    }
    
    /**
     * @return LogicalCorrespondenceRepository from the blackboard. <code>null</code> if not found.
     */
    private LogicalCorrespondenceRepository loadLogicalCorrespondenceRepository() {
        try {
            LOGGER.debug("Retrieving LogicalCorrespondenceRepository from blackboard partition");
            List<LogicalCorrespondenceRepository> result = getElement(LogicalcorrespondencePackage.eINSTANCE.getLogicalCorrespondenceRepository());
            return result.get(0);
        } catch (Exception e) {
        	accessFailedLogical = true;
            LOGGER.warn("No LogicalCorrespondenceRepository found, no requests will be measured.");
            return null;
        }
    }

    /**
     * @return The repository. <code>null</code> if it could not be retrieved.
     */
    public PhysicalCorrespondenceRepository getPhysicalcorrespondenceRepository() {
        if(!accessFailedPhysical && this.physicalCorrespondenceRepository == null) {
            this.physicalCorrespondenceRepository = loadPhysicalCorrespondenceRepository();
        }
        return this.physicalCorrespondenceRepository;
    }
    
    /**
     * @return LogicalCorrespondenceRepository from the blackboard. <code>null</code> if not found.
     */
    private PhysicalCorrespondenceRepository loadPhysicalCorrespondenceRepository() {
        try {
            LOGGER.debug("Retrieving PhysicalCorrespondenceRepository from blackboard partition");
            List<PhysicalCorrespondenceRepository> result = getElement(PhysicalcorrespondencePackage.eINSTANCE.getPhysicalCorrespondenceRepository());
            return result.get(0);
        } catch (Exception e) {
        	accessFailedPhysical = true;
            LOGGER.warn("No PhysicalCorrespondenceRepository found, no requests will be measured.");
            return null;
        }
    }

}
