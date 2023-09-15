package Loc;

import java.util.Scanner;

public class XuLy {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		thapHaNoi(n, 'a', 'b', 'c');
		

	}
	public static void chuyen(int n, char x, char y) {
		System.out.println("Chuyển đĩa thứ " + n + " từ cọc " + x +" sang cọc  "+ y);
	}
	public static void thapHaNoi(int n, char a, char b, char c) {
		if(n == 1) {
			chuyen(1, a, c);
		}
		else {
			thapHaNoi(n - 1, a, c, b);
			chuyen(n, a, c);
			thapHaNoi(n - 1, b, a, c);
		}
		
	}

}
