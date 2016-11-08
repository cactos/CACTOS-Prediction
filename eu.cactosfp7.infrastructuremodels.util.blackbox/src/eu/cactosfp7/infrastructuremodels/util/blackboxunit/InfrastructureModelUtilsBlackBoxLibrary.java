package eu.cactosfp7.infrastructuremodels.util.blackboxunit;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.m2m.qvt.oml.blackbox.java.Operation;
import org.eclipse.m2m.qvt.oml.blackbox.java.Operation.Kind;

import eu.cactosfp7.infrastructuremodels.logicaldc.application.util.NonIdCopier;

public class InfrastructureModelUtilsBlackBoxLibrary {
	
	@Operation(kind = Kind.HELPER, contextual = true)
	public static EObject nonIdDeepClone(EObject eObject) {
		return NonIdCopier.nonIdCopy(eObject);
	}
}
