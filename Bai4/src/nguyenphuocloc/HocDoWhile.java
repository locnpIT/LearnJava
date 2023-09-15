package nguyenphuocloc;

public class HocDoWhile {
	public static void main() {
		int n = 1;
		int i = 1;
		do {
			n *= i;
			i++;
		}while(i <= 5);
			System.out.println("5! = "+n);
	}

}
