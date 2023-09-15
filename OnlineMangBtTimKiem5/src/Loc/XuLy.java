package Loc;

import java.util.Scanner;

public class XuLy {
// cho mảng một chiều các số thực, hãy tìm đoạn ab sao cho đoạn này chứa tất cả các giá trị trong mảng
	final static int MIN = -100;
	final static int MAX = 100;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = nhapN(scan);
		int a[] = taoMang(n);
		xuatMang(a);
		timDoanChuaTatCaPhanTu(a);
	
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
	public static void timDoanChuaTatCaPhanTu(int a[]) {
		int indexMax = 0;
		int indexMin = 0;
//		tim gia trị lớn nhất va nho nhat
		for(int i = 0; i < a.length; i++) {
			if(a[i] > a[indexMax]) {
				indexMax = i;
			}
			if(a[i] < a[indexMin]) {
				indexMin = i;
			}
		}
		System.out.println("Doan chua tat ca gia tri trong mang la " + "[" + a[indexMin] +"," + a[indexMax] + "]");
	}

}
