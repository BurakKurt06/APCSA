public class AverageVowels {
	/*
	 * This method will return the average number of vowels in a given array of
	 * Strings Given the array of state names; average is 3.5555
	 */
	
	public static double avgNumVowels(String[] input) {
	    double count = 0;
	    for (String word : input) {
	        for (int i = 0; i < word.length(); i++) {
	            if (word.charAt(i)=='a'
	            		||word.charAt(i)=='e'
	            		||word.charAt(i)=='i'
	            		||word.charAt(i)=='o'
	            		||word.charAt(i)=='u') {
	                count++;
	            }
	        }
	    }
	    double average = (double)count/input.length;
	    return average;
	  }

	
	public static void main(String[] args) {
		String[] list = { "New Jersey", "Pennsylvania", "New York", "Delaware",
				"California", "Idaho", "Illinois", "New Mexico", "Florida" };
		System.out.println(avgNumVowels(list));
	}

}