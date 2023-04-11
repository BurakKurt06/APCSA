//Burak Kurt
		public class Word{
			private String original;

			public Word(String s)
			{
			original = s;
			}
			public String toString() {
				return original;
			}
				  public String reverse(String word) {
					    String reverse = "";
					    char character;
					    for (int i = 0; i < word.length(); i = i + 1) {
					      character = word.charAt(i);
					      reverse = character + reverse;
					    }
					    return reverse;
					  }

			public String getNonSpaceLength()
			{
			String str = original.replace(" ", "");
			return str;			
			}
			/**
			* determines is word is a palindrome
			* @return true if word is a palindrome, false otherwise
			*/
			public boolean isPalindrome()
			{
			return this.reverse().compareTo(this.original) == 0;
			}
			/**
			* Alternate method to determine if word is a palindrome
			* @return true if word is a palindrome, false otherwise
			*/
			public boolean isPalindrome2()
			{
			String a = "";
			String e = original;
			for (int i = (original.length()-1); i>-1; i--){
				a += original.charAt(i);
			} return a.equalsIgnoreCase(e);
			}
			/**
			* removes vowels in original string
			 * @return 
			* @return a string that removes all of the vowels
			*/
			public String removeVowels()
			{
				String s = original.replace("a", "");
				String s = original.replace("e", "");
				String s = original.replace("i", "");
				String s = original.replace("o", "");
				String s = original.replace("u", "");
				String s = original.replace("A", "");
				String s = original.replace("E", "");
				String s = original.replace("I", "");
				String s = original.replace("O", "");
				String s = original.replace("U", "");
				return s;
			}


			public String anagram(Object String)
			{
			String = newWord = "";
			String before = original;
			String after = original;
			String combined = "";
			for (int i = 0; i<original.length(); i++;) {
				int randy = (int)(Math.random()*before.length());
				
			newWord += before.charAt(randy);
			before = before.substring(0,randy);
			after = after.substring(randy+1);
			
			combined = before+after;
			after = combined;
			before = combined;
			}
			return newWord;
			}
		}
	}
