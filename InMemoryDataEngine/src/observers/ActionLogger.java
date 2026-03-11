package observers;

import models.Row;
import java.util.List;

public class ActionLogger implements DatabaseObserver {
    @Override
    public void update(String actionName, List<Row> results) {
        System.out.println("[AUDIT LOG]: הפעולה " + actionName + " הושלמה.");
        int affected = (results != null) ? results.size() : 0;
        System.out.println("      סטטוס: הצלחה | שורות שהושפעו: " + affected);
    }
}