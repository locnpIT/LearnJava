package loc;

public class NhanVienChinhThuc extends NhanVien {

	@Override
	public int xuatLuong() {
		
		return 5000;
	}
	public String toString() {
		return super.toString() + "===> vì là nhân viên chính thức"; 
	}
}
