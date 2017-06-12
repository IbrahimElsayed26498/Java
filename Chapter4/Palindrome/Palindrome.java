// Palindrome.java

import java.util.Scanner;

public class Palindrome
{
  public static void main(String[] args)
  {
    System.out.printf("Program Tests Whether An Integer Is A Palindrome\nReads The Same Way Backwards As Forwards\n");

    Scanner input = new Scanner( System.in );

    int integer, buffer, K = 10000;
    int[] digits = new int[5];

    System.out.printf("Enter A Five-Digit Integer : ");
    integer = input.nextInt();

    buffer = integer;

    int i = 0, j = 0;

    for ( i = 0; i < 5 ; i++ ){
  		digits[i] = integer/K;
  		integer %= K;
  		if (K > 0)
  			K /= 10;
  	}

    System.out.printf("%d = ", buffer);

  	for (j = 0; j < 5;j++)
  		System.out.printf("%d ", digits[j]);

  	System.out.println();

    if ((digits[0] == digits[4]) && (digits[1] == digits[3]))
      System.out.printf("%d Is A Palindrome\n", buffer);

  }
}
