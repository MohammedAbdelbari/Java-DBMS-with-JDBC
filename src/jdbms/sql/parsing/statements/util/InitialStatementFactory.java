package jdbms.sql.parsing.statements.util;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.HashMap;

import jdbms.sql.parsing.statements.InitialStatement;

public class InitialStatementFactory {
	private static InitialStatementFactory factory = new InitialStatementFactory();

	private HashMap<String, Class<? extends InitialStatement>> registeredStatements = null;

	private InitialStatementFactory() {
		registeredStatements = new HashMap<>();
	}

	public static InitialStatementFactory getInstance() {
		return factory;
	}
	public void registerStatement(String statementID,
			Class<? extends InitialStatement> statementClass) {
		registeredStatements.put(statementID, statementClass);
	}
	public InitialStatement createStatement(String statementID) {
		Class<? extends InitialStatement> statementClass =
				registeredStatements.get(statementID);
		try {
			Constructor<? extends InitialStatement> statementConstructor =
					statementClass.getConstructor();
			InitialStatement statement = statementConstructor.newInstance();
			return statement;
		} catch (NoSuchMethodException | SecurityException
				| InstantiationException
				| IllegalAccessException
				| IllegalArgumentException
				| InvocationTargetException e) {
			return null;
		}
	}
	public Collection<String> getRegisteredStatements() {
		return registeredStatements.keySet();
	}
}