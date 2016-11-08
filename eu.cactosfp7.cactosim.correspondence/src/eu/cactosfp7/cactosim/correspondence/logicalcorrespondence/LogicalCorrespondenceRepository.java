/**
 */
package eu.cactosfp7.cactosim.correspondence.logicalcorrespondence;

import eu.cactosfp7.identifier.Identifier;

import eu.cactosfp7.infrastructuremodels.load.logical.LogicalLoadModel;

import eu.cactosfp7.infrastructuremodels.logicaldc.core.LogicalDCModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logical Correspondence Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalCorrespondenceRepository#getVirtualMemoryMeasurementCorrespondences <em>Virtual Memory Measurement Correspondences</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalCorrespondenceRepository#getVirtualNetworkInterconnectMeasurementCorrespondences <em>Virtual Network Interconnect Measurement Correspondences</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalCorrespondenceRepository#getVirtualProcessingUnitMeasurementCorrespondences <em>Virtual Processing Unit Measurement Correspondences</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalCorrespondenceRepository#getVolumeMeasurementCorrespondences <em>Volume Measurement Correspondences</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalCorrespondenceRepository#getVirtualNetworkInterconnects <em>Virtual Network Interconnects</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalCorrespondenceRepository#getVmImageCorrespondences <em>Vm Image Correspondences</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalCorrespondenceRepository#getVmImageInstanceCorrespondences <em>Vm Image Instance Correspondences</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalCorrespondenceRepository#getVirtualMachineCorrespondences <em>Virtual Machine Correspondences</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalCorrespondenceRepository#getHypervisorCorrespondences <em>Hypervisor Correspondences</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalCorrespondenceRepository#getNetworkAttachedStorageCorrespondences <em>Network Attached Storage Correspondences</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalCorrespondenceRepository#getLogicalDcModel <em>Logical Dc Model</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalCorrespondenceRepository#getLogicalLoadModel <em>Logical Load Model</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalCorrespondenceRepository#isCorrespondenceEstablished <em>Correspondence Established</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalCorrespondenceRepository#getOptimisationPlanCorrespondence <em>Optimisation Plan Correspondence</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalCorrespondenceRepository#getProvidedServiceCorrespondences <em>Provided Service Correspondences</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalCorrespondenceRepository#getRequiredServiceCorrespondences <em>Required Service Correspondences</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalCorrespondenceRepository#getScalableConnectorCorrespondences <em>Scalable Connector Correspondences</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalCorrespondenceRepository#getUserBehaviourCorrespondences <em>User Behaviour Correspondences</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalCorrespondenceRepository#getArrivalRateMeasurementCorrespondences <em>Arrival Rate Measurement Correspondences</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalCorrespondenceRepository#getServiceOperationCorrespondences <em>Service Operation Correspondences</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalCorrespondenceRepository#getApplicationProvidedServiceCorrespondences <em>Application Provided Service Correspondences</em>}</li>
 * </ul>
 *
 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalcorrespondencePackage#getLogicalCorrespondenceRepository()
 * @model
 * @generated
 */
public interface LogicalCorrespondenceRepository extends Identifier {
	/**
	 * Returns the value of the '<em><b>Virtual Memory Measurement Correspondences</b></em>' containment reference list.
	 * The list contents are of type {@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VirtualMemoryMeasurementCorrespondence}.
	 * It is bidirectional and its opposite is '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VirtualMemoryMeasurementCorrespondence#getLogicalCorrespondenceRepository <em>Logical Correspondence Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Virtual Memory Measurement Correspondences</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Virtual Memory Measurement Correspondences</em>' containment reference list.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalcorrespondencePackage#getLogicalCorrespondenceRepository_VirtualMemoryMeasurementCorrespondences()
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VirtualMemoryMeasurementCorrespondence#getLogicalCorrespondenceRepository
	 * @model opposite="logicalCorrespondenceRepository" containment="true"
	 * @generated
	 */
	EList<VirtualMemoryMeasurementCorrespondence> getVirtualMemoryMeasurementCorrespondences();

