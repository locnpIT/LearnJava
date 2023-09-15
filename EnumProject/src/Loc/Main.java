package Loc;

import java.time.DayOfWeek;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		DayOfTheWeek weekDay = DayOfTheWeek.TUES;
		System.out.println(weekDay);
		
		for (int i = 0; i < 10; i++) {
			weekDay = getRandomDay();
			System.out.printf("Name is %s, Ordinal Value = %d%n",
					weekDay.name(), weekDay.ordinal());
			if(weekDay == DayOfTheWeek.FRI) {
				System.out.println("Found Friday!!!");
			}
			switchDayOfWeek(weekDay);
			
		}
		for (Topping topping : Topping.values()) {
			// enum.values() là lấy tất cả các phần tử trong enum
			System.out.println(topping.name() + " : " + topping.getPrice());
			
		}
	}
	
	public static void switchDayOfWeek(DayOfTheWeek weekDay) {
		int weekDayInteger = weekDay.ordinal() + 1;
		switch(weekDay) {
		case WED -> System.out.println("Wednesday is day : " + weekDayInteger);
		case SAT -> System.out.println("Saturday is day " + weekDayInteger);
		default -> System.out.println(weekDay.name().charAt(0) +
				weekDay.name().substring(1).toLowerCase() + 
				"Day is day " + weekDayInteger
				);
		
		
		}
	}
	
	public static DayOfTheWeek getRandomDay() {
		int randomInteger = new Random().nextInt(7);  // random từ 0 đến 6
		// enum.values trong enum là mình sẽ lấy toàn bộ các phần tử của enum
		DayOfTheWeek[] allDays = DayOfTheWeek.values();
		return allDays[randomInteger];
	}

}
