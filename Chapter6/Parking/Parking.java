// Parking.java

import java.util.Scanner;

public class Parking
{
  public static void main(String[] args )
  {
    System.out.println("Program Finds The Parking Charges For Customers' Cars");

    Scanner input = new Scanner (System.in);

    double[] hours = new double[5];

    for ( int i = 0; i < 5; i++)
    {
      System.out.printf("Enter The Number of Hours ( 0.0 to 24.0) Car %d Was Parked Here : ", i + 1 );
      hours[i] = input.nextDouble();
    }

    System.out.printf("Car\t\tParking Charge\n");
    for ( int j = 0; j < 5; j++)
    {
      System.out.printf("Car %d\t\t  %.2f\n", j, findCharge(hours[j]));
    }
  }

  public static double findCharge( double hh )
  {
    double charge = 0.00;

    if (hh <= 3.00)
      charge = 2.00;
    else
    {
      charge = Math.min( 2.00 + 0.50 * ( hh - 3.00), 10.00);
    }

    return charge;
  }
}
