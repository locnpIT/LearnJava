package loc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class DanhSachNhanSu implements NhapXuat {

	private ArrayList<NhanSu> listNhanSu;

	public ArrayList<NhanSu> getListNhanSu() {
		return listNhanSu;
	}

	public void setListNhanSu(ArrayList<NhanSu> listNhanSu) {
		this.listNhanSu = listNhanSu;
	}

//	constructor
	public DanhSachNhanSu() {
		this.listNhanSu = new ArrayList<NhanSu>();
	}

	@Override
	public void xuat() {
		for (NhanSu ns : this.listNhanSu) {
			ns.xuat();
		}
	}

	public void taoDuLieu() {
		try {
			FileReader reader = new FileReader("src/DSSV.txt");
			BufferedReader bufferedReader = new BufferedReader(reader);
			
			String line;
			
			while((line = bufferedReader.readLine()) != null) {
//				System.out.println(line);
				String[] listInfo = line.split(" # ");
				NhanSu ns;
				if(listInfo[listInfo.length - 1].equalsIgnoreCase("true")) {
					ns = new TruongPhong();
							
				}else {
					ns = new NhanVienThuong();
				}
//				tạo dữ liệu cho nhân sự
				ns.setMaNV(listInfo[0]);
				ns.setTenNV(listInfo[1]);
				ns.setNamSinh(listInfo[2]);
				ns.setEmail(listInfo[3]);
				ns.setSoDT(listInfo[4]);
//				Thêm nhân sự vào list
				this.listNhanSu.add(ns);
			}
			reader.close(); //đóng tập tin
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
