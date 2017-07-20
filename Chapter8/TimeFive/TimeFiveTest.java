// TimeTwoTest.java

public class TimeFiveTest
{
  public static void main(String[] args)
  {
    TimeFive t1 = new TimeFive();
    TimeFive t2 = new TimeFive(2);
    TimeFive t3 = new TimeFive(21, 34);
    TimeFive t4 = new TimeFive(12, 25, 42);
    TimeFive t5 = new TimeFive( t4 );

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

    t5.Tick();
    TimeFive t6 = new TimeFive( t5 );

    System.out.println( "t6: t5 ticked : second incremented" );
    System.out.printf( " %s\n", t6.toUniversalString() );
    System.out.printf( " %s\n", t6.toString() );

    t6.incrementMinute();
    TimeFive t7 = new TimeFive( t6 );

    System.out.println( "t7: t6 minute incremented" );
    System.out.printf( " %s\n", t7.toUniversalString() );
    System.out.printf( " %s\n", t7.toString() );

    t7.incrementHour();
    TimeFive t8 = new TimeFive( t7 );

    System.out.println( "t8: t7 hour incremented" );
    System.out.printf( " %s\n", t8.toUniversalString() );
    System.out.printf( " %s\n", t8.toString() );

    // attempt to initialize t6 with invalid values
    try
    {
      TimeFive t9 = new TimeFive( 27, 74, 99 ); // invalid values
    } //endtry
    catch ( IllegalArgumentException error )
    {
      System.out.printf( "\nException while initializing t9: %s\n",
      error.getMessage() );
    }
  }
}
