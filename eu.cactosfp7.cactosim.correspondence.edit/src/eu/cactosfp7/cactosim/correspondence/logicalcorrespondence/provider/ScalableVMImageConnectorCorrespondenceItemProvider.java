/**
 */
package eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.provider;


import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalcorrespondencePackage;
import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ScalableVMImageConnectorCorrespondence;

import eu.cactosfp7.cactosim.correspondence.provider.CorrespondenceEditPlugin;

import eu.cactosfp7.identifier.provider.IdentifierItemProvider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ScalableVMImageConnectorCorrespondence} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ScalableVMImageConnectorCorrespondenceItemProvider extends IdentifierItemProvider {
        /**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public ScalableVMImageConnectorCorrespondenceItemProvider(AdapterFactory adapterFactory) {
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

			addCactosApplicationInstancePropertyDescriptor(object);
			addCactosConnectorPropertyDescriptor(object);
			addPalladioPropertyDescriptor(object);
			addMaximumInstanceNumberPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

        /**
	 * This adds a property descriptor for the Cactos Connector feature.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        protected void addCactosConnectorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ScalableVMImageConnectorCorrespondence_cactosConnector_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ScalableVMImageConnectorCorrespondence_cactosConnector_feature", "_UI_ScalableVMImageConnectorCorrespondence_type"),
				 LogicalcorrespondencePackage.Literals.SCALABLE_VM_IMAGE_CONNECTOR_CORRESPONDENCE__CACTOS_CONNECTOR,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

        /**
	 * This adds a property descriptor for the Palladio feature.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        protected void addPalladioPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ScalableVMImageConnectorCorrespondence_palladio_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ScalableVMImageConnectorCorrespondence_palladio_feature", "_UI_ScalableVMImageConnectorCorrespondence_type"),
				 LogicalcorrespondencePackage.Literals.SCALABLE_VM_IMAGE_CONNECTOR_CORRESPONDENCE__PALLADIO,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

        /**
	 * This adds a property descriptor for the Maximum Instance Number feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaximumInstanceNumberPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ScalableVMImageConnectorCorrespondence_maximumInstanceNumber_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ScalableVMImageConnectorCorrespondence_maximumInstanceNumber_feature", "_UI_ScalableVMImageConnectorCorrespondence_type"),
				 LogicalcorrespondencePackage.Literals.SCALABLE_VM_IMAGE_CONNECTOR_CORRESPONDENCE__MAXIMUM_INSTANCE_NUMBER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

								/**
	 * This adds a property descriptor for the Cactos Application Instance feature.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        protected void addCactosApplicationInstancePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ScalableVMImageConnectorCorrespondence_cactosApplicationInstance_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ScalableVMImageConnectorCorrespondence_cactosApplicationInstance_feature", "_UI_ScalableVMImageConnectorCorrespondence_type"),
				 LogicalcorrespondencePackage.Literals.SCALABLE_VM_IMAGE_CONNECTOR_CORRESPONDENCE__CACTOS_APPLICATION_INSTANCE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

        /**
	 * This returns ScalableVMImageConnectorCorrespondence.gif.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        @Override
        public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ScalableVMImageConnectorCorrespondence"));
	}

        /**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        @Override
        public String getText(Object object) {
		String label = ((ScalableVMImageConnectorCorrespondence)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_ScalableVMImageConnectorCorrespondence_type") :
			getString("_UI_ScalableVMImageConnectorCorrespondence_type") + " " + label;
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

		switch (notification.getFeatureID(ScalableVMImageConnectorCorrespondence.class)) {
			case LogicalcorrespondencePackage.SCALABLE_VM_IMAGE_CONNECTOR_CORRESPONDENCE__MAXIMUM_INSTANCE_NUMBER:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
	}

        /**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        @Override
        public ResourceLocator getResourceLocator() {
		return CorrespondenceEditPlugin.INSTANCE;
	}

}
