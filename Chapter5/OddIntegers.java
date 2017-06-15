// OddIntegers.java

import java.util.Scanner;

public class OddIntegers
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    System.out.println("This program computes the product of odd integers between 1 and a certain integer");
    System.out.printf("Please Enter The Maximum Integer  : ");
    int high = input.nextInt();

    int product = 1, low = 0;

    for ( int i = 0; i < high; i++)
    {
      if ( i % 2 == 1)
        product *= i;
    }

    System.out.printf("The product of odd integers between %d and %d is %d", low, high, product);
  }
}
