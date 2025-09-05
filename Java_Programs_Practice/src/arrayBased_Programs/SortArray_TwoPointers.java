package arrayBased_Programs;

public class SortArray_TwoPointers {

	public static void main(String[] args) {
		int[] arr = {11,7,8,2,0, 1, 19, 25, 5};
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr.length-i-1; j++)
			{
				
					if(arr[j]>arr[j+1])
					{
						int temp = arr[j];
						arr[j]= arr[j+1];
						arr[j+1] = temp;
					}
				
			}
		}
		for(int i : arr)
		System.out.print(i + " ");

	}

}
