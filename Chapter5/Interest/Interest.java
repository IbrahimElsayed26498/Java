// Interest.java
// Compound Interest Calculations With For Loops
// Exercise 5.14 And 5.18 Solved Here

import java.util.Scanner;

public class Interest
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner ( System.in );

    double amount;
    double principal = 100000.0; // In cents
    double rate = 0.05;

    System.out.printf("To Find Simple Interest, Enter 1\nTo Find Compound Interest, Enter 2\n");
    int choice = input.nextInt();

    switch( choice )
    {
      case 1:
        {
          System.out.printf("Simple Interest Is $%.2f", principal * rate * 10 / 100 );
        }
        break;

      case 2:
        {
          System.out.printf("%s\t\t%s\n", " Year ", "Amount On Deposit " );

          // calculate amount on deposit for each of ten years
          for ( int year = 1; year <= 10; year++ )
          {
            // calculate new amount for specified year
            amount = principal * Math.pow( 1.0 + rate, year );
            // display the year and the amount
            System.out.printf( " %4d\t\t$%.0f,¢%.0f \n", year, amount / 100, amount % 100 );
          } // end for
        }
        break;

      default:
        System.out.printf("You need to enter either 1 or 2");
        break;
    }
  }
}
