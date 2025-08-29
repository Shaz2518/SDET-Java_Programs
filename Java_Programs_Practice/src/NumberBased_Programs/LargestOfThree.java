package numberBased_Programs;

import java.util.Scanner;

public class LargestOfThree {

	public static void main(String[] args) {
		
		Scanner scr = new Scanner(System.in);
		
		//First number
		System.out.println("Enter First Number");
		int num1 = scr.nextInt();
		
		//First number
		System.out.println("Enter Second Number");
		int num2 = scr.nextInt();
				
		//First number
		System.out.println("Enter Third Number");
		int num3 = scr.nextInt();
		
		
		//Verify largest number by if-else loop
		
		//If first number is greater
		if(num1 > num2 && num1 > num3)
		{
			System.out.println("First Number is Largest: " + num1);
		}
		
		//If second number is largest
		else if(num2 > num1 && num2 > num3)
		{
			System.out.println("Second Number is Largest: " + num2);
		}
		
		//If third number is largest
		else
		{
			System.out.println("Third Number is Largest: " + num3);
		}
	}
	

}
