//Burak Kurt
public class PyramidLoopsPractice {
	public static void print(int x) {
		int i, j;
		for(i=0; i<x; i++) {
			for(j=0; j<i; j++) {
				System.out.print("* ");
			} System.out.println();
		}
	}
	public static void main( String args[] ) {
		int x=5;
		print(x);
	}
}

/*
import java.util.Scanner;
public class marbles {
   public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
       System.out.print("Initial no. of marbles [10 ~ 100]: ");
       int numberOfMarbles = sc.nextInt();

       int activePlayer = 1;
       while (numberOfMarbles > 1) {
           System.out.print("Player" + activePlayer + " [1 ~ " + (numberOfMarbles / 2) + "]: ");
           int taken = sc.nextInt();
           numberOfMarbles -= taken;
           System.out.println("Remaining no. of marbles: " + numberOfMarbles);
           
           
           if (activePlayer == 1) {
               activePlayer = 2;
           } else {
               activePlayer = 1;
           }
       }

       System.out.println("Player" + activePlayer + " takes the last marble.");
       if (activePlayer == 1) {
           activePlayer = 2;
       } else {
           activePlayer = 1;
       }
       System.out.println("Player" + activePlayer + " wins!");
   }
}
*/

