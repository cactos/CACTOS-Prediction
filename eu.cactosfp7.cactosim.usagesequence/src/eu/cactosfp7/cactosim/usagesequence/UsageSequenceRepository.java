/**
 */
package eu.cactosfp7.cactosim.usagesequence;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

import tools.descartes.dlim.Sequence;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Usage Sequence Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.cactosfp7.cactosim.usagesequence.UsageSequenceRepository#getSequences <em>Sequences</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.cactosfp7.cactosim.usagesequence.UsagesequencePackage#getUsageSequenceRepository()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface UsageSequenceRepository extends CDOObject {
    /**
	 * Returns the value of the '<em><b>Sequences</b></em>' containment reference list.
	 * The list contents are of type {@link tools.descartes.dlim.Sequence}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sequences</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequences</em>' containment reference list.
	 * @see eu.cactosfp7.cactosim.usagesequence.UsagesequencePackage#getUsageSequenceRepository_Sequences()
	 * @model containment="true"
	 * @generated
	 */
    EList<Sequence> getSequences();

} // UsageSequenceRepository
