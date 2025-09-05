package numberBased_Programs;

public class FibonacciNumber_At_nthPlace {

	public static void main(String[] args) {
		int n = 3; //fibonacci--> 0 1 1 2 3    output-3
		
		int a =0; 
		int b=1;
		int c=0, f=0;
		
		for(int i=0; i<=n; i++)
		{
			f = c;
			c= a+b;
			b=a;
			a=c;
			
			
		}
		System.out.println(f);

	}

}
