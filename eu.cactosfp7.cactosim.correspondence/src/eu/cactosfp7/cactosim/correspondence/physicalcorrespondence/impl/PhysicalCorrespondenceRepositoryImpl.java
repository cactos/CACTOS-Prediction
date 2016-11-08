/**
 */
package eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl;

import eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.AbstractNodeCorrespondence;
import eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.ArchitectureTypeCorrespondence;
import eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.InterconnectMeasurementCorrespondence;
import eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.MemoryMeasurementCorrespondence;
import eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.MemorySpecificationCorrespondence;
import eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.NetworkInterconnectCorrespondence;
import eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalCorrespondenceRepository;
import eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalcorrespondencePackage;
import eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PowerConsumingEntityMeasurementCorrespondence;
import eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PowerConsumingResourceCorrespondence;
import eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PowerProvidingEntityCorrespondence;
import eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.ProcessingUnitSpecificationCorrespondence;
import eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PuMeasurementCorrespondence;
import eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.RackCorrespondence;
import eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.StorageMeasurementCorrespondence;
import eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.StorageSpecificationCorrespondence;
import eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.SwitchCorrespondence;

import eu.cactosfp7.identifier.impl.IdentifierImpl;

import eu.cactosfp7.infrastructuremodels.load.physical.PhysicalLoadModel;

