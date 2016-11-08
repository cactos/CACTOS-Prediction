/**
 */
package eu.cactosfp7.cactosim.correspondence.logicalcorrespondence;

import eu.cactosfp7.cactosim.correspondence.LoadCorrespondence;

import eu.cactosfp7.infrastructuremodels.logicaldc.application.ServiceOperation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Operation Instance Arrival Rate Measurement Correspondence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ServiceOperationInstanceArrivalRateMeasurementCorrespondence#getServiceInstanceArrivalRateMeasurementCorrespondence <em>Service Instance Arrival Rate Measurement Correspondence</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ServiceOperationInstanceArrivalRateMeasurementCorrespondence#getCactosServiceOperation <em>Cactos Service Operation</em>}</li>
 * </ul>
 *
 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalcorrespondencePackage#getServiceOperationInstanceArrivalRateMeasurementCorrespondence()
 * @model
 * @generated
 */
public interface ServiceOperationInstanceArrivalRateMeasurementCorrespondence extends LoadCorrespondence {
	/**
	 * Returns the value of the '<em><b>Service Instance Arrival Rate Measurement Correspondence</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ServiceInstanceArrivalRateMeasurementCorrespondence#getServiceOperationInstanceCorrespondence <em>Service Operation Instance Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Instance Arrival Rate Measurement Correspondence</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Instance Arrival Rate Measurement Correspondence</em>' container reference.
	 * @see #setServiceInstanceArrivalRateMeasurementCorrespondence(ServiceInstanceArrivalRateMeasurementCorrespondence)
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalcorrespondencePackage#getServiceOperationInstanceArrivalRateMeasurementCorrespondence_ServiceInstanceArrivalRateMeasurementCorrespondence()
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ServiceInstanceArrivalRateMeasurementCorrespondence#getServiceOperationInstanceCorrespondence
	 * @model opposite="serviceOperationInstanceCorrespondence" transient="false"
	 * @generated
	 */
	ServiceInstanceArrivalRateMeasurementCorrespondence getServiceInstanceArrivalRateMeasurementCorrespondence();

	/**
	 * Sets the value of the '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ServiceOperationInstanceArrivalRateMeasurementCorrespondence#getServiceInstanceArrivalRateMeasurementCorrespondence <em>Service Instance Arrival Rate Measurement Correspondence</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Instance Arrival Rate Measurement Correspondence</em>' container reference.
	 * @see #getServiceInstanceArrivalRateMeasurementCorrespondence()
	 * @generated
	 */
	void setServiceInstanceArrivalRateMeasurementCorrespondence(ServiceInstanceArrivalRateMeasurementCorrespondence value);

	/**
	 * Returns the value of the '<em><b>Cactos Service Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cactos Service Operation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cactos Service Operation</em>' reference.
	 * @see #setCactosServiceOperation(ServiceOperation)
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalcorrespondencePackage#getServiceOperationInstanceArrivalRateMeasurementCorrespondence_CactosServiceOperation()
	 * @model required="true"
	 * @generated
	 */
	ServiceOperation getCactosServiceOperation();

	/**
	 * Sets the value of the '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ServiceOperationInstanceArrivalRateMeasurementCorrespondence#getCactosServiceOperation <em>Cactos Service Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cactos Service Operation</em>' reference.
	 * @see #getCactosServiceOperation()
	 * @generated
	 */
	void setCactosServiceOperation(ServiceOperation value);

} // ServiceOperationInstanceArrivalRateMeasurementCorrespondence
