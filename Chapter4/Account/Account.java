// Account.java

public class Account
{
  private int accountNumber;
  private double balanceBF;
  private int itemsCharged;
  private int creditsApplied;
  private int creditLimit;

  public Account( int account, double balBF, int items, int charge, int limit )
  {
    setAccountNumber( account );
    setBalanceBF( balBF );
    setItemsCharged( items );
    setCreditsApplied( charge );
    setCreditLimit( limit );
  }

  public void setAccountNumber( int account )
  {
    accountNumber = account;
  }

  public void setBalanceBF( double balBF )
  {
    balanceBF = balBF;
  }

  public void setItemsCharged( int items )
  {
    itemsCharged = items;
  }

  public void setCreditsApplied( int charge )
  {
    creditsApplied = charge;
  }

  public void setCreditLimit( int limit )
  {
    creditLimit = limit;
  }

  public int getAccountNumber( )
  {
    return accountNumber;
  }

  public double getBalanceBF( )
  {
    return balanceBF;
  }

  public int getItemsCharged( )
  {
    return itemsCharged;
  }

  public int getCreditsApplied( )
  {
    return creditsApplied;
  }

  public int getCreditLimit( )
  {
    return creditLimit;
  }
}
