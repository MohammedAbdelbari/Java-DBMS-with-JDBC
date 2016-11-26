package jdbms.sql.parsing.expressions.math;

import jdbms.sql.datatypes.IntSQLType;
import jdbms.sql.datatypes.VarcharSQLType;
import jdbms.sql.parsing.expressions.math.util.BooleanExpressionFactory;
import jdbms.sql.parsing.properties.InputParametersContainer;

public class NotEqualsExpression extends BooleanExpression {
	private static final String SYMBOL = "!=";
	static {
		BooleanExpressionFactory.getInstance().
		registerBoolExpression(SYMBOL, NotEqualsExpression.class);
	}
	public NotEqualsExpression(String symbol, InputParametersContainer parameters) {
		super(symbol, parameters);
	}
	@Override
	public boolean evaluate(VarcharSQLType left, VarcharSQLType right) {
		return left.compareTo(right) != 0;
	}
	@Override
	public boolean evaluate(IntSQLType left, IntSQLType right) {
		return left.compareTo(right) != 0;
	}
	@Override
	public boolean evaluateConstantExpression() {
		return getLeftOperand().compareTo(getRightOperand()) != 0;
	}

}