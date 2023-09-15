package loc;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class CongTy implements NhapXuat {

//	attribute
	private String tenCongTy;
	private String maSoThue;
	private float tongLuong;
	private DanhSachNhanSu objDSNhanSu;
	private DanhSachPhongBan objDSPhongBan;
	private DanhSachTask objDSTask;
//	get set

	public String getTenCongTy() {
		return tenCongTy;
	}

	public void setTenCongTy(String tenCongTy) {
		this.tenCongTy = tenCongTy;
	}

	public String getMaSoThue() {
		return maSoThue;
	}

	public void setMaSoThue(String maSoThue) {
		this.maSoThue = maSoThue;
	}

	public float getTongLuong() {
		return tongLuong;
	}

	public DanhSachNhanSu getObjDSNhanSu() {
		return objDSNhanSu;
	}

	public void setObjDSNhanSu(DanhSachNhanSu objDSNhanSu) {
		this.objDSNhanSu = objDSNhanSu;
	}

	public DanhSachPhongBan getObjDSPhongBan() {
		return objDSPhongBan;
	}

	public void setObjDSPhongBan(DanhSachPhongBan objDSPhongBan) {
		this.objDSPhongBan = objDSPhongBan;
	}

	public DanhSachTask getObjDSTask() {
		return objDSTask;
	}

	public void setObjDSTask(DanhSachTask objDSTask) {
		this.objDSTask = objDSTask;
	}

	// constructor
	public CongTy() {

	}
//	input output

	@Override
	public void xuat() {
		// TODO Auto-generated method stub

	}

	public void xuatNS() {
		this.objDSNhanSu.xuat();

	}

	public void xuatDSTask() {
		this.objDSTask.xuat();
	}

	public void xuatDSPhongBan() {
		this.objDSPhongBan.xuat();
	}

	public void taoDuLieu() {
		this.objDSNhanSu = new DanhSachNhanSu();
		this.objDSNhanSu.taoDuLieu();

		this.objDSPhongBan = new DanhSachPhongBan();
		this.objDSPhongBan.taoDuLieu();

		this.objDSTask = new DanhSachTask();
		this.objDSTask.taoDuLieu();
	}

	public void phanBoNhanVien() {
//		duyệt danh sách sinh viên
//		Liệt kê danh sách phòng ban
//		hỏi muốn phân bổ hay không 
//		1 phân bổ -> liệt kê danh sách phòng ban
//		chọn nhập vào mã phòng ban
//		2: đi tiếp không phân bổ
		Scanner scan = new Scanner(System.in);
		for (NhanSu ns : this.objDSNhanSu.getListNhanSu()) {
			if (ns instanceof NhanVienThuong) {

				boolean flag = true;
				do {
					System.out.println("Đang phân bổ cho nhân viên: ");
					ns.xuatTenVaMa();
					System.out.println("Chọn 1 để phân bổ, chọn 2 để đi tiếp");
					int chon = Integer.parseInt(scan.nextLine());
					switch (chon) {
					case 1:
						
						System.out.println("Đây là danh sách phòng ban");
						xuatDSPhongBan();

						System.out.println("Mời chọn >> ");
						String maPhong = scan.nextLine();
						PhongBan pb = layPhongBan(maPhong);
						if (pb != null) {
//							Gán mã phòng ban cho nhân sự này 
							ns.setMaPB(maPhong);
//							Thêm nhân sự này vào
							pb.getDsNhanVien().add((NhanVienThuong) ns);
						}
//					Thêm nhân sự này vào danh sách nhân sự của phòng ban
//					gán mã phòng ban
						flag = false;
						break;

					case 2:
						flag = false;
						break;

					default:
						System.out.println("Chỉ được chọn 1 hoặc 2");
					}

				} while (flag);
			}

		}
	}

	private PhongBan layPhongBan(String maPhong) {
		for (PhongBan pb : this.objDSPhongBan.getListPhongBan()) {
			if (pb.getMaPhongBan().equalsIgnoreCase(maPhong)) {
				return pb;
			}
		}
		return null;
	}

}
