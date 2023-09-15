package Loc;

import java.util.Scanner;

public class XuLi {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int soDong = nhapN(scan);
		int soCot = nhapN(scan);
		int a[][] = nhapMang(soDong, soCot, scan);
		xuatMang(a, soDong, soCot);
		int tong = tongPhanTu(a, soDong, soCot);
		System.out.println("Tong các phần tử của ma trận là" + tong);
		

	}
	public static int nhapN(Scanner scan) {
		int n;
		do {
			System.out.println("Nhap vao gia tri lon hon 1");
			n = Integer.parseInt(scan.nextLine());
		}while(n < 1);
		return n;
	}
	public static int [][] nhapMang(int soDong, int soCot, Scanner scan){
		int a[][] = new int[soDong][soCot];
		for(int i = 0; i < soDong; i++) {
			for(int j = 0; j < soCot; j++) {
				System.out.print("a[" + i + "]" + "[" + j + "] = ");
				a[i][j] = Integer.parseInt(scan.nextLine());
			}
		}
		return a;
	}
	public static void xuatMang(int a[][], int soDong, int soCot) {
		for(int i = 0; i < soDong; i++) {
			for(int j = 0; j < soCot; j++) {
				System.out.print(a[i][j]+ "\t");
			}
			System.out.print("\n");
		}
	}
	public static int tongPhanTu(int a[][], int soDong, int soCot) {
		int s = 0;
		for(int i = 0; i < soDong; i++) {
			for(int j = 0; j < soCot; j++) {
				s += a[i][j];
			}
		}
		return s;
	}
}
