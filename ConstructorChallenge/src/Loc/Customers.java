package Loc;

public class Customers {
	private String name;
	private double creditLimit;
	private String email;
	public String getName() {
		return name;
	}
	public double getCreditLimit() {
		return creditLimit;
	}

	public String getEmail() {
		return email;
	}
	
	public Customers() {
		this("Nobody", "example@gmail.com");
	}
	public Customers(String name, String email) {
		this(name, 100000, email);
	}
	public Customers(String name, double creditLimit, String email) {
		super();
		this.name = name;
		this.creditLimit = creditLimit;
		this.email = email;
	}

	
	
	
	
}
