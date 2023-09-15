package nguyenphuocloc;

public class TestKhachHang {

	public static void main(String[] args) {
		KhachHang teo = new KhachHang();
		teo.setMa("NV1");
		teo.setTen("Nguyen Van Teo");
		teo.setTuoi(19);
		teo.setDiaChi("Quang Nam");
		System.out.println(teo);
		KhachHang ty = new KhachHang("NV2", "Nguyen Van Ty", 20, "Quang Ngai");
		System.out.println(ty);
		teo = ty;//alias
		ty.setTen("Nguyen Can Cot");
		System.out.println(teo);
		System.out.println(ty);
		System.out.println("x = "+teo.layThongTinX());
		KhachHang an = new KhachHang();
		an.doiThongTinCuaX(100);
		System.out.println("x = " + teo.layThongTinX());
			
	}

}
