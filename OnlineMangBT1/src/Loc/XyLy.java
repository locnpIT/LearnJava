package Loc;

import java.util.Scanner;

public class XyLy {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap vao so phan tu ");
		int n = Integer.parseInt(scan.nextLine());
		int a[] = nhapMang(n,scan);
		xuatMangForEach(a);
		float tong = tinhTongChan(a);
		System.out.println("Tong chan cua mang la " + tong);
		int dem = demSoAm(a);
		System.out.println("Co " + dem + " so am trong mang");
		System.out.println("Tong cac so am la " + tongAm(a));
		

		
		
		
		

	}
	public static int[] nhapMang(int n, Scanner scan) {
		int a[] = new int[n];
		System.out.println("Nhap mang");
		for (int i = 0; i < n; i++) {
			System.out.println("a[" + i + "] = ");
			a[i] = Integer.parseInt(scan.nextLine());
		}
		return a;
	}
	public static void xuatMangForI(int a[]) {
		System.out.println("Xuat mang");
		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i] + "\t");
		}
	}
	public static void xuatMangForEach(int a[]) {
		System.out.println("Xuat mang");
		for(int item : a) {
			System.out.print(item + "\t");
		}
	}
	public static float tinhTongChan(int a[]) {
		float tong = 0;
		for(int i : a) {
			if(i % 2 == 0 && i > 0) {
				tong += i; 
			}
		}
		return tong;
	}
	public static int demSoAm(int a[]) {
		int dem = 0;
		for (int i : a) {
			if(i < 0)
				dem++;
		}
		return dem;
	}
	public static int tongAm(int a[]) {
		int tong = 0;
		for (int i : a) {
			if(i < 0)
				tong += i;
		}
		return tong;
	}
}
