/**
 */
package eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl;

import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalCorrespondenceRepository;
import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalcorrespondencePackage;
import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VirtualMachineCorrespondence;

import eu.cactosfp7.identifier.impl.IdentifierImpl;

import eu.cactosfp7.infrastructuremodels.logicaldc.core.VirtualMachine;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.palladiosimulator.pcm.allocation.AllocationContext;
import org.palladiosimulator.pcm.core.composition.AssemblyInfrastructureConnector;
import org.scaledl.usageevolution.Usage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Virtual Machine Correspondence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.VirtualMachineCorrespondenceImpl#getCactos <em>Cactos</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.VirtualMachineCorrespondenceImpl#getPalladio <em>Palladio</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.VirtualMachineCorrespondenceImpl#getLogicalCorrespondenceRepository <em>Logical Correspondence Repository</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.VirtualMachineCorrespondenceImpl#getPalladioStorageConnector <em>Palladio Storage Connector</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.VirtualMachineCorrespondenceImpl#getPalladioUsage <em>Palladio Usage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VirtualMachineCorrespondenceImpl extends IdentifierImpl implements VirtualMachineCorrespondence {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VirtualMachineCorrespondenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogicalcorrespondencePackage.Literals.VIRTUAL_MACHINE_CORRESPONDENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualMachine getCactos() {
		return (VirtualMachine)eDynamicGet(LogicalcorrespondencePackage.VIRTUAL_MACHINE_CORRESPONDENCE__CACTOS, LogicalcorrespondencePackage.Literals.VIRTUAL_MACHINE_CORRESPONDENCE__CACTOS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualMachine basicGetCactos() {
		return (VirtualMachine)eDynamicGet(LogicalcorrespondencePackage.VIRTUAL_MACHINE_CORRESPONDENCE__CACTOS, LogicalcorrespondencePackage.Literals.VIRTUAL_MACHINE_CORRESPONDENCE__CACTOS, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCactos(VirtualMachine newCactos) {
		eDynamicSet(LogicalcorrespondencePackage.VIRTUAL_MACHINE_CORRESPONDENCE__CACTOS, LogicalcorrespondencePackage.Literals.VIRTUAL_MACHINE_CORRESPONDENCE__CACTOS, newCactos);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllocationContext getPalladio() {
		return (AllocationContext)eDynamicGet(LogicalcorrespondencePackage.VIRTUAL_MACHINE_CORRESPONDENCE__PALLADIO, LogicalcorrespondencePackage.Literals.VIRTUAL_MACHINE_CORRESPONDENCE__PALLADIO, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllocationContext basicGetPalladio() {
		return (AllocationContext)eDynamicGet(LogicalcorrespondencePackage.VIRTUAL_MACHINE_CORRESPONDENCE__PALLADIO, LogicalcorrespondencePackage.Literals.VIRTUAL_MACHINE_CORRESPONDENCE__PALLADIO, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPalladio(AllocationContext newPalladio) {
		eDynamicSet(LogicalcorrespondencePackage.VIRTUAL_MACHINE_CORRESPONDENCE__PALLADIO, LogicalcorrespondencePackage.Literals.VIRTUAL_MACHINE_CORRESPONDENCE__PALLADIO, newPalladio);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalCorrespondenceRepository getLogicalCorrespondenceRepository() {
		return (LogicalCorrespondenceRepository)eDynamicGet(LogicalcorrespondencePackage.VIRTUAL_MACHINE_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY, LogicalcorrespondencePackage.Literals.VIRTUAL_MACHINE_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLogicalCorrespondenceRepository(LogicalCorrespondenceRepository newLogicalCorrespondenceRepository, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newLogicalCorrespondenceRepository, LogicalcorrespondencePackage.VIRTUAL_MACHINE_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogicalCorrespondenceRepository(LogicalCorrespondenceRepository newLogicalCorrespondenceRepository) {
		eDynamicSet(LogicalcorrespondencePackage.VIRTUAL_MACHINE_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY, LogicalcorrespondencePackage.Literals.VIRTUAL_MACHINE_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY, newLogicalCorrespondenceRepository);
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public AssemblyInfrastructureConnector getPalladioStorageConnector() {
		return (AssemblyInfrastructureConnector)eDynamicGet(LogicalcorrespondencePackage.VIRTUAL_MACHINE_CORRESPONDENCE__PALLADIO_STORAGE_CONNECTOR, LogicalcorrespondencePackage.Literals.VIRTUAL_MACHINE_CORRESPONDENCE__PALLADIO_STORAGE_CONNECTOR, true, true);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public AssemblyInfrastructureConnector basicGetPalladioStorageConnector() {
		return (AssemblyInfrastructureConnector)eDynamicGet(LogicalcorrespondencePackage.VIRTUAL_MACHINE_CORRESPONDENCE__PALLADIO_STORAGE_CONNECTOR, LogicalcorrespondencePackage.Literals.VIRTUAL_MACHINE_CORRESPONDENCE__PALLADIO_STORAGE_CONNECTOR, false, true);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setPalladioStorageConnector(AssemblyInfrastructureConnector newPalladioStorageConnector) {
		eDynamicSet(LogicalcorrespondencePackage.VIRTUAL_MACHINE_CORRESPONDENCE__PALLADIO_STORAGE_CONNECTOR, LogicalcorrespondencePackage.Literals.VIRTUAL_MACHINE_CORRESPONDENCE__PALLADIO_STORAGE_CONNECTOR, newPalladioStorageConnector);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Usage getPalladioUsage() {
		return (Usage)eDynamicGet(LogicalcorrespondencePackage.VIRTUAL_MACHINE_CORRESPONDENCE__PALLADIO_USAGE, LogicalcorrespondencePackage.Literals.VIRTUAL_MACHINE_CORRESPONDENCE__PALLADIO_USAGE, true, true);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Usage basicGetPalladioUsage() {
		return (Usage)eDynamicGet(LogicalcorrespondencePackage.VIRTUAL_MACHINE_CORRESPONDENCE__PALLADIO_USAGE, LogicalcorrespondencePackage.Literals.VIRTUAL_MACHINE_CORRESPONDENCE__PALLADIO_USAGE, false, true);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setPalladioUsage(Usage newPalladioUsage) {
		eDynamicSet(LogicalcorrespondencePackage.VIRTUAL_MACHINE_CORRESPONDENCE__PALLADIO_USAGE, LogicalcorrespondencePackage.Literals.VIRTUAL_MACHINE_CORRESPONDENCE__PALLADIO_USAGE, newPalladioUsage);
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogicalcorrespondencePackage.VIRTUAL_MACHINE_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetLogicalCorrespondenceRepository((LogicalCorrespondenceRepository)otherEnd, msgs);
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
			case LogicalcorrespondencePackage.VIRTUAL_MACHINE_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY:
				return basicSetLogicalCorrespondenceRepository(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case LogicalcorrespondencePackage.VIRTUAL_MACHINE_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY:
				return eInternalContainer().eInverseRemove(this, LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__VIRTUAL_MACHINE_CORRESPONDENCES, LogicalCorrespondenceRepository.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LogicalcorrespondencePackage.VIRTUAL_MACHINE_CORRESPONDENCE__CACTOS:
				if (resolve) return getCactos();
				return basicGetCactos();
			case LogicalcorrespondencePackage.VIRTUAL_MACHINE_CORRESPONDENCE__PALLADIO:
				if (resolve) return getPalladio();
				return basicGetPalladio();
			case LogicalcorrespondencePackage.VIRTUAL_MACHINE_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY:
				return getLogicalCorrespondenceRepository();
			case LogicalcorrespondencePackage.VIRTUAL_MACHINE_CORRESPONDENCE__PALLADIO_STORAGE_CONNECTOR:
				if (resolve) return getPalladioStorageConnector();
				return basicGetPalladioStorageConnector();
			case LogicalcorrespondencePackage.VIRTUAL_MACHINE_CORRESPONDENCE__PALLADIO_USAGE:
				if (resolve) return getPalladioUsage();
				return basicGetPalladioUsage();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LogicalcorrespondencePackage.VIRTUAL_MACHINE_CORRESPONDENCE__CACTOS:
				setCactos((VirtualMachine)newValue);
				return;
			case LogicalcorrespondencePackage.VIRTUAL_MACHINE_CORRESPONDENCE__PALLADIO:
				setPalladio((AllocationContext)newValue);
				return;
			case LogicalcorrespondencePackage.VIRTUAL_MACHINE_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY:
				setLogicalCorrespondenceRepository((LogicalCorrespondenceRepository)newValue);
				return;
			case LogicalcorrespondencePackage.VIRTUAL_MACHINE_CORRESPONDENCE__PALLADIO_STORAGE_CONNECTOR:
				setPalladioStorageConnector((AssemblyInfrastructureConnector)newValue);
				return;
			case LogicalcorrespondencePackage.VIRTUAL_MACHINE_CORRESPONDENCE__PALLADIO_USAGE:
				setPalladioUsage((Usage)newValue);
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
			case LogicalcorrespondencePackage.VIRTUAL_MACHINE_CORRESPONDENCE__CACTOS:
				setCactos((VirtualMachine)null);
				return;
			case LogicalcorrespondencePackage.VIRTUAL_MACHINE_CORRESPONDENCE__PALLADIO:
				setPalladio((AllocationContext)null);
				return;
			case LogicalcorrespondencePackage.VIRTUAL_MACHINE_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY:
				setLogicalCorrespondenceRepository((LogicalCorrespondenceRepository)null);
				return;
			case LogicalcorrespondencePackage.VIRTUAL_MACHINE_CORRESPONDENCE__PALLADIO_STORAGE_CONNECTOR:
				setPalladioStorageConnector((AssemblyInfrastructureConnector)null);
				return;
			case LogicalcorrespondencePackage.VIRTUAL_MACHINE_CORRESPONDENCE__PALLADIO_USAGE:
				setPalladioUsage((Usage)null);
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
			case LogicalcorrespondencePackage.VIRTUAL_MACHINE_CORRESPONDENCE__CACTOS:
				return basicGetCactos() != null;
			case LogicalcorrespondencePackage.VIRTUAL_MACHINE_CORRESPONDENCE__PALLADIO:
				return basicGetPalladio() != null;
			case LogicalcorrespondencePackage.VIRTUAL_MACHINE_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY:
				return getLogicalCorrespondenceRepository() != null;
			case LogicalcorrespondencePackage.VIRTUAL_MACHINE_CORRESPONDENCE__PALLADIO_STORAGE_CONNECTOR:
				return basicGetPalladioStorageConnector() != null;
			case LogicalcorrespondencePackage.VIRTUAL_MACHINE_CORRESPONDENCE__PALLADIO_USAGE:
				return basicGetPalladioUsage() != null;
		}
		return super.eIsSet(featureID);
	}

} //VirtualMachineCorrespondenceImpl
