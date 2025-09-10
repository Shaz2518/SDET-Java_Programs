package StringBased_Programs;

public class ReplaceVowels_X {

	public static void main(String[] args) {
		String str = "java";
		String strLower = str.toLowerCase();
		char[] ch = strLower.toCharArray();
		StringBuilder sb = new StringBuilder();
		
		for(char c : ch)
		{
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
			{
				sb.append('X');
			}
			else
			{
				sb.append(c);
			}
		}
		System.out.println("Output: " + new String(sb));
		

	}

}
