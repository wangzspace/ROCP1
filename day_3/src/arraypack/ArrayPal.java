package arraypack;

public class ArrayPal {

	public static void main(String[] args) {
		
		// USING String
		String words[] = {"new", "noon", "madAm", "crook", "Racecar", "banana", "2002", "rotator", "repel"};
		
		System.out.println("Array of Strings:");
		for(int i = 0; i < words.length; i++) {
			System.out.print(words[i] + " ");
		}
		
		// Compare first letter with last letter, moving inwards and matching
		System.out.println("\nPalindromes found:");
		for (int i = 0; i < words.length; i++) {
			String temp = words[i].toLowerCase();
			boolean pal = true;
			for (int j = 0; j < temp.length()-1; j++) {
				if (temp.charAt(j) != temp.charAt(words[i].length()-(j+1))) {
					pal = false;
				}
			}
			if (pal) {
				System.out.print(words[i] + " ");
			}
		}
		
		System.out.println("\n");
		
		// USING StringBuffer
		StringBuffer words2[] = new StringBuffer[words.length];
		for (int i = 0; i < words.length; i++) {
			words2[i] = new StringBuffer(words[i]);
		}
		System.out.println("Array of StringBuffers:");
		for(int i = 0; i < words2.length; i++) {
			System.out.print(words2[i] + " ");
		}
		System.out.println("\nPalindromes found:");
		for(int i = 0; i < words2.length; i++) {
			String org = words2[i].toString();
			if (words2[i].reverse().toString().toLowerCase().equals(org.toLowerCase())) {
				System.out.print(words2[i] + " ");
			}
		}
		
	}

}
