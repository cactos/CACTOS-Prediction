/**
 */
package eu.cactosfp7.cactosim.experimentscenario.request.provider;


import eu.cactosfp7.cactosim.experimentscenario.request.ReconfigureScalableImageConnectorRequest;
import eu.cactosfp7.cactosim.experimentscenario.request.RequestPackage;

import eu.cactosfp7.cactosim.experimentscenario.selector.SelectorFactory;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link eu.cactosfp7.cactosim.experimentscenario.request.ReconfigureScalableImageConnectorRequest} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ReconfigureScalableImageConnectorRequestItemProvider extends ExperimentScenarioRequestItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReconfigureScalableImageConnectorRequestItemProvider(AdapterFactory adapterFactory) {
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

			addLoadBalancingPolicyPropertyDescriptor(object);
			addAutoscalingAnalysisIntervalPropertyDescriptor(object);
			addTargetConnectorPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Load Balancing Policy feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLoadBalancingPolicyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ReconfigureScalableImageConnectorRequest_loadBalancingPolicy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ReconfigureScalableImageConnectorRequest_loadBalancingPolicy_feature", "_UI_ReconfigureScalableImageConnectorRequest_type"),
				 RequestPackage.Literals.RECONFIGURE_SCALABLE_IMAGE_CONNECTOR_REQUEST__LOAD_BALANCING_POLICY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Autoscaling Analysis Interval feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAutoscalingAnalysisIntervalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ReconfigureScalableImageConnectorRequest_autoscalingAnalysisInterval_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ReconfigureScalableImageConnectorRequest_autoscalingAnalysisInterval_feature", "_UI_ReconfigureScalableImageConnectorRequest_type"),
				 RequestPackage.Literals.RECONFIGURE_SCALABLE_IMAGE_CONNECTOR_REQUEST__AUTOSCALING_ANALYSIS_INTERVAL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Target Connector feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetConnectorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ReconfigureScalableImageConnectorRequest_targetConnector_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ReconfigureScalableImageConnectorRequest_targetConnector_feature", "_UI_ReconfigureScalableImageConnectorRequest_type"),
				 RequestPackage.Literals.RECONFIGURE_SCALABLE_IMAGE_CONNECTOR_REQUEST__TARGET_CONNECTOR,
				 true,
				 false,
				 true,
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
			childrenFeatures.add(RequestPackage.Literals.RECONFIGURE_SCALABLE_IMAGE_CONNECTOR_REQUEST__WHITE_BOX_APPLICATION_INSTANCE_SELECTOR);
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
	 * This returns ReconfigureScalableImageConnectorRequest.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ReconfigureScalableImageConnectorRequest"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ReconfigureScalableImageConnectorRequest)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_ReconfigureScalableImageConnectorRequest_type") :
			getString("_UI_ReconfigureScalableImageConnectorRequest_type") + " " + label;
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

		switch (notification.getFeatureID(ReconfigureScalableImageConnectorRequest.class)) {
			case RequestPackage.RECONFIGURE_SCALABLE_IMAGE_CONNECTOR_REQUEST__LOAD_BALANCING_POLICY:
			case RequestPackage.RECONFIGURE_SCALABLE_IMAGE_CONNECTOR_REQUEST__AUTOSCALING_ANALYSIS_INTERVAL:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case RequestPackage.RECONFIGURE_SCALABLE_IMAGE_CONNECTOR_REQUEST__WHITE_BOX_APPLICATION_INSTANCE_SELECTOR:
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
				(RequestPackage.Literals.RECONFIGURE_SCALABLE_IMAGE_CONNECTOR_REQUEST__WHITE_BOX_APPLICATION_INSTANCE_SELECTOR,
				 SelectorFactory.eINSTANCE.createInitiallyRunningWhiteBoxApplicationInstanceSelector()));

		newChildDescriptors.add
			(createChildParameter
				(RequestPackage.Literals.RECONFIGURE_SCALABLE_IMAGE_CONNECTOR_REQUEST__WHITE_BOX_APPLICATION_INSTANCE_SELECTOR,
				 SelectorFactory.eINSTANCE.createPreviouslyStartedWhiteBoxApplicationInstanceSelector()));
	}

}
