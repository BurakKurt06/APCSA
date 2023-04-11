//Burak Kurt
//Period 2
import java.util.Random;
import java.util.Scanner;
public class Player {

int playerType = 0;

Random random = new Random();
Scanner input;

//-------------------------

public Player(int type) {
	
if 
(type < 0 || type > 2)
playerType = 2;

else
playerType = type;

input = new Scanner(System.in);
}

//-------------------------

public Player() {
playerType = random.nextInt(2);

input = new Scanner(System.in);

}

//-------------------------

public int chooseNextMove(int marblesLeft) {

int marblesToRemove = 0;

if(marblesLeft == 3)
return 1;



   if(playerType == 0) {
   marblesToRemove = random.nextInt((marblesLeft/2) - 1) + 1;
   }
   
   else if (playerType == 1) {
     if(marblesLeft > 63)
       marblesToRemove = marblesLeft - 63;

     else if(marblesLeft > 31)
       marblesToRemove = marblesLeft - 31;

     else if(marblesLeft > 15)
       marblesToRemove = marblesLeft - 15;
     
     else if(marblesLeft == 2)
       marblesToRemove = 1;
     else
       marblesToRemove = random.nextInt((marblesLeft/2) - 1) + 1;
   } 
   
   else {
System.out.println("Please enter a number of marbles to remove between 1 - " + (marblesLeft / 2));
marblesToRemove = input.nextInt();

while(marblesToRemove > marblesLeft / 2 || marblesToRemove <= 0) {
System.out.println("That is not a valid entry, please enter a number of marbles to remove between 1 - " + (marblesLeft / 2) + ".");
marblesToRemove = input.nextInt();
   }
}
   return marblesToRemove;
   }
}