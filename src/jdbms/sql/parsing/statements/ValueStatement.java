package jdbms.sql.parsing.statements;

import jdbms.sql.parsing.expressions.InsertIntoValueListExpression;

public class ValueStatement implements Statement {
	private static final String STATEMENT_IDENTIFIER = "VALUES";

	public ValueStatement() {
	}
	
	@Override
	public boolean interpret(String sqlExpression) {
		if (sqlExpression.startsWith(STATEMENT_IDENTIFIER)) {
			String restOfExpression = sqlExpression.replace(STATEMENT_IDENTIFIER, "").trim();
			return new InsertIntoValueListExpression().interpret(restOfExpression);
		}
		return false;
	}
}