//Angelina Gu and Burak Kurt
//Period 2

import java.util.Scanner;

public class SevenElevens {
	//take total money user has, then they bet x money, if they win they get 
	//x, if lose they lose x
	//adding die1 and die2 makes the number
	
	private static int bankRoll;
	private static int bets;
	private int die1;
	private int die2;
	private int total;
	private int point;
	private static boolean end = false;
	
	
	public SevenElevens(int b) {
		b = bankRoll;
	}
	
	public void setBet (int b) {
		b = bets;
	}
	
	public String roll1() {
		int first = 0;
		die1 = (int)(Math.random() * 5 + 1);
		die2 = (int)(Math.random() * 5 + 1);
		total = die1 + die2;
			if (total == 2 || total == 3 || total == 12) {
				end = true;
				bankRoll -= bets;
				return "Oh no! You rolled a " + total + " and lost.";
			}
			else if (total == 7 || total == 11) {
				end = true;
				bankRoll += bets;
				return "Yay! You rolled a " + total + " and won!";
			}
			else {
				return "You rolled a " + total + ", which means you now need to " 
			+ "roll \nthe same number again in order to win. \nIf you roll a 7, "
			+ "you will automatically lose.";
			}
	}
	
	public String roll2() {
		point = (int)(Math.random() * 10 + 2);
		if (point == total) {
			end = true;
			bankRoll += bets;
			return "\nCongrats! You rolled a " + point + " and won!";
		}
		else if (point == 7) {
			end = true;
			bankRoll -= bets;
			return "\nToo bad! You rolled a " + point + " and lost.";
		}
			return "\nYou rolled a " + point + ". Keep going...";
	}
	
	
	
	
	public static void main(String args[]) {
		//create scanner
		Scanner keyboard = new Scanner(System.in);
		
		//introduction
		System.out.println("Hello! This is a game of SevenElevens. \n"
				+ "You will provide an initial bankroll and bets \nfrom this amount on "
				+ "each roll of the dice. \nOn each roll, the sum of the faces is taken. ");
		System.out.println("\nWhat is your bankroll? (Total amount of money) ");
		int response1 = keyboard.nextInt();
		SevenElevens one = new SevenElevens(response1);
		bankRoll = response1;
		
		int response2 = 0;
		int a = 1;
		while (a == 1){
		
			do {
		System.out.println("How much will you bet?");
		response2 = keyboard.nextInt();

		//if bet is invalid
		if (response2 > bankRoll) {
			System.out.println("Error! Please provide a bet within "
					+ "the amount of your bankroll.");
			}
			} while (response2 > bankRoll);
		bets = response2;

		//start rolling
		end = false;
		System.out.println(one.roll1());
		keyboard.nextLine();
		
		while (end == false) {
			System.out.print(one.roll2());
			keyboard.nextLine();
		}
		
		System.out.println("Your bankroll is now " + bankRoll + ".");
		
			System.out.println("\nWould you like to try again? \n"
					+ "Type 1 for yes and 2 for no.");
			a = keyboard.nextInt();
		}
	}
		
}

