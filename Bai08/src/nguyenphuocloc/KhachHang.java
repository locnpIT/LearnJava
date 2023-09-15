package nguyenphuocloc;

public class KhachHang {
	private String ma;
	private String ten;
	private int tuoi;
	private String diaChi;
	private static double x;
	
	public void doiThongTinCuaX(int gtmoi) 
	{
		x = gtmoi;
	}
	public double layThongTinX()
	{
		return x;
	}
	
	
	public String getMa()
	{
		return this.ma;
	}
	public void setMa(String ma)
	{
		this.ma = ma;
	}
	public String getTen()
	{
		return this.ten;
	}
	public void setTen(String ten)
	{
		this.ten = ten;
	}
	public int getTuoi()
	{
		return this.tuoi;
	}
	public void setTuoi(int tuoi)
	{
		this.tuoi = tuoi;
	}
	public String getDiaChi()
	{
		return this.diaChi;
	}
	public void setDiaChi(String diaChi)
	{
		this.diaChi = diaChi;
	}
	public KhachHang()
	{
		System.out.println("Constructor tu dong mac dinh duoc goi");	
	}
	public KhachHang(String ma, String ten, int tuoi, String diaChi)
	{
		this.ma = ma;
		this.ten = ten;
		this.tuoi = tuoi;
		this.diaChi = diaChi;
	}
	@Override
	public String toString() {
		return this.ma+"|"+this.ten+"|"+this.tuoi+"|"+this.diaChi;
		
	}
}
