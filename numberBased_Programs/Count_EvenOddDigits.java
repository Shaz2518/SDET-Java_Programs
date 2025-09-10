package numberBased_Programs;

import java.util.Scanner;

public class Count_EvenOddDigits {

	public static void main(String[] args) {
		// Take a number from a user
		System.out.println("Enter a number");
		Scanner scr = new Scanner(System.in);
		int num = scr.nextInt();

		// Call Method to count digit
		getDigitCount(num);
		scr.close();

	}

	// Method for counting digits
	public static void getDigitCount(int number) {
		int evenCount = 0;
		int oddCount = 0;
		while (number != 0) {      // Loop runs until number is zero
			
			int num = number % 10; //Store remainder of a number in new variable
			if (num % 2 == 0) {	  // Divide number 2 if rem =0 (even) 
				evenCount++;
			} else {
				oddCount++;
			}
			number = number / 10; // Remove last digit from number
		}
		
		// Print count
		System.out.println("Even Count: " + evenCount + " " + "Odd Count: " + oddCount + " ");

	}

}
