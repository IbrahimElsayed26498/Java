// TimeOneTest.java

public class TimeOneTest
{
  public static void main( String[] args)
  {
    // create and initialize a TimeOne object
    TimeOne time = new TimeOne();

    // output string representations of the time
    System.out.print( "The initial universal time is: " );
    System.out.println( time.toUniversalString() );
    System.out.print( "The initial standard time is:");
    System.out.println( time.toString() );
    System.out.println(); // output a blank line

    // change time and output updated time
    time.setTime( 13, 27, 6 );
    System.out.print( "Universal time after setTime is: " );
    System.out.println( time.toUniversalString() );
    System.out.print( "Standard time after setTime is: ");
    System.out.println( time.toString() );
    System.out.println(); // output a blank line

    // attempt to set time with invalid values
    try
    {
      time.setTime( 99, 99, 99 ); // all values out of range
    }//endtry
    catch ( IllegalArgumentException error )
    {
      System.out.printf( "Exception: %s\n\n", error.getMessage() );
    } // end catch

    // display time after attempt to set invalid values
    System.out.println( "After attempting invalid settings:" );
    System.out.print( "Universal time: " );
    System.out.println( time.toUniversalString() );
    System.out.print( "Standard time: " );
    System.out.println( time.toString() );

  }
}
