package loc;

public class NhanVien implements Comparable<NhanVien> {
	private int ma;
	private String ten;

	public int getMa() {
		return ma;
	}

	public void setMa(int ma) {
		this.ma = ma;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public NhanVien(int ma, String ten) {
		super();
		this.ma = ma;
		this.ten = ten;
	}


	// =0 => bằng nhau
//	>0 => đối tượng 1 > đối tượng 2
//	<0 => đối tượng 2 > đối tượng 1
	@Override
	public int compareTo(NhanVien o) {
		
		int ssTen = this.ten.compareToIgnoreCase(o.getTen());
		if(ssTen == 0) {
//			nếu tên trùng nhau thì sắp xếp giảm dần số thứ tự
			if(this.ma == o.ma) {
				return 0;	
			}
			if(this.ma > o.ma) {
				return -1;
			}
			return 1;
		}
		return ssTen;
		
	}

}
