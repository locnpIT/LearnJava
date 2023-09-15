package Loc;

public class Main {

	public static void main(String[] args) {
		Employee loc = new Employee("Loc", "30/01/2004", "01/01/2020");
		System.out.println(loc);
		System.out.println("Age: " + loc.getAge());
		System.out.println("Pay: " + loc.collectPay());
		
		SalariedEmployee ngan = new SalariedEmployee("Ngan", "27/05/2004", "01/01/2020",
				35000);
		System.out.println(ngan);
		System.out.println("Age: " + ngan.getAge());
		System.out.println("Pay: " + ngan.collectPay());
		ngan.retired();
		System.out.println("Ngan's pension check = " + ngan.collectPay());
		
		HourlyEmployee thinh = new HourlyEmployee("Thinh", "19/04/2000", "02/01/2020",
				15);
		System.out.println(thinh);
		System.out.println("Thinh's paycheck = " + thinh.collectPay());
		System.out.println("Thinh's holidayPay = " + thinh.getDoublePay());

	}

}
