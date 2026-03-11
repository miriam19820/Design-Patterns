package commands;

import conditions.Condition;
import models.Row;
import models.Table;
import java.util.ArrayList;
import java.util.List;

public class QueryAction implements DatabaseAction {
    private Table table;
    private Condition condition;

    public QueryAction(Table table, Condition condition) {
        this.table = table;
        this.condition = condition;
    }

    @Override
    public List<Row> execute() {
        if (table == null || condition == null) {
            throw new IllegalArgumentException("טבלה או תנאי לא יכולים להיות ריקים");
        }

        List<Row> matchingRows = new ArrayList<>();
        
        for (Row row : table.getRows()) {
            if (condition.evaluate(row)) {
                matchingRows.add(row);
            }
        }

        return matchingRows;
    }
}