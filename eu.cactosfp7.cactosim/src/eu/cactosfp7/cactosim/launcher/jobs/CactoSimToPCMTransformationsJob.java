package eu.cactosfp7.cactosim.launcher.jobs;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Level;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.m2m.internal.qvt.oml.expressions.DirectionKind;
import org.eclipse.m2m.internal.qvt.oml.expressions.ModelParameter;
import org.eclipse.m2m.internal.qvt.oml.expressions.ModelType;
import org.eclipse.m2m.internal.qvt.oml.expressions.OperationalTransformation;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionContext;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.palladiosimulator.analyzer.workflow.jobs.PreparePCMBlackboardPartitionJob;

import de.uka.ipd.sdq.workflow.jobs.IBlackboardInteractingJob;
import de.uka.ipd.sdq.workflow.jobs.IJob;
import de.uka.ipd.sdq.workflow.jobs.JobFailedException;
import de.uka.ipd.sdq.workflow.jobs.SequentialBlackboardInteractingJob;
import de.uka.ipd.sdq.workflow.jobs.UserCanceledException;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.ResourceSetPartition;
import de.uka.ipd.sdq.workflow.mdsd.emf.qvto.QVTOTransformationJobConfiguration;
import eu.cactosfp7.cactosim.launcher.CactoSimConstants;
import eu.cactosfp7.cactosim.launcher.CactoSimWorkflowConfiguration;
import eu.cactosfp7.cactosim.util.QVTOLogger;
import eu.cactosfp7.infrastructuremodels.logicaldc.core.LogicalDCModel;
import eu.cactosfp7.infrastructuremodels.logicaldc.core.impl.CorePackageImpl;
import eu.cactosfp7.infrastructuremodels.physicaldc.core.PhysicalDCModel;
import eu.cactosfp7.infrastructuremodels.physicaldc.power.binding.impl.BindingPackageImpl;
import eu.cactosfp7.infrastructuremodels.physicaldc.power.impl.PowerPackageImpl;
import eu.cactosfp7.infrastructuremodels.physicaldc.power.specification.impl.SpecificationPackageImpl;

