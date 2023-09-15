package Loc;

import java.util.ArrayList;

/*
 * mục đích: quản lí toàn bộ nghiệp vụ cho trường học
 * version 1.0
 * 
 * */
public class TruongHoc {
// 1. attribute
	private DanhSachSinhVien dssvToanTruong;

	// 2. get, set methods
	public DanhSachSinhVien getDssvToanTruong() {
		return dssvToanTruong;
	}

	public void setDssvToanTruong(DanhSachSinhVien dssvToanTruong) {
		this.dssvToanTruong = dssvToanTruong;
	}

//		3.constructors
	public TruongHoc() {
		this.dssvToanTruong = new DanhSachSinhVien();
	}

//		4.input output
	public void nhap() {
		SinhVien sv = new SinhVien("Loc", 1, 9.2f, 9, 9);
		this.dssvToanTruong.themSinhVien(sv);

		sv = new SinhVien("Ngan", 2, 9.3f, 8, 7);
		this.dssvToanTruong.themSinhVien(sv);

		sv = new SinhVien("Truong", 3, 4.2f, 4, 3);
		this.dssvToanTruong.themSinhVien(sv);

		sv = new SinhVien("Tu", 4, 4.2f, 2, 3);
		this.dssvToanTruong.themSinhVien(sv);

		sv = new SinhVien("Hung", 5, 8.2f, 10, 10);
		this.dssvToanTruong.themSinhVien(sv);

		sv = new SinhVien("Ly", 6, 4.2f, 3, 5);
		this.dssvToanTruong.themSinhVien(sv);

		sv = new SinhVien("Huu", 7, 8.2f, 10, 10);
		this.dssvToanTruong.themSinhVien(sv);

		sv = new SinhVien("Tu", 8, 4.2f, 2, 3);
		this.dssvToanTruong.themSinhVien(sv);
	}

	public void xuat() {
		this.dssvToanTruong.xuat();
	}

//		5 business method
	public void themSinhVien(SinhVien sv) {
		this.dssvToanTruong.themSinhVien(sv);
	}

	public void tinhDTB() {
		this.dssvToanTruong.tinhDTB();
	}

	public void xepLoai() {
		this.dssvToanTruong.xepLoai();
	}

	public ArrayList<SinhVien> timDSSVCoDTBCaoNhat() {
		return this.dssvToanTruong.timDSSVCoDTBCaoNhatToiUu();
	}

	public ArrayList<SinhVien> lietKeDSSVYeu() {
		return this.dssvToanTruong.lietKeDSSVYeu();
	}

	public void xuatHelper(ArrayList<SinhVien> list) {
		for (SinhVien sv : list) {
			sv.xuat();
		}
	}
	public ArrayList<SinhVien> timSVTheoTen(String tenSV){
//		ArrayList<SinhVien> list = new ArrayList<SinhVien>();
//		for (SinhVien sv : dssvToanTruong.getListSV()) {
//			if(sv.getTen().equalsIgnoreCase(tenSV)) {
//				list.add(sv);
//			}
//		}
//		return list;
		return dssvToanTruong.timSVTheoTen(tenSV);
	}
	public SinhVien timSVTheoMa(int ma) {
		return dssvToanTruong.timSVTheoMa(ma);
	}
	
	public boolean xoaSVTheoMa(int ma){
		return dssvToanTruong.xoaSVTheoMa(ma);
	}
	
	
	
}
