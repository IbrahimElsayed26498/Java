// Interest.java
// Compound Interest Calculations With For Loops

public class Interest
{
  public static void main(String[] args)
  {
    double amount;
    double principal = 1000.0;
    double rate = 0.05;

    System.out.printf("%s\t%s\n", " Year ", " Amount On Deposit " );

    // calculate amount on deposit for each of ten years
    for ( int year = 1; year <= 10; year++ )
    {
      // calculate new amount for specified year
      amount = principal * Math.pow( 1.0 + rate, year );
      // display the year and the amount
      System.out.printf( "%4d%,20.2f\n", year, amount );
    } // end for
  }
}
