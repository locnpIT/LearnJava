package Loc;

import java.util.Scanner;

public class XuLi {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap vao so phan tu n ");
		int n = Integer.parseInt(scan.nextLine());
		int a[] = nhapMang(n, scan);
		xuatMang(a);
		xuatMangForEach(a);
	}
	public static int[] nhapMang(int n, Scanner scan) {
		int a[] = new int [n];
		System.out.println("Nhap mang mot chieu");
		for(int i = 0; i < n; i++)
		{
			System.out.print("a[" + i + "] = ");
			a[i] = Integer.parseInt(scan.nextLine());
		}
		return a;
	}
	public static void xuatMang(int a[]) {
		System.out.println("xuat mang cach 1");
		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i] + "\t");
		}
	}
	public static void xuatMangForEach(int a[]) {
		System.out.println("\nxuat mang cach 2");
		for (int item : a) { // doc la moi item trong mang a
			System.out.print(item + "\t");
			
		}
	}
}
