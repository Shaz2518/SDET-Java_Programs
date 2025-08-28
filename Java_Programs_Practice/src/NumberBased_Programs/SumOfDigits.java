package NumberBased_Programs;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner scr = new Scanner(System.in);
		int num = scr.nextInt();
		int sum = getSum(num);

		System.out.println(sum);
		scr.close();

	}

	public static int getSum(int number) {
		int rev;
		int sum = 0;
		while (number != 0) {
			rev = number % 10;
			sum = sum + rev;
			number = number / 10;
		}
		return sum;
	}
	
}
