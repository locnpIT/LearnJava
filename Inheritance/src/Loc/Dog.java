package Loc;

public class Dog extends Animals{
	
	private String tailShape;
	private String earShape;
	
	
	public Dog(String type, double weight) {
		this(type, weight, "Perky", "curled");
	}
	
	public Dog(String type, double weight, String tailShape, String earShape) {
		super(type, weight < 15 ? "small" : (weight < 35 ? "medium" : "large"), weight);
		this.tailShape = tailShape;
		this.earShape = earShape;
	}

	public Dog() {
		super("becgie", "big", 50);
	}

	@Override
	public String toString() {
		return "Dog [tailShape=" + tailShape + ", earShape=" + earShape + "]"
				+ super.toString();
	}
	
	@Override
	public void makeNoise() {
			if(type == "wolf") {
			System.out.println("ow owwwwooooooo!");
		}
		
		bark();
//		System.out.println();
		
	}
	@Override
	public void move(String speed) {
		super.move(speed);
		if(speed.equalsIgnoreCase("slow")) {
			walk();
			wagTail();
		}
		else {
			run();
			bark();
		}
		System.out.println();
	}
	private void bark() {
		System.out.println("Woof! ");
	}
	private void run() {
		System.out.println("Dog running! ");
	}
	private void walk() {
		System.out.println("Dog walking! ");
	}
	private void wagTail() {
		System.out.println("Tail wagging ");
	}
	
	
	
	
	
	

}
