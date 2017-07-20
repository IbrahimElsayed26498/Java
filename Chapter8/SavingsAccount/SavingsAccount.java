// Account.java

public class SavingsAccount
{
  private static double annualInterestRate; // Annual Interest Rate For All Account Rate
  private double savingsBalance; // Amount on deposit

  public SavingsAccount(  )
  {
    this(0.05, 2000.00);
  }

  public SavingsAccount( double interestRate )
  {
    this(interestRate, 2000.00);
  }

  public SavingsAccount(double interestRate, double balance)
  {
    annualInterestRate = ( interestRate >= 0.00 ? interestRate : 0.00 );
    savingsBalance = ( balance >= 2000.00 ? balance : 2000.00 );
  }

  public static void setAnnualInterestRate( double interestRate)
  {
    annualInterestRate = interestRate;
  }

  public double getAnnualInterestRate()
  {
    return annualInterestRate;
  }

  public void setSavingsBalance( double bal )
  {
    savingsBalance += bal;
  }

  public void updateBalance()
  {
    savingsBalance += getSavingsBalance();
  }

  public double getSavingsBalance()
  {
    return savingsBalance;
  }

  public double calculateMonthlyInterest()
  {
    return getSavingsBalance() * getAnnualInterestRate() / 12;
  }
}
