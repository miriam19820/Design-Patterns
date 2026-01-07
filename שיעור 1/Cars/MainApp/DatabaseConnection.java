package MainApp;

import java.util.ArrayList;
import java.util.List;

public class DatabaseConnection {
  
    private static DatabaseConnection instance;
   
    private boolean isConnected;

    private DatabaseConnection() {
   
        System.out.println("Creating DB Connection (This should happen only once!)...");
        
     
        this.isConnected = true; 
        System.out.println("Connected to SQL Server successfully.");
    }

    
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    public List<String> getProducts() {
        List<String> products = new ArrayList<>();
        
        if (isConnected) {
            products.add("Car - Mazda 3");
            products.add("Bus - Volvo");
            products.add("Motorcycle - Yamaha");
        }
        return products;
    }
}