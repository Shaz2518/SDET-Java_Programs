package numberBased_Programs;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		System.out.println("Enter a number");
		Scanner scr = new Scanner(System.in);

		int num = scr.nextInt();

		// Natural number >1
		// Only 2 factors --> 1 and number itself

		int count = 0;
		// First Condition
		if (num > 1) {
			for (int i = 1; i <= num; i++) {
				if (num % i == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println("Number is Prime." + num);
			} else {
				System.out.println("Number is NOT Prime." + num);
			}
		} else {
			System.out.println("Number is NOT Prime." + num);
		}
		
		scr.close();

	}

}
