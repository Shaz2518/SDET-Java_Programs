package NumberBased_Programs;

import java.util.Scanner;

public class CountNumberOfDigits {

	public static void main(String[] args) {
		// Take a number from a user
		System.out.println("Enter a number");
		Scanner scr = new Scanner(System.in);
		int num = scr.nextInt();

		// Call Method to count digit
		int digitCount = getDigitCount(num);

		// Print count
		System.out.println("The number " + num + " has " + digitCount + " digits");
	}
	
	//Method for counting digits
	public static int getDigitCount(int number) {
		int count = 0;
		while (number != 0) {	  //Loop runs until number is zero
			number = number / 10; //Remove last digit in a number
			count++;			  //count increase
		}
		return count;
	}
	

}
