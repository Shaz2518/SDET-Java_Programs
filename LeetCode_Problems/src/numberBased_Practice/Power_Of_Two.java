package numberBased_Practice;

import java.util.Scanner;

public class Power_Of_Two {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner scr = new Scanner(System.in);
		int number = scr.nextInt();
		if (number < 1) {
			System.out.println("The number is Negative");
		} else if (number == 1) {
			System.out.println("The number is One");
		} else {
			while (number % 2 == 0) {
				number = number / 2;

			}
			if (number == 1) {
				System.out.println("The number is a Power of Two");
			} else {
				System.out.println("The number is NOT a Power of Two");
			}
			scr.close();
		}

	}

}
