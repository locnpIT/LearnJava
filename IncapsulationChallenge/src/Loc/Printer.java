package Loc;

public class Printer {
	private int tonerLevel;
	private int pagesPrinted;
	private boolean duplex;
	public Printer(int tonerLevel, boolean duplex) {
		this.pagesPrinted = 0;
		this.tonerLevel = (tonerLevel >= 0 && tonerLevel <= 100) ? tonerLevel : -1;
		
		this.duplex = duplex;
	}
	
	public int addToner(int tonerAmount) {
		
		int tempAmount = tonerAmount + tonerLevel;
		if(tempAmount > 100 || tonerAmount < 0) {
			return -1;
		}
		tonerLevel += tonerAmount;
		return tonerLevel;
	}
	public int printPages(int pages) {
		tonerLevel -= pages;
		if(tonerLevel <=0) {
			System.out.println("shortage of ink!!");
		}
		int jobPages = (duplex) ? (pages/2) + (pages%2) : pages;
		pagesPrinted += jobPages;
		return jobPages;
	}

	public int getPagesPrinted() {
		return pagesPrinted;
	}
	public int getTonerLevel() {
		return tonerLevel;
	}
	
	
	

}
