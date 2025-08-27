package NumberBased_Programs;

import java.util.Scanner;

public class Integer_To_Octal {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner scr = new Scanner(System.in);
		int num = scr.nextInt();
		
		//Integer.toOctalString method
		String octalNumber = Integer.toOctalString(num);
		System.out.println("Octal Number: " + octalNumber);
		
		
		//Octal Logic
		int number, sum=0, i=1, temp, rem;
		number = scr.nextInt();
		
		temp = number;
		while(temp !=0)
		{
			   
			rem = temp % 8;  // 7 
			sum = sum + i * rem; //7
			i = i*10; // 10
			temp = temp/8;  // 7
		}
		
		System.out.println("Octal Number Login: " + sum);
		scr.close();
		

	}

}
