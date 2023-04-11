public class myPoint {
	private double x, y;
	
	public myPoint(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	public static double distance(myPoint a, myPoint b) {
		double dist = Math.sqrt(Math.pow(a.getX() - b.getX() ,2) + Math.pow(a.getY() - b.getY() ,2));
		return dist;
	}
	
	public static myPoint midPoint(myPoint a, myPoint b) {
		return new myPoint (a.getX() + b.getX())/2, (a.getY() + b.getY())/2;
	}
	
	public String toString() {
		return "(" + this.getX() + "," + this.getY() + ")";
	}
}