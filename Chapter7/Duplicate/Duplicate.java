// Duplicate.java

import java.util.Random;

public class Duplicate
{
  public static void main( String[] args )
  {
    int[] array = new int[5];
    int j;

    for (int i = 0; i < 5; i++ )
    {
      for ( j = i; j >=0; j-- )
      {
        if ( array[j] == array[i] )
          continue;
      }

      array[i] = inputIntegers();

      System.out.printf("Integer %d : %d\n", i + 1, array[i]);

    }


  }

  public static int inputIntegers()
  {
    Random r = new Random();

    int face = 10 + r.nextInt(100);

    return face;
  }
}
