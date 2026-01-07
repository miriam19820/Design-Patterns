package MainApp;

import java.util.List;

public class MainAPP {

    public static void main(String[] args) {
        
        System.out.println("--- Start Database Check ---");
        
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        DatabaseConnection db2 = DatabaseConnection.getInstance();

        if (db1 == db2) {
            System.out.println("Singleton Works! db1 and db2 are the same instance.");
        }

        List<String> products = db1.getProducts();
        System.out.println("Products found in DB: " + products);
        System.out.println("----------------------------\n");


        System.out.println("--- Start Vehicle Factory Check ---");

        Vehicle v1 = VehicleFactory.getVehicle("car", "Red", "Mazda", "Gasoline");
        Vehicle v2 = VehicleFactory.getVehicle("bus", "Green", "Volvo", "Diesel");
        Vehicle v3 = VehicleFactory.getVehicle("motorcycle", "Black", "Honda", "Gasoline");

        if (v1 != null) System.out.println(v1);
        if (v2 != null) System.out.println(v2);
        if (v3 != null) System.out.println(v3);
    }
}