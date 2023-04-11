//Burak Kurt
import java.util.Scanner;

public class PiggyBankTester
{
	public static void main(String[] args) 
	{

		int pennies;
		int nickels;
		int dimes;
		int quarters;

		Scanner sc = new Scanner(System.in);
		String choice = "";
		
		
		{		
		System.out.println("What type of coin to add(P, N, D, Q?");
	    choice = sc.next();
		}
		{
		if (choice == "P")
		
			System.out.print("Enter the number of pennies: ");
			pennies = sc.nextInt();
		}
		{
		else if (choice == "N")
		
			System.out.print("Enter the number of nickels: ");
			nickels = sc.nextInt();
		}
		{
		else if (choice == "D")
		
			System.out.print("Enter the number of dimes: ");
			dimes = sc.nextInt();
		}
		{
		else if (choice == "Q")
		
			System.out.print("Enter the number of quarters: ");
			quarters = sc.nextInt();
		}
		
		{
		PiggyBank bank = new PiggyBank();
		System.out.println("Your total change in dollars and cents is "+ bank.bankTotal());
		}


		}
		}