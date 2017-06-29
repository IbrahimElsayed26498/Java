// Sieve.java

public class Sieve
{
  static final int Size = 100;

  public static void main( String[] args )
  {
    System.out.printf("\nThis program implements the seive of Erathosthenes\n");

    int[] array = new int[Size];

    for (int i = 0; i < Size; i++)
    {
        array[i] = 1;
    }

    System.out.println("Initial Version Of Your Array");

    for (int i = 0; i < Size; i++)
        System.out.printf("%d  ", array[i] );

    System.out.println("");

    for (int j = 2; j < Size; j++)
    {
      if (array[j] == 1)
      {
        for (int k = j + 1; k < Size;k++)
        {
          if (k % j == 0)
              array[k] = 0;
        }
      }
    }

    System.out.println("Final Version Of Your Array");

    for (int i = 0; i < Size; i++)
        System.out.printf("%d  ", array[i] );

    System.out.println("");

    System.out.printf("\nHere are your prime numbers between 1 and %d\n", Size);

    for (int i = 1; i < Size; i++)
    {
        if (array[i] == 1)
            System.out.printf("%d\t", i );
    }
  }
}
