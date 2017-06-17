// Maximum.java

import java.util.Scanner;

public class Maximum
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner( System.in );

    double number1, number2, number3;

    System.out.println("Enter Three Floating Point Values Separated With Spaces");
    number1 = input.nextDouble();
    number2 = input.nextDouble();
    number3 = input.nextDouble();

    double result = maximum( number1, number2, number3 );

    System.out.println("Maximum Is " + result);

  }

  public static double maximum( double x, double y, double z )
  {
    return Math.max( x, Math.max(y,z));
  }
}
