package StringBased_Programs;

public class Pangram_String {

	public static void main(String[] args) {
		String str = "The quick brown fox jumps over the lazy dog";
		str = str.toLowerCase();

		boolean result = isPangram(str);
		if (result) {
			System.out.println("Its a Pangram");
		} else
			System.out.println("Its not a Pangram");
	}
	
	//Method to check Pangram
	private static boolean isPangram(String str) {
		if (str.length() < 26) {
			return false;
		}
		for (char c = 'a'; c <= 'z'; c++) {
			if (str.indexOf(c) < 0) {
				return false;
			}
		}
		return true;
	}
}
