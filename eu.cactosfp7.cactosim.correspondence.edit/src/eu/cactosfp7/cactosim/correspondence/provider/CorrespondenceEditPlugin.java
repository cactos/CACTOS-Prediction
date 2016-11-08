/**
 */
package eu.cactosfp7.cactosim.correspondence.provider;

import de.fzi.power.util.provider.PowerEditPlugin;
import de.uka.ipd.sdq.identifier.provider.IdentifierEditPlugin;

import de.uka.ipd.sdq.probfunction.provider.ProbabilityFunctionEditPlugin;

import de.uka.ipd.sdq.stoex.provider.StoexEditPlugin;

import de.uka.ipd.sdq.units.provider.UnitsEditPlugin;
import eu.cactosfp7.infrastructuremodels.load.logical.provider.InfrastructureModelsEditPlugin;
import eu.cactosfp7.optimisationplan.provider.OptimisationplanEditPlugin;
import org.eclipse.emf.common.EMFPlugin;

import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.provider.EcoreEditPlugin;
import org.palladiosimulator.edp2.models.ExperimentData.provider.EDP2EditPlugin;

import org.palladiosimulator.metricspec.provider.MetricSpecEditPlugin;

import org.palladiosimulator.monitorrepository.provider.MonitorrepositoryEditPlugin;

import org.palladiosimulator.pcm.core.provider.PalladioComponentModelEditPlugin;

import org.palladiosimulator.runtimemeasurement.provider.RuntimeMeasurementEditPlugin;

import org.scaledl.usageevolution.provider.UsageevolutionEditPlugin;
import tools.descartes.dlim.provider.DlimEditPlugin;

/**
 * This is the central singleton for the Correspondence edit plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class CorrespondenceEditPlugin extends EMFPlugin {
	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final CorrespondenceEditPlugin INSTANCE = new CorrespondenceEditPlugin();

	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static Implementation plugin;

	/**
	 * Create the instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorrespondenceEditPlugin() {
		super
		  (new ResourceLocator [] {
		     DlimEditPlugin.INSTANCE,
		     EcoreEditPlugin.INSTANCE,
		     EDP2EditPlugin.INSTANCE,
		     IdentifierEditPlugin.INSTANCE,
		     eu.cactosfp7.identifier.edit.provider.IdentifierEditPlugin.INSTANCE,
		     InfrastructureModelsEditPlugin.INSTANCE,
		     MetricSpecEditPlugin.INSTANCE,
		     MonitorrepositoryEditPlugin.INSTANCE,
		     OptimisationplanEditPlugin.INSTANCE,
		     PalladioComponentModelEditPlugin.INSTANCE,
		     PowerEditPlugin.INSTANCE,
		     ProbabilityFunctionEditPlugin.INSTANCE,
		     RuntimeMeasurementEditPlugin.INSTANCE,
		     StoexEditPlugin.INSTANCE,
		     UnitsEditPlugin.INSTANCE,
		     UsageevolutionEditPlugin.INSTANCE,
		   });
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	@Override
	public ResourceLocator getPluginResourceLocator() {
		return plugin;
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	public static Implementation getPlugin() {
		return plugin;
	}

	/**
	 * The actual implementation of the Eclipse <b>Plugin</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class Implementation extends EclipsePlugin {
		/**
		 * Creates an instance.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public Implementation() {
			super();

			// Remember the static instance.
			//
			plugin = this;
		}
	}

}
