package numberBased_Programs;

import java.util.Scanner;

public class PalindromNumber_NegativeInteger {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scr.nextInt();
		
		char[] str = String.valueOf(num).toCharArray();
		String rev ="";
		
		System.out.println(str);
		
		for(int i=str.length-1; i>0; i--)
		{
			rev = rev + str[i];
		}
		System.out.println(rev);

	}

}
