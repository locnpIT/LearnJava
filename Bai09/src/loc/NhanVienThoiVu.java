package loc;

public class NhanVienThoiVu extends NhanVien {

	@Override
	public int xuatLuong() {
		return 100;
	}
	
	public String toString() {
		return super.toString() + "===> vì là nhân viên thời vụ";
	}

}
