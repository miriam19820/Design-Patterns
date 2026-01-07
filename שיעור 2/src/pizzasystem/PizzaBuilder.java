package pizzasystem;

public interface PizzaBuilder {
void setSize(char size);
void setNumberOfTriangles(int  numberOfTriangles);
void setOlives(String olives );
void setMushrooms(String mushrooms );
void setCorn(String corn);
void setOnions(String onions);
void setTomatoes(String tomatoes );
void setBulgarian(String bulgaria);
void setMozzarella(String mozzarella);
Pizza getPizza();
}














