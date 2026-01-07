package pizzasystem;

public class Main {

    public static void main(String[] args) {
        
        PizzaBuilder builder = new PizzaBuilderImpl();
        
        PizzaDirector director = new PizzaDirector(builder);
        
        System.out.println("--- Ordering Recommended Pizza (Greek) ---");
        director.makeGreekPizza(); 
        
        Pizza p1 = builder.getPizza();
        System.out.println(p1);


    
        
        System.out.println("\n--- Ordering Custom Pizza ---");
        
        PizzaBuilder customBuilder = new PizzaBuilderImpl();
        
        customBuilder.setSize('X'); 
        customBuilder.setNumberOfTriangles(12);
        customBuilder.setOlives("Green Olives");
        customBuilder.setCorn("Sweet Corn");
        
        Pizza p2 = customBuilder.getPizza();
        System.out.println(p2);
    }
}