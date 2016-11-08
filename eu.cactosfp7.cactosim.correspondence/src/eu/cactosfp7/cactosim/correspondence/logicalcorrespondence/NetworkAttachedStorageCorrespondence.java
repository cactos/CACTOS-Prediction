/**
 */
package eu.cactosfp7.cactosim.correspondence.logicalcorrespondence;

import eu.cactosfp7.identifier.Identifier;

import eu.cactosfp7.infrastructuremodels.physicaldc.core.NetworkAttachedStorage;

import org.palladiosimulator.pcm.allocation.AllocationContext;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network Attached Storage Correspondence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.NetworkAttachedStorageCorrespondence#getCactos <em>Cactos</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.NetworkAttachedStorageCorrespondence#getPalladio <em>Palladio</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.NetworkAttachedStorageCorrespondence#getLogicalCorrespondenceRepository <em>Logical Correspondence Repository</em>}</li>
 * </ul>
 *
 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalcorrespondencePackage#getNetworkAttachedStorageCorrespondence()
 * @model
 * @generated
 */
public interface NetworkAttachedStorageCorrespondence extends Identifier {
    /**
	 * Returns the value of the '<em><b>Cactos</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Cactos</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Cactos</em>' reference.
	 * @see #setCactos(NetworkAttachedStorage)
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalcorrespondencePackage#getNetworkAttachedStorageCorrespondence_Cactos()
	 * @model required="true"
	 * @generated
	 */
    NetworkAttachedStorage getCactos();

    /**
	 * Sets the value of the '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.NetworkAttachedStorageCorrespondence#getCactos <em>Cactos</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cactos</em>' reference.
	 * @see #getCactos()
	 * @generated
	 */
    void setCactos(NetworkAttachedStorage value);

    /**
	 * Returns the value of the '<em><b>Palladio</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Palladio</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Palladio</em>' reference.
	 * @see #setPalladio(AllocationContext)
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalcorrespondencePackage#getNetworkAttachedStorageCorrespondence_Palladio()
	 * @model required="true"
	 * @generated
	 */
    AllocationContext getPalladio();

    /**
	 * Sets the value of the '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.NetworkAttachedStorageCorrespondence#getPalladio <em>Palladio</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Palladio</em>' reference.
	 * @see #getPalladio()
	 * @generated
	 */
    void setPalladio(AllocationContext value);

    /**
	 * Returns the value of the '<em><b>Logical Correspondence Repository</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalCorrespondenceRepository#getNetworkAttachedStorageCorrespondences <em>Network Attached Storage Correspondences</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Logical Correspondence Repository</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Logical Correspondence Repository</em>' reference.
	 * @see #setLogicalCorrespondenceRepository(LogicalCorrespondenceRepository)
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalcorrespondencePackage#getNetworkAttachedStorageCorrespondence_LogicalCorrespondenceRepository()
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalCorrespondenceRepository#getNetworkAttachedStorageCorrespondences
	 * @model opposite="networkAttachedStorageCorrespondences"
	 * @generated
	 */
    LogicalCorrespondenceRepository getLogicalCorrespondenceRepository();

    /**
	 * Sets the value of the '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.NetworkAttachedStorageCorrespondence#getLogicalCorrespondenceRepository <em>Logical Correspondence Repository</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logical Correspondence Repository</em>' reference.
	 * @see #getLogicalCorrespondenceRepository()
	 * @generated
	 */
    void setLogicalCorrespondenceRepository(LogicalCorrespondenceRepository value);

} // NetworkAttachedStorageCorrespondence
