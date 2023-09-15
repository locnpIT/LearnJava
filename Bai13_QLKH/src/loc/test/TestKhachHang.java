package loc.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

import loc.io.SerializableFile;
import loc.modal.KhachHang;

public class TestKhachHang {
	
	static ArrayList<KhachHang> dsKH = new ArrayList<KhachHang>();
	
	
	public static void menu() {
		System.out.println("1. Nhập khách hàng");
		System.out.println("2. Xuất khách hàng");
		System.out.println("3. Tìm kiếm khách hàng");
		System.out.println("4. Sắp xếp theo khách hàng");
		System.out.println("5. Lưu khách hàng");
		System.out.println("6. Đọc khách hàng");
		System.out.println("7. Thống kê theo nhà mạng");
		System.out.println("8. Xóa khách hàng theo mã");
		System.out.println("9. Thoát phần mềm");
		
		System.out.println("Bạn chọn chức năng [1..8]: ");
		Scanner scan = new Scanner(System.in);
		int chon = Integer.parseInt(scan.nextLine());
		
		switch(chon) {
		case 1:
			xuLyNhap();
			break;
		case 2:
			xuLyXuat();
			break;
		case 3:
			xuLyTim();
			break;
		case 4:
			xuLySapXep();
			break;
		case 5:
			xuLyLuu();
			break;
		case 6:
			xuLyDoc();
			break;
		case 7: 
			xuLyThongKe();
			break;
		case 8:
			xuLyXoaTheoMa();
			break;
		case 9:
			xuLyThoat();
			break;
		default:
			System.out.println("Chỉ được nhập giá trị từ 1 tới 9");
			break;
			
			
		
		
		
		
		}
		
		
	}

	private static void xuLyXoaTheoMa() {
		System.out.println("Mời nhập vào mã khách hàng cần xóa");
		Scanner scan = new Scanner(System.in);
		int ma = Integer.parseInt(scan.nextLine());
		int flag = 0;
		for (KhachHang kh : dsKH) {
			if(kh.getMa() == ma) {
				dsKH.remove(kh);
				flag++;
				break;
			}
		}
		if(flag != 0) {
			System.out.println("Đã xóa thành công");			
		}
		else {
			System.out.println("Không có mã nhân viên " + ma + " trong danh sách");
		}
	}

	private static void xuLyThoat() {
		System.out.println("Cảm ơn bạn đã dùng phần mềm ");
		System.exit(0);
		
	}

	private static void xuLyThongKe() {
		int dem = 0;
		for (KhachHang kh : dsKH) {
			if(kh.getPhone().startsWith("098")) {
				dem++;
			}
		}
		System.out.println("Có " + dem + " khách hàng dùng mạng viettel");
		
	}

	private static void xuLyDoc() {
		dsKH = SerializableFile.docFile("E://DuLieuHocHDT/dulieukhachhang.db");
		System.out.println("Đã đọc file thành công");
		
	}

	private static void xuLyLuu() {
		boolean kt = SerializableFile.luuFile(dsKH, "E://DuLieuHocHDT/dulieukhachhang.db");
		if(kt == true) {
			System.out.println("Đã lưu file thành công");
		}
		else {
			System.out.println("Lưu file thất bại");
		}
				
		
	}

	private static void xuLySapXep() {
		Collections.sort(dsKH);
		System.out.println("Đã sắp xếp theo tên rồi");
		
	}

	private static void xuLyTim() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Mời bạn nhập đầu số muốn tìm kiếm");
		String phone = scan.nextLine();
		System.out.println("================================");
		System.out.println("Khách hàng có đầu số" + phone);
		System.out.println("Mã \t Tên \t Phone");
		for (KhachHang kh : dsKH) {
			if(kh.getPhone().startsWith(phone)) {
				System.out.println(kh);
			}
		}
		System.out.println("================================");
		
	}

	private static void xuLyXuat() {
		System.out.println("================================");
		System.out.println("Mã \t Tên \t Phone");
		for (KhachHang kh : dsKH) {
			System.out.println(kh);
			// xuất ở đây là nó xuất trong toString
		}
		System.out.println("================================");
		
		
	}

	private static void xuLyNhap() {
		KhachHang kh = new KhachHang();
		System.out.println("Mời bạn nhập mã:");
		Scanner scan = new Scanner(System.in);
		int ma = Integer.parseInt(scan.nextLine());
		System.out.println("Mời bạn nhập tên");
		String ten = scan.nextLine();
		System.out.println("Mời bạn nhập số điện thoại");
		String phone = scan.nextLine();
		
		kh.setMa(ma);
		kh.setTen(ten);
		kh.setPhone(phone);
		
		dsKH.add(kh);
	}

	public static void main(String[] args) {
		while(true)
		{
			menu();
		}

	}

}