	/**
	 * Returns the value of the '<em><b>Virtual Network Interconnect Measurement Correspondences</b></em>' containment reference list.
	 * The list contents are of type {@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VirtualNetworkInterconnectMeasurementCorrespondence}.
	 * It is bidirectional and its opposite is '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VirtualNetworkInterconnectMeasurementCorrespondence#getLogicalCorrespondenceRepository <em>Logical Correspondence Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Virtual Network Interconnect Measurement Correspondences</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Virtual Network Interconnect Measurement Correspondences</em>' containment reference list.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalcorrespondencePackage#getLogicalCorrespondenceRepository_VirtualNetworkInterconnectMeasurementCorrespondences()
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VirtualNetworkInterconnectMeasurementCorrespondence#getLogicalCorrespondenceRepository
	 * @model opposite="logicalCorrespondenceRepository" containment="true"
	 * @generated
	 */
	EList<VirtualNetworkInterconnectMeasurementCorrespondence> getVirtualNetworkInterconnectMeasurementCorrespondences();

	/**
	 * Returns the value of the '<em><b>Virtual Processing Unit Measurement Correspondences</b></em>' containment reference list.
	 * The list contents are of type {@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VirtualProcessingUnitMeasurementCorrespondence}.
	 * It is bidirectional and its opposite is '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VirtualProcessingUnitMeasurementCorrespondence#getLogicalCorrespondenceRepository <em>Logical Correspondence Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Virtual Processing Unit Measurement Correspondences</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Virtual Processing Unit Measurement Correspondences</em>' containment reference list.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalcorrespondencePackage#getLogicalCorrespondenceRepository_VirtualProcessingUnitMeasurementCorrespondences()
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VirtualProcessingUnitMeasurementCorrespondence#getLogicalCorrespondenceRepository
	 * @model opposite="logicalCorrespondenceRepository" containment="true"
	 * @generated
	 */
	EList<VirtualProcessingUnitMeasurementCorrespondence> getVirtualProcessingUnitMeasurementCorrespondences();

	/**
	 * Returns the value of the '<em><b>Volume Measurement Correspondences</b></em>' containment reference list.
	 * The list contents are of type {@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalDiskReadMeasurementCorrespondence}.
	 * It is bidirectional and its opposite is '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalDiskReadMeasurementCorrespondence#getLogicalCorrespondenceRepository <em>Logical Correspondence Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Volume Measurement Correspondences</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volume Measurement Correspondences</em>' containment reference list.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalcorrespondencePackage#getLogicalCorrespondenceRepository_VolumeMeasurementCorrespondences()
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalDiskReadMeasurementCorrespondence#getLogicalCorrespondenceRepository
	 * @model opposite="logicalCorrespondenceRepository" containment="true"
	 * @generated
	 */
	EList<LogicalDiskReadMeasurementCorrespondence> getVolumeMeasurementCorrespondences();

	/**
	 * Returns the value of the '<em><b>Virtual Network Interconnects</b></em>' containment reference list.
	 * The list contents are of type {@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VirtualNetworkInterconnectCorrespondence}.
	 * It is bidirectional and its opposite is '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VirtualNetworkInterconnectCorrespondence#getLogicalCorrespondenceRepository <em>Logical Correspondence Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Virtual Network Interconnects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Virtual Network Interconnects</em>' containment reference list.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalcorrespondencePackage#getLogicalCorrespondenceRepository_VirtualNetworkInterconnects()
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VirtualNetworkInterconnectCorrespondence#getLogicalCorrespondenceRepository
	 * @model opposite="logicalCorrespondenceRepository" containment="true" ordered="false"
	 * @generated
	 */
	EList<VirtualNetworkInterconnectCorrespondence> getVirtualNetworkInterconnects();

	/**
	 * Returns the value of the '<em><b>Vm Image Correspondences</b></em>' containment reference list.
	 * The list contents are of type {@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VMImageCorrespondence}.
	 * It is bidirectional and its opposite is '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VMImageCorrespondence#getLogicalCorrespondenceRepository <em>Logical Correspondence Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vm Image Correspondences</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vm Image Correspondences</em>' containment reference list.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalcorrespondencePackage#getLogicalCorrespondenceRepository_VmImageCorrespondences()
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VMImageCorrespondence#getLogicalCorrespondenceRepository
	 * @model opposite="logicalCorrespondenceRepository" containment="true" ordered="false"
	 * @generated
	 */
	EList<VMImageCorrespondence> getVmImageCorrespondences();

