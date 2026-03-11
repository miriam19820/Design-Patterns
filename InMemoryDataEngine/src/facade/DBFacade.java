package facade;

import commands.*;
import conditions.Condition;
import models.*;
import observers.DatabaseObserver;

import java.util.List;

public class DBFacade {
    private DataBase db;
    private CommandManager manager;

    public DBFacade(String dbName) {
        this.db = new DataBase(dbName);
        this.manager = new CommandManager();
    }

    public void addObserver(DatabaseObserver observer) {
        manager.registerObserver(observer);
    }

        public void createTable(String tableName, Schema schema) {
        manager.execute(new CreateTableAction(db, tableName, schema));
    }

    public void dropTable(String tableName) {
        manager.execute(new DeleteTableAction(db, tableName));
    }

    public List<Row> insert(String tableName, Row row) {
        Table table = getTableValid(tableName);
        return manager.execute(new InsertAction(table, row));
    }

    public List<Row> update(String tableName, Condition condition, String columnName, Object newValue) {
        Table table = getTableValid(tableName);
        return manager.execute(new UpdateAction(table, condition, columnName, newValue));
    }

    public List<Row> query(String tableName, Condition condition) {
        Table table = getTableValid(tableName);
        return manager.execute(new QueryAction(table, condition));
    }

    public List<Row> delete(String tableName, Condition condition) {
        Table table = getTableValid(tableName);
        return manager.execute(new DeleteAction(table, condition));
    }
    public void cloneTable(String sourceTableName, String newTableName) {
        manager.execute(new CloneTableAction(db, sourceTableName, newTableName));
    }

    private Table getTableValid(String tableName) {
        Table table = db.getTable(tableName);
        if (table == null) {
            throw new IllegalArgumentException("הטבלה " + tableName + " לא קיימת!");
        }
        return table;
    }
}