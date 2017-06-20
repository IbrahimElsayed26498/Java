// Prime.java

public class Prime
{
  public static void main(String[] args )
  {
    System.out.println("Program Prints The Prime Numbers in [1, 1000]");
    int count = 0;

    for (int k = 1; k <= 1000; k++)
    {
  		if ( isPrime(k) == true )
      {
  			System.out.printf("%d Is Prime \n", k);
        count++;
      }
    }

    System.out.printf("There are %d primes in [1, 1000]", count );
  }

  public static boolean isPrime( int number )
  {
    int flag = 0;
    for (int i = 2; i <= (int)(Math.sqrt(number)); i++)
    {
      if (number % i == 0){
        flag = 1;
        break;
      }
    }
    if (flag == 0)
      return true;
    else
      return false;
  }
}
