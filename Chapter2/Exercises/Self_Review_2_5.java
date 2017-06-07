/*
  Self Review Exercise 2.5
*/

import java.util.Scanner;

public class Self_Review_2_5
{
  public static void main (String[] args)
  {
    Scanner input = new Scanner (System.in);

    System.out.printf("This program calculates the product of three integers\n");

    int first, second, third, result;

    System.out.print("Enter First Integer : ");
    first = input.nextInt();

    System.out.print("Enter Second Integer : ");
    second = input.nextInt();

    System.out.print("Enter Third Integer : ");
    third = input.nextInt();

    result = first * second * third;

    System.out.printf("Product Is %d ", result);
  }
}
