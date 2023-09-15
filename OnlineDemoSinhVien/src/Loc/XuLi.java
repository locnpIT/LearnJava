package Loc;

import java.util.Scanner;

public class XuLi {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		SinhVien sv1 = new SinhVien();
		sv1.setHoTen("NguyenTrai");
		sv1.setEmail("npl2004qn@gmail.com");
		System.out.println("Vui long nhap ten sv");
		String ten = scan.nextLine();
		System.out.println("Vui long nhap email");
		String email = scan.nextLine();
		System.out.println("Vui long nhap diem toan");
		float diemT = Float.parseFloat(scan.nextLine());
		System.out.println("Vui long nhap diem ly");
		float diemL = Float.parseFloat(scan.nextLine());
		System.out.println("Vui long nhap diem hoa");
		float diemH = Float.parseFloat(scan.nextLine());
		SinhVien sv2 = new SinhVien(ten, email);
		sv2.setDiemToan(diemT);
		sv2.setDiemLy(diemL);
		sv2.setDiemHoa(diemH);
		sv2.tinhDiemTB();
		System.out.println("Ten " + sv1.getHoTen() + " - email: "+ sv1.getEmail());
		System.out.println("Ten " + sv2.getHoTen() + " - email: " + sv2.getEmail() + " DiemTb" + sv2.getDiemTB());
	}
}
