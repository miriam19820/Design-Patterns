package commands;

import conditions.Condition;
import models.Row;
import models.Table;
import java.util.ArrayList;
import java.util.List;

public class UpdateAction implements DatabaseAction {
    private Table table;
    private Condition condition;
    private String columnName;
    private Object newValue;

    public UpdateAction(Table table, Condition condition, String columnName, Object newValue) {
        this.table = table;
        this.condition = condition;
        this.columnName = columnName;
        this.newValue = newValue;
    }

    @Override
    public List<Row> execute() {
        if (table.getSchema().getColumnByName(columnName) == null) {
            throw new IllegalArgumentException("עמודה לא קיימת: " + columnName);
        }

        List<Row> updatedRows = new ArrayList<>();
        for (Row row : table.getRows()) {
            if (condition.evaluate(row)) {
                row.addValue(columnName, newValue);   
                updatedRows.add(row);
                
            }
        }
        return updatedRows;
    }
}