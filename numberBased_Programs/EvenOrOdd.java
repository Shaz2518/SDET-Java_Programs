package numberBased_Programs;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner scr = new Scanner(System.in);
		int num = scr.nextInt();
		
		if(num % 2 ==0)
			System.out.println("The number is Even: " + num);
		else
			System.out.println("The number is ODD: " + num);

	}

}
