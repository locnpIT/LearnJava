package nguyenphuocloc;

import java.util.StringTokenizer;

public class HocStringTokenizer {
	public static void main(String[] args)
	{
		String s = "hoc, hoc, hoc, hoc, hoc nua, hoc mai";
		StringTokenizer token = new StringTokenizer(s);
		while(token.hasMoreTokens())
		{
			System.out.println(token.nextToken());
		}
		System.out.println("=======================");
		StringTokenizer token2 = new StringTokenizer(s, ",");
		while(token2.hasMoreTokens())
		{
			System.out.println(token2.nextToken());
		}
	}
	
}
