/**
 */
package eu.cactosfp7.cactosim.usagesequence.impl;

import eu.cactosfp7.cactosim.usagesequence.UsageSequenceRepository;
import eu.cactosfp7.cactosim.usagesequence.UsagesequencePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import tools.descartes.dlim.Sequence;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Usage Sequence Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.cactosfp7.cactosim.usagesequence.impl.UsageSequenceRepositoryImpl#getSequences <em>Sequences</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UsageSequenceRepositoryImpl extends CDOObjectImpl implements UsageSequenceRepository {
    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected UsageSequenceRepositoryImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return UsagesequencePackage.Literals.USAGE_SEQUENCE_REPOSITORY;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected int eStaticFeatureCount() {
		return 0;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @SuppressWarnings("unchecked")
    public EList<Sequence> getSequences() {
		return (EList<Sequence>)eDynamicGet(UsagesequencePackage.USAGE_SEQUENCE_REPOSITORY__SEQUENCES, UsagesequencePackage.Literals.USAGE_SEQUENCE_REPOSITORY__SEQUENCES, true, true);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UsagesequencePackage.USAGE_SEQUENCE_REPOSITORY__SEQUENCES:
				return ((InternalEList<?>)getSequences()).basicRemove(otherEnd, msgs);
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
			case UsagesequencePackage.USAGE_SEQUENCE_REPOSITORY__SEQUENCES:
				return getSequences();
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
			case UsagesequencePackage.USAGE_SEQUENCE_REPOSITORY__SEQUENCES:
				getSequences().clear();
				getSequences().addAll((Collection<? extends Sequence>)newValue);
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
			case UsagesequencePackage.USAGE_SEQUENCE_REPOSITORY__SEQUENCES:
				getSequences().clear();
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
			case UsagesequencePackage.USAGE_SEQUENCE_REPOSITORY__SEQUENCES:
				return !getSequences().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //UsageSequenceRepositoryImpl
