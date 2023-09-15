package Loc;

import java.util.Scanner;

public class XuLy {
// day con tang dai nhat
	final static int MIN = -100;
	final static int MAX = 100;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = nhapN(scan);
		int a[] = taoMang(n);
		xuatMang(a);
		printMaxRun(a);
		
	}
	public static int nhapN(Scanner scan) {
		System.out.println("Nhap vao n > 1");
		int n;
		do {
			 n = Integer.parseInt(scan.nextLine());
		}while(n < 1);
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
	public static void printMaxRun(int a[]) {
		int head = 0;
		int maxHead = 0;
		int maxLen = 0;
		do {
			int i;
			int len = 1;
			for(i = head; i < a.length - 1 && a[i] < a[i + 1]; i++) {
				len ++;
			}
			if(len > maxLen) {
				maxLen = len;
				maxHead = head;
			}
			head = i + 1;
			
		}while(head < a.length);
		System.out.println("run dai nhat la");
		for(int i = 0; i < maxLen; i++) {
			System.out.print(a[maxHead + i] + "\t");
		}
		
	}
}
