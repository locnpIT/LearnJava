package Loc;

import java.util.Scanner;

/*
 * mục đích: quản lý nghiệp vụ hình chữ nhật
 * người tạo nguyễn phước lộc
 * version 0.0.1
 * */
public class HinhChuNhat {
	// 1. các thuộc tính
	private float chieuDai;
	private float chieuRong;
	private float chuVi;
	private float dienTich;

	// 2 các phương thức get set
	public float getChieuDai() {
		return chieuDai;
	}

	public float setChieuDai(float cDai) {
		this.chieuDai = cDai;
	}

	public float getChieuRong() {
		return chieuRong;
	}

	public float setChieuRong(float cRong) {
		this.chieuRong = cRong;
	}

	public float getChuVi() {
		return this.chuVi;
	}

	public float getDienTich() {
		return this.dienTich;
	}

	// 3. các phương thức khởi tạo
	public HinhChuNhat() {

	}

	public HinhChuNhat(float cDai, float cRong) {
		this.chieuDai = cDai;
		this.chieuRong = cRong;
	}

	// 4. các phương thức nhập xuất
	public void nhap(Scanner scan) {
		System.out.println("Nhập chiều dài");
		this.chieuDai = Float.parseFloat(scan.nextLine());

		System.out.println("Nhập chiều Rộng");
		this.chieuRong = Float.parseFloat(scan.nextLine());
	}

	public void xuat() {
		System.out.println("HCN ( " + chieuDai + "," + chieuRong + "). Diện tích " + dienTich + " Chu vi" + chuVi);

	}

	public void chuVi() {
		this.chuVi = (this.chieuDai + this.chieuRong) * 2;
	}

	public void dienTich() {
		this.dienTich = this.chieuDai * this.chieuRong;
	}

}
