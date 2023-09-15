package nguyenphuocloc;

public class HocOverloading {

	public static int fn(int x, int y)
	{
		return x+y;
	}
	public static double fn(double x, double y)
	{
		return x + y;
	}
//	parameter list
	public static int fn4(int ...arr)
	{
		int sum = 0;
		for(int x:arr)
		{
			sum +=x;
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println(fn(1, 1));
		System.out.println(fn(1.1,1.2));
		System.out.println(fn4(1, 2, 3));
		System.out.println(fn4(1, 2, 3, 4));
	}

}
