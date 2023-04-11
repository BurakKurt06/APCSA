public class StringFuncts {

	/*
	 * 1.This method will return an email address in the form
	 * first.last@ww-p.org getEmail("Willy", "Wonka") creates
	 * Willy.Wonka@ww-p.org
	 */
	public static String getEmail(String first, String last) {
		return first.toLowerCase() + "." + last.toLowerCase() + "@ww-p.org";
	}

	/*
	 * 2. This method will return initials with periods. getInitials("Willy",
	 * "Wonka") creates W. W.
	 */
	public static String getInitials(String first, String last) {
		return first.charAt(0) + "." + last.charAt(0);
	}

	/*
	 * 3. This method will parse the year from a birthdate in the form MMDDYYYY
	 * getYear("11221931) creates 1931
	 */
	public static String getYear(String bday) {
		return bday.substring(4);
	}

	/*
	 * 4. This method will return a lower case user name in the form of first 3
	 * letters of first name and last 2 letters of last name.
	 * getUserName("Willy", "Wonka") creates wilka
	 */
	public static String getUserName(String first, String last) {
		String x = first.substring(0, 3) + last.substring(last.length() -2);
		return x.toLowerCase();
	}

	/*
	 * 5. This method will parse the first name from a full name separated with
	 * a space getFirst("Willy Wonka)creates Willy
	 */
	public static String getFirst(String fullName) {
		return fullName.substring(0, fullName.indexOf (" "));
	}

	/*
	 * 6. This method will parse the last name from a full name separated with a
	 * space getLast("Willy Wonka) creates Wonka
	 */
	public static String getLast(String fullName) {
		int a, b;
		a = fullName.length;
		b = fullname.indexOf("");
		return fullName.substring(b, a);
	}

	/*
	 * 7. This will return a random 4 letter string of letters taken from the
	 * entire alphabet getRandomWord() [4 random letters]
	 */
	public static String getRandomLetters() {
		String alpha = ("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		int one = (int)(Math.random() *26);
		int two = (int)(Math.random() *26);
		int three = (int)(Math.random() *26);
		int four = (int)(Math.random() *26);
		
		return "" + alpha.charAt(one) + alpha.charAt(two) + alpha.charAt(three) + alpha.charAt(four); 
	}

	/*
	 * 8. This will return a new word of every other letter
	 * everyOtherLetter("Gobstoppers") creates Gbtpes
	 */
//	public static String everyOtherLetter(String word) {
		
//	}

	/*
	 * 9. This will return a new word that is the reverse.
	 */
	// reverse("CANDY") CREATES YDNAC
	public static String reverse(String word) {

	}

	/*
	 * 10. This will return true if the sum of the first digit and the last
	 * digit is divisible by 5. checkDigit("123456789") returns TRUE
	 * checkDigit("12345543211") returns FALSE checkDigit("87878787") returns
	 * TRUE
	 */
	public static boolean checkDigit(String creditCard) {

	}

	/*
	 * 11. This will return a string where every other letter is capitalized
	 * everyOtherLetterCaps("Chocolate") creates cHoCoLaTe
	 */
	//
	public static String camelCase(String word) {
		String a =  "";
		for (int i = 0; i < word.length(); i++) {
			if (i % 2 != 0) {
				a += (word.charAt(i) + "").toUpperCase();
			} else if (i % 2 == 0) {
				a += (word.charAt(i) + "").toUpperCase();
			}
		} return a;
	}

	/*
	 * 12. This will return a string where every o is replaced with an 8
	 * replacesIsWith8s("Oompa Loompa") creates 88mpa L88mpa
	 */
	public static String replaceOsWith8s(String word) {
		for (int i +0; i < word.length(); i++) {
			if (word.charAt(i) == 'o') {
				word = word.replace(word.charAt(i), '8');
			}
		} return word;
	}

	public static void main(String[] args) {
		System.out.println("1. Email: " + getEmail("Willy", "Wonka"));
		System.out.println("2. Initials: " + getInitials("Willy", "Wonka"));
		System.out.println("3. BirthYear: " + getYear("11221931"));
		System.out.println("4. UserName: " + getUserName("Willy", "Wonka"));
		System.out.println("5. FirstName: " + getFirst("Willy Wonka"));
		System.out.println("6. LastName: " + getLast("Willy Wonka"));
		System.out.println("7. RandomLetters: " + getRandomLetters());
//		System.out.println("8. EveryOtherLetter: "
//				+ everyOtherLetter("OOMPA LOOMPA"));
		System.out.println("9. Reverse: " + reverse("chocolate"));
		System.out.println("10A. CheckDigit: " + checkDigit("123456"));
		System.out.println("10B. CheckDigit: " + checkDigit("123456789"));
		System.out.println("11. EveryOtherCaps: " + camelCase("Golden Ticket"));
		System.out.println("12. Replaces O's with 8's: "
				+ replaceOsWith8s("Gobstoppers!"));
	}
}

//Display
//1. Email: Willy.Wonka@ww-p.org
//2. Initials: W. W.
//3. BirthYear: 1931
//4. UserName: wilka
//5. FirstName: Willy
//6. LastName: Wonka
//7. RandomLetters: GDWP
//8. EveryOtherLetter: OMALOP
//9. Reverse: etalocohc
//10A. CheckDigit: false
//10B. CheckDigit: true
//11. EveryOtherCaps: gOlDeN TiCkEt
//12. Replaces O's with 8's: G8bst8ppers!
