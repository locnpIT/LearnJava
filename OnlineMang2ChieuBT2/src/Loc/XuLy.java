package Loc;

import java.util.Scanner;

public class XuLy {
	final static int MAX = 100;
	final static int MIN = -100;

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int soDong = nhapN(scan);
		int soCot = nhapN(scan);
		int a[][] = taoMang(soDong, soCot, scan);
		xuatMang(a, soDong, soCot);
		timMax(a, soDong, soCot);
	}
	public static int nhapN(Scanner scan) {
		int n;
		do {
			System.out.println("Nhap vao gia tri lon hon 1");
			n = Integer.parseInt(scan.nextLine());
		}while(n < 1);
		return n;
	}
	public static int [][] taoMang(int soDong, int soCot, Scanner scan){
		int a[][] = new int[soDong][soCot];
		for(int i = 0; i < soDong; i++) {
			for(int j = 0; j < soCot; j++) {
				System.out.print("a[" + i + "]" + "[" + j + "] = ");
				a[i][j] = MIN + (int) (Math.random() * (MAX - MIN) + 1);
			}
		}
		return a;
	}
	public static void xuatMang(int a[][], int soDong, int soCot) {
		System.out.println("\n");
		for(int i = 0; i < soDong; i++) {
			for(int j = 0; j < soCot; j++) {
				System.out.print(a[i][j]+ "\t");
			}
			System.out.print("\n");
		}
	}
	public static void timMax(int a[][], int soDong, int soCot) {
		int max = a[0][0];
		for(int i = 0; i < soDong; i++) {
			for(int j = 0; j < soCot; j++)
			{
				if(a[i][j] > max) {
					max = a[i][j];
				}
			}
		}
		System.out.println("Gia tri lon nhất trong mảng là " + max + " Và ở vị trí");
		for(int i = 0; i < soDong; i++) {
			for(int j = 0; j < soCot; j++) {
				if(a[i][j] == max) {
					System.out.println("[" + i + "]" + "[" + j + "]");
				}
			}
		}
		
	}
}
