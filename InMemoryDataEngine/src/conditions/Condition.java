package conditions;

import models.Row;


public interface Condition {
    boolean evaluate(Row row);
}