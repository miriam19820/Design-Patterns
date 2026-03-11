package models;

import java.util.ArrayList;
import java.util.List;

public class Schema {
   
    private List<Column> columns;

    public Schema(List<Column> columns) {
        this.columns = new ArrayList<>(columns);
    }

    public List<Column> getColumns() {
        return columns;
    }
    
    public Column getColumnByName(String name) {
        for (Column col : columns) {
            if (col.getName().equals(name)) {
                return col;
            }
        }
        return null;
    }
}