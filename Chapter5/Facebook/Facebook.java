// Facebook.java

public class Facebook
{
  public static void main(String[] args)
  {
    int currentUsers = 500;
    double growthRate = 0.05;
    int userBase;
    int countOne = 0,countTwo = 0;

    System.out.printf("%s\t%s\n", " Year ", " Facebook Users " );

    // calculate amount on deposit for each of ten years
    for ( int year = 1; year <= 100; year++ )
    {
      // calculate new amount for specified year
      userBase = (int)  ( currentUsers * Math.pow( 1.0 + growthRate, year ));

      if (userBase <= 1000)
        countOne = ( year / 4 ) + 2012;

      if (userBase <= 2000)
        countTwo = (int) (year / 4) + 2012;
      // display the year and the amount
      System.out.printf( "%4d : %d\n", year, userBase );
    } // end for

    System.out.printf("Facebook Will Get To 1 Billion In %d\n", countOne + 1);
    System.out.printf("Facebook Will Get To 2 Billion In %d\n", countTwo + 1);
  }
}
