package Loc;

import java.util.Scanner;

public class XuLi {
	final static int MIN = -100;
	final static int MAX = 100;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = nhapN(scan);
		int a[] = taoMang(n);
		xuatMang(a);
		int dem = demPTThoaDK(a);
		System.out.println("Co " + dem + " phan tu chia het cho 4 va co tan cung la 6");
		a = gapDoiPTLe(a);
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
	public static int demPTThoaDK(int a[]) {
		int dem = 0;
		for (int i : a) {
			if(i % 4 == 0 && i % 10 == 6) {
				dem++;
			}
		}
		return dem;
	}
	public static int[] gapDoiPTLe(int a[]) {
		for(int i = 0; i < a.length; i++) {
			if(a[i] % 2 != 0)
			{
				a[i] = a[i] * 2;
			}
		}
		return a;
	}

}
