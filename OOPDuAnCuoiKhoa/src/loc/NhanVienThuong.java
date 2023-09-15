package loc;

public class NhanVienThuong extends NhanSu {
	final int LUONG_NGAY = 200;
	final int PHU_CAP_1 = 300;
	final int PHU_CAP_2 = 1000;
	
	
//	attribute
//	get set
//	constructor
	public NhanVienThuong() {
		super();
	}
	
	public NhanVienThuong(String maNV, String tenNV, String namSinh, String email, String soDT) {
		super(maNV, tenNV, namSinh, email, soDT);
		// TODO Auto-generated constructor stub
	}
	
	public NhanVienThuong(String maNV, String tenNV, String namSinh, String email, String soDT, String maPB,
			float soNgayLamViec) {
		super(maNV, tenNV, namSinh, email, soDT, maPB, soNgayLamViec);
		// TODO Auto-generated constructor stub
	}
//	input output
//	business method
	@Override
	public void tinhLuong() {
		
		

	}

}
