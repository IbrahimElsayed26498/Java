// Invoice.java

public class Invoice
{
  private String partNumber;
  private String partDescription;
  private int quantityPurchased;
  private double itemPrice;

  public Invoice(String number, String description, int quantity, double price )
  {
      setPartNumber( number );
      setPartDescription( description );
      setQuantityPurchased( quantity );
      setItemPrice( price );
  }

  public void setPartNumber( String number )
  {
      partNumber = number;
  }

  public void setPartDescription( String description )
  {
      partDescription = description;
  }

  public void setQuantityPurchased( int quantity )
  {
      if ( quantity < 0 )
        quantityPurchased = 0;
      else
        quantityPurchased = quantity;
  }

  public void setItemPrice( double price )
  {
      if ( price < 0.0 )
        itemPrice = 0.0;
      else
        itemPrice = price;
  }

  public String getPartNumber( )
  {
      return partNumber;
  }

  public String setPartDescription( )
  {
      return partDescription;
  }

  public int getQuantityPurchased( )
  {
      return quantityPurchased;
  }

  public double getItemPrice( )
  {
      return itemPrice;
  }

  public double getInvoiceAmount()
  {
    double amount = getQuantityPurchased() * getItemPrice();

    return amount;
  }

}
