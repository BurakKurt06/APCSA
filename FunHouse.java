import java.util.Arrays;

public class FunHouse {
	
	// instance variables and constructors could be used, but are not necessary

		/*
		 * getSum() will return the sum of the numbers 
		 * from index start to index stop, including stop
		 */
		public static int getSum(int[] numArray, int start, int stop) {
			return 0;
		}
		
		// getCount() will return number of times val is present
		public static int getCount(int[] numArray, int val) {
			return 0;
		}
		
		// returns an array with all of a certain value removed
		public static int[] removeVal(int[] numArray, int val) {
			
			return numArray;
		}
		
		public static void main(String args[]) {
			int[] one = { 7, 4, 10, 0, 1, 7, 6, 5, 3, 2, 9, 7 };

			System.out.println(Arrays.toString(one));
			System.out.println("sum of spots 3-6  =  "
					+ FunHouseTeach.getSum(one, 3, 6));
			System.out.println("sum of spots 2-9  =  "
					+ FunHouseTeach.getSum(one, 2, 9));
			System.out.println("# of 4s  =  " + FunHouseTeach.getCount(one, 4));
			System.out.println("# of 9s  =  " + FunHouseTeach.getCount(one, 9));
			System.out.println("# of 7s  =  " + FunHouseTeach.getCount(one, 7));
			System.out.print("New array with all 7s removed = ");
			System.out.println(Arrays.toString(FunHouseTeach.removeVal(one, 7)));
			System.out.println("# of 7s in new array = " 
					+ (FunHouseTeach.getCount(FunHouseTeach.removeVal(one, 7), 7)));
			System.out.println();
			
			
			int[] two = {7, 4, 2, 7, 3, 4, 6, 7, 8, 9, 7, 0, 10, 7, 0, 1, 7, 6, 5, 7, 3, 2, 7, 9, 9, 8,7};
			System.out.println(Arrays.toString(two));
			System.out.println("sum of spots 3-16  =  "
					+ FunHouseTeach.getSum(two, 3, 16));
			System.out.println("sum of spots 2-9  =  "
					+ FunHouseTeach.getSum(two, 2, 9));
			System.out.println("# of 4s  =  " + FunHouseTeach.getCount(two, 4));
			System.out.println("# of 3s  =  " + FunHouseTeach.getCount(two, 3));
			System.out.println("# of 7s  =  " + FunHouseTeach.getCount(two, 7));
			System.out.print("New array with all 7s removed = ");
			System.out.println(Arrays.toString(FunHouseTeach.removeVal(two, 7)));
			System.out.println("# of 7s in new array = " 
					+ (FunHouseTeach.getCount(FunHouseTeach.removeVal(two, 7), 7)));
			System.out.println();

		}

}
