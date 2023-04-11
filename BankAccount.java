//Burak Kurt
public class BankAccount {
	private String acctNumb;
	private double balance;
	
	public BankAccount() {
		acctNumb = "Default";
		balance = 0;
	}	
	public BankAccount(String ac, double b) {
			acctNumb = ac;
			balance = b;
		}
		
	

	public String getAcctNumb() {
		return acctNumb;
	}

	public void setAcctNumb(String acctNumb) {
		this.acctNumb = acctNumb;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposit (double x) {
		balance += x;
	}
	
	public void withdraw (double x) {
		balance -= x;
	}
	
	public void addInterest (double x) {
		balance += balance * ((x /100 )/12);
	}
	
	@Override
	public String toString () {
		return "Bank Account #:" + acctNumb + "\nBalance: $" + balance + "\n";
	}
	
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
	}
}