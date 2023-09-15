package Loc;

import java.util.Scanner;

public class XuLi {
	final static int MIN = -1000;
	final static int MAX = 1000;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = nhapN(scan);
		int a[] = taoMang(n);
		xuatMang(a);
		lietKe(a);
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
	public static boolean kiemTraSoDauTienLaLe(int x) {
//		int dv;
//		so am thi phai lay gia tri tuyet doi truoc khi tach so
		boolean laLe;
		x = Math.abs(x);
		while(x >= 10) {
//			dv = x % 10;
			x = x / 10;
		}
		if(x % 2 == 0) {
			laLe = false;
		}
		else {
			laLe = true;
		}
		return laLe;
	}
	public static void lietKe(int a[]) {
		System.out.println("Cac so co bat dau bang so le la");
		for (int i : a) {
			if(kiemTraSoDauTienLaLe(i)) {
				System.out.print(i + "\t");
			}
			
			
		}
		
	}
}
