/**
 */
package eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl;

import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalCorrespondenceRepository;
import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalcorrespondencePackage;
import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ServiceOperationCorrespondence;

import eu.cactosfp7.identifier.impl.IdentifierImpl;

import eu.cactosfp7.infrastructuremodels.logicaldc.application.ServiceOperation;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.palladiosimulator.pcm.repository.OperationSignature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Operation Correspondence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.ServiceOperationCorrespondenceImpl#getLogicalCorrespondenceRepository <em>Logical Correspondence Repository</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.ServiceOperationCorrespondenceImpl#getCactos <em>Cactos</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.ServiceOperationCorrespondenceImpl#getPalladio <em>Palladio</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceOperationCorrespondenceImpl extends IdentifierImpl implements ServiceOperationCorrespondence {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceOperationCorrespondenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogicalcorrespondencePackage.Literals.SERVICE_OPERATION_CORRESPONDENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalCorrespondenceRepository getLogicalCorrespondenceRepository() {
		return (LogicalCorrespondenceRepository)eDynamicGet(LogicalcorrespondencePackage.SERVICE_OPERATION_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY, LogicalcorrespondencePackage.Literals.SERVICE_OPERATION_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLogicalCorrespondenceRepository(LogicalCorrespondenceRepository newLogicalCorrespondenceRepository, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newLogicalCorrespondenceRepository, LogicalcorrespondencePackage.SERVICE_OPERATION_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogicalCorrespondenceRepository(LogicalCorrespondenceRepository newLogicalCorrespondenceRepository) {
		eDynamicSet(LogicalcorrespondencePackage.SERVICE_OPERATION_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY, LogicalcorrespondencePackage.Literals.SERVICE_OPERATION_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY, newLogicalCorrespondenceRepository);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceOperation getCactos() {
		return (ServiceOperation)eDynamicGet(LogicalcorrespondencePackage.SERVICE_OPERATION_CORRESPONDENCE__CACTOS, LogicalcorrespondencePackage.Literals.SERVICE_OPERATION_CORRESPONDENCE__CACTOS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceOperation basicGetCactos() {
		return (ServiceOperation)eDynamicGet(LogicalcorrespondencePackage.SERVICE_OPERATION_CORRESPONDENCE__CACTOS, LogicalcorrespondencePackage.Literals.SERVICE_OPERATION_CORRESPONDENCE__CACTOS, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCactos(ServiceOperation newCactos) {
		eDynamicSet(LogicalcorrespondencePackage.SERVICE_OPERATION_CORRESPONDENCE__CACTOS, LogicalcorrespondencePackage.Literals.SERVICE_OPERATION_CORRESPONDENCE__CACTOS, newCactos);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationSignature getPalladio() {
		return (OperationSignature)eDynamicGet(LogicalcorrespondencePackage.SERVICE_OPERATION_CORRESPONDENCE__PALLADIO, LogicalcorrespondencePackage.Literals.SERVICE_OPERATION_CORRESPONDENCE__PALLADIO, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationSignature basicGetPalladio() {
		return (OperationSignature)eDynamicGet(LogicalcorrespondencePackage.SERVICE_OPERATION_CORRESPONDENCE__PALLADIO, LogicalcorrespondencePackage.Literals.SERVICE_OPERATION_CORRESPONDENCE__PALLADIO, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPalladio(OperationSignature newPalladio) {
		eDynamicSet(LogicalcorrespondencePackage.SERVICE_OPERATION_CORRESPONDENCE__PALLADIO, LogicalcorrespondencePackage.Literals.SERVICE_OPERATION_CORRESPONDENCE__PALLADIO, newPalladio);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogicalcorrespondencePackage.SERVICE_OPERATION_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY:
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
			case LogicalcorrespondencePackage.SERVICE_OPERATION_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY:
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
			case LogicalcorrespondencePackage.SERVICE_OPERATION_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY:
				return eInternalContainer().eInverseRemove(this, LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__SERVICE_OPERATION_CORRESPONDENCES, LogicalCorrespondenceRepository.class, msgs);
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
			case LogicalcorrespondencePackage.SERVICE_OPERATION_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY:
				return getLogicalCorrespondenceRepository();
			case LogicalcorrespondencePackage.SERVICE_OPERATION_CORRESPONDENCE__CACTOS:
				if (resolve) return getCactos();
				return basicGetCactos();
			case LogicalcorrespondencePackage.SERVICE_OPERATION_CORRESPONDENCE__PALLADIO:
				if (resolve) return getPalladio();
				return basicGetPalladio();
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
			case LogicalcorrespondencePackage.SERVICE_OPERATION_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY:
				setLogicalCorrespondenceRepository((LogicalCorrespondenceRepository)newValue);
				return;
			case LogicalcorrespondencePackage.SERVICE_OPERATION_CORRESPONDENCE__CACTOS:
				setCactos((ServiceOperation)newValue);
				return;
			case LogicalcorrespondencePackage.SERVICE_OPERATION_CORRESPONDENCE__PALLADIO:
				setPalladio((OperationSignature)newValue);
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
			case LogicalcorrespondencePackage.SERVICE_OPERATION_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY:
				setLogicalCorrespondenceRepository((LogicalCorrespondenceRepository)null);
				return;
			case LogicalcorrespondencePackage.SERVICE_OPERATION_CORRESPONDENCE__CACTOS:
				setCactos((ServiceOperation)null);
				return;
			case LogicalcorrespondencePackage.SERVICE_OPERATION_CORRESPONDENCE__PALLADIO:
				setPalladio((OperationSignature)null);
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
			case LogicalcorrespondencePackage.SERVICE_OPERATION_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY:
				return getLogicalCorrespondenceRepository() != null;
			case LogicalcorrespondencePackage.SERVICE_OPERATION_CORRESPONDENCE__CACTOS:
				return basicGetCactos() != null;
			case LogicalcorrespondencePackage.SERVICE_OPERATION_CORRESPONDENCE__PALLADIO:
				return basicGetPalladio() != null;
		}
		return super.eIsSet(featureID);
	}

} //ServiceOperationCorrespondenceImpl
