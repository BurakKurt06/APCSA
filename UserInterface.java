
public class UserInterface {

	public static void main(String[] args) {
		newPoint a = new newPoint(3.0,9.0);
		newPoint b = new newPoint(8.0,0.0);
		newPoint c = new newPoint(5.0,10.0);
		Triangle one = new Triangle(a,b,c);
		/*System.out.println(one.allSideLength());
		System.out.println(one.getPerimeter());
		System.out.println(one.degreea());
		System.out.println(one.degreeb());
		System.out.println(one.degreec());*/
		System.out.println(one.circumcentermidPoint(a,b).getyval());
		System.out.println(one.midpoint(b, c).getyval());
		System.out.println(one.getArea());
		

	}

}
