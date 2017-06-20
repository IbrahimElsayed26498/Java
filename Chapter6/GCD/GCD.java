// GCD.java

import java.util.Scanner;

public class GCD
{
  public static void main(String[] args )
  {
    System.out.println("Program determines the Greatest Common Divisor (gcd) of two integers ");
  	int first, second;

    Scanner input = new Scanner(System.in);

    System.out.println("Enter Two Integers : ");

    first = input.nextInt();
    second = input.nextInt();

  	System.out.println("");
  	System.out.printf("GCD Of %d And %d Is %d\n", first, second, gcd(first, second));
  }

  public static int gcd(int first, int second )
  {
    int smaller = first;
  	if (second <= first)
  		smaller = second;

  	int i = 1, result = 1;

    while ( i < smaller )
    {
  		if ((first % i == 0) && (second % i == 0))
      {
        result = i;
      }
      i++;
  	}
    return result;
  }
}
