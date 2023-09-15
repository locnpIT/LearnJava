package Loc;

public class StringMethods {

	public static void main(String[] args) {
		String birthDate = "30/01/2004";
		int startingIndex = birthDate.indexOf("2004");
		System.out.println("startingIndex = " + startingIndex);
		System.out.println("Birth Year = " + birthDate.substring(startingIndex));
		System.out.println("Month = " + birthDate.substring(3, 5));
		System.out.println("Date = " + birthDate.substring(0,2));
		
		String newDate = String.join("/", "27", "05", "2004");
		System.out.println("newDate = " + newDate);
		
		newDate = "19";
		newDate = newDate.concat("/");
		newDate = newDate.concat("04");
		newDate = newDate.concat("/");
		newDate = newDate.concat("2000");
		System.out.println("NewDate = " + newDate);
		
		System.out.println(newDate.replace("/", "-"));
		System.out.println(newDate.replaceFirst("/", "-"));
		
		System.out.println("ABC\n".repeat(3));
		System.out.println("-".repeat(20));

		System.out.println("ABC\n".repeat(3).indent(8));
		System.out.println("-".repeat(20));
	}

}
