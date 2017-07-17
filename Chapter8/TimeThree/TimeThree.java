// TimeThree.java
// TimeThree class declaration maintains the time in 24-hour format

package com.deitel.jhtp.chapter8;

public class TimeThree
{
  private int hour;
  private int minute;
  private int second;

  public void setTime( int h, int m, int s )
  {
    // Validate hour, minute and second

    if ( ( h >= 0 && h <= 23) && ( m >= 0 && m < 60 ) && ( s >= 0 && s < 60 ))
    {
      hour = h;
      minute = m;
      second = s;
    }
    else
    {
      throw new IllegalArgumentException( "Hour, Minute and/or second was out of range" );
    }
  }

  // convert to String in universal-time format (HH:MM:SS)
  public String toUniversalString()
  {
    return String.format( "%02d:%02d:%02d", hour, minute, second );
  }

  // convert to String in standard-time format (H:MM:SS AM or PM)
  public String toString()
  {
    return String.format( "%d:%02d:%02d %s",
      (( hour == 0 || hour == 12 ) ? 12 : hour % 12 ),
      minute,
      second,
      ( hour < 12 ? "AM" : "PM" ) );
  }
}
