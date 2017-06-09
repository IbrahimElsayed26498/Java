// HealthProfile.java

public class HealthProfile
{
  private String firstName;
  private String lastName;
  private String genderMF;
  private int month;
  private int day;
  private int year;
  private double height;
  private double weight;

  public HealthProfile( String fName, String lName, String gender, int mm, int dd, int yyyy, double h, double wt )
  {
    setFirstName( fName );
    setLastName( lName );
    setGenderMF( gender );
    setMonth( mm );
    setDay( dd );
    setYear( yyyy );
    setHeight( h );
    setWeight( wt );
  }

  public void setFirstName( String fName )
  {
      firstName = fName;
  }

  public void setLastName( String lName )
  {
      lastName = lName;
  }

  public void setGenderMF( String gender )
  {
      genderMF = gender;
  }

  public void setMonth( int mm )
  {
      if (( mm >= 1 ) && ( mm <= 12 ))
        month = mm;
  }

  public void setDay( int dd )
  {
      if (( dd >= 1 ) && ( dd <= 31 ))
        day = dd;
  }

  public void setYear( int yyyy )
  {
      if ( yyyy >= 1900 )
        year = yyyy;
  }

  public void setHeight( double h )
  {
      if ( h >= 100 )
        height = h;
  }

  public void setWeight( double wt )
  {
      if ( wt >= 70 )
        weight = wt;
  }

  public String getFirstName( )
  {
      return firstName;
  }

  public String getLastName( )
  {
      return lastName;
  }

  public String getGenderMF( )
  {
      return genderMF;
  }

  public int getMonth( )
  {
      return month;
  }

  public int getDay( )
  {
      return day;
  }

  public int getYear( )
  {
      return year;
  }

  public double getHeight( )
  {
      return height;
  }

  public double getWeight( )
  {
      return weight;
  }

  public int ageInYears()
  {
    return 2017 - getYear();
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

  public double getBodyMassIndex()
  {
    double BMI = getWeight() / ( getHeight() * getHeight() );
    return BMI;
  }
}
