package jdbms.sql.parsing.util;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public abstract class Constants {
	public static final List<String> RESERVED_KEYWORDS =
		    Collections.unmodifiableList(Arrays.asList("SELECT",
		    		"TABLE", "DELETE", "UPDATE", "INSERT", "INTO", "VALUES",
		    		"SET", "WHERE", "FROM", "CREATE", "DROP", "DATABASE",
		    		"INTEGER", "VARCHAR", "TEXT", "INT", "USE"));
	public static final String COLUMN_REGEX = "^[a-zA-Z_][a-zA-Z0-9_\\$]*$";
	public static final String STRING_REGEX = "^'.*?'$";
	public static final String DOUBLE_STRING_REGEX = "^\".*?\"$";
	public static final String INT_REGEX = "^\\d+$";
}

