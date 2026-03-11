package observers;

import models.Row;
import java.util.List;

public interface DatabaseObserver {
    void update(String actionName, List<Row> results);
}