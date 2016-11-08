/**
 */
package eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl;

import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ApplicationProvidedServiceCorrespondence;
import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ArrivalRateMeasurementCorrespondence;
import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.HypervisorCorrespondence;
import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalCorrespondenceRepository;
import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalDiskReadMeasurementCorrespondence;
import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalcorrespondencePackage;
import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.NetworkAttachedStorageCorrespondence;
import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.OptimisationPlanCorrespondence;
import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ProvidedServiceCorrespondence;
import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.RequiredServiceCorrespondence;
import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ScalableVMImageConnectorCorrespondence;
import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ServiceOperationCorrespondence;
import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.UserBehaviourCorrespondence;
import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VMImageCorrespondence;
import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VMImageInstanceCorrespondence;
import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VirtualMachineCorrespondence;
import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VirtualMemoryMeasurementCorrespondence;
import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VirtualNetworkInterconnectCorrespondence;
import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VirtualNetworkInterconnectMeasurementCorrespondence;
import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VirtualProcessingUnitMeasurementCorrespondence;
import eu.cactosfp7.identifier.impl.IdentifierImpl;

import eu.cactosfp7.infrastructuremodels.load.logical.LogicalLoadModel;

import eu.cactosfp7.infrastructuremodels.logicaldc.core.LogicalDCModel;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logical Correspondence Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.LogicalCorrespondenceRepositoryImpl#getVirtualMemoryMeasurementCorrespondences <em>Virtual Memory Measurement Correspondences</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.LogicalCorrespondenceRepositoryImpl#getVirtualNetworkInterconnectMeasurementCorrespondences <em>Virtual Network Interconnect Measurement Correspondences</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.LogicalCorrespondenceRepositoryImpl#getVirtualProcessingUnitMeasurementCorrespondences <em>Virtual Processing Unit Measurement Correspondences</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.LogicalCorrespondenceRepositoryImpl#getVolumeMeasurementCorrespondences <em>Volume Measurement Correspondences</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.LogicalCorrespondenceRepositoryImpl#getVirtualNetworkInterconnects <em>Virtual Network Interconnects</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.LogicalCorrespondenceRepositoryImpl#getVmImageCorrespondences <em>Vm Image Correspondences</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.LogicalCorrespondenceRepositoryImpl#getVmImageInstanceCorrespondences <em>Vm Image Instance Correspondences</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.LogicalCorrespondenceRepositoryImpl#getVirtualMachineCorrespondences <em>Virtual Machine Correspondences</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.LogicalCorrespondenceRepositoryImpl#getHypervisorCorrespondences <em>Hypervisor Correspondences</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.LogicalCorrespondenceRepositoryImpl#getNetworkAttachedStorageCorrespondences <em>Network Attached Storage Correspondences</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.LogicalCorrespondenceRepositoryImpl#getLogicalDcModel <em>Logical Dc Model</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.LogicalCorrespondenceRepositoryImpl#getLogicalLoadModel <em>Logical Load Model</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.LogicalCorrespondenceRepositoryImpl#isCorrespondenceEstablished <em>Correspondence Established</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.LogicalCorrespondenceRepositoryImpl#getOptimisationPlanCorrespondence <em>Optimisation Plan Correspondence</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.LogicalCorrespondenceRepositoryImpl#getProvidedServiceCorrespondences <em>Provided Service Correspondences</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.LogicalCorrespondenceRepositoryImpl#getRequiredServiceCorrespondences <em>Required Service Correspondences</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.LogicalCorrespondenceRepositoryImpl#getScalableConnectorCorrespondences <em>Scalable Connector Correspondences</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.LogicalCorrespondenceRepositoryImpl#getUserBehaviourCorrespondences <em>User Behaviour Correspondences</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.LogicalCorrespondenceRepositoryImpl#getArrivalRateMeasurementCorrespondences <em>Arrival Rate Measurement Correspondences</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.LogicalCorrespondenceRepositoryImpl#getServiceOperationCorrespondences <em>Service Operation Correspondences</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.LogicalCorrespondenceRepositoryImpl#getApplicationProvidedServiceCorrespondences <em>Application Provided Service Correspondences</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LogicalCorrespondenceRepositoryImpl extends IdentifierImpl implements LogicalCorrespondenceRepository {
	/**
	 * The default value of the '{@link #isCorrespondenceEstablished() <em>Correspondence Established</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCorrespondenceEstablished()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CORRESPONDENCE_ESTABLISHED_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogicalCorrespondenceRepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogicalcorrespondencePackage.Literals.LOGICAL_CORRESPONDENCE_REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<VirtualMemoryMeasurementCorrespondence> getVirtualMemoryMeasurementCorrespondences() {
		return (EList<VirtualMemoryMeasurementCorrespondence>)eDynamicGet(LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__VIRTUAL_MEMORY_MEASUREMENT_CORRESPONDENCES, LogicalcorrespondencePackage.Literals.LOGICAL_CORRESPONDENCE_REPOSITORY__VIRTUAL_MEMORY_MEASUREMENT_CORRESPONDENCES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<VirtualNetworkInterconnectMeasurementCorrespondence> getVirtualNetworkInterconnectMeasurementCorrespondences() {
		return (EList<VirtualNetworkInterconnectMeasurementCorrespondence>)eDynamicGet(LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__VIRTUAL_NETWORK_INTERCONNECT_MEASUREMENT_CORRESPONDENCES, LogicalcorrespondencePackage.Literals.LOGICAL_CORRESPONDENCE_REPOSITORY__VIRTUAL_NETWORK_INTERCONNECT_MEASUREMENT_CORRESPONDENCES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<VirtualProcessingUnitMeasurementCorrespondence> getVirtualProcessingUnitMeasurementCorrespondences() {
		return (EList<VirtualProcessingUnitMeasurementCorrespondence>)eDynamicGet(LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__VIRTUAL_PROCESSING_UNIT_MEASUREMENT_CORRESPONDENCES, LogicalcorrespondencePackage.Literals.LOGICAL_CORRESPONDENCE_REPOSITORY__VIRTUAL_PROCESSING_UNIT_MEASUREMENT_CORRESPONDENCES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<LogicalDiskReadMeasurementCorrespondence> getVolumeMeasurementCorrespondences() {
		return (EList<LogicalDiskReadMeasurementCorrespondence>)eDynamicGet(LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__VOLUME_MEASUREMENT_CORRESPONDENCES, LogicalcorrespondencePackage.Literals.LOGICAL_CORRESPONDENCE_REPOSITORY__VOLUME_MEASUREMENT_CORRESPONDENCES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<VirtualNetworkInterconnectCorrespondence> getVirtualNetworkInterconnects() {
		return (EList<VirtualNetworkInterconnectCorrespondence>)eDynamicGet(LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__VIRTUAL_NETWORK_INTERCONNECTS, LogicalcorrespondencePackage.Literals.LOGICAL_CORRESPONDENCE_REPOSITORY__VIRTUAL_NETWORK_INTERCONNECTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<VMImageCorrespondence> getVmImageCorrespondences() {
		return (EList<VMImageCorrespondence>)eDynamicGet(LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__VM_IMAGE_CORRESPONDENCES, LogicalcorrespondencePackage.Literals.LOGICAL_CORRESPONDENCE_REPOSITORY__VM_IMAGE_CORRESPONDENCES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<VMImageInstanceCorrespondence> getVmImageInstanceCorrespondences() {
		return (EList<VMImageInstanceCorrespondence>)eDynamicGet(LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__VM_IMAGE_INSTANCE_CORRESPONDENCES, LogicalcorrespondencePackage.Literals.LOGICAL_CORRESPONDENCE_REPOSITORY__VM_IMAGE_INSTANCE_CORRESPONDENCES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<VirtualMachineCorrespondence> getVirtualMachineCorrespondences() {
		return (EList<VirtualMachineCorrespondence>)eDynamicGet(LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__VIRTUAL_MACHINE_CORRESPONDENCES, LogicalcorrespondencePackage.Literals.LOGICAL_CORRESPONDENCE_REPOSITORY__VIRTUAL_MACHINE_CORRESPONDENCES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @SuppressWarnings("unchecked")
    public EList<HypervisorCorrespondence> getHypervisorCorrespondences() {
		return (EList<HypervisorCorrespondence>)eDynamicGet(LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__HYPERVISOR_CORRESPONDENCES, LogicalcorrespondencePackage.Literals.LOGICAL_CORRESPONDENCE_REPOSITORY__HYPERVISOR_CORRESPONDENCES, true, true);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @SuppressWarnings("unchecked")
    public EList<NetworkAttachedStorageCorrespondence> getNetworkAttachedStorageCorrespondences() {
		return (EList<NetworkAttachedStorageCorrespondence>)eDynamicGet(LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__NETWORK_ATTACHED_STORAGE_CORRESPONDENCES, LogicalcorrespondencePackage.Literals.LOGICAL_CORRESPONDENCE_REPOSITORY__NETWORK_ATTACHED_STORAGE_CORRESPONDENCES, true, true);
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalDCModel getLogicalDcModel() {
		return (LogicalDCModel)eDynamicGet(LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__LOGICAL_DC_MODEL, LogicalcorrespondencePackage.Literals.LOGICAL_CORRESPONDENCE_REPOSITORY__LOGICAL_DC_MODEL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalDCModel basicGetLogicalDcModel() {
		return (LogicalDCModel)eDynamicGet(LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__LOGICAL_DC_MODEL, LogicalcorrespondencePackage.Literals.LOGICAL_CORRESPONDENCE_REPOSITORY__LOGICAL_DC_MODEL, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogicalDcModel(LogicalDCModel newLogicalDcModel) {
		eDynamicSet(LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__LOGICAL_DC_MODEL, LogicalcorrespondencePackage.Literals.LOGICAL_CORRESPONDENCE_REPOSITORY__LOGICAL_DC_MODEL, newLogicalDcModel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalLoadModel getLogicalLoadModel() {
		return (LogicalLoadModel)eDynamicGet(LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__LOGICAL_LOAD_MODEL, LogicalcorrespondencePackage.Literals.LOGICAL_CORRESPONDENCE_REPOSITORY__LOGICAL_LOAD_MODEL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalLoadModel basicGetLogicalLoadModel() {
		return (LogicalLoadModel)eDynamicGet(LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__LOGICAL_LOAD_MODEL, LogicalcorrespondencePackage.Literals.LOGICAL_CORRESPONDENCE_REPOSITORY__LOGICAL_LOAD_MODEL, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogicalLoadModel(LogicalLoadModel newLogicalLoadModel) {
		eDynamicSet(LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__LOGICAL_LOAD_MODEL, LogicalcorrespondencePackage.Literals.LOGICAL_CORRESPONDENCE_REPOSITORY__LOGICAL_LOAD_MODEL, newLogicalLoadModel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCorrespondenceEstablished() {
		return (Boolean)eDynamicGet(LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__CORRESPONDENCE_ESTABLISHED, LogicalcorrespondencePackage.Literals.LOGICAL_CORRESPONDENCE_REPOSITORY__CORRESPONDENCE_ESTABLISHED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCorrespondenceEstablished(boolean newCorrespondenceEstablished) {
		eDynamicSet(LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__CORRESPONDENCE_ESTABLISHED, LogicalcorrespondencePackage.Literals.LOGICAL_CORRESPONDENCE_REPOSITORY__CORRESPONDENCE_ESTABLISHED, newCorrespondenceEstablished);
	}

	/**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public OptimisationPlanCorrespondence getOptimisationPlanCorrespondence() {
		return (OptimisationPlanCorrespondence)eDynamicGet(LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__OPTIMISATION_PLAN_CORRESPONDENCE, LogicalcorrespondencePackage.Literals.LOGICAL_CORRESPONDENCE_REPOSITORY__OPTIMISATION_PLAN_CORRESPONDENCE, true, true);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public NotificationChain basicSetOptimisationPlanCorrespondence(OptimisationPlanCorrespondence newOptimisationPlanCorrespondence, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newOptimisationPlanCorrespondence, LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__OPTIMISATION_PLAN_CORRESPONDENCE, msgs);
		return msgs;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public void setOptimisationPlanCorrespondence(OptimisationPlanCorrespondence newOptimisationPlanCorrespondence) {
		eDynamicSet(LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__OPTIMISATION_PLAN_CORRESPONDENCE, LogicalcorrespondencePackage.Literals.LOGICAL_CORRESPONDENCE_REPOSITORY__OPTIMISATION_PLAN_CORRESPONDENCE, newOptimisationPlanCorrespondence);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        @SuppressWarnings("unchecked")
        public EList<ProvidedServiceCorrespondence> getProvidedServiceCorrespondences() {
		return (EList<ProvidedServiceCorrespondence>)eDynamicGet(LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__PROVIDED_SERVICE_CORRESPONDENCES, LogicalcorrespondencePackage.Literals.LOGICAL_CORRESPONDENCE_REPOSITORY__PROVIDED_SERVICE_CORRESPONDENCES, true, true);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        @SuppressWarnings("unchecked")
        public EList<RequiredServiceCorrespondence> getRequiredServiceCorrespondences() {
		return (EList<RequiredServiceCorrespondence>)eDynamicGet(LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__REQUIRED_SERVICE_CORRESPONDENCES, LogicalcorrespondencePackage.Literals.LOGICAL_CORRESPONDENCE_REPOSITORY__REQUIRED_SERVICE_CORRESPONDENCES, true, true);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        @SuppressWarnings("unchecked")
        public EList<ScalableVMImageConnectorCorrespondence> getScalableConnectorCorrespondences() {
		return (EList<ScalableVMImageConnectorCorrespondence>)eDynamicGet(LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__SCALABLE_CONNECTOR_CORRESPONDENCES, LogicalcorrespondencePackage.Literals.LOGICAL_CORRESPONDENCE_REPOSITORY__SCALABLE_CONNECTOR_CORRESPONDENCES, true, true);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        @SuppressWarnings("unchecked")
        public EList<UserBehaviourCorrespondence> getUserBehaviourCorrespondences() {
		return (EList<UserBehaviourCorrespondence>)eDynamicGet(LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__USER_BEHAVIOUR_CORRESPONDENCES, LogicalcorrespondencePackage.Literals.LOGICAL_CORRESPONDENCE_REPOSITORY__USER_BEHAVIOUR_CORRESPONDENCES, true, true);
	}

        /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ArrivalRateMeasurementCorrespondence> getArrivalRateMeasurementCorrespondences() {
		return (EList<ArrivalRateMeasurementCorrespondence>)eDynamicGet(LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCES, LogicalcorrespondencePackage.Literals.LOGICAL_CORRESPONDENCE_REPOSITORY__ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCES, true, true);
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ServiceOperationCorrespondence> getServiceOperationCorrespondences() {
		return (EList<ServiceOperationCorrespondence>)eDynamicGet(LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__SERVICE_OPERATION_CORRESPONDENCES, LogicalcorrespondencePackage.Literals.LOGICAL_CORRESPONDENCE_REPOSITORY__SERVICE_OPERATION_CORRESPONDENCES, true, true);
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ApplicationProvidedServiceCorrespondence> getApplicationProvidedServiceCorrespondences() {
		return (EList<ApplicationProvidedServiceCorrespondence>)eDynamicGet(LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__APPLICATION_PROVIDED_SERVICE_CORRESPONDENCES, LogicalcorrespondencePackage.Literals.LOGICAL_CORRESPONDENCE_REPOSITORY__APPLICATION_PROVIDED_SERVICE_CORRESPONDENCES, true, true);
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__VIRTUAL_MEMORY_MEASUREMENT_CORRESPONDENCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVirtualMemoryMeasurementCorrespondences()).basicAdd(otherEnd, msgs);
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__VIRTUAL_NETWORK_INTERCONNECT_MEASUREMENT_CORRESPONDENCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVirtualNetworkInterconnectMeasurementCorrespondences()).basicAdd(otherEnd, msgs);
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__VIRTUAL_PROCESSING_UNIT_MEASUREMENT_CORRESPONDENCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVirtualProcessingUnitMeasurementCorrespondences()).basicAdd(otherEnd, msgs);
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__VOLUME_MEASUREMENT_CORRESPONDENCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVolumeMeasurementCorrespondences()).basicAdd(otherEnd, msgs);
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__VIRTUAL_NETWORK_INTERCONNECTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVirtualNetworkInterconnects()).basicAdd(otherEnd, msgs);
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__VM_IMAGE_CORRESPONDENCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVmImageCorrespondences()).basicAdd(otherEnd, msgs);
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__VM_IMAGE_INSTANCE_CORRESPONDENCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVmImageInstanceCorrespondences()).basicAdd(otherEnd, msgs);
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__VIRTUAL_MACHINE_CORRESPONDENCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVirtualMachineCorrespondences()).basicAdd(otherEnd, msgs);
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__HYPERVISOR_CORRESPONDENCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHypervisorCorrespondences()).basicAdd(otherEnd, msgs);
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__NETWORK_ATTACHED_STORAGE_CORRESPONDENCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNetworkAttachedStorageCorrespondences()).basicAdd(otherEnd, msgs);
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__OPTIMISATION_PLAN_CORRESPONDENCE:
				OptimisationPlanCorrespondence optimisationPlanCorrespondence = getOptimisationPlanCorrespondence();
				if (optimisationPlanCorrespondence != null)
					msgs = ((InternalEObject)optimisationPlanCorrespondence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__OPTIMISATION_PLAN_CORRESPONDENCE, null, msgs);
				return basicSetOptimisationPlanCorrespondence((OptimisationPlanCorrespondence)otherEnd, msgs);
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__PROVIDED_SERVICE_CORRESPONDENCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProvidedServiceCorrespondences()).basicAdd(otherEnd, msgs);
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__REQUIRED_SERVICE_CORRESPONDENCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRequiredServiceCorrespondences()).basicAdd(otherEnd, msgs);
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__SCALABLE_CONNECTOR_CORRESPONDENCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getScalableConnectorCorrespondences()).basicAdd(otherEnd, msgs);
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__USER_BEHAVIOUR_CORRESPONDENCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUserBehaviourCorrespondences()).basicAdd(otherEnd, msgs);
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getArrivalRateMeasurementCorrespondences()).basicAdd(otherEnd, msgs);
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__SERVICE_OPERATION_CORRESPONDENCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getServiceOperationCorrespondences()).basicAdd(otherEnd, msgs);
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__APPLICATION_PROVIDED_SERVICE_CORRESPONDENCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getApplicationProvidedServiceCorrespondences()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__VIRTUAL_MEMORY_MEASUREMENT_CORRESPONDENCES:
				return ((InternalEList<?>)getVirtualMemoryMeasurementCorrespondences()).basicRemove(otherEnd, msgs);
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__VIRTUAL_NETWORK_INTERCONNECT_MEASUREMENT_CORRESPONDENCES:
				return ((InternalEList<?>)getVirtualNetworkInterconnectMeasurementCorrespondences()).basicRemove(otherEnd, msgs);
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__VIRTUAL_PROCESSING_UNIT_MEASUREMENT_CORRESPONDENCES:
				return ((InternalEList<?>)getVirtualProcessingUnitMeasurementCorrespondences()).basicRemove(otherEnd, msgs);
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__VOLUME_MEASUREMENT_CORRESPONDENCES:
				return ((InternalEList<?>)getVolumeMeasurementCorrespondences()).basicRemove(otherEnd, msgs);
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__VIRTUAL_NETWORK_INTERCONNECTS:
				return ((InternalEList<?>)getVirtualNetworkInterconnects()).basicRemove(otherEnd, msgs);
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__VM_IMAGE_CORRESPONDENCES:
				return ((InternalEList<?>)getVmImageCorrespondences()).basicRemove(otherEnd, msgs);
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__VM_IMAGE_INSTANCE_CORRESPONDENCES:
				return ((InternalEList<?>)getVmImageInstanceCorrespondences()).basicRemove(otherEnd, msgs);
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__VIRTUAL_MACHINE_CORRESPONDENCES:
				return ((InternalEList<?>)getVirtualMachineCorrespondences()).basicRemove(otherEnd, msgs);
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__HYPERVISOR_CORRESPONDENCES:
				return ((InternalEList<?>)getHypervisorCorrespondences()).basicRemove(otherEnd, msgs);
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__NETWORK_ATTACHED_STORAGE_CORRESPONDENCES:
				return ((InternalEList<?>)getNetworkAttachedStorageCorrespondences()).basicRemove(otherEnd, msgs);
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__OPTIMISATION_PLAN_CORRESPONDENCE:
				return basicSetOptimisationPlanCorrespondence(null, msgs);
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__PROVIDED_SERVICE_CORRESPONDENCES:
				return ((InternalEList<?>)getProvidedServiceCorrespondences()).basicRemove(otherEnd, msgs);
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__REQUIRED_SERVICE_CORRESPONDENCES:
				return ((InternalEList<?>)getRequiredServiceCorrespondences()).basicRemove(otherEnd, msgs);
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__SCALABLE_CONNECTOR_CORRESPONDENCES:
				return ((InternalEList<?>)getScalableConnectorCorrespondences()).basicRemove(otherEnd, msgs);
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__USER_BEHAVIOUR_CORRESPONDENCES:
				return ((InternalEList<?>)getUserBehaviourCorrespondences()).basicRemove(otherEnd, msgs);
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCES:
				return ((InternalEList<?>)getArrivalRateMeasurementCorrespondences()).basicRemove(otherEnd, msgs);
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__SERVICE_OPERATION_CORRESPONDENCES:
				return ((InternalEList<?>)getServiceOperationCorrespondences()).basicRemove(otherEnd, msgs);
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__APPLICATION_PROVIDED_SERVICE_CORRESPONDENCES:
				return ((InternalEList<?>)getApplicationProvidedServiceCorrespondences()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__VIRTUAL_MEMORY_MEASUREMENT_CORRESPONDENCES:
				return getVirtualMemoryMeasurementCorrespondences();
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__VIRTUAL_NETWORK_INTERCONNECT_MEASUREMENT_CORRESPONDENCES:
				return getVirtualNetworkInterconnectMeasurementCorrespondences();
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__VIRTUAL_PROCESSING_UNIT_MEASUREMENT_CORRESPONDENCES:
				return getVirtualProcessingUnitMeasurementCorrespondences();
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__VOLUME_MEASUREMENT_CORRESPONDENCES:
				return getVolumeMeasurementCorrespondences();
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__VIRTUAL_NETWORK_INTERCONNECTS:
				return getVirtualNetworkInterconnects();
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__VM_IMAGE_CORRESPONDENCES:
				return getVmImageCorrespondences();
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__VM_IMAGE_INSTANCE_CORRESPONDENCES:
				return getVmImageInstanceCorrespondences();
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__VIRTUAL_MACHINE_CORRESPONDENCES:
				return getVirtualMachineCorrespondences();
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__HYPERVISOR_CORRESPONDENCES:
				return getHypervisorCorrespondences();
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__NETWORK_ATTACHED_STORAGE_CORRESPONDENCES:
				return getNetworkAttachedStorageCorrespondences();
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__LOGICAL_DC_MODEL:
				if (resolve) return getLogicalDcModel();
				return basicGetLogicalDcModel();
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__LOGICAL_LOAD_MODEL:
				if (resolve) return getLogicalLoadModel();
				return basicGetLogicalLoadModel();
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__CORRESPONDENCE_ESTABLISHED:
				return isCorrespondenceEstablished();
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__OPTIMISATION_PLAN_CORRESPONDENCE:
				return getOptimisationPlanCorrespondence();
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__PROVIDED_SERVICE_CORRESPONDENCES:
				return getProvidedServiceCorrespondences();
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__REQUIRED_SERVICE_CORRESPONDENCES:
				return getRequiredServiceCorrespondences();
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__SCALABLE_CONNECTOR_CORRESPONDENCES:
				return getScalableConnectorCorrespondences();
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__USER_BEHAVIOUR_CORRESPONDENCES:
				return getUserBehaviourCorrespondences();
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCES:
				return getArrivalRateMeasurementCorrespondences();
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__SERVICE_OPERATION_CORRESPONDENCES:
				return getServiceOperationCorrespondences();
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__APPLICATION_PROVIDED_SERVICE_CORRESPONDENCES:
				return getApplicationProvidedServiceCorrespondences();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__VIRTUAL_MEMORY_MEASUREMENT_CORRESPONDENCES:
				getVirtualMemoryMeasurementCorrespondences().clear();
				getVirtualMemoryMeasurementCorrespondences().addAll((Collection<? extends VirtualMemoryMeasurementCorrespondence>)newValue);
				return;
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__VIRTUAL_NETWORK_INTERCONNECT_MEASUREMENT_CORRESPONDENCES:
				getVirtualNetworkInterconnectMeasurementCorrespondences().clear();
				getVirtualNetworkInterconnectMeasurementCorrespondences().addAll((Collection<? extends VirtualNetworkInterconnectMeasurementCorrespondence>)newValue);
				return;
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__VIRTUAL_PROCESSING_UNIT_MEASUREMENT_CORRESPONDENCES:
				getVirtualProcessingUnitMeasurementCorrespondences().clear();
				getVirtualProcessingUnitMeasurementCorrespondences().addAll((Collection<? extends VirtualProcessingUnitMeasurementCorrespondence>)newValue);
				return;
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__VOLUME_MEASUREMENT_CORRESPONDENCES:
				getVolumeMeasurementCorrespondences().clear();
				getVolumeMeasurementCorrespondences().addAll((Collection<? extends LogicalDiskReadMeasurementCorrespondence>)newValue);
				return;
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__VIRTUAL_NETWORK_INTERCONNECTS:
				getVirtualNetworkInterconnects().clear();
				getVirtualNetworkInterconnects().addAll((Collection<? extends VirtualNetworkInterconnectCorrespondence>)newValue);
				return;
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__VM_IMAGE_CORRESPONDENCES:
				getVmImageCorrespondences().clear();
				getVmImageCorrespondences().addAll((Collection<? extends VMImageCorrespondence>)newValue);
				return;
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__VM_IMAGE_INSTANCE_CORRESPONDENCES:
				getVmImageInstanceCorrespondences().clear();
				getVmImageInstanceCorrespondences().addAll((Collection<? extends VMImageInstanceCorrespondence>)newValue);
				return;
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__VIRTUAL_MACHINE_CORRESPONDENCES:
				getVirtualMachineCorrespondences().clear();
				getVirtualMachineCorrespondences().addAll((Collection<? extends VirtualMachineCorrespondence>)newValue);
				return;
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__HYPERVISOR_CORRESPONDENCES:
				getHypervisorCorrespondences().clear();
				getHypervisorCorrespondences().addAll((Collection<? extends HypervisorCorrespondence>)newValue);
				return;
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__NETWORK_ATTACHED_STORAGE_CORRESPONDENCES:
				getNetworkAttachedStorageCorrespondences().clear();
				getNetworkAttachedStorageCorrespondences().addAll((Collection<? extends NetworkAttachedStorageCorrespondence>)newValue);
				return;
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__LOGICAL_DC_MODEL:
				setLogicalDcModel((LogicalDCModel)newValue);
				return;
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__LOGICAL_LOAD_MODEL:
				setLogicalLoadModel((LogicalLoadModel)newValue);
				return;
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__CORRESPONDENCE_ESTABLISHED:
				setCorrespondenceEstablished((Boolean)newValue);
				return;
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__OPTIMISATION_PLAN_CORRESPONDENCE:
				setOptimisationPlanCorrespondence((OptimisationPlanCorrespondence)newValue);
				return;
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__PROVIDED_SERVICE_CORRESPONDENCES:
				getProvidedServiceCorrespondences().clear();
				getProvidedServiceCorrespondences().addAll((Collection<? extends ProvidedServiceCorrespondence>)newValue);
				return;
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__REQUIRED_SERVICE_CORRESPONDENCES:
				getRequiredServiceCorrespondences().clear();
				getRequiredServiceCorrespondences().addAll((Collection<? extends RequiredServiceCorrespondence>)newValue);
				return;
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__SCALABLE_CONNECTOR_CORRESPONDENCES:
				getScalableConnectorCorrespondences().clear();
				getScalableConnectorCorrespondences().addAll((Collection<? extends ScalableVMImageConnectorCorrespondence>)newValue);
				return;
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__USER_BEHAVIOUR_CORRESPONDENCES:
				getUserBehaviourCorrespondences().clear();
				getUserBehaviourCorrespondences().addAll((Collection<? extends UserBehaviourCorrespondence>)newValue);
				return;
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCES:
				getArrivalRateMeasurementCorrespondences().clear();
				getArrivalRateMeasurementCorrespondences().addAll((Collection<? extends ArrivalRateMeasurementCorrespondence>)newValue);
				return;
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__SERVICE_OPERATION_CORRESPONDENCES:
				getServiceOperationCorrespondences().clear();
				getServiceOperationCorrespondences().addAll((Collection<? extends ServiceOperationCorrespondence>)newValue);
				return;
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__APPLICATION_PROVIDED_SERVICE_CORRESPONDENCES:
				getApplicationProvidedServiceCorrespondences().clear();
				getApplicationProvidedServiceCorrespondences().addAll((Collection<? extends ApplicationProvidedServiceCorrespondence>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__VIRTUAL_MEMORY_MEASUREMENT_CORRESPONDENCES:
				getVirtualMemoryMeasurementCorrespondences().clear();
				return;
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__VIRTUAL_NETWORK_INTERCONNECT_MEASUREMENT_CORRESPONDENCES:
				getVirtualNetworkInterconnectMeasurementCorrespondences().clear();
				return;
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__VIRTUAL_PROCESSING_UNIT_MEASUREMENT_CORRESPONDENCES:
				getVirtualProcessingUnitMeasurementCorrespondences().clear();
				return;
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__VOLUME_MEASUREMENT_CORRESPONDENCES:
				getVolumeMeasurementCorrespondences().clear();
				return;
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__VIRTUAL_NETWORK_INTERCONNECTS:
				getVirtualNetworkInterconnects().clear();
				return;
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__VM_IMAGE_CORRESPONDENCES:
				getVmImageCorrespondences().clear();
				return;
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__VM_IMAGE_INSTANCE_CORRESPONDENCES:
				getVmImageInstanceCorrespondences().clear();
				return;
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__VIRTUAL_MACHINE_CORRESPONDENCES:
				getVirtualMachineCorrespondences().clear();
				return;
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__HYPERVISOR_CORRESPONDENCES:
				getHypervisorCorrespondences().clear();
				return;
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__NETWORK_ATTACHED_STORAGE_CORRESPONDENCES:
				getNetworkAttachedStorageCorrespondences().clear();
				return;
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__LOGICAL_DC_MODEL:
				setLogicalDcModel((LogicalDCModel)null);
				return;
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__LOGICAL_LOAD_MODEL:
				setLogicalLoadModel((LogicalLoadModel)null);
				return;
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__CORRESPONDENCE_ESTABLISHED:
				setCorrespondenceEstablished(CORRESPONDENCE_ESTABLISHED_EDEFAULT);
				return;
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__OPTIMISATION_PLAN_CORRESPONDENCE:
				setOptimisationPlanCorrespondence((OptimisationPlanCorrespondence)null);
				return;
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__PROVIDED_SERVICE_CORRESPONDENCES:
				getProvidedServiceCorrespondences().clear();
				return;
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__REQUIRED_SERVICE_CORRESPONDENCES:
				getRequiredServiceCorrespondences().clear();
				return;
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__SCALABLE_CONNECTOR_CORRESPONDENCES:
				getScalableConnectorCorrespondences().clear();
				return;
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__USER_BEHAVIOUR_CORRESPONDENCES:
				getUserBehaviourCorrespondences().clear();
				return;
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCES:
				getArrivalRateMeasurementCorrespondences().clear();
				return;
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__SERVICE_OPERATION_CORRESPONDENCES:
				getServiceOperationCorrespondences().clear();
				return;
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__APPLICATION_PROVIDED_SERVICE_CORRESPONDENCES:
				getApplicationProvidedServiceCorrespondences().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__VIRTUAL_MEMORY_MEASUREMENT_CORRESPONDENCES:
				return !getVirtualMemoryMeasurementCorrespondences().isEmpty();
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__VIRTUAL_NETWORK_INTERCONNECT_MEASUREMENT_CORRESPONDENCES:
				return !getVirtualNetworkInterconnectMeasurementCorrespondences().isEmpty();
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__VIRTUAL_PROCESSING_UNIT_MEASUREMENT_CORRESPONDENCES:
				return !getVirtualProcessingUnitMeasurementCorrespondences().isEmpty();
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__VOLUME_MEASUREMENT_CORRESPONDENCES:
				return !getVolumeMeasurementCorrespondences().isEmpty();
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__VIRTUAL_NETWORK_INTERCONNECTS:
				return !getVirtualNetworkInterconnects().isEmpty();
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__VM_IMAGE_CORRESPONDENCES:
				return !getVmImageCorrespondences().isEmpty();
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__VM_IMAGE_INSTANCE_CORRESPONDENCES:
				return !getVmImageInstanceCorrespondences().isEmpty();
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__VIRTUAL_MACHINE_CORRESPONDENCES:
				return !getVirtualMachineCorrespondences().isEmpty();
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__HYPERVISOR_CORRESPONDENCES:
				return !getHypervisorCorrespondences().isEmpty();
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__NETWORK_ATTACHED_STORAGE_CORRESPONDENCES:
				return !getNetworkAttachedStorageCorrespondences().isEmpty();
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__LOGICAL_DC_MODEL:
				return basicGetLogicalDcModel() != null;
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__LOGICAL_LOAD_MODEL:
				return basicGetLogicalLoadModel() != null;
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__CORRESPONDENCE_ESTABLISHED:
				return isCorrespondenceEstablished() != CORRESPONDENCE_ESTABLISHED_EDEFAULT;
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__OPTIMISATION_PLAN_CORRESPONDENCE:
				return getOptimisationPlanCorrespondence() != null;
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__PROVIDED_SERVICE_CORRESPONDENCES:
				return !getProvidedServiceCorrespondences().isEmpty();
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__REQUIRED_SERVICE_CORRESPONDENCES:
				return !getRequiredServiceCorrespondences().isEmpty();
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__SCALABLE_CONNECTOR_CORRESPONDENCES:
				return !getScalableConnectorCorrespondences().isEmpty();
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__USER_BEHAVIOUR_CORRESPONDENCES:
				return !getUserBehaviourCorrespondences().isEmpty();
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCES:
				return !getArrivalRateMeasurementCorrespondences().isEmpty();
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__SERVICE_OPERATION_CORRESPONDENCES:
				return !getServiceOperationCorrespondences().isEmpty();
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__APPLICATION_PROVIDED_SERVICE_CORRESPONDENCES:
				return !getApplicationProvidedServiceCorrespondences().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LogicalCorrespondenceRepositoryImpl
