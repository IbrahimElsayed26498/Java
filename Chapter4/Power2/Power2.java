// Power2.java

import java.util.Scanner;

public class Power2
{
  public static void main(String[] args)
  {
    int i = 1;
    int maximum = 100000;

    System.out.printf("Program Prints the powers of 2 until %dn\n", maximum);

  	while (Math.pow(2,i) < maximum )
    {
  		System.out.printf("%d\t%f\n", i, Math.pow(2,i));
  		i++;
  	}
  }
}
