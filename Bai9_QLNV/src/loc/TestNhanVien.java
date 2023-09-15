package loc;

import java.util.ArrayList;
import java.util.Collections;

public class TestNhanVien {

	public static void main(String[] args) {
		ArrayList<NhanVien> ds = new ArrayList<NhanVien>();
		ds.add(new NhanVien(5, "Lộc"));
		ds.add(new NhanVien(1, "Ngân"));
		ds.add(new NhanVien(4, "Thịnh"));
		ds.add(new NhanVien(3, "Nhung"));
		ds.add(new NhanVien(2, "Cường"));
		ds.add(new NhanVien(6, "Ngân"));
		
		System.out.println("Danh sách nhân viên của công ty");
		for (NhanVien nhanVien : ds) {
			System.out.println(nhanVien.getMa() + "  " +  nhanVien.getTen());
		}
		
		Collections.sort(ds);
		
		System.out.println("Danh sách nhân viên của công ty đã được sắp xếp");
		for (NhanVien nhanVien : ds) {
			System.out.println(nhanVien.getMa() +"  "+ nhanVien.getTen());
		}
		
		

	}

}
