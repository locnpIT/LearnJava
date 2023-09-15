package nguyenphuocloc;

import java.text.DecimalFormat;

public class HocXuLiDinhDangSo {

	public static void main(String[] args) {
		double toan = 5;
		double ly = 6;
		double hoa = 9;
		double dtb = (toan+ly+hoa)/3;
		System.out.println("Diem trung binh = "+ dtb);
		DecimalFormat dcf = new DecimalFormat("#.##");
		System.out.println("Diem trung binh = "+dcf.format(dtb));

	}

}
