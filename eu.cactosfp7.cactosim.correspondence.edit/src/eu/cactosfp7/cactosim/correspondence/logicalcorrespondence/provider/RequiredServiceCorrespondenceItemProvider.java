/**
 */
package eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.provider;


import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalcorrespondencePackage;
import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.RequiredServiceCorrespondence;

import eu.cactosfp7.cactosim.correspondence.provider.CorrespondenceEditPlugin;

import eu.cactosfp7.identifier.provider.IdentifierItemProvider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.RequiredServiceCorrespondence} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RequiredServiceCorrespondenceItemProvider extends IdentifierItemProvider {
        /**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public RequiredServiceCorrespondenceItemProvider(AdapterFactory adapterFactory) {
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

			addCactosRolePropertyDescriptor(object);
			addCactosVMPropertyDescriptor(object);
			addPalladioRolePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

        /**
	 * This adds a property descriptor for the Cactos Role feature.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        protected void addCactosRolePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RequiredServiceCorrespondence_cactosRole_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RequiredServiceCorrespondence_cactosRole_feature", "_UI_RequiredServiceCorrespondence_type"),
				 LogicalcorrespondencePackage.Literals.REQUIRED_SERVICE_CORRESPONDENCE__CACTOS_ROLE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

        /**
	 * This adds a property descriptor for the Cactos VM feature.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        protected void addCactosVMPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RequiredServiceCorrespondence_cactosVM_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RequiredServiceCorrespondence_cactosVM_feature", "_UI_RequiredServiceCorrespondence_type"),
				 LogicalcorrespondencePackage.Literals.REQUIRED_SERVICE_CORRESPONDENCE__CACTOS_VM,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

        /**
	 * This adds a property descriptor for the Palladio Role feature.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        protected void addPalladioRolePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RequiredServiceCorrespondence_palladioRole_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RequiredServiceCorrespondence_palladioRole_feature", "_UI_RequiredServiceCorrespondence_type"),
				 LogicalcorrespondencePackage.Literals.REQUIRED_SERVICE_CORRESPONDENCE__PALLADIO_ROLE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

        /**
	 * This returns RequiredServiceCorrespondence.gif.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        @Override
        public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/RequiredServiceCorrespondence"));
	}

        /**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        @Override
        public String getText(Object object) {
		String label = ((RequiredServiceCorrespondence)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_RequiredServiceCorrespondence_type") :
			getString("_UI_RequiredServiceCorrespondence_type") + " " + label;
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
