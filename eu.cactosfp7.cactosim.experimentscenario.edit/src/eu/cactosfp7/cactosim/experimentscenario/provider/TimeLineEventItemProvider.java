/**
 */
package eu.cactosfp7.cactosim.experimentscenario.provider;


import eu.cactosfp7.cactosim.experimentscenario.ExperimentscenarioPackage;
import eu.cactosfp7.cactosim.experimentscenario.TimeLineEvent;

import eu.cactosfp7.cactosim.experimentscenario.request.RequestFactory;

import eu.cactosfp7.identifier.provider.IdentifierItemProvider;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link eu.cactosfp7.cactosim.experimentscenario.TimeLineEvent} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TimeLineEventItemProvider 
	extends IdentifierItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeLineEventItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addEventStatusPropertyDescriptor(object);
			addRelativeTimeEventsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Event Status feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEventStatusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TimeLineEvent_eventStatus_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TimeLineEvent_eventStatus_feature", "_UI_TimeLineEvent_type"),
				 ExperimentscenarioPackage.Literals.TIME_LINE_EVENT__EVENT_STATUS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Relative Time Events feature.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected void addRelativeTimeEventsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TimeLineEvent_relativeTimeEvents_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TimeLineEvent_relativeTimeEvents_feature", "_UI_TimeLineEvent_type"),
				 ExperimentscenarioPackage.Literals.TIME_LINE_EVENT__RELATIVE_TIME_EVENTS,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

    /**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ExperimentscenarioPackage.Literals.TIME_LINE_EVENT__EXPERIMENT_SCENARIO_REQUEST);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((TimeLineEvent)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_TimeLineEvent_type") :
			getString("_UI_TimeLineEvent_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(TimeLineEvent.class)) {
			case ExperimentscenarioPackage.TIME_LINE_EVENT__EVENT_STATUS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ExperimentscenarioPackage.TIME_LINE_EVENT__EXPERIMENT_SCENARIO_REQUEST:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(ExperimentscenarioPackage.Literals.TIME_LINE_EVENT__EXPERIMENT_SCENARIO_REQUEST,
				 RequestFactory.eINSTANCE.createReconfigureOptimizationAlgorithmRequest()));

		newChildDescriptors.add
			(createChildParameter
				(ExperimentscenarioPackage.Literals.TIME_LINE_EVENT__EXPERIMENT_SCENARIO_REQUEST,
				 RequestFactory.eINSTANCE.createMigrateApplicationRequest()));

		newChildDescriptors.add
			(createChildParameter
				(ExperimentscenarioPackage.Literals.TIME_LINE_EVENT__EXPERIMENT_SCENARIO_REQUEST,
				 RequestFactory.eINSTANCE.createStartApplicationRequest()));

		newChildDescriptors.add
			(createChildParameter
				(ExperimentscenarioPackage.Literals.TIME_LINE_EVENT__EXPERIMENT_SCENARIO_REQUEST,
				 RequestFactory.eINSTANCE.createSuspendApplicationRequest()));

		newChildDescriptors.add
			(createChildParameter
				(ExperimentscenarioPackage.Literals.TIME_LINE_EVENT__EXPERIMENT_SCENARIO_REQUEST,
				 RequestFactory.eINSTANCE.createTerminateApplicationRequest()));

		newChildDescriptors.add
			(createChildParameter
				(ExperimentscenarioPackage.Literals.TIME_LINE_EVENT__EXPERIMENT_SCENARIO_REQUEST,
				 RequestFactory.eINSTANCE.createChangeOptimizationIntervalRequest()));

		newChildDescriptors.add
			(createChildParameter
				(ExperimentscenarioPackage.Literals.TIME_LINE_EVENT__EXPERIMENT_SCENARIO_REQUEST,
				 RequestFactory.eINSTANCE.createReconfigureScalableImageConnectorRequest()));

		newChildDescriptors.add
			(createChildParameter
				(ExperimentscenarioPackage.Literals.TIME_LINE_EVENT__EXPERIMENT_SCENARIO_REQUEST,
				 RequestFactory.eINSTANCE.createSetPhysicalNodeStateRequest()));

		newChildDescriptors.add
			(createChildParameter
				(ExperimentscenarioPackage.Literals.TIME_LINE_EVENT__EXPERIMENT_SCENARIO_REQUEST,
				 RequestFactory.eINSTANCE.createResumeApplicationRequest()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ExperimentscenarioEditPlugin.INSTANCE;
	}

}
