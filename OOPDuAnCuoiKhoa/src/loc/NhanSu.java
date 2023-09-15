package loc;

import java.util.ArrayList;

public abstract class NhanSu implements NhapXuat {

//	1. Attribute
	protected String maNV;
	protected String tenNV;
	protected String namSinh;
	protected String email;
	protected String soDT;
	protected String maPB;
	protected DanhSachTask objDSTask;
	protected float luong;
	protected float soNgayLamViec;

//	2. get set

	public String getMaNV() {
		return maNV;
	}

	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}

	public String getTenNV() {
		return tenNV;
	}

	public void setTenNV(String tenNV) {
		this.tenNV = tenNV;
	}

	public String getNamSinh() {
		return namSinh;
	}

	public void setNamSinh(String namSinh) {
		this.namSinh = namSinh;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSoDT() {
		return soDT;
	}

	public void setSoDT(String soDT) {
		this.soDT = soDT;
	}

	public String getMaPB() {
		return maPB;
	}

	public void setMaPB(String maPB) {
		this.maPB = maPB;
	}

	public DanhSachTask getDSTask() {
		return objDSTask;
	}

	public void setDSTask(DanhSachTask dsTask) {
		this.objDSTask = dsTask;
	}

	public float getLuong() {
		return luong;
	}

	public float getSoNgayLamViec() {
		return soNgayLamViec;
	}

	public void setSoNgayLamViec(float soNgayLamViec) {
		this.soNgayLamViec = soNgayLamViec;
	}

	// 3. constructor
//	thiết lập giá trị mặc định
	private void init() {
		this.maPB = "-1";
		
	}
	public NhanSu() {
		init();

	}

	public NhanSu(String maNV, String tenNV, String namSinh, String email, String soDT) {
		init();
		this.maNV = maNV;
		this.tenNV = tenNV;
		this.namSinh = namSinh;
		this.email = email;
		this.soDT = soDT;
	}

	public NhanSu(String maNV, String tenNV, String namSinh, String email, String soDT, String maPB,
			float soNgayLamViec) {
		init();
		this.maNV = maNV;
		this.tenNV = tenNV;
		this.namSinh = namSinh;
		this.email = email;
		this.soDT = soDT;
		this.maPB = maPB;
		this.soNgayLamViec = soNgayLamViec;
	}
//	4. input output
	public void xuat() {
		String temp = this.maPB;
		if(this.maPB.equalsIgnoreCase("-1")) {
			temp = "Chưa phân bổ";
		}
		System.out.println("Mã: " + this.maNV + " Tên: " + this.tenNV + " Năm Sinh: "
				+ this.namSinh + " Email: " + this.email + " SĐT: " + this.soDT
				+ " Mã phòng ban: " + temp + " Số ngày làm: " + this.soNgayLamViec
				+ " Lương: " + this.luong);
	}
	
	
//	5. Business methods
	public void xuatTenVaMa() {
		System.out.println("Mã: " + this.maNV + " Tên: " + this.tenNV);
	}
	public abstract void tinhLuong();

}
