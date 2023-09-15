package Loc;

import java.util.Scanner;

public class Xuli {
/*
 *tạo ngẫu nhiên một mảng gồm n phần tử chứa giá trị trong đoạn [-100,100]
 *và xuất mảng,xóa phần tử có chỉ số p(p được nhập từ bàn phím).yêu cầu kiểm tra 
 *chỉ số nhập vào hợp lệ
 */
	final static int MIN = -100;
	final static int MAX = 100;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = nhapN(scan);
		int a[] = taoMang(n);
		xuatMang(a);
		a = xoaTaiIndex(a, scan);
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
	public static int[] xoaTaiIndex(int a[], Scanner scan) {
			int b[] = new int[a.length - 1];
			int index;
			do {
				System.out.println("Nhap chi so can xoa tu 0 den " + (a.length - 1));
				index = Integer.parseInt(scan.nextLine());
			}while(index <0 || index >= a.length);
			
			for(int i = 0, j = 0; j <= a.length - 1; i++ , j++) {
				if(j == index) {
					j++;
				}
				b[i] = a[j];
			}
			a = b; // gan lai cho mang goc
			return a;	
	}

}
