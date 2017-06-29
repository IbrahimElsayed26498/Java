// Fibonacci.java

import java.util.Scanner;

public class Fibonacci
{
  public static void main(String[] args )
  {
    System.out.printf("Enter A Number N, I'll find it's Fibonacci  :  ");
    Scanner input = new Scanner( System.in );

    int n;
    n = input.nextInt();

    switch( n )
    {
  	case 1 :
  		System.out.printf("The %dst fibonacci term is %d\n", n, fibonacci(1));
  		break;
  	case 2 :
  		System.out.printf("The %dnd fibonacci term is %d\n", n, fibonacci(2));
  		break;
  	case 3 :
  		System.out.printf("The %drd fibonacci term is %d\n", n, fibonacci(3));
  		break;
  	default:
  		System.out.printf("The %dth fibonacci term is %d\n", n, fibonacci(n));
  		break;
  	}
  }

  public static int fibonacci( int number )
  {
    int f1 = 0, f2 = 1, f;

    if ( number <= 2 )
        return number - 1;

  	do
    {
  		f = f1 + f2;
  		f1 = f2;
  		f2 = f;
  		number--;
  	} while ( number > 2);

  	return f;
  }
}
