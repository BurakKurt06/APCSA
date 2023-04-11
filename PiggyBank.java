public class PiggyBank
{
  private int pennies;
  private int nickels;
  private int dimes;
  private int quarters;

  public PiggyBank()
  {

  }

  public void addPennies(int numPennies)
  {
    pennies = pennies + numPennies;
  }

  public void addNickels(int numNickels)
  {
     nickels = nickels + numNickels;
  }

  public void addDimes(int numDimes)
  {
     dimes = dimes + numDimes;
  }

  public void addQuarters(int numQuarters)
  {
	  quarters = quarters + numQuarters;
  }
  public double bankTotal()
  {
    double total = 0.0;
    total = pennies * 0.01 + nickels * 0.05 + dimes * 0.10 + quarters * 0.25;
    return total;
  }

  }