public class CactoSimToPCMTransformationsJob extends SequentialBlackboardInteractingJob<MDSDBlackboard> implements IJob,
IBlackboardInteractingJob<MDSDBlackboard> {

    private static final String RESOURCE_COULD_NOT_BE_SAVED = "Resource could not be saved: ";
    private CactoSimWorkflowConfiguration configuration;
    private LogicalDCModel logicalDcModel;

    public CactoSimToPCMTransformationsJob(CactoSimWorkflowConfiguration configuration) {
        super();
        this.configuration = configuration;
    }
    
    @Override
    public void execute(IProgressMonitor monitor) throws JobFailedException, UserCanceledException {
        final String basePath = getBasePath();
        final String pdcFile = configuration.getCactosPDCFile();
        OperationalTransformation transformation = getTransformation();
        final ModelExtent[] modelExtents = getModelExtents(this.getBlackboard(), transformation);
        
        QVTOLogger qvtoLogger = new QVTOLogger();
        TransformationExecutor flattenExecutor = new TransformationExecutor(CactoSimConstants.FLATTEN_TRANSFORMATION_URI);
        ExecutionContextImpl flattenContext = new ExecutionContextImpl();
        flattenContext.setLog(qvtoLogger);
        
        // Execute flattening of network
        final String cactosPartitionId = LoadCactoSimModelsIntoBlackBoardJob.CACTOS_MODELS_PARTITION_ID;
        final PhysicalDCModel pdcModel = (PhysicalDCModel) this.myBlackboard.getPartition(cactosPartitionId).getElement(eu.cactosfp7.infrastructuremodels.physicaldc.core.impl.CorePackageImpl.eINSTANCE.getPhysicalDCModel()).get(0);
        ExecutionDiagnostic flattenDiag = flattenExecutor.execute(flattenContext, new BasicModelExtent(Arrays.asList(pdcModel)));
        if(flattenDiag.getSeverity() != Diagnostic.OK) {
            throw new IllegalStateException("The model transformation from CACTOS to SimuLizar could not be completed succesfully. Reason: " + flattenDiag.getMessage());
        }
        
        final URI traceFileURI = URI.createURI(basePath + "/traces");        
        TransformationExecutor executor = new TransformationExecutor(CactoSimConstants.TRANSFORMATION_URI);
        ExecutionContextImpl context = new ExecutionContextImpl();
        context.setLog(qvtoLogger);
        ExecutionDiagnostic diag = executor.execute(context, modelExtents);
        if(diag.getSeverity() != Diagnostic.OK) {
            throw new IllegalStateException("The model transformation from CACTOS to SimuLizar could not be completed succesfully. Reason: " + diag.getMessage() + "\n" +  diag.getStackTrace().toString());
        } else {
            final ResourceSet cactosResourceSet = this.getBlackboard().getPartition(LoadCactoSimModelsIntoBlackBoardJob.CACTOS_MODELS_PARTITION_ID).getResourceSet();
            Iterator<ModelExtent> modelExtentIt = Arrays.asList(modelExtents).iterator();
            Iterator<ModelParameter> modelParameterIt = transformation.getModelParameter().iterator();
            List<Resource> outResources = new ArrayList<Resource>();
            ModelExtent curExtent;
            ModelParameter curParameter;
            while(modelExtentIt.hasNext() && modelParameterIt.hasNext()) {
                curExtent = modelExtentIt.next();
                curParameter = modelParameterIt.next();
                if(curParameter.getKind() == DirectionKind.OUT && curExtent.getContents().size() > 0) {
                    String uriString = getBasePath() + "/" + curParameter.getName() + "." + ((ModelType) curParameter.getType()).getMetamodel().get(0).getName();
                    Resource curResource = cactosResourceSet.createResource(URI.createURI(uriString));
                    curResource.getContents().addAll(curExtent.getContents());
                    outResources.add(curResource);
                }
            }
            for(Resource curResource : outResources) {
                try {
                    curResource.save(Collections.EMPTY_MAP);
                } catch (IOException exception) {
                    logger.log(Level.ERROR, RESOURCE_COULD_NOT_BE_SAVED + exception.getMessage());
                    throw new JobFailedException(RESOURCE_COULD_NOT_BE_SAVED, exception);
                }
            }
        }
    }

    private String getBasePath() {
        String basePath = "platform:/resource/" + this.configuration.getStoragePluginID() + "/cactosmodels";
        return basePath;
    }
    
    private OperationalTransformation getTransformation() {
        final ResourceSet transformationResourceSet = new ResourceSetImpl();
        final Resource transformationResource = transformationResourceSet.getResource(CactoSimConstants.TRANSFORMATION_URI, true);
        return (OperationalTransformation) transformationResource.getContents().get(0);
    }
    
    private ModelExtent[] getModelExtents(final MDSDBlackboard blackboard, final OperationalTransformation transformation) {
        final String cactosPartitionId = LoadCactoSimModelsIntoBlackBoardJob.CACTOS_MODELS_PARTITION_ID;
        final ResourceSetPartition partition = blackboard.getPartition(cactosPartitionId);
        partition.resolveAllProxies();
        EList<Resource> resources = partition.getResourceSet().getResources();
        this.logicalDcModel = (LogicalDCModel) partition.getElement(CorePackageImpl.eINSTANCE.getLogicalDCModel()).get(0);
        BasicModelExtent logicalDCModelExtent = new BasicModelExtent();
        logicalDCModelExtent.add(this.logicalDcModel);
        partition.loadModel(PreparePCMBlackboardPartitionJob.PCM_PALLADIO_RESOURCE_TYPE_URI);
        
        EList<ModelParameter> modelParameters = transformation.getModelParameter();
        
        final List<ModelExtent> modelExtents = new ArrayList<ModelExtent>();
        
        final List<EObject> models = collectModelsFromResourceSet(partition.getResourceSet());
        
        for(ModelParameter modelParameter : modelParameters) {
            ModelExtent curExtent = null;
            if(!(modelParameter.getKind() == DirectionKind.OUT)) {
                EPackage curPackage = ((ModelType) modelParameter.getEType()).getMetamodel().get(0);
                EObject curRoot = getFromAvailableModelByEPackage(models, curPackage);
                if (curRoot != null) {
                    curExtent = new BasicModelExtent(Arrays.asList(curRoot));
                /*
                 * We treat the power models as optional input models.
                 */
                } else if (PowerPackageImpl.eINSTANCE.getNsURI().equals(curPackage.getNsURI())
                        || BindingPackageImpl.eINSTANCE.getNsURI().equals(curPackage.getNsURI())
                        || SpecificationPackageImpl.eINSTANCE.getNsURI().equals(curPackage.getNsURI())) {
                    curExtent = new BasicModelExtent();
                } else {
                    throw new IllegalArgumentException("The required input model for the CACTOS to PCM transformation could not be resolved: "
                            + modelParameter.getName() + ", " + "type: " + modelParameter.getType().toString());
                }
            } else {
                curExtent = new BasicModelExtent();
            }
            modelExtents.add(curExtent);
        }
        
        return modelExtents.toArray(new ModelExtent[0]);
    }
    
    private List<EObject> collectModelsFromResourceSet(ResourceSet resourceSet) {
        List<EObject> models = new ArrayList<EObject>();
        for(Resource resource : resourceSet.getResources()) {
            models.add(resource.getContents().get(0));
        }
        return models;
    }

    private EObject getFromAvailableModelByEPackage(Collection<EObject> models, final EPackage ePackage) {
        assert ePackage != null;

        for (final EObject modelEObject : models) {
            // use namespace URIs as criterion for equality
            if (((EPackage) modelEObject.eClass().eContainer()).getNsURI().equals(ePackage.getNsURI())) {
                return modelEObject;
            }
        }
        return null;
    }

    @Override
    public String getName() {
        return "Transform CACTOS to SimuLizar and PCM Models";
    }

}
