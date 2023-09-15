package nguyenphuocloc;

import java.nio.file.FileSystemNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class HocXuLiNgayThang {
//calendar thang chay tu 0 toi 11
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		int nam = cal.get(Calendar.YEAR);
		int thang = cal.get(Calendar.MONTH)+1;
		int ngay = cal.get(Calendar.DATE);
		System.out.print("Ngay thang nam hom nay la "+ngay+"/"+thang+"/"+nam);
		System.out.println("");
		Date t = cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
		System.out.println("Hom nay:"+ sdf.format(t));
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyy HH:mm:ss aaa");
		System.out.println("Hom nay:"+ sdf2.format(t));
		
				

	}

}
