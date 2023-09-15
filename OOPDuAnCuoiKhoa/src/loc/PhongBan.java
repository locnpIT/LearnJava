/**
 * 
 */
package loc;

import java.util.ArrayList;

/**
 * @author 123
 *
 */
public class PhongBan implements NhapXuat {

//	attribute
	private String maPhongBan;
	private String tenPhongBan;
	private TruongPhong truongPhong;
	private ArrayList<NhanVienThuong> dsNhanVien;

//	get set
	public String getMaPhongBan() {
		return maPhongBan;
	}

	public void setMaPhongBan(String maPhongBan) {
		this.maPhongBan = maPhongBan;
	}

	public String getTenPhongBan() {
		return tenPhongBan;
	}

	public void setTenPhongBan(String tenPhongBan) {
		this.tenPhongBan = tenPhongBan;
	}

	public TruongPhong getTruongPhong() {
		return truongPhong;
	}

	public void setTruongPhong(TruongPhong truongPhong) {
		this.truongPhong = truongPhong;
	}

	public ArrayList<NhanVienThuong> getDsNhanVien() {
		return dsNhanVien;
	}

	public void setDsNhanVien(ArrayList<NhanVienThuong> dsNhanVien) {
		this.dsNhanVien = dsNhanVien;
	}

//	constructor
	public PhongBan() {
		this.truongPhong = null;
		this.dsNhanVien = new ArrayList<NhanVienThuong>();

	}
	public PhongBan(String maPB, String tenPB) {
		this.maPhongBan = maPB;
		this.tenPhongBan = tenPB;
		this.dsNhanVien = new ArrayList<NhanVienThuong>();
		
	}
//	input output
//	business method

	@Override
	public void xuat() {

		System.out.println("*****Đây là thông tin phòng ban*****");
		System.out.println("Tên: " + this.tenPhongBan + " Mã: " + this.maPhongBan);
		if (this.truongPhong != null) {
			System.out.println("Đây là thông tin trưởng phòng");
			this.truongPhong.xuat();
		}
		else {
			System.out.println("Phòng ban chưa có trưởng phòng");
		}
		for(NhanVienThuong nv: this.dsNhanVien) {
			nv.xuat();
		}
		System.out.println("=====End thông tin phòng ban=====");

	}

}
