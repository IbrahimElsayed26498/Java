// Minimum.java

import java.util.Scanner;

public class Minimum
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner( System.in );

    double number1, number2, number3;

    System.out.println("Enter Three Real Numbers Separated With Spaces");
    number1 = input.nextDouble();
    number2 = input.nextDouble();
    number3 = input.nextDouble();

    double result = minimum3( number1, number2, number3 );

    System.out.println("Minimum Is " + result);

  }

  public static double minimum3( double x, double y, double z )
  {
    return Math.min( x, Math.min(y,z));
  }
}
