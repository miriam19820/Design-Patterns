package pizzasystem;

public class PizzaBuilderImpl implements PizzaBuilder {
	private Pizza pizza = new Pizza();

	@Override
	public void setSize(char size) {
		pizza.setSize(size);
		
	}

	@Override
	public void setNumberOfTriangles(int numberOfTriangles) {
	pizza.setNumberOfTriangles(numberOfTriangles);
		
	}

	@Override
	public void setOlives(String olives) {
	pizza.setOlives(olives);
		
	}

	@Override
	public void setMushrooms(String mushrooms) {
	pizza.setMushrooms(mushrooms);
	}

	@Override
	public void setCorn(String corn) {
	pizza.setCorn(corn);
		
	}

	@Override
	public void setOnions(String onions) {
	pizza.setOnions(onions);
		
	}

	@Override
	public void setTomatoes(String tomatoes) {
	pizza.setTomatoes(tomatoes);
		
	}

	@Override
	public void setBulgarian(String bulgaria) {
	pizza.setBulgarian(bulgaria);
		
	}

	@Override
	public void setMozzarella(String mozzarella) {
	pizza.setMozzarella(mozzarella);
	}

	@Override
	public Pizza getPizza() {
	
		return pizza;
	}
	
}
