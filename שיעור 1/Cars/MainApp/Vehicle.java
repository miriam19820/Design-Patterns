package MainApp;

public class Vehicle {
	public String color;
	public String company;
	public String engine_type;
	public int wheels;
    public Vehicle(String color,String company,String engine_type,int wheels) {
    	
    this.color=color;
    this.company=company;
    this.engine_type=engine_type;
    this.wheels=wheels;
    }
    @Override
    public String toString() {
        return "Vehicle [Type=" + this.getClass().getSimpleName() + 
               ", Company=" + company + 
               ", Color=" + color + 
               ", Engine=" + engine_type + 
               ", Wheels=" + wheels + "]";
    }
}
