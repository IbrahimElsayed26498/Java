// Date.java

public class Date
{
  private int month;
  private int day;
  private int year;

  public Date(int mm, int dd, int yyyy)
  {
    setMonth( mm );
    setDay( dd );
    setYear( yyyy );
  }

  public void setMonth( int mm )
  {
    if (( mm >= 1 ) && ( mm <= 12))
      month = mm;
    else
      System.out.println("Month must be in [1,12]");
  }

  public void setDay( int dd )
  {
    if (( dd >= 1 ) && ( dd <= 31))
      day = dd;
    else
      System.out.println("Day must be in [1,31]");
  }

  public void setYear( int yyyy )
  {
    if ( yyyy >= 1900 )
      year = yyyy;
    else
      System.out.println("Must Use A Relevant Year");
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

  public void displayDate()
  {
      System.out.printf("Your Date Is %d / %d / %d\n", getMonth(), getDay(), getYear());
  }

}
