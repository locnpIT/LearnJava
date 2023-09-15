package Loc;

import java.util.Scanner;

public class XuLy {

	final static int MIN = -100;
	final static int MAX = 100;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = nhapN(scan);
		int a[] = taoMang(n);
		xuatMang(a);
		lietKe(a);
	}
		
	public static int nhapN(Scanner scan) {
		System.out.println("Nhap vao n > 1");
		int n;
		do {
			 n = Integer.parseInt(scan.nextLine());
		}while(n < 1);
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
	public static int timSoAmDauTien(int a[]) {
		int index = -1;
		for(int i = 0; i < a.length; i++) {
			if(a[i] < 0) {
				return i;
			}
		}
		return index;
	}
	public static void lietKe(int a[]) {
		int min;
		if(timSoAmDauTien(a) == -1) {
			System.out.println("Mang khong co so am");
		}
		else {
			min = a[timSoAmDauTien(a)];
			for(int i = timSoAmDauTien(a) + 1; i < a.length; i++) {
				if(a[i] < 0 && a[i] < min) {
					min = a[i];
				}
			}
			System.out.println("gia tri am nho nhat torng mang la " + min);
		}
	}
	
	
}
