// TrafficLightTest.java

import java.util.EnumSet;

public class TrafficLightTest
{
  public static void main( String[] args )
  {
    System.out.println("All TrafficLights: \n");

    // print all trafficlights in enum light
    for ( TrafficLight lights : TrafficLight.values() )
        System.out.printf("%-10s%-45s\n", lights, lights.getDuration().getSeconds() );

    System.out.println("\nDisplay A Range Of Enum Constants: \n");
  }
}
