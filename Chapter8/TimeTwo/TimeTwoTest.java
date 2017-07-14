// TimeTwoTest.java

public class TimeTwoTest
{
  public static void main(String[] args)
  {
    TimeTwo t1 = new TimeTwo();
    TimeTwo t2 = new TimeTwo(2);
    TimeTwo t3 = new TimeTwo(21, 34);
    TimeTwo t4 = new TimeTwo(12, 25, 42);
    TimeTwo t5 = new TimeTwo( t4 );

    System.out.println( "Constructed with:" );
    System.out.println( "t1: all arguments defaulted" );
    System.out.printf( " %s\n", t1.toUniversalString() );
    System.out.printf( " %s\n", t1.toString() );

    System.out.println("t2: hour specified; minute and second defaulted" );
    System.out.printf( " %s\n", t2.toUniversalString() );
    System.out.printf( " %s\n", t2.toString() );

    System.out.println("t3: hour and minute specified; second defaulted" );
    System.out.printf( " %s\n", t3.toUniversalString() );
    System.out.printf( " %s\n", t3.toString() );

    System.out.println( "t4: hour, minute and second specified" );
    System.out.printf( " %s\n", t4.toUniversalString() );
    System.out.printf( " %s\n", t4.toString() );

    System.out.println( "t5: Time2 object t4 specified" );
    System.out.printf( " %s\n", t5.toUniversalString() );
    System.out.printf( " %s\n", t5.toString() );

    // attempt to initialize t6 with invalid values
    try
    {
      TimeTwo t6 = new TimeTwo( 27, 74, 99 ); // invalid values
    } //endtry
    catch ( IllegalArgumentException error )
    {
      System.out.printf( "\nException while initializing t6: %s\n",
      error.getMessage() );
    }
  }
}
