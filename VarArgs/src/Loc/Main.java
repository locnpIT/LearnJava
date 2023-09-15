package Loc;

public class Main {

	public static void main(String... args) {
		System.out.println("Hello world!");
		
		String[] splitStrings = "Hello world!".split(" ");
		printText(splitStrings);
		
		System.out.println("-".repeat(20));
		printText("Hello");
		
		System.out.println("-".repeat(20));
		printText("Hello", "world", "again");
		 
		System.out.println("-".repeat(20));
		printText("Hello", "world", "again");
		
		String[] sArray = {"first", "second", "third", "fourth", "fifth"};
		System.out.println(String.join(",", sArray));
		
	}
	
	private static void printText(String... textList) {
		for (String t : textList) {
			System.out.println(t);
			
		}
	}

}
