package Loc;

import java.util.Scanner;

public class XuLi {

	public static void main(String[] args) {
		// tim so duong nho nhat
		Scanner scan = new Scanner(System.in);
		int n = nhapN(scan);
		int a[] = nhapMang(scan, n);
		xuatMang(a);
		lietKe(a);
	}
	public static int nhapN(Scanner scan) {
		System.out.println("Nhap vao n = ");
		int n = Integer.parseInt(scan.nextLine());
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
	public static int duongDauTien(int a[]) {
		int flag = -1;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0) {
				flag = i;
				break;
			}
		}
		return flag;
	}
	public static int timDuongNhoNhat(int a[]) {
		int indexDuong = duongDauTien(a);
		int indexMin = -1;
		if(indexDuong == -1) {
			System.out.println("Mang khong co so duong");
		}
		else {
			indexMin = indexDuong;
			for(int i = indexDuong + 1; i < a.length; i++) {
				if(a[i] > 0 && a[i] < a[indexMin]) {
					indexMin = i;
				}
			}
		}
		return indexMin;
	}
	public static void lietKe(int a[]) {
		int indexMin = timDuongNhoNhat(a);
		if(indexMin == -1) {
			System.out.println("Mang khong co so duong");
		}
		else {
			System.out.println("\nCac vi tri so duong bang voi so duong dau tien nho nhat la");
			for(int i = indexMin + 1; i < a.length; i++) {
				if(a[i] == a[indexMin]) {
					System.out.print(i + "\t");
				}
			}
		}
		
	}

}

