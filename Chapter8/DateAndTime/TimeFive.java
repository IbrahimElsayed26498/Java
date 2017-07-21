// TimeTwo.java

public class TimeFive
{
  private int hour;
  private int minute;
  private int second;

  public TimeFive()
  {
    this(0,0,0);
  }

  public TimeFive(int h)
  {
    this(h,0,0);
  }

  public TimeFive(int h, int m)
  {
    this(h,m,0);
  }

  public TimeFive(int h, int m, int s)
  {
    setTime(h,m,s);
  }

  public TimeFive( TimeFive time )
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

  public void Tick()
  {
    setSecond( getSecond() + 1);
  }

  public void incrementMinute()
  {
    setMinute( getMinute() + 1);
  }

  public void incrementHour()
  {
    setHour( getHour() + 1);
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
