package StringBased_Programs;

import java.util.Scanner;

public class ReverseString_RemoveSpace {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String input = scr.nextLine();
		
		//Remove Space from String
		System.out.println("String Before space is: " + input);
		String replace = input.replace(" ", "");
		System.out.println("String without space is: " + replace);
		
		
		String rev = "";
		for(int i=replace.length()-1; i>=0; i--)
		{
			rev = rev + replace.charAt(i);
		}
		System.out.println("Reverse String is: " + rev);
		
		scr.close();

	}

}
