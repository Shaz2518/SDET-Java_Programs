package numberBased_Programs;

import java.util.Scanner;

public class Leap_Year {

	public static void main(String[] args) {
		System.out.println("Enter a Year");
		Scanner scr = new Scanner(System.in);
		int year = scr.nextInt();

		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					System.out.println("Its leap year");
				} else {
					System.out.println("Its not leap year");
				}

			} else {
				System.out.println("Its leap year");
			}

		} else {
			System.out.println("Its not a leap year");
		}
		scr.close();
	}
}
