package Loc;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		int[] nums = createRandomArray(10);
		System.out.println(Arrays.toString(nums));
		
		int[] sortedArray = sortInteger(new int[] {7, 30, 35});
		System.out.println(Arrays.toString(sortedArray));
		
		

	}
	
	private static int[] sortInteger(int[] array) {
		System.out.println(Arrays.toString(array));
		int[] sortedArray = Arrays.copyOf(array, array.length);
		boolean flag = true;
		int temp;
		while(flag) {
			flag = false;
			for(int i = 0; i < sortedArray.length - 1; i++) {
				if(sortedArray[i] < sortedArray[i + 1]) {
					temp = sortedArray[i];
					sortedArray[i] = sortedArray[i + 1];
					sortedArray[i + 1] = temp;
					flag = true;
					System.out.println("--->" + Arrays.toString(sortedArray));
				}
			}
			System.out.println("=" + Arrays.toString(sortedArray));
		}
		return sortedArray;
	}
	
	
	private static int[] createRandomArray(int len) {
		Random random = new Random();
		int[] newInt = new int[len];
		for(int i = 0; i < len; i++) {
			newInt[i] = random.nextInt(100); // random tu 0 den 99
		}
		return newInt;
	}

}
