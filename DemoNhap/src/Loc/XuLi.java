package Loc;

import java.util.Scanner;

public class XuLi {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Nhap vao mot so thuc thu nhat");
		String value1 = scan.nextLine();
		System.out.println("Nhap vao mot so thuc thu hai");
		String value2 = scan.nextLine();
		
		float num1 = Float.parseFloat(value1);
		float num2 = Float.parseFloat(value2);
		float tong = num1 + num2;
		
		System.out.println("Tong la " + tong);
		
		
		
		
		
//		String text = scan.nextLine();
//		int num = scan.nextInt();
//		int num2 = scan.nextInt();
//		String text1 = scan.nextLine();
//		String text2 = scan.nextLine();
//		System.out.println(text);
//		System.out.println(num);
//		System.out.println(text1);
//		System.out.println(text2);
//		System.out.println(num2);
		
		
//		System.out.println("Vui lòng nhập vào một số");
//		int so = scan.nextInt();
//		System.out.println("So ban vua nhap la " + so);
		
		

	}

}
