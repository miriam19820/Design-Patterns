package main;

import builders.TableBuilder;
import conditions.Condition;
import conditions.EqualsCondition;
import facade.DBFacade;
import models.DataType;
import models.Row;
import models.Table;
import observers.ActionLogger;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        DBFacade db = new DBFacade("ProductionDB");
        db.addObserver(new ActionLogger()); 

        System.out.println("\n--- 1. יצירת טבלה ---");
        Table userTableTemplate = new TableBuilder()
                .withName("Users")
                .addColumn("id", DataType.INT)
                .addColumn("name", DataType.STRING)
                .build();
        
        db.createTable(userTableTemplate.getName(), userTableTemplate.getSchema());

        System.out.println("\n--- 2. הוספת נתונים ---");
        Row r1 = new Row(); r1.addValue("id", 1); r1.addValue("name", "Sara");
        Row r2 = new Row(); r2.addValue("id", 2); r2.addValue("name", "Miri");
        Row r3 = new Row(); r3.addValue("id", 3); r3.addValue("name", "Rivka");
        
        db.insert("Users", r1);
        db.insert("Users", r2);
        db.insert("Users", r3);

        System.out.println("\n--- 3. שולף נתונים (Query) ---");
        Condition isMiriam = new EqualsCondition("name", "Miriam");
        List<Row> queryResult = db.query("Users", isMiriam);
        System.out.println("נמצאו " + queryResult.size() + " שורות שמתאימות לתנאי (השם הוא Miriam).");

        System.out.println("\n--- 4. מעדכן נתונים (Update) ---");
        Condition isBrachi = new EqualsCondition("name", " Brachi");
        db.update("Users",  isBrachi, "name", "Miri_Updated");

        System.out.println("\n--- 5. מוחק נתונים (Delete) ---");
        Condition isGlick = new EqualsCondition("name", "Glick");
        db.delete("Users", isGlick);

        System.out.println("\n--- 6. משכפל טבלה (Clone) ---");
        db.cloneTable("Users", "Users_Backup");
        System.out.println("טבלת Users שוכפלה בהצלחה לטבלת Users_Backup.");
      
    }
}