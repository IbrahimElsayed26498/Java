// Date.java

public class Date
{
  private int month; // 1 - 12
  private int day; // 1 - 31 based on month
  private int year; // any year

  private static final int[] daysPerMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
  private static final int[] daysUpToMonth = {0,31, 59, 90,120,151,181,212,243,273,304,334,365};

  public Date( int theMonth, int theDay, int theYear )
  {
    month = checkMonth( theMonth );
    year = checkYear(theYear);
    day = checkDay( theDay );
  }

  public Date(String theMonth, int theDay, int theYear)
  {
    month = stringToMonth(theMonth);
    day = theDay;
    year = theYear;
  }

  public Date(int dayInYear, int theYear)
  {
    month = findMonthOfYear(dayInYear);
    day = findDayOfMonth(dayInYear);
    year = theYear;
  }

  private int checkMonth( int testMonth )
  {
    int t = 0;

    if ( testMonth > 12)
      t = testMonth % 12;
    if ( testMonth > 0 && testMonth <= 12 )
        t = testMonth;

    return t;
  }

  private int checkDay( int testDay )
  {
    int t = 0;
    if ( testDay > 31)
    {
      t = findDayOfMonth(testDay);
      if ( testDay > 0 && testDay <= daysPerMonth[month])
          t = testDay;

      if ( month == 2 && testDay == 29 && ( year % 400 == 0 || ( year % 4 == 0 && year % 100 != 0)))
          t = testDay;
    }
    if ( testDay <= 31)
      t = testDay;

    return testDay;
  }

  private int checkYear( int testYear )
  {
    if ( testYear > 1970 && testYear <= 3000 )
        return testYear;
    else
      throw new IllegalArgumentException("Month Must Be In [1970, 3000]");
  }

  public int getMonth()
  {
    return month;
  }

  public int getDay()
  {
    return day;
  }

  public int getYear()
  {
    return year;
  }

  public void nextDay()
  {
    day = checkDay( getDay() + 1 );
  }

  public void nextMonth()
  {
    month = checkMonth( getMonth() + 1 );
  }

  public void nextYear()
  {
    year = checkYear( getYear() + 1 );
  }

  public String toString()
  {
    return String.format("%d/%d/%d", getMonth(), getDay(), getYear());
  }

  public String toUnitedStatesString()
  {
    return String.format("%s %d, %d", monthToString(getMonth()), getDay(), getYear());
  }

  public String monthToString( int m)
  {
    String Month = "";

    switch( m )
    {
      case 1:
        Month = "January";
        break;
      case 2:
        Month = "February";
        break;
      case 3:
        Month = "March";
        break;
      case 4:
        Month = "April";
        break;
      case 5:
        Month = "May";
        break;
      case 6:
        Month = "June";
        break;
      case 7:
        Month = "July";
        break;
      case 8:
        Month = "August";
        break;
      case 9:
        Month = "September";
        break;
      case 10:
        Month = "October";
        break;
      case 11:
        Month = "November";
        break;
      case 12:
        Month = "December";
        break;
    }
    return Month;
  }

  public int stringToMonth( String s )
  {
    int integer = 0;

    switch( s )
    {
      case "January":
        integer = 1;
        break;
      case "February":
        integer = 2;
        break;
      case "March":
        integer = 3;
        break;
      case "April":
        integer = 4;
        break;
      case "May":
        integer = 5;
        break;
      case "June":
        integer = 6;
        break;
      case "July":
        integer = 7;
        break;
      case "August":
        integer = 8;
        break;
      case "September":
        integer = 9;
        break;
      case "October":
        integer = 10;
        break;
      case "November":
        integer = 11;
        break;
      case "December":
        integer = 12;
        break;
    }
    return integer;
  }

  public int findMonthOfYear( int dayOfYear )
  {
    int m = 0;

    for( int i = 0 ; i < 13;i++)
    {
      if ( dayOfYear >= daysUpToMonth[i] && dayOfYear < daysUpToMonth[i + 1])
          m = i + 1;
    }

    return m;
  }

  public int findDayOfMonth( int dayOfYear)
  {
    int n, k = 0;

    int m = findMonthOfYear(dayOfYear);

    for ( int i = 0; i < m; i++)
      k += daysPerMonth[i];

    n = dayOfYear - k;

    return n;
  }
}
