package Loc;

public class Fish extends Animals{
	private int gills;
	private int fins;
	
	
	public Fish(String type , double weight, int gills, int fins) {
		super(type, "small", weight);
		this.gills = gills;
		this.fins = fins;
	}
	private void moveMuscles() {
		System.out.println("Muscles moving! ");
	}
	private void moveBackFin() {
		System.out.println("BackFin moving! ");
	}
	
	@Override
	public void move(String speed) {
		// TODO Auto-generated method stub
		super.move(speed);
		moveMuscles();
		if(speed == "fast") {
			moveBackFin();
		}
		System.out.println();
	}
	@Override
	public String toString() {
		return "Fish [gills=" + gills + ", fins=" + fins + "]" + super.toString();
		
	}
	
	
	
	
	
	
	
	

}
