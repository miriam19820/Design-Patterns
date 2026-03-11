package commands;

import conditions.Condition;
import models.Row;
import models.Table;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DeleteAction implements DatabaseAction {
    private Table table;
    private Condition condition;

    public DeleteAction(Table table, Condition condition) {
        this.table = table;
        this.condition = condition;
    }

    @Override
    public List<Row> execute() {
        List<Row> deletedRows = new ArrayList<>();
        
        Iterator<Row> iterator = table.getRows().iterator();
        while (iterator.hasNext()) {
            Row row = iterator.next();
            if (condition.evaluate(row)) {
                deletedRows.add(row);
                iterator.remove();                 }
        }
        return deletedRows;  
    }
}