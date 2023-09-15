package HocEnum;

public enum Month {
	JANUARY(31), FEBRUARY(28), MARCH(31), APRIL(30), MAY(31), JUNE(30), JULY(31),
	AUGUST(31), SEPTEMBER(30), OCTOBER(31), NOVEMBER(30), DECEMBER(31);
	
	
	private int dayAmount;
	
	private Month(int dayAmount) {
		this.dayAmount = dayAmount;
	}
	public int getDayAmount() {
		return this.dayAmount;
		
	}

}
