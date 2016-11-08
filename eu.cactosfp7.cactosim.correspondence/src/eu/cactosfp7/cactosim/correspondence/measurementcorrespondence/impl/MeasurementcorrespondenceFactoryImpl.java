/**
 */
package eu.cactosfp7.cactosim.correspondence.measurementcorrespondence.impl;

import eu.cactosfp7.cactosim.correspondence.measurementcorrespondence.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MeasurementcorrespondenceFactoryImpl extends EFactoryImpl implements MeasurementcorrespondenceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MeasurementcorrespondenceFactory init() {
		try {
			MeasurementcorrespondenceFactory theMeasurementcorrespondenceFactory = (MeasurementcorrespondenceFactory)EPackage.Registry.INSTANCE.getEFactory(MeasurementcorrespondencePackage.eNS_URI);
			if (theMeasurementcorrespondenceFactory != null) {
				return theMeasurementcorrespondenceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MeasurementcorrespondenceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementcorrespondenceFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MeasurementcorrespondencePackage.MONITORED_CACTOS_ENTITY_TO_MONITOR_CORRESPONDENCE: return (EObject)createMonitoredCactosEntityToMonitorCorrespondence();
			case MeasurementcorrespondencePackage.MONITOR_CORRESPONDENCE_REPOSITORY: return (EObject)createMonitorCorrespondenceRepository();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonitoredCactosEntityToMonitorCorrespondence createMonitoredCactosEntityToMonitorCorrespondence() {
		MonitoredCactosEntityToMonitorCorrespondenceImpl monitoredCactosEntityToMonitorCorrespondence = new MonitoredCactosEntityToMonitorCorrespondenceImpl();
		return monitoredCactosEntityToMonitorCorrespondence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonitorCorrespondenceRepository createMonitorCorrespondenceRepository() {
		MonitorCorrespondenceRepositoryImpl monitorCorrespondenceRepository = new MonitorCorrespondenceRepositoryImpl();
		return monitorCorrespondenceRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementcorrespondencePackage getMeasurementcorrespondencePackage() {
		return (MeasurementcorrespondencePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MeasurementcorrespondencePackage getPackage() {
		return MeasurementcorrespondencePackage.eINSTANCE;
	}

} //MeasurementcorrespondenceFactoryImpl
