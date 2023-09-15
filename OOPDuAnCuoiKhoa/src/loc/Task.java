/*
 * Mục đích: Quản lí các nghiệp vụ liên quan đến task cho Nhân Viên
 * Người tạo: Nguyễn Phước Lộc
 * Ngày tạo: 7/7/2023
 * Version 1.0
 * */

package loc;

public class Task implements NhapXuat {
//	1 attribute
	private String maTask;
	private String tenTask;
	private float gioThucHien;
	private String maNV;

//	2 get set 
	public String getMaTask() {
		return maTask;
	}

	public void setMaTask(String maTask) {
		this.maTask = maTask;
	}

	public String getTenTask() {
		return tenTask;
	}

	public void setTenTask(String tenTask) {
		this.tenTask = tenTask;
	}

	public float getGioThucHien() {
		return gioThucHien;
	}

	public void setGioThucHien(float gioThucHien) {
		this.gioThucHien = gioThucHien;
	}

	public String getMaNV() {
		return maNV;
	}

	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}

//	3 constructor
	public Task() {
		this.maNV = "-1";
	}

	public Task(String maTask, String tenTask, float gioThucHien, String maNV) {
		this.maTask = maTask;
		this.tenTask = tenTask;
		this.gioThucHien = gioThucHien;
		this.maNV = maNV;
	}
	public Task(String maTask, String tenTask, float gioThucHien) {
		this.maTask = maTask;
		this.tenTask = tenTask;
		this.gioThucHien = gioThucHien;
	}

//	4 input, output
	public void xuat() {
		System.out.println("Mã Task: " + this.maTask + " Tên task " + this.tenTask + " Giờ thực hiện : "+ this.gioThucHien);
	}
//	5 business methods

}
