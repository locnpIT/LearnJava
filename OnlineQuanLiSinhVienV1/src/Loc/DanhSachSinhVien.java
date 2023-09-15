/*
 * Mục đích: tạo ra để quản lí danh sách nhiều sinh viên
 * Người tạo: Nguyễn Phước Lộc
 * Version 1.0
 * */
package Loc;

import java.util.ArrayList;
import java.util.Scanner;										

public class DanhSachSinhVien {
//	1 thuộc tính
	private ArrayList<SinhVien> listSV;

//	2 get set methods
	public ArrayList<SinhVien> getListSV() {
		return listSV;
	}

	public void setListSV(ArrayList<SinhVien> listSV) {
		this.listSV = listSV;
	}

//	3 constructor method
	public DanhSachSinhVien() {
		thietLapDefault();

	}

//	hàm này dùng để khởi động các list và các giá trị mặc định cho lớp
	private void thietLapDefault() {
		this.listSV = new ArrayList<SinhVien>();
	}

//	4 input output method
	public void nhap(Scanner scan) {
		for (SinhVien sv : this.listSV) {
			sv.nhap(scan);
		}
	}

	public void themSinhVien(SinhVien sv) {
		this.listSV.add(sv);
	}

	public void xuat() {
		for (SinhVien sv : this.listSV) {
			sv.xuat();
		}
	}

//	5 Business method
	public void tinhDTB() {
		for (SinhVien sv : this.listSV) {
			sv.tinhDiemTB();
		}
	}

	public void xepLoai() {
		for (SinhVien sv : this.listSV) {
			sv.xepLoai();
		}
	}

	public ArrayList<SinhVien> timDSSVCoDTBCaoNhat() {
		ArrayList<SinhVien> list = new ArrayList<SinhVien>();
		if (this.listSV.size() > 0) {
			SinhVien svMax = this.listSV.get(0);
			for (SinhVien svCurrent : this.listSV) {
				if (svCurrent.getDiemTB() > svMax.getDiemTB()) {
					svMax = svCurrent;
				}
			}
//		đã tìm thấy svMax
			for (SinhVien svCurrent : this.listSV) {
				if (svCurrent.getDiemTB() == svMax.getDiemTB()) {
					list.add(svCurrent);
				}
			}

		}
		return list;
	}

	public ArrayList<SinhVien> timDSSVCoDTBCaoNhatToiUu() {
		ArrayList<SinhVien> list = new ArrayList<SinhVien>();
		if (this.listSV.size() > 0) {
			int viTriMaxDauTien = 0;
			SinhVien svMax = this.listSV.get(0);
			for (int i = 0; i < this.listSV.size(); i++) {
				SinhVien svCurrent = this.listSV.get(i);
				if (svCurrent.getDiemTB() > svMax.getDiemTB()) {
					svMax = svCurrent;
					viTriMaxDauTien = i;
				}
			}
//			thêm svmax đầu tiên vào list
			list.add(svMax);
//		đã tìm thấy svMax
			for (int i = viTriMaxDauTien + 1; i < this.listSV.size(); i++) {
				SinhVien svCurrent = this.listSV.get(i);
				if (svCurrent.getDiemTB() == svMax.getDiemTB()) {
					list.add(svCurrent);
				}
			}

		}
		return list;
	}

	public ArrayList<SinhVien> lietKeDSSVYeu() {
		ArrayList<SinhVien> listYeu = new ArrayList<SinhVien>();
		if (this.listSV.size() > 0) {
			for (SinhVien sv : this.listSV) {
				if (sv.getDiemTB() < 5) {
					listYeu.add(sv);
				}
			}
		}
		return listYeu;
	}
	
	public ArrayList<SinhVien> timSVTheoTen(String ten){
		ArrayList<SinhVien> list = new ArrayList<SinhVien>();
		list = null;
		for (SinhVien sv : this.listSV) {
			if(sv.getTen().equalsIgnoreCase(ten)) {
				list.add(sv);
			}
		}
		return list;
	}
	public SinhVien timSVTheoMa(int ma){
		SinhVien sv = new SinhVien();
		sv = null;
		for (SinhVien sv1 : this.listSV) {
			if(sv1.getMaSV() == ma) {
				sv = sv1;
				break; //đã tìm thấy rồi, thoát khỏi vòng lặp
			}	
		}		
		return sv;
	}
	public boolean xoaSVTheoMa(int ma) {
		boolean deleted = false; // chua xoa
		for (SinhVien sv1 : this.listSV) {
			if(sv1.getMaSV() == ma) {
				this.listSV.remove(sv1);
				deleted = true; // da xoa thanh cong
				break;
			}
		}
		return deleted;
	}

}
