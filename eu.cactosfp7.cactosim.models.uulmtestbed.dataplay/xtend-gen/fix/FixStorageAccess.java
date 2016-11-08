package fix;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import eu.cactosfp7.infrastructuremodels.logicaldc.application.ApplicationInstance;
import eu.cactosfp7.infrastructuremodels.logicaldc.application.ComposedVM;
import eu.cactosfp7.infrastructuremodels.logicaldc.application.WhiteBoxApplicationInstance;
import eu.cactosfp7.infrastructuremodels.logicaldc.application.util.NonIdCopier;
import eu.cactosfp7.infrastructuremodels.logicaldc.core.Hypervisor;
import eu.cactosfp7.infrastructuremodels.logicaldc.core.LogicalDCModel;
import eu.cactosfp7.infrastructuremodels.logicaldc.core.VMImageInstance;
import eu.cactosfp7.infrastructuremodels.logicaldc.core.VirtualDisk;
import eu.cactosfp7.infrastructuremodels.logicaldc.core.VirtualMachine;
import eu.cactosfp7.infrastructuremodels.logicaldc.core.impl.CorePackageImpl;
import eu.cactosfp7.infrastructuremodels.logicaldc.hypervisor.util.HypervisorResourceFactoryImpl;
import eu.cactosfp7.infrastructuremodels.physicaldc.architecturetype.util.ArchitecturetypeResourceFactoryImpl;
import eu.cactosfp7.infrastructuremodels.physicaldc.core.StorageSpecification;
import eu.cactosfp7.infrastructuremodels.physicaldc.core.util.CoreResourceFactoryImpl;
import eu.cactosfp7.infrastructuremodels.physicaldc.power.binding.util.BindingResourceFactoryImpl;
import eu.cactosfp7.infrastructuremodels.physicaldc.power.specification.util.SpecificationResourceFactoryImpl;
import java.util.Map;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function0;

@SuppressWarnings("all")
public class FixStorageAccess {
  public static void main(final String[] args) {
    try {
      final ResourceSetImpl rs = new ResourceSetImpl();
      Resource.Factory.Registry _resourceFactoryRegistry = rs.getResourceFactoryRegistry();
      final Map<String, Object> m = _resourceFactoryRegistry.getExtensionToFactoryMap();
      ArchitecturetypeResourceFactoryImpl _architecturetypeResourceFactoryImpl = new ArchitecturetypeResourceFactoryImpl();
      m.put("architecturetype", _architecturetypeResourceFactoryImpl);
      HypervisorResourceFactoryImpl _hypervisorResourceFactoryImpl = new HypervisorResourceFactoryImpl();
      m.put("hypervisor", _hypervisorResourceFactoryImpl);
      BindingResourceFactoryImpl _bindingResourceFactoryImpl = new BindingResourceFactoryImpl();
      m.put("pdcbinding", _bindingResourceFactoryImpl);
      SpecificationResourceFactoryImpl _specificationResourceFactoryImpl = new SpecificationResourceFactoryImpl();
      m.put("pdcspec", _specificationResourceFactoryImpl);
      CoreResourceFactoryImpl _coreResourceFactoryImpl = new CoreResourceFactoryImpl();
      m.put("physical", _coreResourceFactoryImpl);
      eu.cactosfp7.infrastructuremodels.logicaldc.core.util.CoreResourceFactoryImpl _coreResourceFactoryImpl_1 = new eu.cactosfp7.infrastructuremodels.logicaldc.core.util.CoreResourceFactoryImpl();
      m.put("logical", _coreResourceFactoryImpl_1);
      EPackage.Registry _packageRegistry = rs.getPackageRegistry();
      _packageRegistry.put(CorePackageImpl.eNS_URI, CorePackageImpl.eINSTANCE);
      URI _createURI = URI.createURI("uulm-testbed.logical");
      Resource res = rs.getResource(_createURI, true);
      EList<EObject> _contents = res.getContents();
      Iterable<LogicalDCModel> _filter = Iterables.<LogicalDCModel>filter(_contents, LogicalDCModel.class);
      final Consumer<LogicalDCModel> _function = (LogicalDCModel dcModel) -> {
        EList<ApplicationInstance> _applicationInstances = dcModel.getApplicationInstances();
        Iterable<WhiteBoxApplicationInstance> _filter_1 = Iterables.<WhiteBoxApplicationInstance>filter(_applicationInstances, WhiteBoxApplicationInstance.class);
        final Consumer<WhiteBoxApplicationInstance> _function_1 = (WhiteBoxApplicationInstance appInst) -> {
          EList<ComposedVM> _composedVMs = appInst.getComposedVMs();
          final Consumer<ComposedVM> _function_2 = (ComposedVM cvm) -> {
            VirtualMachine _virtualMachine = cvm.getVirtualMachine();
            VMImageInstance _vMImageInstance = _virtualMachine.getVMImageInstance();
            VirtualDisk _rootDisk = _vMImageInstance.getRootDisk();
            StorageSpecification _storageLocation = _rootDisk.getStorageLocation();
            boolean _equals = Objects.equal(_storageLocation, null);
            if (_equals) {
              VirtualMachine _virtualMachine_1 = cvm.getVirtualMachine();
              VMImageInstance _vMImageInstance_1 = _virtualMachine_1.getVMImageInstance();
              VirtualDisk _rootDisk_1 = _vMImageInstance_1.getRootDisk();
              final VirtualDisk vmCopy = NonIdCopier.<VirtualDisk>nonIdCopy(_rootDisk_1);
              VirtualMachine _virtualMachine_2 = cvm.getVirtualMachine();
              Hypervisor _hypervisor = _virtualMachine_2.getHypervisor();
              VirtualDisk _rootVolume = _hypervisor.getRootVolume();
              StorageSpecification _storageLocation_1 = _rootVolume.getStorageLocation();
              vmCopy.setStorageLocation(_storageLocation_1);
              VirtualMachine _virtualMachine_3 = cvm.getVirtualMachine();
              VMImageInstance _vMImageInstance_2 = _virtualMachine_3.getVMImageInstance();
              _vMImageInstance_2.setRootDisk(vmCopy);
              EList<VirtualDisk> _volumesAndImages = dcModel.getVolumesAndImages();
              _volumesAndImages.add(vmCopy);
            }
          };
          _composedVMs.forEach(_function_2);
        };
        _filter_1.forEach(_function_1);
      };
      _filter.forEach(_function);
      res.save(new Function0<Map<?, ?>>() {
        public Map<?, ?> apply() {
          return null;
        }
      }.apply());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