import eu.cactosfp7.infrastructuremodels.physicaldc.core.PhysicalDCModel;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Physical Correspondence Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.PhysicalCorrespondenceRepositoryImpl#isCorrespondenceEstablished <em>Correspondence Established</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.PhysicalCorrespondenceRepositoryImpl#getPuMeasurementCorrespondences <em>Pu Measurement Correspondences</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.PhysicalCorrespondenceRepositoryImpl#getMemoryMeasurementCorrespondences <em>Memory Measurement Correspondences</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.PhysicalCorrespondenceRepositoryImpl#getStorageMeasurementCorrespondences <em>Storage Measurement Correspondences</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.PhysicalCorrespondenceRepositoryImpl#getInterconnectMeasurementCorrespondences <em>Interconnect Measurement Correspondences</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.PhysicalCorrespondenceRepositoryImpl#getSwitchCorrespondences <em>Switch Correspondences</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.PhysicalCorrespondenceRepositoryImpl#getRackCorrespondences <em>Rack Correspondences</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.PhysicalCorrespondenceRepositoryImpl#getAbstractNodeCorrespondences <em>Abstract Node Correspondences</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.PhysicalCorrespondenceRepositoryImpl#getMemorySpecificationCorrespondences <em>Memory Specification Correspondences</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.PhysicalCorrespondenceRepositoryImpl#getStorageSpecificationCorrespondences <em>Storage Specification Correspondences</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.PhysicalCorrespondenceRepositoryImpl#getNetworkInterconnectCorrespondences <em>Network Interconnect Correspondences</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.PhysicalCorrespondenceRepositoryImpl#getProcessingUnitSpecificationCorrespondences <em>Processing Unit Specification Correspondences</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.PhysicalCorrespondenceRepositoryImpl#getPhysicalDcModel <em>Physical Dc Model</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.PhysicalCorrespondenceRepositoryImpl#getPhysicalLoadModel <em>Physical Load Model</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.PhysicalCorrespondenceRepositoryImpl#getPowerConsumingEntityMeasurementCorrespondences <em>Power Consuming Entity Measurement Correspondences</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.PhysicalCorrespondenceRepositoryImpl#getPowerProvidingEntityCorrespondences <em>Power Providing Entity Correspondences</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.PhysicalCorrespondenceRepositoryImpl#getPowerConsumingResourceCorrespondences <em>Power Consuming Resource Correspondences</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.impl.PhysicalCorrespondenceRepositoryImpl#getArchitectureTypeCorrespondences <em>Architecture Type Correspondences</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PhysicalCorrespondenceRepositoryImpl extends IdentifierImpl implements PhysicalCorrespondenceRepository {
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
	protected PhysicalCorrespondenceRepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PhysicalcorrespondencePackage.Literals.PHYSICAL_CORRESPONDENCE_REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCorrespondenceEstablished() {
		return (Boolean)eDynamicGet(PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__CORRESPONDENCE_ESTABLISHED, PhysicalcorrespondencePackage.Literals.PHYSICAL_CORRESPONDENCE_REPOSITORY__CORRESPONDENCE_ESTABLISHED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCorrespondenceEstablished(boolean newCorrespondenceEstablished) {
		eDynamicSet(PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__CORRESPONDENCE_ESTABLISHED, PhysicalcorrespondencePackage.Literals.PHYSICAL_CORRESPONDENCE_REPOSITORY__CORRESPONDENCE_ESTABLISHED, newCorrespondenceEstablished);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<PuMeasurementCorrespondence> getPuMeasurementCorrespondences() {
		return (EList<PuMeasurementCorrespondence>)eDynamicGet(PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__PU_MEASUREMENT_CORRESPONDENCES, PhysicalcorrespondencePackage.Literals.PHYSICAL_CORRESPONDENCE_REPOSITORY__PU_MEASUREMENT_CORRESPONDENCES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<MemoryMeasurementCorrespondence> getMemoryMeasurementCorrespondences() {
		return (EList<MemoryMeasurementCorrespondence>)eDynamicGet(PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__MEMORY_MEASUREMENT_CORRESPONDENCES, PhysicalcorrespondencePackage.Literals.PHYSICAL_CORRESPONDENCE_REPOSITORY__MEMORY_MEASUREMENT_CORRESPONDENCES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<StorageMeasurementCorrespondence> getStorageMeasurementCorrespondences() {
		return (EList<StorageMeasurementCorrespondence>)eDynamicGet(PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__STORAGE_MEASUREMENT_CORRESPONDENCES, PhysicalcorrespondencePackage.Literals.PHYSICAL_CORRESPONDENCE_REPOSITORY__STORAGE_MEASUREMENT_CORRESPONDENCES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<InterconnectMeasurementCorrespondence> getInterconnectMeasurementCorrespondences() {
		return (EList<InterconnectMeasurementCorrespondence>)eDynamicGet(PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__INTERCONNECT_MEASUREMENT_CORRESPONDENCES, PhysicalcorrespondencePackage.Literals.PHYSICAL_CORRESPONDENCE_REPOSITORY__INTERCONNECT_MEASUREMENT_CORRESPONDENCES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<SwitchCorrespondence> getSwitchCorrespondences() {
		return (EList<SwitchCorrespondence>)eDynamicGet(PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__SWITCH_CORRESPONDENCES, PhysicalcorrespondencePackage.Literals.PHYSICAL_CORRESPONDENCE_REPOSITORY__SWITCH_CORRESPONDENCES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<RackCorrespondence> getRackCorrespondences() {
		return (EList<RackCorrespondence>)eDynamicGet(PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__RACK_CORRESPONDENCES, PhysicalcorrespondencePackage.Literals.PHYSICAL_CORRESPONDENCE_REPOSITORY__RACK_CORRESPONDENCES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<AbstractNodeCorrespondence> getAbstractNodeCorrespondences() {
		return (EList<AbstractNodeCorrespondence>)eDynamicGet(PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__ABSTRACT_NODE_CORRESPONDENCES, PhysicalcorrespondencePackage.Literals.PHYSICAL_CORRESPONDENCE_REPOSITORY__ABSTRACT_NODE_CORRESPONDENCES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<MemorySpecificationCorrespondence> getMemorySpecificationCorrespondences() {
		return (EList<MemorySpecificationCorrespondence>)eDynamicGet(PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__MEMORY_SPECIFICATION_CORRESPONDENCES, PhysicalcorrespondencePackage.Literals.PHYSICAL_CORRESPONDENCE_REPOSITORY__MEMORY_SPECIFICATION_CORRESPONDENCES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<StorageSpecificationCorrespondence> getStorageSpecificationCorrespondences() {
		return (EList<StorageSpecificationCorrespondence>)eDynamicGet(PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__STORAGE_SPECIFICATION_CORRESPONDENCES, PhysicalcorrespondencePackage.Literals.PHYSICAL_CORRESPONDENCE_REPOSITORY__STORAGE_SPECIFICATION_CORRESPONDENCES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<NetworkInterconnectCorrespondence> getNetworkInterconnectCorrespondences() {
		return (EList<NetworkInterconnectCorrespondence>)eDynamicGet(PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__NETWORK_INTERCONNECT_CORRESPONDENCES, PhysicalcorrespondencePackage.Literals.PHYSICAL_CORRESPONDENCE_REPOSITORY__NETWORK_INTERCONNECT_CORRESPONDENCES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ProcessingUnitSpecificationCorrespondence> getProcessingUnitSpecificationCorrespondences() {
		return (EList<ProcessingUnitSpecificationCorrespondence>)eDynamicGet(PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__PROCESSING_UNIT_SPECIFICATION_CORRESPONDENCES, PhysicalcorrespondencePackage.Literals.PHYSICAL_CORRESPONDENCE_REPOSITORY__PROCESSING_UNIT_SPECIFICATION_CORRESPONDENCES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalDCModel getPhysicalDcModel() {
		return (PhysicalDCModel)eDynamicGet(PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__PHYSICAL_DC_MODEL, PhysicalcorrespondencePackage.Literals.PHYSICAL_CORRESPONDENCE_REPOSITORY__PHYSICAL_DC_MODEL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalDCModel basicGetPhysicalDcModel() {
		return (PhysicalDCModel)eDynamicGet(PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__PHYSICAL_DC_MODEL, PhysicalcorrespondencePackage.Literals.PHYSICAL_CORRESPONDENCE_REPOSITORY__PHYSICAL_DC_MODEL, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhysicalDcModel(PhysicalDCModel newPhysicalDcModel) {
		eDynamicSet(PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__PHYSICAL_DC_MODEL, PhysicalcorrespondencePackage.Literals.PHYSICAL_CORRESPONDENCE_REPOSITORY__PHYSICAL_DC_MODEL, newPhysicalDcModel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalLoadModel getPhysicalLoadModel() {
		return (PhysicalLoadModel)eDynamicGet(PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__PHYSICAL_LOAD_MODEL, PhysicalcorrespondencePackage.Literals.PHYSICAL_CORRESPONDENCE_REPOSITORY__PHYSICAL_LOAD_MODEL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalLoadModel basicGetPhysicalLoadModel() {
		return (PhysicalLoadModel)eDynamicGet(PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__PHYSICAL_LOAD_MODEL, PhysicalcorrespondencePackage.Literals.PHYSICAL_CORRESPONDENCE_REPOSITORY__PHYSICAL_LOAD_MODEL, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhysicalLoadModel(PhysicalLoadModel newPhysicalLoadModel) {
		eDynamicSet(PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__PHYSICAL_LOAD_MODEL, PhysicalcorrespondencePackage.Literals.PHYSICAL_CORRESPONDENCE_REPOSITORY__PHYSICAL_LOAD_MODEL, newPhysicalLoadModel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<PowerConsumingEntityMeasurementCorrespondence> getPowerConsumingEntityMeasurementCorrespondences() {
		return (EList<PowerConsumingEntityMeasurementCorrespondence>)eDynamicGet(PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__POWER_CONSUMING_ENTITY_MEASUREMENT_CORRESPONDENCES, PhysicalcorrespondencePackage.Literals.PHYSICAL_CORRESPONDENCE_REPOSITORY__POWER_CONSUMING_ENTITY_MEASUREMENT_CORRESPONDENCES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<PowerProvidingEntityCorrespondence> getPowerProvidingEntityCorrespondences() {
		return (EList<PowerProvidingEntityCorrespondence>)eDynamicGet(PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__POWER_PROVIDING_ENTITY_CORRESPONDENCES, PhysicalcorrespondencePackage.Literals.PHYSICAL_CORRESPONDENCE_REPOSITORY__POWER_PROVIDING_ENTITY_CORRESPONDENCES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<PowerConsumingResourceCorrespondence> getPowerConsumingResourceCorrespondences() {
		return (EList<PowerConsumingResourceCorrespondence>)eDynamicGet(PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__POWER_CONSUMING_RESOURCE_CORRESPONDENCES, PhysicalcorrespondencePackage.Literals.PHYSICAL_CORRESPONDENCE_REPOSITORY__POWER_CONSUMING_RESOURCE_CORRESPONDENCES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @SuppressWarnings("unchecked")
    public EList<ArchitectureTypeCorrespondence> getArchitectureTypeCorrespondences() {
		return (EList<ArchitectureTypeCorrespondence>)eDynamicGet(PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__ARCHITECTURE_TYPE_CORRESPONDENCES, PhysicalcorrespondencePackage.Literals.PHYSICAL_CORRESPONDENCE_REPOSITORY__ARCHITECTURE_TYPE_CORRESPONDENCES, true, true);
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
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__PU_MEASUREMENT_CORRESPONDENCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPuMeasurementCorrespondences()).basicAdd(otherEnd, msgs);
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__MEMORY_MEASUREMENT_CORRESPONDENCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMemoryMeasurementCorrespondences()).basicAdd(otherEnd, msgs);
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__STORAGE_MEASUREMENT_CORRESPONDENCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStorageMeasurementCorrespondences()).basicAdd(otherEnd, msgs);
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__INTERCONNECT_MEASUREMENT_CORRESPONDENCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInterconnectMeasurementCorrespondences()).basicAdd(otherEnd, msgs);
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__SWITCH_CORRESPONDENCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSwitchCorrespondences()).basicAdd(otherEnd, msgs);
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__RACK_CORRESPONDENCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRackCorrespondences()).basicAdd(otherEnd, msgs);
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__ABSTRACT_NODE_CORRESPONDENCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAbstractNodeCorrespondences()).basicAdd(otherEnd, msgs);
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__MEMORY_SPECIFICATION_CORRESPONDENCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMemorySpecificationCorrespondences()).basicAdd(otherEnd, msgs);
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__STORAGE_SPECIFICATION_CORRESPONDENCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStorageSpecificationCorrespondences()).basicAdd(otherEnd, msgs);
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__NETWORK_INTERCONNECT_CORRESPONDENCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNetworkInterconnectCorrespondences()).basicAdd(otherEnd, msgs);
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__PROCESSING_UNIT_SPECIFICATION_CORRESPONDENCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProcessingUnitSpecificationCorrespondences()).basicAdd(otherEnd, msgs);
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__POWER_CONSUMING_ENTITY_MEASUREMENT_CORRESPONDENCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPowerConsumingEntityMeasurementCorrespondences()).basicAdd(otherEnd, msgs);
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__POWER_PROVIDING_ENTITY_CORRESPONDENCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPowerProvidingEntityCorrespondences()).basicAdd(otherEnd, msgs);
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__POWER_CONSUMING_RESOURCE_CORRESPONDENCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPowerConsumingResourceCorrespondences()).basicAdd(otherEnd, msgs);
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__ARCHITECTURE_TYPE_CORRESPONDENCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getArchitectureTypeCorrespondences()).basicAdd(otherEnd, msgs);
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
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__PU_MEASUREMENT_CORRESPONDENCES:
				return ((InternalEList<?>)getPuMeasurementCorrespondences()).basicRemove(otherEnd, msgs);
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__MEMORY_MEASUREMENT_CORRESPONDENCES:
				return ((InternalEList<?>)getMemoryMeasurementCorrespondences()).basicRemove(otherEnd, msgs);
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__STORAGE_MEASUREMENT_CORRESPONDENCES:
				return ((InternalEList<?>)getStorageMeasurementCorrespondences()).basicRemove(otherEnd, msgs);
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__INTERCONNECT_MEASUREMENT_CORRESPONDENCES:
				return ((InternalEList<?>)getInterconnectMeasurementCorrespondences()).basicRemove(otherEnd, msgs);
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__SWITCH_CORRESPONDENCES:
				return ((InternalEList<?>)getSwitchCorrespondences()).basicRemove(otherEnd, msgs);
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__RACK_CORRESPONDENCES:
				return ((InternalEList<?>)getRackCorrespondences()).basicRemove(otherEnd, msgs);
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__ABSTRACT_NODE_CORRESPONDENCES:
				return ((InternalEList<?>)getAbstractNodeCorrespondences()).basicRemove(otherEnd, msgs);
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__MEMORY_SPECIFICATION_CORRESPONDENCES:
				return ((InternalEList<?>)getMemorySpecificationCorrespondences()).basicRemove(otherEnd, msgs);
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__STORAGE_SPECIFICATION_CORRESPONDENCES:
				return ((InternalEList<?>)getStorageSpecificationCorrespondences()).basicRemove(otherEnd, msgs);
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__NETWORK_INTERCONNECT_CORRESPONDENCES:
				return ((InternalEList<?>)getNetworkInterconnectCorrespondences()).basicRemove(otherEnd, msgs);
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__PROCESSING_UNIT_SPECIFICATION_CORRESPONDENCES:
				return ((InternalEList<?>)getProcessingUnitSpecificationCorrespondences()).basicRemove(otherEnd, msgs);
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__POWER_CONSUMING_ENTITY_MEASUREMENT_CORRESPONDENCES:
				return ((InternalEList<?>)getPowerConsumingEntityMeasurementCorrespondences()).basicRemove(otherEnd, msgs);
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__POWER_PROVIDING_ENTITY_CORRESPONDENCES:
				return ((InternalEList<?>)getPowerProvidingEntityCorrespondences()).basicRemove(otherEnd, msgs);
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__POWER_CONSUMING_RESOURCE_CORRESPONDENCES:
				return ((InternalEList<?>)getPowerConsumingResourceCorrespondences()).basicRemove(otherEnd, msgs);
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__ARCHITECTURE_TYPE_CORRESPONDENCES:
				return ((InternalEList<?>)getArchitectureTypeCorrespondences()).basicRemove(otherEnd, msgs);
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
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__CORRESPONDENCE_ESTABLISHED:
				return isCorrespondenceEstablished();
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__PU_MEASUREMENT_CORRESPONDENCES:
				return getPuMeasurementCorrespondences();
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__MEMORY_MEASUREMENT_CORRESPONDENCES:
				return getMemoryMeasurementCorrespondences();
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__STORAGE_MEASUREMENT_CORRESPONDENCES:
				return getStorageMeasurementCorrespondences();
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__INTERCONNECT_MEASUREMENT_CORRESPONDENCES:
				return getInterconnectMeasurementCorrespondences();
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__SWITCH_CORRESPONDENCES:
				return getSwitchCorrespondences();
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__RACK_CORRESPONDENCES:
				return getRackCorrespondences();
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__ABSTRACT_NODE_CORRESPONDENCES:
				return getAbstractNodeCorrespondences();
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__MEMORY_SPECIFICATION_CORRESPONDENCES:
				return getMemorySpecificationCorrespondences();
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__STORAGE_SPECIFICATION_CORRESPONDENCES:
				return getStorageSpecificationCorrespondences();
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__NETWORK_INTERCONNECT_CORRESPONDENCES:
				return getNetworkInterconnectCorrespondences();
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__PROCESSING_UNIT_SPECIFICATION_CORRESPONDENCES:
				return getProcessingUnitSpecificationCorrespondences();
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__PHYSICAL_DC_MODEL:
				if (resolve) return getPhysicalDcModel();
				return basicGetPhysicalDcModel();
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__PHYSICAL_LOAD_MODEL:
				if (resolve) return getPhysicalLoadModel();
				return basicGetPhysicalLoadModel();
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__POWER_CONSUMING_ENTITY_MEASUREMENT_CORRESPONDENCES:
				return getPowerConsumingEntityMeasurementCorrespondences();
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__POWER_PROVIDING_ENTITY_CORRESPONDENCES:
				return getPowerProvidingEntityCorrespondences();
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__POWER_CONSUMING_RESOURCE_CORRESPONDENCES:
				return getPowerConsumingResourceCorrespondences();
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__ARCHITECTURE_TYPE_CORRESPONDENCES:
				return getArchitectureTypeCorrespondences();
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
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__CORRESPONDENCE_ESTABLISHED:
				setCorrespondenceEstablished((Boolean)newValue);
				return;
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__PU_MEASUREMENT_CORRESPONDENCES:
				getPuMeasurementCorrespondences().clear();
				getPuMeasurementCorrespondences().addAll((Collection<? extends PuMeasurementCorrespondence>)newValue);
				return;
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__MEMORY_MEASUREMENT_CORRESPONDENCES:
				getMemoryMeasurementCorrespondences().clear();
				getMemoryMeasurementCorrespondences().addAll((Collection<? extends MemoryMeasurementCorrespondence>)newValue);
				return;
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__STORAGE_MEASUREMENT_CORRESPONDENCES:
				getStorageMeasurementCorrespondences().clear();
				getStorageMeasurementCorrespondences().addAll((Collection<? extends StorageMeasurementCorrespondence>)newValue);
				return;
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__INTERCONNECT_MEASUREMENT_CORRESPONDENCES:
				getInterconnectMeasurementCorrespondences().clear();
				getInterconnectMeasurementCorrespondences().addAll((Collection<? extends InterconnectMeasurementCorrespondence>)newValue);
				return;
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__SWITCH_CORRESPONDENCES:
				getSwitchCorrespondences().clear();
				getSwitchCorrespondences().addAll((Collection<? extends SwitchCorrespondence>)newValue);
				return;
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__RACK_CORRESPONDENCES:
				getRackCorrespondences().clear();
				getRackCorrespondences().addAll((Collection<? extends RackCorrespondence>)newValue);
				return;
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__ABSTRACT_NODE_CORRESPONDENCES:
				getAbstractNodeCorrespondences().clear();
				getAbstractNodeCorrespondences().addAll((Collection<? extends AbstractNodeCorrespondence>)newValue);
				return;
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__MEMORY_SPECIFICATION_CORRESPONDENCES:
				getMemorySpecificationCorrespondences().clear();
				getMemorySpecificationCorrespondences().addAll((Collection<? extends MemorySpecificationCorrespondence>)newValue);
				return;
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__STORAGE_SPECIFICATION_CORRESPONDENCES:
				getStorageSpecificationCorrespondences().clear();
				getStorageSpecificationCorrespondences().addAll((Collection<? extends StorageSpecificationCorrespondence>)newValue);
				return;
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__NETWORK_INTERCONNECT_CORRESPONDENCES:
				getNetworkInterconnectCorrespondences().clear();
				getNetworkInterconnectCorrespondences().addAll((Collection<? extends NetworkInterconnectCorrespondence>)newValue);
				return;
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__PROCESSING_UNIT_SPECIFICATION_CORRESPONDENCES:
				getProcessingUnitSpecificationCorrespondences().clear();
				getProcessingUnitSpecificationCorrespondences().addAll((Collection<? extends ProcessingUnitSpecificationCorrespondence>)newValue);
				return;
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__PHYSICAL_DC_MODEL:
				setPhysicalDcModel((PhysicalDCModel)newValue);
				return;
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__PHYSICAL_LOAD_MODEL:
				setPhysicalLoadModel((PhysicalLoadModel)newValue);
				return;
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__POWER_CONSUMING_ENTITY_MEASUREMENT_CORRESPONDENCES:
				getPowerConsumingEntityMeasurementCorrespondences().clear();
				getPowerConsumingEntityMeasurementCorrespondences().addAll((Collection<? extends PowerConsumingEntityMeasurementCorrespondence>)newValue);
				return;
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__POWER_PROVIDING_ENTITY_CORRESPONDENCES:
				getPowerProvidingEntityCorrespondences().clear();
				getPowerProvidingEntityCorrespondences().addAll((Collection<? extends PowerProvidingEntityCorrespondence>)newValue);
				return;
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__POWER_CONSUMING_RESOURCE_CORRESPONDENCES:
				getPowerConsumingResourceCorrespondences().clear();
				getPowerConsumingResourceCorrespondences().addAll((Collection<? extends PowerConsumingResourceCorrespondence>)newValue);
				return;
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__ARCHITECTURE_TYPE_CORRESPONDENCES:
				getArchitectureTypeCorrespondences().clear();
				getArchitectureTypeCorrespondences().addAll((Collection<? extends ArchitectureTypeCorrespondence>)newValue);
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
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__CORRESPONDENCE_ESTABLISHED:
				setCorrespondenceEstablished(CORRESPONDENCE_ESTABLISHED_EDEFAULT);
				return;
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__PU_MEASUREMENT_CORRESPONDENCES:
				getPuMeasurementCorrespondences().clear();
				return;
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__MEMORY_MEASUREMENT_CORRESPONDENCES:
				getMemoryMeasurementCorrespondences().clear();
				return;
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__STORAGE_MEASUREMENT_CORRESPONDENCES:
				getStorageMeasurementCorrespondences().clear();
				return;
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__INTERCONNECT_MEASUREMENT_CORRESPONDENCES:
				getInterconnectMeasurementCorrespondences().clear();
				return;
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__SWITCH_CORRESPONDENCES:
				getSwitchCorrespondences().clear();
				return;
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__RACK_CORRESPONDENCES:
				getRackCorrespondences().clear();
				return;
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__ABSTRACT_NODE_CORRESPONDENCES:
				getAbstractNodeCorrespondences().clear();
				return;
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__MEMORY_SPECIFICATION_CORRESPONDENCES:
				getMemorySpecificationCorrespondences().clear();
				return;
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__STORAGE_SPECIFICATION_CORRESPONDENCES:
				getStorageSpecificationCorrespondences().clear();
				return;
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__NETWORK_INTERCONNECT_CORRESPONDENCES:
				getNetworkInterconnectCorrespondences().clear();
				return;
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__PROCESSING_UNIT_SPECIFICATION_CORRESPONDENCES:
				getProcessingUnitSpecificationCorrespondences().clear();
				return;
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__PHYSICAL_DC_MODEL:
				setPhysicalDcModel((PhysicalDCModel)null);
				return;
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__PHYSICAL_LOAD_MODEL:
				setPhysicalLoadModel((PhysicalLoadModel)null);
				return;
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__POWER_CONSUMING_ENTITY_MEASUREMENT_CORRESPONDENCES:
				getPowerConsumingEntityMeasurementCorrespondences().clear();
				return;
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__POWER_PROVIDING_ENTITY_CORRESPONDENCES:
				getPowerProvidingEntityCorrespondences().clear();
				return;
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__POWER_CONSUMING_RESOURCE_CORRESPONDENCES:
				getPowerConsumingResourceCorrespondences().clear();
				return;
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__ARCHITECTURE_TYPE_CORRESPONDENCES:
				getArchitectureTypeCorrespondences().clear();
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
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__CORRESPONDENCE_ESTABLISHED:
				return isCorrespondenceEstablished() != CORRESPONDENCE_ESTABLISHED_EDEFAULT;
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__PU_MEASUREMENT_CORRESPONDENCES:
				return !getPuMeasurementCorrespondences().isEmpty();
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__MEMORY_MEASUREMENT_CORRESPONDENCES:
				return !getMemoryMeasurementCorrespondences().isEmpty();
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__STORAGE_MEASUREMENT_CORRESPONDENCES:
				return !getStorageMeasurementCorrespondences().isEmpty();
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__INTERCONNECT_MEASUREMENT_CORRESPONDENCES:
				return !getInterconnectMeasurementCorrespondences().isEmpty();
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__SWITCH_CORRESPONDENCES:
				return !getSwitchCorrespondences().isEmpty();
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__RACK_CORRESPONDENCES:
				return !getRackCorrespondences().isEmpty();
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__ABSTRACT_NODE_CORRESPONDENCES:
				return !getAbstractNodeCorrespondences().isEmpty();
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__MEMORY_SPECIFICATION_CORRESPONDENCES:
				return !getMemorySpecificationCorrespondences().isEmpty();
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__STORAGE_SPECIFICATION_CORRESPONDENCES:
				return !getStorageSpecificationCorrespondences().isEmpty();
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__NETWORK_INTERCONNECT_CORRESPONDENCES:
				return !getNetworkInterconnectCorrespondences().isEmpty();
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__PROCESSING_UNIT_SPECIFICATION_CORRESPONDENCES:
				return !getProcessingUnitSpecificationCorrespondences().isEmpty();
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__PHYSICAL_DC_MODEL:
				return basicGetPhysicalDcModel() != null;
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__PHYSICAL_LOAD_MODEL:
				return basicGetPhysicalLoadModel() != null;
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__POWER_CONSUMING_ENTITY_MEASUREMENT_CORRESPONDENCES:
				return !getPowerConsumingEntityMeasurementCorrespondences().isEmpty();
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__POWER_PROVIDING_ENTITY_CORRESPONDENCES:
				return !getPowerProvidingEntityCorrespondences().isEmpty();
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__POWER_CONSUMING_RESOURCE_CORRESPONDENCES:
				return !getPowerConsumingResourceCorrespondences().isEmpty();
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__ARCHITECTURE_TYPE_CORRESPONDENCES:
				return !getArchitectureTypeCorrespondences().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PhysicalCorrespondenceRepositoryImpl
