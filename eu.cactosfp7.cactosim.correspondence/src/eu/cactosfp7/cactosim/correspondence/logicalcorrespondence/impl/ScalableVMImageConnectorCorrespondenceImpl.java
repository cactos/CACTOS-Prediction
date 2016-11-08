/**
 */
package eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl;

import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalCorrespondenceRepository;
import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalcorrespondencePackage;
import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ScalableVMImageConnectorCorrespondence;

import eu.cactosfp7.identifier.impl.IdentifierImpl;

import eu.cactosfp7.infrastructuremodels.logicaldc.application.ScalableVMImageConnector;

import eu.cactosfp7.infrastructuremodels.logicaldc.application.WhiteBoxApplicationInstance;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.palladiosimulator.pcm.repository.BasicComponent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scalable VM Image Connector Correspondence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.ScalableVMImageConnectorCorrespondenceImpl#getCactosApplicationInstance <em>Cactos Application Instance</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.ScalableVMImageConnectorCorrespondenceImpl#getCactosConnector <em>Cactos Connector</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.ScalableVMImageConnectorCorrespondenceImpl#getPalladio <em>Palladio</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.ScalableVMImageConnectorCorrespondenceImpl#getLogicalCorrespondenceRepository <em>Logical Correspondence Repository</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.impl.ScalableVMImageConnectorCorrespondenceImpl#getMaximumInstanceNumber <em>Maximum Instance Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScalableVMImageConnectorCorrespondenceImpl extends IdentifierImpl implements ScalableVMImageConnectorCorrespondence {
        /**
	 * The default value of the '{@link #getMaximumInstanceNumber() <em>Maximum Instance Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumInstanceNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int MAXIMUM_INSTANCE_NUMBER_EDEFAULT = 0;

								/**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        protected ScalableVMImageConnectorCorrespondenceImpl() {
		super();
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        @Override
        protected EClass eStaticClass() {
		return LogicalcorrespondencePackage.Literals.SCALABLE_VM_IMAGE_CONNECTOR_CORRESPONDENCE;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public ScalableVMImageConnector getCactosConnector() {
		return (ScalableVMImageConnector)eDynamicGet(LogicalcorrespondencePackage.SCALABLE_VM_IMAGE_CONNECTOR_CORRESPONDENCE__CACTOS_CONNECTOR, LogicalcorrespondencePackage.Literals.SCALABLE_VM_IMAGE_CONNECTOR_CORRESPONDENCE__CACTOS_CONNECTOR, true, true);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public ScalableVMImageConnector basicGetCactosConnector() {
		return (ScalableVMImageConnector)eDynamicGet(LogicalcorrespondencePackage.SCALABLE_VM_IMAGE_CONNECTOR_CORRESPONDENCE__CACTOS_CONNECTOR, LogicalcorrespondencePackage.Literals.SCALABLE_VM_IMAGE_CONNECTOR_CORRESPONDENCE__CACTOS_CONNECTOR, false, true);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public void setCactosConnector(ScalableVMImageConnector newCactosConnector) {
		eDynamicSet(LogicalcorrespondencePackage.SCALABLE_VM_IMAGE_CONNECTOR_CORRESPONDENCE__CACTOS_CONNECTOR, LogicalcorrespondencePackage.Literals.SCALABLE_VM_IMAGE_CONNECTOR_CORRESPONDENCE__CACTOS_CONNECTOR, newCactosConnector);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public BasicComponent getPalladio() {
		return (BasicComponent)eDynamicGet(LogicalcorrespondencePackage.SCALABLE_VM_IMAGE_CONNECTOR_CORRESPONDENCE__PALLADIO, LogicalcorrespondencePackage.Literals.SCALABLE_VM_IMAGE_CONNECTOR_CORRESPONDENCE__PALLADIO, true, true);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public BasicComponent basicGetPalladio() {
		return (BasicComponent)eDynamicGet(LogicalcorrespondencePackage.SCALABLE_VM_IMAGE_CONNECTOR_CORRESPONDENCE__PALLADIO, LogicalcorrespondencePackage.Literals.SCALABLE_VM_IMAGE_CONNECTOR_CORRESPONDENCE__PALLADIO, false, true);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public void setPalladio(BasicComponent newPalladio) {
		eDynamicSet(LogicalcorrespondencePackage.SCALABLE_VM_IMAGE_CONNECTOR_CORRESPONDENCE__PALLADIO, LogicalcorrespondencePackage.Literals.SCALABLE_VM_IMAGE_CONNECTOR_CORRESPONDENCE__PALLADIO, newPalladio);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public LogicalCorrespondenceRepository getLogicalCorrespondenceRepository() {
		return (LogicalCorrespondenceRepository)eDynamicGet(LogicalcorrespondencePackage.SCALABLE_VM_IMAGE_CONNECTOR_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY, LogicalcorrespondencePackage.Literals.SCALABLE_VM_IMAGE_CONNECTOR_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY, true, true);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public NotificationChain basicSetLogicalCorrespondenceRepository(LogicalCorrespondenceRepository newLogicalCorrespondenceRepository, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newLogicalCorrespondenceRepository, LogicalcorrespondencePackage.SCALABLE_VM_IMAGE_CONNECTOR_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY, msgs);
		return msgs;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public void setLogicalCorrespondenceRepository(LogicalCorrespondenceRepository newLogicalCorrespondenceRepository) {
		eDynamicSet(LogicalcorrespondencePackage.SCALABLE_VM_IMAGE_CONNECTOR_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY, LogicalcorrespondencePackage.Literals.SCALABLE_VM_IMAGE_CONNECTOR_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY, newLogicalCorrespondenceRepository);
	}

        /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaximumInstanceNumber() {
		return (Integer)eDynamicGet(LogicalcorrespondencePackage.SCALABLE_VM_IMAGE_CONNECTOR_CORRESPONDENCE__MAXIMUM_INSTANCE_NUMBER, LogicalcorrespondencePackage.Literals.SCALABLE_VM_IMAGE_CONNECTOR_CORRESPONDENCE__MAXIMUM_INSTANCE_NUMBER, true, true);
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumInstanceNumber(int newMaximumInstanceNumber) {
		eDynamicSet(LogicalcorrespondencePackage.SCALABLE_VM_IMAGE_CONNECTOR_CORRESPONDENCE__MAXIMUM_INSTANCE_NUMBER, LogicalcorrespondencePackage.Literals.SCALABLE_VM_IMAGE_CONNECTOR_CORRESPONDENCE__MAXIMUM_INSTANCE_NUMBER, newMaximumInstanceNumber);
	}

								/**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public WhiteBoxApplicationInstance getCactosApplicationInstance() {
		return (WhiteBoxApplicationInstance)eDynamicGet(LogicalcorrespondencePackage.SCALABLE_VM_IMAGE_CONNECTOR_CORRESPONDENCE__CACTOS_APPLICATION_INSTANCE, LogicalcorrespondencePackage.Literals.SCALABLE_VM_IMAGE_CONNECTOR_CORRESPONDENCE__CACTOS_APPLICATION_INSTANCE, true, true);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public WhiteBoxApplicationInstance basicGetCactosApplicationInstance() {
		return (WhiteBoxApplicationInstance)eDynamicGet(LogicalcorrespondencePackage.SCALABLE_VM_IMAGE_CONNECTOR_CORRESPONDENCE__CACTOS_APPLICATION_INSTANCE, LogicalcorrespondencePackage.Literals.SCALABLE_VM_IMAGE_CONNECTOR_CORRESPONDENCE__CACTOS_APPLICATION_INSTANCE, false, true);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public void setCactosApplicationInstance(WhiteBoxApplicationInstance newCactosApplicationInstance) {
		eDynamicSet(LogicalcorrespondencePackage.SCALABLE_VM_IMAGE_CONNECTOR_CORRESPONDENCE__CACTOS_APPLICATION_INSTANCE, LogicalcorrespondencePackage.Literals.SCALABLE_VM_IMAGE_CONNECTOR_CORRESPONDENCE__CACTOS_APPLICATION_INSTANCE, newCactosApplicationInstance);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        @Override
        public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogicalcorrespondencePackage.SCALABLE_VM_IMAGE_CONNECTOR_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY:
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
			case LogicalcorrespondencePackage.SCALABLE_VM_IMAGE_CONNECTOR_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY:
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
			case LogicalcorrespondencePackage.SCALABLE_VM_IMAGE_CONNECTOR_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY:
				return eInternalContainer().eInverseRemove(this, LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__SCALABLE_CONNECTOR_CORRESPONDENCES, LogicalCorrespondenceRepository.class, msgs);
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
			case LogicalcorrespondencePackage.SCALABLE_VM_IMAGE_CONNECTOR_CORRESPONDENCE__CACTOS_APPLICATION_INSTANCE:
				if (resolve) return getCactosApplicationInstance();
				return basicGetCactosApplicationInstance();
			case LogicalcorrespondencePackage.SCALABLE_VM_IMAGE_CONNECTOR_CORRESPONDENCE__CACTOS_CONNECTOR:
				if (resolve) return getCactosConnector();
				return basicGetCactosConnector();
			case LogicalcorrespondencePackage.SCALABLE_VM_IMAGE_CONNECTOR_CORRESPONDENCE__PALLADIO:
				if (resolve) return getPalladio();
				return basicGetPalladio();
			case LogicalcorrespondencePackage.SCALABLE_VM_IMAGE_CONNECTOR_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY:
				return getLogicalCorrespondenceRepository();
			case LogicalcorrespondencePackage.SCALABLE_VM_IMAGE_CONNECTOR_CORRESPONDENCE__MAXIMUM_INSTANCE_NUMBER:
				return getMaximumInstanceNumber();
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
			case LogicalcorrespondencePackage.SCALABLE_VM_IMAGE_CONNECTOR_CORRESPONDENCE__CACTOS_APPLICATION_INSTANCE:
				setCactosApplicationInstance((WhiteBoxApplicationInstance)newValue);
				return;
			case LogicalcorrespondencePackage.SCALABLE_VM_IMAGE_CONNECTOR_CORRESPONDENCE__CACTOS_CONNECTOR:
				setCactosConnector((ScalableVMImageConnector)newValue);
				return;
			case LogicalcorrespondencePackage.SCALABLE_VM_IMAGE_CONNECTOR_CORRESPONDENCE__PALLADIO:
				setPalladio((BasicComponent)newValue);
				return;
			case LogicalcorrespondencePackage.SCALABLE_VM_IMAGE_CONNECTOR_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY:
				setLogicalCorrespondenceRepository((LogicalCorrespondenceRepository)newValue);
				return;
			case LogicalcorrespondencePackage.SCALABLE_VM_IMAGE_CONNECTOR_CORRESPONDENCE__MAXIMUM_INSTANCE_NUMBER:
				setMaximumInstanceNumber((Integer)newValue);
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
			case LogicalcorrespondencePackage.SCALABLE_VM_IMAGE_CONNECTOR_CORRESPONDENCE__CACTOS_APPLICATION_INSTANCE:
				setCactosApplicationInstance((WhiteBoxApplicationInstance)null);
				return;
			case LogicalcorrespondencePackage.SCALABLE_VM_IMAGE_CONNECTOR_CORRESPONDENCE__CACTOS_CONNECTOR:
				setCactosConnector((ScalableVMImageConnector)null);
				return;
			case LogicalcorrespondencePackage.SCALABLE_VM_IMAGE_CONNECTOR_CORRESPONDENCE__PALLADIO:
				setPalladio((BasicComponent)null);
				return;
			case LogicalcorrespondencePackage.SCALABLE_VM_IMAGE_CONNECTOR_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY:
				setLogicalCorrespondenceRepository((LogicalCorrespondenceRepository)null);
				return;
			case LogicalcorrespondencePackage.SCALABLE_VM_IMAGE_CONNECTOR_CORRESPONDENCE__MAXIMUM_INSTANCE_NUMBER:
				setMaximumInstanceNumber(MAXIMUM_INSTANCE_NUMBER_EDEFAULT);
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
			case LogicalcorrespondencePackage.SCALABLE_VM_IMAGE_CONNECTOR_CORRESPONDENCE__CACTOS_APPLICATION_INSTANCE:
				return basicGetCactosApplicationInstance() != null;
			case LogicalcorrespondencePackage.SCALABLE_VM_IMAGE_CONNECTOR_CORRESPONDENCE__CACTOS_CONNECTOR:
				return basicGetCactosConnector() != null;
			case LogicalcorrespondencePackage.SCALABLE_VM_IMAGE_CONNECTOR_CORRESPONDENCE__PALLADIO:
				return basicGetPalladio() != null;
			case LogicalcorrespondencePackage.SCALABLE_VM_IMAGE_CONNECTOR_CORRESPONDENCE__LOGICAL_CORRESPONDENCE_REPOSITORY:
				return getLogicalCorrespondenceRepository() != null;
			case LogicalcorrespondencePackage.SCALABLE_VM_IMAGE_CONNECTOR_CORRESPONDENCE__MAXIMUM_INSTANCE_NUMBER:
				return getMaximumInstanceNumber() != MAXIMUM_INSTANCE_NUMBER_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //ScalableVMImageConnectorCorrespondenceImpl
