package Loc;

import java.util.Scanner;

public class XuLY {
	
	final static int MIN = -100;
	final static int MAX = 100;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = nhapN(scan);
		int a[] = taoMang(n);
		xuatMang(a);
		int index = soChanCuoi(a);
		if(index == -1) {
			System.out.println("Mang khong co so chan");
		}
		else {
			System.out.println("Mang co so chan cuoi la " + a[index]);
		}
		
		

	}
	public static int nhapN(Scanner scan) {
		int n;
		System.out.println("Nhap vao n > 0");
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
	public static int soChanCuoi(int a[]) {
		int index = 1;
		for(int i = a.length - 1; i >= 0; i--) {
			if(a[i] % 2 == 0) {
				return i;
			}
		}
		return index;
	}
}