	/**
	 * Returns the value of the '<em><b>Vm Image Instance Correspondences</b></em>' containment reference list.
	 * The list contents are of type {@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VMImageInstanceCorrespondence}.
	 * It is bidirectional and its opposite is '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VMImageInstanceCorrespondence#getLogicalCorrespondenceRepository <em>Logical Correspondence Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vm Image Instance Correspondences</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vm Image Instance Correspondences</em>' containment reference list.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalcorrespondencePackage#getLogicalCorrespondenceRepository_VmImageInstanceCorrespondences()
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VMImageInstanceCorrespondence#getLogicalCorrespondenceRepository
	 * @model opposite="logicalCorrespondenceRepository" containment="true"
	 * @generated
	 */
	EList<VMImageInstanceCorrespondence> getVmImageInstanceCorrespondences();

	/**
	 * Returns the value of the '<em><b>Virtual Machine Correspondences</b></em>' containment reference list.
	 * The list contents are of type {@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VirtualMachineCorrespondence}.
	 * It is bidirectional and its opposite is '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VirtualMachineCorrespondence#getLogicalCorrespondenceRepository <em>Logical Correspondence Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Virtual Machine Correspondences</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Virtual Machine Correspondences</em>' containment reference list.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalcorrespondencePackage#getLogicalCorrespondenceRepository_VirtualMachineCorrespondences()
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VirtualMachineCorrespondence#getLogicalCorrespondenceRepository
	 * @model opposite="logicalCorrespondenceRepository" containment="true"
	 * @generated
	 */
	EList<VirtualMachineCorrespondence> getVirtualMachineCorrespondences();

	/**
	 * Returns the value of the '<em><b>Hypervisor Correspondences</b></em>' containment reference list.
	 * The list contents are of type {@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.HypervisorCorrespondence}.
	 * It is bidirectional and its opposite is '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.HypervisorCorrespondence#getLogicalCorrespondenceRepository <em>Logical Correspondence Repository</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Hypervisor Correspondences</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Hypervisor Correspondences</em>' containment reference list.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalcorrespondencePackage#getLogicalCorrespondenceRepository_HypervisorCorrespondences()
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.HypervisorCorrespondence#getLogicalCorrespondenceRepository
	 * @model opposite="logicalCorrespondenceRepository" containment="true"
	 * @generated
	 */
    EList<HypervisorCorrespondence> getHypervisorCorrespondences();

    /**
	 * Returns the value of the '<em><b>Network Attached Storage Correspondences</b></em>' reference list.
	 * The list contents are of type {@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.NetworkAttachedStorageCorrespondence}.
	 * It is bidirectional and its opposite is '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.NetworkAttachedStorageCorrespondence#getLogicalCorrespondenceRepository <em>Logical Correspondence Repository</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Network Attached Storage Correspondences</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Network Attached Storage Correspondences</em>' reference list.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalcorrespondencePackage#getLogicalCorrespondenceRepository_NetworkAttachedStorageCorrespondences()
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.NetworkAttachedStorageCorrespondence#getLogicalCorrespondenceRepository
	 * @model opposite="logicalCorrespondenceRepository"
	 * @generated
	 */
    EList<NetworkAttachedStorageCorrespondence> getNetworkAttachedStorageCorrespondences();

    /**
	 * Returns the value of the '<em><b>Logical Dc Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logical Dc Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logical Dc Model</em>' reference.
	 * @see #setLogicalDcModel(LogicalDCModel)
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalcorrespondencePackage#getLogicalCorrespondenceRepository_LogicalDcModel()
	 * @model required="true"
	 * @generated
	 */
	LogicalDCModel getLogicalDcModel();

	/**
	 * Sets the value of the '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalCorrespondenceRepository#getLogicalDcModel <em>Logical Dc Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logical Dc Model</em>' reference.
	 * @see #getLogicalDcModel()
	 * @generated
	 */
	void setLogicalDcModel(LogicalDCModel value);

