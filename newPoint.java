import java.awt.Point;
import java.util.Random;

public class newPoint {
	private double xval;
	private double yval;
	
	public  newPoint(double xx , double yy) {
		this.xval=xx;
		this.yval=yy;	
	}

	public double getxval() {
		return xval;
	}

	public double getyval() {
		return yval;
	}
/*	public double topoint() {
		return (xval.yval);
		
	}*/
	public static newPoint midpoint(newPoint c,newPoint b) {
		double  xmid = (c.getxval()-b.getxval())/2;
		double ymid = (c.getyval()-b.getyval())/2;
		return  new newPoint(xmid,ymid);		
	}

	public static void main(String[] args) {
		
	}
}
	


