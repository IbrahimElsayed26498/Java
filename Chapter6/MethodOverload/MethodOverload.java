// MethodOverload.java

public class MethodOverload
{
  public static void main( String[] args )
  {
    System.out.printf("Square Of Integer Is %d\n", square( 7 ));
    System.out.printf("Square Of Double 7.5 Is %.2f\n", square( 7.5 ));
  }

  public static int square( int intValue )
  {
    System.out.printf( "\nCalled square with int argument: %d\n", intValue );
    return intValue * intValue;
  } // end method square with int argument

  public static double square( double doubleValue )
  {
    System.out.printf( "\nCalled square with double argument: %.2f\n", doubleValue );
    return doubleValue * doubleValue;
  } // end method square with double argument
}
