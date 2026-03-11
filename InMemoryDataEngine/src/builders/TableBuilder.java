package builders;

import models.Column;
import models.DataType;
import models.Schema;
import models.Table;
import java.util.ArrayList;
import java.util.List;

public class TableBuilder {
    private String name;
    private List<Column> columns = new ArrayList<>();

    public TableBuilder withName(String name) {
        this.name = name;
        return this;  
    }

    public TableBuilder addColumn(String colName, DataType type) {
        this.columns.add(new Column(colName, type));
        return this;   
    }

    public Table build() {
        Schema schema = new Schema(columns);
        return new Table(name, schema);
    }
}