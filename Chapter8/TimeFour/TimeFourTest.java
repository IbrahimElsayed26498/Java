// TimeTwoTest.java

public class TimeFourTest
{
  public static void main(String[] args)
  {
    TimeFour t1 = new TimeFour();
    TimeFour t2 = new TimeFour(200);
    TimeFour t3 = new TimeFour(2000);
    TimeFour t4 = new TimeFour( t3 );

    System.out.println( "Constructed with:" );
    System.out.println( "t1: all arguments defaulted" );
    System.out.printf( " %s\n", t1.toUniversalString() );
    System.out.printf( " %s\n", t1.toString() );

    System.out.println("t2: seconds specified; minute and second defaulted" );
    System.out.printf( " %s\n", t2.toUniversalString() );
    System.out.printf( " %s\n", t2.toString() );

    System.out.println("t3: hour and minute specified; second defaulted" );
    System.out.printf( " %s\n", t3.toUniversalString() );
    System.out.printf( " %s\n", t3.toString() );

    System.out.println( "t4: hour, minute and second specified" );
    System.out.printf( " %s\n", t4.toUniversalString() );
    System.out.printf( " %s\n", t4.toString() );

    // attempt to initialize t6 with invalid values
    try
    {
      TimeFour t5 = new TimeFour( -100 ); // invalid values
    } //endtry
    catch ( IllegalArgumentException error )
    {
      System.out.printf( "\nException while initializing t5: %s\n",
      error.getMessage() );
    }
  }
}
