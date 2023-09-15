package Loc;

import java.util.Scanner;

public class Xuli {

	final static int MIN = -100;
	final static int MAX = 100;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = nhapN(scan);
		int a[] = taoMang(n);
		xuatMang(a);
		int tong = tinhTongLienKe(a);
		System.out.println("Tong = " + tong);
		
		
	}
	public static int nhapN(Scanner scan) {
		System.out.println("Nhap vao n > 0");
		int n;
		do {
			 n = Integer.parseInt(scan.nextLine());
		}while(n < 0);
		return n;
	}
	public static int[] taoMang(int n) {
		int a[] = new int[n]; 
		for(int i = 0; i < n; i++) {
			a[i] = MIN + (int)(Math.random() * ((MAX - MIN) + 1));
		}
		return a;
	}
	public static void xuatMang(int a[]) {
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
		System.out.println("\n");
	}
	public static int tinhTongLienKe(int a[]) {
		int tong = 0;
		for (int i = 1; i < a.length; i++) {
			if(a[i] > a[i - 1]) { 
				tong += a[i];
			}
		}
		return tong;
	}

}
