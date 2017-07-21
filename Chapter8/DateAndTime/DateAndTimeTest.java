// DateAndTimeTest.java

public class DateAndTimeTest
{
  public static void main( String[] args )
  {
    // Instantiate DateAndTime Objects
    DateAndTime timeA = new DateAndTime(1, 23, 2017, 9, 34);
    DateAndTime timeB = new DateAndTime(2, 2, 2016, 5);
    DateAndTime timeC = new DateAndTime(4, 6, 2006, 5, 5, 54);
    TimeFive time = new TimeFive(6, 6, 6);
    DateAndTime timeD = new DateAndTime(2, 2, 2016, time);
    DateAndTime timeE = new DateAndTime(2, 2, 2016);

    // timeA
    System.out.println( "Constructed with:" );
    System.out.println( "timeA: all arguments except secods defaulted" );
    System.out.printf( " %s\n", timeA.toString() );

    // timeB
    System.out.println( "timeB: month, day, year and hour defaulted" );
    System.out.printf( " %s\n", timeB.toString() );

    // timeC
    System.out.println( "timeC: month, day, year, hour, minute and second defaulted" );
    System.out.printf( " %s\n", timeC.toString() );

    // timeD
    System.out.println( "timeD: month, day, year, anf time object defaulted" );
    System.out.printf( " %s\n", timeD.toString() );

    // timeE
    System.out.println( "timeE: month, day, year defaulted" );
    System.out.printf( " %s\n", timeE.toString() );

    // Make a tick on timeE
    System.out.println( "tick timeE" );
    System.out.printf( "FROM %s", timeE.toString() );
    timeE.Tick();
    System.out.printf( " TO %s\n", timeE.toString() );

    // Increment minute on timeD
    System.out.println( "Increment minute on timeD" );
    System.out.printf( "FROM %s", timeD.toString() );
    timeD.incrementMinute();
    System.out.printf( " TO %s\n", timeD.toString() );

    // Increment hour on timeC
    System.out.println( "Increment hour on timeC" );
    System.out.printf( "FROM %s", timeC.toString() );
    timeC.incrementHour();
    System.out.printf( " TO %s\n", timeC.toString() );

    // Increment day on timeB
    System.out.println( "Increment day on timeB" );
    System.out.printf( "FROM %s", timeB.toString());
    timeB.nextDay();
    System.out.printf( " TO %s\n", timeB.toString());

    // Increment month on timeA
    System.out.println( "Increment month on timeA" );
    System.out.printf( "FROM %s", timeA.toString());
    timeA.nextMonth();
    System.out.printf( " TO %s\n", timeA.toString());

    // Increment year on TimeA
    System.out.println( "Increment year on timeA" );
    System.out.printf( "FROM %s", timeA.toString());
    timeA.nextYear();
    System.out.printf( " TO %s\n", timeA.toString());

  }
}
