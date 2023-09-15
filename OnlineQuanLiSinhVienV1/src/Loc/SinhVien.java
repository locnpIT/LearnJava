package Loc;

import java.util.Scanner;

/*
 * mục đích: quản lí các nghiệp vụ liên quan đến sinh viên
 * người tạo:Nguyễn phước Lộc
 * vesion 1.1;
 * */
public class SinhVien {
	// 1 thuộc tính
	// 3 constructor method
	// 4 input output method
	// 5 business method
	private String tenSV;
	private int maSV;
	private float diemToan;
	private float diemLy;
	private float diemHoa;
	private float diemTB;
	private String xepLoai;

	// 2 getter setter
	public String getTen() {
		return this.tenSV;
	}

	public void setTen(String ten) {
		this.tenSV = ten;
	}

	public int getMaSV() {
		return this.maSV;
	}

	public void setMaSV(int ma) {
		this.maSV = ma;
	}

	public float getDiemToan() {
		return this.diemToan;
	}

	public void setDiemToan(float diemT) {
		this.diemToan = diemT;
	}

	public float getDiemLy() {
		return this.diemLy;
	}

	public void setDiemLy(float diemL) {
		this.diemLy = diemL;
	}

	public float getDiemHoa() {
		return this.diemHoa;
	}

	public void setDiemHoa(float diemH) {
		this.diemHoa = diemH;
	}

	public float getDiemTB() {
		return diemTB;
	}

	public String getXepLoai() {
		return xepLoai;
	}

	public SinhVien() {
		// TODO Auto-generated constructor stub
	}

	public SinhVien(String tenSV, int maSV, float diemToan, float diemLy, float diemHoa) {
		this.tenSV = tenSV;
		this.maSV = maSV;
		this.diemToan = diemToan;
		this.diemLy = diemLy;
		this.diemHoa = diemHoa;
	}

	// 4. Input, output methods
	public void nhap(Scanner scan) {
		System.out.println("nhập tên");
		this.tenSV = scan.nextLine();

		System.out.println("nhập mã sinh viên");
		this.maSV = Integer.parseInt(scan.nextLine());

		System.out.println("nhập điểm Toán");
		this.diemToan = Float.parseFloat(scan.nextLine());

		System.out.println("nhập điểm Lý");
		this.diemLy = Float.parseFloat(scan.nextLine());

		System.out.println("nhập điểm Hóa");
		this.diemHoa = Float.parseFloat(scan.nextLine());
	}

	public void xuat() {
		System.out.println("Mã Sinh Vien: " + this.maSV + " Tên Sinh Viên: " + this.tenSV + " Toán: " + this.diemToan
				+ " Lý: " + this.diemLy + " Hóa: " + this.diemHoa + " Điểm Trung bình: " + this.diemTB + " Xếp loại: "
				+ this.xepLoai);
	}

	public void tinhDiemTB() {
		this.diemTB = Math.round((this.diemHoa + this.diemLy + this.diemToan) / 3);
	}

	public void xepLoai() {
		if (this.diemTB >= 9) {
			this.xepLoai = "Xuất Sắc";
		} else if (this.diemTB >= 8) {
			this.xepLoai = "Giỏi";
		} else if (this.diemTB >= 7) {
			this.xepLoai = "Khá";
		} else if (this.diemTB >= 6) {
			this.xepLoai = "Tb-Khá";
		} else if (this.diemTB >= 5) {
			this.xepLoai = "Trung Bình";
		} else {
			this.xepLoai = "Yếu";
		}
	}
}
