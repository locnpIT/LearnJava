package Loc;

import java.util.Scanner;


public class XuLy {
	final static int MAX = 100;
	final static int MIN = -100;


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int soDong = nhapN(scan);
		int soCot = nhapN(scan);
		int a[][] = taoMang(soDong, soCot, scan);
		xuatMang(a, soDong, soCot);
		timChan(a, soDong, soCot);
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
	public static void timChan(int a[][], int soDong, int soCot) {
		for(int i = 0 ; i < soDong; i++) {
			int flag = 0;			
			for(int j = 0; j < soCot; j++) {
				if(a[i][j] % 2 == 0) {
					flag = 1;
					break;
				}
			}
			if(flag == 1) {
				System.out.println("Dong" + i);				
			}
		}
	}
}
