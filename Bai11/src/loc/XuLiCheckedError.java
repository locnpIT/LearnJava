package loc;

public class XuLiCheckedError {

	public static void main(String[] args) {
		try {
			int x = 1/0;
			System.out.println("Đây là lỗi thực thi");
			
		}catch(Exception ex) {
//			xuất chi tiết lỗi
			ex.printStackTrace();
		}
		System.out.println("Tạm biệt");

	}

}
