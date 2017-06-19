// Parity.java

import java.util.Scanner;

public class Parity
{
  public static void main( String[] args )
  {
    System.out.printf("Please Enter 10 Integers : \n");

    Scanner input = new Scanner( System.in );

    int[] array = new int[10];

    for ( int i = 0; i < 10; i++ )
    {
      System.out.printf("Enter Integer %d : ", i + 1);
      array[i] = input.nextInt();
    }

    System.out.printf("\n\nInteger\tParity\n");

    for ( int j = 0; j < 10; j++ )
    {
      if ( isEven( array[j]) )
        System.out.printf("%d\t%s\n", array[j], "Even");
      else
        System.out.printf("%d\t%s\n", array[j], "Odd");
    }

  }

  public static boolean isEven( int number )
  {
    if ( number % 2 == 0 )
      return true;
    else
      return false;
  }
}
