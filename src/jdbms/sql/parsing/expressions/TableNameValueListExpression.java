package jdbms.sql.parsing.expressions;

import jdbms.sql.parsing.statements.ValueStatement;

public class TableNameValueListExpression extends TableNameExpression {

	public TableNameValueListExpression() {
		super(new ValueStatement());
	}

	@Override
	public boolean interpret(String sqlExpression) {
		String tableName = sqlExpression.substring(0, sqlExpression.indexOf(" "));
		String restOfExpression = sqlExpression.substring(sqlExpression.indexOf(" ") + 1);
		if (tableName.matches("^[a-zA-Z_][a-zA-Z0-9_\\$]*$")) {
			return super.interpret(restOfExpression);
		}
		return false;
	}
}