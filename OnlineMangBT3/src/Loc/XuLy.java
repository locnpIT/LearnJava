package Loc;

import java.util.Scanner;

public class XuLy {
	final static int MIN = -100;
	final static int MAX = 100;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = nhapN(scan);
		int a[] = nhapMang(scan, n);
		xuatMang(a);
		
		lietKeChiSo(a);
		
		
	}
	public static int nhapN(Scanner scan) {
		int n;
		do {
			System.out.println("Nhap n > 0");
			n = Integer.parseInt(scan.nextLine());
		}while(n < 0);
		return n;
	}
	public static int[] nhapMang(Scanner scan, int n) {
		int a[] = new int[n];
		for(int i = 0; i < n; i++) {
			System.out.print("A[" + i + "]=");
			a[i] = Integer.parseInt(scan.nextLine());
		}
		return a;
	}
	public static int[] taoMang(int n) {
		int a[] = new int[n];
		for(int i = 0; i < n; i++)
		{
			a[i] = MIN + (int)(Math.random() * ((MAX - MIN) + 1));
		}
		return a;
	}
	public static void xuatMang(int a[]) {
		for (int i : a) {
			System.out.print(i + "\t");
		}
		System.out.println("\n");
	}
	public static int timChiSoAmDauTien(int a[]) {
		int index = -1;
		for (int i = 0; i < a.length; i++)
		{
			if(a[i] < 0) {
				index = i;
				break; // thoat khoi vong lap vi da tim thay phan tu am dau tien
			}
		}
		return index;
	}
	public static void lietKeChiSo(int a[]) {
		int index = timChiSoAmDauTien(a);
		if(index == -1) {
			System.out.println("Mang khong co so am ");
		}
		else {
			System.out.println("cac chi so tai do co gia tri bang " + a[index]);
			for(int i = index + 1; i < a.length; i++) {
//tìm thấy số âm rồi thì duyệt từ index cho nhanh 
				if(a[i] == a[index]) {
					System.out.print(i + "\t");
				}
			}
		}
			
			
	}
	
	
	
	
}
