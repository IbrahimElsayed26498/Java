// Asterisk.java

import java.util.Scanner;

public class Square
{
  public static void main( String[] args )
  {
    Scanner input = new Scanner(System.in);

    int length, width;
    int i, j;

    // Print a Square

    System.out.println("Enter an integer for the length of the box ( > 5 ) : ");
    length = input.nextInt();

    System.out.println("Enter an integer for the width of the box : ( = length ) : ");
    width = input.nextInt();

    for (i = 0; i < length; i++)
         System.out.printf("* ");
    System.out.println("");

    for (i = 0; i < width - 2; i++)
    {
     	System.out.print("* ");
    	for (j = 0; j < length - 2; j++)
        	 System.out.print("  ");
    	System.out.print("*");
      System.out.println("");
    }

    for (i = 0; i < length; i++)
         System.out.print("* ");
    System.out.println("");

    if ((length == width) && (length >= 5))
    {
      System.out.println("");
     	System.out.println("Here Comes A thicker Square");
      System.out.println("");
    }

    int copywidth = 5;

    for (i = 0; i < length; i++)
         System.out.print("* ");
    System.out.println("");

    for (i = 0; i < length; i++)
        System.out.print("* ");
    System.out.println("");

    for (i = 0; i < Math.ceil(width/2); i++)
    {
     	System.out.print("* ");
     	System.out.print("* ");
    	for (j = 0; j <= length - copywidth ; j++)
        	 System.out.print("  ");
    	System.out.print("* ");
    	System.out.print("*");
    	System.out.println("");
    }

    for (i = 0; i < length; i++)
        System.out.print("* ");
    System.out.println("");

    for (i = 0; i < length; i++)
         System.out.print("* ");
    System.out.println("");

  }
}
