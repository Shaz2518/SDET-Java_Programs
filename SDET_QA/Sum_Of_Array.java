package SDET_QA;

public class Sum_Of_Array {

	public static void main(String[] args) {
		int[] arr = {5,7,1,4,0};
		int sum = 0;
		
		for(int i=0; i<arr.length;i++)
		{
			sum += arr[i];
		}

		System.out.println("Sum of Array: " + sum);
	}

}
