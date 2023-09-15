package Loc;

import java.util.Scanner;

public class XuLy {
// tinh tong 1 + 1.2 + 1.2.3 + 1.2.3.4 + .... + 1.2.3.(n-1).n
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		
		long giaithua = tongCacGiaiThua(n);
		System.out.println("Tong la " + giaithua);
		

	}
	public static int tinhTong(int n) {
		if(n == 1) {
			return 1;
		}
		return tinhTong(n - 1) + n;
	}
	public static long giaiThua(int n) {
		if(n == 1) {
			return 1;
		}
		return giaiThua(n - 1) * n;
	}
	public static long tongCacGiaiThua(int n) {
		if(n == 1) {
			return 1;
		}
		return tongCacGiaiThua(n - 1) + giaiThua(n - 1) * n;
	}
}
