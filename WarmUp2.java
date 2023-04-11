import java.util.Arrays;
public class WarmUp2 {
	/*
	 * Warm Up #2: This method will return a String array which contains the
	 * elements of a supplied String array with more than one word. The array
	 * should be no longer than necessary
	 */
	public static String[] moreThanOneWord(String[] input) {
	    double count = 0;
	   String output; 
	    for (String word : input) {
	        for (int i = 0; i < word.length(); i++) {
	            if (word.charAt(i)=='a'
	            		||word.charAt(i)=='e'
	            		||word.charAt(i)=='i'
	            		||word.charAt(i)=='o'
	            		||word.charAt(i)=='u') {
	                word = output;
	            }
	        }
	    }
	    
	    return;
	  }
	
	
	public static void main(String[] args) {
		String[] list = { "New Jersey", "Pennsylvania", "New York", "Delaware",
				"California", "Idaho", "Illinois", "New Mexico", "Florida" };
		System.out.println(Arrays.toString(moreThanOneWord(list)));
	}
}

/*
 int iterator = 0;
 
 */
