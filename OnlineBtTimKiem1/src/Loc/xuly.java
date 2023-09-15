package Loc;

import java.util.Scanner;

public class xuly {
	final static int MIN = -100;
	final static int MAX = 100;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = nhapN(scan);
		int a[] = taoMang(n);
		xuatMang(a);
		int index = timPtDuongDauTien(a);
		if(index != -1) {
			System.out.println("Tim thay phan tu duong dau tien la " + a[index] + " tai vi tri " + index);
		}
		else {
			System.out.println("Khong thay phan tu duong trong mang");
		}

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
	public static int timPtDuongDauTien(int a[]) {
		for(int i = 0; i < a.length; i++) {
			if(a[i] > 0) {
				return i;
			}
		}
		return -1;
	}
	

}
