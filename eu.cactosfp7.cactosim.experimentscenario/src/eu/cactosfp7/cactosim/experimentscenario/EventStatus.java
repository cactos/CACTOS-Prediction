/**
 */
package eu.cactosfp7.cactosim.experimentscenario;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Event Status</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see eu.cactosfp7.cactosim.experimentscenario.ExperimentscenarioPackage#getEventStatus()
 * @model
 * @generated
 */
public enum EventStatus implements Enumerator {
	/**
	 * The '<em><b>PROCESSED SUCCESS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROCESSED_SUCCESS_VALUE
	 * @generated
	 * @ordered
	 */
	PROCESSED_SUCCESS(0, "PROCESSED_SUCCESS", "PROCESSED_SUCCESS"),

	/**
	 * The '<em><b>PROCESSED FAILURE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROCESSED_FAILURE_VALUE
	 * @generated
	 * @ordered
	 */
	PROCESSED_FAILURE(1, "PROCESSED_FAILURE", "PROCESSED_FAILURE"),

	/**
	 * The '<em><b>PENDING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PENDING_VALUE
	 * @generated
	 * @ordered
	 */
	PENDING(2, "PENDING", "PENDING"), /**
	 * The '<em><b>SCHEDULED</b></em>' literal object.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #SCHEDULED_VALUE
	 * @generated
	 * @ordered
	 */
    SCHEDULED(3, "SCHEDULED", "SCHEDULED"), /**
	 * The '<em><b>IN EXECUTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #IN_EXECUTION_VALUE
	 * @generated
	 * @ordered
	 */
        IN_EXECUTION(4, "IN_EXECUTION", "IN_EXECUTION");

	/**
	 * The '<em><b>PROCESSED SUCCESS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PROCESSED SUCCESS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROCESSED_SUCCESS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PROCESSED_SUCCESS_VALUE = 0;

	/**
	 * The '<em><b>PROCESSED FAILURE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PROCESSED FAILURE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROCESSED_FAILURE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PROCESSED_FAILURE_VALUE = 1;

	/**
	 * The '<em><b>PENDING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PENDING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PENDING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PENDING_VALUE = 2;

	/**
	 * The '<em><b>SCHEDULED</b></em>' literal value.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>SCHEDULED</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @see #SCHEDULED
	 * @model
	 * @generated
	 * @ordered
	 */
    public static final int SCHEDULED_VALUE = 3;

    /**
	 * The '<em><b>IN EXECUTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of '<em><b>IN EXECUTION</b></em>' literal object isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @see #IN_EXECUTION
	 * @model
	 * @generated
	 * @ordered
	 */
        public static final int IN_EXECUTION_VALUE = 4;

/**
	 * An array of all the '<em><b>Event Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EventStatus[] VALUES_ARRAY =
		new EventStatus[] {
			PROCESSED_SUCCESS,
			PROCESSED_FAILURE,
			PENDING,
			SCHEDULED,
			IN_EXECUTION,
		};

	/**
	 * A public read-only list of all the '<em><b>Event Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EventStatus> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Event Status</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EventStatus get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EventStatus result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Event Status</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EventStatus getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EventStatus result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Event Status</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EventStatus get(int value) {
		switch (value) {
			case PROCESSED_SUCCESS_VALUE: return PROCESSED_SUCCESS;
			case PROCESSED_FAILURE_VALUE: return PROCESSED_FAILURE;
			case PENDING_VALUE: return PENDING;
			case SCHEDULED_VALUE: return SCHEDULED;
			case IN_EXECUTION_VALUE: return IN_EXECUTION;
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
	private EventStatus(int value, String name, String literal) {
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
	
} //EventStatus