	/**
	 * Returns the value of the '<em><b>Logical Load Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logical Load Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logical Load Model</em>' reference.
	 * @see #setLogicalLoadModel(LogicalLoadModel)
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalcorrespondencePackage#getLogicalCorrespondenceRepository_LogicalLoadModel()
	 * @model required="true"
	 * @generated
	 */
	LogicalLoadModel getLogicalLoadModel();

	/**
	 * Sets the value of the '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalCorrespondenceRepository#getLogicalLoadModel <em>Logical Load Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logical Load Model</em>' reference.
	 * @see #getLogicalLoadModel()
	 * @generated
	 */
	void setLogicalLoadModel(LogicalLoadModel value);

	/**
	 * Returns the value of the '<em><b>Correspondence Established</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Correspondence Established</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Correspondence Established</em>' attribute.
	 * @see #setCorrespondenceEstablished(boolean)
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalcorrespondencePackage#getLogicalCorrespondenceRepository_CorrespondenceEstablished()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isCorrespondenceEstablished();

	/**
	 * Sets the value of the '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalCorrespondenceRepository#isCorrespondenceEstablished <em>Correspondence Established</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Correspondence Established</em>' attribute.
	 * @see #isCorrespondenceEstablished()
	 * @generated
	 */
	void setCorrespondenceEstablished(boolean value);

        /**
	 * Returns the value of the '<em><b>Optimisation Plan Correspondence</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.OptimisationPlanCorrespondence#getLogicalCorrespondenceRepository <em>Logical Correspondence Repository</em>}'.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Optimisation Plan Correspondence</em>' containment reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>Optimisation Plan Correspondence</em>' containment reference.
	 * @see #setOptimisationPlanCorrespondence(OptimisationPlanCorrespondence)
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalcorrespondencePackage#getLogicalCorrespondenceRepository_OptimisationPlanCorrespondence()
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.OptimisationPlanCorrespondence#getLogicalCorrespondenceRepository
	 * @model opposite="logicalCorrespondenceRepository" containment="true"
	 * @generated
	 */
        OptimisationPlanCorrespondence getOptimisationPlanCorrespondence();

        /**
	 * Sets the value of the '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalCorrespondenceRepository#getOptimisationPlanCorrespondence <em>Optimisation Plan Correspondence</em>}' containment reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optimisation Plan Correspondence</em>' containment reference.
	 * @see #getOptimisationPlanCorrespondence()
	 * @generated
	 */
        void setOptimisationPlanCorrespondence(OptimisationPlanCorrespondence value);

        /**
	 * Returns the value of the '<em><b>Provided Service Correspondences</b></em>' containment reference list.
	 * The list contents are of type {@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ProvidedServiceCorrespondence}.
	 * It is bidirectional and its opposite is '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ProvidedServiceCorrespondence#getLogicalCorrespondenceRepository <em>Logical Correspondence Repository</em>}'.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Provided Service Correspondences</em>' containment reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Service Correspondences</em>' containment reference list.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalcorrespondencePackage#getLogicalCorrespondenceRepository_ProvidedServiceCorrespondences()
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ProvidedServiceCorrespondence#getLogicalCorrespondenceRepository
	 * @model opposite="logicalCorrespondenceRepository" containment="true"
	 * @generated
	 */
        EList<ProvidedServiceCorrespondence> getProvidedServiceCorrespondences();

        /**
	 * Returns the value of the '<em><b>Required Service Correspondences</b></em>' containment reference list.
	 * The list contents are of type {@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.RequiredServiceCorrespondence}.
	 * It is bidirectional and its opposite is '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.RequiredServiceCorrespondence#getLogicalCorrespondenceRepository <em>Logical Correspondence Repository</em>}'.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Required Service Correspondences</em>' containment reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Service Correspondences</em>' containment reference list.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalcorrespondencePackage#getLogicalCorrespondenceRepository_RequiredServiceCorrespondences()
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.RequiredServiceCorrespondence#getLogicalCorrespondenceRepository
	 * @model opposite="logicalCorrespondenceRepository" containment="true"
	 * @generated
	 */
        EList<RequiredServiceCorrespondence> getRequiredServiceCorrespondences();

