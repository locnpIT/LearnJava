package nguyenphuocloc;

import java.util.ArrayList;

public class HocArrayList {

	public static void main(String[] args) {
//		ArrayList ds = new  ArrayList();
//		ds.add("x");
//		ds.add(9+"");
//		ArrayList ds2 = new ArrayList();
//		ds2.add("1.5");
		
		ArrayList ds3 = new ArrayList();
		ds3.add("Binh");
		ds3.add("An");
		ds3.add(2,"Teo"); 
		for(int i = 0; i < ds3.size();i++)
		{
			String x = ds3.get(i)+"";
			System.out.println(x);
		}
		System.out.println("=====================");
		for (Object data:ds3)
		{
			System.out.println(data);
			
		}
		ArrayList<Double> ds4 = new ArrayList<Double>();
		for(int i = 0; i < 10; i++)
		{
			ds4.add(i*2.0);
			
		}
		System.out.println("Gia tri cua danh sach 4 la");
		for(Double x: ds4)
		{
			System.out.print(x+" ");
		}
		ArrayList<Float> ds5 = new ArrayList<Float>();
		ds5.add(1.5f);
		
		
		
		

	}

}
