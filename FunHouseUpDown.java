import java.util.Arrays;

public class FunHouseUpDown {
	public static boolean increase(int[] input) {
		
	}

	public static boolean decrease(int[] input) {
		
	}
	
	public static int[] numsLargerThanX(int[] input, int value, int size){
		
	}

	public static void main(String[] args) {
		int[] one = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] two = new int[] { 1, 2, 3, 9, 11, 20, 30 };
		int[] three = new int[] { 9, 8, 7, 6, 5, 4, 3, 2, 0, -2 };
		int[] four = new int[] { 3, 6, 9, 12, 15, 18, 21, 23, 19, 17, 15, 13,
				11, 10, 9, 6, 3, 2, 1, 0 };

		System.out.println(Arrays.toString(one));
		System.out.println("...is going up? " + increase(one));
		System.out.println(Arrays.toString(two));
		System.out.println("...is going up? " + increase(two));
		System.out.println(Arrays.toString(three));
		System.out.println("...is going up? " + increase(three));
		System.out.println(Arrays.toString(four));
		System.out.println("...is going up? " + increase(four));
		
		System.out.println();
		
		System.out.println(Arrays.toString(one));
		System.out.println("...is going up? " + decrease(one));
		System.out.println(Arrays.toString(two));
		System.out.println("...is going up? " + decrease(two));
		System.out.println(Arrays.toString(three));
		System.out.println("...is going up? " + decrease(three));
		System.out.println(Arrays.toString(four));
		System.out.println("...is going up? " + decrease(four));

		System.out.println();
		
		System.out.println(Arrays.toString(four));
		System.out.println("First 7 values greater than 9: " 
				+ (Arrays.toString(numsLargerThanX(four, 9, 7))));
		System.out.println("First 5 values greater than 15: " 
				+ (Arrays.toString(numsLargerThanX(four, 15, 5))));
	}

}
