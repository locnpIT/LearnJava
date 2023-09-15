package Loc;

public class Main {

	public static void main(String[] args) {
		String helloWorld = "Hello" + " World";
		helloWorld.concat(" and goodbye!");
		
		StringBuilder helloWorldBuilder = new StringBuilder("Hello" + " World");
		helloWorldBuilder.append(" and good bye");
		
		printInformation(helloWorld);
		printInformation(helloWorldBuilder);
		
		StringBuilder emptyStart = new StringBuilder();
		emptyStart.append("a".repeat(44));
		
		StringBuilder emptyStart32 = new StringBuilder(32);
		emptyStart32.append("a".repeat(17));
		
		printInformation(emptyStart);
		printInformation(emptyStart32);
		
		StringBuilder builderPlus = new StringBuilder("Hello" + " World");
		builderPlus.append(" and good bye");
		builderPlus.deleteCharAt(16).insert(16, "t");
		System.out.println(builderPlus);
		
		builderPlus.replace(16, 17, "G");
//		thay thế vị trí thứ 17 bằng chữ G
		System.out.println(builderPlus);
		
		builderPlus.delete(6, 8);
//		xóa vị trí thứ 7 8 
		System.out.println(builderPlus);
		
		builderPlus.reverse().setLength(7);
//		đảo ngược chuỗi, sau đó lấy độ dài chuỗi bằng 7
		System.out.println(builderPlus);
		
	}
	
	public static void printInformation(String string) {
		System.out.println("String = " + string);
		System.out.println("Length = " + string.length());
	}
	public static void printInformation(StringBuilder builder) {
		System.out.println("String = " + builder);
		System.out.println("Length = " + builder.length());
		System.out.println("Capacity = " + builder.capacity());
	}

}

