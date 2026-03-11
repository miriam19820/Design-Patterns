package commands;

import models.DataBase;
import models.Row;
import java.util.ArrayList;
import java.util.List;

public class DeleteTableAction implements DatabaseAction {
    private DataBase db;
    private String tableName;

    public DeleteTableAction(DataBase db, String tableName) {
        this.db = db;
        this.tableName = tableName;
    }

    @Override
    public List<Row> execute() {
        if (db.getTable(tableName) == null) {
            throw new IllegalArgumentException("שגיאה: לא ניתן למחוק טבלה שלא קיימת!");
        }

        db.removeTable(tableName);

        return new ArrayList<>();
    }
}