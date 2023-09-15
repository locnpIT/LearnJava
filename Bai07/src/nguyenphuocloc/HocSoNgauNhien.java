package nguyenphuocloc;

import java.util.Random;

public class HocSoNgauNhien {

	public static void main(String[] args) {
		int []M = new int[10];
		Random rd = new Random();
		for(int i = 0; i < M.length; i++)
		{
			M[i] = -50+rd.nextInt(101);
		}
		for(int i = 0; i < M.length; i++)
		{
			System.out.print(M[i]+"  ");
		}
	}

}
