package arrayBased_Programs;

import java.util.Arrays;

public class MinMax_Array {

	public static void main(String[] args) {
		int[] arr = { 5, 6, 2, 1, 3 };
		Arrays.sort(arr);
		

		int min = arr[0];
		int max = arr[arr.length-1];
		
		System.out.println("Min: " + min + " " + "Max: " +  max);
		
		
	}

}
