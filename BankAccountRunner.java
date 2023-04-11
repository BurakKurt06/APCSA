//Burak Kurt
public class BankAccountRunner {
	public static void main(String [] args) {
		
		BankAccount one = new BankAccount();
		BankAccount two = new BankAccount("A105", 100);
	
		System.out.println(one);
		System.out.println(two);
		System.out.println();
		
		System.out.println("Depositing Money...");
		one.deposit(150);
		two.deposit(1500);
		System.out.println(one);
		System.out.println(two);
		System.out.println();
		
		System.out.println("Withdrawing Money...");
		one.withdraw(75);
		two.withdraw(900);
		System.out.println(one);
		System.out.println(two);
		System.out.println();
		
		System.out.println("Adding Interest");
		one.addInterest(3);
		two.addInterest(3.5);
		System.out.println(one);
		System.out.println(two);
		System.out.println();
		
		one.setAcctNumb("A165");
		System.out.println(one);
		
		one.setBalance(500);
		System.out.println(one);
}
}
