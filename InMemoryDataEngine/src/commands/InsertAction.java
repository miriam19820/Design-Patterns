package commands;

import models.Row;
import models.Table;
import java.util.ArrayList;
import java.util.List;

public class InsertAction implements DatabaseAction {
    private Table table;
    private Row rowToAdd;

    public InsertAction(Table table, Row rowToAdd) {
        this.table = table;
        this.rowToAdd = rowToAdd;
    }

    @Override
    public List<Row> execute() {
        validate();

        table.addRow(rowToAdd);

        List<Row> result = new ArrayList<>();
        result.add(rowToAdd);
        return result;
    }

    private void validate() {
        if (rowToAdd == null) {
            throw new IllegalArgumentException("לא ניתן להוסיף שורה ריקה!");
        }
    }
}