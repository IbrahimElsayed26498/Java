// InitArray.java

public class InitArray
{
  public static void main( String[] args )
  {
    //int[] array = new int[10];
    int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // Using An initializer List

    System.out.printf( "%s%8s\n", "Index", "Value" );

    for ( int counter = 0; counter < array.length; counter++ )
        System.out.printf( "%5d%8d\n", counter, array[ counter ] );

  }
}
