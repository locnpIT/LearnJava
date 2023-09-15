package Loc;

import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
//		HinhChuNhat hcn = new HinhChuNhat();
//		Scanner scan = new Scanner(System.in);
//		hcn.nhap(scan);
//		hcn.chuVi();
//		hcn.dienTich();
//		hcn.xuat();
		Scanner scan = new Scanner(System.in);
		System.out.println("nhap chieu dai ");
		float cDai = Float.parseFloat(scan.nextLine());
		
		System.out.println("Nhap chieu rong ");
		float cRong = Float.parseFloat(scan.nextLine());
		
		
		HinhChuNhat hcn = new HinhChuNhat(cDai, cRong);
		hcn.chuVi();
		hcn.dienTich();
		hcn.xuat();
		
	}

}
