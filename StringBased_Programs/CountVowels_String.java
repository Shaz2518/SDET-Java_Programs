package StringBased_Programs;

public class CountVowels_String {

	public static void main(String[] args) {
		String str = "Hello and Welcome to Java";
		int vowelCount=0;
		
		for(int i =0; i<str.length(); i++)
		{
			if(str.charAt(i) == 'a' ||str.charAt(i) == 'e' ||str.charAt(i) == 'i' ||str.charAt(i) == 'o' ||str.charAt(i) == 'u' )
			{
				vowelCount++;
			}
		}
		System.out.println("Vowels in String are: " + vowelCount);
		

	}

}
