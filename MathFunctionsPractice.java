import java.awt.geom.Point2D;

public class MathFunctionsPractice {
	
	// 1. This method returns the distance between integers a and b

	public static int distance (int a, int b) {
		return Math.abs(a - b);
	}

	// 2. This method returns the maximum value of integers a, and b. (the Java API may help.)
	public static int maximum(int a, int b) {
		return Math.max(a, b);
	}

	// 3. This method returns the maximum value of double values a,b,c. (the Java API may help.)
	public static double maximum(double a, double b, double c) {
		return Math.max(a, Math.max(b, c));
	}

	// 4. This method will return a random integer between 9 and 12 (inclusive) (the Java API may help.)
	public static int getRandomClass() {
		return (int) ((Math.random() * 4) +9);
	}

	// 5. This method will return the surface area of a sphere with given radius
	// SA = 4PIr²
	public static double sphereSurfaceArea(int radius) {
	return 4 * Math.PI * Math.pow(radius, 2);
	}

	// 6. This method will return the volume of a sphere with given radius
	// V = 4/3PI r^3

	public static double sphereVolume(int radius) {
		return 4.0/3 * Math.PI * Math.pow(radius, 3);
	}

	// 7. This method will return the length of the hypotenuse of a right
	// triangle
	// with legs leg1 and leg2
	//H = sqrt of side1^2 * side3^2

	public static double hypotenuse(double leg1, double leg2) {
//		return Math.sqrt(leg1 * leg1 + leg2 * leg2);
		return Math.hypot(leg1, leg2);
	}

	// 8. This method will return the length of Segment AB
	// Refer to java's Point class (the Java API may help.)
	public static double segmentLength(myPoint a, myPoint b) {
//		return myPoint.distance(a, b);
		return Point2D.distance(a.getX(), a.getY(), b.getX(), b.getY());
	}
	

	// 9. this method will find the smallest angle (in degrees) of a right
	// triangle with with base and height leg1 and leg2  (the Java API may help.)
		public static double getSmallestAngleOfRightTri(double leg1, double leg2) {
		double bigger = 0, smaller = 0;
		if (leg1 > leg2) {
			leg2 = bigger;
			leg1 = smaller;
		} else {
			smaller = leg2;
			bigger = leg1;
		}
		double tan;
		tan = smaller/bigger;
		return Math.toDegrees(Math.atan(tan));
		}
		
	// 10. This method will round x to the nearest hundredPlace
	public static int roundToHundredPlace(int x) {
		return (int) ((x/100.0) + 0.5) * 100;
	}

	// 11. This method will round x to the nearest hundredthPlace
	public static double roundToHundredthPlace(double x){
		return (int) ((x * 100.0) + 0.5) / 100;
	}

	public static void main(String[] args) {
		System.out.println("1. DISTANCE: " + distance(-5, 8));
		System.out.println("2. MAX: " + maximum(-5, 8));
		System.out.println("3. MAX: " + maximum(-5, -8, -2));
		System.out.println("4. Random HS Class: " + getRandomClass());
		System.out.println("5. Sphere Surface Area: " + sphereSurfaceArea(9)
				+ "  sq. units");
		System.out.println("6. Sphere Volume: " + sphereVolume(2)
				+ "  cubic units");
		System.out.println("7. Hypotenuse: " + hypotenuse(7, 9));
		System.out.println("8. Segment Length: " + segmentLength(new myPoint(1, 3), new myPoint(-2, 7)));
		System.out.println("9. Smallest Acute Angle: "
				+ getSmallestAngleOfRightTri(5, 7));
		System.out.println("10. Round To Hundred Place: "
				+ roundToHundredPlace(1297));
		System.out.println("11. Round To Hundredth Place: "
				+ roundToHundredthPlace(12.9756));

	}
	
	/*OUTPUT
       1. DISTANCE: 13
	2. MAX: 8
	3. MAX: -2.0
	4. Random HS Class: 11
	5. Sphere Surface Area: 1017.8760197630929  sq. units
	6. Sphere Volume: 33.510321638291124  cubic units
	7. Hypotenuse: 11.40175425099138
	8. Segment Length: 5.0
	9. Smallest Acute Angle: 35.53767779197438
	10. Round To Hundred Place: 1300
	11. Round To Hundredth Place: 12.98	*/

}


