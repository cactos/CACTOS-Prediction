/**
 */
package eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.provider;


import eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalCorrespondenceRepository;
import eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalcorrespondenceFactory;
import eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalcorrespondencePackage;

import eu.cactosfp7.cactosim.correspondence.provider.CorrespondenceEditPlugin;

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
 * This is the item provider adapter for a {@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalCorrespondenceRepository} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PhysicalCorrespondenceRepositoryItemProvider 
	extends IdentifierItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalCorrespondenceRepositoryItemProvider(AdapterFactory adapterFactory) {
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

			addCorrespondenceEstablishedPropertyDescriptor(object);
			addPhysicalDcModelPropertyDescriptor(object);
			addPhysicalLoadModelPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Correspondence Established feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCorrespondenceEstablishedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PhysicalCorrespondenceRepository_correspondenceEstablished_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PhysicalCorrespondenceRepository_correspondenceEstablished_feature", "_UI_PhysicalCorrespondenceRepository_type"),
				 PhysicalcorrespondencePackage.Literals.PHYSICAL_CORRESPONDENCE_REPOSITORY__CORRESPONDENCE_ESTABLISHED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Physical Dc Model feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPhysicalDcModelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PhysicalCorrespondenceRepository_physicalDcModel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PhysicalCorrespondenceRepository_physicalDcModel_feature", "_UI_PhysicalCorrespondenceRepository_type"),
				 PhysicalcorrespondencePackage.Literals.PHYSICAL_CORRESPONDENCE_REPOSITORY__PHYSICAL_DC_MODEL,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Physical Load Model feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPhysicalLoadModelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PhysicalCorrespondenceRepository_physicalLoadModel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PhysicalCorrespondenceRepository_physicalLoadModel_feature", "_UI_PhysicalCorrespondenceRepository_type"),
				 PhysicalcorrespondencePackage.Literals.PHYSICAL_CORRESPONDENCE_REPOSITORY__PHYSICAL_LOAD_MODEL,
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
			childrenFeatures.add(PhysicalcorrespondencePackage.Literals.PHYSICAL_CORRESPONDENCE_REPOSITORY__PU_MEASUREMENT_CORRESPONDENCES);
			childrenFeatures.add(PhysicalcorrespondencePackage.Literals.PHYSICAL_CORRESPONDENCE_REPOSITORY__MEMORY_MEASUREMENT_CORRESPONDENCES);
			childrenFeatures.add(PhysicalcorrespondencePackage.Literals.PHYSICAL_CORRESPONDENCE_REPOSITORY__STORAGE_MEASUREMENT_CORRESPONDENCES);
			childrenFeatures.add(PhysicalcorrespondencePackage.Literals.PHYSICAL_CORRESPONDENCE_REPOSITORY__INTERCONNECT_MEASUREMENT_CORRESPONDENCES);
			childrenFeatures.add(PhysicalcorrespondencePackage.Literals.PHYSICAL_CORRESPONDENCE_REPOSITORY__SWITCH_CORRESPONDENCES);
			childrenFeatures.add(PhysicalcorrespondencePackage.Literals.PHYSICAL_CORRESPONDENCE_REPOSITORY__RACK_CORRESPONDENCES);
			childrenFeatures.add(PhysicalcorrespondencePackage.Literals.PHYSICAL_CORRESPONDENCE_REPOSITORY__ABSTRACT_NODE_CORRESPONDENCES);
			childrenFeatures.add(PhysicalcorrespondencePackage.Literals.PHYSICAL_CORRESPONDENCE_REPOSITORY__MEMORY_SPECIFICATION_CORRESPONDENCES);
			childrenFeatures.add(PhysicalcorrespondencePackage.Literals.PHYSICAL_CORRESPONDENCE_REPOSITORY__STORAGE_SPECIFICATION_CORRESPONDENCES);
			childrenFeatures.add(PhysicalcorrespondencePackage.Literals.PHYSICAL_CORRESPONDENCE_REPOSITORY__NETWORK_INTERCONNECT_CORRESPONDENCES);
			childrenFeatures.add(PhysicalcorrespondencePackage.Literals.PHYSICAL_CORRESPONDENCE_REPOSITORY__PROCESSING_UNIT_SPECIFICATION_CORRESPONDENCES);
			childrenFeatures.add(PhysicalcorrespondencePackage.Literals.PHYSICAL_CORRESPONDENCE_REPOSITORY__POWER_CONSUMING_ENTITY_MEASUREMENT_CORRESPONDENCES);
			childrenFeatures.add(PhysicalcorrespondencePackage.Literals.PHYSICAL_CORRESPONDENCE_REPOSITORY__POWER_PROVIDING_ENTITY_CORRESPONDENCES);
			childrenFeatures.add(PhysicalcorrespondencePackage.Literals.PHYSICAL_CORRESPONDENCE_REPOSITORY__POWER_CONSUMING_RESOURCE_CORRESPONDENCES);
			childrenFeatures.add(PhysicalcorrespondencePackage.Literals.PHYSICAL_CORRESPONDENCE_REPOSITORY__ARCHITECTURE_TYPE_CORRESPONDENCES);
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
	 * This returns PhysicalCorrespondenceRepository.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PhysicalCorrespondenceRepository"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((PhysicalCorrespondenceRepository)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_PhysicalCorrespondenceRepository_type") :
			getString("_UI_PhysicalCorrespondenceRepository_type") + " " + label;
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

		switch (notification.getFeatureID(PhysicalCorrespondenceRepository.class)) {
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__CORRESPONDENCE_ESTABLISHED:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__PU_MEASUREMENT_CORRESPONDENCES:
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__MEMORY_MEASUREMENT_CORRESPONDENCES:
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__STORAGE_MEASUREMENT_CORRESPONDENCES:
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__INTERCONNECT_MEASUREMENT_CORRESPONDENCES:
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__SWITCH_CORRESPONDENCES:
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__RACK_CORRESPONDENCES:
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__ABSTRACT_NODE_CORRESPONDENCES:
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__MEMORY_SPECIFICATION_CORRESPONDENCES:
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__STORAGE_SPECIFICATION_CORRESPONDENCES:
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__NETWORK_INTERCONNECT_CORRESPONDENCES:
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__PROCESSING_UNIT_SPECIFICATION_CORRESPONDENCES:
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__POWER_CONSUMING_ENTITY_MEASUREMENT_CORRESPONDENCES:
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__POWER_PROVIDING_ENTITY_CORRESPONDENCES:
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__POWER_CONSUMING_RESOURCE_CORRESPONDENCES:
			case PhysicalcorrespondencePackage.PHYSICAL_CORRESPONDENCE_REPOSITORY__ARCHITECTURE_TYPE_CORRESPONDENCES:
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
				(PhysicalcorrespondencePackage.Literals.PHYSICAL_CORRESPONDENCE_REPOSITORY__PU_MEASUREMENT_CORRESPONDENCES,
				 PhysicalcorrespondenceFactory.eINSTANCE.createPuMeasurementCorrespondence()));

		newChildDescriptors.add
			(createChildParameter
				(PhysicalcorrespondencePackage.Literals.PHYSICAL_CORRESPONDENCE_REPOSITORY__MEMORY_MEASUREMENT_CORRESPONDENCES,
				 PhysicalcorrespondenceFactory.eINSTANCE.createMemoryMeasurementCorrespondence()));

		newChildDescriptors.add
			(createChildParameter
				(PhysicalcorrespondencePackage.Literals.PHYSICAL_CORRESPONDENCE_REPOSITORY__STORAGE_MEASUREMENT_CORRESPONDENCES,
				 PhysicalcorrespondenceFactory.eINSTANCE.createStorageMeasurementCorrespondence()));

		newChildDescriptors.add
			(createChildParameter
				(PhysicalcorrespondencePackage.Literals.PHYSICAL_CORRESPONDENCE_REPOSITORY__INTERCONNECT_MEASUREMENT_CORRESPONDENCES,
				 PhysicalcorrespondenceFactory.eINSTANCE.createInterconnectMeasurementCorrespondence()));

		newChildDescriptors.add
			(createChildParameter
				(PhysicalcorrespondencePackage.Literals.PHYSICAL_CORRESPONDENCE_REPOSITORY__SWITCH_CORRESPONDENCES,
				 PhysicalcorrespondenceFactory.eINSTANCE.createSwitchCorrespondence()));

		newChildDescriptors.add
			(createChildParameter
				(PhysicalcorrespondencePackage.Literals.PHYSICAL_CORRESPONDENCE_REPOSITORY__RACK_CORRESPONDENCES,
				 PhysicalcorrespondenceFactory.eINSTANCE.createRackCorrespondence()));

		newChildDescriptors.add
			(createChildParameter
				(PhysicalcorrespondencePackage.Literals.PHYSICAL_CORRESPONDENCE_REPOSITORY__ABSTRACT_NODE_CORRESPONDENCES,
				 PhysicalcorrespondenceFactory.eINSTANCE.createAbstractNodeCorrespondence()));

		newChildDescriptors.add
			(createChildParameter
				(PhysicalcorrespondencePackage.Literals.PHYSICAL_CORRESPONDENCE_REPOSITORY__MEMORY_SPECIFICATION_CORRESPONDENCES,
				 PhysicalcorrespondenceFactory.eINSTANCE.createMemorySpecificationCorrespondence()));

		newChildDescriptors.add
			(createChildParameter
				(PhysicalcorrespondencePackage.Literals.PHYSICAL_CORRESPONDENCE_REPOSITORY__STORAGE_SPECIFICATION_CORRESPONDENCES,
				 PhysicalcorrespondenceFactory.eINSTANCE.createStorageSpecificationCorrespondence()));

		newChildDescriptors.add
			(createChildParameter
				(PhysicalcorrespondencePackage.Literals.PHYSICAL_CORRESPONDENCE_REPOSITORY__NETWORK_INTERCONNECT_CORRESPONDENCES,
				 PhysicalcorrespondenceFactory.eINSTANCE.createNetworkInterconnectCorrespondence()));

		newChildDescriptors.add
			(createChildParameter
				(PhysicalcorrespondencePackage.Literals.PHYSICAL_CORRESPONDENCE_REPOSITORY__PROCESSING_UNIT_SPECIFICATION_CORRESPONDENCES,
				 PhysicalcorrespondenceFactory.eINSTANCE.createProcessingUnitSpecificationCorrespondence()));

		newChildDescriptors.add
			(createChildParameter
				(PhysicalcorrespondencePackage.Literals.PHYSICAL_CORRESPONDENCE_REPOSITORY__POWER_CONSUMING_ENTITY_MEASUREMENT_CORRESPONDENCES,
				 PhysicalcorrespondenceFactory.eINSTANCE.createPowerConsumingEntityMeasurementCorrespondence()));

		newChildDescriptors.add
			(createChildParameter
				(PhysicalcorrespondencePackage.Literals.PHYSICAL_CORRESPONDENCE_REPOSITORY__POWER_PROVIDING_ENTITY_CORRESPONDENCES,
				 PhysicalcorrespondenceFactory.eINSTANCE.createPowerProvidingEntityCorrespondence()));

		newChildDescriptors.add
			(createChildParameter
				(PhysicalcorrespondencePackage.Literals.PHYSICAL_CORRESPONDENCE_REPOSITORY__POWER_CONSUMING_RESOURCE_CORRESPONDENCES,
				 PhysicalcorrespondenceFactory.eINSTANCE.createPowerConsumingResourceCorrespondence()));

		newChildDescriptors.add
			(createChildParameter
				(PhysicalcorrespondencePackage.Literals.PHYSICAL_CORRESPONDENCE_REPOSITORY__ARCHITECTURE_TYPE_CORRESPONDENCES,
				 PhysicalcorrespondenceFactory.eINSTANCE.createArchitectureTypeCorrespondence()));
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
