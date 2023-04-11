//Burak Kurt
//Period 2
import java.util.Arrays;
public class Fruit {
	
	private String [] bowl;
	
	public Fruit() {
		bowl = new String [10];
		bowl[0] = "apple";
		bowl[1] = "banana";
		bowl[2] = "kiwi";
		bowl[3] = "lemon";
		bowl[4] = "lime";
		bowl[5] = "mango";
		bowl[6] = "orange";
		bowl[7] = "pear";
		bowl[8] = "pineapple";
		bowl[9] = "plum";
	}
	public void display() {
		for(int i = 0; i<bowl.length; i++)
			System.out.println(bowl[i]);
	}
	
	public void displayForEach() {
		for(String x : bowl)
			System.out.println(x);
	}
	
	public void displayAlpha() {
		Arrays.sort(bowl);
		System.out.println(Arrays.toString(bowl));
	}
	
	public String fetch (int n) {
		if (n < 0 || n > bowl.length) {
			return "Invalid Index";
		} 
		else
			return bowl[n-1];
	}
	
	public void deleteFruit (String fruit) {
		int frIndex = -1;
		for (int i = 0; i < bowl.length; i++) {
			if (bowl[i].equals(fruit)) {
				frIndex = i;
				System.out.println(fruit + "is in the " + frIndex + " position.");
			}
		}
		if (frIndex == -1) {
			System.out.println(fruit + "is not in the bowl.");
		}
		else {
			for (int i = frIndex; i < bowl.length -1; i++) {
				bowl [i] = bowl [i + 1];
			}
			String [] newBowl = new String [bowl.length -1];
			for (int i = frIndex; i < newBowl.length -1; i++) {
				newBowl [i] = bowl [i];
			}
		}
	} 
	
	public void replace (String existing, String newest)	{
		for (int i = 0; i<bowl.length; i++) {
			if (bowl[i].equals(existing))
			bowl[i] = newest;
		}
		System.out.println(Arrays.toString(bowl));
	}
	
//	public void addFruit(String newFruit) {
//		String [] newBowl = new String [bowl.length + 1];
//		int insertIndex = bowl.length;
//		for (int i = 0; i < bowl.length; i++) {
//			if ((newFruit.compareToIgnoreCase[i]) < 0)
//			
//			break;
//		}
//	}
//	for (int i = 0; i < bowl.length; i++) {
//		newBowl[i] = bowl[i];
//	}
//	for (int i = newbowl;.length -2; i >= insertIndex; i--) {
//			newbowl[i+1] = newbowl [i];
//	}
//    newBowl[insertIndex] = new fruit;
    		
	public static void main(String [] args) {
		Fruit one = new Fruit();
		one.display();
		one.displayForEach();
		System.out.println(Arrays.toString(one.bowl));
		one.displayAlpha();
		System.out.println(one.fetch(5));
		one.replace("kiwi", "grape");
		
		one.deleteFruit("pineapple");
		System.out.println(Arrays.toString(one.bowl));
		one.addFruit
	}
}  