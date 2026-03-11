package models;

import java.util.HashMap;
import java.util.Map;

public class DataBase {
    private String name;                     
    private Map<String, Table> tables;       

    public DataBase(String name) {
        this.name = name;
        this.tables = new HashMap<>();
    }

  
    public void addTable(Table table) {
        tables.put(table.getName(), table);
    }

   
    public void removeTable(String tableName) {
        tables.remove(tableName);
    }

   
    public Table getTable(String tableName) {
        return tables.get(tableName);
    }

    public String getName() { return name; }
}