package Loc;

public class Jet implements FlightEnabled,Trackable {

	@Override
	public void track() {
		System.out.println(getClass().getSimpleName() + "'s coordinates recorded");
		
	}

	@Override
	public void takeOff() {
		// TODO Auto-generated method stub
		System.out.println(getClass().getSimpleName() + " is taking off");
	}

	@Override
	public void land() {
		System.out.println(getClass().getSimpleName() + " is landding");
		
	}

	@Override
	public void fly() {
		System.out.println(getClass().getSimpleName() + " is flying");
		
	}
	
	@Override
	public FlightStages transition (FlightStages stage) {
		System.out.println(getClass().getSimpleName() + " transitioning");
		return FlightEnabled.super.transition(stage);
		
	}

}
