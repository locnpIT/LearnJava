package Loc;

import java.util.Scanner;

public class XuLy {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = nhapN(scan);
		int a[] = nhapMang(scan, n);
		xuatMang(a);
		System.out.println("Nhap vao phan tu muon tim kiem x = ");
		int x = Integer.parseInt(scan.nextLine());
//		int index = linearSearch1(a, x);
//		if(index != 1) {
//			System.out.println("Tim thay " + x + " trong mang o vi tri " + index);
//		}
//		else {
//			System.out.println("Khong tim thay " + x +" trong mang");
//		}
		int index = binarySearch(a, x);
		if(index != -1) {
			System.out.println("Tim thay " + x + " trong mang" + " tai vi tri" + index);
		}
		else {
			System.out.println("Khong tim thay " + x + " trong mang");
		}

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
		for(int i = 0; i < n; i++) {
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
	public static boolean linearSearch(int a[], int x) {
		int i = 0;
		int n = a.length;
		while(i < n && a[i] != x) {
			i++;
		}
		if(i == n)
			return false;
		return true;
	}
	public static int linearSearch1(int a[], int x) {
		int i;
		for(i = 0; i < a.length; i++) {
			if(a[i] == x) {
				return i;
			}
		}
		return -1;
	}
	//Binary Search
	public static int binarySearch(int a[], int x) {
		int left = 0;
		int right = a.length - 1;
		int mid;
		do {
			mid = (left+right) / 2;
			if(a[mid] == x) {
				return mid; // tim thay;
			}
			else if(a[mid] < x) {
				left = mid + 1;
			}else {
				right = mid - 1;
			}
		}while(left <= right);
		return -1;
	}
	
}
