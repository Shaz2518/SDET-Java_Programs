package numberBased_Practice;

import java.util.Scanner;

public class Fibonacci_AtNth_Place {

	public static void main(String[] args) {
		System.out.println("Enter a Number");
		Scanner scr = new Scanner(System.in);
		int num = scr.nextInt();
		int first =0, second =1;  //1st-0 2nd-1 3rd-1 4th-2 5th-3 6th-5 7th-8 8th-13 
		for(int i=1; i<=num; i++)
		{
			System.out.print(first + " ");
			
			int next = first + second;
			first = second;
			second = next;
		}
		System.out.println("\nNumber at Nth term: " + second);

	}

}
