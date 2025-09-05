package arrayBased_Programs;

public class TwoSum_Array {

	public static void main(String[] args) {
		int[] arr = {11,7,8,2};
		int target = 10;
		
		int[] answer = new int[2];
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i] + arr[j] == target)
				{
					answer[0] = i;
					answer[1] = j;
				}
			}
		}
		System.out.println("Indices that sum up to target: " + "[" + answer[0] + "," + answer[1] + "]" );
//		
	}

}
