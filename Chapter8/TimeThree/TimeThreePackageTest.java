// TimeThreePackageTest.java
// TimeThree object used in an application

import com.deitel.jhtp.chapter8.TimeThree;

public class TimeThreePackageTest
{
  public static void main(String[] args )
  {
    TimeThree time = new TimeThree();

    // Output string representations of the time
    System.out.print("The intitial universal time is: " );
    System.out.println( time.toUniversalString());
    System.out.print("The intitial standard time is: " );
    System.out.println( time.toString());
    System.out.println();

    // Change time and output updated time
    time.setTime(13, 27, 6);
    System.out.print("The intitial universal time is: " );
    System.out.println( time.toUniversalString());
    System.out.print("The intitial standard time is: " );
    System.out.println( time.toString());
    System.out.println();

    // attempt to set time with invalied values
    try
    {
      time.setTime(99,99,99);
    }
    catch( IllegalArgumentException error )
    {
      System.out.printf("Exception: %s\n\n", error.getMessage());
    }

    // Display time after attempting to set invalied values
    System.out.print("After attempting invalied settings: " );
    System.out.print("Universal time: " );
    System.out.println( time.toUniversalString());
    System.out.print("Standard time: " );
    System.out.println( time.toString());
  }
}
