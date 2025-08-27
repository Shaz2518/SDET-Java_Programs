package NumberBased_Programs;

import java.util.Scanner;

public class Palindrom_Number {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner scr = new Scanner(System.in);
		int number = scr.nextInt();
		int rev = 0, num = number;
		while (num != 0)

		{
			int temp = num % 10; // (1)2(1)
			rev = rev * 10 + temp; // (1) // 12 / 121
			num = num / 10; // (12) 1 0

		}
		System.out.println("Original Number is: " + number);
		System.out.println("Reverse of a Number is: " + rev);

		if (number == rev) {
			System.out.println("The number is Palindrom. " + number);
		} else {
			System.out.println("The number is not palindrom. " + number);
		}

		scr.close();

	}

}
