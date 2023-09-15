package nguyenphuocloc;

import java.util.HashMap;

public class HocHashMap {

	public static void main(String[] args) {
		HashMap<Integer, String> ds = new HashMap<Integer, String>();
		ds.put(113, "Nguyen Van Teo");
		ds.put(114, "Nguyen Phuoc Loc");
		ds.put(115, "Nguyen Van Cac");
		
		String nv = ds.get(114);
		System.out.println(nv);
		System.out.println("Danh sach nhan vien cua toan bo cong ty la");
		for(String ten: ds.values())
		{
			 System.out.println(ten);
		}
		ds.remove(115);
		System.out.println("Danh sach sau khi xoa la ");
		for(String ten: ds.values())
		{
			 System.out.println(ten);
		}
		
		

	}

}
