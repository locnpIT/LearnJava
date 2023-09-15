package Loc;

enum FlightStages implements Trackable{
	GROUNDED, LAUNCH, CRUISE, DATA_COLLECTION;

	@Override
	public void track() {
		if(this != GROUNDED) {
			System.out.println("Monitoring " + this);
		}
		
	}
	
	public FlightStages getNextStage() {
		FlightStages[] allStages = values();
		return allStages[(ordinal() + 1) % allStages.length];
		
	}
}

record DragonFly(String name, String type) implements FlightEnabled{

	@Override
	public void takeOff() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void land() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}
	
}

class Satellite implements OrbitEarth{
	@Override
	public void achieveOrbit() {
		System.out.println("Orbit achieved");
	}

	@Override
	public void takeOff() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void land() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}

	
}

interface OrbitEarth extends FlightEnabled{
	
	void achieveOrbit(); // ở đây là tự nó ngầm hiểu public
	
	private static void log(String description) {
		var today = new java.util.Date();
		System.out.println(today + ": " + description);
	}
}

interface FlightEnabled {
	
	public static final double MILES_TO_KM = 1.60934; // còn có thể khai báo là public static final double
	double KM_TO_MILES = 0.621371;
	public abstract void takeOff();// ở đây có thể bỏ public abstract vì nó tự hiểu là có
	
	abstract void land(); // ở đây ko khai báo public vì nó tự ngầm định
	
	void fly(); // ở đây không cần khai báo public abstract vì nó tự ngầm đinh r
	
	
//	public abstract FlightStages transition(FlightStages stage);
	default FlightStages transition(FlightStages stage) {
		FlightStages nextStage = stage.getNextStage();
		System.out.println("Transition from " + stage + " to " + nextStage);
		return nextStage;
	}
	
}


interface Trackable{
	void track();
}



public abstract class Animal {
	public abstract void move();
	

}
