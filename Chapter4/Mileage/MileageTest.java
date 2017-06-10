// MileageTest.java

import java.util.Scanner;

public class MileageTest
{
  public static void main ( String[] args )
  {
    Scanner input = new Scanner (System.in);
    Mileage sample = new Mileage(0,0);

    int counter = 0;
    int miles = 0;
    int gallons = 0;
    float average = 0;

    while ( counter <= 10 )
    {
      // prompt user for input and obtain value from user
      System.out.print( "Enter Number Of Miles : " );
      sample.setMilesDriven( input.nextInt());

      System.out.println("Enter Number of Gallons Used : ");
      sample.setGallonsUsed( input.nextInt());

      float avg = sample.milesPerGallon();

      average += avg;
      // increment studentCounter so loop eventually terminates
      counter++;
    }

    System.out.printf("The Total Miles Per Gallon For The Last %d Trips Is %.2f: ", counter, average);
  }
}
