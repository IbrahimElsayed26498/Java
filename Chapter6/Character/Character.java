// Character.java

import java.util.Scanner;

public class Character
{
  public static void main( String[] args )
  {
    System.out.println("Enter Length Of Square : ");

    Scanner input = new Scanner ( System.in );
    int l = input.nextInt();

    System.out.println("Here Comes Your Square of Characters : ");

    char fillCharacter;
    fillCharacter = input.next().charAt( 0 );

    squareOfCharacter(l, fillCharacter );
  }

  public static void squareOfCharacter( int length, char character )
  {
    for ( int i = 0; i < length; i++ )
    {
      for ( int j = 0; j < length; j++)
      {
        System.out.printf("%s ", character );
      }
      System.out.println("");
    }
  }
}
