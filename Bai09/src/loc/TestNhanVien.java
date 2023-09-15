package loc;

public class TestNhanVien {

	public static void main(String[] args) {
		NhanVien teo = new NhanVienChinhThuc();
		teo.setTen("Nguyễn Văn Tèo");
		teo.setCmnd("192");
		System.out.println(teo);
		
		NhanVienChinhThuc ty = new NhanVienChinhThuc();
		ty.setTen("Trần Thị Tý");
		System.out.println(ty);
		
		teo = new NhanVienThoiVu();
		teo.setTen("Nguyễn Văn Tèo");
		System.out.println(teo);
	}

}
