package pizzasystem;

public class Pizza {
	 private char size;
	 private int numberOfTriangles;
	 private String olives;
	 private String mushrooms;
	 private String corn;
	 private String onions;
	 private String tomatoes;
	 private String bulgarian;
	 private String mozzarella;
	 
	@Override
	public String toString() {
		return "Pizza [size=" + size + ", numberOfTriangles=" + numberOfTriangles + ", olives=" + olives
				+ ", mushrooms=" + mushrooms + ", corn=" + corn + ", onions=" + onions + ", tomatoes=" + tomatoes
				+ ", bulgarian=" + bulgarian + ", mozzarella=" + mozzarella + "]";
	}
	public char getSize() {
		return size;
	}
	public void setSize(char size) {
		this.size = size;
	}
	public int getNumberOfTriangles() {
		return numberOfTriangles;
	}
	public void setNumberOfTriangles(int numberOfTriangles) {
		this.numberOfTriangles = numberOfTriangles;
	}
	public String getOlives() {
		return olives;
	}
	public void setOlives(String olives) {
		this.olives = olives;
	}
	public String getMushrooms() {
		return mushrooms;
	}
	public void setMushrooms(String mushrooms) {
		this.mushrooms = mushrooms;
	}
	public String getCorn() {
		return corn;
	}
	public void setCorn(String corn) {
		this.corn = corn;
	}
	public String getOnions() {
		return onions;
	}
	public void setOnions(String onions) {
		this.onions = onions;
	}
	public String getTomatoes() {
		return tomatoes;
	}
	public void setTomatoes(String tomatoes) {
		this.tomatoes = tomatoes;
	}
	public String getBulgarian() {
		return bulgarian;
	}
	public void setBulgarian(String bulgarian) {
		this.bulgarian = bulgarian;
	}
	public String getMozzarella() {
		return mozzarella;
	}
	public void setMozzarella(String mozzarella) {
		this.mozzarella = mozzarella;
	}
	 
	 
	

}
