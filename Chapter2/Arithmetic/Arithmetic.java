/*
  Arithmetic.java
  Finds the sum,product, difference and quotient of two integers
*/

import java.util.Scanner;

public class Arithmetic
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner ( System.in );

    int first, second;
    int sum , product, difference, quotient, average, small, large;

    System.out.print("Enter First Integer : ");
    first = input.nextInt();

    System.out.print("Enter Second Integer,Should be non-zero : ");
    second = input.nextInt();

    sum = first + second;
    product = first * second;
    difference = first - second;
    quotient = first / second;
    average = ( first + second ) / 2;

    if (first <= second)
      {
        small = first;
        large = second;
      }
    else
      {
        small = second;
        large = first;
      }


    System.out.printf("Sum of %d and %d = %d\n", first, second, sum );
    System.out.printf("Product of %d and %d = %d\n", first, second, product);
    System.out.printf("Difference between %d and %d = %d\n", first, second, difference);
    System.out.printf("Quotient of %d and %d = %d\n", first, second, quotient);
    System.out.printf("Average of %d and %d = %d\n", first, second, average);
    System.out.printf("Smaller of %d and %d = %d\n", first, second, small);
    System.out.printf("Larger of %d and %d = %d\n", first, second, large );
  }
}
