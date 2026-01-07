package MainApp;

public class Car extends Vehicle {
	private boolean convertible_roof;
	private int numofdoor;

	public Car(String color, String company, String engine_type, boolean convertible_roof,int numofdoor) {
		super(color, company, engine_type,4);
		
		this.convertible_roof=convertible_roof;
		this.numofdoor=numofdoor;
		
	}

	public boolean isConvertible_roof() {
		return convertible_roof;
	}

	public void setConvertible_roof(boolean convertible_roof) {
		this.convertible_roof = convertible_roof;
	}

	public int getNumofdoor() {
		return numofdoor;
	}

	public void setNumofdoor(int numofdoor) {
		this.numofdoor = numofdoor;
	}
	

}
