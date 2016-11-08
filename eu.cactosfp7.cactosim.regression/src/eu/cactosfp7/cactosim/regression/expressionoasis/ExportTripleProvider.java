package eu.cactosfp7.cactosim.regression.expressionoasis;

import org.vedantatree.expressionoasis.expressions.Expression;

public interface ExportTripleProvider<T> {
	
	ExportTriple<T> getExportTriple(Expression expression, ExportVisitor<T> rExportVisitor);

}
