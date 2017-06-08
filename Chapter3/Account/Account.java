// Account.java

public class Account
{
  private double balance;

  public Account( double initialBalance )
  {
    setBalance( initialBalance );
  }

  public void setBalance( double initialBalance )
  {
    if ( initialBalance > 0.0 )
      {
        balance = initialBalance;
      }
  }

  public double getBalance( )
  {
    return balance;
  }

  public void credit( double amount )
  {
      setBalance( getBalance() + amount );
  }
}
