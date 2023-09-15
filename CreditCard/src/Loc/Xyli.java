package Loc;

import java.util.Scanner;

public class Xyli {

	public static void main(String[] args) {
		final float INTEREST = 0.015f;
		float creditCardBalance;
		float payment;
		float balance;
		float penalty = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("vui long nhap so the tin dung");
		creditCardBalance = Float.parseFloat(scan.nextLine());
		System.out.println("Nhap so tien da thanh toan");
		payment = Float.parseFloat(scan.nextLine());
		balance = creditCardBalance - payment;
		if(balance > 0)
		{
			penalty = balance * INTEREST;
		}
		System.out.println("Tien phat phai tra la " + penalty);
		

	}

}
