/**
 */
package eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl;

import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ApplicationProvidedServiceCorrespondence;
import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalCorrespondenceRepository;
import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalcorrespondencePackage;

import eu.cactosfp7.identifier.impl.IdentifierImpl;

import eu.cactosfp7.infrastructuremodels.logicaldc.application.ApplicationInstance;
import eu.cactosfp7.infrastructuremodels.logicaldc.application.ServiceProvidedRole;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.palladiosimulator.pcm.repository.OperationProvidedRole;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application Provided Service Correspondence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.ApplicationProvidedServiceCorrespondenceImpl#getCactosApplication <em>Cactos Application</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.ApplicationProvidedServiceCorrespondenceImpl#getPalladioSystemRole <em>Palladio System Role</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.ApplicationProvidedServiceCorrespondenceImpl#getCactosRole <em>Cactos Role</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.ApplicationProvidedServiceCorrespondenceImpl#getLogicalCorrespondenceRepository <em>Logical Correspondence Repository</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApplicationProvidedServiceCorrespondenceImpl extends IdentifierImpl implements ApplicationProvidedServiceCorrespondence {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationProvidedServiceCorrespondenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogicalcorrespondencePackage.Literals.APPLICATION_PROVIDED_SERVICE_CORRESPONDENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationInstance getCactosApplication() {
		return (ApplicationInstance)eDynamicGet(LogicalcorrespondencePackage.APPLICATION_PROVIDED_SERVICE_CORRESPONDENCE__CACTOS_APPLICATION, LogicalcorrespondencePackage.Literals.APPLICATION_PROVIDED_SERVICE_CORRESPONDENCE__CACTOS_APPLICATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationInstance basicGetCactosApplication() {
		return (ApplicationInstance)eDynamicGet(LogicalcorrespondencePackage.APPLICATION_PROVIDED_SERVICE_CORRESPONDENCE__CACTOS_APPLICATION, LogicalcorrespondencePackage.Literals.APPLICATION_PROVIDED_SERVICE_CORRESPONDENCE__CACTOS_APPLICATION, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCactosApplication(ApplicationInstance newCactosApplication) {
		eDynamicSet(LogicalcorrespondencePackage.APPLICATION_PROVIDED_SERVICE_CORRESPONDENCE__CACTOS_APPLICATION, LogicalcorrespondencePackage.Literals.APPLICATION_PROVIDED_SERVICE_CORRESPONDENCE__CACTOS_APPLICATION, newCactosApplication);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationProvidedRole getPalladioSystemRole() {
		return (OperationProvidedRole)eDynamicGet(LogicalcorrespondencePackage.APPLICATION_PROVIDED_SERVICE_CORRESPONDENCE__PALLADIO_SYSTEM_ROLE, LogicalcorrespondencePackage.Literals.APPLICATION_PROVIDED_SERVICE_CORRESPONDENCE__PALLADIO_SYSTEM_ROLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationProvidedRole basicGetPalladioSystemRole() {
		return (OperationProvidedRole)eDynamicGet(LogicalcorrespondencePackage.APPLICATION_PROVIDED_SERVICE_CORRESPONDENCE__PALLADIO_SYSTEM_ROLE, LogicalcorrespondencePackage.Literals.APPLICATION_PROVIDED_SERVICE_CORRESPONDENCE__PALLADIO_SYSTEM_ROLE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPalladioSystemRole(OperationProvidedRole newPalladioSystemRole) {
		eDynamicSet(LogicalcorrespondencePackage.APPLICATION_PROVIDED_SERVICE_CORRESPONDENCE__PALLADIO_SYSTEM_ROLE, LogicalcorrespondencePackage.Literals.APPLICATION_PROVIDED_SERVICE_CORRESPONDENCE__PALLADIO_SYSTEM_ROLE, newPalladioSystemRole);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceProvidedRole getCactosRole() {
		return (ServiceProvidedRole)eDynamicGet(LogicalcorrespondencePackage.APPLICATION_PROVIDED_SERVICE_CORRESPONDENCE__CACTOS_ROLE, LogicalcorrespondencePackage.Literals.APPLICATION_PROVIDED_SERVICE_CORRESPONDENCE__CACTOS_ROLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceProvidedRole basicGetCactosRole() {
		return (ServiceProvidedRole)eDynamicGet(LogicalcorrespondencePackage.APPLICATION_PROVIDED_SERVICE_CORRESPONDENCE__CACTOS_ROLE, LogicalcorrespondencePackage.Literals.APPLICATION_PROVIDED_SERVICE_CORRESPONDENCE__CACTOS_ROLE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCactosRole(ServiceProvidedRole newCactosRole) {
		eDynamicSet(LogicalcorrespondencePackage.APPLICATION_PROVIDED_SERVICE_CORRESPONDENCE__CACTOS_ROLE, LogicalcorrespondencePackage.Literals.APPLICATION_PROVIDED_SERVICE_CORRESPONDENCE__CACTOS_ROLE, newCactosRole);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalCorrespondenceRepository getLogicalCorrespondenceRepository() {
		return (LogicalCorrespondenceRepository)eDynamicGet(LogicalcorrespondencePackage.APPLICATION_PROVIDED_SERVICE_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY, LogicalcorrespondencePackage.Literals.APPLICATION_PROVIDED_SERVICE_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLogicalCorrespondenceRepository(LogicalCorrespondenceRepository newLogicalCorrespondenceRepository, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newLogicalCorrespondenceRepository, LogicalcorrespondencePackage.APPLICATION_PROVIDED_SERVICE_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogicalCorrespondenceRepository(LogicalCorrespondenceRepository newLogicalCorrespondenceRepository) {
		eDynamicSet(LogicalcorrespondencePackage.APPLICATION_PROVIDED_SERVICE_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY, LogicalcorrespondencePackage.Literals.APPLICATION_PROVIDED_SERVICE_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY, newLogicalCorrespondenceRepository);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogicalcorrespondencePackage.APPLICATION_PROVIDED_SERVICE_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY:
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
			case LogicalcorrespondencePackage.APPLICATION_PROVIDED_SERVICE_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY:
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
			case LogicalcorrespondencePackage.APPLICATION_PROVIDED_SERVICE_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY:
				return eInternalContainer().eInverseRemove(this, LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__APPLICATION_PROVIDED_SERVICE_CORRESPONDENCES, LogicalCorrespondenceRepository.class, msgs);
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
			case LogicalcorrespondencePackage.APPLICATION_PROVIDED_SERVICE_CORRESPONDENCE__CACTOS_APPLICATION:
				if (resolve) return getCactosApplication();
				return basicGetCactosApplication();
			case LogicalcorrespondencePackage.APPLICATION_PROVIDED_SERVICE_CORRESPONDENCE__PALLADIO_SYSTEM_ROLE:
				if (resolve) return getPalladioSystemRole();
				return basicGetPalladioSystemRole();
			case LogicalcorrespondencePackage.APPLICATION_PROVIDED_SERVICE_CORRESPONDENCE__CACTOS_ROLE:
				if (resolve) return getCactosRole();
				return basicGetCactosRole();
			case LogicalcorrespondencePackage.APPLICATION_PROVIDED_SERVICE_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY:
				return getLogicalCorrespondenceRepository();
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
			case LogicalcorrespondencePackage.APPLICATION_PROVIDED_SERVICE_CORRESPONDENCE__CACTOS_APPLICATION:
				setCactosApplication((ApplicationInstance)newValue);
				return;
			case LogicalcorrespondencePackage.APPLICATION_PROVIDED_SERVICE_CORRESPONDENCE__PALLADIO_SYSTEM_ROLE:
				setPalladioSystemRole((OperationProvidedRole)newValue);
				return;
			case LogicalcorrespondencePackage.APPLICATION_PROVIDED_SERVICE_CORRESPONDENCE__CACTOS_ROLE:
				setCactosRole((ServiceProvidedRole)newValue);
				return;
			case LogicalcorrespondencePackage.APPLICATION_PROVIDED_SERVICE_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY:
				setLogicalCorrespondenceRepository((LogicalCorrespondenceRepository)newValue);
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
			case LogicalcorrespondencePackage.APPLICATION_PROVIDED_SERVICE_CORRESPONDENCE__CACTOS_APPLICATION:
				setCactosApplication((ApplicationInstance)null);
				return;
			case LogicalcorrespondencePackage.APPLICATION_PROVIDED_SERVICE_CORRESPONDENCE__PALLADIO_SYSTEM_ROLE:
				setPalladioSystemRole((OperationProvidedRole)null);
				return;
			case LogicalcorrespondencePackage.APPLICATION_PROVIDED_SERVICE_CORRESPONDENCE__CACTOS_ROLE:
				setCactosRole((ServiceProvidedRole)null);
				return;
			case LogicalcorrespondencePackage.APPLICATION_PROVIDED_SERVICE_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY:
				setLogicalCorrespondenceRepository((LogicalCorrespondenceRepository)null);
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
			case LogicalcorrespondencePackage.APPLICATION_PROVIDED_SERVICE_CORRESPONDENCE__CACTOS_APPLICATION:
				return basicGetCactosApplication() != null;
			case LogicalcorrespondencePackage.APPLICATION_PROVIDED_SERVICE_CORRESPONDENCE__PALLADIO_SYSTEM_ROLE:
				return basicGetPalladioSystemRole() != null;
			case LogicalcorrespondencePackage.APPLICATION_PROVIDED_SERVICE_CORRESPONDENCE__CACTOS_ROLE:
				return basicGetCactosRole() != null;
			case LogicalcorrespondencePackage.APPLICATION_PROVIDED_SERVICE_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY:
				return getLogicalCorrespondenceRepository() != null;
		}
		return super.eIsSet(featureID);
	}

} //ApplicationProvidedServiceCorrespondenceImpl
