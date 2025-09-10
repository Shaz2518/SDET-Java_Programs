package numberBased_Programs;

import java.util.Scanner;

public class ReverseAnInteger {
	public static void main(String[] args)
	{  
		System.out.println("Enter a number"); //12345
		Scanner scr = new Scanner(System.in);
		int num= scr.nextInt();
		int rev=0;
		while(num!=0)  //Loop will run till number will be zero
		{
			int last =num%10; //Last digit of number - 5 4 3
			rev = rev * 10 + last; // 0*10+5= 5 5*10+4=54 54*10+3=543..
			num=num/10;				// num = 1234 123
		}
		System.out.println(rev);
		scr.close();
	}

}
