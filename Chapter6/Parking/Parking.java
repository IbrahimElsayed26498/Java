// Parking.java

import java.util.Scanner;

public class Parking
{
  public static void main(String[] args )
  {
    System.out.println("Program Finds The Parking Charges For a vehicle");

    Scanner input = new Scanner (System.in);

    double hours;
    System.out.print("Enter The Number of Hours ( 0.0 to 24.0) Your Car Was Parked Here : ");
    hours = input.nextDouble();

    double charge = 0.00;

    if (hours <= 3.00)
      charge = 2.00;
    else
    {
      charge = Math.min( 2.00 + 0.50 * ( hours - 3.00), 10.00);
    }

    System.out.printf("Your parking Charge Is %.2f", charge);
  }
}
