// TimeFour.java

public class TimeFour
{
  private static int seconds; // Number of seconds after mid

  public TimeFour()
  {
    this(0);
  }

  public TimeFour(int sec)
  {
    seconds = sec;
  }

  public TimeFour( TimeFour time )
  {
    this(time.getSeconds());
  }

  /*public TimeTwo(int h, int m)
  {
    this(h,m,0);
  }

  public TimeTwo(int h, int m, int s)
  {
    setTime(h,m,s);
  }

  public TimeTwo( TimeTwo time )
  {
    // invoke Time2 three-argument constructor
    this( time.getHour(), time.getMinute(), time.getSecond() );
  }

  public void setTime( int h, int m, int s )
  {
    setHour(h);
    setMinute(m);
    setSecond(s);
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
  }*/

  public int getSeconds()
  {
    return seconds;
  }

  public int getHour()
  {
    return seconds / 360;
  }

  public int getMinute()
  {
    return seconds / 60;
  }

  public int getSecond()
  {
    int s = seconds;

    if (s >= 0 && s < 60)
      seconds = s;
    if (s >= 60 )
      seconds = s % 60;

    return seconds;
  }

  public String toUniversalString()
  {
    return String.format( "%02d:%02d:%02d", getHour(), getMinute(), getSecond() );
  }

  // convert to String in standard-time format (H:MM:SS AM or PM)
  public String toString()
  {
    return String.format( "%d:%02d:%02d %s",
      (( getHour() == 0 || getHour() == 12 ) ? 12 : getHour() % 12 ),
      getMinute(),
      getSecond(),
      ( getHour() < 12 ? "AM" : "PM" ) );
  }
}
