package NumberBased_Programs;

import java.util.Scanner;

public class Swap2Integers_NoTemp {

	public static void main(String[] args) {
		System.out.println("Enter 2 numbers");
		Scanner scr = new Scanner(System.in);
		int num1 = scr.nextInt();
		int num2 = scr.nextInt();

		//Print number before swap
		System.out.println("Before Swap: " + num1 + " " + num2);

		// Call a method of swap
		swapNumbers(num1, num2);
}

	// Create a method to swap
	public static void swapNumbers(int a, int b) {
		a = a + b; // a=5 b=2 a=7
		b = a - b; // a=7 b=2 b=5
		a = a - b; // a=7 b=5 a=2
		System.out.println("After Swap: " + a + " " + b);
	}

}
