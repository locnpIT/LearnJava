package Loc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		String[] originalArray = new String[] {
				"First", "Second", "Third"
		};
		var originalList = Arrays.asList(originalArray);
		
		originalList.set(0, "one");
		System.out.println("List : " + originalList);
		System.out.println("Array : " + Arrays.toString(originalArray));
		System.out.println("-".repeat(20));
		originalList.sort(Comparator.naturalOrder());
		System.out.println("List : " + originalList);
		System.out.println("Array : " + Arrays.toString(originalArray));
//		không thể xóa, thêm phần tử trong list này
//		originalList.remove(1);
//		originalList.add("Fourth");
		
		List<String> newList = Arrays.asList("Sunday", "Monday", "Tuesday");
		System.out.println(newList);
		System.out.println("-".repeat(20));
//		chuyển từ list sang array
		ArrayList<String> stringLists = new ArrayList<>(List.of("Jan", "Feb", "Mar"));
		String[] stringArray = stringLists.toArray(new String[0]);
		System.out.println(Arrays.toString(stringArray));
	}

}
