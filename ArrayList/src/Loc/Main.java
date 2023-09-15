package Loc;

import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name, String type, int count) {
	
	public GroceryItem(String name) {
		this(name, "Dairy", 1);
	}

	@Override
	public String toString() {
		return String.format("%d %s in %s", count, name.toUpperCase(), type);
	}
	
	
	
}
public class Main {

	public static void main(String[] args) {
		GroceryItem[] groceryArray = new GroceryItem[3];
		groceryArray[0] = new GroceryItem("milk");
		groceryArray[1] = new GroceryItem("Apple", "PRODUCE", 6);
		groceryArray[2] = new GroceryItem("Orange", "PROCEDURE", 5);
		System.out.println(Arrays.toString(groceryArray));
		
		
		ArrayList<GroceryItem> groceryList = new ArrayList<>();
		groceryList.add(new GroceryItem("Butter"));
		groceryList.add(new GroceryItem("Milk"));
		groceryList.add(new GroceryItem("Orange", "Procedure", 5));
//		bây giờ muốn táo ở đầu danh sách thì chúng ta thêm index vào trước 
		groceryList.add(0, new GroceryItem("Apple", "Procedure", 9));
		groceryList.remove(1);
		System.out.println(groceryList);
		
		
		

	}

}
