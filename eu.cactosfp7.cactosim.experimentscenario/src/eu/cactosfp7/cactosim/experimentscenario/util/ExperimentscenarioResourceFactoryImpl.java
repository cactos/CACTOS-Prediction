/**
 */
package eu.cactosfp7.cactosim.experimentscenario.util;

import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;

import org.eclipse.emf.ecore.xmi.XMLResource;

/**
 * <!-- begin-user-doc -->
 * The <b>Resource Factory</b> associated with the package.
 * <!-- end-user-doc -->
 * @see eu.cactosfp7.cactosim.experimentscenario.util.ExperimentscenarioResourceImpl
 * @generated
 */
public class ExperimentscenarioResourceFactoryImpl extends ResourceFactoryImpl {
    /**
	 * Creates an instance of the resource factory.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ExperimentscenarioResourceFactoryImpl() {
		super();
	}

    /**
	 * Creates an instance of the resource.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public Resource createResource(URI uri) {
		XMLResource result = new ExperimentscenarioResourceImpl(uri);
		return result;
	}

} //ExperimentscenarioResourceFactoryImpl
