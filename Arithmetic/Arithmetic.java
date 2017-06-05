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
    int sum , product, difference, quotient;

    System.out.print("Enter First Integer : ");
    first = input.nextInt();

    System.out.print("Enter Second Integer,Should be non-zero : ");
    second = input.nextInt();

    sum = first + second;
    product = first * second;
    difference = first - second;
    quotient = first / second;


    System.out.printf("Sum of %d and %d = %d\n", first, second, sum );
    System.out.printf("Product of %d and %d = %d\n", first, second, product);
    System.out.printf("Difference between %d and %d = %d\n", first, second, difference);
    System.out.printf("Quotient of %d and %d = %d\n", first, second, quotient);
  }
}
