// TrafficLight.java
// Uses anonymous objects new TimeFour(kkk) to declare constants of enum type

public enum TrafficLight
{
  // declare constants of enum type
  RED( new TimeFour(300) ),
  GREEN( new TimeFour(600) ),
  YELLOW( new TimeFour(100) );

  // instance fields
  private final TimeFour duration; // duration of lights ( in seconds ) when turned on

  TrafficLight()
  {
    this( new TimeFour(0));
  }

  // enum constructor
  TrafficLight( TimeFour timing )
  {
    duration = timing;//.getSeconds();
  } // end enum Book constructor

  // accessor for field duration
  public TimeFour getDuration()
  {
    return duration;
  } // end method getTitle
}
