/**
 */
package eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.provider;


import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalcorrespondencePackage;
import eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ResponseArrivalRateMeasurementCorrespondence;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ResponseArrivalRateMeasurementCorrespondence} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ResponseArrivalRateMeasurementCorrespondenceItemProvider extends ArrivalRateMeasurementCorrespondenceItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseArrivalRateMeasurementCorrespondenceItemProvider(AdapterFactory adapterFactory) {
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

			addResponseArrivalRateMeasurementPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Response Arrival Rate Measurement feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResponseArrivalRateMeasurementPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ResponseArrivalRateMeasurementCorrespondence_responseArrivalRateMeasurement_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResponseArrivalRateMeasurementCorrespondence_responseArrivalRateMeasurement_feature", "_UI_ResponseArrivalRateMeasurementCorrespondence_type"),
				 LogicalcorrespondencePackage.Literals.RESPONSE_ARRIVAL_RATE_MEASUREMENT_CORRESPONDENCE__RESPONSE_ARRIVAL_RATE_MEASUREMENT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns ResponseArrivalRateMeasurementCorrespondence.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ResponseArrivalRateMeasurementCorrespondence"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ResponseArrivalRateMeasurementCorrespondence)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_ResponseArrivalRateMeasurementCorrespondence_type") :
			getString("_UI_ResponseArrivalRateMeasurementCorrespondence_type") + " " + label;
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

}
