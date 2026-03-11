package commands;

import models.DataBase;
import models.Row;
import models.Table;
import java.util.ArrayList;
import java.util.List;

public class CloneTableAction implements DatabaseAction {
    private DataBase db;
    private String sourceTableName;
    private String newTableName;

    public CloneTableAction(DataBase db, String sourceTableName, String newTableName) {
        this.db = db;
        this.sourceTableName = sourceTableName;
        this.newTableName = newTableName;
    }

    @Override
    public List<Row> execute() {
        Table sourceTable = db.getTable(sourceTableName);
        if (sourceTable == null) {
            throw new IllegalArgumentException("שגיאה: טבלת המקור לא קיימת!");
        }
        if (db.getTable(newTableName) != null) {
            throw new IllegalArgumentException("שגיאה: טבלה בשם " + newTableName + " כבר קיימת!");
        }
        Table clonedTable = sourceTable.clone(newTableName);
        db.addTable(clonedTable);

        return new ArrayList<>();
    }
}