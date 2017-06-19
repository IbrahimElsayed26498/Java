// Asterisk.java

import java.util.Scanner;

public class Asterisk
{
  public static void main(String[] args )
  {
    System.out.println("Enter Lenght Of Square");

    Scanner input = new Scanner ( System.in );
    int l = input.nextInt();

    System.out.println("Here Comes Your Square of Asterisks");
    squareOfAsterisks(l, l);

  }

  public static void squareOfAsterisks( int length, int width )
  {
    for ( int i = 0; i < length; i++ )
    {
      for ( int j = 0; j < width; j++)
      {
        System.out.print("* ");
      }
      System.out.println("");
    }
  }
}
