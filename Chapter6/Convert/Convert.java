// Convert.java

import java.util.Scanner;
import java.util.Random;

public class Convert
{
  public static void main(String[] args )
  {
    int[] decimal = new int[256];

    Random randomNumber = new Random();

    System.out.printf("Decimal\t\t\tBinary\t\t\tOctal\t\t\tHexadecimal\n");

    for ( int i = 1; i <= 256; i++ )
    {
      System.out.printf("%d\t\t\t", i);
      toBinary( i );
      if ( i < 128)
      {
        System.out.printf("\t\t\t");
        toOctal( i );
      }
      else
      {
        System.out.printf("\t\t");
        toOctal( i );
      }
      System.out.printf("\t\t");
      toHexadecimal( i );
      System.out.println("");
    }
  }

  public static void toBinary( int number )
  {
    int number_copy = number;
    int[] digits = new int[10];

    //
    for ( int j = 0 ; j < 10; j++)
        digits[j] = -1;

    int i = 0;
    while ( number != 0 )
    {
       digits[i] = number % 2;
   		 number /= 2;
       i++;
    }

    for (int k = i; k >=0; k-- )
    {
      if ( digits[k] > -1 )
        System.out.printf("%d", digits[k]);
    }
  }

  public static void toOctal( int number )
  {
    int number_copy = number;
    int[] digits = new int[10];

    //
    for ( int j = 0 ; j < 10; j++)
        digits[j] = -1;

    int i = 0;
    while ( number != 0 )
    {
       digits[i] = number % 8;
       number /= 8;
       i++;
    }

    for (int k = i; k >=0; k-- )
    {
      if ( digits[k] > -1 )
        System.out.printf("%d", digits[k]);
    }
  }

  public static void toHexadecimal( int number )
  {
    int number_copy = number;
    String[] digits = new String[10];

    //
    for ( int j = 0 ; j < 10; j++)
        digits[j] = "-1";

    int i = 0;
    while ( number != 0 )
    {
       digits[i] = hexed ( number % 16 );
       number /= 16;
       i++;
    }

    for (int k = i; k >=0; k-- )
    {
      if ( digits[k] != "-1" )
        System.out.printf("%s", digits[k]);
    }
  }

  public static String hexed( int n )
  {
    switch( n )
    {
      case 0:
        return "0";
      case 1:
        return "1";
      case 2:
        return "2";
      case 3:
        return "3";
      case 4:
        return "4";
      case 5:
        return "5";
      case 6:
        return "6";
      case 7:
        return "7";
      case 8:
        return "8";
      case 9:
        return "9";
      case 10:
        return "A";
      case 11:
        return "B";
      case 12:
        return "C";
      case 13:
        return "D";
      case 14:
        return "E";
      case 15:
        return "F";
      default:
        return "-1";
    }
  }
}
