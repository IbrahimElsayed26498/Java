// FactorialTest.java

import java.util.Scanner;

public class FactorialTest
{
  public static void main( String[] args )
  {
    System.out.println("Program Prints The Natural Log Of A Number");
    Scanner input = new Scanner(System.in);

    int[] integer = new int[13];
    int[] integer_buffer = new int[13];
    int number;

    double natural = 0;

    System.out.printf("Enter A Number : ");
    number = input.nextInt();

    int i,j;

    integer[0] = 1;
    integer_buffer[0] = integer[0];
    integer_buffer[1] = integer[0];

    for ( i = 2; i < 13; i++)
    {
      integer[i] = i;
      integer_buffer[i] = Factorial.factorial(integer[i]);
    }

    natural = 1 + number;
    for ( j = 2; j < 13; j++){
      natural += Math.pow(number, j) / integer_buffer[j];
    }

    System.out.printf("Natural Log e of %d = %.2f", number, natural );

  }
}
