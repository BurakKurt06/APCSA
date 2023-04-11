public class PigLatin2 {
	
	public static String t(String word) {
		String l = word.toLowerCase();
		int pos = 0; 
		char ch;

		for (int i = 0; i < l.length(); i++) {
			ch = l.charAt(i);
			if (isVowel(ch)) {
				pos = i;
				break;
				}
			}
		if (pos == 0) {
			return l + "yay"; 
			} 
		else {
			String a = l.substring(pos); 
			String b = l.substring(0, pos); 
			return a + b + "ay"; 
			}
		}
	public static Boolean isVowel(char ch) {
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'y') {
			return true;
			}
		return false;
	}
	
	public static void main(String[] args) {

		final String userInput = "My cat is cuddly";
		String[] word = userInput.split(" "); 
		String output = "";
		for (int i = 0; i < word.length; i++) {
			String pigLatinWord = t(word[i]); 
			output += pigLatinWord + " "; 
			}
		
		System.out.println("Original Word(s): " + userInput);
		System.out.println("Translation: " + output + "\n");
		}
}