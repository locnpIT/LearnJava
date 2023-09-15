package loc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class DanhSachPhongBan implements NhapXuat {

	private ArrayList<PhongBan> listPhongBan;

//	getter setter
	public ArrayList<PhongBan> getListPhongBan() {
		return listPhongBan;
	}

	public void setListPhongBan(ArrayList<PhongBan> listPhongBan) {
		this.listPhongBan = listPhongBan;
		
	}
	
//	constructor
	public DanhSachPhongBan() {
		this.listPhongBan = new ArrayList<PhongBan>();

	}

	@Override
	public void xuat(){
		for (PhongBan pb : listPhongBan) {
			pb.xuat();
		}

	}
	
	public void taoDuLieu() {
		try {
			FileReader reader = new FileReader("src/PhongBan.txt");
			BufferedReader bufferedReader = new BufferedReader(reader);
			
			String line;
			
			while((line = bufferedReader.readLine()) != null) {
//				System.out.println(line);
				String[] listInfo = line.split(" # ");
				PhongBan pb = new PhongBan(listInfo[0], listInfo[1]);
				this.listPhongBan.add(pb);
			}
			reader.close(); //đóng tập tin
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
