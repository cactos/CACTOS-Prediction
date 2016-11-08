/**
 */
package eu.cactosfp7.cactosim.experimentscenario.request.provider;


import eu.cactosfp7.cactosim.experimentscenario.request.RequestPackage;
import eu.cactosfp7.cactosim.experimentscenario.request.SuspendApplicationRequest;

import eu.cactosfp7.cactosim.experimentscenario.selector.SelectorFactory;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link eu.cactosfp7.cactosim.experimentscenario.request.SuspendApplicationRequest} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SuspendApplicationRequestItemProvider extends ExperimentScenarioRequestItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuspendApplicationRequestItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(RequestPackage.Literals.SUSPEND_APPLICATION_REQUEST__RUNNING_APPLICATION_SELECTOR);
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
	 * This returns SuspendApplicationRequest.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SuspendApplicationRequest"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((SuspendApplicationRequest)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_SuspendApplicationRequest_type") :
			getString("_UI_SuspendApplicationRequest_type") + " " + label;
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

		switch (notification.getFeatureID(SuspendApplicationRequest.class)) {
			case RequestPackage.SUSPEND_APPLICATION_REQUEST__RUNNING_APPLICATION_SELECTOR:
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
				(RequestPackage.Literals.SUSPEND_APPLICATION_REQUEST__RUNNING_APPLICATION_SELECTOR,
				 SelectorFactory.eINSTANCE.createInitiallyRunningWhiteBoxApplicationInstanceSelector()));

		newChildDescriptors.add
			(createChildParameter
				(RequestPackage.Literals.SUSPEND_APPLICATION_REQUEST__RUNNING_APPLICATION_SELECTOR,
				 SelectorFactory.eINSTANCE.createInitiallyRunningGreyBoxApplicationInstanceSelector()));

		newChildDescriptors.add
			(createChildParameter
				(RequestPackage.Literals.SUSPEND_APPLICATION_REQUEST__RUNNING_APPLICATION_SELECTOR,
				 SelectorFactory.eINSTANCE.createInitiallyRunningBlackBoxApplicationInstanceSelector()));

		newChildDescriptors.add
			(createChildParameter
				(RequestPackage.Literals.SUSPEND_APPLICATION_REQUEST__RUNNING_APPLICATION_SELECTOR,
				 SelectorFactory.eINSTANCE.createPreviouslyStartedWhiteBoxApplicationInstanceSelector()));

		newChildDescriptors.add
			(createChildParameter
				(RequestPackage.Literals.SUSPEND_APPLICATION_REQUEST__RUNNING_APPLICATION_SELECTOR,
				 SelectorFactory.eINSTANCE.createPreviouslyStartedBlackBoxApplicationSelector()));

		newChildDescriptors.add
			(createChildParameter
				(RequestPackage.Literals.SUSPEND_APPLICATION_REQUEST__RUNNING_APPLICATION_SELECTOR,
				 SelectorFactory.eINSTANCE.createPreviouslyStartedGreyBoxApplicationSelector()));
	}

}
