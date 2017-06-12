// Sales.java

public class Sales
{
  private double itemOne;
  private double itemTwo;
  private double itemThree;
  private double itemFour;

  public Sales(double item1, double item2, double item3, double item4 )
  {
    setItemOne( item1 );
    setItemTwo( item2 );
    setItemThree( item3 );
    setItemFour( item4 );
  }

  public void setItemOne( double item1 )
  {
    itemOne = item1;
  }

  public void setItemTwo( double item2 )
  {
    itemTwo = item2;
  }

  public void setItemThree( double item3 )
  {
    itemThree = item3;
  }

  public void setItemFour( double item4 )
  {
    itemFour = item4;
  }

  public double getItemOne( )
  {
    return itemOne;
  }

  public double getItemTwo( )
  {
    return itemTwo;
  }

  public double getItemThree( )
  {
    return itemThree;
  }

  public double getItemFour( )
  {
    return itemFour;
  }
}
