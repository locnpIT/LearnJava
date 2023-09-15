package Loc;

import java.util.Scanner;

public class CaseStudyPhim {

	public static void main(String[] args) {
		
		String tenPhim;
		int giaVeLon;
		int giaVeNho;
		int soVeLon;
		int soVeNho;
		int phanTramTuThien;
		float tongThu;
		float tuThien;
		float conLai;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Vui long nhap ten phim");
		tenPhim = scan.nextLine();
		System.out.println("Vui long nhap gia ve nguoi lon");
		giaVeLon = Integer.parseInt(scan.nextLine());
		System.out.println("Vui long nhap gia ve nguoi nho");
		giaVeNho = Integer.parseInt(scan.nextLine());
		System.out.println("Vui long nhap so ve nguoi lon da ban");
		soVeLon = Integer.parseInt(scan.nextLine());
		System.out.println("Vui long nhap so ve nguoi Nho da ban");
		soVeNho = Integer.parseInt(scan.nextLine());
		System.out.println("Vui long nhap phan tram tu thien");
		phanTramTuThien = Integer.parseInt(scan.nextLine());
		
		tongThu = giaVeLon * soVeLon + giaVeNho * soVeNho;
		tuThien = (phanTramTuThien*1.0f) / 100 * tongThu;
		conLai = tongThu - tuThien;
		
		
		String text = String.format("%-50s", "Ten-Phim:").replace(' ', '.').replace('-', ' ');
		System.out.println(text + tenPhim);
		
		text = String.format("%-50s", "So-ve-da-ban:").replace(' ', '.').replace('-', ' ');
		System.out.println(text + (soVeLon + soVeNho));
		
		text = String.format("%-50s", "Doanh-Thu").replace(' ', '.').replace('-', ' ');
		System.out.println(text + tongThu);
		
		text = String.format("%-50s", "Trich-phan-tram-tu-thien:").replace(' ', '.').replace('-', ' ');
		System.out.println(text + phanTramTuThien + "%");
		
		text = String.format("%-50s", "Tong-tien-trich-tu-thien:").replace(' ', '.').replace('-', ' ');
		System.out.println(text + tuThien);
		
		text = String.format("%-50s", "Tong-tien-thu-duoc-sau-khi-tru").replace(' ', '.').replace('-', ' ');
		System.out.println(text + conLai);
		
		
		
		
		
		
		
	}

}