        /**
	 * Returns the value of the '<em><b>Scalable Connector Correspondences</b></em>' containment reference list.
	 * The list contents are of type {@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ScalableVMImageConnectorCorrespondence}.
	 * It is bidirectional and its opposite is '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ScalableVMImageConnectorCorrespondence#getLogicalCorrespondenceRepository <em>Logical Correspondence Repository</em>}'.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Scalable Connector Correspondences</em>' containment reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>Scalable Connector Correspondences</em>' containment reference list.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalcorrespondencePackage#getLogicalCorrespondenceRepository_ScalableConnectorCorrespondences()
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ScalableVMImageConnectorCorrespondence#getLogicalCorrespondenceRepository
	 * @model opposite="logicalCorrespondenceRepository" containment="true"
	 * @generated
	 */
        EList<ScalableVMImageConnectorCorrespondence> getScalableConnectorCorrespondences();

        /**
	 * Returns the value of the '<em><b>User Behaviour Correspondences</b></em>' containment reference list.
	 * The list contents are of type {@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.UserBehaviourCorrespondence}.
	 * It is bidirectional and its opposite is '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.UserBehaviourCorrespondence#getLogicalCorrespondenceRepository <em>Logical Correspondence Repository</em>}'.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>User Behaviour Correspondences</em>' containment reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>User Behaviour Correspondences</em>' containment reference list.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalcorrespondencePackage#getLogicalCorrespondenceRepository_UserBehaviourCorrespondences()
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.UserBehaviourCorrespondence#getLogicalCorrespondenceRepository
	 * @model opposite="logicalCorrespondenceRepository" containment="true"
	 * @generated
	 */
        EList<UserBehaviourCorrespondence> getUserBehaviourCorrespondences();

								/**
	 * Returns the value of the '<em><b>Arrival Rate Measurement Correspondences</b></em>' containment reference list.
	 * The list contents are of type {@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ArrivalRateMeasurementCorrespondence}.
	 * It is bidirectional and its opposite is '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ArrivalRateMeasurementCorrespondence#getLogicalCorrespondenceRepository <em>Logical Correspondence Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arrival Rate Measurement Correspondences</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arrival Rate Measurement Correspondences</em>' containment reference list.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalcorrespondencePackage#getLogicalCorrespondenceRepository_ArrivalRateMeasurementCorrespondences()
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ArrivalRateMeasurementCorrespondence#getLogicalCorrespondenceRepository
	 * @model opposite="logicalCorrespondenceRepository" containment="true"
	 * @generated
	 */
	EList<ArrivalRateMeasurementCorrespondence> getArrivalRateMeasurementCorrespondences();

								/**
	 * Returns the value of the '<em><b>Service Operation Correspondences</b></em>' containment reference list.
	 * The list contents are of type {@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ServiceOperationCorrespondence}.
	 * It is bidirectional and its opposite is '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ServiceOperationCorrespondence#getLogicalCorrespondenceRepository <em>Logical Correspondence Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Operation Correspondences</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Operation Correspondences</em>' containment reference list.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalcorrespondencePackage#getLogicalCorrespondenceRepository_ServiceOperationCorrespondences()
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ServiceOperationCorrespondence#getLogicalCorrespondenceRepository
	 * @model opposite="logicalCorrespondenceRepository" containment="true"
	 * @generated
	 */
	EList<ServiceOperationCorrespondence> getServiceOperationCorrespondences();

								/**
	 * Returns the value of the '<em><b>Application Provided Service Correspondences</b></em>' containment reference list.
	 * The list contents are of type {@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ApplicationProvidedServiceCorrespondence}.
	 * It is bidirectional and its opposite is '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ApplicationProvidedServiceCorrespondence#getLogicalCorrespondenceRepository <em>Logical Correspondence Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application Provided Service Correspondences</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application Provided Service Correspondences</em>' containment reference list.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalcorrespondencePackage#getLogicalCorrespondenceRepository_ApplicationProvidedServiceCorrespondences()
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ApplicationProvidedServiceCorrespondence#getLogicalCorrespondenceRepository
	 * @model opposite="logicalCorrespondenceRepository" containment="true"
	 * @generated
	 */
	EList<ApplicationProvidedServiceCorrespondence> getApplicationProvidedServiceCorrespondences();

} // LogicalCorrespondenceRepository
