package StringBased_Programs;

public class LengthOfLastWord_String {

	public static void main(String[] args) {
		String str = "Hello and Welcom to Java    Training   ";
		
		String[] s = str.split(" ");
		String last="";
		
		for(int i=0; i<s.length; i++)
		{
			last= s[s.length-1].trim();
		}
		int countLast= last.length();
		
		System.out.println(countLast);
		
		


	}

}
