package StringBased_Programs;

import java.util.HashMap;

public class OccurenceOfLetters {

	public static void main(String[] args) {
		String str = "Java"; // m-2 a-2 d=1

		// Converting string to chracter array for traversing
		char[] strArray = str.toCharArray();

		// Hashmap to store character and integer(occurence)
		HashMap<Character, Integer> occurenceMap = new HashMap<Character, Integer>();

		// Traversing each character in array
		for (char ch : strArray) {
			// If character is present (return O +1)
			occurenceMap.put(ch, occurenceMap.getOrDefault(ch, 0) + 1);

		}

		for (char character : occurenceMap.keySet()) {
			System.out.println(character + " " + occurenceMap.get(character));
		}

	}

}
