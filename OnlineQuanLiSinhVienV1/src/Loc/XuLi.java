package Loc;

import java.util.ArrayList;
import java.util.Scanner;

public class XuLi {

	public XuLi() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DanhSachSinhVien ds = new DanhSachSinhVien();
		TruongHoc truong = new TruongHoc();
		truong.nhap();// tạo giả sinh viên ở phương thức nhap() của trường;
		doMenu(truong);
	}

	private static void inMenu() {
		System.out.println("Vui lòng thực hiện");
		System.out.println("1. Thêm sinh viên");
		System.out.println("2. Xuất danh sách các sinh viên");
		System.out.println("3. Liệt kê danh sách sinh viên có điểm trung bình cao nhất");
		System.out.println("4. Liệt kê danh sách sinh viên có học lực yếu");
		System.out.println("5. Tìm danh sách sinh viên theo tên");
		System.out.println("6. Tìm sinh viên theo mã");
		System.out.println("7. Xóa sinh viên theo mã");
		System.out.println("0. Thoát");
	}

	private static void doMenu(TruongHoc truong) {
		boolean flag = true;
		Scanner scan = new Scanner(System.in);
		do {
			inMenu();
			System.out.print("Mời chọn");
			int chon = Integer.parseInt(scan.nextLine());
			switch (chon) {
			case 1:
				SinhVien sv = new SinhVien();
				sv.nhap(scan);
				truong.themSinhVien(sv);
				break;
			case 2:
				truong.tinhDTB();
				truong.xepLoai();
				truong.xuat();
				break;
			case 3:
				ArrayList<SinhVien> list = truong.timDSSVCoDTBCaoNhat();
//				for (SinhVien sv1 : list) {
//					sv1.xuat();
//				}
				truong.xuatHelper(list);
				break;
			case 4:
				ArrayList<SinhVien> listYeu = truong.lietKeDSSVYeu();
//				for (SinhVien sv2 : listYeu) {
//					sv2.xuat();
//				}
				truong.xuatHelper(listYeu);
				break;
			case 5:
//				System.out.println("Nhap vao ten sinh vien");
//				String ten = scan.nextLine();
//				ArrayList<SinhVien> listTim = truong.timSVTheoTen(ten);
//				for (SinhVien sv2 : listTim) {
//					sv2.xuat();
//				}
				System.out.println("Vui long nhap sinh vien can tim");
				String ten = scan.nextLine();
				ArrayList<SinhVien> listTen = truong.timSVTheoTen(ten);
				if(listTen != null) {
					truong.xuatHelper(listTen);					
				}
				else if(listTen == null){
					System.out.println("Khong tim thay ten sinh vien " + ten);
				}
				break;
			case 6:
				System.out.println("Nhap ma sinh vien");
				int ma = Integer.parseInt(scan.nextLine());
				SinhVien svFound = truong.timSVTheoMa(ma);
				if(svFound != null) {
					svFound.xuat();					
				}
				else {
					System.out.println("Khong co sinh vien co ma la "+ ma);
				}
				break;
			case 7:
				System.out.println("Nhap ma sinh vien");
				int maXoa = Integer.parseInt(scan.nextLine());
				boolean deleted = truong.xoaSVTheoMa(maXoa);
				if(deleted == true) {
					System.out.println("Xoa thanh cong");
				}
				else {
					System.out.println("Xoa khong thanh cong");
				}
				break;
			case 0:
				flag = false;
				System.out.println("Cảm ơn bạn đã dùng hệ thống");
				break;

			default:
				System.out.println("Bạn đã nhập dữ liệu ngoài giá trị cho phép");
			}
		} while (flag);

	}

}
