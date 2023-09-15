package Loc;

import java.util.Scanner;

public class XyLy {

	public static void main(String[] args) {
		String name;
		int quantity;
		float cost;
		float count = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap vao ten san pham");
		name = scan.nextLine();
		
		System.out.println("Nhap vao so luong san pham");
		quantity = Integer.parseInt(scan.nextLine());
		
		System.out.println("Nhap vao gia san pham");
		cost = Float.parseFloat(scan.nextLine());
		
		if(quantity < 50 && quantity >0)
		{ 
			count = quantity * cost;
		}
		else if(quantity >= 50 && quantity < 100) {
			count = quantity * cost * 8f/100;
		}
		else {
			cost = quantity * cost * 12f/100;
		}
		System.out.println("So tien la " + count);
			
		
		


		
		
		
		

	}

}
