// Perfect.java

public class Perfect
{
  public static void main( String[] args )
  {
    System.out.printf(" Program Prints Perfect Numbers In [1, 10000]\n");

  	int[] number = new int[10000];
    int[] number_copy = new int[10000];

    for ( int k = 1; k < 10000; k++)
    {
      if ( isPerfect(k) == true )
  			System.out.printf(" %d Is A Perfect Number  \n", k);
    }
  }

  public static boolean isPerfect( int N )
  {
    int sumOfFactors = 0;
    for ( int i = 1; i < N; i++)
    {
      if ( N % i == 0  )
          sumOfFactors += i;
    }

    if ( sumOfFactors == N )
      return true;
    else
      return false;
  }
}
