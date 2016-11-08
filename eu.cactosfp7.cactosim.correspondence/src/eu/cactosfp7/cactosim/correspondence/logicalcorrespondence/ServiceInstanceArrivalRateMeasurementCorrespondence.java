/**
 */
package eu.cactosfp7.cactosim.correspondence.logicalcorrespondence;

import eu.cactosfp7.identifier.Identifier;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Instance Arrival Rate Measurement Correspondence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ServiceInstanceArrivalRateMeasurementCorrespondence#getArrivalRateMeasurementCorrespondence <em>Arrival Rate Measurement Correspondence</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ServiceInstanceArrivalRateMeasurementCorrespondence#getCactosServiceCorrespondence <em>Cactos Service Correspondence</em>}</li>
 *   <li>{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ServiceInstanceArrivalRateMeasurementCorrespondence#getServiceOperationInstanceCorrespondence <em>Service Operation Instance Correspondence</em>}</li>
 * </ul>
 *
 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalcorrespondencePackage#getServiceInstanceArrivalRateMeasurementCorrespondence()
 * @model
 * @generated
 */
public interface ServiceInstanceArrivalRateMeasurementCorrespondence extends Identifier {
	/**
	 * Returns the value of the '<em><b>Arrival Rate Measurement Correspondence</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ArrivalRateMeasurementCorrespondence#getServiceInstanceMeasurementCorrespondences <em>Service Instance Measurement Correspondences</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arrival Rate Measurement Correspondence</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arrival Rate Measurement Correspondence</em>' container reference.
	 * @see #setArrivalRateMeasurementCorrespondence(ArrivalRateMeasurementCorrespondence)
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalcorrespondencePackage#getServiceInstanceArrivalRateMeasurementCorrespondence_ArrivalRateMeasurementCorrespondence()
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ArrivalRateMeasurementCorrespondence#getServiceInstanceMeasurementCorrespondences
	 * @model opposite="serviceInstanceMeasurementCorrespondences" transient="false"
	 * @generated
	 */
	ArrivalRateMeasurementCorrespondence getArrivalRateMeasurementCorrespondence();

	/**
	 * Sets the value of the '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ServiceInstanceArrivalRateMeasurementCorrespondence#getArrivalRateMeasurementCorrespondence <em>Arrival Rate Measurement Correspondence</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arrival Rate Measurement Correspondence</em>' container reference.
	 * @see #getArrivalRateMeasurementCorrespondence()
	 * @generated
	 */
	void setArrivalRateMeasurementCorrespondence(ArrivalRateMeasurementCorrespondence value);

	/**
	 * Returns the value of the '<em><b>Cactos Service Correspondence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cactos Service Correspondence</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cactos Service Correspondence</em>' reference.
	 * @see #setCactosServiceCorrespondence(ProvidedServiceCorrespondence)
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalcorrespondencePackage#getServiceInstanceArrivalRateMeasurementCorrespondence_CactosServiceCorrespondence()
	 * @model required="true"
	 * @generated
	 */
	ProvidedServiceCorrespondence getCactosServiceCorrespondence();

	/**
	 * Sets the value of the '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ServiceInstanceArrivalRateMeasurementCorrespondence#getCactosServiceCorrespondence <em>Cactos Service Correspondence</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cactos Service Correspondence</em>' reference.
	 * @see #getCactosServiceCorrespondence()
	 * @generated
	 */
	void setCactosServiceCorrespondence(ProvidedServiceCorrespondence value);

	/**
	 * Returns the value of the '<em><b>Service Operation Instance Correspondence</b></em>' containment reference list.
	 * The list contents are of type {@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ServiceOperationInstanceArrivalRateMeasurementCorrespondence}.
	 * It is bidirectional and its opposite is '{@link eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ServiceOperationInstanceArrivalRateMeasurementCorrespondence#getServiceInstanceArrivalRateMeasurementCorrespondence <em>Service Instance Arrival Rate Measurement Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Operation Instance Correspondence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Operation Instance Correspondence</em>' containment reference list.
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.LogicalcorrespondencePackage#getServiceInstanceArrivalRateMeasurementCorrespondence_ServiceOperationInstanceCorrespondence()
	 * @see eu.cactosfp7.cactosim.correspondence.logicalcorrespondence.ServiceOperationInstanceArrivalRateMeasurementCorrespondence#getServiceInstanceArrivalRateMeasurementCorrespondence
	 * @model opposite="serviceInstanceArrivalRateMeasurementCorrespondence" containment="true"
	 * @generated
	 */
	EList<ServiceOperationInstanceArrivalRateMeasurementCorrespondence> getServiceOperationInstanceCorrespondence();

} // ServiceInstanceArrivalRateMeasurementCorrespondence
