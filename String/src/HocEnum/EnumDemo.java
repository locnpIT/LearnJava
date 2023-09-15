package HocEnum;

public class EnumDemo {


	public static void main(String[] args) {
		priority pri = priority.HIGH;
		
		switch (pri) {
		case HIGH: {
			System.out.println("High priority");
			break;
		}
		case MEDIUM: {
			System.out.println("Medium priority");
			break;
		}
		case LOW: {
			System.out.println("Low priority");
			break;
		}
		
		default:
			System.out.println("error");
		}
		
		System.out.println("===========Enum value of");
		priority pri2 = priority.valueOf("HIGH");
		System.out.println(pri2);
		System.out.println("===========Enum iteration");
		
		priority[] values = priority.values();
		for (priority pri3 : values) {
			System.out.println(pri3);
		}
		System.out.println("===========Enum fields and method");
		System.out.println("Day of january is  " + Month.JANUARY.getDayAmount());

	}

}
