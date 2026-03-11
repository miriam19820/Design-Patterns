package conditions;

import models.Row;

public class EqualsCondition implements Condition {
    private String columnName;
    private Object expectedValue;

    public EqualsCondition(String columnName, Object expectedValue) {
        this.columnName = columnName;
        this.expectedValue = expectedValue;
    }

    @Override
    public boolean evaluate(Row row) {
        Object actualValue = row.getValue(columnName);
        if (actualValue == null) return false;
        return actualValue.equals(expectedValue);
    }
}