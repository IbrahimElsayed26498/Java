// TabularOutput

import java.util.Scanner;

public class TabularOutput
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner( System.in );

    int[] array = new int[5]; // Declare array of integers
    int i,j;

    for ( i = 0; i < 5; i++)
    {
      System.out.printf("Enter Integer %d : ", i + 1);
      array[i] = input.nextInt();
    }

    System.out.println("Tabular Output");
    System.out.println("\nN\t10N\t100N\t1000N\n");

    for ( j = 0; j < 5; j++)
    {
      System.out.printf("%d\t%d\t%d\t%d\n", array[j], 10 * array[j], 100 * array[j], 1000 * array[j] );
    }
  }
}
