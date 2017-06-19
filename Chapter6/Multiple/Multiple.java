// Multiple.java

import java.util.Scanner;

public class Multiple
{
  public static void main( String[] args )
  {
    System.out.printf("Program Determines If One Integer Is Multiple Of Another\n");

    Scanner input = new Scanner (System.in);

    int firstInteger, secondInteger;

    System.out.printf("Enter First Integer : ");
    firstInteger = input.nextInt();

    System.out.printf("Enter Second Integer ( >= First ) : ");
    secondInteger = input.nextInt();

    if ( isMultiple( firstInteger, secondInteger ) )
        System.out.printf("%d Is A Multiple Of %d", secondInteger, firstInteger);
  }

  public static boolean isMultiple( int first, int second )
  {
    if ( second % first == 0 )
      return true;
    else
      return false;
  }
}
