package Loc;

import java.util.Scanner;

public class XyLy {

	public static void main(String[] args) {
		final float RATE_OT = 1.5f;
		final int STANDAR_HOUR = 40;
		int rate, hours;
		float payment = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Nhap vao gia theo gio");
		rate = Integer.parseInt(scan.nextLine());
		
		System.out.println("Nhap vao gio lam");
		hours = Integer.parseInt(scan.nextLine());
		
		if(hours > 40) {
			payment = ((STANDAR_HOUR * rate) + ((hours - STANDAR_HOUR) * RATE_OT * rate));
		}
		else {
			payment = hours * rate;
		}
		System.out.println("tien luong phai tra la " + payment); 

	}


}
