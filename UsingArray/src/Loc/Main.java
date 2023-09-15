package Loc;


import java.util.Arrays;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		int[] firstArray = getRandomArray(10);
		System.out.println(Arrays.toString(firstArray));
		Arrays.sort(firstArray);
		System.out.println(Arrays.toString(firstArray));
		
		
		int[] secondArray = new int[10];
		System.out.println(Arrays.toString(secondArray));
		Arrays.fill(secondArray, 5);
		System.out.println(Arrays.toString(secondArray));
		
		int[] thirdArray = getRandomArray(10);
		System.out.println(Arrays.toString(thirdArray));
		
		System.out.println("Clone Array");
		int[] fourthArray = Arrays.copyOf(thirdArray, thirdArray.length);
		System.out.println(Arrays.toString(fourthArray));
		
		System.out.println("-".repeat(30));
		
		Arrays.sort(fourthArray);
		System.out.println(Arrays.toString(thirdArray));
		System.out.println(Arrays.toString(fourthArray));

		int[] smallerArray = Arrays.copyOf(thirdArray, 5);
		System.out.println(Arrays.toString(smallerArray));
		
		int[] biggerArray = Arrays.copyOf(thirdArray, 20);
		System.out.println(Arrays.toString(biggerArray));
		
		String[] sArray = {"B", "D", "A", "F", "E"};
		Arrays.sort(sArray);
		System.out.println(Arrays.toString(sArray));
		
		if(Arrays.binarySearch(sArray, "F") >=0) {
			System.out.println("Found F in Array");
		}
		
//		So sánh hai array
		int[] s1 = {1, 2, 3, 4, 5};
		int[] s2 = {1, 2, 3, 4, 5};
		
		if(Arrays.equals(s1, s2)) {
			System.out.println("Arrays are equal");
		}else {
			System.out.println("Arrays are not equal");
		}
	}
	
	private static int[] getRandomArray(int len) {
		Random random = new Random();
		int[] newInt = new int[len];
		for(int i = 0; i < len; i++) {
			newInt[i] = random.nextInt(100);
		}
		return newInt;
	}

}
