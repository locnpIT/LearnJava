package nguyenphuocloc;

public class HocXuLyStringBuilder {

	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder();
		
		for(int i = 0; i < 100 ;i++)
		{
			builder.append("Phan tu thu  "+i);
			builder.append("\n");
		}
		System.out.println(builder.toString());
		
	}

}
