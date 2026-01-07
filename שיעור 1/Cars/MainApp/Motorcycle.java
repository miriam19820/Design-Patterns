package MainApp;

public class Motorcycle extends Vehicle{
	private String type;
	private boolean includesHelmet;
    public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public boolean isIncludesHelmet() {
		return includesHelmet;
	}
	public void setIncludesHelmet(boolean includesHelmet) {
		this.includesHelmet = includesHelmet;
	}
	public Motorcycle(String color, String company, String engine_type,String type,boolean includesHelmet ) {
    	super(color,company,engine_type,2);
    	this.type=type;
    	this.includesHelmet=includesHelmet;
		
	}

}
