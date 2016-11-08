/**
 */
package eu.cactosfp7.cactosim.correspondence.logicalcorrespondence;

import eu.cactosfp7.identifier.Identifier;

import eu.cactosfp7.infrastructuremodels.logicaldc.application.ScalableVMImageConnector;

import eu.cactosfp7.infrastructuremodels.logicaldc.application.WhiteBoxApplicationInstance;
import org.palladiosimulator.pcm.repository.BasicComponent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scalable VM Image Connector Correspondence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ScalableVMImageConnectorCorrespondence#getCactosApplicationInstance <em>Cactos Application Instance</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ScalableVMImageConnectorCorrespondence#getCactosConnector <em>Cactos Connector</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ScalableVMImageConnectorCorrespondence#getPalladio <em>Palladio</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ScalableVMImageConnectorCorrespondence#getLogicalCorrespondenceRepository <em>Logical Correspondence Repository</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ScalableVMImageConnectorCorrespondence#getMaximumInstanceNumber <em>Maximum Instance Number</em>}</li>
 * </ul>
 *
 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalcorrespondencePackage#getScalableVMImageConnectorCorrespondence()
 * @model
 * @generated
 */
public interface ScalableVMImageConnectorCorrespondence extends Identifier {
        /**
	 * Returns the value of the '<em><b>Cactos Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Cactos Connector</em>' reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>Cactos Connector</em>' reference.
	 * @see #setCactosConnector(ScalableVMImageConnector)
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalcorrespondencePackage#getScalableVMImageConnectorCorrespondence_CactosConnector()
	 * @model
	 * @generated
	 */
        ScalableVMImageConnector getCactosConnector();

        /**
	 * Sets the value of the '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ScalableVMImageConnectorCorrespondence#getCactosConnector <em>Cactos Connector</em>}' reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cactos Connector</em>' reference.
	 * @see #getCactosConnector()
	 * @generated
	 */
        void setCactosConnector(ScalableVMImageConnector value);

        /**
	 * Returns the value of the '<em><b>Palladio</b></em>' reference.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Palladio</em>' reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>Palladio</em>' reference.
	 * @see #setPalladio(BasicComponent)
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalcorrespondencePackage#getScalableVMImageConnectorCorrespondence_Palladio()
	 * @model
	 * @generated
	 */
        BasicComponent getPalladio();

        /**
	 * Sets the value of the '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ScalableVMImageConnectorCorrespondence#getPalladio <em>Palladio</em>}' reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Palladio</em>' reference.
	 * @see #getPalladio()
	 * @generated
	 */
        void setPalladio(BasicComponent value);

        /**
	 * Returns the value of the '<em><b>Logical Correspondence Repository</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalCorrespondenceRepository#getScalableConnectorCorrespondences <em>Scalable Connector Correspondences</em>}'.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Logical Correspondence Repository</em>' container reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>Logical Correspondence Repository</em>' container reference.
	 * @see #setLogicalCorrespondenceRepository(LogicalCorrespondenceRepository)
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalcorrespondencePackage#getScalableVMImageConnectorCorrespondence_LogicalCorrespondenceRepository()
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalCorrespondenceRepository#getScalableConnectorCorrespondences
	 * @model opposite="scalableConnectorCorrespondences" transient="false"
	 * @generated
	 */
        LogicalCorrespondenceRepository getLogicalCorrespondenceRepository();

        /**
	 * Sets the value of the '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ScalableVMImageConnectorCorrespondence#getLogicalCorrespondenceRepository <em>Logical Correspondence Repository</em>}' container reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logical Correspondence Repository</em>' container reference.
	 * @see #getLogicalCorrespondenceRepository()
	 * @generated
	 */
        void setLogicalCorrespondenceRepository(LogicalCorrespondenceRepository value);

        /**
	 * Returns the value of the '<em><b>Maximum Instance Number</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum Instance Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Instance Number</em>' attribute.
	 * @see #setMaximumInstanceNumber(int)
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalcorrespondencePackage#getScalableVMImageConnectorCorrespondence_MaximumInstanceNumber()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getMaximumInstanceNumber();

								/**
	 * Sets the value of the '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ScalableVMImageConnectorCorrespondence#getMaximumInstanceNumber <em>Maximum Instance Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Instance Number</em>' attribute.
	 * @see #getMaximumInstanceNumber()
	 * @generated
	 */
	void setMaximumInstanceNumber(int value);

								/**
	 * Returns the value of the '<em><b>Cactos Application Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Cactos Application Instance</em>' reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>Cactos Application Instance</em>' reference.
	 * @see #setCactosApplicationInstance(WhiteBoxApplicationInstance)
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalcorrespondencePackage#getScalableVMImageConnectorCorrespondence_CactosApplicationInstance()
	 * @model
	 * @generated
	 */
        WhiteBoxApplicationInstance getCactosApplicationInstance();

        /**
	 * Sets the value of the '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ScalableVMImageConnectorCorrespondence#getCactosApplicationInstance <em>Cactos Application Instance</em>}' reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cactos Application Instance</em>' reference.
	 * @see #getCactosApplicationInstance()
	 * @generated
	 */
        void setCactosApplicationInstance(WhiteBoxApplicationInstance value);

} // ScalableVMImageConnectorCorrespondence
