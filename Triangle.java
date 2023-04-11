public class Triangle {
	private newPoint a,b,c;
	
	public Triangle(newPoint a , newPoint b , newPoint c ) {
		this.a=a;
		this.b=b;
		this.c=c;
		
	}
	public static double  distance(newPoint a , newPoint b ) {
		double value =  (Math.pow((a.getxval()-b.getxval()), 2));
		double valuet= (Math.pow(a.getyval()-b.getyval(), 2));
		return Math.sqrt(value+valuet);
		
	}
	public double degreea() {
		double  value  = (Math.pow(distance(b,c),2) -(distance(a,c)*distance(a,c))-(distance(a,b)*distance(a,b))) / ( ( -2*distance(a,c)*distance(a,b)));
		return Math.toDegrees(Math.acos(value));
	}
	public double degreeb() {
		double  value  = (Math.pow(distance(a,c),2) -(distance(b,c)*distance(b,c))-(distance(a,b)*distance(a,b))) / ( ( -2*distance(b,c)*distance(a,b)));
		return Math.toDegrees(Math.acos(value));
		
	}
	public double degreec() {
		double  value  = (Math.pow(distance(a,b),2) -(distance(b,c)*distance(b,c))-(distance(a,c)*distance(a,c))) / ( ( -2*distance(b,c)*distance(a,c)));
		return Math.toDegrees(Math.acos(value));
		
	}
	public newPoint midpoint(newPoint first , newPoint second ) {
		newPoint value  = new newPoint(((second.getxval() +  first.getxval())/2) ,(second.getyval()+first.getyval())/2);
		return value  ; 
		
		
	}
	
	public newPoint getcentroid() {
		newPoint value = new newPoint((a.getxval()+b.getxval()+c.getxval())/3,(a.getyval()+b.getyval()+c.getyval())/3);
		return new newPoint(value.getxval(),value.getyval());
	}
	
	
	public double getSlope(newPoint s1,newPoint s2) {
		return ((s2.getyval()-s1.getyval())/(s2.getxval()-s1.getxval()));
		
	}
	public newPoint getcircumcenter() {
		newPoint value1 = new newPoint(midpoint(a,b).getxval(),midpoint(a,b).getyval());
		newPoint value2 = new newPoint(midpoint(b,c).getxval(),midpoint(b,c).getyval());
		
		
		 double vari1 = getSlope(a,b);
		 double vari2 = getSlope(b,c);
		
		 double vari11=-1/vari1;
		 double vari22=-1/vari2;

		 LinearEQ first = new LinearEQ(-1*vari11,1,(value1.getyval()+-1*vari11*(value1.getxval())));
		 LinearEQ second = new LinearEQ((-1*vari22),1,(value2.getyval()+(-1*vari22*value2.getxval())));
		 newPoint exactone = (first.solution(second));
		
		// double bir = first.xSol(second);
		 //double iki = first.ySol(second);
	
		 return exactone;
		 
		
		
	}
	public newPoint getorthocenter() {
		double x = (a.getxval()*Math.tan(Math.toRadians(degreea()))*b.getxval()*Math.tan(Math.toRadians(degreeb()))*c.getxval()*Math.tan(Math.toRadians(degreec())))/(Math.tan(Math.toRadians(degreea()))*Math.tan(Math.toRadians(degreeb()))*Math.tan(Math.toRadians(degreec())));
		double y = (a.getyval()*Math.tan(Math.toRadians(degreea()))*b.getyval()*Math.tan(Math.toRadians(degreeb()))*c.getyval()*Math.tan(Math.toRadians(degreec())))/(Math.tan(Math.toRadians(degreea()))*Math.tan(Math.toRadians(degreeb()))*Math.tan(Math.toRadians(degreec())));

        return new newPoint(x,y);	
	}
	
	

	//atasagun
	
	
	public String  allSideLength() {
		System.out.println("Point A:(3.0, 9.0)" + "\nPoint B:(8.0, 0.0)" +  "\nPoint C:(5.0, 10.0)");
		return "AB "+distance(a,b)+"\nBc " + distance(b,c)+"\nAC "+distance(a,c);
		
		
	}
	public double getPerimeter() {
		System.out.println("\nThe perimeter of the tirnagle is : ");
		return distance(a,b) + distance(b,c) + distance(a,c);
	}
	public double getArea() {
		double s = (distance(a,b)+distance(b,c)+distance(a,c))/(double) 2 ;
		double s2 = s*(s-distance(a,b))*(s-distance(a,c))*(s-distance(b,c)) ;
		
		return Math.sqrt(s2) ; 
			
	}
	
	
	
	

	public static void main(String[] args) {
		
		newPoint a = new newPoint(3.0,9.0);
		newPoint b = new newPoint(8.0,0.0);
		newPoint c = new newPoint(5.0,10.0);
		Triangle one = new Triangle(a,b,c);
		System.out.println(one.allSideLength());
		System.out.println(one.getPerimeter());
		System.out.println(one.degreea());
		System.out.println(one.degreeb());
		System.out.println(one.degreec());
//		System.out.println(one.circumcentermidPoint(a,b).getyval());
		System.out.println(one.midpoint(b, c).getyval());
		System.out.println(one.getArea());
	}

}

