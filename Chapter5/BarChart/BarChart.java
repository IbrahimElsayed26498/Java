// BarChart.java

import java.util.Scanner;

public class BarChart
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.printf("Bar Chart printing Program\n");

    int[] array = new int[5];

    for (int i = 0; i < 5; i++)
    {
      System.out.printf("Enter Number %d in [1,30]  :  ", i + 1 );
      array[i] = input.nextInt();
    }

    System.out.printf("HereComes Your Bar Chart\n\n");
    int j = 0;

    while ( j < 5)
    {
      System.out.printf("%d : ", array[j]);

      for ( int k = 0; k < array[j]; k++)
      {
        System.out.printf("* ");
      }
      System.out.println("");
      j++;
    }

  }
}
