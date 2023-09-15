package Loc;

public class Dog extends Mammal{

	public Dog(String type, String size, double weight) {
		super(type, size, weight);
	}

	@Override
	public void move(String speed) {
		if(speed == "slow") {
			System.out.println(getExplicitType() + " walking");
		}else {
			System.out.println(getExplicitType() + " running");
		}
		
	}

	@Override
	public void makeNoise() {
		// TODO Auto-generated method stub
		if(type == "Wolf") {
			System.out.println("Howling! ");
		}
		else {
			System.out.println("Wolf! ");
		}
		
	}

	@Override
	public void shedHair() {
		// TODO Auto-generated method stub
		
	}
	

}
