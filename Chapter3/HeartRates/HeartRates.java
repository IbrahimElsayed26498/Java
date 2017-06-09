// HeartRates.java

public class HeartRates
{
  private String firstName;
  private String lastName;
  private int monthOfBirth;
  private int dayOfBirth;
  private int yearOfBirth;

  public HeartRates( String fName, String lName, int month, int day, int year )
  {
      setFirstName( fName );
      setLastName( lName );
      setMonthOfBirth( month );
      setDayOfBirth( day );
      setYearOfBirth( year );
  }

  public void setFirstName( String fName )
  {
    firstName = fName;
  }

  public void setLastName( String lName )
  {
    lastName = lName;
  }

  public void setMonthOfBirth( int month )
  {
    monthOfBirth = month;
  }

  public void setDayOfBirth( int day )
  {
    dayOfBirth = day;
  }

  public void setYearOfBirth( int year )
  {
    yearOfBirth = year;
  }

  public String getFirstName( )
  {
    return firstName;
  }

  public String getLastName( )
  {
    return lastName;
  }

  public int getMonthOfBirth( )
  {
    return monthOfBirth;
  }

  public int getDayOfBirth( )
  {
    return dayOfBirth;
  }

  public int getYearOfBirth( )
  {
    return yearOfBirth;
  }

  public int ageInYears()
  {
    return 2017 - getYearOfBirth();
  }

  public int maximumHeartRate()
  {
    return 220 - ageInYears();
  }

  public double lowerTargetHeartRate()
  {
    return 0.5 * maximumHeartRate();
  }

  public double higherTargetHeartRate()
  {
    return 0.85 * maximumHeartRate();
  }
}
