package Loc;

public class Main {

	public static void main(String[] args) {
		
		String bulletIt = "Print a bulleted list:\n" + 
				"\u2022 First Point\n" + 
				"\u2022 Sub point";
		
		
		System.out.println(bulletIt);
		
		String textBlock = """
				print a bulletlist :
					\u2022 FirstPoint
					 \u2022 SubPoint		  
				""";
		System.out.println(textBlock);
		int age = 19;
		System.out.printf("My age is %d", age);
	

	}

}
