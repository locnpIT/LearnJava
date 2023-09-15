package Loc;

import java.util.Scanner;

public class XuLy {
/*
 * viết chương trình tạo một mảng n phần tử nguyên có giá trị nhập vào từ bàn phím
 * kiểm tra xem mảng có đối xứng hay không
 * hãy dịch trái, xoay mảng k lần, k nhập vào từ bàn phím
 * */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = nhapN(scan);
		int a[] = nhapMang(scan, n);
		xuatMang(a);
		boolean doiXung = ktDoiXung(a);
		if(doiXung == true) {
			System.out.println("Mang doi xung");
		}
		else {
			System.out.println("Mang khong doi xung");
		}
		a = xoayTrai(a, scan);
		xuatMang(a);

	}
	public static int nhapN(Scanner scan) {
		System.out.println("Nhap vao n > 1");
		int n;
		do {
			 n = Integer.parseInt(scan.nextLine());
		}while(n < 1);
		return n;
	}
	public static int[] nhapMang(Scanner scan, int n) {
		int a[] = new int[n];
		for(int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "] = ");
			a[i] = Integer.parseInt(scan.nextLine());
		}
		return a;
	}
	
	public static void xuatMang(int a[]) {
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
		System.out.println("\n");
	}
	public static boolean ktDoiXung(int a[]) {
		for(int i = 0; i < a.length / 2; i++) {
			if(a[i] != a[a.length - 1 - i]) {
				return false;
			}
		}
		return true;
	}
	public static int[] xoayTrai(int a[], Scanner scan) {
		int k;
		int tam;
		do {	
			System.out.println("Vui long nhap k > 0");
			k = Integer.parseInt(scan.nextLine());
		}while(k < 0);
		k %= a.length;
		for(int i = 0; i < k; i++) {
			//tao bien tam de luu tru a[0]
			tam = a[0];
			// duyet va chep de phan tu thu a[i+1] len a[i]
			for(int j = 0; j < a.length - 1; j++) {
				a[j] = a[j + 1];
			}
			a[a.length - 1] = tam;	
		}
		return a;
	}
}
