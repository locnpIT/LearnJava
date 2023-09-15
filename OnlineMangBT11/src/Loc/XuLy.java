package Loc;

import java.util.Scanner;
/*
 * a tạo ngẫu nhiên mảng một chiều n phần tử nguyên
 * (n chẵn) có giá trị chứa trong đoạn [-100,100]
 * và xuất mảng. kiểm tra nhập hợp lệ a > 2 và n phải
 * là số chẵn
 * b viết hàm thực hiện việc trộn hoàn hảo một mảng, sao cho
 * các phần tử của một nữa mảng sau xem kẽ với các phần tử của
 * một nữa mảng đầu. xuất mảng sau khi trộn
 * c. xác định số lần trộn hoàn hảo để mảng trở về ban đầu 
 * */


public class XuLy {
	final static int MIN = -100;
	final static int MAX = 100;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = nhapN(scan);
		int a[] = taoMang(n);
		int b[] = a;
		xuatMang(a);
		a = shuffle(a);
		xuatMang(a);
		b = shuffle(a);
		int count = countShuffle(a, b);
		System.out.println("Can " + count + " lan de mang hoan doi ve mang ban dau");
	}
	public static int nhapN(Scanner scan) {
		System.out.println("Nhap vao n > 2 va n chan");
		int n;
		do {
			 n = Integer.parseInt(scan.nextLine());
		}while(n < 2 || n % 2 != 0);
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
	public static int[] shuffle(int a[]) {
		int tam[] = new int[a.length];
		for(int i = 0; i < a.length / 2; i++) {
			tam[2 * i] = a[i];
			tam[2 * i + 1] = a[a.length / 2 + i];
		}
		a = tam;
		return a;
	}
	public static boolean isEqual(int a[], int b[]) {
		for(int i = 0; i < a.length; i++) {
			if(a[i] != b[i]) {
				return false;
				
			}
		}
		return true;
	}
	public static int countShuffle(int a[], int b[]) {
		int count = 0;
		do {
			b = shuffle(b);
			count ++;
		}while(!isEqual(a, b));
		return count;
	}
}
