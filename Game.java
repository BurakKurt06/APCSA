//Burak Kurt
//Period 2
import java.util.Random;
public class Game {

public static void main(String args[]) {

Pile marbles = new Pile();
Random random = new Random();

Player player1;
Player player2;
int marblesToRemove = 0;
//-------------------------

String intro = "Welcome to the Marbles\nWhoever forced to take the last marble loses!\n";
if(random.nextInt(2) == 0) {
System.out.println(intro+"You go first.\n");

player1 = new Player(2);
player2 = new Player();
}

else {
System.out.println(intro+"Computer goes first.\n");

player1 = new Player();
player2 = new Player(2);
}

//-------------------------

while(marbles.getMarbles() > 0) {
	
	if(marbles.getMarbles() == 1) {
		System.out.println("You Win!!!");
		break;
		}

		System.out.println("Number of marbles left: " + marbles.getMarbles());
		System.out.println("Computer's turn:");

		marblesToRemove = player1.chooseNextMove(marbles.getMarbles());

		System.out.println("Computer removed " + marblesToRemove + " marbles.");
		System.out.println();

		marbles.removeMarbles(marblesToRemove);
	//-----	
		
	if(marbles.getMarbles() == 1) {
		System.out.println("Computer Wins!!!");
		break;
		}

		System.out.println("Number of marbles left: " + marbles.getMarbles());
		System.out.println("Your turn:");

		marblesToRemove = player2.chooseNextMove(marbles.getMarbles());

		System.out.println("You removed " + marblesToRemove + " marbles.");
		System.out.println();

		marbles.removeMarbles(marblesToRemove);
}

}

}
/*
 while(marbles.getMarbles() > 0)

{

//checking if player two wins

if(marbles.getMarbles() == 1)

{

System.out.println("Player 2 Wins!!!");

break;

}

//calculating the number of marbles to remove

System.out.println("Number of marbles left: " + marbles.getMarbles());

System.out.println("Player 1's turn:");

marblesToRemove = player1.chooseNextMove(marbles.getMarbles());

System.out.println("Player 1 removed " + marblesToRemove);

System.out.println();

//removing the marbles

marbles.removeMarbles(marblesToRemove);

//checking if player one wins

if(marbles.getMarbles() == 1) {

System.out.println("Player 1 Wins!!!");

break;

}


System.out.println("Number of marbles left: " + marbles.getMarbles());
System.out.println("Player 2's turn:");

marblesToRemove = player2.chooseNextMove(marbles.getMarbles());

System.out.println("Player 2 removed " + marblesToRemove);
System.out.println();

marbles.removeMarbles(marblesToRemove);

}
 */