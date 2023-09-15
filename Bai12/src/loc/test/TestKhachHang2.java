package loc.test;

import java.util.ArrayList;

import loc.io.SerializableFile;
import loc.io.TextFileFactory;
import loc.model.KhachHang;

	public class TestKhachHang2 {
	public static void testLuuFile() {
		ArrayList<KhachHang> dsKH = new ArrayList<KhachHang>();
		dsKH.add(new KhachHang("KH01", "Loc"));
		dsKH.add(new KhachHang("KH02", "Ngan"));
		dsKH.add(new KhachHang("KH03", "Thinh"));

		boolean kt = SerializableFile.luuFile(dsKH, "E://dulieu2.txt");
		if (kt == true) {
			System.out.println("Luu file thanh cong");
		} else {
			System.out.println("Luu file that bai");
		}

	}

	public static void main(String[] args) {
//		testLuuFile();
		ArrayList<KhachHang> dsKH = SerializableFile.docFile("E://dulieu2.txt");
		System.out.println("Danh sach khach hang nap vao may tinh la: ");
		System.out.println("Ma\tTen");
		for (KhachHang kh : dsKH) {
			System.out.println(kh);
		}

	}

}
