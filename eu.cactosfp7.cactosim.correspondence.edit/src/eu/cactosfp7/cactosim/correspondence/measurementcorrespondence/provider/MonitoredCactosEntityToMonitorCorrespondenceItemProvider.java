/**
 */
package eu.cactosfp7.cactosim.correspondence.measurementcorrespondence.provider;


import eu.cactosfp7.cactosim.correspondence.measurementcorrespondence.MeasurementcorrespondencePackage;
import eu.cactosfp7.cactosim.correspondence.measurementcorrespondence.MonitoredCactosEntityToMonitorCorrespondence;
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
 * This is the item provider adapter for a {@link eu.cactosfp7.cactosim.correspondence.measurementcorrespondence.MonitoredCactosEntityToMonitorCorrespondence} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MonitoredCactosEntityToMonitorCorrespondenceItemProvider 
	extends IdentifierItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonitoredCactosEntityToMonitorCorrespondenceItemProvider(AdapterFactory adapterFactory) {
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
			addMonitorCorrespondenceRepositoryPropertyDescriptor(object);
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
				 getString("_UI_MonitoredCactosEntityToMonitorCorrespondence_cactos_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MonitoredCactosEntityToMonitorCorrespondence_cactos_feature", "_UI_MonitoredCactosEntityToMonitorCorrespondence_type"),
				 MeasurementcorrespondencePackage.Literals.MONITORED_CACTOS_ENTITY_TO_MONITOR_CORRESPONDENCE__CACTOS,
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
				 getString("_UI_MonitoredCactosEntityToMonitorCorrespondence_palladio_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MonitoredCactosEntityToMonitorCorrespondence_palladio_feature", "_UI_MonitoredCactosEntityToMonitorCorrespondence_type"),
				 MeasurementcorrespondencePackage.Literals.MONITORED_CACTOS_ENTITY_TO_MONITOR_CORRESPONDENCE__PALLADIO,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Monitor Correspondence Repository feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMonitorCorrespondenceRepositoryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MonitoredCactosEntityToMonitorCorrespondence_monitorCorrespondenceRepository_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MonitoredCactosEntityToMonitorCorrespondence_monitorCorrespondenceRepository_feature", "_UI_MonitoredCactosEntityToMonitorCorrespondence_type"),
				 MeasurementcorrespondencePackage.Literals.MONITORED_CACTOS_ENTITY_TO_MONITOR_CORRESPONDENCE__MONITOR_CORRESPONDENCE_REPOSITORY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns MonitoredCactosEntityToMonitorCorrespondence.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MonitoredCactosEntityToMonitorCorrespondence"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((MonitoredCactosEntityToMonitorCorrespondence)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_MonitoredCactosEntityToMonitorCorrespondence_type") :
			getString("_UI_MonitoredCactosEntityToMonitorCorrespondence_type") + " " + label;
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
