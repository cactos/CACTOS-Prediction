/**
 */
package eu.cactosfp7.cactosim.experimentscenario.request;

import eu.cactosfp7.infrastructuremodels.logicaldc.application.ApplicationInstance;
import eu.cactosfp7.infrastructuremodels.logicaldc.application.ApplicationTemplate;

import eu.cactosfp7.infrastructuremodels.logicaldc.core.Flavour;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Start Application Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.cactosim.experimentscenario.request.StartApplicationRequest#getApplicationTemplate <em>Application Template</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.experimentscenario.request.StartApplicationRequest#getApplicationInstance <em>Application Instance</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.experimentscenario.request.StartApplicationRequest#getVmFlavour <em>Vm Flavour</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.experimentscenario.request.StartApplicationRequest#getInputParameters <em>Input Parameters</em>}</li>
 * </ul>
 *
 * @see eu.cactosfp7.cactosim.experimentscenario.request.RequestPackage#getStartApplicationRequest()
 * @model
 * @generated
 */
public interface StartApplicationRequest extends ExperimentScenarioRequest {
	/**
	 * Returns the value of the '<em><b>Application Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application Template</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application Template</em>' reference.
	 * @see #setApplicationTemplate(ApplicationTemplate)
	 * @see eu.cactosfp7.cactosim.experimentscenario.request.RequestPackage#getStartApplicationRequest_ApplicationTemplate()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ApplicationTemplate getApplicationTemplate();

	/**
	 * Sets the value of the '{@link eu.cactosfp7.cactosim.experimentscenario.request.StartApplicationRequest#getApplicationTemplate <em>Application Template</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application Template</em>' reference.
	 * @see #getApplicationTemplate()
	 * @generated
	 */
	void setApplicationTemplate(ApplicationTemplate value);

	/**
	 * Returns the value of the '<em><b>Application Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application Instance</em>' reference.
	 * @see #setApplicationInstance(ApplicationInstance)
	 * @see eu.cactosfp7.cactosim.experimentscenario.request.RequestPackage#getStartApplicationRequest_ApplicationInstance()
	 * @model ordered="false"
	 * @generated
	 */
	ApplicationInstance getApplicationInstance();

	/**
	 * Sets the value of the '{@link eu.cactosfp7.cactosim.experimentscenario.request.StartApplicationRequest#getApplicationInstance <em>Application Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application Instance</em>' reference.
	 * @see #getApplicationInstance()
	 * @generated
	 */
	void setApplicationInstance(ApplicationInstance value);

	/**
	 * Returns the value of the '<em><b>Vm Flavour</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Vm Flavour</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Vm Flavour</em>' reference.
	 * @see #setVmFlavour(Flavour)
	 * @see eu.cactosfp7.cactosim.experimentscenario.request.RequestPackage#getStartApplicationRequest_VmFlavour()
	 * @model required="true" ordered="false"
	 * @generated
	 */
    Flavour getVmFlavour();

    /**
	 * Sets the value of the '{@link eu.cactosfp7.cactosim.experimentscenario.request.StartApplicationRequest#getVmFlavour <em>Vm Flavour</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vm Flavour</em>' reference.
	 * @see #getVmFlavour()
	 * @generated
	 */
    void setVmFlavour(Flavour value);

    /**
	 * Returns the value of the '<em><b>Input Parameters</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Parameters</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Parameters</em>' map.
	 * @see eu.cactosfp7.cactosim.experimentscenario.request.RequestPackage#getStartApplicationRequest_InputParameters()
	 * @model mapType="eu.cactosfp7.infrastructuremodels.physicaldc.util.EStringToEStringObjectMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" ordered="false"
	 * @generated
	 */
	EMap<String, String> getInputParameters();

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.applicationInstance.oclIsUndefined() or self.applicationTemplate = self.applicationInstance.applicationTemplate'"
	 * @generated
	 */
	boolean applicationInstanceMustBeOfTheRightTemplate(DiagnosticChain diagnostics, Map<Object, Object> context);

} // StartApplicationRequest
