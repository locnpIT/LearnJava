package Loc;

public class Animals {
	protected String type;
	private String size;
	private double weight;
	
	public Animals() {
		
	}
	public Animals(String type, String size, double weight) {
		super();
		this.type = type;
		this.size = size;
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Animals [type=" + type + ", size=" + size + ", weight=" + weight + "]";
	}
	
	public void move(String speed) {
		System.out.println(this.type + " move " + speed);
		
	}
	public void makeNoise() {
		System.out.println(this.type + " make some kind of noise");
	}
	
	

}
