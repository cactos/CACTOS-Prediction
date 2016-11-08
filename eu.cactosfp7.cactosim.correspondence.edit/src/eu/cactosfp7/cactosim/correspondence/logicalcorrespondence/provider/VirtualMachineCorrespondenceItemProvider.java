/**
 */
package eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.provider;


import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalcorrespondencePackage;

import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VirtualMachineCorrespondence;
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
 * This is the item provider adapter for a {@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.VirtualMachineCorrespondence} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class VirtualMachineCorrespondenceItemProvider 
	extends IdentifierItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualMachineCorrespondenceItemProvider(AdapterFactory adapterFactory) {
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

			addCactosPropertyDescriptor(object);
			addPalladioPropertyDescriptor(object);
			addPalladioStorageConnectorPropertyDescriptor(object);
			addPalladioUsagePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Cactos feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCactosPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VirtualMachineCorrespondence_cactos_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VirtualMachineCorrespondence_cactos_feature", "_UI_VirtualMachineCorrespondence_type"),
				 LogicalcorrespondencePackage.Literals.VIRTUAL_MACHINE_CORRESPONDENCE__CACTOS,
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
				 getString("_UI_VirtualMachineCorrespondence_palladio_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VirtualMachineCorrespondence_palladio_feature", "_UI_VirtualMachineCorrespondence_type"),
				 LogicalcorrespondencePackage.Literals.VIRTUAL_MACHINE_CORRESPONDENCE__PALLADIO,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Palladio Storage Connector feature.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected void addPalladioStorageConnectorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VirtualMachineCorrespondence_palladioStorageConnector_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VirtualMachineCorrespondence_palladioStorageConnector_feature", "_UI_VirtualMachineCorrespondence_type"),
				 LogicalcorrespondencePackage.Literals.VIRTUAL_MACHINE_CORRESPONDENCE__PALLADIO_STORAGE_CONNECTOR,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

    /**
	 * This adds a property descriptor for the Palladio Usage feature.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected void addPalladioUsagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VirtualMachineCorrespondence_palladioUsage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VirtualMachineCorrespondence_palladioUsage_feature", "_UI_VirtualMachineCorrespondence_type"),
				 LogicalcorrespondencePackage.Literals.VIRTUAL_MACHINE_CORRESPONDENCE__PALLADIO_USAGE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

    /**
	 * This returns VirtualMachineCorrespondence.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/VirtualMachineCorrespondence"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((VirtualMachineCorrespondence)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_VirtualMachineCorrespondence_type") :
			getString("_UI_VirtualMachineCorrespondence_type") + " " + label;
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
