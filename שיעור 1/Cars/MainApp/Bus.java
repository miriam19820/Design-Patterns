package MainApp;

public class Bus extends Vehicle{
	private int seating;
	private boolean isArticulated;
	public Bus(String color, String company, String engine_type,int seating,boolean isArticulated ) {
    super(color,company,engine_type,6);
    
    this.seating=seating;
    this.isArticulated=isArticulated;
		
	}
	public int getSeating() {
		return seating;
	}
	public void setSeating(int seating) {
		this.seating = seating;
	}
	public boolean isArticulated() {
		return isArticulated;
	}
	public void setArticulated(boolean isArticulated) {
		this.isArticulated = isArticulated;
	}

}
