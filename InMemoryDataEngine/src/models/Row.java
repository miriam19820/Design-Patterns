package models;

import java.util.HashMap;
import java.util.Map;

public class Row {
    private Map<String, Object> values;
    
    public Row() {
        this.values = new HashMap<>();
    }

    public void addValue(String columnName, Object value) {
        values.put(columnName, value);
    }

    public Object getValue(String columnName) {
        return values.get(columnName);
    }

    public Map<String, Object> getValues() {
        return values;
    }
    public Row clone() {
        Row newRow = new Row();
        for (Map.Entry<String, Object> entry : this.values.entrySet()) {
            newRow.addValue(entry.getKey(), entry.getValue());
        }
        return newRow;
    }
}