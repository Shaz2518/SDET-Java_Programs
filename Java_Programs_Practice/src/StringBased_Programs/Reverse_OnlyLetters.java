package Java_Programs_Practice.src.StringBased_Programs;

public class Reverse_OnlyLetters {

	public static void main(String[] args) {
		
		String str = "1a@b2ts45";
		char[] strArray = str.toCharArray();
		
		int left =0;
		int right = strArray.length -1;
		
		while(left<right) //RIGHT >LEFT --> Array has traversed completely when right passes the left.
		// 2 conditions before reversing (1- Left should be a letter 2- right should be a letter) (If true then swap)
			if(!Character.isLetter(strArray[left])) {
				left++;
			}
			else if(!Character.isLetter(strArray[right])) {
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
		
		String newString = new String(strArray);
		System.out.println(newString);
		

	}

}
