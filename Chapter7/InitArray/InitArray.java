// InitArray.java

public class InitArray
{
  public static void main( String[] args )
  {
    //int[] array = new int[10];

    int[][] array1 = {{ 1, 2, 3}, {4, 5, 6 }};
    int[][] array2 = { {1, 2}, { 3 }, {4, 5, 6} };

    final int ARRAY_LENGTH = 10;
    int[] array = new int[ARRAY_LENGTH];

    for ( int counter = 0; counter < array.length; counter++ )
        array[counter] = 2 + 2 * counter;

    System.out.printf( "%s%8s\n", "Index", "Value" );

    for ( int counter = 0; counter < array.length; counter++ )
         System.out.printf( "%5d%8d\n", counter, array[ counter ] );
  }

  public static void outputArray( int[][] array )
  {
    for ( int row = 0; row < array.length; row++)
    {
      for ( int column = 0; column < array[row].length; column++)
          System.out.printf("%d ", array[ row ][ column ]);

      System.out.println();
    }
  }
}
