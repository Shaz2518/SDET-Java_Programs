package Strings;

import java.util.Scanner;

public class PalindromString {

	public static void main(String[] args) {
		System.out.println("Enter a String");
		Scanner scr = new Scanner(System.in);
		String str = scr.nextLine();
		String rev = "";
		
		for(int i=str.length()-1; i>=0; i--)
		{
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);
		if(str.equalsIgnoreCase(rev))
		{
			System.out.println("String is palindorm");
		}
		else {System.out.println("String is not palindrom");}
		scr.close();
	}

}
