package models;

import java.util.ArrayList;
import java.util.List;

public class Table {
    private String name;       
    private Schema schema;     
    private List<Row> rows;    

    public Table(String name, Schema schema) {
        this.name = name;
        this.schema = schema;
        this.rows = new ArrayList<>();  
    }

 
    public String getName() { return name; }
    public Schema getSchema() { return schema; }
    public List<Row> getRows() { return rows; }

    public void addRow(Row row) {
        this.rows.add(row);
    }
    public Table clone(String newTableName) {
        Table clonedTable = new Table(newTableName, this.schema); 
        for (Row row : this.rows) {
            clonedTable.addRow(row.clone());      }
        return clonedTable;
    }
}