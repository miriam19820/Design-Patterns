package pizzasystem;

public class PizzaDirector {

  
    private PizzaBuilder builder;

    public PizzaDirector(PizzaBuilder builder) {
        this.builder = builder;
    }

    public void changeBuilder(PizzaBuilder newBuilder){
        this.builder = newBuilder;
    }
    public void makeGreekPizza() {
        builder.setSize('L');            
        builder.setNumberOfTriangles(8); 
        builder.setOlives("Black Olives");
        builder.setBulgarian("Bulgarian Cheese");
        builder.setOnions("Purple Onion");
        builder.setTomatoes("Cherry Tomatoes");
    }
    public void makeMushroomPizza() {
        builder.setSize('M');            
        builder.setNumberOfTriangles(6); 
        builder.setMozzarella("Mozzarella Cheese");
        builder.setMushrooms("Fresh Mushrooms");
        builder.setCorn("Sweet Corn");
    }
    public void makeKidsPizza() {
        builder.setSize('S');
        builder.setNumberOfTriangles(4);
        builder.setMozzarella("Mozzarella Cheese");
    }
}