/**
 */
package eu.cactosfp7.cactosim.experimentscenario.request.impl;

import eu.cactosfp7.cactosim.experimentscenario.request.RequestPackage;
import eu.cactosfp7.cactosim.experimentscenario.request.StartApplicationRequest;

import eu.cactosfp7.cactosim.experimentscenario.request.util.RequestValidator;

import eu.cactosfp7.infrastructuremodels.logicaldc.application.ApplicationInstance;
import eu.cactosfp7.infrastructuremodels.logicaldc.application.ApplicationTemplate;

import eu.cactosfp7.infrastructuremodels.logicaldc.core.Flavour;
import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Start Application Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.cactosim.experimentscenario.request.impl.StartApplicationRequestImpl#getApplicationTemplate <em>Application Template</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.experimentscenario.request.impl.StartApplicationRequestImpl#getApplicationInstance <em>Application Instance</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.experimentscenario.request.impl.StartApplicationRequestImpl#getVmFlavour <em>Vm Flavour</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.experimentscenario.request.impl.StartApplicationRequestImpl#getInputParameters <em>Input Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StartApplicationRequestImpl extends ExperimentScenarioRequestImpl implements StartApplicationRequest {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StartApplicationRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequestPackage.Literals.START_APPLICATION_REQUEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
    public ApplicationTemplate getApplicationTemplate() {
		return (ApplicationTemplate)eDynamicGet(RequestPackage.START_APPLICATION_REQUEST__APPLICATION_TEMPLATE, RequestPackage.Literals.START_APPLICATION_REQUEST__APPLICATION_TEMPLATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationTemplate basicGetApplicationTemplate() {
		return (ApplicationTemplate)eDynamicGet(RequestPackage.START_APPLICATION_REQUEST__APPLICATION_TEMPLATE, RequestPackage.Literals.START_APPLICATION_REQUEST__APPLICATION_TEMPLATE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
    public void setApplicationTemplate(ApplicationTemplate newApplicationTemplate) {
		eDynamicSet(RequestPackage.START_APPLICATION_REQUEST__APPLICATION_TEMPLATE, RequestPackage.Literals.START_APPLICATION_REQUEST__APPLICATION_TEMPLATE, newApplicationTemplate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
    public ApplicationInstance getApplicationInstance() {
		return (ApplicationInstance)eDynamicGet(RequestPackage.START_APPLICATION_REQUEST__APPLICATION_INSTANCE, RequestPackage.Literals.START_APPLICATION_REQUEST__APPLICATION_INSTANCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationInstance basicGetApplicationInstance() {
		return (ApplicationInstance)eDynamicGet(RequestPackage.START_APPLICATION_REQUEST__APPLICATION_INSTANCE, RequestPackage.Literals.START_APPLICATION_REQUEST__APPLICATION_INSTANCE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
    public void setApplicationInstance(ApplicationInstance newApplicationInstance) {
		eDynamicSet(RequestPackage.START_APPLICATION_REQUEST__APPLICATION_INSTANCE, RequestPackage.Literals.START_APPLICATION_REQUEST__APPLICATION_INSTANCE, newApplicationInstance);
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public Flavour getVmFlavour() {
		return (Flavour)eDynamicGet(RequestPackage.START_APPLICATION_REQUEST__VM_FLAVOUR, RequestPackage.Literals.START_APPLICATION_REQUEST__VM_FLAVOUR, true, true);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Flavour basicGetVmFlavour() {
		return (Flavour)eDynamicGet(RequestPackage.START_APPLICATION_REQUEST__VM_FLAVOUR, RequestPackage.Literals.START_APPLICATION_REQUEST__VM_FLAVOUR, false, true);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public void setVmFlavour(Flavour newVmFlavour) {
		eDynamicSet(RequestPackage.START_APPLICATION_REQUEST__VM_FLAVOUR, RequestPackage.Literals.START_APPLICATION_REQUEST__VM_FLAVOUR, newVmFlavour);
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public EMap<String, String> getInputParameters() {
		return (EMap<String, String>)eDynamicGet(RequestPackage.START_APPLICATION_REQUEST__INPUT_PARAMETERS, RequestPackage.Literals.START_APPLICATION_REQUEST__INPUT_PARAMETERS, true, true);
	}

				/**
	 * The cached OCL expression body for the '{@link #applicationInstanceMustBeOfTheRightTemplate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Application Instance Must Be Of The Right Template</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #applicationInstanceMustBeOfTheRightTemplate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String APPLICATION_INSTANCE_MUST_BE_OF_THE_RIGHT_TEMPLATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.applicationInstance.oclIsUndefined() or self.applicationTemplate = self.applicationInstance.applicationTemplate";

	/**
	 * The cached OCL invariant for the '{@link #applicationInstanceMustBeOfTheRightTemplate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Application Instance Must Be Of The Right Template</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #applicationInstanceMustBeOfTheRightTemplate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint APPLICATION_INSTANCE_MUST_BE_OF_THE_RIGHT_TEMPLATE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
    public boolean applicationInstanceMustBeOfTheRightTemplate(DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (APPLICATION_INSTANCE_MUST_BE_OF_THE_RIGHT_TEMPLATE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(RequestPackage.Literals.START_APPLICATION_REQUEST);
			try {
				APPLICATION_INSTANCE_MUST_BE_OF_THE_RIGHT_TEMPLATE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(APPLICATION_INSTANCE_MUST_BE_OF_THE_RIGHT_TEMPLATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(APPLICATION_INSTANCE_MUST_BE_OF_THE_RIGHT_TEMPLATE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(this)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 RequestValidator.DIAGNOSTIC_SOURCE,
						 RequestValidator.START_APPLICATION_REQUEST__APPLICATION_INSTANCE_MUST_BE_OF_THE_RIGHT_TEMPLATE,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "applicationInstanceMustBeOfTheRightTemplate", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RequestPackage.START_APPLICATION_REQUEST__INPUT_PARAMETERS:
				return ((InternalEList<?>)getInputParameters()).basicRemove(otherEnd, msgs);
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
			case RequestPackage.START_APPLICATION_REQUEST__APPLICATION_TEMPLATE:
				if (resolve) return getApplicationTemplate();
				return basicGetApplicationTemplate();
			case RequestPackage.START_APPLICATION_REQUEST__APPLICATION_INSTANCE:
				if (resolve) return getApplicationInstance();
				return basicGetApplicationInstance();
			case RequestPackage.START_APPLICATION_REQUEST__VM_FLAVOUR:
				if (resolve) return getVmFlavour();
				return basicGetVmFlavour();
			case RequestPackage.START_APPLICATION_REQUEST__INPUT_PARAMETERS:
				if (coreType) return getInputParameters();
				else return getInputParameters().map();
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
			case RequestPackage.START_APPLICATION_REQUEST__APPLICATION_TEMPLATE:
				setApplicationTemplate((ApplicationTemplate)newValue);
				return;
			case RequestPackage.START_APPLICATION_REQUEST__APPLICATION_INSTANCE:
				setApplicationInstance((ApplicationInstance)newValue);
				return;
			case RequestPackage.START_APPLICATION_REQUEST__VM_FLAVOUR:
				setVmFlavour((Flavour)newValue);
				return;
			case RequestPackage.START_APPLICATION_REQUEST__INPUT_PARAMETERS:
				((EStructuralFeature.Setting)getInputParameters()).set(newValue);
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
			case RequestPackage.START_APPLICATION_REQUEST__APPLICATION_TEMPLATE:
				setApplicationTemplate((ApplicationTemplate)null);
				return;
			case RequestPackage.START_APPLICATION_REQUEST__APPLICATION_INSTANCE:
				setApplicationInstance((ApplicationInstance)null);
				return;
			case RequestPackage.START_APPLICATION_REQUEST__VM_FLAVOUR:
				setVmFlavour((Flavour)null);
				return;
			case RequestPackage.START_APPLICATION_REQUEST__INPUT_PARAMETERS:
				getInputParameters().clear();
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
			case RequestPackage.START_APPLICATION_REQUEST__APPLICATION_TEMPLATE:
				return basicGetApplicationTemplate() != null;
			case RequestPackage.START_APPLICATION_REQUEST__APPLICATION_INSTANCE:
				return basicGetApplicationInstance() != null;
			case RequestPackage.START_APPLICATION_REQUEST__VM_FLAVOUR:
				return basicGetVmFlavour() != null;
			case RequestPackage.START_APPLICATION_REQUEST__INPUT_PARAMETERS:
				return !getInputParameters().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case RequestPackage.START_APPLICATION_REQUEST___APPLICATION_INSTANCE_MUST_BE_OF_THE_RIGHT_TEMPLATE__DIAGNOSTICCHAIN_MAP:
				return applicationInstanceMustBeOfTheRightTemplate((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * The cached environment for evaluating OCL expressions.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final OCL EOCL_ENV = OCL.newInstance();

} //StartApplicationRequestImpl
