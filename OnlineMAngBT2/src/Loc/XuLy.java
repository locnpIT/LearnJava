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
		lietKeTrongDoan(scan, a);
	}
	public static int nhapN(Scanner scan) {
		int n;
		do {
			System.out.println("Nhap n > 1 va n chan");
			n = Integer.parseInt(scan.nextLine());
		}while(n < 1 || n % 2 != 0);
		return n;
	}
	public static int[] taoMang(int n) {
		int a[] = new int[n];
		for(int i = 0; i < n; i++)
		{
			a[i] = MIN + (int)(Math.random() * ((MAX - MIN) + 1));
		}
		return a;
	}
	public static void xuatMang(int a[]) {
		for (int i : a) {
			System.out.print(i + "\t");
		}
		System.out.println("\n");
	}
	public static void lietKeTrongDoan(Scanner scan, int a[]) {
		System.out.println("Nhap gia tri x ");
		int x = Integer.parseInt(scan.nextLine());
		
		System.out.println("Nhap gia tri Y ");
		int y = Integer.parseInt(scan.nextLine());
		for (int i : a) {
			if (i >= x && i <= y ) {
				System.out.print(i + "\t");
			}
		}
	}
}