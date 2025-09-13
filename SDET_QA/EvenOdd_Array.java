package SDET_QA;

public class EvenOdd_Array {

	public static void main(String[] args) {
		int[] arr = {5,7,1,4,0,6,9,8};
		
		
		System.out.println("Even Number in Array: ");
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] % 2 ==0)
			{
				System.out.print(arr[i] + " ");
			}
			
			
		}
		System.out.println("\nOdd Number in Array: ");
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] % 2 !=0)
			{
				System.out.print(arr[i] + " ");
			}
			
			
		}
		

	}

}
