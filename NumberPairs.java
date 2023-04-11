     // declare the fields / instance variables "num1, num2"
     public class NumberPairs { 
     private double num1;
     private double num2;

	// Code the no-argument constructor
     public NumberPairs() {
    	num1=0;
    	num2=0;
     }
	

	// Code the overloaded constructor that takes two numbers as parameters (not
	// the sum)
     public NumberPairs(double n1, double n2) {
    	num1=n1;
    	num2=n2;
      }
	

	// Code a mutator to change the values in the NumberPairs object
     public void setNums(double num1, double num2) {
    	 this.num1=num1;
    	 this.num2=num2;
     }

	
	// Code a mutator that computes the sum, but does not print it out
     public double getNums() {
    	 
     }


	// Code a toString method that returns the numbers and their sum

	

	//EXTENSION - CAN YOU DO IT?
	// Code a mutator that adds the second NumberPair to increase the first.

	

	//EXTENSION - CAN YOU DO IT?
	// Create a new NumberPairs object from the sum of the others and display it

 	public static void main(String[] args) {
		NumberPairs one = new NumberPairs();
		one.setNums(5, 5);
		NumberPairs two = new NumberPairs(90,100.0);
		NumberPairs three = new NumberPairs(100.5,85.8);
		NumberPairs four = new NumberPairs(-100,55);
		NumberPairs five = new NumberPairs(15236,5642);
		NumberPairs six = new NumberPairs(1000,555);
		System.out.println(one);
		System.out.println(two);
		System.out.println(three);
		System.out.println(four);
		System.out.println(five);
		System.out.println(six);
 	}
     }
	
