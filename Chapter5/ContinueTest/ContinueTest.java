// ContinueTest.java

public class ContinueTest
{
  public static void main(String[] args)
  {
    int count;

    for (count = 1; count <= 10 ; count++)
    {
      //if ( count == 5 )
        //  continue;
      if ( count != 5 )
        System.out.printf("%d ", count );
    }

    System.out.printf("\nAdjusted for loop body to replace continue and Skip Printing 5\n");
  }
}
