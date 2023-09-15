package Loc;

import java.util.Scanner;

// xoa tat cac phan tu trung voi x, x duoc nhap tu ban phim
public class Xuli {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = nhapN(scan);
		int a[] = nhapMang(scan, n);
		xuatMang(a);
		System.out.println("\nNhap gia tri X muon xoa");
		int x = Integer.parseInt(scan.nextLine());
		a = xoaTatCaPhanTuGiaTriX(a, x);
		xuatMang(a);
	}

	public static int nhapN(Scanner scan) {
		System.out.println("Nhap vao n > 0");
		int n;
		do {
			 n = Integer.parseInt(scan.nextLine());
		}while(n < 0);
		return n;
	}
	public static int[] nhapMang(Scanner scan, int n) {
		int a[] = new int[n];
		for(int i = 0; i < n; i++)
		{
			System.out.println("A[" + i + "]= ");
			a[i] = Integer.parseInt(scan.nextLine());
		}
		return a;
	}
	public static void xuatMang(int a[]) {
		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i] + "\t");
		}
	}
	public static int demPhanTu(int a[], int x) {
		int dem = 0;
		for (int i : a) {
			if(i == x) {
				dem++;
			}
		}
		return dem;
	}
	public static int[] xoaTatCaPhanTuGiaTriX(int a[], int x) {
		int dem = demPhanTu(a, x);
		if(dem > 0) {
			int b[] = new int[a.length - dem];
			int j = 0;
			for(int i = 0; i < a.length; i++) { // duyet tren mang a
				if(a[i] != x) {
					b[j] = a[i];
					j++;
				}
			}
			a = b;
		}
		else {
			System.out.println("Khong co phan tu " + x + " trong mang");
		}
		return a;	
	}
}
