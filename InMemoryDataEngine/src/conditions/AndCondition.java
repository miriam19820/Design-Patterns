package conditions;

import models.Row;
import java.util.ArrayList;
import java.util.List;

public class AndCondition implements Condition {
    private List<Condition> conditions = new ArrayList<>();

    public void addCondition(Condition condition) {
        this.conditions.add(condition);
    }

    @Override
    public boolean evaluate(Row row) {
        for (Condition condition : conditions) {
            if (!condition.evaluate(row)) {
                return false;
            }
        }
        return true;
    }
}