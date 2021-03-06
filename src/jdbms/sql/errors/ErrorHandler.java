package jdbms.sql.errors;

public abstract class ErrorHandler {
    private static final String NULL_PLACEHOLDER = "";

    public static void printColumnNotFoundError(final String columnName) {
        System.err.println("Error: Column \""
                + handleNull(columnName) + "\" Not Found");
    }

    public static void printRepeatedColumnError() {
        System.err.println("Error: Column List Has Repeated Columns");
    }

    public static void printColumnAlreadyExistsError(final String columnName) {
        System.err.println("Error: Column \""
                + handleNull(columnName) + "\" Already Exists");
    }

    public static void printColumnListTooLargeError() {
        System.err.println("Error: Column List is Too Large");
    }

    public static void printDatabaseAlreadyExistsError(final String
                                                               databaseName) {
        System.err.println("Error: Database \""
                + handleNull(databaseName) + "\" Already Exists");
    }

    public static void printDatabaseNotFoundError(final String databaseName) {
        System.err.println("Error: Database \""
                + handleNull(databaseName) + "\" Not Found");
    }

    public static void printDataTypeNotSupportedError(final String dataType) {
        System.err.println("Error: Data Type \""
                + dataType + "\" Not Supported");
    }

    public static void printTableAlreadyExistsError(final String tableName) {
        System.err.println("Error: Table \"" +
                handleNull(tableName) + "\" Already Exists");
    }

    public static void printTableNotFoundError(final String tableName) {
        System.err.println("Error: Table \"" +
                handleNull(tableName) + "\" Not Found");
    }

    public static void printTypeMismatchError() {
        System.err.println("Error: Type Mismatch");
    }

    public static void printValueListTooLargeError() {
        System.err.println("Error: Value List is Too Large");
    }

    public static void printValueListTooSmallError() {
        System.err.println("Error: Value List is Too Small");
    }

    public static void printReservedKeywordError(final String name) {
        System.err.println("Error: Name \"" +
                handleNull(name) + "\" is A Reserved Keyword");
    }

    public static void printInternalError() {
        System.err.println("Internal Error");
    }

    public static void printFailedToDeleteDatabase(final String databaseName) {
        System.err.println("Error: Couldn't Delete Database \""
                + handleNull(databaseName) + "\"");
    }

    public static void printFailedToDeleteTable(final String tableName) {
        System.err.println("Error: Couldn't Delete Table \""
                + handleNull(tableName) + "\"");
    }

    public static void printInvalidDateError(final String date) {
        System.err.println("Error: Date \"" + date + "\" Is Invalid");
    }

    public static void printSyntaxErrorNear(final String name) {
        System.err.println("Syntax Error Near \"" + name + "\"");
    }

    public static void printSyntaxError() {
        System.err.println("Syntax Error");
    }

    private static String handleNull(final String string) {
        if (string == null) {
            return NULL_PLACEHOLDER;
        }
        return string;
    }
}
