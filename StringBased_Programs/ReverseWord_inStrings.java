package StringBased_Programs;

import java.util.Scanner;

public class ReverseWord_inStrings {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String input = scr.nextLine();
		
		//Remove Space from String
		System.out.println("String Before space is: " + input);
		
		
		//Reverse a String
		String rev = "";
		for(int i=input.length()-1; i>=0; i--)
		{
			rev = rev + input.charAt(i);
		}
		System.out.println("Reverse String is: " + rev);
		
		scr.close();

	}

}
