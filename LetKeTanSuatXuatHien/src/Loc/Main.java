package Loc;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap vao so phan tu cua mang = ");
		int n = Integer.parseInt(scan.nextLine());
		int a[] = new int[n];
		for (int i = 0; i < a.length; i++) {
			System.out.printf("a[%d] = ", i);
			a[i] = Integer.parseInt(scan.nextLine());
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "  ");
		}
		System.out.println();
		for(int i = 0; i < a.length; i++) {
			int dem = 0;
			for(int j = 0; j < a.length; j++) {
				if(a[i] == a[j]) {
					if(i <= j) {
						dem++;
					}
					else {
						break;
					}
				}	
			}
			if(dem !=0) {
				System.out.println(a[i] + " Xuat hien " + dem + " lan");
			}
		}
	}

}
