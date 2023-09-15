/*
 * mục đích: xử lí các nghiệp vụ liên quan đến Sinh Viên
 * người tạo Lộc
 * 
 * 
 * */
package Loc;

public class SinhVien {
	private String hoTen;
	private String email;
	private float diemToan;
	private float diemLy;
	private float diemHoa;
	private float diemTB;
	
	// phương thức khởi tạo mặc định không tham số
	public String getHoTen() {
		return this.hoTen;
	}
	public void setHoTen(String ten) {
		this.hoTen = ten;
	}
	public String getEmail() {
		return this.email;
	}
	public void setEmail(String mail) {
		this.email = mail;
	}
	public float getDiemToan() {
		return this.diemToan;
	}
	public void setDiemToan(float toan) {
		this.diemToan = toan;
	}
	public float getDiemLy() {
		return this.diemLy;
	}
	public void setDiemLy(float ly) {
		this.diemLy = ly;
	}
	public float getDiemHoa() {
		return this.diemHoa;
	}
	public void setDiemHoa(float hoa) {
		this.diemHoa = hoa;
	}
	public float getDiemTB() {
		return this.diemTB;
	}
	
	public SinhVien() {
		
	}
	
	
	public SinhVien(String ten, String mail) {
		this.hoTen = ten;
		this.email = mail;
	}
	public void tinhDiemTB() {
		this.diemTB = (this.diemToan + this.diemLy + this.diemHoa)/3;
	}
	

}
