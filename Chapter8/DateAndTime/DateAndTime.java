// DateAndTime.java

public class DateAndTime
{
  private int month; // 1 - 12
  private int day; // 1 - 31 based on month
  private int year; // any year
  private int hour;
  private int minute;
  private int second;

  private static final int[] daysPerMonth = {0,31,28,31,30,31,30,31,31,30,31,30,31};

  public DateAndTime()
  {
    this(0, 0, 0, 0, 0, 0);
  }

  public DateAndTime( int theMonth)
  {
    this(theMonth, 0, 0, 0, 0, 0);
  }

  public DateAndTime( int theMonth, int theDay)
  {
    this(theMonth, theDay, 0, 0, 0, 0);
  }

  public DateAndTime( int theMonth, int theDay, int theYear)
  {
    this(theMonth, theDay, theYear, 0, 0, 0);
  }

  public DateAndTime( int theMonth, int theDay, int theYear, int theHour)
  {
    this(theMonth, theDay, theYear, theHour, 0, 0);
  }

  public DateAndTime( int theMonth, int theDay, int theYear, int theHour, int theMinute)
  {
    this(theMonth, theDay, theYear, theHour, theMinute, 0);
  }

  public DateAndTime( int theMonth, int theDay, int theYear, TimeFive time)
  {
    this(theMonth, theDay, theYear, time.getHour(), time.getMinute(), time.getSecond());
  }

  public DateAndTime( int theMonth, int theDay, int theYear, int theHour, int theMinute, int theSecond)
  {
    month = checkMonth( theMonth );
    year = checkYear(theYear);
    day = checkDay( theDay );
    setTime( theHour, theMinute, theSecond);
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

  public void setTime( int theHour, int theMinute, int theSecond)
  {
    setHour( theHour );
    setMinute( theMinute );
    setSecond( theSecond );
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

  public int getHour()
  {
    return hour;
  }

  public int getMinute()
  {
    return minute;
  }

  public int getSecond()
  {
    return second;
  }

  public void setHour( int h )
  {
    if ( h >= 0 && h < 24 )
      hour = h;
    else
      throw new IllegalArgumentException("Hour must be in [0,23]");
  }

  public void setMinute( int m )
  {
    if ( m >= 0 && m < 60 )
        minute = m;
    else
        throw new IllegalArgumentException(" Minute must be in [0,60]");
  }

  public void setSecond( int s )
  {
    if ( s >= 0 && s < 60 )
        second = ((s >= 0 && s < 60) ? s : 0);
    else
        throw new IllegalArgumentException("Second must be in [0,60]");
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

  public String toUniversalString()
  {
    return String.format("%d/%d/%d : %02d:%02d:%02d", getMonth(), getDay(), getYear(), getHour(), getMinute(), getSecond());
  }

  public String toString()
  {
    return String.format( "%d/%d/%d :: %d:%02d:%02d %s", getMonth(), getDay(), getYear(),
      (( getHour() == 0 || getHour() == 12 ) ? 12 : getHour() % 12 ), getMinute(), getSecond(), ( getHour() < 12 ? "AM" : "PM" ) );

  }

  public void Tick()
  {
    if ( (getSecond() == 59 && getMinute() == 59) && ( getHour() == 23 ))
    {
      nextDay();
      setSecond(0);
    }
    else
      setSecond( getSecond() + 1);
  }

  public void incrementMinute()
  {
    if (getMinute() == 59 && getHour() == 23)
    {
      nextDay();
      setMinute(0);
    }
    else
      setMinute( getMinute() + 1);
  }

  public void incrementHour()
  {
    if (getHour() == 23)
    {
      nextDay();
      setHour(0);
    }
    else
      setHour( getHour() + 1);
  }
}
