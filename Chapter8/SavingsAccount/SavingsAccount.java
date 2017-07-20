// Account.java

public class SavingsAccount
{
  private static double annualInterestRate; // Annual Interest Rate For All Account Rate
  private int savingsBalance; // Amount on deposit

  public SavingsAccount(  )
  {
    this(0.05, 2000);
  }

  public SavingsAccount( double interestRate )
  {
    this(interestRate, 2000);
  }

  public SavingsAccount(double interestRate, int balance)
  {
    annualInterestRate = ( interestRate >= 0.00 ? interestRate : 0.00 );
    savingsBalance = ( balance >= 2000 ? balance : 2000 );
  }

  public static void setAnnualInterestRate( double interestRate)
  {
    annualInterestRate = interestRate;
  }

  public double getAnnualInterestRate()
  {
    return annualInterestRate;
  }

  public void setSavingsBalance( int bal )
  {
    savingsBalance += bal;
  }

  public void updateBalance()
  {
    savingsBalance += getSavingsBalance();
  }

  public int getSavingsBalance()
  {
    return savingsBalance;
  }

  public double calculateMonthlyInterest()
  {
    return getSavingsBalance() * getAnnualInterestRate() / 12;
  }
}
