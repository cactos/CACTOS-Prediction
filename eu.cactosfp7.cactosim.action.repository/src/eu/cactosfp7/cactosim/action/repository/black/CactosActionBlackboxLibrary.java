package eu.cactosfp7.cactosim.action.repository.black;

import java.util.Optional;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.m2m.qvt.oml.blackbox.java.Operation;
import org.eclipse.m2m.qvt.oml.blackbox.java.Operation.Kind;
import org.modelversioning.emfprofile.Profile;
import org.palladiosimulator.mdsdprofiles.api.ProfileAPI;
import org.palladiosimulator.mdsdprofiles.api.StereotypeAPI;
import org.palladiosimulator.mdsdprofiles.notifier.MDSDProfilesNotifier;
import org.palladiosimulator.simulizar.action.context.ExecutionContext;
import org.palladiosimulator.simulizar.action.interpreter.ExecutionContextKeeper;

import de.uka.ipd.sdq.simucomframework.SimuComSimProcess;
import eu.cactosfp7.infrastructuremodels.physicaldc.util.NamedElement;

public class CactosActionBlackboxLibrary {
    
    @Operation(kind = Kind.QUERY, contextual = true)
    public static boolean hasAppliedStereotype(final NamedElement entity, final String stereotypeName) {
        return StereotypeAPI.isStereotypeApplied(entity, stereotypeName);
    }
    
    private static Optional<Profile> queryProfileByStereotypeName(NamedElement cactosEntity, String stereotypeName) {
        assert stereotypeName != null && cactosEntity != null;

        return ProfileAPI.getApplicableProfiles().stream()
                .filter(profile -> profile.getStereotype(stereotypeName) != null).findAny();
    }
    
    private static void ensureProfileApplied(Resource resource, Profile profile) {
        assert resource != null && profile != null;

        if (!ProfileAPI.isProfileApplied(resource, profile)) {
            ProfileAPI.applyProfile(resource, profile);
        }
    }

    private static void ensureProfileApplied(NamedElement cactosEntity, String stereotypeName) {
        assert cactosEntity != null && stereotypeName != null;

        Profile profile = queryProfileByStereotypeName(cactosEntity, stereotypeName)
                .orElseThrow(() -> new IllegalArgumentException(
                        "Stereotype with given name '" + stereotypeName + "' does not exist!"));
        ensureProfileApplied(cactosEntity.eResource(), profile);
    }

    @Operation(kind = Kind.HELPER, contextual = true)
    public static void applyStereotype(final NamedElement cactosEntity, final String stereotypeName) {
        ensureProfileApplied(cactosEntity, stereotypeName);
        StereotypeAPI.applyStereotype(cactosEntity, stereotypeName);
    }
    
    @Operation(kind = Kind.HELPER, contextual = true)
    public static void removeStereotypeApplications(final NamedElement cactosEntity, final String stereotypeName) {
        ensureProfileApplied(cactosEntity, stereotypeName);
        if (StereotypeAPI.isStereotypeApplied(cactosEntity, stereotypeName)) {
            StereotypeAPI.unapplyStereotype(cactosEntity, stereotypeName);
        }
    }
    
    @Operation(kind = Kind.HELPER, contextual = true)
    public static boolean passivateWhileStereotypePresent(final ExecutionContext context, final NamedElement stereotypedObject, final String stereotypeName) {
	final SimuComSimProcess processForContext = 
		ExecutionContextKeeper.getInstance().getProcessForContext(context)
		.orElseThrow(() -> new RuntimeException("ExecutionContext is not mapped to SimuComSimProcess. Make"
			+ " sure to only call this operation from a running TransientEffectInterpreter session."));
	if (!hasAppliedStereotype(stereotypedObject, stereotypeName))
	    return true;
	
	return StereotypeAPI.getAppliedStereotypes(stereotypedObject).stream()
		.filter(s -> s.getName().equals(stereotypeName)).findAny()
		.map(stereotype -> {
		    Adapter notifier = new AdapterImpl() {
			   @Override
			public void notifyChanged(Notification msg) {
			    if (msg.getEventType() == MDSDProfilesNotifier.UNAPPLY_STEREOTYPE
				    && stereotype.equals(msg.getNewValue())
				    && stereotypedObject.equals(msg.getNotifier())) {
				processForContext.activate();
			    }
			}
		    };
		    stereotypedObject.eAdapters().add(notifier);
		    
		    while (StereotypeAPI.isStereotypeApplied(stereotypedObject, stereotype)) {
			processForContext.passivate();
		    }
		    
		    stereotypedObject.eAdapters().remove(notifier);
		    return true;
		}).orElse(Boolean.FALSE);
    }
}
