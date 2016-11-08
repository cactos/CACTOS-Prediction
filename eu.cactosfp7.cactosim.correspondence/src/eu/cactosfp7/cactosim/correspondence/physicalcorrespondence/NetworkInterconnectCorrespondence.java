/**
 */
package eu.cactosfp7.cactosim.correspondence.physicalcorrespondence;

import eu.cactosfp7.identifier.Identifier;

import eu.cactosfp7.infrastructuremodels.physicaldc.core.NetworkInterconnect;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.pcm.resourceenvironment.LinkingResource;
import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network Interconnect Correspondence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.NetworkInterconnectCorrespondence#getCactos <em>Cactos</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.NetworkInterconnectCorrespondence#getPalladio <em>Palladio</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.NetworkInterconnectCorrespondence#getPhysicalCorrespondenceRepository <em>Physical Correspondence Repository</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.NetworkInterconnectCorrespondence#getReconfigurationController <em>Reconfiguration Controller</em>}</li>
 * </ul>
 *
 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalcorrespondencePackage#getNetworkInterconnectCorrespondence()
 * @model
 * @generated
 */
public interface NetworkInterconnectCorrespondence extends Identifier {
	/**
	 * Returns the value of the '<em><b>Cactos</b></em>' reference list.
	 * The list contents are of type {@link eu.cactosfp7.infrastructuremodels.physicaldc.core.NetworkInterconnect}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cactos</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cactos</em>' reference list.
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalcorrespondencePackage#getNetworkInterconnectCorrespondence_Cactos()
	 * @model required="true"
	 * @generated
	 */
	EList<NetworkInterconnect> getCactos();

	/**
	 * Returns the value of the '<em><b>Palladio</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Palladio</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Palladio</em>' reference.
	 * @see #setPalladio(LinkingResource)
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalcorrespondencePackage#getNetworkInterconnectCorrespondence_Palladio()
	 * @model required="true"
	 * @generated
	 */
	LinkingResource getPalladio();

	/**
	 * Sets the value of the '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.NetworkInterconnectCorrespondence#getPalladio <em>Palladio</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Palladio</em>' reference.
	 * @see #getPalladio()
	 * @generated
	 */
	void setPalladio(LinkingResource value);

	/**
	 * Returns the value of the '<em><b>Physical Correspondence Repository</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalCorrespondenceRepository#getNetworkInterconnectCorrespondences <em>Network Interconnect Correspondences</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Physical Correspondence Repository</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Physical Correspondence Repository</em>' container reference.
	 * @see #setPhysicalCorrespondenceRepository(PhysicalCorrespondenceRepository)
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalcorrespondencePackage#getNetworkInterconnectCorrespondence_PhysicalCorrespondenceRepository()
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalCorrespondenceRepository#getNetworkInterconnectCorrespondences
	 * @model opposite="networkInterconnectCorrespondences" required="true" transient="false"
	 * @generated
	 */
	PhysicalCorrespondenceRepository getPhysicalCorrespondenceRepository();

	/**
	 * Sets the value of the '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.NetworkInterconnectCorrespondence#getPhysicalCorrespondenceRepository <em>Physical Correspondence Repository</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Physical Correspondence Repository</em>' container reference.
	 * @see #getPhysicalCorrespondenceRepository()
	 * @generated
	 */
	void setPhysicalCorrespondenceRepository(PhysicalCorrespondenceRepository value);

    /**
	 * Returns the value of the '<em><b>Reconfiguration Controller</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Reconfiguration Controller</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Reconfiguration Controller</em>' reference.
	 * @see #setReconfigurationController(ResourceContainer)
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalcorrespondencePackage#getNetworkInterconnectCorrespondence_ReconfigurationController()
	 * @model
	 * @generated
	 */
    ResourceContainer getReconfigurationController();

    /**
	 * Sets the value of the '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.NetworkInterconnectCorrespondence#getReconfigurationController <em>Reconfiguration Controller</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reconfiguration Controller</em>' reference.
	 * @see #getReconfigurationController()
	 * @generated
	 */
    void setReconfigurationController(ResourceContainer value);

} // NetworkInterconnectCorrespondence
