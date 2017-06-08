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
      if ( amount < 0.0 )
          setBalance( getBalance() + amount );
      else
          System.out.println("Can't deposit negative amount");
  }

  public void debit ( double withdrawal )
  {
      if ( withdrawal <= getBalance() )
          setBalance( getBalance() - withdrawal );
      else
          System.out.println("You can't eat your cake and have it");
  }
}
