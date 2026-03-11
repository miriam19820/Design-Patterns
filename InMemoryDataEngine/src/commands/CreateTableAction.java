package commands;

import models.DataBase;
import models.Row;
import models.Schema;
import models.Table;
import java.util.ArrayList;
import java.util.List;

public class CreateTableAction implements DatabaseAction {
    private DataBase db;
    private String tableName;
    private Schema schema;

    public CreateTableAction(DataBase db, String tableName, Schema schema) {
        this.db = db;
        this.tableName = tableName;
        this.schema = schema;
    }

    @Override
    public List<Row> execute() {
        if (db.getTable(tableName) != null) {
            throw new IllegalArgumentException("שגיאה: טבלה בשם " + tableName + " כבר קיימת!");
        }

        Table newTable = new Table(tableName, schema);
        db.addTable(newTable);

        return new ArrayList<>();
    }
}