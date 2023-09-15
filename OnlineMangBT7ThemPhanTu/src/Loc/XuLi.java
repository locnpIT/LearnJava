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
			a = themPhanTu(a, scan);
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
		public static int[] themPhanTu(int a[], Scanner scan) {
			int k;
			do {
				System.out.println("Vui long nhap k tu 0 den " + a.length);
				k = Integer.parseInt(scan.nextLine());
			}while(k < 0 || k > a.length);
			System.out.println("Vui long nhap gia tri phan tu can them: x = ");
			int x = Integer.parseInt(scan.nextLine());
			int b[] = new int[a.length + 1]; // tao mang tam voi kich thuoc tang them 1
			for(int i = 0; i < b.length; i++) {
				if(i < k) {
					b[i] = a[i]; //khuc nay la chep vao 
				}
				else if(i == k) {
					b[i] = x; // khuc nay la them vao;
				}
				else if(i > k) {
					b[i] = a[i - 1]; //i cua b dang lon hon i cua a nen muuon lay chinh xac thi phai -1
				}	
			}
			a = b; // gan mang tam ve cho mang goc
			return a;
		}

}
