package commands;

import observers.DatabaseObserver;
import java.util.ArrayList;
import java.util.List;
import models.Row;

public class CommandManager {
    private List<DatabaseObserver> observers = new ArrayList<>();

    public void registerObserver(DatabaseObserver observer) {
        observers.add(observer);
    }

    public List<Row> execute(DatabaseAction action) {
        List<Row> results = action.execute();         
        String actionName = action.getClass().getSimpleName();
        for (DatabaseObserver obs : observers) {
            obs.update(actionName, results);
        }
        
        return results;
    }
}