package numberBased_Programs;

import java.util.Scanner;

public class Factorial_Number {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner scr = new Scanner(System.in);
		int number=scr.nextInt();
		int fact =1;
		for(int i=1; i<=number; i++)
		{
			fact = fact*i;
		}
		
		System.out.println("Factorial: " + fact);
		scr.close();

	}

}
