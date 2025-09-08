package StringBased_Programs;

import java.util.Scanner;

public class Palindrom_String {

	public static void main(String[] args) {
		System.out.println("Enter a String");
		Scanner scr = new Scanner(System.in);
		
		String str = scr.nextLine();
		
		if(isPalindrom(str))
		{
			System.out.println("String is Palindrom: " + str);
		}
		else
		{
			System.out.println("String is not a Palindrom: " + str);
		}
		scr.close();

	}
	
	//2 pointer method
	
	public static boolean isPalindrom(String strng)
	{
		strng = strng.replaceAll("\\s", "").toLowerCase();
		int left=0;
		int right= strng.length()-1;
		while(left<right)
		{
			if(strng.charAt(left) != strng.charAt(right))
				return false;
			
			left++;
			right--;
		}
		
		return true;
		
	}
	

}
