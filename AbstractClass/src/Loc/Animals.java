package Loc;

import java.lang.reflect.InvocationTargetException;

abstract class Mammal extends Animals{

	public Mammal(String type, String size, double weight) {
		super(type, size, weight);
	}
	@Override
	public void move(String speed) {
		System.out.print(getExplicitType() + " ");
		System.out.println(speed.equals("slow") ? "walk" : "runs");
	}
	public abstract void shedHair();

	
}

public abstract class Animals {
	protected String type;
	private String size;
	private double weight;
	public Animals(String type, String size, double weight) {
		this.type = type;
		this.size = size;
		this.weight = weight;
	}
	
	public abstract void move(String speed);
	public abstract void makeNoise();
//	final để method ko bị override bởi lớp con 
	public final String getExplicitType() {
		return getClass().getSimpleName() + " (" + type + ")";
	}
	
	
	
}
