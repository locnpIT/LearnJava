package Loc;

import java.util.Scanner;

public class XuLi {

	final static int MIN = -100;
	final static int MAX = 100;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = nhapN(scan);
		int a[] = taoMang(n);
		xuatMang(a);
		lietKePTXaGiaTriX(a, scan);
	
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
	public static void lietKePTXaGiaTriX(int a[], Scanner scan) {
		System.out.println("Nhap vao x = ");
		int x = Integer.parseInt(scan.nextLine());
		int b[] = new int[a.length];
		for(int i = 0; i < a.length; i++) {
			b[i] = Math.abs(a[i] - x);
		}
		//Tim gia tri max thuc su
		int indexMax = 0;
		for(int i = 0; i < b.length; i++) {
			if(b[i] > b[indexMax]) {
				indexMax = i;
			}
		}
		System.out.println("Cac phan tu cach xa phan tu " + x + " la:");
		for(int i = 0; i < b.length; i++) {
			if(b[i] == b[indexMax]) {
				System.out.print("(" + i + ", " + a[i] + ")" + "\t");
			}
		}
		
	}

}
