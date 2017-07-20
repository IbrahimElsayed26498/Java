// Date.java

public class Date
{
  private int month; // 1 - 12
  private int day; // 1 - 31 based on month
  private int year; // any year

  private static final int[] daysPerMonth = {0,31,28,31,30,31,30,31,31,30,31,30,31};

  public Date( int theMonth, int theDay, int theYear )
  {
    month = checkMonth( theMonth );
    year = checkYear(theYear);
    day = checkDay( theDay );
  }

  private int checkMonth( int testMonth )
  {
    if ( testMonth > 0 && testMonth <= 12 )
        return testMonth;
    else
      throw new IllegalArgumentException("Month Must Be [1, 12] ");
  }

  private int checkDay( int testDay )
  {
    if ( testDay > 0 && testDay <= daysPerMonth[month])
        return testDay;

    if ( month == 2 && testDay == 29 && ( year % 400 == 0 || ( year % 4 == 0 && year % 100 != 0)))
        return testDay;

    throw new IllegalArgumentException("Day Out of range for the specified month and year");
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
}
