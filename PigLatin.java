//Angelina Gu and Burak Kurt
//Period 2

public class PigLatin {
	String s;
	public PigLatin (String statement) {
		s = statement.toLowerCase();
	}
	
	public String transform() {	
		String a = "";
		int startIndex = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				int spaceIndex = i;
				String f = s.substring(startIndex, spaceIndex);
				a += change(f) + " ";
				startIndex = spaceIndex + 1;
			}
			
			else if (i == s.length() - 1) {
				String f = s.substring(startIndex, s.length());
				a += change(f);
			}
			
		}
		
		return a;
	}
	
	public String change (String original) {
	
		if (original.charAt(0) == 'a'
				||original.charAt(0) == 'e'
				||original.charAt(0) == 'i'
				||original.charAt(0) == 'o'
				||original.charAt(0) == 'u')
			return original + "way";
		
		for (int i = 0; i < original.length(); i++) {
			if (original.charAt(i) == 'a'
					||original.charAt(i) == 'e'
					||original.charAt(i) == 'i'
					||original.charAt(i) == 'o'
					||original.charAt(i) == 'u') 
				return original.substring(i) + original.substring(0, i) + "ay";
		}
		return original + "ay";
	}
	
	public static void main (String args[]) {
		PigLatin phrase = new PigLatin("My cat is cuddly");
		System.out.println(phrase.transform());

	}
}
