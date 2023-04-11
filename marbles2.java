// Burak Kurt and Angelina

import java.util.Scanner;
public class marbles {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Initial number of marbles: (Choose between 10-100) ");
		int numOfMarbles = sc.nextInt();
		
		if (numOfMarbles < 10 && numOfMarbles > 100) {
			System.exit(0);
		}
		
		int activePlayer = 1;
		while (numOfMarbles > 1) {
			System.out.println("Player " + activePlayer + "; Choose between (1-" + (numOfMarbles/2) + ") " );
			int taken = sc.nextInt();
			
			numOfMarbles -= taken;
			System.out.println("Remaining number of marbles" + numOfMarbles + "\n");
		}
	}
}

//----------

/*
import java.util.Scanner;
public class WhoTakesTheLastMarble {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Initial no. of marbles [10 ~ 100]: ");
        int numberOfMarbles = in.nextInt();

        int activePlayer = 1;
        while (numberOfMarbles > 1) {
            System.out.print("Player" + activePlayer + " [1 ~ " + (numberOfMarbles / 2) + "]: ");
            int taken = in.nextInt();
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