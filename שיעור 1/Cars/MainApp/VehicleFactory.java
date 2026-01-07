package MainApp;

public class VehicleFactory {


public static Vehicle getVehicle(String type,String color,String company,String engine_type) {

	if (type.equals("car")) {
	return new Car(color, company, engine_type,false,4);}
	if (type.equals("bus")) {
	return new Bus(color,company,engine_type,60,false);}
	if(type.equals("motorcycle")) {
	return new Motorcycle(color,company,engine_type,"Sport",false);
	};
	return null;
}}

