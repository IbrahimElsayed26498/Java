// CarPool.java
// Program Exhibits Car Pooling Statistics

import java.util.Scanner;

public class CarPool {
  public static void main (String[] args){

    Scanner input = new Scanner ( System.in );

    float miles, gallonCost, milesPerGallon;
    int parkingFees, dailyTolls;
    float dailyDrivingCosts = 0;

    System.out.println("Enter The Number Of Miles Driven Today : ");
    miles = input.nextFloat();

    System.out.println("Enter The Cost Of A Gallon Of Gasoline : ");
    gallonCost = input.nextFloat();

    System.out.println("Enter The Average Miles Per Gallon : ");
    milesPerGallon = input.nextFloat();

    System.out.println("Enter Daily Parking Fees : ");
    parkingFees = input.nextInt();

    System.out.println("Enter The Daily Cost Of Tolls : ");
    dailyTolls = input.nextInt();

    dailyDrivingCosts = dailyTolls + parkingFees + miles / milesPerGallon * gallonCost;

    System.out.printf(" Miles Driven : %.2f \n", miles );
    System.out.printf(" Cost Of Gallon : %.2f \n", gallonCost );
    System.out.printf(" Average Miles Per Gallon : %.2f \n", milesPerGallon );
    System.out.printf(" Daily Parking Fees : %d \n", parkingFees );
    System.out.printf(" Daily Cost Of Tolls : %d \n", dailyTolls );
    System.out.printf(" Your Daily Driving Costs Is %.2f\n", dailyDrivingCosts );

  }
}
