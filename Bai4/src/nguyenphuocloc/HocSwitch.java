package nguyenphuocloc;
import java.util.Scanner;
public class HocSwitch {
	public static void main(String[] args)
	{
		int thang;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please press button number...");
		thang = sc.nextInt();
		switch(thang)
		{
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("thang "+thang+" co 31 ngay");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("thang "+thang+ " co 30 ngay");
			break;
		case 2:
			System.out.println("Thang "+thang+ " co 28 ngay neu khong nhuan");
			break;
		default:
			System.out.println("Nhap sai");
			break;
		}
	}

}
