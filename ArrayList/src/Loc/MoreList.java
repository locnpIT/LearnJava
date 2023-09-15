package Loc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MoreList {

	public static void main(String[] args) {
		String[] item = {"Apple", "Bananas", "milk", "eggs"};
		List<String> list = List.of(item);
		
		System.out.println(list);
		System.out.println(list.getClass().getName());
		ArrayList<String> groceries = new ArrayList<>(list);
		groceries.add("yogurt");
		System.out.println(groceries);
		
		ArrayList<String> nextList = new ArrayList<>(
				List.of("pickles", "mustard", "cheese")
				);
		// phương thức addAll là add tất cả các phần tử của 1 list vào 1 list khác
		groceries.addAll(nextList);
		System.out.println(groceries);
		System.out.println("Third item = " + groceries.get(2));
		
		if(groceries.contains("mustard")) {
			System.out.println("List contain mustard");
		}
		
		groceries.add("yogurt");
		System.out.println("First = " + groceries.indexOf("yogurt"));
		System.out.println("Last = " + groceries.lastIndexOf("yogurt"));
		
		System.out.println(groceries);
		groceries.remove(1);
		System.out.println(groceries);
		groceries.remove("yogurt");
		System.out.println(groceries);
	
		groceries.removeAll(List.of("Apple" ,"eggs"));
		System.out.println(groceries);
		
		// retainAll giữ lại các phần tử được liệt kê, còn lại xóa hết
		groceries.retainAll(List.of("Apple", "milk", "mustard", "cheese"));
		System.out.println(groceries);
		// clear xóa hết toàn bộ arraylist
		groceries.clear();
		System.out.println(groceries);
		System.out.println("Is empty : " + groceries.isEmpty());
		
		// addAll thêm tất cả các phần tử vào list
		groceries.addAll(List.of("Apple", "milk", "mustard", "cheese"));
		groceries.addAll(Arrays.asList("eggs", "pickles", "mustard", "ham"));
		System.out.println(groceries);
//		sắp xếp theo bảng chữ cái abcd
		groceries.sort(Comparator.naturalOrder());
		System.out.println(groceries);
//		sắp xếp ngược theo bảng chữ cái cba
		groceries.sort(Comparator.reverseOrder());
		System.out.println(groceries);
//		chuyển từ danh sách sang mảng
		var groceryArray = groceries.toArray(new String[groceries.size()]);
		System.out.println(Arrays.toString(groceryArray));
		
		
		
	}

}
