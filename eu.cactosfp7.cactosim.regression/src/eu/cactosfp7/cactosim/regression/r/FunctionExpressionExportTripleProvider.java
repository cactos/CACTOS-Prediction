package eu.cactosfp7.cactosim.regression.r;

import java.util.Map;

import org.vedantatree.expressionoasis.expressions.Expression;
import org.vedantatree.expressionoasis.expressions.property.FunctionExpression;

import eu.cactosfp7.cactosim.regression.expressionoasis.ExportTriple;
import eu.cactosfp7.cactosim.regression.expressionoasis.ExportTripleProvider;
import eu.cactosfp7.cactosim.regression.expressionoasis.ExportVisitor;

public class FunctionExpressionExportTripleProvider<T> implements
		ExportTripleProvider<T> {
	
	private Map<String, ExportTripleProvider<T>> functionExpressionProviders;

	public FunctionExpressionExportTripleProvider(Map<String,ExportTripleProvider<T>> functionExpressionProviders) {
		this.functionExpressionProviders = functionExpressionProviders;
		
	}

	@Override
	public ExportTriple<T> getExportTriple(Expression expression, ExportVisitor<T> visitor) {
		if (!(expression instanceof FunctionExpression))
			throw new IllegalArgumentException("FunctionExpressionExportTripleProvider is only compatible with FunctionExpressions"
					+ "and not with: " + expression);
		
		return functionExpressionProviders.get(((FunctionExpression)expression).getFunctionName())
				.getExportTriple(expression, visitor);
	}

}
