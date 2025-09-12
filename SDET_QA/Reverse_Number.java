package SDET_QA;

public class Reverse_Number {

	public static void main(String[] args) {
		int number = 12345;
		int rev = 0;
		
		System.out.println("Before Reverse: " + number);
		while(number>0)
		{
			int mod = number %10;
			rev = rev * 10 + mod;
			number = number/10;
		}
		
		System.out.println("After Reverse: " + rev);

	}

}
