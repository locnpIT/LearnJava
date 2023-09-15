package Loc;

public class Main {

	public static void main(String[] args) {
		Customers customer = new Customers("PhuocLoc", 1000, "faksdjf@gmail.com");
		
		System.out.println(customer.getName());
		System.out.println(customer.getCreditLimit());
		System.out.println(customer.getEmail());
		
		System.out.println("==================");
		Customers customer2 = new Customers();
		System.out.println(customer2.getName());
		System.out.println(customer2.getCreditLimit());
		System.out.println(customer2.getEmail());
		
		
		

	}

}
