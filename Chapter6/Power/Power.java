// Power.java

import java.util.Scanner;

public class Power
{
  public static void main( String[] args )
  {
    System.out.println("Program raises a integer to integer power");

    int base, exponent;

    Scanner input = new Scanner( System.in );

    System.out.printf("Enter integer : ");
    base = input.nextInt();

    System.out.println("Enter Exponent : ");
    exponent = input.nextInt();

    System.out.printf("%d raised to power %d = %d\n", base, exponent, integerPower(base, exponent));
  }

  public static int integerPower(int base, int exponent)
  {
    int i = 1, result = 1;
    while (i <= exponent)
    {
      result *= base;
      i++;
    }
    return result;
  }
}
