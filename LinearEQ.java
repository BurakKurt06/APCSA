
public class LinearEQ {

	public double xcoeff, ycoeff, constant;

	public LinearEQ() {
	}

	public LinearEQ(double x , double y ,double  c ) {
		this.xcoeff=x;
		this.ycoeff=y;
		this.constant = c ;
		}
	
	public int  round(double x   ) {
		int x2 = (int ) x  ;
		return x2 ;
		}
	

	public double xSol(LinearEQ b){
		double x = (b.ycoeff*this.constant - ( this.ycoeff*b.constant)) / ((this.xcoeff*b.ycoeff)-b.xcoeff*this.ycoeff);
		return x ; 
	}

	public double ySol(LinearEQ b){
		double y = (b.xcoeff*this.constant - b.constant*this.xcoeff) /( (b.xcoeff*b.ycoeff) - (this.constant*b.ycoeff));
		return y ; 
	}

	public newPoint solution(LinearEQ b){
		return new newPoint(this.xSol(b),this.ySol(b));
	}

	public static void main(String[] args) {
		LinearEQ one = new LinearEQ(2, -3, -2);
		LinearEQ two = new LinearEQ(4, 1, 24);
		//newpoint three = new newpoint(one.xSol(two),one.ySol(two));
	    System.out.println(one.xSol(two));
		System.out.println(one.ySol(two));
		System.out.println(one.solution(two).getxval());
		System.out.println(one.solution(two).getyval());
	}

}
