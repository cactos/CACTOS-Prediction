/**
 */
package eu.cactosfp7.cactosim.experimentscenario;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>EPlacement Compatibility Mode</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see eu.cactosfp7.cactosim.experimentscenario.ExperimentscenarioPackage#getEPlacementCompatibilityMode()
 * @model
 * @generated
 */
public enum EPlacementCompatibilityMode implements Enumerator {
	/**
	 * The '<em><b>Repetitive Retry</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPETITIVE_RETRY_VALUE
	 * @generated
	 * @ordered
	 */
	REPETITIVE_RETRY(0, "RepetitiveRetry", "RepetitiveRetry"),

	/**
	 * The '<em><b>Simple Placement</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIMPLE_PLACEMENT_VALUE
	 * @generated
	 * @ordered
	 */
	SIMPLE_PLACEMENT(1, "SimplePlacement", "SimplePlacement");

	/**
	 * The '<em><b>Repetitive Retry</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Repetitive Retry</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REPETITIVE_RETRY
	 * @model name="RepetitiveRetry"
	 * @generated
	 * @ordered
	 */
	public static final int REPETITIVE_RETRY_VALUE = 0;

	/**
	 * The '<em><b>Simple Placement</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Simple Placement</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SIMPLE_PLACEMENT
	 * @model name="SimplePlacement"
	 * @generated
	 * @ordered
	 */
	public static final int SIMPLE_PLACEMENT_VALUE = 1;

	/**
	 * An array of all the '<em><b>EPlacement Compatibility Mode</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EPlacementCompatibilityMode[] VALUES_ARRAY =
		new EPlacementCompatibilityMode[] {
			REPETITIVE_RETRY,
			SIMPLE_PLACEMENT,
		};

	/**
	 * A public read-only list of all the '<em><b>EPlacement Compatibility Mode</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EPlacementCompatibilityMode> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>EPlacement Compatibility Mode</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EPlacementCompatibilityMode get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EPlacementCompatibilityMode result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EPlacement Compatibility Mode</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EPlacementCompatibilityMode getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EPlacementCompatibilityMode result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EPlacement Compatibility Mode</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EPlacementCompatibilityMode get(int value) {
		switch (value) {
			case REPETITIVE_RETRY_VALUE: return REPETITIVE_RETRY;
			case SIMPLE_PLACEMENT_VALUE: return SIMPLE_PLACEMENT;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EPlacementCompatibilityMode(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //EPlacementCompatibilityMode
