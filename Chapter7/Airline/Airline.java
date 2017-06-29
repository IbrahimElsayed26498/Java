// Airline.java
// Builds Airline Reservation System

import java.util.Scanner;

public class Airline
{
  static final int Full = 10;

  public static void main(String[] args )
  {
    System.out.println("Welcome To Your Favorite Airline Reservation System");

    int classes;

    int[] seats = new int[Full];

    for ( int i = 0; i < Full; i++)
        seats[i] = 0;

    displaySeats(seats);

    for ( int k = 0; k < Full; k++ )
    {
      System.out.printf("Would You Like To Fly First Class Or Economy ? \n");
      System.out.printf("Enter 1 For First Class And 2 For Economy\n");

      Scanner input = new Scanner( System.in );
      classes = input.nextInt();

      switch(classes)
      {
        case 1:
          {
            System.out.printf("\nYou prefer flying first class ");
            System.out.printf("\nDo choose a first class seat ( b/n 1 & 5) of your choice\n");

            int h;
            h = input.nextInt();

            seats[h - 1] = 1;

            if ((h >= 1) && (h <= 5))
            {
              System.out.printf("You've chosen to fly First Class\n");
              displaySeats(seats);
              System.out.printf("You've selected Seat %d \n", h );
              System.out.printf("Your Boarding Pass Is \n" );
              System.out.printf("Seat Number : %d\n Category : First Class \n", h );
            }
          }
          break;
        case 2:
          {
            System.out.printf("You prefer flying Economy\n");
            System.out.printf("\n Do choose an Economy seat ( b/n 6 & 10 ) of your choice\n");

            int e;
            e = input.nextInt();
            seats[e - 1] = 2;

            if ((e >= 6) && (e <= 10))
            {
              System.out.printf("You've chosen to fly Economy\n");
              displaySeats(seats);
              System.out.printf("You've selected Seat %d ", e );
              System.out.printf("Your Boarding Pass Is \n");
              System.out.printf("Seat Number : %d \n Category : Economy ", e);
            }
          }
          break;
        default:
          System.out.printf("Enjoy Your Flight!\n");
        }
    }
  }

  public static void displaySeats( int array[] )
  {
    for (int i = 0; i < Full; i++)
    {
      System.out.printf("%d\t%d\t", i + 1, array[i] );
      if ( array[i] == 0 )
          System.out.printf("Empty");
      else
      {
        if ( array[i] == 1 )
          System.out.printf("Filled ( First Class )");
        else
          System.out.printf("Filled ( Economy )");
      }
      System.out.println(" ");
    }
  }
}
