/**
 */
package eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.provider;


import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalCorrespondenceRepository;
import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalcorrespondenceFactory;
import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalcorrespondencePackage;

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
 * This is the item provider adapter for a {@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalCorrespondenceRepository} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LogicalCorrespondenceRepositoryItemProvider 
	extends IdentifierItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalCorrespondenceRepositoryItemProvider(AdapterFactory adapterFactory) {
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

			addNetworkAttachedStorageCorrespondencesPropertyDescriptor(object);
			addLogicalDcModelPropertyDescriptor(object);
			addLogicalLoadModelPropertyDescriptor(object);
			addCorrespondenceEstablishedPropertyDescriptor(object);
			addApplicationProvidedServiceCorrespondencesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Network Attached Storage Correspondences feature.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected void addNetworkAttachedStorageCorrespondencesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LogicalCorrespondenceRepository_networkAttachedStorageCorrespondences_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LogicalCorrespondenceRepository_networkAttachedStorageCorrespondences_feature", "_UI_LogicalCorrespondenceRepository_type"),
				 LogicalcorrespondencePackage.Literals.LOGICAL_CORRESPONDENCE_REPOSITORY__NETWORK_ATTACHED_STORAGE_CORRESPONDENCES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

    /**
	 * This adds a property descriptor for the Logical Dc Model feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLogicalDcModelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LogicalCorrespondenceRepository_logicalDcModel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LogicalCorrespondenceRepository_logicalDcModel_feature", "_UI_LogicalCorrespondenceRepository_type"),
				 LogicalcorrespondencePackage.Literals.LOGICAL_CORRESPONDENCE_REPOSITORY__LOGICAL_DC_MODEL,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Logical Load Model feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLogicalLoadModelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LogicalCorrespondenceRepository_logicalLoadModel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LogicalCorrespondenceRepository_logicalLoadModel_feature", "_UI_LogicalCorrespondenceRepository_type"),
				 LogicalcorrespondencePackage.Literals.LOGICAL_CORRESPONDENCE_REPOSITORY__LOGICAL_LOAD_MODEL,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
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
				 getString("_UI_LogicalCorrespondenceRepository_correspondenceEstablished_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LogicalCorrespondenceRepository_correspondenceEstablished_feature", "_UI_LogicalCorrespondenceRepository_type"),
				 LogicalcorrespondencePackage.Literals.LOGICAL_CORRESPONDENCE_REPOSITORY__CORRESPONDENCE_ESTABLISHED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Application Provided Service Correspondences feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addApplicationProvidedServiceCorrespondencesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LogicalCorrespondenceRepository_applicationProvidedServiceCorrespondences_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LogicalCorrespondenceRepository_applicationProvidedServiceCorrespondences_feature", "_UI_LogicalCorrespondenceRepository_type"),
				 LogicalcorrespondencePackage.Literals.LOGICAL_CORRESPONDENCE_REPOSITORY__APPLICATION_PROVIDED_SERVICE_CORRESPONDENCES,
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
			childrenFeatures.add(LogicalcorrespondencePackage.Literals.LOGICAL_CORRESPONDENCE_REPOSITORY__VIRTUAL_MEMORY_MEASUREMENT_CORRESPONDENCES);
			childrenFeatures.add(LogicalcorrespondencePackage.Literals.LOGICAL_CORRESPONDENCE_REPOSITORY__VIRTUAL_NETWORK_INTERCONNECT_MEASUREMENT_CORRESPONDENCES);
			childrenFeatures.add(LogicalcorrespondencePackage.Literals.LOGICAL_CORRESPONDENCE_REPOSITORY__VIRTUAL_PROCESSING_UNIT_MEASUREMENT_CORRESPONDENCES);
			childrenFeatures.add(LogicalcorrespondencePackage.Literals.LOGICAL_CORRESPONDENCE_REPOSITORY__VOLUME_MEASUREMENT_CORRESPONDENCES);
			childrenFeatures.add(LogicalcorrespondencePackage.Literals.LOGICAL_CORRESPONDENCE_REPOSITORY__VIRTUAL_NETWORK_INTERCONNECTS);
			childrenFeatures.add(LogicalcorrespondencePackage.Literals.LOGICAL_CORRESPONDENCE_REPOSITORY__VM_IMAGE_CORRESPONDENCES);
			childrenFeatures.add(LogicalcorrespondencePackage.Literals.LOGICAL_CORRESPONDENCE_REPOSITORY__VM_IMAGE_INSTANCE_CORRESPONDENCES);
			childrenFeatures.add(LogicalcorrespondencePackage.Literals.LOGICAL_CORRESPONDENCE_REPOSITORY__VIRTUAL_MACHINE_CORRESPONDENCES);
			childrenFeatures.add(LogicalcorrespondencePackage.Literals.LOGICAL_CORRESPONDENCE_REPOSITORY__HYPERVISOR_CORRESPONDENCES);
			childrenFeatures.add(LogicalcorrespondencePackage.Literals.LOGICAL_CORRESPONDENCE_REPOSITORY__OPTIMISATION_PLAN_CORRESPONDENCE);
			childrenFeatures.add(LogicalcorrespondencePackage.Literals.LOGICAL_CORRESPONDENCE_REPOSITORY__PROVIDED_SERVICE_CORRESPONDENCES);
			childrenFeatures.add(LogicalcorrespondencePackage.Literals.LOGICAL_CORRESPONDENCE_REPOSITORY__REQUIRED_SERVICE_CORRESPONDENCES);
			childrenFeatures.add(LogicalcorrespondencePackage.Literals.LOGICAL_CORRESPONDENCE_REPOSITORY__SCALABLE_CONNECTOR_CORRESPONDENCES);
			childrenFeatures.add(LogicalcorrespondencePackage.Literals.LOGICAL_CORRESPONDENCE_REPOSITORY__USER_BEHAVIOUR_CORRESPONDENCES);
			childrenFeatures.add(LogicalcorrespondencePackage.Literals.LOGICAL_CORRESPONDENCE_REPOSITORY__ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCES);
			childrenFeatures.add(LogicalcorrespondencePackage.Literals.LOGICAL_CORRESPONDENCE_REPOSITORY__SERVICE_OPERATION_CORRESPONDENCES);
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
	 * This returns LogicalCorrespondenceRepository.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/LogicalCorrespondenceRepository"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((LogicalCorrespondenceRepository)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_LogicalCorrespondenceRepository_type") :
			getString("_UI_LogicalCorrespondenceRepository_type") + " " + label;
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

		switch (notification.getFeatureID(LogicalCorrespondenceRepository.class)) {
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__CORRESPONDENCE_ESTABLISHED:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__VIRTUAL_MEMORY_MEASUREMENT_CORRESPONDENCES:
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__VIRTUAL_NETWORK_INTERCONNECT_MEASUREMENT_CORRESPONDENCES:
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__VIRTUAL_PROCESSING_UNIT_MEASUREMENT_CORRESPONDENCES:
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__VOLUME_MEASUREMENT_CORRESPONDENCES:
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__VIRTUAL_NETWORK_INTERCONNECTS:
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__VM_IMAGE_CORRESPONDENCES:
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__VM_IMAGE_INSTANCE_CORRESPONDENCES:
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__VIRTUAL_MACHINE_CORRESPONDENCES:
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__HYPERVISOR_CORRESPONDENCES:
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__OPTIMISATION_PLAN_CORRESPONDENCE:
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__PROVIDED_SERVICE_CORRESPONDENCES:
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__REQUIRED_SERVICE_CORRESPONDENCES:
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__SCALABLE_CONNECTOR_CORRESPONDENCES:
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__USER_BEHAVIOUR_CORRESPONDENCES:
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCES:
			case LogicalcorrespondencePackage.LOGICAL_CORRESPONDENCE_REPOSITORY__SERVICE_OPERATION_CORRESPONDENCES:
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
				(LogicalcorrespondencePackage.Literals.LOGICAL_CORRESPONDENCE_REPOSITORY__VIRTUAL_MEMORY_MEASUREMENT_CORRESPONDENCES,
				 LogicalcorrespondenceFactory.eINSTANCE.createVirtualMemoryMeasurementCorrespondence()));

		newChildDescriptors.add
			(createChildParameter
				(LogicalcorrespondencePackage.Literals.LOGICAL_CORRESPONDENCE_REPOSITORY__VIRTUAL_NETWORK_INTERCONNECT_MEASUREMENT_CORRESPONDENCES,
				 LogicalcorrespondenceFactory.eINSTANCE.createVirtualNetworkInterconnectMeasurementCorrespondence()));

		newChildDescriptors.add
			(createChildParameter
				(LogicalcorrespondencePackage.Literals.LOGICAL_CORRESPONDENCE_REPOSITORY__VIRTUAL_PROCESSING_UNIT_MEASUREMENT_CORRESPONDENCES,
				 LogicalcorrespondenceFactory.eINSTANCE.createVirtualProcessingUnitMeasurementCorrespondence()));

		newChildDescriptors.add
			(createChildParameter
				(LogicalcorrespondencePackage.Literals.LOGICAL_CORRESPONDENCE_REPOSITORY__VOLUME_MEASUREMENT_CORRESPONDENCES,
				 LogicalcorrespondenceFactory.eINSTANCE.createLogicalDiskReadMeasurementCorrespondence()));

		newChildDescriptors.add
			(createChildParameter
				(LogicalcorrespondencePackage.Literals.LOGICAL_CORRESPONDENCE_REPOSITORY__VIRTUAL_NETWORK_INTERCONNECTS,
				 LogicalcorrespondenceFactory.eINSTANCE.createVirtualNetworkInterconnectCorrespondence()));

		newChildDescriptors.add
			(createChildParameter
				(LogicalcorrespondencePackage.Literals.LOGICAL_CORRESPONDENCE_REPOSITORY__VM_IMAGE_CORRESPONDENCES,
				 LogicalcorrespondenceFactory.eINSTANCE.createVMImageCorrespondence()));

		newChildDescriptors.add
			(createChildParameter
				(LogicalcorrespondencePackage.Literals.LOGICAL_CORRESPONDENCE_REPOSITORY__VM_IMAGE_INSTANCE_CORRESPONDENCES,
				 LogicalcorrespondenceFactory.eINSTANCE.createVMImageInstanceCorrespondence()));

		newChildDescriptors.add
			(createChildParameter
				(LogicalcorrespondencePackage.Literals.LOGICAL_CORRESPONDENCE_REPOSITORY__VIRTUAL_MACHINE_CORRESPONDENCES,
				 LogicalcorrespondenceFactory.eINSTANCE.createVirtualMachineCorrespondence()));

		newChildDescriptors.add
			(createChildParameter
				(LogicalcorrespondencePackage.Literals.LOGICAL_CORRESPONDENCE_REPOSITORY__HYPERVISOR_CORRESPONDENCES,
				 LogicalcorrespondenceFactory.eINSTANCE.createHypervisorCorrespondence()));

		newChildDescriptors.add
			(createChildParameter
				(LogicalcorrespondencePackage.Literals.LOGICAL_CORRESPONDENCE_REPOSITORY__OPTIMISATION_PLAN_CORRESPONDENCE,
				 LogicalcorrespondenceFactory.eINSTANCE.createOptimisationPlanCorrespondence()));

		newChildDescriptors.add
			(createChildParameter
				(LogicalcorrespondencePackage.Literals.LOGICAL_CORRESPONDENCE_REPOSITORY__PROVIDED_SERVICE_CORRESPONDENCES,
				 LogicalcorrespondenceFactory.eINSTANCE.createProvidedServiceCorrespondence()));

		newChildDescriptors.add
			(createChildParameter
				(LogicalcorrespondencePackage.Literals.LOGICAL_CORRESPONDENCE_REPOSITORY__REQUIRED_SERVICE_CORRESPONDENCES,
				 LogicalcorrespondenceFactory.eINSTANCE.createRequiredServiceCorrespondence()));

		newChildDescriptors.add
			(createChildParameter
				(LogicalcorrespondencePackage.Literals.LOGICAL_CORRESPONDENCE_REPOSITORY__SCALABLE_CONNECTOR_CORRESPONDENCES,
				 LogicalcorrespondenceFactory.eINSTANCE.createScalableVMImageConnectorCorrespondence()));

		newChildDescriptors.add
			(createChildParameter
				(LogicalcorrespondencePackage.Literals.LOGICAL_CORRESPONDENCE_REPOSITORY__USER_BEHAVIOUR_CORRESPONDENCES,
				 LogicalcorrespondenceFactory.eINSTANCE.createUserBehaviourCorrespondence()));

		newChildDescriptors.add
			(createChildParameter
				(LogicalcorrespondencePackage.Literals.LOGICAL_CORRESPONDENCE_REPOSITORY__ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCES,
				 LogicalcorrespondenceFactory.eINSTANCE.createRequestArrivalRateMeasurementCorrespondence()));

		newChildDescriptors.add
			(createChildParameter
				(LogicalcorrespondencePackage.Literals.LOGICAL_CORRESPONDENCE_REPOSITORY__ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCES,
				 LogicalcorrespondenceFactory.eINSTANCE.createResponseArrivalRateMeasurementCorrespondence()));

		newChildDescriptors.add
			(createChildParameter
				(LogicalcorrespondencePackage.Literals.LOGICAL_CORRESPONDENCE_REPOSITORY__SERVICE_OPERATION_CORRESPONDENCES,
				 LogicalcorrespondenceFactory.eINSTANCE.createServiceOperationCorrespondence()));
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
