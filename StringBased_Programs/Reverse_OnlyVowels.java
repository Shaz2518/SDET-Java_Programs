package StringBased_Programs;

public class Reverse_OnlyVowels {

	public static void main(String[] args) {
		String str = "aeiou";
		char[] strArray = str.toCharArray();
		String vowels = "aeiouAEIOU";
		int left =0; int right = strArray.length-1;
		
		while(left<right)
		{
			if(vowels.indexOf(strArray[left])==-1) {
				left++;
			}
			else if(vowels.indexOf(strArray[right])==-1) {
				right--;
			}
			else
			{
				char temp = strArray[left];
				strArray[left] = strArray[right];
				strArray[right] = temp;
				left++;
				right--;
			}
			
		}
		System.out.println("Output: " + new String(strArray));
		
		

	}

}
