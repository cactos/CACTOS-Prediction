/**
 */
package eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.util;

import eu.cactosfp7.cactosim.correspondence.LoadCorrespondence;

import eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.*;

import eu.cactosfp7.identifier.Identifier;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalcorrespondencePackage
 * @generated
 */
public class PhysicalcorrespondenceAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PhysicalcorrespondencePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalcorrespondenceAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PhysicalcorrespondencePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicalcorrespondenceSwitch<Adapter> modelSwitch =
		new PhysicalcorrespondenceSwitch<Adapter>() {
			@Override
			public Adapter casePuMeasurementCorrespondence(PuMeasurementCorrespondence object) {
				return createPuMeasurementCorrespondenceAdapter();
			}
			@Override
			public Adapter caseMemoryMeasurementCorrespondence(MemoryMeasurementCorrespondence object) {
				return createMemoryMeasurementCorrespondenceAdapter();
			}
			@Override
			public Adapter caseStorageMeasurementCorrespondence(StorageMeasurementCorrespondence object) {
				return createStorageMeasurementCorrespondenceAdapter();
			}
			@Override
			public Adapter caseInterconnectMeasurementCorrespondence(InterconnectMeasurementCorrespondence object) {
				return createInterconnectMeasurementCorrespondenceAdapter();
			}
			@Override
			public Adapter casePhysicalCorrespondenceRepository(PhysicalCorrespondenceRepository object) {
				return createPhysicalCorrespondenceRepositoryAdapter();
			}
			@Override
			public Adapter caseSwitchCorrespondence(SwitchCorrespondence object) {
				return createSwitchCorrespondenceAdapter();
			}
			@Override
			public Adapter caseRackCorrespondence(RackCorrespondence object) {
				return createRackCorrespondenceAdapter();
			}
			@Override
			public Adapter caseAbstractNodeCorrespondence(AbstractNodeCorrespondence object) {
				return createAbstractNodeCorrespondenceAdapter();
			}
			@Override
			public Adapter caseMemorySpecificationCorrespondence(MemorySpecificationCorrespondence object) {
				return createMemorySpecificationCorrespondenceAdapter();
			}
			@Override
			public Adapter caseStorageSpecificationCorrespondence(StorageSpecificationCorrespondence object) {
				return createStorageSpecificationCorrespondenceAdapter();
			}
			@Override
			public Adapter caseNetworkInterconnectCorrespondence(NetworkInterconnectCorrespondence object) {
				return createNetworkInterconnectCorrespondenceAdapter();
			}
			@Override
			public Adapter caseProcessingUnitSpecificationCorrespondence(ProcessingUnitSpecificationCorrespondence object) {
				return createProcessingUnitSpecificationCorrespondenceAdapter();
			}
			@Override
			public Adapter casePowerConsumingEntityMeasurementCorrespondence(PowerConsumingEntityMeasurementCorrespondence object) {
				return createPowerConsumingEntityMeasurementCorrespondenceAdapter();
			}
			@Override
			public Adapter casePowerProvidingEntityCorrespondence(PowerProvidingEntityCorrespondence object) {
				return createPowerProvidingEntityCorrespondenceAdapter();
			}
			@Override
			public Adapter casePowerConsumingResourceCorrespondence(PowerConsumingResourceCorrespondence object) {
				return createPowerConsumingResourceCorrespondenceAdapter();
			}
			@Override
			public Adapter caseArchitectureTypeCorrespondence(ArchitectureTypeCorrespondence object) {
				return createArchitectureTypeCorrespondenceAdapter();
			}
			@Override
			public Adapter caseIdentifier(Identifier object) {
				return createIdentifierAdapter();
			}
			@Override
			public Adapter caseLoadCorrespondence(LoadCorrespondence object) {
				return createLoadCorrespondenceAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PuMeasurementCorrespondence <em>Pu Measurement Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PuMeasurementCorrespondence
	 * @generated
	 */
	public Adapter createPuMeasurementCorrespondenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.MemoryMeasurementCorrespondence <em>Memory Measurement Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.MemoryMeasurementCorrespondence
	 * @generated
	 */
	public Adapter createMemoryMeasurementCorrespondenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.StorageMeasurementCorrespondence <em>Storage Measurement Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.StorageMeasurementCorrespondence
	 * @generated
	 */
	public Adapter createStorageMeasurementCorrespondenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.InterconnectMeasurementCorrespondence <em>Interconnect Measurement Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.InterconnectMeasurementCorrespondence
	 * @generated
	 */
	public Adapter createInterconnectMeasurementCorrespondenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalCorrespondenceRepository <em>Physical Correspondence Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PhysicalCorrespondenceRepository
	 * @generated
	 */
	public Adapter createPhysicalCorrespondenceRepositoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.SwitchCorrespondence <em>Switch Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.SwitchCorrespondence
	 * @generated
	 */
	public Adapter createSwitchCorrespondenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.RackCorrespondence <em>Rack Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.RackCorrespondence
	 * @generated
	 */
	public Adapter createRackCorrespondenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.AbstractNodeCorrespondence <em>Abstract Node Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.AbstractNodeCorrespondence
	 * @generated
	 */
	public Adapter createAbstractNodeCorrespondenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.MemorySpecificationCorrespondence <em>Memory Specification Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.MemorySpecificationCorrespondence
	 * @generated
	 */
	public Adapter createMemorySpecificationCorrespondenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.StorageSpecificationCorrespondence <em>Storage Specification Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.StorageSpecificationCorrespondence
	 * @generated
	 */
	public Adapter createStorageSpecificationCorrespondenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.NetworkInterconnectCorrespondence <em>Network Interconnect Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.NetworkInterconnectCorrespondence
	 * @generated
	 */
	public Adapter createNetworkInterconnectCorrespondenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.ProcessingUnitSpecificationCorrespondence <em>Processing Unit Specification Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.ProcessingUnitSpecificationCorrespondence
	 * @generated
	 */
	public Adapter createProcessingUnitSpecificationCorrespondenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PowerConsumingEntityMeasurementCorrespondence <em>Power Consuming Entity Measurement Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PowerConsumingEntityMeasurementCorrespondence
	 * @generated
	 */
	public Adapter createPowerConsumingEntityMeasurementCorrespondenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PowerProvidingEntityCorrespondence <em>Power Providing Entity Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PowerProvidingEntityCorrespondence
	 * @generated
	 */
	public Adapter createPowerProvidingEntityCorrespondenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PowerConsumingResourceCorrespondence <em>Power Consuming Resource Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.PowerConsumingResourceCorrespondence
	 * @generated
	 */
	public Adapter createPowerConsumingResourceCorrespondenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.ArchitectureTypeCorrespondence <em>Architecture Type Correspondence</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.cactosfp7.cactosim.correspondence.physicalcorrespondence.ArchitectureTypeCorrespondence
	 * @generated
	 */
    public Adapter createArchitectureTypeCorrespondenceAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link eu.cactosfp7.identifier.Identifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.cactosfp7.identifier.Identifier
	 * @generated
	 */
	public Adapter createIdentifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.cactosfp7.cactosim.correspondence.LoadCorrespondence <em>Load Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.cactosfp7.cactosim.correspondence.LoadCorrespondence
	 * @generated
	 */
	public Adapter createLoadCorrespondenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //PhysicalcorrespondenceAdapterFactory
