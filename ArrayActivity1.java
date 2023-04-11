import java.util.Arrays;
import java.util.Random;

public class ArrayActivity1 {
	private static int[] numArray;
	Random random = new Random();
	/**
	 * 1. Constructs a default array of size 10
	 */
	public ArrayActivity1() {
		numArray = new int[10];
		numArray[0] = 1;
		numArray[1] = 3;
		numArray[2] = 7;
		numArray[3] = 19;
		numArray[4] = 15;
		numArray[5] = 19;
		numArray[6] = 7;
		numArray[7] = 3;
		numArray[8] = 19;
		numArray[9] = 48;
	}

	/**
	 * 2. Constructs an array of random numbers (0-24) array of size count
	 */
	public ArrayActivity1(int count) {
		numArray = new int[count];
		for (int i =0; numArray.length<i;i++){
		numArray[i] = random.nextInt(25);
			}
		}

	/**
	 * 3. This method prints all of the elements of the array in list form
	 */
	public void display() {
		for (int i = 0; i < numArray.length; i++)
			System.out.println(numArray[i]);
	}

	/**
	 * 4. This method prints all of the elements in reverse order
	 */
	public void displayReverse() {
		for (int i = numArray.length-1; i >= 0; i--)
			System.out.println(numArray[i]);

	}

	/**
	 * 5. This method calculates and returns the average of all of the elements
	 * The average of the default array is 14.1
	 */
	public static double average() {
		
		
        double total = 0;

        for(int i=0; i<numArray.length; i++){
        	total = total + numArray[i];
        }


    
        double average = total / numArray.length;
        return average;
}
	

	/**
	 * 6. This method returns the maximum value of all of the elements The max
	 * of the default array is 48.
	 */
	public static int findMax() {
		int longest = numArray[0] ;
		for (int i=0;i< numArray.length;i++)
			if (numArray[i] > longest) {
				longest = numArray[i];
			}
		return longest;
	}
	
	/**
	 * 7. This method returns the index number of the first instance of int
	 * lookFor; returns -1 if not in the list. ex. Using the default array
	 * findIndex(15) will return 4
	 */
	public static int linearSearch(int lookFor) {
		for (int i= 0; i<numArray.length;i++) {
			if (numArray[i]== lookFor)
				return i;
		}return -1;

	}

	/**
	 * 8. This method will print the elements and the tally. The list with the
	 * default constructor will be Number Frequency 1 1 3 2 7 2 15 1 19 3 48 1
	 */
	public void tallyList() {
		sort();
		int digit = numArray[0];
		int counter =0;
		
		for (int i=0;i<numArray.length;i++) {
			if(digit== numArray[i]) {
				counter++;
			}else {
				System.out.println(digit + " : " + counter);
				digit = numArray[i];
				counter=1;
			}
		}
       System.out.println(digit + " : " + counter + " times");
	}

	/**
	 * 9. This method will print a column of numbers in the original order, a
	 * column of numbers in reverse order, and the average of the two. default
	 * constructor will be LIST REVERSE AVERAGE 1 48 24.5; 3 19 11.0; 7 3 5.0;
	 * 19 7 13.0; 15 19 17.0; 19 15 17.0; 7 19 13.0; 3 7 5.0; 19 3 11.0; 48 1
	 * 24.5
	 */

	public void listReverseAvg() {
		double avg = 0; 
		sort();
		int[] reverse = new int [numArray.length];
		int revIndex = numArray.length;

		for (int i=0; i<numArray.length; i++) {
	reverse[revIndex-1] = numArray[i];
	revIndex-=1;
		}
		for(int i=0; i<numArray.length;i++) {
			System.out.println(numArray[i] + "\t");
			System.out.println(reverse[i] + "\t");
	

}
	}

	/**
	 * 10. This method will sort the array in ascending order
	 */
	public static void sort() {
		Arrays.sort(numArray);
//		for(int i=0; i<numArray.length; i++) {
//			
//		}
	}

	/**
	 * 11. Binary Search. This method returns the index number of the first
	 * instance of int lookFor and returns -1 if not in the list. The Array must
	 * be sorted to use the Binary search. ex. Using the default array
	 * binarySearch(15) will return 5
	 */
	public static int binarySearch(int lookFor) {
		sort();
		int index=Arrays.binarySearch(numArray, lookFor);
		return index;
		
		}

	

	/**
	 * 12. Write a tester that will create a random array of size 50 and test
	 * all of these methods
	 */
	
	public static void main(String[] args) {
		ArrayActivity1 one = new ArrayActivity1 ();
		one.display();
		System.out.println();
		one.displayReverse();
		System.out.println();

		System.out.println(average());
		System.out.println();

		System.out.println(linearSearch(15));
		System.out.println();

		one.tallyList();
		System.out.println();

		one.listReverseAvg();
		System.out.println();

		System.out.println(binarySearch(15));


		
		}
}
