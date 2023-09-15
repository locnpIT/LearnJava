package nguyenphuocloc;

public class HocXuLiChuoi {

	public static void main(String[] args) {
		String s = "113 Nguyen Phuoc Loc";
		System.out.println("Chieu dai cua chuoi "+s.length());
		//dem xem chuoi co bao nhieu chu in hoa in thuong, so;
		char []arr = s.toCharArray();
		int soInHoa = 0, soInThuong = 0, soChuSo = 0;
		for(int i = 0; i < arr.length;i++)
		{
			char c = arr[i];
			if(Character.isUpperCase(c))
			{
				soInHoa++;
			}
			if(Character.isLowerCase(c))
			{
				soInThuong++;
			}
			if(Character.isDigit(c))
			{
				soChuSo++;
			}
			
		}
		System.out.println("chuoi co "+soInHoa+" ki tu hoa");
		System.out.println("Chuoi co "+soInThuong+" ki tu in thuong");
		System.out.println("Chuoi co "+soChuSo+" ki tu so");
	
	}

}
