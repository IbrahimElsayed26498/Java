// Account.java

public class SavingsAccount
{
  private static double annualInterestRate; // Annual Interest Rate For All Account Rate
  private double savingsBalance; // Amount on deposit

  public SavingsAccount(  )
  {
    this(0.0, 0.00);
  }

  public SavingsAccount( double savings )
  {
    if ( savings > 1.00)
    {
      setSavingsBalance(savings);
      setAnnualInterestRate(0.00);
    }
  }

  public SavingsAccount(double interestRate, double balance)
  {
    annualInterestRate = ( interestRate >= 0.00 ? interestRate : 0.00 );
    savingsBalance = ( balance >= 0.00 ? balance : 0.00 );
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
    double l = getSavingsBalance() * getAnnualInterestRate() / 12;
    setSavingsBalance( getSavingsBalance() + l);
    return l;
  }
}
