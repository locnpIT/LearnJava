package Loc;

public class Horse extends Mammal{

	public Horse(String type, String size, double weight) {
		super(type, size, weight);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void makeNoise() {
		System.out.println("Hiiiiiiiiiii");
		
	}
	@Override
	public void shedHair() {
		System.out.println(getExplicitType() + " sheds in the spring!");
	}
	

}
