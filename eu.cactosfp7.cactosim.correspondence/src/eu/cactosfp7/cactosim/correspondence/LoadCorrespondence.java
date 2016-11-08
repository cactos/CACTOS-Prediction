/**
 */
package eu.cactosfp7.cactosim.correspondence;

import eu.cactosfp7.identifier.Identifier;

import org.palladiosimulator.runtimemeasurement.RuntimeMeasurement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Load Correspondence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.LoadCorrespondence#getPalladio <em>Palladio</em>}</li>
 * </ul>
 *
 * @see eu.cactosfp7.cactosim.correspondence.CorrespondencePackage#getLoadCorrespondence()
 * @model abstract="true"
 * @generated
 */
public interface LoadCorrespondence extends Identifier {
	/**
	 * Returns the value of the '<em><b>Palladio</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Palladio</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Palladio</em>' reference.
	 * @see #setPalladio(RuntimeMeasurement)
	 * @see eu.cactosfp7.cactosim.correspondence.CorrespondencePackage#getLoadCorrespondence_Palladio()
	 * @model required="true"
	 * @generated
	 */
	RuntimeMeasurement getPalladio();

	/**
	 * Sets the value of the '{@link eu.cactosfp7.cactosim.correspondence.LoadCorrespondence#getPalladio <em>Palladio</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Palladio</em>' reference.
	 * @see #getPalladio()
	 * @generated
	 */
	void setPalladio(RuntimeMeasurement value);

} // LoadCorrespondence
