package Loc;

public class Main {

	public static void main(String[] args) {
		Printer printer = new Printer(100, true);
		System.out.println("Initial page count = " + printer.getPagesPrinted());
		
		int pagesPrinted = printer.printPages(50);
		System.out.printf("Current Job Pages: %d, print total: %d %n",pagesPrinted,
				printer.getPagesPrinted());
		
		pagesPrinted = printer.printPages(50);
		System.out.printf("Current Job Pages: %d, print total: %d %n",pagesPrinted,
				printer.getPagesPrinted());
	}

}
