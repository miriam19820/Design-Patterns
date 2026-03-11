package commands;

import models.Row;
import java.util.List;

public interface DatabaseAction {
    List<Row> execute();
}