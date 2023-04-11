import java.awt.Color;

public class MathFuncts {

// This method finds the average of q1, q2, and q3
	public static double average(int q1, int q2, int q3) {
		
		return (q1 + q2 + q3)/3.0;
//		double average = (q1 + q2 + q3)/3.0;
//		return average;
//		return (double)(q1 + q2 + q3)/3;
	}
	
//// This method converts and inputed Celsius temperature
//// to fahrenheit temperature
	public static double convert(int cels) {
		return (double)9/5 * cels +32;
	}
	
////this method will return the max number of quarters needed
////to correctly make change at a cash register
//// e.g. numQuarters(.78) ===> 3
	public static int numQuarters(double amount) {
	return (int) (amount/.25);
	}
	
////This method will  round x to the nearest hundred place
//// roundHundreds(1297)  ==> 1300
	public static int roundHundreds(int x) {
	return (int) ((x/100.0)+.5)*100;
	/*
	 * divide
	 * add 0.5
	 * cast
	 * multiply
	 */
	}
	
	public static double roundHundredths(double x) {
		return (int) ((x/.01)+.5)*0.01;
	}
	
////This method will return a random color
	public static Color randomColor() {
		int r = (int) (Math.random () *256);
		int g = (int) (Math.random () *256);
		int b = (int) (Math.random () *256);
		
		return new Color(r, g, b);
	}
//	}
//	
//// This method will return the midpont of a segment with
//// endpoints (x1, y1) and (x2, y2).
//// The midpoint will be returned as a String
	public static String mdpt(int x1, int y1, int x2, int y2) {
		return "(" + (x1+x2) / 2.0 + "," + (y1 + y2) / 2.0 + ")";
	}
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	public static void main(String[] args) {
		System.out.println(average(4,4,5));		
		System.out.println(convert(20));
//		System.out.println(numQuarters(41.28));
		System.out.println(numQuarters(.78));
		System.out.println(roundHundreds(1297));		
		System.out.println(roundHundredths(12.9756));
		System.out.println(randomColor());
		System.out.println(mdpt(1,1,4,5));

	}

}
