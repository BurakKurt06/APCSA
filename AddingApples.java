public class AddingApples {
	public static int sumOfNums(String input) {
		int x = 0;
		String letter;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) > 47 && input.charAt(i) < 58) {
				letter = input.substring(i, i+1);
				x = Integer.parseInt(letter);
			}
		} return x;
		} 
	
	public static String findItem(String input) {
		input = input.toLowerCase();
		String unit = input.substring(input.indexOf("how many") + 9, input.indexOf(" do "));
		return unit;
	}
	
	public static String answer(String input) {
		return "They have " + sumOfNums(input) + " " + findItem(input) + " "; 
	}
	
	public static void main (String [] args) {
		String input1 = "Ellen has 6 apples, Bob has 8 apples, and Chris has 9 apples. How many apples do they have?";
		String input2 = "Mrs. Gray has 2 girls and 3 boys. Mrs. Brown has 3 girls and 1 boy. How many kids do they have?";
		String input3 = "If the Chandlers have 1 dog, 2 cats, and 4 birds, how many pets do they have?";				
				
		System.out.println(sumOfNums(input1));
		System.out.println(sumOfNums(input2));
		System.out.println(sumOfNums(input3));
		
		System.out.println(findItem(input1));
		System.out.println(findItem(input2));
		System.out.println(findItem(input3));
		
		System.out.println(answer(input1));
		System.out.println(answer(input2));
		System.out.println(answer(input3));
	}
	
}
